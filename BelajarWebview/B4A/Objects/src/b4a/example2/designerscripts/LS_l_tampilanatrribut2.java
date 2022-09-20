package b4a.example2.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_tampilanatrribut2{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lblplus2").vw.setHeight((int)((views.get("panel12").vw.getHeight())));
views.get("lblmin2").vw.setHeight((int)((views.get("panel12").vw.getHeight())));
views.get("lbljml2").vw.setHeight((int)((views.get("panel12").vw.getHeight())));
views.get("lbltambah2").vw.setHeight((int)((views.get("panel12").vw.getHeight())));
views.get("lbltambah2").vw.setWidth((int)((views.get("panel12").vw.getWidth())));
//BA.debugLineNum = 12;BA.debugLine="lblTambah2.Left = 0"[l_tampilanatrribut2/General script]
views.get("lbltambah2").vw.setLeft((int)(0d));
//BA.debugLineNum = 13;BA.debugLine="lblMin2.Left = lblTambah2.Left"[l_tampilanatrribut2/General script]
views.get("lblmin2").vw.setLeft((int)((views.get("lbltambah2").vw.getLeft())));
//BA.debugLineNum = 14;BA.debugLine="lblPlus2.Right = lblTambah2.Right"[l_tampilanatrribut2/General script]
views.get("lblplus2").vw.setLeft((int)((views.get("lbltambah2").vw.getLeft() + views.get("lbltambah2").vw.getWidth()) - (views.get("lblplus2").vw.getWidth())));
//BA.debugLineNum = 15;BA.debugLine="lblJml2.Left = lblTambah2.Width/2-(lblJml2.Width/2)"[l_tampilanatrribut2/General script]
views.get("lbljml2").vw.setLeft((int)((views.get("lbltambah2").vw.getWidth())/2d-((views.get("lbljml2").vw.getWidth())/2d)));

}
}