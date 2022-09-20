package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cobadesain extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example2.cobadesain");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public Object  _initialize(b4a.example2.cobadesain __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example2.cobadesain __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _t = 0;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Root.LoadLayout(\"l_utama\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("l_utama",ba);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="versi2.Initialize";
__ref._versi2 /*b4a.example2.v2*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="B4XPages.AddMenuItem(Me,\"Riwayat Pembelian\")";
_b4xpages._addmenuitem /*b4a.example2.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Riwayat Pembelian"));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="B4XPages.AddMenuItem(Me,\"Informasi Harga\")";
_b4xpages._addmenuitem /*b4a.example2.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Informasi Harga"));
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="B4XPages.AddMenuItem(Me,\"Informasi website\")";
_b4xpages._addmenuitem /*b4a.example2.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Informasi website"));
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="B4XPages.AddPage(\"v2\",versi2)";
_b4xpages._addpage /*String*/ (ba,"v2",(Object)(__ref._versi2 /*b4a.example2.v2*/ ));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Dim p As Panel  = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="p.SetLayout(0,0,Root.Width,Root.Height)";
_p.SetLayout((int) (0),(int) (0),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="CustomListView1.Add(p,\"\")";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(""));
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="p.LoadLayout(\"l_atributReDesain\")";
_p.LoadLayout("l_atributReDesain",ba);
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="Dim t As Int";
_t = 0;
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="If (btnCobaLagi.Top+btnCobaLagi.Height)>GetDevice";
if ((__ref._btncobalagi /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTop()+__ref._btncobalagi /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getHeight())>__c.GetDeviceLayoutValues(ba).Height) { 
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="t=  btnCobaLagi.Top+btnCobaLagi.Height";
_t = (int) (__ref._btncobalagi /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTop()+__ref._btncobalagi /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getHeight());
 }else {
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="t = GetDeviceLayoutValues.Height";
_t = __c.GetDeviceLayoutValues(ba).Height;
 };
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="Log(t)";
__c.LogImpl("2983068",BA.NumberToString(_t),0);
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="CustomListView1.GetPanel(CustomListView1.Size-1).";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel((int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1)).setHeight(_t);
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="CustomListView1.AsView.Height = t";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().setHeight(_t);
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="CustomListView1.sv.Height = t";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.setHeight(_t);
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="CustomListView1.GetPanel(CustomListView1.Size-1).";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel((int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1)).setColor(__c.Colors.White);
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="Log(GetDeviceLayoutValues.Height)";
__c.LogImpl("2983076",BA.NumberToString(__c.GetDeviceLayoutValues(ba).Height),0);
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="Log(btnCobaLagi.Top+btnCobaLagi.Height)";
__c.LogImpl("2983077",BA.NumberToString(__ref._btncobalagi /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTop()+__ref._btncobalagi /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getHeight()),0);
RDebugUtils.currentLine=983090;
 //BA.debugLineNum = 983090;BA.debugLine="warna.Initialize(Colors.ARGB(150,0,0,0),5dip)";
__ref._warna /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .Initialize(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=983091;
 //BA.debugLineNum = 983091;BA.debugLine="pnlhitam = xui.CreatePanel(\"pnlhitam\")";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlhitam").getObject()));
RDebugUtils.currentLine=983092;
 //BA.debugLineNum = 983092;BA.debugLine="pnlhitam.Background = warna";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._warna /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
RDebugUtils.currentLine=983093;
 //BA.debugLineNum = 983093;BA.debugLine="Root.AddView(pnlhitam,0,0,Root.Width,Root.Height)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983094;
 //BA.debugLineNum = 983094;BA.debugLine="pnlhitam.SetElevationAnimated(0,5dip)";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetElevationAnimated((int) (0),(float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=983095;
 //BA.debugLineNum = 983095;BA.debugLine="pnlhitam.Visible=False";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=983105;
 //BA.debugLineNum = 983105;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=983106;
 //BA.debugLineNum = 983106;BA.debugLine="cs.Initialize.Size(17).Append(\"Ikuti panduan foto";
_cs.Initialize().Size((int) (17)).Append(BA.ObjectToCharSequence("Ikuti panduan foto "));
RDebugUtils.currentLine=983107;
 //BA.debugLineNum = 983107;BA.debugLine="cs.Clickable(\"cs\", 1).Color(0xFF00A7FF).Append(\"i";
_cs.Clickable(ba,"cs",(Object)(1)).Color(((int)0xff00a7ff)).Append(BA.ObjectToCharSequence("ini ")).Pop().Pop();
RDebugUtils.currentLine=983108;
 //BA.debugLineNum = 983108;BA.debugLine="cs.Append(\"untuk mempermudah pemilihan ukuran atr";
_cs.Append(BA.ObjectToCharSequence("untuk mempermudah pemilihan ukuran atribut")).PopAll();
RDebugUtils.currentLine=983109;
 //BA.debugLineNum = 983109;BA.debugLine="cs.EnableClickEvents(Label1)";
_cs.EnableClickEvents((android.widget.TextView)(__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=983110;
 //BA.debugLineNum = 983110;BA.debugLine="Label1.Text = cs";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=983111;
 //BA.debugLineNum = 983111;BA.debugLine="setTampilan";
__ref._settampilan /*String*/ (null);
RDebugUtils.currentLine=983115;
 //BA.debugLineNum = 983115;BA.debugLine="End Sub";
return "";
}
public String  _settampilan(b4a.example2.cobadesain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "settampilan", false))
	 {return ((String) Debug.delegate(ba, "settampilan", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub setTampilan";
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="nIndex = setclv(clvInput,\"etJaket\",nIndex)";
__ref._nindex /*int*/  = __ref._setclv /*int*/ (null,__ref._clvinput /*b4a.example3.customlistview*/ ,"etJaket",__ref._nindex /*int*/ );
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="End Sub";
return "";
}
public String  _btncobalagi_click(b4a.example2.cobadesain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "btncobalagi_click", false))
	 {return ((String) Debug.delegate(ba, "btncobalagi_click", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub btnCobaLagi_Click";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4a.example2.cobadesain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="B4XPages.ShowPage(\"v2\")";
_b4xpages._showpage /*String*/ (ba,"v2");
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public String  _cbhelm_checkedchange(b4a.example2.cobadesain __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "cbhelm_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "cbhelm_checkedchange", new Object[] {_checked}));}
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cb = null;
anywheresoftware.b4a.objects.PanelWrapper _ortu = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub cbHelm_CheckedChange(Checked As Boolea";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim cb As CheckBox";
_cb = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="cb = Sender";
_cb = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Dim ortu As Panel	  = cb.Parent";
_ortu = new anywheresoftware.b4a.objects.PanelWrapper();
_ortu = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_cb.getParent()));
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="ortu.GetView(4).As(EditText).Visible = Checked";
((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_ortu.GetView((int) (4)).getObject()))).setVisible(_checked);
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="If Checked = False Then";
if (_checked==__c.False) { 
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="ortu.Height = Label1.Top + txtJaket.Top+txtJaket.";
_ortu.setHeight((int) (__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop()+__ref._txtjaket /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getTop()+__ref._txtjaket /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getHeight()+__c.DipToCurrent((int) (2))));
 }else {
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="ortu.Height = Label1.Top + txtHelm.Top+txtHelm.He";
_ortu.setHeight((int) (__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop()+__ref._txthelm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getTop()+__ref._txthelm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="End Sub";
return "";
}
public String  _cbjaket_checkedchange(b4a.example2.cobadesain __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "cbjaket_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "cbjaket_checkedchange", new Object[] {_checked}));}
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cb = null;
anywheresoftware.b4a.objects.PanelWrapper _ortu = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub cbJaket_CheckedChange(Checked As Boole";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim cb As CheckBox";
_cb = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="cb = Sender";
_cb = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Dim ortu As Panel	  = cb.Parent";
_ortu = new anywheresoftware.b4a.objects.PanelWrapper();
_ortu = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_cb.getParent()));
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="ortu.GetView(3).As(EditText).Visible = Checked";
((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_ortu.GetView((int) (3)).getObject()))).setVisible(_checked);
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="If Checked=False Then";
if (_checked==__c.False) { 
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="ortu.GetView(4).As(EditText).Top =  ortu.GetView";
((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_ortu.GetView((int) (4)).getObject()))).setTop(_ortu.GetView((int) (3)).getTop());
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="ortu.Height = Label1.Top + txtJaket.Top+txtJaket";
_ortu.setHeight((int) (__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop()+__ref._txtjaket /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getTop()+__ref._txtjaket /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getHeight()+__c.DipToCurrent((int) (2))));
 }else {
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="ortu.GetView(4).Top = ortu.GetView(3).Top + ortu";
_ortu.GetView((int) (4)).setTop((int) (_ortu.GetView((int) (3)).getTop()+_ortu.GetView((int) (3)).getHeight()+__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="If ortu.GetView(2).As(CheckBox).Checked =False T";
if (((anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(_ortu.GetView((int) (2)).getObject()))).getChecked()==__c.False) { 
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="ortu.Height = Label1.Top + txtJaket.Top+txtJake";
_ortu.setHeight((int) (__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop()+__ref._txtjaket /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getTop()+__ref._txtjaket /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getHeight()+__c.DipToCurrent((int) (2))));
 }else {
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="ortu.Height = Label1.Top + txtHelm.Top+txtHelm.H";
_ortu.setHeight((int) (__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop()+__ref._txthelm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getTop()+__ref._txthelm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getHeight()+__c.DipToCurrent((int) (2))));
 };
 };
RDebugUtils.currentLine=2031641;
 //BA.debugLineNum = 2031641;BA.debugLine="End Sub";
return "";
}
public String  _cekkondisi(b4a.example2.cobadesain __ref,anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _ck1,anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _ck2,Object _ortu1) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "cekkondisi", false))
	 {return ((String) Debug.delegate(ba, "cekkondisi", new Object[] {_ck1,_ck2,_ortu1}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub cekkondisi ( ck1 As CheckBox,ck2 As CheckBox,o";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="If ck1.Checked =False And ck2.Checked = False The";
if (_ck1.getChecked()==__c.False && _ck2.getChecked()==__c.False) { 
 };
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example2.cobadesain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Private lblKamera As Label";
_lblkamera = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Private txtAlamat As EditText";
_txtalamat = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Private btnCobaLagi As Button";
_btncobalagi = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="Dim etJaket,etHelm As EditText";
_etjaket = new anywheresoftware.b4a.objects.EditTextWrapper();
_ethelm = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="Dim limit As IME";
_limit = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="Dim warna As ColorDrawable";
_warna = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=851989;
 //BA.debugLineNum = 851989;BA.debugLine="Dim pnlhitam As Panel";
_pnlhitam = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="Private xImageSliderIG1 As xImageSliderIG";
_ximagesliderig1 = new b4a.example2.ximagesliderig();
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="Private clvInput As CustomListView";
_clvinput = new b4a.example3.customlistview();
RDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="Private cbHelm As CheckBox";
_cbhelm = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="Private cbJaket As CheckBox";
_cbjaket = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=851995;
 //BA.debugLineNum = 851995;BA.debugLine="Private txtJaket As EditText";
_txtjaket = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=851996;
 //BA.debugLineNum = 851996;BA.debugLine="Private txtHelm As EditText";
_txthelm = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=851997;
 //BA.debugLineNum = 851997;BA.debugLine="Private CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=851998;
 //BA.debugLineNum = 851998;BA.debugLine="Private nIndex As Int";
_nindex = 0;
RDebugUtils.currentLine=851999;
 //BA.debugLineNum = 851999;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=852000;
 //BA.debugLineNum = 852000;BA.debugLine="Dim versi2 As V2";
_versi2 = new b4a.example2.v2();
RDebugUtils.currentLine=852001;
 //BA.debugLineNum = 852001;BA.debugLine="End Sub";
return "";
}
public String  _clvhelm_itemlongclick(b4a.example2.cobadesain __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "clvhelm_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "clvhelm_itemlongclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub clvHelm_ItemLongClick (index As Int, V";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Log(\"clvHelm_ItemLongClick\")";
__c.LogImpl("21310721","clvHelm_ItemLongClick",0);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public String  _clvinput_itemlongclick(b4a.example2.cobadesain __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "clvinput_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "clvinput_itemlongclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub clvInput_ItemLongClick (index As Int,";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="createOption(Root,index)";
__ref._createoption /*String*/ (null,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_index);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _createoption(b4a.example2.cobadesain __ref,anywheresoftware.b4a.objects.B4XViewWrapper _rute,int _dd) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "createoption", false))
	 {return ((String) Debug.delegate(ba, "createoption", new Object[] {_rute,_dd}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4a.objects.ListViewWrapper _lsview = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd2 = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub createOption(rute As B4XView,dd As Int)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Dim lsview As ListView";
_lsview = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="lsview.Initialize(\"lv\")";
_lsview.Initialize(ba,"lv");
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="pnl  =xui.CreatePanel(\"Option\")";
__ref._pnl /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"Option").getObject()));
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="cd.Initialize(xui.Color_ARGB(150,0,0,0),0)";
_cd.Initialize(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (150),(int) (0),(int) (0),(int) (0)),(int) (0));
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="pnl.Background = cd";
__ref._pnl /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="rute.AddView(pnl,0,0,GetDeviceLayoutValues.Width,";
_rute.AddView((android.view.View)(__ref._pnl /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="lsview.AddSingleLine2(\"Hapus\",dd)";
_lsview.AddSingleLine2(BA.ObjectToCharSequence("Hapus"),(Object)(_dd));
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="lsview.AddSingleLine2(\"Simpan\",dd)";
_lsview.AddSingleLine2(BA.ObjectToCharSequence("Simpan"),(Object)(_dd));
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="lsview.AddSingleLine2(\"Edit\",dd)";
_lsview.AddSingleLine2(BA.ObjectToCharSequence("Edit"),(Object)(_dd));
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="lsview.Padding=Array As Int(30dip,0,0,0)";
_lsview.setPadding(new int[]{__c.DipToCurrent((int) (30)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="Dim cd2 As ColorDrawable";
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="cd2.Initialize(0xff1E2029,10dip)";
_cd2.Initialize(((int)0xff1e2029),__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=2228241;
 //BA.debugLineNum = 2228241;BA.debugLine="lsview.Background  = cd2";
_lsview.setBackground((android.graphics.drawable.Drawable)(_cd2.getObject()));
RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="pnl.AddView(lsview,0,GetDeviceLayoutValues.Height";
__ref._pnl /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lsview.getObject()),(int) (0),(int) (__c.GetDeviceLayoutValues(ba).Height-__c.PerYToCurrent((float) (25),ba)),__c.GetDeviceLayoutValues(ba).Width,__c.PerYToCurrent((float) (25),ba));
RDebugUtils.currentLine=2228249;
 //BA.debugLineNum = 2228249;BA.debugLine="End Sub";
return "";
}
public String  _clvjaket_itemlongclick(b4a.example2.cobadesain __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "clvjaket_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "clvjaket_itemlongclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub clvJaket_ItemLongClick (index As Int,";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Log(\"clvJaket_ItemLongClick\")";
__c.LogImpl("21376257","clvJaket_ItemLongClick",0);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _cs_click(b4a.example2.cobadesain __ref,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "cs_click", false))
	 {return ((String) Debug.delegate(ba, "cs_click", new Object[] {_tag}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub cs_Click (Tag As Object)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="tampilanslideig";
__ref._tampilanslideig /*String*/ (null);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Log($\"You have clicked on word: ${Tag}\"$)";
__c.LogImpl("21179650",("You have clicked on word: "+__c.SmartStringFormatter("",_tag)+""),0);
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="End Sub";
return "";
}
public String  _tampilanslideig(b4a.example2.cobadesain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "tampilanslideig", false))
	 {return ((String) Debug.delegate(ba, "tampilanslideig", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnltampung = null;
b4a.example2.main._slidercontainer _sc = null;
anywheresoftware.b4a.objects.collections.List _sliders = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub tampilanslideig";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="pnlhitam.Visible=True";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Dim pnlTampung As Panel = xui.CreatePanel(\"\")";
_pnltampung = new anywheresoftware.b4a.objects.PanelWrapper();
_pnltampung = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="pnlTampung.LoadLayout(\"l_igSlide\")";
_pnltampung.LoadLayout("l_igSlide",ba);
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Dim sc As SliderContainer";
_sc = new b4a.example2.main._slidercontainer();
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Dim sliders As List";
_sliders = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="sliders.Initialize";
_sliders.Initialize();
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="sc.Initialize";
_sc.Initialize();
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="sc.slider = xImageSliderIG1";
_sc.slider /*b4a.example2.ximagesliderig*/  = __ref._ximagesliderig1 /*b4a.example2.ximagesliderig*/ ;
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="sc.slider.ActivityHasActionBar = True";
_sc.slider /*b4a.example2.ximagesliderig*/ ._setactivityhasactionbar(null,__c.True);
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="sc.items.Initialize";
_sc.items /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="sc.items.Add(CreateMap(\"data\":\"Item 1-\"&2, \"image";
_sc.items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("data"),(Object)("Item 1-"+BA.NumberToString(2)),(Object)("image"),(Object)(__c.LoadBitmap(__c.File.getDirAssets(),"ukuranhelm.jpg").getObject())}).getObject()));
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="sc.items.Add(CreateMap(\"data\":\"Item 1-\"&3, \"image";
_sc.items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("data"),(Object)("Item 1-"+BA.NumberToString(3)),(Object)("image"),(Object)(__c.LoadBitmap(__c.File.getDirAssets(),"ukuranjaketcrop.jpg").getObject())}).getObject()));
RDebugUtils.currentLine=1114138;
 //BA.debugLineNum = 1114138;BA.debugLine="sc.slider.setitems(sc.items)";
_sc.slider /*b4a.example2.ximagesliderig*/ ._setitems /*String*/ (null,_sc.items /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=1114139;
 //BA.debugLineNum = 1114139;BA.debugLine="sc.slider.SetZoomPanel(Root)";
_sc.slider /*b4a.example2.ximagesliderig*/ ._setzoompanel /*String*/ (null,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=1114141;
 //BA.debugLineNum = 1114141;BA.debugLine="sliders.Add(sc)";
_sliders.Add((Object)(_sc));
RDebugUtils.currentLine=1114143;
 //BA.debugLineNum = 1114143;BA.debugLine="pnlhitam.AddView(pnlTampung,20dip,20dip,pnlhitam.";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_pnltampung.getObject()),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)),(int) (__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-__c.DipToCurrent((int) (40))),(int) (__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__c.DipToCurrent((int) (40))));
RDebugUtils.currentLine=1114144;
 //BA.debugLineNum = 1114144;BA.debugLine="End Sub";
return "";
}
public String  _ethelm_textchanged(b4a.example2.cobadesain __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "ethelm_textchanged", false))
	 {return ((String) Debug.delegate(ba, "ethelm_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub etHelm_TextChanged (Old As String, New";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Log(New)";
__c.LogImpl("21900545",_new,0);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="If Sender.As(EditText).IsInitialized = True Then";
if (((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)))).IsInitialized()==__c.True) { 
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Log	(Sender.As(EditText).IsInitialized&\" terini";
__c.LogImpl("21900548",BA.ObjectToString(((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)))).IsInitialized())+" terinisialisasi",0);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Log	(\"Sender.As(EditText).Text\"&Sender.As(EditTe";
__c.LogImpl("21900549","Sender.As(EditText).Text"+((anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)))).getText(),0);
 };
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="If New.Length >4 Then	 limit.HideKeyboard";
if (_new.length()>4) { 
__ref._limit /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);};
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="If etHelm.IsInitialized Then";
if (__ref._ethelm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .IsInitialized()) { 
 };
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="End Sub";
return "";
}
public String  _etjaket_textchanged(b4a.example2.cobadesain __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "etjaket_textchanged", false))
	 {return ((String) Debug.delegate(ba, "etjaket_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub etJaket_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Log(New)";
__c.LogImpl("21966081",_new,0);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.example2.cobadesain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="nIndex = setclv(clvInput,\"etJaket\",nIndex)";
__ref._nindex /*int*/  = __ref._setclv /*int*/ (null,__ref._clvinput /*b4a.example3.customlistview*/ ,"etJaket",__ref._nindex /*int*/ );
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return "";
}
public int  _setclv(b4a.example2.cobadesain __ref,b4a.example3.customlistview _clv,String _edittext,int _nawal) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "setclv", false))
	 {return ((Integer) Debug.delegate(ba, "setclv", new Object[] {_clv,_edittext,_nawal}));}
anywheresoftware.b4a.objects.PanelWrapper _pnltampung = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub setclv(clv As CustomListView,edittext As Strin";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim pnlTampung As Panel";
_pnltampung = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="pnlTampung.Initialize(\"pnlTampung\")";
_pnltampung.Initialize(ba,"pnlTampung");
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="pnlTampung.LoadLayout(\"l_InputDataAtribut\")";
_pnltampung.LoadLayout("l_InputDataAtribut",ba);
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="pnlTampung.As(B4XView).SetColorAndBorder(Colors.W";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnltampung.getObject()))).SetColorAndBorder(__c.Colors.White,__c.DipToCurrent((int) (2)),__c.Colors.Black,__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="pnlTampung.SetLayout(2dip,2dip,clv.AsView.Width/2";
_pnltampung.SetLayout(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)),(int) (_clv._asview().getWidth()/(double)2),_clv._asview().getHeight());
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="Label1.Text =$\"Pilih Ukuran Atribut ${nawal+1} :\"";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(("Pilih Ukuran Atribut "+__c.SmartStringFormatter("",(Object)(_nawal+1))+" :")));
RDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="clv.Add(pnlTampung,\"\")";
_clv._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnltampung.getObject())),(Object)(""));
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="txtJaket.Width = pnlTampung.Width -23dip";
__ref._txtjaket /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setWidth((int) (_pnltampung.getWidth()-__c.DipToCurrent((int) (23))));
RDebugUtils.currentLine=1638422;
 //BA.debugLineNum = 1638422;BA.debugLine="txtHelm.Width = pnlTampung.Width -23dip";
__ref._txthelm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setWidth((int) (_pnltampung.getWidth()-__c.DipToCurrent((int) (23))));
RDebugUtils.currentLine=1638448;
 //BA.debugLineNum = 1638448;BA.debugLine="nawal=nawal+1";
_nawal = (int) (_nawal+1);
RDebugUtils.currentLine=1638449;
 //BA.debugLineNum = 1638449;BA.debugLine="Return nawal";
if (true) return _nawal;
RDebugUtils.currentLine=1638451;
 //BA.debugLineNum = 1638451;BA.debugLine="End Sub";
return 0;
}
public String  _label3_click(b4a.example2.cobadesain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "label3_click", false))
	 {return ((String) Debug.delegate(ba, "label3_click", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub Label3_Click";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="If clvInput.Size <>1 Then";
if (__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()!=1) { 
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="clvInput.RemoveAt(clvInput.Size-1)";
__ref._clvinput /*b4a.example3.customlistview*/ ._removeat((int) (__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()-1));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="If nIndex >0 Then";
if (__ref._nindex /*int*/ >0) { 
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="nIndex = nIndex -1";
__ref._nindex /*int*/  = (int) (__ref._nindex /*int*/ -1);
 };
 };
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="End Sub";
return "";
}
public String  _lblclose_click(b4a.example2.cobadesain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "lblclose_click", false))
	 {return ((String) Debug.delegate(ba, "lblclose_click", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub lblclose_Click";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If clvInput.Size>0 Then";
if (__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()>0) { 
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="clvInput.RemoveAt(clvInput.Size-1)";
__ref._clvinput /*b4a.example3.customlistview*/ ._removeat((int) (__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()-1));
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="nIndex =nIndex-1";
__ref._nindex /*int*/  = (int) (__ref._nindex /*int*/ -1);
 };
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="End Sub";
return "";
}
public String  _lv_itemclick(b4a.example2.cobadesain __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "lv_itemclick", false))
	 {return ((String) Debug.delegate(ba, "lv_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub lv_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Log(Position)";
__c.LogImpl("22293761",BA.NumberToString(_position),0);
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="If Position =0 Then";
if (_position==0) { 
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="clvInput.RemoveAt(clvInput.Size-1)";
__ref._clvinput /*b4a.example3.customlistview*/ ._removeat((int) (__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()-1));
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="nIndex = nIndex -1";
__ref._nindex /*int*/  = (int) (__ref._nindex /*int*/ -1);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="pnl.Visible=False";
__ref._pnl /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="End Sub";
return "";
}
public String  _option_click(b4a.example2.cobadesain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "option_click", false))
	 {return ((String) Debug.delegate(ba, "option_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub Option_Click";
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim p As Panel	 = Sender";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="p.RemoveAllViews";
_p.RemoveAllViews();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="p.Visible =False";
_p.setVisible(__c.False);
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="End Sub";
return "";
}
public String  _pnlhitam_click(b4a.example2.cobadesain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cobadesain";
if (Debug.shouldDelegate(ba, "pnlhitam_click", false))
	 {return ((String) Debug.delegate(ba, "pnlhitam_click", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub pnlhitam_Click";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="pnlhitam.Visible = Not(pnlhitam.Visible)";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.Not(__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
}