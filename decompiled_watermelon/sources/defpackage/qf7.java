package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qf7  reason: default package */
/* loaded from: classes.dex */
public final class qf7 extends pf7 {
    public qf7(vf7 vf7Var, WindowInsets windowInsets) {
        super(vf7Var, windowInsets);
    }

    @Override // defpackage.jf7, defpackage.rf7
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(uf7.a(i));
        return boundingRects;
    }

    @Override // defpackage.jf7, defpackage.rf7
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(uf7.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.jf7, defpackage.rf7
    public void p() {
    }
}
