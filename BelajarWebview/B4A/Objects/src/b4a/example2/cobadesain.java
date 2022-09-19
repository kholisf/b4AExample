package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cobadesain extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example2.cobadesain");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example2.cobadesain.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblkamera = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtalamat = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncobalagi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etjaket = null;
public anywheresoftware.b4a.objects.EditTextWrapper _ethelm = null;
public anywheresoftware.b4a.objects.IME _limit = null;
public anywheresoftware.b4a.objects.drawable.ColorDrawable _warna = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlhitam = null;
public b4a.example2.ximagesliderig _ximagesliderig1 = null;
public b4a.example3.customlistview _clvinput = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbhelm = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbjaket = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtjaket = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txthelm = null;
public b4a.example3.customlistview _customlistview1 = null;
public int _nindex = 0;
public anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
public b4a.example2.v2 _versi2 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example2.main _main = null;
public b4a.example2.starter _starter = null;
public b4a.example2.b4xpages _b4xpages = null;
public b4a.example2.b4xcollections _b4xcollections = null;
public b4a.example2.httputils2service _httputils2service = null;
public b4a.example2.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _t = 0;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
 //BA.debugLineNum = 42;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 43;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 45;BA.debugLine="Root.LoadLayout(\"l_utama\")";
_root.LoadLayout("l_utama",ba);
 //BA.debugLineNum = 46;BA.debugLine="versi2.Initialize";
_versi2._initialize /*Object*/ (ba);
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.AddMenuItem(Me,\"Riwayat Pembelian\")";
_b4xpages._addmenuitem /*b4a.example2.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Riwayat Pembelian"));
 //BA.debugLineNum = 50;BA.debugLine="B4XPages.AddMenuItem(Me,\"Informasi Harga\")";
_b4xpages._addmenuitem /*b4a.example2.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Informasi Harga"));
 //BA.debugLineNum = 51;BA.debugLine="B4XPages.AddMenuItem(Me,\"Informasi website\")";
_b4xpages._addmenuitem /*b4a.example2.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Informasi website"));
 //BA.debugLineNum = 52;BA.debugLine="B4XPages.AddPage(\"v2\",versi2)";
_b4xpages._addpage /*String*/ (ba,"v2",(Object)(_versi2));
 //BA.debugLineNum = 53;BA.debugLine="Dim p As Panel  = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 57;BA.debugLine="p.SetLayout(0,0,Root.Width,Root.Height)";
_p.SetLayout((int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 58;BA.debugLine="CustomListView1.Add(p,\"\")";
_customlistview1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(""));
 //BA.debugLineNum = 59;BA.debugLine="p.LoadLayout(\"l_atributReDesain\")";
_p.LoadLayout("l_atributReDesain",ba);
 //BA.debugLineNum = 62;BA.debugLine="Dim t As Int";
_t = 0;
 //BA.debugLineNum = 63;BA.debugLine="If (btnCobaLagi.Top+btnCobaLagi.Height)>GetDevice";
if ((_btncobalagi.getTop()+_btncobalagi.getHeight())>__c.GetDeviceLayoutValues(ba).Height) { 
 //BA.debugLineNum = 64;BA.debugLine="t=  btnCobaLagi.Top+btnCobaLagi.Height";
_t = (int) (_btncobalagi.getTop()+_btncobalagi.getHeight());
 }else {
 //BA.debugLineNum = 66;BA.debugLine="t = GetDeviceLayoutValues.Height";
_t = __c.GetDeviceLayoutValues(ba).Height;
 };
 //BA.debugLineNum = 70;BA.debugLine="Log(t)";
__c.LogImpl("1983068",BA.NumberToString(_t),0);
 //BA.debugLineNum = 71;BA.debugLine="CustomListView1.GetPanel(CustomListView1.Size-1).";
_customlistview1._getpanel((int) (_customlistview1._getsize()-1)).setHeight(_t);
 //BA.debugLineNum = 72;BA.debugLine="CustomListView1.AsView.Height = t";
_customlistview1._asview().setHeight(_t);
 //BA.debugLineNum = 73;BA.debugLine="CustomListView1.sv.Height = t";
_customlistview1._sv.setHeight(_t);
 //BA.debugLineNum = 74;BA.debugLine="CustomListView1.GetPanel(CustomListView1.Size-1).";
_customlistview1._getpanel((int) (_customlistview1._getsize()-1)).setColor(__c.Colors.White);
 //BA.debugLineNum = 78;BA.debugLine="Log(GetDeviceLayoutValues.Height)";
__c.LogImpl("1983076",BA.NumberToString(__c.GetDeviceLayoutValues(ba).Height),0);
 //BA.debugLineNum = 79;BA.debugLine="Log(btnCobaLagi.Top+btnCobaLagi.Height)";
__c.LogImpl("1983077",BA.NumberToString(_btncobalagi.getTop()+_btncobalagi.getHeight()),0);
 //BA.debugLineNum = 92;BA.debugLine="warna.Initialize(Colors.ARGB(150,0,0,0),5dip)";
_warna.Initialize(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 93;BA.debugLine="pnlhitam = xui.CreatePanel(\"pnlhitam\")";
_pnlhitam = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"pnlhitam").getObject()));
 //BA.debugLineNum = 94;BA.debugLine="pnlhitam.Background = warna";
_pnlhitam.setBackground((android.graphics.drawable.Drawable)(_warna.getObject()));
 //BA.debugLineNum = 95;BA.debugLine="Root.AddView(pnlhitam,0,0,Root.Width,Root.Height)";
_root.AddView((android.view.View)(_pnlhitam.getObject()),(int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 96;BA.debugLine="pnlhitam.SetElevationAnimated(0,5dip)";
_pnlhitam.SetElevationAnimated((int) (0),(float) (__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 97;BA.debugLine="pnlhitam.Visible=False";
_pnlhitam.setVisible(__c.False);
 //BA.debugLineNum = 107;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 108;BA.debugLine="cs.Initialize.Size(17).Append(\"Ikuti panduan foto";
_cs.Initialize().Size((int) (17)).Append(BA.ObjectToCharSequence("Ikuti panduan foto "));
 //BA.debugLineNum = 109;BA.debugLine="cs.Clickable(\"cs\", 1).Color(0xFF00A7FF).Append(\"i";
_cs.Clickable(ba,"cs",(Object)(1)).Color(((int)0xff00a7ff)).Append(BA.ObjectToCharSequence("ini ")).Pop().Pop();
 //BA.debugLineNum = 110;BA.debugLine="cs.Append(\"untuk mempermudah pemilihan ukuran atr";
_cs.Append(BA.ObjectToCharSequence("untuk mempermudah pemilihan ukuran atribut")).PopAll();
 //BA.debugLineNum = 111;BA.debugLine="cs.EnableClickEvents(Label1)";
_cs.EnableClickEvents((android.widget.TextView)(_label1.getObject()));
 //BA.debugLineNum = 112;BA.debugLine="Label1.Text = cs";
_label1.setText(BA.ObjectToCharSequence(_cs.getObject()));
 //BA.debugLineNum = 113;BA.debugLine="setTampilan";
_settampilan();
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _btncobalagi_click() throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Private Sub btnCobaLagi_Click";
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 184;BA.debugLine="B4XPages.ShowPage(\"v2\")";
_b4xpages._showpage /*String*/ (ba,"v2");
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public String  _cbhelm_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cb = null;
anywheresoftware.b4a.objects.PanelWrapper _ortu = null;
 //BA.debugLineNum = 324;BA.debugLine="Private Sub cbHelm_CheckedChange(Checked As Boolea";
 //BA.debugLineNum = 325;BA.debugLine="Dim cb As CheckBox";
_cb = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 326;BA.debugLine="cb = Sender";
_cb = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 327;BA.debugLine="Dim ortu As Panel	  = cb.Parent";
_ortu = new anywheresoftware.b4a.objects.PanelWrapper();
_ortu = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_cb.getParent()));
 //BA.debugLineNum = 330;BA.debugLine="ortu.GetView(4).As(EditText).Visible = Checked";
((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_ortu.GetView((int) (4)).getObject()))).setVisible(_checked);
 //BA.debugLineNum = 332;BA.debugLine="If Checked = False Then";
if (_checked==__c.False) { 
 //BA.debugLineNum = 333;BA.debugLine="ortu.Height = Label1.Top + txtJaket.Top+txtJaket.";
_ortu.setHeight((int) (_label1.getTop()+_txtjaket.getTop()+_txtjaket.getHeight()+__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 335;BA.debugLine="ortu.Height = Label1.Top + txtHelm.Top+txtHelm.He";
_ortu.setHeight((int) (_label1.getTop()+_txthelm.getTop()+_txthelm.getHeight()));
 };
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public String  _cbjaket_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cb = null;
anywheresoftware.b4a.objects.PanelWrapper _ortu = null;
 //BA.debugLineNum = 297;BA.debugLine="Private Sub cbJaket_CheckedChange(Checked As Boole";
 //BA.debugLineNum = 298;BA.debugLine="Dim cb As CheckBox";
_cb = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 299;BA.debugLine="cb = Sender";
_cb = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 300;BA.debugLine="Dim ortu As Panel	  = cb.Parent";
_ortu = new anywheresoftware.b4a.objects.PanelWrapper();
_ortu = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_cb.getParent()));
 //BA.debugLineNum = 302;BA.debugLine="ortu.GetView(3).As(EditText).Visible = Checked";
((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_ortu.GetView((int) (3)).getObject()))).setVisible(_checked);
 //BA.debugLineNum = 305;BA.debugLine="If Checked=False Then";
if (_checked==__c.False) { 
 //BA.debugLineNum = 307;BA.debugLine="ortu.GetView(4).As(EditText).Top =  ortu.GetView";
((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_ortu.GetView((int) (4)).getObject()))).setTop(_ortu.GetView((int) (3)).getTop());
 //BA.debugLineNum = 308;BA.debugLine="ortu.Height = Label1.Top + txtJaket.Top+txtJaket";
_ortu.setHeight((int) (_label1.getTop()+_txtjaket.getTop()+_txtjaket.getHeight()+__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 310;BA.debugLine="ortu.GetView(4).Top = ortu.GetView(3).Top + ortu";
_ortu.GetView((int) (4)).setTop((int) (_ortu.GetView((int) (3)).getTop()+_ortu.GetView((int) (3)).getHeight()+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 311;BA.debugLine="If ortu.GetView(2).As(CheckBox).Checked =False T";
if (((anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(_ortu.GetView((int) (2)).getObject()))).getChecked()==__c.False) { 
 //BA.debugLineNum = 312;BA.debugLine="ortu.Height = Label1.Top + txtJaket.Top+txtJake";
_ortu.setHeight((int) (_label1.getTop()+_txtjaket.getTop()+_txtjaket.getHeight()+__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 315;BA.debugLine="ortu.Height = Label1.Top + txtHelm.Top+txtHelm.H";
_ortu.setHeight((int) (_label1.getTop()+_txthelm.getTop()+_txthelm.getHeight()+__c.DipToCurrent((int) (2))));
 };
 };
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return "";
}
public String  _cekkondisi(anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _ck1,anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _ck2,Object _ortu1) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub cekkondisi ( ck1 As CheckBox,ck2 As CheckBox,o";
 //BA.debugLineNum = 347;BA.debugLine="If ck1.Checked =False And ck2.Checked = False The";
if (_ck1.getChecked()==__c.False && _ck2.getChecked()==__c.False) { 
 };
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 5;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblKamera As Label";
_lblkamera = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private txtAlamat As EditText";
_txtalamat = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private btnCobaLagi As Button";
_btncobalagi = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim etJaket,etHelm As EditText";
_etjaket = new anywheresoftware.b4a.objects.EditTextWrapper();
_ethelm = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim limit As IME";
_limit = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 21;BA.debugLine="Dim warna As ColorDrawable";
_warna = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 22;BA.debugLine="Dim pnlhitam As Panel";
_pnlhitam = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private xImageSliderIG1 As xImageSliderIG";
_ximagesliderig1 = new b4a.example2.ximagesliderig();
 //BA.debugLineNum = 25;BA.debugLine="Private clvInput As CustomListView";
_clvinput = new b4a.example3.customlistview();
 //BA.debugLineNum = 26;BA.debugLine="Private cbHelm As CheckBox";
_cbhelm = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private cbJaket As CheckBox";
_cbjaket = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private txtJaket As EditText";
_txtjaket = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private txtHelm As EditText";
_txthelm = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
 //BA.debugLineNum = 31;BA.debugLine="Private nIndex As Int";
_nindex = 0;
 //BA.debugLineNum = 32;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Dim versi2 As V2";
_versi2 = new b4a.example2.v2();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _clvhelm_itemlongclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Private Sub clvHelm_ItemLongClick (index As Int, V";
 //BA.debugLineNum = 172;BA.debugLine="Log(\"clvHelm_ItemLongClick\")";
__c.LogImpl("11310721","clvHelm_ItemLongClick",0);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _clvinput_itemlongclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Private Sub clvInput_ItemLongClick (index As Int,";
 //BA.debugLineNum = 169;BA.debugLine="createOption(Root,index)";
_createoption(_root,_index);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _clvjaket_itemlongclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Private Sub clvJaket_ItemLongClick (index As Int,";
 //BA.debugLineNum = 176;BA.debugLine="Log(\"clvJaket_ItemLongClick\")";
__c.LogImpl("11376257","clvJaket_ItemLongClick",0);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public String  _createoption(anywheresoftware.b4a.objects.B4XViewWrapper _rute,int _dd) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4a.objects.ListViewWrapper _lsview = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd2 = null;
 //BA.debugLineNum = 355;BA.debugLine="Sub createOption(rute As B4XView,dd As Int)";
 //BA.debugLineNum = 356;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 357;BA.debugLine="Dim lsview As ListView";
_lsview = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 358;BA.debugLine="lsview.Initialize(\"lv\")";
_lsview.Initialize(ba,"lv");
 //BA.debugLineNum = 359;BA.debugLine="pnl  =xui.CreatePanel(\"Option\")";
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"Option").getObject()));
 //BA.debugLineNum = 360;BA.debugLine="cd.Initialize(xui.Color_ARGB(150,0,0,0),0)";
_cd.Initialize(_xui.Color_ARGB((int) (150),(int) (0),(int) (0),(int) (0)),(int) (0));
 //BA.debugLineNum = 361;BA.debugLine="pnl.Background = cd";
_pnl.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 //BA.debugLineNum = 364;BA.debugLine="rute.AddView(pnl,0,0,GetDeviceLayoutValues.Width,";
_rute.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
 //BA.debugLineNum = 365;BA.debugLine="lsview.AddSingleLine2(\"Hapus\",dd)";
_lsview.AddSingleLine2(BA.ObjectToCharSequence("Hapus"),(Object)(_dd));
 //BA.debugLineNum = 366;BA.debugLine="lsview.AddSingleLine2(\"Simpan\",dd)";
_lsview.AddSingleLine2(BA.ObjectToCharSequence("Simpan"),(Object)(_dd));
 //BA.debugLineNum = 367;BA.debugLine="lsview.AddSingleLine2(\"Edit\",dd)";
_lsview.AddSingleLine2(BA.ObjectToCharSequence("Edit"),(Object)(_dd));
 //BA.debugLineNum = 368;BA.debugLine="lsview.Padding=Array As Int(30dip,0,0,0)";
_lsview.setPadding(new int[]{__c.DipToCurrent((int) (30)),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 369;BA.debugLine="Dim cd2 As ColorDrawable";
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 370;BA.debugLine="cd2.Initialize(0xff1E2029,10dip)";
_cd2.Initialize(((int)0xff1e2029),__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 372;BA.debugLine="lsview.Background  = cd2";
_lsview.setBackground((android.graphics.drawable.Drawable)(_cd2.getObject()));
 //BA.debugLineNum = 373;BA.debugLine="pnl.AddView(lsview,0,GetDeviceLayoutValues.Height";
_pnl.AddView((android.view.View)(_lsview.getObject()),(int) (0),(int) (__c.GetDeviceLayoutValues(ba).Height-__c.PerYToCurrent((float) (25),ba)),__c.GetDeviceLayoutValues(ba).Width,__c.PerYToCurrent((float) (25),ba));
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return "";
}
public String  _cs_click(Object _tag) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub cs_Click (Tag As Object)";
 //BA.debugLineNum = 159;BA.debugLine="tampilanslideig";
_tampilanslideig();
 //BA.debugLineNum = 160;BA.debugLine="Log($\"You have clicked on word: ${Tag}\"$)";
__c.LogImpl("11179650",("You have clicked on word: "+__c.SmartStringFormatter("",_tag)+""),0);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _ethelm_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Private Sub etHelm_TextChanged (Old As String, New";
 //BA.debugLineNum = 276;BA.debugLine="Log(New)";
__c.LogImpl("11900545",_new,0);
 //BA.debugLineNum = 277;BA.debugLine="If Sender.As(EditText).IsInitialized = True Then";
if (((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)))).IsInitialized()==__c.True) { 
 //BA.debugLineNum = 279;BA.debugLine="Log	(Sender.As(EditText).IsInitialized&\" terini";
__c.LogImpl("11900548",BA.ObjectToString(((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)))).IsInitialized())+" terinisialisasi",0);
 //BA.debugLineNum = 280;BA.debugLine="Log	(\"Sender.As(EditText).Text\"&Sender.As(EditTe";
__c.LogImpl("11900549","Sender.As(EditText).Text"+((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)))).getText(),0);
 };
 //BA.debugLineNum = 284;BA.debugLine="If New.Length >4 Then	 limit.HideKeyboard";
if (_new.length()>4) { 
_limit.HideKeyboard(ba);};
 //BA.debugLineNum = 290;BA.debugLine="If etHelm.IsInitialized Then";
if (_ethelm.IsInitialized()) { 
 };
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return "";
}
public String  _etjaket_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Private Sub etJaket_TextChanged (Old As String, Ne";
 //BA.debugLineNum = 294;BA.debugLine="Log(New)";
__c.LogImpl("11966081",_new,0);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public String  _label2_click() throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Private Sub Label2_Click";
 //BA.debugLineNum = 271;BA.debugLine="nIndex = setclv(clvInput,\"etJaket\",nIndex)";
_nindex = _setclv(_clvinput,"etJaket",_nindex);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public String  _label3_click() throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Private Sub Label3_Click";
 //BA.debugLineNum = 257;BA.debugLine="If clvInput.Size <>1 Then";
if (_clvinput._getsize()!=1) { 
 //BA.debugLineNum = 259;BA.debugLine="clvInput.RemoveAt(clvInput.Size-1)";
_clvinput._removeat((int) (_clvinput._getsize()-1));
 //BA.debugLineNum = 260;BA.debugLine="If nIndex >0 Then";
if (_nindex>0) { 
 //BA.debugLineNum = 261;BA.debugLine="nIndex = nIndex -1";
_nindex = (int) (_nindex-1);
 };
 };
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public String  _lblclose_click() throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Private Sub lblclose_Click";
 //BA.debugLineNum = 187;BA.debugLine="If clvInput.Size>0 Then";
if (_clvinput._getsize()>0) { 
 //BA.debugLineNum = 188;BA.debugLine="clvInput.RemoveAt(clvInput.Size-1)";
_clvinput._removeat((int) (_clvinput._getsize()-1));
 //BA.debugLineNum = 189;BA.debugLine="nIndex =nIndex-1";
_nindex = (int) (_nindex-1);
 };
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return "";
}
public String  _lv_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Private Sub lv_ItemClick (Position As Int, Value A";
 //BA.debugLineNum = 388;BA.debugLine="Log(Position)";
__c.LogImpl("12293761",BA.NumberToString(_position),0);
 //BA.debugLineNum = 389;BA.debugLine="If Position =0 Then";
if (_position==0) { 
 //BA.debugLineNum = 390;BA.debugLine="clvInput.RemoveAt(clvInput.Size-1)";
_clvinput._removeat((int) (_clvinput._getsize()-1));
 //BA.debugLineNum = 392;BA.debugLine="nIndex = nIndex -1";
_nindex = (int) (_nindex-1);
 //BA.debugLineNum = 393;BA.debugLine="pnl.Visible=False";
_pnl.setVisible(__c.False);
 };
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return "";
}
public String  _option_click() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 396;BA.debugLine="Private Sub Option_Click";
 //BA.debugLineNum = 398;BA.debugLine="Dim p As Panel	 = Sender";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Sender(ba)));
 //BA.debugLineNum = 399;BA.debugLine="p.RemoveAllViews";
_p.RemoveAllViews();
 //BA.debugLineNum = 400;BA.debugLine="p.Visible =False";
_p.setVisible(__c.False);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return "";
}
public String  _pnlhitam_click() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Private Sub pnlhitam_Click";
 //BA.debugLineNum = 119;BA.debugLine="pnlhitam.Visible = Not(pnlhitam.Visible)";
_pnlhitam.setVisible(__c.Not(_pnlhitam.getVisible()));
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public int  _setclv(b4a.example3.customlistview _clv,String _edittext,int _nawal) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _pnltampung = null;
 //BA.debugLineNum = 192;BA.debugLine="Sub setclv(clv As CustomListView,edittext As Strin";
 //BA.debugLineNum = 193;BA.debugLine="Dim pnlTampung As Panel";
_pnltampung = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 195;BA.debugLine="pnlTampung.Initialize(\"pnlTampung\")";
_pnltampung.Initialize(ba,"pnlTampung");
 //BA.debugLineNum = 196;BA.debugLine="pnlTampung.LoadLayout(\"l_InputDataAtribut\")";
_pnltampung.LoadLayout("l_InputDataAtribut",ba);
 //BA.debugLineNum = 197;BA.debugLine="pnlTampung.As(B4XView).SetColorAndBorder(Colors.W";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnltampung.getObject()))).SetColorAndBorder(__c.Colors.White,__c.DipToCurrent((int) (2)),__c.Colors.Black,__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 199;BA.debugLine="pnlTampung.SetLayout(2dip,2dip,clv.AsView.Width/2";
_pnltampung.SetLayout(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)),(int) (_clv._asview().getWidth()/(double)2),_clv._asview().getHeight());
 //BA.debugLineNum = 211;BA.debugLine="Label1.Text =$\"Pilih Ukuran Atribut ${nawal+1} :\"";
_label1.setText(BA.ObjectToCharSequence(("Pilih Ukuran Atribut "+__c.SmartStringFormatter("",(Object)(_nawal+1))+" :")));
 //BA.debugLineNum = 212;BA.debugLine="clv.Add(pnlTampung,\"\")";
_clv._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnltampung.getObject())),(Object)(""));
 //BA.debugLineNum = 213;BA.debugLine="txtJaket.Width = pnlTampung.Width -23dip";
_txtjaket.setWidth((int) (_pnltampung.getWidth()-__c.DipToCurrent((int) (23))));
 //BA.debugLineNum = 214;BA.debugLine="txtHelm.Width = pnlTampung.Width -23dip";
_txthelm.setWidth((int) (_pnltampung.getWidth()-__c.DipToCurrent((int) (23))));
 //BA.debugLineNum = 240;BA.debugLine="nawal=nawal+1";
_nawal = (int) (_nawal+1);
 //BA.debugLineNum = 241;BA.debugLine="Return nawal";
if (true) return _nawal;
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return 0;
}
public String  _settampilan() throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub setTampilan";
 //BA.debugLineNum = 248;BA.debugLine="nIndex = setclv(clvInput,\"etJaket\",nIndex)";
_nindex = _setclv(_clvinput,"etJaket",_nindex);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public String  _tampilanslideig() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _pnltampung = null;
b4a.example2.main._slidercontainer _sc = null;
anywheresoftware.b4a.objects.collections.List _sliders = null;
 //BA.debugLineNum = 121;BA.debugLine="Sub tampilanslideig";
 //BA.debugLineNum = 122;BA.debugLine="pnlhitam.Visible=True";
_pnlhitam.setVisible(__c.True);
 //BA.debugLineNum = 123;BA.debugLine="Dim pnlTampung As Panel = xui.CreatePanel(\"\")";
_pnltampung = new anywheresoftware.b4a.objects.PanelWrapper();
_pnltampung = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 125;BA.debugLine="pnlTampung.LoadLayout(\"l_igSlide\")";
_pnltampung.LoadLayout("l_igSlide",ba);
 //BA.debugLineNum = 130;BA.debugLine="Dim sc As SliderContainer";
_sc = new b4a.example2.main._slidercontainer();
 //BA.debugLineNum = 131;BA.debugLine="Dim sliders As List";
_sliders = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 132;BA.debugLine="sliders.Initialize";
_sliders.Initialize();
 //BA.debugLineNum = 133;BA.debugLine="sc.Initialize";
_sc.Initialize();
 //BA.debugLineNum = 134;BA.debugLine="sc.slider = xImageSliderIG1";
_sc.slider /*b4a.example2.ximagesliderig*/  = _ximagesliderig1;
 //BA.debugLineNum = 136;BA.debugLine="sc.slider.ActivityHasActionBar = True";
_sc.slider /*b4a.example2.ximagesliderig*/ ._setactivityhasactionbar(__c.True);
 //BA.debugLineNum = 137;BA.debugLine="sc.items.Initialize";
_sc.items /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 142;BA.debugLine="sc.items.Add(CreateMap(\"data\":\"Item 1-\"&2, \"image";
_sc.items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("data"),(Object)("Item 1-"+BA.NumberToString(2)),(Object)("image"),(Object)(__c.LoadBitmap(__c.File.getDirAssets(),"ukuranhelm.jpg").getObject())}).getObject()));
 //BA.debugLineNum = 143;BA.debugLine="sc.items.Add(CreateMap(\"data\":\"Item 1-\"&3, \"image";
_sc.items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("data"),(Object)("Item 1-"+BA.NumberToString(3)),(Object)("image"),(Object)(__c.LoadBitmap(__c.File.getDirAssets(),"ukuranjaketcrop.jpg").getObject())}).getObject()));
 //BA.debugLineNum = 147;BA.debugLine="sc.slider.setitems(sc.items)";
_sc.slider /*b4a.example2.ximagesliderig*/ ._setitems /*String*/ (_sc.items /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 148;BA.debugLine="sc.slider.SetZoomPanel(Root)";
_sc.slider /*b4a.example2.ximagesliderig*/ ._setzoompanel /*String*/ (_root);
 //BA.debugLineNum = 150;BA.debugLine="sliders.Add(sc)";
_sliders.Add((Object)(_sc));
 //BA.debugLineNum = 152;BA.debugLine="pnlhitam.AddView(pnlTampung,20dip,20dip,pnlhitam.";
_pnlhitam.AddView((android.view.View)(_pnltampung.getObject()),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)),(int) (_pnlhitam.getWidth()-__c.DipToCurrent((int) (40))),(int) (_pnlhitam.getHeight()-__c.DipToCurrent((int) (40))));
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
