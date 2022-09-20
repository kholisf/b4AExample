package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class swiftbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example2.swiftbutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example2.swiftbutton.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public int _clr1 = 0;
public int _clr2 = 0;
public int _disabledcolor = 0;
public boolean _pressed = false;
public Object _tag = null;
public boolean _mdisabled = false;
public int _cornersradius = 0;
public int _sideheight = 0;
public boolean _mhaptic = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example2.main _main = null;
public b4a.example2.starter _starter = null;
public b4a.example2.b4xpages _b4xpages = null;
public b4a.example2.b4xcollections _b4xcollections = null;
public b4a.example2.httputils2service _httputils2service = null;
public b4a.example2.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example2.swiftbutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=41156611;
 //BA.debugLineNum = 41156611;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
RDebugUtils.currentLine=41156613;
 //BA.debugLineNum = 41156613;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=41156614;
 //BA.debugLineNum = 41156614;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.example2.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _c = 0;
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Private Sub Draw";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=41615363;
 //BA.debugLineNum = 41615363;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=41615364;
 //BA.debugLineNum = 41615364;BA.debugLine="r.Initialize(0, SideHeight, mBase.Width, mBase.He";
_r.Initialize((float) (0),(float) (__ref._sideheight /*int*/ ),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=41615365;
 //BA.debugLineNum = 41615365;BA.debugLine="If pressed = False Then";
if (__ref._pressed /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=41615366;
 //BA.debugLineNum = 41615366;BA.debugLine="xLBL.Top = 0";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (0));
RDebugUtils.currentLine=41615367;
 //BA.debugLineNum = 41615367;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=41615368;
 //BA.debugLineNum = 41615368;BA.debugLine="cvs.DrawPath(p, clr2, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._clr2 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=41615369;
 //BA.debugLineNum = 41615369;BA.debugLine="r.Initialize(0, 0, mBase.Width, mBase.Height - S";
_r.Initialize((float) (0),(float) (0),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._sideheight /*int*/ ));
RDebugUtils.currentLine=41615370;
 //BA.debugLineNum = 41615370;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=41615371;
 //BA.debugLineNum = 41615371;BA.debugLine="cvs.DrawPath(p, clr1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._clr1 /*int*/ ,__c.True,(float) (0));
 }else {
RDebugUtils.currentLine=41615373;
 //BA.debugLineNum = 41615373;BA.debugLine="xLBL.Top = SideHeight";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(__ref._sideheight /*int*/ );
RDebugUtils.currentLine=41615374;
 //BA.debugLineNum = 41615374;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=41615375;
 //BA.debugLineNum = 41615375;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=41615376;
 //BA.debugLineNum = 41615376;BA.debugLine="If mDisabled Then c = disabledColor Else c = clr";
if (__ref._mdisabled /*boolean*/ ) { 
_c = __ref._disabledcolor /*int*/ ;}
else {
_c = __ref._clr1 /*int*/ ;};
RDebugUtils.currentLine=41615377;
 //BA.debugLineNum = 41615377;BA.debugLine="cvs.DrawPath(p, c, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_c,__c.True,(float) (0));
 };
RDebugUtils.currentLine=41615380;
 //BA.debugLineNum = 41615380;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=41615381;
 //BA.debugLineNum = 41615381;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example2.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=40960003;
 //BA.debugLineNum = 40960003;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40960004;
 //BA.debugLineNum = 40960004;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=40960005;
 //BA.debugLineNum = 40960005;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=40960006;
 //BA.debugLineNum = 40960006;BA.debugLine="Public xLBL As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40960007;
 //BA.debugLineNum = 40960007;BA.debugLine="Public clr1, clr2, disabledColor As Int";
_clr1 = 0;
_clr2 = 0;
_disabledcolor = 0;
RDebugUtils.currentLine=40960008;
 //BA.debugLineNum = 40960008;BA.debugLine="Private pressed As Boolean";
_pressed = false;
RDebugUtils.currentLine=40960009;
 //BA.debugLineNum = 40960009;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=40960010;
 //BA.debugLineNum = 40960010;BA.debugLine="Private mDisabled As Boolean";
_mdisabled = false;
RDebugUtils.currentLine=40960011;
 //BA.debugLineNum = 40960011;BA.debugLine="Public CornersRadius, SideHeight As Int";
_cornersradius = 0;
_sideheight = 0;
RDebugUtils.currentLine=40960012;
 //BA.debugLineNum = 40960012;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=40960013;
 //BA.debugLineNum = 40960013;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example2.swiftbutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=41091075;
 //BA.debugLineNum = 41091075;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"p\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"p");
RDebugUtils.currentLine=41091076;
 //BA.debugLineNum = 41091076;BA.debugLine="p.Color = xui.Color_Transparent";
_p.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=41091077;
 //BA.debugLineNum = 41091077;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"Primary";
__ref._clr1 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("PrimaryColor")));
RDebugUtils.currentLine=41091078;
 //BA.debugLineNum = 41091078;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"Seconda";
__ref._clr2 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SecondaryColor")));
RDebugUtils.currentLine=41091079;
 //BA.debugLineNum = 41091079;BA.debugLine="disabledColor = xui.PaintOrColorToColor(Props.Get";
__ref._disabledcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("DisabledColor"),(Object)(((int)0xff999999))));
RDebugUtils.currentLine=41091080;
 //BA.debugLineNum = 41091080;BA.debugLine="CornersRadius = DipToCurrent(Props.GetDefault(\"Co";
__ref._cornersradius /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(15)))));
RDebugUtils.currentLine=41091081;
 //BA.debugLineNum = 41091081;BA.debugLine="SideHeight = DipToCurrent(Props.GetDefault(\"SideH";
__ref._sideheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("SideHeight"),(Object)(5)))));
RDebugUtils.currentLine=41091082;
 //BA.debugLineNum = 41091082;BA.debugLine="mDisabled = Not(Props.GetDefault(\"ButtonEnabled\",";
__ref._mdisabled /*boolean*/  = __c.Not(BA.ObjectToBoolean(_props.GetDefault((Object)("ButtonEnabled"),(Object)(__c.True))));
RDebugUtils.currentLine=41091083;
 //BA.debugLineNum = 41091083;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=41091084;
 //BA.debugLineNum = 41091084;BA.debugLine="pressed = mDisabled";
__ref._pressed /*boolean*/  = __ref._mdisabled /*boolean*/ ;
RDebugUtils.currentLine=41091085;
 //BA.debugLineNum = 41091085;BA.debugLine="xLBL = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=41091086;
 //BA.debugLineNum = 41091086;BA.debugLine="xLBL.Visible = True";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=41091087;
 //BA.debugLineNum = 41091087;BA.debugLine="mBase.AddView(xLBL, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=41091088;
 //BA.debugLineNum = 41091088;BA.debugLine="mBase.AddView(p, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=41091089;
 //BA.debugLineNum = 41091089;BA.debugLine="xLBL.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=41091090;
 //BA.debugLineNum = 41091090;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=41091091;
 //BA.debugLineNum = 41091091;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=41091092;
 //BA.debugLineNum = 41091092;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled(b4a.example2.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="Return Not(mDisabled)";
if (true) return __c.Not(__ref._mdisabled /*boolean*/ );
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example2.swiftbutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=41025538;
 //BA.debugLineNum = 41025538;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=41025539;
 //BA.debugLineNum = 41025539;BA.debugLine="End Sub";
return "";
}
public String  _p_touch(b4a.example2.swiftbutton __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "p_touch", true))
	 {return ((String) Debug.delegate(ba, "p_touch", new Object[] {_action,_x,_y}));}
boolean _inside = false;
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Private Sub p_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="If mDisabled Then Return";
if (__ref._mdisabled /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="Dim Inside As Boolean = x > 0 And x < mBase.Width";
_inside = _x>0 && _x<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth() && _y>0 && _y<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
RDebugUtils.currentLine=41353219;
 //BA.debugLineNum = 41353219;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP,(int) (3))) {
case 0: {
RDebugUtils.currentLine=41353221;
 //BA.debugLineNum = 41353221;BA.debugLine="SetPressedState(True)";
__ref._setpressedstate /*String*/ (null,__c.True);
RDebugUtils.currentLine=41353222;
 //BA.debugLineNum = 41353222;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=41353224;
 //BA.debugLineNum = 41353224;BA.debugLine="If pressed <> Inside Then";
if (__ref._pressed /*boolean*/ !=_inside) { 
RDebugUtils.currentLine=41353225;
 //BA.debugLineNum = 41353225;BA.debugLine="SetPressedState(Inside)";
__ref._setpressedstate /*String*/ (null,_inside);
RDebugUtils.currentLine=41353226;
 //BA.debugLineNum = 41353226;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 };
 break; }
case 2: 
case 3: {
RDebugUtils.currentLine=41353229;
 //BA.debugLineNum = 41353229;BA.debugLine="SetPressedState(False)";
__ref._setpressedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=41353230;
 //BA.debugLineNum = 41353230;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=41353231;
 //BA.debugLineNum = 41353231;BA.debugLine="If Inside Then";
if (_inside) { 
RDebugUtils.currentLine=41353232;
 //BA.debugLineNum = 41353232;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=41353233;
 //BA.debugLineNum = 41353233;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Click";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click");
 };
 break; }
}
;
RDebugUtils.currentLine=41353236;
 //BA.debugLineNum = 41353236;BA.debugLine="End Sub";
return "";
}
public String  _setpressedstate(b4a.example2.swiftbutton __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setpressedstate", true))
	 {return ((String) Debug.delegate(ba, "setpressedstate", new Object[] {_newstate}));}
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Private Sub SetPressedState(NewState As Boolean)";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="If pressed = NewState Then Return";
if (__ref._pressed /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="If NewState And xui.SubExists(mCallBack, mEventNa";
if (_newstate && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonDown",(int) (0))) { 
RDebugUtils.currentLine=41418755;
 //BA.debugLineNum = 41418755;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonD";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonDown");
 };
RDebugUtils.currentLine=41418757;
 //BA.debugLineNum = 41418757;BA.debugLine="If NewState = False And xui.SubExists(mCallBack,";
if (_newstate==__c.False && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonUp",(int) (0))) { 
RDebugUtils.currentLine=41418758;
 //BA.debugLineNum = 41418758;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonU";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonUp");
 };
RDebugUtils.currentLine=41418760;
 //BA.debugLineNum = 41418760;BA.debugLine="pressed= NewState";
__ref._pressed /*boolean*/  = _newstate;
RDebugUtils.currentLine=41418761;
 //BA.debugLineNum = 41418761;BA.debugLine="End Sub";
return "";
}
public String  _setcolors(b4a.example2.swiftbutton __ref,int _primary,int _secondary) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setcolors", true))
	 {return ((String) Debug.delegate(ba, "setcolors", new Object[] {_primary,_secondary}));}
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Public Sub SetColors(Primary As Int, Secondary As";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="clr1 = Primary";
__ref._clr1 /*int*/  = _primary;
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="clr2 = Secondary";
__ref._clr2 /*int*/  = _secondary;
RDebugUtils.currentLine=41484291;
 //BA.debugLineNum = 41484291;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=41484292;
 //BA.debugLineNum = 41484292;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4a.example2.swiftbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Public Sub setEnabled(b As Boolean)";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="mDisabled = Not(b)";
__ref._mdisabled /*boolean*/  = __c.Not(_b);
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="pressed = mDisabled";
__ref._pressed /*boolean*/  = __ref._mdisabled /*boolean*/ ;
RDebugUtils.currentLine=41287683;
 //BA.debugLineNum = 41287683;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=41287684;
 //BA.debugLineNum = 41287684;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example2.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="End Sub";
return "";
}
}