package defpackage;

import android.graphics.PathMeasure;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xi  reason: default package */
/* loaded from: classes.dex */
public final class xi {
    public final PathMeasure a;

    public xi(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, vi viVar) {
        if (viVar != null) {
            this.a.getSegment(f, f2, viVar.a, true);
            return;
        }
        vd6.i("Unable to obtain android.graphics.Path");
    }
}
