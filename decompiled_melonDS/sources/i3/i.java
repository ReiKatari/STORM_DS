package i3;

import android.graphics.PathMeasure;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f6641a;

    public i(PathMeasure pathMeasure) {
        this.f6641a = pathMeasure;
    }

    public final void a(float f8, float f10, h hVar) {
        if (hVar != null) {
            this.f6641a.getSegment(f8, f10, hVar.f6635a, true);
            return;
        }
        m9.o.v("Unable to obtain android.graphics.Path");
    }
}
