package b4a.example2.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_v4{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lblkamera").vw.setHeight((int)((50d * scale)));
views.get("lblkamera").vw.setWidth((int)((50d * scale)));
views.get("lblkamera").vw.setTop((int)(((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())/2d)-(views.get("lblkamera").vw.getHeight())/2d));
views.get("lblkamera").vw.setLeft((int)(((views.get("imageview1").vw.getLeft())+(views.get("imageview1").vw.getWidth())/2d)-(views.get("lblkamera").vw.getWidth())/2d));

}
}