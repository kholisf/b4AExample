package b4a.example2;

import android.graphics.Bitmap;
import android.content.Context;
import android.renderscript.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class ximagesliderig extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example2.ximagesliderig");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example2.ximagesliderig.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public de.amberhome.viewpager.AHViewPager _imgcont = null;
public de.amberhome.viewpager.AHPageContainer _imglayout = null;
public anywheresoftware.b4a.objects.PanelWrapper _gesturepanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _imgcount = null;
public anywheresoftware.b4a.objects.collections.List _imglist = null;
public int _currentindex = 0;
public int _previndex = 0;
public int _dottransitionduration = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _dotcont = null;
public int _dotcolor = 0;
public int _activedotcolor = 0;
public int _dotsize = 0;
public int _dotsizem = 0;
public int _dotsizes = 0;
public int _dotgap = 0;
public String _showdots = "";
public String _scale = "";
public boolean _imagecount = false;
public boolean _coverfreespace = false;
public boolean _zoomactualslide = false;
public boolean _autoplayvideo = false;
public boolean _startvideomuted = false;
public int _freespacecolor = 0;
public boolean _acthasactionbar = false;
public anywheresoftware.b4a.objects.Timer _lbltimer = null;
public anywheresoftware.b4a.objects.collections.List _videoplayer = null;
public flm.b4a.gesturedetector.GestureDetectorForB4A _gd = null;
public anywheresoftware.b4j.object.JavaObject _jo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _zoomcontainer = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _zoompanel = null;
public double _pinchstartdistance = 0;
public double _pinchfixx = 0;
public double _pinchfixy = 0;
public double _zoomwindowfix = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example2.main _main = null;
public b4a.example2.starter _starter = null;
public b4a.example2.b4xpages _b4xpages = null;
public b4a.example2.b4xcollections _b4xcollections = null;
public b4a.example2.httputils2service _httputils2service = null;
public b4a.example2.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="private Sub Class_Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 25;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 26;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 33;BA.debugLine="Private Imgcont As AHViewPager";
_imgcont = new de.amberhome.viewpager.AHViewPager();
 //BA.debugLineNum = 34;BA.debugLine="Private imgLayout As AHPageContainer";
_imglayout = new de.amberhome.viewpager.AHPageContainer();
 //BA.debugLineNum = 35;BA.debugLine="Private GesturePanel As Panel";
_gesturepanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private ImgCount As Label";
_imgcount = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private ImgList As List";
_imglist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 40;BA.debugLine="Public CurrentIndex As Int = 0";
_currentindex = (int) (0);
 //BA.debugLineNum = 41;BA.debugLine="Private PrevIndex As Int = 0";
_previndex = (int) (0);
 //BA.debugLineNum = 42;BA.debugLine="Private dotTransitionDuration As Int";
_dottransitionduration = 0;
 //BA.debugLineNum = 44;BA.debugLine="Private dotCont As B4XView";
_dotcont = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private dotColor,activeDotColor As Int";
_dotcolor = 0;
_activedotcolor = 0;
 //BA.debugLineNum = 46;BA.debugLine="Private dotSize As Int = 6dip";
_dotsize = __c.DipToCurrent((int) (6));
 //BA.debugLineNum = 47;BA.debugLine="Private dotSizeM As Int = 5dip";
_dotsizem = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 48;BA.debugLine="Private dotSizeS As Int = 3dip";
_dotsizes = __c.DipToCurrent((int) (3));
 //BA.debugLineNum = 49;BA.debugLine="Private dotgap As Int = dotSize";
_dotgap = _dotsize;
 //BA.debugLineNum = 50;BA.debugLine="Private ShowDots,scale As String";
_showdots = "";
_scale = "";
 //BA.debugLineNum = 51;BA.debugLine="Private ImageCount,CoverFreeSpace,ZoomActualSlide";
_imagecount = false;
_coverfreespace = false;
_zoomactualslide = false;
_autoplayvideo = false;
_startvideomuted = false;
 //BA.debugLineNum = 52;BA.debugLine="Private FreeSpaceColor As Int";
_freespacecolor = 0;
 //BA.debugLineNum = 53;BA.debugLine="Private actHasActionBar As Boolean = False";
_acthasactionbar = __c.False;
 //BA.debugLineNum = 55;BA.debugLine="Private LblTimer As Timer";
_lbltimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 56;BA.debugLine="Private videoplayer As List";
_videoplayer = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 59;BA.debugLine="Private GD As GestureDetector";
_gd = new flm.b4a.gesturedetector.GestureDetectorForB4A();
 //BA.debugLineNum = 60;BA.debugLine="Private JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 66;BA.debugLine="Private ZoomContainer,ZoomPanel As B4XView";
_zoomcontainer = new anywheresoftware.b4a.objects.B4XViewWrapper();
_zoompanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 67;BA.debugLine="Private PinchStartDistance,PinchFixX,PinchFixY,Zo";
_pinchstartdistance = 0;
_pinchfixx = 0;
_pinchfixy = 0;
_zoomwindowfix = 0;
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _tempview = null;
 //BA.debugLineNum = 82;BA.debugLine="private Sub DesignerCreateView (Base As Object, Lb";
 //BA.debugLineNum = 83;BA.debugLine="ShowDots = Props.Get(\"DotShow\")";
_showdots = BA.ObjectToString(_props.Get((Object)("DotShow")));
 //BA.debugLineNum = 84;BA.debugLine="dotColor = xui.PaintOrColorToColor(Props.Get(\"Dot";
_dotcolor = _xui.PaintOrColorToColor(_props.Get((Object)("DotColor")));
 //BA.debugLineNum = 85;BA.debugLine="activeDotColor = xui.PaintOrColorToColor(Props.Ge";
_activedotcolor = _xui.PaintOrColorToColor(_props.Get((Object)("ActiveDotColor")));
 //BA.debugLineNum = 86;BA.debugLine="scale = Props.Get(\"ScaleContent\")";
_scale = BA.ObjectToString(_props.Get((Object)("ScaleContent")));
 //BA.debugLineNum = 87;BA.debugLine="ImageCount = Props.Get(\"ImageCount\")";
_imagecount = BA.ObjectToBoolean(_props.Get((Object)("ImageCount")));
 //BA.debugLineNum = 88;BA.debugLine="CoverFreeSpace = Props.Get(\"CoverFreeSpace\")";
_coverfreespace = BA.ObjectToBoolean(_props.Get((Object)("CoverFreeSpace")));
 //BA.debugLineNum = 89;BA.debugLine="FreeSpaceColor = Props.Get(\"FreeSpaceColor\")";
_freespacecolor = (int)(BA.ObjectToNumber(_props.Get((Object)("FreeSpaceColor"))));
 //BA.debugLineNum = 90;BA.debugLine="ZoomActualSlide = Props.Get(\"ZoomActualSlide\")";
_zoomactualslide = BA.ObjectToBoolean(_props.Get((Object)("ZoomActualSlide")));
 //BA.debugLineNum = 91;BA.debugLine="dotTransitionDuration = Props.Get(\"dotTransitionD";
_dottransitionduration = (int)(BA.ObjectToNumber(_props.Get((Object)("dotTransitionDuration"))));
 //BA.debugLineNum = 92;BA.debugLine="AutoPlayVideo = Props.Get(\"AutoPlayVideo\")";
_autoplayvideo = BA.ObjectToBoolean(_props.Get((Object)("AutoPlayVideo")));
 //BA.debugLineNum = 93;BA.debugLine="StartVideoMuted = Props.Get(\"StartVideoMuted\")";
_startvideomuted = BA.ObjectToBoolean(_props.Get((Object)("StartVideoMuted")));
 //BA.debugLineNum = 95;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 96;BA.debugLine="mBase.Color = xui.Color_Transparent";
_mbase.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 107;BA.debugLine="Imgcont.Initialize(\"ImgCont\")";
_imgcont.Initialize(ba,"ImgCont");
 //BA.debugLineNum = 110;BA.debugLine="If ShowDots = \"OUTSIDE\" Then";
if ((_showdots).equals("OUTSIDE")) { 
 //BA.debugLineNum = 111;BA.debugLine="mBase.AddView(Imgcont,0,0,mBase.Width,(mBase.Hei";
_mbase.AddView((android.view.View)(_imgcont.getObject()),(int) (0),(int) (0),_mbase.getWidth(),(int) ((_mbase.getHeight()-__c.DipToCurrent((int) (30)))));
 }else {
 //BA.debugLineNum = 113;BA.debugLine="mBase.AddView(Imgcont,0,0,mBase.Width,mBase.Heig";
_mbase.AddView((android.view.View)(_imgcont.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 };
 //BA.debugLineNum = 118;BA.debugLine="GesturePanel = xui.CreatePanel(\"\")";
_gesturepanel = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 119;BA.debugLine="mBase.addview(GesturePanel,0,0,mBase.Width,Imgcon";
_mbase.AddView((android.view.View)(_gesturepanel.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_imgcont.getHeight());
 //BA.debugLineNum = 120;BA.debugLine="GD.SetOnGestureListener(GesturePanel,\"ImgCont_GD\"";
_gd.SetOnGestureListener(ba,(android.view.View)(_gesturepanel.getObject()),"ImgCont_GD");
 //BA.debugLineNum = 122;BA.debugLine="JO = mBase";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mbase.getObject()));
 //BA.debugLineNum = 124;BA.debugLine="zoomfix";
_zoomfix();
 //BA.debugLineNum = 125;BA.debugLine="mBase.AddView(xui.CreatePanel(\"\"),(mBase.Width -";
_mbase.AddView((android.view.View)(_xui.CreatePanel(ba,"").getObject()),(int) ((_mbase.getWidth()-__c.DipToCurrent((int) (10)))+__c.DipToCurrent((int) (1))),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 126;BA.debugLine="mBase.GetView(mBase.NumberOfViews-1).AddView(ImgC";
_mbase.GetView((int) (_mbase.getNumberOfViews()-1)).AddView((android.view.View)(_imgcount.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 127;BA.debugLine="Private tempView As B4XView = ImgCount";
_tempview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tempview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imgcount.getObject()));
 //BA.debugLineNum = 128;BA.debugLine="tempView.TextColor = xui.Color_White";
_tempview.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 129;BA.debugLine="tempView.TextSize = 12";
_tempview.setTextSize((float) (12));
 //BA.debugLineNum = 130;BA.debugLine="tempView.SetTextAlignment(\"CENTER\",\"CENTER\")";
_tempview.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 131;BA.debugLine="tempView.Parent.Visible = False";
_tempview.getParent().setVisible(__c.False);
 //BA.debugLineNum = 133;BA.debugLine="mBase.AddView(dotCont,0,mBase.Height - 30dip, mBa";
_mbase.AddView((android.view.View)(_dotcont.getObject()),(int) (0),(int) (_mbase.getHeight()-__c.DipToCurrent((int) (30))),_mbase.getWidth(),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 135;BA.debugLine="ZoomPanel.Color = xui.Color_ARGB(30,0,0,0)";
_zoompanel.setColor(_xui.Color_ARGB((int) (30),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _imgcont_gd_ondoubletap(float _x,float _y,Object _motionevent) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _currentview = null;
anywheresoftware.b4a.objects.collections.Map _tagmap = null;
 //BA.debugLineNum = 190;BA.debugLine="Private Sub ImgCont_GD_onDoubleTap(X As Float, Y A";
 //BA.debugLineNum = 191;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Double";
if (_xui.SubExists(ba,_mcallback,_meventname+"_DoubleTap",(int) (2))) { 
 //BA.debugLineNum = 192;BA.debugLine="Private currentView As B4XView = ImgList.Get(Cur";
_currentview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_currentview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 193;BA.debugLine="Private tagmap As Map = currentView.Tag";
_tagmap = new anywheresoftware.b4a.objects.collections.Map();
_tagmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_currentview.getTag()));
 //BA.debugLineNum = 194;BA.debugLine="CallSub3(mCallBack, mEventName & \"_DoubleTap\",Cu";
__c.CallSubNew3(ba,_mcallback,_meventname+"_DoubleTap",(Object)(_currentindex),_tagmap.Get((Object)("data")));
 };
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public String  _imgcont_gd_onpinchclose(float _newdistance,float _previousdistance,Object _motionevent) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
 //BA.debugLineNum = 252;BA.debugLine="Private Sub ImgCont_GD_onPinchClose(NewDistance As";
 //BA.debugLineNum = 253;BA.debugLine="StopPropagation(True)";
_stoppropagation(__c.True);
 //BA.debugLineNum = 254;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 255;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 256;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
if (_imagedata.ContainsKey((Object)("player"))==__c.False) { 
 //BA.debugLineNum = 257;BA.debugLine="If ZoomContainer.IsInitialized Then";
if (_zoomcontainer.IsInitialized()) { 
 //BA.debugLineNum = 258;BA.debugLine="If ZoomPanel.Parent.IsInitialized Then";
if (_zoompanel.getParent().IsInitialized()) { 
 //BA.debugLineNum = 259;BA.debugLine="ZoomImage(NewDistance,MotionEvent)";
_zoomimage(_newdistance,_motionevent);
 };
 };
 };
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public String  _imgcont_gd_onpinchopen(float _newdistance,float _previousdistance,Object _motionevent) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _actualview = null;
int[] _location = null;
anywheresoftware.b4a.objects.PanelWrapper _tempview = null;
 //BA.debugLineNum = 265;BA.debugLine="Private Sub ImgCont_GD_onPinchOpen(NewDistance As";
 //BA.debugLineNum = 266;BA.debugLine="StopPropagation(True)";
_stoppropagation(__c.True);
 //BA.debugLineNum = 270;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 271;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 272;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
if (_imagedata.ContainsKey((Object)("player"))==__c.False) { 
 //BA.debugLineNum = 273;BA.debugLine="If ZoomContainer.IsInitialized Then";
if (_zoomcontainer.IsInitialized()) { 
 //BA.debugLineNum = 274;BA.debugLine="If Not(ZoomPanel.Parent.IsInitialized) Then";
if (__c.Not(_zoompanel.getParent().IsInitialized())) { 
 //BA.debugLineNum = 275;BA.debugLine="ZoomContainer.AddView(ZoomPanel,0,0,ZoomContai";
_zoomcontainer.AddView((android.view.View)(_zoompanel.getObject()),(int) (0),(int) (0),_zoomcontainer.getWidth(),_zoomcontainer.getHeight());
 //BA.debugLineNum = 276;BA.debugLine="Private actualView As B4XView = ImgList.Get(Cu";
_actualview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_actualview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 287;BA.debugLine="Private location(2) As Int";
_location = new int[(int) (2)];
;
 //BA.debugLineNum = 288;BA.debugLine="JO.RunMethod(\"getLocationInWindow\",Array As Ob";
_jo.RunMethod("getLocationInWindow",new Object[]{(Object)(_location)});
 //BA.debugLineNum = 289;BA.debugLine="Private tempView As Panel = xui.CreatePanel(\"y";
_tempview = new anywheresoftware.b4a.objects.PanelWrapper();
_tempview = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"yy").getObject()));
 //BA.debugLineNum = 290;BA.debugLine="tempView.SetBackgroundImage(actualView.Snapsho";
_tempview.SetBackgroundImageNew((android.graphics.Bitmap)(_actualview.Snapshot().getObject())).setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 291;BA.debugLine="PinchFixX = (actualView.Width/2) - (Min(GD.get";
_pinchfixx = (_actualview.getWidth()/(double)2)-(__c.Min(_gd.getX((android.view.MotionEvent)(_motionevent),(int) (1)),_gd.getX((android.view.MotionEvent)(_motionevent),(int) (0)))+__c.Abs(_gd.getX((android.view.MotionEvent)(_motionevent),(int) (0))-_gd.getX((android.view.MotionEvent)(_motionevent),(int) (1)))/(double)2);
 //BA.debugLineNum = 292;BA.debugLine="PinchFixY = (actualView.Height/2) - (Min(GD.ge";
_pinchfixy = (_actualview.getHeight()/(double)2)-(__c.Min(_gd.getY((android.view.MotionEvent)(_motionevent),(int) (1)),_gd.getY((android.view.MotionEvent)(_motionevent),(int) (0)))+__c.Abs(_gd.getY((android.view.MotionEvent)(_motionevent),(int) (0))-_gd.getY((android.view.MotionEvent)(_motionevent),(int) (1)))/(double)2);
 //BA.debugLineNum = 294;BA.debugLine="ZoomPanel.AddView(tempView,location(0),locatio";
_zoompanel.AddView((android.view.View)(_tempview.getObject()),_location[(int) (0)],(int) (_location[(int) (1)]-_zoomwindowfix),_actualview.getWidth(),_actualview.getHeight());
 //BA.debugLineNum = 295;BA.debugLine="PinchStartDistance = NewDistance";
_pinchstartdistance = _newdistance;
 }else {
 //BA.debugLineNum = 298;BA.debugLine="ZoomImage(NewDistance,MotionEvent)";
_zoomimage(_newdistance,_motionevent);
 };
 };
 };
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public String  _imgcont_gd_onsingletapconfirmed(float _x,float _y,Object _motionevent) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4j.object.JavaObject _vo = null;
anywheresoftware.b4a.objects.B4XViewWrapper _currentview = null;
anywheresoftware.b4a.objects.collections.Map _tagmap = null;
 //BA.debugLineNum = 164;BA.debugLine="Private Sub ImgCont_GD_onSingleTapConfirmed(X As F";
 //BA.debugLineNum = 165;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 166;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 167;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
 //BA.debugLineNum = 168;BA.debugLine="If x < 45dip And y < 45dip Then";
if (_x<__c.DipToCurrent((int) (45)) && _y<__c.DipToCurrent((int) (45))) { 
 //BA.debugLineNum = 169;BA.debugLine="ToggleMute";
_togglemute();
 }else {
 //BA.debugLineNum = 171;BA.debugLine="Dim vo As JavaObject = imagedata.Get(\"player\")";
_vo = new anywheresoftware.b4j.object.JavaObject();
_vo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_imagedata.Get((Object)("player"))));
 //BA.debugLineNum = 172;BA.debugLine="If vo.GetFieldJO(\"player\").RunMethod(\"isPlaying";
if ((_vo.GetFieldJO("player").RunMethod("isPlaying",(Object[])(__c.Null))).equals((Object)(__c.True))) { 
 //BA.debugLineNum = 173;BA.debugLine="i.GetView(0).Tag=False";
_i.GetView((int) (0)).setTag((Object)(__c.False));
 //BA.debugLineNum = 174;BA.debugLine="PauseCurrentVideo";
_pausecurrentvideo();
 }else {
 //BA.debugLineNum = 176;BA.debugLine="i.GetView(0).Tag=True";
_i.GetView((int) (0)).setTag((Object)(__c.True));
 //BA.debugLineNum = 177;BA.debugLine="PlayCurrentVideo";
_playcurrentvideo();
 };
 };
 }else {
 //BA.debugLineNum = 181;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Singl";
if (_xui.SubExists(ba,_mcallback,_meventname+"_SingleTap",(int) (2))) { 
 //BA.debugLineNum = 182;BA.debugLine="Private currentView As B4XView = ImgList.Get(Cu";
_currentview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_currentview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 183;BA.debugLine="Private tagmap As Map = currentView.Tag";
_tagmap = new anywheresoftware.b4a.objects.collections.Map();
_tagmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_currentview.getTag()));
 //BA.debugLineNum = 184;BA.debugLine="CallSub3(mCallBack, mEventName & \"_SingleTap\",C";
__c.CallSubNew3(ba,_mcallback,_meventname+"_SingleTap",(Object)(_currentindex),_tagmap.Get((Object)("data")));
 };
 };
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public boolean  _imgcont_gd_ontouch(int _action,float _x,float _y,Object _motionevent) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _actualview = null;
 //BA.debugLineNum = 234;BA.debugLine="Private Sub ImgCont_GD_onTouch(Action As Int, X As";
 //BA.debugLineNum = 235;BA.debugLine="If Action = mBase.TOUCH_ACTION_UP Then";
if (_action==_mbase.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 236;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 237;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 238;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
if (_imagedata.ContainsKey((Object)("player"))==__c.False) { 
 //BA.debugLineNum = 239;BA.debugLine="ZoomPanel.RemoveViewFromParent";
_zoompanel.RemoveViewFromParent();
 //BA.debugLineNum = 240;BA.debugLine="ZoomPanel.RemoveAllViews";
_zoompanel.RemoveAllViews();
 //BA.debugLineNum = 241;BA.debugLine="If ZoomActualSlide Then";
if (_zoomactualslide) { 
 //BA.debugLineNum = 242;BA.debugLine="Private actualView As B4XView = ImgList.Get(Cu";
_actualview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_actualview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 243;BA.debugLine="actualView.SetVisibleAnimated(200,True)";
_actualview.SetVisibleAnimated((int) (200),__c.True);
 };
 };
 //BA.debugLineNum = 246;BA.debugLine="StopPropagation(False)";
_stoppropagation(__c.False);
 };
 //BA.debugLineNum = 248;BA.debugLine="GD.PassTouchEventTo(MotionEvent,Imgcont)";
_gd.PassTouchEventTo((android.view.MotionEvent)(_motionevent),(android.view.View)(_imgcont.getObject()));
 //BA.debugLineNum = 249;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return false;
}
public String  _imgcont_pagechanged(int _position) throws Exception{
int _centerindex = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
 //BA.debugLineNum = 370;BA.debugLine="Private Sub ImgCont_PageChanged (Position As Int)";
 //BA.debugLineNum = 371;BA.debugLine="Dim centerIndex As Int = Position";
_centerindex = _position;
 //BA.debugLineNum = 373;BA.debugLine="If CurrentIndex > -1 Then";
if (_currentindex>-1) { 
 //BA.debugLineNum = 374;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 375;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 376;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
 //BA.debugLineNum = 377;BA.debugLine="PauseCurrentVideo";
_pausecurrentvideo();
 };
 };
 //BA.debugLineNum = 382;BA.debugLine="If CurrentIndex <> centerIndex Then";
if (_currentindex!=_centerindex) { 
 //BA.debugLineNum = 383;BA.debugLine="PrevIndex = CurrentIndex";
_previndex = _currentindex;
 //BA.debugLineNum = 384;BA.debugLine="CurrentIndex = centerIndex";
_currentindex = _centerindex;
 //BA.debugLineNum = 385;BA.debugLine="ShowCount";
_showcount();
 //BA.debugLineNum = 386;BA.debugLine="UpdatePlayback";
_updateplayback();
 //BA.debugLineNum = 387;BA.debugLine="If ShowDots <> \"HIDE\" Then UpdateDots";
if ((_showdots).equals("HIDE") == false) { 
_updatedots();};
 };
 //BA.debugLineNum = 393;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCh";
if (_xui.SubExists(ba,_mcallback,_meventname+"_PageChanged",(int) (1))) { 
 //BA.debugLineNum = 394;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChanged\",";
__c.CallSubNew2(ba,_mcallback,_meventname+"_PageChanged",(Object)(_currentindex));
 };
 //BA.debugLineNum = 396;BA.debugLine="ShowImage";
_showimage();
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 70;BA.debugLine="private Sub Initialize (Callback As Object, EventN";
 //BA.debugLineNum = 71;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 72;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 73;BA.debugLine="ImgList.Initialize";
_imglist.Initialize();
 //BA.debugLineNum = 74;BA.debugLine="ZoomPanel = xui.CreatePanel(\"ZoomPanel\")";
_zoompanel = _xui.CreatePanel(ba,"ZoomPanel");
 //BA.debugLineNum = 76;BA.debugLine="ImgCount.Initialize(\"\")";
_imgcount.Initialize(ba,"");
 //BA.debugLineNum = 77;BA.debugLine="dotCont = xui.CreatePanel(\"\")";
_dotcont = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 78;BA.debugLine="LblTimer.Initialize(\"LblTimer\",2000)";
_lbltimer.Initialize(ba,"LblTimer",(long) (2000));
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _lbltimer_tick() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
 //BA.debugLineNum = 320;BA.debugLine="Private Sub LblTimer_tick";
 //BA.debugLineNum = 321;BA.debugLine="Private i As B4XView = ImgCount.parent";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imgcount.getParent()));
 //BA.debugLineNum = 322;BA.debugLine="i.SetVisibleAnimated(500,False)";
_i.SetVisibleAnimated((int) (500),__c.False);
 //BA.debugLineNum = 323;BA.debugLine="LblTimer.Enabled = False";
_lbltimer.setEnabled(__c.False);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return "";
}
public String  _pausecurrentvideo() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
 //BA.debugLineNum = 967;BA.debugLine="Public Sub PauseCurrentVideo";
 //BA.debugLineNum = 968;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 969;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 970;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
 //BA.debugLineNum = 972;BA.debugLine="Dim v As SimpleExoPlayer = imagedata.Get(\"player";
_v = (anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(_imagedata.Get((Object)("player")));
 //BA.debugLineNum = 973;BA.debugLine="v.pause";
_v.Pause();
 //BA.debugLineNum = 981;BA.debugLine="i.GetView(2).Visible=True";
_i.GetView((int) (2)).setVisible(__c.True);
 //BA.debugLineNum = 983;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Video";
if (_xui.SubExists(ba,_mcallback,_meventname+"_VideoPaused",(int) (1))) { 
 //BA.debugLineNum = 984;BA.debugLine="CallSub2(mCallBack, mEventName & \"_VideoPaused\"";
__c.CallSubNew2(ba,_mcallback,_meventname+"_VideoPaused",(Object)(_currentindex));
 };
 };
 //BA.debugLineNum = 987;BA.debugLine="End Sub";
return "";
}
public String  _playcurrentvideo() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
 //BA.debugLineNum = 990;BA.debugLine="Public Sub PlayCurrentVideo";
 //BA.debugLineNum = 991;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 992;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 993;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
 //BA.debugLineNum = 995;BA.debugLine="Dim v As SimpleExoPlayer = imagedata.Get(\"player";
_v = (anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(_imagedata.Get((Object)("player")));
 //BA.debugLineNum = 996;BA.debugLine="v.play";
_v.Play();
 //BA.debugLineNum = 1004;BA.debugLine="i.GetView(2).Visible=False";
_i.GetView((int) (2)).setVisible(__c.False);
 //BA.debugLineNum = 1006;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Video";
if (_xui.SubExists(ba,_mcallback,_meventname+"_VideoPlaying",(int) (1))) { 
 //BA.debugLineNum = 1007;BA.debugLine="CallSub2(mCallBack, mEventName & \"_VideoPlaying";
__c.CallSubNew2(ba,_mcallback,_meventname+"_VideoPlaying",(Object)(_currentindex));
 };
 };
 //BA.debugLineNum = 1010;BA.debugLine="End Sub";
return "";
}
public String  _removeprogressview(anywheresoftware.b4a.objects.B4XViewWrapper _i) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.ProgressBarWrapper _p = null;
 //BA.debugLineNum = 500;BA.debugLine="Private Sub removeProgressView(i As B4XView)";
 //BA.debugLineNum = 501;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is Label Then";
if (_i.GetView((int) (_i.getNumberOfViews()-1)).getObjectOrNull() instanceof android.widget.TextView) { 
 //BA.debugLineNum = 502;BA.debugLine="Dim l As Label = i.GetView(i.NumberOfViews-1)";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_i.GetView((int) (_i.getNumberOfViews()-1)).getObject()));
 //BA.debugLineNum = 504;BA.debugLine="l.RemoveView";
_l.RemoveView();
 };
 //BA.debugLineNum = 510;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is ProgressBar Th";
if (_i.GetView((int) (_i.getNumberOfViews()-1)).getObjectOrNull() instanceof android.widget.ProgressBar) { 
 //BA.debugLineNum = 511;BA.debugLine="Dim p As ProgressBar = i.GetView(i.NumberOfViews";
_p = new anywheresoftware.b4a.objects.ProgressBarWrapper();
_p = (anywheresoftware.b4a.objects.ProgressBarWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ProgressBarWrapper(), (android.widget.ProgressBar)(_i.GetView((int) (_i.getNumberOfViews()-1)).getObject()));
 //BA.debugLineNum = 512;BA.debugLine="p.RemoveView";
_p.RemoveView();
 };
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return "";
}
public String  _setactive(anywheresoftware.b4a.objects.B4XViewWrapper _dot) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _dotcir = null;
 //BA.debugLineNum = 474;BA.debugLine="Private Sub SetActive(dot As B4XView)";
 //BA.debugLineNum = 475;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
_dotcir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dotcir = _dot.GetView((int) (0));
 //BA.debugLineNum = 476;BA.debugLine="dotCir.SetColorAndBorder(activeDotColor,0,xui.Col";
_dotcir.SetColorAndBorder(_activedotcolor,(int) (0),_xui.Color_Transparent,_dotsize);
 //BA.debugLineNum = 477;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,0,";
_dotcir.SetLayoutAnimated(_dottransitionduration,(int) (0),(int) (0),_dotsize,_dotsize);
 //BA.debugLineNum = 478;BA.debugLine="End Sub";
return "";
}
public String  _setactivityhasactionbar(boolean _value) throws Exception{
 //BA.debugLineNum = 793;BA.debugLine="Public Sub setActivityHasActionBar(value As Boolea";
 //BA.debugLineNum = 794;BA.debugLine="actHasActionBar = value";
_acthasactionbar = _value;
 //BA.debugLineNum = 795;BA.debugLine="zoomfix";
_zoomfix();
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return "";
}
public String  _setdefault(anywheresoftware.b4a.objects.B4XViewWrapper _dot) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _dotcir = null;
 //BA.debugLineNum = 480;BA.debugLine="Private Sub SetDefault(dot As B4XView)";
 //BA.debugLineNum = 481;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
_dotcir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dotcir = _dot.GetView((int) (0));
 //BA.debugLineNum = 482;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,(d";
_dotcir.SetLayoutAnimated(_dottransitionduration,(int) ((_dotsize-_dotsizem)/(double)2),(int) ((_dotsize-_dotsizem)/(double)2),_dotsizem,_dotsizem);
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return "";
}
public String  _sethidden(anywheresoftware.b4a.objects.B4XViewWrapper _dot) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _dotcir = null;
 //BA.debugLineNum = 493;BA.debugLine="Private Sub SetHidden(dot As B4XView)";
 //BA.debugLineNum = 494;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
_dotcir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dotcir = _dot.GetView((int) (0));
 //BA.debugLineNum = 495;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,do";
_dotcir.SetLayoutAnimated(_dottransitionduration,(int) (_dotsize/(double)2),(int) (_dotsize/(double)2),(int) (1),(int) (1));
 //BA.debugLineNum = 496;BA.debugLine="dotCir.SetVisibleAnimated(dotTransitionDuration,F";
_dotcir.SetVisibleAnimated(_dottransitionduration,__c.False);
 //BA.debugLineNum = 497;BA.debugLine="dot.tag = \"h\"";
_dot.setTag((Object)("h"));
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return "";
}
public String  _setitems(anywheresoftware.b4a.objects.collections.List _imgs) throws Exception{
anywheresoftware.b4a.objects.collections.Map _img = null;
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.PanelWrapper _tempi = null;
anywheresoftware.b4a.objects.PanelWrapper _soundbtn = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.B4XViewWrapper _b4xv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pbtn = null;
anywheresoftware.b4a.objects.LabelWrapper _pbl = null;
anywheresoftware.b4a.objects.ImageViewWrapper _ii = null;
int _dotstartx = 0;
int _j = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _size = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _q = null;
 //BA.debugLineNum = 816;BA.debugLine="Public Sub SetItems(imgs As List)";
 //BA.debugLineNum = 817;BA.debugLine="videoplayer.Initialize";
_videoplayer.Initialize();
 //BA.debugLineNum = 818;BA.debugLine="CurrentIndex = 0";
_currentindex = (int) (0);
 //BA.debugLineNum = 819;BA.debugLine="dotCont.RemoveAllViews";
_dotcont.RemoveAllViews();
 //BA.debugLineNum = 820;BA.debugLine="ImgList.Initialize";
_imglist.Initialize();
 //BA.debugLineNum = 822;BA.debugLine="imgLayout.Initialize";
_imglayout.Initialize(ba);
 //BA.debugLineNum = 823;BA.debugLine="For Each img As Map In imgs";
_img = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _imgs;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_img = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group6.Get(index6)));
 //BA.debugLineNum = 825;BA.debugLine="Private i As B4XView = xui.CreatePanel(\"\")";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 827;BA.debugLine="Dim  tempi As Panel = xui.createPanel(\"\")";
_tempi = new anywheresoftware.b4a.objects.PanelWrapper();
_tempi = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 828;BA.debugLine="tempi.SetLayoutAnimated(0,0,0,Imgcont.Width,Imgc";
_tempi.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_imgcont.getWidth(),_imgcont.getHeight());
 //BA.debugLineNum = 829;BA.debugLine="tempi.addView(i,0,0,Imgcont.Width,Imgcont.Height";
_tempi.AddView((android.view.View)(_i.getObject()),(int) (0),(int) (0),_imgcont.getWidth(),_imgcont.getHeight());
 //BA.debugLineNum = 830;BA.debugLine="imgLayout.AddPage(tempi,\"\")";
_imglayout.AddPage((android.view.View)(_tempi.getObject()),"");
 //BA.debugLineNum = 844;BA.debugLine="If img.ContainsKey(\"video\") Then";
if (_img.ContainsKey((Object)("video"))) { 
 //BA.debugLineNum = 845;BA.debugLine="i.LoadLayout(\"ximageslider_video\")";
_i.LoadLayout("ximageslider_video",ba);
 //BA.debugLineNum = 850;BA.debugLine="Dim soundBtn As Panel = xui.CreatePanel(\"sound\"";
_soundbtn = new anywheresoftware.b4a.objects.PanelWrapper();
_soundbtn = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"sound").getObject()));
 //BA.debugLineNum = 851;BA.debugLine="i.AddView(soundBtn,0,0,45dip,45dip)";
_i.AddView((android.view.View)(_soundbtn.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (45)));
 //BA.debugLineNum = 853;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 854;BA.debugLine="l.Initialize(\"\")";
_l.Initialize(ba,"");
 //BA.debugLineNum = 855;BA.debugLine="soundBtn.AddView(l,10dip,10dip,25dip,25dip)";
_soundbtn.AddView((android.view.View)(_l.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 857;BA.debugLine="Dim b4xv As B4XView = l";
_b4xv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l.getObject()));
 //BA.debugLineNum = 858;BA.debugLine="b4xv.TextSize=12";
_b4xv.setTextSize((float) (12));
 //BA.debugLineNum = 859;BA.debugLine="b4xv.TextColor=Colors.White";
_b4xv.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 860;BA.debugLine="b4xv.Font = xui.CreateMaterialIcons(17)";
_b4xv.setFont(_xui.CreateMaterialIcons((float) (17)));
 //BA.debugLineNum = 861;BA.debugLine="b4xv.SetColorAndBorder(xui.Color_ARGB(150,50,50";
_b4xv.SetColorAndBorder(_xui.Color_ARGB((int) (150),(int) (50),(int) (50),(int) (50)),(int) (0),_xui.Color_Transparent,(int) (_b4xv.getHeight()/(double)2));
 //BA.debugLineNum = 862;BA.debugLine="b4xv.SetTextAlignment(\"CENTER\",\"CENTER\")";
_b4xv.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 864;BA.debugLine="If StartVideoMuted Then";
if (_startvideomuted) { 
 //BA.debugLineNum = 865;BA.debugLine="b4xv.Text = Chr(0xE04F)";
_b4xv.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe04f))));
 }else {
 //BA.debugLineNum = 867;BA.debugLine="b4xv.Text = Chr(0xE050)";
_b4xv.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe050))));
 };
 //BA.debugLineNum = 870;BA.debugLine="Dim pbtn As B4XView=xui.CreatePanel(\"pbtn\")";
_pbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pbtn = _xui.CreatePanel(ba,"pbtn");
 //BA.debugLineNum = 871;BA.debugLine="i.AddView(pbtn,i.Width/2 - 30dip,i.height/2 - 3";
_i.AddView((android.view.View)(_pbtn.getObject()),(int) (_i.getWidth()/(double)2-__c.DipToCurrent((int) (30))),(int) (_i.getHeight()/(double)2-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 872;BA.debugLine="pbtn.SetColorAndBorder(Colors.ARGB(150,50,50,50";
_pbtn.SetColorAndBorder(__c.Colors.ARGB((int) (150),(int) (50),(int) (50),(int) (50)),(int) (0),_xui.Color_Transparent,(int) (_pbtn.getHeight()/(double)2));
 //BA.debugLineNum = 873;BA.debugLine="Dim pbl As Label";
_pbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 874;BA.debugLine="pbl.Initialize(\"\")";
_pbl.Initialize(ba,"");
 //BA.debugLineNum = 875;BA.debugLine="Dim b4xv As B4XView = pbl";
_b4xv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pbl.getObject()));
 //BA.debugLineNum = 876;BA.debugLine="b4xv.Text=Chr(0xE037)";
_b4xv.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe037))));
 //BA.debugLineNum = 877;BA.debugLine="b4xv.font=xui.CreateMaterialIcons(40)";
_b4xv.setFont(_xui.CreateMaterialIcons((float) (40)));
 //BA.debugLineNum = 878;BA.debugLine="b4xv.TextColor=Colors.White";
_b4xv.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 879;BA.debugLine="b4xv.Color=Colors.Transparent";
_b4xv.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 880;BA.debugLine="b4xv.SetTextAlignment(\"CENTER\",\"CENTER\")";
_b4xv.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 882;BA.debugLine="pbtn.AddView(pbl,0,0,pbtn.Width,pbtn.Height)";
_pbtn.AddView((android.view.View)(_pbl.getObject()),(int) (0),(int) (0),_pbtn.getWidth(),_pbtn.getHeight());
 //BA.debugLineNum = 883;BA.debugLine="pbtn.Visible=False";
_pbtn.setVisible(__c.False);
 }else {
 //BA.debugLineNum = 887;BA.debugLine="Private ii As ImageView:ii.Initialize(\"\")";
_ii = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 887;BA.debugLine="Private ii As ImageView:ii.Initialize(\"\")";
_ii.Initialize(ba,"");
 //BA.debugLineNum = 897;BA.debugLine="i.AddView(ii,0,0,Imgcont.Width,Imgcont.Height)";
_i.AddView((android.view.View)(_ii.getObject()),(int) (0),(int) (0),_imgcont.getWidth(),_imgcont.getHeight());
 };
 //BA.debugLineNum = 899;BA.debugLine="i.Color = FreeSpaceColor";
_i.setColor(_freespacecolor);
 //BA.debugLineNum = 901;BA.debugLine="i.Tag = img";
_i.setTag((Object)(_img.getObject()));
 //BA.debugLineNum = 902;BA.debugLine="ImgList.Add(i)";
_imglist.Add((Object)(_i.getObject()));
 }
};
 //BA.debugLineNum = 911;BA.debugLine="Imgcont.PageContainer = imgLayout";
_imgcont.setPageContainer(_imglayout);
 //BA.debugLineNum = 914;BA.debugLine="If ShowDots <> \"HIDE\" Then";
if ((_showdots).equals("HIDE") == false) { 
 //BA.debugLineNum = 915;BA.debugLine="If imgs.Size > 1 Then";
if (_imgs.getSize()>1) { 
 //BA.debugLineNum = 916;BA.debugLine="Private dotStartX As Int = (dotCont.width/2) -";
_dotstartx = (int) ((_dotcont.getWidth()/(double)2)-((((__c.Min(6,_imgs.getSize())*_dotsize)+(__c.Min(6,_imgs.getSize())*_dotgap))-_dotgap)/(double)2));
 //BA.debugLineNum = 917;BA.debugLine="For j=0 To imgs.Size-1";
{
final int step56 = 1;
final int limit56 = (int) (_imgs.getSize()-1);
_j = (int) (0) ;
for (;_j <= limit56 ;_j = _j + step56 ) {
 //BA.debugLineNum = 918;BA.debugLine="Private p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 919;BA.debugLine="Private size As Int = dotSizeM";
_size = _dotsizem;
 //BA.debugLineNum = 920;BA.debugLine="p.Tag = \"b\"";
_p.setTag((Object)("b"));
 //BA.debugLineNum = 921;BA.debugLine="If j=5 Then";
if (_j==5) { 
 //BA.debugLineNum = 922;BA.debugLine="size = dotSizeS";
_size = _dotsizes;
 //BA.debugLineNum = 923;BA.debugLine="p.Tag = \"s\"";
_p.setTag((Object)("s"));
 }else if(_j>5) { 
 //BA.debugLineNum = 925;BA.debugLine="size = 0";
_size = (int) (0);
 //BA.debugLineNum = 926;BA.debugLine="p.Tag = \"h\"";
_p.setTag((Object)("h"));
 };
 //BA.debugLineNum = 929;BA.debugLine="dotCont.AddView(p,dotStartX + (j*(dotSize+dotg";
_dotcont.AddView((android.view.View)(_p.getObject()),(int) (_dotstartx+(_j*(_dotsize+_dotgap))),(int) (((_dotcont.getHeight()/(double)2)-(_dotsize/(double)2))),_dotsize,_dotsize);
 //BA.debugLineNum = 930;BA.debugLine="Private q As B4XView = xui.CreatePanel(\"\")";
_q = new anywheresoftware.b4a.objects.B4XViewWrapper();
_q = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 932;BA.debugLine="If j=0 Then";
if (_j==0) { 
 //BA.debugLineNum = 933;BA.debugLine="q.SetColorAndBorder(activeDotColor,0,xui.Colo";
_q.SetColorAndBorder(_activedotcolor,(int) (0),_xui.Color_Transparent,_dotsize);
 //BA.debugLineNum = 934;BA.debugLine="p.AddView(q,0,0,dotSize,dotSize)";
_p.AddView((android.view.View)(_q.getObject()),(int) (0),(int) (0),_dotsize,_dotsize);
 }else {
 //BA.debugLineNum = 936;BA.debugLine="q.SetColorAndBorder(dotColor,0,xui.Color_Tran";
_q.SetColorAndBorder(_dotcolor,(int) (0),_xui.Color_Transparent,_dotsize);
 //BA.debugLineNum = 937;BA.debugLine="p.AddView(q,(dotSize-size)/2,(dotSize-size)/2";
_p.AddView((android.view.View)(_q.getObject()),(int) ((_dotsize-_size)/(double)2),(int) ((_dotsize-_size)/(double)2),_size,_size);
 };
 }
};
 };
 };
 //BA.debugLineNum = 943;BA.debugLine="ShowCount";
_showcount();
 //BA.debugLineNum = 944;BA.debugLine="ShowImage";
_showimage();
 //BA.debugLineNum = 945;BA.debugLine="End Sub";
return "";
}
public String  _setsmall(anywheresoftware.b4a.objects.B4XViewWrapper _dot) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _dotcir = null;
 //BA.debugLineNum = 485;BA.debugLine="Private Sub SetSmall(dot As B4XView)";
 //BA.debugLineNum = 486;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
_dotcir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dotcir = _dot.GetView((int) (0));
 //BA.debugLineNum = 487;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,(d";
_dotcir.SetLayoutAnimated(_dottransitionduration,(int) ((_dotsize/(double)2)-(_dotsizes/(double)2)),(int) ((_dotsize/(double)2)-(_dotsizes/(double)2)),_dotsizes,_dotsizes);
 //BA.debugLineNum = 488;BA.debugLine="dotCir.SetVisibleAnimated(dotTransitionDuration,T";
_dotcir.SetVisibleAnimated(_dottransitionduration,__c.True);
 //BA.debugLineNum = 490;BA.debugLine="dot.tag = \"s\"";
_dot.setTag((Object)("s"));
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
return "";
}
public String  _setzoompanel(anywheresoftware.b4a.objects.B4XViewWrapper _zoompanelcontainer) throws Exception{
 //BA.debugLineNum = 948;BA.debugLine="Public Sub SetZoomPanel(ZoomPanelContainer As B4XV";
 //BA.debugLineNum = 949;BA.debugLine="ZoomContainer=ZoomPanelContainer";
_zoomcontainer = _zoompanelcontainer;
 //BA.debugLineNum = 950;BA.debugLine="End Sub";
return "";
}
public String  _showcount() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _tempview = null;
anywheresoftware.b4a.objects.B4XCanvas _tempcanvas = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _textsize = null;
 //BA.debugLineNum = 399;BA.debugLine="Private Sub ShowCount";
 //BA.debugLineNum = 400;BA.debugLine="If ImageCount Then";
if (_imagecount) { 
 //BA.debugLineNum = 401;BA.debugLine="Private tempView As B4XView = ImgCount";
_tempview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tempview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imgcount.getObject()));
 //BA.debugLineNum = 402;BA.debugLine="tempView.Text = (CurrentIndex+1) & \"/\" & ImgList";
_tempview.setText(BA.ObjectToCharSequence(BA.NumberToString((_currentindex+1))+"/"+BA.NumberToString(_imglist.getSize())));
 //BA.debugLineNum = 403;BA.debugLine="Private tempCanvas As B4XCanvas";
_tempcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 404;BA.debugLine="tempCanvas.Initialize(ImgCount)";
_tempcanvas.Initialize((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imgcount.getObject())));
 //BA.debugLineNum = 405;BA.debugLine="Private textSize As B4XRect = tempCanvas.Measure";
_textsize = _tempcanvas.MeasureText(_tempview.getText(),_tempview.getFont());
 //BA.debugLineNum = 407;BA.debugLine="tempView.parent.SetLayoutAnimated(100,(Imgcont.W";
_tempview.getParent().SetLayoutAnimated((int) (100),(int) ((_imgcont.getWidth()-__c.DipToCurrent((int) (10)))-(_textsize.getWidth()+__c.DipToCurrent((int) (20)))),_tempview.getParent().getTop(),(int) ((_textsize.getWidth()+__c.DipToCurrent((int) (20)))),_tempview.getParent().getHeight());
 //BA.debugLineNum = 408;BA.debugLine="tempView.SetLayoutAnimated(0,0,0,(textSize.Width";
_tempview.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) ((_textsize.getWidth()+__c.DipToCurrent((int) (20)))),_tempview.getHeight());
 //BA.debugLineNum = 409;BA.debugLine="tempView.SetColorAndBorder(xui.Color_ARGB(150,0,";
_tempview.SetColorAndBorder(_xui.Color_ARGB((int) (150),(int) (0),(int) (0),(int) (0)),(int) (0),_xui.Color_Transparent,_tempview.getHeight());
 //BA.debugLineNum = 413;BA.debugLine="tempView.Parent.SetVisibleAnimated(500,True)";
_tempview.getParent().SetVisibleAnimated((int) (500),__c.True);
 //BA.debugLineNum = 414;BA.debugLine="LblTimer.Enabled = False";
_lbltimer.setEnabled(__c.False);
 //BA.debugLineNum = 415;BA.debugLine="LblTimer.Enabled = True";
_lbltimer.setEnabled(__c.True);
 };
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return "";
}
public void  _showimage() throws Exception{
ResumableSub_ShowImage rsub = new ResumableSub_ShowImage(this);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowImage extends BA.ResumableSub {
public ResumableSub_ShowImage(b4a.example2.ximagesliderig parent) {
this.parent = parent;
}
b4a.example2.ximagesliderig parent;
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _img = null;
anywheresoftware.b4a.objects.ProgressBarWrapper _p = null;
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper _vv = null;
b4a.example2.httpjob _j = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4j.object.JavaObject _joo = null;
anywheresoftware.b4j.object.JavaObject _bo = null;
anywheresoftware.b4j.object.JavaObject _jc = null;
anywheresoftware.b4a.objects.LabelWrapper _tp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 534;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._imglist.Get(parent._currentindex)));
 //BA.debugLineNum = 535;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 536;BA.debugLine="Dim img As B4XBitmap";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 538;BA.debugLine="If imagedata.ContainsKey(\"video\") Then";
if (true) break;

case 1:
//if
this.state = 83;
if (_imagedata.ContainsKey((Object)("video"))) { 
this.state = 3;
}else {
this.state = 53;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 539;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
if (true) break;

case 4:
//if
this.state = 51;
if (_imagedata.ContainsKey((Object)("player"))==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 540;BA.debugLine="removeProgressView(i)";
parent._removeprogressview(_i);
 //BA.debugLineNum = 542;BA.debugLine="Dim p As ProgressBar";
_p = new anywheresoftware.b4a.objects.ProgressBarWrapper();
 //BA.debugLineNum = 547;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 548;BA.debugLine="p.Indeterminate = True";
_p.setIndeterminate(parent.__c.True);
 //BA.debugLineNum = 553;BA.debugLine="i.AddView(p,Imgcont.Width/2 - 20dip,Imgcont.hei";
_i.AddView((android.view.View)(_p.getObject()),(int) (parent._imgcont.getWidth()/(double)2-parent.__c.DipToCurrent((int) (20))),(int) (parent._imgcont.getHeight()/(double)2-parent.__c.DipToCurrent((int) (20))),parent.__c.DipToCurrent((int) (40)),parent.__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 556;BA.debugLine="Private v As SimpleExoPlayer";
_v = new anywheresoftware.b4a.objects.SimpleExoPlayerWrapper();
 //BA.debugLineNum = 557;BA.debugLine="v.Initialize(\"vplayer\")";
_v.Initialize(ba,"vplayer");
 //BA.debugLineNum = 558;BA.debugLine="videoplayer.Add(CreateMap(\"id\":CurrentIndex,\"pl";
parent._videoplayer.Add((Object)(parent.__c.createMap(new Object[] {(Object)("id"),(Object)(parent._currentindex),(Object)("player"),(Object)(_v)}).getObject()));
 //BA.debugLineNum = 560;BA.debugLine="If imagedata.Get(\"type\") = \"file\" Then v.Prepar";
if (true) break;

case 7:
//if
this.state = 12;
if ((_imagedata.Get((Object)("type"))).equals((Object)("file"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_v.Prepare(_v.CreateLoopSource(_v.CreateFileSource(BA.ObjectToString(_imagedata.Get((Object)("video"))),""),(int) (-1)));
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 561;BA.debugLine="If imagedata.Get(\"type\") = \"uri\" Then v.Prepare";
if (true) break;

case 13:
//if
this.state = 18;
if ((_imagedata.Get((Object)("type"))).equals((Object)("uri"))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_v.Prepare(_v.CreateLoopSource(_v.CreateUriSource(BA.ObjectToString(_imagedata.Get((Object)("video")))),(int) (-1)));
if (true) break;

case 18:
//C
this.state = 19;
;
 //BA.debugLineNum = 562;BA.debugLine="If imagedata.Get(\"type\") = \"dash\" Then v.Prepar";
if (true) break;

case 19:
//if
this.state = 24;
if ((_imagedata.Get((Object)("type"))).equals((Object)("dash"))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
_v.Prepare(_v.CreateLoopSource(_v.CreateDashSource(BA.ObjectToString(_imagedata.Get((Object)("video")))),(int) (-1)));
if (true) break;

case 24:
//C
this.state = 25;
;
 //BA.debugLineNum = 563;BA.debugLine="If imagedata.Get(\"type\") = \"hls\" Then v.Prepare";
if (true) break;

case 25:
//if
this.state = 30;
if ((_imagedata.Get((Object)("type"))).equals((Object)("hls"))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_v.Prepare(_v.CreateLoopSource(_v.CreateHLSSource(BA.ObjectToString(_imagedata.Get((Object)("video")))),(int) (-1)));
if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 564;BA.debugLine="If imagedata.Get(\"type\") = \"smoothstream\" Then";
if (true) break;

case 31:
//if
this.state = 36;
if ((_imagedata.Get((Object)("type"))).equals((Object)("smoothstream"))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_v.Prepare(_v.CreateLoopSource(_v.CreateSmoothStreamingSource(BA.ObjectToString(_imagedata.Get((Object)("video")))),(int) (-1)));
if (true) break;

case 36:
//C
this.state = 37;
;
 //BA.debugLineNum = 566;BA.debugLine="If StartVideoMuted Then";
if (true) break;

case 37:
//if
this.state = 42;
if (parent._startvideomuted) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 42;
 //BA.debugLineNum = 567;BA.debugLine="v.Volume = 0";
_v.setVolume((float) (0));
 if (true) break;

case 41:
//C
this.state = 42;
 //BA.debugLineNum = 569;BA.debugLine="v.Volume = 1";
_v.setVolume((float) (1));
 if (true) break;

case 42:
//C
this.state = 43;
;
 //BA.debugLineNum = 572;BA.debugLine="Dim vv As SimpleExoPlayerView = i.GetView(0)";
_vv = new anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper();
_vv = (anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper(), (com.google.android.exoplayer2.ui.PlayerView)(_i.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 573;BA.debugLine="Select scale";
if (true) break;

case 43:
//select
this.state = 50;
switch (BA.switchObjectToInt(parent._scale,"FILL","FIT","STRETCH")) {
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
 //BA.debugLineNum = 574;BA.debugLine="Case \"FILL\": vv.resizemode=\"ZOOM\"";
_vv.setResizeMode("ZOOM");
 if (true) break;

case 47:
//C
this.state = 50;
 //BA.debugLineNum = 575;BA.debugLine="Case \"FIT\": vv.resizemode=\"FIT\"";
_vv.setResizeMode("FIT");
 if (true) break;

case 49:
//C
this.state = 50;
 //BA.debugLineNum = 576;BA.debugLine="Case \"STRETCH\": vv.resizemode=\"FILL\"";
_vv.setResizeMode("FILL");
 if (true) break;

case 50:
//C
this.state = 51;
;
 //BA.debugLineNum = 579;BA.debugLine="vv.Player=v";
_vv.setPlayer(_v);
 //BA.debugLineNum = 580;BA.debugLine="vv.Tag = AutoPlayVideo";
_vv.setTag((Object)(parent._autoplayvideo));
 //BA.debugLineNum = 605;BA.debugLine="imagedata.Put(\"player\",v)";
_imagedata.Put((Object)("player"),(Object)(_v));
 if (true) break;

case 51:
//C
this.state = 83;
;
 //BA.debugLineNum = 607;BA.debugLine="UpdatePlayback";
parent._updateplayback();
 if (true) break;

case 53:
//C
this.state = 54;
 //BA.debugLineNum = 609;BA.debugLine="If imagedata.Get(\"image\") Is String Then";
if (true) break;

case 54:
//if
this.state = 63;
if (_imagedata.Get((Object)("image")) instanceof String) { 
this.state = 56;
}else {
this.state = 62;
}if (true) break;

case 56:
//C
this.state = 57;
 //BA.debugLineNum = 610;BA.debugLine="removeProgressView(i)";
parent._removeprogressview(_i);
 //BA.debugLineNum = 613;BA.debugLine="Dim p As ProgressBar";
_p = new anywheresoftware.b4a.objects.ProgressBarWrapper();
 //BA.debugLineNum = 618;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 619;BA.debugLine="p.Indeterminate = True";
_p.setIndeterminate(parent.__c.True);
 //BA.debugLineNum = 623;BA.debugLine="i.AddView(p,Imgcont.Width/2 - 20dip,Imgcont.hei";
_i.AddView((android.view.View)(_p.getObject()),(int) (parent._imgcont.getWidth()/(double)2-parent.__c.DipToCurrent((int) (20))),(int) (parent._imgcont.getHeight()/(double)2-parent.__c.DipToCurrent((int) (20))),parent.__c.DipToCurrent((int) (40)),parent.__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 625;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example2.httpjob();
 //BA.debugLineNum = 626;BA.debugLine="j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 627;BA.debugLine="j.Download(imagedata.Get(\"image\"))";
_j._download /*String*/ (BA.ObjectToString(_imagedata.Get((Object)("image"))));
 //BA.debugLineNum = 628;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 84;
return;
case 84:
//C
this.state = 57;
_j = (b4a.example2.httpjob) result[0];
;
 //BA.debugLineNum = 630;BA.debugLine="p.RemoveView";
_p.RemoveView();
 //BA.debugLineNum = 634;BA.debugLine="If j.Success Then";
if (true) break;

case 57:
//if
this.state = 60;
if (_j._success /*boolean*/ ) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 //BA.debugLineNum = 635;BA.debugLine="Dim img As B4XBitmap = j.GetBitmap";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ().getObject()));
 //BA.debugLineNum = 636;BA.debugLine="imagedata.Put(\"image\",img)";
_imagedata.Put((Object)("image"),(Object)(_img.getObject()));
 //BA.debugLineNum = 637;BA.debugLine="i.tag = imagedata";
_i.setTag((Object)(_imagedata.getObject()));
 if (true) break;

case 60:
//C
this.state = 63;
;
 if (true) break;

case 62:
//C
this.state = 63;
 //BA.debugLineNum = 640;BA.debugLine="Dim img As B4XBitmap = imagedata.Get(\"image\")";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_imagedata.Get((Object)("image"))));
 if (true) break;
;
 //BA.debugLineNum = 643;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is Label Then";

case 63:
//if
this.state = 66;
if (_i.GetView((int) (_i.getNumberOfViews()-1)).getObjectOrNull() instanceof android.widget.TextView) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 //BA.debugLineNum = 644;BA.debugLine="Dim l As Label = i.GetView(i.NumberOfViews-1)";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_i.GetView((int) (_i.getNumberOfViews()-1)).getObject()));
 //BA.debugLineNum = 646;BA.debugLine="l.RemoveView";
_l.RemoveView();
 if (true) break;
;
 //BA.debugLineNum = 652;BA.debugLine="If img.IsInitialized Then";

case 66:
//if
this.state = 82;
if (_img.IsInitialized()) { 
this.state = 68;
}else {
this.state = 81;
}if (true) break;

case 68:
//C
this.state = 69;
 //BA.debugLineNum = 656;BA.debugLine="Dim JOo As JavaObject=i.GetView(0)";
_joo = new anywheresoftware.b4j.object.JavaObject();
_joo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_i.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 657;BA.debugLine="JOo.RunMethod(\"setImageBitmap\",Array(img))";
_joo.RunMethod("setImageBitmap",new Object[]{(Object)(_img.getObject())});
 //BA.debugLineNum = 658;BA.debugLine="Select scale";
if (true) break;

case 69:
//select
this.state = 76;
switch (BA.switchObjectToInt(parent._scale,"FILL","FIT","STRETCH")) {
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
 //BA.debugLineNum = 659;BA.debugLine="Case \"FILL\": JOo.RunMethod(\"setScaleType\",Arra";
_joo.RunMethod("setScaleType",new Object[]{(Object)("CENTER_CROP")});
 if (true) break;

case 73:
//C
this.state = 76;
 //BA.debugLineNum = 660;BA.debugLine="Case \"FIT\": JOo.RunMethod(\"setScaleType\",Array";
_joo.RunMethod("setScaleType",new Object[]{(Object)("CENTER_INSIDE")});
 if (true) break;

case 75:
//C
this.state = 76;
 //BA.debugLineNum = 661;BA.debugLine="Case \"STRETCH\": JOo.RunMethod(\"setScaleType\",A";
_joo.RunMethod("setScaleType",new Object[]{(Object)("FIT_XY")});
 if (true) break;
;
 //BA.debugLineNum = 674;BA.debugLine="If CoverFreeSpace Then";

case 76:
//if
this.state = 79;
if (parent._coverfreespace) { 
this.state = 78;
}if (true) break;

case 78:
//C
this.state = 79;
 //BA.debugLineNum = 676;BA.debugLine="Dim bo As JavaObject=Me";
_bo = new anywheresoftware.b4j.object.JavaObject();
_bo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(parent));
 //BA.debugLineNum = 677;BA.debugLine="Dim jc As JavaObject";
_jc = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 678;BA.debugLine="jc.InitializeContext";
_jc.InitializeContext(ba);
 //BA.debugLineNum = 679;BA.debugLine="img = bo.RunMethod(\"blur\",Array(jc,img))";
_img = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bo.RunMethod("blur",new Object[]{(Object)(_jc.getObject()),(Object)(_img.getObject())})));
 //BA.debugLineNum = 680;BA.debugLine="i.SetBitmap(img.Resize(Imgcont.Width,Imgcont.H";
_i.SetBitmap((android.graphics.Bitmap)(_img.Resize(parent._imgcont.getWidth(),parent._imgcont.getHeight(),parent.__c.False).getObject()));
 if (true) break;

case 79:
//C
this.state = 82;
;
 if (true) break;

case 81:
//C
this.state = 82;
 //BA.debugLineNum = 688;BA.debugLine="Dim tp As Label";
_tp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 689;BA.debugLine="tp.Initialize(\"trypanel\")";
_tp.Initialize(ba,"trypanel");
 //BA.debugLineNum = 690;BA.debugLine="i.AddView(tp,0,0,Imgcont.Width,Imgcont.Height)";
_i.AddView((android.view.View)(_tp.getObject()),(int) (0),(int) (0),parent._imgcont.getWidth(),parent._imgcont.getHeight());
 //BA.debugLineNum = 691;BA.debugLine="tp.Text = \"Couldn't load the image. Tap to retr";
_tp.setText(BA.ObjectToCharSequence("Couldn't load the image. Tap to retry."));
 //BA.debugLineNum = 692;BA.debugLine="tp.Color = Colors.White";
_tp.setColor(parent.__c.Colors.White);
 //BA.debugLineNum = 693;BA.debugLine="tp.TextColor = Colors.Black";
_tp.setTextColor(parent.__c.Colors.Black);
 //BA.debugLineNum = 695;BA.debugLine="tp.Gravity = Gravity.CENTER_HORIZONTAL+Gravity";
_tp.setGravity((int) (parent.__c.Gravity.CENTER_HORIZONTAL+parent.__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 696;BA.debugLine="tp.TextSize = 15";
_tp.setTextSize((float) (15));
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
 //BA.debugLineNum = 703;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example2.httpjob _j) throws Exception{
}
public String  _shownext() throws Exception{
 //BA.debugLineNum = 953;BA.debugLine="Public Sub ShowNext";
 //BA.debugLineNum = 954;BA.debugLine="If CurrentIndex < ImgList.Size-1 Then";
if (_currentindex<_imglist.getSize()-1) { 
 //BA.debugLineNum = 955;BA.debugLine="SlideImage(CurrentIndex + 1)";
_slideimage((int) (_currentindex+1));
 };
 //BA.debugLineNum = 957;BA.debugLine="End Sub";
return "";
}
public String  _showprev() throws Exception{
 //BA.debugLineNum = 960;BA.debugLine="Public Sub ShowPrev";
 //BA.debugLineNum = 961;BA.debugLine="If CurrentIndex > 0 Then";
if (_currentindex>0) { 
 //BA.debugLineNum = 962;BA.debugLine="SlideImage(CurrentIndex - 1)";
_slideimage((int) (_currentindex-1));
 };
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
return "";
}
public String  _slideimage(int _centerindex) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Private Sub SlideImage(centerIndex As Int)";
 //BA.debugLineNum = 357;BA.debugLine="Imgcont.GotoPage(centerIndex,True)";
_imgcont.GotoPage(_centerindex,__c.True);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return "";
}
public String  _stoppropagation(boolean _enable) throws Exception{
anywheresoftware.b4j.object.JavaObject _j = null;
 //BA.debugLineNum = 328;BA.debugLine="Private Sub StopPropagation(Enable As Boolean)";
 //BA.debugLineNum = 329;BA.debugLine="Private j As JavaObject = GesturePanel";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_gesturepanel.getObject()));
 //BA.debugLineNum = 330;BA.debugLine="j.RunMethod(\"requestDisallowInterceptTouchEvent\",";
_j.RunMethod("requestDisallowInterceptTouchEvent",new Object[]{(Object)(_enable)});
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public String  _togglemute() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
 //BA.debugLineNum = 1013;BA.debugLine="Public Sub ToggleMute";
 //BA.debugLineNum = 1014;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 1015;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 1016;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
 //BA.debugLineNum = 1018;BA.debugLine="Dim v As SimpleExoPlayer = imagedata.Get(\"player";
_v = (anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(_imagedata.Get((Object)("player")));
 //BA.debugLineNum = 1019;BA.debugLine="If v.Volume = 0 Then";
if (_v.getVolume()==0) { 
 //BA.debugLineNum = 1020;BA.debugLine="v.Volume = 1";
_v.setVolume((float) (1));
 //BA.debugLineNum = 1021;BA.debugLine="i.GetView(1).GetView(0).Text = Chr(0xE050)";
_i.GetView((int) (1)).GetView((int) (0)).setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe050))));
 }else {
 //BA.debugLineNum = 1023;BA.debugLine="v.Volume = 0";
_v.setVolume((float) (0));
 //BA.debugLineNum = 1024;BA.debugLine="i.GetView(1).GetView(0).Text = Chr(0xE04F)";
_i.GetView((int) (1)).GetView((int) (0)).setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe04f))));
 };
 };
 //BA.debugLineNum = 1039;BA.debugLine="End Sub";
return "";
}
public String  _trypanel_click() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 //BA.debugLineNum = 705;BA.debugLine="Private Sub trypanel_Click";
 //BA.debugLineNum = 706;BA.debugLine="Dim l As Label = Sender";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 708;BA.debugLine="l.RemoveView";
_l.RemoveView();
 //BA.debugLineNum = 712;BA.debugLine="ShowImage";
_showimage();
 //BA.debugLineNum = 713;BA.debugLine="End Sub";
return "";
}
public String  _updatedots() throws Exception{
int _shift = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _dot = null;
anywheresoftware.b4a.objects.B4XViewWrapper _dotcir = null;
 //BA.debugLineNum = 419;BA.debugLine="Private Sub UpdateDots";
 //BA.debugLineNum = 420;BA.debugLine="Private shift As Int = dotSize+dotgap";
_shift = (int) (_dotsize+_dotgap);
 //BA.debugLineNum = 421;BA.debugLine="If (CurrentIndex = 5 Or CurrentIndex = dotCont.Nu";
if ((_currentindex==5 || _currentindex==_dotcont.getNumberOfViews()-1 || _currentindex==_dotcont.getNumberOfViews()-6) && (_dotcont.GetView(_currentindex).getTag()).equals((Object)("s"))) { 
 };
 //BA.debugLineNum = 424;BA.debugLine="For i=0 To dotCont.NumberOfViews-1";
{
final int step4 = 1;
final int limit4 = (int) (_dotcont.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 425;BA.debugLine="Private dot As B4XView = dotCont.GetView(i)";
_dot = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dot = _dotcont.GetView(_i);
 //BA.debugLineNum = 426;BA.debugLine="Private dotCir As B4XView = dot.getview(0)";
_dotcir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dotcir = _dot.GetView((int) (0));
 //BA.debugLineNum = 427;BA.debugLine="dotCir.SetColorAndBorder(dotColor,0,xui.Color_Tr";
_dotcir.SetColorAndBorder(_dotcolor,(int) (0),_xui.Color_Transparent,_dotsize);
 //BA.debugLineNum = 429;BA.debugLine="If CurrentIndex > PrevIndex Then";
if (_currentindex>_previndex) { 
 //BA.debugLineNum = 430;BA.debugLine="If dotCont.GetView(CurrentIndex).Tag = \"s\" Then";
if ((_dotcont.GetView(_currentindex).getTag()).equals((Object)("s"))) { 
 //BA.debugLineNum = 432;BA.debugLine="If i = CurrentIndex Then";
if (_i==_currentindex) { 
 //BA.debugLineNum = 433;BA.debugLine="SetActive(dot)";
_setactive(_dot);
 }else if(_i==_currentindex-5 || _i==_currentindex+1) { 
 //BA.debugLineNum = 435;BA.debugLine="SetSmall(dot)";
_setsmall(_dot);
 }else if(_i<_currentindex-5 || _i>_currentindex+1) { 
 //BA.debugLineNum = 437;BA.debugLine="SetHidden(dot)";
_sethidden(_dot);
 }else {
 //BA.debugLineNum = 439;BA.debugLine="SetDefault(dot)";
_setdefault(_dot);
 };
 //BA.debugLineNum = 441;BA.debugLine="dot.SetLayoutAnimated(dotTransitionDuration,do";
_dot.SetLayoutAnimated(_dottransitionduration,(int) (_dot.getLeft()-_shift),_dot.getTop(),_dotsize,_dotsize);
 }else {
 //BA.debugLineNum = 443;BA.debugLine="If i = CurrentIndex Then";
if (_i==_currentindex) { 
 //BA.debugLineNum = 444;BA.debugLine="SetActive(dot)";
_setactive(_dot);
 }else if((_dot.getTag()).equals((Object)("b"))) { 
 //BA.debugLineNum = 446;BA.debugLine="SetDefault(dot)";
_setdefault(_dot);
 };
 };
 }else if(_currentindex<_previndex) { 
 //BA.debugLineNum = 450;BA.debugLine="If dotCont.GetView(CurrentIndex).tag = \"s\" Then";
if ((_dotcont.GetView(_currentindex).getTag()).equals((Object)("s"))) { 
 //BA.debugLineNum = 451;BA.debugLine="If i = CurrentIndex Then";
if (_i==_currentindex) { 
 //BA.debugLineNum = 452;BA.debugLine="SetActive(dot)";
_setactive(_dot);
 }else if(_i==_currentindex-1 || _i==_currentindex+5) { 
 //BA.debugLineNum = 454;BA.debugLine="SetSmall(dot)";
_setsmall(_dot);
 }else if(_i<_currentindex-1 || _i>_currentindex+5) { 
 //BA.debugLineNum = 456;BA.debugLine="SetHidden(dot)";
_sethidden(_dot);
 }else {
 //BA.debugLineNum = 458;BA.debugLine="SetDefault(dot)";
_setdefault(_dot);
 };
 //BA.debugLineNum = 460;BA.debugLine="dot.SetLayoutAnimated(dotTransitionDuration,do";
_dot.SetLayoutAnimated(_dottransitionduration,(int) (_dot.getLeft()+_shift),_dot.getTop(),_dotsize,_dotsize);
 }else {
 //BA.debugLineNum = 462;BA.debugLine="If i = CurrentIndex Then";
if (_i==_currentindex) { 
 //BA.debugLineNum = 463;BA.debugLine="SetActive(dot)";
_setactive(_dot);
 }else if((_dot.getTag()).equals((Object)("b"))) { 
 //BA.debugLineNum = 465;BA.debugLine="SetDefault(dot)";
_setdefault(_dot);
 };
 };
 };
 }
};
 //BA.debugLineNum = 471;BA.debugLine="dotCont.GetView(CurrentIndex).Tag = \"b\"";
_dotcont.GetView(_currentindex).setTag((Object)("b"));
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return "";
}
public String  _updateplayback() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper _vv = null;
int[] _location = null;
 //BA.debugLineNum = 1044;BA.debugLine="Public Sub UpdatePlayback";
 //BA.debugLineNum = 1045;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 1046;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 1047;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
 //BA.debugLineNum = 1049;BA.debugLine="Dim vv As SimpleExoPlayerView = i.getview(0)";
_vv = new anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper();
_vv = (anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper(), (com.google.android.exoplayer2.ui.PlayerView)(_i.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 1050;BA.debugLine="If vv.Tag Then";
if (BA.ObjectToBoolean(_vv.getTag())) { 
 //BA.debugLineNum = 1055;BA.debugLine="Private location(2) As Int";
_location = new int[(int) (2)];
;
 //BA.debugLineNum = 1056;BA.debugLine="JO.RunMethod(\"getLocationInWindow\",Array As Obj";
_jo.RunMethod("getLocationInWindow",new Object[]{(Object)(_location)});
 //BA.debugLineNum = 1061;BA.debugLine="If (location(1) - ZoomWindowFix) < 0 Or  (locat";
if ((_location[(int) (1)]-_zoomwindowfix)<0 || (_location[(int) (1)]-_zoomwindowfix+_mbase.getHeight())>__c.GetDeviceLayoutValues(ba).Height) { 
 //BA.debugLineNum = 1062;BA.debugLine="PauseCurrentVideo";
_pausecurrentvideo();
 }else if((_location[(int) (1)]-_zoomwindowfix)>0 || (_location[(int) (1)]-_zoomwindowfix+_mbase.getHeight())<__c.GetDeviceLayoutValues(ba).Height) { 
 //BA.debugLineNum = 1064;BA.debugLine="PlayCurrentVideo";
_playcurrentvideo();
 };
 };
 };
 //BA.debugLineNum = 1069;BA.debugLine="End Sub";
return "";
}
public String  _vplayer_error(String _message) throws Exception{
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
int _index = 0;
anywheresoftware.b4a.objects.collections.Map _player = null;
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.LabelWrapper _tp = null;
 //BA.debugLineNum = 716;BA.debugLine="Private Sub vplayer_Error (Message As String)";
 //BA.debugLineNum = 717;BA.debugLine="Dim v As SimpleExoPlayer=Sender";
_v = (anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(__c.Sender(ba));
 //BA.debugLineNum = 718;BA.debugLine="Dim index As Int=-1";
_index = (int) (-1);
 //BA.debugLineNum = 719;BA.debugLine="For Each player As Map In videoplayer";
_player = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _videoplayer;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_player = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group3.Get(index3)));
 //BA.debugLineNum = 720;BA.debugLine="If v = player.Get(\"player\") Then index = player.";
if ((_v).equals((anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(_player.Get((Object)("player"))))) { 
_index = (int)(BA.ObjectToNumber(_player.Get((Object)("id"))));};
 }
};
 //BA.debugLineNum = 722;BA.debugLine="If index > -1 Then";
if (_index>-1) { 
 //BA.debugLineNum = 723;BA.debugLine="Dim i As B4XView = ImgList.Get(index)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_index)));
 //BA.debugLineNum = 724;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
 //BA.debugLineNum = 726;BA.debugLine="imagedata.Remove(\"player\")";
_imagedata.Remove((Object)("player"));
 //BA.debugLineNum = 727;BA.debugLine="i.Tag = imagedata";
_i.setTag((Object)(_imagedata.getObject()));
 //BA.debugLineNum = 728;BA.debugLine="v.Release";
_v.Release();
 //BA.debugLineNum = 730;BA.debugLine="Log(Message)";
__c.LogImpl("916973838",_message,0);
 //BA.debugLineNum = 732;BA.debugLine="Dim tp As Label";
_tp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 733;BA.debugLine="tp.Initialize(\"trypanel\")";
_tp.Initialize(ba,"trypanel");
 //BA.debugLineNum = 734;BA.debugLine="i.AddView(tp,0,0,Imgcont.Width,Imgcont.Height)";
_i.AddView((android.view.View)(_tp.getObject()),(int) (0),(int) (0),_imgcont.getWidth(),_imgcont.getHeight());
 //BA.debugLineNum = 735;BA.debugLine="tp.Text = \"Couldn't load the video. Tap to retry";
_tp.setText(BA.ObjectToCharSequence("Couldn't load the video. Tap to retry."));
 //BA.debugLineNum = 736;BA.debugLine="tp.Color = Colors.White";
_tp.setColor(__c.Colors.White);
 //BA.debugLineNum = 737;BA.debugLine="tp.TextColor = Colors.Black";
_tp.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 738;BA.debugLine="tp.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.C";
_tp.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 739;BA.debugLine="tp.TextSize = 15";
_tp.setTextSize((float) (15));
 };
 //BA.debugLineNum = 742;BA.debugLine="End Sub";
return "";
}
public String  _vplayer_ready() throws Exception{
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
int _index = 0;
anywheresoftware.b4a.objects.collections.Map _player = null;
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.ProgressBarWrapper _p = null;
 //BA.debugLineNum = 744;BA.debugLine="Private Sub vplayer_Ready";
 //BA.debugLineNum = 745;BA.debugLine="Dim v As SimpleExoPlayer=Sender";
_v = (anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(__c.Sender(ba));
 //BA.debugLineNum = 746;BA.debugLine="Dim index As Int=-1";
_index = (int) (-1);
 //BA.debugLineNum = 747;BA.debugLine="For Each player As Map In videoplayer";
_player = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _videoplayer;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_player = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group3.Get(index3)));
 //BA.debugLineNum = 748;BA.debugLine="If v = player.Get(\"player\") Then index = player.";
if ((_v).equals((anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(_player.Get((Object)("player"))))) { 
_index = (int)(BA.ObjectToNumber(_player.Get((Object)("id"))));};
 }
};
 //BA.debugLineNum = 750;BA.debugLine="If index > -1 Then";
if (_index>-1) { 
 //BA.debugLineNum = 751;BA.debugLine="Dim i As B4XView = ImgList.Get(index)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_index)));
 //BA.debugLineNum = 752;BA.debugLine="i.GetView(2).Visible=True";
_i.GetView((int) (2)).setVisible(__c.True);
 //BA.debugLineNum = 753;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is ProgressBar T";
if (_i.GetView((int) (_i.getNumberOfViews()-1)).getObjectOrNull() instanceof android.widget.ProgressBar) { 
 //BA.debugLineNum = 754;BA.debugLine="Dim p As ProgressBar = i.GetView(i.NumberOfView";
_p = new anywheresoftware.b4a.objects.ProgressBarWrapper();
_p = (anywheresoftware.b4a.objects.ProgressBarWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ProgressBarWrapper(), (android.widget.ProgressBar)(_i.GetView((int) (_i.getNumberOfViews()-1)).getObject()));
 //BA.debugLineNum = 755;BA.debugLine="p.RemoveView";
_p.RemoveView();
 };
 };
 //BA.debugLineNum = 758;BA.debugLine="UpdatePlayback";
_updateplayback();
 //BA.debugLineNum = 759;BA.debugLine="End Sub";
return "";
}
public String  _zoomfix() throws Exception{
anywheresoftware.b4j.object.JavaObject _j = null;
 //BA.debugLineNum = 138;BA.debugLine="Private Sub zoomfix";
 //BA.debugLineNum = 140;BA.debugLine="Dim j As JavaObject";
_j = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 141;BA.debugLine="j.InitializeContext";
_j.InitializeContext(ba);
 //BA.debugLineNum = 142;BA.debugLine="If actHasActionBar Then";
if (_acthasactionbar) { 
 //BA.debugLineNum = 143;BA.debugLine="ZoomWindowFix = j.RunMethodJO(\"getActionBar\",Nul";
_zoomwindowfix = (double)(BA.ObjectToNumber(_j.RunMethodJO("getActionBar",(Object[])(__c.Null)).RunMethod("getHeight",(Object[])(__c.Null))));
 }else {
 //BA.debugLineNum = 145;BA.debugLine="ZoomWindowFix=0";
_zoomwindowfix = 0;
 };
 //BA.debugLineNum = 147;BA.debugLine="ZoomWindowFix = ZoomWindowFix + j.RunMethodJO(\"ge";
_zoomwindowfix = _zoomwindowfix+(double)(BA.ObjectToNumber(_j.RunMethodJO("getResources",(Object[])(__c.Null)).RunMethod("getDimensionPixelSize",new Object[]{_j.RunMethodJO("getResources",(Object[])(__c.Null)).RunMethod("getIdentifier",new Object[]{(Object)("status_bar_height"),(Object)("dimen"),(Object)("android")})})));
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _zoomimage(float _distance,Object _motionevent) throws Exception{
int _centerx = 0;
int _centery = 0;
int[] _location = null;
anywheresoftware.b4a.objects.B4XViewWrapper _actualview = null;
int _newwidth = 0;
int _newheight = 0;
 //BA.debugLineNum = 335;BA.debugLine="Private Sub ZoomImage(Distance As Float, MotionEve";
 //BA.debugLineNum = 336;BA.debugLine="Private centerX As Int = Min(GD.getX(MotionEvent,";
_centerx = (int) (__c.Min(_gd.getX((android.view.MotionEvent)(_motionevent),(int) (1)),_gd.getX((android.view.MotionEvent)(_motionevent),(int) (0)))+__c.Abs(_gd.getX((android.view.MotionEvent)(_motionevent),(int) (0))-_gd.getX((android.view.MotionEvent)(_motionevent),(int) (1)))/(double)2);
 //BA.debugLineNum = 337;BA.debugLine="Private centerY As Int = Min(GD.getY(MotionEvent,";
_centery = (int) (__c.Min(_gd.getY((android.view.MotionEvent)(_motionevent),(int) (1)),_gd.getY((android.view.MotionEvent)(_motionevent),(int) (0)))+__c.Abs(_gd.getY((android.view.MotionEvent)(_motionevent),(int) (0))-_gd.getY((android.view.MotionEvent)(_motionevent),(int) (1)))/(double)2);
 //BA.debugLineNum = 338;BA.debugLine="Private location(2) As Int";
_location = new int[(int) (2)];
;
 //BA.debugLineNum = 339;BA.debugLine="JO.RunMethod(\"getLocationInWindow\",Array As Objec";
_jo.RunMethod("getLocationInWindow",new Object[]{(Object)(_location)});
 //BA.debugLineNum = 340;BA.debugLine="Private actualView As B4XView = ImgList.Get(Curre";
_actualview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_actualview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imglist.Get(_currentindex)));
 //BA.debugLineNum = 347;BA.debugLine="If ZoomActualSlide Then actualView.Visible = Fals";
if (_zoomactualslide) { 
_actualview.setVisible(__c.False);};
 //BA.debugLineNum = 348;BA.debugLine="Private newWidth As Int = Max(actualView.Width,(D";
_newwidth = (int) (__c.Max(_actualview.getWidth(),(_distance/(double)_pinchstartdistance)*_actualview.getWidth()));
 //BA.debugLineNum = 349;BA.debugLine="Private newHeight As Int = Max(actualView.Height,";
_newheight = (int) (__c.Max(_actualview.getHeight(),(_distance/(double)_pinchstartdistance)*_actualview.getHeight()));
 //BA.debugLineNum = 350;BA.debugLine="ZoomPanel.GetView(0).SetLayoutAnimated(10,(center";
_zoompanel.GetView((int) (0)).SetLayoutAnimated((int) (10),(int) ((_centerx+_location[(int) (0)])-(_newwidth/(double)2)+(_pinchfixx*(_distance/(double)_pinchstartdistance))),(int) ((_centery+_location[(int) (1)])-(_newheight/(double)2)+(_pinchfixy*(_distance/(double)_pinchstartdistance))-_zoomwindowfix),_newwidth,_newheight);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}

public static Bitmap blur(Context context, Bitmap image) {
    int width = Math.round(image.getWidth() * 0.4f);
    int height = Math.round(image.getHeight() * 0.4f);

    Bitmap inputBitmap = Bitmap.createScaledBitmap(image, width, height,
        false);
    Bitmap outputBitmap = Bitmap.createBitmap(inputBitmap);

    RenderScript rs = RenderScript.create(context);
    ScriptIntrinsicBlur theIntrinsic = ScriptIntrinsicBlur.create(rs,
        Element.U8_4(rs));
    Allocation tmpIn = Allocation.createFromBitmap(rs, inputBitmap);
    Allocation tmpOut = Allocation.createFromBitmap(rs, outputBitmap);
    theIntrinsic.setRadius(7.5f);
    theIntrinsic.setInput(tmpIn);
    theIntrinsic.forEach(tmpOut);
    tmpOut.copyTo(outputBitmap);

    return outputBitmap;
}
}
