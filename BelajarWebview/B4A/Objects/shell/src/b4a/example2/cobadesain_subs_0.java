package b4a.example2;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cobadesain_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "cobadesain","b4xpage_created", __ref, _root1);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _t = RemoteObject.createImmutable(0);
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 42;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Root = Root1";
Debug.ShouldStop(1024);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 45;BA.debugLine="Root.LoadLayout(\"l_utama\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("l_utama")),__ref.getField(false, "ba"));
 BA.debugLineNum = 46;BA.debugLine="versi2.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_versi2" /*RemoteObject*/ ).runClassMethod (b4a.example2.v2.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 49;BA.debugLine="B4XPages.AddMenuItem(Me,\"Riwayat Pembelian\")";
Debug.ShouldStop(65536);
cobadesain._b4xpages.runVoidMethod ("_addmenuitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("Riwayat Pembelian"))));
 BA.debugLineNum = 50;BA.debugLine="B4XPages.AddMenuItem(Me,\"Informasi Harga\")";
Debug.ShouldStop(131072);
cobadesain._b4xpages.runVoidMethod ("_addmenuitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("Informasi Harga"))));
 BA.debugLineNum = 51;BA.debugLine="B4XPages.AddMenuItem(Me,\"Informasi website\")";
Debug.ShouldStop(262144);
cobadesain._b4xpages.runVoidMethod ("_addmenuitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("Informasi website"))));
 BA.debugLineNum = 52;BA.debugLine="B4XPages.AddPage(\"v2\",versi2)";
Debug.ShouldStop(524288);
cobadesain._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("v2")),(Object)((__ref.getField(false,"_versi2" /*RemoteObject*/ ))));
 BA.debugLineNum = 53;BA.debugLine="Dim p As Panel  = xui.CreatePanel(\"\")";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 57;BA.debugLine="p.SetLayout(0,0,Root.Width,Root.Height)";
Debug.ShouldStop(16777216);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 58;BA.debugLine="CustomListView1.Add(p,\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 59;BA.debugLine="p.LoadLayout(\"l_atributReDesain\")";
Debug.ShouldStop(67108864);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_atributReDesain")),__ref.getField(false, "ba"));
 BA.debugLineNum = 62;BA.debugLine="Dim t As Int";
Debug.ShouldStop(536870912);
_t = RemoteObject.createImmutable(0);Debug.locals.put("t", _t);
 BA.debugLineNum = 63;BA.debugLine="If (btnCobaLagi.Top+btnCobaLagi.Height)>GetDevice";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_btncobalagi" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_btncobalagi" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),BA.numberCast(double.class, cobadesain.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height")))) { 
 BA.debugLineNum = 64;BA.debugLine="t=  btnCobaLagi.Top+btnCobaLagi.Height";
Debug.ShouldStop(-2147483648);
_t = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_btncobalagi" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_btncobalagi" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("t", _t);
 }else {
 BA.debugLineNum = 66;BA.debugLine="t = GetDeviceLayoutValues.Height";
Debug.ShouldStop(2);
_t = cobadesain.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height");Debug.locals.put("t", _t);
 };
 BA.debugLineNum = 70;BA.debugLine="Log(t)";
Debug.ShouldStop(32);
cobadesain.__c.runVoidMethod ("LogImpl","2983068",BA.NumberToString(_t),0);
 BA.debugLineNum = 71;BA.debugLine="CustomListView1.GetPanel(CustomListView1.Size-1).";
Debug.ShouldStop(64);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1))).runMethod(true,"setHeight",_t);
 BA.debugLineNum = 72;BA.debugLine="CustomListView1.AsView.Height = t";
Debug.ShouldStop(128);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setHeight",_t);
 BA.debugLineNum = 73;BA.debugLine="CustomListView1.sv.Height = t";
Debug.ShouldStop(256);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setHeight",_t);
 BA.debugLineNum = 74;BA.debugLine="CustomListView1.GetPanel(CustomListView1.Size-1).";
Debug.ShouldStop(512);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1))).runMethod(true,"setColor",cobadesain.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 78;BA.debugLine="Log(GetDeviceLayoutValues.Height)";
Debug.ShouldStop(8192);
cobadesain.__c.runVoidMethod ("LogImpl","2983076",BA.NumberToString(cobadesain.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height")),0);
 BA.debugLineNum = 79;BA.debugLine="Log(btnCobaLagi.Top+btnCobaLagi.Height)";
Debug.ShouldStop(16384);
cobadesain.__c.runVoidMethod ("LogImpl","2983077",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_btncobalagi" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_btncobalagi" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),0);
 BA.debugLineNum = 92;BA.debugLine="warna.Initialize(Colors.ARGB(150,0,0,0),5dip)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_warna" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(cobadesain.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 BA.debugLineNum = 93;BA.debugLine="pnlhitam = xui.CreatePanel(\"pnlhitam\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).setObject (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlhitam"))).getObject());
 BA.debugLineNum = 94;BA.debugLine="pnlhitam.Background = warna";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_warna" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 95;BA.debugLine="Root.AddView(pnlhitam,0,0,Root.Width,Root.Height)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 96;BA.debugLine="pnlhitam.SetElevationAnimated(0,5dip)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runVoidMethod ("SetElevationAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 BA.debugLineNum = 97;BA.debugLine="pnlhitam.Visible=False";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runMethod(true,"setVisible",cobadesain.__c.getField(true,"False"));
 BA.debugLineNum = 107;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(1024);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 108;BA.debugLine="cs.Initialize.Size(17).Append(\"Ikuti panduan foto";
Debug.ShouldStop(2048);
_cs.runMethod(false,"Initialize").runMethod(false,"Size",(Object)(BA.numberCast(int.class, 17))).runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ikuti panduan foto "))));
 BA.debugLineNum = 109;BA.debugLine="cs.Clickable(\"cs\", 1).Color(0xFF00A7FF).Append(\"i";
Debug.ShouldStop(4096);
_cs.runMethod(false,"Clickable",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("cs")),(Object)(RemoteObject.createImmutable((1)))).runMethod(false,"Color",(Object)(BA.numberCast(int.class, ((int)0xff00a7ff)))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ini ")))).runMethod(false,"Pop").runVoidMethod ("Pop");
 BA.debugLineNum = 110;BA.debugLine="cs.Append(\"untuk mempermudah pemilihan ukuran atr";
Debug.ShouldStop(8192);
_cs.runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("untuk mempermudah pemilihan ukuran atribut")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 111;BA.debugLine="cs.EnableClickEvents(Label1)";
Debug.ShouldStop(16384);
_cs.runVoidMethod ("EnableClickEvents",(Object)((__ref.getField(false,"_label1" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 112;BA.debugLine="Label1.Text = cs";
Debug.ShouldStop(32768);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cs.getObject()));
 BA.debugLineNum = 113;BA.debugLine="setTampilan";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example2.cobadesain.class, "_settampilan" /*RemoteObject*/ );
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncobalagi_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCobaLagi_Click (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("btncobalagi_click")) { return __ref.runUserSub(false, "cobadesain","btncobalagi_click", __ref);}
 BA.debugLineNum = 179;BA.debugLine="Private Sub btnCobaLagi_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "cobadesain","button1_click", __ref);}
 BA.debugLineNum = 183;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="B4XPages.ShowPage(\"v2\")";
Debug.ShouldStop(8388608);
cobadesain._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("v2")));
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cbhelm_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("cbHelm_CheckedChange (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("cbhelm_checkedchange")) { return __ref.runUserSub(false, "cobadesain","cbhelm_checkedchange", __ref, _checked);}
RemoteObject _cb = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _ortu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 324;BA.debugLine="Private Sub cbHelm_CheckedChange(Checked As Boolea";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="Dim cb As CheckBox";
Debug.ShouldStop(16);
_cb = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("cb", _cb);
 BA.debugLineNum = 326;BA.debugLine="cb = Sender";
Debug.ShouldStop(32);
_cb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper"), cobadesain.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 327;BA.debugLine="Dim ortu As Panel	  = cb.Parent";
Debug.ShouldStop(64);
_ortu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_ortu = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _cb.runMethod(false,"getParent"));Debug.locals.put("ortu", _ortu);Debug.locals.put("ortu", _ortu);
 BA.debugLineNum = 330;BA.debugLine="ortu.GetView(4).As(EditText).Visible = Checked";
Debug.ShouldStop(512);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), _ortu.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).getObject())).runMethod(true,"setVisible",_checked);
 BA.debugLineNum = 332;BA.debugLine="If Checked = False Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_checked,cobadesain.__c.getField(true,"False"))) { 
 BA.debugLineNum = 333;BA.debugLine="ortu.Height = Label1.Top + txtJaket.Top+txtJaket.";
Debug.ShouldStop(4096);
_ortu.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_txtjaket" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_txtjaket" /*RemoteObject*/ ).runMethod(true,"getHeight"),cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+++",3, 1));
 }else {
 BA.debugLineNum = 335;BA.debugLine="ortu.Height = Label1.Top + txtHelm.Top+txtHelm.He";
Debug.ShouldStop(16384);
_ortu.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_txthelm" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_txthelm" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "++",2, 1));
 };
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cbjaket_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("cbJaket_CheckedChange (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,297);
if (RapidSub.canDelegate("cbjaket_checkedchange")) { return __ref.runUserSub(false, "cobadesain","cbjaket_checkedchange", __ref, _checked);}
RemoteObject _cb = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _ortu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 297;BA.debugLine="Private Sub cbJaket_CheckedChange(Checked As Boole";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="Dim cb As CheckBox";
Debug.ShouldStop(512);
_cb = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("cb", _cb);
 BA.debugLineNum = 299;BA.debugLine="cb = Sender";
Debug.ShouldStop(1024);
_cb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper"), cobadesain.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 300;BA.debugLine="Dim ortu As Panel	  = cb.Parent";
Debug.ShouldStop(2048);
_ortu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_ortu = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _cb.runMethod(false,"getParent"));Debug.locals.put("ortu", _ortu);Debug.locals.put("ortu", _ortu);
 BA.debugLineNum = 302;BA.debugLine="ortu.GetView(3).As(EditText).Visible = Checked";
Debug.ShouldStop(8192);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), _ortu.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject())).runMethod(true,"setVisible",_checked);
 BA.debugLineNum = 305;BA.debugLine="If Checked=False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_checked,cobadesain.__c.getField(true,"False"))) { 
 BA.debugLineNum = 307;BA.debugLine="ortu.GetView(4).As(EditText).Top =  ortu.GetView";
Debug.ShouldStop(262144);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), _ortu.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).getObject())).runMethod(true,"setTop",_ortu.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getTop"));
 BA.debugLineNum = 308;BA.debugLine="ortu.Height = Label1.Top + txtJaket.Top+txtJaket";
Debug.ShouldStop(524288);
_ortu.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_txtjaket" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_txtjaket" /*RemoteObject*/ ).runMethod(true,"getHeight"),cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+++",3, 1));
 }else {
 BA.debugLineNum = 310;BA.debugLine="ortu.GetView(4).Top = ortu.GetView(3).Top + ortu";
Debug.ShouldStop(2097152);
_ortu.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_ortu.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getTop"),_ortu.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getHeight"),cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "++",2, 1));
 BA.debugLineNum = 311;BA.debugLine="If ortu.GetView(2).As(CheckBox).Checked =False T";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper"), _ortu.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject())).runMethod(true,"getChecked"),cobadesain.__c.getField(true,"False"))) { 
 BA.debugLineNum = 312;BA.debugLine="ortu.Height = Label1.Top + txtJaket.Top+txtJake";
Debug.ShouldStop(8388608);
_ortu.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_txtjaket" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_txtjaket" /*RemoteObject*/ ).runMethod(true,"getHeight"),cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+++",3, 1));
 }else {
 BA.debugLineNum = 315;BA.debugLine="ortu.Height = Label1.Top + txtHelm.Top+txtHelm.H";
Debug.ShouldStop(67108864);
_ortu.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_txthelm" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_txthelm" /*RemoteObject*/ ).runMethod(true,"getHeight"),cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+++",3, 1));
 };
 };
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cekkondisi(RemoteObject __ref,RemoteObject _ck1,RemoteObject _ck2,RemoteObject _ortu1) throws Exception{
try {
		Debug.PushSubsStack("cekkondisi (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("cekkondisi")) { return __ref.runUserSub(false, "cobadesain","cekkondisi", __ref, _ck1, _ck2, _ortu1);}
Debug.locals.put("ck1", _ck1);
Debug.locals.put("ck2", _ck2);
Debug.locals.put("ortu1", _ortu1);
 BA.debugLineNum = 346;BA.debugLine="Sub cekkondisi ( ck1 As CheckBox,ck2 As CheckBox,o";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="If ck1.Checked =False And ck2.Checked = False The";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_ck1.runMethod(true,"getChecked"),cobadesain.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_ck2.runMethod(true,"getChecked"),cobadesain.__c.getField(true,"False"))) { 
 };
 BA.debugLineNum = 353;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
cobadesain._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",cobadesain._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
cobadesain._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cobadesain._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private Label1 As Label";
cobadesain._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",cobadesain._label1);
 //BA.debugLineNum = 5;BA.debugLine="Private Label2 As Label";
cobadesain._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2",cobadesain._label2);
 //BA.debugLineNum = 6;BA.debugLine="Private Label3 As Label";
cobadesain._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label3",cobadesain._label3);
 //BA.debugLineNum = 7;BA.debugLine="Private Button1 As Button";
cobadesain._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1",cobadesain._button1);
 //BA.debugLineNum = 8;BA.debugLine="Private ImageView1 As ImageView";
cobadesain._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageview1",cobadesain._imageview1);
 //BA.debugLineNum = 9;BA.debugLine="Private lblKamera As Label";
cobadesain._lblkamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblkamera",cobadesain._lblkamera);
 //BA.debugLineNum = 10;BA.debugLine="Private Label5 As Label";
cobadesain._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label5",cobadesain._label5);
 //BA.debugLineNum = 11;BA.debugLine="Private txtAlamat As EditText";
cobadesain._txtalamat = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtalamat",cobadesain._txtalamat);
 //BA.debugLineNum = 12;BA.debugLine="Private Label4 As Label";
cobadesain._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label4",cobadesain._label4);
 //BA.debugLineNum = 13;BA.debugLine="Private btnCobaLagi As Button";
cobadesain._btncobalagi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btncobalagi",cobadesain._btncobalagi);
 //BA.debugLineNum = 19;BA.debugLine="Dim etJaket,etHelm As EditText";
cobadesain._etjaket = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_etjaket",cobadesain._etjaket);
cobadesain._ethelm = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_ethelm",cobadesain._ethelm);
 //BA.debugLineNum = 20;BA.debugLine="Dim limit As IME";
cobadesain._limit = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_limit",cobadesain._limit);
 //BA.debugLineNum = 21;BA.debugLine="Dim warna As ColorDrawable";
cobadesain._warna = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");__ref.setField("_warna",cobadesain._warna);
 //BA.debugLineNum = 22;BA.debugLine="Dim pnlhitam As Panel";
cobadesain._pnlhitam = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlhitam",cobadesain._pnlhitam);
 //BA.debugLineNum = 24;BA.debugLine="Private xImageSliderIG1 As xImageSliderIG";
cobadesain._ximagesliderig1 = RemoteObject.createNew ("b4a.example2.ximagesliderig");__ref.setField("_ximagesliderig1",cobadesain._ximagesliderig1);
 //BA.debugLineNum = 25;BA.debugLine="Private clvInput As CustomListView";
cobadesain._clvinput = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clvinput",cobadesain._clvinput);
 //BA.debugLineNum = 26;BA.debugLine="Private cbHelm As CheckBox";
cobadesain._cbhelm = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_cbhelm",cobadesain._cbhelm);
 //BA.debugLineNum = 27;BA.debugLine="Private cbJaket As CheckBox";
cobadesain._cbjaket = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_cbjaket",cobadesain._cbjaket);
 //BA.debugLineNum = 28;BA.debugLine="Private txtJaket As EditText";
cobadesain._txtjaket = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtjaket",cobadesain._txtjaket);
 //BA.debugLineNum = 29;BA.debugLine="Private txtHelm As EditText";
cobadesain._txthelm = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txthelm",cobadesain._txthelm);
 //BA.debugLineNum = 30;BA.debugLine="Private CustomListView1 As CustomListView";
cobadesain._customlistview1 = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_customlistview1",cobadesain._customlistview1);
 //BA.debugLineNum = 31;BA.debugLine="Private nIndex As Int";
cobadesain._nindex = RemoteObject.createImmutable(0);__ref.setField("_nindex",cobadesain._nindex);
 //BA.debugLineNum = 32;BA.debugLine="Dim pnl As Panel";
cobadesain._pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl",cobadesain._pnl);
 //BA.debugLineNum = 33;BA.debugLine="Dim versi2 As V2";
cobadesain._versi2 = RemoteObject.createNew ("b4a.example2.v2");__ref.setField("_versi2",cobadesain._versi2);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvhelm_itemlongclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvHelm_ItemLongClick (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("clvhelm_itemlongclick")) { return __ref.runUserSub(false, "cobadesain","clvhelm_itemlongclick", __ref, _index, _value);}
Debug.locals.put("index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 171;BA.debugLine="Private Sub clvHelm_ItemLongClick (index As Int, V";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="Log(\"clvHelm_ItemLongClick\")";
Debug.ShouldStop(2048);
cobadesain.__c.runVoidMethod ("LogImpl","21310721",RemoteObject.createImmutable("clvHelm_ItemLongClick"),0);
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvinput_itemlongclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvInput_ItemLongClick (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("clvinput_itemlongclick")) { return __ref.runUserSub(false, "cobadesain","clvinput_itemlongclick", __ref, _index, _value);}
Debug.locals.put("index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 168;BA.debugLine="Private Sub clvInput_ItemLongClick (index As Int,";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="createOption(Root,index)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example2.cobadesain.class, "_createoption" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )),(Object)(_index));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvjaket_itemlongclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvJaket_ItemLongClick (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("clvjaket_itemlongclick")) { return __ref.runUserSub(false, "cobadesain","clvjaket_itemlongclick", __ref, _index, _value);}
Debug.locals.put("index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 175;BA.debugLine="Private Sub clvJaket_ItemLongClick (index As Int,";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="Log(\"clvJaket_ItemLongClick\")";
Debug.ShouldStop(32768);
cobadesain.__c.runVoidMethod ("LogImpl","21376257",RemoteObject.createImmutable("clvJaket_ItemLongClick"),0);
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createoption(RemoteObject __ref,RemoteObject _rute,RemoteObject _dd) throws Exception{
try {
		Debug.PushSubsStack("createOption (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,355);
if (RapidSub.canDelegate("createoption")) { return __ref.runUserSub(false, "cobadesain","createoption", __ref, _rute, _dd);}
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _lsview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
RemoteObject _cd2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("rute", _rute);
Debug.locals.put("dd", _dd);
 BA.debugLineNum = 355;BA.debugLine="Sub createOption(rute As B4XView,dd As Int)";
Debug.ShouldStop(4);
 BA.debugLineNum = 356;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(8);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 357;BA.debugLine="Dim lsview As ListView";
Debug.ShouldStop(16);
_lsview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");Debug.locals.put("lsview", _lsview);
 BA.debugLineNum = 358;BA.debugLine="lsview.Initialize(\"lv\")";
Debug.ShouldStop(32);
_lsview.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lv")));
 BA.debugLineNum = 359;BA.debugLine="pnl  =xui.CreatePanel(\"Option\")";
Debug.ShouldStop(64);
__ref.getField(false,"_pnl" /*RemoteObject*/ ).setObject (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Option"))).getObject());
 BA.debugLineNum = 360;BA.debugLine="cd.Initialize(xui.Color_ARGB(150,0,0,0),0)";
Debug.ShouldStop(128);
_cd.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 361;BA.debugLine="pnl.Background = cd";
Debug.ShouldStop(256);
__ref.getField(false,"_pnl" /*RemoteObject*/ ).runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 364;BA.debugLine="rute.AddView(pnl,0,0,GetDeviceLayoutValues.Width,";
Debug.ShouldStop(2048);
_rute.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(cobadesain.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width")),(Object)(cobadesain.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height")));
 BA.debugLineNum = 365;BA.debugLine="lsview.AddSingleLine2(\"Hapus\",dd)";
Debug.ShouldStop(4096);
_lsview.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence("Hapus")),(Object)((_dd)));
 BA.debugLineNum = 366;BA.debugLine="lsview.AddSingleLine2(\"Simpan\",dd)";
Debug.ShouldStop(8192);
_lsview.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence("Simpan")),(Object)((_dd)));
 BA.debugLineNum = 367;BA.debugLine="lsview.AddSingleLine2(\"Edit\",dd)";
Debug.ShouldStop(16384);
_lsview.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence("Edit")),(Object)((_dd)));
 BA.debugLineNum = 368;BA.debugLine="lsview.Padding=Array As Int(30dip,0,0,0)";
Debug.ShouldStop(32768);
_lsview.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 369;BA.debugLine="Dim cd2 As ColorDrawable";
Debug.ShouldStop(65536);
_cd2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd2", _cd2);
 BA.debugLineNum = 370;BA.debugLine="cd2.Initialize(0xff1E2029,10dip)";
Debug.ShouldStop(131072);
_cd2.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, ((int)0xff1e2029))),(Object)(cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 372;BA.debugLine="lsview.Background  = cd2";
Debug.ShouldStop(524288);
_lsview.runMethod(false,"setBackground",(_cd2.getObject()));
 BA.debugLineNum = 373;BA.debugLine="pnl.AddView(lsview,0,GetDeviceLayoutValues.Height";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pnl" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_lsview.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {cobadesain.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height"),cobadesain.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(cobadesain.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width")),(Object)(cobadesain.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cs_click(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("cs_Click (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("cs_click")) { return __ref.runUserSub(false, "cobadesain","cs_click", __ref, _tag);}
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 158;BA.debugLine="Sub cs_Click (Tag As Object)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="tampilanslideig";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example2.cobadesain.class, "_tampilanslideig" /*RemoteObject*/ );
 BA.debugLineNum = 160;BA.debugLine="Log($\"You have clicked on word: ${Tag}\"$)";
Debug.ShouldStop(-2147483648);
cobadesain.__c.runVoidMethod ("LogImpl","21179650",(RemoteObject.concat(RemoteObject.createImmutable("You have clicked on word: "),cobadesain.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_tag)),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ethelm_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("etHelm_TextChanged (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("ethelm_textchanged")) { return __ref.runUserSub(false, "cobadesain","ethelm_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 275;BA.debugLine="Private Sub etHelm_TextChanged (Old As String, New";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="Log(New)";
Debug.ShouldStop(524288);
cobadesain.__c.runVoidMethod ("LogImpl","21900545",_new,0);
 BA.debugLineNum = 277;BA.debugLine="If Sender.As(EditText).IsInitialized = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), cobadesain.__c.runMethod(false,"Sender",__ref.getField(false, "ba")))).runMethod(true,"IsInitialized"),cobadesain.__c.getField(true,"True"))) { 
 BA.debugLineNum = 279;BA.debugLine="Log	(Sender.As(EditText).IsInitialized&\" terini";
Debug.ShouldStop(4194304);
cobadesain.__c.runVoidMethod ("LogImpl","21900548",RemoteObject.concat((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), cobadesain.__c.runMethod(false,"Sender",__ref.getField(false, "ba")))).runMethod(true,"IsInitialized"),RemoteObject.createImmutable(" terinisialisasi")),0);
 BA.debugLineNum = 280;BA.debugLine="Log	(\"Sender.As(EditText).Text\"&Sender.As(EditTe";
Debug.ShouldStop(8388608);
cobadesain.__c.runVoidMethod ("LogImpl","21900549",RemoteObject.concat(RemoteObject.createImmutable("Sender.As(EditText).Text"),(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), cobadesain.__c.runMethod(false,"Sender",__ref.getField(false, "ba")))).runMethod(true,"getText")),0);
 };
 BA.debugLineNum = 284;BA.debugLine="If New.Length >4 Then	 limit.HideKeyboard";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 4))) { 
__ref.getField(false,"_limit" /*RemoteObject*/ ).runVoidMethod ("HideKeyboard",__ref.getField(false, "ba"));};
 BA.debugLineNum = 290;BA.debugLine="If etHelm.IsInitialized Then";
Debug.ShouldStop(2);
if (__ref.getField(false,"_ethelm" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _etjaket_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("etJaket_TextChanged (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("etjaket_textchanged")) { return __ref.runUserSub(false, "cobadesain","etjaket_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 293;BA.debugLine="Private Sub etJaket_TextChanged (Old As String, Ne";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="Log(New)";
Debug.ShouldStop(32);
cobadesain.__c.runVoidMethod ("LogImpl","21966081",_new,0);
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cobadesain","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Return Me";
Debug.ShouldStop(32);
if (true) return __ref;
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("label2_click")) { return __ref.runUserSub(false, "cobadesain","label2_click", __ref);}
 BA.debugLineNum = 269;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 271;BA.debugLine="nIndex = setclv(clvInput,\"etJaket\",nIndex)";
Debug.ShouldStop(16384);
__ref.setField ("_nindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example2.cobadesain.class, "_setclv" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_clvinput" /*RemoteObject*/ )),(Object)(BA.ObjectToString("etJaket")),(Object)(__ref.getField(true,"_nindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label3_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label3_Click (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("label3_click")) { return __ref.runUserSub(false, "cobadesain","label3_click", __ref);}
 BA.debugLineNum = 256;BA.debugLine="Private Sub Label3_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="If clvInput.Size <>1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 259;BA.debugLine="clvInput.RemoveAt(clvInput.Size-1)";
Debug.ShouldStop(4);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 260;BA.debugLine="If nIndex >0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_nindex" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 261;BA.debugLine="nIndex = nIndex -1";
Debug.ShouldStop(16);
__ref.setField ("_nindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_nindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 };
 };
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblclose_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblclose_Click (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("lblclose_click")) { return __ref.runUserSub(false, "cobadesain","lblclose_click", __ref);}
 BA.debugLineNum = 186;BA.debugLine="Private Sub lblclose_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="If clvInput.Size>0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 188;BA.debugLine="clvInput.RemoveAt(clvInput.Size-1)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 189;BA.debugLine="nIndex =nIndex-1";
Debug.ShouldStop(268435456);
__ref.setField ("_nindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_nindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 };
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lv_ItemClick (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("lv_itemclick")) { return __ref.runUserSub(false, "cobadesain","lv_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 387;BA.debugLine="Private Sub lv_ItemClick (Position As Int, Value A";
Debug.ShouldStop(4);
 BA.debugLineNum = 388;BA.debugLine="Log(Position)";
Debug.ShouldStop(8);
cobadesain.__c.runVoidMethod ("LogImpl","22293761",BA.NumberToString(_position),0);
 BA.debugLineNum = 389;BA.debugLine="If Position =0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 390;BA.debugLine="clvInput.RemoveAt(clvInput.Size-1)";
Debug.ShouldStop(32);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 392;BA.debugLine="nIndex = nIndex -1";
Debug.ShouldStop(128);
__ref.setField ("_nindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_nindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 393;BA.debugLine="pnl.Visible=False";
Debug.ShouldStop(256);
__ref.getField(false,"_pnl" /*RemoteObject*/ ).runMethod(true,"setVisible",cobadesain.__c.getField(true,"False"));
 };
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _option_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Option_Click (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,396);
if (RapidSub.canDelegate("option_click")) { return __ref.runUserSub(false, "cobadesain","option_click", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 396;BA.debugLine="Private Sub Option_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 398;BA.debugLine="Dim p As Panel	 = Sender";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), cobadesain.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 399;BA.debugLine="p.RemoveAllViews";
Debug.ShouldStop(16384);
_p.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 400;BA.debugLine="p.Visible =False";
Debug.ShouldStop(32768);
_p.runMethod(true,"setVisible",cobadesain.__c.getField(true,"False"));
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlhitam_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlhitam_Click (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("pnlhitam_click")) { return __ref.runUserSub(false, "cobadesain","pnlhitam_click", __ref);}
 BA.debugLineNum = 118;BA.debugLine="Private Sub pnlhitam_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="pnlhitam.Visible = Not(pnlhitam.Visible)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runMethod(true,"setVisible",cobadesain.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runMethod(true,"getVisible"))));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclv(RemoteObject __ref,RemoteObject _clv,RemoteObject _edittext,RemoteObject _nawal) throws Exception{
try {
		Debug.PushSubsStack("setclv (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("setclv")) { return __ref.runUserSub(false, "cobadesain","setclv", __ref, _clv, _edittext, _nawal);}
RemoteObject _pnltampung = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("clv", _clv);
Debug.locals.put("edittext", _edittext);
Debug.locals.put("nawal", _nawal);
 BA.debugLineNum = 192;BA.debugLine="Sub setclv(clv As CustomListView,edittext As Strin";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="Dim pnlTampung As Panel";
Debug.ShouldStop(1);
_pnltampung = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlTampung", _pnltampung);
 BA.debugLineNum = 195;BA.debugLine="pnlTampung.Initialize(\"pnlTampung\")";
Debug.ShouldStop(4);
_pnltampung.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlTampung")));
 BA.debugLineNum = 196;BA.debugLine="pnlTampung.LoadLayout(\"l_InputDataAtribut\")";
Debug.ShouldStop(8);
_pnltampung.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_InputDataAtribut")),__ref.getField(false, "ba"));
 BA.debugLineNum = 197;BA.debugLine="pnlTampung.As(B4XView).SetColorAndBorder(Colors.W";
Debug.ShouldStop(16);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _pnltampung.getObject())).runVoidMethod ("SetColorAndBorder",(Object)(cobadesain.__c.getField(false,"Colors").getField(true,"White")),(Object)(cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(cobadesain.__c.getField(false,"Colors").getField(true,"Black")),(Object)(cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 199;BA.debugLine="pnlTampung.SetLayout(2dip,2dip,clv.AsView.Width/2";
Debug.ShouldStop(64);
_pnltampung.runVoidMethod ("SetLayout",(Object)(cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_clv.runMethod(false,"_asview").runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_clv.runMethod(false,"_asview").runMethod(true,"getHeight")));
 BA.debugLineNum = 211;BA.debugLine="Label1.Text =$\"Pilih Ukuran Atribut ${nawal+1} :\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Pilih Ukuran Atribut "),cobadesain.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.solve(new RemoteObject[] {_nawal,RemoteObject.createImmutable(1)}, "+",1, 1)))),RemoteObject.createImmutable(" :")))));
 BA.debugLineNum = 212;BA.debugLine="clv.Add(pnlTampung,\"\")";
Debug.ShouldStop(524288);
_clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _pnltampung.getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 213;BA.debugLine="txtJaket.Width = pnlTampung.Width -23dip";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtjaket" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_pnltampung.runMethod(true,"getWidth"),cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 23)))}, "-",1, 1));
 BA.debugLineNum = 214;BA.debugLine="txtHelm.Width = pnlTampung.Width -23dip";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txthelm" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_pnltampung.runMethod(true,"getWidth"),cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 23)))}, "-",1, 1));
 BA.debugLineNum = 240;BA.debugLine="nawal=nawal+1";
Debug.ShouldStop(32768);
_nawal = RemoteObject.solve(new RemoteObject[] {_nawal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nawal", _nawal);
 BA.debugLineNum = 241;BA.debugLine="Return nawal";
Debug.ShouldStop(65536);
if (true) return _nawal;
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settampilan(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("setTampilan (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("settampilan")) { return __ref.runUserSub(false, "cobadesain","settampilan", __ref);}
 BA.debugLineNum = 245;BA.debugLine="Sub setTampilan";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 248;BA.debugLine="nIndex = setclv(clvInput,\"etJaket\",nIndex)";
Debug.ShouldStop(8388608);
__ref.setField ("_nindex" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example2.cobadesain.class, "_setclv" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_clvinput" /*RemoteObject*/ )),(Object)(BA.ObjectToString("etJaket")),(Object)(__ref.getField(true,"_nindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tampilanslideig(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tampilanslideig (cobadesain) ","cobadesain",2,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("tampilanslideig")) { return __ref.runUserSub(false, "cobadesain","tampilanslideig", __ref);}
RemoteObject _pnltampung = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _sc = RemoteObject.declareNull("b4a.example2.main._slidercontainer");
RemoteObject _sliders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 121;BA.debugLine="Sub tampilanslideig";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="pnlhitam.Visible=True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runMethod(true,"setVisible",cobadesain.__c.getField(true,"True"));
 BA.debugLineNum = 123;BA.debugLine="Dim pnlTampung As Panel = xui.CreatePanel(\"\")";
Debug.ShouldStop(67108864);
_pnltampung = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnltampung = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("pnlTampung", _pnltampung);Debug.locals.put("pnlTampung", _pnltampung);
 BA.debugLineNum = 125;BA.debugLine="pnlTampung.LoadLayout(\"l_igSlide\")";
Debug.ShouldStop(268435456);
_pnltampung.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_igSlide")),__ref.getField(false, "ba"));
 BA.debugLineNum = 130;BA.debugLine="Dim sc As SliderContainer";
Debug.ShouldStop(2);
_sc = RemoteObject.createNew ("b4a.example2.main._slidercontainer");Debug.locals.put("sc", _sc);
 BA.debugLineNum = 131;BA.debugLine="Dim sliders As List";
Debug.ShouldStop(4);
_sliders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sliders", _sliders);
 BA.debugLineNum = 132;BA.debugLine="sliders.Initialize";
Debug.ShouldStop(8);
_sliders.runVoidMethod ("Initialize");
 BA.debugLineNum = 133;BA.debugLine="sc.Initialize";
Debug.ShouldStop(16);
_sc.runVoidMethod ("Initialize");
 BA.debugLineNum = 134;BA.debugLine="sc.slider = xImageSliderIG1";
Debug.ShouldStop(32);
_sc.setField ("slider" /*RemoteObject*/ ,__ref.getField(false,"_ximagesliderig1" /*RemoteObject*/ ));
 BA.debugLineNum = 136;BA.debugLine="sc.slider.ActivityHasActionBar = True";
Debug.ShouldStop(128);
_sc.getField(false,"slider" /*RemoteObject*/ ).runClassMethod (b4a.example2.ximagesliderig.class, "_setactivityhasactionbar",cobadesain.__c.getField(true,"True"));
 BA.debugLineNum = 137;BA.debugLine="sc.items.Initialize";
Debug.ShouldStop(256);
_sc.getField(false,"items" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 142;BA.debugLine="sc.items.Add(CreateMap(\"data\":\"Item 1-\"&2, \"image";
Debug.ShouldStop(8192);
_sc.getField(false,"items" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((cobadesain.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data")),(RemoteObject.concat(RemoteObject.createImmutable("Item 1-"),RemoteObject.createImmutable(2))),RemoteObject.createImmutable(("image")),(cobadesain.__c.runMethod(false,"LoadBitmap",(Object)(cobadesain.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ukuranhelm.jpg"))).getObject())})).getObject())));
 BA.debugLineNum = 143;BA.debugLine="sc.items.Add(CreateMap(\"data\":\"Item 1-\"&3, \"image";
Debug.ShouldStop(16384);
_sc.getField(false,"items" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((cobadesain.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data")),(RemoteObject.concat(RemoteObject.createImmutable("Item 1-"),RemoteObject.createImmutable(3))),RemoteObject.createImmutable(("image")),(cobadesain.__c.runMethod(false,"LoadBitmap",(Object)(cobadesain.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ukuranjaketcrop.jpg"))).getObject())})).getObject())));
 BA.debugLineNum = 147;BA.debugLine="sc.slider.setitems(sc.items)";
Debug.ShouldStop(262144);
_sc.getField(false,"slider" /*RemoteObject*/ ).runClassMethod (b4a.example2.ximagesliderig.class, "_setitems" /*RemoteObject*/ ,(Object)(_sc.getField(false,"items" /*RemoteObject*/ )));
 BA.debugLineNum = 148;BA.debugLine="sc.slider.SetZoomPanel(Root)";
Debug.ShouldStop(524288);
_sc.getField(false,"slider" /*RemoteObject*/ ).runClassMethod (b4a.example2.ximagesliderig.class, "_setzoompanel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 150;BA.debugLine="sliders.Add(sc)";
Debug.ShouldStop(2097152);
_sliders.runVoidMethod ("Add",(Object)((_sc)));
 BA.debugLineNum = 152;BA.debugLine="pnlhitam.AddView(pnlTampung,20dip,20dip,pnlhitam.";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_pnltampung.getObject())),(Object)(cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runMethod(true,"getWidth"),cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runMethod(true,"getHeight"),cobadesain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}