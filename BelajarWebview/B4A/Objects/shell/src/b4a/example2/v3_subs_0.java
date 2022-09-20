package b4a.example2;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class v3_subs_0 {


public static void  _ambilbank(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ambilBank (v3) ","v3",5,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("ambilbank")) { __ref.runUserSub(false, "v3","ambilbank", __ref); return;}
ResumableSub_ambilBank rsub = new ResumableSub_ambilBank(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ambilBank extends BA.ResumableSub {
public ResumableSub_ambilBank(b4a.example2.v3 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example2.v3 parent;
RemoteObject _getbank = RemoteObject.declareNull("b4a.example2.httpjob");
RemoteObject _jparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _job = RemoteObject.declareNull("b4a.example2.httpjob");
RemoteObject _ls = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _hs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tmp = null;
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ambilBank (v3) ","v3",5,__ref.getField(false, "ba"),__ref,354);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 355;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
 BA.debugLineNum = 357;BA.debugLine="bankMap.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_bankmap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 358;BA.debugLine="Dim getBank As HttpJob";
Debug.ShouldStop(32);
_getbank = RemoteObject.createNew ("b4a.example2.httpjob");Debug.locals.put("getBank", _getbank);
 BA.debugLineNum = 359;BA.debugLine="Dim jParser As JSONParser";
Debug.ShouldStop(64);
_jparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jParser", _jparser);
 BA.debugLineNum = 361;BA.debugLine="getBank.Initialize(\"\",Me)";
Debug.ShouldStop(256);
_getbank.runClassMethod (b4a.example2.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 362;BA.debugLine="getBank.PostString(\"https://misterkong.com/kajek";
Debug.ShouldStop(512);
_getbank.runClassMethod (b4a.example2.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://misterkong.com/kajek/services/_getBank.php")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 363;BA.debugLine="Wait For (getBank) JobDone (job As HttpJob)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "v3", "ambilbank"), (_getbank));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 364;BA.debugLine="If job.Success=True Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"True"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 367;BA.debugLine="jParser.Initialize(job.GetString)";
Debug.ShouldStop(16384);
_jparser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (b4a.example2.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 368;BA.debugLine="Dim ls As List = jParser.NextArray";
Debug.ShouldStop(32768);
_ls = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ls = _jparser.runMethod(false,"NextArray");Debug.locals.put("ls", _ls);Debug.locals.put("ls", _ls);
 BA.debugLineNum = 369;BA.debugLine="For Each hs As Map In ls";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//for
this.state = 10;
_hs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group11 = _ls;
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("hs", _hs);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 10;
if (index11 < groupLen11) {
this.state = 9;
_hs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group11.runMethod(false,"Get",index11));Debug.locals.put("hs", _hs);}
if (true) break;

case 17:
//C
this.state = 16;
index11++;
Debug.locals.put("hs", _hs);
if (true) break;

case 9:
//C
this.state = 17;
 BA.debugLineNum = 373;BA.debugLine="bankMap.Put(hs.Get(\"nama_bank\"),Array As Strin";
Debug.ShouldStop(1048576);
__ref.getField(false,"_bankmap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(_hs.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama_bank"))))),(Object)((RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString(_hs.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("kd_bank_kong"))))),BA.ObjectToString(_hs.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("no_rekening"))))),BA.ObjectToString(_hs.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama_bank"))))),BA.ObjectToString(_hs.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("atas_nama")))))}))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("hs", _hs);
;
 if (true) break;

case 11:
//C
this.state = 14;
;
 BA.debugLineNum = 376;BA.debugLine="job.Release";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4a.example2.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 378;BA.debugLine="Dim tmp () As String = bankMap.get(\"BCA\")";
Debug.ShouldStop(33554432);
_tmp = (__ref.getField(false,"_bankmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BCA")))));Debug.locals.put("tmp", _tmp);Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 379;BA.debugLine="Log(tmp(0))";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","24522009",_tmp.getArrayElement(true,BA.numberCast(int.class, 0)),0);
 BA.debugLineNum = 380;BA.debugLine="Log(tmp(1))";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","24522010",_tmp.getArrayElement(true,BA.numberCast(int.class, 1)),0);
 BA.debugLineNum = 381;BA.debugLine="lbnorek.Text = tmp(1)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lbnorek" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tmp.getArrayElement(true,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 382;BA.debugLine="lban.Text = tmp(3)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lban" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tmp.getArrayElement(true,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 384;BA.debugLine="Log(tmp(2))";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","24522014",_tmp.getArrayElement(true,BA.numberCast(int.class, 2)),0);
 BA.debugLineNum = 385;BA.debugLine="Log(tmp(3))";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","24522015",_tmp.getArrayElement(true,BA.numberCast(int.class, 3)),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 388;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","24522018",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (v3) ","v3",5,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "v3","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 65;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Root = Root1";
Debug.ShouldStop(2);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 67;BA.debugLine="dtharga.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_dtharga" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="Root.LoadLayout(\"l_Scroll_View\")";
Debug.ShouldStop(16);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("l_Scroll_View")),__ref.getField(false, "ba"));
 BA.debugLineNum = 70;BA.debugLine="ScrollView1.Panel.LoadLayout(\"l_atributRequest\")";
Debug.ShouldStop(32);
__ref.getField(false,"_scrollview1" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_atributRequest")),__ref.getField(false, "ba"));
 BA.debugLineNum = 71;BA.debugLine="ScrollView1.Panel.Height  = Button1.Top + Button1";
Debug.ShouldStop(64);
__ref.getField(false,"_scrollview1" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_button1" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_button1" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 136;BA.debugLine="pnlhitam = xui.CreatePanel(\"pnlhitam\")";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).setObject (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlhitam"))).getObject());
 BA.debugLineNum = 137;BA.debugLine="pnlhitam.SetLayout(0,0,GetDeviceLayoutValues.Widt";
Debug.ShouldStop(256);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(v3.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width")),(Object)(v3.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height")));
 BA.debugLineNum = 138;BA.debugLine="warnaTransGelap.Initialize(xui.Color_ARGB(150,0,0";
Debug.ShouldStop(512);
__ref.getField(false,"_warnatransgelap" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 139;BA.debugLine="pnlhitam.Background=warnaTransGelap";
Debug.ShouldStop(1024);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_warnatransgelap" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 140;BA.debugLine="ambilBank";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example2.v3.class, "_ambilbank" /*void*/ );
 BA.debugLineNum = 145;BA.debugLine="getdataAtribut";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example2.v3.class, "_getdataatribut" /*void*/ );
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("btnCobaLagi_Click (v3) ","v3",5,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("btncobalagi_click")) { return __ref.runUserSub(false, "v3","btncobalagi_click", __ref);}
 BA.debugLineNum = 158;BA.debugLine="Private Sub btnCobaLagi_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Button1_Click (v3) ","v3",5,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "v3","button1_click", __ref);}
RemoteObject _b2 = RemoteObject.declareNull("b4a.example2.v2");
 BA.debugLineNum = 170;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Dim b2 As V2";
Debug.ShouldStop(1024);
_b2 = RemoteObject.createNew ("b4a.example2.v2");Debug.locals.put("b2", _b2);
 BA.debugLineNum = 172;BA.debugLine="b2.Initialize";
Debug.ShouldStop(2048);
_b2.runClassMethod (b4a.example2.v2.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 173;BA.debugLine="B4XPages.AddPage(\"v2\",b2)";
Debug.ShouldStop(4096);
v3._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("v2")),(Object)((_b2)));
 BA.debugLineNum = 174;BA.debugLine="B4XPages.ShowPage(\"v2\")";
Debug.ShouldStop(8192);
v3._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("v2")));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 28;BA.debugLine="Private Root As B4XView 'ignore";
v3._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",v3._root);
 //BA.debugLineNum = 29;BA.debugLine="Private xui As XUI 'ignore";
v3._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",v3._xui);
 //BA.debugLineNum = 30;BA.debugLine="Private CLVGlob As CustomListView";
v3._clvglob = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clvglob",v3._clvglob);
 //BA.debugLineNum = 31;BA.debugLine="Dim pnlhitam,pnlputih,pnltampung As Panel";
v3._pnlhitam = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlhitam",v3._pnlhitam);
v3._pnlputih = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlputih",v3._pnlputih);
v3._pnltampung = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnltampung",v3._pnltampung);
 //BA.debugLineNum = 32;BA.debugLine="Dim warnaTransGelap As ColorDrawable";
v3._warnatransgelap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");__ref.setField("_warnatransgelap",v3._warnatransgelap);
 //BA.debugLineNum = 33;BA.debugLine="Private Label1 As Label";
v3._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",v3._label1);
 //BA.debugLineNum = 35;BA.debugLine="Private Button1 As Button";
v3._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1",v3._button1);
 //BA.debugLineNum = 36;BA.debugLine="Private ImageView1 As ImageView";
v3._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageview1",v3._imageview1);
 //BA.debugLineNum = 37;BA.debugLine="Private lblKamera As Label";
v3._lblkamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblkamera",v3._lblkamera);
 //BA.debugLineNum = 38;BA.debugLine="Private btnCobaLagi As Button";
v3._btncobalagi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btncobalagi",v3._btncobalagi);
 //BA.debugLineNum = 39;BA.debugLine="Private clvInput As CustomListView";
v3._clvinput = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clvinput",v3._clvinput);
 //BA.debugLineNum = 40;BA.debugLine="Private lban As Label";
v3._lban = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lban",v3._lban);
 //BA.debugLineNum = 41;BA.debugLine="Private lbnorek As Label";
v3._lbnorek = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbnorek",v3._lbnorek);
 //BA.debugLineNum = 42;BA.debugLine="Private lblTotalHarga As Label";
v3._lbltotalharga = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotalharga",v3._lbltotalharga);
 //BA.debugLineNum = 43;BA.debugLine="Private txtAlamat As EditText";
v3._txtalamat = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtalamat",v3._txtalamat);
 //BA.debugLineNum = 45;BA.debugLine="Private ivBarang As ImageView";
v3._ivbarang = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_ivbarang",v3._ivbarang);
 //BA.debugLineNum = 46;BA.debugLine="Private lblDeskripsi As Label";
v3._lbldeskripsi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldeskripsi",v3._lbldeskripsi);
 //BA.debugLineNum = 47;BA.debugLine="Private lblTitle As Label";
v3._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitle",v3._lbltitle);
 //BA.debugLineNum = 48;BA.debugLine="Dim dtharga As Map";
v3._dtharga = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_dtharga",v3._dtharga);
 //BA.debugLineNum = 49;BA.debugLine="Dim bankMap As Map";
v3._bankmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_bankmap",v3._bankmap);
 //BA.debugLineNum = 50;BA.debugLine="Private lblTambah As Label";
v3._lbltambah = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltambah",v3._lbltambah);
 //BA.debugLineNum = 51;BA.debugLine="Private lblJml As Label";
v3._lbljml = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbljml",v3._lbljml);
 //BA.debugLineNum = 52;BA.debugLine="Private lblMin As Label";
v3._lblmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmin",v3._lblmin);
 //BA.debugLineNum = 53;BA.debugLine="Private lblPlus As Label";
v3._lblplus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblplus",v3._lblplus);
 //BA.debugLineNum = 54;BA.debugLine="Private ScrollView1 As ScrollView";
v3._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollview1",v3._scrollview1);
 //BA.debugLineNum = 55;BA.debugLine="Dim nested As CLVNested";
v3._nested = RemoteObject.createNew ("b4a.example2.clvnested");__ref.setField("_nested",v3._nested);
 //BA.debugLineNum = 56;BA.debugLine="Private Panel1 As Panel";
v3._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",v3._panel1);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvglob_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVGlob_ItemClick (v3) ","v3",5,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("clvglob_itemclick")) { return __ref.runUserSub(false, "v3","clvglob_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 181;BA.debugLine="Private Sub CLVGlob_ItemClick (Index As Int, Value";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="Log(\"test\")";
Debug.ShouldStop(2097152);
v3.__c.runVoidMethod ("LogImpl","24390913",RemoteObject.createImmutable("test"),0);
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getdataatribut(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getdataAtribut (v3) ","v3",5,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("getdataatribut")) { __ref.runUserSub(false, "v3","getdataatribut", __ref); return;}
ResumableSub_getdataAtribut rsub = new ResumableSub_getdataAtribut(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getdataAtribut extends BA.ResumableSub {
public ResumableSub_getdataAtribut(b4a.example2.v3 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example2.v3 parent;
RemoteObject _hargapost = RemoteObject.declareNull("b4a.example2.httpjob");
RemoteObject _job = RemoteObject.declareNull("b4a.example2.httpjob");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _ls = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tl = RemoteObject.createImmutable(0);
RemoteObject _ii = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ppp = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject group15;
int index15;
int groupLen15;
RemoteObject group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getdataAtribut (v3) ","v3",5,__ref.getField(false, "ba"),__ref,185);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 199;BA.debugLine="Dim hargapost As HttpJob";
Debug.ShouldStop(64);
_hargapost = RemoteObject.createNew ("b4a.example2.httpjob");Debug.locals.put("hargapost", _hargapost);
 BA.debugLineNum = 200;BA.debugLine="hargapost.Initialize(\"\",Me)";
Debug.ShouldStop(128);
_hargapost.runClassMethod (b4a.example2.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 201;BA.debugLine="hargapost.PostString(\"https://misterkong.com/kong";
Debug.ShouldStop(256);
_hargapost.runClassMethod (b4a.example2.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://misterkong.com/kong_api/api_rider/list")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("imei="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._main._imei /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 207;BA.debugLine="Wait For (hargapost)JobDone(job As HttpJob)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "v3", "getdataatribut"), (_hargapost));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 208;BA.debugLine="If job.Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 11;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 209;BA.debugLine="Log	(job.GetString)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","24456472",_job.runClassMethod (b4a.example2.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 210;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(131072);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 211;BA.debugLine="Dim ls As List";
Debug.ShouldStop(262144);
_ls = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ls", _ls);
 BA.debugLineNum = 212;BA.debugLine="jp.Initialize(job.GetString)";
Debug.ShouldStop(524288);
_jp.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (b4a.example2.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 213;BA.debugLine="ls = jp.NextObject.Get(\"data\").As(List)";
Debug.ShouldStop(1048576);
_ls = (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _jp.runMethod(false,"NextObject").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data"))))));Debug.locals.put("ls", _ls);
 BA.debugLineNum = 215;BA.debugLine="Log(\"att\"&ls.Get(0).As(Map).Get(\"id\"))";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","24456478",RemoteObject.concat(RemoteObject.createImmutable("att"),(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _ls.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 216;BA.debugLine="Log(\"att\"&ls.Get(1).As(Map).Get(\"id\"))";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","24456479",RemoteObject.concat(RemoteObject.createImmutable("att"),(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _ls.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 217;BA.debugLine="Log(\"att\"&ls.Get(2).As(Map).Get(\"id\"))";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","24456480",RemoteObject.concat(RemoteObject.createImmutable("att"),(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _ls.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 218;BA.debugLine="Dim tl As Int =1";
Debug.ShouldStop(33554432);
_tl = BA.numberCast(int.class, 1);Debug.locals.put("tl", _tl);Debug.locals.put("tl", _tl);
 BA.debugLineNum = 219;BA.debugLine="For Each ii As Map In ls";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//for
this.state = 7;
_ii = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group15 = _ls;
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("ii", _ii);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index15 < groupLen15) {
this.state = 6;
_ii = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group15.runMethod(false,"Get",index15));Debug.locals.put("ii", _ii);}
if (true) break;

case 14:
//C
this.state = 13;
index15++;
Debug.locals.put("ii", _ii);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 221;BA.debugLine="dtharga = CreateMap(\"att\"&tl:ii)";
Debug.ShouldStop(268435456);
__ref.setField ("_dtharga" /*RemoteObject*/ ,parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(RemoteObject.concat(RemoteObject.createImmutable("att"),_tl)),(_ii.getObject())})));
 BA.debugLineNum = 222;BA.debugLine="tl = tl +1";
Debug.ShouldStop(536870912);
_tl = RemoteObject.solve(new RemoteObject[] {_tl,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("tl", _tl);
 if (true) break;
if (true) break;
Debug.locals.put("ii", _ii);
;
 BA.debugLineNum = 234;BA.debugLine="For Each dt As Map In ls";
Debug.ShouldStop(512);

case 7:
//for
this.state = 10;
_dt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group19 = _ls;
index19 = 0;
groupLen19 = group19.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("dt", _dt);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if (index19 < groupLen19) {
this.state = 9;
_dt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group19.runMethod(false,"Get",index19));Debug.locals.put("dt", _dt);}
if (true) break;

case 16:
//C
this.state = 15;
index19++;
Debug.locals.put("dt", _dt);
if (true) break;

case 9:
//C
this.state = 16;
 BA.debugLineNum = 235;BA.debugLine="Dim ppp As Panel  = xui.CreatePanel(\"\")";
Debug.ShouldStop(1024);
_ppp = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_ppp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("ppp", _ppp);Debug.locals.put("ppp", _ppp);
 BA.debugLineNum = 236;BA.debugLine="ppp.SetLayout(0,0,clvInput.AsView.Width,80dip)";
Debug.ShouldStop(2048);
_ppp.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 BA.debugLineNum = 237;BA.debugLine="ppp.LoadLayout(\"l_TemplateAtribut\")";
Debug.ShouldStop(4096);
_ppp.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_TemplateAtribut")),__ref.getField(false, "ba"));
 BA.debugLineNum = 238;BA.debugLine="ppp.SetLayout(0,0,clvInput.AsView.Width,lblDesk";
Debug.ShouldStop(8192);
_ppp.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lbldeskripsi" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_lbldeskripsi" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)));
 BA.debugLineNum = 240;BA.debugLine="lblTitle.Text = dt.Get(\"nama\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama"))))));
 BA.debugLineNum = 241;BA.debugLine="Panel1.Elevation = 10dip";
Debug.ShouldStop(65536);
__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethod(true,"setElevation",BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 242;BA.debugLine="lblDeskripsi.Text = dt.Get(\"keterangan\")&CRLF&\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbldeskripsi" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("keterangan")))),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("harga :  Rp."),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("harga_jual")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 244;BA.debugLine="clvInput.Add(ppp,dt)";
Debug.ShouldStop(524288);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _ppp.getObject()),(Object)((_dt.getObject())));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("dt", _dt);
;
 BA.debugLineNum = 250;BA.debugLine="Log(\" clvAwal.Size : \" &clvInput.Size)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","24456513",RemoteObject.concat(RemoteObject.createImmutable(" clvAwal.Size : "),__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize")),0);
 BA.debugLineNum = 252;BA.debugLine="Log(dtharga)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","24456515",BA.ObjectToString(__ref.getField(false,"_dtharga" /*RemoteObject*/ )),0);
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (v3) ","v3",5,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "v3","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 60;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Return Me";
Debug.ShouldStop(268435456);
if (true) return __ref;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ivbarang_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ivBarang_Click (v3) ","v3",5,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("ivbarang_click")) { return __ref.runUserSub(false, "v3","ivbarang_click", __ref);}
 BA.debugLineNum = 440;BA.debugLine="Private Sub ivBarang_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 441;BA.debugLine="Log(\"ivBarang_Click\")";
Debug.ShouldStop(16777216);
v3.__c.runVoidMethod ("LogImpl","24849665",RemoteObject.createImmutable("ivBarang_Click"),0);
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ivbarang_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ivBarang_LongClick (v3) ","v3",5,__ref.getField(false, "ba"),__ref,436);
if (RapidSub.canDelegate("ivbarang_longclick")) { return __ref.runUserSub(false, "v3","ivbarang_longclick", __ref);}
 BA.debugLineNum = 436;BA.debugLine="Private Sub ivBarang_LongClick";
Debug.ShouldStop(524288);
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (v3) ","v3",5,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("label2_click")) { return __ref.runUserSub(false, "v3","label2_click", __ref);}
 BA.debugLineNum = 178;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblkamera_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblKamera_Click (v3) ","v3",5,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("lblkamera_click")) { return __ref.runUserSub(false, "v3","lblkamera_click", __ref);}
RemoteObject _b2 = RemoteObject.declareNull("b4a.example2.v2");
 BA.debugLineNum = 162;BA.debugLine="Private Sub lblKamera_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="Dim b2 As V2";
Debug.ShouldStop(4);
_b2 = RemoteObject.createNew ("b4a.example2.v2");Debug.locals.put("b2", _b2);
 BA.debugLineNum = 164;BA.debugLine="b2.Initialize";
Debug.ShouldStop(8);
_b2.runClassMethod (b4a.example2.v2.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 165;BA.debugLine="B4XPages.AddPage(\"v2\",b2)";
Debug.ShouldStop(16);
v3._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("v2")),(Object)((_b2)));
 BA.debugLineNum = 166;BA.debugLine="B4XPages.ShowPage(\"v2\")";
Debug.ShouldStop(32);
v3._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("v2")));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblmin_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblMin_Click (v3) ","v3",5,__ref.getField(false, "ba"),__ref,401);
if (RapidSub.canDelegate("lblmin_click")) { return __ref.runUserSub(false, "v3","lblmin_click", __ref);}
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 401;BA.debugLine="Private Sub lblMin_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 402;BA.debugLine="Dim lblt As Label  = Sender";
Debug.ShouldStop(131072);
_lblt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), v3.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lblt", _lblt);Debug.locals.put("lblt", _lblt);
 BA.debugLineNum = 403;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
Debug.ShouldStop(262144);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 404;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
Debug.ShouldStop(524288);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")));
 BA.debugLineNum = 405;BA.debugLine="If lblt.Parent.As(B4XView).GetView(2).Tag.As(Int)";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 406;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=False";
Debug.ShouldStop(2097152);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setVisible",v3.__c.getField(true,"False"));
 BA.debugLineNum = 407;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=False";
Debug.ShouldStop(4194304);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setVisible",v3.__c.getField(true,"False"));
 BA.debugLineNum = 408;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=False";
Debug.ShouldStop(8388608);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"setVisible",v3.__c.getField(true,"False"));
 BA.debugLineNum = 409;BA.debugLine="lblt.Parent.As(B4XView).GetView(0).Visible=True";
Debug.ShouldStop(16777216);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setVisible",v3.__c.getField(true,"True"));
 };
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblplus_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblPlus_Click (v3) ","v3",5,__ref.getField(false, "ba"),__ref,395);
if (RapidSub.canDelegate("lblplus_click")) { return __ref.runUserSub(false, "v3","lblplus_click", __ref);}
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 395;BA.debugLine="Private Sub lblPlus_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 396;BA.debugLine="Dim lblt As Label  = Sender";
Debug.ShouldStop(2048);
_lblt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), v3.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lblt", _lblt);Debug.locals.put("lblt", _lblt);
 BA.debugLineNum = 397;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
Debug.ShouldStop(4096);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 398;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
Debug.ShouldStop(8192);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")));
 BA.debugLineNum = 399;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbltambah_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblTambah_Click (v3) ","v3",5,__ref.getField(false, "ba"),__ref,419);
if (RapidSub.canDelegate("lbltambah_click")) { return __ref.runUserSub(false, "v3","lbltambah_click", __ref);}
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 419;BA.debugLine="Private Sub lblTambah_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 420;BA.debugLine="Log(\"Klik\")";
Debug.ShouldStop(8);
v3.__c.runVoidMethod ("LogImpl","24718593",RemoteObject.createImmutable("Klik"),0);
 BA.debugLineNum = 421;BA.debugLine="Dim lblt As Label = Sender";
Debug.ShouldStop(16);
_lblt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), v3.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lblt", _lblt);Debug.locals.put("lblt", _lblt);
 BA.debugLineNum = 422;BA.debugLine="lblt.Visible = False";
Debug.ShouldStop(32);
_lblt.runMethod(true,"setVisible",v3.__c.getField(true,"False"));
 BA.debugLineNum = 423;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=True";
Debug.ShouldStop(64);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setVisible",v3.__c.getField(true,"True"));
 BA.debugLineNum = 424;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=True";
Debug.ShouldStop(128);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setVisible",v3.__c.getField(true,"True"));
 BA.debugLineNum = 425;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=True";
Debug.ShouldStop(256);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"setVisible",v3.__c.getField(true,"True"));
 BA.debugLineNum = 426;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
Debug.ShouldStop(512);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 427;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
Debug.ShouldStop(1024);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")));
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtalamat_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("txtAlamat_FocusChanged (v3) ","v3",5,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("txtalamat_focuschanged")) { return __ref.runUserSub(false, "v3","txtalamat_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 150;BA.debugLine="Private Sub txtAlamat_FocusChanged (HasFocus As Bo";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}