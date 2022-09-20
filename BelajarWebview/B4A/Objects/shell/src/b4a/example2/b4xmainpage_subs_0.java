package b4a.example2;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Root = Root1";
Debug.ShouldStop(33554432);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 27;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 28;BA.debugLine="ccb.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ccb" /*RemoteObject*/ ).runClassMethod (b4a.example2.cobadesain.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="fl.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_fl" /*RemoteObject*/ ).runClassMethod (b4a.example2.fileprovider.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="mar.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mar" /*RemoteObject*/ ).runClassMethod (b4a.example2.v2.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 31;BA.debugLine="B4XPages.AddPage(\"coba\",ccb)";
Debug.ShouldStop(1073741824);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("coba")),(Object)((__ref.getField(false,"_ccb" /*RemoteObject*/ ))));
 BA.debugLineNum = 32;BA.debugLine="B4XPages.AddPage(\"mar\",mar)";
Debug.ShouldStop(-2147483648);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("mar")),(Object)((__ref.getField(false,"_mar" /*RemoteObject*/ ))));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 80;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 111;BA.debugLine="B4XPages.ShowPage(\"mar\")";
Debug.ShouldStop(16384);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mar")));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private WebView1 As WebView";
b4xmainpage._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");__ref.setField("_webview1",b4xmainpage._webview1);
 //BA.debugLineNum = 12;BA.debugLine="Dim rp As RuntimePermissions";
b4xmainpage._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",b4xmainpage._rp);
 //BA.debugLineNum = 13;BA.debugLine="Dim ccb As cobadesain";
b4xmainpage._ccb = RemoteObject.createNew ("b4a.example2.cobadesain");__ref.setField("_ccb",b4xmainpage._ccb);
 //BA.debugLineNum = 14;BA.debugLine="Dim p As Phone";
b4xmainpage._p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");__ref.setField("_p",b4xmainpage._p);
 //BA.debugLineNum = 15;BA.debugLine="Dim fl As FileProvider";
b4xmainpage._fl = RemoteObject.createNew ("b4a.example2.fileprovider");__ref.setField("_fl",b4xmainpage._fl);
 //BA.debugLineNum = 17;BA.debugLine="Dim mar As V2";
b4xmainpage._mar = RemoteObject.createNew ("b4a.example2.v2");__ref.setField("_mar",b4xmainpage._mar);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}