package defpackage;

import android.view.RenderNode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s95  reason: default package */
/* loaded from: classes.dex */
public abstract class s95 {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    public static void d(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }
}
