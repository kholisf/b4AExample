package main

import (
	"fmt"
	"regexp"
	"time"
	"waBot/app/controllers/botcontroller"

	// "testing"
	_ "bytes"
	"context"
	_ "encoding/json"
	_ "io"
	"os"
	"os/signal"
	"strings"
	_ "strings"
	"syscall"
	_ "testing"

	_ "github.com/lizebang/qrcode-terminal"
	_ "github.com/mattn/go-sqlite3"

	// "github.com/mymmsc/gox/qrterminal"
	// "github.com/mymmsc/gox/qrterminal"
	// _ "github.com/mymmsc/gox/qrterminal"
	qrPng "github.com/skip2/go-qrcode"
	"go.mau.fi/whatsmeow"
	waProto "go.mau.fi/whatsmeow/proto/waE2E"
	"go.mau.fi/whatsmeow/store"
	"go.mau.fi/whatsmeow/store/sqlstore"
	"go.mau.fi/whatsmeow/types/events"

	// typeWhatmeow "go.mau.fi/whatsmeow/types"
	"go.mau.fi/whatsmeow/types"
	waLog "go.mau.fi/whatsmeow/util/log"
	"google.golang.org/protobuf/proto"
)

var TimerPesan = make(map[string]int)

func KirimPesanDiakhir(nohp string, cli *whatsmeow.Client, jid types.JID, lokasi string) {
	// _, ada := TimerPesan[nohp]
	// fmt.Println("================================", "KirimPesanDiakhir", "================================")

	timm, ada := TimerPesan[nohp]
	if !ada || timm == 0 {

		TimerPesan[nohp] = 30

		for TimerPesan[nohp] > 0 {

			TimerPesan[nohp] = TimerPesan[nohp] - 1
			// fmt.Println("Angka dari ", nohp, " == ", TimerPesan[nohp])
			// fmt.Println("Jumlah ", TimerPesan[nohp])
			time.Sleep(time.Second)
			if TimerPesan[nohp] == 0 {

				psn := getDataFromsheet("terimakasi", lokasi)
				cli.SendMessage(context.Background(), jid, &waProto.Message{Conversation: proto.String(psn)})
			}
		}

	} else {

		TimerPesan[nohp] = 30
	}
}
func Jalanbot(indexKey string) {

	CheckAndMakeFolder("database/" + indexKey)

	// if err != true{

	// 	return
	// }

	// return

	var clientLocal *whatsmeow.Client

	store.DeviceProps.Os = proto.String("MisterKong")

	dbLog := waLog.Stdout("Database", "DEBUG", true)
	// Make sure you add appropriate DB connector imports, e.g. github.com/mattn/go-sqlite3 for SQLite
	container, err := sqlstore.New("sqlite3", `file:./database/`+indexKey+`/db_user_`+indexKey+`.db?_foreign_keys=on`, dbLog)

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

	clientLocal = whatsmeow.NewClient(deviceStore, clientLog)

	clientLocal.AddEventHandler(func(evt interface{}) {
		switch v := evt.(type) {

		case *events.Message:

			// fmt.Println("===========WAKTU==================")
			// fmt.Println(v.Info.Timestamp)
			// fmt.Println(time.Now())
			// fmt.Printf("dtisi[mediaKey].(string) : %T\n", v.Info.Timestamp.UTC())
			perbedaan := time.Now()
			difference := perbedaan.Sub(v.Info.Timestamp)

			if difference.Hours() >= 1 {
				fmt.Println("waktu sudah habnis")
				return
			}

			if v.Info.IsGroup {
				fmt.Println("getJidGroup")
				if v.Message.GetConversation() == "getJidGroup" {

					kirimchat(v.Info.MessageSource.Chat.User, v.Info.PushName, v.Info.Chat, clientLocal)
				} else if v.Message.GetConversation() == "getJidNurl" {
					isip := fmt.Sprint("/kirimPesanCustome?nowhatsapp=", v.Info.MessageSource.Chat.User, "&token=AEtU5bVZ6qQTzCXGlX1daJMRwyUPpGft&isiPesan=untukcobata&isgroup=true")
					kirimchat(isip, v.Info.PushName, v.Info.Chat, clientLocal)
				}

				return
			}
			// fmt.Printf("Hours: %.f\n", difference.Hours())
			// fmt.Printf("Minutes: %.f\n", difference.Minutes())
			// fmt.Printf("Seconds: %.f\n", difference.Seconds())
			// fmt.Printf("Milliseconds: %d\n", difference.Milliseconds())
			// fmt.Println("=============================")
			if !v.Info.IsFromMe {
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

					if isipesan == "menu" {
						// go func() { KirimPesanDiakhir(v.Info.Chat.User) }()
						var tokenn string
						isipsn := getDataFromsheet("0:0", "database/"+indexKey+"/")

						tokenn = kirimchat(isipsn, v.Info.PushName, v.Info.Chat, tampungClient[indexKey])
						KirimKodePesan(v.Info.Sender.User, isipsn, "0:0", tokenn, 0, "database/"+indexKey+"/")
						// KirimKodePesan(v.Info.Sender.User,isipsn,"0:0","0",timeUtc8().Format("2006-01-02 15:04:05"))
						go KirimPesanDiakhir(v.Info.Chat.User, tampungClient[indexKey], v.Info.Chat, "database/"+indexKey+"/") //Ubah
						return
					}
					kode, kedalaman, tokenW := getKodePesan(v.Info.Sender.User, "database/"+indexKey+"/")
					// if kode == "2:1" || kode == "1:1" || kode == "3:1" {
					// 	isipsn := getDataFromsheet("terimakasi", "database/"+indexKey+"/")
					// 	kirimchat(isipsn, v.Info.PushName, v.Info.Chat, tampungClient[indexKey])
					// 	KirimKodePesan(v.Info.Sender.User, "chatMode", "*", "tokenn", 0, "database/"+indexKey+"/")
					// 	return
					// } else if kode == "*" {

					// 	return

					// }
					if kode == "*" {

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
							tampungClient[indexKey].SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
								Conversation: proto.String("Perintah sudah tidak berlaku, Silahkan ulangi perintah dari awal"),
							})

						}
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
						// tampungClient[indexKey].SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
						// 	Conversation: proto.String("Tidak menemukan perintah yang di maksud"),
						// })

						KirimKodePesan(v.Info.Sender.User, "chatMode", "*", "tokenn", 0, "database/"+indexKey+"/")
						go KirimPesanDiakhir(v.Info.Chat.User, tampungClient[indexKey], v.Info.Chat, "database/"+indexKey+"/") //Ubah
						return
					}

					if kode == "null" {

						return
					}

					if kode == "0:0" {
						newKode := isipesan + kode[1:3]
						fmt.Println(newKode + " : baru")
						isipsn := getDataFromsheet(newKode, "database/"+indexKey+"/")
						tkn := kirimchat(isipsn, v.Info.PushName, v.Info.Chat, tampungClient[indexKey])
						// _,err :=client.SendMessage(context.Background(),v.Info.Chat,&waProto.Message{
						// 	Conversation: proto.String(isipsn),
						// 	})
						// 	if err !=nil {

						// 		return
						// 	}
						if isipsn != "tidak menemukan perintah yang di maksud" {
							// fmt.Println("jalanaaa")
							// tkn ,_:=createToken(v.Info.PushName)
							KirimKodePesan(v.Info.Sender.User, isipsn, newKode, tkn, kedalaman+1, "database/"+indexKey+"/")
						}
						go KirimPesanDiakhir(v.Info.Chat.User, tampungClient[indexKey], v.Info.Chat, "database/"+indexKey+"/") //Ubah
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
						isipsn := getDataFromsheet(newKode, "database/"+indexKey+"/")

						tkn := kirimchat(isipsn, v.Info.PushName, v.Info.Chat, tampungClient[indexKey])
						// _,err :=client.SendMessage(context.Background(),v.Info.Chat,&waProto.Message{
						// 	Conversation: proto.String(isipsn),
						// 	})
						// 	if err !=nil {

						// 		tkn ,_:=createToken(v.Info.PushName)
						// 		return
						// 	}
						if isipsn != "tidak menemukan perintah yang di maksud" {
							KirimKodePesan(v.Info.Sender.User, isipsn, newKode, tkn, kedalaman+1, "database/"+indexKey+"/")
						}
						go KirimPesanDiakhir(v.Info.Chat.User, tampungClient[indexKey], v.Info.Chat, "database/"+indexKey+"/") //Ubah
						return
					}

				}

			}
		}
	})
	// clientLocal.AddEventHandler(func(evt interface{}) {
	// 	switch v := evt.(type) {

	// 	case *events.Message:

	// 		if !v.Info.IsFromMe {
	// 			fmt.Println("=============================")
	// 			fmt.Println(v.Message)
	// 			fmt.Println(indexKey)
	// 			fmt.Println("=============================")
	// 			isipesan := ""
	// 			if v.Message.GetExtendedTextMessage() != nil {
	// 				isipesan = *v.Message.GetExtendedTextMessage().Text

	// 			} else if v.Message.GetImageMessage() != nil {

	// 				isipesan = v.Message.ImageMessage.GetCaption()
	// 			} else {
	// 				isipesan = v.Message.GetConversation()

	// 			}

	// 			// fmt.Println(v.Message.ExtendedTextMessage)
	// 			// tes :=readJSON2("UserClient.json")

	// 			// fmt.Printf("======================tesss aksdjakjsd : %T\n",tes["tes1"].(map[string]interface{})["text"])
	// 			// dtisi := tes["tes1"].(map[string]interface{})
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["text"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["matchedText"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["canonicalUrl"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["title"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["description"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["jpegThumbnail"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["thumbnailDirectPath"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["mediaKey"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["thumbnailEncSha256"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["thumbnailSha256"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["thumbnailHeight"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["thumbnailWidth"])
	// 			// fmt.Printf("dtisi[mediaKey].(string) : %T\n",dtisi["previewType"])

	// 			if isipesan != "" {

	// 				if isipesan == "menu" {
	// 					var tokenn string
	// 					// isipsn := getDataFromsheet("0:0","database/"+indexKey+"/")

	// 					tesgabung := []string{"database/", indexKey, "/"}
	// 					isipsn := getDataFromsheet("0:0", strings.Join(tesgabung, ""))

	// 					tokenn = kirimchat(isipsn, v.Info.PushName, v.Info.Chat, tampungClient[indexKey])
	// 					KirimKodePesan(v.Info.Sender.User, isipsn, "0:0", tokenn, 0, "database/"+indexKey+"/")
	// 					// KirimKodePesan(v.Info.Sender.User,isipsn,"0:0","0",timeUtc8().Format("2006-01-02 15:04:05"))
	// 					return
	// 				}
	// 				kode, kedalaman, tokenW := getKodePesan(v.Info.Sender.User, "database/"+indexKey+"/")
	// 				if kode == "2:1" || kode == "1:1" || kode == "3:1" {
	// 					tesgabung := []string{"database/", indexKey, "/"}
	// 					isipsn := getDataFromsheet("terimakasi", strings.Join(tesgabung, ""))
	// 					kirimchat(isipsn, v.Info.PushName, v.Info.Chat, tampungClient[indexKey])
	// 					KirimKodePesan(v.Info.Sender.User, "chatMode", "*", "tokenn", 0, "database/"+indexKey+"/")
	// 					return
	// 				} else if kode == "*" {

	// 					return

	// 				}

	// 				// numeric := regexp.MustCompile(`\d`).MatchString(isipesan)
	// 				// if numeric==false && kode =="0:0" {

	// 				// }
	// 				fmt.Printf("token : ")
	// 				fmt.Println(tokenW)
	// 				token, erro := verifyToken(tokenW)
	// 				if erro != nil {
	// 					fmt.Println("Error verifying token:", erro)

	// 					if erro.Error() == "Token is expired" {
	// 						tampungClient[indexKey].SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
	// 							Conversation: proto.String("Perintah sudah tidak berlaku, Silahkan ulangi perintah dari awal"),
	// 						})

	// 					}
	// 					return
	// 				}

	// 				// Token valid
	// 				if token.Valid {
	// 					fmt.Println("Token is valid")
	// 				} else {
	// 					fmt.Println("Token is invalid")
	// 				}

	// 				numeric2 := regexp.MustCompile(`\d`).MatchString(isipesan)

	// 				if numeric2 == false {
	// 					tampungClient[indexKey].SendMessage(context.Background(), v.Info.Chat, &waProto.Message{
	// 						Conversation: proto.String("Tidak menemukan perintah yang di maksud"),
	// 					})

	// 					KirimKodePesan(v.Info.Sender.User, "chatMode", "*", "tokenn", 0, "database/"+indexKey+"/")
	// 					return
	// 				}

	// 				if kode == "null" {

	// 					return
	// 				}

	// 				fmt.Println(kode)

	// 				if kode == "0:0" {
	// 					newKode := isipesan + kode[1:3]
	// 					fmt.Println(newKode + " : baru")
	// 					tesgabung := []string{"database/", indexKey, "/"}
	// 					isipsn := getDataFromsheet(newKode, strings.Join(tesgabung, ""))
	// 					tkn := kirimchat(isipsn, v.Info.PushName, v.Info.Chat, tampungClient[indexKey])
	// 					// _,err :=client.SendMessage(context.Background(),v.Info.Chat,&waProto.Message{
	// 					// 	Conversation: proto.String(isipsn),
	// 					// 	})
	// 					// 	if err !=nil {

	// 					// 		return
	// 					// 	}
	// 					if isipsn != "tidak menemukan perintah yang di maksud" {
	// 						// fmt.Println("jalanaaa")
	// 						// tkn ,_:=createToken(v.Info.PushName)
	// 						KirimKodePesan(v.Info.Sender.User, isipsn, newKode, tkn, kedalaman+1, "database/"+indexKey+"/")
	// 					}

	// 					return
	// 				} else {
	// 					var newKode string
	// 					if strings.Contains(kode, "0") {

	// 						newKode = kode[0:strings.Index(kode, "0")] + isipesan
	// 					} else {
	// 						newKode = kode + ":" + isipesan

	// 					}
	// 					fmt.Println("================================================")
	// 					fmt.Println("newKode : " + newKode)
	// 					fmt.Println("================================================")
	// 					tesgabung := []string{"database/", indexKey, "/"}
	// 					isipsn := getDataFromsheet(newKode, strings.Join(tesgabung, ""))
	// 					var tkn string
	// 					tkn = kirimchat(isipsn, v.Info.PushName, v.Info.Chat, tampungClient[indexKey])
	// 					// _,err :=client.SendMessage(context.Background(),v.Info.Chat,&waProto.Message{
	// 					// 	Conversation: proto.String(isipsn),
	// 					// 	})
	// 					// 	if err !=nil {

	// 					// 		tkn ,_:=createToken(v.Info.PushName)
	// 					// 		return
	// 					// 	}
	// 					if isipsn != "tidak menemukan perintah yang di maksud" {
	// 						KirimKodePesan(v.Info.Sender.User, isipsn, newKode, tkn, kedalaman+1, "database/"+indexKey+"/")
	// 					}
	// 					return
	// 				}

	// 			}

	// 		}
	// 	}

	// })

	if clientLocal.Store.ID == nil {
		// No ID stored, new login

		botcontroller.UbahStatusBot(0, indexKey)
		qrChan, _ := clientLocal.GetQRChannel(context.Background())
		err = clientLocal.Connect()
		if err != nil {
			fmt.Println("erro3")
			panic(err)
		}
		tampungClient[indexKey] = clientLocal
		for evt := range qrChan {
			if evt.Event == "code" {
				// Render the QR code here
				// e.g. qrterminal.GenerateHalfBlock(evt.Code, qrterminal.L, os.Stdout)
				// or just manually `echo 2@... | qrencode -t ansiutf8` in a terminal
				fmt.Println("QR code:", evt.Code)

				// w.Write([]byte(`"kodeQR" :`+evt.Code+``))
				// // haislll,_:=os.OpenFile("tesqr.png" ,os.O_WRONLY|os.O_CREATE,os.ModePerm)
				// qrterminal.Generate(evt.Code, qrterminal.M, os.Stdout)

				// os.WriteFile("qrlogin.txt",[]byte(evt.Code),os.ModePerm)
				qrPng.WriteFile(evt.Code, qrPng.High, 256, `database/`+indexKey+`/qr.png`)
				// os.WriteFile(evt.Code,qrPng.High,256,`database/`+indexKey+`/qr.png`)
				os.WriteFile(`database/`+indexKey+`/kodeqrString.txt`, []byte(evt.Code), os.ModePerm)
				// defer haislll.Close()
			} else {
				fmt.Println("Login event:", evt.Event)
			}
		}
		botcontroller.UbahStatusBot(1, indexKey)
	} else {
		// Already logged in, just connect
		err = clientLocal.Connect()
		// 		dt2 := readJSON("UserClient.json")
		// WriteJsonUser(dt2,"coba1",client)
		// 		fmt.Println("jalan di bawah connectttttttttt")
		tampungClient[indexKey] = clientLocal
		if err != nil {
			fmt.Println("erro5")
			panic(err)
		}
		botcontroller.UbahStatusBot(1, indexKey)
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

	clientLocal.Disconnect()
}
