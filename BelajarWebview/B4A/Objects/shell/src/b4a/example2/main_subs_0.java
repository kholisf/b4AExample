package b4a.example2;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_actionbarhomeclick() throws Exception{
try {
		Debug.PushSubsStack("Activity_ActionBarHomeClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("activity_actionbarhomeclick")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","activity_actionbarhomeclick");}
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_ActionBarHomeClick";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="ActionBarHomeClicked = True";
Debug.ShouldStop(524288);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 53;BA.debugLine="B4XPages.Delegate.Activity_ActionBarHomeClick";
Debug.ShouldStop(1048576);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example2.b4xpagesdelegator.class, "_activity_actionbarhomeclick" /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="ActionBarHomeClicked = False";
Debug.ShouldStop(2097152);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _pm = RemoteObject.declareNull("b4a.example2.b4xpagesmanager");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Dim pm As B4XPagesManager";
Debug.ShouldStop(1);
_pm = RemoteObject.createNew ("b4a.example2.b4xpagesmanager");Debug.locals.put("pm", _pm);
 BA.debugLineNum = 36;BA.debugLine="imei=ph.GetSettings(\"android_id\")";
Debug.ShouldStop(8);
main._imei = main._ph.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("android_id")));
 BA.debugLineNum = 37;BA.debugLine="pm.Initialize(Activity)";
Debug.ShouldStop(16);
_pm.runClassMethod (b4a.example2.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._activity));
 BA.debugLineNum = 38;BA.debugLine="Log(rp.PERMISSION_CAMERA)";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2131078",main._rp.getField(true,"PERMISSION_CAMERA"),0);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Return B4XPages.Delegate.Activity_KeyPress(KeyCod";
Debug.ShouldStop(33554432);
if (true) return main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example2.b4xpagesdelegator.class, "_activity_keypress" /*RemoteObject*/ ,(Object)(_keycode));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,65);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="B4XPages.Delegate.Activity_Pause";
Debug.ShouldStop(2);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example2.b4xpagesdelegator.class, "_activity_pause" /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Activity_PermissionResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,69);
if (RapidSub.canDelegate("activity_permissionresult")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","activity_permissionresult", _permission, _result);}
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 69;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="B4XPages.Delegate.Activity_PermissionResult(Permi";
Debug.ShouldStop(32);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example2.b4xpagesdelegator.class, "_activity_permissionresult" /*RemoteObject*/ ,(Object)(_permission),(Object)(_result));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 61;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="B4XPages.Delegate.Activity_Resume";
Debug.ShouldStop(536870912);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example2.b4xpagesdelegator.class, "_activity_resume" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _create_menu(RemoteObject _menu) throws Exception{
try {
		Debug.PushSubsStack("Create_Menu (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("create_menu")) { return b4a.example2.main.remoteMe.runUserSub(false, "main","create_menu", _menu);}
Debug.locals.put("Menu", _menu);
 BA.debugLineNum = 73;BA.debugLine="Sub Create_Menu (Menu As Object)";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="B4XPages.Delegate.Create_Menu(Menu)";
Debug.ShouldStop(512);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example2.b4xpagesdelegator.class, "_create_menu" /*RemoteObject*/ ,(Object)(_menu));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
b4xpages_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example2.main");
b4xmainpage.myClass = BA.getDeviceClass ("b4a.example2.b4xmainpage");
cobadesain.myClass = BA.getDeviceClass ("b4a.example2.cobadesain");
v2.myClass = BA.getDeviceClass ("b4a.example2.v2");
starter.myClass = BA.getDeviceClass ("b4a.example2.starter");
v3.myClass = BA.getDeviceClass ("b4a.example2.v3");
v4.myClass = BA.getDeviceClass ("b4a.example2.v4");
menuatribut_request.myClass = BA.getDeviceClass ("b4a.example2.menuatribut_request");
clvnested.myClass = BA.getDeviceClass ("b4a.example2.clvnested");
b4xpages.myClass = BA.getDeviceClass ("b4a.example2.b4xpages");
b4xbitset.myClass = BA.getDeviceClass ("b4a.example2.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4a.example2.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4a.example2.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4a.example2.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4a.example2.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4a.example2.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4a.example2.b4xset");
b4xpagesdelegator.myClass = BA.getDeviceClass ("b4a.example2.b4xpagesdelegator");
b4xpagesmanager.myClass = BA.getDeviceClass ("b4a.example2.b4xpagesmanager");
fileprovider.myClass = BA.getDeviceClass ("b4a.example2.fileprovider");
httputils2service.myClass = BA.getDeviceClass ("b4a.example2.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example2.httpjob");
ximagesliderig.myClass = BA.getDeviceClass ("b4a.example2.ximagesliderig");
animatedcounter.myClass = BA.getDeviceClass ("b4a.example2.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.example2.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.example2.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.example2.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.example2.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.example2.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.example2.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.example2.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4a.example2.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.example2.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.example2.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.example2.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.example2.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.example2.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4a.example2.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.example2.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4a.example2.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.example2.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.example2.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.example2.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4a.example2.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("b4a.example2.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4a.example2.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.example2.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.example2.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4a.example2.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 21;BA.debugLine="Public ActionBarHomeClicked As Boolean";
main._actionbarhomeclicked = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 22;BA.debugLine="Dim rp As RuntimePermissions";
main._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 23;BA.debugLine="Type SliderContainer(slider As xImageSliderIG, it";
;
 //BA.debugLineNum = 24;BA.debugLine="Dim imei As String";
main._imei = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Dim ph As Phone";
main._ph = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}