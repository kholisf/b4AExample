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
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example2.ximagesliderig");
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
public String  _setactivityhasactionbar(b4a.example2.ximagesliderig __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "setactivityhasactionbar", true))
	 {return ((String) Debug.delegate(ba, "setactivityhasactionbar", new Object[] {_value}));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub setActivityHasActionBar(value As Boolea";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="actHasActionBar = value";
__ref._acthasactionbar /*boolean*/  = _value;
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="zoomfix";
__ref._zoomfix /*String*/ (null);
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="End Sub";
return "";
}
public String  _setitems(b4a.example2.ximagesliderig __ref,anywheresoftware.b4a.objects.collections.List _imgs) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((String) Debug.delegate(ba, "setitems", new Object[] {_imgs}));}
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
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub SetItems(imgs As List)";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="videoplayer.Initialize";
__ref._videoplayer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="CurrentIndex = 0";
__ref._currentindex /*int*/  = (int) (0);
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="dotCont.RemoveAllViews";
__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="ImgList.Initialize";
__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=20512774;
 //BA.debugLineNum = 20512774;BA.debugLine="imgLayout.Initialize";
__ref._imglayout /*de.amberhome.viewpager.AHPageContainer*/ .Initialize(ba);
RDebugUtils.currentLine=20512775;
 //BA.debugLineNum = 20512775;BA.debugLine="For Each img As Map In imgs";
_img = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _imgs;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_img = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group6.Get(index6)));
RDebugUtils.currentLine=20512777;
 //BA.debugLineNum = 20512777;BA.debugLine="Private i As B4XView = xui.CreatePanel(\"\")";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=20512779;
 //BA.debugLineNum = 20512779;BA.debugLine="Dim  tempi As Panel = xui.createPanel(\"\")";
_tempi = new anywheresoftware.b4a.objects.PanelWrapper();
_tempi = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=20512780;
 //BA.debugLineNum = 20512780;BA.debugLine="tempi.SetLayoutAnimated(0,0,0,Imgcont.Width,Imgc";
_tempi.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getWidth(),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getHeight());
RDebugUtils.currentLine=20512781;
 //BA.debugLineNum = 20512781;BA.debugLine="tempi.addView(i,0,0,Imgcont.Width,Imgcont.Height";
_tempi.AddView((android.view.View)(_i.getObject()),(int) (0),(int) (0),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getWidth(),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getHeight());
RDebugUtils.currentLine=20512782;
 //BA.debugLineNum = 20512782;BA.debugLine="imgLayout.AddPage(tempi,\"\")";
__ref._imglayout /*de.amberhome.viewpager.AHPageContainer*/ .AddPage((android.view.View)(_tempi.getObject()),"");
RDebugUtils.currentLine=20512796;
 //BA.debugLineNum = 20512796;BA.debugLine="If img.ContainsKey(\"video\") Then";
if (_img.ContainsKey((Object)("video"))) { 
RDebugUtils.currentLine=20512797;
 //BA.debugLineNum = 20512797;BA.debugLine="i.LoadLayout(\"ximageslider_video\")";
_i.LoadLayout("ximageslider_video",ba);
RDebugUtils.currentLine=20512802;
 //BA.debugLineNum = 20512802;BA.debugLine="Dim soundBtn As Panel = xui.CreatePanel(\"sound\"";
_soundbtn = new anywheresoftware.b4a.objects.PanelWrapper();
_soundbtn = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"sound").getObject()));
RDebugUtils.currentLine=20512803;
 //BA.debugLineNum = 20512803;BA.debugLine="i.AddView(soundBtn,0,0,45dip,45dip)";
_i.AddView((android.view.View)(_soundbtn.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (45)));
RDebugUtils.currentLine=20512805;
 //BA.debugLineNum = 20512805;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=20512806;
 //BA.debugLineNum = 20512806;BA.debugLine="l.Initialize(\"\")";
_l.Initialize(ba,"");
RDebugUtils.currentLine=20512807;
 //BA.debugLineNum = 20512807;BA.debugLine="soundBtn.AddView(l,10dip,10dip,25dip,25dip)";
_soundbtn.AddView((android.view.View)(_l.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (25)));
RDebugUtils.currentLine=20512809;
 //BA.debugLineNum = 20512809;BA.debugLine="Dim b4xv As B4XView = l";
_b4xv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l.getObject()));
RDebugUtils.currentLine=20512810;
 //BA.debugLineNum = 20512810;BA.debugLine="b4xv.TextSize=12";
_b4xv.setTextSize((float) (12));
RDebugUtils.currentLine=20512811;
 //BA.debugLineNum = 20512811;BA.debugLine="b4xv.TextColor=Colors.White";
_b4xv.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=20512812;
 //BA.debugLineNum = 20512812;BA.debugLine="b4xv.Font = xui.CreateMaterialIcons(17)";
_b4xv.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (17)));
RDebugUtils.currentLine=20512813;
 //BA.debugLineNum = 20512813;BA.debugLine="b4xv.SetColorAndBorder(xui.Color_ARGB(150,50,50";
_b4xv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (150),(int) (50),(int) (50),(int) (50)),(int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (_b4xv.getHeight()/(double)2));
RDebugUtils.currentLine=20512814;
 //BA.debugLineNum = 20512814;BA.debugLine="b4xv.SetTextAlignment(\"CENTER\",\"CENTER\")";
_b4xv.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=20512816;
 //BA.debugLineNum = 20512816;BA.debugLine="If StartVideoMuted Then";
if (__ref._startvideomuted /*boolean*/ ) { 
RDebugUtils.currentLine=20512817;
 //BA.debugLineNum = 20512817;BA.debugLine="b4xv.Text = Chr(0xE04F)";
_b4xv.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe04f))));
 }else {
RDebugUtils.currentLine=20512819;
 //BA.debugLineNum = 20512819;BA.debugLine="b4xv.Text = Chr(0xE050)";
_b4xv.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe050))));
 };
RDebugUtils.currentLine=20512822;
 //BA.debugLineNum = 20512822;BA.debugLine="Dim pbtn As B4XView=xui.CreatePanel(\"pbtn\")";
_pbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pbtn = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pbtn");
RDebugUtils.currentLine=20512823;
 //BA.debugLineNum = 20512823;BA.debugLine="i.AddView(pbtn,i.Width/2 - 30dip,i.height/2 - 3";
_i.AddView((android.view.View)(_pbtn.getObject()),(int) (_i.getWidth()/(double)2-__c.DipToCurrent((int) (30))),(int) (_i.getHeight()/(double)2-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=20512824;
 //BA.debugLineNum = 20512824;BA.debugLine="pbtn.SetColorAndBorder(Colors.ARGB(150,50,50,50";
_pbtn.SetColorAndBorder(__c.Colors.ARGB((int) (150),(int) (50),(int) (50),(int) (50)),(int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (_pbtn.getHeight()/(double)2));
RDebugUtils.currentLine=20512825;
 //BA.debugLineNum = 20512825;BA.debugLine="Dim pbl As Label";
_pbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=20512826;
 //BA.debugLineNum = 20512826;BA.debugLine="pbl.Initialize(\"\")";
_pbl.Initialize(ba,"");
RDebugUtils.currentLine=20512827;
 //BA.debugLineNum = 20512827;BA.debugLine="Dim b4xv As B4XView = pbl";
_b4xv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pbl.getObject()));
RDebugUtils.currentLine=20512828;
 //BA.debugLineNum = 20512828;BA.debugLine="b4xv.Text=Chr(0xE037)";
_b4xv.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe037))));
RDebugUtils.currentLine=20512829;
 //BA.debugLineNum = 20512829;BA.debugLine="b4xv.font=xui.CreateMaterialIcons(40)";
_b4xv.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (40)));
RDebugUtils.currentLine=20512830;
 //BA.debugLineNum = 20512830;BA.debugLine="b4xv.TextColor=Colors.White";
_b4xv.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=20512831;
 //BA.debugLineNum = 20512831;BA.debugLine="b4xv.Color=Colors.Transparent";
_b4xv.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=20512832;
 //BA.debugLineNum = 20512832;BA.debugLine="b4xv.SetTextAlignment(\"CENTER\",\"CENTER\")";
_b4xv.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=20512834;
 //BA.debugLineNum = 20512834;BA.debugLine="pbtn.AddView(pbl,0,0,pbtn.Width,pbtn.Height)";
_pbtn.AddView((android.view.View)(_pbl.getObject()),(int) (0),(int) (0),_pbtn.getWidth(),_pbtn.getHeight());
RDebugUtils.currentLine=20512835;
 //BA.debugLineNum = 20512835;BA.debugLine="pbtn.Visible=False";
_pbtn.setVisible(__c.False);
 }else {
RDebugUtils.currentLine=20512839;
 //BA.debugLineNum = 20512839;BA.debugLine="Private ii As ImageView:ii.Initialize(\"\")";
_ii = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=20512839;
 //BA.debugLineNum = 20512839;BA.debugLine="Private ii As ImageView:ii.Initialize(\"\")";
_ii.Initialize(ba,"");
RDebugUtils.currentLine=20512849;
 //BA.debugLineNum = 20512849;BA.debugLine="i.AddView(ii,0,0,Imgcont.Width,Imgcont.Height)";
_i.AddView((android.view.View)(_ii.getObject()),(int) (0),(int) (0),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getWidth(),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getHeight());
 };
RDebugUtils.currentLine=20512851;
 //BA.debugLineNum = 20512851;BA.debugLine="i.Color = FreeSpaceColor";
_i.setColor(__ref._freespacecolor /*int*/ );
RDebugUtils.currentLine=20512853;
 //BA.debugLineNum = 20512853;BA.debugLine="i.Tag = img";
_i.setTag((Object)(_img.getObject()));
RDebugUtils.currentLine=20512854;
 //BA.debugLineNum = 20512854;BA.debugLine="ImgList.Add(i)";
__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_i.getObject()));
 }
};
RDebugUtils.currentLine=20512863;
 //BA.debugLineNum = 20512863;BA.debugLine="Imgcont.PageContainer = imgLayout";
__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .setPageContainer(__ref._imglayout /*de.amberhome.viewpager.AHPageContainer*/ );
RDebugUtils.currentLine=20512866;
 //BA.debugLineNum = 20512866;BA.debugLine="If ShowDots <> \"HIDE\" Then";
if ((__ref._showdots /*String*/ ).equals("HIDE") == false) { 
RDebugUtils.currentLine=20512867;
 //BA.debugLineNum = 20512867;BA.debugLine="If imgs.Size > 1 Then";
if (_imgs.getSize()>1) { 
RDebugUtils.currentLine=20512868;
 //BA.debugLineNum = 20512868;BA.debugLine="Private dotStartX As Int = (dotCont.width/2) -";
_dotstartx = (int) ((__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2)-((((__c.Min(6,_imgs.getSize())*__ref._dotsize /*int*/ )+(__c.Min(6,_imgs.getSize())*__ref._dotgap /*int*/ ))-__ref._dotgap /*int*/ )/(double)2));
RDebugUtils.currentLine=20512869;
 //BA.debugLineNum = 20512869;BA.debugLine="For j=0 To imgs.Size-1";
{
final int step56 = 1;
final int limit56 = (int) (_imgs.getSize()-1);
_j = (int) (0) ;
for (;_j <= limit56 ;_j = _j + step56 ) {
RDebugUtils.currentLine=20512870;
 //BA.debugLineNum = 20512870;BA.debugLine="Private p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=20512871;
 //BA.debugLineNum = 20512871;BA.debugLine="Private size As Int = dotSizeM";
_size = __ref._dotsizem /*int*/ ;
RDebugUtils.currentLine=20512872;
 //BA.debugLineNum = 20512872;BA.debugLine="p.Tag = \"b\"";
_p.setTag((Object)("b"));
RDebugUtils.currentLine=20512873;
 //BA.debugLineNum = 20512873;BA.debugLine="If j=5 Then";
if (_j==5) { 
RDebugUtils.currentLine=20512874;
 //BA.debugLineNum = 20512874;BA.debugLine="size = dotSizeS";
_size = __ref._dotsizes /*int*/ ;
RDebugUtils.currentLine=20512875;
 //BA.debugLineNum = 20512875;BA.debugLine="p.Tag = \"s\"";
_p.setTag((Object)("s"));
 }else 
{RDebugUtils.currentLine=20512876;
 //BA.debugLineNum = 20512876;BA.debugLine="else if j > 5 Then";
if (_j>5) { 
RDebugUtils.currentLine=20512877;
 //BA.debugLineNum = 20512877;BA.debugLine="size = 0";
_size = (int) (0);
RDebugUtils.currentLine=20512878;
 //BA.debugLineNum = 20512878;BA.debugLine="p.Tag = \"h\"";
_p.setTag((Object)("h"));
 }}
;
RDebugUtils.currentLine=20512881;
 //BA.debugLineNum = 20512881;BA.debugLine="dotCont.AddView(p,dotStartX + (j*(dotSize+dotg";
__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (_dotstartx+(_j*(__ref._dotsize /*int*/ +__ref._dotgap /*int*/ ))),(int) (((__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)-(__ref._dotsize /*int*/ /(double)2))),__ref._dotsize /*int*/ ,__ref._dotsize /*int*/ );
RDebugUtils.currentLine=20512882;
 //BA.debugLineNum = 20512882;BA.debugLine="Private q As B4XView = xui.CreatePanel(\"\")";
_q = new anywheresoftware.b4a.objects.B4XViewWrapper();
_q = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=20512884;
 //BA.debugLineNum = 20512884;BA.debugLine="If j=0 Then";
if (_j==0) { 
RDebugUtils.currentLine=20512885;
 //BA.debugLineNum = 20512885;BA.debugLine="q.SetColorAndBorder(activeDotColor,0,xui.Colo";
_q.SetColorAndBorder(__ref._activedotcolor /*int*/ ,(int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._dotsize /*int*/ );
RDebugUtils.currentLine=20512886;
 //BA.debugLineNum = 20512886;BA.debugLine="p.AddView(q,0,0,dotSize,dotSize)";
_p.AddView((android.view.View)(_q.getObject()),(int) (0),(int) (0),__ref._dotsize /*int*/ ,__ref._dotsize /*int*/ );
 }else {
RDebugUtils.currentLine=20512888;
 //BA.debugLineNum = 20512888;BA.debugLine="q.SetColorAndBorder(dotColor,0,xui.Color_Tran";
_q.SetColorAndBorder(__ref._dotcolor /*int*/ ,(int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._dotsize /*int*/ );
RDebugUtils.currentLine=20512889;
 //BA.debugLineNum = 20512889;BA.debugLine="p.AddView(q,(dotSize-size)/2,(dotSize-size)/2";
_p.AddView((android.view.View)(_q.getObject()),(int) ((__ref._dotsize /*int*/ -_size)/(double)2),(int) ((__ref._dotsize /*int*/ -_size)/(double)2),_size,_size);
 };
 }
};
 };
 };
RDebugUtils.currentLine=20512895;
 //BA.debugLineNum = 20512895;BA.debugLine="ShowCount";
__ref._showcount /*String*/ (null);
RDebugUtils.currentLine=20512896;
 //BA.debugLineNum = 20512896;BA.debugLine="ShowImage";
__ref._showimage /*void*/ (null);
RDebugUtils.currentLine=20512897;
 //BA.debugLineNum = 20512897;BA.debugLine="End Sub";
return "";
}
public String  _setzoompanel(b4a.example2.ximagesliderig __ref,anywheresoftware.b4a.objects.B4XViewWrapper _zoompanelcontainer) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "setzoompanel", true))
	 {return ((String) Debug.delegate(ba, "setzoompanel", new Object[] {_zoompanelcontainer}));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Public Sub SetZoomPanel(ZoomPanelContainer As B4XV";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="ZoomContainer=ZoomPanelContainer";
__ref._zoomcontainer /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _zoompanelcontainer;
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example2.ximagesliderig __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="private Sub Class_Globals";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=18743306;
 //BA.debugLineNum = 18743306;BA.debugLine="Private Imgcont As AHViewPager";
_imgcont = new de.amberhome.viewpager.AHViewPager();
RDebugUtils.currentLine=18743307;
 //BA.debugLineNum = 18743307;BA.debugLine="Private imgLayout As AHPageContainer";
_imglayout = new de.amberhome.viewpager.AHPageContainer();
RDebugUtils.currentLine=18743308;
 //BA.debugLineNum = 18743308;BA.debugLine="Private GesturePanel As Panel";
_gesturepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18743310;
 //BA.debugLineNum = 18743310;BA.debugLine="Private ImgCount As Label";
_imgcount = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=18743311;
 //BA.debugLineNum = 18743311;BA.debugLine="Private ImgList As List";
_imglist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18743313;
 //BA.debugLineNum = 18743313;BA.debugLine="Public CurrentIndex As Int = 0";
_currentindex = (int) (0);
RDebugUtils.currentLine=18743314;
 //BA.debugLineNum = 18743314;BA.debugLine="Private PrevIndex As Int = 0";
_previndex = (int) (0);
RDebugUtils.currentLine=18743315;
 //BA.debugLineNum = 18743315;BA.debugLine="Private dotTransitionDuration As Int";
_dottransitionduration = 0;
RDebugUtils.currentLine=18743317;
 //BA.debugLineNum = 18743317;BA.debugLine="Private dotCont As B4XView";
_dotcont = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=18743318;
 //BA.debugLineNum = 18743318;BA.debugLine="Private dotColor,activeDotColor As Int";
_dotcolor = 0;
_activedotcolor = 0;
RDebugUtils.currentLine=18743319;
 //BA.debugLineNum = 18743319;BA.debugLine="Private dotSize As Int = 6dip";
_dotsize = __c.DipToCurrent((int) (6));
RDebugUtils.currentLine=18743320;
 //BA.debugLineNum = 18743320;BA.debugLine="Private dotSizeM As Int = 5dip";
_dotsizem = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=18743321;
 //BA.debugLineNum = 18743321;BA.debugLine="Private dotSizeS As Int = 3dip";
_dotsizes = __c.DipToCurrent((int) (3));
RDebugUtils.currentLine=18743322;
 //BA.debugLineNum = 18743322;BA.debugLine="Private dotgap As Int = dotSize";
_dotgap = __ref._dotsize /*int*/ ;
RDebugUtils.currentLine=18743323;
 //BA.debugLineNum = 18743323;BA.debugLine="Private ShowDots,scale As String";
_showdots = "";
_scale = "";
RDebugUtils.currentLine=18743324;
 //BA.debugLineNum = 18743324;BA.debugLine="Private ImageCount,CoverFreeSpace,ZoomActualSlide";
_imagecount = false;
_coverfreespace = false;
_zoomactualslide = false;
_autoplayvideo = false;
_startvideomuted = false;
RDebugUtils.currentLine=18743325;
 //BA.debugLineNum = 18743325;BA.debugLine="Private FreeSpaceColor As Int";
_freespacecolor = 0;
RDebugUtils.currentLine=18743326;
 //BA.debugLineNum = 18743326;BA.debugLine="Private actHasActionBar As Boolean = False";
_acthasactionbar = __c.False;
RDebugUtils.currentLine=18743328;
 //BA.debugLineNum = 18743328;BA.debugLine="Private LblTimer As Timer";
_lbltimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=18743329;
 //BA.debugLineNum = 18743329;BA.debugLine="Private videoplayer As List";
_videoplayer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18743332;
 //BA.debugLineNum = 18743332;BA.debugLine="Private GD As GestureDetector";
_gd = new flm.b4a.gesturedetector.GestureDetectorForB4A();
RDebugUtils.currentLine=18743333;
 //BA.debugLineNum = 18743333;BA.debugLine="Private JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=18743339;
 //BA.debugLineNum = 18743339;BA.debugLine="Private ZoomContainer,ZoomPanel As B4XView";
_zoomcontainer = new anywheresoftware.b4a.objects.B4XViewWrapper();
_zoompanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=18743340;
 //BA.debugLineNum = 18743340;BA.debugLine="Private PinchStartDistance,PinchFixX,PinchFixY,Zo";
_pinchstartdistance = 0;
_pinchfixx = 0;
_pinchfixy = 0;
_zoomwindowfix = 0;
RDebugUtils.currentLine=18743341;
 //BA.debugLineNum = 18743341;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example2.ximagesliderig __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _tempview = null;
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="private Sub DesignerCreateView (Base As Object, Lb";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="ShowDots = Props.Get(\"DotShow\")";
__ref._showdots /*String*/  = BA.ObjectToString(_props.Get((Object)("DotShow")));
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="dotColor = xui.PaintOrColorToColor(Props.Get(\"Dot";
__ref._dotcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("DotColor")));
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="activeDotColor = xui.PaintOrColorToColor(Props.Ge";
__ref._activedotcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ActiveDotColor")));
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="scale = Props.Get(\"ScaleContent\")";
__ref._scale /*String*/  = BA.ObjectToString(_props.Get((Object)("ScaleContent")));
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="ImageCount = Props.Get(\"ImageCount\")";
__ref._imagecount /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ImageCount")));
RDebugUtils.currentLine=18874374;
 //BA.debugLineNum = 18874374;BA.debugLine="CoverFreeSpace = Props.Get(\"CoverFreeSpace\")";
__ref._coverfreespace /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("CoverFreeSpace")));
RDebugUtils.currentLine=18874375;
 //BA.debugLineNum = 18874375;BA.debugLine="FreeSpaceColor = Props.Get(\"FreeSpaceColor\")";
__ref._freespacecolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("FreeSpaceColor"))));
RDebugUtils.currentLine=18874376;
 //BA.debugLineNum = 18874376;BA.debugLine="ZoomActualSlide = Props.Get(\"ZoomActualSlide\")";
__ref._zoomactualslide /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ZoomActualSlide")));
RDebugUtils.currentLine=18874377;
 //BA.debugLineNum = 18874377;BA.debugLine="dotTransitionDuration = Props.Get(\"dotTransitionD";
__ref._dottransitionduration /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("dotTransitionDuration"))));
RDebugUtils.currentLine=18874378;
 //BA.debugLineNum = 18874378;BA.debugLine="AutoPlayVideo = Props.Get(\"AutoPlayVideo\")";
__ref._autoplayvideo /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("AutoPlayVideo")));
RDebugUtils.currentLine=18874379;
 //BA.debugLineNum = 18874379;BA.debugLine="StartVideoMuted = Props.Get(\"StartVideoMuted\")";
__ref._startvideomuted /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("StartVideoMuted")));
RDebugUtils.currentLine=18874381;
 //BA.debugLineNum = 18874381;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=18874382;
 //BA.debugLineNum = 18874382;BA.debugLine="mBase.Color = xui.Color_Transparent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=18874393;
 //BA.debugLineNum = 18874393;BA.debugLine="Imgcont.Initialize(\"ImgCont\")";
__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .Initialize(ba,"ImgCont");
RDebugUtils.currentLine=18874396;
 //BA.debugLineNum = 18874396;BA.debugLine="If ShowDots = \"OUTSIDE\" Then";
if ((__ref._showdots /*String*/ ).equals("OUTSIDE")) { 
RDebugUtils.currentLine=18874397;
 //BA.debugLineNum = 18874397;BA.debugLine="mBase.AddView(Imgcont,0,0,mBase.Width,(mBase.Hei";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (30)))));
 }else {
RDebugUtils.currentLine=18874399;
 //BA.debugLineNum = 18874399;BA.debugLine="mBase.AddView(Imgcont,0,0,mBase.Width,mBase.Heig";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=18874404;
 //BA.debugLineNum = 18874404;BA.debugLine="GesturePanel = xui.CreatePanel(\"\")";
__ref._gesturepanel /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=18874405;
 //BA.debugLineNum = 18874405;BA.debugLine="mBase.addview(GesturePanel,0,0,mBase.Width,Imgcon";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._gesturepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getHeight());
RDebugUtils.currentLine=18874406;
 //BA.debugLineNum = 18874406;BA.debugLine="GD.SetOnGestureListener(GesturePanel,\"ImgCont_GD\"";
__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .SetOnGestureListener(ba,(android.view.View)(__ref._gesturepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),"ImgCont_GD");
RDebugUtils.currentLine=18874408;
 //BA.debugLineNum = 18874408;BA.debugLine="JO = mBase";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=18874410;
 //BA.debugLineNum = 18874410;BA.debugLine="zoomfix";
__ref._zoomfix /*String*/ (null);
RDebugUtils.currentLine=18874411;
 //BA.debugLineNum = 18874411;BA.debugLine="mBase.AddView(xui.CreatePanel(\"\"),(mBase.Width -";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()),(int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (10)))+__c.DipToCurrent((int) (1))),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (25)));
RDebugUtils.currentLine=18874412;
 //BA.debugLineNum = 18874412;BA.debugLine="mBase.GetView(mBase.NumberOfViews-1).AddView(ImgC";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1)).AddView((android.view.View)(__ref._imgcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (25)));
RDebugUtils.currentLine=18874413;
 //BA.debugLineNum = 18874413;BA.debugLine="Private tempView As B4XView = ImgCount";
_tempview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tempview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imgcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=18874414;
 //BA.debugLineNum = 18874414;BA.debugLine="tempView.TextColor = xui.Color_White";
_tempview.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=18874415;
 //BA.debugLineNum = 18874415;BA.debugLine="tempView.TextSize = 12";
_tempview.setTextSize((float) (12));
RDebugUtils.currentLine=18874416;
 //BA.debugLineNum = 18874416;BA.debugLine="tempView.SetTextAlignment(\"CENTER\",\"CENTER\")";
_tempview.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=18874417;
 //BA.debugLineNum = 18874417;BA.debugLine="tempView.Parent.Visible = False";
_tempview.getParent().setVisible(__c.False);
RDebugUtils.currentLine=18874419;
 //BA.debugLineNum = 18874419;BA.debugLine="mBase.AddView(dotCont,0,mBase.Height - 30dip, mBa";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (30))),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=18874421;
 //BA.debugLineNum = 18874421;BA.debugLine="ZoomPanel.Color = xui.Color_ARGB(30,0,0,0)";
__ref._zoompanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (30),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=18874422;
 //BA.debugLineNum = 18874422;BA.debugLine="End Sub";
return "";
}
public String  _zoomfix(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "zoomfix", true))
	 {return ((String) Debug.delegate(ba, "zoomfix", null));}
anywheresoftware.b4j.object.JavaObject _j = null;
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Private Sub zoomfix";
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="Dim j As JavaObject";
_j = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="j.InitializeContext";
_j.InitializeContext(ba);
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="If actHasActionBar Then";
if (__ref._acthasactionbar /*boolean*/ ) { 
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="ZoomWindowFix = j.RunMethodJO(\"getActionBar\",Nul";
__ref._zoomwindowfix /*double*/  = (double)(BA.ObjectToNumber(_j.RunMethodJO("getActionBar",(Object[])(__c.Null)).RunMethod("getHeight",(Object[])(__c.Null))));
 }else {
RDebugUtils.currentLine=18939911;
 //BA.debugLineNum = 18939911;BA.debugLine="ZoomWindowFix=0";
__ref._zoomwindowfix /*double*/  = 0;
 };
RDebugUtils.currentLine=18939913;
 //BA.debugLineNum = 18939913;BA.debugLine="ZoomWindowFix = ZoomWindowFix + j.RunMethodJO(\"ge";
__ref._zoomwindowfix /*double*/  = __ref._zoomwindowfix /*double*/ +(double)(BA.ObjectToNumber(_j.RunMethodJO("getResources",(Object[])(__c.Null)).RunMethod("getDimensionPixelSize",new Object[]{_j.RunMethodJO("getResources",(Object[])(__c.Null)).RunMethod("getIdentifier",new Object[]{(Object)("status_bar_height"),(Object)("dimen"),(Object)("android")})})));
RDebugUtils.currentLine=18939923;
 //BA.debugLineNum = 18939923;BA.debugLine="End Sub";
return "";
}
public String  _imgcont_gd_ondoubletap(b4a.example2.ximagesliderig __ref,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "imgcont_gd_ondoubletap", true))
	 {return ((String) Debug.delegate(ba, "imgcont_gd_ondoubletap", new Object[] {_x,_y,_motionevent}));}
anywheresoftware.b4a.objects.B4XViewWrapper _currentview = null;
anywheresoftware.b4a.objects.collections.Map _tagmap = null;
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Private Sub ImgCont_GD_onDoubleTap(X As Float, Y A";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Double";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DoubleTap",(int) (2))) { 
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="Private currentView As B4XView = ImgList.Get(Cur";
_currentview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_currentview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=19136515;
 //BA.debugLineNum = 19136515;BA.debugLine="Private tagmap As Map = currentView.Tag";
_tagmap = new anywheresoftware.b4a.objects.collections.Map();
_tagmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_currentview.getTag()));
RDebugUtils.currentLine=19136516;
 //BA.debugLineNum = 19136516;BA.debugLine="CallSub3(mCallBack, mEventName & \"_DoubleTap\",Cu";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DoubleTap",(Object)(__ref._currentindex /*int*/ ),_tagmap.Get((Object)("data")));
 };
RDebugUtils.currentLine=19136518;
 //BA.debugLineNum = 19136518;BA.debugLine="End Sub";
return "";
}
public String  _imgcont_gd_onpinchclose(b4a.example2.ximagesliderig __ref,float _newdistance,float _previousdistance,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "imgcont_gd_onpinchclose", true))
	 {return ((String) Debug.delegate(ba, "imgcont_gd_onpinchclose", new Object[] {_newdistance,_previousdistance,_motionevent}));}
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Private Sub ImgCont_GD_onPinchClose(NewDistance As";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="StopPropagation(True)";
__ref._stoppropagation /*String*/ (null,__c.True);
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
if (_imagedata.ContainsKey((Object)("player"))==__c.False) { 
RDebugUtils.currentLine=19267589;
 //BA.debugLineNum = 19267589;BA.debugLine="If ZoomContainer.IsInitialized Then";
if (__ref._zoomcontainer /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=19267590;
 //BA.debugLineNum = 19267590;BA.debugLine="If ZoomPanel.Parent.IsInitialized Then";
if (__ref._zoompanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=19267591;
 //BA.debugLineNum = 19267591;BA.debugLine="ZoomImage(NewDistance,MotionEvent)";
__ref._zoomimage /*String*/ (null,_newdistance,_motionevent);
 };
 };
 };
RDebugUtils.currentLine=19267595;
 //BA.debugLineNum = 19267595;BA.debugLine="End Sub";
return "";
}
public String  _stoppropagation(b4a.example2.ximagesliderig __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "stoppropagation", true))
	 {return ((String) Debug.delegate(ba, "stoppropagation", new Object[] {_enable}));}
anywheresoftware.b4j.object.JavaObject _j = null;
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Private Sub StopPropagation(Enable As Boolean)";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Private j As JavaObject = GesturePanel";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._gesturepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="j.RunMethod(\"requestDisallowInterceptTouchEvent\",";
_j.RunMethod("requestDisallowInterceptTouchEvent",new Object[]{(Object)(_enable)});
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="End Sub";
return "";
}
public String  _zoomimage(b4a.example2.ximagesliderig __ref,float _distance,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "zoomimage", true))
	 {return ((String) Debug.delegate(ba, "zoomimage", new Object[] {_distance,_motionevent}));}
int _centerx = 0;
int _centery = 0;
int[] _location = null;
anywheresoftware.b4a.objects.B4XViewWrapper _actualview = null;
int _newwidth = 0;
int _newheight = 0;
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Private Sub ZoomImage(Distance As Float, MotionEve";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Private centerX As Int = Min(GD.getX(MotionEvent,";
_centerx = (int) (__c.Min(__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getX((android.view.MotionEvent)(_motionevent),(int) (1)),__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getX((android.view.MotionEvent)(_motionevent),(int) (0)))+__c.Abs(__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getX((android.view.MotionEvent)(_motionevent),(int) (0))-__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getX((android.view.MotionEvent)(_motionevent),(int) (1)))/(double)2);
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Private centerY As Int = Min(GD.getY(MotionEvent,";
_centery = (int) (__c.Min(__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getY((android.view.MotionEvent)(_motionevent),(int) (1)),__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getY((android.view.MotionEvent)(_motionevent),(int) (0)))+__c.Abs(__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getY((android.view.MotionEvent)(_motionevent),(int) (0))-__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getY((android.view.MotionEvent)(_motionevent),(int) (1)))/(double)2);
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="Private location(2) As Int";
_location = new int[(int) (2)];
;
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="JO.RunMethod(\"getLocationInWindow\",Array As Objec";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getLocationInWindow",new Object[]{(Object)(_location)});
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="Private actualView As B4XView = ImgList.Get(Curre";
_actualview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_actualview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="If ZoomActualSlide Then actualView.Visible = Fals";
if (__ref._zoomactualslide /*boolean*/ ) { 
_actualview.setVisible(__c.False);};
RDebugUtils.currentLine=19529741;
 //BA.debugLineNum = 19529741;BA.debugLine="Private newWidth As Int = Max(actualView.Width,(D";
_newwidth = (int) (__c.Max(_actualview.getWidth(),(_distance/(double)__ref._pinchstartdistance /*double*/ )*_actualview.getWidth()));
RDebugUtils.currentLine=19529742;
 //BA.debugLineNum = 19529742;BA.debugLine="Private newHeight As Int = Max(actualView.Height,";
_newheight = (int) (__c.Max(_actualview.getHeight(),(_distance/(double)__ref._pinchstartdistance /*double*/ )*_actualview.getHeight()));
RDebugUtils.currentLine=19529743;
 //BA.debugLineNum = 19529743;BA.debugLine="ZoomPanel.GetView(0).SetLayoutAnimated(10,(center";
__ref._zoompanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (10),(int) ((_centerx+_location[(int) (0)])-(_newwidth/(double)2)+(__ref._pinchfixx /*double*/ *(_distance/(double)__ref._pinchstartdistance /*double*/ ))),(int) ((_centery+_location[(int) (1)])-(_newheight/(double)2)+(__ref._pinchfixy /*double*/ *(_distance/(double)__ref._pinchstartdistance /*double*/ ))-__ref._zoomwindowfix /*double*/ ),_newwidth,_newheight);
RDebugUtils.currentLine=19529744;
 //BA.debugLineNum = 19529744;BA.debugLine="End Sub";
return "";
}
public String  _imgcont_gd_onpinchopen(b4a.example2.ximagesliderig __ref,float _newdistance,float _previousdistance,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "imgcont_gd_onpinchopen", true))
	 {return ((String) Debug.delegate(ba, "imgcont_gd_onpinchopen", new Object[] {_newdistance,_previousdistance,_motionevent}));}
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _actualview = null;
int[] _location = null;
anywheresoftware.b4a.objects.PanelWrapper _tempview = null;
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Private Sub ImgCont_GD_onPinchOpen(NewDistance As";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="StopPropagation(True)";
__ref._stoppropagation /*String*/ (null,__c.True);
RDebugUtils.currentLine=19333125;
 //BA.debugLineNum = 19333125;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=19333126;
 //BA.debugLineNum = 19333126;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
if (_imagedata.ContainsKey((Object)("player"))==__c.False) { 
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="If ZoomContainer.IsInitialized Then";
if (__ref._zoomcontainer /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=19333129;
 //BA.debugLineNum = 19333129;BA.debugLine="If Not(ZoomPanel.Parent.IsInitialized) Then";
if (__c.Not(__ref._zoompanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized())) { 
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="ZoomContainer.AddView(ZoomPanel,0,0,ZoomContai";
__ref._zoomcontainer /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._zoompanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._zoomcontainer /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._zoomcontainer /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=19333131;
 //BA.debugLineNum = 19333131;BA.debugLine="Private actualView As B4XView = ImgList.Get(Cu";
_actualview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_actualview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=19333142;
 //BA.debugLineNum = 19333142;BA.debugLine="Private location(2) As Int";
_location = new int[(int) (2)];
;
RDebugUtils.currentLine=19333143;
 //BA.debugLineNum = 19333143;BA.debugLine="JO.RunMethod(\"getLocationInWindow\",Array As Ob";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getLocationInWindow",new Object[]{(Object)(_location)});
RDebugUtils.currentLine=19333144;
 //BA.debugLineNum = 19333144;BA.debugLine="Private tempView As Panel = xui.CreatePanel(\"y";
_tempview = new anywheresoftware.b4a.objects.PanelWrapper();
_tempview = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"yy").getObject()));
RDebugUtils.currentLine=19333145;
 //BA.debugLineNum = 19333145;BA.debugLine="tempView.SetBackgroundImage(actualView.Snapsho";
_tempview.SetBackgroundImageNew((android.graphics.Bitmap)(_actualview.Snapshot().getObject())).setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=19333146;
 //BA.debugLineNum = 19333146;BA.debugLine="PinchFixX = (actualView.Width/2) - (Min(GD.get";
__ref._pinchfixx /*double*/  = (_actualview.getWidth()/(double)2)-(__c.Min(__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getX((android.view.MotionEvent)(_motionevent),(int) (1)),__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getX((android.view.MotionEvent)(_motionevent),(int) (0)))+__c.Abs(__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getX((android.view.MotionEvent)(_motionevent),(int) (0))-__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getX((android.view.MotionEvent)(_motionevent),(int) (1)))/(double)2);
RDebugUtils.currentLine=19333147;
 //BA.debugLineNum = 19333147;BA.debugLine="PinchFixY = (actualView.Height/2) - (Min(GD.ge";
__ref._pinchfixy /*double*/  = (_actualview.getHeight()/(double)2)-(__c.Min(__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getY((android.view.MotionEvent)(_motionevent),(int) (1)),__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getY((android.view.MotionEvent)(_motionevent),(int) (0)))+__c.Abs(__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getY((android.view.MotionEvent)(_motionevent),(int) (0))-__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .getY((android.view.MotionEvent)(_motionevent),(int) (1)))/(double)2);
RDebugUtils.currentLine=19333149;
 //BA.debugLineNum = 19333149;BA.debugLine="ZoomPanel.AddView(tempView,location(0),locatio";
__ref._zoompanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_tempview.getObject()),_location[(int) (0)],(int) (_location[(int) (1)]-__ref._zoomwindowfix /*double*/ ),_actualview.getWidth(),_actualview.getHeight());
RDebugUtils.currentLine=19333150;
 //BA.debugLineNum = 19333150;BA.debugLine="PinchStartDistance = NewDistance";
__ref._pinchstartdistance /*double*/  = _newdistance;
 }else {
RDebugUtils.currentLine=19333153;
 //BA.debugLineNum = 19333153;BA.debugLine="ZoomImage(NewDistance,MotionEvent)";
__ref._zoomimage /*String*/ (null,_newdistance,_motionevent);
 };
 };
 };
RDebugUtils.currentLine=19333173;
 //BA.debugLineNum = 19333173;BA.debugLine="End Sub";
return "";
}
public String  _imgcont_gd_onsingletapconfirmed(b4a.example2.ximagesliderig __ref,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "imgcont_gd_onsingletapconfirmed", true))
	 {return ((String) Debug.delegate(ba, "imgcont_gd_onsingletapconfirmed", new Object[] {_x,_y,_motionevent}));}
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4j.object.JavaObject _vo = null;
anywheresoftware.b4a.objects.B4XViewWrapper _currentview = null;
anywheresoftware.b4a.objects.collections.Map _tagmap = null;
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Private Sub ImgCont_GD_onSingleTapConfirmed(X As F";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="If x < 45dip And y < 45dip Then";
if (_x<__c.DipToCurrent((int) (45)) && _y<__c.DipToCurrent((int) (45))) { 
RDebugUtils.currentLine=19070981;
 //BA.debugLineNum = 19070981;BA.debugLine="ToggleMute";
__ref._togglemute /*String*/ (null);
 }else {
RDebugUtils.currentLine=19070983;
 //BA.debugLineNum = 19070983;BA.debugLine="Dim vo As JavaObject = imagedata.Get(\"player\")";
_vo = new anywheresoftware.b4j.object.JavaObject();
_vo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_imagedata.Get((Object)("player"))));
RDebugUtils.currentLine=19070984;
 //BA.debugLineNum = 19070984;BA.debugLine="If vo.GetFieldJO(\"player\").RunMethod(\"isPlaying";
if ((_vo.GetFieldJO("player").RunMethod("isPlaying",(Object[])(__c.Null))).equals((Object)(__c.True))) { 
RDebugUtils.currentLine=19070985;
 //BA.debugLineNum = 19070985;BA.debugLine="i.GetView(0).Tag=False";
_i.GetView((int) (0)).setTag((Object)(__c.False));
RDebugUtils.currentLine=19070986;
 //BA.debugLineNum = 19070986;BA.debugLine="PauseCurrentVideo";
__ref._pausecurrentvideo /*String*/ (null);
 }else {
RDebugUtils.currentLine=19070988;
 //BA.debugLineNum = 19070988;BA.debugLine="i.GetView(0).Tag=True";
_i.GetView((int) (0)).setTag((Object)(__c.True));
RDebugUtils.currentLine=19070989;
 //BA.debugLineNum = 19070989;BA.debugLine="PlayCurrentVideo";
__ref._playcurrentvideo /*String*/ (null);
 };
 };
 }else {
RDebugUtils.currentLine=19070993;
 //BA.debugLineNum = 19070993;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Singl";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SingleTap",(int) (2))) { 
RDebugUtils.currentLine=19070994;
 //BA.debugLineNum = 19070994;BA.debugLine="Private currentView As B4XView = ImgList.Get(Cu";
_currentview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_currentview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=19070995;
 //BA.debugLineNum = 19070995;BA.debugLine="Private tagmap As Map = currentView.Tag";
_tagmap = new anywheresoftware.b4a.objects.collections.Map();
_tagmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_currentview.getTag()));
RDebugUtils.currentLine=19070996;
 //BA.debugLineNum = 19070996;BA.debugLine="CallSub3(mCallBack, mEventName & \"_SingleTap\",C";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SingleTap",(Object)(__ref._currentindex /*int*/ ),_tagmap.Get((Object)("data")));
 };
 };
RDebugUtils.currentLine=19071000;
 //BA.debugLineNum = 19071000;BA.debugLine="End Sub";
return "";
}
public String  _togglemute(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "togglemute", true))
	 {return ((String) Debug.delegate(ba, "togglemute", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Public Sub ToggleMute";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
RDebugUtils.currentLine=20905989;
 //BA.debugLineNum = 20905989;BA.debugLine="Dim v As SimpleExoPlayer = imagedata.Get(\"player";
_v = (anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(_imagedata.Get((Object)("player")));
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="If v.Volume = 0 Then";
if (_v.getVolume()==0) { 
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="v.Volume = 1";
_v.setVolume((float) (1));
RDebugUtils.currentLine=20905992;
 //BA.debugLineNum = 20905992;BA.debugLine="i.GetView(1).GetView(0).Text = Chr(0xE050)";
_i.GetView((int) (1)).GetView((int) (0)).setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe050))));
 }else {
RDebugUtils.currentLine=20905994;
 //BA.debugLineNum = 20905994;BA.debugLine="v.Volume = 0";
_v.setVolume((float) (0));
RDebugUtils.currentLine=20905995;
 //BA.debugLineNum = 20905995;BA.debugLine="i.GetView(1).GetView(0).Text = Chr(0xE04F)";
_i.GetView((int) (1)).GetView((int) (0)).setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe04f))));
 };
 };
RDebugUtils.currentLine=20906010;
 //BA.debugLineNum = 20906010;BA.debugLine="End Sub";
return "";
}
public String  _pausecurrentvideo(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "pausecurrentvideo", true))
	 {return ((String) Debug.delegate(ba, "pausecurrentvideo", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Public Sub PauseCurrentVideo";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
RDebugUtils.currentLine=20774917;
 //BA.debugLineNum = 20774917;BA.debugLine="Dim v As SimpleExoPlayer = imagedata.Get(\"player";
_v = (anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(_imagedata.Get((Object)("player")));
RDebugUtils.currentLine=20774918;
 //BA.debugLineNum = 20774918;BA.debugLine="v.pause";
_v.Pause();
RDebugUtils.currentLine=20774926;
 //BA.debugLineNum = 20774926;BA.debugLine="i.GetView(2).Visible=True";
_i.GetView((int) (2)).setVisible(__c.True);
RDebugUtils.currentLine=20774928;
 //BA.debugLineNum = 20774928;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Video";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_VideoPaused",(int) (1))) { 
RDebugUtils.currentLine=20774929;
 //BA.debugLineNum = 20774929;BA.debugLine="CallSub2(mCallBack, mEventName & \"_VideoPaused\"";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_VideoPaused",(Object)(__ref._currentindex /*int*/ ));
 };
 };
RDebugUtils.currentLine=20774932;
 //BA.debugLineNum = 20774932;BA.debugLine="End Sub";
return "";
}
public String  _playcurrentvideo(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "playcurrentvideo", true))
	 {return ((String) Debug.delegate(ba, "playcurrentvideo", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Public Sub PlayCurrentVideo";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="Dim v As SimpleExoPlayer = imagedata.Get(\"player";
_v = (anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(_imagedata.Get((Object)("player")));
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="v.play";
_v.Play();
RDebugUtils.currentLine=20840462;
 //BA.debugLineNum = 20840462;BA.debugLine="i.GetView(2).Visible=False";
_i.GetView((int) (2)).setVisible(__c.False);
RDebugUtils.currentLine=20840464;
 //BA.debugLineNum = 20840464;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Video";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_VideoPlaying",(int) (1))) { 
RDebugUtils.currentLine=20840465;
 //BA.debugLineNum = 20840465;BA.debugLine="CallSub2(mCallBack, mEventName & \"_VideoPlaying";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_VideoPlaying",(Object)(__ref._currentindex /*int*/ ));
 };
 };
RDebugUtils.currentLine=20840468;
 //BA.debugLineNum = 20840468;BA.debugLine="End Sub";
return "";
}
public boolean  _imgcont_gd_ontouch(b4a.example2.ximagesliderig __ref,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "imgcont_gd_ontouch", true))
	 {return ((Boolean) Debug.delegate(ba, "imgcont_gd_ontouch", new Object[] {_action,_x,_y,_motionevent}));}
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _actualview = null;
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Private Sub ImgCont_GD_onTouch(Action As Int, X As";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="If Action = mBase.TOUCH_ACTION_UP Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
if (_imagedata.ContainsKey((Object)("player"))==__c.False) { 
RDebugUtils.currentLine=19202053;
 //BA.debugLineNum = 19202053;BA.debugLine="ZoomPanel.RemoveViewFromParent";
__ref._zoompanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=19202054;
 //BA.debugLineNum = 19202054;BA.debugLine="ZoomPanel.RemoveAllViews";
__ref._zoompanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=19202055;
 //BA.debugLineNum = 19202055;BA.debugLine="If ZoomActualSlide Then";
if (__ref._zoomactualslide /*boolean*/ ) { 
RDebugUtils.currentLine=19202056;
 //BA.debugLineNum = 19202056;BA.debugLine="Private actualView As B4XView = ImgList.Get(Cu";
_actualview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_actualview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=19202057;
 //BA.debugLineNum = 19202057;BA.debugLine="actualView.SetVisibleAnimated(200,True)";
_actualview.SetVisibleAnimated((int) (200),__c.True);
 };
 };
RDebugUtils.currentLine=19202060;
 //BA.debugLineNum = 19202060;BA.debugLine="StopPropagation(False)";
__ref._stoppropagation /*String*/ (null,__c.False);
 };
RDebugUtils.currentLine=19202062;
 //BA.debugLineNum = 19202062;BA.debugLine="GD.PassTouchEventTo(MotionEvent,Imgcont)";
__ref._gd /*flm.b4a.gesturedetector.GestureDetectorForB4A*/ .PassTouchEventTo((android.view.MotionEvent)(_motionevent),(android.view.View)(__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getObject()));
RDebugUtils.currentLine=19202063;
 //BA.debugLineNum = 19202063;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=19202064;
 //BA.debugLineNum = 19202064;BA.debugLine="End Sub";
return false;
}
public String  _imgcont_pagechanged(b4a.example2.ximagesliderig __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "imgcont_pagechanged", true))
	 {return ((String) Debug.delegate(ba, "imgcont_pagechanged", new Object[] {_position}));}
int _centerindex = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Private Sub ImgCont_PageChanged (Position As Int)";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Dim centerIndex As Int = Position";
_centerindex = _position;
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="If CurrentIndex > -1 Then";
if (__ref._currentindex /*int*/ >-1) { 
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="PauseCurrentVideo";
__ref._pausecurrentvideo /*String*/ (null);
 };
 };
RDebugUtils.currentLine=19660812;
 //BA.debugLineNum = 19660812;BA.debugLine="If CurrentIndex <> centerIndex Then";
if (__ref._currentindex /*int*/ !=_centerindex) { 
RDebugUtils.currentLine=19660813;
 //BA.debugLineNum = 19660813;BA.debugLine="PrevIndex = CurrentIndex";
__ref._previndex /*int*/  = __ref._currentindex /*int*/ ;
RDebugUtils.currentLine=19660814;
 //BA.debugLineNum = 19660814;BA.debugLine="CurrentIndex = centerIndex";
__ref._currentindex /*int*/  = _centerindex;
RDebugUtils.currentLine=19660815;
 //BA.debugLineNum = 19660815;BA.debugLine="ShowCount";
__ref._showcount /*String*/ (null);
RDebugUtils.currentLine=19660816;
 //BA.debugLineNum = 19660816;BA.debugLine="UpdatePlayback";
__ref._updateplayback /*String*/ (null);
RDebugUtils.currentLine=19660817;
 //BA.debugLineNum = 19660817;BA.debugLine="If ShowDots <> \"HIDE\" Then UpdateDots";
if ((__ref._showdots /*String*/ ).equals("HIDE") == false) { 
__ref._updatedots /*String*/ (null);};
 };
RDebugUtils.currentLine=19660823;
 //BA.debugLineNum = 19660823;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(int) (1))) { 
RDebugUtils.currentLine=19660824;
 //BA.debugLineNum = 19660824;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChanged\",";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(Object)(__ref._currentindex /*int*/ ));
 };
RDebugUtils.currentLine=19660826;
 //BA.debugLineNum = 19660826;BA.debugLine="ShowImage";
__ref._showimage /*void*/ (null);
RDebugUtils.currentLine=19660827;
 //BA.debugLineNum = 19660827;BA.debugLine="End Sub";
return "";
}
public String  _showcount(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "showcount", true))
	 {return ((String) Debug.delegate(ba, "showcount", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _tempview = null;
anywheresoftware.b4a.objects.B4XCanvas _tempcanvas = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _textsize = null;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Private Sub ShowCount";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="If ImageCount Then";
if (__ref._imagecount /*boolean*/ ) { 
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="Private tempView As B4XView = ImgCount";
_tempview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tempview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imgcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="tempView.Text = (CurrentIndex+1) & \"/\" & ImgList";
_tempview.setText(BA.ObjectToCharSequence(BA.NumberToString((__ref._currentindex /*int*/ +1))+"/"+BA.NumberToString(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .getSize())));
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="Private tempCanvas As B4XCanvas";
_tempcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="tempCanvas.Initialize(ImgCount)";
_tempcanvas.Initialize((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imgcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject())));
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="Private textSize As B4XRect = tempCanvas.Measure";
_textsize = _tempcanvas.MeasureText(_tempview.getText(),_tempview.getFont());
RDebugUtils.currentLine=19726344;
 //BA.debugLineNum = 19726344;BA.debugLine="tempView.parent.SetLayoutAnimated(100,(Imgcont.W";
_tempview.getParent().SetLayoutAnimated((int) (100),(int) ((__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getWidth()-__c.DipToCurrent((int) (10)))-(_textsize.getWidth()+__c.DipToCurrent((int) (20)))),_tempview.getParent().getTop(),(int) ((_textsize.getWidth()+__c.DipToCurrent((int) (20)))),_tempview.getParent().getHeight());
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="tempView.SetLayoutAnimated(0,0,0,(textSize.Width";
_tempview.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) ((_textsize.getWidth()+__c.DipToCurrent((int) (20)))),_tempview.getHeight());
RDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="tempView.SetColorAndBorder(xui.Color_ARGB(150,0,";
_tempview.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (150),(int) (0),(int) (0),(int) (0)),(int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,_tempview.getHeight());
RDebugUtils.currentLine=19726350;
 //BA.debugLineNum = 19726350;BA.debugLine="tempView.Parent.SetVisibleAnimated(500,True)";
_tempview.getParent().SetVisibleAnimated((int) (500),__c.True);
RDebugUtils.currentLine=19726351;
 //BA.debugLineNum = 19726351;BA.debugLine="LblTimer.Enabled = False";
__ref._lbltimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=19726352;
 //BA.debugLineNum = 19726352;BA.debugLine="LblTimer.Enabled = True";
__ref._lbltimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=19726354;
 //BA.debugLineNum = 19726354;BA.debugLine="End Sub";
return "";
}
public String  _updateplayback(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "updateplayback", true))
	 {return ((String) Debug.delegate(ba, "updateplayback", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper _vv = null;
int[] _location = null;
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Public Sub UpdatePlayback";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="If imagedata.ContainsKey(\"player\") Then";
if (_imagedata.ContainsKey((Object)("player"))) { 
RDebugUtils.currentLine=20971525;
 //BA.debugLineNum = 20971525;BA.debugLine="Dim vv As SimpleExoPlayerView = i.getview(0)";
_vv = new anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper();
_vv = (anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper(), (com.google.android.exoplayer2.ui.PlayerView)(_i.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=20971526;
 //BA.debugLineNum = 20971526;BA.debugLine="If vv.Tag Then";
if (BA.ObjectToBoolean(_vv.getTag())) { 
RDebugUtils.currentLine=20971531;
 //BA.debugLineNum = 20971531;BA.debugLine="Private location(2) As Int";
_location = new int[(int) (2)];
;
RDebugUtils.currentLine=20971532;
 //BA.debugLineNum = 20971532;BA.debugLine="JO.RunMethod(\"getLocationInWindow\",Array As Obj";
__ref._jo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getLocationInWindow",new Object[]{(Object)(_location)});
RDebugUtils.currentLine=20971537;
 //BA.debugLineNum = 20971537;BA.debugLine="If (location(1) - ZoomWindowFix) < 0 Or  (locat";
if ((_location[(int) (1)]-__ref._zoomwindowfix /*double*/ )<0 || (_location[(int) (1)]-__ref._zoomwindowfix /*double*/ +__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())>__c.GetDeviceLayoutValues(ba).Height) { 
RDebugUtils.currentLine=20971538;
 //BA.debugLineNum = 20971538;BA.debugLine="PauseCurrentVideo";
__ref._pausecurrentvideo /*String*/ (null);
 }else 
{RDebugUtils.currentLine=20971539;
 //BA.debugLineNum = 20971539;BA.debugLine="else If (location(1) - ZoomWindowFix) > 0 Or (l";
if ((_location[(int) (1)]-__ref._zoomwindowfix /*double*/ )>0 || (_location[(int) (1)]-__ref._zoomwindowfix /*double*/ +__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())<__c.GetDeviceLayoutValues(ba).Height) { 
RDebugUtils.currentLine=20971540;
 //BA.debugLineNum = 20971540;BA.debugLine="PlayCurrentVideo";
__ref._playcurrentvideo /*String*/ (null);
 }}
;
 };
 };
RDebugUtils.currentLine=20971545;
 //BA.debugLineNum = 20971545;BA.debugLine="End Sub";
return "";
}
public String  _updatedots(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "updatedots", true))
	 {return ((String) Debug.delegate(ba, "updatedots", null));}
int _shift = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _dot = null;
anywheresoftware.b4a.objects.B4XViewWrapper _dotcir = null;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Private Sub UpdateDots";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="Private shift As Int = dotSize+dotgap";
_shift = (int) (__ref._dotsize /*int*/ +__ref._dotgap /*int*/ );
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="If (CurrentIndex = 5 Or CurrentIndex = dotCont.Nu";
if ((__ref._currentindex /*int*/ ==5 || __ref._currentindex /*int*/ ==__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1 || __ref._currentindex /*int*/ ==__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-6) && (__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(__ref._currentindex /*int*/ ).getTag()).equals((Object)("s"))) { 
 };
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="For i=0 To dotCont.NumberOfViews-1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="Private dot As B4XView = dotCont.GetView(i)";
_dot = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dot = __ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i);
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="Private dotCir As B4XView = dot.getview(0)";
_dotcir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dotcir = _dot.GetView((int) (0));
RDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="dotCir.SetColorAndBorder(dotColor,0,xui.Color_Tr";
_dotcir.SetColorAndBorder(__ref._dotcolor /*int*/ ,(int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._dotsize /*int*/ );
RDebugUtils.currentLine=19791882;
 //BA.debugLineNum = 19791882;BA.debugLine="If CurrentIndex > PrevIndex Then";
if (__ref._currentindex /*int*/ >__ref._previndex /*int*/ ) { 
RDebugUtils.currentLine=19791883;
 //BA.debugLineNum = 19791883;BA.debugLine="If dotCont.GetView(CurrentIndex).Tag = \"s\" Then";
if ((__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(__ref._currentindex /*int*/ ).getTag()).equals((Object)("s"))) { 
RDebugUtils.currentLine=19791885;
 //BA.debugLineNum = 19791885;BA.debugLine="If i = CurrentIndex Then";
if (_i==__ref._currentindex /*int*/ ) { 
RDebugUtils.currentLine=19791886;
 //BA.debugLineNum = 19791886;BA.debugLine="SetActive(dot)";
__ref._setactive /*String*/ (null,_dot);
 }else 
{RDebugUtils.currentLine=19791887;
 //BA.debugLineNum = 19791887;BA.debugLine="Else If i = CurrentIndex-5 Or i = CurrentIndex";
if (_i==__ref._currentindex /*int*/ -5 || _i==__ref._currentindex /*int*/ +1) { 
RDebugUtils.currentLine=19791888;
 //BA.debugLineNum = 19791888;BA.debugLine="SetSmall(dot)";
__ref._setsmall /*String*/ (null,_dot);
 }else 
{RDebugUtils.currentLine=19791889;
 //BA.debugLineNum = 19791889;BA.debugLine="Else If i < CurrentIndex-5 Or i > CurrentIndex";
if (_i<__ref._currentindex /*int*/ -5 || _i>__ref._currentindex /*int*/ +1) { 
RDebugUtils.currentLine=19791890;
 //BA.debugLineNum = 19791890;BA.debugLine="SetHidden(dot)";
__ref._sethidden /*String*/ (null,_dot);
 }else {
RDebugUtils.currentLine=19791892;
 //BA.debugLineNum = 19791892;BA.debugLine="SetDefault(dot)";
__ref._setdefault /*String*/ (null,_dot);
 }}}
;
RDebugUtils.currentLine=19791894;
 //BA.debugLineNum = 19791894;BA.debugLine="dot.SetLayoutAnimated(dotTransitionDuration,do";
_dot.SetLayoutAnimated(__ref._dottransitionduration /*int*/ ,(int) (_dot.getLeft()-_shift),_dot.getTop(),__ref._dotsize /*int*/ ,__ref._dotsize /*int*/ );
 }else {
RDebugUtils.currentLine=19791896;
 //BA.debugLineNum = 19791896;BA.debugLine="If i = CurrentIndex Then";
if (_i==__ref._currentindex /*int*/ ) { 
RDebugUtils.currentLine=19791897;
 //BA.debugLineNum = 19791897;BA.debugLine="SetActive(dot)";
__ref._setactive /*String*/ (null,_dot);
 }else 
{RDebugUtils.currentLine=19791898;
 //BA.debugLineNum = 19791898;BA.debugLine="Else if dot.tag = \"b\" Then";
if ((_dot.getTag()).equals((Object)("b"))) { 
RDebugUtils.currentLine=19791899;
 //BA.debugLineNum = 19791899;BA.debugLine="SetDefault(dot)";
__ref._setdefault /*String*/ (null,_dot);
 }}
;
 };
 }else 
{RDebugUtils.currentLine=19791902;
 //BA.debugLineNum = 19791902;BA.debugLine="Else If CurrentIndex < PrevIndex Then";
if (__ref._currentindex /*int*/ <__ref._previndex /*int*/ ) { 
RDebugUtils.currentLine=19791903;
 //BA.debugLineNum = 19791903;BA.debugLine="If dotCont.GetView(CurrentIndex).tag = \"s\" Then";
if ((__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(__ref._currentindex /*int*/ ).getTag()).equals((Object)("s"))) { 
RDebugUtils.currentLine=19791904;
 //BA.debugLineNum = 19791904;BA.debugLine="If i = CurrentIndex Then";
if (_i==__ref._currentindex /*int*/ ) { 
RDebugUtils.currentLine=19791905;
 //BA.debugLineNum = 19791905;BA.debugLine="SetActive(dot)";
__ref._setactive /*String*/ (null,_dot);
 }else 
{RDebugUtils.currentLine=19791906;
 //BA.debugLineNum = 19791906;BA.debugLine="Else If i = CurrentIndex-1 Or i = CurrentIndex";
if (_i==__ref._currentindex /*int*/ -1 || _i==__ref._currentindex /*int*/ +5) { 
RDebugUtils.currentLine=19791907;
 //BA.debugLineNum = 19791907;BA.debugLine="SetSmall(dot)";
__ref._setsmall /*String*/ (null,_dot);
 }else 
{RDebugUtils.currentLine=19791908;
 //BA.debugLineNum = 19791908;BA.debugLine="Else If i < CurrentIndex-1 Or i > CurrentIndex";
if (_i<__ref._currentindex /*int*/ -1 || _i>__ref._currentindex /*int*/ +5) { 
RDebugUtils.currentLine=19791909;
 //BA.debugLineNum = 19791909;BA.debugLine="SetHidden(dot)";
__ref._sethidden /*String*/ (null,_dot);
 }else {
RDebugUtils.currentLine=19791911;
 //BA.debugLineNum = 19791911;BA.debugLine="SetDefault(dot)";
__ref._setdefault /*String*/ (null,_dot);
 }}}
;
RDebugUtils.currentLine=19791913;
 //BA.debugLineNum = 19791913;BA.debugLine="dot.SetLayoutAnimated(dotTransitionDuration,do";
_dot.SetLayoutAnimated(__ref._dottransitionduration /*int*/ ,(int) (_dot.getLeft()+_shift),_dot.getTop(),__ref._dotsize /*int*/ ,__ref._dotsize /*int*/ );
 }else {
RDebugUtils.currentLine=19791915;
 //BA.debugLineNum = 19791915;BA.debugLine="If i = CurrentIndex Then";
if (_i==__ref._currentindex /*int*/ ) { 
RDebugUtils.currentLine=19791916;
 //BA.debugLineNum = 19791916;BA.debugLine="SetActive(dot)";
__ref._setactive /*String*/ (null,_dot);
 }else 
{RDebugUtils.currentLine=19791917;
 //BA.debugLineNum = 19791917;BA.debugLine="Else if dot.tag = \"b\" Then";
if ((_dot.getTag()).equals((Object)("b"))) { 
RDebugUtils.currentLine=19791918;
 //BA.debugLineNum = 19791918;BA.debugLine="SetDefault(dot)";
__ref._setdefault /*String*/ (null,_dot);
 }}
;
 };
 }}
;
 }
};
RDebugUtils.currentLine=19791924;
 //BA.debugLineNum = 19791924;BA.debugLine="dotCont.GetView(CurrentIndex).Tag = \"b\"";
__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(__ref._currentindex /*int*/ ).setTag((Object)("b"));
RDebugUtils.currentLine=19791925;
 //BA.debugLineNum = 19791925;BA.debugLine="End Sub";
return "";
}
public void  _showimage(b4a.example2.ximagesliderig __ref) throws Exception{
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "showimage", true))
	 {Debug.delegate(ba, "showimage", null); return;}
ResumableSub_ShowImage rsub = new ResumableSub_ShowImage(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowImage extends BA.ResumableSub {
public ResumableSub_ShowImage(b4a.example2.ximagesliderig parent,b4a.example2.ximagesliderig __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example2.ximagesliderig __ref;
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
RDebugUtils.currentModule="ximagesliderig";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="Dim i As B4XView = ImgList.Get(CurrentIndex)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._currentindex /*int*/ )));
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="Dim img As B4XBitmap";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="If imagedata.ContainsKey(\"video\") Then";
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
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="If imagedata.ContainsKey(\"player\") = False Then";
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
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="removeProgressView(i)";
__ref._removeprogressview /*String*/ (null,_i);
RDebugUtils.currentLine=20185097;
 //BA.debugLineNum = 20185097;BA.debugLine="Dim p As ProgressBar";
_p = new anywheresoftware.b4a.objects.ProgressBarWrapper();
RDebugUtils.currentLine=20185102;
 //BA.debugLineNum = 20185102;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=20185103;
 //BA.debugLineNum = 20185103;BA.debugLine="p.Indeterminate = True";
_p.setIndeterminate(parent.__c.True);
RDebugUtils.currentLine=20185108;
 //BA.debugLineNum = 20185108;BA.debugLine="i.AddView(p,Imgcont.Width/2 - 20dip,Imgcont.hei";
_i.AddView((android.view.View)(_p.getObject()),(int) (__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getWidth()/(double)2-parent.__c.DipToCurrent((int) (20))),(int) (__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getHeight()/(double)2-parent.__c.DipToCurrent((int) (20))),parent.__c.DipToCurrent((int) (40)),parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=20185111;
 //BA.debugLineNum = 20185111;BA.debugLine="Private v As SimpleExoPlayer";
_v = new anywheresoftware.b4a.objects.SimpleExoPlayerWrapper();
RDebugUtils.currentLine=20185112;
 //BA.debugLineNum = 20185112;BA.debugLine="v.Initialize(\"vplayer\")";
_v.Initialize(ba,"vplayer");
RDebugUtils.currentLine=20185113;
 //BA.debugLineNum = 20185113;BA.debugLine="videoplayer.Add(CreateMap(\"id\":CurrentIndex,\"pl";
__ref._videoplayer /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(parent.__c.createMap(new Object[] {(Object)("id"),(Object)(__ref._currentindex /*int*/ ),(Object)("player"),(Object)(_v)}).getObject()));
RDebugUtils.currentLine=20185115;
 //BA.debugLineNum = 20185115;BA.debugLine="If imagedata.Get(\"type\") = \"file\" Then v.Prepar";
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
RDebugUtils.currentLine=20185116;
 //BA.debugLineNum = 20185116;BA.debugLine="If imagedata.Get(\"type\") = \"uri\" Then v.Prepare";
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
RDebugUtils.currentLine=20185117;
 //BA.debugLineNum = 20185117;BA.debugLine="If imagedata.Get(\"type\") = \"dash\" Then v.Prepar";
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
RDebugUtils.currentLine=20185118;
 //BA.debugLineNum = 20185118;BA.debugLine="If imagedata.Get(\"type\") = \"hls\" Then v.Prepare";
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
RDebugUtils.currentLine=20185119;
 //BA.debugLineNum = 20185119;BA.debugLine="If imagedata.Get(\"type\") = \"smoothstream\" Then";
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
RDebugUtils.currentLine=20185121;
 //BA.debugLineNum = 20185121;BA.debugLine="If StartVideoMuted Then";
if (true) break;

case 37:
//if
this.state = 42;
if (__ref._startvideomuted /*boolean*/ ) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=20185122;
 //BA.debugLineNum = 20185122;BA.debugLine="v.Volume = 0";
_v.setVolume((float) (0));
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=20185124;
 //BA.debugLineNum = 20185124;BA.debugLine="v.Volume = 1";
_v.setVolume((float) (1));
 if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=20185127;
 //BA.debugLineNum = 20185127;BA.debugLine="Dim vv As SimpleExoPlayerView = i.GetView(0)";
_vv = new anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper();
_vv = (anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper(), (com.google.android.exoplayer2.ui.PlayerView)(_i.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=20185128;
 //BA.debugLineNum = 20185128;BA.debugLine="Select scale";
if (true) break;

case 43:
//select
this.state = 50;
switch (BA.switchObjectToInt(__ref._scale /*String*/ ,"FILL","FIT","STRETCH")) {
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
RDebugUtils.currentLine=20185129;
 //BA.debugLineNum = 20185129;BA.debugLine="Case \"FILL\": vv.resizemode=\"ZOOM\"";
_vv.setResizeMode("ZOOM");
 if (true) break;

case 47:
//C
this.state = 50;
RDebugUtils.currentLine=20185130;
 //BA.debugLineNum = 20185130;BA.debugLine="Case \"FIT\": vv.resizemode=\"FIT\"";
_vv.setResizeMode("FIT");
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=20185131;
 //BA.debugLineNum = 20185131;BA.debugLine="Case \"STRETCH\": vv.resizemode=\"FILL\"";
_vv.setResizeMode("FILL");
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=20185134;
 //BA.debugLineNum = 20185134;BA.debugLine="vv.Player=v";
_vv.setPlayer(_v);
RDebugUtils.currentLine=20185135;
 //BA.debugLineNum = 20185135;BA.debugLine="vv.Tag = AutoPlayVideo";
_vv.setTag((Object)(__ref._autoplayvideo /*boolean*/ ));
RDebugUtils.currentLine=20185160;
 //BA.debugLineNum = 20185160;BA.debugLine="imagedata.Put(\"player\",v)";
_imagedata.Put((Object)("player"),(Object)(_v));
 if (true) break;

case 51:
//C
this.state = 83;
;
RDebugUtils.currentLine=20185162;
 //BA.debugLineNum = 20185162;BA.debugLine="UpdatePlayback";
__ref._updateplayback /*String*/ (null);
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=20185164;
 //BA.debugLineNum = 20185164;BA.debugLine="If imagedata.Get(\"image\") Is String Then";
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
RDebugUtils.currentLine=20185165;
 //BA.debugLineNum = 20185165;BA.debugLine="removeProgressView(i)";
__ref._removeprogressview /*String*/ (null,_i);
RDebugUtils.currentLine=20185168;
 //BA.debugLineNum = 20185168;BA.debugLine="Dim p As ProgressBar";
_p = new anywheresoftware.b4a.objects.ProgressBarWrapper();
RDebugUtils.currentLine=20185173;
 //BA.debugLineNum = 20185173;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=20185174;
 //BA.debugLineNum = 20185174;BA.debugLine="p.Indeterminate = True";
_p.setIndeterminate(parent.__c.True);
RDebugUtils.currentLine=20185178;
 //BA.debugLineNum = 20185178;BA.debugLine="i.AddView(p,Imgcont.Width/2 - 20dip,Imgcont.hei";
_i.AddView((android.view.View)(_p.getObject()),(int) (__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getWidth()/(double)2-parent.__c.DipToCurrent((int) (20))),(int) (__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getHeight()/(double)2-parent.__c.DipToCurrent((int) (20))),parent.__c.DipToCurrent((int) (40)),parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=20185180;
 //BA.debugLineNum = 20185180;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example2.httpjob();
RDebugUtils.currentLine=20185181;
 //BA.debugLineNum = 20185181;BA.debugLine="j.Initialize(\"\",Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=20185182;
 //BA.debugLineNum = 20185182;BA.debugLine="j.Download(imagedata.Get(\"image\"))";
_j._download /*String*/ (null,BA.ObjectToString(_imagedata.Get((Object)("image"))));
RDebugUtils.currentLine=20185183;
 //BA.debugLineNum = 20185183;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ximagesliderig", "showimage"), (Object)(_j));
this.state = 84;
return;
case 84:
//C
this.state = 57;
_j = (b4a.example2.httpjob) result[1];
;
RDebugUtils.currentLine=20185185;
 //BA.debugLineNum = 20185185;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=20185189;
 //BA.debugLineNum = 20185189;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=20185190;
 //BA.debugLineNum = 20185190;BA.debugLine="Dim img As B4XBitmap = j.GetBitmap";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null).getObject()));
RDebugUtils.currentLine=20185191;
 //BA.debugLineNum = 20185191;BA.debugLine="imagedata.Put(\"image\",img)";
_imagedata.Put((Object)("image"),(Object)(_img.getObject()));
RDebugUtils.currentLine=20185192;
 //BA.debugLineNum = 20185192;BA.debugLine="i.tag = imagedata";
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
RDebugUtils.currentLine=20185195;
 //BA.debugLineNum = 20185195;BA.debugLine="Dim img As B4XBitmap = imagedata.Get(\"image\")";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_imagedata.Get((Object)("image"))));
 if (true) break;
;
RDebugUtils.currentLine=20185198;
 //BA.debugLineNum = 20185198;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is Label Then";

case 63:
//if
this.state = 66;
if (_i.GetView((int) (_i.getNumberOfViews()-1)).getObjectOrNull() instanceof android.widget.TextView) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=20185199;
 //BA.debugLineNum = 20185199;BA.debugLine="Dim l As Label = i.GetView(i.NumberOfViews-1)";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_i.GetView((int) (_i.getNumberOfViews()-1)).getObject()));
RDebugUtils.currentLine=20185201;
 //BA.debugLineNum = 20185201;BA.debugLine="l.RemoveView";
_l.RemoveView();
 if (true) break;
;
RDebugUtils.currentLine=20185207;
 //BA.debugLineNum = 20185207;BA.debugLine="If img.IsInitialized Then";

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
RDebugUtils.currentLine=20185211;
 //BA.debugLineNum = 20185211;BA.debugLine="Dim JOo As JavaObject=i.GetView(0)";
_joo = new anywheresoftware.b4j.object.JavaObject();
_joo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_i.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=20185212;
 //BA.debugLineNum = 20185212;BA.debugLine="JOo.RunMethod(\"setImageBitmap\",Array(img))";
_joo.RunMethod("setImageBitmap",new Object[]{(Object)(_img.getObject())});
RDebugUtils.currentLine=20185213;
 //BA.debugLineNum = 20185213;BA.debugLine="Select scale";
if (true) break;

case 69:
//select
this.state = 76;
switch (BA.switchObjectToInt(__ref._scale /*String*/ ,"FILL","FIT","STRETCH")) {
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
RDebugUtils.currentLine=20185214;
 //BA.debugLineNum = 20185214;BA.debugLine="Case \"FILL\": JOo.RunMethod(\"setScaleType\",Arra";
_joo.RunMethod("setScaleType",new Object[]{(Object)("CENTER_CROP")});
 if (true) break;

case 73:
//C
this.state = 76;
RDebugUtils.currentLine=20185215;
 //BA.debugLineNum = 20185215;BA.debugLine="Case \"FIT\": JOo.RunMethod(\"setScaleType\",Array";
_joo.RunMethod("setScaleType",new Object[]{(Object)("CENTER_INSIDE")});
 if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=20185216;
 //BA.debugLineNum = 20185216;BA.debugLine="Case \"STRETCH\": JOo.RunMethod(\"setScaleType\",A";
_joo.RunMethod("setScaleType",new Object[]{(Object)("FIT_XY")});
 if (true) break;
;
RDebugUtils.currentLine=20185229;
 //BA.debugLineNum = 20185229;BA.debugLine="If CoverFreeSpace Then";

case 76:
//if
this.state = 79;
if (__ref._coverfreespace /*boolean*/ ) { 
this.state = 78;
}if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=20185231;
 //BA.debugLineNum = 20185231;BA.debugLine="Dim bo As JavaObject=Me";
_bo = new anywheresoftware.b4j.object.JavaObject();
_bo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(parent));
RDebugUtils.currentLine=20185232;
 //BA.debugLineNum = 20185232;BA.debugLine="Dim jc As JavaObject";
_jc = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=20185233;
 //BA.debugLineNum = 20185233;BA.debugLine="jc.InitializeContext";
_jc.InitializeContext(ba);
RDebugUtils.currentLine=20185234;
 //BA.debugLineNum = 20185234;BA.debugLine="img = bo.RunMethod(\"blur\",Array(jc,img))";
_img = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bo.RunMethod("blur",new Object[]{(Object)(_jc.getObject()),(Object)(_img.getObject())})));
RDebugUtils.currentLine=20185235;
 //BA.debugLineNum = 20185235;BA.debugLine="i.SetBitmap(img.Resize(Imgcont.Width,Imgcont.H";
_i.SetBitmap((android.graphics.Bitmap)(_img.Resize(__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getWidth(),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getHeight(),parent.__c.False).getObject()));
 if (true) break;

case 79:
//C
this.state = 82;
;
 if (true) break;

case 81:
//C
this.state = 82;
RDebugUtils.currentLine=20185243;
 //BA.debugLineNum = 20185243;BA.debugLine="Dim tp As Label";
_tp = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=20185244;
 //BA.debugLineNum = 20185244;BA.debugLine="tp.Initialize(\"trypanel\")";
_tp.Initialize(ba,"trypanel");
RDebugUtils.currentLine=20185245;
 //BA.debugLineNum = 20185245;BA.debugLine="i.AddView(tp,0,0,Imgcont.Width,Imgcont.Height)";
_i.AddView((android.view.View)(_tp.getObject()),(int) (0),(int) (0),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getWidth(),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getHeight());
RDebugUtils.currentLine=20185246;
 //BA.debugLineNum = 20185246;BA.debugLine="tp.Text = \"Couldn't load the image. Tap to retr";
_tp.setText(BA.ObjectToCharSequence("Couldn't load the image. Tap to retry."));
RDebugUtils.currentLine=20185247;
 //BA.debugLineNum = 20185247;BA.debugLine="tp.Color = Colors.White";
_tp.setColor(parent.__c.Colors.White);
RDebugUtils.currentLine=20185248;
 //BA.debugLineNum = 20185248;BA.debugLine="tp.TextColor = Colors.Black";
_tp.setTextColor(parent.__c.Colors.Black);
RDebugUtils.currentLine=20185250;
 //BA.debugLineNum = 20185250;BA.debugLine="tp.Gravity = Gravity.CENTER_HORIZONTAL+Gravity";
_tp.setGravity((int) (parent.__c.Gravity.CENTER_HORIZONTAL+parent.__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=20185251;
 //BA.debugLineNum = 20185251;BA.debugLine="tp.TextSize = 15";
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
RDebugUtils.currentLine=20185258;
 //BA.debugLineNum = 20185258;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example2.ximagesliderig __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="private Sub Initialize (Callback As Object, EventN";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="ImgList.Initialize";
__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="ZoomPanel = xui.CreatePanel(\"ZoomPanel\")";
__ref._zoompanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"ZoomPanel");
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="ImgCount.Initialize(\"\")";
__ref._imgcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="dotCont = xui.CreatePanel(\"\")";
__ref._dotcont /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="LblTimer.Initialize(\"LblTimer\",2000)";
__ref._lbltimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"LblTimer",(long) (2000));
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="End Sub";
return "";
}
public String  _lbltimer_tick(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "lbltimer_tick", true))
	 {return ((String) Debug.delegate(ba, "lbltimer_tick", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Private Sub LblTimer_tick";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Private i As B4XView = ImgCount.parent";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imgcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .getParent()));
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="i.SetVisibleAnimated(500,False)";
_i.SetVisibleAnimated((int) (500),__c.False);
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="LblTimer.Enabled = False";
__ref._lbltimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="End Sub";
return "";
}
public String  _removeprogressview(b4a.example2.ximagesliderig __ref,anywheresoftware.b4a.objects.B4XViewWrapper _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "removeprogressview", true))
	 {return ((String) Debug.delegate(ba, "removeprogressview", new Object[] {_i}));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.ProgressBarWrapper _p = null;
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Private Sub removeProgressView(i As B4XView)";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is Label Then";
if (_i.GetView((int) (_i.getNumberOfViews()-1)).getObjectOrNull() instanceof android.widget.TextView) { 
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Dim l As Label = i.GetView(i.NumberOfViews-1)";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_i.GetView((int) (_i.getNumberOfViews()-1)).getObject()));
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="l.RemoveView";
_l.RemoveView();
 };
RDebugUtils.currentLine=20119562;
 //BA.debugLineNum = 20119562;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is ProgressBar Th";
if (_i.GetView((int) (_i.getNumberOfViews()-1)).getObjectOrNull() instanceof android.widget.ProgressBar) { 
RDebugUtils.currentLine=20119563;
 //BA.debugLineNum = 20119563;BA.debugLine="Dim p As ProgressBar = i.GetView(i.NumberOfViews";
_p = new anywheresoftware.b4a.objects.ProgressBarWrapper();
_p = (anywheresoftware.b4a.objects.ProgressBarWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ProgressBarWrapper(), (android.widget.ProgressBar)(_i.GetView((int) (_i.getNumberOfViews()-1)).getObject()));
RDebugUtils.currentLine=20119564;
 //BA.debugLineNum = 20119564;BA.debugLine="p.RemoveView";
_p.RemoveView();
 };
RDebugUtils.currentLine=20119571;
 //BA.debugLineNum = 20119571;BA.debugLine="End Sub";
return "";
}
public String  _setactive(b4a.example2.ximagesliderig __ref,anywheresoftware.b4a.objects.B4XViewWrapper _dot) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "setactive", true))
	 {return ((String) Debug.delegate(ba, "setactive", new Object[] {_dot}));}
anywheresoftware.b4a.objects.B4XViewWrapper _dotcir = null;
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Private Sub SetActive(dot As B4XView)";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
_dotcir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dotcir = _dot.GetView((int) (0));
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="dotCir.SetColorAndBorder(activeDotColor,0,xui.Col";
_dotcir.SetColorAndBorder(__ref._activedotcolor /*int*/ ,(int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__ref._dotsize /*int*/ );
RDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,0,";
_dotcir.SetLayoutAnimated(__ref._dottransitionduration /*int*/ ,(int) (0),(int) (0),__ref._dotsize /*int*/ ,__ref._dotsize /*int*/ );
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="End Sub";
return "";
}
public String  _setdefault(b4a.example2.ximagesliderig __ref,anywheresoftware.b4a.objects.B4XViewWrapper _dot) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "setdefault", true))
	 {return ((String) Debug.delegate(ba, "setdefault", new Object[] {_dot}));}
anywheresoftware.b4a.objects.B4XViewWrapper _dotcir = null;
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Private Sub SetDefault(dot As B4XView)";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
_dotcir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dotcir = _dot.GetView((int) (0));
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,(d";
_dotcir.SetLayoutAnimated(__ref._dottransitionduration /*int*/ ,(int) ((__ref._dotsize /*int*/ -__ref._dotsizem /*int*/ )/(double)2),(int) ((__ref._dotsize /*int*/ -__ref._dotsizem /*int*/ )/(double)2),__ref._dotsizem /*int*/ ,__ref._dotsizem /*int*/ );
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="End Sub";
return "";
}
public String  _sethidden(b4a.example2.ximagesliderig __ref,anywheresoftware.b4a.objects.B4XViewWrapper _dot) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "sethidden", true))
	 {return ((String) Debug.delegate(ba, "sethidden", new Object[] {_dot}));}
anywheresoftware.b4a.objects.B4XViewWrapper _dotcir = null;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub SetHidden(dot As B4XView)";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
_dotcir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dotcir = _dot.GetView((int) (0));
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,do";
_dotcir.SetLayoutAnimated(__ref._dottransitionduration /*int*/ ,(int) (__ref._dotsize /*int*/ /(double)2),(int) (__ref._dotsize /*int*/ /(double)2),(int) (1),(int) (1));
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="dotCir.SetVisibleAnimated(dotTransitionDuration,F";
_dotcir.SetVisibleAnimated(__ref._dottransitionduration /*int*/ ,__c.False);
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="dot.tag = \"h\"";
_dot.setTag((Object)("h"));
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="End Sub";
return "";
}
public String  _setsmall(b4a.example2.ximagesliderig __ref,anywheresoftware.b4a.objects.B4XViewWrapper _dot) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "setsmall", true))
	 {return ((String) Debug.delegate(ba, "setsmall", new Object[] {_dot}));}
anywheresoftware.b4a.objects.B4XViewWrapper _dotcir = null;
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Private Sub SetSmall(dot As B4XView)";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Private dotCir As B4XView = dot.GetView(0)";
_dotcir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dotcir = _dot.GetView((int) (0));
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="dotCir.SetLayoutAnimated(dotTransitionDuration,(d";
_dotcir.SetLayoutAnimated(__ref._dottransitionduration /*int*/ ,(int) ((__ref._dotsize /*int*/ /(double)2)-(__ref._dotsizes /*int*/ /(double)2)),(int) ((__ref._dotsize /*int*/ /(double)2)-(__ref._dotsizes /*int*/ /(double)2)),__ref._dotsizes /*int*/ ,__ref._dotsizes /*int*/ );
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="dotCir.SetVisibleAnimated(dotTransitionDuration,T";
_dotcir.SetVisibleAnimated(__ref._dottransitionduration /*int*/ ,__c.True);
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="dot.tag = \"s\"";
_dot.setTag((Object)("s"));
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="End Sub";
return "";
}
public String  _shownext(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "shownext", true))
	 {return ((String) Debug.delegate(ba, "shownext", null));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Public Sub ShowNext";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="If CurrentIndex < ImgList.Size-1 Then";
if (__ref._currentindex /*int*/ <__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) { 
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="SlideImage(CurrentIndex + 1)";
__ref._slideimage /*String*/ (null,(int) (__ref._currentindex /*int*/ +1));
 };
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="End Sub";
return "";
}
public String  _slideimage(b4a.example2.ximagesliderig __ref,int _centerindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "slideimage", true))
	 {return ((String) Debug.delegate(ba, "slideimage", new Object[] {_centerindex}));}
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Private Sub SlideImage(centerIndex As Int)";
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="Imgcont.GotoPage(centerIndex,True)";
__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .GotoPage(_centerindex,__c.True);
RDebugUtils.currentLine=19595270;
 //BA.debugLineNum = 19595270;BA.debugLine="End Sub";
return "";
}
public String  _showprev(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "showprev", true))
	 {return ((String) Debug.delegate(ba, "showprev", null));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Public Sub ShowPrev";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="If CurrentIndex > 0 Then";
if (__ref._currentindex /*int*/ >0) { 
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="SlideImage(CurrentIndex - 1)";
__ref._slideimage /*String*/ (null,(int) (__ref._currentindex /*int*/ -1));
 };
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="End Sub";
return "";
}
public String  _trypanel_click(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "trypanel_click", true))
	 {return ((String) Debug.delegate(ba, "trypanel_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Private Sub trypanel_Click";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="Dim l As Label = Sender";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="l.RemoveView";
_l.RemoveView();
RDebugUtils.currentLine=20250631;
 //BA.debugLineNum = 20250631;BA.debugLine="ShowImage";
__ref._showimage /*void*/ (null);
RDebugUtils.currentLine=20250632;
 //BA.debugLineNum = 20250632;BA.debugLine="End Sub";
return "";
}
public String  _vplayer_error(b4a.example2.ximagesliderig __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "vplayer_error", true))
	 {return ((String) Debug.delegate(ba, "vplayer_error", new Object[] {_message}));}
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
int _index = 0;
anywheresoftware.b4a.objects.collections.Map _player = null;
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.collections.Map _imagedata = null;
anywheresoftware.b4a.objects.LabelWrapper _tp = null;
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Private Sub vplayer_Error (Message As String)";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Dim v As SimpleExoPlayer=Sender";
_v = (anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(__c.Sender(ba));
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="Dim index As Int=-1";
_index = (int) (-1);
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="For Each player As Map In videoplayer";
_player = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._videoplayer /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_player = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group3.Get(index3)));
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="If v = player.Get(\"player\") Then index = player.";
if ((_v).equals((anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(_player.Get((Object)("player"))))) { 
_index = (int)(BA.ObjectToNumber(_player.Get((Object)("id"))));};
 }
};
RDebugUtils.currentLine=20316166;
 //BA.debugLineNum = 20316166;BA.debugLine="If index > -1 Then";
if (_index>-1) { 
RDebugUtils.currentLine=20316167;
 //BA.debugLineNum = 20316167;BA.debugLine="Dim i As B4XView = ImgList.Get(index)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="Dim imagedata As Map = i.Tag";
_imagedata = new anywheresoftware.b4a.objects.collections.Map();
_imagedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_i.getTag()));
RDebugUtils.currentLine=20316170;
 //BA.debugLineNum = 20316170;BA.debugLine="imagedata.Remove(\"player\")";
_imagedata.Remove((Object)("player"));
RDebugUtils.currentLine=20316171;
 //BA.debugLineNum = 20316171;BA.debugLine="i.Tag = imagedata";
_i.setTag((Object)(_imagedata.getObject()));
RDebugUtils.currentLine=20316172;
 //BA.debugLineNum = 20316172;BA.debugLine="v.Release";
_v.Release();
RDebugUtils.currentLine=20316174;
 //BA.debugLineNum = 20316174;BA.debugLine="Log(Message)";
__c.LogImpl("920316174",_message,0);
RDebugUtils.currentLine=20316176;
 //BA.debugLineNum = 20316176;BA.debugLine="Dim tp As Label";
_tp = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=20316177;
 //BA.debugLineNum = 20316177;BA.debugLine="tp.Initialize(\"trypanel\")";
_tp.Initialize(ba,"trypanel");
RDebugUtils.currentLine=20316178;
 //BA.debugLineNum = 20316178;BA.debugLine="i.AddView(tp,0,0,Imgcont.Width,Imgcont.Height)";
_i.AddView((android.view.View)(_tp.getObject()),(int) (0),(int) (0),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getWidth(),__ref._imgcont /*de.amberhome.viewpager.AHViewPager*/ .getHeight());
RDebugUtils.currentLine=20316179;
 //BA.debugLineNum = 20316179;BA.debugLine="tp.Text = \"Couldn't load the video. Tap to retry";
_tp.setText(BA.ObjectToCharSequence("Couldn't load the video. Tap to retry."));
RDebugUtils.currentLine=20316180;
 //BA.debugLineNum = 20316180;BA.debugLine="tp.Color = Colors.White";
_tp.setColor(__c.Colors.White);
RDebugUtils.currentLine=20316181;
 //BA.debugLineNum = 20316181;BA.debugLine="tp.TextColor = Colors.Black";
_tp.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=20316182;
 //BA.debugLineNum = 20316182;BA.debugLine="tp.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.C";
_tp.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=20316183;
 //BA.debugLineNum = 20316183;BA.debugLine="tp.TextSize = 15";
_tp.setTextSize((float) (15));
 };
RDebugUtils.currentLine=20316186;
 //BA.debugLineNum = 20316186;BA.debugLine="End Sub";
return "";
}
public String  _vplayer_ready(b4a.example2.ximagesliderig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ximagesliderig";
if (Debug.shouldDelegate(ba, "vplayer_ready", true))
	 {return ((String) Debug.delegate(ba, "vplayer_ready", null));}
anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _v = null;
int _index = 0;
anywheresoftware.b4a.objects.collections.Map _player = null;
anywheresoftware.b4a.objects.B4XViewWrapper _i = null;
anywheresoftware.b4a.objects.ProgressBarWrapper _p = null;
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Private Sub vplayer_Ready";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Dim v As SimpleExoPlayer=Sender";
_v = (anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(__c.Sender(ba));
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="Dim index As Int=-1";
_index = (int) (-1);
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="For Each player As Map In videoplayer";
_player = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._videoplayer /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_player = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group3.Get(index3)));
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="If v = player.Get(\"player\") Then index = player.";
if ((_v).equals((anywheresoftware.b4a.objects.SimpleExoPlayerWrapper)(_player.Get((Object)("player"))))) { 
_index = (int)(BA.ObjectToNumber(_player.Get((Object)("id"))));};
 }
};
RDebugUtils.currentLine=20381702;
 //BA.debugLineNum = 20381702;BA.debugLine="If index > -1 Then";
if (_index>-1) { 
RDebugUtils.currentLine=20381703;
 //BA.debugLineNum = 20381703;BA.debugLine="Dim i As B4XView = ImgList.Get(index)";
_i = new anywheresoftware.b4a.objects.B4XViewWrapper();
_i = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imglist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=20381704;
 //BA.debugLineNum = 20381704;BA.debugLine="i.GetView(2).Visible=True";
_i.GetView((int) (2)).setVisible(__c.True);
RDebugUtils.currentLine=20381705;
 //BA.debugLineNum = 20381705;BA.debugLine="If i.GetView(i.NumberOfViews-1) Is ProgressBar T";
if (_i.GetView((int) (_i.getNumberOfViews()-1)).getObjectOrNull() instanceof android.widget.ProgressBar) { 
RDebugUtils.currentLine=20381706;
 //BA.debugLineNum = 20381706;BA.debugLine="Dim p As ProgressBar = i.GetView(i.NumberOfView";
_p = new anywheresoftware.b4a.objects.ProgressBarWrapper();
_p = (anywheresoftware.b4a.objects.ProgressBarWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ProgressBarWrapper(), (android.widget.ProgressBar)(_i.GetView((int) (_i.getNumberOfViews()-1)).getObject()));
RDebugUtils.currentLine=20381707;
 //BA.debugLineNum = 20381707;BA.debugLine="p.RemoveView";
_p.RemoveView();
 };
 };
RDebugUtils.currentLine=20381710;
 //BA.debugLineNum = 20381710;BA.debugLine="UpdatePlayback";
__ref._updateplayback /*String*/ (null);
RDebugUtils.currentLine=20381711;
 //BA.debugLineNum = 20381711;BA.debugLine="End Sub";
return "";
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