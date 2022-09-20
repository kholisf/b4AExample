package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clvnested extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example2.clvnested");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example2.clvnested.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example3.customlistview _scrollingclv = null;
public boolean _scrollingclvhorizontal = false;
public float _startoffset = 0f;
public float _scrollposition = 0f;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public b4a.example3.customlistview _clv = null;
public boolean _scrolled = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example2.main _main = null;
public b4a.example2.starter _starter = null;
public b4a.example2.b4xpages _b4xpages = null;
public b4a.example2.b4xcollections _b4xcollections = null;
public b4a.example2.httputils2service _httputils2service = null;
public b4a.example2.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example2.clvnested __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clvnested";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4a.objects.TouchPanelCreator _tpc = null;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim tpc As TouchPanelCreator";
_tpc = new anywheresoftware.b4a.objects.TouchPanelCreator();
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="base = tpc.CreateTouchPanel(\"tpc\")";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tpc.CreateTouchPanel(ba,"tpc").getObject()));
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Parent.AddView (base, 0, 0, Parent.Width, Parent.";
_parent.AddView((android.view.View)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example2.clvnested __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvnested";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Private ScrollingCLV As CustomListView";
_scrollingclv = new b4a.example3.customlistview();
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Private ScrollingCLVHorizontal As Boolean";
_scrollingclvhorizontal = false;
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Private StartOffset As Float = 0";
_startoffset = (float) (0);
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="Private ScrollPosition As Float";
_scrollposition = 0f;
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="Public base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="Public CLV As CustomListView";
_clv = new b4a.example3.customlistview();
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="Private Scrolled As Boolean";
_scrolled = false;
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="End Sub";
return "";
}
public b4a.example3.customlistview  _getinnerclvfromtouch(b4a.example2.clvnested __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvnested";
if (Debug.shouldDelegate(ba, "getinnerclvfromtouch", false))
	 {return ((b4a.example3.customlistview) Debug.delegate(ba, "getinnerclvfromtouch", new Object[] {_x,_y}));}
int _index = 0;
b4a.example3.customlistview._clvitem _item = null;
b4a.example3.customlistview _inner = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub GetInnerCLVFromTouch (x As Float, Y As";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Dim index As Int = CLV.FindIndexFromOffset(Y + CL";
_index = __ref._clv /*b4a.example3.customlistview*/ ._findindexfromoffset((int) (_y+__ref._clv /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY()));
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Dim item As CLVItem = CLV.GetRawListItem(index)";
_item = __ref._clv /*b4a.example3.customlistview*/ ._getrawlistitem(_index);
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Log($\"Dim ${index }As Int\"$)";
__c.LogImpl("27405571",("Dim "+__c.SmartStringFormatter("",(Object)(_index))+"As Int"),0);
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="Log($\"Dim ${item } As CLVItem \"$)";
__c.LogImpl("27405572",("Dim "+__c.SmartStringFormatter("",(Object)(_item))+" As CLVItem "),0);
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="If item.Panel.GetView(0).Tag Is CustomListView Th";
if (_item.Panel.GetView((int) (0)).getTag() instanceof b4a.example3.customlistview) { 
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="Dim inner As CustomListView = item.Panel.GetView";
_inner = (b4a.example3.customlistview)(_item.Panel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="If inner.AsView.Left <= x And inner.AsView.Left";
if (_inner._asview().getLeft()<=_x && _inner._asview().getLeft()+_inner._asview().getWidth()>=_x) { 
if (true) return _inner;};
 };
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="Return Null";
if (true) return (b4a.example3.customlistview)(__c.Null);
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="End Sub";
return null;
}
public float  _getoffset(b4a.example2.clvnested __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvnested";
if (Debug.shouldDelegate(ba, "getoffset", false))
	 {return ((Float) Debug.delegate(ba, "getoffset", new Object[] {_x,_y}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub GetOffset (x As Float, y As Float) As";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="If ScrollingCLVHorizontal Then";
if (__ref._scrollingclvhorizontal /*boolean*/ ) { 
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Return x";
if (true) return _x;
 }else {
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Return y";
if (true) return _y;
 };
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="End Sub";
return 0f;
}
public boolean  _ishorizontalclv(b4a.example2.clvnested __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvnested";
if (Debug.shouldDelegate(ba, "ishorizontalclv", false))
	 {return ((Boolean) Debug.delegate(ba, "ishorizontalclv", null));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub IsHorizontalCLV As Boolean";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Return ScrollingCLV.sv Is HorizontalScrollView";
if (true) return __ref._scrollingclv /*b4a.example3.customlistview*/ ._sv.getObjectOrNull() instanceof android.widget.HorizontalScrollView;
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="End Sub";
return false;
}
public boolean  _tpc_onintercepttouchevent(b4a.example2.clvnested __ref,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvnested";
if (Debug.shouldDelegate(ba, "tpc_onintercepttouchevent", false))
	 {return ((Boolean) Debug.delegate(ba, "tpc_onintercepttouchevent", new Object[] {_action,_x,_y,_motionevent}));}
b4a.example3.customlistview _inner = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub tpc_OnInterceptTouchEvent (Action As I";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="If Action = base.TOUCH_ACTION_DOWN Then";
if (_action==__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Dim inner As CustomListView = GetInnerCLVFromTou";
_inner = __ref._getinnerclvfromtouch /*b4a.example3.customlistview*/ (null,_x,_y);
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="If inner <> Null Then";
if (_inner!= null) { 
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="ScrollingCLV = inner";
__ref._scrollingclv /*b4a.example3.customlistview*/  = _inner;
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="ScrollingCLVHorizontal = IsHorizontalCLV";
__ref._scrollingclvhorizontal /*boolean*/  = __ref._ishorizontalclv /*boolean*/ (null);
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="StartOffset = GetOffset(X, Y)";
__ref._startoffset /*float*/  = __ref._getoffset /*float*/ (null,_x,_y);
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="Scrolled = False";
__ref._scrolled /*boolean*/  = __c.False;
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="ScrollPosition =  GetOffset(ScrollingCLV.sv.Scr";
__ref._scrollposition /*float*/  = __ref._getoffset /*float*/ (null,(float) (__ref._scrollingclv /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX()),(float) (__ref._scrollingclv /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY()));
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="End Sub";
return false;
}
public boolean  _tpc_ontouchevent(b4a.example2.clvnested __ref,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvnested";
if (Debug.shouldDelegate(ba, "tpc_ontouchevent", false))
	 {return ((Boolean) Debug.delegate(ba, "tpc_ontouchevent", new Object[] {_action,_x,_y,_motionevent}));}
float _deltaoffset = 0f;
int _innerindex = 0;
int _index = 0;
b4a.example3.customlistview._clvitem _item = null;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub tpc_OnTouchEvent (Action As Int, X As";
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP)) {
case 0: {
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="Dim deltaOffset As Float = (GetOffset(X, Y) - S";
_deltaoffset = (float) ((__ref._getoffset /*float*/ (null,_x,_y)-__ref._startoffset /*float*/ )*1.5);
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="If Scrolled = False Then";
if (__ref._scrolled /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="If Abs(deltaOffset) > 10dip Then Scrolled = Tr";
if (__c.Abs(_deltaoffset)>__c.DipToCurrent((int) (10))) { 
__ref._scrolled /*boolean*/  = __c.True;};
 };
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="If Scrolled Then";
if (__ref._scrolled /*boolean*/ ) { 
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="If ScrollingCLVHorizontal Then";
if (__ref._scrollingclvhorizontal /*boolean*/ ) { 
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="ScrollingCLV.sv.ScrollViewOffsetX = ScrollPos";
__ref._scrollingclv /*b4a.example3.customlistview*/ ._sv.setScrollViewOffsetX((int) (__ref._scrollposition /*float*/ -_deltaoffset));
 }else {
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="ScrollingCLV.sv.ScrollViewOffsetY = ScrollPos";
__ref._scrollingclv /*b4a.example3.customlistview*/ ._sv.setScrollViewOffsetY((int) (__ref._scrollposition /*float*/ -_deltaoffset));
 };
 };
 break; }
case 1: {
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="If Scrolled = False Then";
if (__ref._scrolled /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="If ScrollingCLVHorizontal Then";
if (__ref._scrollingclvhorizontal /*boolean*/ ) { 
RDebugUtils.currentLine=7143444;
 //BA.debugLineNum = 7143444;BA.debugLine="Dim innerIndex As Int = ScrollingCLV.FindInde";
_innerindex = __ref._scrollingclv /*b4a.example3.customlistview*/ ._findindexfromoffset((int) (_x+__ref._scrollingclv /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX()));
 }else {
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="Dim index As Int = CLV.FindIndexFromOffset(St";
_index = __ref._clv /*b4a.example3.customlistview*/ ._findindexfromoffset((int) (__ref._startoffset /*float*/ +__ref._clv /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY()));
RDebugUtils.currentLine=7143447;
 //BA.debugLineNum = 7143447;BA.debugLine="Dim item As CLVItem = CLV.GetRawListItem(inde";
_item = __ref._clv /*b4a.example3.customlistview*/ ._getrawlistitem(_index);
RDebugUtils.currentLine=7143448;
 //BA.debugLineNum = 7143448;BA.debugLine="Dim innerIndex As Int = ScrollingCLV.FindInde";
_innerindex = __ref._scrollingclv /*b4a.example3.customlistview*/ ._findindexfromoffset((int) (__ref._startoffset /*float*/ +__ref._clv /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY()-_item.Offset+__ref._scrollingclv /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY()));
RDebugUtils.currentLine=7143449;
 //BA.debugLineNum = 7143449;BA.debugLine="Log(index& \"  index\")";
__c.LogImpl("27143449",BA.NumberToString(_index)+"  index",0);
RDebugUtils.currentLine=7143450;
 //BA.debugLineNum = 7143450;BA.debugLine="Log(item&\" item\")";
__c.LogImpl("27143450",BA.ObjectToString(_item)+" item",0);
RDebugUtils.currentLine=7143451;
 //BA.debugLineNum = 7143451;BA.debugLine="Log(innerIndex&\" innerIndex\")";
__c.LogImpl("27143451",BA.NumberToString(_innerindex)+" innerIndex",0);
 };
RDebugUtils.currentLine=7143453;
 //BA.debugLineNum = 7143453;BA.debugLine="CallSub2(ScrollingCLV, \"Panel\" & \"ClickHandler";
__c.CallSubNew2(ba,(Object)(__ref._scrollingclv /*b4a.example3.customlistview*/ ),"Panel"+"ClickHandler",(Object)(__ref._scrollingclv /*b4a.example3.customlistview*/ ._getrawlistitem(_innerindex).Panel));
 };
RDebugUtils.currentLine=7143455;
 //BA.debugLineNum = 7143455;BA.debugLine="ScrollingCLV = Null";
__ref._scrollingclv /*b4a.example3.customlistview*/  = (b4a.example3.customlistview)(__c.Null);
 break; }
}
;
RDebugUtils.currentLine=7143457;
 //BA.debugLineNum = 7143457;BA.debugLine="Return ScrollingCLV <> Null";
if (true) return __ref._scrollingclv /*b4a.example3.customlistview*/ != null;
RDebugUtils.currentLine=7143458;
 //BA.debugLineNum = 7143458;BA.debugLine="End Sub";
return false;
}
}