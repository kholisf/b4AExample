package b4a.example2.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_atributredesain{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[l_atributReDesain/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="lblKamera.Height= 50dip"[l_atributReDesain/General script]
views.get("lblkamera").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 4;BA.debugLine="lblKamera.Width = 50dip"[l_atributReDesain/General script]
views.get("lblkamera").vw.setWidth((int)((50d * scale)));
//BA.debugLineNum = 5;BA.debugLine="lblKamera.Top = (ImageView1.Top + ImageView1.Height/2)-lblKamera.Height/2"[l_atributReDesain/General script]
views.get("lblkamera").vw.setTop((int)(((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())/2d)-(views.get("lblkamera").vw.getHeight())/2d));
//BA.debugLineNum = 6;BA.debugLine="lblKamera.Left = (ImageView1.Left + ImageView1.Width/2)-lblKamera.Width/2"[l_atributReDesain/General script]
views.get("lblkamera").vw.setLeft((int)(((views.get("imageview1").vw.getLeft())+(views.get("imageview1").vw.getWidth())/2d)-(views.get("lblkamera").vw.getWidth())/2d));
//BA.debugLineNum = 7;BA.debugLine="Label2.Top = clvInput.Top  +(clvInput.Height/2+2dip)"[l_atributReDesain/General script]
views.get("label2").vw.setTop((int)((views.get("clvinput").vw.getTop())+((views.get("clvinput").vw.getHeight())/2d+(2d * scale))));
//BA.debugLineNum = 8;BA.debugLine="Label3.Top = clvInput.Top  + (clvInput.Height/2 - (Label3.Height +2dip))"[l_atributReDesain/General script]
views.get("label3").vw.setTop((int)((views.get("clvinput").vw.getTop())+((views.get("clvinput").vw.getHeight())/2d-((views.get("label3").vw.getHeight())+(2d * scale)))));

}
}