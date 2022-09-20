
package b4a.example2;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clvnested {
    public static RemoteObject myClass;
	public clvnested() {
	}
    public static PCBA staticBA = new PCBA(null, clvnested.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _scrollingclv = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _scrollingclvhorizontal = RemoteObject.createImmutable(false);
public static RemoteObject _startoffset = RemoteObject.createImmutable(0f);
public static RemoteObject _scrollposition = RemoteObject.createImmutable(0f);
public static RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _clv = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _scrolled = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example2.main _main = null;
public static b4a.example2.starter _starter = null;
public static b4a.example2.b4xpages _b4xpages = null;
public static b4a.example2.b4xcollections _b4xcollections = null;
public static b4a.example2.httputils2service _httputils2service = null;
public static b4a.example2.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"base",_ref.getField(false, "_base"),"CLV",_ref.getField(false, "_clv"),"DateUtils",_ref.getField(false, "_dateutils"),"Scrolled",_ref.getField(false, "_scrolled"),"ScrollingCLV",_ref.getField(false, "_scrollingclv"),"ScrollingCLVHorizontal",_ref.getField(false, "_scrollingclvhorizontal"),"ScrollPosition",_ref.getField(false, "_scrollposition"),"StartOffset",_ref.getField(false, "_startoffset"),"xui",_ref.getField(false, "_xui")};
}
}