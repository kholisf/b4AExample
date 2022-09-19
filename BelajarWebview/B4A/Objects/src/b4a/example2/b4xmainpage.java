package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example2.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example2.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public b4a.example2.cobadesain _ccb = null;
public anywheresoftware.b4a.phone.Phone _p = null;
public b4a.example2.fileprovider _fl = null;
public b4a.example2.menuatribut_request _mar = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example2.main _main = null;
public b4a.example2.starter _starter = null;
public b4a.example2.b4xpages _b4xpages = null;
public b4a.example2.b4xcollections _b4xcollections = null;
public b4a.example2.httputils2service _httputils2service = null;
public b4a.example2.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 25;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 27;BA.debugLine="ccb.Initialize";
_ccb._initialize /*Object*/ (ba);
 //BA.debugLineNum = 28;BA.debugLine="fl.Initialize";
_fl._initialize /*String*/ (ba);
 //BA.debugLineNum = 29;BA.debugLine="mar.Initialize";
_mar._initialize /*Object*/ (ba);
 //BA.debugLineNum = 30;BA.debugLine="B4XPages.AddPage(\"coba\",ccb)";
_b4xpages._addpage /*String*/ (ba,"coba",(Object)(_ccb));
 //BA.debugLineNum = 31;BA.debugLine="B4XPages.AddPage(\"mar\",mar)";
_b4xpages._addpage /*String*/ (ba,"mar",(Object)(_mar));
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 110;BA.debugLine="B4XPages.ShowPage(\"mar\")";
_b4xpages._showpage /*String*/ (ba,"mar");
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private WebView1 As WebView";
_webview1 = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 13;BA.debugLine="Dim ccb As cobadesain";
_ccb = new b4a.example2.cobadesain();
 //BA.debugLineNum = 14;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 15;BA.debugLine="Dim fl As FileProvider";
_fl = new b4a.example2.fileprovider();
 //BA.debugLineNum = 16;BA.debugLine="Dim mar As MenuAtribut_request";
_mar = new b4a.example2.menuatribut_request();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
