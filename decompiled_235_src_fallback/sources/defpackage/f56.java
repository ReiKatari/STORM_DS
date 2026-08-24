package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f56  reason: default package */
/* loaded from: classes.dex */
public final class f56 {
    public final defpackage.g56 a;
    public final defpackage.t46 b;
    public final defpackage.jd1 c;
    public final java.util.LinkedHashMap d;
    public boolean e;
    public android.os.Bundle f;
    public boolean g;
    public boolean h;

    public f56(defpackage.g56 r1, defpackage.t46 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            jd1 r1 = new jd1
            r2 = 26
            r1.<init>(r2)
            r0.c = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.d = r1
            r1 = 1
            r0.h = r1
            return
    }

    public final void a() {
            r3 = this;
            g56 r0 = r3.a
            ut3 r1 = r0.getLifecycle()
            tt3 r1 = r1.b()
            tt3 r2 = defpackage.tt3.INITIALIZED
            if (r1 != r2) goto L2d
            boolean r1 = r3.e
            if (r1 != 0) goto L27
            t46 r1 = r3.b
            r1.c()
            ut3 r0 = r0.getLifecycle()
            wb4 r1 = new wb4
            r2 = 1
            r1.<init>(r3, r2)
            r0.a(r1)
            r3.e = r2
            return
        L27:
            java.lang.String r3 = "SavedStateRegistry was already attached."
            defpackage.i.m(r3)
            return
        L2d:
            java.lang.String r3 = "Restarter must be created only during owner's initialization stage"
            defpackage.i.m(r3)
            return
    }
}
