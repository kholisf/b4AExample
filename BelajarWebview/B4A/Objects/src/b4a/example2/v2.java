package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class v2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example2.v2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example2.v2.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _pnltmpclv = null;
public b4a.example2.b4xdialog _dl = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pd = null;
public anywheresoftware.b4a.objects.collections.Map _dtpembelian = null;
public b4a.example3.customlistview _clvdialog = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivbarang2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldeskripsi2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltambah2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmin2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbljml2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblplus2 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example2.main _main = null;
public b4a.example2.starter _starter = null;
public b4a.example2.b4xpages _b4xpages = null;
public b4a.example2.b4xcollections _b4xcollections = null;
public b4a.example2.httputils2service _httputils2service = null;
public b4a.example2.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example2.v2 __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return null;
}
public String  _addtoclvinput(b4a.example2.v2 __ref,anywheresoftware.b4a.objects.collections.Map _dt,int _jumlah) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "addtoclvinput", false))
	 {return ((String) Debug.delegate(ba, "addtoclvinput", new Object[] {_dt,_jumlah}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=43384832;
 //BA.debugLineNum = 43384832;BA.debugLine="Sub AddToCLVInput (dt As Map,jumlah As Int)";
RDebugUtils.currentLine=43384834;
 //BA.debugLineNum = 43384834;BA.debugLine="Dim pnl As Panel =xui.CreatePanel(\"pnl\")";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl").getObject()));
RDebugUtils.currentLine=43384835;
 //BA.debugLineNum = 43384835;BA.debugLine="pnl.SetLayout(0,0,clvInput.AsView.Width,130dip)";
_pnl.SetLayout((int) (0),(int) (0),__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (130)));
RDebugUtils.currentLine=43384836;
 //BA.debugLineNum = 43384836;BA.debugLine="pnl.LoadLayout(\"l_tampilanatrribut2\")";
_pnl.LoadLayout("l_tampilanatrribut2",ba);
RDebugUtils.currentLine=43384838;
 //BA.debugLineNum = 43384838;BA.debugLine="lblTitle2.Text = dt.Get(\"nama\")";
__ref._lbltitle2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_dt.Get((Object)("nama"))));
RDebugUtils.currentLine=43384839;
 //BA.debugLineNum = 43384839;BA.debugLine="Panel12.Elevation = 10dip";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setElevation((float) (__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=43384840;
 //BA.debugLineNum = 43384840;BA.debugLine="lblDeskripsi2.Text = dt.Get(\"keterangan\")&CRLF&\"h";
__ref._lbldeskripsi2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.ObjectToString(_dt.Get((Object)("keterangan")))+__c.CRLF+"harga :  Rp."+__c.NumberFormat((double)(BA.ObjectToNumber(_dt.Get((Object)("harga_jual")))),(int) (0),(int) (0))));
RDebugUtils.currentLine=43384841;
 //BA.debugLineNum = 43384841;BA.debugLine="lblJml2.Text = jumlah";
__ref._lbljml2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_jumlah));
RDebugUtils.currentLine=43384842;
 //BA.debugLineNum = 43384842;BA.debugLine="lblJml2.Tag = jumlah";
__ref._lbljml2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_jumlah));
RDebugUtils.currentLine=43384843;
 //BA.debugLineNum = 43384843;BA.debugLine="pnl.SetLayout(0,0,clvInput.AsView.Width,Panel12.T";
_pnl.SetLayout((int) (0),(int) (0),__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getWidth(),(int) (__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=43384844;
 //BA.debugLineNum = 43384844;BA.debugLine="clvInput.InsertAt(clvInput.Size - 1,pnl,dt)";
__ref._clvinput /*b4a.example3.customlistview*/ ._insertat((int) (__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()-1),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnl.getObject())),(Object)(_dt.getObject()));
RDebugUtils.currentLine=43384846;
 //BA.debugLineNum = 43384846;BA.debugLine="clvInput.AsView.Height = 	clvInput.AsView.Height+";
__ref._clvinput /*b4a.example3.customlistview*/ ._asview().setHeight((int) (__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getHeight()+__c.DipToCurrent((int) (130))));
RDebugUtils.currentLine=43384847;
 //BA.debugLineNum = 43384847;BA.debugLine="clvInput.sv.Height = 	clvInput.AsView.Height+130d";
__ref._clvinput /*b4a.example3.customlistview*/ ._sv.setHeight((int) (__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getHeight()+__c.DipToCurrent((int) (130))));
RDebugUtils.currentLine=43384848;
 //BA.debugLineNum = 43384848;BA.debugLine="pnl1.Top = clvInput.AsView.top	+clvInput.AsView.H";
__ref._pnl1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getTop()+__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getHeight()));
RDebugUtils.currentLine=43384851;
 //BA.debugLineNum = 43384851;BA.debugLine="CLVGlob.ResizeItem(0,pnl1.Top+pnl1.Height)";
__ref._clvglob /*b4a.example3.customlistview*/ ._resizeitem((int) (0),(int) (__ref._pnl1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._pnl1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=43384860;
 //BA.debugLineNum = 43384860;BA.debugLine="End Sub";
return "";
}
public void  _ambilbank(b4a.example2.v2 __ref) throws Exception{
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "ambilbank", false))
	 {Debug.delegate(ba, "ambilbank", null); return;}
ResumableSub_ambilBank rsub = new ResumableSub_ambilBank(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ambilBank extends BA.ResumableSub {
public ResumableSub_ambilBank(b4a.example2.v2 parent,b4a.example2.v2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example2.v2 __ref;
b4a.example2.v2 parent;
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
RDebugUtils.currentModule="v2";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Try";
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
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="bankMap.Initialize";
__ref._bankmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Dim getBank As HttpJob";
_getbank = new b4a.example2.httpjob();
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Dim jParser As JSONParser";
_jparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="getBank.Initialize(\"\",Me)";
_getbank._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="getBank.PostString(\"https://misterkong.com/kajek";
_getbank._poststring /*String*/ (null,"https://misterkong.com/kajek/services/_getBank.php","");
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="Wait For (getBank) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "v2", "ambilbank"), (Object)(_getbank));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_job = (b4a.example2.httpjob) result[1];
;
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="If job.Success=True Then";
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
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="jParser.Initialize(job.GetString)";
_jparser.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="Dim ls As List = jParser.NextArray";
_ls = new anywheresoftware.b4a.objects.collections.List();
_ls = _jparser.NextArray();
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="For Each hs As Map In ls";
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
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="bankMap.Put(hs.Get(\"nama_bank\"),Array As Strin";
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
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="Dim tmp () As String = bankMap.get(\"BCA\")";
_tmp = (String[])(__ref._bankmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("BCA")));
RDebugUtils.currentLine=3080217;
 //BA.debugLineNum = 3080217;BA.debugLine="Log(tmp(0))";
parent.__c.LogImpl("23080217",_tmp[(int) (0)],0);
RDebugUtils.currentLine=3080218;
 //BA.debugLineNum = 3080218;BA.debugLine="Log(tmp(1))";
parent.__c.LogImpl("23080218",_tmp[(int) (1)],0);
RDebugUtils.currentLine=3080219;
 //BA.debugLineNum = 3080219;BA.debugLine="lbnorek.Text = tmp(1)";
__ref._lbnorek /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tmp[(int) (1)]));
RDebugUtils.currentLine=3080220;
 //BA.debugLineNum = 3080220;BA.debugLine="lban.Text = tmp(3)";
__ref._lban /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tmp[(int) (3)]));
RDebugUtils.currentLine=3080222;
 //BA.debugLineNum = 3080222;BA.debugLine="Log(tmp(2))";
parent.__c.LogImpl("23080222",_tmp[(int) (2)],0);
RDebugUtils.currentLine=3080223;
 //BA.debugLineNum = 3080223;BA.debugLine="Log(tmp(3))";
parent.__c.LogImpl("23080223",_tmp[(int) (3)],0);
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=3080226;
 //BA.debugLineNum = 3080226;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("23080226",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=3080230;
 //BA.debugLineNum = 3080230;BA.debugLine="End Sub";
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
public String  _b4xpage_created(b4a.example2.v2 __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.CSBuilder _cb = null;
anywheresoftware.b4a.objects.PanelWrapper _tt = null;
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dl.Initialize(Root)";
__ref._dl /*b4a.example2.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="dtpembelian.Initialize";
__ref._dtpembelian /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="dtharga.Initialize";
__ref._dtharga /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="B4XPages.SetTitle(Me,\"V2\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("V2"));
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Root.LoadLayout(\"GlobalBody\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("GlobalBody",ba);
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Dim p As Panel  = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,GetDe";
_p.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="p.LoadLayout(\"l_atributRequest\")";
_p.LoadLayout("l_atributRequest",ba);
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,pnl1.";
_p.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,(int) (__ref._pnl1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._pnl1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="CLVGlob.Add(p,\"1\")";
__ref._clvglob /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)("1"));
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="Dim cb As CSBuilder";
_cb = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="cb.Initialize.Append(Chr(0xF067)).Color(Colors.Bl";
_cb.Initialize().Append(BA.ObjectToCharSequence(__c.Chr(((int)0xf067)))).Color(__c.Colors.Black).Alignment(BA.getEnumFromString(android.text.Layout.Alignment.class,"ALIGN_CENTER")).Bold().PopAll();
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="Dim tt As Panel =xui.CreatePanel(\"\")";
_tt = new anywheresoftware.b4a.objects.PanelWrapper();
_tt = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="tt.Color = Colors.White";
_tt.setColor(__c.Colors.White);
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="Dim lblt As Label";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="tt.SetLayout(0,0,clvInput.AsView.Width,40dip)";
_tt.SetLayout((int) (0),(int) (0),__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=2555925;
 //BA.debugLineNum = 2555925;BA.debugLine="lblt.Initialize(\"lblt\")";
_lblt.Initialize(ba,"lblt");
RDebugUtils.currentLine=2555926;
 //BA.debugLineNum = 2555926;BA.debugLine="lblt.Typeface = Typeface.FONTAWESOME";
_lblt.setTypeface(__c.Typeface.getFONTAWESOME());
RDebugUtils.currentLine=2555927;
 //BA.debugLineNum = 2555927;BA.debugLine="lblt.Gravity  = Gravity.CENTER_VERTICAL";
_lblt.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=2555928;
 //BA.debugLineNum = 2555928;BA.debugLine="lblt.Color = Colors.White";
_lblt.setColor(__c.Colors.White);
RDebugUtils.currentLine=2555929;
 //BA.debugLineNum = 2555929;BA.debugLine="lblt.TextColor = Colors.Black";
_lblt.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2555930;
 //BA.debugLineNum = 2555930;BA.debugLine="lblt.Text = cb";
_lblt.setText(BA.ObjectToCharSequence(_cb.getObject()));
RDebugUtils.currentLine=2555931;
 //BA.debugLineNum = 2555931;BA.debugLine="lblt.TextSize = 25";
_lblt.setTextSize((float) (25));
RDebugUtils.currentLine=2555933;
 //BA.debugLineNum = 2555933;BA.debugLine="tt.AddView(lblt.As(View),clvInput.AsView.Width /";
_tt.AddView((android.view.View)(((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lblt.getObject()))).getObject()),(int) (__ref._clvinput /*b4a.example3.customlistview*/ ._asview().getWidth()/(double)2-__c.DipToCurrent((int) (40))),(int) (0),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=2555934;
 //BA.debugLineNum = 2555934;BA.debugLine="clvInput.Add(tt,\"tambah\")";
__ref._clvinput /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tt.getObject())),(Object)("tambah"));
RDebugUtils.currentLine=2555935;
 //BA.debugLineNum = 2555935;BA.debugLine="pd = xui.CreatePanel(\"pd\")";
__ref._pd /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pd").getObject()));
RDebugUtils.currentLine=2555936;
 //BA.debugLineNum = 2555936;BA.debugLine="pd.SetLayout(0,0,GetDeviceLayoutValues.Width - 20";
__ref._pd /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),(int) (__c.GetDeviceLayoutValues(ba).Width-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (400)));
RDebugUtils.currentLine=2555937;
 //BA.debugLineNum = 2555937;BA.debugLine="pd.LoadLayout(\"l_t1\")";
__ref._pd /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_t1",ba);
RDebugUtils.currentLine=2556006;
 //BA.debugLineNum = 2556006;BA.debugLine="pnlhitam = xui.CreatePanel(\"pnlhitam\")";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/  = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlhitam").getObject()));
RDebugUtils.currentLine=2556007;
 //BA.debugLineNum = 2556007;BA.debugLine="pnlhitam.SetLayout(0,0,GetDeviceLayoutValues.Widt";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
RDebugUtils.currentLine=2556008;
 //BA.debugLineNum = 2556008;BA.debugLine="warnaTransGelap.Initialize(xui.Color_ARGB(150,0,0";
__ref._warnatransgelap /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .Initialize(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (150),(int) (0),(int) (0),(int) (0)),(int) (0));
RDebugUtils.currentLine=2556009;
 //BA.debugLineNum = 2556009;BA.debugLine="pnlhitam.Background=warnaTransGelap";
__ref._pnlhitam /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._warnatransgelap /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
RDebugUtils.currentLine=2556010;
 //BA.debugLineNum = 2556010;BA.debugLine="ambilBank";
__ref._ambilbank /*void*/ (null);
RDebugUtils.currentLine=2556015;
 //BA.debugLineNum = 2556015;BA.debugLine="getdataAtribut";
__ref._getdataatribut /*void*/ (null);
RDebugUtils.currentLine=2556016;
 //BA.debugLineNum = 2556016;BA.debugLine="End Sub";
return "";
}
public void  _getdataatribut(b4a.example2.v2 __ref) throws Exception{
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "getdataatribut", false))
	 {Debug.delegate(ba, "getdataatribut", null); return;}
ResumableSub_getdataAtribut rsub = new ResumableSub_getdataAtribut(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_getdataAtribut extends BA.ResumableSub {
public ResumableSub_getdataAtribut(b4a.example2.v2 parent,b4a.example2.v2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example2.v2 __ref;
b4a.example2.v2 parent;
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
RDebugUtils.currentModule="v2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="Dim hargapost As HttpJob";
_hargapost = new b4a.example2.httpjob();
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="hargapost.Initialize(\"\",Me)";
_hargapost._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="hargapost.PostString(\"https://misterkong.com/kong";
_hargapost._poststring /*String*/ (null,"https://misterkong.com/kong_api/api_rider/list",("imei="+parent.__c.SmartStringFormatter("",(Object)(parent._main._imei /*String*/ ))+""));
RDebugUtils.currentLine=3014678;
 //BA.debugLineNum = 3014678;BA.debugLine="Wait For (hargapost)JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "v2", "getdataatribut"), (Object)(_hargapost));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_job = (b4a.example2.httpjob) result[1];
;
RDebugUtils.currentLine=3014679;
 //BA.debugLineNum = 3014679;BA.debugLine="If job.Success Then";
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
RDebugUtils.currentLine=3014680;
 //BA.debugLineNum = 3014680;BA.debugLine="Log	(job.GetString)";
parent.__c.LogImpl("23014680",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=3014681;
 //BA.debugLineNum = 3014681;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3014682;
 //BA.debugLineNum = 3014682;BA.debugLine="Dim ls As List";
_ls = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3014683;
 //BA.debugLineNum = 3014683;BA.debugLine="jp.Initialize(job.GetString)";
_jp.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=3014684;
 //BA.debugLineNum = 3014684;BA.debugLine="ls = jp.NextObject.Get(\"data\").As(List)";
_ls = ((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jp.NextObject().Get((Object)("data")))));
RDebugUtils.currentLine=3014686;
 //BA.debugLineNum = 3014686;BA.debugLine="Log(\"att\"&ls.Get(0).As(Map).Get(\"id\"))";
parent.__c.LogImpl("23014686","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (0))))).Get((Object)("id"))),0);
RDebugUtils.currentLine=3014687;
 //BA.debugLineNum = 3014687;BA.debugLine="Log(\"att\"&ls.Get(1).As(Map).Get(\"id\"))";
parent.__c.LogImpl("23014687","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (1))))).Get((Object)("id"))),0);
RDebugUtils.currentLine=3014688;
 //BA.debugLineNum = 3014688;BA.debugLine="Log(\"att\"&ls.Get(2).As(Map).Get(\"id\"))";
parent.__c.LogImpl("23014688","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (2))))).Get((Object)("id"))),0);
RDebugUtils.currentLine=3014689;
 //BA.debugLineNum = 3014689;BA.debugLine="Dim tl As Int =1";
_tl = (int) (1);
RDebugUtils.currentLine=3014690;
 //BA.debugLineNum = 3014690;BA.debugLine="For Each ii As Map In ls";
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
RDebugUtils.currentLine=3014692;
 //BA.debugLineNum = 3014692;BA.debugLine="dtharga = CreateMap(\"att\"&tl:ii)";
__ref._dtharga /*anywheresoftware.b4a.objects.collections.Map*/  = parent.__c.createMap(new Object[] {(Object)("att"+BA.NumberToString(_tl)),(Object)(_ii.getObject())});
RDebugUtils.currentLine=3014693;
 //BA.debugLineNum = 3014693;BA.debugLine="tl = tl +1";
_tl = (int) (_tl+1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=3014705;
 //BA.debugLineNum = 3014705;BA.debugLine="For Each dt As Map In ls";

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
RDebugUtils.currentLine=3014706;
 //BA.debugLineNum = 3014706;BA.debugLine="Dim ppp As Panel  = xui.CreatePanel(\"\")";
_ppp = new anywheresoftware.b4a.objects.PanelWrapper();
_ppp = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=3014707;
 //BA.debugLineNum = 3014707;BA.debugLine="ppp.SetLayout(0,0,clvDialog.AsView.Width,80dip)";
_ppp.SetLayout((int) (0),(int) (0),__ref._clvdialog /*b4a.example3.customlistview*/ ._asview().getWidth(),parent.__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=3014708;
 //BA.debugLineNum = 3014708;BA.debugLine="ppp.LoadLayout(\"l_TemplateAtribut\")";
_ppp.LoadLayout("l_TemplateAtribut",ba);
RDebugUtils.currentLine=3014709;
 //BA.debugLineNum = 3014709;BA.debugLine="ppp.SetLayout(0,0,clvDialog.AsView.Width,lblDes";
_ppp.SetLayout((int) (0),(int) (0),__ref._clvdialog /*b4a.example3.customlistview*/ ._asview().getWidth(),(int) (__ref._lbldeskripsi /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop()+__ref._lbldeskripsi /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()));
RDebugUtils.currentLine=3014711;
 //BA.debugLineNum = 3014711;BA.debugLine="lblTitle.Text = dt.Get(\"nama\")";
__ref._lbltitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_dt.Get((Object)("nama"))));
RDebugUtils.currentLine=3014712;
 //BA.debugLineNum = 3014712;BA.debugLine="Panel1.Elevation = 10dip";
__ref._panel1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setElevation((float) (parent.__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=3014713;
 //BA.debugLineNum = 3014713;BA.debugLine="lblDeskripsi.Text = dt.Get(\"keterangan\")&CRLF&\"";
__ref._lbldeskripsi /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.ObjectToString(_dt.Get((Object)("keterangan")))+parent.__c.CRLF+"harga :  Rp."+parent.__c.NumberFormat((double)(BA.ObjectToNumber(_dt.Get((Object)("harga_jual")))),(int) (0),(int) (0))));
RDebugUtils.currentLine=3014714;
 //BA.debugLineNum = 3014714;BA.debugLine="Panel1.Tag = dt";
__ref._panel1 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)(_dt.getObject()));
RDebugUtils.currentLine=3014715;
 //BA.debugLineNum = 3014715;BA.debugLine="clvDialog.Add(ppp,dt)";
__ref._clvdialog /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ppp.getObject())),(Object)(_dt.getObject()));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=3014721;
 //BA.debugLineNum = 3014721;BA.debugLine="Log(\" clvAwal.Size : \" &clvInput.Size)";
parent.__c.LogImpl("23014721"," clvAwal.Size : "+BA.NumberToString(__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()),0);
RDebugUtils.currentLine=3014723;
 //BA.debugLineNum = 3014723;BA.debugLine="Log(dtharga)";
parent.__c.LogImpl("23014723",BA.ObjectToString(__ref._dtharga /*anywheresoftware.b4a.objects.collections.Map*/ ),0);
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=3014774;
 //BA.debugLineNum = 3014774;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btncobalagi_click(b4a.example2.v2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "btncobalagi_click", false))
	 {return ((String) Debug.delegate(ba, "btncobalagi_click", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub btnCobaLagi_Click";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4a.example2.v2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
b4a.example2.v3 _b2 = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim b2 As v3";
_b2 = new b4a.example2.v3();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="b2.Initialize";
_b2._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="B4XPages.AddPage(\"v2\",b2)";
_b4xpages._addpage /*String*/ (ba,"v2",(Object)(_b2));
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="B4XPages.ShowPage(\"v2\")";
_b4xpages._showpage /*String*/ (ba,"v2");
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example2.v2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Private CLVGlob As CustomListView";
_clvglob = new b4a.example3.customlistview();
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Dim pnlhitam,pnlputih,pnltampung As Panel";
_pnlhitam = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlputih = new anywheresoftware.b4a.objects.PanelWrapper();
_pnltampung = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Dim warnaTransGelap As ColorDrawable";
_warnatransgelap = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Private lblKamera As Label";
_lblkamera = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="Private btnCobaLagi As Button";
_btncobalagi = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="Private clvInput As CustomListView";
_clvinput = new b4a.example3.customlistview();
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="Private lban As Label";
_lban = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="Private lbnorek As Label";
_lbnorek = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="Private lblTotalHarga As Label";
_lbltotalharga = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="Private txtAlamat As EditText";
_txtalamat = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="Private ivBarang As ImageView";
_ivbarang = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="Private lblDeskripsi As Label";
_lbldeskripsi = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424852;
 //BA.debugLineNum = 2424852;BA.debugLine="Private lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424853;
 //BA.debugLineNum = 2424853;BA.debugLine="Dim dtharga As Map";
_dtharga = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2424854;
 //BA.debugLineNum = 2424854;BA.debugLine="Dim bankMap As Map";
_bankmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2424855;
 //BA.debugLineNum = 2424855;BA.debugLine="Private lblTambah As Label";
_lbltambah = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424856;
 //BA.debugLineNum = 2424856;BA.debugLine="Private lblJml As Label";
_lbljml = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424857;
 //BA.debugLineNum = 2424857;BA.debugLine="Private lblMin As Label";
_lblmin = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424858;
 //BA.debugLineNum = 2424858;BA.debugLine="Private lblPlus As Label";
_lblplus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424859;
 //BA.debugLineNum = 2424859;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=2424860;
 //BA.debugLineNum = 2424860;BA.debugLine="Dim nested As CLVNested";
_nested = new b4a.example2.clvnested();
RDebugUtils.currentLine=2424861;
 //BA.debugLineNum = 2424861;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424862;
 //BA.debugLineNum = 2424862;BA.debugLine="Private pnltmpclv As Panel";
_pnltmpclv = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424863;
 //BA.debugLineNum = 2424863;BA.debugLine="Dim Dl As B4XDialog";
_dl = new b4a.example2.b4xdialog();
RDebugUtils.currentLine=2424864;
 //BA.debugLineNum = 2424864;BA.debugLine="Private pnl1 As Panel";
_pnl1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424865;
 //BA.debugLineNum = 2424865;BA.debugLine="Dim pd As Panel";
_pd = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424866;
 //BA.debugLineNum = 2424866;BA.debugLine="Dim dtpembelian As Map";
_dtpembelian = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2424867;
 //BA.debugLineNum = 2424867;BA.debugLine="Private clvDialog As CustomListView";
_clvdialog = new b4a.example3.customlistview();
RDebugUtils.currentLine=2424868;
 //BA.debugLineNum = 2424868;BA.debugLine="Private ivBarang2 As ImageView";
_ivbarang2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2424869;
 //BA.debugLineNum = 2424869;BA.debugLine="Private lblTitle2 As Label";
_lbltitle2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424870;
 //BA.debugLineNum = 2424870;BA.debugLine="Private lblDeskripsi2 As Label";
_lbldeskripsi2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424871;
 //BA.debugLineNum = 2424871;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424872;
 //BA.debugLineNum = 2424872;BA.debugLine="Private lblTambah2 As Label";
_lbltambah2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424873;
 //BA.debugLineNum = 2424873;BA.debugLine="Private lblMin2 As Label";
_lblmin2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424874;
 //BA.debugLineNum = 2424874;BA.debugLine="Private lblJml2 As Label";
_lbljml2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424875;
 //BA.debugLineNum = 2424875;BA.debugLine="Private lblPlus2 As Label";
_lblplus2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424876;
 //BA.debugLineNum = 2424876;BA.debugLine="End Sub";
return "";
}
public String  _clvinput_itemclick(b4a.example2.v2 __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "clvinput_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvinput_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Private Sub clvInput_ItemClick (index As Int, Valu";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="Log($\"${index } As Int, ${ Value } As Object\"$)";
__c.LogImpl("242401793",(""+__c.SmartStringFormatter("",(Object)(_index))+" As Int, "+__c.SmartStringFormatter("",_value)+" As Object"),0);
RDebugUtils.currentLine=42401804;
 //BA.debugLineNum = 42401804;BA.debugLine="End Sub";
return "";
}
public String  _ivbarang_click(b4a.example2.v2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "ivbarang_click", false))
	 {return ((String) Debug.delegate(ba, "ivbarang_click", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub ivBarang_Click";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Log(\"ivBarang_Click\")";
__c.LogImpl("23407873","ivBarang_Click",0);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public String  _ivbarang_longclick(b4a.example2.v2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "ivbarang_longclick", false))
	 {return ((String) Debug.delegate(ba, "ivbarang_longclick", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub ivBarang_LongClick";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.example2.v2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public String  _lblkamera_click(b4a.example2.v2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "lblkamera_click", false))
	 {return ((String) Debug.delegate(ba, "lblkamera_click", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub lblKamera_Click";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public String  _lblmin_click(b4a.example2.v2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "lblmin_click", false))
	 {return ((String) Debug.delegate(ba, "lblmin_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub lblMin_Click";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim lblt As Label  = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))-1));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="If lblt.Parent.As(B4XView).GetView(2).Tag.As(Int)";
if (((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))==0) { 
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (1)).setVisible(__c.False);
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setVisible(__c.False);
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (3)).setVisible(__c.False);
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="lblt.Parent.As(B4XView).GetView(0).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (0)).setVisible(__c.True);
 };
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="End Sub";
return "";
}
public String  _lblplus_click(b4a.example2.v2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "lblplus_click", false))
	 {return ((String) Debug.delegate(ba, "lblplus_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub lblPlus_Click";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim lblt As Label  = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))+1));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="End Sub";
return "";
}
public void  _lblt_click(b4a.example2.v2 __ref) throws Exception{
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "lblt_click", false))
	 {Debug.delegate(ba, "lblt_click", null); return;}
ResumableSub_lblt_Click rsub = new ResumableSub_lblt_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_lblt_Click extends BA.ResumableSub {
public ResumableSub_lblt_Click(b4a.example2.v2 parent,b4a.example2.v2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example2.v2 __ref;
b4a.example2.v2 parent;
Object _obj = null;
int _result = 0;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _tmpp = null;
int _t = 0;
int step5;
int limit5;
int step11;
int limit11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="v2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42598403;
 //BA.debugLineNum = 42598403;BA.debugLine="Dim obj As  Object=Dl.ShowCustom(pd,\"Simpan\",\"Bat";
_obj = __ref._dl /*b4a.example2.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pd /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject())),(Object)("Simpan"),(Object)("Batal"),(Object)(""));
RDebugUtils.currentLine=42598405;
 //BA.debugLineNum = 42598405;BA.debugLine="Wait For(obj)Complete(result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "v2", "lblt_click"), _obj);
this.state = 29;
return;
case 29:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=42598407;
 //BA.debugLineNum = 42598407;BA.debugLine="Log($\"result ${result}\"$)";
parent.__c.LogImpl("242598407",("result "+parent.__c.SmartStringFormatter("",(Object)(_result))+""),0);
RDebugUtils.currentLine=42598408;
 //BA.debugLineNum = 42598408;BA.debugLine="If result=-1 Then";
if (true) break;

case 1:
//if
this.state = 28;
if (_result==-1) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=42598409;
 //BA.debugLineNum = 42598409;BA.debugLine="For i  = 0 To 	clvDialog.Size	-1";
if (true) break;

case 4:
//for
this.state = 27;
step5 = 1;
limit5 = (int) (__ref._clvdialog /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 27;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 6;
if (true) break;

case 31:
//C
this.state = 30;
_i = ((int)(0 + _i + step5)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=42598410;
 //BA.debugLineNum = 42598410;BA.debugLine="Dim tmpp As Panel = clvDialog.GetPanel(i).GetVi";
_tmpp = new anywheresoftware.b4a.objects.PanelWrapper();
_tmpp = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._clvdialog /*b4a.example3.customlistview*/ ._getpanel(_i).GetView((int) (3)).getObject()));
RDebugUtils.currentLine=42598411;
 //BA.debugLineNum = 42598411;BA.debugLine="Log (tmpp.Tag)";
parent.__c.LogImpl("242598411",BA.ObjectToString(_tmpp.getTag()),0);
RDebugUtils.currentLine=42598413;
 //BA.debugLineNum = 42598413;BA.debugLine="Log	(\"data ke - \"&i&\" \" &tmpp.GetView(2).Tag )";
parent.__c.LogImpl("242598413","data ke - "+BA.NumberToString(_i)+" "+BA.ObjectToString(_tmpp.GetView((int) (2)).getTag()),0);
RDebugUtils.currentLine=42598414;
 //BA.debugLineNum = 42598414;BA.debugLine="If tmpp.GetView(2).Tag >0 Then";
if (true) break;

case 7:
//if
this.state = 26;
if ((double)(BA.ObjectToNumber(_tmpp.GetView((int) (2)).getTag()))>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=42598415;
 //BA.debugLineNum = 42598415;BA.debugLine="If clvInput.Size>0 Then";
if (true) break;

case 10:
//if
this.state = 25;
if (__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()>0) { 
this.state = 12;
}else {
this.state = 24;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=42598417;
 //BA.debugLineNum = 42598417;BA.debugLine="For t = 0 To clvInput.Size-1";
if (true) break;

case 13:
//for
this.state = 22;
step11 = 1;
limit11 = (int) (__ref._clvinput /*b4a.example3.customlistview*/ ._getsize()-1);
_t = (int) (0) ;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 22;
if ((step11 > 0 && _t <= limit11) || (step11 < 0 && _t >= limit11)) this.state = 15;
if (true) break;

case 33:
//C
this.state = 32;
_t = ((int)(0 + _t + step11)) ;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=42598418;
 //BA.debugLineNum = 42598418;BA.debugLine="Log(\"i : \"&i)";
parent.__c.LogImpl("242598418","i : "+BA.NumberToString(_i),0);
RDebugUtils.currentLine=42598419;
 //BA.debugLineNum = 42598419;BA.debugLine="Log(\"T : \"&t)";
parent.__c.LogImpl("242598419","T : "+BA.NumberToString(_t),0);
RDebugUtils.currentLine=42598420;
 //BA.debugLineNum = 42598420;BA.debugLine="Log(clvInput.GetValue (t))";
parent.__c.LogImpl("242598420",BA.ObjectToString(__ref._clvinput /*b4a.example3.customlistview*/ ._getvalue(_t)),0);
RDebugUtils.currentLine=42598421;
 //BA.debugLineNum = 42598421;BA.debugLine="Log(tmpp.Tag)";
parent.__c.LogImpl("242598421",BA.ObjectToString(_tmpp.getTag()),0);
RDebugUtils.currentLine=42598422;
 //BA.debugLineNum = 42598422;BA.debugLine="If clvInput.GetValue (t) = tmpp.Tag Then";
if (true) break;

case 16:
//if
this.state = 21;
if ((__ref._clvinput /*b4a.example3.customlistview*/ ._getvalue(_t)).equals(_tmpp.getTag())) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=42598423;
 //BA.debugLineNum = 42598423;BA.debugLine="Log(\"value sama\")";
parent.__c.LogImpl("242598423","value sama",0);
RDebugUtils.currentLine=42598424;
 //BA.debugLineNum = 42598424;BA.debugLine="AddToCLVInput(tmpp.Tag,tmpp.GetView(2).Tag)";
__ref._addtoclvinput /*String*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_tmpp.getTag())),(int)(BA.ObjectToNumber(_tmpp.GetView((int) (2)).getTag())));
RDebugUtils.currentLine=42598425;
 //BA.debugLineNum = 42598425;BA.debugLine="clvInput.GetPanel(t).GetView(3).GetView(2).Ta";
__ref._clvinput /*b4a.example3.customlistview*/ ._getpanel(_t).GetView((int) (3)).GetView((int) (2)).setTag((Object)((double)(BA.ObjectToNumber(__ref._clvinput /*b4a.example3.customlistview*/ ._getpanel(_t).GetView((int) (3)).GetView((int) (2)).getTag()))+(double)(BA.ObjectToNumber(_tmpp.GetView((int) (2)).getTag()))));
RDebugUtils.currentLine=42598426;
 //BA.debugLineNum = 42598426;BA.debugLine="clvInput.GetPanel(t).GetView(3).GetView(2).Te";
__ref._clvinput /*b4a.example3.customlistview*/ ._getpanel(_t).GetView((int) (3)).GetView((int) (2)).setText(BA.ObjectToCharSequence((BA.ObjectToString(__ref._clvinput /*b4a.example3.customlistview*/ ._getpanel(_t).GetView((int) (3)).GetView((int) (2)).getTag()))));
 if (true) break;

case 20:
//C
this.state = 21;
 if (true) break;

case 21:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=42598433;
 //BA.debugLineNum = 42598433;BA.debugLine="AddToCLVInput(tmpp.Tag,tmpp.GetView(2).Tag)";
__ref._addtoclvinput /*String*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_tmpp.getTag())),(int)(BA.ObjectToNumber(_tmpp.GetView((int) (2)).getTag())));
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 31;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=42598448;
 //BA.debugLineNum = 42598448;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _lbltambah_click(b4a.example2.v2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "lbltambah_click", false))
	 {return ((String) Debug.delegate(ba, "lbltambah_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub lblTambah_Click";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Log(\"Klik\")";
__c.LogImpl("23276801","Klik",0);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim lblt As Label = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="lblt.Visible = False";
_lblt.setVisible(__c.False);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (1)).setVisible(__c.True);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setVisible(__c.True);
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (3)).setVisible(__c.True);
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))+1));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="End Sub";
return "";
}
public String  _txtalamat_focuschanged(b4a.example2.v2 __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="v2";
if (Debug.shouldDelegate(ba, "txtalamat_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "txtalamat_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub txtAlamat_FocusChanged (HasFocus As Bo";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
}