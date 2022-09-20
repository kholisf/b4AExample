B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11.8
@EndOfDesignText@
'Sub Class_Globals
'	Private Root As B4XView 'ignore
'	Private xui As XUI 'ignore
'	Private Label1 As Label
'	Private Button1 As Button
'	Private ImageView1 As ImageView
'	Private lblKamera As Label
'	Private Label5 As Label
'	Private txtAlamat As EditText
'	Private Label4 As Label
'	Private btnCobaLagi As Button
'	Private txtJaket As EditText
'	Private B4XPlusMinus1 As B4XPlusMinus
'	Private txtHelm As EditText
'	Private B4XPlusMinus2 As B4XPlusMinus
'	Private lblHarga As Label
'	Private lblHarga As Label
'	
'	Dim hJaket ,hHelm ,tjaket,tHelm As Double
'	Dim v3 As v3
'	
'End Sub
'
''You can add more parameters here.
'Public Sub Initialize As Object
'	Return Me
'End Sub
'
''This event will be called once, before the page becomes visible.
'Private Sub B4XPage_Created (Root1 As B4XView)
'	Root = Root1
'	
'	Root.LoadLayout("v2")
''	B4XPages.AddMenuItem(Me,"Riwayat Pembelian")
''	B4XPages.AddMenuItem(Me,"Informasi Harga")
''	B4XPages.AddMenuItem(Me,"Beli Lagi")
'	v3.Initialize
'	B4XPages.AddPage("v3",v3)
'	hJaket = 180000
'	hHelm = 120000
'B4XPlusMinus1.SetNumericRange(1,10,1)
'B4XPlusMinus2.SetNumericRange(1,10,1)
'	'load the layout to Root
'	Dim additem As B4AMenuItem =  B4XPages.AddMenuItem(Me,"Bantuan")
'	additem.Bitmap = FontToBitmap(Chr(0xE88E),True,30,xui.Color_Black)
'	additem.AddToBar  =True
'	
'	tjaket = hJaket
'	tHelm = hHelm
'End Sub
'
'
'Public Sub FontToBitmap (text As String, IsMaterialIcons As Boolean, FontSize As Float, color As Int) As B4XBitmap
'	Dim xui As XUI
'	Dim p As Panel = xui.CreatePanel("")
'	p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)
'	Dim cvs1 As B4XCanvas
'	cvs1.Initialize(p)
'	Dim t As Typeface
'	If IsMaterialIcons Then t = Typeface.MATERIALICONS Else t = Typeface.FONTAWESOME
'	Dim fnt As B4XFont = xui.CreateFont(t, FontSize)
'	Dim r As B4XRect = cvs1.MeasureText(text, fnt)
'	Dim BaseLine As Int = cvs1.TargetRect.CenterY - r.Height / 2 - r.Top
'	cvs1.DrawText(text, cvs1.TargetRect.CenterX, BaseLine, fnt, color, "CENTER")
'	Dim b As B4XBitmap = cvs1.CreateBitmap
'	cvs1.Release
'	Return b
'End Sub
''You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
'
'
'Private Sub B4XPage_MenuClick (Tag As String)
'	Log(Tag)
'End Sub
'
'
'Sub tampilkanRiwayat
'	Dim pnl,pnltampung As  Panel 
'	pnl= xui.CreatePanel("pnl")
'	pnltampung= xui.CreatePanel("pnlTampung")
'	
'	Dim warna As ColorDrawable 
'	warna.Initialize(xui.Color_ARGB(150,0,0,0),0)
'	pnl.Background = warna
'	Root.AddView(pnl,0,0,GetDeviceLayoutValues.Width,GetDeviceLayoutValues.Height)
'	pnl.AddView(pnltampung,5dip,5dip,pnl.Width -10dip,pnl.Height-10dip)
'	pnltampung.LoadLayout("l_utama")
'End Sub
'Sub settotal(htHelm As Double,htJaket As Double)
'	
'	
'	lblHarga.Text = $"Rp.${(htHelm+htJaket).As(String)}"$
'End Sub
'Private Sub B4XPlusMinus2_ValueChanged (Value As Object)
'	Log(Value)
'	 tHelm=hHelm*Value.As(Double)
''	 tHelm= $"Rp.${(hHelm*Value.As(Double)).As(String)}"$
'Log(tHelm)
'settotal(tjaket,tHelm)
'End Sub
'
'Private Sub B4XPlusMinus1_ValueChanged (Value As Object)
'	Log(Value)
'	tjaket = hJaket*Value.As(Double)
'	Log(tjaket)
'settotal(tjaket,tHelm)
'	
'End Sub
'
'Private Sub txtJaket_TextChanged (Old As String, New As String)
'	
''	Dim fl As B4XFloatTextField
''	fl.focu
'End Sub
'private Sub Button1_Click
'	
'	B4XPages.ShowPage("v3")
'	
'End Sub

'Sub Class_Globals
'	Private Root As B4XView 'ignore
'	Private xui As XUI 'ignore
'	Dim versi_4 As v4
'End Sub
'
''You can add more parameters here.
'Public Sub Initialize As Object
'	Return Me
'End Sub
'
''This event will be called once, before the page becomes visible.
'Private Sub B4XPage_Created (Root1 As B4XView)
'	Root = Root1
'	'load the layout to Root
'	Root.LoadLayout("v3")
'	versi_4.Initialize
'	B4XPages.AddPage("v4",versi_4)
'End Sub
'
'
''You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
'
'Private Sub Button1_Click
'	B4XPages.ShowPage("v4")
'End Sub
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private CLVGlob As CustomListView
	Dim pnlhitam,pnlputih,pnltampung As Panel
	Dim warnaTransGelap As ColorDrawable
	Private Label1 As Label
'	Private Label2 As Label
	Private Button1 As Button
	Private ImageView1 As ImageView
	Private lblKamera As Label
	Private btnCobaLagi As Button
	Private clvInput As CustomListView
	Private lban As Label
	Private lbnorek As Label
	Private lblTotalHarga As Label
	Private txtAlamat As EditText
	
	Private ivBarang As ImageView
	Private lblDeskripsi As Label
	Private lblTitle As Label
	Dim dtharga As Map
	Dim bankMap As Map
	Private lblTambah As Label
	Private lblJml As Label
	Private lblMin As Label
	Private lblPlus As Label
	Private ScrollView1 As ScrollView
	Dim nested As CLVNested
	Private Panel1 As Panel
	Private pnltmpclv As Panel
	Dim Dl As B4XDialog
	Private pnl1 As Panel
	Dim pd As Panel 
	Dim dtpembelian As Map
	Private clvDialog As CustomListView
	Private ivBarang2 As ImageView
	Private lblTitle2 As Label
	Private lblDeskripsi2 As Label
	Private Panel12 As Panel
	Private lblTambah2 As Label
	Private lblMin2 As Label
	Private lblJml2 As Label
	Private lblPlus2 As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Dl.Initialize(Root)
	dtpembelian.Initialize
	dtharga.Initialize
	B4XPages.SetTitle(Me,"V2")
	Root.LoadLayout("GlobalBody")
	Dim p As Panel  = xui.CreatePanel("")
	p.SetLayout(0,0,GetDeviceLayoutValues.Width,GetDeviceLayoutValues.Height)
	p.LoadLayout("l_atributRequest")
	p.SetLayout(0,0,GetDeviceLayoutValues.Width,pnl1.Top+pnl1.Height)
	
	CLVGlob.Add(p,"1")
	Dim cb As CSBuilder
	cb.Initialize.Append(Chr(0xF067)).Color(Colors.Black).Alignment("ALIGN_CENTER").Bold.PopAll
	
'	clvInput.AddTextItem("Tambah","tambah")
	Dim tt As Panel =xui.CreatePanel("")
	tt.Color = Colors.White
	Dim lblt As Label
	tt.SetLayout(0,0,clvInput.AsView.Width,40dip)
	lblt.Initialize("lblt")
	lblt.Typeface = Typeface.FONTAWESOME
	lblt.Gravity  = Gravity.CENTER_VERTICAL
	lblt.Color = Colors.White
	lblt.TextColor = Colors.Black
	lblt.Text = cb
	lblt.TextSize = 25
	
	tt.AddView(lblt.As(View),clvInput.AsView.Width / 2-40dip,0,80dip,40dip)
	clvInput.Add(tt,"tambah")
	pd = xui.CreatePanel("pd")
	pd.SetLayout(0,0,GetDeviceLayoutValues.Width - 20dip,400dip)
	pd.LoadLayout("l_t1")

	
	
'	B4XPages.SetTitle(Me,"v2")
'	nested.Initialize(Root)
'	nested.base.LoadLayout("GlobalBody")
'	nested.CLV = CLVGlob
	
'	Dim p0 As Panel = xui.CreatePanel("")
'	Dim lbl As Label
'	lbl.Initialize("lbl")
'	lbl.Padding = Array As Int(18, 11, 18, 11)
'	lbl.TextColor = 0x80000000
'	lbl.Color = 0x80FFC90D
'	lbl.Height=60dip
'	lbl.Width  = GetDeviceLayoutValues.Width
'	Dim cs As CSBuilder
'	cs.Initialize.Size(17).Append("Ikuti panduan foto ")
'	cs.Clickable("cs", 1).Color(0xFF00A7FF).Append("ini ").Bold.Pop.Pop
'	cs.Append("untuk mempermudah pemilihan ukuran atribut").PopAll
'	cs.EnableClickEvents(lbl)
'	lbl.Text = cs
'	p0.SetLayout(0,0,GetDeviceLayoutValues.Width,60dip)
'	p0.AddView(lbl.As(View),0,0,GetDeviceLayoutValues.Width,60dip)
'	CLVGlob.Add(p0,"0")

'	Root.LoadLayout("GlobalBody")
'	For i =0 To 5
'	CLVGlob.AddTextItem($"Ikuti panduan foto untuk mempermudah pemilihan ukuran atribut"$, "")
'	Dim p As Panel = xui.CreatePanel("")
''	p.SetLayout(0,0,GetDeviceLayoutValues.Width,GetDeviceLayoutValues.Height)
'	p.SetLayout(0,0,GetDeviceLayoutValues.Width,260dip)
''	p.SetLayout(0,0,GetDeviceLayoutValues.Width,150dip)
''	Root.LoadLayout("l_atributRequest")
'	p.LoadLayout("l_t1")
''	p.LoadLayout("l_atributRequest")
''	p.SetLayout(0,0,GetDeviceLayoutValues.Width,btnCobaLagi.Top+btnCobaLagi.Height+50dip)
'	p.SetLayout(0,0,GetDeviceLayoutValues.Width,clvInput.AsView.Top+clvInput.AsView.Height+10dip)
'	p.Color = Colors.White
'
'	p.Tag = pnltmpclv
'	''	ScrollView1.Panel.LoadLayout("l_atributRequest")
'	''	ScrollView1.
'	''	ScrollView1.Panel.AddView(p,0,0,GetDeviceLayoutValues.Width,GetDeviceLayoutValues.Height)
'	''	ScrollView1.Height = GetDeviceLayoutValues.Height
'	''	ScrollView1.Panel.As(B4XView).SetColorAndBorder(xui.Color_White,2dip,xui.Color_Black,10dip)
'	CLVGlob.Add(p,"1")
'	''
'	Dim p2 As Panel =xui.CreatePanel("")
'	p2.SetLayout(0,0,GetDeviceLayoutValues.Width,GetDeviceLayoutValues.Height)
'	p2.LoadLayout("l_t2")
'	p2.Color = Colors.White
'	p2.SetLayout(0,0,GetDeviceLayoutValues.Width,btnCobaLagi.Top+btnCobaLagi.Height +10dip)
'	CLVGlob.Add(p2,"2")
''	
'	''	CLVGlob.AddTextItem(2,"")
'	''	CLVGlob.AddTextItem(3,"")
'	''	CLVGlob.AddTextItem(4,"")
'	''	CLVGlob.AddTextItem(5,"")
'	''	CLVGlob.AddTextItem(6,"")
'	''	CLVGlob.Add(p,"2")
'	''	CLVGlob.Add(p,"3")
'	''	Next
'	'
'	'
'	'


	pnlhitam = xui.CreatePanel("pnlhitam")
	pnlhitam.SetLayout(0,0,GetDeviceLayoutValues.Width,GetDeviceLayoutValues.Height)
	warnaTransGelap.Initialize(xui.Color_ARGB(150,0,0,0),0)
	pnlhitam.Background=warnaTransGelap
	ambilBank
	
	
	
	'load the layout to Root
	getdataAtribut
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub txtAlamat_FocusChanged (HasFocus As Boolean)
	
End Sub

'Private Sub clvInput_ItemClick (Index As Int, Value As Object)
'	Log("klik clvinput")
'End Sub

Private Sub btnCobaLagi_Click
	
End Sub

Private Sub lblKamera_Click
	
End Sub

Private Sub Button1_Click
	Dim b2 As v3
	b2.Initialize
	B4XPages.AddPage("v2",b2)
	B4XPages.ShowPage("v2")
	
End Sub

Private Sub Label2_Click
	
End Sub
'Private Sub CLVGlob_ItemClick (Index As Int, Value As Object)
'	Log("test")
'End Sub

Sub getdataAtribut
'	
'	pnltampung = xui.CreatePanel("")
'	pnltampung.LoadLayout("_GlobalListView")
'	
'	
'	
'	
'	pnltampung.SetLayout(2dip,2dip,pnlhitam.Width-4dip,pnlhitam.Height-4dip)
	''	ph1.Color = xui.Color_White
'	
	''	pnlhitam.AddView(ph1,2dip,2dip,pnlhitam.Width-4dip,pnlhitam.Height-4dip)
'	
	''
	Dim hargapost As HttpJob
	hargapost.Initialize("",Me)
	hargapost.PostString("https://misterkong.com/kong_api/api_rider/list",$"imei=${Main.IMEI}"$)
'	clvInput.AsView.Width = pnlhitam.Width-4dip
'	clvInput.AsView.Height= .Height-4dip
	
'	clvInput.sv.Width = clvInput.AsView.Width-4dip
'	clvInput.sv.Height= clvInput.AsView.Height-4dip
	Wait For (hargapost)JobDone(job As HttpJob)
	If job.Success Then
		Log	(job.GetString)
		Dim jp As JSONParser
		Dim ls As List
		jp.Initialize(job.GetString)
		ls = jp.NextObject.Get("data").As(List)
		
		Log("att"&ls.Get(0).As(Map).Get("id"))
		Log("att"&ls.Get(1).As(Map).Get("id"))
		Log("att"&ls.Get(2).As(Map).Get("id"))
		Dim tl As Int =1
		For Each ii As Map In ls
			
			dtharga = CreateMap("att"&tl:ii)
			tl = tl +1
		Next
		
		
'		dtHarga=CreateMap("att"&ls.Get(0).As(Map).Get("id"):ls.Get(0) _
'		,"att"&ls.Get(1).As(Map).Get("id"):ls.Get(1) _
'		,"att"&ls.Get(2).As(Map).Get("id"):ls.Get(2) )
'		hrHelm = dtHarga.Get("att1").As(Map).Get("harga_jual")
'		hrJaket =  dtHarga.Get("att2").As(Map).Get("harga_jual")
'		Log(dtHarga.Get("att1").As(Map).Get("nama"))
'		Log(dtHarga.Get("att2").As(Map).Get("nama"))
'	
		For Each dt As Map In ls
			Dim ppp As Panel  = xui.CreatePanel("")
			ppp.SetLayout(0,0,clvDialog.AsView.Width,80dip)
			ppp.LoadLayout("l_TemplateAtribut")
			ppp.SetLayout(0,0,clvDialog.AsView.Width,lblDeskripsi.Top+lblDeskripsi.Height)
	
			lblTitle.Text = dt.Get("nama")
			Panel1.Elevation = 10dip
			lblDeskripsi.Text = dt.Get("keterangan")&CRLF&"harga :  Rp."&NumberFormat(dt.get("harga_jual"),0,0)
	Panel1.Tag = dt
			clvDialog.Add(ppp,dt)
		
		
		
		
		Next
		Log(" clvAwal.Size : " &clvInput.Size)
'		"satuan_driver_attr_id": "1",
		Log(dtharga)
		'Log(dtHarga.Get("att1"))
		'Log(dtHarga.Get("att0"))
		'Log(dtHarga.Get("att2"))
	End If
	
'	Dim hargapost As HttpJob
'	hargapost.Initialize("",Me)
'	hargapost.PostString(GlobalParam.APIRIDER&"list",$"imei=${MainUtama.IMEI}"$)
'	Wait For (hargapost)JobDone(job As HttpJob)
'	If job.Success Then
'		Log	(job.GetString)
'		Dim jp As JSONParser
'		Dim ls As List
'		jp.Initialize(job.GetString)
'		ls = jp.NextObject.Get("data").As(List)
'		
'		Log("att"&ls.Get(0).As(Map).Get("satuan_driver_attr_id"))
'		Log("att"&ls.Get(1).As(Map).Get("satuan_driver_attr_id"))
'		Log("att"&ls.Get(2).As(Map).Get("satuan_driver_attr_id"))
'		dtHarga=CreateMap("att"&ls.Get(0).As(Map).Get("satuan_driver_attr_id"):ls.Get(0) _
'		,"att"&ls.Get(1).As(Map).Get("satuan_driver_attr_id"):ls.Get(1) _
'		,"att"&ls.Get(2).As(Map).Get("satuan_driver_attr_id"):ls.Get(2) )
'		hrHelm = dtHarga.Get("att1").As(Map).Get("harga_jual")
'		hrJaket =  dtHarga.Get("att2").As(Map).Get("harga_jual")
'		Log(dtHarga.Get("att1").As(Map).Get("nama"))
'		Log(dtHarga.Get("att2").As(Map).Get("nama"))
'	
'		For Each dt As Map In ls
'			Dim ppp As Panel  = xui.CreatePanel("")
'			ppp.LoadLayout("l_TemplateAtribut")
'	
'	
'			lblTitle.Text = dt.Get("nama") &" Rp."&NumberFormat(dt.get("harga_jual"),0,0)
'	
'			lblDeskripsi.Text = dt.Get("keterangan")
'	
'			ppp.SetLayout(0,0,clvAwal.AsView.Width,200dip)
'			clvAwal.Add(ppp,dt)
'		
'		
'		Next
'		Log(" clvAwal.Size : " &clvAwal.Size)
	''		"satuan_driver_attr_id": "1",
'		Log(dtHarga)
'		'Log(dtHarga.Get("att1"))
'		'Log(dtHarga.Get("att0"))
'		'Log(dtHarga.Get("att2"))
'	End If
'	
	
End Sub
'
'Private Sub clvAwal_ItemClick (Index As Int, Value As Object)
'	If clvInput.Size>0 Then
'		For i =0 To clvInput.Size-1
'			If clvInput.GetValue(i) =  Value Then
'				
'				Log("i  ke - " &i)
''				Log("clvInput.GetPanel(i).GetView(0).text =" &clvInput.GetPanel(i).GetView(0).Text)
'				Log("clvInput.GetPanel(i).GetView(0).Tag =" &clvInput.GetPanel(i).GetView(1).Text)
'				Log("clvInput.GetPanel(i).GetView(1).Tag =" &clvInput.GetPanel(i).GetView(1).Tag)
'				clvInput.GetPanel(i).GetView(1).Tag = (clvInput.GetPanel(i).GetView(1).Tag.As(Int) +1)
''				Dim sb As CSBuilder
''				sb.Initialize
''				
''				sb.Append(Value.As(Map).Get("nama")).Alignment("ALIGN_NORMAL").Pop.Pop
''				sb.Append("X" &(clvInput.GetPanel(i).GetView(1).Tag)).Alignment("ALIGN_OPPOSITE").PopAll
''				
''				clvInput.GetPanel(i).GetView(1).Text =sb.ToString
'				clvInput.GetPanel(i).GetView(1).Text =Value.As(Map).Get("nama")
'				clvInput.GetPanel(i).GetView(4).Text ="X"&clvInput.GetPanel(i).GetView(1).Tag
''				 &"      X" &(clvInput.GetPanel(i).GetView(1).Tag)
''				clvInput.GetPanel(i).GetView(1).Text =Value.As(Map).Get("nama") &"      X" &(clvInput.GetPanel(i).GetView(1).Tag)
'				
'				pnlhitam.Visible=False
'				hargaTotal = hargaTotal+Value.As(Map).Get("harga_jual").As(Int)
'				
'				lblTotalHarga.Text = $"Rp. ${NumberFormat(hargaTotal,0,0)}"$
''				For Each iii As View In clvInput.GetPanel(i).GetAllViewsRecursive
''					If iii Is Label Then 
''						Log(iii.As(Label).Text)
''						
''					End If
''					Log(iii)
''				Next
'				Return
'			End If
'			
'		Next
'		tambahdatabarang(Value.As(Map).Get("nama"),Value.As(Map).Get("keterangan"),Value.As(Map).Get("harga_jual").As(Int),Value,"X" &1)
''		tambahdatabarang(Value.As(Map).Get("nama")&"      X" &1,Value.As(Map).Get("keterangan"),Value.As(Map).Get("harga_jual").As(Int),Value)
'	Else
'		tambahdatabarang(Value.As(Map).Get("nama"),Value.As(Map).Get("keterangan"),Value.As(Map).Get("harga_jual").As(Int),Value,"X" &1)
''		tambahdatabarang(Value.As(Map).Get("nama")&"      X" &1,Value.As(Map).Get("keterangan"),Value.As(Map).Get("harga_jual").As(Int),Value)
'		
'	End If
'	
'	pnlhitam.Visible=False
'End Sub


private Sub ambilBank
	Try
'		cbBankTujuan..
		bankMap.Initialize
		Dim getBank As HttpJob
		Dim jParser As JSONParser
	
		getBank.Initialize("",Me)
		getBank.PostString("https://misterkong.com/kajek/services/_getBank.php","")
		Wait For (getBank) JobDone (job As HttpJob)
		If job.Success=True Then
'		Log(job.GetString)
		
			jParser.Initialize(job.GetString)
			Dim ls As List = jParser.NextArray
			For Each hs As Map In ls
'			If cbBankTujuan.IsInitialized=True Then
'					cbBankTujuan.cmbBox.Add(hs.Get("nama_bank"))
'			End If
				bankMap.Put(hs.Get("nama_bank"),Array As String(hs.Get("kd_bank_kong"),hs.Get("no_rekening"),hs.Get("nama_bank"),hs.Get("atas_nama")))
			Next
		End If
		job.Release
	
		Dim tmp () As String = bankMap.get("BCA")
		Log(tmp(0))
		Log(tmp(1))
		lbnorek.Text = tmp(1)
		lban.Text = tmp(3)
		
		Log(tmp(2))
		Log(tmp(3))
'	bankSelected=bankMap.Get("BCA")
	Catch
		Log(LastException)
	End Try
'	Dim b As BClipboard
'	b.getText
End Sub


Private Sub lblPlus_Click
	Dim lblt As Label  = Sender
	lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Parent.As(B4XView).GetView(2).Tag.As(Int)+1
	lblt.Parent.As(B4XView).GetView(2).Text = lblt.Parent.As(B4XView).GetView(2).Tag
End Sub

Private Sub lblMin_Click
	Dim lblt As Label  = Sender
	lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Parent.As(B4XView).GetView(2).Tag.As(Int)-1
	lblt.Parent.As(B4XView).GetView(2).Text = lblt.Parent.As(B4XView).GetView(2).Tag
	If lblt.Parent.As(B4XView).GetView(2).Tag.As(Int) = 0 Then
		lblt.Parent.As(B4XView).GetView(1).Visible=False
		lblt.Parent.As(B4XView).GetView(2).Visible=False
		lblt.Parent.As(B4XView).GetView(3).Visible=False
		lblt.Parent.As(B4XView).GetView(0).Visible=True
		
		
	End If
End Sub

'Private Sub lblJml_Click
'	
'End Sub

Private Sub lblTambah_Click
	Log("Klik")
	Dim lblt As Label = Sender
	lblt.Visible = False
	lblt.Parent.As(B4XView).GetView(1).Visible=True
	lblt.Parent.As(B4XView).GetView(2).Visible=True
	lblt.Parent.As(B4XView).GetView(3).Visible=True
	lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Parent.As(B4XView).GetView(2).Tag.As(Int)+1
	lblt.Parent.As(B4XView).GetView(2).Text = lblt.Parent.As(B4XView).GetView(2).Tag
	
'	lblPlus.Visible=True
'	lblMin.Visible=True
'	lblJml.Visible = True
'	lblJml.Tag = lblJml.Tag.As(Int)+1)
'	lblJml.Tag = 
End Sub

Private Sub ivBarang_LongClick
	
End Sub

Private Sub ivBarang_Click
	Log("ivBarang_Click")
End Sub

Private Sub clvInput_ItemClick (index As Int, Value As Object)
	Log($"${index } As Int, ${ Value } As Object"$)
'	
'	
'	Dim obj As  Object=Dl.ShowCustom(pd,"Simpan","Batal","")
'					
'	Wait For(obj)Complete(result As Int)
'					
'	If result=-1 Then
'		
'	End If
	
End Sub
Private Sub lblt_Click
	
	
	Dim obj As  Object=Dl.ShowCustom(pd,"Simpan","Batal","")
					
	Wait For(obj)Complete(result As Int)
					
	Log($"result ${result}"$)
	If result=-1 Then
	For i  = 0 To 	clvDialog.Size	-1
			Dim tmpp As Panel = clvDialog.GetPanel(i).GetView(3)
			Log (tmpp.Tag)
'			Log (tmpp.)
			Log	("data ke - "&i&" " &tmpp.GetView(2).Tag )
			If tmpp.GetView(2).Tag >0 Then
				If clvInput.Size>0 Then
					
				For t = 0 To clvInput.Size-1
					Log("i : "&i)
					Log("T : "&t)
					Log(clvInput.GetValue (t))
					Log(tmpp.Tag)
				If clvInput.GetValue (t) = tmpp.Tag Then
					Log("value sama")
						AddToCLVInput(tmpp.Tag,tmpp.GetView(2).Tag)
					clvInput.GetPanel(t).GetView(3).GetView(2).Tag = clvInput.GetPanel(t).GetView(3).GetView(2).Tag +tmpp.GetView(2).Tag
					clvInput.GetPanel(t).GetView(3).GetView(2).Text = clvInput.GetPanel(t).GetView(3).GetView(2).Tag.As(String)
					Else
						
				End If
'				Dim p As Panel=clvDialog.GetPanel(i)
				Next
				Else
						AddToCLVInput(tmpp.Tag,tmpp.GetView(2).Tag)
					
					
				End If
'				
				
'				clvInput.InsertAt(clvInput.Size - 1,clvDialog.GetPanel(i),tmpp.Tag)
				
			End If
'		For Each v As B4XView In clvDialog.GetPanel(i).GetAllViewsRecursive
'			Log(v)
'		Next
	Next
	End If
	
End Sub

Sub AddToCLVInput (dt As Map,jumlah As Int)
	
	Dim pnl As Panel =xui.CreatePanel("pnl")
	pnl.SetLayout(0,0,clvInput.AsView.Width,130dip)
	pnl.LoadLayout("l_tampilanatrribut2")
	
	lblTitle2.Text = dt.Get("nama")
	Panel12.Elevation = 10dip
	lblDeskripsi2.Text = dt.Get("keterangan")&CRLF&"harga :  Rp."&NumberFormat(dt.get("harga_jual"),0,0)
	lblJml2.Text = jumlah
	lblJml2.Tag = jumlah
	pnl.SetLayout(0,0,clvInput.AsView.Width,Panel12.Top+Panel12.Height)
	clvInput.InsertAt(clvInput.Size - 1,pnl,dt)
'	clvInput.InsertAt(clvInput.Size - 1,pn,dt)
	clvInput.AsView.Height = 	clvInput.AsView.Height+130dip
	clvInput.sv.Height = 	clvInput.AsView.Height+130dip
	pnl1.Top = clvInput.AsView.top	+clvInput.AsView.Height
'	CLVGlob.GetPanel.
'	CLVGlob.GetPanel(0).Height=CLVGlob.GetPanel(0).Height+130dip
	CLVGlob.ResizeItem(0,pnl1.Top+pnl1.Height)
'	CLVGlob.sv.Height= GetDeviceLayoutValues.Height
'	CLVGlob.
'	CLVGlob.AsView.Height = CLVGlob.AsView.Height+130dip
	
	
	
	
	
End Sub
