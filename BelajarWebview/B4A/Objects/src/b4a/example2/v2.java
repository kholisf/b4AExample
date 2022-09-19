package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class v2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example2.v2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example2.v2.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblkamera = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtalamat = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncobalagi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtjaket = null;
public b4a.example2.b4xplusminus _b4xplusminus1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txthelm = null;
public b4a.example2.b4xplusminus _b4xplusminus2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblharga = null;
public double _hjaket = 0;
public double _hhelm = 0;
public double _tjaket = 0;
public double _thelm = 0;
public b4a.example2.v3 _v3 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example2.main _main = null;
public b4a.example2.starter _starter = null;
public b4a.example2.b4xpages _b4xpages = null;
public b4a.example2.b4xcollections _b4xcollections = null;
public b4a.example2.httputils2service _httputils2service = null;
public b4a.example2.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
b4a.example2.b4xpagesmanager._b4amenuitem _additem = null;
 //BA.debugLineNum = 30;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 31;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 33;BA.debugLine="Root.LoadLayout(\"v2\")";
_root.LoadLayout("v2",ba);
 //BA.debugLineNum = 37;BA.debugLine="v3.Initialize";
_v3._initialize /*Object*/ (ba);
 //BA.debugLineNum = 38;BA.debugLine="B4XPages.AddPage(\"v3\",v3)";
_b4xpages._addpage /*String*/ (ba,"v3",(Object)(_v3));
 //BA.debugLineNum = 39;BA.debugLine="hJaket = 180000";
_hjaket = 180000;
 //BA.debugLineNum = 40;BA.debugLine="hHelm = 120000";
_hhelm = 120000;
 //BA.debugLineNum = 41;BA.debugLine="B4XPlusMinus1.SetNumericRange(1,10,1)";
_b4xplusminus1._setnumericrange /*String*/ (1,10,1);
 //BA.debugLineNum = 42;BA.debugLine="B4XPlusMinus2.SetNumericRange(1,10,1)";
_b4xplusminus2._setnumericrange /*String*/ (1,10,1);
 //BA.debugLineNum = 44;BA.debugLine="Dim additem As B4AMenuItem =  B4XPages.AddMenuIte";
_additem = _b4xpages._addmenuitem /*b4a.example2.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Bantuan"));
 //BA.debugLineNum = 45;BA.debugLine="additem.Bitmap = FontToBitmap(Chr(0xE88E),True,30";
_additem.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _fonttobitmap(BA.ObjectToString(__c.Chr(((int)0xe88e))),__c.True,(float) (30),_xui.Color_Black);
 //BA.debugLineNum = 46;BA.debugLine="additem.AddToBar  =True";
_additem.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 48;BA.debugLine="tjaket = hJaket";
_tjaket = _hjaket;
 //BA.debugLineNum = 49;BA.debugLine="tHelm = hHelm";
_thelm = _hhelm;
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Private Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 73;BA.debugLine="Log(Tag)";
__c.LogImpl("12686977",_tag,0);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _b4xplusminus1_valuechanged(Object _value) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Private Sub B4XPlusMinus1_ValueChanged (Value As O";
 //BA.debugLineNum = 103;BA.debugLine="Log(Value)";
__c.LogImpl("12949121",BA.ObjectToString(_value),0);
 //BA.debugLineNum = 104;BA.debugLine="tjaket = hJaket*Value.As(Double)";
_tjaket = _hjaket*((double)(BA.ObjectToNumber(_value)));
 //BA.debugLineNum = 105;BA.debugLine="Log(tjaket)";
__c.LogImpl("12949123",BA.NumberToString(_tjaket),0);
 //BA.debugLineNum = 106;BA.debugLine="settotal(tjaket,tHelm)";
_settotal(_tjaket,_thelm);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _b4xplusminus2_valuechanged(Object _value) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Private Sub B4XPlusMinus2_ValueChanged (Value As O";
 //BA.debugLineNum = 95;BA.debugLine="Log(Value)";
__c.LogImpl("12883585",BA.ObjectToString(_value),0);
 //BA.debugLineNum = 96;BA.debugLine="tHelm=hHelm*Value.As(Double)";
_thelm = _hhelm*((double)(BA.ObjectToNumber(_value)));
 //BA.debugLineNum = 98;BA.debugLine="Log(tHelm)";
__c.LogImpl("12883588",BA.NumberToString(_thelm),0);
 //BA.debugLineNum = 99;BA.debugLine="settotal(tjaket,tHelm)";
_settotal(_tjaket,_thelm);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="private Sub Button1_Click";
 //BA.debugLineNum = 117;BA.debugLine="B4XPages.ShowPage(\"v3\")";
_b4xpages._showpage /*String*/ (ba,"v3");
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private lblKamera As Label";
_lblkamera = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private txtAlamat As EditText";
_txtalamat = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private btnCobaLagi As Button";
_btncobalagi = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private txtJaket As EditText";
_txtjaket = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private B4XPlusMinus1 As B4XPlusMinus";
_b4xplusminus1 = new b4a.example2.b4xplusminus();
 //BA.debugLineNum = 14;BA.debugLine="Private txtHelm As EditText";
_txthelm = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private B4XPlusMinus2 As B4XPlusMinus";
_b4xplusminus2 = new b4a.example2.b4xplusminus();
 //BA.debugLineNum = 16;BA.debugLine="Private lblHarga As Label";
_lblharga = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private lblHarga As Label";
_lblharga = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim hJaket ,hHelm ,tjaket,tHelm As Double";
_hjaket = 0;
_hhelm = 0;
_tjaket = 0;
_thelm = 0;
 //BA.debugLineNum = 20;BA.debugLine="Dim v3 As v3";
_v3 = new b4a.example2.v3();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _fonttobitmap(String _text,boolean _ismaterialicons,float _fontsize,int _color) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _t = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
 //BA.debugLineNum = 53;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
 //BA.debugLineNum = 54;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 55;BA.debugLine="Dim p As Panel = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 56;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
 //BA.debugLineNum = 57;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 58;BA.debugLine="cvs1.Initialize(p)";
_cvs1.Initialize((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())));
 //BA.debugLineNum = 59;BA.debugLine="Dim t As Typeface";
_t = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 60;BA.debugLine="If IsMaterialIcons Then t = Typeface.MATERIALICON";
if (_ismaterialicons) { 
_t = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getMATERIALICONS()));}
else {
_t = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getFONTAWESOME()));};
 //BA.debugLineNum = 61;BA.debugLine="Dim fnt As B4XFont = xui.CreateFont(t, FontSize)";
_fnt = _xui.CreateFont((android.graphics.Typeface)(_t.getObject()),_fontsize);
 //BA.debugLineNum = 62;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
 //BA.debugLineNum = 63;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
_baseline = (int) (_cvs1.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
 //BA.debugLineNum = 64;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
_cvs1.DrawText(ba,_text,_cvs1.getTargetRect().getCenterX(),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 65;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _cvs1.CreateBitmap();
 //BA.debugLineNum = 66;BA.debugLine="cvs1.Release";
_cvs1.Release();
 //BA.debugLineNum = 67;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public String  _settotal(double _hthelm,double _htjaket) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub settotal(htHelm As Double,htJaket As Double)";
 //BA.debugLineNum = 92;BA.debugLine="lblHarga.Text = $\"Rp.${(htHelm+htJaket).As(String";
_lblharga.setText(BA.ObjectToCharSequence(("Rp."+__c.SmartStringFormatter("",(Object)((BA.NumberToString((_hthelm+_htjaket)))))+"")));
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _tampilkanriwayat() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.PanelWrapper _pnltampung = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _warna = null;
 //BA.debugLineNum = 77;BA.debugLine="Sub tampilkanRiwayat";
 //BA.debugLineNum = 78;BA.debugLine="Dim pnl,pnltampung As  Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnltampung = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 79;BA.debugLine="pnl= xui.CreatePanel(\"pnl\")";
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"pnl").getObject()));
 //BA.debugLineNum = 80;BA.debugLine="pnltampung= xui.CreatePanel(\"pnlTampung\")";
_pnltampung = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"pnlTampung").getObject()));
 //BA.debugLineNum = 82;BA.debugLine="Dim warna As ColorDrawable";
_warna = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 83;BA.debugLine="warna.Initialize(xui.Color_ARGB(150,0,0,0),0)";
_warna.Initialize(_xui.Color_ARGB((int) (150),(int) (0),(int) (0),(int) (0)),(int) (0));
 //BA.debugLineNum = 84;BA.debugLine="pnl.Background = warna";
_pnl.setBackground((android.graphics.drawable.Drawable)(_warna.getObject()));
 //BA.debugLineNum = 85;BA.debugLine="Root.AddView(pnl,0,0,GetDeviceLayoutValues.Width,";
_root.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
 //BA.debugLineNum = 86;BA.debugLine="pnl.AddView(pnltampung,5dip,5dip,pnl.Width -10dip";
_pnl.AddView((android.view.View)(_pnltampung.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_pnl.getWidth()-__c.DipToCurrent((int) (10))),(int) (_pnl.getHeight()-__c.DipToCurrent((int) (10))));
 //BA.debugLineNum = 87;BA.debugLine="pnltampung.LoadLayout(\"l_utama\")";
_pnltampung.LoadLayout("l_utama",ba);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _txtjaket_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Private Sub txtJaket_TextChanged (Old As String, N";
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
