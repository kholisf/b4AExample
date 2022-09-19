B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private Button1 As Button
	Private ImageView1 As ImageView
	Private lblKamera As Label
	Private Label5 As Label
	Private txtAlamat As EditText
	Private Label4 As Label
	Private btnCobaLagi As Button
'	Private clvJaket As CustomListView
'	Private clvHelm As CustomListView
'	Private CheckBox1 As CheckBox
'	Private CheckBox2 As CheckBox
'	Dim nAwalJaket , nAwalHelm As Int = 0
	Dim etJaket,etHelm As EditText
	Dim limit As IME
	Dim warna As ColorDrawable
	Dim pnlhitam As Panel
	
	Private xImageSliderIG1 As xImageSliderIG
	Private clvInput As CustomListView
	Private cbHelm As CheckBox
	Private cbJaket As CheckBox
	Private txtJaket As EditText
	Private txtHelm As EditText
	Private CustomListView1 As CustomListView
	Private nIndex As Int
	Dim pnl As Panel 
	Dim versi2 As V2
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	
	Root.LoadLayout("l_utama")
	versi2.Initialize
	
	
	B4XPages.AddMenuItem(Me,"Riwayat Pembelian")
	B4XPages.AddMenuItem(Me,"Informasi Harga")
	B4XPages.AddMenuItem(Me,"Informasi website")
	B4XPages.AddPage("v2",versi2)
	Dim p As Panel  = xui.CreatePanel("")
	
'	p.SetLayout(0,0,CustomListView1.AsView.Width,CustomListView1.AsView.Height+200dip)
'	p.SetLayout(0,0,CustomListView1.AsView.Width,btnCobaLagi.Top+btnCobaLagi.Height +2dip)
	p.SetLayout(0,0,Root.Width,Root.Height)
	CustomListView1.Add(p,"")
	p.LoadLayout("l_atributReDesain")
	
'	Log("btnCobaLagi.Top+btnCobaLagi.Height>GetDeviceLayoutValues.Height  " )
	Dim t As Int
	If (btnCobaLagi.Top+btnCobaLagi.Height)>GetDeviceLayoutValues.Height Then
		t=  btnCobaLagi.Top+btnCobaLagi.Height
		Else
		t = GetDeviceLayoutValues.Height
		
		
	End If
	Log(t)
	CustomListView1.GetPanel(CustomListView1.Size-1).Height = t
	CustomListView1.AsView.Height = t
	CustomListView1.sv.Height = t
	CustomListView1.GetPanel(CustomListView1.Size-1).Color = Colors.White
	
	
	
	Log(GetDeviceLayoutValues.Height)
	Log(btnCobaLagi.Top+btnCobaLagi.Height)
'	CustomListView1.GetPanel(CustomListView1.Size-1).SetLayoutAnimated(0,0,0,CustomListView1.AsView.Width,btnCobaLagi.Top+btnCobaLagi.Height)
	
'	CustomListView1.sv.Height = btnCobaLagi.Top+btnCobaLagi.Height
'	CustomListView1.AsView.Height = btnCobaLagi.Top+btnCobaLagi.Height
	
	
	
'	Root.LoadLayout("l_atributReDesain")

	
	
	
	warna.Initialize(Colors.ARGB(150,0,0,0),5dip)
	pnlhitam = xui.CreatePanel("pnlhitam")
	pnlhitam.Background = warna
	Root.AddView(pnlhitam,0,0,Root.Width,Root.Height)
	pnlhitam.SetElevationAnimated(0,5dip)
	pnlhitam.Visible=False
	'load the layout to Root
'	Dim cb As CSBuilder
'	cb.Initialize.Append("Ikuti panduan foto ").
'	cb.Clickable("cs",2).Append("ini").Underline.Color(Colors.Blue).Pop
'	cb.Append(" untuk mempermudah pemilihan ukuran atribut").PopAll
'	
'	cb.EnableClickEvents(Label1)
'Label1.Text = cb
'	limit.Initialize("limit")
	Dim cs As CSBuilder
	cs.Initialize.Size(17).Append("Ikuti panduan foto ")
	cs.Clickable("cs", 1).Color(0xFF00A7FF).Append("ini ").Pop.Pop
	cs.Append("untuk mempermudah pemilihan ukuran atribut").PopAll
	cs.EnableClickEvents(Label1)
	Label1.Text = cs
	setTampilan
	
	
	
End Sub
Private Sub pnlhitam_Click
	pnlhitam.Visible = Not(pnlhitam.Visible)
End Sub
Sub tampilanslideig
	pnlhitam.Visible=True
	Dim pnlTampung As Panel = xui.CreatePanel("")
	
	pnlTampung.LoadLayout("l_igSlide")
'	Dim col As ColorDrawable
'	col.Initialize(xui.Color_White,10dip)
'	pnlTampung.Background =col
'	xImageSliderIG1.
	Dim sc As SliderContainer
Dim sliders As List	
sliders.Initialize
	sc.Initialize
	sc.slider = xImageSliderIG1
	
	sc.slider.ActivityHasActionBar = True
	sc.items.Initialize
			
'			For j=0 To 10
'	sc.items.Add(CreateMap("data":"Item 1-"&1, "video":"https://media.w3.org/2010/05/sintel/trailer.mp4", "type":"uri"))
'	sc.items.Add(CreateMap("data":"Item 1-"&4, "video":"https://www.youtube.com/watch?v=qoq8B8ThgEM&list=RDMMqoq8B8ThgEM&start_radio=1", "type":"uri"))
	sc.items.Add(CreateMap("data":"Item 1-"&2, "image":LoadBitmap(File.DirAssets,"ukuranhelm.jpg")))
	sc.items.Add(CreateMap("data":"Item 1-"&3, "image":LoadBitmap(File.DirAssets,"ukuranjaketcrop.jpg")))
'	sc.items.Add(CreateMap("data":"Item 1-"&4, "image":"https://cdn.pixabay.com/photo/2015/07/06/13/58/arlberg-pass-833326__340.jpg"))
'			Next
	
	sc.slider.setitems(sc.items)
	sc.slider.SetZoomPanel(Root)
			
	sliders.Add(sc)
	
	pnlhitam.AddView(pnlTampung,20dip,20dip,pnlhitam.Width-40dip,pnlhitam.Height-40dip)
End Sub




Sub cs_Click (Tag As Object)
	tampilanslideig
	Log($"You have clicked on word: ${Tag}"$)
	
	
	
	
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub clvInput_ItemLongClick (index As Int, Value As Object)
	createOption(Root,index)
End Sub
Private Sub clvHelm_ItemLongClick (index As Int, Value As Object)
	Log("clvHelm_ItemLongClick")
End Sub

Private Sub clvJaket_ItemLongClick (index As Int, Value As Object)
	Log("clvJaket_ItemLongClick")
End Sub

Private Sub btnCobaLagi_Click
	
End Sub

Private Sub Button1_Click
	B4XPages.ShowPage("v2")
End Sub
Private Sub lblclose_Click
	If clvInput.Size>0 Then
	clvInput.RemoveAt(clvInput.Size-1)
	nIndex =nIndex-1
	End If
End Sub
Sub setclv(clv As CustomListView,edittext As String,nawal As Int) As Int
	Dim pnlTampung As Panel
'	 = xui.CreatePanel("pnlTampung")
	pnlTampung.Initialize("pnlTampung")
	pnlTampung.LoadLayout("l_InputDataAtribut")
	pnlTampung.As(B4XView).SetColorAndBorder(Colors.White,2dip,Colors.Black,10dip)
	
	pnlTampung.SetLayout(2dip,2dip,clv.AsView.Width/2,clv.AsView.Height)
'	Dim lblclose As Label
'	lblclose.Initialize("lblclose")
'	lblclose.Typeface = Typeface.FONTAWESOME
'	lblclose.Text = Chr(0xF2D4)
''	lblclose.Text = Chr(0xF00D)
'	lblclose.TextSize = 20
'	lblclose.textcolor = xui.Color_Red

'	pnlTampung.AddView(lblclose.As(View),clv.AsView.Width/2-22dip,3dip,40dip,40dip)
''	pnlTampung.AddView(lblclose.As(View),clv.AsView.Width/2-18dip,0,40dip,40dip)
	
	Label1.Text =$"Pilih Ukuran Atribut ${nawal+1} :"$
	clv.Add(pnlTampung,"")
	txtJaket.Width = pnlTampung.Width -23dip
	txtHelm.Width = pnlTampung.Width -23dip
'	Dim pnlTampung As Panel 
'	pnlTampung.Initialize("pnlTampung")
'	Dim edittext1 As EditText
''	etJaket.Initialize("etJaket")
'	edittext1.Initialize(edittext)
''	etJaket.Hint = "ex:Xl,L,M,N"
'edittext1.Width = 58dip
'limit.SetLengthFilter(edittext1,4)
'
'	edittext1.Hint = nawal+1
'	edittext1.Gravity = Bit.Or(Gravity.CENTER_VERTICAL, Gravity.CENTER_HORIZONTAL)
''edittext1.
''	edittext1.Padding = Array As Int (15dip, 0,0, 0)
'	
'	edittext1.Color = Colors.White
''	edittext1.
'	pnlTampung.SetLayout(0,0,70dip,clv.AsView.Height)
''	clv.GetPanel(clv.Size -1).AddView(edittext,2dip,2dip,70dip,clv.AsView.Height -4dip)
''	Log	("edittext.Parent  "&edittext.Parent =  Null)
'	pnlTampung.AddView(edittext1,2dip,2dip,70dip,clv.AsView.Height -4dip)
'	clv.Add(pnlTampung,"")
	
	
	
	
	nawal=nawal+1
	Return nawal
'pnlTampung.RemoveAllViews	
End Sub

Sub setTampilan 
	
	
	nIndex = setclv(clvInput,"etJaket",nIndex)
'	nAwalJaket = setclv(clvJaket,"etJaket",nAwalJaket)
'	nAwalHelm	=setclv(clvHelm,"etHelm",nAwalHelm)
'	
	
	
End Sub

Private Sub Label3_Click
	If clvInput.Size <>1 Then
		
	clvInput.RemoveAt(clvInput.Size-1)
		If nIndex >0 Then	
			nIndex = nIndex -1
		End If
'	
	End If
'	nIndex = setclv(clvInput,"etHelm",nIndex)
End Sub


Private Sub Label2_Click
	
	nIndex = setclv(clvInput,"etJaket",nIndex)
	
End Sub

Private Sub etHelm_TextChanged (Old As String, New As String)
	Log(New)
	If Sender.As(EditText).IsInitialized = True Then
		
			Log	(Sender.As(EditText).IsInitialized&" terinisialisasi")
		Log	("Sender.As(EditText).Text"&Sender.As(EditText).Text)
	End If
	
	
	If New.Length >4 Then	 limit.HideKeyboard
'	Dim tt As EditText
'	tt = Sender
'	If tt.IsInitialized Then
'			Log(etHelm.Text&" etHelm.Text")
'	End If
	If etHelm.IsInitialized Then
	End If
End Sub
Private Sub etJaket_TextChanged (Old As String, New As String)
	Log(New)
End Sub

Private Sub cbJaket_CheckedChange(Checked As Boolean)
	Dim cb As CheckBox
	cb = Sender
	Dim ortu As Panel	  = cb.Parent
	'view ke 3 sama dengan Jaket edittext
	ortu.GetView(3).As(EditText).Visible = Checked
	
	
	If Checked=False Then
		
		ortu.GetView(4).As(EditText).Top =  ortu.GetView(3).Top
		ortu.Height = Label1.Top + txtJaket.Top+txtJaket.Height+2dip
		Else
		ortu.GetView(4).Top = ortu.GetView(3).Top + ortu.GetView(3).Height +2dip
		If ortu.GetView(2).As(CheckBox).Checked =False Then
			ortu.Height = Label1.Top + txtJaket.Top+txtJaket.Height+2dip
			
			Else
		ortu.Height = Label1.Top + txtHelm.Top+txtHelm.Height+2dip
		End If
	End If
	
'	For Each v As View In ortu.GetAllViewsRecursive
'		Log(v)
'	Next
End Sub

Private Sub cbHelm_CheckedChange(Checked As Boolean)
	Dim cb As CheckBox
	cb = Sender
	Dim ortu As Panel	  = cb.Parent
	
	'view ke 4 sama dengan helm edittext
	ortu.GetView(4).As(EditText).Visible = Checked
	
	If Checked = False Then
	ortu.Height = Label1.Top + txtJaket.Top+txtJaket.Height+2dip
Else
	ortu.Height = Label1.Top + txtHelm.Top+txtHelm.Height
			
	End If
	
'	cekkondisi(ortu.GetView(1),ortu.GetView(2),ortu)
'	For Each v As View In ortu.GetAllViewsRecursive
'		Log(v)
'	Next
End Sub


Sub cekkondisi ( ck1 As CheckBox,ck2 As CheckBox,ortu1 As Object)
	If ck1.Checked =False And ck2.Checked = False Then
'		ortu1.
		
	End If
	
	
End Sub

Sub createOption(rute As B4XView,dd As Int)
	Dim cd As ColorDrawable
	Dim lsview As ListView
	lsview.Initialize("lv")
pnl  =xui.CreatePanel("Option")
	cd.Initialize(xui.Color_ARGB(150,0,0,0),0)
	pnl.Background = cd
	
	
	rute.AddView(pnl,0,0,GetDeviceLayoutValues.Width,GetDeviceLayoutValues.Height)
	lsview.AddSingleLine2("Hapus",dd)
	lsview.AddSingleLine2("Simpan",dd)
	lsview.AddSingleLine2("Edit",dd)
	lsview.Padding=Array As Int(30dip,0,0,0)
	Dim cd2 As ColorDrawable
	cd2.Initialize(0xff1E2029,10dip)
	
	lsview.Background  = cd2
	pnl.AddView(lsview,0,GetDeviceLayoutValues.Height - 25%y,GetDeviceLayoutValues.Width,25%y)
	
'	pnl.AddView(
	
'	pnl.setanim
	
	
End Sub

'Private Sub label3_Click
'		clvInput.RemoveAt(clvInput.Size-1)
'		
'		nIndex = nIndex -1
'End Sub
Private Sub lv_ItemClick (Position As Int, Value As Object)
	Log(Position)
	If Position =0 Then
		clvInput.RemoveAt(clvInput.Size-1)
		
		nIndex = nIndex -1
		pnl.Visible=False
	End If
End Sub
Private Sub Option_Click
	
	Dim p As Panel	 = Sender
	p.RemoveAllViews
	p.Visible =False
End Sub
