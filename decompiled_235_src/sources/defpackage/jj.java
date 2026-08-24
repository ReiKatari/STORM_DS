package defpackage;

import android.graphics.PathMeasure;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jj  reason: default package */
/* loaded from: classes.dex */
public final class jj {
    public final PathMeasure a;

    public jj(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, hj hjVar) {
        if (hjVar != null) {
            this.a.getSegment(f, f2, hjVar.a, true);
            return;
        }
        fa6.h("Unable to obtain android.graphics.Path");
    }
}
