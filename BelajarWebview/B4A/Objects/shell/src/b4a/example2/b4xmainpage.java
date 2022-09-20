
package b4a.example2;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _ccb = RemoteObject.declareNull("b4a.example2.cobadesain");
public static RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _fl = RemoteObject.declareNull("b4a.example2.fileprovider");
public static RemoteObject _mar = RemoteObject.declareNull("b4a.example2.v2");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example2.main _main = null;
public static b4a.example2.starter _starter = null;
public static b4a.example2.b4xpages _b4xpages = null;
public static b4a.example2.b4xcollections _b4xcollections = null;
public static b4a.example2.httputils2service _httputils2service = null;
public static b4a.example2.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ccb",_ref.getField(false, "_ccb"),"DateUtils",_ref.getField(false, "_dateutils"),"fl",_ref.getField(false, "_fl"),"mar",_ref.getField(false, "_mar"),"p",_ref.getField(false, "_p"),"Root",_ref.getField(false, "_root"),"rp",_ref.getField(false, "_rp"),"WebView1",_ref.getField(false, "_webview1"),"xui",_ref.getField(false, "_xui")};
}
}