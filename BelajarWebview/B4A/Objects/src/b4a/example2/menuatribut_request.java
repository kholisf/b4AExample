package b4a.example2;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class menuatribut_request extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example2.menuatribut_request");
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
public void  _ambilbank() throws Exception{
ResumableSub_ambilBank rsub = new ResumableSub_ambilBank(this);
rsub.resume(ba, null);
}
public static class ResumableSub_ambilBank extends BA.ResumableSub {
public ResumableSub_ambilBank(b4a.example2.menuatribut_request parent) {
this.parent = parent;
}
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 316;BA.debugLine="Try";
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
 //BA.debugLineNum = 318;BA.debugLine="bankMap.Initialize";
parent._bankmap.Initialize();
 //BA.debugLineNum = 319;BA.debugLine="Dim getBank As HttpJob";
_getbank = new b4a.example2.httpjob();
 //BA.debugLineNum = 320;BA.debugLine="Dim jParser As JSONParser";
_jparser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 322;BA.debugLine="getBank.Initialize(\"\",Me)";
_getbank._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 323;BA.debugLine="getBank.PostString(\"https://misterkong.com/kajek";
_getbank._poststring /*String*/ ("https://misterkong.com/kajek/services/_getBank.php","");
 //BA.debugLineNum = 324;BA.debugLine="Wait For (getBank) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_getbank));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_job = (b4a.example2.httpjob) result[0];
;
 //BA.debugLineNum = 325;BA.debugLine="If job.Success=True Then";
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
 //BA.debugLineNum = 328;BA.debugLine="jParser.Initialize(job.GetString)";
_jparser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 329;BA.debugLine="Dim ls As List = jParser.NextArray";
_ls = new anywheresoftware.b4a.objects.collections.List();
_ls = _jparser.NextArray();
 //BA.debugLineNum = 330;BA.debugLine="For Each hs As Map In ls";
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
 //BA.debugLineNum = 334;BA.debugLine="bankMap.Put(hs.Get(\"nama_bank\"),Array As Strin";
parent._bankmap.Put(_hs.Get((Object)("nama_bank")),(Object)(new String[]{BA.ObjectToString(_hs.Get((Object)("kd_bank_kong"))),BA.ObjectToString(_hs.Get((Object)("no_rekening"))),BA.ObjectToString(_hs.Get((Object)("nama_bank"))),BA.ObjectToString(_hs.Get((Object)("atas_nama")))}));
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
 //BA.debugLineNum = 337;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 339;BA.debugLine="Dim tmp () As String = bankMap.get(\"BCA\")";
_tmp = (String[])(parent._bankmap.Get((Object)("BCA")));
 //BA.debugLineNum = 340;BA.debugLine="Log(tmp(0))";
parent.__c.LogImpl("141156633",_tmp[(int) (0)],0);
 //BA.debugLineNum = 341;BA.debugLine="Log(tmp(1))";
parent.__c.LogImpl("141156634",_tmp[(int) (1)],0);
 //BA.debugLineNum = 342;BA.debugLine="lbnorek.Text = tmp(1)";
parent._lbnorek.setText(BA.ObjectToCharSequence(_tmp[(int) (1)]));
 //BA.debugLineNum = 343;BA.debugLine="lban.Text = tmp(3)";
parent._lban.setText(BA.ObjectToCharSequence(_tmp[(int) (3)]));
 //BA.debugLineNum = 345;BA.debugLine="Log(tmp(2))";
parent.__c.LogImpl("141156638",_tmp[(int) (2)],0);
 //BA.debugLineNum = 346;BA.debugLine="Log(tmp(3))";
parent.__c.LogImpl("141156639",_tmp[(int) (3)],0);
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 //BA.debugLineNum = 349;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("141156642",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
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
public void  _jobdone(b4a.example2.httpjob _job) throws Exception{
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _p0 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.PanelWrapper _p2 = null;
 //BA.debugLineNum = 39;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 40;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 41;BA.debugLine="dtharga.Initialize";
_dtharga.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="nested.Initialize(Root)";
_nested._initialize /*String*/ (ba,_root);
 //BA.debugLineNum = 43;BA.debugLine="nested.base.LoadLayout(\"GlobalBody\")";
_nested._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("GlobalBody",ba);
 //BA.debugLineNum = 44;BA.debugLine="nested.CLV = CLVGlob";
_nested._clv /*b4a.example3.customlistview*/  = _clvglob;
 //BA.debugLineNum = 46;BA.debugLine="Dim p0 As Panel = xui.CreatePanel(\"\")";
_p0 = new anywheresoftware.b4a.objects.PanelWrapper();
_p0 = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 47;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="lbl.Initialize(\"lbl\")";
_lbl.Initialize(ba,"lbl");
 //BA.debugLineNum = 49;BA.debugLine="lbl.Padding = Array As Int(18, 11, 18, 11)";
_lbl.setPadding(new int[]{(int) (18),(int) (11),(int) (18),(int) (11)});
 //BA.debugLineNum = 50;BA.debugLine="lbl.TextColor = 0x80000000";
_lbl.setTextColor(((int)0x80000000));
 //BA.debugLineNum = 51;BA.debugLine="lbl.Color = 0x80FFC90D";
_lbl.setColor(((int)0x80ffc90d));
 //BA.debugLineNum = 52;BA.debugLine="lbl.Height=60dip";
_lbl.setHeight(__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 53;BA.debugLine="lbl.Width  = GetDeviceLayoutValues.Width";
_lbl.setWidth(__c.GetDeviceLayoutValues(ba).Width);
 //BA.debugLineNum = 54;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 55;BA.debugLine="cs.Initialize.Size(17).Append(\"Ikuti panduan foto";
_cs.Initialize().Size((int) (17)).Append(BA.ObjectToCharSequence("Ikuti panduan foto "));
 //BA.debugLineNum = 56;BA.debugLine="cs.Clickable(\"cs\", 1).Color(0xFF00A7FF).Append(\"i";
_cs.Clickable(ba,"cs",(Object)(1)).Color(((int)0xff00a7ff)).Append(BA.ObjectToCharSequence("ini ")).Bold().Pop().Pop();
 //BA.debugLineNum = 57;BA.debugLine="cs.Append(\"untuk mempermudah pemilihan ukuran atr";
_cs.Append(BA.ObjectToCharSequence("untuk mempermudah pemilihan ukuran atribut")).PopAll();
 //BA.debugLineNum = 58;BA.debugLine="cs.EnableClickEvents(lbl)";
_cs.EnableClickEvents((android.widget.TextView)(_lbl.getObject()));
 //BA.debugLineNum = 59;BA.debugLine="lbl.Text = cs";
_lbl.setText(BA.ObjectToCharSequence(_cs.getObject()));
 //BA.debugLineNum = 60;BA.debugLine="p0.SetLayout(0,0,GetDeviceLayoutValues.Width,60di";
_p0.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 61;BA.debugLine="p0.AddView(lbl.As(View),0,0,GetDeviceLayoutValues";
_p0.AddView((android.view.View)(((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject()))).getObject()),(int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 62;BA.debugLine="CLVGlob.Add(p0,\"0\")";
_clvglob._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p0.getObject())),(Object)("0"));
 //BA.debugLineNum = 67;BA.debugLine="Dim p As Panel = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 68;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,GetDe";
_p.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
 //BA.debugLineNum = 71;BA.debugLine="p.LoadLayout(\"l_t1\")";
_p.LoadLayout("l_t1",ba);
 //BA.debugLineNum = 73;BA.debugLine="p.SetLayout(0,0,GetDeviceLayoutValues.Width,clvIn";
_p.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,(int) (_clvinput._asview().getTop()+_clvinput._asview().getHeight()+__c.DipToCurrent((int) (10))));
 //BA.debugLineNum = 74;BA.debugLine="p.Color = Colors.White";
_p.setColor(__c.Colors.White);
 //BA.debugLineNum = 77;BA.debugLine="p.Tag = clvInput";
_p.setTag((Object)(_clvinput));
 //BA.debugLineNum = 83;BA.debugLine="CLVGlob.Add(p,\"1\")";
_clvglob._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)("1"));
 //BA.debugLineNum = 85;BA.debugLine="Dim p2 As Panel =xui.CreatePanel(\"\")";
_p2 = new anywheresoftware.b4a.objects.PanelWrapper();
_p2 = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 86;BA.debugLine="p2.SetLayout(0,0,GetDeviceLayoutValues.Width,GetD";
_p2.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
 //BA.debugLineNum = 87;BA.debugLine="p2.LoadLayout(\"l_t2\")";
_p2.LoadLayout("l_t2",ba);
 //BA.debugLineNum = 88;BA.debugLine="p2.Color = Colors.White";
_p2.setColor(__c.Colors.White);
 //BA.debugLineNum = 89;BA.debugLine="p2.SetLayout(0,0,GetDeviceLayoutValues.Width,btnC";
_p2.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,(int) (_btncobalagi.getTop()+_btncobalagi.getHeight()+__c.DipToCurrent((int) (10))));
 //BA.debugLineNum = 90;BA.debugLine="CLVGlob.Add(p2,\"2\")";
_clvglob._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p2.getObject())),(Object)("2"));
 //BA.debugLineNum = 105;BA.debugLine="pnlhitam = xui.CreatePanel(\"pnlhitam\")";
_pnlhitam = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"pnlhitam").getObject()));
 //BA.debugLineNum = 106;BA.debugLine="pnlhitam.SetLayout(0,0,GetDeviceLayoutValues.Widt";
_pnlhitam.SetLayout((int) (0),(int) (0),__c.GetDeviceLayoutValues(ba).Width,__c.GetDeviceLayoutValues(ba).Height);
 //BA.debugLineNum = 107;BA.debugLine="warnaTransGelap.Initialize(xui.Color_ARGB(150,0,0";
_warnatransgelap.Initialize(_xui.Color_ARGB((int) (150),(int) (0),(int) (0),(int) (0)),(int) (0));
 //BA.debugLineNum = 108;BA.debugLine="pnlhitam.Background=warnaTransGelap";
_pnlhitam.setBackground((android.graphics.drawable.Drawable)(_warnatransgelap.getObject()));
 //BA.debugLineNum = 109;BA.debugLine="ambilBank";
_ambilbank();
 //BA.debugLineNum = 114;BA.debugLine="getdataAtribut";
_getdataatribut();
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _btncobalagi_click() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Private Sub btnCobaLagi_Click";
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private CLVGlob As CustomListView";
_clvglob = new b4a.example3.customlistview();
 //BA.debugLineNum = 5;BA.debugLine="Dim pnlhitam,pnlputih,pnltampung As Panel";
_pnlhitam = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlputih = new anywheresoftware.b4a.objects.PanelWrapper();
_pnltampung = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim warnaTransGelap As ColorDrawable";
_warnatransgelap = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 7;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private lblKamera As Label";
_lblkamera = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private btnCobaLagi As Button";
_btncobalagi = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private clvInput As CustomListView";
_clvinput = new b4a.example3.customlistview();
 //BA.debugLineNum = 14;BA.debugLine="Private lban As Label";
_lban = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private lbnorek As Label";
_lbnorek = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private lblTotalHarga As Label";
_lbltotalharga = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private txtAlamat As EditText";
_txtalamat = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private ivBarang As ImageView";
_ivbarang = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private lblDeskripsi As Label";
_lbldeskripsi = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim dtharga As Map";
_dtharga = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 23;BA.debugLine="Dim bankMap As Map";
_bankmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 24;BA.debugLine="Private lblTambah As Label";
_lbltambah = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private lblJml As Label";
_lbljml = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private lblMin As Label";
_lblmin = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private lblPlus As Label";
_lblplus = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim nested As CLVNested";
_nested = new b4a.example2.clvnested();
 //BA.debugLineNum = 30;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _clvglob_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Private Sub CLVGlob_ItemClick (Index As Int, Value";
 //BA.debugLineNum = 143;BA.debugLine="Log(\"test\")";
__c.LogImpl("140108033","test",0);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _clvinput_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Private Sub clvInput_ItemClick (Index As Int, Valu";
 //BA.debugLineNum = 124;BA.debugLine="Log(\"klik\")";
__c.LogImpl("139256065","klik",0);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public void  _getdataatribut() throws Exception{
ResumableSub_getdataAtribut rsub = new ResumableSub_getdataAtribut(this);
rsub.resume(ba, null);
}
public static class ResumableSub_getdataAtribut extends BA.ResumableSub {
public ResumableSub_getdataAtribut(b4a.example2.menuatribut_request parent) {
this.parent = parent;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 160;BA.debugLine="Dim hargapost As HttpJob";
_hargapost = new b4a.example2.httpjob();
 //BA.debugLineNum = 161;BA.debugLine="hargapost.Initialize(\"\",Me)";
_hargapost._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 162;BA.debugLine="hargapost.PostString(\"https://misterkong.com/kong";
_hargapost._poststring /*String*/ ("https://misterkong.com/kong_api/api_rider/list",("imei="+parent.__c.SmartStringFormatter("",(Object)(parent._main._imei /*String*/ ))+""));
 //BA.debugLineNum = 168;BA.debugLine="Wait For (hargapost)JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_hargapost));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_job = (b4a.example2.httpjob) result[0];
;
 //BA.debugLineNum = 169;BA.debugLine="If job.Success Then";
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
 //BA.debugLineNum = 170;BA.debugLine="Log	(job.GetString)";
parent.__c.LogImpl("141025560",_job._getstring /*String*/ (),0);
 //BA.debugLineNum = 171;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 172;BA.debugLine="Dim ls As List";
_ls = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 173;BA.debugLine="jp.Initialize(job.GetString)";
_jp.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 174;BA.debugLine="ls = jp.NextObject.Get(\"data\").As(List)";
_ls = ((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jp.NextObject().Get((Object)("data")))));
 //BA.debugLineNum = 176;BA.debugLine="Log(\"att\"&ls.Get(0).As(Map).Get(\"id\"))";
parent.__c.LogImpl("141025566","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (0))))).Get((Object)("id"))),0);
 //BA.debugLineNum = 177;BA.debugLine="Log(\"att\"&ls.Get(1).As(Map).Get(\"id\"))";
parent.__c.LogImpl("141025567","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (1))))).Get((Object)("id"))),0);
 //BA.debugLineNum = 178;BA.debugLine="Log(\"att\"&ls.Get(2).As(Map).Get(\"id\"))";
parent.__c.LogImpl("141025568","att"+BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ls.Get((int) (2))))).Get((Object)("id"))),0);
 //BA.debugLineNum = 179;BA.debugLine="Dim tl As Int =1";
_tl = (int) (1);
 //BA.debugLineNum = 180;BA.debugLine="For Each ii As Map In ls";
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
 //BA.debugLineNum = 182;BA.debugLine="dtharga = CreateMap(\"att\"&tl:ii)";
parent._dtharga = parent.__c.createMap(new Object[] {(Object)("att"+BA.NumberToString(_tl)),(Object)(_ii.getObject())});
 //BA.debugLineNum = 183;BA.debugLine="tl = tl +1";
_tl = (int) (_tl+1);
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 195;BA.debugLine="For Each dt As Map In ls";

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
 //BA.debugLineNum = 196;BA.debugLine="Dim ppp As Panel  = xui.CreatePanel(\"\")";
_ppp = new anywheresoftware.b4a.objects.PanelWrapper();
_ppp = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(parent._xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 197;BA.debugLine="ppp.SetLayout(0,0,clvInput.AsView.Width,80dip)";
_ppp.SetLayout((int) (0),(int) (0),parent._clvinput._asview().getWidth(),parent.__c.DipToCurrent((int) (80)));
 //BA.debugLineNum = 198;BA.debugLine="ppp.LoadLayout(\"l_TemplateAtribut\")";
_ppp.LoadLayout("l_TemplateAtribut",ba);
 //BA.debugLineNum = 199;BA.debugLine="ppp.SetLayout(0,0,clvInput.AsView.Width,lblDesk";
_ppp.SetLayout((int) (0),(int) (0),parent._clvinput._asview().getWidth(),(int) (parent._lbldeskripsi.getTop()+parent._lbldeskripsi.getHeight()));
 //BA.debugLineNum = 201;BA.debugLine="lblTitle.Text = dt.Get(\"nama\")";
parent._lbltitle.setText(BA.ObjectToCharSequence(_dt.Get((Object)("nama"))));
 //BA.debugLineNum = 202;BA.debugLine="Panel1.Elevation = 10dip";
parent._panel1.setElevation((float) (parent.__c.DipToCurrent((int) (10))));
 //BA.debugLineNum = 203;BA.debugLine="lblDeskripsi.Text = dt.Get(\"keterangan\")&CRLF&\"";
parent._lbldeskripsi.setText(BA.ObjectToCharSequence(BA.ObjectToString(_dt.Get((Object)("keterangan")))+parent.__c.CRLF+"harga :  Rp."+parent.__c.NumberFormat((double)(BA.ObjectToNumber(_dt.Get((Object)("harga_jual")))),(int) (0),(int) (0))));
 //BA.debugLineNum = 205;BA.debugLine="clvInput.Add(ppp,dt)";
parent._clvinput._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ppp.getObject())),(Object)(_dt.getObject()));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 211;BA.debugLine="Log(\" clvAwal.Size : \" &clvInput.Size)";
parent.__c.LogImpl("141025601"," clvAwal.Size : "+BA.NumberToString(parent._clvinput._getsize()),0);
 //BA.debugLineNum = 213;BA.debugLine="Log(dtharga)";
parent.__c.LogImpl("141025603",BA.ObjectToString(parent._dtharga),0);
 if (true) break;

case 11:
//C
this.state = -1;
;
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public String  _label2_click() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Private Sub Label2_Click";
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _lblkamera_click() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Private Sub lblKamera_Click";
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _lblmin_click() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
 //BA.debugLineNum = 362;BA.debugLine="Private Sub lblMin_Click";
 //BA.debugLineNum = 363;BA.debugLine="Dim lblt As Label  = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 364;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))-1));
 //BA.debugLineNum = 365;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
 //BA.debugLineNum = 366;BA.debugLine="If lblt.Parent.As(B4XView).GetView(2).Tag.As(Int)";
if (((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))==0) { 
 //BA.debugLineNum = 367;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (1)).setVisible(__c.False);
 //BA.debugLineNum = 368;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setVisible(__c.False);
 //BA.debugLineNum = 369;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=False";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (3)).setVisible(__c.False);
 //BA.debugLineNum = 370;BA.debugLine="lblt.Parent.As(B4XView).GetView(0).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (0)).setVisible(__c.True);
 };
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return "";
}
public String  _lblplus_click() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
 //BA.debugLineNum = 356;BA.debugLine="Private Sub lblPlus_Click";
 //BA.debugLineNum = 357;BA.debugLine="Dim lblt As Label  = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 358;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))+1));
 //BA.debugLineNum = 359;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public String  _lbltambah_click() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
 //BA.debugLineNum = 380;BA.debugLine="Private Sub lblTambah_Click";
 //BA.debugLineNum = 381;BA.debugLine="Log(\"Klik\")";
__c.LogImpl("141418753","Klik",0);
 //BA.debugLineNum = 382;BA.debugLine="Dim lblt As Label = Sender";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 383;BA.debugLine="lblt.Visible = False";
_lblt.setVisible(__c.False);
 //BA.debugLineNum = 384;BA.debugLine="lblt.Parent.As(B4XView).GetView(1).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (1)).setVisible(__c.True);
 //BA.debugLineNum = 385;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setVisible(__c.True);
 //BA.debugLineNum = 386;BA.debugLine="lblt.Parent.As(B4XView).GetView(3).Visible=True";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (3)).setVisible(__c.True);
 //BA.debugLineNum = 387;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Tag = lblt.Par";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setTag((Object)(((int)(BA.ObjectToNumber(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag())))+1));
 //BA.debugLineNum = 388;BA.debugLine="lblt.Parent.As(B4XView).GetView(2).Text = lblt.Pa";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).setText(BA.ObjectToCharSequence(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getParent()))).GetView((int) (2)).getTag()));
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return "";
}
public String  _txtalamat_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Private Sub txtAlamat_FocusChanged (HasFocus As Bo";
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
