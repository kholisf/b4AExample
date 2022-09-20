package b4a.example2;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ximagesliderig_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "ximagesliderig","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 159;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="private Sub Class_Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private mEventName As String 'ignore";
ximagesliderig._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",ximagesliderig._meventname);
 //BA.debugLineNum = 25;BA.debugLine="Private mCallBack As Object 'ignore";
ximagesliderig._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",ximagesliderig._mcallback);
 //BA.debugLineNum = 26;BA.debugLine="Private mBase As B4XView 'ignore";
ximagesliderig._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",ximagesliderig._mbase);
 //BA.debugLineNum = 27;BA.debugLine="Private xui As XUI 'ignore";
ximagesliderig._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",ximagesliderig._xui);
 //BA.debugLineNum = 33;BA.debugLine="Private Imgcont As AHViewPager";
ximagesliderig._imgcont = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPager");__ref.setField("_imgcont",ximagesliderig._imgcont);
 //BA.debugLineNum = 34;BA.debugLine="Private imgLayout As AHPageContainer";
ximagesliderig._imglayout = RemoteObject.createNew ("de.amberhome.viewpager.AHPageContainer");__ref.setField("_imglayout",ximagesliderig._imglayout);
 //BA.debugLineNum = 35;BA.debugLine="Private GesturePanel As Panel";
ximagesliderig._gesturepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_gesturepanel",ximagesliderig._gesturepanel);
 //BA.debugLineNum = 37;BA.debugLine="Private ImgCount As Label";
ximagesliderig._imgcount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_imgcount",ximagesliderig._imgcount);
 //BA.debugLineNum = 38;BA.debugLine="Private ImgList As List";
ximagesliderig._imglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_imglist",ximagesliderig._imglist);
 //BA.debugLineNum = 40;BA.debugLine="Public CurrentIndex As Int = 0";
ximagesliderig._currentindex = BA.numberCast(int.class, 0);__ref.setField("_currentindex",ximagesliderig._currentindex);
 //BA.debugLineNum = 41;BA.debugLine="Private PrevIndex As Int = 0";
ximagesliderig._previndex = BA.numberCast(int.class, 0);__ref.setField("_previndex",ximagesliderig._previndex);
 //BA.debugLineNum = 42;BA.debugLine="Private dotTransitionDuration As Int";
ximagesliderig._dottransitionduration = RemoteObject.createImmutable(0);__ref.setField("_dottransitionduration",ximagesliderig._dottransitionduration);
 //BA.debugLineNum = 44;BA.debugLine="Private dotCont As B4XView";
ximagesliderig._dotcont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_dotcont",ximagesliderig._dotcont);
 //BA.debugLineNum = 45;BA.debugLine="Private dotColor,activeDotColor As Int";
ximagesliderig._dotcolor = RemoteObject.createImmutable(0);__ref.setField("_dotcolor",ximagesliderig._dotcolor);
ximagesliderig._activedotcolor = RemoteObject.createImmutable(0);__ref.setField("_activedotcolor",ximagesliderig._activedotcolor);
 //BA.debugLineNum = 46;BA.debugLine="Private dotSize As Int = 6dip";
ximagesliderig._dotsize = ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6)));__ref.setField("_dotsize",ximagesliderig._dotsize);
 //BA.debugLineNum = 47;BA.debugLine="Private dotSizeM As Int = 5dip";
ximagesliderig._dotsizem = ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));__ref.setField("_dotsizem",ximagesliderig._dotsizem);
 //BA.debugLineNum = 48;BA.debugLine="Private dotSizeS As Int = 3dip";
ximagesliderig._dotsizes = ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)));__ref.setField("_dotsizes",ximagesliderig._dotsizes);
 //BA.debugLineNum = 49;BA.debugLine="Private dotgap As Int = dotSize";
ximagesliderig._dotgap = __ref.getField(true,"_dotsize" /*RemoteObject*/ );__ref.setField("_dotgap",ximagesliderig._dotgap);
 //BA.debugLineNum = 50;BA.debugLine="Private ShowDots,scale As String";
ximagesliderig._showdots = RemoteObject.createImmutable("");__ref.setField("_showdots",ximagesliderig._showdots);
ximagesliderig._scale = RemoteObject.createImmutable("");__ref.setField("_scale",ximagesliderig._scale);
 //BA.debugLineNum = 51;BA.debugLine="Private ImageCount,CoverFreeSpace,ZoomActualSlide";
ximagesliderig._imagecount = RemoteObject.createImmutable(false);__ref.setField("_imagecount",ximagesliderig._imagecount);
ximagesliderig._coverfreespace = RemoteObject.createImmutable(false);__ref.setField("_coverfreespace",ximagesliderig._coverfreespace);
ximagesliderig._zoomactualslide = RemoteObject.createImmutable(false);__ref.setField("_zoomactualslide",ximagesliderig._zoomactualslide);
ximagesliderig._autoplayvideo = RemoteObject.createImmutable(false);__ref.setField("_autoplayvideo",ximagesliderig._autoplayvideo);
ximagesliderig._startvideomuted = RemoteObject.createImmutable(false);__ref.setField("_startvideomuted",ximagesliderig._startvideomuted);
 //BA.debugLineNum = 52;BA.debugLine="Private FreeSpaceColor As Int";
ximagesliderig._freespacecolor = RemoteObject.createImmutable(0);__ref.setField("_freespacecolor",ximagesliderig._freespacecolor);
 //BA.debugLineNum = 53;BA.debugLine="Private actHasActionBar As Boolean = False";
ximagesliderig._acthasactionbar = ximagesliderig.__c.getField(true,"False");__ref.setField("_acthasactionbar",ximagesliderig._acthasactionbar);
 //BA.debugLineNum = 55;BA.debugLine="Private LblTimer As Timer";
ximagesliderig._lbltimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_lbltimer",ximagesliderig._lbltimer);
 //BA.debugLineNum = 56;BA.debugLine="Private videoplayer As List";
ximagesliderig._videoplayer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_videoplayer",ximagesliderig._videoplayer);
 //BA.debugLineNum = 59;BA.debugLine="Private GD As GestureDetector";
ximagesliderig._gd = RemoteObject.createNew ("flm.b4a.gesturedetector.GestureDetectorForB4A");__ref.setField("_gd",ximagesliderig._gd);
 //BA.debugLineNum = 60;BA.debugLine="Private JO As JavaObject";
ximagesliderig._jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jo",ximagesliderig._jo);
 //BA.debugLineNum = 66;BA.debugLine="Private ZoomContainer,ZoomPanel As B4XView";
ximagesliderig._zoomcontainer = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_zoomcontainer",ximagesliderig._zoomcontainer);
ximagesliderig._zoompanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_zoompanel",ximagesliderig._zoompanel);
 //BA.debugLineNum = 67;BA.debugLine="Private PinchStartDistance,PinchFixX,PinchFixY,Zo";
ximagesliderig._pinchstartdistance = RemoteObject.createImmutable(0);__ref.setField("_pinchstartdistance",ximagesliderig._pinchstartdistance);
ximagesliderig._pinchfixx = RemoteObject.createImmutable(0);__ref.setField("_pinchfixx",ximagesliderig._pinchfixx);
ximagesliderig._pinchfixy = RemoteObject.createImmutable(0);__ref.setField("_pinchfixy",ximagesliderig._pinchfixy);
ximagesliderig._zoomwindowfix = BA.numberCast(double.class, 0);__ref.setField("_zoomwindowfix",ximagesliderig._zoomwindowfix);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "ximagesliderig","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _tempview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 82;BA.debugLine="private Sub DesignerCreateView (Base As Object, Lb";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="ShowDots = Props.Get(\"DotShow\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_showdots" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DotShow"))))));
 BA.debugLineNum = 84;BA.debugLine="dotColor = xui.PaintOrColorToColor(Props.Get(\"Dot";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dotcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DotColor")))))));
 BA.debugLineNum = 85;BA.debugLine="activeDotColor = xui.PaintOrColorToColor(Props.Ge";
Debug.JustUpdateDeviceLine();
__ref.setField ("_activedotcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ActiveDotColor")))))));
 BA.debugLineNum = 86;BA.debugLine="scale = Props.Get(\"ScaleContent\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_scale" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ScaleContent"))))));
 BA.debugLineNum = 87;BA.debugLine="ImageCount = Props.Get(\"ImageCount\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_imagecount" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ImageCount"))))));
 BA.debugLineNum = 88;BA.debugLine="CoverFreeSpace = Props.Get(\"CoverFreeSpace\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_coverfreespace" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CoverFreeSpace"))))));
 BA.debugLineNum = 89;BA.debugLine="FreeSpaceColor = Props.Get(\"FreeSpaceColor\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_freespacecolor" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FreeSpaceColor"))))));
 BA.debugLineNum = 90;BA.debugLine="ZoomActualSlide = Props.Get(\"ZoomActualSlide\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_zoomactualslide" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ZoomActualSlide"))))));
 BA.debugLineNum = 91;BA.debugLine="dotTransitionDuration = Props.Get(\"dotTransitionD";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dottransitionduration" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dotTransitionDuration"))))));
 BA.debugLineNum = 92;BA.debugLine="AutoPlayVideo = Props.Get(\"AutoPlayVideo\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_autoplayvideo" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AutoPlayVideo"))))));
 BA.debugLineNum = 93;BA.debugLine="StartVideoMuted = Props.Get(\"StartVideoMuted\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_startvideomuted" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StartVideoMuted"))))));
 BA.debugLineNum = 95;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 96;BA.debugLine="mBase.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 107;BA.debugLine="Imgcont.Initialize(\"ImgCont\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ImgCont")));
 BA.debugLineNum = 110;BA.debugLine="If ShowDots = \"OUTSIDE\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_showdots" /*RemoteObject*/ ),BA.ObjectToString("OUTSIDE"))) { 
 BA.debugLineNum = 111;BA.debugLine="mBase.AddView(Imgcont,0,0,mBase.Width,(mBase.Hei";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgcont" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1))));
 }else {
 BA.debugLineNum = 113;BA.debugLine="mBase.AddView(Imgcont,0,0,mBase.Width,mBase.Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgcont" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 118;BA.debugLine="GesturePanel = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gesturepanel" /*RemoteObject*/ ).setObject (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());
 BA.debugLineNum = 119;BA.debugLine="mBase.addview(GesturePanel,0,0,mBase.Width,Imgcon";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_gesturepanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 120;BA.debugLine="GD.SetOnGestureListener(GesturePanel,\"ImgCont_GD\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gd" /*RemoteObject*/ ).runVoidMethod ("SetOnGestureListener",__ref.getField(false, "ba"),(Object)((__ref.getField(false,"_gesturepanel" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.createImmutable("ImgCont_GD")));
 BA.debugLineNum = 122;BA.debugLine="JO = mBase";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jo" /*RemoteObject*/ ).setObject (__ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 124;BA.debugLine="zoomfix";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_zoomfix" /*RemoteObject*/ );
 BA.debugLineNum = 125;BA.debugLine="mBase.AddView(xui.CreatePanel(\"\"),(mBase.Width -";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)),ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))));
 BA.debugLineNum = 126;BA.debugLine="mBase.GetView(mBase.NumberOfViews-1).AddView(ImgC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgcount" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))));
 BA.debugLineNum = 127;BA.debugLine="Private tempView As B4XView = ImgCount";
Debug.JustUpdateDeviceLine();
_tempview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tempview = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imgcount" /*RemoteObject*/ ).getObject());Debug.locals.put("tempView", _tempview);Debug.locals.put("tempView", _tempview);
 BA.debugLineNum = 128;BA.debugLine="tempView.TextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_tempview.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 129;BA.debugLine="tempView.TextSize = 12";
Debug.JustUpdateDeviceLine();
_tempview.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 130;BA.debugLine="tempView.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_tempview.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 131;BA.debugLine="tempView.Parent.Visible = False";
Debug.JustUpdateDeviceLine();
_tempview.runMethod(false,"getParent").runMethod(true,"setVisible",ximagesliderig.__c.getField(true,"False"));
 BA.debugLineNum = 133;BA.debugLine="mBase.AddView(dotCont,0,mBase.Height - 30dip, mBa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_dotcont" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 135;BA.debugLine="ZoomPanel.Color = xui.Color_ARGB(30,0,0,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_zoompanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgcont_gd_ondoubletap(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("ImgCont_GD_onDoubleTap (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("imgcont_gd_ondoubletap")) { return __ref.runUserSub(false, "ximagesliderig","imgcont_gd_ondoubletap", __ref, _x, _y, _motionevent);}
RemoteObject _currentview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tagmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 190;BA.debugLine="Private Sub ImgCont_GD_onDoubleTap(X As Float, Y A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Double";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DoubleTap"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 192;BA.debugLine="Private currentView As B4XView = ImgList.Get(Cur";
Debug.JustUpdateDeviceLine();
_currentview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_currentview = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("currentView", _currentview);Debug.locals.put("currentView", _currentview);
 BA.debugLineNum = 193;BA.debugLine="Private tagmap As Map = currentView.Tag";
Debug.JustUpdateDeviceLine();
_tagmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tagmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _currentview.runMethod(false,"getTag"));Debug.locals.put("tagmap", _tagmap);Debug.locals.put("tagmap", _tagmap);
 BA.debugLineNum = 194;BA.debugLine="CallSub3(mCallBack, mEventName & \"_DoubleTap\",Cu";
Debug.JustUpdateDeviceLine();
ximagesliderig.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DoubleTap"))),(Object)((__ref.getField(true,"_currentindex" /*RemoteObject*/ ))),(Object)(_tagmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data"))))));
 };
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgcont_gd_onpinchclose(RemoteObject __ref,RemoteObject _newdistance,RemoteObject _previousdistance,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("ImgCont_GD_onPinchClose (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("imgcont_gd_onpinchclose")) { return __ref.runUserSub(false, "ximagesliderig","imgcont_gd_onpinchclose", __ref, _newdistance, _previousdistance, _motionevent);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("NewDistance", _newdistance);
Debug.locals.put("PreviousDistance", _previousdistance);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 252;BA.debugLine="Private Sub ImgCont_GD_onPinchClose(NewDistance As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 253;BA.debugLine="StopPropagation(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_stoppropagation" /*RemoteObject*/ ,(Object)(ximagesliderig.__c.getField(true,"True")));
 BA.debugLineNum = 254;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 255;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 256;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))),ximagesliderig.__c.getField(true,"False"))) { 
 BA.debugLineNum = 257;BA.debugLine="If ZoomContainer.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_zoomcontainer" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 258;BA.debugLine="If ZoomPanel.Parent.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_zoompanel" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 259;BA.debugLine="ZoomImage(NewDistance,MotionEvent)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_zoomimage" /*RemoteObject*/ ,(Object)(_newdistance),(Object)(_motionevent));
 };
 };
 };
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgcont_gd_onpinchopen(RemoteObject __ref,RemoteObject _newdistance,RemoteObject _previousdistance,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("ImgCont_GD_onPinchOpen (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("imgcont_gd_onpinchopen")) { return __ref.runUserSub(false, "ximagesliderig","imgcont_gd_onpinchopen", __ref, _newdistance, _previousdistance, _motionevent);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _actualview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _location = null;
RemoteObject _tempview = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("NewDistance", _newdistance);
Debug.locals.put("PreviousDistance", _previousdistance);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 265;BA.debugLine="Private Sub ImgCont_GD_onPinchOpen(NewDistance As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 266;BA.debugLine="StopPropagation(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_stoppropagation" /*RemoteObject*/ ,(Object)(ximagesliderig.__c.getField(true,"True")));
 BA.debugLineNum = 270;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 271;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 272;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))),ximagesliderig.__c.getField(true,"False"))) { 
 BA.debugLineNum = 273;BA.debugLine="If ZoomContainer.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_zoomcontainer" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 274;BA.debugLine="If Not(ZoomPanel.Parent.IsInitialized) Then";
Debug.JustUpdateDeviceLine();
if (ximagesliderig.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_zoompanel" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 275;BA.debugLine="ZoomContainer.AddView(ZoomPanel,0,0,ZoomContai";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_zoomcontainer" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_zoompanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_zoomcontainer" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_zoomcontainer" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 276;BA.debugLine="Private actualView As B4XView = ImgList.Get(Cu";
Debug.JustUpdateDeviceLine();
_actualview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_actualview = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("actualView", _actualview);Debug.locals.put("actualView", _actualview);
 BA.debugLineNum = 287;BA.debugLine="Private location(2) As Int";
Debug.JustUpdateDeviceLine();
_location = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("location", _location);
 BA.debugLineNum = 288;BA.debugLine="JO.RunMethod(\"getLocationInWindow\",Array As Ob";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("getLocationInWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_location)})));
 BA.debugLineNum = 289;BA.debugLine="Private tempView As Panel = xui.CreatePanel(\"y";
Debug.JustUpdateDeviceLine();
_tempview = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_tempview = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("yy"))).getObject());Debug.locals.put("tempView", _tempview);Debug.locals.put("tempView", _tempview);
 BA.debugLineNum = 290;BA.debugLine="tempView.SetBackgroundImage(actualView.Snapsho";
Debug.JustUpdateDeviceLine();
_tempview.runMethod(false,"SetBackgroundImageNew",(Object)((_actualview.runMethod(false,"Snapshot").getObject()))).runMethod(true,"setGravity",ximagesliderig.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 291;BA.debugLine="PinchFixX = (actualView.Width/2) - (Min(GD.get";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pinchfixx" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_actualview.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {ximagesliderig.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getX",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getX",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 0)))))),ximagesliderig.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getX",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 0))),__ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getX",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0))),RemoteObject.createImmutable(2)}, "+/",1, 0))}, "-",1, 0));
 BA.debugLineNum = 292;BA.debugLine="PinchFixY = (actualView.Height/2) - (Min(GD.ge";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pinchfixy" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_actualview.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {ximagesliderig.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getY",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getY",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 0)))))),ximagesliderig.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getY",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 0))),__ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getY",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0))),RemoteObject.createImmutable(2)}, "+/",1, 0))}, "-",1, 0));
 BA.debugLineNum = 294;BA.debugLine="ZoomPanel.AddView(tempView,location(0),locatio";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_zoompanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_tempview.getObject())),(Object)(_location.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_location.getArrayElement(true,BA.numberCast(int.class, 1)),__ref.getField(true,"_zoomwindowfix" /*RemoteObject*/ )}, "-",1, 0))),(Object)(_actualview.runMethod(true,"getWidth")),(Object)(_actualview.runMethod(true,"getHeight")));
 BA.debugLineNum = 295;BA.debugLine="PinchStartDistance = NewDistance";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pinchstartdistance" /*RemoteObject*/ ,BA.numberCast(double.class, _newdistance));
 }else {
 BA.debugLineNum = 298;BA.debugLine="ZoomImage(NewDistance,MotionEvent)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_zoomimage" /*RemoteObject*/ ,(Object)(_newdistance),(Object)(_motionevent));
 };
 };
 };
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgcont_gd_onsingletapconfirmed(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("ImgCont_GD_onSingleTapConfirmed (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("imgcont_gd_onsingletapconfirmed")) { return __ref.runUserSub(false, "ximagesliderig","imgcont_gd_onsingletapconfirmed", __ref, _x, _y, _motionevent);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _vo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _currentview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tagmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 164;BA.debugLine="Private Sub ImgCont_GD_onSingleTapConfirmed(X As F";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 166;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 167;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
Debug.JustUpdateDeviceLine();
if (_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 168;BA.debugLine="If x < 45dip And y < 45dip Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_x,BA.numberCast(double.class, ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45))))) && RemoteObject.solveBoolean("<",_y,BA.numberCast(double.class, ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))))) { 
 BA.debugLineNum = 169;BA.debugLine="ToggleMute";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_togglemute" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 171;BA.debugLine="Dim vo As JavaObject = imagedata.Get(\"player\")";
Debug.JustUpdateDeviceLine();
_vo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_vo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("player")))));Debug.locals.put("vo", _vo);Debug.locals.put("vo", _vo);
 BA.debugLineNum = 172;BA.debugLine="If vo.GetFieldJO(\"player\").RunMethod(\"isPlaying";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vo.runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("player"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isPlaying")),(Object)((ximagesliderig.__c.getField(false,"Null")))),(ximagesliderig.__c.getField(true,"True")))) { 
 BA.debugLineNum = 173;BA.debugLine="i.GetView(0).Tag=False";
Debug.JustUpdateDeviceLine();
_i.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"setTag",(ximagesliderig.__c.getField(true,"False")));
 BA.debugLineNum = 174;BA.debugLine="PauseCurrentVideo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_pausecurrentvideo" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 176;BA.debugLine="i.GetView(0).Tag=True";
Debug.JustUpdateDeviceLine();
_i.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"setTag",(ximagesliderig.__c.getField(true,"True")));
 BA.debugLineNum = 177;BA.debugLine="PlayCurrentVideo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_playcurrentvideo" /*RemoteObject*/ );
 };
 };
 }else {
 BA.debugLineNum = 181;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Singl";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SingleTap"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 182;BA.debugLine="Private currentView As B4XView = ImgList.Get(Cu";
Debug.JustUpdateDeviceLine();
_currentview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_currentview = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("currentView", _currentview);Debug.locals.put("currentView", _currentview);
 BA.debugLineNum = 183;BA.debugLine="Private tagmap As Map = currentView.Tag";
Debug.JustUpdateDeviceLine();
_tagmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tagmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _currentview.runMethod(false,"getTag"));Debug.locals.put("tagmap", _tagmap);Debug.locals.put("tagmap", _tagmap);
 BA.debugLineNum = 184;BA.debugLine="CallSub3(mCallBack, mEventName & \"_SingleTap\",C";
Debug.JustUpdateDeviceLine();
ximagesliderig.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SingleTap"))),(Object)((__ref.getField(true,"_currentindex" /*RemoteObject*/ ))),(Object)(_tagmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data"))))));
 };
 };
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgcont_gd_ontouch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("ImgCont_GD_onTouch (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("imgcont_gd_ontouch")) { return __ref.runUserSub(false, "ximagesliderig","imgcont_gd_ontouch", __ref, _action, _x, _y, _motionevent);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _actualview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 234;BA.debugLine="Private Sub ImgCont_GD_onTouch(Action As Int, X As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="If Action = mBase.TOUCH_ACTION_UP Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 236;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 237;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 238;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))),ximagesliderig.__c.getField(true,"False"))) { 
 BA.debugLineNum = 239;BA.debugLine="ZoomPanel.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_zoompanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 240;BA.debugLine="ZoomPanel.RemoveAllViews";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_zoompanel" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 241;BA.debugLine="If ZoomActualSlide Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_zoomactualslide" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 242;BA.debugLine="Private actualView As B4XView = ImgList.Get(Cu";
Debug.JustUpdateDeviceLine();
_actualview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_actualview = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("actualView", _actualview);Debug.locals.put("actualView", _actualview);
 BA.debugLineNum = 243;BA.debugLine="actualView.SetVisibleAnimated(200,True)";
Debug.JustUpdateDeviceLine();
_actualview.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(ximagesliderig.__c.getField(true,"True")));
 };
 };
 BA.debugLineNum = 246;BA.debugLine="StopPropagation(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_stoppropagation" /*RemoteObject*/ ,(Object)(ximagesliderig.__c.getField(true,"False")));
 };
 BA.debugLineNum = 248;BA.debugLine="GD.PassTouchEventTo(MotionEvent,Imgcont)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gd" /*RemoteObject*/ ).runVoidMethod ("PassTouchEventTo",(Object)((_motionevent)),(Object)((__ref.getField(false,"_imgcont" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 249;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return ximagesliderig.__c.getField(true,"True");
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgcont_pagechanged(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ImgCont_PageChanged (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("imgcont_pagechanged")) { return __ref.runUserSub(false, "ximagesliderig","imgcont_pagechanged", __ref, _position);}
RemoteObject _centerindex = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Position", _position);
 BA.debugLineNum = 370;BA.debugLine="Private Sub ImgCont_PageChanged (Position As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 371;BA.debugLine="Dim centerIndex As Int = Position";
Debug.JustUpdateDeviceLine();
_centerindex = _position;Debug.locals.put("centerIndex", _centerindex);Debug.locals.put("centerIndex", _centerindex);
 BA.debugLineNum = 373;BA.debugLine="If CurrentIndex > -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 374;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 375;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 376;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
Debug.JustUpdateDeviceLine();
if (_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 377;BA.debugLine="PauseCurrentVideo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_pausecurrentvideo" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 382;BA.debugLine="If CurrentIndex <> centerIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, _centerindex))) { 
 BA.debugLineNum = 383;BA.debugLine="PrevIndex = CurrentIndex";
Debug.JustUpdateDeviceLine();
__ref.setField ("_previndex" /*RemoteObject*/ ,__ref.getField(true,"_currentindex" /*RemoteObject*/ ));
 BA.debugLineNum = 384;BA.debugLine="CurrentIndex = centerIndex";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentindex" /*RemoteObject*/ ,_centerindex);
 BA.debugLineNum = 385;BA.debugLine="ShowCount";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_showcount" /*RemoteObject*/ );
 BA.debugLineNum = 386;BA.debugLine="UpdatePlayback";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_updateplayback" /*RemoteObject*/ );
 BA.debugLineNum = 387;BA.debugLine="If ShowDots <> \"HIDE\" Then UpdateDots";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_showdots" /*RemoteObject*/ ),BA.ObjectToString("HIDE"))) { 
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_updatedots" /*RemoteObject*/ );};
 };
 BA.debugLineNum = 393;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCh";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 394;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChanged\",";
Debug.JustUpdateDeviceLine();
ximagesliderig.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageChanged"))),(Object)((__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 396;BA.debugLine="ShowImage";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_showimage" /*void*/ );
 BA.debugLineNum = 397;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "ximagesliderig","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 70;BA.debugLine="private Sub Initialize (Callback As Object, EventN";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 72;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 73;BA.debugLine="ImgList.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imglist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 74;BA.debugLine="ZoomPanel = xui.CreatePanel(\"ZoomPanel\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_zoompanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ZoomPanel"))));
 BA.debugLineNum = 76;BA.debugLine="ImgCount.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imgcount" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 77;BA.debugLine="dotCont = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dotcont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 78;BA.debugLine="LblTimer.Initialize(\"LblTimer\",2000)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("LblTimer")),(Object)(BA.numberCast(long.class, 2000)));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbltimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LblTimer_tick (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("lbltimer_tick")) { return __ref.runUserSub(false, "ximagesliderig","lbltimer_tick", __ref);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 320;BA.debugLine="Private Sub LblTimer_tick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 321;BA.debugLine="Private i As B4XView = ImgCount.parent";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imgcount" /*RemoteObject*/ ).runMethod(false,"getParent"));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 322;BA.debugLine="i.SetVisibleAnimated(500,False)";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(ximagesliderig.__c.getField(true,"False")));
 BA.debugLineNum = 323;BA.debugLine="LblTimer.Enabled = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",ximagesliderig.__c.getField(true,"False"));
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pausecurrentvideo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PauseCurrentVideo (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,967);
if (RapidSub.canDelegate("pausecurrentvideo")) { return __ref.runUserSub(false, "ximagesliderig","pausecurrentvideo", __ref);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.SimpleExoPlayerWrapper");
 BA.debugLineNum = 967;BA.debugLine="Public Sub PauseCurrentVideo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 968;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 969;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 970;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
Debug.JustUpdateDeviceLine();
if (_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 972;BA.debugLine="Dim v As SimpleExoPlayer = imagedata.Get(\"player";
Debug.JustUpdateDeviceLine();
_v = (_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("player")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 973;BA.debugLine="v.pause";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("Pause");
 BA.debugLineNum = 981;BA.debugLine="i.GetView(2).Visible=True";
Debug.JustUpdateDeviceLine();
_i.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setVisible",ximagesliderig.__c.getField(true,"True"));
 BA.debugLineNum = 983;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Video";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VideoPaused"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 984;BA.debugLine="CallSub2(mCallBack, mEventName & \"_VideoPaused\"";
Debug.JustUpdateDeviceLine();
ximagesliderig.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VideoPaused"))),(Object)((__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));
 };
 };
 BA.debugLineNum = 987;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playcurrentvideo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PlayCurrentVideo (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,990);
if (RapidSub.canDelegate("playcurrentvideo")) { return __ref.runUserSub(false, "ximagesliderig","playcurrentvideo", __ref);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.SimpleExoPlayerWrapper");
 BA.debugLineNum = 990;BA.debugLine="Public Sub PlayCurrentVideo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 991;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 992;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 993;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
Debug.JustUpdateDeviceLine();
if (_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 995;BA.debugLine="Dim v As SimpleExoPlayer = imagedata.Get(\"player";
Debug.JustUpdateDeviceLine();
_v = (_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("player")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 996;BA.debugLine="v.play";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("Play");
 BA.debugLineNum = 1004;BA.debugLine="i.GetView(2).Visible=False";
Debug.JustUpdateDeviceLine();
_i.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setVisible",ximagesliderig.__c.getField(true,"False"));
 BA.debugLineNum = 1006;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Video";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VideoPlaying"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1007;BA.debugLine="CallSub2(mCallBack, mEventName & \"_VideoPlaying";
Debug.JustUpdateDeviceLine();
ximagesliderig.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VideoPlaying"))),(Object)((__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));
 };
 };
 BA.debugLineNum = 1010;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeprogressview(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("removeProgressView (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,500);
if (RapidSub.canDelegate("removeprogressview")) { return __ref.runUserSub(false, "ximagesliderig","removeprogressview", __ref, _i);}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
Debug.locals.put("i", _i);
 BA.debugLineNum = 500;BA.debugLine="Private Sub removeProgressView(i As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 501;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is Label Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_i.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_i.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObjectOrNull(), RemoteObject.createImmutable("android.widget.TextView"))) { 
 BA.debugLineNum = 502;BA.debugLine="Dim l As Label = i.GetView(i.NumberOfViews-1)";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _i.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_i.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 504;BA.debugLine="l.RemoveView";
Debug.JustUpdateDeviceLine();
_l.runVoidMethod ("RemoveView");
 };
 BA.debugLineNum = 510;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is ProgressBar Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_i.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_i.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObjectOrNull(), RemoteObject.createImmutable("android.widget.ProgressBar"))) { 
 BA.debugLineNum = 511;BA.debugLine="Dim p As ProgressBar = i.GetView(i.NumberOfViews";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ProgressBarWrapper"), _i.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_i.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 512;BA.debugLine="p.RemoveView";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("RemoveView");
 };
 BA.debugLineNum = 519;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactive(RemoteObject __ref,RemoteObject _dot) throws Exception{
try {
		Debug.PushSubsStack("SetActive (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,474);
if (RapidSub.canDelegate("setactive")) { return __ref.runUserSub(false, "ximagesliderig","setactive", __ref, _dot);}
RemoteObject _dotcir = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("dot", _dot);
 BA.debugLineNum = 474;BA.debugLine="Private Sub SetActive(dot As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 475;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
Debug.JustUpdateDeviceLine();
_dotcir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_dotcir = _dot.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("dotCir", _dotcir);Debug.locals.put("dotCir", _dotcir);
 BA.debugLineNum = 476;BA.debugLine="dotCir.SetColorAndBorder(activeDotColor,0,xui.Col";
Debug.JustUpdateDeviceLine();
_dotcir.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_activedotcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )));
 BA.debugLineNum = 477;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,0,";
Debug.JustUpdateDeviceLine();
_dotcir.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_dottransitionduration" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )));
 BA.debugLineNum = 478;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactivityhasactionbar(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setActivityHasActionBar (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,793);
if (RapidSub.canDelegate("setactivityhasactionbar")) { return __ref.runUserSub(false, "ximagesliderig","setactivityhasactionbar", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 793;BA.debugLine="Public Sub setActivityHasActionBar(value As Boolea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 794;BA.debugLine="actHasActionBar = value";
Debug.JustUpdateDeviceLine();
__ref.setField ("_acthasactionbar" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 795;BA.debugLine="zoomfix";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_zoomfix" /*RemoteObject*/ );
 BA.debugLineNum = 796;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefault(RemoteObject __ref,RemoteObject _dot) throws Exception{
try {
		Debug.PushSubsStack("SetDefault (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,480);
if (RapidSub.canDelegate("setdefault")) { return __ref.runUserSub(false, "ximagesliderig","setdefault", __ref, _dot);}
RemoteObject _dotcir = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("dot", _dot);
 BA.debugLineNum = 480;BA.debugLine="Private Sub SetDefault(dot As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 481;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
Debug.JustUpdateDeviceLine();
_dotcir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_dotcir = _dot.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("dotCir", _dotcir);Debug.locals.put("dotCir", _dotcir);
 BA.debugLineNum = 482;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,(d";
Debug.JustUpdateDeviceLine();
_dotcir.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_dottransitionduration" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),__ref.getField(true,"_dotsizem" /*RemoteObject*/ )}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),__ref.getField(true,"_dotsizem" /*RemoteObject*/ )}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(true,"_dotsizem" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dotsizem" /*RemoteObject*/ )));
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethidden(RemoteObject __ref,RemoteObject _dot) throws Exception{
try {
		Debug.PushSubsStack("SetHidden (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,493);
if (RapidSub.canDelegate("sethidden")) { return __ref.runUserSub(false, "ximagesliderig","sethidden", __ref, _dot);}
RemoteObject _dotcir = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("dot", _dot);
 BA.debugLineNum = 493;BA.debugLine="Private Sub SetHidden(dot As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 494;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
Debug.JustUpdateDeviceLine();
_dotcir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_dotcir = _dot.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("dotCir", _dotcir);Debug.locals.put("dotCir", _dotcir);
 BA.debugLineNum = 495;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,do";
Debug.JustUpdateDeviceLine();
_dotcir.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_dottransitionduration" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 496;BA.debugLine="dotCir.SetVisibleAnimated(dotTransitionDuration,F";
Debug.JustUpdateDeviceLine();
_dotcir.runVoidMethod ("SetVisibleAnimated",(Object)(__ref.getField(true,"_dottransitionduration" /*RemoteObject*/ )),(Object)(ximagesliderig.__c.getField(true,"False")));
 BA.debugLineNum = 497;BA.debugLine="dot.tag = \"h\"";
Debug.JustUpdateDeviceLine();
_dot.runMethod(false,"setTag",RemoteObject.createImmutable(("h")));
 BA.debugLineNum = 498;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setitems(RemoteObject __ref,RemoteObject _imgs) throws Exception{
try {
		Debug.PushSubsStack("SetItems (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,816);
if (RapidSub.canDelegate("setitems")) { return __ref.runUserSub(false, "ximagesliderig","setitems", __ref, _imgs);}
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tempi = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _soundbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _b4xv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _pbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _pbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _ii = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _dotstartx = RemoteObject.createImmutable(0);
int _j = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _size = RemoteObject.createImmutable(0);
RemoteObject _q = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("imgs", _imgs);
 BA.debugLineNum = 816;BA.debugLine="Public Sub SetItems(imgs As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 817;BA.debugLine="videoplayer.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_videoplayer" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 818;BA.debugLine="CurrentIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 819;BA.debugLine="dotCont.RemoveAllViews";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 820;BA.debugLine="ImgList.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imglist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 822;BA.debugLine="imgLayout.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imglayout" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 823;BA.debugLine="For Each img As Map In imgs";
Debug.JustUpdateDeviceLine();
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group6 = _imgs;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_img = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group6.runMethod(false,"Get",index6));Debug.locals.put("img", _img);
Debug.locals.put("img", _img);
 BA.debugLineNum = 825;BA.debugLine="Private i As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 827;BA.debugLine="Dim  tempi As Panel = xui.createPanel(\"\")";
Debug.JustUpdateDeviceLine();
_tempi = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_tempi = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("tempi", _tempi);Debug.locals.put("tempi", _tempi);
 BA.debugLineNum = 828;BA.debugLine="tempi.SetLayoutAnimated(0,0,0,Imgcont.Width,Imgc";
Debug.JustUpdateDeviceLine();
_tempi.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 829;BA.debugLine="tempi.addView(i,0,0,Imgcont.Width,Imgcont.Height";
Debug.JustUpdateDeviceLine();
_tempi.runVoidMethod ("AddView",(Object)((_i.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 830;BA.debugLine="imgLayout.AddPage(tempi,\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imglayout" /*RemoteObject*/ ).runVoidMethod ("AddPage",(Object)((_tempi.getObject())),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 844;BA.debugLine="If img.ContainsKey(\"video\") Then";
Debug.JustUpdateDeviceLine();
if (_img.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("video")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 845;BA.debugLine="i.LoadLayout(\"ximageslider_video\")";
Debug.JustUpdateDeviceLine();
_i.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ximageslider_video")),__ref.getField(false, "ba"));
 BA.debugLineNum = 850;BA.debugLine="Dim soundBtn As Panel = xui.CreatePanel(\"sound\"";
Debug.JustUpdateDeviceLine();
_soundbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_soundbtn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("sound"))).getObject());Debug.locals.put("soundBtn", _soundbtn);Debug.locals.put("soundBtn", _soundbtn);
 BA.debugLineNum = 851;BA.debugLine="i.AddView(soundBtn,0,0,45dip,45dip)";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("AddView",(Object)((_soundbtn.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))));
 BA.debugLineNum = 853;BA.debugLine="Dim l As Label";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l", _l);
 BA.debugLineNum = 854;BA.debugLine="l.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_l.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 855;BA.debugLine="soundBtn.AddView(l,10dip,10dip,25dip,25dip)";
Debug.JustUpdateDeviceLine();
_soundbtn.runVoidMethod ("AddView",(Object)((_l.getObject())),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))));
 BA.debugLineNum = 857;BA.debugLine="Dim b4xv As B4XView = l";
Debug.JustUpdateDeviceLine();
_b4xv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b4xv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _l.getObject());Debug.locals.put("b4xv", _b4xv);Debug.locals.put("b4xv", _b4xv);
 BA.debugLineNum = 858;BA.debugLine="b4xv.TextSize=12";
Debug.JustUpdateDeviceLine();
_b4xv.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 859;BA.debugLine="b4xv.TextColor=Colors.White";
Debug.JustUpdateDeviceLine();
_b4xv.runMethod(true,"setTextColor",ximagesliderig.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 860;BA.debugLine="b4xv.Font = xui.CreateMaterialIcons(17)";
Debug.JustUpdateDeviceLine();
_b4xv.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(BA.numberCast(float.class, 17))));
 BA.debugLineNum = 861;BA.debugLine="b4xv.SetColorAndBorder(xui.Color_ARGB(150,50,50";
Debug.JustUpdateDeviceLine();
_b4xv.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 50)))),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b4xv.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 862;BA.debugLine="b4xv.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_b4xv.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 864;BA.debugLine="If StartVideoMuted Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_startvideomuted" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 865;BA.debugLine="b4xv.Text = Chr(0xE04F)";
Debug.JustUpdateDeviceLine();
_b4xv.runMethod(true,"setText",BA.ObjectToCharSequence(ximagesliderig.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe04f))))));
 }else {
 BA.debugLineNum = 867;BA.debugLine="b4xv.Text = Chr(0xE050)";
Debug.JustUpdateDeviceLine();
_b4xv.runMethod(true,"setText",BA.ObjectToCharSequence(ximagesliderig.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe050))))));
 };
 BA.debugLineNum = 870;BA.debugLine="Dim pbtn As B4XView=xui.CreatePanel(\"pbtn\")";
Debug.JustUpdateDeviceLine();
_pbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pbtn = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pbtn")));Debug.locals.put("pbtn", _pbtn);Debug.locals.put("pbtn", _pbtn);
 BA.debugLineNum = 871;BA.debugLine="i.AddView(pbtn,i.Width/2 - 30dip,i.height/2 - 3";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("AddView",(Object)((_pbtn.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_i.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "/-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_i.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "/-",1, 0))),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 872;BA.debugLine="pbtn.SetColorAndBorder(Colors.ARGB(150,50,50,50";
Debug.JustUpdateDeviceLine();
_pbtn.runVoidMethod ("SetColorAndBorder",(Object)(ximagesliderig.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 50)))),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pbtn.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 873;BA.debugLine="Dim pbl As Label";
Debug.JustUpdateDeviceLine();
_pbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("pbl", _pbl);
 BA.debugLineNum = 874;BA.debugLine="pbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_pbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 875;BA.debugLine="Dim b4xv As B4XView = pbl";
Debug.JustUpdateDeviceLine();
_b4xv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b4xv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _pbl.getObject());Debug.locals.put("b4xv", _b4xv);Debug.locals.put("b4xv", _b4xv);
 BA.debugLineNum = 876;BA.debugLine="b4xv.Text=Chr(0xE037)";
Debug.JustUpdateDeviceLine();
_b4xv.runMethod(true,"setText",BA.ObjectToCharSequence(ximagesliderig.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe037))))));
 BA.debugLineNum = 877;BA.debugLine="b4xv.font=xui.CreateMaterialIcons(40)";
Debug.JustUpdateDeviceLine();
_b4xv.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(BA.numberCast(float.class, 40))));
 BA.debugLineNum = 878;BA.debugLine="b4xv.TextColor=Colors.White";
Debug.JustUpdateDeviceLine();
_b4xv.runMethod(true,"setTextColor",ximagesliderig.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 879;BA.debugLine="b4xv.Color=Colors.Transparent";
Debug.JustUpdateDeviceLine();
_b4xv.runMethod(true,"setColor",ximagesliderig.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 880;BA.debugLine="b4xv.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_b4xv.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 882;BA.debugLine="pbtn.AddView(pbl,0,0,pbtn.Width,pbtn.Height)";
Debug.JustUpdateDeviceLine();
_pbtn.runVoidMethod ("AddView",(Object)((_pbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_pbtn.runMethod(true,"getWidth")),(Object)(_pbtn.runMethod(true,"getHeight")));
 BA.debugLineNum = 883;BA.debugLine="pbtn.Visible=False";
Debug.JustUpdateDeviceLine();
_pbtn.runMethod(true,"setVisible",ximagesliderig.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 887;BA.debugLine="Private ii As ImageView:ii.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_ii = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("ii", _ii);
 BA.debugLineNum = 887;BA.debugLine="Private ii As ImageView:ii.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_ii.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 897;BA.debugLine="i.AddView(ii,0,0,Imgcont.Width,Imgcont.Height)";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("AddView",(Object)((_ii.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 899;BA.debugLine="i.Color = FreeSpaceColor";
Debug.JustUpdateDeviceLine();
_i.runMethod(true,"setColor",__ref.getField(true,"_freespacecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 901;BA.debugLine="i.Tag = img";
Debug.JustUpdateDeviceLine();
_i.runMethod(false,"setTag",(_img.getObject()));
 BA.debugLineNum = 902;BA.debugLine="ImgList.Add(i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imglist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_i.getObject())));
 }
}Debug.locals.put("img", _img);
;
 BA.debugLineNum = 911;BA.debugLine="Imgcont.PageContainer = imgLayout";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runVoidMethod ("setPageContainer",__ref.getField(false,"_imglayout" /*RemoteObject*/ ));
 BA.debugLineNum = 914;BA.debugLine="If ShowDots <> \"HIDE\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_showdots" /*RemoteObject*/ ),BA.ObjectToString("HIDE"))) { 
 BA.debugLineNum = 915;BA.debugLine="If imgs.Size > 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_imgs.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 916;BA.debugLine="Private dotStartX As Int = (dotCont.width/2) -";
Debug.JustUpdateDeviceLine();
_dotstartx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {ximagesliderig.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 6)),(Object)(BA.numberCast(double.class, _imgs.runMethod(true,"getSize")))),__ref.getField(true,"_dotsize" /*RemoteObject*/ )}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {ximagesliderig.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 6)),(Object)(BA.numberCast(double.class, _imgs.runMethod(true,"getSize")))),__ref.getField(true,"_dotgap" /*RemoteObject*/ )}, "*",0, 0))}, "+",1, 0)),__ref.getField(true,"_dotgap" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0));Debug.locals.put("dotStartX", _dotstartx);Debug.locals.put("dotStartX", _dotstartx);
 BA.debugLineNum = 917;BA.debugLine="For j=0 To imgs.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step56 = 1;
final int limit56 = RemoteObject.solve(new RemoteObject[] {_imgs.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step56 > 0 && _j <= limit56) || (step56 < 0 && _j >= limit56) ;_j = ((int)(0 + _j + step56))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 918;BA.debugLine="Private p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 919;BA.debugLine="Private size As Int = dotSizeM";
Debug.JustUpdateDeviceLine();
_size = __ref.getField(true,"_dotsizem" /*RemoteObject*/ );Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 920;BA.debugLine="p.Tag = \"b\"";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"setTag",RemoteObject.createImmutable(("b")));
 BA.debugLineNum = 921;BA.debugLine="If j=5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_j),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 922;BA.debugLine="size = dotSizeS";
Debug.JustUpdateDeviceLine();
_size = __ref.getField(true,"_dotsizes" /*RemoteObject*/ );Debug.locals.put("size", _size);
 BA.debugLineNum = 923;BA.debugLine="p.Tag = \"s\"";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"setTag",RemoteObject.createImmutable(("s")));
 }else 
{ BA.debugLineNum = 924;BA.debugLine="else if j > 5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_j),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 925;BA.debugLine="size = 0";
Debug.JustUpdateDeviceLine();
_size = BA.numberCast(int.class, 0);Debug.locals.put("size", _size);
 BA.debugLineNum = 926;BA.debugLine="p.Tag = \"h\"";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"setTag",RemoteObject.createImmutable(("h")));
 }}
;
 BA.debugLineNum = 929;BA.debugLine="dotCont.AddView(p,dotStartX + (j*(dotSize+dotg";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_dotstartx,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_j),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),__ref.getField(true,"_dotgap" /*RemoteObject*/ )}, "+",1, 1))}, "*",0, 1))}, "+",1, 1)),(Object)(BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)))),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )));
 BA.debugLineNum = 930;BA.debugLine="Private q As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_q = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_q = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("q", _q);Debug.locals.put("q", _q);
 BA.debugLineNum = 932;BA.debugLine="If j=0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_j),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 933;BA.debugLine="q.SetColorAndBorder(activeDotColor,0,xui.Colo";
Debug.JustUpdateDeviceLine();
_q.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_activedotcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )));
 BA.debugLineNum = 934;BA.debugLine="p.AddView(q,0,0,dotSize,dotSize)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_q.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 936;BA.debugLine="q.SetColorAndBorder(dotColor,0,xui.Color_Tran";
Debug.JustUpdateDeviceLine();
_q.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_dotcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )));
 BA.debugLineNum = 937;BA.debugLine="p.AddView(q,(dotSize-size)/2,(dotSize-size)/2";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_q.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),_size}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),_size}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_size),(Object)(_size));
 };
 }
}Debug.locals.put("j", _j);
;
 };
 };
 BA.debugLineNum = 943;BA.debugLine="ShowCount";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_showcount" /*RemoteObject*/ );
 BA.debugLineNum = 944;BA.debugLine="ShowImage";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_showimage" /*void*/ );
 BA.debugLineNum = 945;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsmall(RemoteObject __ref,RemoteObject _dot) throws Exception{
try {
		Debug.PushSubsStack("SetSmall (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,485);
if (RapidSub.canDelegate("setsmall")) { return __ref.runUserSub(false, "ximagesliderig","setsmall", __ref, _dot);}
RemoteObject _dotcir = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("dot", _dot);
 BA.debugLineNum = 485;BA.debugLine="Private Sub SetSmall(dot As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 486;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
Debug.JustUpdateDeviceLine();
_dotcir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_dotcir = _dot.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("dotCir", _dotcir);Debug.locals.put("dotCir", _dotcir);
 BA.debugLineNum = 487;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,(d";
Debug.JustUpdateDeviceLine();
_dotcir.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_dottransitionduration" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsizes" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsizes" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(__ref.getField(true,"_dotsizes" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dotsizes" /*RemoteObject*/ )));
 BA.debugLineNum = 488;BA.debugLine="dotCir.SetVisibleAnimated(dotTransitionDuration,T";
Debug.JustUpdateDeviceLine();
_dotcir.runVoidMethod ("SetVisibleAnimated",(Object)(__ref.getField(true,"_dottransitionduration" /*RemoteObject*/ )),(Object)(ximagesliderig.__c.getField(true,"True")));
 BA.debugLineNum = 490;BA.debugLine="dot.tag = \"s\"";
Debug.JustUpdateDeviceLine();
_dot.runMethod(false,"setTag",RemoteObject.createImmutable(("s")));
 BA.debugLineNum = 491;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzoompanel(RemoteObject __ref,RemoteObject _zoompanelcontainer) throws Exception{
try {
		Debug.PushSubsStack("SetZoomPanel (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,948);
if (RapidSub.canDelegate("setzoompanel")) { return __ref.runUserSub(false, "ximagesliderig","setzoompanel", __ref, _zoompanelcontainer);}
Debug.locals.put("ZoomPanelContainer", _zoompanelcontainer);
 BA.debugLineNum = 948;BA.debugLine="Public Sub SetZoomPanel(ZoomPanelContainer As B4XV";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 949;BA.debugLine="ZoomContainer=ZoomPanelContainer";
Debug.JustUpdateDeviceLine();
__ref.setField ("_zoomcontainer" /*RemoteObject*/ ,_zoompanelcontainer);
 BA.debugLineNum = 950;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showcount(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowCount (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,399);
if (RapidSub.canDelegate("showcount")) { return __ref.runUserSub(false, "ximagesliderig","showcount", __ref);}
RemoteObject _tempview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tempcanvas = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _textsize = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
 BA.debugLineNum = 399;BA.debugLine="Private Sub ShowCount";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 400;BA.debugLine="If ImageCount Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_imagecount" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 401;BA.debugLine="Private tempView As B4XView = ImgCount";
Debug.JustUpdateDeviceLine();
_tempview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tempview = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imgcount" /*RemoteObject*/ ).getObject());Debug.locals.put("tempView", _tempview);Debug.locals.put("tempView", _tempview);
 BA.debugLineNum = 402;BA.debugLine="tempView.Text = (CurrentIndex+1) & \"/\" & ImgList";
Debug.JustUpdateDeviceLine();
_tempview.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat((RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable("/"),__ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 403;BA.debugLine="Private tempCanvas As B4XCanvas";
Debug.JustUpdateDeviceLine();
_tempcanvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("tempCanvas", _tempcanvas);
 BA.debugLineNum = 404;BA.debugLine="tempCanvas.Initialize(ImgCount)";
Debug.JustUpdateDeviceLine();
_tempcanvas.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imgcount" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 405;BA.debugLine="Private textSize As B4XRect = tempCanvas.Measure";
Debug.JustUpdateDeviceLine();
_textsize = _tempcanvas.runMethod(false,"MeasureText",(Object)(_tempview.runMethod(true,"getText")),(Object)(_tempview.runMethod(false,"getFont")));Debug.locals.put("textSize", _textsize);Debug.locals.put("textSize", _textsize);
 BA.debugLineNum = 407;BA.debugLine="tempView.parent.SetLayoutAnimated(100,(Imgcont.W";
Debug.JustUpdateDeviceLine();
_tempview.runMethod(false,"getParent").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getWidth"),ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {_textsize.runMethod(true,"getWidth"),ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0))}, "-",1, 0))),(Object)(_tempview.runMethod(false,"getParent").runMethod(true,"getTop")),(Object)(BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {_textsize.runMethod(true,"getWidth"),ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0)))),(Object)(_tempview.runMethod(false,"getParent").runMethod(true,"getHeight")));
 BA.debugLineNum = 408;BA.debugLine="tempView.SetLayoutAnimated(0,0,0,(textSize.Width";
Debug.JustUpdateDeviceLine();
_tempview.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {_textsize.runMethod(true,"getWidth"),ximagesliderig.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0)))),(Object)(_tempview.runMethod(true,"getHeight")));
 BA.debugLineNum = 409;BA.debugLine="tempView.SetColorAndBorder(xui.Color_ARGB(150,0,";
Debug.JustUpdateDeviceLine();
_tempview.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(_tempview.runMethod(true,"getHeight")));
 BA.debugLineNum = 413;BA.debugLine="tempView.Parent.SetVisibleAnimated(500,True)";
Debug.JustUpdateDeviceLine();
_tempview.runMethod(false,"getParent").runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(ximagesliderig.__c.getField(true,"True")));
 BA.debugLineNum = 414;BA.debugLine="LblTimer.Enabled = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",ximagesliderig.__c.getField(true,"False"));
 BA.debugLineNum = 415;BA.debugLine="LblTimer.Enabled = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",ximagesliderig.__c.getField(true,"True"));
 };
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _showimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowImage (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("showimage")) { __ref.runUserSub(false, "ximagesliderig","showimage", __ref); return;}
ResumableSub_ShowImage rsub = new ResumableSub_ShowImage(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ShowImage extends BA.ResumableSub {
public ResumableSub_ShowImage(b4a.example2.ximagesliderig parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example2.ximagesliderig parent;
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.SimpleExoPlayerWrapper");
RemoteObject _vv = RemoteObject.declareNull("anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper");
RemoteObject _j = RemoteObject.declareNull("b4a.example2.httpjob");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _joo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _bo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jc = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _tp = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowImage (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,533);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 534;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 535;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 536;BA.debugLine="Dim img As B4XBitmap";
Debug.JustUpdateDeviceLine();
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 538;BA.debugLine="If imagedata.ContainsKey(\"video\") Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 83;
if (_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("video")))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 53;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 539;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))),parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 540;BA.debugLine="removeProgressView(i)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_removeprogressview" /*RemoteObject*/ ,(Object)(_i));
 BA.debugLineNum = 542;BA.debugLine="Dim p As ProgressBar";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 547;BA.debugLine="p.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 548;BA.debugLine="p.Indeterminate = True";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setIndeterminate",parent.__c.getField(true,"True"));
 BA.debugLineNum = 553;BA.debugLine="i.AddView(p,Imgcont.Width/2 - 20dip,Imgcont.hei";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "/-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "/-",1, 0))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 556;BA.debugLine="Private v As SimpleExoPlayer";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.SimpleExoPlayerWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 557;BA.debugLine="v.Initialize(\"vplayer\")";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("vplayer")));
 BA.debugLineNum = 558;BA.debugLine="videoplayer.Add(CreateMap(\"id\":CurrentIndex,\"pl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_videoplayer" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(__ref.getField(true,"_currentindex" /*RemoteObject*/ )),RemoteObject.createImmutable(("player")),(_v)})).getObject())));
 BA.debugLineNum = 560;BA.debugLine="If imagedata.Get(\"type\") = \"file\" Then v.Prepar";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))),RemoteObject.createImmutable(("file")))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_v.runVoidMethod ("Prepare",(Object)(_v.runMethod(false,"CreateLoopSource",(Object)(_v.runMethod(false,"CreateFileSource",(Object)(BA.ObjectToString(_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("video")))))),(Object)(RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))))));
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 561;BA.debugLine="If imagedata.Get(\"type\") = \"uri\" Then v.Prepare";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))),RemoteObject.createImmutable(("uri")))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_v.runVoidMethod ("Prepare",(Object)(_v.runMethod(false,"CreateLoopSource",(Object)(_v.runMethod(false,"CreateUriSource",(Object)(BA.ObjectToString(_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("video")))))))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))))));
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 562;BA.debugLine="If imagedata.Get(\"type\") = \"dash\" Then v.Prepar";
Debug.JustUpdateDeviceLine();
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))),RemoteObject.createImmutable(("dash")))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
_v.runVoidMethod ("Prepare",(Object)(_v.runMethod(false,"CreateLoopSource",(Object)(_v.runMethod(false,"CreateDashSource",(Object)(BA.ObjectToString(_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("video")))))))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))))));
if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 563;BA.debugLine="If imagedata.Get(\"type\") = \"hls\" Then v.Prepare";
Debug.JustUpdateDeviceLine();
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))),RemoteObject.createImmutable(("hls")))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_v.runVoidMethod ("Prepare",(Object)(_v.runMethod(false,"CreateLoopSource",(Object)(_v.runMethod(false,"CreateHLSSource",(Object)(BA.ObjectToString(_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("video")))))))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))))));
if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 564;BA.debugLine="If imagedata.Get(\"type\") = \"smoothstream\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))),RemoteObject.createImmutable(("smoothstream")))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_v.runVoidMethod ("Prepare",(Object)(_v.runMethod(false,"CreateLoopSource",(Object)(_v.runMethod(false,"CreateSmoothStreamingSource",(Object)(BA.ObjectToString(_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("video")))))))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))))));
if (true) break;

case 36:
//C
this.state = 37;
;
 BA.debugLineNum = 566;BA.debugLine="If StartVideoMuted Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 37:
//if
this.state = 42;
if (__ref.getField(true,"_startvideomuted" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 42;
 BA.debugLineNum = 567;BA.debugLine="v.Volume = 0";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setVolume",BA.numberCast(float.class, 0));
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 569;BA.debugLine="v.Volume = 1";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setVolume",BA.numberCast(float.class, 1));
 if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 572;BA.debugLine="Dim vv As SimpleExoPlayerView = i.GetView(0)";
Debug.JustUpdateDeviceLine();
_vv = RemoteObject.createNew ("anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper");
_vv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper"), _i.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("vv", _vv);Debug.locals.put("vv", _vv);
 BA.debugLineNum = 573;BA.debugLine="Select scale";
Debug.JustUpdateDeviceLine();
if (true) break;

case 43:
//select
this.state = 50;
switch (BA.switchObjectToInt(__ref.getField(true,"_scale" /*RemoteObject*/ ),BA.ObjectToString("FILL"),BA.ObjectToString("FIT"),BA.ObjectToString("STRETCH"))) {
case 0: {
this.state = 45;
if (true) break;
}
case 1: {
this.state = 47;
if (true) break;
}
case 2: {
this.state = 49;
if (true) break;
}
}
if (true) break;

case 45:
//C
this.state = 50;
 BA.debugLineNum = 574;BA.debugLine="Case \"FILL\": vv.resizemode=\"ZOOM\"";
Debug.JustUpdateDeviceLine();
_vv.runVoidMethod ("setResizeMode",BA.ObjectToString("ZOOM"));
 if (true) break;

case 47:
//C
this.state = 50;
 BA.debugLineNum = 575;BA.debugLine="Case \"FIT\": vv.resizemode=\"FIT\"";
Debug.JustUpdateDeviceLine();
_vv.runVoidMethod ("setResizeMode",BA.ObjectToString("FIT"));
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 576;BA.debugLine="Case \"STRETCH\": vv.resizemode=\"FILL\"";
Debug.JustUpdateDeviceLine();
_vv.runVoidMethod ("setResizeMode",BA.ObjectToString("FILL"));
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 579;BA.debugLine="vv.Player=v";
Debug.JustUpdateDeviceLine();
_vv.runVoidMethod ("setPlayer",_v);
 BA.debugLineNum = 580;BA.debugLine="vv.Tag = AutoPlayVideo";
Debug.JustUpdateDeviceLine();
_vv.runMethod(false,"setTag",(__ref.getField(true,"_autoplayvideo" /*RemoteObject*/ )));
 BA.debugLineNum = 605;BA.debugLine="imagedata.Put(\"player\",v)";
Debug.JustUpdateDeviceLine();
_imagedata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player"))),(Object)((_v)));
 if (true) break;

case 51:
//C
this.state = 83;
;
 BA.debugLineNum = 607;BA.debugLine="UpdatePlayback";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_updateplayback" /*RemoteObject*/ );
 if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 609;BA.debugLine="If imagedata.Get(\"image\") Is String Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 54:
//if
this.state = 63;
if (RemoteObject.solveBoolean("i",_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("image")))), RemoteObject.createImmutable("String"))) { 
this.state = 56;
}else {
this.state = 62;
}if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 610;BA.debugLine="removeProgressView(i)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_removeprogressview" /*RemoteObject*/ ,(Object)(_i));
 BA.debugLineNum = 613;BA.debugLine="Dim p As ProgressBar";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 618;BA.debugLine="p.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 619;BA.debugLine="p.Indeterminate = True";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setIndeterminate",parent.__c.getField(true,"True"));
 BA.debugLineNum = 623;BA.debugLine="i.AddView(p,Imgcont.Width/2 - 20dip,Imgcont.hei";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "/-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "/-",1, 0))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 625;BA.debugLine="Dim j As HttpJob";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("b4a.example2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 626;BA.debugLine="j.Initialize(\"\",Me)";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (b4a.example2.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 627;BA.debugLine="j.Download(imagedata.Get(\"image\"))";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (b4a.example2.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("image")))))));
 BA.debugLineNum = 628;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ximagesliderig", "showimage"), (_j));
this.state = 84;
return;
case 84:
//C
this.state = 57;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 630;BA.debugLine="p.RemoveView";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 634;BA.debugLine="If j.Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 57:
//if
this.state = 60;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 635;BA.debugLine="Dim img As B4XBitmap = j.GetBitmap";
Debug.JustUpdateDeviceLine();
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_img = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _j.runClassMethod (b4a.example2.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject());Debug.locals.put("img", _img);Debug.locals.put("img", _img);
 BA.debugLineNum = 636;BA.debugLine="imagedata.Put(\"image\",img)";
Debug.JustUpdateDeviceLine();
_imagedata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("image"))),(Object)((_img.getObject())));
 BA.debugLineNum = 637;BA.debugLine="i.tag = imagedata";
Debug.JustUpdateDeviceLine();
_i.runMethod(false,"setTag",(_imagedata.getObject()));
 if (true) break;

case 60:
//C
this.state = 63;
;
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 640;BA.debugLine="Dim img As B4XBitmap = imagedata.Get(\"image\")";
Debug.JustUpdateDeviceLine();
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_img = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("image")))));Debug.locals.put("img", _img);Debug.locals.put("img", _img);
 if (true) break;
;
 BA.debugLineNum = 643;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is Label Then";
Debug.JustUpdateDeviceLine();

case 63:
//if
this.state = 66;
if (RemoteObject.solveBoolean("i",_i.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_i.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObjectOrNull(), RemoteObject.createImmutable("android.widget.TextView"))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 644;BA.debugLine="Dim l As Label = i.GetView(i.NumberOfViews-1)";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _i.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_i.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 646;BA.debugLine="l.RemoveView";
Debug.JustUpdateDeviceLine();
_l.runVoidMethod ("RemoveView");
 if (true) break;
;
 BA.debugLineNum = 652;BA.debugLine="If img.IsInitialized Then";
Debug.JustUpdateDeviceLine();

case 66:
//if
this.state = 82;
if (_img.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 68;
}else {
this.state = 81;
}if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 656;BA.debugLine="Dim JOo As JavaObject=i.GetView(0)";
Debug.JustUpdateDeviceLine();
_joo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _i.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("JOo", _joo);Debug.locals.put("JOo", _joo);
 BA.debugLineNum = 657;BA.debugLine="JOo.RunMethod(\"setImageBitmap\",Array(img))";
Debug.JustUpdateDeviceLine();
_joo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setImageBitmap")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_img.getObject())})));
 BA.debugLineNum = 658;BA.debugLine="Select scale";
Debug.JustUpdateDeviceLine();
if (true) break;

case 69:
//select
this.state = 76;
switch (BA.switchObjectToInt(__ref.getField(true,"_scale" /*RemoteObject*/ ),BA.ObjectToString("FILL"),BA.ObjectToString("FIT"),BA.ObjectToString("STRETCH"))) {
case 0: {
this.state = 71;
if (true) break;
}
case 1: {
this.state = 73;
if (true) break;
}
case 2: {
this.state = 75;
if (true) break;
}
}
if (true) break;

case 71:
//C
this.state = 76;
 BA.debugLineNum = 659;BA.debugLine="Case \"FILL\": JOo.RunMethod(\"setScaleType\",Arra";
Debug.JustUpdateDeviceLine();
_joo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setScaleType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("CENTER_CROP"))})));
 if (true) break;

case 73:
//C
this.state = 76;
 BA.debugLineNum = 660;BA.debugLine="Case \"FIT\": JOo.RunMethod(\"setScaleType\",Array";
Debug.JustUpdateDeviceLine();
_joo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setScaleType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("CENTER_INSIDE"))})));
 if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 661;BA.debugLine="Case \"STRETCH\": JOo.RunMethod(\"setScaleType\",A";
Debug.JustUpdateDeviceLine();
_joo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setScaleType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("FIT_XY"))})));
 if (true) break;
;
 BA.debugLineNum = 674;BA.debugLine="If CoverFreeSpace Then";
Debug.JustUpdateDeviceLine();

case 76:
//if
this.state = 79;
if (__ref.getField(true,"_coverfreespace" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 78;
}if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 676;BA.debugLine="Dim bo As JavaObject=Me";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_bo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 677;BA.debugLine="Dim jc As JavaObject";
Debug.JustUpdateDeviceLine();
_jc = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jc", _jc);
 BA.debugLineNum = 678;BA.debugLine="jc.InitializeContext";
Debug.JustUpdateDeviceLine();
_jc.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 679;BA.debugLine="img = bo.RunMethod(\"blur\",Array(jc,img))";
Debug.JustUpdateDeviceLine();
_img = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _bo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("blur")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_jc.getObject()),(_img.getObject())}))));Debug.locals.put("img", _img);
 BA.debugLineNum = 680;BA.debugLine="i.SetBitmap(img.Resize(Imgcont.Width,Imgcont.H";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("SetBitmap",(Object)((_img.runMethod(false,"Resize",(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(parent.__c.getField(true,"False"))).getObject())));
 if (true) break;

case 79:
//C
this.state = 82;
;
 if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 688;BA.debugLine="Dim tp As Label";
Debug.JustUpdateDeviceLine();
_tp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("tp", _tp);
 BA.debugLineNum = 689;BA.debugLine="tp.Initialize(\"trypanel\")";
Debug.JustUpdateDeviceLine();
_tp.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("trypanel")));
 BA.debugLineNum = 690;BA.debugLine="i.AddView(tp,0,0,Imgcont.Width,Imgcont.Height)";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("AddView",(Object)((_tp.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 691;BA.debugLine="tp.Text = \"Couldn't load the image. Tap to retr";
Debug.JustUpdateDeviceLine();
_tp.runMethod(true,"setText",BA.ObjectToCharSequence("Couldn't load the image. Tap to retry."));
 BA.debugLineNum = 692;BA.debugLine="tp.Color = Colors.White";
Debug.JustUpdateDeviceLine();
_tp.runVoidMethod ("setColor",parent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 693;BA.debugLine="tp.TextColor = Colors.Black";
Debug.JustUpdateDeviceLine();
_tp.runMethod(true,"setTextColor",parent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 695;BA.debugLine="tp.Gravity = Gravity.CENTER_HORIZONTAL+Gravity";
Debug.JustUpdateDeviceLine();
_tp.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),parent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 696;BA.debugLine="tp.TextSize = 15";
Debug.JustUpdateDeviceLine();
_tp.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 if (true) break;

case 82:
//C
this.state = 83;
;
 if (true) break;

case 83:
//C
this.state = -1;
;
 BA.debugLineNum = 703;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _shownext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowNext (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,953);
if (RapidSub.canDelegate("shownext")) { return __ref.runUserSub(false, "ximagesliderig","shownext", __ref);}
 BA.debugLineNum = 953;BA.debugLine="Public Sub ShowNext";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 954;BA.debugLine="If CurrentIndex < ImgList.Size-1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 955;BA.debugLine="SlideImage(CurrentIndex + 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_slideimage" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)));
 };
 BA.debugLineNum = 957;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showprev(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowPrev (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,960);
if (RapidSub.canDelegate("showprev")) { return __ref.runUserSub(false, "ximagesliderig","showprev", __ref);}
 BA.debugLineNum = 960;BA.debugLine="Public Sub ShowPrev";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 961;BA.debugLine="If CurrentIndex > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 962;BA.debugLine="SlideImage(CurrentIndex - 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_slideimage" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)));
 };
 BA.debugLineNum = 964;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _slideimage(RemoteObject __ref,RemoteObject _centerindex) throws Exception{
try {
		Debug.PushSubsStack("SlideImage (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("slideimage")) { return __ref.runUserSub(false, "ximagesliderig","slideimage", __ref, _centerindex);}
Debug.locals.put("centerIndex", _centerindex);
 BA.debugLineNum = 353;BA.debugLine="Private Sub SlideImage(centerIndex As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 357;BA.debugLine="Imgcont.GotoPage(centerIndex,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runVoidMethodAndSync ("GotoPage",(Object)(_centerindex),(Object)(ximagesliderig.__c.getField(true,"True")));
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stoppropagation(RemoteObject __ref,RemoteObject _enable) throws Exception{
try {
		Debug.PushSubsStack("StopPropagation (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("stoppropagation")) { return __ref.runUserSub(false, "ximagesliderig","stoppropagation", __ref, _enable);}
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Enable", _enable);
 BA.debugLineNum = 328;BA.debugLine="Private Sub StopPropagation(Enable As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="Private j As JavaObject = GesturePanel";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_j = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_gesturepanel" /*RemoteObject*/ ).getObject());Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 330;BA.debugLine="j.RunMethod(\"requestDisallowInterceptTouchEvent\",";
Debug.JustUpdateDeviceLine();
_j.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("requestDisallowInterceptTouchEvent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_enable)})));
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _togglemute(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToggleMute (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,1013);
if (RapidSub.canDelegate("togglemute")) { return __ref.runUserSub(false, "ximagesliderig","togglemute", __ref);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.SimpleExoPlayerWrapper");
 BA.debugLineNum = 1013;BA.debugLine="Public Sub ToggleMute";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1014;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1015;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 1016;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
Debug.JustUpdateDeviceLine();
if (_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1018;BA.debugLine="Dim v As SimpleExoPlayer = imagedata.Get(\"player";
Debug.JustUpdateDeviceLine();
_v = (_imagedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("player")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1019;BA.debugLine="If v.Volume = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_v.runMethod(true,"getVolume"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1020;BA.debugLine="v.Volume = 1";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setVolume",BA.numberCast(float.class, 1));
 BA.debugLineNum = 1021;BA.debugLine="i.GetView(1).GetView(0).Text = Chr(0xE050)";
Debug.JustUpdateDeviceLine();
_i.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setText",BA.ObjectToCharSequence(ximagesliderig.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe050))))));
 }else {
 BA.debugLineNum = 1023;BA.debugLine="v.Volume = 0";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setVolume",BA.numberCast(float.class, 0));
 BA.debugLineNum = 1024;BA.debugLine="i.GetView(1).GetView(0).Text = Chr(0xE04F)";
Debug.JustUpdateDeviceLine();
_i.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setText",BA.ObjectToCharSequence(ximagesliderig.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe04f))))));
 };
 };
 BA.debugLineNum = 1039;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trypanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("trypanel_Click (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,705);
if (RapidSub.canDelegate("trypanel_click")) { return __ref.runUserSub(false, "ximagesliderig","trypanel_click", __ref);}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 705;BA.debugLine="Private Sub trypanel_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 706;BA.debugLine="Dim l As Label = Sender";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), ximagesliderig.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 708;BA.debugLine="l.RemoveView";
Debug.JustUpdateDeviceLine();
_l.runVoidMethod ("RemoveView");
 BA.debugLineNum = 712;BA.debugLine="ShowImage";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_showimage" /*void*/ );
 BA.debugLineNum = 713;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedots(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateDots (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,419);
if (RapidSub.canDelegate("updatedots")) { return __ref.runUserSub(false, "ximagesliderig","updatedots", __ref);}
RemoteObject _shift = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _dot = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dotcir = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 419;BA.debugLine="Private Sub UpdateDots";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 420;BA.debugLine="Private shift As Int = dotSize+dotgap";
Debug.JustUpdateDeviceLine();
_shift = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dotsize" /*RemoteObject*/ ),__ref.getField(true,"_dotgap" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("shift", _shift);Debug.locals.put("shift", _shift);
 BA.debugLineNum = 421;BA.debugLine="If (CurrentIndex = 5 Or CurrentIndex = dotCont.Nu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, 5)) || RemoteObject.solveBoolean("=",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))) || RemoteObject.solveBoolean("=",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(6)}, "-",1, 1)))))) && RemoteObject.solveBoolean("=",__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))).runMethod(false,"getTag"),RemoteObject.createImmutable(("s")))) { 
 };
 BA.debugLineNum = 424;BA.debugLine="For i=0 To dotCont.NumberOfViews-1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 425;BA.debugLine="Private dot As B4XView = dotCont.GetView(i)";
Debug.JustUpdateDeviceLine();
_dot = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_dot = __ref.getField(false,"_dotcont" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("dot", _dot);Debug.locals.put("dot", _dot);
 BA.debugLineNum = 426;BA.debugLine="Private dotCir As B4XView = dot.getview(0)";
Debug.JustUpdateDeviceLine();
_dotcir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_dotcir = _dot.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("dotCir", _dotcir);Debug.locals.put("dotCir", _dotcir);
 BA.debugLineNum = 427;BA.debugLine="dotCir.SetColorAndBorder(dotColor,0,xui.Color_Tr";
Debug.JustUpdateDeviceLine();
_dotcir.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_dotcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )));
 BA.debugLineNum = 429;BA.debugLine="If CurrentIndex > PrevIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_previndex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 430;BA.debugLine="If dotCont.GetView(CurrentIndex).Tag = \"s\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))).runMethod(false,"getTag"),RemoteObject.createImmutable(("s")))) { 
 BA.debugLineNum = 432;BA.debugLine="If i = CurrentIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, __ref.getField(true,"_currentindex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 433;BA.debugLine="SetActive(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_setactive" /*RemoteObject*/ ,(Object)(_dot));
 }else 
{ BA.debugLineNum = 434;BA.debugLine="Else If i = CurrentIndex-5 Or i = CurrentIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(5)}, "-",1, 1))) || RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)))) { 
 BA.debugLineNum = 435;BA.debugLine="SetSmall(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_setsmall" /*RemoteObject*/ ,(Object)(_dot));
 }else 
{ BA.debugLineNum = 436;BA.debugLine="Else If i < CurrentIndex-5 Or i > CurrentIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(5)}, "-",1, 1))) || RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)))) { 
 BA.debugLineNum = 437;BA.debugLine="SetHidden(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_sethidden" /*RemoteObject*/ ,(Object)(_dot));
 }else {
 BA.debugLineNum = 439;BA.debugLine="SetDefault(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_setdefault" /*RemoteObject*/ ,(Object)(_dot));
 }}}
;
 BA.debugLineNum = 441;BA.debugLine="dot.SetLayoutAnimated(dotTransitionDuration,do";
Debug.JustUpdateDeviceLine();
_dot.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_dottransitionduration" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {_dot.runMethod(true,"getLeft"),_shift}, "-",1, 1)),(Object)(_dot.runMethod(true,"getTop")),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 443;BA.debugLine="If i = CurrentIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, __ref.getField(true,"_currentindex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 444;BA.debugLine="SetActive(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_setactive" /*RemoteObject*/ ,(Object)(_dot));
 }else 
{ BA.debugLineNum = 445;BA.debugLine="Else if dot.tag = \"b\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_dot.runMethod(false,"getTag"),RemoteObject.createImmutable(("b")))) { 
 BA.debugLineNum = 446;BA.debugLine="SetDefault(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_setdefault" /*RemoteObject*/ ,(Object)(_dot));
 }}
;
 };
 }else 
{ BA.debugLineNum = 449;BA.debugLine="Else If CurrentIndex < PrevIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_previndex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 450;BA.debugLine="If dotCont.GetView(CurrentIndex).tag = \"s\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))).runMethod(false,"getTag"),RemoteObject.createImmutable(("s")))) { 
 BA.debugLineNum = 451;BA.debugLine="If i = CurrentIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, __ref.getField(true,"_currentindex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 452;BA.debugLine="SetActive(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_setactive" /*RemoteObject*/ ,(Object)(_dot));
 }else 
{ BA.debugLineNum = 453;BA.debugLine="Else If i = CurrentIndex-1 Or i = CurrentIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))) || RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(5)}, "+",1, 1)))) { 
 BA.debugLineNum = 454;BA.debugLine="SetSmall(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_setsmall" /*RemoteObject*/ ,(Object)(_dot));
 }else 
{ BA.debugLineNum = 455;BA.debugLine="Else If i < CurrentIndex-1 Or i > CurrentIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))) || RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(5)}, "+",1, 1)))) { 
 BA.debugLineNum = 456;BA.debugLine="SetHidden(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_sethidden" /*RemoteObject*/ ,(Object)(_dot));
 }else {
 BA.debugLineNum = 458;BA.debugLine="SetDefault(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_setdefault" /*RemoteObject*/ ,(Object)(_dot));
 }}}
;
 BA.debugLineNum = 460;BA.debugLine="dot.SetLayoutAnimated(dotTransitionDuration,do";
Debug.JustUpdateDeviceLine();
_dot.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_dottransitionduration" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {_dot.runMethod(true,"getLeft"),_shift}, "+",1, 1)),(Object)(_dot.runMethod(true,"getTop")),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dotsize" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 462;BA.debugLine="If i = CurrentIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, __ref.getField(true,"_currentindex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 463;BA.debugLine="SetActive(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_setactive" /*RemoteObject*/ ,(Object)(_dot));
 }else 
{ BA.debugLineNum = 464;BA.debugLine="Else if dot.tag = \"b\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_dot.runMethod(false,"getTag"),RemoteObject.createImmutable(("b")))) { 
 BA.debugLineNum = 465;BA.debugLine="SetDefault(dot)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_setdefault" /*RemoteObject*/ ,(Object)(_dot));
 }}
;
 };
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 471;BA.debugLine="dotCont.GetView(CurrentIndex).Tag = \"b\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dotcont" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))).runMethod(false,"setTag",RemoteObject.createImmutable(("b")));
 BA.debugLineNum = 472;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateplayback(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdatePlayback (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,1044);
if (RapidSub.canDelegate("updateplayback")) { return __ref.runUserSub(false, "ximagesliderig","updateplayback", __ref);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _vv = RemoteObject.declareNull("anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper");
RemoteObject _location = null;
 BA.debugLineNum = 1044;BA.debugLine="Public Sub UpdatePlayback";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1045;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1046;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 1047;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
Debug.JustUpdateDeviceLine();
if (_imagedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1049;BA.debugLine="Dim vv As SimpleExoPlayerView = i.getview(0)";
Debug.JustUpdateDeviceLine();
_vv = RemoteObject.createNew ("anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper");
_vv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper"), _i.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("vv", _vv);Debug.locals.put("vv", _vv);
 BA.debugLineNum = 1050;BA.debugLine="If vv.Tag Then";
Debug.JustUpdateDeviceLine();
if (BA.ObjectToBoolean(_vv.runMethod(false,"getTag")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1055;BA.debugLine="Private location(2) As Int";
Debug.JustUpdateDeviceLine();
_location = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("location", _location);
 BA.debugLineNum = 1056;BA.debugLine="JO.RunMethod(\"getLocationInWindow\",Array As Obj";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("getLocationInWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_location)})));
 BA.debugLineNum = 1061;BA.debugLine="If (location(1) - ZoomWindowFix) < 0 Or  (locat";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",(RemoteObject.solve(new RemoteObject[] {_location.getArrayElement(true,BA.numberCast(int.class, 1)),__ref.getField(true,"_zoomwindowfix" /*RemoteObject*/ )}, "-",1, 0)),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {_location.getArrayElement(true,BA.numberCast(int.class, 1)),__ref.getField(true,"_zoomwindowfix" /*RemoteObject*/ ),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-+",2, 0)),BA.numberCast(double.class, ximagesliderig.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height")))) { 
 BA.debugLineNum = 1062;BA.debugLine="PauseCurrentVideo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_pausecurrentvideo" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1063;BA.debugLine="else If (location(1) - ZoomWindowFix) > 0 Or (l";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {_location.getArrayElement(true,BA.numberCast(int.class, 1)),__ref.getField(true,"_zoomwindowfix" /*RemoteObject*/ )}, "-",1, 0)),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("<",(RemoteObject.solve(new RemoteObject[] {_location.getArrayElement(true,BA.numberCast(int.class, 1)),__ref.getField(true,"_zoomwindowfix" /*RemoteObject*/ ),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-+",2, 0)),BA.numberCast(double.class, ximagesliderig.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height")))) { 
 BA.debugLineNum = 1064;BA.debugLine="PlayCurrentVideo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_playcurrentvideo" /*RemoteObject*/ );
 }}
;
 };
 };
 BA.debugLineNum = 1069;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _vplayer_error(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("vplayer_Error (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,716);
if (RapidSub.canDelegate("vplayer_error")) { return __ref.runUserSub(false, "ximagesliderig","vplayer_error", __ref, _message);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.SimpleExoPlayerWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _player = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imagedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tp = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Message", _message);
 BA.debugLineNum = 716;BA.debugLine="Private Sub vplayer_Error (Message As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 717;BA.debugLine="Dim v As SimpleExoPlayer=Sender";
Debug.JustUpdateDeviceLine();
_v = (ximagesliderig.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 718;BA.debugLine="Dim index As Int=-1";
Debug.JustUpdateDeviceLine();
_index = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 719;BA.debugLine="For Each player As Map In videoplayer";
Debug.JustUpdateDeviceLine();
_player = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group3 = __ref.getField(false,"_videoplayer" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_player = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group3.runMethod(false,"Get",index3));Debug.locals.put("player", _player);
Debug.locals.put("player", _player);
 BA.debugLineNum = 720;BA.debugLine="If v = player.Get(\"player\") Then index = player.";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_v,(_player.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("player"))))))) { 
_index = BA.numberCast(int.class, _player.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("index", _index);};
 }
}Debug.locals.put("player", _player);
;
 BA.debugLineNum = 722;BA.debugLine="If index > -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 723;BA.debugLine="Dim i As B4XView = ImgList.Get(index)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 724;BA.debugLine="Dim imagedata As Map = i.Tag";
Debug.JustUpdateDeviceLine();
_imagedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_imagedata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _i.runMethod(false,"getTag"));Debug.locals.put("imagedata", _imagedata);Debug.locals.put("imagedata", _imagedata);
 BA.debugLineNum = 726;BA.debugLine="imagedata.Remove(\"player\")";
Debug.JustUpdateDeviceLine();
_imagedata.runVoidMethod ("Remove",(Object)((RemoteObject.createImmutable("player"))));
 BA.debugLineNum = 727;BA.debugLine="i.Tag = imagedata";
Debug.JustUpdateDeviceLine();
_i.runMethod(false,"setTag",(_imagedata.getObject()));
 BA.debugLineNum = 728;BA.debugLine="v.Release";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("Release");
 BA.debugLineNum = 730;BA.debugLine="Log(Message)";
Debug.JustUpdateDeviceLine();
ximagesliderig.__c.runVoidMethod ("LogImpl","920316174",_message,0);
 BA.debugLineNum = 732;BA.debugLine="Dim tp As Label";
Debug.JustUpdateDeviceLine();
_tp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("tp", _tp);
 BA.debugLineNum = 733;BA.debugLine="tp.Initialize(\"trypanel\")";
Debug.JustUpdateDeviceLine();
_tp.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("trypanel")));
 BA.debugLineNum = 734;BA.debugLine="i.AddView(tp,0,0,Imgcont.Width,Imgcont.Height)";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("AddView",(Object)((_tp.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgcont" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 735;BA.debugLine="tp.Text = \"Couldn't load the video. Tap to retry";
Debug.JustUpdateDeviceLine();
_tp.runMethod(true,"setText",BA.ObjectToCharSequence("Couldn't load the video. Tap to retry."));
 BA.debugLineNum = 736;BA.debugLine="tp.Color = Colors.White";
Debug.JustUpdateDeviceLine();
_tp.runVoidMethod ("setColor",ximagesliderig.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 737;BA.debugLine="tp.TextColor = Colors.Black";
Debug.JustUpdateDeviceLine();
_tp.runMethod(true,"setTextColor",ximagesliderig.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 738;BA.debugLine="tp.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.C";
Debug.JustUpdateDeviceLine();
_tp.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {ximagesliderig.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),ximagesliderig.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 739;BA.debugLine="tp.TextSize = 15";
Debug.JustUpdateDeviceLine();
_tp.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 };
 BA.debugLineNum = 742;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _vplayer_ready(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("vplayer_Ready (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,744);
if (RapidSub.canDelegate("vplayer_ready")) { return __ref.runUserSub(false, "ximagesliderig","vplayer_ready", __ref);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.SimpleExoPlayerWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _player = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
 BA.debugLineNum = 744;BA.debugLine="Private Sub vplayer_Ready";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 745;BA.debugLine="Dim v As SimpleExoPlayer=Sender";
Debug.JustUpdateDeviceLine();
_v = (ximagesliderig.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 746;BA.debugLine="Dim index As Int=-1";
Debug.JustUpdateDeviceLine();
_index = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 747;BA.debugLine="For Each player As Map In videoplayer";
Debug.JustUpdateDeviceLine();
_player = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group3 = __ref.getField(false,"_videoplayer" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_player = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group3.runMethod(false,"Get",index3));Debug.locals.put("player", _player);
Debug.locals.put("player", _player);
 BA.debugLineNum = 748;BA.debugLine="If v = player.Get(\"player\") Then index = player.";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_v,(_player.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("player"))))))) { 
_index = BA.numberCast(int.class, _player.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("index", _index);};
 }
}Debug.locals.put("player", _player);
;
 BA.debugLineNum = 750;BA.debugLine="If index > -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 751;BA.debugLine="Dim i As B4XView = ImgList.Get(index)";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_i = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 752;BA.debugLine="i.GetView(2).Visible=True";
Debug.JustUpdateDeviceLine();
_i.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setVisible",ximagesliderig.__c.getField(true,"True"));
 BA.debugLineNum = 753;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is ProgressBar T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_i.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_i.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObjectOrNull(), RemoteObject.createImmutable("android.widget.ProgressBar"))) { 
 BA.debugLineNum = 754;BA.debugLine="Dim p As ProgressBar = i.GetView(i.NumberOfView";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ProgressBarWrapper"), _i.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_i.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 755;BA.debugLine="p.RemoveView";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("RemoveView");
 };
 };
 BA.debugLineNum = 758;BA.debugLine="UpdatePlayback";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example2.ximagesliderig.class, "_updateplayback" /*RemoteObject*/ );
 BA.debugLineNum = 759;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zoomfix(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("zoomfix (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("zoomfix")) { return __ref.runUserSub(false, "ximagesliderig","zoomfix", __ref);}
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 138;BA.debugLine="Private Sub zoomfix";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="Dim j As JavaObject";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("j", _j);
 BA.debugLineNum = 141;BA.debugLine="j.InitializeContext";
Debug.JustUpdateDeviceLine();
_j.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 142;BA.debugLine="If actHasActionBar Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_acthasactionbar" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 143;BA.debugLine="ZoomWindowFix = j.RunMethodJO(\"getActionBar\",Nul";
Debug.JustUpdateDeviceLine();
__ref.setField ("_zoomwindowfix" /*RemoteObject*/ ,BA.numberCast(double.class, _j.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getActionBar")),(Object)((ximagesliderig.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getHeight")),(Object)((ximagesliderig.__c.getField(false,"Null"))))));
 }else {
 BA.debugLineNum = 145;BA.debugLine="ZoomWindowFix=0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_zoomwindowfix" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 };
 BA.debugLineNum = 147;BA.debugLine="ZoomWindowFix = ZoomWindowFix + j.RunMethodJO(\"ge";
Debug.JustUpdateDeviceLine();
__ref.setField ("_zoomwindowfix" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_zoomwindowfix" /*RemoteObject*/ ),BA.numberCast(double.class, _j.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getResources")),(Object)((ximagesliderig.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDimensionPixelSize")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_j.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getResources")),(Object)((ximagesliderig.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getIdentifier")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("status_bar_height")),RemoteObject.createImmutable(("dimen")),(RemoteObject.createImmutable("android"))})))}))))}, "+",1, 0));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zoomimage(RemoteObject __ref,RemoteObject _distance,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("ZoomImage (ximagesliderig) ","ximagesliderig",22,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("zoomimage")) { return __ref.runUserSub(false, "ximagesliderig","zoomimage", __ref, _distance, _motionevent);}
RemoteObject _centerx = RemoteObject.createImmutable(0);
RemoteObject _centery = RemoteObject.createImmutable(0);
RemoteObject _location = null;
RemoteObject _actualview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _newwidth = RemoteObject.createImmutable(0);
RemoteObject _newheight = RemoteObject.createImmutable(0);
Debug.locals.put("Distance", _distance);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 335;BA.debugLine="Private Sub ZoomImage(Distance As Float, MotionEve";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 336;BA.debugLine="Private centerX As Int = Min(GD.getX(MotionEvent,";
Debug.JustUpdateDeviceLine();
_centerx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ximagesliderig.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getX",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getX",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 0)))))),ximagesliderig.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getX",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 0))),__ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getX",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0))),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("centerX", _centerx);Debug.locals.put("centerX", _centerx);
 BA.debugLineNum = 337;BA.debugLine="Private centerY As Int = Min(GD.getY(MotionEvent,";
Debug.JustUpdateDeviceLine();
_centery = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {ximagesliderig.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getY",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getY",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 0)))))),ximagesliderig.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getY",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 0))),__ref.getField(false,"_gd" /*RemoteObject*/ ).runMethod(true,"getY",(Object)((_motionevent)),(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0))),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("centerY", _centery);Debug.locals.put("centerY", _centery);
 BA.debugLineNum = 338;BA.debugLine="Private location(2) As Int";
Debug.JustUpdateDeviceLine();
_location = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("location", _location);
 BA.debugLineNum = 339;BA.debugLine="JO.RunMethod(\"getLocationInWindow\",Array As Objec";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("getLocationInWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_location)})));
 BA.debugLineNum = 340;BA.debugLine="Private actualView As B4XView = ImgList.Get(Curre";
Debug.JustUpdateDeviceLine();
_actualview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_actualview = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imglist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("actualView", _actualview);Debug.locals.put("actualView", _actualview);
 BA.debugLineNum = 347;BA.debugLine="If ZoomActualSlide Then actualView.Visible = Fals";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_zoomactualslide" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_actualview.runMethod(true,"setVisible",ximagesliderig.__c.getField(true,"False"));};
 BA.debugLineNum = 348;BA.debugLine="Private newWidth As Int = Max(actualView.Width,(D";
Debug.JustUpdateDeviceLine();
_newwidth = BA.numberCast(int.class, ximagesliderig.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _actualview.runMethod(true,"getWidth"))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_distance,__ref.getField(true,"_pinchstartdistance" /*RemoteObject*/ )}, "/",0, 0)),_actualview.runMethod(true,"getWidth")}, "*",0, 0))));Debug.locals.put("newWidth", _newwidth);Debug.locals.put("newWidth", _newwidth);
 BA.debugLineNum = 349;BA.debugLine="Private newHeight As Int = Max(actualView.Height,";
Debug.JustUpdateDeviceLine();
_newheight = BA.numberCast(int.class, ximagesliderig.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _actualview.runMethod(true,"getHeight"))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_distance,__ref.getField(true,"_pinchstartdistance" /*RemoteObject*/ )}, "/",0, 0)),_actualview.runMethod(true,"getHeight")}, "*",0, 0))));Debug.locals.put("newHeight", _newheight);Debug.locals.put("newHeight", _newheight);
 BA.debugLineNum = 350;BA.debugLine="ZoomPanel.GetView(0).SetLayoutAnimated(10,(center";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_zoompanel" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 10)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_centerx,_location.getArrayElement(true,BA.numberCast(int.class, 0))}, "+",1, 1)),(RemoteObject.solve(new RemoteObject[] {_newwidth,RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_pinchfixx" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_distance,__ref.getField(true,"_pinchstartdistance" /*RemoteObject*/ )}, "/",0, 0))}, "*",0, 0))}, "-+",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_centery,_location.getArrayElement(true,BA.numberCast(int.class, 1))}, "+",1, 1)),(RemoteObject.solve(new RemoteObject[] {_newheight,RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_pinchfixy" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_distance,__ref.getField(true,"_pinchstartdistance" /*RemoteObject*/ )}, "/",0, 0))}, "*",0, 0)),__ref.getField(true,"_zoomwindowfix" /*RemoteObject*/ )}, "-+-",3, 0))),(Object)(_newwidth),(Object)(_newheight));
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}