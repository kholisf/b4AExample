package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layout_item{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[layout_item/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="Label1.Left = 0"[layout_item/General script]
views.get("label1").vw.setLeft((int)(0d));
//BA.debugLineNum = 4;BA.debugLine="Label1.Width = 50%x"[layout_item/General script]
views.get("label1").vw.setWidth((int)((50d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="Label1.Top = 0"[layout_item/General script]
views.get("label1").vw.setTop((int)(0d));
//BA.debugLineNum = 6;BA.debugLine="Label1.Height = 100%y"[layout_item/General script]
views.get("label1").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 8;BA.debugLine="Label2.Left = 50%x"[layout_item/General script]
views.get("label2").vw.setLeft((int)((50d / 100 * width)));
//BA.debugLineNum = 9;BA.debugLine="Label2.Width = 50%x"[layout_item/General script]
views.get("label2").vw.setWidth((int)((50d / 100 * width)));
//BA.debugLineNum = 10;BA.debugLine="Label2.Top = 0"[layout_item/General script]
views.get("label2").vw.setTop((int)(0d));
//BA.debugLineNum = 11;BA.debugLine="Label2.Height = 100%y"[layout_item/General script]
views.get("label2").vw.setHeight((int)((100d / 100 * height)));

}
}