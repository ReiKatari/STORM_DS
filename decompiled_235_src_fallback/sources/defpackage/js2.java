package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: js2  reason: default package */
/* loaded from: classes.dex */
public final class js2 extends defpackage.ut3 {
    public static final defpackage.js2 b = null;
    public static final defpackage.is2 c = null;

    static {
            js2 r0 = new js2
            r0.<init>()
            defpackage.js2.b = r0
            is2 r0 = new is2
            r0.<init>()
            defpackage.js2.c = r0
            return
    }

    @Override // defpackage.ut3
    public final void a(defpackage.gu3 r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.qe1
            if (r0 == 0) goto L12
            qe1 r1 = (defpackage.qe1) r1
            is2 r0 = defpackage.js2.c
            r0.getClass()
            r1.onStart(r0)
            r1.onResume(r0)
            return
        L12:
            java.lang.String r0 = " must implement androidx.lifecycle.DefaultLifecycleObserver."
            defpackage.e41.f(r1, r0)
            return
    }

    @Override // defpackage.ut3
    public final defpackage.tt3 b() {
            r0 = this;
            tt3 r0 = defpackage.tt3.RESUMED
            return r0
    }

    @Override // defpackage.ut3
    public final void c(defpackage.gu3 r1) {
            r0 = this;
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "coil.request.GlobalLifecycle"
            return r0
    }
}
