
package b4a.example2;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class ximagesliderig {
    public static RemoteObject myClass;
	public ximagesliderig() {
	}
    public static PCBA staticBA = new PCBA(null, ximagesliderig.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _imgcont = RemoteObject.declareNull("de.amberhome.viewpager.AHViewPager");
public static RemoteObject _imglayout = RemoteObject.declareNull("de.amberhome.viewpager.AHPageContainer");
public static RemoteObject _gesturepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imgcount = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imglist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _currentindex = RemoteObject.createImmutable(0);
public static RemoteObject _previndex = RemoteObject.createImmutable(0);
public static RemoteObject _dottransitionduration = RemoteObject.createImmutable(0);
public static RemoteObject _dotcont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dotcolor = RemoteObject.createImmutable(0);
public static RemoteObject _activedotcolor = RemoteObject.createImmutable(0);
public static RemoteObject _dotsize = RemoteObject.createImmutable(0);
public static RemoteObject _dotsizem = RemoteObject.createImmutable(0);
public static RemoteObject _dotsizes = RemoteObject.createImmutable(0);
public static RemoteObject _dotgap = RemoteObject.createImmutable(0);
public static RemoteObject _showdots = RemoteObject.createImmutable("");
public static RemoteObject _scale = RemoteObject.createImmutable("");
public static RemoteObject _imagecount = RemoteObject.createImmutable(false);
public static RemoteObject _coverfreespace = RemoteObject.createImmutable(false);
public static RemoteObject _zoomactualslide = RemoteObject.createImmutable(false);
public static RemoteObject _autoplayvideo = RemoteObject.createImmutable(false);
public static RemoteObject _startvideomuted = RemoteObject.createImmutable(false);
public static RemoteObject _freespacecolor = RemoteObject.createImmutable(0);
public static RemoteObject _acthasactionbar = RemoteObject.createImmutable(false);
public static RemoteObject _lbltimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _videoplayer = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _gd = RemoteObject.declareNull("flm.b4a.gesturedetector.GestureDetectorForB4A");
public static RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _zoomcontainer = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _zoompanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pinchstartdistance = RemoteObject.createImmutable(0);
public static RemoteObject _pinchfixx = RemoteObject.createImmutable(0);
public static RemoteObject _pinchfixy = RemoteObject.createImmutable(0);
public static RemoteObject _zoomwindowfix = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example2.main _main = null;
public static b4a.example2.starter _starter = null;
public static b4a.example2.b4xpages _b4xpages = null;
public static b4a.example2.b4xcollections _b4xcollections = null;
public static b4a.example2.httputils2service _httputils2service = null;
public static b4a.example2.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"actHasActionBar",_ref.getField(false, "_acthasactionbar"),"activeDotColor",_ref.getField(false, "_activedotcolor"),"AutoPlayVideo",_ref.getField(false, "_autoplayvideo"),"CoverFreeSpace",_ref.getField(false, "_coverfreespace"),"CurrentIndex",_ref.getField(false, "_currentindex"),"DateUtils",_ref.getField(false, "_dateutils"),"dotColor",_ref.getField(false, "_dotcolor"),"dotCont",_ref.getField(false, "_dotcont"),"dotgap",_ref.getField(false, "_dotgap"),"dotSize",_ref.getField(false, "_dotsize"),"dotSizeM",_ref.getField(false, "_dotsizem"),"dotSizeS",_ref.getField(false, "_dotsizes"),"dotTransitionDuration",_ref.getField(false, "_dottransitionduration"),"FreeSpaceColor",_ref.getField(false, "_freespacecolor"),"GD",_ref.getField(false, "_gd"),"GesturePanel",_ref.getField(false, "_gesturepanel"),"ImageCount",_ref.getField(false, "_imagecount"),"Imgcont",_ref.getField(false, "_imgcont"),"ImgCount",_ref.getField(false, "_imgcount"),"imgLayout",_ref.getField(false, "_imglayout"),"ImgList",_ref.getField(false, "_imglist"),"JO",_ref.getField(false, "_jo"),"LblTimer",_ref.getField(false, "_lbltimer"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"PinchFixX",_ref.getField(false, "_pinchfixx"),"PinchFixY",_ref.getField(false, "_pinchfixy"),"PinchStartDistance",_ref.getField(false, "_pinchstartdistance"),"PrevIndex",_ref.getField(false, "_previndex"),"scale",_ref.getField(false, "_scale"),"ShowDots",_ref.getField(false, "_showdots"),"StartVideoMuted",_ref.getField(false, "_startvideomuted"),"videoplayer",_ref.getField(false, "_videoplayer"),"xui",_ref.getField(false, "_xui"),"ZoomActualSlide",_ref.getField(false, "_zoomactualslide"),"ZoomContainer",_ref.getField(false, "_zoomcontainer"),"ZoomPanel",_ref.getField(false, "_zoompanel"),"ZoomWindowFix",_ref.getField(false, "_zoomwindowfix")};
}
}