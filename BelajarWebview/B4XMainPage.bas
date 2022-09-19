B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private WebView1 As WebView
	Dim rp As RuntimePermissions
	Dim ccb As cobadesain
	Dim p As Phone
	Dim fl As FileProvider
	Dim mar As MenuAtribut_request
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	ccb.Initialize
	fl.Initialize
	mar.Initialize
	B4XPages.AddPage("coba",ccb)
	B4XPages.AddPage("mar",mar)
	
	
'	WebView1.LoadHtml($"
'	<!DOCTYPE html>
'<html lang="en">
'  <head>
'    <meta charset="UTF-8" />
'    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
'    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
'    <title>Document</title>
'  </head>
'  <body>
'    <div>
'      <video autoplay="true" id="video-webcam">Browsermu tidak mendukung bro, upgrade donk!</video>
'    </div>
'    <script type="text/javascript">
'      // seleksi elemen video
'      var video = document.querySelector("#video-webcam");
'
'      // minta izin user
'      navigator.getUserMedia = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia || navigator.msGetUserMedia || navigator.oGetUserMedia;
'
'      // jika user memberikan izin
'      if (navigator.getUserMedia) {
'        // jalankan fungsi handleVideo, dan videoError jika izin ditolak
'        navigator.getUserMedia({ video: true }, handleVideo, videoError);
'      }
'
'      // fungsi ini akan dieksekusi jika  izin telah diberikan
'      function handleVideo(stream) {
'        video.srcObject = stream;
'      }
'
'      // fungsi ini akan dieksekusi kalau user menolak izin
'      function videoError(e) {
'        // do something
'        alert("Izinkan menggunakan webcam untuk demo!");
'      }
'    </script>
'  </body>
'</html>
'
'	"$)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
'
Private Sub Button1_Click
'	Dim sb_out,sb_err As StringBuilder
'	sb_out.Initialize
'	sb_err.Initialize
'	p.Shell("pm install -k "&xui.FileUri(File.DirAssets,"BelajarWebview.apk"),Null,sb_out,sb_err)
'	MsgboxAsync(sb_out,"Berhasil output")
'	Log(sb_err)
'	
	
'	xui.MsgboxAsync("Hello world!", "B4X")
'	rp.CheckAndRequest(rp.PERMISSION_CAMERA)
'	Wait For B4XPage_PermissionResult (Permission As String, Result As Boolean)
'	Log(Result)
'	Log(Permission)
'Dim inten As Intent

'inten.Initialize(inten.ACTION_VIEW,fl.GetFileUri(
'Try
'	
'Dim jo As JavaObject 
''jo.InitializeArray("oke",Null)
'jo.InitializeContext
''jo.ini
''jo.RunMethod("tes",Array As String("kholis","fikri","coba"))
'
''jo.run
'		Log("jo.RunMethod : "&jo.RunMethod("tes",Array As String("kholis","tes1","tes2")))
'Catch
'	Log(LastException)
'End Try

	B4XPages.ShowPage("mar")
End Sub
'


'String tes(String i, String s, String r){
'//coba coba1 = new coba(i,s,r);
'
'
'return "jalan method";
'}