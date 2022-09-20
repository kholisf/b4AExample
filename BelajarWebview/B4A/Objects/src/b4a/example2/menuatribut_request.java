package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class menuatribut_request extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example2.menuatribut_request");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example2.menuatribut_request.class).invoke(this, new Object[] {null});
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
public void  _ambilbank(b4a.example2.menuatribut_request __ref) throws Exception{
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "ambilbank", false))
	 {Debug.delegate(ba, "ambilbank", null); return;}
ResumableSub_ambilBank rsub = new ResumableSub_ambilBank(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ambilBank extends BA.ResumableSub {
public ResumableSub_ambilBank(b4a.example2.menuatribut_request parent,b4a.example2.menuatribut_request __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example2.menuatribut_request __ref;
b4a.example2.menuatribut_request parent;
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
RDebugUtils.currentModule="menuatribut_request";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Try";
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
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="bankMap.Initialize";
__ref._bankmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim getBank As HttpJob";
_getbank = new b4a.example2.httpjob();
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="Dim jParser As JSONParser";
_jparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="getBank.Initialize(\"\",Me)";
_getbank._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="getBank.PostString(\"https://misterkong.com/kajek";
_getbank._poststring /*String*/ (null,"https://misterkong.com/kajek/services/_getBank.php","");
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="Wait For (getBank) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "menuatribut_request", "ambilbank"), (Object)(_getbank));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_job = (b4a.example2.httpjob) result[1];
;
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="If job.Success=True Then";
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
RDebugUtils.currentLine=6619149;
 //BA.debugLineNum = 6619149;BA.debugLine="jParser.Initialize(job.GetString)";
_jparser.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="Dim ls As List = jParser.NextArray";
_ls = new anywheresoftware.b4a.objects.collections.List();
_ls = _jparser.NextArray();
RDebugUtils.currentLine=6619151;
 //BA.debugLineNum = 6619151;BA.debugLine="For Each hs As Map In ls";
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
RDebugUtils.currentLine=6619155;
 //BA.debugLineNum = 6619155;BA.debugLine="bankMap.Put(hs.Get(\"nama_bank\"),Array As Strin";
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
RDebugUtils.currentLine=6619158;
 //BA.debugLineNum = 6619158;BA.debugLine="job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=6619160;
 //BA.debugLineNum = 6619160;BA.debugLine="Dim tmp () As String = bankMap.get(\"BCA\")";
_tmp = (String[])(__ref._bankmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("BCA")));
RDebugUtils.currentLine=6619161;
 //BA.debugLineNum = 6619161;BA.debugLine="Log(tmp(0))";
parent.__c.LogImpl("26619161",_tmp[(int) (0)],0);
RDebugUtils.currentLine=6619162;
 //BA.debugLineNum = 6619162;BA.debugLine="Log(tmp(1))";
parent.__c.LogImpl("26619162",_tmp[(int) (1)],0);
RDebugUtils.currentLine=6619163;
 //BA.debugLineNum = 6619163;BA.debugLine="lbnorek.Text = tmp(1)";
__ref._lbnorek /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tmp[(int) (1)]));
RDebugUtils.currentLine=6619164;
 //BA.debugLineNum = 6619164;BA.debugLine="lban.Text = tmp(3)";
__ref._lban /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tmp[(int) (3)]));
RDebugUtils.currentLine=6619166;
 //BA.debugLineNum = 6619166;BA.debugLine="Log(tmp(2))";
parent.__c.LogImpl("26619166",_tmp[(int) (2)],0);
RDebugUtils.currentLine=6619167;
 //BA.debugLineNum = 6619167;BA.debugLine="Log(tmp(3))";
parent.__c.LogImpl("26619167",_tmp[(int) (3)],0);
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=6619170;
 //BA.debugLineNum = 6619170;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("26619170",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=6619174;
 //BA.debugLineNum = 6619174;BA.debugLine="End Sub";
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
public String  _b4xpage_created(b4a.example2.menuatribut_request __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.PanelWrapper _p2 = null;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="dtharga.Initialize";
__ref._dtharga /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="nested.Initialize(Root)";
__ref._nested /*b4a.example2.clvnested*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="nested.base.LoadLayout(\"GlobalBody\")";
__ref._nested /*b4a.example2.clvnested*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("GlobalBody",ba);
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="nested.CLV = CLVGlob";
__ref._nested /*b4a.example2.clvnested*/ ._clv /*b4a.example3.customlistview*/  = __ref._clvglob /*b4a.example3.customlistview*/ ;
RDebugUtils.currentLine=6094876;
 //BA.debugLineNum = 6094876;BA.debugLine="Dim p As Panel = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=6094878;
 //BA.debugLineNum = 6094878;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,260di";
_p.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.DipToCurrent((int) (260)));
RDebugUtils.currentLine=6094880;
 //BA.debugLineNum = 6094880;BA.debugLine="p.LoadLayout(\"l_t1\")";
_p.LoadLayout("l_t1",ba);
RDebugUtils.currentLine=6094882;
 //BA.debugLineNum = 6094882;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,clvIn";
_p.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,(int) (__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getTop()+__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getHeight()+__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=6094883;
 //BA.debugLineNum = 6094883;BA.debugLine="p.Color = Colors.White";
_p.setColor(__c.Colors.White);
RDebugUtils.currentLine=6094886;
 //BA.debugLineNum = 6094886;BA.debugLine="p.Tag = clvInput";
_p.setTag((Object)(__ref._clvinput /*b4a.example3.customlistview*/ ));
RDebugUtils.currentLine=6094892;
 //BA.debugLineNum = 6094892;BA.debugLine="CLVGlob.Add(p,\"1\")";
__ref._clvglob /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)("1"));
RDebugUtils.currentLine=6094894;
 //BA.debugLineNum = 6094894;BA.debugLine="Dim p2 As Panel =xui.CreatePanel(\"\")";
_p2 = new anywheresoftware.b4a.objects.PanelWrapper();
_p2 = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=6094895;
 //BA.debugLineNum = 6094895;BA.debugLine="p2.SetLayout(0,0,GetDeviceLayoutValues.Width,GetD";
_p2.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
RDebugUtils.currentLine=6094896;
 //BA.debugLineNum = 6094896;BA.debugLine="p2.LoadLayout(\"l_t2\")";
_p2.LoadLayout("l_t2",ba);
RDebugUtils.currentLine=6094897;
 //BA.debugLineNum = 6094897;BA.debugLine="p2.Color = Colors.White";
_p2.setColor(__c.Colors.White);
RDebugUtils.currentLine=6094898;
 //BA.debugLineNum = 6094898;BA.debugLine="p2.SetLayout(0,0,GetDeviceLayoutValues.Width,btnC";
_p2.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,(int) (__ref._btncobalagi /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getTop()+__ref._btncobalagi /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getHeight()+__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=6094899;
 //BA.debugLineNum = 6094899;BA.debugLine="CLVGlob.Add(p2,\"2\")";
__ref._clvglob /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p2.getObject())),(Object)("2"));
RDebugUtils.currentLine=6094914;
 //BA.debugLineNum = 6094914;BA.debugLine="pnlhitam = xui.CreatePanel(\"pnlhitam\")";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlhitam").getObject()));
RDebugUtils.currentLine=6094915;
 //BA.debugLineNum = 6094915;BA.debugLine="pnlhitam.SetLayout(0,0,GetDeviceLayoutValues.Widt";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
RDebugUtils.currentLine=6094916;
 //BA.debugLineNum = 6094916;BA.debugLine="warnaTransGelap.Initialize(xui.Color_ARGB(150,0,0";
__ref._warnatransgelap /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .Initialize(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (150),(int) (0),(int) (0),(int) (0)),(int) (0));
RDebugUtils.currentLine=6094917;
 //BA.debugLineNum = 6094917;BA.debugLine="pnlhitam.Background=warnaTransGelap";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._warnatransgelap /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
RDebugUtils.currentLine=6094918;
 //BA.debugLineNum = 6094918;BA.debugLine="ambilBank";
__ref._ambilbank /*void*/ (null);
RDebugUtils.currentLine=6094923;
 //BA.debugLineNum = 6094923;BA.debugLine="getdataAtribut";
__ref._getdataatribut /*void*/ (null);
RDebugUtils.currentLine=6094924;
 //BA.debugLineNum = 6094924;BA.debugLine="End Sub";
return "";
}
public void  _getdataatribut(b4a.example2.menuatribut_request __ref) throws Exception{
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "getdataatribut", false))
	 {Debug.delegate(ba, "getdataatribut", null); return;}
ResumableSub_getdataAtribut rsub = new ResumableSub_getdataAtribut(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_getdataAtribut extends BA.ResumableSub {
public ResumableSub_getdataAtribut(b4a.example2.menuatribut_request parent,b4a.example2.menuatribut_request __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example2.menuatribut_request __ref;
b4a.example2.menuatribut_request parent;
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
RDebugUtils.currentModule="menuatribut_request";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6553614;
 //BA.debugLineNum = 6553614;BA.debugLine="Dim hargapost As HttpJob";
_hargapost = new b4a.example2.httpjob();
RDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="hargapost.Initialize(\"\",Me)";
_hargapost._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=6553616;
 //BA.debugLineNum = 6553616;BA.debugLine="hargapost.PostString(\"https://misterkong.com/kong";
_hargapost._poststring /*String*/ (null,"https://misterkong.com/kong_api/api_rider/list",("imei="+parent.__c.SmartStringFormatter("",(Object)(parent._main._imei /*String*/ ))+""));
RDebugUtils.currentLine=6553622;
 //BA.debugLineNum = 6553622;BA.debugLine="Wait For (hargapost)JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "menuatribut_request", "getdataatribut"), (Object)(_hargapost));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_job = (b4a.example2.httpjob) result[1];
;
RDebugUtils.currentLine=6553623;
 //BA.debugLineNum = 6553623;BA.debugLine="If job.Success Then";
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
RDebugUtils.currentLine=6553624;
 //BA.debugLineNum = 6553624;BA.debugLine="Log	(job.GetString)";
parent.__c.LogImpl("26553624",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=6553625;
 //BA.debugLineNum = 6553625;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6553626;
 //BA.debugLineNum = 6553626;BA.debugLine="Dim ls As List";
_ls = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6553627;
 //BA.debugLineNum = 6553627;BA.debugLine="jp.Initialize(job.GetString)";
_jp.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=6553628;
 //BA.debugLineNum = 6553628;BA.debugLine="ls = jp.NextObject.Get(\"data\").As(List)";
_ls = ((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jp.NextObject().Get((Object)("data")))));
RDebugUtils.currentLine=6553630;
 //BA.debugLineNum = 6553630;BA.debugLine="Log(\"att\"&ls.Get(0).As(Map).Get(\"id\"))";
parent.__c.LogImpl("26553630","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (0))))).Get((Object)("id"))),0);
RDebugUtils.currentLine=6553631;
 //BA.debugLineNum = 6553631;BA.debugLine="Log(\"att\"&ls.Get(1).As(Map).Get(\"id\"))";
parent.__c.LogImpl("26553631","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (1))))).Get((Object)("id"))),0);
RDebugUtils.currentLine=6553632;
 //BA.debugLineNum = 6553632;BA.debugLine="Log(\"att\"&ls.Get(2).As(Map).Get(\"id\"))";
parent.__c.LogImpl("26553632","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (2))))).Get((Object)("id"))),0);
RDebugUtils.currentLine=6553633;
 //BA.debugLineNum = 6553633;BA.debugLine="Dim tl As Int =1";
_tl = (int) (1);
RDebugUtils.currentLine=6553634;
 //BA.debugLineNum = 6553634;BA.debugLine="For Each ii As Map In ls";
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
RDebugUtils.currentLine=6553636;
 //BA.debugLineNum = 6553636;BA.debugLine="dtharga = CreateMap(\"att\"&tl:ii)";
__ref._dtharga /*anywheresoftware.b4a.objects.collections.Map*/  = parent.__c.createMap(new Object[] {(Object)("att"+BA.NumberToString(_tl)),(Object)(_ii.getObject())});
RDebugUtils.currentLine=6553637;
 //BA.debugLineNum = 6553637;BA.debugLine="tl = tl +1";
_tl = (int) (_tl+1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=6553649;
 //BA.debugLineNum = 6553649;BA.debugLine="For Each dt As Map In ls";

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
RDebugUtils.currentLine=6553650;
 //BA.debugLineNum = 6553650;BA.debugLine="Dim ppp As Panel  = xui.CreatePanel(\"\")";
_ppp = new anywheresoftware.b4a.objects.PanelWrapper();
_ppp = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=6553651;
 //BA.debugLineNum = 6553651;BA.debugLine="ppp.SetLayout(0,0,clvInput.AsView.Width,80dip)";
_ppp.SetLayout((int) (0),(int) (0),__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getWidth(),parent.__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=6553652;
 //BA.debugLineNum = 6553652;BA.debugLine="ppp.LoadLayout(\"l_TemplateAtribut\")";
_ppp.LoadLayout("l_TemplateAtribut",ba);
RDebugUtils.currentLine=6553653;
 //BA.debugLineNum = 6553653;BA.debugLine="ppp.SetLayout(0,0,clvInput.AsView.Width,lblDesk";
_ppp.SetLayout((int) (0),(int) (0),__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getWidth(),(int) (__ref._lbldeskripsi /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop()+__ref._lbldeskripsi /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()));
RDebugUtils.currentLine=6553655;
 //BA.debugLineNum = 6553655;BA.debugLine="lblTitle.Text = dt.Get(\"nama\")";
__ref._lbltitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_dt.Get((Object)("nama"))));
RDebugUtils.currentLine=6553656;
 //BA.debugLineNum = 6553656;BA.debugLine="Panel1.Elevation = 10dip";
__ref._panel1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setElevation((float) (parent.__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=6553657;
 //BA.debugLineNum = 6553657;BA.debugLine="lblDeskripsi.Text = dt.Get(\"keterangan\")&CRLF&\"";
__ref._lbldeskripsi /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.ObjectToString(_dt.Get((Object)("keterangan")))+parent.__c.CRLF+"harga :  Rp."+parent.__c.NumberFormat((double)(BA.ObjectToNumber(_dt.Get((Object)("harga_jual")))),(int) (0),(int) (0))));
RDebugUtils.currentLine=6553659;
 //BA.debugLineNum = 6553659;BA.debugLine="clvInput.Add(ppp,dt)";
__ref._clvinput /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ppp.getObject())),(Object)(_dt.getObject()));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=6553665;
 //BA.debugLineNum = 6553665;BA.debugLine="Log(\" clvAwal.Size : \" &clvInput.Size)";
parent.__c.LogImpl("26553665"," clvAwal.Size : "+BA.NumberToString(__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()),0);
RDebugUtils.currentLine=6553667;
 //BA.debugLineNum = 6553667;BA.debugLine="Log(dtharga)";
parent.__c.LogImpl("26553667",BA.ObjectToString(__ref._dtharga /*anywheresoftware.b4a.objects.collections.Map*/ ),0);
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=6553718;
 //BA.debugLineNum = 6553718;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btncobalagi_click(b4a.example2.menuatribut_request __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "btncobalagi_click", false))
	 {return ((String) Debug.delegate(ba, "btncobalagi_click", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub btnCobaLagi_Click";
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4a.example2.menuatribut_request __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
b4a.example2.v4 _b4 = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim b4 As v4";
_b4 = new b4a.example2.v4();
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="b4.Initialize";
_b4._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="B4XPages.AddPage(\"v4\",b4)";
_b4xpages._addpage /*String*/ (ba,"v4",(Object)(_b4));
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="B4XPages.ShowPage(\"v4\")";
_b4xpages._showpage /*String*/ (ba,"v4");
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example2.menuatribut_request __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Private CLVGlob As CustomListView";
_clvglob = new b4a.example3.customlistview();
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="Dim pnlhitam,pnlputih,pnltampung As Panel";
_pnlhitam = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlputih = new anywheresoftware.b4a.objects.PanelWrapper();
_pnltampung = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="Dim warnaTransGelap As ColorDrawable";
_warnatransgelap = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=5963785;
 //BA.debugLineNum = 5963785;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="Private lblKamera As Label";
_lblkamera = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="Private btnCobaLagi As Button";
_btncobalagi = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="Private clvInput As CustomListView";
_clvinput = new b4a.example3.customlistview();
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="Private lban As Label";
_lban = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963790;
 //BA.debugLineNum = 5963790;BA.debugLine="Private lbnorek As Label";
_lbnorek = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963791;
 //BA.debugLineNum = 5963791;BA.debugLine="Private lblTotalHarga As Label";
_lbltotalharga = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963792;
 //BA.debugLineNum = 5963792;BA.debugLine="Private txtAlamat As EditText";
_txtalamat = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=5963794;
 //BA.debugLineNum = 5963794;BA.debugLine="Private ivBarang As ImageView";
_ivbarang = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=5963795;
 //BA.debugLineNum = 5963795;BA.debugLine="Private lblDeskripsi As Label";
_lbldeskripsi = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963796;
 //BA.debugLineNum = 5963796;BA.debugLine="Private lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963797;
 //BA.debugLineNum = 5963797;BA.debugLine="Dim dtharga As Map";
_dtharga = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5963798;
 //BA.debugLineNum = 5963798;BA.debugLine="Dim bankMap As Map";
_bankmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5963799;
 //BA.debugLineNum = 5963799;BA.debugLine="Private lblTambah As Label";
_lbltambah = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963800;
 //BA.debugLineNum = 5963800;BA.debugLine="Private lblJml As Label";
_lbljml = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963801;
 //BA.debugLineNum = 5963801;BA.debugLine="Private lblMin As Label";
_lblmin = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963802;
 //BA.debugLineNum = 5963802;BA.debugLine="Private lblPlus As Label";
_lblplus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5963803;
 //BA.debugLineNum = 5963803;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=5963804;
 //BA.debugLineNum = 5963804;BA.debugLine="Dim nested As CLVNested";
_nested = new b4a.example2.clvnested();
RDebugUtils.currentLine=5963805;
 //BA.debugLineNum = 5963805;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5963806;
 //BA.debugLineNum = 5963806;BA.debugLine="End Sub";
return "";
}
public String  _clvglob_itemclick(b4a.example2.menuatribut_request __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "clvglob_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvglob_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub CLVGlob_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Log(\"test\")";
__c.LogImpl("26488065","test",0);
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(b4a.example2.menuatribut_request __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return null;
}
public String  _ivbarang_click(b4a.example2.menuatribut_request __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "ivbarang_click", false))
	 {return ((String) Debug.delegate(ba, "ivbarang_click", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub ivBarang_Click";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Log(\"ivBarang_Click\")";
__c.LogImpl("26946817","ivBarang_Click",0);
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return "";
}
public String  _ivbarang_longclick(b4a.example2.menuatribut_request __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "ivbarang_longclick", false))
	 {return ((String) Debug.delegate(ba, "ivbarang_longclick", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub ivBarang_LongClick";
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.example2.menuatribut_request __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="End Sub";
return "";
}
public String  _lblkamera_click(b4a.example2.menuatribut_request __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "lblkamera_click", false))
	 {return ((String) Debug.delegate(ba, "lblkamera_click", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub lblKamera_Click";
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return "";
}
public String  _lblmin_click(b4a.example2.menuatribut_request __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "lblmin_click", false))
	 {return ((String) Debug.delegate(ba, "lblmin_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub lblMin_Click";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim lblt As Label  = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))-1));
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="If lblt.Parent.As(B4XView).GetView(2).Tag.As(Int)";
if (((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))==0) { 
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (1)).setVisible(__c.False);
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setVisible(__c.False);
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (3)).setVisible(__c.False);
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="lblt.Parent.As(B4XView).GetView(0).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (0)).setVisible(__c.True);
 };
RDebugUtils.currentLine=6750220;
 //BA.debugLineNum = 6750220;BA.debugLine="End Sub";
return "";
}
public String  _lblplus_click(b4a.example2.menuatribut_request __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "lblplus_click", false))
	 {return ((String) Debug.delegate(ba, "lblplus_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub lblPlus_Click";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim lblt As Label  = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))+1));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="End Sub";
return "";
}
public String  _lbltambah_click(b4a.example2.menuatribut_request __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "lbltambah_click", false))
	 {return ((String) Debug.delegate(ba, "lbltambah_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub lblTambah_Click";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Log(\"Klik\")";
__c.LogImpl("26815745","Klik",0);
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Dim lblt As Label = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="lblt.Visible = False";
_lblt.setVisible(__c.False);
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (1)).setVisible(__c.True);
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setVisible(__c.True);
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (3)).setVisible(__c.True);
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))+1));
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
RDebugUtils.currentLine=6815759;
 //BA.debugLineNum = 6815759;BA.debugLine="End Sub";
return "";
}
public String  _txtalamat_focuschanged(b4a.example2.menuatribut_request __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuatribut_request";
if (Debug.shouldDelegate(ba, "txtalamat_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "txtalamat_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub txtAlamat_FocusChanged (HasFocus As Bo";
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
}