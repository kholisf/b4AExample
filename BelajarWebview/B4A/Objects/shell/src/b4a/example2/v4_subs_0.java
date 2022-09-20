package b4a.example2;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class v4_subs_0 {


public static void  _ambilbank(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ambilBank (v4) ","v4",6,__ref.getField(false, "ba"),__ref,321);
if (RapidSub.canDelegate("ambilbank")) { __ref.runUserSub(false, "v4","ambilbank", __ref); return;}
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
public ResumableSub_ambilBank(b4a.example2.v4 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example2.v4 parent;
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
		Debug.PushSubsStack("ambilBank (v4) ","v4",6,__ref.getField(false, "ba"),__ref,321);
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
 BA.debugLineNum = 322;BA.debugLine="Try";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 324;BA.debugLine="bankMap.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_bankmap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 325;BA.debugLine="Dim getBank As HttpJob";
Debug.ShouldStop(16);
_getbank = RemoteObject.createNew ("b4a.example2.httpjob");Debug.locals.put("getBank", _getbank);
 BA.debugLineNum = 326;BA.debugLine="Dim jParser As JSONParser";
Debug.ShouldStop(32);
_jparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jParser", _jparser);
 BA.debugLineNum = 328;BA.debugLine="getBank.Initialize(\"\",Me)";
Debug.ShouldStop(128);
_getbank.runClassMethod (b4a.example2.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 329;BA.debugLine="getBank.PostString(\"https://misterkong.com/kajek";
Debug.ShouldStop(256);
_getbank.runClassMethod (b4a.example2.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://misterkong.com/kajek/services/_getBank.php")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 330;BA.debugLine="Wait For (getBank) JobDone (job As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "v4", "ambilbank"), (_getbank));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 331;BA.debugLine="If job.Success=True Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 334;BA.debugLine="jParser.Initialize(job.GetString)";
Debug.ShouldStop(8192);
_jparser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (b4a.example2.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 335;BA.debugLine="Dim ls As List = jParser.NextArray";
Debug.ShouldStop(16384);
_ls = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ls = _jparser.runMethod(false,"NextArray");Debug.locals.put("ls", _ls);Debug.locals.put("ls", _ls);
 BA.debugLineNum = 336;BA.debugLine="For Each hs As Map In ls";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 340;BA.debugLine="bankMap.Put(hs.Get(\"nama_bank\"),Array As Strin";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 343;BA.debugLine="job.Release";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4a.example2.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 345;BA.debugLine="Dim tmp () As String = bankMap.get(\"BCA\")";
Debug.ShouldStop(16777216);
_tmp = (__ref.getField(false,"_bankmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BCA")))));Debug.locals.put("tmp", _tmp);Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 346;BA.debugLine="Log(tmp(0))";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","25570585",_tmp.getArrayElement(true,BA.numberCast(int.class, 0)),0);
 BA.debugLineNum = 347;BA.debugLine="Log(tmp(1))";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","25570586",_tmp.getArrayElement(true,BA.numberCast(int.class, 1)),0);
 BA.debugLineNum = 348;BA.debugLine="lbnorek.Text = tmp(1)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lbnorek" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tmp.getArrayElement(true,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 349;BA.debugLine="lban.Text = tmp(3)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lban" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tmp.getArrayElement(true,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 351;BA.debugLine="Log(tmp(2))";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","25570590",_tmp.getArrayElement(true,BA.numberCast(int.class, 2)),0);
 BA.debugLineNum = 352;BA.debugLine="Log(tmp(3))";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","25570591",_tmp.getArrayElement(true,BA.numberCast(int.class, 3)),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 355;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","25570594",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("B4XPage_Created (v4) ","v4",6,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "v4","b4xpage_created", __ref, _root1);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 39;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Root = Root1";
Debug.ShouldStop(128);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 41;BA.debugLine="dtharga.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_dtharga" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="B4XPages.SetTitle(Me,\"v4\")";
Debug.ShouldStop(512);
v4._b4xpages.runVoidMethod ("_settitle" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("v4"))));
 BA.debugLineNum = 65;BA.debugLine="Root.LoadLayout(\"GlobalBody\")";
Debug.ShouldStop(1);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("GlobalBody")),__ref.getField(false, "ba"));
 BA.debugLineNum = 68;BA.debugLine="Dim p As Panel = xui.CreatePanel(\"\")";
Debug.ShouldStop(8);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 69;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,GetDe";
Debug.ShouldStop(16);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(v4.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width")),(Object)(v4.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height")));
 BA.debugLineNum = 73;BA.debugLine="p.LoadLayout(\"l_atributRequest\")";
Debug.ShouldStop(256);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_atributRequest")),__ref.getField(false, "ba"));
 BA.debugLineNum = 74;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,btnCo";
Debug.ShouldStop(512);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(v4.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_btncobalagi" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_btncobalagi" /*RemoteObject*/ ).runMethod(true,"getHeight"),v4.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "++",2, 1)));
 BA.debugLineNum = 76;BA.debugLine="p.Color = Colors.White";
Debug.ShouldStop(2048);
_p.runVoidMethod ("setColor",v4.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 79;BA.debugLine="p.Tag = clvInput";
Debug.ShouldStop(16384);
_p.runMethod(false,"setTag",(__ref.getField(false,"_clvinput" /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="CLVGlob.Add(p,\"1\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_clvglob" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 107;BA.debugLine="pnlhitam = xui.CreatePanel(\"pnlhitam\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).setObject (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlhitam"))).getObject());
 BA.debugLineNum = 108;BA.debugLine="pnlhitam.SetLayout(0,0,GetDeviceLayoutValues.Widt";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(v4.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width")),(Object)(v4.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height")));
 BA.debugLineNum = 109;BA.debugLine="warnaTransGelap.Initialize(xui.Color_ARGB(150,0,0";
Debug.ShouldStop(4096);
__ref.getField(false,"_warnatransgelap" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 110;BA.debugLine="pnlhitam.Background=warnaTransGelap";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_warnatransgelap" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 111;BA.debugLine="ambilBank";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example2.v4.class, "_ambilbank" /*void*/ );
 BA.debugLineNum = 116;BA.debugLine="getdataAtribut";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example2.v4.class, "_getdataatribut" /*void*/ );
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
		Debug.PushSubsStack("btnCobaLagi_Click (v4) ","v4",6,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("btncobalagi_click")) { return __ref.runUserSub(false, "v4","btncobalagi_click", __ref);}
 BA.debugLineNum = 129;BA.debugLine="Private Sub btnCobaLagi_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Button1_Click (v4) ","v4",6,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "v4","button1_click", __ref);}
RemoteObject _b3 = RemoteObject.declareNull("b4a.example2.v2");
 BA.debugLineNum = 137;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="Dim b3 As V2";
Debug.ShouldStop(512);
_b3 = RemoteObject.createNew ("b4a.example2.v2");Debug.locals.put("b3", _b3);
 BA.debugLineNum = 139;BA.debugLine="b3.Initialize";
Debug.ShouldStop(1024);
_b3.runClassMethod (b4a.example2.v2.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 140;BA.debugLine="B4XPages.AddPage(\"v3\",b3)";
Debug.ShouldStop(2048);
v4._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("v3")),(Object)((_b3)));
 BA.debugLineNum = 141;BA.debugLine="B4XPages.ShowPage(\"v3\")";
Debug.ShouldStop(4096);
v4._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("v3")));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
v4._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",v4._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
v4._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",v4._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private CLVGlob As CustomListView";
v4._clvglob = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clvglob",v4._clvglob);
 //BA.debugLineNum = 5;BA.debugLine="Dim pnlhitam,pnlputih,pnltampung As Panel";
v4._pnlhitam = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlhitam",v4._pnlhitam);
v4._pnlputih = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlputih",v4._pnlputih);
v4._pnltampung = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnltampung",v4._pnltampung);
 //BA.debugLineNum = 6;BA.debugLine="Dim warnaTransGelap As ColorDrawable";
v4._warnatransgelap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");__ref.setField("_warnatransgelap",v4._warnatransgelap);
 //BA.debugLineNum = 7;BA.debugLine="Private Label1 As Label";
v4._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",v4._label1);
 //BA.debugLineNum = 9;BA.debugLine="Private Button1 As Button";
v4._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1",v4._button1);
 //BA.debugLineNum = 10;BA.debugLine="Private ImageView1 As ImageView";
v4._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageview1",v4._imageview1);
 //BA.debugLineNum = 11;BA.debugLine="Private lblKamera As Label";
v4._lblkamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblkamera",v4._lblkamera);
 //BA.debugLineNum = 12;BA.debugLine="Private btnCobaLagi As Button";
v4._btncobalagi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btncobalagi",v4._btncobalagi);
 //BA.debugLineNum = 13;BA.debugLine="Private clvInput As CustomListView";
v4._clvinput = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clvinput",v4._clvinput);
 //BA.debugLineNum = 14;BA.debugLine="Private lban As Label";
v4._lban = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lban",v4._lban);
 //BA.debugLineNum = 15;BA.debugLine="Private lbnorek As Label";
v4._lbnorek = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbnorek",v4._lbnorek);
 //BA.debugLineNum = 16;BA.debugLine="Private lblTotalHarga As Label";
v4._lbltotalharga = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotalharga",v4._lbltotalharga);
 //BA.debugLineNum = 17;BA.debugLine="Private txtAlamat As EditText";
v4._txtalamat = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtalamat",v4._txtalamat);
 //BA.debugLineNum = 19;BA.debugLine="Private ivBarang As ImageView";
v4._ivbarang = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_ivbarang",v4._ivbarang);
 //BA.debugLineNum = 20;BA.debugLine="Private lblDeskripsi As Label";
v4._lbldeskripsi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldeskripsi",v4._lbldeskripsi);
 //BA.debugLineNum = 21;BA.debugLine="Private lblTitle As Label";
v4._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitle",v4._lbltitle);
 //BA.debugLineNum = 22;BA.debugLine="Dim dtharga As Map";
v4._dtharga = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_dtharga",v4._dtharga);
 //BA.debugLineNum = 23;BA.debugLine="Dim bankMap As Map";
v4._bankmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_bankmap",v4._bankmap);
 //BA.debugLineNum = 24;BA.debugLine="Private lblTambah As Label";
v4._lbltambah = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltambah",v4._lbltambah);
 //BA.debugLineNum = 25;BA.debugLine="Private lblJml As Label";
v4._lbljml = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbljml",v4._lbljml);
 //BA.debugLineNum = 26;BA.debugLine="Private lblMin As Label";
v4._lblmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmin",v4._lblmin);
 //BA.debugLineNum = 27;BA.debugLine="Private lblPlus As Label";
v4._lblplus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblplus",v4._lblplus);
 //BA.debugLineNum = 28;BA.debugLine="Private ScrollView1 As ScrollView";
v4._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollview1",v4._scrollview1);
 //BA.debugLineNum = 29;BA.debugLine="Dim nested As CLVNested";
v4._nested = RemoteObject.createNew ("b4a.example2.clvnested");__ref.setField("_nested",v4._nested);
 //BA.debugLineNum = 30;BA.debugLine="Private Panel1 As Panel";
v4._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",v4._panel1);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvglob_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVGlob_ItemClick (v4) ","v4",6,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("clvglob_itemclick")) { return __ref.runUserSub(false, "v4","clvglob_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 148;BA.debugLine="Private Sub CLVGlob_ItemClick (Index As Int, Value";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="Log(\"test\")";
Debug.ShouldStop(1048576);
v4.__c.runVoidMethod ("LogImpl","25439489",RemoteObject.createImmutable("test"),0);
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("getdataAtribut (v4) ","v4",6,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("getdataatribut")) { __ref.runUserSub(false, "v4","getdataatribut", __ref); return;}
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
public ResumableSub_getdataAtribut(b4a.example2.v4 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example2.v4 parent;
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
		Debug.PushSubsStack("getdataAtribut (v4) ","v4",6,__ref.getField(false, "ba"),__ref,152);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 166;BA.debugLine="Dim hargapost As HttpJob";
Debug.ShouldStop(32);
_hargapost = RemoteObject.createNew ("b4a.example2.httpjob");Debug.locals.put("hargapost", _hargapost);
 BA.debugLineNum = 167;BA.debugLine="hargapost.Initialize(\"\",Me)";
Debug.ShouldStop(64);
_hargapost.runClassMethod (b4a.example2.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 168;BA.debugLine="hargapost.PostString(\"https://misterkong.com/kong";
Debug.ShouldStop(128);
_hargapost.runClassMethod (b4a.example2.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://misterkong.com/kong_api/api_rider/list")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("imei="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._main._imei /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 174;BA.debugLine="Wait For (hargapost)JobDone(job As HttpJob)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "v4", "getdataatribut"), (_hargapost));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 175;BA.debugLine="If job.Success Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 176;BA.debugLine="Log	(job.GetString)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","25505048",_job.runClassMethod (b4a.example2.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 177;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(65536);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 178;BA.debugLine="Dim ls As List";
Debug.ShouldStop(131072);
_ls = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ls", _ls);
 BA.debugLineNum = 179;BA.debugLine="jp.Initialize(job.GetString)";
Debug.ShouldStop(262144);
_jp.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (b4a.example2.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 180;BA.debugLine="ls = jp.NextObject.Get(\"data\").As(List)";
Debug.ShouldStop(524288);
_ls = (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _jp.runMethod(false,"NextObject").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data"))))));Debug.locals.put("ls", _ls);
 BA.debugLineNum = 182;BA.debugLine="Log(\"att\"&ls.Get(0).As(Map).Get(\"id\"))";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","25505054",RemoteObject.concat(RemoteObject.createImmutable("att"),(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _ls.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 183;BA.debugLine="Log(\"att\"&ls.Get(1).As(Map).Get(\"id\"))";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","25505055",RemoteObject.concat(RemoteObject.createImmutable("att"),(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _ls.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 184;BA.debugLine="Log(\"att\"&ls.Get(2).As(Map).Get(\"id\"))";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","25505056",RemoteObject.concat(RemoteObject.createImmutable("att"),(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _ls.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 185;BA.debugLine="Dim tl As Int =1";
Debug.ShouldStop(16777216);
_tl = BA.numberCast(int.class, 1);Debug.locals.put("tl", _tl);Debug.locals.put("tl", _tl);
 BA.debugLineNum = 186;BA.debugLine="For Each ii As Map In ls";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 188;BA.debugLine="dtharga = CreateMap(\"att\"&tl:ii)";
Debug.ShouldStop(134217728);
__ref.setField ("_dtharga" /*RemoteObject*/ ,parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(RemoteObject.concat(RemoteObject.createImmutable("att"),_tl)),(_ii.getObject())})));
 BA.debugLineNum = 189;BA.debugLine="tl = tl +1";
Debug.ShouldStop(268435456);
_tl = RemoteObject.solve(new RemoteObject[] {_tl,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("tl", _tl);
 if (true) break;
if (true) break;
Debug.locals.put("ii", _ii);
;
 BA.debugLineNum = 201;BA.debugLine="For Each dt As Map In ls";
Debug.ShouldStop(256);

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
 BA.debugLineNum = 202;BA.debugLine="Dim ppp As Panel  = xui.CreatePanel(\"\")";
Debug.ShouldStop(512);
_ppp = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_ppp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("ppp", _ppp);Debug.locals.put("ppp", _ppp);
 BA.debugLineNum = 203;BA.debugLine="ppp.SetLayout(0,0,clvInput.AsView.Width,80dip)";
Debug.ShouldStop(1024);
_ppp.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 BA.debugLineNum = 204;BA.debugLine="ppp.LoadLayout(\"l_TemplateAtribut\")";
Debug.ShouldStop(2048);
_ppp.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_TemplateAtribut")),__ref.getField(false, "ba"));
 BA.debugLineNum = 205;BA.debugLine="ppp.SetLayout(0,0,clvInput.AsView.Width,lblDesk";
Debug.ShouldStop(4096);
_ppp.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lbldeskripsi" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_lbldeskripsi" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)));
 BA.debugLineNum = 207;BA.debugLine="lblTitle.Text = dt.Get(\"nama\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama"))))));
 BA.debugLineNum = 208;BA.debugLine="Panel1.Elevation = 10dip";
Debug.ShouldStop(32768);
__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethod(true,"setElevation",BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 209;BA.debugLine="lblDeskripsi.Text = dt.Get(\"keterangan\")&CRLF&\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbldeskripsi" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("keterangan")))),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("harga :  Rp."),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("harga_jual")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 211;BA.debugLine="clvInput.Add(ppp,dt)";
Debug.ShouldStop(262144);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _ppp.getObject()),(Object)((_dt.getObject())));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("dt", _dt);
;
 BA.debugLineNum = 217;BA.debugLine="Log(\" clvAwal.Size : \" &clvInput.Size)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","25505089",RemoteObject.concat(RemoteObject.createImmutable(" clvAwal.Size : "),__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize")),0);
 BA.debugLineNum = 219;BA.debugLine="Log(dtharga)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","25505091",BA.ObjectToString(__ref.getField(false,"_dtharga" /*RemoteObject*/ )),0);
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (v4) ","v4",6,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "v4","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Return Me";
Debug.ShouldStop(4);
if (true) return __ref;
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("ivBarang_Click (v4) ","v4",6,__ref.getField(false, "ba"),__ref,407);
if (RapidSub.canDelegate("ivbarang_click")) { return __ref.runUserSub(false, "v4","ivbarang_click", __ref);}
 BA.debugLineNum = 407;BA.debugLine="Private Sub ivBarang_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 408;BA.debugLine="Log(\"ivBarang_Click\")";
Debug.ShouldStop(8388608);
v4.__c.runVoidMethod ("LogImpl","25898241",RemoteObject.createImmutable("ivBarang_Click"),0);
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("ivBarang_LongClick (v4) ","v4",6,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("ivbarang_longclick")) { return __ref.runUserSub(false, "v4","ivbarang_longclick", __ref);}
 BA.debugLineNum = 403;BA.debugLine="Private Sub ivBarang_LongClick";
Debug.ShouldStop(262144);
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Label2_Click (v4) ","v4",6,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("label2_click")) { return __ref.runUserSub(false, "v4","label2_click", __ref);}
 BA.debugLineNum = 145;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("lblKamera_Click (v4) ","v4",6,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("lblkamera_click")) { return __ref.runUserSub(false, "v4","lblkamera_click", __ref);}
 BA.debugLineNum = 133;BA.debugLine="Private Sub lblKamera_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("lblMin_Click (v4) ","v4",6,__ref.getField(false, "ba"),__ref,368);
if (RapidSub.canDelegate("lblmin_click")) { return __ref.runUserSub(false, "v4","lblmin_click", __ref);}
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 368;BA.debugLine="Private Sub lblMin_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 369;BA.debugLine="Dim lblt As Label  = Sender";
Debug.ShouldStop(65536);
_lblt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), v4.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lblt", _lblt);Debug.locals.put("lblt", _lblt);
 BA.debugLineNum = 370;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
Debug.ShouldStop(131072);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 371;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
Debug.ShouldStop(262144);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")));
 BA.debugLineNum = 372;BA.debugLine="If lblt.Parent.As(B4XView).GetView(2).Tag.As(Int)";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 373;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=False";
Debug.ShouldStop(1048576);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setVisible",v4.__c.getField(true,"False"));
 BA.debugLineNum = 374;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=False";
Debug.ShouldStop(2097152);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setVisible",v4.__c.getField(true,"False"));
 BA.debugLineNum = 375;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=False";
Debug.ShouldStop(4194304);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"setVisible",v4.__c.getField(true,"False"));
 BA.debugLineNum = 376;BA.debugLine="lblt.Parent.As(B4XView).GetView(0).Visible=True";
Debug.ShouldStop(8388608);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setVisible",v4.__c.getField(true,"True"));
 };
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
public static RemoteObject  _lblplus_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblPlus_Click (v4) ","v4",6,__ref.getField(false, "ba"),__ref,362);
if (RapidSub.canDelegate("lblplus_click")) { return __ref.runUserSub(false, "v4","lblplus_click", __ref);}
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 362;BA.debugLine="Private Sub lblPlus_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 363;BA.debugLine="Dim lblt As Label  = Sender";
Debug.ShouldStop(1024);
_lblt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), v4.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lblt", _lblt);Debug.locals.put("lblt", _lblt);
 BA.debugLineNum = 364;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
Debug.ShouldStop(2048);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 365;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
Debug.ShouldStop(4096);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")));
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("lblTambah_Click (v4) ","v4",6,__ref.getField(false, "ba"),__ref,386);
if (RapidSub.canDelegate("lbltambah_click")) { return __ref.runUserSub(false, "v4","lbltambah_click", __ref);}
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 386;BA.debugLine="Private Sub lblTambah_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 387;BA.debugLine="Log(\"Klik\")";
Debug.ShouldStop(4);
v4.__c.runVoidMethod ("LogImpl","25767169",RemoteObject.createImmutable("Klik"),0);
 BA.debugLineNum = 388;BA.debugLine="Dim lblt As Label = Sender";
Debug.ShouldStop(8);
_lblt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), v4.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lblt", _lblt);Debug.locals.put("lblt", _lblt);
 BA.debugLineNum = 389;BA.debugLine="lblt.Visible = False";
Debug.ShouldStop(16);
_lblt.runMethod(true,"setVisible",v4.__c.getField(true,"False"));
 BA.debugLineNum = 390;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=True";
Debug.ShouldStop(32);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setVisible",v4.__c.getField(true,"True"));
 BA.debugLineNum = 391;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=True";
Debug.ShouldStop(64);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setVisible",v4.__c.getField(true,"True"));
 BA.debugLineNum = 392;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=True";
Debug.ShouldStop(128);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"setVisible",v4.__c.getField(true,"True"));
 BA.debugLineNum = 393;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
Debug.ShouldStop(256);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 394;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
Debug.ShouldStop(512);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")));
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
public static RemoteObject  _txtalamat_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("txtAlamat_FocusChanged (v4) ","v4",6,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("txtalamat_focuschanged")) { return __ref.runUserSub(false, "v4","txtalamat_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 121;BA.debugLine="Private Sub txtAlamat_FocusChanged (HasFocus As Bo";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}