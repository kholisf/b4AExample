package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clvnested extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example2.clvnested");
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private ScrollingCLV As CustomListView";
_scrollingclv = new b4a.example3.customlistview();
 //BA.debugLineNum = 5;BA.debugLine="Private ScrollingCLVHorizontal As Boolean";
_scrollingclvhorizontal = false;
 //BA.debugLineNum = 6;BA.debugLine="Private StartOffset As Float";
_startoffset = 0f;
 //BA.debugLineNum = 7;BA.debugLine="Private ScrollPosition As Float";
_scrollposition = 0f;
 //BA.debugLineNum = 8;BA.debugLine="Public base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Public CLV As CustomListView";
_clv = new b4a.example3.customlistview();
 //BA.debugLineNum = 10;BA.debugLine="Private Scrolled As Boolean";
_scrolled = false;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4a.example3.customlistview  _getinnerclvfromtouch(float _x,float _y) throws Exception{
int _index = 0;
b4a.example3.customlistview._clvitem _item = null;
b4a.example3.customlistview _inner = null;
 //BA.debugLineNum = 80;BA.debugLine="Private Sub GetInnerCLVFromTouch (x As Float, Y As";
 //BA.debugLineNum = 81;BA.debugLine="Dim index As Int = CLV.FindIndexFromOffset(Y + CL";
_index = _clv._findindexfromoffset((int) (_y+_clv._sv.getScrollViewOffsetY()));
 //BA.debugLineNum = 82;BA.debugLine="Dim item As CLVItem = CLV.GetRawListItem(index)";
_item = _clv._getrawlistitem(_index);
 //BA.debugLineNum = 83;BA.debugLine="If item.Panel.GetView(0).Tag Is CustomListView Th";
if (_item.Panel.GetView((int) (0)).getTag() instanceof b4a.example3.customlistview) { 
 //BA.debugLineNum = 84;BA.debugLine="Dim inner As CustomListView = item.Panel.GetView";
_inner = (b4a.example3.customlistview)(_item.Panel.GetView((int) (0)).getTag());
 //BA.debugLineNum = 86;BA.debugLine="If inner.AsView.Left <= x And inner.AsView.Left";
if (_inner._asview().getLeft()<=_x && _inner._asview().getLeft()+_inner._asview().getWidth()>=_x) { 
if (true) return _inner;};
 };
 //BA.debugLineNum = 88;BA.debugLine="Return Null";
if (true) return (b4a.example3.customlistview)(__c.Null);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public float  _getoffset(float _x,float _y) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Private Sub GetOffset (x As Float, y As Float) As";
 //BA.debugLineNum = 69;BA.debugLine="If ScrollingCLVHorizontal Then";
if (_scrollingclvhorizontal) { 
 //BA.debugLineNum = 70;BA.debugLine="Return x";
if (true) return _x;
 }else {
 //BA.debugLineNum = 72;BA.debugLine="Return y";
if (true) return _y;
 };
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.TouchPanelCreator _tpc = null;
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
 //BA.debugLineNum = 14;BA.debugLine="Dim tpc As TouchPanelCreator";
_tpc = new anywheresoftware.b4a.objects.TouchPanelCreator();
 //BA.debugLineNum = 15;BA.debugLine="base = tpc.CreateTouchPanel(\"tpc\")";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tpc.CreateTouchPanel(ba,"tpc").getObject()));
 //BA.debugLineNum = 16;BA.debugLine="Parent.AddView (base, 0, 0, Parent.Width, Parent.";
_parent.AddView((android.view.View)(_base.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public boolean  _ishorizontalclv() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Private Sub IsHorizontalCLV As Boolean";
 //BA.debugLineNum = 77;BA.debugLine="Return ScrollingCLV.sv Is HorizontalScrollView";
if (true) return _scrollingclv._sv.getObjectOrNull() instanceof android.widget.HorizontalScrollView;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return false;
}
public boolean  _tpc_onintercepttouchevent(int _action,float _x,float _y,Object _motionevent) throws Exception{
b4a.example3.customlistview _inner = null;
 //BA.debugLineNum = 52;BA.debugLine="Private Sub tpc_OnInterceptTouchEvent (Action As I";
 //BA.debugLineNum = 54;BA.debugLine="If Action = base.TOUCH_ACTION_DOWN Then";
if (_action==_base.TOUCH_ACTION_DOWN) { 
 //BA.debugLineNum = 55;BA.debugLine="Dim inner As CustomListView = GetInnerCLVFromTou";
_inner = _getinnerclvfromtouch(_x,_y);
 //BA.debugLineNum = 56;BA.debugLine="If inner <> Null Then";
if (_inner!= null) { 
 //BA.debugLineNum = 57;BA.debugLine="ScrollingCLV = inner";
_scrollingclv = _inner;
 //BA.debugLineNum = 58;BA.debugLine="ScrollingCLVHorizontal = IsHorizontalCLV";
_scrollingclvhorizontal = _ishorizontalclv();
 //BA.debugLineNum = 59;BA.debugLine="StartOffset = GetOffset(X, Y)";
_startoffset = _getoffset(_x,_y);
 //BA.debugLineNum = 60;BA.debugLine="Scrolled = False";
_scrolled = __c.False;
 //BA.debugLineNum = 61;BA.debugLine="ScrollPosition =  GetOffset(ScrollingCLV.sv.Scr";
_scrollposition = _getoffset((float) (_scrollingclv._sv.getScrollViewOffsetX()),(float) (_scrollingclv._sv.getScrollViewOffsetY()));
 //BA.debugLineNum = 62;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 //BA.debugLineNum = 65;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return false;
}
public boolean  _tpc_ontouchevent(int _action,float _x,float _y,Object _motionevent) throws Exception{
float _deltaoffset = 0f;
int _innerindex = 0;
int _index = 0;
b4a.example3.customlistview._clvitem _item = null;
 //BA.debugLineNum = 19;BA.debugLine="Private Sub tpc_OnTouchEvent (Action As Int, X As";
 //BA.debugLineNum = 22;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_base.TOUCH_ACTION_MOVE,_base.TOUCH_ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 24;BA.debugLine="Dim deltaOffset As Float = (GetOffset(X, Y) - S";
_deltaoffset = (float) ((_getoffset(_x,_y)-_startoffset)*1.5);
 //BA.debugLineNum = 25;BA.debugLine="If Scrolled = False Then";
if (_scrolled==__c.False) { 
 //BA.debugLineNum = 26;BA.debugLine="If Abs(deltaOffset) > 10dip Then Scrolled = Tr";
if (__c.Abs(_deltaoffset)>__c.DipToCurrent((int) (10))) { 
_scrolled = __c.True;};
 };
 //BA.debugLineNum = 28;BA.debugLine="If Scrolled Then";
if (_scrolled) { 
 //BA.debugLineNum = 30;BA.debugLine="If ScrollingCLVHorizontal Then";
if (_scrollingclvhorizontal) { 
 //BA.debugLineNum = 31;BA.debugLine="ScrollingCLV.sv.ScrollViewOffsetX = ScrollPos";
_scrollingclv._sv.setScrollViewOffsetX((int) (_scrollposition-_deltaoffset));
 }else {
 //BA.debugLineNum = 33;BA.debugLine="ScrollingCLV.sv.ScrollViewOffsetY = ScrollPos";
_scrollingclv._sv.setScrollViewOffsetY((int) (_scrollposition-_deltaoffset));
 };
 };
 break; }
case 1: {
 //BA.debugLineNum = 37;BA.debugLine="If Scrolled = False Then";
if (_scrolled==__c.False) { 
 //BA.debugLineNum = 38;BA.debugLine="If ScrollingCLVHorizontal Then";
if (_scrollingclvhorizontal) { 
 //BA.debugLineNum = 39;BA.debugLine="Dim innerIndex As Int = ScrollingCLV.FindInde";
_innerindex = _scrollingclv._findindexfromoffset((int) (_x+_scrollingclv._sv.getScrollViewOffsetX()));
 }else {
 //BA.debugLineNum = 41;BA.debugLine="Dim index As Int = CLV.FindIndexFromOffset(St";
_index = _clv._findindexfromoffset((int) (_startoffset+_clv._sv.getScrollViewOffsetY()));
 //BA.debugLineNum = 42;BA.debugLine="Dim item As CLVItem = CLV.GetRawListItem(inde";
_item = _clv._getrawlistitem(_index);
 //BA.debugLineNum = 43;BA.debugLine="Dim innerIndex As Int = ScrollingCLV.FindInde";
_innerindex = _scrollingclv._findindexfromoffset((int) (_startoffset+_clv._sv.getScrollViewOffsetY()-_item.Offset+_scrollingclv._sv.getScrollViewOffsetY()));
 };
 //BA.debugLineNum = 45;BA.debugLine="CallSub2(ScrollingCLV, \"Panel\" & \"ClickHandler";
__c.CallSubNew2(ba,(Object)(_scrollingclv),"Panel"+"ClickHandler",(Object)(_scrollingclv._getrawlistitem(_innerindex).Panel));
 };
 //BA.debugLineNum = 47;BA.debugLine="ScrollingCLV = Null";
_scrollingclv = (b4a.example3.customlistview)(__c.Null);
 break; }
}
;
 //BA.debugLineNum = 49;BA.debugLine="Return ScrollingCLV <> Null";
if (true) return _scrollingclv!= null;
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
