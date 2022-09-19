package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class v4 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example2.v4");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example2.v4.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtjaket = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txthelm = null;
public b4a.example3.customlistview _clvout = null;
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
 //BA.debugLineNum = 27;BA.debugLine="Root.LoadLayout(\"v4\")";
_root.LoadLayout("v4",ba);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 12;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private txtJaket As EditText";
_txtjaket = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private txtHelm As EditText";
_txthelm = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private clvOut As CustomListView";
_clvout = new b4a.example3.customlistview();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _label3_click() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub Label3_Click";
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
