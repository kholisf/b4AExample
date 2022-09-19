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
	Private Button1 As Button
	Private ImageView1 As ImageView
	Private lblKamera As Label
	Private Label5 As Label
	Private txtAlamat As EditText
	Private Label4 As Label
	Private btnCobaLagi As Button
	Private txtJaket As EditText
	Private B4XPlusMinus1 As B4XPlusMinus
	Private txtHelm As EditText
	Private B4XPlusMinus2 As B4XPlusMinus
	Private lblHarga As Label
	Private lblHarga As Label
	
	Dim hJaket ,hHelm ,tjaket,tHelm As Double
	Dim v3 As v3
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	
	Root.LoadLayout("v2")
'	B4XPages.AddMenuItem(Me,"Riwayat Pembelian")
'	B4XPages.AddMenuItem(Me,"Informasi Harga")
'	B4XPages.AddMenuItem(Me,"Beli Lagi")
	v3.Initialize
	B4XPages.AddPage("v3",v3)
	hJaket = 180000
	hHelm = 120000
B4XPlusMinus1.SetNumericRange(1,10,1)
B4XPlusMinus2.SetNumericRange(1,10,1)
	'load the layout to Root
	Dim additem As B4AMenuItem =  B4XPages.AddMenuItem(Me,"Bantuan")
	additem.Bitmap = FontToBitmap(Chr(0xE88E),True,30,xui.Color_Black)
	additem.AddToBar  =True
	
	tjaket = hJaket
	tHelm = hHelm
End Sub


Public Sub FontToBitmap (text As String, IsMaterialIcons As Boolean, FontSize As Float, color As Int) As B4XBitmap
	Dim xui As XUI
	Dim p As Panel = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)
	Dim cvs1 As B4XCanvas
	cvs1.Initialize(p)
	Dim t As Typeface
	If IsMaterialIcons Then t = Typeface.MATERIALICONS Else t = Typeface.FONTAWESOME
	Dim fnt As B4XFont = xui.CreateFont(t, FontSize)
	Dim r As B4XRect = cvs1.MeasureText(text, fnt)
	Dim BaseLine As Int = cvs1.TargetRect.CenterY - r.Height / 2 - r.Top
	cvs1.DrawText(text, cvs1.TargetRect.CenterX, BaseLine, fnt, color, "CENTER")
	Dim b As B4XBitmap = cvs1.CreateBitmap
	cvs1.Release
	Return b
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Private Sub B4XPage_MenuClick (Tag As String)
	Log(Tag)
End Sub


Sub tampilkanRiwayat
	Dim pnl,pnltampung As  Panel 
	pnl= xui.CreatePanel("pnl")
	pnltampung= xui.CreatePanel("pnlTampung")
	
	Dim warna As ColorDrawable 
	warna.Initialize(xui.Color_ARGB(150,0,0,0),0)
	pnl.Background = warna
	Root.AddView(pnl,0,0,GetDeviceLayoutValues.Width,GetDeviceLayoutValues.Height)
	pnl.AddView(pnltampung,5dip,5dip,pnl.Width -10dip,pnl.Height-10dip)
	pnltampung.LoadLayout("l_utama")
End Sub
Sub settotal(htHelm As Double,htJaket As Double)
	
	
	lblHarga.Text = $"Rp.${(htHelm+htJaket).As(String)}"$
End Sub
Private Sub B4XPlusMinus2_ValueChanged (Value As Object)
	Log(Value)
	 tHelm=hHelm*Value.As(Double)
'	 tHelm= $"Rp.${(hHelm*Value.As(Double)).As(String)}"$
Log(tHelm)
settotal(tjaket,tHelm)
End Sub

Private Sub B4XPlusMinus1_ValueChanged (Value As Object)
	Log(Value)
	tjaket = hJaket*Value.As(Double)
	Log(tjaket)
settotal(tjaket,tHelm)
	
End Sub

Private Sub txtJaket_TextChanged (Old As String, New As String)
	
'	Dim fl As B4XFloatTextField
'	fl.focu
End Sub
private Sub Button1_Click
	
	B4XPages.ShowPage("v3")
	
End Sub