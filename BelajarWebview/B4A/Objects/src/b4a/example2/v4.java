package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class v4 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example2.v4");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example3.customlistview _clvglob = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlhitam = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlputih = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltampung = null;
public anywheresoftware.b4a.objects.drawable.ColorDrawable _warnatransgelap = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblkamera = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncobalagi = null;
public b4a.example3.customlistview _clvinput = null;
public anywheresoftware.b4a.objects.LabelWrapper _lban = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbnorek = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalharga = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtalamat = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivbarang = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldeskripsi = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.collections.Map _dtharga = null;
public anywheresoftware.b4a.objects.collections.Map _bankmap = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltambah = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbljml = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmin = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblplus = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public b4a.example2.clvnested _nested = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example2.main _main = null;
public b4a.example2.starter _starter = null;
public b4a.example2.b4xpages _b4xpages = null;
public b4a.example2.b4xcollections _b4xcollections = null;
public b4a.example2.httputils2service _httputils2service = null;
public b4a.example2.xuiviewsutils _xuiviewsutils = null;
public void  _ambilbank(b4a.example2.v4 __ref) throws Exception{
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "ambilbank", false))
	 {Debug.delegate(ba, "ambilbank", null); return;}
ResumableSub_ambilBank rsub = new ResumableSub_ambilBank(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ambilBank extends BA.ResumableSub {
public ResumableSub_ambilBank(b4a.example2.v4 parent,b4a.example2.v4 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example2.v4 __ref;
b4a.example2.v4 parent;
b4a.example2.httpjob _getbank = null;
anywheresoftware.b4a.objects.collections.JSONParser _jparser = null;
b4a.example2.httpjob _job = null;
anywheresoftware.b4a.objects.collections.List _ls = null;
anywheresoftware.b4a.objects.collections.Map _hs = null;
String[] _tmp = null;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="v4";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="bankMap.Initialize";
__ref._bankmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="Dim getBank As HttpJob";
_getbank = new b4a.example2.httpjob();
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="Dim jParser As JSONParser";
_jparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="getBank.Initialize(\"\",Me)";
_getbank._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="getBank.PostString(\"https://misterkong.com/kajek";
_getbank._poststring /*String*/ (null,"https://misterkong.com/kajek/services/_getBank.php","");
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="Wait For (getBank) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "v4", "ambilbank"), (Object)(_getbank));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_job = (b4a.example2.httpjob) result[1];
;
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="If job.Success=True Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_job._success /*boolean*/ ==parent.__c.True) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="jParser.Initialize(job.GetString)";
_jparser.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="Dim ls As List = jParser.NextArray";
_ls = new anywheresoftware.b4a.objects.collections.List();
_ls = _jparser.NextArray();
RDebugUtils.currentLine=5570575;
 //BA.debugLineNum = 5570575;BA.debugLine="For Each hs As Map In ls";
if (true) break;

case 7:
//for
this.state = 10;
_hs = new anywheresoftware.b4a.objects.collections.Map();
group11 = _ls;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 10;
if (index11 < groupLen11) {
this.state = 9;
_hs = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group11.Get(index11)));}
if (true) break;

case 17:
//C
this.state = 16;
index11++;
if (true) break;

case 9:
//C
this.state = 17;
RDebugUtils.currentLine=5570579;
 //BA.debugLineNum = 5570579;BA.debugLine="bankMap.Put(hs.Get(\"nama_bank\"),Array As Strin";
__ref._bankmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_hs.Get((Object)("nama_bank")),(Object)(new String[]{BA.ObjectToString(_hs.Get((Object)("kd_bank_kong"))),BA.ObjectToString(_hs.Get((Object)("no_rekening"))),BA.ObjectToString(_hs.Get((Object)("nama_bank"))),BA.ObjectToString(_hs.Get((Object)("atas_nama")))}));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 14;
;
RDebugUtils.currentLine=5570582;
 //BA.debugLineNum = 5570582;BA.debugLine="job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=5570584;
 //BA.debugLineNum = 5570584;BA.debugLine="Dim tmp () As String = bankMap.get(\"BCA\")";
_tmp = (String[])(__ref._bankmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("BCA")));
RDebugUtils.currentLine=5570585;
 //BA.debugLineNum = 5570585;BA.debugLine="Log(tmp(0))";
parent.__c.LogImpl("25570585",_tmp[(int) (0)],0);
RDebugUtils.currentLine=5570586;
 //BA.debugLineNum = 5570586;BA.debugLine="Log(tmp(1))";
parent.__c.LogImpl("25570586",_tmp[(int) (1)],0);
RDebugUtils.currentLine=5570587;
 //BA.debugLineNum = 5570587;BA.debugLine="lbnorek.Text = tmp(1)";
__ref._lbnorek /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tmp[(int) (1)]));
RDebugUtils.currentLine=5570588;
 //BA.debugLineNum = 5570588;BA.debugLine="lban.Text = tmp(3)";
__ref._lban /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tmp[(int) (3)]));
RDebugUtils.currentLine=5570590;
 //BA.debugLineNum = 5570590;BA.debugLine="Log(tmp(2))";
parent.__c.LogImpl("25570590",_tmp[(int) (2)],0);
RDebugUtils.currentLine=5570591;
 //BA.debugLineNum = 5570591;BA.debugLine="Log(tmp(3))";
parent.__c.LogImpl("25570591",_tmp[(int) (3)],0);
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=5570594;
 //BA.debugLineNum = 5570594;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("25570594",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=5570598;
 //BA.debugLineNum = 5570598;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _b4xpage_created(b4a.example2.v4 __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="dtharga.Initialize";
__ref._dtharga /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="B4XPages.SetTitle(Me,\"v4\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("v4"));
RDebugUtils.currentLine=5046298;
 //BA.debugLineNum = 5046298;BA.debugLine="Root.LoadLayout(\"GlobalBody\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("GlobalBody",ba);
RDebugUtils.currentLine=5046301;
 //BA.debugLineNum = 5046301;BA.debugLine="Dim p As Panel = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=5046302;
 //BA.debugLineNum = 5046302;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,GetDe";
_p.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
RDebugUtils.currentLine=5046306;
 //BA.debugLineNum = 5046306;BA.debugLine="p.LoadLayout(\"l_atributRequest\")";
_p.LoadLayout("l_atributRequest",ba);
RDebugUtils.currentLine=5046307;
 //BA.debugLineNum = 5046307;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,btnCo";
_p.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,(int) (__ref._btncobalagi /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTop()+__ref._btncobalagi /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getHeight()+__c.DipToCurrent((int) (50))));
RDebugUtils.currentLine=5046309;
 //BA.debugLineNum = 5046309;BA.debugLine="p.Color = Colors.White";
_p.setColor(__c.Colors.White);
RDebugUtils.currentLine=5046312;
 //BA.debugLineNum = 5046312;BA.debugLine="p.Tag = clvInput";
_p.setTag((Object)(__ref._clvinput /*b4a.example3.customlistview*/ ));
RDebugUtils.currentLine=5046318;
 //BA.debugLineNum = 5046318;BA.debugLine="CLVGlob.Add(p,\"1\")";
__ref._clvglob /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)("1"));
RDebugUtils.currentLine=5046340;
 //BA.debugLineNum = 5046340;BA.debugLine="pnlhitam = xui.CreatePanel(\"pnlhitam\")";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlhitam").getObject()));
RDebugUtils.currentLine=5046341;
 //BA.debugLineNum = 5046341;BA.debugLine="pnlhitam.SetLayout(0,0,GetDeviceLayoutValues.Widt";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
RDebugUtils.currentLine=5046342;
 //BA.debugLineNum = 5046342;BA.debugLine="warnaTransGelap.Initialize(xui.Color_ARGB(150,0,0";
__ref._warnatransgelap /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .Initialize(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (150),(int) (0),(int) (0),(int) (0)),(int) (0));
RDebugUtils.currentLine=5046343;
 //BA.debugLineNum = 5046343;BA.debugLine="pnlhitam.Background=warnaTransGelap";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._warnatransgelap /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
RDebugUtils.currentLine=5046344;
 //BA.debugLineNum = 5046344;BA.debugLine="ambilBank";
__ref._ambilbank /*void*/ (null);
RDebugUtils.currentLine=5046349;
 //BA.debugLineNum = 5046349;BA.debugLine="getdataAtribut";
__ref._getdataatribut /*void*/ (null);
RDebugUtils.currentLine=5046350;
 //BA.debugLineNum = 5046350;BA.debugLine="End Sub";
return "";
}
public void  _getdataatribut(b4a.example2.v4 __ref) throws Exception{
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "getdataatribut", false))
	 {Debug.delegate(ba, "getdataatribut", null); return;}
ResumableSub_getdataAtribut rsub = new ResumableSub_getdataAtribut(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_getdataAtribut extends BA.ResumableSub {
public ResumableSub_getdataAtribut(b4a.example2.v4 parent,b4a.example2.v4 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example2.v4 __ref;
b4a.example2.v4 parent;
b4a.example2.httpjob _hargapost = null;
b4a.example2.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.List _ls = null;
int _tl = 0;
anywheresoftware.b4a.objects.collections.Map _ii = null;
anywheresoftware.b4a.objects.collections.Map _dt = null;
anywheresoftware.b4a.objects.PanelWrapper _ppp = null;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;
anywheresoftware.b4a.BA.IterableList group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="v4";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="Dim hargapost As HttpJob";
_hargapost = new b4a.example2.httpjob();
RDebugUtils.currentLine=5505039;
 //BA.debugLineNum = 5505039;BA.debugLine="hargapost.Initialize(\"\",Me)";
_hargapost._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="hargapost.PostString(\"https://misterkong.com/kong";
_hargapost._poststring /*String*/ (null,"https://misterkong.com/kong_api/api_rider/list",("imei="+parent.__c.SmartStringFormatter("",(Object)(parent._main._imei /*String*/ ))+""));
RDebugUtils.currentLine=5505046;
 //BA.debugLineNum = 5505046;BA.debugLine="Wait For (hargapost)JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "v4", "getdataatribut"), (Object)(_hargapost));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_job = (b4a.example2.httpjob) result[1];
;
RDebugUtils.currentLine=5505047;
 //BA.debugLineNum = 5505047;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 11;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5505048;
 //BA.debugLineNum = 5505048;BA.debugLine="Log	(job.GetString)";
parent.__c.LogImpl("25505048",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=5505049;
 //BA.debugLineNum = 5505049;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5505050;
 //BA.debugLineNum = 5505050;BA.debugLine="Dim ls As List";
_ls = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5505051;
 //BA.debugLineNum = 5505051;BA.debugLine="jp.Initialize(job.GetString)";
_jp.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=5505052;
 //BA.debugLineNum = 5505052;BA.debugLine="ls = jp.NextObject.Get(\"data\").As(List)";
_ls = ((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jp.NextObject().Get((Object)("data")))));
RDebugUtils.currentLine=5505054;
 //BA.debugLineNum = 5505054;BA.debugLine="Log(\"att\"&ls.Get(0).As(Map).Get(\"id\"))";
parent.__c.LogImpl("25505054","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (0))))).Get((Object)("id"))),0);
RDebugUtils.currentLine=5505055;
 //BA.debugLineNum = 5505055;BA.debugLine="Log(\"att\"&ls.Get(1).As(Map).Get(\"id\"))";
parent.__c.LogImpl("25505055","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (1))))).Get((Object)("id"))),0);
RDebugUtils.currentLine=5505056;
 //BA.debugLineNum = 5505056;BA.debugLine="Log(\"att\"&ls.Get(2).As(Map).Get(\"id\"))";
parent.__c.LogImpl("25505056","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (2))))).Get((Object)("id"))),0);
RDebugUtils.currentLine=5505057;
 //BA.debugLineNum = 5505057;BA.debugLine="Dim tl As Int =1";
_tl = (int) (1);
RDebugUtils.currentLine=5505058;
 //BA.debugLineNum = 5505058;BA.debugLine="For Each ii As Map In ls";
if (true) break;

case 4:
//for
this.state = 7;
_ii = new anywheresoftware.b4a.objects.collections.Map();
group15 = _ls;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index15 < groupLen15) {
this.state = 6;
_ii = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group15.Get(index15)));}
if (true) break;

case 14:
//C
this.state = 13;
index15++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=5505060;
 //BA.debugLineNum = 5505060;BA.debugLine="dtharga = CreateMap(\"att\"&tl:ii)";
__ref._dtharga /*anywheresoftware.b4a.objects.collections.Map*/  = parent.__c.createMap(new Object[] {(Object)("att"+BA.NumberToString(_tl)),(Object)(_ii.getObject())});
RDebugUtils.currentLine=5505061;
 //BA.debugLineNum = 5505061;BA.debugLine="tl = tl +1";
_tl = (int) (_tl+1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=5505073;
 //BA.debugLineNum = 5505073;BA.debugLine="For Each dt As Map In ls";

case 7:
//for
this.state = 10;
_dt = new anywheresoftware.b4a.objects.collections.Map();
group19 = _ls;
index19 = 0;
groupLen19 = group19.getSize();
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if (index19 < groupLen19) {
this.state = 9;
_dt = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group19.Get(index19)));}
if (true) break;

case 16:
//C
this.state = 15;
index19++;
if (true) break;

case 9:
//C
this.state = 16;
RDebugUtils.currentLine=5505074;
 //BA.debugLineNum = 5505074;BA.debugLine="Dim ppp As Panel  = xui.CreatePanel(\"\")";
_ppp = new anywheresoftware.b4a.objects.PanelWrapper();
_ppp = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=5505075;
 //BA.debugLineNum = 5505075;BA.debugLine="ppp.SetLayout(0,0,clvInput.AsView.Width,80dip)";
_ppp.SetLayout((int) (0),(int) (0),__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getWidth(),parent.__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=5505076;
 //BA.debugLineNum = 5505076;BA.debugLine="ppp.LoadLayout(\"l_TemplateAtribut\")";
_ppp.LoadLayout("l_TemplateAtribut",ba);
RDebugUtils.currentLine=5505077;
 //BA.debugLineNum = 5505077;BA.debugLine="ppp.SetLayout(0,0,clvInput.AsView.Width,lblDesk";
_ppp.SetLayout((int) (0),(int) (0),__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getWidth(),(int) (__ref._lbldeskripsi /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop()+__ref._lbldeskripsi /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()));
RDebugUtils.currentLine=5505079;
 //BA.debugLineNum = 5505079;BA.debugLine="lblTitle.Text = dt.Get(\"nama\")";
__ref._lbltitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_dt.Get((Object)("nama"))));
RDebugUtils.currentLine=5505080;
 //BA.debugLineNum = 5505080;BA.debugLine="Panel1.Elevation = 10dip";
__ref._panel1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setElevation((float) (parent.__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=5505081;
 //BA.debugLineNum = 5505081;BA.debugLine="lblDeskripsi.Text = dt.Get(\"keterangan\")&CRLF&\"";
__ref._lbldeskripsi /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.ObjectToString(_dt.Get((Object)("keterangan")))+parent.__c.CRLF+"harga :  Rp."+parent.__c.NumberFormat((double)(BA.ObjectToNumber(_dt.Get((Object)("harga_jual")))),(int) (0),(int) (0))));
RDebugUtils.currentLine=5505083;
 //BA.debugLineNum = 5505083;BA.debugLine="clvInput.Add(ppp,dt)";
__ref._clvinput /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ppp.getObject())),(Object)(_dt.getObject()));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=5505089;
 //BA.debugLineNum = 5505089;BA.debugLine="Log(\" clvAwal.Size : \" &clvInput.Size)";
parent.__c.LogImpl("25505089"," clvAwal.Size : "+BA.NumberToString(__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()),0);
RDebugUtils.currentLine=5505091;
 //BA.debugLineNum = 5505091;BA.debugLine="Log(dtharga)";
parent.__c.LogImpl("25505091",BA.ObjectToString(__ref._dtharga /*anywheresoftware.b4a.objects.collections.Map*/ ),0);
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=5505142;
 //BA.debugLineNum = 5505142;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btncobalagi_click(b4a.example2.v4 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "btncobalagi_click", false))
	 {return ((String) Debug.delegate(ba, "btncobalagi_click", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub btnCobaLagi_Click";
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4a.example2.v4 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
b4a.example2.v2 _b3 = null;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim b3 As V2";
_b3 = new b4a.example2.v2();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="b3.Initialize";
_b3._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="B4XPages.AddPage(\"v3\",b3)";
_b4xpages._addpage /*String*/ (ba,"v3",(Object)(_b3));
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="B4XPages.ShowPage(\"v3\")";
_b4xpages._showpage /*String*/ (ba,"v3");
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example2.v4 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Private CLVGlob As CustomListView";
_clvglob = new b4a.example3.customlistview();
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="Dim pnlhitam,pnlputih,pnltampung As Panel";
_pnlhitam = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlputih = new anywheresoftware.b4a.objects.PanelWrapper();
_pnltampung = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Dim warnaTransGelap As ColorDrawable";
_warnatransgelap = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="Private lblKamera As Label";
_lblkamera = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="Private btnCobaLagi As Button";
_btncobalagi = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="Private clvInput As CustomListView";
_clvinput = new b4a.example3.customlistview();
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="Private lban As Label";
_lban = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="Private lbnorek As Label";
_lbnorek = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="Private lblTotalHarga As Label";
_lbltotalharga = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="Private txtAlamat As EditText";
_txtalamat = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4915218;
 //BA.debugLineNum = 4915218;BA.debugLine="Private ivBarang As ImageView";
_ivbarang = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4915219;
 //BA.debugLineNum = 4915219;BA.debugLine="Private lblDeskripsi As Label";
_lbldeskripsi = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915220;
 //BA.debugLineNum = 4915220;BA.debugLine="Private lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="Dim dtharga As Map";
_dtharga = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4915222;
 //BA.debugLineNum = 4915222;BA.debugLine="Dim bankMap As Map";
_bankmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4915223;
 //BA.debugLineNum = 4915223;BA.debugLine="Private lblTambah As Label";
_lbltambah = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915224;
 //BA.debugLineNum = 4915224;BA.debugLine="Private lblJml As Label";
_lbljml = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915225;
 //BA.debugLineNum = 4915225;BA.debugLine="Private lblMin As Label";
_lblmin = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915226;
 //BA.debugLineNum = 4915226;BA.debugLine="Private lblPlus As Label";
_lblplus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915227;
 //BA.debugLineNum = 4915227;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=4915228;
 //BA.debugLineNum = 4915228;BA.debugLine="Dim nested As CLVNested";
_nested = new b4a.example2.clvnested();
RDebugUtils.currentLine=4915229;
 //BA.debugLineNum = 4915229;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4915230;
 //BA.debugLineNum = 4915230;BA.debugLine="End Sub";
return "";
}
public String  _clvglob_itemclick(b4a.example2.v4 __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "clvglob_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvglob_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub CLVGlob_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Log(\"test\")";
__c.LogImpl("25439489","test",0);
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(b4a.example2.v4 __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return null;
}
public String  _ivbarang_click(b4a.example2.v4 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "ivbarang_click", false))
	 {return ((String) Debug.delegate(ba, "ivbarang_click", null));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub ivBarang_Click";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Log(\"ivBarang_Click\")";
__c.LogImpl("25898241","ivBarang_Click",0);
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="End Sub";
return "";
}
public String  _ivbarang_longclick(b4a.example2.v4 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "ivbarang_longclick", false))
	 {return ((String) Debug.delegate(ba, "ivbarang_longclick", null));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub ivBarang_LongClick";
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.example2.v4 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public String  _lblkamera_click(b4a.example2.v4 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "lblkamera_click", false))
	 {return ((String) Debug.delegate(ba, "lblkamera_click", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub lblKamera_Click";
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public String  _lblmin_click(b4a.example2.v4 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "lblmin_click", false))
	 {return ((String) Debug.delegate(ba, "lblmin_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub lblMin_Click";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim lblt As Label  = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))-1));
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="If lblt.Parent.As(B4XView).GetView(2).Tag.As(Int)";
if (((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))==0) { 
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (1)).setVisible(__c.False);
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setVisible(__c.False);
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (3)).setVisible(__c.False);
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="lblt.Parent.As(B4XView).GetView(0).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (0)).setVisible(__c.True);
 };
RDebugUtils.currentLine=5701644;
 //BA.debugLineNum = 5701644;BA.debugLine="End Sub";
return "";
}
public String  _lblplus_click(b4a.example2.v4 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "lblplus_click", false))
	 {return ((String) Debug.delegate(ba, "lblplus_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub lblPlus_Click";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim lblt As Label  = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))+1));
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="End Sub";
return "";
}
public String  _lbltambah_click(b4a.example2.v4 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "lbltambah_click", false))
	 {return ((String) Debug.delegate(ba, "lbltambah_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub lblTambah_Click";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Log(\"Klik\")";
__c.LogImpl("25767169","Klik",0);
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Dim lblt As Label = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="lblt.Visible = False";
_lblt.setVisible(__c.False);
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (1)).setVisible(__c.True);
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setVisible(__c.True);
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (3)).setVisible(__c.True);
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))+1));
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
RDebugUtils.currentLine=5767183;
 //BA.debugLineNum = 5767183;BA.debugLine="End Sub";
return "";
}
public String  _txtalamat_focuschanged(b4a.example2.v4 __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="v4";
if (Debug.shouldDelegate(ba, "txtalamat_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "txtalamat_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub txtAlamat_FocusChanged (HasFocus As Bo";
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
}