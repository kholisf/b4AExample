package b4a.example2.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_templateatribut{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lblplus").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("lblmin").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("lbljml").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("lbltambah").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("lbltambah").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("lbltambah").vw.setLeft((int)(0d));
views.get("lblmin").vw.setLeft((int)((views.get("lbltambah").vw.getLeft())));
views.get("lblplus").vw.setLeft((int)((views.get("lbltambah").vw.getLeft() + views.get("lbltambah").vw.getWidth()) - (views.get("lblplus").vw.getWidth())));
//BA.debugLineNum = 15;BA.debugLine="lblJml.Left = lblTambah.Width/2-(lblJml.Width/2)"[l_TemplateAtribut/General script]
views.get("lbljml").vw.setLeft((int)((views.get("lbltambah").vw.getWidth())/2d-((views.get("lbljml").vw.getWidth())/2d)));

}
}