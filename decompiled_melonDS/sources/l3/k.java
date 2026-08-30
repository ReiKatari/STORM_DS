package l3;

import android.view.RenderNode;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i2) {
        renderNode.setAmbientShadowColor(i2);
    }

    public static void d(RenderNode renderNode, int i2) {
        renderNode.setSpotShadowColor(i2);
    }
}
