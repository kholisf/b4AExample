
package b4a.example2;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xpagesdelegator {
    public static RemoteObject myClass;
	public b4xpagesdelegator() {
	}
    public static PCBA staticBA = new PCBA(null, b4xpagesdelegator.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example2.main _main = null;
public static b4a.example2.starter _starter = null;
public static b4a.example2.b4xpages _b4xpages = null;
public static b4a.example2.b4xcollections _b4xcollections = null;
public static b4a.example2.httputils2service _httputils2service = null;
public static b4a.example2.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils")};
}
}