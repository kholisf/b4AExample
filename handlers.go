package main

import (
	"context"
	"encoding/json"
	"fmt"
	"log"
	"net"
	"net/http"
	"os"
	"regexp"
	"strings"
	"time"
	"waBot/app/controllers/botcontroller"
	"waBot/app/helper"
	"waBot/app/models"

	"github.com/gorilla/websocket"
	"go.mau.fi/whatsmeow"
	waProto "go.mau.fi/whatsmeow/proto/waE2E"
	"go.mau.fi/whatsmeow/types"
	"google.golang.org/protobuf/proto"
	"gorm.io/gorm"
)

var conns = make(map[*websocket.Conn]bool)

func broadcastMessage(message []byte, clients map[*websocket.Conn]bool, dari net.Addr, tipe int) error {
	for client := range clients {

		if client.RemoteAddr() != dari {
			err := client.WriteMessage(tipe, message)
			if err != nil {
				log.Printf("error: %v", err)
				client.Close()
				delete(clients, client)
				return err
			}
		}
	}
	return nil
}

var upgrader = websocket.Upgrader{
	ReadBufferSize:  1024,
	WriteBufferSize: 1024,
	// Mengizinkan semua origin
	CheckOrigin: func(r *http.Request) bool {
		return true
	},
}

func handleDeletbot(w http.ResponseWriter, r *http.Request) {
	datapost, errr := helper.BacaRequest(r)
	if errr != nil {

		helper.ResponseJSON(w, http.StatusMethodNotAllowed, map[string]interface{}{

			"error":   true,
			"message": errr.Error(),
		})
		return
	}

	id := fmt.Sprint(datapost["kdBot"])
	// id := muxgori.Vars(r)["id"]
	delete(tampungClient, id)
	err := os.RemoveAll("database/" + id)
	fmt.Println("===================")
	fmt.Println(err)
	fmt.Println("===================")

}

// Fungsi handler untuk permintaan websocket
func handleWebsocket(w http.ResponseWriter, r *http.Request) {
	// Mengubah permintaan HTTP menjadi koneksi websocket

	ws, err := upgrader.Upgrade(w, r, nil)
	conns[ws] = true
	if err != nil {
		log.Println("Upgrade error:", err)
		return
	}

	fmt.Println("jalan")
	// Menutup koneksi websocket ketika fungsi selesai
	defer ws.Close()

	// Membaca dan menulis data melalui websocket
	// t, message, err := ws.ReadMessage()

	if err != nil {

		fmt.Println(err)
	}
	for {

		// //         // paylood := fmt.Sprintf("orderbook data -> %d\n", time.Now().UnixMilli())
		// //         hasil ,_:=os.ReadFile("qrlogin.txt")
		// //         ws.WriteMessage(1,hasil)
		// //         time.Sleep((time.Second*5))

		// Membaca pesan dari klien
		t, message, err := ws.ReadMessage()
		if err != nil {
			log.Println("Read error:", err)
			break
		}
		// Menampilkan pesan yang diterima
		fmt.Println("Received:", string(message))
		// Mengirim pesan ke klien
		// err = ws.WriteMessage(t,[]byte(`{"dari":"`+fmt.Sprint(ws.RemoteAddr())+`","isipesan:"`+string(message)+`"}`))
		broadcastMessage([]byte(`"dari" : "`+fmt.Sprint(ws.RemoteAddr())+`", "isiPesan" : `+string(message)+`}`), conns, ws.RemoteAddr(), t)
		// broadcastMessage()
		// err = ws.WriteJSON(`{"coba":"tes","isipesan:"`+string(message)+`"}`)

		if err != nil {
			log.Println("Write error:", err)
			break
		}
	}
}

func handlerSetPesan(w http.ResponseWriter, r *http.Request) {

	// body, err := io.ReadAll(r.Body)
	// if err != nil {
	// 	http.Error(w, "Error reading request body", http.StatusInternalServerError)
	// 	return
	// }
	// defer r.Body.Close()
	// var mp map[string]interface{}
	// err1 := json.Unmarshal(body, &mp)
	// if err1 != nil {
	// 	fmt.Println(err1)
	// 	return
	// }

	datapost, errr := helper.BacaRequest(r)
	if errr != nil {

		helper.ResponseJSON(w, http.StatusMethodNotAllowed, map[string]interface{}{

			"error":   true,
			"message": errr.Error(),
		})
		return
	}

	id := fmt.Sprint(datapost["kdBot"])
	fmt.Println("jalnnnnnn")
	mp := datapost["data"].(map[string]interface{})
	fmt.Println(mp)

	dt, err11 := os.ReadFile("database/" + id + "/pesanJawabanSatuBaris.json")
	fmt.Println("data dari dt : ", dt)

	// fmt.Println(err1)
	if err11 != nil {

		os.WriteFile("database/"+id+"/pesanJawabanSatuBaris.json", []byte(`{"default":"default}`), os.ModePerm)
		// return
		os.ReadFile("database/" + id + "/pesanJawabanSatuBaris.json")
	}
	// dt2 := make(map[string]string)

	// err12 := json.Unmarshal(dt, &dt2)
	// if err12 != nil {

	// 	fmt.Println(dt2)
	// }

	// // fmt.Println("cpbaa")
	// // dt = readJSON("database/"+id+"/pesanJawabanSatuBaris.json")

	// for key, value := range mp {
	// 	// if value == "value" {
	// 	// 	fmt.Println("Key:", key)
	// 	// }
	// 	fmt.Println("key :", key)
	// 	fmt.Println("value :", value)
	// 	dt2[key] = fmt.Sprint(value)

	// }
	//  err := os.WriteFile("database/"+id+"/pesanJawabanSatuBaris.json",)
	// fmt.Println("======================hasil===============")
	// fmt.Println(dt2)

	bt, _ := json.Marshal(mp)
	os.WriteFile("database/"+id+"/pesanJawabanSatuBaris.json", bt, os.ModePerm)

	helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{

		"error":   false,
		"message": "berhasil membuat json jawaban bot",
	})
	fmt.Println("======================hasil===============")
	// WriteJson()

}

// func handlerTambahBot(w http.ResponseWriter, r *http.Request) {
// 	mp, err := helper.BacaRequest(r)
// 	if err != nil {
// 		data := map[string]interface{}{

// 			"error":   true,
// 			"message": "tidak menemukan parameter yang sesuai",
// 		}

// 		helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
// 		return
// 	}

// 	fmt.Println(mp)

// }
func handlerQr(w http.ResponseWriter, r *http.Request) {

	mp, err := helper.BacaRequest(r)
	if err != nil {
		data := map[string]interface{}{

			"error":   true,
			"message": "tidak menemukan parameter yang sesuai",
		}

		helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
		return
	}

	fmt.Println(mp["kdBot"])
	if mp["kdBot"] == nil {
		data := map[string]interface{}{

			"error":   true,
			"message": "tidak menemukan parameter yang sesuai",
		}

		helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)

		return
	}
	var dtbot models.Bot

	errrr := models.DB.Table("m_bot").Where("kd_bot=?", mp["kdBot"]).First(&dtbot).Error
	fmt.Println(errrr)
	if errrr != nil {

		helper.ResponseJSON(w, http.StatusNotFound, map[string]interface{}{"error": true, "message": "tidak menemukan data bot dengan kode " + fmt.Sprint(mp["kdBot"])})
		return
	}

	// return
	// id := muxgori.Vars(r)["id"]

	respon := qrGet(fmt.Sprint(mp["kdBot"]))
	// id := fmt.Sprint(mp["kdBot"])
	// isi, ada := tampungClient[id]

	// // fmt.Println("==============================")
	// // fmt.Println(ada)
	// // fmt.Println(isi)

	// if ada == true {

	// 	fmt.Println("sudah konek ? : ", isi.IsConnected())
	// 	if isi.IsConnected() {

	// 		if isi.IsLoggedIn() == false {
	// 			ha, _ := os.ReadFile(`database/` + id + `/kodeqrString.txt`)
	// 			// fmt.Fprintln(w,ha)

	// 			// w.Write(ha)
	// 			data := map[string]interface{}{
	// 				"error":   false,
	// 				"status":  "1",
	// 				"message": "Belum login",
	// 				"kd_bot":  id,
	// 				"kodeQr":  ha,
	// 			}
	// 			helper.ResponseJSON(w, http.StatusOK, data)
	// 			return
	// 		} else {

	// 			data := map[string]interface{}{
	// 				"error":  false,
	// 				"status": "sudah login",
	// 				"kd_bot": id,
	// 				"kodeQr": "",
	// 			}
	// 			helper.ResponseJSON(w, http.StatusOK, data)
	// 			return
	// 		}
	// 	}

	// }
	// go func() {

	// 	Jalanbot(id)
	// }()

	// // Cari user di map

	// // fmt.Fprintln(w,len(tampungClient))

	// time.Sleep(time.Second * 3)
	// bot, _ := tampungClient[id]
	// fmt.Println("2 22222 sudah login ? : ", bot.IsConnected())
	// if bot.IsLoggedIn() == true {
	// 	data := map[string]interface{}{
	// 		"error":  false,
	// 		"status": "Sedang berjalan",
	// 		"kd_bot": id,
	// 		"kodeQr": "",
	// 	}
	// 	helper.ResponseJSON(w, http.StatusOK, data)
	// 	return
	// }
	// // ha, _ := os.ReadFile(`database/` + id + `/qr.png`)
	// ha, _ := os.ReadFile(`database/` + id + `/kodeqrString.txt`)
	// // // fmt.Fprintln(w,ha)
	// // data := map[string]interface{}{
	// // 	"status": "Belum login",
	// // 	"qr":     ha,
	// // }
	// data := map[string]interface{}{
	// 	"error":  false,
	// 	"status": "Belum login",
	// 	"kd_bot": id,
	// 	"kodeQr": ha,
	// }
	helper.ResponseJSON(w, http.StatusOK, respon)
	// w.Write(ha)
	// helper.ResponseJSON(w, http.StatusOK, data)
	// tim
}

func qrGet(kdBot string) map[string]interface{} {
	id := kdBot
	isi, ada := tampungClient[id]

	fmt.Println("==============================")
	fmt.Println("ada : ", ada)
	fmt.Println("isi : ", isi)

	if ada {

		fmt.Println("sudah konek ? : ", isi.IsConnected())
		if isi.IsConnected() {
			fmt.Println("sudah login ? : ", isi.IsLoggedIn())

			if !isi.IsLoggedIn() {
				ha, _ := os.ReadFile(`database/` + id + `/kodeqrString.txt`)
				// fmt.Fprintln(w,ha)

				// w.Write(ha)
				data := map[string]interface{}{
					"error":   false,
					"status":  "0",
					"message": "Belum login",
					"kd_bot":  id,
					"kodeQr":  ha,
				}

				return data
			} else {

				data := map[string]interface{}{
					"error":   false,
					"status":  "1",
					"message": "sudah login",
					"kd_bot":  id,
					"kodeQr":  "",
				}
				go func() {

					Jalanbot(id)
				}()

				return data
			}
		}

	}
	go func() {

		Jalanbot(id)
	}()

	// Cari user di map

	// fmt.Fprintln(w,len(tampungClient))

	time.Sleep(time.Second * 3)
	bot, _ := tampungClient[id]
	// if !ada {

	// }

	fmt.Println("2 22222 sudah login ? : ", bot.IsConnected())
	if bot.IsLoggedIn() {
		data := map[string]interface{}{
			"error":  false,
			"status": "Sedang berjalan",
			"kd_bot": id,
			"kodeQr": "",
		}

		return data
	}
	har, _ := os.ReadFile(`database/` + id + `/qr.png`)
	ha, _ := os.ReadFile(`database/` + id + `/kodeqrString.txt`)
	fmt.Println(har)
	// // fmt.Fprintln(w,ha)
	// data := map[string]interface{}{
	// 	"status": "Belum login",
	// 	"qr":     ha,
	// }
	data := map[string]interface{}{
		"error":  false,
		"status": "Belum login",
		"kd_bot": id,
		"kodeQr": ha,
	}
	return data
	// w.Write(ha)
	// helper.ResponseJSON(w, http.StatusOK, data)
	// tim
}
func handlerKirim(w http.ResponseWriter, r *http.Request) {

	if r.Method == "POST" {
		mp, err := helper.BacaRequest(r)
		if err != nil {

			return
		}
		pin1 := fmt.Sprintf(otpString(mp["from"].(string)))

		nohp := helper.ConverNoHp(mp["noHp"].(string))

		isipesannn := `<#> ` + mp["from"].(string) + ` - Kode OTP anda adalah *` + pin1 + `* , jangan pernah memberitahukan kode otp ini kepada siapapun`
		kirim(nohp, isipesannn, pin1, w)

		// Konversi data body ke string
		// bodyString := string(body)

		// // Lakukan sesuatu dengan data string yang diterima
		// fmt.Fprintln(w,"Received POST data:", bodyString)

		// randomNumber := rand.Intn(900000) + 100000

		// 		go func() string{
		// 			randomNumberString := strconv.Itoa(rand.Intn(900000) + 100000)

		// return randomNumberString
		// 		}()
		// randomNumber := rand.Intn(900000)

		// if (len(fmt.Sprintf(randomNumber)) >6 && len(fmt.Sprintf(randomNumber))<6 ){
		// randomNumber:=otpString

		// }

	}
}

func handlerKirimOtp(w http.ResponseWriter, r *http.Request) {

	if r.Method == "POST" {
		mp, err := helper.BacaRequest(r)
		if err != nil {

			return
		}
		pin1 := fmt.Sprintf(mp["from"].(string))

		nohp := helper.ConverNoHp(mp["noHp"].(string))

		isipesannn := `<#> ` + mp["from"].(string) + ` - Kode OTP anda adalah *` + pin1 + `* , jangan pernah memberitahukan kode otp ini kepada siapapun`
		kirim(nohp, isipesannn, pin1, w)
		fmt.Println("prin otp jala " + pin1)
		helper.DataOtp[nohp] = pin1
	}
}

func handleKirimPesan(w http.ResponseWriter, r *http.Request) {

	mp, er := helper.BacaRequest(r)
	if er != nil {

		helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{
			"error":   true,
			"message": "parameter tidak di temukan atau berisi kosong",
		})
		return

	}

	fmt.Println("handleKirimPesan")
	fmt.Println(mp)

	if mp["token"] == "" && mp["nowhatsapp"] == "" && mp["isiPesan"] == "" {

		helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{
			"error":   true,
			"message": "parameter tidak di temukan atau berisi kosong",
		})
		return
	}
	nowhatsapp := mp["nowhatsapp"].(string)
	token := mp["token"].(string)
	isiPesan := mp["isiPesan"].(string)
	// token: AEtU5bVZ6qQTzCXGlX1daJMRwyUPpGft
	if token != "AEtU5bVZ6qQTzCXGlX1daJMRwyUPpGft" {

		helper.ResponseJSON(w, http.StatusUnauthorized, map[string]interface{}{
			"error":   true,
			"message": "Token akses api tidak valid",
		})
		return
	}

	var bot *whatsmeow.Client
	isidt, ada := mp["bot"]
	fmt.Println("====================+====++_+_+_+_+_+_+_+_+_")
	fmt.Println(ada)
	fmt.Println(isidt)
	fmt.Println("====================+====++_+_+_+_+_+_+_+_+_")

	fmt.Println(mp["bot"])
	if !ada {

		bot = tampungClient["msKong"]
	} else {

		bt, ada := tampungClient[isidt.(string)]
		bot = bt
		if !ada {

			helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{

				"error":   true,
				"message": "bot tidak di temukan",
			})

		}

	}
	if bot == nil {

		helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{

			"error":   true,
			"message": "bot tidak di temukan",
		})

	}
	nowa := strings.Split(nowhatsapp, "__")
	statusKirim := make([]map[string]interface{}, 0)
	for _, value := range nowa {

		// fmt.Println("keye :", key)
		// fmt.Println("value :", value)

		// fmt.Println("bot :", bot)
		// fmt.Println("isipesan :", isiPesan)
		// 120363282711901780@g.us
		// 6282266353193-1625030319@g.us

		isgroup, adaa := mp["isgroup"]
		var err error
		fmt.Println("isgroup : ", isgroup)

		fmt.Printf("dtisi[mediaKey].(string) : %T\n", isgroup)
		if adaa && isgroup == "true" {

			err = KirimAndCekPesan(isiPesan, types.JID{User: value, Server: "g.us"}, bot)
		} else {

			err = KirimAndCekPesan(isiPesan, types.JID{User: helper.ConverNoHp(value), Server: "s.whatsapp.net"}, bot)
		}
		if err != nil {

			statusKirim = append(statusKirim, map[string]interface{}{value: false})
			continue
		}
		statusKirim = append(statusKirim, map[string]interface{}{value: true})

	}
	// helper.ConverNoHp()
	helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{

		"error":                  false,
		"StatusBerhasilTerkirim": statusKirim,
	})

	// mp, er := helper.BacaRequest(r)
	// if er != nil {

	// 	helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{
	// 		"error":   true,
	// 		"message": "parameter tidak di temukan atau berisi kosong",
	// 	})
	// 	return

	// }

	// fmt.Println("handleKirimPesan")
	// fmt.Println(mp)

	// if mp["token"] == "" && mp["nowhatsapp"] == "" && mp["isiPesan"] == "" {

	// 	helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{
	// 		"error":   true,
	// 		"message": "parameter tidak di temukan atau berisi kosong",
	// 	})
	// 	return
	// }
	// nowhatsapp := mp["nowhatsapp"].(string)
	// token := mp["token"].(string)
	// isiPesan := mp["isiPesan"].(string)
	// // token: AEtU5bVZ6qQTzCXGlX1daJMRwyUPpGft
	// if token != "AEtU5bVZ6qQTzCXGlX1daJMRwyUPpGft" {

	// 	helper.ResponseJSON(w, http.StatusUnauthorized, map[string]interface{}{
	// 		"error":   true,
	// 		"message": "Token akses api tidak valid",
	// 	})
	// 	return
	// }

	// var bot *whatsmeow.Client
	// if mp["bot"] != "tess" {

	// 	bot = tampungClient["msKong"]
	// } else {

	// 	bt, ada := tampungClient[mp["bot"].(string)]
	// 	bot = bt
	// 	if ada == false {

	// 		helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{

	// 			"error":   true,
	// 			"message": "bot tidak di temukan",
	// 		})

	// 	}

	// }

	// nowa := strings.Split(nowhatsapp, "__")
	// statusKirim := make([]map[string]interface{}, 0)
	// for key, value := range nowa {

	// 	fmt.Println("keye :", key)
	// 	fmt.Println("value :", value)

	// 	fmt.Println("bot :", bot.IsLoggedIn())
	// 	fmt.Println("isipesan :", isiPesan)

	// 	err := KirimAndCekPesan(isiPesan, types.JID{User: helper.ConverNoHp(value), Server: "s.whatsapp.net"}, bot)
	// 	if err != nil {

	// 		statusKirim = append(statusKirim, map[string]interface{}{value: false})
	// 		continue
	// 	}
	// 	statusKirim = append(statusKirim, map[string]interface{}{value: true})

	// }
	// // helper.ConverNoHp()
	// helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{

	// 	"error":                  false,
	// 	"StatusBerhasilTerkirim": statusKirim,
	// })

}
func HapusOtp(no string) {

	time.Sleep(time.Minute * 2)
	fmt.Println("Jalan Delete untu no :" + no)
	delete(helper.DataOtp, no)
}

// func handlerKirimPSN(w http.ResponseWriter, r *http.Request) {

//     fmt.Println("============================================")
//     fmt.Println(r.Method =="POST")
//     fmt.Println("============================================")

//     if (r.Method =="POST"){
//     body, err := io.ReadAll(r.Body)
//     if err != nil {
//         http.Error(w, "Error reading request body", http.StatusInternalServerError)
//         return
//     }
//     defer r.Body.Close()
//     var mp map[string]interface{}
// err1 := json.Unmarshal(body,&mp)
// fmt.Println("erorrrrrrrrr")
// fmt.Println(err1)
// if err1 !=nil{

// return
// }
// pin1:= fmt.Sprintf(otpString())

// isipesannn  :=`<#> `+mp["from"].(string)+` - Kode OTP anda adalah *`+pin1+`* , jangan pernah memberitahukan kode otp ini kepada siapapun`
// kirim(mp["noHp"].(string),isipesannn,pin1,w)

//     // Konversi data body ke string
//     // bodyString := string(body)

//     // // Lakukan sesuatu dengan data string yang diterima
//     // fmt.Fprintln(w,"Received POST data:", bodyString)

//     // randomNumber := rand.Intn(900000) + 100000

// // 		go func() string{
// // 			randomNumberString := strconv.Itoa(rand.Intn(900000) + 100000)

// // return randomNumberString
// // 		}()
//     // randomNumber := rand.Intn(900000)

//     // if (len(fmt.Sprintf(randomNumber)) >6 && len(fmt.Sprintf(randomNumber))<6 ){
// // randomNumber:=otpString

//     // }

// }
// }

func KirimPesanBotHandler(w http.ResponseWriter, r *http.Request) {
	mp, err := helper.BacaRequest(r)
	if err != nil {
		data := map[string]interface{}{

			"error":   true,
			"message": "tidak menemukan parameter yang sesuai",
		}

		helper.ResponseJSON(w, http.StatusBadRequest, data)
		return
	}
	// jid := types.JID{User: }
	id := mp["kdBot"].(string)
	isipesan := mp["isiPesan"].(string)
	kirimKe := mp["tujuan"].([]interface{})
	fmt.Println(kirimKe)
	fmt.Println(isipesan)
	wa, ada := tampungClient[id]
	if ada == false {

		helper.ResponseJSON(w, http.StatusInternalServerError, map[string]interface{}{

			"error": true,

			"message": "Wa bot sedang tidak berjalan ",
		})
		return
	}

	dtr := make([]map[string]interface{}, 0)
	ggl := 0
	sks := 0

	for _, value := range kirimKe {

		// fmt.Println(t)
		// fmt.Println(value)
		jids := strings.Split(value.(string), "@")
		var chatbot models.BotChat
		// strconv.ParseUint(mp["kdBot"].(string),0,64)
		var kddd int64
		fmt.Sscan(mp["kdBot"].(string), &kddd)
		// tt, :=strconv.ParseUint(mp["kdBot"].(string),0,64)
		chatbot.KdBot = kddd
		chatbot.Chat = mp["isiPesan"].(string)
		chatbot.Nomor = jids[0]

		if err11 := models.DB.Table("m_bot_chat").Create(&chatbot).Error; err11 != nil {

			// helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{"error": true, "message": "gagal insert data"})
			// return
			fmt.Println("gagal mengirim ke ")
		}
		jid := types.JID{

			User:   jids[0],
			Server: jids[1],
		}
		fmt.Println(jid)

		// tampungClient[id].SendMessage(context.Background(), jid, conversiKeExtended())
		er := KirimAndCekPesan(isipesan, jid, wa)
		if er != nil {

			dtr = append(dtr, map[string]interface{}{
				value.(string): false,
			})
			ggl++
			continue
		}
		sks++
		dtr = append(dtr, map[string]interface{}{
			value.(string): true,
		})

	}

	helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{
		"pesan berhasil": sks,
		"pesan gagal":    ggl,
		"total":          len(kirimKe),
		"data":           dtr,
	})
	// id := muxgori.Vars(r)["id"]
	// id := fmt.Sprint(mp["kdBot"])

	// var bot models.Bot
	// if err := models.DB.Table("m_bot").Where("kd_bot = ?", id).First(&bot).Error; err != nil {
	// 	fmt.Println(err)

	// 	switch err {
	// 	case gorm.ErrRecordNotFound:
	// 		fmt.Println("jalan di sini1")

	// 		data := map[string]interface{}{
	// 			"error":   true,
	// 			"message": "bot Belum terdaftar ",
	// 		}
	// 		helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
	// 		return
	// 	default:
	// 		// response := map[string]string{"message": err.Error()}

	// 		// helper.ResponseJSON(w, http.StatusInternalServerError, response)
	// 		// w.Write([]byte(`<script>alert("` + err.Error() + `") </script>`))
	// 		data := map[string]interface{}{
	// 			"error":   true,
	// 			"message": "Data tidak di temukan",
	// 		}
	// 		helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
	// 		return
	// 	}
	// }

}
func ListBotHandler(w http.ResponseWriter, r *http.Request) {
	mp, err := helper.BacaRequest(r)
	if err != nil {
		data := map[string]interface{}{

			"error":   true,
			"message": "tidak menemukan parameter yang sesuai",
		}

		helper.ResponseJSON(w, http.StatusBadRequest, data)
		return
	}
	// id := muxgori.Vars(r)["id"]
	id := fmt.Sprint(mp["kdBot"])

	var bot models.Bot
	if err := models.DB.Table("m_bot").Where("kd_bot = ?", id).First(&bot).Error; err != nil {
		fmt.Println(err)

		switch err {
		case gorm.ErrRecordNotFound:
			fmt.Println("jalan di sini1")

			data := map[string]interface{}{
				"error":   true,
				"message": "bot Belum terdaftar ",
			}
			helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
			return
		default:
			// response := map[string]string{"message": err.Error()}

			// helper.ResponseJSON(w, http.StatusInternalServerError, response)
			// w.Write([]byte(`<script>alert("` + err.Error() + `") </script>`))
			data := map[string]interface{}{
				"error":   true,
				"message": "Data tidak di temukan",
			}
			helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
			return
		}
	}

	store := tampungClient[id].Store.Contacts
	contacts, _ := store.GetAllContacts()

	dtr := make([]map[string]interface{}, 0)

	// var jlll []map[string]interface{}
	mulai := 0
	for ji, contact := range contacts {
		noWa := strings.Split(fmt.Sprint(ji), "@")

		dtr = append(dtr, map[string]interface{}{
			"PushName":  contact.PushName,
			"FirstName": contact.FirstName,
			"FullName":  contact.FullName,

			"JID":  ji,
			"NoWa": noWa[0],
		})

		// dtr["PushName"] = contact.PushName
		// dtr["FirstName"] = contact.FirstName
		// dtr["FullName"] = contact.FullName

		// dtr["JID"] = ji
		// // ji
		// fmt.Println(fmt.Sprint(ji))
		// noWa := strings.Split(fmt.Sprint(ji), "@")
		// dtr["NoWa"] = noWa[0]
		// fmt.Println(contact)

		// jlll[mulai]
		mulai++
	}

	helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{

		"error":   false,
		"message": fmt.Sprint("berhasil mendapatkan ", len(contacts), " kontak"),
		"data":    dtr,
		// "store":   store,
	})

}
func StopHandler(w http.ResponseWriter, r *http.Request) {
	// WriteJson()
	mp, err := helper.BacaRequest(r)
	if err != nil {
		data := map[string]interface{}{

			"error":   true,
			"message": "tidak menemukan parameter yang sesuai",
		}

		helper.ResponseJSON(w, http.StatusBadRequest, data)
		return
	}
	// id := muxgori.Vars(r)["id"]
	id := fmt.Sprint(mp["kdBot"])

	var bot models.Bot
	if err := models.DB.Table("m_bot").Where("kd_bot = ?", id).First(&bot).Error; err != nil {
		fmt.Println(err)

		switch err {
		case gorm.ErrRecordNotFound:
			fmt.Println("jalan di sini1")

			data := map[string]interface{}{
				"error":   true,
				"message": "bot Belum terdaftar ",
			}
			helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
			return
		default:
			// response := map[string]string{"message": err.Error()}

			// helper.ResponseJSON(w, http.StatusInternalServerError, response)
			// w.Write([]byte(`<script>alert("` + err.Error() + `") </script>`))
			data := map[string]interface{}{
				"error":   true,
				"message": "Data tidak di temukan",
			}
			helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
			return
		}
	}

	err2 := models.DB.Raw("update m_bot set status= ?  where kd_bot=?", "0", id).Scan(&bot).Error
	if err2 != nil {

		data := map[string]interface{}{
			"error":   true,
			"message": "Update gagal",
		}
		helper.ResponseJSON(w, http.StatusBadRequest, data)
		return
	}
	tes, ada := tampungClient[id]

	if ada {

		if tes.IsConnected() {

			tes.Disconnect()
		}

		data := map[string]interface{}{

			"error":   false,
			"message": "wa bot berhasil di stop",
			"status":  bot.Status,
			"kdBot":   bot.KdBot,
		}
		helper.ResponseJSON(w, http.StatusOK, data)
		return
	} else {

		data := map[string]interface{}{

			"error":   true,
			"message": "wa bot belum ada atau atau belum terInisialisasi",
			"status":  bot.Status,
			"kdBot":   bot.KdBot,
		}
		helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
		return
	}
	// fmt.Fprintln(w,"stoped")
	// tes.Disconnect()

	// w.Write([]byte(`{"Terkoneksi":"` + fmt.Sprint(tes.IsConnected()) + `"}`))
}

func StartHandler(w http.ResponseWriter, r *http.Request) {
	mp, err := helper.BacaRequest(r)
	if err != nil {
		data := map[string]interface{}{

			"error":   true,
			"message": "tidak menemukan parameter yang sesuai",
		}

		helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
		return
	}
	// id := muxgori.Vars(r)["id"]
	id := fmt.Sprint(mp["kdBot"])
	var bot models.Bot
	if err := models.DB.Table("m_bot").Where("kd_bot = ?", id).Scan(&bot).Error; err != nil {
		fmt.Println(err)

		switch err {
		case gorm.ErrRecordNotFound:
			fmt.Println("jalan di sini1")

			data := map[string]interface{}{
				"error":   true,
				"message": "bot Belum terdaftar ",
			}
			helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
			return
		default:
			// response := map[string]string{"message": err.Error()}

			// helper.ResponseJSON(w, http.StatusInternalServerError, response)
			// w.Write([]byte(`<script>alert("` + err.Error() + `") </script>`))
			data := map[string]interface{}{
				"error":   true,
				"message": "Data tidak di temukan",
			}
			helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
			return
		}
	}

	err2 := models.DB.Raw("update m_bot set status= ?  where kd_bot=?", "1", id).Scan(&bot).Error
	if err2 != nil {

		data := map[string]interface{}{
			"error":   true,
			"message": "Update gagal " + err.Error(),
		}
		helper.ResponseJSON(w, http.StatusBadRequest, data)
		return
	}
	isi, ada := tampungClient[id]
	// var bot models.Bot
	// if err := models.DB.Raw("update set status=? from m_bot where kd_bot=?", 2, id).Scan(bot).Error; err != nil {

	// 	helper.ResponseJSON(w, http.StatusMethodNotAllowed, map[string]interface{}{"error": true, "message": err.Error()})
	// }

	fmt.Println("status : ")
	fmt.Println(bot.Status)
	fmt.Println("kd_bot : ")
	fmt.Println(bot.KdBot)
	if ada == true {

		if isi.IsConnected() == false {

			isi.Connect()
		}
		// w.Write([]byte(`{"Terkoneksi":"` + fmt.Sprint(isi.IsLoggedIn()) + `"}`))
		helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{
			"error":   false,
			"message": "wa bot berhasil di start",
			"status":  bot.Status,
			"kdBot":   bot.KdBot})
		return
	} else {

		w.Write([]byte(`{"error":true ,"message":"bot belum terinisialisasi"}`))

	}
}

func TambahBot(w http.ResponseWriter, r *http.Request) {

	if r.Method == "GET" {

		botcontroller.AmbilBot(w, r)

		return
	} else if r.Method == "PUT" {
		var botinput models.Bot
		_, err := helper.BacaRequest(r, &botinput)
		if err != nil {

			helper.ResponseJSON(w, http.StatusMethodNotAllowed, map[string]interface{}{
				"error":   true,
				"message": "tidak menemulan",
			})
			return
		}

		fmt.Println("databot")
		fmt.Println(botinput)
		if errorr := models.DB.Table("m_bot").Where("kd_bot=?", botinput.KdBot).Update("keterangan", botinput.Keterangan).Error; errorr != nil {
			helper.ResponseJSON(w, http.StatusMethodNotAllowed, map[string]interface{}{
				"error":   true,
				"message": "Gagal mengUpdate data",
			})
			return

		}
		helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{
			"error":   false,
			"message": "berhasil mengupdate data bot",
		})
		return
	}

	// fmt.Println("jalan tambahbot")

	var companyInput models.Bot
	decoder := json.NewDecoder(r.Body)
	if err := decoder.Decode(&companyInput); err != nil {
		response := map[string]string{"message": err.Error()}
		helper.ResponseJSON(w, http.StatusBadRequest, response)
		return
	}
	defer r.Body.Close()
	companyInput.Status = -1
	// mp, err := helper.BacaRequest(r)
	// if err != nil {
	// 	data := map[string]interface{}{

	// 		"error":   true,
	// 		"message": "tidak menemukan parameter yang sesuai",
	// 	}

	// 	helper.ResponseJSON(w, http.StatusMethodNotAllowed, data)
	// 	return
	// }

	// inputCompany := models.Company{

	// 	KdUser:     int64(mp["KdUser"].(float64)),
	// 	Alias:      fmt.Sprint(mp["Alias"]),
	// 	Nama:       fmt.Sprint(mp["Nama"]),
	// 	Alamat:     fmt.Sprint(mp["Alamat"]),
	// 	Hp:         helper.ConverNoHp(fmt.Sprint(mp["Hp"])),
	// 	Keterangan: fmt.Sprint(mp["Keterangan"]),
	// 	Status:     -1,
	// }

	// fmt.Println("jalan tambahbot")

	var company models.Bot

	if err := models.DB.Table("m_bot").Create(&companyInput).Last(&company).Error; err != nil {
		data := map[string]interface{}{

			"error":   true,
			"message": "gagal Insert",
		}

		helper.ResponseJSON(w, http.StatusBadRequest, data)

		return
	}
	fmt.Println("kode company")
	fmt.Println(company.KdBot)

	// data := map[string]interface{}{

	// 	"error":   false,
	// 	"message": "Insert Sukses",
	// 	"kd_bot":  company.KdBot,
	// }

	data := qrGet(fmt.Sprint(company.KdBot))

	helper.ResponseJSON(w, http.StatusOK, data)

	// return
}

func KirimAndCekPesan(isipsn string, jidno types.JID, cli *whatsmeow.Client) error {

	regex := regexp.MustCompile(`(https?://[^\s]+)`)

	// Menemukan semua URL yang cocok dengan pola regex
	urls := regex.FindAllString(isipsn, -1)
	fmt.Println("=================kondisi========================")
	fmt.Println(urls)
	fmt.Println("=========================================")

	if urls == nil {

		_, err := cli.SendMessage(context.Background(), jidno, &waProto.Message{

			Conversation: proto.String(isipsn),
		})

		if err != nil {

			return err
		}

	} else {

		title, descripsi, thumbnail := contentFromUrl(urls[0])
		pt := 0
		if strings.Contains(urls[0], "misterkong.com") {

			thumbnail, _ = os.ReadFile("misterkong.png")
		}
		// else if strings.Contains(urls[0], "youtube.com") {

		// 	pt = 1
		// }
		_, err := cli.SendMessage(context.Background(), jidno, &waProto.Message{

			ExtendedTextMessage: conversiKeExtended(isipsn, urls[0], title, urls[0], descripsi, "", thumbnail, nil, nil, nil, pt, 1024, 578),
		})

		if err != nil {

			return err
		}

	}

	fmt.Println("==========cobahasil2==============")

	fmt.Println("========================")

	return nil
}
func restartInisialisasiBot(w http.ResponseWriter, r *http.Request) {

	mp, err := helper.BacaRequest(r)
	if err != nil {

		helper.ResponseJSON(w, http.StatusMethodNotAllowed, map[string]interface{}{

			"error":   true,
			"message": "parameter tidak di temukan",
		})

	}
	if mp["tkn"] == "qwepoipqetuinlzcjif" {

		var bots []models.Bot
		err := models.DB.Raw("select * from m_bot").Scan(&bots).Error

		if err != nil {

			fmt.Println(err)

		}

		fmt.Println("jalan")
		fmt.Println(bots)

		rs := make([]map[string]interface{}, 0)
		for _, v := range bots {
			if v.Status == 1 {

				rs = append(rs, qrGet(fmt.Sprint(v.KdBot)))
			}
		}

		helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{

			"error": false,

			"data": rs,
		})
		return
	}

	helper.ResponseJSON(w, http.StatusUnauthorized, map[string]interface{}{

		"error":   true,
		"message": "Akses ditolak",
	})
}

func handleKirimPesanGroup(w http.ResponseWriter, r *http.Request) {

	mp, er := helper.BacaRequest(r)
	if er != nil {

		helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{
			"error":   true,
			"message": "parameter tidak di temukan atau berisi kosong",
		})
		return

	}

	fmt.Println("handleKirimPesan")
	fmt.Println(mp)

	if mp["token"] == "" && mp["nowhatsapp"] == "" && mp["isiPesan"] == "" {

		helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{
			"error":   true,
			"message": "parameter tidak di temukan atau berisi kosong",
		})
		return
	}
	nowhatsapp := mp["nowhatsapp"].(string)
	token := mp["token"].(string)
	isiPesan := mp["isiPesan"].(string)
	// token: AEtU5bVZ6qQTzCXGlX1daJMRwyUPpGft
	if token != "AEtU5bVZ6qQTzCXGlX1daJMRwyUPpGft" {

		helper.ResponseJSON(w, http.StatusUnauthorized, map[string]interface{}{
			"error":   true,
			"message": "Token akses api tidak valid",
		})
		return
	}

	var bot *whatsmeow.Client
	isidt, ada := mp["bot"]
	fmt.Println("====================+====++_+_+_+_+_+_+_+_+_")
	fmt.Println(ada)
	fmt.Println(isidt)
	fmt.Println("====================+====++_+_+_+_+_+_+_+_+_")

	fmt.Println(mp["bot"])
	if !ada {

		bot = tampungClient["msKong"]
	} else {

		bt, ada := tampungClient[isidt.(string)]
		bot = bt
		if !ada {

			helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{

				"error":   true,
				"message": "bot tidak di temukan",
			})

		}

	}

	nowa := strings.Split(nowhatsapp, "__")
	statusKirim := make([]map[string]interface{}, 0)
	for _, value := range nowa {

		// fmt.Println("keye :", key)
		// fmt.Println("value :", value)

		// // fmt.Println("bot :", bot.IsLoggedIn())
		// fmt.Println("isipesan :", isiPesan)
		// 120363282711901780@g.us
		// 6282266353193-1625030319@g.us

		isgroup, adaa := mp["isgroup"]
		var err error

		if adaa && isgroup == "true" {

			err = KirimAndCekPesan(isiPesan, types.JID{User: value, Server: "g.us"}, bot)
		} else {

			err = KirimAndCekPesan(isiPesan, types.JID{User: helper.ConverNoHp(value), Server: "s.whatsapp.net"}, bot)
		}
		if err != nil {

			statusKirim = append(statusKirim, map[string]interface{}{value: false})
			continue
		}
		statusKirim = append(statusKirim, map[string]interface{}{value: true})

	}
	// helper.ConverNoHp()
	helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{

		"error":                  false,
		"StatusBerhasilTerkirim": statusKirim,
	})

}
