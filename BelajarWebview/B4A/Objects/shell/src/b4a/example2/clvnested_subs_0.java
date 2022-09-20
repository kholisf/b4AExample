package b4a.example2;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clvnested_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
clvnested._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",clvnested._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private ScrollingCLV As CustomListView";
clvnested._scrollingclv = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_scrollingclv",clvnested._scrollingclv);
 //BA.debugLineNum = 5;BA.debugLine="Private ScrollingCLVHorizontal As Boolean";
clvnested._scrollingclvhorizontal = RemoteObject.createImmutable(false);__ref.setField("_scrollingclvhorizontal",clvnested._scrollingclvhorizontal);
 //BA.debugLineNum = 6;BA.debugLine="Private StartOffset As Float = 0";
clvnested._startoffset = BA.numberCast(float.class, 0);__ref.setField("_startoffset",clvnested._startoffset);
 //BA.debugLineNum = 10;BA.debugLine="Private ScrollPosition As Float";
clvnested._scrollposition = RemoteObject.createImmutable(0f);__ref.setField("_scrollposition",clvnested._scrollposition);
 //BA.debugLineNum = 11;BA.debugLine="Public base As B4XView";
clvnested._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",clvnested._base);
 //BA.debugLineNum = 12;BA.debugLine="Public CLV As CustomListView";
clvnested._clv = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clv",clvnested._clv);
 //BA.debugLineNum = 13;BA.debugLine="Private Scrolled As Boolean";
clvnested._scrolled = RemoteObject.createImmutable(false);__ref.setField("_scrolled",clvnested._scrolled);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getinnerclvfromtouch(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("GetInnerCLVFromTouch (clvnested) ","clvnested",8,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("getinnerclvfromtouch")) { return __ref.runUserSub(false, "clvnested","getinnerclvfromtouch", __ref, _x, _y);}
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _inner = RemoteObject.declareNull("b4a.example3.customlistview");
Debug.locals.put("x", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 86;BA.debugLine="Private Sub GetInnerCLVFromTouch (x As Float, Y As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Dim index As Int = CLV.FindIndexFromOffset(Y + CL";
Debug.ShouldStop(4194304);
_index = __ref.getField(false,"_clv" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(false,"_clv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY")}, "+",1, 0))));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 88;BA.debugLine="Dim item As CLVItem = CLV.GetRawListItem(index)";
Debug.ShouldStop(8388608);
_item = __ref.getField(false,"_clv" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 89;BA.debugLine="Log($\"Dim ${index }As Int\"$)";
Debug.ShouldStop(16777216);
clvnested.__c.runVoidMethod ("LogImpl","27405571",(RemoteObject.concat(RemoteObject.createImmutable("Dim "),clvnested.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_index))),RemoteObject.createImmutable("As Int"))),0);
 BA.debugLineNum = 90;BA.debugLine="Log($\"Dim ${item } As CLVItem \"$)";
Debug.ShouldStop(33554432);
clvnested.__c.runVoidMethod ("LogImpl","27405572",(RemoteObject.concat(RemoteObject.createImmutable("Dim "),clvnested.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item))),RemoteObject.createImmutable(" As CLVItem "))),0);
 BA.debugLineNum = 91;BA.debugLine="If item.Panel.GetView(0).Tag Is CustomListView Th";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("i",_item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"), RemoteObject.createImmutable("b4a.example3.customlistview"))) { 
 BA.debugLineNum = 92;BA.debugLine="Dim inner As CustomListView = item.Panel.GetView";
Debug.ShouldStop(134217728);
_inner = (_item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("inner", _inner);Debug.locals.put("inner", _inner);
 BA.debugLineNum = 94;BA.debugLine="If inner.AsView.Left <= x And inner.AsView.Left";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("k",_inner.runMethod(false,"_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, _x)) && RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_inner.runMethod(false,"_asview").runMethod(true,"getLeft"),_inner.runMethod(false,"_asview").runMethod(true,"getWidth")}, "+",1, 1),BA.numberCast(double.class, _x))) { 
if (true) return _inner;};
 };
 BA.debugLineNum = 96;BA.debugLine="Return Null";
Debug.ShouldStop(-2147483648);
if (true) return (clvnested.__c.getField(false,"Null"));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getoffset(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("GetOffset (clvnested) ","clvnested",8,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("getoffset")) { return __ref.runUserSub(false, "clvnested","getoffset", __ref, _x, _y);}
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 74;BA.debugLine="Private Sub GetOffset (x As Float, y As Float) As";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="If ScrollingCLVHorizontal Then";
Debug.ShouldStop(1024);
if (__ref.getField(true,"_scrollingclvhorizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="Return x";
Debug.ShouldStop(2048);
if (true) return _x;
 }else {
 BA.debugLineNum = 78;BA.debugLine="Return y";
Debug.ShouldStop(8192);
if (true) return _y;
 };
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clvnested) ","clvnested",8,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clvnested","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _tpc = RemoteObject.declareNull("anywheresoftware.b4a.objects.TouchPanelCreator");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Dim tpc As TouchPanelCreator";
Debug.ShouldStop(65536);
_tpc = RemoteObject.createNew ("anywheresoftware.b4a.objects.TouchPanelCreator");Debug.locals.put("tpc", _tpc);
 BA.debugLineNum = 18;BA.debugLine="base = tpc.CreateTouchPanel(\"tpc\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_base" /*RemoteObject*/ ).setObject (_tpc.runMethod(false,"CreateTouchPanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tpc"))).getObject());
 BA.debugLineNum = 19;BA.debugLine="Parent.AddView (base, 0, 0, Parent.Width, Parent.";
Debug.ShouldStop(262144);
_parent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_base" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ishorizontalclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsHorizontalCLV (clvnested) ","clvnested",8,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("ishorizontalclv")) { return __ref.runUserSub(false, "clvnested","ishorizontalclv", __ref);}
 BA.debugLineNum = 82;BA.debugLine="Private Sub IsHorizontalCLV As Boolean";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Return ScrollingCLV.sv Is HorizontalScrollView";
Debug.ShouldStop(262144);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("i",__ref.getField(false,"_scrollingclv" /*RemoteObject*/ ).getField(false,"_sv").getObjectOrNull(), RemoteObject.createImmutable("android.widget.HorizontalScrollView")));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tpc_onintercepttouchevent(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("tpc_OnInterceptTouchEvent (clvnested) ","clvnested",8,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("tpc_onintercepttouchevent")) { return __ref.runUserSub(false, "clvnested","tpc_onintercepttouchevent", __ref, _action, _x, _y, _motionevent);}
RemoteObject _inner = RemoteObject.declareNull("b4a.example3.customlistview");
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 58;BA.debugLine="Private Sub tpc_OnInterceptTouchEvent (Action As I";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="If Action = base.TOUCH_ACTION_DOWN Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 61;BA.debugLine="Dim inner As CustomListView = GetInnerCLVFromTou";
Debug.ShouldStop(268435456);
_inner = __ref.runClassMethod (b4a.example2.clvnested.class, "_getinnerclvfromtouch" /*RemoteObject*/ ,(Object)(_x),(Object)(_y));Debug.locals.put("inner", _inner);Debug.locals.put("inner", _inner);
 BA.debugLineNum = 62;BA.debugLine="If inner <> Null Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("N",_inner)) { 
 BA.debugLineNum = 63;BA.debugLine="ScrollingCLV = inner";
Debug.ShouldStop(1073741824);
__ref.setField ("_scrollingclv" /*RemoteObject*/ ,_inner);
 BA.debugLineNum = 64;BA.debugLine="ScrollingCLVHorizontal = IsHorizontalCLV";
Debug.ShouldStop(-2147483648);
__ref.setField ("_scrollingclvhorizontal" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example2.clvnested.class, "_ishorizontalclv" /*RemoteObject*/ ));
 BA.debugLineNum = 65;BA.debugLine="StartOffset = GetOffset(X, Y)";
Debug.ShouldStop(1);
__ref.setField ("_startoffset" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example2.clvnested.class, "_getoffset" /*RemoteObject*/ ,(Object)(_x),(Object)(_y)));
 BA.debugLineNum = 66;BA.debugLine="Scrolled = False";
Debug.ShouldStop(2);
__ref.setField ("_scrolled" /*RemoteObject*/ ,clvnested.__c.getField(true,"False"));
 BA.debugLineNum = 67;BA.debugLine="ScrollPosition =  GetOffset(ScrollingCLV.sv.Scr";
Debug.ShouldStop(4);
__ref.setField ("_scrollposition" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example2.clvnested.class, "_getoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, __ref.getField(false,"_scrollingclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetX"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_scrollingclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY")))));
 BA.debugLineNum = 68;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return clvnested.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 71;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) return clvnested.__c.getField(true,"False");
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tpc_ontouchevent(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("tpc_OnTouchEvent (clvnested) ","clvnested",8,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("tpc_ontouchevent")) { return __ref.runUserSub(false, "clvnested","tpc_ontouchevent", __ref, _action, _x, _y, _motionevent);}
RemoteObject _deltaoffset = RemoteObject.createImmutable(0f);
RemoteObject _innerindex = RemoteObject.createImmutable(0);
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 22;BA.debugLine="Private Sub tpc_OnTouchEvent (Action As Int, X As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 25;BA.debugLine="Select Action";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"),__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 27;BA.debugLine="Dim deltaOffset As Float = (GetOffset(X, Y) - S";
Debug.ShouldStop(67108864);
_deltaoffset = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4a.example2.clvnested.class, "_getoffset" /*RemoteObject*/ ,(Object)(_x),(Object)(_y)),__ref.getField(true,"_startoffset" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(1.5)}, "*",0, 0));Debug.locals.put("deltaOffset", _deltaoffset);Debug.locals.put("deltaOffset", _deltaoffset);
 BA.debugLineNum = 28;BA.debugLine="If Scrolled = False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_scrolled" /*RemoteObject*/ ),clvnested.__c.getField(true,"False"))) { 
 BA.debugLineNum = 29;BA.debugLine="If Abs(deltaOffset) > 10dip Then Scrolled = Tr";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",clvnested.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _deltaoffset))),BA.numberCast(double.class, clvnested.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))))) { 
__ref.setField ("_scrolled" /*RemoteObject*/ ,clvnested.__c.getField(true,"True"));};
 };
 BA.debugLineNum = 31;BA.debugLine="If Scrolled Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(true,"_scrolled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 33;BA.debugLine="If ScrollingCLVHorizontal Then";
Debug.ShouldStop(1);
if (__ref.getField(true,"_scrollingclvhorizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 34;BA.debugLine="ScrollingCLV.sv.ScrollViewOffsetX = ScrollPos";
Debug.ShouldStop(2);
__ref.getField(false,"_scrollingclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setScrollViewOffsetX",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_scrollposition" /*RemoteObject*/ ),_deltaoffset}, "-",1, 0)));
 }else {
 BA.debugLineNum = 36;BA.debugLine="ScrollingCLV.sv.ScrollViewOffsetY = ScrollPos";
Debug.ShouldStop(8);
__ref.getField(false,"_scrollingclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setScrollViewOffsetY",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_scrollposition" /*RemoteObject*/ ),_deltaoffset}, "-",1, 0)));
 };
 };
 break; }
case 1: {
 BA.debugLineNum = 40;BA.debugLine="If Scrolled = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_scrolled" /*RemoteObject*/ ),clvnested.__c.getField(true,"False"))) { 
 BA.debugLineNum = 41;BA.debugLine="If ScrollingCLVHorizontal Then";
Debug.ShouldStop(256);
if (__ref.getField(true,"_scrollingclvhorizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 42;BA.debugLine="Dim innerIndex As Int = ScrollingCLV.FindInde";
Debug.ShouldStop(512);
_innerindex = __ref.getField(false,"_scrollingclv" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_scrollingclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetX")}, "+",1, 0))));Debug.locals.put("innerIndex", _innerindex);Debug.locals.put("innerIndex", _innerindex);
 }else {
 BA.debugLineNum = 44;BA.debugLine="Dim index As Int = CLV.FindIndexFromOffset(St";
Debug.ShouldStop(2048);
_index = __ref.getField(false,"_clv" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_startoffset" /*RemoteObject*/ ),__ref.getField(false,"_clv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY")}, "+",1, 0))));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 45;BA.debugLine="Dim item As CLVItem = CLV.GetRawListItem(inde";
Debug.ShouldStop(4096);
_item = __ref.getField(false,"_clv" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 46;BA.debugLine="Dim innerIndex As Int = ScrollingCLV.FindInde";
Debug.ShouldStop(8192);
_innerindex = __ref.getField(false,"_scrollingclv" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_startoffset" /*RemoteObject*/ ),__ref.getField(false,"_clv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"),_item.getField(true,"Offset"),__ref.getField(false,"_scrollingclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY")}, "+-+",3, 0))));Debug.locals.put("innerIndex", _innerindex);Debug.locals.put("innerIndex", _innerindex);
 BA.debugLineNum = 47;BA.debugLine="Log(index& \"  index\")";
Debug.ShouldStop(16384);
clvnested.__c.runVoidMethod ("LogImpl","27143449",RemoteObject.concat(_index,RemoteObject.createImmutable("  index")),0);
 BA.debugLineNum = 48;BA.debugLine="Log(item&\" item\")";
Debug.ShouldStop(32768);
clvnested.__c.runVoidMethod ("LogImpl","27143450",RemoteObject.concat(_item,RemoteObject.createImmutable(" item")),0);
 BA.debugLineNum = 49;BA.debugLine="Log(innerIndex&\" innerIndex\")";
Debug.ShouldStop(65536);
clvnested.__c.runVoidMethod ("LogImpl","27143451",RemoteObject.concat(_innerindex,RemoteObject.createImmutable(" innerIndex")),0);
 };
 BA.debugLineNum = 51;BA.debugLine="CallSub2(ScrollingCLV, \"Panel\" & \"ClickHandler";
Debug.ShouldStop(262144);
clvnested.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((__ref.getField(false,"_scrollingclv" /*RemoteObject*/ ))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Panel"),RemoteObject.createImmutable("ClickHandler"))),(Object)((__ref.getField(false,"_scrollingclv" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_innerindex)).getField(false,"Panel"))));
 };
 BA.debugLineNum = 53;BA.debugLine="ScrollingCLV = Null";
Debug.ShouldStop(1048576);
__ref.setField ("_scrollingclv" /*RemoteObject*/ ,(clvnested.__c.getField(false,"Null")));
 break; }
}
;
 BA.debugLineNum = 55;BA.debugLine="Return ScrollingCLV <> Null";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("N",__ref.getField(false,"_scrollingclv" /*RemoteObject*/ )));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}