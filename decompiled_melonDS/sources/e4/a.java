package e4;

import android.graphics.RenderNode;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.view.contentcapture.ContentCaptureSession;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ RenderNode e() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable f(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession g(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ boolean l(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
