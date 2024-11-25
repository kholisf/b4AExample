package main

import (
	"fmt"
	"log"
	"math/rand"
	"mime"
	"mime/multipart"
	"regexp"
	"strconv"
	"time"

	"waBot/app/controllers/authcontroller"
	"waBot/app/controllers/companycontroller"
	homecontroller "waBot/app/controllers/homeController"
	"waBot/app/helper"

	// controllers "waBot/app/controllers"
	"waBot/app/middlewares"
	"waBot/app/models"

	// "testing"

	"net/http"
	_ "testing"

	"bytes"
	_ "bytes"
	"context"
	"io"
	"strings"

	"encoding/json"
	_ "encoding/json"

	_ "io"
	"os"
	"os/signal"
	_ "strings"
	"syscall"

	_ "github.com/lizebang/qrcode-terminal"
	_ "github.com/mattn/go-sqlite3"
	"github.com/mymmsc/gox/qrterminal"
	qrPng "github.com/skip2/go-qrcode"

	// "github.com/mymmsc/gox/qrterminal"
	// "github.com/mymmsc/gox/qrterminal"
	// _ "github.com/mymmsc/gox/qrterminal"

	"go.mau.fi/whatsmeow"
	waProto "go.mau.fi/whatsmeow/proto/waE2E"
	"go.mau.fi/whatsmeow/store/sqlstore"
	"go.mau.fi/whatsmeow/types"
	"go.mau.fi/whatsmeow/types/events"
	waLog "go.mau.fi/whatsmeow/util/log"
	"google.golang.org/protobuf/proto"

	// "github.com/prometheus/common/server"
	muxgori "github.com/gorilla/mux"
)

var client *whatsmeow.Client
var Readyy = false

type mapB4a map[string]interface{}

var tampungClient = make(map[string]*whatsmeow.Client)

func main() {

	// tittle,descripsi,err2:=getTitleAndDescription("https://www.youtube.com/watch?v=TUVcZfQe-Kw&list=RDXXYlFuWEuKI&index=17")
	// fmt.Println(tittle)
	// fmt.Println(descripsi)
	// fmt.Println(err2)
	// 			title := getTitle("https://www.youtube.com/watch?v=TUVcZfQe-Kw&list=RDXXYlFuWEuKI&index=17")

	// return
	// cobaa :=url.Parse("https://www.google.com/search?q=how+to+get+thubnail+from+url+in+golang&oq=how+to+get+thubnail+from+url+in+golang&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQLhhA0gEJMTU2OTdqMGoxqAIAsAIA&sourceid=chrome&ie=UTF-8")
	// cobaa
	// 	str := "Terima kasih telah menguhubungi kami. Apa yang bisa Kong Bantu ? \nKepoin lebih lengkap di"

	// 	// Pola regex untuk mencari URL
	// 	// Ini mencari kata yang dimulai dengan "http" atau "https" dan diikuti oleh karakter yang valid untuk URL
	// 	regex := regexp.MustCompile(`(https?://[^\s]+)`)

	// 	// Menemukan semua URL yang cocok dengan pola regex
	// 	urls := regex.FindAllString(str, -1)
	// // fmt.Println(urls[1])
	// 	// Menampilkan URL yang ditemukan
	// 	if urls ==nil {

	// 		fmt.Println("nill")
	// 	}
	// 	for _, url := range urls {
	// 		fmt.Println(url)
	// 	}
	// 	return
	// 	customUTC := time.FixedZone("Custom",0*60*60)

	// 	fmt.Println( time.Now().String())

	// 	// Mendapatkan waktu saat ini
	// 	now := time.Now()

	// 	// Mengonversi waktu saat ini ke zona waktu kustom UTC
	// 	timeInCustomUTC := now.In(customUTC)

	// 	// Menampilkan waktu dengan format khusus
	// 	fmt.Println("Waktu di Zona Waktu Kustom UTC:", timeInCustomUTC.Format("2006-01-02 15:04:05 -0700"))
	// // 	fmt.Printf("%s %d\n", time.Now().String(), time.Now().Unix())
	// // fmt.Printf("%s %s\n", time.Now().UTC().String(), time.Now().UTC().Unix())
	// 	return

	// input := "Heloow1234 dan 4567"
	// total := 0

	// for _, char := range input {

	// 	if unicode.IsDigit(char) {
	// 		fmt.Println("char :", char)
	// 		num, err := strconv.Atoi(string(char))
	// 		fmt.Println("Num :", num)

	// 		if err == nil {

	// 			total += num
	// 		}
	// 	}
	// }
	// fmt.Println("total : ", total)
	// return
	//  func() {

	CheckAndMakeFolder("database")
	CheckAndMakeFolder("Downloads")
	go MuxServe()
	// }()
	JalankanWaBot()

	// tess :=readJSON("smsTerakhir.json")

	// for i := 0; i < 10; i++ {
	// 	fmt.Println(tess)
	// 	// fmt.Println(i)
	// 	WriteJson(tess,i)
	// }
	// 	return

	// fmt.Println("============================================================")
	// fmt.Println("jalan di bawah main")
	// fmt.Println("============================================================")

}

func timeUtc8() time.Time {
	customUTC := time.FixedZone("CustomUTC", 8*60*60)

	// Mendapatkan waktu saat ini
	now := time.Now()

	// Mengonversi waktu saat ini ke zona waktu kustom UTC
	timeInCustomUTC := now.In(customUTC)

	return timeInCustomUTC

}

func MuxServe() {
	models.ConnectDatabase()
	r := muxgori.NewRouter()

	// var bots []models.Bot
	// err1 := models.DB.Raw("select * from m_bot").Scan(&bots).Error

	// if err1 != nil {

	// 	fmt.Println(err1)

	// }

	// fmt.Println("jalan")
	// fmt.Println(bots)

	// rs := make([]map[string]interface{}, 0)
	// for _, v := range bots {
	// 	if v.Status == 1 {

	// 		rs = append(rs, qrGet(fmt.Sprint(v.KdBot)))
	// 	}
	// }

	// 	mux.HandleFunc("/",func(w http.ResponseWriter, r *http.Request) {

	// 		fmt.Println("============================================")
	// 		fmt.Println("ready : ",Readyy)
	// 		fmt.Println("============================================")
	// if (r.Method == "POST"){
	// 		if (Readyy == false){
	// 		fmt.Fprintln(w,"Hay guys")

	// 		// JalankanWaBot()
	// 		Readyy =true
	// 		} else{

	// 			fmt.Fprintln(w,"sudah ready ",Readyy)

	// 		}

	// 		w.Write(	[]byte(`{"Sukses": true }`))
	// 		return
	// 		}
	// 	})

	// mux.HandleFunc("/run",func(w http.ResponseWriter, r *http.Request) {

	// 	fmt.Fprintln(w,"Hay run")

	// })
	r.HandleFunc("/mainqr", func(w http.ResponseWriter, r *http.Request) {
		// t, err := r.Cookie("token")

		// if err != nil {

		// 	http.Error(w, err.Error(), http.StatusBadRequest)
		// }
		if client == nil {

			w.Write([]byte(`{"error" : true, "message" : "terjadi kesalahan"}`))
			// JalankanWaBot()
			return

		}
		// if client.IsConnected() {

		if client.IsLoggedIn() {

			w.Write([]byte(`{"error" : false, "message" : "sudah login"}`))
			return
		}
		// 	w.Write([]byte(`{"error" : true , "message" : "sudah terkoneksi"}`))
		// 	return
		// }
		qrgambar, err := os.ReadFile("./tesqr.png")
		if err != nil {

			w.Write([]byte(`{"error" : true ,"message":"terjadi kesalahan"}`))
			return
		}
		w.Write(qrgambar)
		// w.Write([]byte(fmt.Sprintf(`{"token" : "%s"}`, t)))
	})
	r.HandleFunc("/tokengettes", func(w http.ResponseWriter, r *http.Request) {
		t, err := r.Cookie("token")

		if err != nil {

			http.Error(w, err.Error(), http.StatusBadRequest)
		}

		w.Write([]byte(fmt.Sprintf(`{"token" : "%s"}`, t)))
	})
	staticFileDirectory2 := http.Dir("app/assets/image")
	staticFileHandler2 := http.StripPrefix("/images/", http.FileServer(staticFileDirectory2))
	r.PathPrefix("/images").Handler(staticFileHandler2).Methods("GET")

	staticFileDirectory := http.Dir("app/assets")
	staticFileHandler := http.StripPrefix("/public/", http.FileServer(staticFileDirectory))
	r.PathPrefix("/public").Handler(staticFileHandler).Methods("GET")
	// r.HandleFunc("/", authcontroller.Index)

	r.HandleFunc("/login", authcontroller.Login).Methods("POST")
	r.HandleFunc("/loginOtp", authcontroller.LoginOtp).Methods("POST")
	r.HandleFunc("/kirimOtp", handlerKirimOtp).Methods("POST")
	r.HandleFunc("/register", authcontroller.Register).Methods("POST")
	// r.HandleFunc("/getUser", authcontroller.DataUSer).Methods("POST")
	r.HandleFunc("/logout", authcontroller.Logout).Methods("GET")
	r.HandleFunc("/kirim", handlerKirim).Methods("POST")
	r.HandleFunc("/kirimPesanCustome", handleKirimPesan)
	r.HandleFunc("/kirimPesanCustomeGroup", handleKirimPesanGroup)
	r.HandleFunc("/sendmessage", KirimPesanPrivateOrGroupBotHandler).Methods("POST")
	mux := r.PathPrefix("/api").Subrouter()
	mux.Use(middlewares.JWTMiddleware)
	mux.HandleFunc("/ws", handleWebsocket)
	r.HandleFunc("/home", homecontroller.Home).Methods("Get")
	mux.HandleFunc("/setpesanBot", handlerSetPesan).Methods("POST")
	mux.HandleFunc("/Hapusbot", handleDeletbot).Methods("POST")
	// mux.HandleFunc("/hi", func(w http.ResponseWriter, r *http.Request) {
	// 	fmt.Fprintln(w, tampungClient)
	// })
	mux.HandleFunc("/qr", handlerQr).Methods("POST")
	mux.HandleFunc("/tbCompany", companycontroller.TambahCompany)
	mux.HandleFunc("/tbBot", TambahBot)
	// mux.HandleFunc("/ambildataBot", botcontroller.AmbilBot).Methods("POST")
	mux.HandleFunc("/start", StartHandler).Methods("POST")
	mux.HandleFunc("/listBotOnline", func(w http.ResponseWriter, r *http.Request) {
		// WriteJson()
		fmt.Println("jalan kladskljaslk")
		dt := make(map[string]interface{})

		for k, v := range tampungClient {
			var dr map[string]interface{}
			if v.IsLoggedIn() {
				dr = map[string]interface{}{"Islogin": v.IsLoggedIn(), "NoHp": v.Store.ID.User}

			} else {

				dr = map[string]interface{}{"Islogin": v.IsLoggedIn()}
			}

			dt[k] = dr
			// dt = append(dt, map[string]interface{}{
			// 	k: dr,
			// })
		}
		helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{"error": false, "message": "request berhasil", "dataBotOnline": dt, "JumlahData": len(tampungClient)})
		// fmt.Fprintln(w, len(tampungClient))
	})
	mux.HandleFunc("/stop", StopHandler)
	mux.HandleFunc("/listkontakbot", ListBotHandler)
	mux.HandleFunc("/broadcastPesan", KirimPesanBotHandler).Methods("POST")

	r.HandleFunc("/restartInisialisasiBot", restartInisialisasiBot)
	// mux.HandleFunc("/daftar", func(w http.ResponseWriter, r *http.Request) {
	// 	// WriteJson()
	// 	// 		body, err := io.ReadAll(r.Body)
	// 	// 		if err != nil {
	// 	// 			http.Error(w, "Error reading request body", http.StatusInternalServerError)
	// 	// 			return
	// 	// 		}
	// 	// 		defer r.Body.Close()
	// 	// 		var mp map[string]interface{}
	// 	//  err1 := json.Unmarshal(body,&mp)

	// 	// if err1 !=nil{

	// 	// return
	// 	// }

	// 	// fmt.Printf("type data dari : %T",mp["keyIndex"])
	// 	// go func ()  {

	// 	// 	Jalanbot(mp["keyIndex"].(string),w)
	// 	// }()

	// 	// 		// Jalanbot(mp["keyIndex"].(string),)
	// 	// 		// fmt.Fprintln(w,len(tampungClient))
	// })

	// r.HandleFunc("/KirimPsn", handlerKirim).Methods("POST")

	server := http.Server{
		Addr:    ":8091",
		Handler: r,
	}
	fmt.Println("Berjalan di : " + server.Addr)
	err := server.ListenAndServe()

	if err != nil {
		fmt.Println("error6")
		panic(err)
	}

}

func KirimOtp(nohp, isipesan, pin string, w http.ResponseWriter) {

	// button := &waProto.ButtonsMessage{

	// }

	var d types.MessageSource

	d.Sender.Server = "s.whatsapp.net"
	d.Sender.User = nohp
	_, err := client.SendMessage(context.Background(), d.Sender, &waProto.Message{
		Conversation: proto.String(isipesan),
	})

	HapusOtp(nohp)
	if err != nil {
		fmt.Println(err)
		// w.Write(	[]byte(`{"status": 404,"error": true}`))
		w.Write([]byte(`{"status": 404,"error": true,"msg":"` + err.Error() + `"}`))
		return
	} else {
		w.Write([]byte(`{"status": 200,"error": false,"otp": ` + pin + `	}`))
		return

	}

}
func kirim(nohp, isipesan, pin string, w http.ResponseWriter) {

	// button := &waProto.ButtonsMessage{

	// }

	var d types.MessageSource

	d.Sender.Server = "s.whatsapp.net"
	d.Sender.User = nohp
	_, err := client.SendMessage(context.Background(), d.Sender, &waProto.Message{
		Conversation: proto.String(isipesan),
		// ButtonsMessage: &tessbutton,
		// ButtonsMessage: &waProto.ButtonsMessage{

		// 	HeaderType: waProto.ButtonsMessage_TEXT.Enum(),
		// 	ContentText: proto.String("TEXT TOP"),
		// 	Buttons: []*waProto.ButtonsMessage_Button{
		// 		{
		// 			ButtonId: proto.String("YES"),
		// 			ButtonText: &waProto.ButtonsMessage_Button_ButtonText{
		// 				DisplayText: proto.String("YES"),
		// 			},
		// 		},
		// 		{
		// 			ButtonId: proto.String("NO"),
		// 			ButtonText: &waProto.ButtonsMessage_Button_ButtonText{
		// 				DisplayText: proto.String("NO"),
		// 			},
		// 		},
		// 	},
		// 	FooterText: proto.String("TEXT FOOTER"),
		// },
	})

	// HapusOtp(nohp)
	if err != nil {
		fmt.Println(err)
		// w.Write(	[]byte(`{"status": 404,"error": true}`))

		helper.ResponseJSON(w, http.StatusBadRequest, map[string]interface{}{"status": 404, "error": true, "msg": err.Error()})
		// w.Write([]byte(`{"status": 404,"error": true,"msg":"` + err.Error() + `"}`))
		return
	} else {
		helper.ResponseJSON(w, http.StatusOK, map[string]interface{}{"status": 200, "error": true, "otp": pin})
		// w.Write([]byte(`{"status": 200,"error": false,"otp": ` + pin + `	}`))
		return

	}

}

func JalankanWaBot() {

	dbLog := waLog.Stdout("Database", "DEBUG", true)
	// Make sure you add appropriate DB connector imports, e.g. github.com/mattn/go-sqlite3 for SQLite
	container, err := sqlstore.New("sqlite3", "file:examplestore.db?_foreign_keys=on", dbLog)
	if err != nil {
		fmt.Println("erro1")
		panic(err)
	}
	// If you want multiple sessions, remember their JIDs and use .GetDevice(jid) or .GetAllDevices() instead.
	deviceStore, err := container.GetFirstDevice()
	if err != nil {

		fmt.Println("erro2")
		panic(err)
	}
	clientLog := waLog.Stdout("Client", "DEBUG", true)
	client = whatsmeow.NewClient(deviceStore, clientLog)
	client.AddEventHandler(handleBot)

	if client.Store.ID == nil {
		// No ID stored, new login
		qrChan, _ := client.GetQRChannel(context.Background())
		err = client.Connect()
		if err != nil {
			fmt.Println("erro3")
			panic(err)
		}
		for evt := range qrChan {
			if evt.Event == "code" {
				// Render the QR code here
				// e.g. qrterminal.GenerateHalfBlock(evt.Code, qrterminal.L, os.Stdout)
				// or just manually `echo 2@... | qrencode -t ansiutf8` in a terminal
				fmt.Println("QR code:", evt.Code)
				qrterminal.Generate(evt.Code, qrterminal.M, os.Stdout)
				qrPng.WriteFile(evt.Code, qrPng.High, 256, `tesqr.png`)
			} else {
				fmt.Println("Login event:", evt.Event)
			}
		}
		tampungClient["msKong"] = client
	} else {
		// Already logged in, just connect
		err = client.Connect()
		tampungClient["msKong"] = client
		// 		dt2 := make(mapB4a)
		// 		// dt2 := readJSON("UserClient.json")
		// WriteJsonUser(dt2,"coba1",client)
		// 		fmt.Println("jalan di bawah connectttttttttt")
		if err != nil {
			fmt.Println("erro5")
			panic(err)
		}
		// var v *events.Message
		// v.Info.Sender.User = "6282266353193"
		// fmt.Println("=======================")
		// fmt.Println(v.Info.Sender)
		// fmt.Println("=======================")
		// 		client.SendMessage(context.Background(),v.Info.Sender,&waProto.Message{
		// 			Conversation: proto.String("Kode sudah tidak dapat di gunakan harap melakukan request lagi di aplikasi kongrider"),
		// 			})
		// 		return
	}

	// Listen to Ctrl+C (you can also do something else that prevents the program from exiting)
	c := make(chan os.Signal)
	signal.Notify(c, os.Interrupt, syscall.SIGTERM)
	<-c

	client.Disconnect()
}

// func saveFileWA(msg *waProto.Message){

// select{

// case msg.ImageMessage != nil:
// 	img := evt.Message.GetImageMessage()
// 	if img != nil {
// 		data, err := global.Cli.Download(img)
// 		if err != nil {
// 			log.Printf("Failed to download image: %v", err)
// 			return
// 		}
// 		exts, _ := mime.ExtensionsByType(img.GetMimetype())
// 		path := fmt.Sprintf("./Downloads/Image/%s-%s%s", sender, evt.Info.ID, exts[0])
// 		err = os.WriteFile(path, data, 0600)
// 		if err != nil {
// 			log.Printf("Failed to save image: %v", err)
// 			return
// 		}
// 		log.Printf("Saved image in message to %s", path)
// 	}

// case evt.Message.AudioMessage != nil:
// 	audio := evt.Message.GetAudioMessage()
// 	if audio != nil {
// 		data, err := global.Cli.Download(audio)
// 		if err != nil {
// 			log.Printf("Failed to download audio: %v", err)
// 			return
// 		}
// 		exts, _ := mime.ExtensionsByType(audio.GetMimetype())
// 		path := fmt.Sprintf("./Downloads/Audio/%s-%s%s", sender, evt.Info.ID, exts[0])
// 		err = os.WriteFile(path, data, 0600)
// 		if err != nil {
// 			log.Printf("Failed to save audio: %v", err)
// 			return
// 		}
// 		log.Printf("Saved audio in message to %s", path)
// 	}

// case evt.Message.VideoMessage != nil:
// 	video := evt.Message.GetVideoMessage()
// 	if video != nil {
// 		data, err := global.Cli.Download(video)
// 		if err != nil {
// 			log.Printf("Failed to download video: %v", err)
// 			return
// 		}
// 		exts, _ := mime.ExtensionsByType(video.GetMimetype())
// 		path := fmt.Sprintf("./Downloads/Video/%s-%s%s", sender, evt.Info.ID, exts[0])
// 		err = os.WriteFile(path, data, 0600)
// 		if err != nil {
// 			log.Printf("Failed to save video: %v", err)
// 			return
// 		}
// 		log.Printf("Saved video in message to %s", path)
// 	}

// case evt.Message.DocumentMessage != nil:
//
//		document := evt.Message.GetDocumentMessage()
//		if document != nil {
//			data, err := global.Cli.Download(document)
//			if err != nil {
//				log.Printf("Failed to download audio: %v", err)
//				return
//			}
//			exts, _ := mime.ExtensionsByType(document.GetMimetype())
//			path := fmt.Sprintf("./Downloads/Documents/%s-%s%s", sender, evt.Info.ID, exts[0])
//			err = os.WriteFile(path, data, 0600)
//			if err != nil {
//				log.Printf("Failed to save document: %v", err)
//				return
//			}
//			log.Printf("Saved document in message to %s", path)
//		}
//	}
//
// }
func UploadFileTest(url string, paramName string, filePath string, namafile string) error {
	file, err := os.Open(filePath)
	if err != nil {
		return err
	}
	defer file.Close()

	body := &bytes.Buffer{}
	writer := multipart.NewWriter(body)
	part, err := writer.CreateFormFile(paramName, namafile)
	if err != nil {
		return err
	}
	_, err = io.Copy(part, file)
	_ = writer.WriteField("nama", namafile)
	err = writer.Close()
	if err != nil {
		return err
	}

	request, err := http.NewRequest("POST", url, body)
	request.Header.Add("Content-Type", writer.FormDataContentType())
	client := &http.Client{}
	response, err := client.Do(request)

	if err != nil {
		return err
	}
	defer response.Body.Close()

	// Handle the server response...
	return nil
}
func handleBot(evt interface{}) {
	switch v := evt.(type) {

	case *events.Message:

		// fmt.Println("===========WAKTU==================")
		// fmt.Println(v.Info.Timestamp)
		// fmt.Println(time.Now())
		// fmt.Printf("dtisi[mediaKey].(string) : %T\n", v.Info.Timestamp.UTC())
		// fmt.Println(v.Info.MessageSource.Sender)
		// fmt.Println(v.Info.MessageSource.Chat.User)
		// fmt.Println(v.Info.Chat.User)
		// fmt.Println(v.IsDocumentWithCaption)
		// fmt.Println(v.Message.DocumentMessage)

		fmt.Println("==============================-=-=-=-=-=-=-=--======================")
		document := v.Message.GetDocumentMessage()
		// if v.Message.DocumentMessage != nil {

		if document != nil {
			data, err := client.Download(document)
			if err != nil {
				fmt.Printf("Failed to download audio: %v", err)
				return
			}

			exts, _ := mime.ExtensionsByType(document.GetMimetype())
			fmt.Println(exts[0])

			if exts[0] == ".xlsx" || exts[0] == ".xlsm" || exts[0] == ".xlsb" || exts[0] == ".xltx" || exts[0] == ".csv" {
				// path := fmt.Sprintf("./Downloads/Documents/%s-%s%s", v.Info.PushName, v.Info.ID, exts[0])
				path := fmt.Sprintf("./Downloads/Documents/%s", *v.Message.DocumentMessage.FileName)

				err = os.WriteFile(path, data, 0600)
				if err != nil {
					log.Printf("Failed to save document: %v", err)
					return
				}
				log.Printf("Saved document in message to %s", path)

				// 	errrror := UploadFileTest("http://localhost:8080/file", "file", path, *v.Message.DocumentMessage.FileName)
				// 	if errrror != nil {

				// 		fmt.Println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
				// 		fmt.Println(errrror)
				// 		fmt.Println("erooororoororoeroreoieroeroieroieroierio")
				// 		fmt.Println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
			}
			// 	fmt.Println("jalnanananananananan")
			// }
			return

		}
		fmt.Println("==============================-=-=-=-=-=-=-=--======================")

		// 			fmt.Println("nama file", string(*v.Message.DocumentMessage.FileName))
		// 			fmt.Println("nama directory", *v.Message.DocumentMessage.Url)
		// doc :=v.Message.GetDocumentMessage()

		// client.Download(doc)

		// os.WriteFile("versi 1"+*v.Message.DocumentMessage.FileName, v.Message.DocumentMessage.MediaKey, os.ModePerm)
		// os.WriteFile("versi 2"+*v.Message.DocumentMessage.FileName, v.Message.DocumentMessage.GetMediaKey(), os.ModePerm)
		// os.WriteFile("versi 3"+*v.Message.DocumentMessage.FileName, v.Message.DocumentMessage.GetFileSha256(), os.ModePerm)
		// os.WriteFile("versi 4"+*v.Message.DocumentMessage.FileName, v.Message.DocumentMessage.GetFileEncSha256(), os.ModePerm)

		// fmt.Println("nama titile",v.Message.DocumentMessage.Title)
		// fmt.Println(v.Message.DocumentMessage)
		// }
		fmt.Println("==============================-=-=-=-=-=-=-=--=")

		perbedaan := time.Now()
		difference := perbedaan.Sub(v.Info.Timestamp)

		if difference.Hours() >= 1 {
			fmt.Println("waktu sudah habnis")
			return
		}

		if v.Info.IsGroup {
			fmt.Println("getJidGroup")
			if v.Message.GetConversation() == "getJidGroup" {

				kirimchat(v.Info.MessageSource.Chat.User, v.Info.PushName, v.Info.Chat, client)
			} else if v.Message.GetConversation() == "getJidNurl" {
				isip := fmt.Sprint("/kirimPesanCustome?nowhatsapp=", v.Info.MessageSource.Chat.User, "&token=AEtU5bVZ6qQTzCXGlX1daJMRwyUPpGft&isiPesan=untukcobata&isgroup=true")
				kirimchat(isip, v.Info.PushName, v.Info.Chat, client)
			}

			return
		}
		// fmt.Printf("Hours: %.f\n", difference.Hours())
		// fmt.Printf("Minutes: %.f\n", difference.Minutes())
		// fmt.Printf("Seconds: %.f\n", difference.Seconds())
		// fmt.Printf("Milliseconds: %d\n", difference.Milliseconds())
		// fmt.Println("=============================")
		if !v.Info.IsFromMe {

			// KirimPesanDiakhir(v.Info.Chat.User)
			fmt.Println("=============================")
			fmt.Println(v.Message)
			fmt.Println("=============================")
			isipesan := ""
			if v.Message.GetExtendedTextMessage() != nil {
				isipesan = *v.Message.GetExtendedTextMessage().Text

			} else if v.Message.GetImageMessage() != nil {

				isipesan = v.Message.ImageMessage.GetCaption()
			} else {
				isipesan = v.Message.GetConversation()

			}

			// fmt.Println(v.Message.ExtendedTextMessage)
			// tes :=readJSON2("UserClient.json")

			// fmt.Printf("======================tesss aksdjakjsd : %T\n",tes["tes1"].(map[string]interface{})["text"])
			// dtisi := tes["tes1"].(map[string]interface{})
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["text"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["matchedText"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["canonicalUrl"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["title"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["description"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["jpegThumbnail"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["thumbnailDirectPath"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["mediaKey"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["thumbnailEncSha256"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["thumbnailSha256"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["thumbnailHeight"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["thumbnailWidth"])
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["previewType"])

			if isipesan != "" {

				if strings.EqualFold(isipesan, "menu") {
					var tokenn string
					isipsn := getDataFromsheet("0:0", "")

					tokenn = kirimchat(isipsn, v.Info.PushName, v.Info.Chat, client)
					KirimKodePesan(v.Info.Sender.User, isipsn, "0:0", tokenn, 0, "") //Ubah
					// KirimKodePesan(v.Info.Sender.User,isipsn,"0:0","0",timeUtc8().Format("2006-01-02 15:04:05"))
					// go func() {
					// timm, ada := TimerPesan[v.Info.Chat.User]
					// if !ada || timm == 0 {

					go KirimPesanDiakhir(v.Info.Chat.User, client, v.Info.Chat, "") //Ubah
					// 	} else {

					// 		TimerPesan[v.Info.Chat.User] = 30
					// 	}
					// }()
					return
				}
				kode, kedalaman, tokenW := getKodePesan(v.Info.Sender.User, "") //Ubah

				fmt.Println("===-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
				fmt.Println("kode : ", kode)
				fmt.Println("===-=-=-=-=-=-=-=-=-=-=-=-=-=-=")

				if kode == "2:1" || kode == "1:1" || kode == "3:1" {
					isipsn := getDataFromsheet("terimakasi", "")                         //Ubah
					kirimchat(isipsn, v.Info.PushName, v.Info.Chat, client)              //Ubah
					KirimKodePesan(v.Info.Sender.User, "chatMode", "*", "tokenn", 0, "") //Ubah
					// go func() {
					// timm, ada := TimerPesan[v.Info.Chat.User]
					// if !ada || timm == 0 {

					go KirimPesanDiakhir(v.Info.Chat.User, client, v.Info.Chat, "") //Ubah
					// } else {

					// 	TimerPesan[v.Info.Chat.User] = 30
					// }
					// }()
					return
				} else if kode == "*" {
					// go func() {
					// timm, ada := TimerPesan[v.Info.Chat.User]
					// if !ada || timm == 0 {

					// go KirimPesanDiakhir(v.Info.Chat.User, client, v.Info.Chat, "")
					// 	} else {

					// 		TimerPesan[v.Info.Chat.User] = 30
					// 	}
					// }()
					return

				}

				// numeric := regexp.MustCompile(`\d`).MatchString(isipesan)
				// if numeric==false && kode =="0:0" {

				// }
				fmt.Printf("token : ")
				fmt.Println(tokenW)
				token, erro := verifyToken(tokenW)
				if erro != nil {
					fmt.Println("Error verifying token:", erro)

					if erro.Error() == "Token is expired" {
						client.SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
							Conversation: proto.String("Perintah sudah tidak berlaku, Silahkan ulangi perintah dari awal"),
						})

					} //Ubah
					// go func() {
					// timm, ada := TimerPesan[v.Info.Chat.User]
					// if !ada || timm == 0 {

					go KirimPesanDiakhir(v.Info.Chat.User, client, v.Info.Chat, "") //Ubah
					// } else {

					// 	TimerPesan[v.Info.Chat.User] = 30
					// }
					// }()
					return
				}

				// Token valid
				if token.Valid {
					fmt.Println("Token is valid")
				} else {
					fmt.Println("Token is invalid")
				}

				numeric2 := regexp.MustCompile(`\d`).MatchString(isipesan[:1])

				if !numeric2 {
					client.SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
						Conversation: proto.String("Tidak menemukan perintah yang di maksud"),
					}) //Ubah

					KirimKodePesan(v.Info.Sender.User, "chatMode", "*", "tokenn", 0, "") //Ubah
					// go func() {
					// timm, ada := TimerPesan[v.Info.Chat.User]
					// if !ada || timm == 0 {

					// go KirimPesanDiakhir(v.Info.Chat.User, client, v.Info.Chat, "")
					// } else {

					// 	TimerPesan[v.Info.Chat.User] = 30
					// }
					// }()
					return
				}

				if kode == "null" {

					return
				}

				fmt.Println(kode)

				if kode == "0:0" {
					newKode := isipesan + kode[1:3]
					fmt.Println(newKode + " : baru")
					isipsn := getDataFromsheet(newKode, "")                        //Ubah
					tkn := kirimchat(isipsn, v.Info.PushName, v.Info.Chat, client) //Ubah
					// _,err :=client.SendMessage(context.Background(),v.Info.Chat,&waProto.Message{
					// 	Conversation: proto.String(isipsn),
					// 	})
					// 	if err !=nil {

					// 		return
					// 	}
					if isipsn != "tidak menemukan perintah yang di maksud" {
						// fmt.Println("jalanaaa")
						// tkn ,_:=createToken(v.Info.PushName)
						KirimKodePesan(v.Info.Sender.User, isipsn, newKode, tkn, kedalaman+1, "") //Ubah
					}
					// go func() {
					// timm, ada := TimerPesan[v.Info.Chat.User]
					// if !ada || timm == 0 {

					go KirimPesanDiakhir(v.Info.Chat.User, client, v.Info.Chat, "") //Ubah
					// } else {

					// 	TimerPesan[v.Info.Chat.User] = 30
					// }
					// }()
					return
				} else {
					var newKode string
					if strings.Contains(kode, "0") {

						newKode = kode[0:strings.Index(kode, "0")] + isipesan
					} else {
						newKode = kode + ":" + isipesan

					}
					fmt.Println("================================================")
					fmt.Println("newKode : " + newKode)
					fmt.Println("================================================")
					isipsn := getDataFromsheet(newKode, "") //Ubah
					// var tkn string
					tkn := kirimchat(isipsn, v.Info.PushName, v.Info.Chat, client) //Ubah
					// _,err :=client.SendMessage(context.Background(),v.Info.Chat,&waProto.Message{
					// 	Conversation: proto.String(isipsn),
					// 	})

					// 	if err !=nil {

					// 		tkn ,_:=createToken(v.Info.PushName)
					// 		return
					// 	}
					if isipsn != "tidak menemukan perintah yang di maksud" {
						KirimKodePesan(v.Info.Sender.User, isipsn, newKode, tkn, kedalaman+1, "") //Ubah
					}
					// go func() {
					// timm, ada := TimerPesan[v.Info.Chat.User]
					// if !ada || timm == 0 {

					// KirimPesanDiakhir(v.Info.Chat.User)
					go KirimPesanDiakhir(v.Info.Chat.User, client, v.Info.Chat, "") //Ubah
					// } else {

					// 	TimerPesan[v.Info.Chat.User] = 30
					// }
					// }()
					return
				}

			}

		}
	}

}

func getKodePesan(noWhatsapp, lokasi string) (string, int, string) {
	// fmt.Println("jalan ambil kode getKodePesan")
	// response, err := http.Get(`https://coba-tes123-default-rtdb.firebaseio.com/smsTerakhir/`+noWhatsapp+`.json`)
	// if err != nil {
	// 	fmt.Println("Error:", err)

	// 	return "null",0,""
	// }
	// defer response.Body.Close()

	// // Membaca isi dari response
	// body, err := io.ReadAll(response.Body)

	// if err != nil {
	// 	fmt.Println("Error:", err)

	// 	return "null",0,""
	// }
	// fmt.Println("=================================")
	// fmt.Println(string(body))
	// fmt.Println("=================================")
	// if string(body)!="null"{
	// var mp map[string]interface{}

	_, err := os.ReadFile(lokasi + "smsTerakhir.json")
	if err != nil {

		file, err := os.OpenFile(lokasi+"smsTerakhir.json", os.O_RDWR, 0644)

		if err != nil {

			return "null", 0, ""
		}
		defer file.Close()
	}

	dt := readJSON(lokasi + "smsTerakhir.json")

	mp := dt[noWhatsapp]

	fmt.Println("==========================teees==========================")
	// m,ok :=v.(map[string]interface{})
	m, okkke := mp.(map[string]interface{})
	if okkke {
		return m["kode"].(string), int(m["kedalaman"].(float64)), m["tokenW"].(string)

	}

	// fmt.Println(m["kedalaman"])
	// fmt.Println(m["kode"])
	// fmt.Println(m["noWhatsapp"])
	// fmt.Println(m["tokenW"])
	// fmt.Println("===========================tesss=========================")
	// err1 := json.Unmarshal(body,&mp)
	// fmt.Println("erorrrrrrrrr")
	// fmt.Println(string(body))
	// fmt.Println(mp["kedalaman"])
	// fmt.Println(err1)
	// if err1 !=nil{

	// return "null",0,""
	// }
	// isilagi :=mp["data"]
	// fmt.Println(mp["data"])
	// fmt.Println(isilagi)
	// waktuu ,_:=time.Parse("2006-01-02 15:04:05",mp["tokenW"].(string))
	// perbedaan :=waktuu.Sub(timeUtc8())
	// fmt.Println(waktuu)
	// fmt.Println(mp["tokenW"].(string))
	// fmt.Println(perbedaan.Minutes())
	// fmt.Println("=================================")
	// fmt.Println(mp["tokenW"].(string))
	// fmt.Println(timeUtc8().Format("2006-01-02 15:04:05"))
	// fmt.Println("=================================")
	// return mp["kode"].(string),int(mp["kedalaman"].(float64)),mp["tokenW"].(string)

	// mp["data"].(mapB4a)["IsiPesan"].(string)
	// }
	return "null", 0, ""

}

func KirimKodePesan(noWhatsapp, pesan, kode, token string, kedalaman int, lokasi string) {

	// requestbody := []byte(`{"kedalaman" : `+kedalaman+`,"kode" : "`+kode+`","noWhatsapp":"`+noWhatsapp+`","tokenW":"`+waktu+`"}`)

	// res,err1:=http.NewRequest("PUT","https://coba-tes123-default-rtdb.firebaseio.com/smsTerakhir/"+noWhatsapp+".json",bytes.NewBuffer(requestbody))
	// res.Header.Set("Content-Type", "application/json")

	// if err1 != nil {
	// 	fmt.Println("Error:", err1)

	// 	return
	// }
	// // res.Header.Set("Content-Type", "application/json")

	// // Membuat klien HTTP dan menjalankan request
	// cln := &http.Client{}
	// response2, err := cln.Do(res)
	// if err != nil {
	// 	fmt.Println("Error:", err)
	// 	return
	// }
	// defer response2.Body.Close()

	// // Membaca isi dari response
	// body2 , err2 := io.ReadAll(response2.Body)
	// if err2 != nil {
	// 	fmt.Println("Error:", err1)

	// 	return
	// }
	// fmt.Println("hasill : "+string(body2))

	dt := readJSON(lokasi + "smsTerakhir.json")
	WriteJson(dt, noWhatsapp, kode, token, kedalaman, lokasi+"smsTerakhir.json")
}

func getDataFromsheet(kode, lokasi string) string {

	// 	fmt.Println("getDataFromsheet")
	// 	response, err := http.Get(`https://script.google.com/macros/s/AKfycbwuIlrA9Y2jJKw43DWWfn9EuBYHupF48HFoCDnFapumUOqzWLo7doshzwNc7G_-EAEp-g/exec?whatsapp=62822663531932&metode=get&pesan=ressssdlsadas&kode=`+kode+``)
	// 	if err != nil {
	// 		fmt.Println("Error:", err)

	// 		return "tidak menemukan perintah yang di maksud"
	// 	}
	// 	defer response.Body.Close()

	// 	// Membaca isi dari response
	// 	body, err := io.ReadAll(response.Body)

	// 	if err != nil {
	// 		fmt.Println("Error:", err)

	// 		return "tidak menemukan perintah yang di maksud"
	// 	}

	// 	fmt.Println(string(body))
	// 	if string(body)!="null"{
	// 	// var mp map[string]interface{}
	// 	var response struct {
	// 		Success bool `json:"succes"`
	// 		Data    struct {
	// 			No        int    `json:"no"`
	// 			KodePesan string `json:"KodePesan"`
	// 			IsiPesan  string `json:"IsiPesan"`

	// 		} `json:"data"`
	// 		Message string `json:"message"`
	// 	}

	// err1 := json.Unmarshal(body,&response)
	// fmt.Println("erorrrrrrrrr")
	// fmt.Println(err1)
	// if err1 !=nil{

	// return "tidak menemukan perintah yang di maksud"
	// }
	// // isilagi :=mp["data"]
	// // fmt.Println(mp["data"])
	// // fmt.Println(isilagi)
	// if response.Data.IsiPesan !=""{
	// return response.Data.IsiPesan
	// }
	// // mp["data"].(mapB4a)["IsiPesan"].(string)
	// }
	// return "tidak menemukan perintah yang di maksud"

	fmt.Println("Jalanal")
	fmt.Println(lokasi + "pesanJawabanSatuBaris.json")
	fmt.Println("================================================")
	file, err := os.Open(lokasi + "pesanJawabanSatuBaris.json")
	if err != nil {
		fmt.Println("Error opening file:", err)
		return "Belum Memiliki data pesan balasan"
	}
	defer file.Close()

	// Membuat variabel untuk menyimpan data yang akan dibaca
	// var person Person
	var mp map[string]string
	// Membaca file JSON dan mengkodekannya ke dalam variabel
	decoder := json.NewDecoder(file)
	err = decoder.Decode(&mp)
	if err != nil {
		fmt.Println("Error decoding JSON:", err)
		return "tidak menemukan perintah yang di maksud"
	}

	// fmt.Println("==========================================")
	// fmt.Println("kode : \n" + kode)
	// fmt.Println("isi pesan : \n" + mp[kode])
	// fmt.Println("==========================================")
	if mp[kode] == "" {
		// return mp["terimakasi"]
		return "tidak menemukan perintah yang di maksud"
	}
	return mp[kode]
}
func eventHandler(evt interface{}) {
	switch v := evt.(type) {

	case *events.Message:

		if !v.Info.IsFromMe {

			// handleBot(evt)
			// return
			fmt.Println("=========================================")
			// fmt.Println(v.Message.GetExtendedTextMessage())
			// fmt.Println(v.Message.GetConversation())
			// fmt.Println(v.Info.Chat)
			fmt.Println(v)

			// fmt.Println(v.Message.ExtendedTextMessage.CanonicalUrl)
			fmt.Println("=========================================")

			isipesan := ""
			if v.Message.GetExtendedTextMessage() == nil {
				isipesan = v.Message.GetConversation()

			} else {
				isipesan = *v.Message.GetExtendedTextMessage().Text

			}
			// fmt.Println("========================")
			// // fmt.Println(v.Info.Sender)
			// // var d types.MessageSource

			// // d.Sender.Server="s.whatsapp.net"
			// // d.Sender.User="6282266353193"

			// // fmt.Println("========================")
			// // fmt.Println(d.Sender)

			// fmt.Println("===========atas=============")
			// var t waProto.ExtendedTextMessage
			// t.ContextInfo.QuotedMessage.ExtendedTextMessage.Text  =v.Message.Conversation
			// // t.ContextInfo.QuotedMessage.Conversation = v.Message.ExtendedTextMessage.Text
			// // // t.QuotedMessage.invite = v.Message.ExtendedTextMessage.Text
			// // fmt.Println(v.Message.ContactMessage.ContextInfo.QuotedMessage.Conversation)
			// client.SendMessage(context.Background(),v.Info.Chat,&waProto.Message{
			// 	Conversation: proto.String("Pesan tidak sesaui atau sudah di ubah."),
			// 	ExtendedTextMessage:v.Message.GetExtendedTextMessage(),
			// 	// ContactMessage: t.ContextInfo.QuotedMessage.ContactMessage,

			// 	})

			// 	// if err!=nil {

			// 	// }
			// return

			// fmt.Println(v.Info.Sender)
			// fmt.Println("============atas============")
			if isipesan != "" {

				if strings.Contains(isipesan, "Pastikan nomor Whatsapp ini sama dengan nomor yang kamu gunakan untuk registrasi") {

					psn := strings.Split(isipesan, "\n")

					fmt.Println(len(psn))

					fmt.Println("=======================")
					if len(psn) < 2 {

						client.SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
							Conversation: proto.String("Pesan tidak sesaui atau sudah di ubah."),
						})
						return
					}

					// url := "https://push-9fb38-default-rtdb.firebaseio.com/verifikasi/"+strings.Replace(psn[2],"*","",2)+".json"
					url := "https://kong-rider.firebaseio.com/verifikasi/" + strings.Replace(psn[2], "*", "", 2) + ".json"
					fmt.Println(url)

					// Melakukan HTTP GET request
					response, err := http.Get(url)
					if err != nil {
						fmt.Println("Error:", err)
						client.SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
							Conversation: proto.String("Pesan tidak sesaui atau sudah di ubah."),
						})
						return
					}
					defer response.Body.Close()

					// Membaca isi dari response
					body, err := io.ReadAll(response.Body)
					if err != nil {
						fmt.Println("Error:", err)
						client.SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
							Conversation: proto.String("Pesan tidak sesaui atau sudah di ubah."),
						})
						return
					}
					var mp map[string]interface{}
					err1 := json.Unmarshal(body, &mp)
					fmt.Println("erorrrrrrrrr")
					fmt.Println(err1)
					if err1 != nil {

						return
					}
					if string(body) != "null" {

						if mp["NoHp"].(string) == v.Info.Sender.User {

							// "https://kride.page.link/GCQk"
							requestbody := []byte(`{"status": 1, "NoHp" : "` + v.Info.Sender.User + `"}`)

							res, err1 := http.NewRequest("PUT", "https://kong-rider.firebaseio.com/verifikasi/"+strings.Replace(psn[2], "*", "", 2)+".json", bytes.NewBuffer(requestbody))
							// res,err1:=http.NewRequest("PUT","https://push-9fb38-default-rtdb.firebaseio.com/verifikasi/"+strings.Replace(psn[2],"*","",2)+".json",bytes.NewBuffer(requestbody))

							// fmt.Println("https://push-9fb38-default-rtdb.firebaseio.com/verifikasi/"+strings.Replace(psn[2],"*","",2)+".json")

							if err1 != nil {
								fmt.Println("Error:", err1)
								client.SendMessage(context.Background(), v.Info.Sender, &waProto.Message{
									Conversation: proto.String("Pesan tidak sesaui atau sudah di ubah."),
								})
								return
							}
							// res.Header.Set("Content-Type", "application/json")

							// Membuat klien HTTP dan menjalankan request
							cln := &http.Client{}
							response2, err := cln.Do(res)
							if err != nil {
								fmt.Println("Error:", err)
								return
							}
							defer response2.Body.Close()

							// Membaca isi dari response
							body1, err1 := io.ReadAll(response2.Body)
							if err != nil {
								fmt.Println("Error:", err1)
								client.SendMessage(context.Background(), v.Info.Sender, &waProto.Message{
									Conversation: proto.String("Pesan tidak sesaui atau sudah di ubah."),
								})
								return
							}
							fmt.Println(string(body1))

							if strings.Contains(isipesan, "KongRider") {
								client.SendMessage(context.Background(), v.Info.Sender, &waProto.Message{
									Conversation: proto.String("Verifikasi Berhasil. \n Klik link berikut untuk melanjutkan proses registrasi \n https://kride.page.link/GCQk "),
								})
								return
							} else if strings.Contains(isipesan, "KongPos") {
								client.SendMessage(context.Background(), v.Info.Sender, &waProto.Message{
									Conversation: proto.String("Verifikasi Berhasil. \n Klik link berikut untuk melanjutkan proses registrasi \n https://misterkong.com "),
								})
								return
							} else {

								client.SendMessage(context.Background(), v.Info.Sender, &waProto.Message{
									Conversation: proto.String("Verifikasi Berhasil. \n Klik link berikut untuk melanjutkan proses registrasi \n https://misterkong.com "),
								})
								return
							}

						} else {

							client.SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
								Conversation: proto.String("Pastikan nomor yang anda gunakan di whatsapp sama dengan yang di daftarkan di KongRider."),
								// ExtendedTextMessage: ,
							})
							return
						}

					} else {
						client.SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
							Conversation: proto.String("Kode sudah tidak dapat di gunakan harap melakukan request lagi di aplikasi kongrider"),
						})
						return

					}

				}

			}

		}
	}
}
func otpString(dari string) string {
	// 	randomNumberString := strconv.Itoa(rand.Intn(900000) + 100000)
	// fmt.Println(len(randomNumberString))

	// return randomNumberString
	var randomNumberString string
	if dari == "KONGPOS" {
		randomNumberString = strconv.Itoa(rand.Intn(9000) + 1000)
		if len(randomNumberString) > 4 {
			return randomNumberString[1:]
		} else {

			return randomNumberString
		}

	} else {

		randomNumberString = strconv.Itoa(rand.Intn(900000) + 100000)
		if len(randomNumberString) > 6 {
			return randomNumberString[1:]
		} else {

			return randomNumberString
		}
	}
	//randomNumberString := rand.Intn(900000) + 100000
	//fmt.Println(len(randomNumberString))
	//	fmt.Println("============================================")

}

// func createToken() (string, error) {
// 	// Set informasi yang ingin dimasukkan ke dalam token
// 	token := jwt.New(jwt.SigningMethodHS256)

// 	// Set klaim (claims)
// 	claims := token.Claims.(jwt.MapClaims)
// 	claims["authorized"] = true
// 	claims["client"] = "John Doe"
// 	claims["exp"] = time.Now().Add(time.Hour * 1).Unix() // Token berlaku selama 1 jam

// 	// Tandatangani token dengan kunci rahasia
// 	tokenString, err := token.SignedString(mySigningKey)
// 	if err != nil {
// 		return "", err
// 	}

// 	return tokenString, nil
// }

func WriteJsonUser(dt1 map[string]interface{}, key string, value interface{}) {
	// fmt.Println(key)
	// fmt.Println(value)
	dt1[key] = value
	jsonstring, _ := json.Marshal(dt1)
	os.WriteFile("UserClient.json", jsonstring, os.ModePerm)
}

// package main

// import (
// 	"github.com/tulir/whatsmeow"
// 	"github.com/tulir/whatsmeow/types"
// )

func kirimchat(isipsn, PushNameinfo string, jidno types.JID, cli *whatsmeow.Client) (tokenn string) {

	regex := regexp.MustCompile(`(https?://[^\s]+)`)

	// Menemukan semua URL yang cocok dengan pola regex
	urls := regex.FindAllString(isipsn, -1)
	// fmt.Println("=================kondisi========================")
	// fmt.Println(urls)
	// fmt.Println("=========================================")

	if urls == nil {

		_, err := cli.SendMessage(context.Background(), jidno, &waProto.Message{

			Conversation: proto.String(isipsn),
		})

		if err != nil {

			return
		}
		t, err1 := createToken(PushNameinfo)

		if err1 != nil {
			return
		}
		tokenn = t
	} else {

		title, descripsi, thumbnail := contentFromUrl(urls[0])

		if strings.Contains(urls[0], "misterkong.com") {

			thumbnail, _ = os.ReadFile("misterkong.png")
		}
		_, err := cli.SendMessage(context.Background(), jidno, &waProto.Message{

			ExtendedTextMessage: conversiKeExtended(isipsn, urls[0], title, urls[0], descripsi, "", thumbnail, nil, nil, nil, 0, 1024, 578),
		})

		if err != nil {

			return
		}
		t, err1 := createToken(PushNameinfo)

		if err1 != nil {
			return
		}
		tokenn = t

	}

	fmt.Println("==========cobahasil2==============")

	fmt.Println("========================")
	return tokenn
}

func KirimPesanPrivateOrGroupBotHandler(w http.ResponseWriter, r *http.Request) {
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

	isipesan := mp["isiPesan"].(string)
	kirimKe := mp["tujuan"].([]interface{})
	token := mp["token"].(string)
	if token != "AEtU5bVZ6qQTzCXGlX1daJMRwyUPpGft" {

		helper.ResponseJSON(w, http.StatusUnauthorized, map[string]interface{}{
			"error":   true,
			"message": "Token akses api tidak valid",
		})
		return
	}
	fmt.Println(kirimKe)
	fmt.Println(isipesan)

	dtr := make([]map[string]interface{}, 0)
	ggl := 0
	sks := 0

	for _, value := range kirimKe {
		var notujuan string
		if strings.Contains(value.(string), "@") {

			notujuan = value.(string)
		} else {

			notujuan = helper.ConverNoHp(value.(string)) + "@s.whatsapp.net"
		}
		// fmt.Println(t)
		// fmt.Println(value)
		jids := strings.Split(notujuan, "@")
		jid := types.JID{

			User:   jids[0],
			Server: jids[1],
		}
		fmt.Println(jid)

		// tampungClient[id].SendMessage(context.Background(), jid, conversiKeExtended())
		er := KirimAndCekPesan(isipesan, jid, client)
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
