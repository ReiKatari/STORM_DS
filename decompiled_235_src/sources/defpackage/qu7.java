package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qu7  reason: default package */
/* loaded from: classes.dex */
public final class qu7 extends pu7 {
    public qu7(vu7 vu7Var, WindowInsets windowInsets) {
        super(vu7Var, windowInsets);
    }

    @Override // defpackage.ju7, defpackage.ru7
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(uu7.a(i));
        return boundingRects;
    }

    @Override // defpackage.ju7, defpackage.ru7
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(uu7.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.ju7, defpackage.ru7
    public void p() {
    }
}
