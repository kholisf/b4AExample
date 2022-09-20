package b4a.example2;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class v2_subs_2 {


public static RemoteObject  _addtoclvinput(RemoteObject __ref,RemoteObject _dt,RemoteObject _jumlah) throws Exception{
try {
		Debug.PushSubsStack("AddToCLVInput (v2) ","v2",3,__ref.getField(false, "ba"),__ref,668);
if (RapidSub.canDelegate("addtoclvinput")) { return __ref.runUserSub(false, "v2","addtoclvinput", __ref, _dt, _jumlah);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("dt", _dt);
Debug.locals.put("jumlah", _jumlah);
 BA.debugLineNum = 668;BA.debugLine="Sub AddToCLVInput (dt As Map,jumlah As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 670;BA.debugLine="Dim pnl As Panel =xui.CreatePanel(\"pnl\")";
Debug.ShouldStop(536870912);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl"))).getObject());Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 671;BA.debugLine="pnl.SetLayout(0,0,clvInput.AsView.Width,130dip)";
Debug.ShouldStop(1073741824);
_pnl.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(v2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))));
 BA.debugLineNum = 672;BA.debugLine="pnl.LoadLayout(\"l_tampilanatrribut2\")";
Debug.ShouldStop(-2147483648);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_tampilanatrribut2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 674;BA.debugLine="lblTitle2.Text = dt.Get(\"nama\")";
Debug.ShouldStop(2);
__ref.getField(false,"_lbltitle2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama"))))));
 BA.debugLineNum = 675;BA.debugLine="Panel12.Elevation = 10dip";
Debug.ShouldStop(4);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setElevation",BA.numberCast(float.class, v2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 676;BA.debugLine="lblDeskripsi2.Text = dt.Get(\"keterangan\")&CRLF&\"h";
Debug.ShouldStop(8);
__ref.getField(false,"_lbldeskripsi2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("keterangan")))),v2.__c.getField(true,"CRLF"),RemoteObject.createImmutable("harga :  Rp."),v2.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("harga_jual")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 677;BA.debugLine="lblJml2.Text = jumlah";
Debug.ShouldStop(16);
__ref.getField(false,"_lbljml2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_jumlah));
 BA.debugLineNum = 678;BA.debugLine="lblJml2.Tag = jumlah";
Debug.ShouldStop(32);
__ref.getField(false,"_lbljml2" /*RemoteObject*/ ).runMethod(false,"setTag",(_jumlah));
 BA.debugLineNum = 679;BA.debugLine="pnl.SetLayout(0,0,clvInput.AsView.Width,Panel12.T";
Debug.ShouldStop(64);
_pnl.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)));
 BA.debugLineNum = 680;BA.debugLine="clvInput.InsertAt(clvInput.Size - 1,pnl,dt)";
Debug.ShouldStop(128);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runVoidMethod ("_insertat",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _pnl.getObject()),(Object)((_dt.getObject())));
 BA.debugLineNum = 682;BA.debugLine="clvInput.AsView.Height = 	clvInput.AsView.Height+";
Debug.ShouldStop(512);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight"),v2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))}, "+",1, 1));
 BA.debugLineNum = 683;BA.debugLine="clvInput.sv.Height = 	clvInput.AsView.Height+130d";
Debug.ShouldStop(1024);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight"),v2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))}, "+",1, 1));
 BA.debugLineNum = 684;BA.debugLine="pnl1.Top = clvInput.AsView.top	+clvInput.AsView.H";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnl1" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getTop"),__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 687;BA.debugLine="CLVGlob.ResizeItem(0,pnl1.Top+pnl1.Height)";
Debug.ShouldStop(16384);
__ref.getField(false,"_clvglob" /*RemoteObject*/ ).runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnl1" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_pnl1" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)));
 BA.debugLineNum = 696;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _ambilbank(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ambilBank (v2) ","v2",3,__ref.getField(false, "ba"),__ref,515);
if (RapidSub.canDelegate("ambilbank")) { __ref.runUserSub(false, "v2","ambilbank", __ref); return;}
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
public ResumableSub_ambilBank(b4a.example2.v2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example2.v2 parent;
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
		Debug.PushSubsStack("ambilBank (v2) ","v2",3,__ref.getField(false, "ba"),__ref,515);
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
 BA.debugLineNum = 516;BA.debugLine="Try";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 518;BA.debugLine="bankMap.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_bankmap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 519;BA.debugLine="Dim getBank As HttpJob";
Debug.ShouldStop(64);
_getbank = RemoteObject.createNew ("b4a.example2.httpjob");Debug.locals.put("getBank", _getbank);
 BA.debugLineNum = 520;BA.debugLine="Dim jParser As JSONParser";
Debug.ShouldStop(128);
_jparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jParser", _jparser);
 BA.debugLineNum = 522;BA.debugLine="getBank.Initialize(\"\",Me)";
Debug.ShouldStop(512);
_getbank.runClassMethod (b4a.example2.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 523;BA.debugLine="getBank.PostString(\"https://misterkong.com/kajek";
Debug.ShouldStop(1024);
_getbank.runClassMethod (b4a.example2.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://misterkong.com/kajek/services/_getBank.php")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 524;BA.debugLine="Wait For (getBank) JobDone (job As HttpJob)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "v2", "ambilbank"), (_getbank));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 525;BA.debugLine="If job.Success=True Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 528;BA.debugLine="jParser.Initialize(job.GetString)";
Debug.ShouldStop(32768);
_jparser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (b4a.example2.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 529;BA.debugLine="Dim ls As List = jParser.NextArray";
Debug.ShouldStop(65536);
_ls = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ls = _jparser.runMethod(false,"NextArray");Debug.locals.put("ls", _ls);Debug.locals.put("ls", _ls);
 BA.debugLineNum = 530;BA.debugLine="For Each hs As Map In ls";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 534;BA.debugLine="bankMap.Put(hs.Get(\"nama_bank\"),Array As Strin";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 537;BA.debugLine="job.Release";
Debug.ShouldStop(16777216);
_job.runClassMethod (b4a.example2.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 539;BA.debugLine="Dim tmp () As String = bankMap.get(\"BCA\")";
Debug.ShouldStop(67108864);
_tmp = (__ref.getField(false,"_bankmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BCA")))));Debug.locals.put("tmp", _tmp);Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 540;BA.debugLine="Log(tmp(0))";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","23080217",_tmp.getArrayElement(true,BA.numberCast(int.class, 0)),0);
 BA.debugLineNum = 541;BA.debugLine="Log(tmp(1))";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","23080218",_tmp.getArrayElement(true,BA.numberCast(int.class, 1)),0);
 BA.debugLineNum = 542;BA.debugLine="lbnorek.Text = tmp(1)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lbnorek" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tmp.getArrayElement(true,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 543;BA.debugLine="lban.Text = tmp(3)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lban" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tmp.getArrayElement(true,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 545;BA.debugLine="Log(tmp(2))";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","23080222",_tmp.getArrayElement(true,BA.numberCast(int.class, 2)),0);
 BA.debugLineNum = 546;BA.debugLine="Log(tmp(3))";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","23080223",_tmp.getArrayElement(true,BA.numberCast(int.class, 3)),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 549;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","23080226",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 553;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("B4XPage_Created (v2) ","v2",3,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "v2","b4xpage_created", __ref, _root1);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _cb = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _tt = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 199;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="Root = Root1";
Debug.ShouldStop(128);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 201;BA.debugLine="Dl.Initialize(Root)";
Debug.ShouldStop(256);
__ref.getField(false,"_dl" /*RemoteObject*/ ).runClassMethod (b4a.example2.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 202;BA.debugLine="dtpembelian.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_dtpembelian" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 203;BA.debugLine="dtharga.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_dtharga" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 204;BA.debugLine="B4XPages.SetTitle(Me,\"V2\")";
Debug.ShouldStop(2048);
v2._b4xpages.runVoidMethod ("_settitle" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("V2"))));
 BA.debugLineNum = 205;BA.debugLine="Root.LoadLayout(\"GlobalBody\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("GlobalBody")),__ref.getField(false, "ba"));
 BA.debugLineNum = 206;BA.debugLine="Dim p As Panel  = xui.CreatePanel(\"\")";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 207;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,GetDe";
Debug.ShouldStop(16384);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(v2.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width")),(Object)(v2.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height")));
 BA.debugLineNum = 208;BA.debugLine="p.LoadLayout(\"l_atributRequest\")";
Debug.ShouldStop(32768);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_atributRequest")),__ref.getField(false, "ba"));
 BA.debugLineNum = 209;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,pnl1.";
Debug.ShouldStop(65536);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(v2.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnl1" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_pnl1" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)));
 BA.debugLineNum = 211;BA.debugLine="CLVGlob.Add(p,\"1\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_clvglob" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 212;BA.debugLine="Dim cb As CSBuilder";
Debug.ShouldStop(524288);
_cb = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cb", _cb);
 BA.debugLineNum = 213;BA.debugLine="cb.Initialize.Append(Chr(0xF067)).Color(Colors.Bl";
Debug.ShouldStop(1048576);
_cb.runMethod(false,"Initialize").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(v2.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf067))))))).runMethod(false,"Color",(Object)(v2.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Alignment",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.text.Layout.Alignment"),RemoteObject.createImmutable("ALIGN_CENTER")))).runMethod(false,"Bold").runVoidMethod ("PopAll");
 BA.debugLineNum = 216;BA.debugLine="Dim tt As Panel =xui.CreatePanel(\"\")";
Debug.ShouldStop(8388608);
_tt = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_tt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("tt", _tt);Debug.locals.put("tt", _tt);
 BA.debugLineNum = 217;BA.debugLine="tt.Color = Colors.White";
Debug.ShouldStop(16777216);
_tt.runVoidMethod ("setColor",v2.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 218;BA.debugLine="Dim lblt As Label";
Debug.ShouldStop(33554432);
_lblt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblt", _lblt);
 BA.debugLineNum = 219;BA.debugLine="tt.SetLayout(0,0,clvInput.AsView.Width,40dip)";
Debug.ShouldStop(67108864);
_tt.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(v2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 220;BA.debugLine="lblt.Initialize(\"lblt\")";
Debug.ShouldStop(134217728);
_lblt.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lblt")));
 BA.debugLineNum = 221;BA.debugLine="lblt.Typeface = Typeface.FONTAWESOME";
Debug.ShouldStop(268435456);
_lblt.runMethod(false,"setTypeface",v2.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));
 BA.debugLineNum = 222;BA.debugLine="lblt.Gravity  = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(536870912);
_lblt.runMethod(true,"setGravity",v2.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 223;BA.debugLine="lblt.Color = Colors.White";
Debug.ShouldStop(1073741824);
_lblt.runVoidMethod ("setColor",v2.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 224;BA.debugLine="lblt.TextColor = Colors.Black";
Debug.ShouldStop(-2147483648);
_lblt.runMethod(true,"setTextColor",v2.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 225;BA.debugLine="lblt.Text = cb";
Debug.ShouldStop(1);
_lblt.runMethod(true,"setText",BA.ObjectToCharSequence(_cb.getObject()));
 BA.debugLineNum = 226;BA.debugLine="lblt.TextSize = 25";
Debug.ShouldStop(2);
_lblt.runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 228;BA.debugLine="tt.AddView(lblt.As(View),clvInput.AsView.Width /";
Debug.ShouldStop(8);
_tt.runVoidMethod ("AddView",(Object)(((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _lblt.getObject())).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),v2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "/-",1, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(v2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(v2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 229;BA.debugLine="clvInput.Add(tt,\"tambah\")";
Debug.ShouldStop(16);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tt.getObject()),(Object)((RemoteObject.createImmutable("tambah"))));
 BA.debugLineNum = 230;BA.debugLine="pd = xui.CreatePanel(\"pd\")";
Debug.ShouldStop(32);
__ref.getField(false,"_pd" /*RemoteObject*/ ).setObject (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pd"))).getObject());
 BA.debugLineNum = 231;BA.debugLine="pd.SetLayout(0,0,GetDeviceLayoutValues.Width - 20";
Debug.ShouldStop(64);
__ref.getField(false,"_pd" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {v2.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width"),v2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 1)),(Object)(v2.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 232;BA.debugLine="pd.LoadLayout(\"l_t1\")";
Debug.ShouldStop(128);
__ref.getField(false,"_pd" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_t1")),__ref.getField(false, "ba"));
 BA.debugLineNum = 301;BA.debugLine="pnlhitam = xui.CreatePanel(\"pnlhitam\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).setObject (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlhitam"))).getObject());
 BA.debugLineNum = 302;BA.debugLine="pnlhitam.SetLayout(0,0,GetDeviceLayoutValues.Widt";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(v2.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width")),(Object)(v2.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height")));
 BA.debugLineNum = 303;BA.debugLine="warnaTransGelap.Initialize(xui.Color_ARGB(150,0,0";
Debug.ShouldStop(16384);
__ref.getField(false,"_warnatransgelap" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 304;BA.debugLine="pnlhitam.Background=warnaTransGelap";
Debug.ShouldStop(32768);
__ref.getField(false,"_pnlhitam" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_warnatransgelap" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 305;BA.debugLine="ambilBank";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example2.v2.class, "_ambilbank" /*void*/ );
 BA.debugLineNum = 310;BA.debugLine="getdataAtribut";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example2.v2.class, "_getdataatribut" /*void*/ );
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("btnCobaLagi_Click (v2) ","v2",3,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("btncobalagi_click")) { return __ref.runUserSub(false, "v2","btncobalagi_click", __ref);}
 BA.debugLineNum = 323;BA.debugLine="Private Sub btnCobaLagi_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Button1_Click (v2) ","v2",3,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "v2","button1_click", __ref);}
RemoteObject _b2 = RemoteObject.declareNull("b4a.example2.v3");
 BA.debugLineNum = 331;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="Dim b2 As v3";
Debug.ShouldStop(2048);
_b2 = RemoteObject.createNew ("b4a.example2.v3");Debug.locals.put("b2", _b2);
 BA.debugLineNum = 333;BA.debugLine="b2.Initialize";
Debug.ShouldStop(4096);
_b2.runClassMethod (b4a.example2.v3.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 334;BA.debugLine="B4XPages.AddPage(\"v2\",b2)";
Debug.ShouldStop(8192);
v2._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("v2")),(Object)((_b2)));
 BA.debugLineNum = 335;BA.debugLine="B4XPages.ShowPage(\"v2\")";
Debug.ShouldStop(16384);
v2._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("v2")));
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 148;BA.debugLine="Private Root As B4XView 'ignore";
v2._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",v2._root);
 //BA.debugLineNum = 149;BA.debugLine="Private xui As XUI 'ignore";
v2._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",v2._xui);
 //BA.debugLineNum = 150;BA.debugLine="Private CLVGlob As CustomListView";
v2._clvglob = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clvglob",v2._clvglob);
 //BA.debugLineNum = 151;BA.debugLine="Dim pnlhitam,pnlputih,pnltampung As Panel";
v2._pnlhitam = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlhitam",v2._pnlhitam);
v2._pnlputih = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlputih",v2._pnlputih);
v2._pnltampung = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnltampung",v2._pnltampung);
 //BA.debugLineNum = 152;BA.debugLine="Dim warnaTransGelap As ColorDrawable";
v2._warnatransgelap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");__ref.setField("_warnatransgelap",v2._warnatransgelap);
 //BA.debugLineNum = 153;BA.debugLine="Private Label1 As Label";
v2._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",v2._label1);
 //BA.debugLineNum = 155;BA.debugLine="Private Button1 As Button";
v2._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1",v2._button1);
 //BA.debugLineNum = 156;BA.debugLine="Private ImageView1 As ImageView";
v2._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageview1",v2._imageview1);
 //BA.debugLineNum = 157;BA.debugLine="Private lblKamera As Label";
v2._lblkamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblkamera",v2._lblkamera);
 //BA.debugLineNum = 158;BA.debugLine="Private btnCobaLagi As Button";
v2._btncobalagi = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btncobalagi",v2._btncobalagi);
 //BA.debugLineNum = 159;BA.debugLine="Private clvInput As CustomListView";
v2._clvinput = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clvinput",v2._clvinput);
 //BA.debugLineNum = 160;BA.debugLine="Private lban As Label";
v2._lban = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lban",v2._lban);
 //BA.debugLineNum = 161;BA.debugLine="Private lbnorek As Label";
v2._lbnorek = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbnorek",v2._lbnorek);
 //BA.debugLineNum = 162;BA.debugLine="Private lblTotalHarga As Label";
v2._lbltotalharga = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltotalharga",v2._lbltotalharga);
 //BA.debugLineNum = 163;BA.debugLine="Private txtAlamat As EditText";
v2._txtalamat = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtalamat",v2._txtalamat);
 //BA.debugLineNum = 165;BA.debugLine="Private ivBarang As ImageView";
v2._ivbarang = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_ivbarang",v2._ivbarang);
 //BA.debugLineNum = 166;BA.debugLine="Private lblDeskripsi As Label";
v2._lbldeskripsi = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldeskripsi",v2._lbldeskripsi);
 //BA.debugLineNum = 167;BA.debugLine="Private lblTitle As Label";
v2._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitle",v2._lbltitle);
 //BA.debugLineNum = 168;BA.debugLine="Dim dtharga As Map";
v2._dtharga = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_dtharga",v2._dtharga);
 //BA.debugLineNum = 169;BA.debugLine="Dim bankMap As Map";
v2._bankmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_bankmap",v2._bankmap);
 //BA.debugLineNum = 170;BA.debugLine="Private lblTambah As Label";
v2._lbltambah = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltambah",v2._lbltambah);
 //BA.debugLineNum = 171;BA.debugLine="Private lblJml As Label";
v2._lbljml = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbljml",v2._lbljml);
 //BA.debugLineNum = 172;BA.debugLine="Private lblMin As Label";
v2._lblmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmin",v2._lblmin);
 //BA.debugLineNum = 173;BA.debugLine="Private lblPlus As Label";
v2._lblplus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblplus",v2._lblplus);
 //BA.debugLineNum = 174;BA.debugLine="Private ScrollView1 As ScrollView";
v2._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollview1",v2._scrollview1);
 //BA.debugLineNum = 175;BA.debugLine="Dim nested As CLVNested";
v2._nested = RemoteObject.createNew ("b4a.example2.clvnested");__ref.setField("_nested",v2._nested);
 //BA.debugLineNum = 176;BA.debugLine="Private Panel1 As Panel";
v2._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",v2._panel1);
 //BA.debugLineNum = 177;BA.debugLine="Private pnltmpclv As Panel";
v2._pnltmpclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnltmpclv",v2._pnltmpclv);
 //BA.debugLineNum = 178;BA.debugLine="Dim Dl As B4XDialog";
v2._dl = RemoteObject.createNew ("b4a.example2.b4xdialog");__ref.setField("_dl",v2._dl);
 //BA.debugLineNum = 179;BA.debugLine="Private pnl1 As Panel";
v2._pnl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl1",v2._pnl1);
 //BA.debugLineNum = 180;BA.debugLine="Dim pd As Panel";
v2._pd = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pd",v2._pd);
 //BA.debugLineNum = 181;BA.debugLine="Dim dtpembelian As Map";
v2._dtpembelian = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_dtpembelian",v2._dtpembelian);
 //BA.debugLineNum = 182;BA.debugLine="Private clvDialog As CustomListView";
v2._clvdialog = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clvdialog",v2._clvdialog);
 //BA.debugLineNum = 183;BA.debugLine="Private ivBarang2 As ImageView";
v2._ivbarang2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_ivbarang2",v2._ivbarang2);
 //BA.debugLineNum = 184;BA.debugLine="Private lblTitle2 As Label";
v2._lbltitle2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltitle2",v2._lbltitle2);
 //BA.debugLineNum = 185;BA.debugLine="Private lblDeskripsi2 As Label";
v2._lbldeskripsi2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldeskripsi2",v2._lbldeskripsi2);
 //BA.debugLineNum = 186;BA.debugLine="Private Panel12 As Panel";
v2._panel12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel12",v2._panel12);
 //BA.debugLineNum = 187;BA.debugLine="Private lblTambah2 As Label";
v2._lbltambah2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbltambah2",v2._lbltambah2);
 //BA.debugLineNum = 188;BA.debugLine="Private lblMin2 As Label";
v2._lblmin2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmin2",v2._lblmin2);
 //BA.debugLineNum = 189;BA.debugLine="Private lblJml2 As Label";
v2._lbljml2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbljml2",v2._lbljml2);
 //BA.debugLineNum = 190;BA.debugLine="Private lblPlus2 As Label";
v2._lblplus2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblplus2",v2._lblplus2);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvinput_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvInput_ItemClick (v2) ","v2",3,__ref.getField(false, "ba"),__ref,605);
if (RapidSub.canDelegate("clvinput_itemclick")) { return __ref.runUserSub(false, "v2","clvinput_itemclick", __ref, _index, _value);}
Debug.locals.put("index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 605;BA.debugLine="Private Sub clvInput_ItemClick (index As Int, Valu";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 606;BA.debugLine="Log($\"${index } As Int, ${ Value } As Object\"$)";
Debug.ShouldStop(536870912);
v2.__c.runVoidMethod ("LogImpl","242401793",(RemoteObject.concat(RemoteObject.createImmutable(""),v2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_index))),RemoteObject.createImmutable(" As Int, "),v2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable(" As Object"))),0);
 BA.debugLineNum = 617;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("getdataAtribut (v2) ","v2",3,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("getdataatribut")) { __ref.runUserSub(false, "v2","getdataatribut", __ref); return;}
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
public ResumableSub_getdataAtribut(b4a.example2.v2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example2.v2 parent;
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
		Debug.PushSubsStack("getdataAtribut (v2) ","v2",3,__ref.getField(false, "ba"),__ref,346);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 360;BA.debugLine="Dim hargapost As HttpJob";
Debug.ShouldStop(128);
_hargapost = RemoteObject.createNew ("b4a.example2.httpjob");Debug.locals.put("hargapost", _hargapost);
 BA.debugLineNum = 361;BA.debugLine="hargapost.Initialize(\"\",Me)";
Debug.ShouldStop(256);
_hargapost.runClassMethod (b4a.example2.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 362;BA.debugLine="hargapost.PostString(\"https://misterkong.com/kong";
Debug.ShouldStop(512);
_hargapost.runClassMethod (b4a.example2.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://misterkong.com/kong_api/api_rider/list")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("imei="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._main._imei /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 368;BA.debugLine="Wait For (hargapost)JobDone(job As HttpJob)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "v2", "getdataatribut"), (_hargapost));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 369;BA.debugLine="If job.Success Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 370;BA.debugLine="Log	(job.GetString)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","23014680",_job.runClassMethod (b4a.example2.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 371;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(262144);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 372;BA.debugLine="Dim ls As List";
Debug.ShouldStop(524288);
_ls = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ls", _ls);
 BA.debugLineNum = 373;BA.debugLine="jp.Initialize(job.GetString)";
Debug.ShouldStop(1048576);
_jp.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (b4a.example2.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 374;BA.debugLine="ls = jp.NextObject.Get(\"data\").As(List)";
Debug.ShouldStop(2097152);
_ls = (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _jp.runMethod(false,"NextObject").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data"))))));Debug.locals.put("ls", _ls);
 BA.debugLineNum = 376;BA.debugLine="Log(\"att\"&ls.Get(0).As(Map).Get(\"id\"))";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","23014686",RemoteObject.concat(RemoteObject.createImmutable("att"),(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _ls.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 377;BA.debugLine="Log(\"att\"&ls.Get(1).As(Map).Get(\"id\"))";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","23014687",RemoteObject.concat(RemoteObject.createImmutable("att"),(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _ls.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 378;BA.debugLine="Log(\"att\"&ls.Get(2).As(Map).Get(\"id\"))";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","23014688",RemoteObject.concat(RemoteObject.createImmutable("att"),(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _ls.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),0);
 BA.debugLineNum = 379;BA.debugLine="Dim tl As Int =1";
Debug.ShouldStop(67108864);
_tl = BA.numberCast(int.class, 1);Debug.locals.put("tl", _tl);Debug.locals.put("tl", _tl);
 BA.debugLineNum = 380;BA.debugLine="For Each ii As Map In ls";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 382;BA.debugLine="dtharga = CreateMap(\"att\"&tl:ii)";
Debug.ShouldStop(536870912);
__ref.setField ("_dtharga" /*RemoteObject*/ ,parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(RemoteObject.concat(RemoteObject.createImmutable("att"),_tl)),(_ii.getObject())})));
 BA.debugLineNum = 383;BA.debugLine="tl = tl +1";
Debug.ShouldStop(1073741824);
_tl = RemoteObject.solve(new RemoteObject[] {_tl,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("tl", _tl);
 if (true) break;
if (true) break;
Debug.locals.put("ii", _ii);
;
 BA.debugLineNum = 395;BA.debugLine="For Each dt As Map In ls";
Debug.ShouldStop(1024);

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
 BA.debugLineNum = 396;BA.debugLine="Dim ppp As Panel  = xui.CreatePanel(\"\")";
Debug.ShouldStop(2048);
_ppp = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_ppp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("ppp", _ppp);Debug.locals.put("ppp", _ppp);
 BA.debugLineNum = 397;BA.debugLine="ppp.SetLayout(0,0,clvDialog.AsView.Width,80dip)";
Debug.ShouldStop(4096);
_ppp.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_clvdialog" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 BA.debugLineNum = 398;BA.debugLine="ppp.LoadLayout(\"l_TemplateAtribut\")";
Debug.ShouldStop(8192);
_ppp.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("l_TemplateAtribut")),__ref.getField(false, "ba"));
 BA.debugLineNum = 399;BA.debugLine="ppp.SetLayout(0,0,clvDialog.AsView.Width,lblDes";
Debug.ShouldStop(16384);
_ppp.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_clvdialog" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lbldeskripsi" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_lbldeskripsi" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)));
 BA.debugLineNum = 401;BA.debugLine="lblTitle.Text = dt.Get(\"nama\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama"))))));
 BA.debugLineNum = 402;BA.debugLine="Panel1.Elevation = 10dip";
Debug.ShouldStop(131072);
__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethod(true,"setElevation",BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 403;BA.debugLine="lblDeskripsi.Text = dt.Get(\"keterangan\")&CRLF&\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbldeskripsi" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("keterangan")))),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("harga :  Rp."),parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _dt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("harga_jual")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 404;BA.debugLine="Panel1.Tag = dt";
Debug.ShouldStop(524288);
__ref.getField(false,"_panel1" /*RemoteObject*/ ).runMethod(false,"setTag",(_dt.getObject()));
 BA.debugLineNum = 405;BA.debugLine="clvDialog.Add(ppp,dt)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_clvdialog" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _ppp.getObject()),(Object)((_dt.getObject())));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("dt", _dt);
;
 BA.debugLineNum = 411;BA.debugLine="Log(\" clvAwal.Size : \" &clvInput.Size)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","23014721",RemoteObject.concat(RemoteObject.createImmutable(" clvAwal.Size : "),__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize")),0);
 BA.debugLineNum = 413;BA.debugLine="Log(dtharga)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","23014723",BA.ObjectToString(__ref.getField(false,"_dtharga" /*RemoteObject*/ )),0);
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Initialize (v2) ","v2",3,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "v2","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 194;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Return Me";
Debug.ShouldStop(4);
if (true) return __ref;
 BA.debugLineNum = 196;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ivBarang_Click (v2) ","v2",3,__ref.getField(false, "ba"),__ref,601);
if (RapidSub.canDelegate("ivbarang_click")) { return __ref.runUserSub(false, "v2","ivbarang_click", __ref);}
 BA.debugLineNum = 601;BA.debugLine="Private Sub ivBarang_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 602;BA.debugLine="Log(\"ivBarang_Click\")";
Debug.ShouldStop(33554432);
v2.__c.runVoidMethod ("LogImpl","23407873",RemoteObject.createImmutable("ivBarang_Click"),0);
 BA.debugLineNum = 603;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("ivBarang_LongClick (v2) ","v2",3,__ref.getField(false, "ba"),__ref,597);
if (RapidSub.canDelegate("ivbarang_longclick")) { return __ref.runUserSub(false, "v2","ivbarang_longclick", __ref);}
 BA.debugLineNum = 597;BA.debugLine="Private Sub ivBarang_LongClick";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 599;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Label2_Click (v2) ","v2",3,__ref.getField(false, "ba"),__ref,339);
if (RapidSub.canDelegate("label2_click")) { return __ref.runUserSub(false, "v2","label2_click", __ref);}
 BA.debugLineNum = 339;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("lblKamera_Click (v2) ","v2",3,__ref.getField(false, "ba"),__ref,327);
if (RapidSub.canDelegate("lblkamera_click")) { return __ref.runUserSub(false, "v2","lblkamera_click", __ref);}
 BA.debugLineNum = 327;BA.debugLine="Private Sub lblKamera_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("lblMin_Click (v2) ","v2",3,__ref.getField(false, "ba"),__ref,562);
if (RapidSub.canDelegate("lblmin_click")) { return __ref.runUserSub(false, "v2","lblmin_click", __ref);}
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 562;BA.debugLine="Private Sub lblMin_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 563;BA.debugLine="Dim lblt As Label  = Sender";
Debug.ShouldStop(262144);
_lblt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), v2.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lblt", _lblt);Debug.locals.put("lblt", _lblt);
 BA.debugLineNum = 564;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
Debug.ShouldStop(524288);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 565;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
Debug.ShouldStop(1048576);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")));
 BA.debugLineNum = 566;BA.debugLine="If lblt.Parent.As(B4XView).GetView(2).Tag.As(Int)";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 567;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=False";
Debug.ShouldStop(4194304);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setVisible",v2.__c.getField(true,"False"));
 BA.debugLineNum = 568;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=False";
Debug.ShouldStop(8388608);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setVisible",v2.__c.getField(true,"False"));
 BA.debugLineNum = 569;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=False";
Debug.ShouldStop(16777216);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"setVisible",v2.__c.getField(true,"False"));
 BA.debugLineNum = 570;BA.debugLine="lblt.Parent.As(B4XView).GetView(0).Visible=True";
Debug.ShouldStop(33554432);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setVisible",v2.__c.getField(true,"True"));
 };
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("lblPlus_Click (v2) ","v2",3,__ref.getField(false, "ba"),__ref,556);
if (RapidSub.canDelegate("lblplus_click")) { return __ref.runUserSub(false, "v2","lblplus_click", __ref);}
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 556;BA.debugLine="Private Sub lblPlus_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 557;BA.debugLine="Dim lblt As Label  = Sender";
Debug.ShouldStop(4096);
_lblt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), v2.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lblt", _lblt);Debug.locals.put("lblt", _lblt);
 BA.debugLineNum = 558;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
Debug.ShouldStop(8192);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 559;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
Debug.ShouldStop(16384);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")));
 BA.debugLineNum = 560;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblt_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblt_Click (v2) ","v2",3,__ref.getField(false, "ba"),__ref,618);
if (RapidSub.canDelegate("lblt_click")) { __ref.runUserSub(false, "v2","lblt_click", __ref); return;}
ResumableSub_lblt_Click rsub = new ResumableSub_lblt_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblt_Click extends BA.ResumableSub {
public ResumableSub_lblt_Click(b4a.example2.v2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example2.v2 parent;
RemoteObject _obj = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _tmpp = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _t = 0;
int step5;
int limit5;
int step11;
int limit11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblt_Click (v2) ","v2",3,__ref.getField(false, "ba"),__ref,618);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 621;BA.debugLine="Dim obj As  Object=Dl.ShowCustom(pd,\"Simpan\",\"Bat";
Debug.ShouldStop(4096);
_obj = __ref.getField(false,"_dl" /*RemoteObject*/ ).runClassMethod (b4a.example2.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_pd" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable(("Simpan"))),(Object)(RemoteObject.createImmutable(("Batal"))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("obj", _obj);Debug.locals.put("obj", _obj);
 BA.debugLineNum = 623;BA.debugLine="Wait For(obj)Complete(result As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "v2", "lblt_click"), _obj);
this.state = 29;
return;
case 29:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 625;BA.debugLine="Log($\"result ${result}\"$)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","242598407",(RemoteObject.concat(RemoteObject.createImmutable("result "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_result))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 626;BA.debugLine="If result=-1 Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 627;BA.debugLine="For i  = 0 To 	clvDialog.Size	-1";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//for
this.state = 27;
step5 = 1;
limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvdialog" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 30;
if (true) break;

case 30:
//C
this.state = 27;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 6;
if (true) break;

case 31:
//C
this.state = 30;
_i = ((int)(0 + _i + step5)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 628;BA.debugLine="Dim tmpp As Panel = clvDialog.GetPanel(i).GetVi";
Debug.ShouldStop(524288);
_tmpp = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_tmpp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_clvdialog" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("tmpp", _tmpp);Debug.locals.put("tmpp", _tmpp);
 BA.debugLineNum = 629;BA.debugLine="Log (tmpp.Tag)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","242598411",BA.ObjectToString(_tmpp.runMethod(false,"getTag")),0);
 BA.debugLineNum = 631;BA.debugLine="Log	(\"data ke - \"&i&\" \" &tmpp.GetView(2).Tag )";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","242598413",RemoteObject.concat(RemoteObject.createImmutable("data ke - "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" "),_tmpp.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")),0);
 BA.debugLineNum = 632;BA.debugLine="If tmpp.GetView(2).Tag >0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 7:
//if
this.state = 26;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tmpp.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 633;BA.debugLine="If clvInput.Size>0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 10:
//if
this.state = 25;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}else {
this.state = 24;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 635;BA.debugLine="For t = 0 To clvInput.Size-1";
Debug.ShouldStop(67108864);
if (true) break;

case 13:
//for
this.state = 22;
step11 = 1;
limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_t = 0 ;
Debug.locals.put("t", _t);
this.state = 32;
if (true) break;

case 32:
//C
this.state = 22;
if ((step11 > 0 && _t <= limit11) || (step11 < 0 && _t >= limit11)) this.state = 15;
if (true) break;

case 33:
//C
this.state = 32;
_t = ((int)(0 + _t + step11)) ;
Debug.locals.put("t", _t);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 636;BA.debugLine="Log(\"i : \"&i)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","242598418",RemoteObject.concat(RemoteObject.createImmutable("i : "),RemoteObject.createImmutable(_i)),0);
 BA.debugLineNum = 637;BA.debugLine="Log(\"T : \"&t)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","242598419",RemoteObject.concat(RemoteObject.createImmutable("T : "),RemoteObject.createImmutable(_t)),0);
 BA.debugLineNum = 638;BA.debugLine="Log(clvInput.GetValue (t))";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","242598420",BA.ObjectToString(__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _t)))),0);
 BA.debugLineNum = 639;BA.debugLine="Log(tmpp.Tag)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","242598421",BA.ObjectToString(_tmpp.runMethod(false,"getTag")),0);
 BA.debugLineNum = 640;BA.debugLine="If clvInput.GetValue (t) = tmpp.Tag Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _t))),_tmpp.runMethod(false,"getTag"))) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 641;BA.debugLine="Log(\"value sama\")";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","242598423",RemoteObject.createImmutable("value sama"),0);
 BA.debugLineNum = 642;BA.debugLine="AddToCLVInput(tmpp.Tag,tmpp.GetView(2).Tag)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example2.v2.class, "_addtoclvinput" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _tmpp.runMethod(false,"getTag")),(Object)(BA.numberCast(int.class, _tmpp.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))));
 BA.debugLineNum = 643;BA.debugLine="clvInput.GetPanel(t).GetView(3).GetView(2).Ta";
Debug.ShouldStop(4);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _t))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _t))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")),BA.numberCast(double.class, _tmpp.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))}, "+",1, 0)));
 BA.debugLineNum = 644;BA.debugLine="clvInput.GetPanel(t).GetView(3).GetView(2).Te";
Debug.ShouldStop(8);
__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _t))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToCharSequence((BA.ObjectToString(__ref.getField(false,"_clvinput" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _t))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")))));
 if (true) break;

case 20:
//C
this.state = 21;
 if (true) break;

case 21:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 25;
Debug.locals.put("t", _t);
;
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 651;BA.debugLine="AddToCLVInput(tmpp.Tag,tmpp.GetView(2).Tag)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example2.v2.class, "_addtoclvinput" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _tmpp.runMethod(false,"getTag")),(Object)(BA.numberCast(int.class, _tmpp.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))));
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 31;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
Debug.locals.put("i", _i);
;
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _lbltambah_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblTambah_Click (v2) ","v2",3,__ref.getField(false, "ba"),__ref,580);
if (RapidSub.canDelegate("lbltambah_click")) { return __ref.runUserSub(false, "v2","lbltambah_click", __ref);}
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 580;BA.debugLine="Private Sub lblTambah_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 581;BA.debugLine="Log(\"Klik\")";
Debug.ShouldStop(16);
v2.__c.runVoidMethod ("LogImpl","23276801",RemoteObject.createImmutable("Klik"),0);
 BA.debugLineNum = 582;BA.debugLine="Dim lblt As Label = Sender";
Debug.ShouldStop(32);
_lblt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), v2.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lblt", _lblt);Debug.locals.put("lblt", _lblt);
 BA.debugLineNum = 583;BA.debugLine="lblt.Visible = False";
Debug.ShouldStop(64);
_lblt.runMethod(true,"setVisible",v2.__c.getField(true,"False"));
 BA.debugLineNum = 584;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=True";
Debug.ShouldStop(128);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setVisible",v2.__c.getField(true,"True"));
 BA.debugLineNum = 585;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=True";
Debug.ShouldStop(256);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setVisible",v2.__c.getField(true,"True"));
 BA.debugLineNum = 586;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=True";
Debug.ShouldStop(512);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"setVisible",v2.__c.getField(true,"True"));
 BA.debugLineNum = 587;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
Debug.ShouldStop(1024);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {(BA.numberCast(int.class, (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"))),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 588;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
Debug.ShouldStop(2048);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lblt.runMethod(false,"getParent"))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag")));
 BA.debugLineNum = 595;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("txtAlamat_FocusChanged (v2) ","v2",3,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("txtalamat_focuschanged")) { return __ref.runUserSub(false, "v2","txtalamat_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 315;BA.debugLine="Private Sub txtAlamat_FocusChanged (HasFocus As Bo";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}