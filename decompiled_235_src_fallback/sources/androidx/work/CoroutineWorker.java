package androidx.work;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends defpackage.nx3 {
    public final androidx.work.WorkerParameters e;
    public final defpackage.b71 f;

    public CoroutineWorker(android.content.Context r1, androidx.work.WorkerParameters r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1, r2)
            r0.e = r2
            b71 r1 = defpackage.b71.L
            r0.f = r1
            return
    }

    @Override // defpackage.nx3
    public final defpackage.tb0 a() {
            r4 = this;
            tc3 r0 = defpackage.yh2.c()
            b71 r1 = r4.f
            r1.getClass()
            l61 r0 = defpackage.jw2.y(r1, r0)
            c71 r1 = new c71
            r2 = 0
            r3 = 0
            r1.<init>(r4, r3, r2)
            tb0 r4 = defpackage.yh2.B(r0, r1)
            return r4
    }

    @Override // defpackage.nx3
    public final defpackage.tb0 d() {
            r4 = this;
            b71 r0 = defpackage.b71.L
            b71 r1 = r4.f
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto Lb
            goto Lf
        Lb:
            androidx.work.WorkerParameters r0 = r4.e
            l61 r1 = r0.d
        Lf:
            r1.getClass()
            tc3 r0 = defpackage.yh2.c()
            l61 r0 = r1.N(r0)
            c71 r1 = new c71
            r2 = 1
            r3 = 0
            r1.<init>(r4, r3, r2)
            tb0 r4 = defpackage.yh2.B(r0, r1)
            return r4
    }

    public abstract java.lang.Object e(defpackage.r41 r1);

    public java.lang.Object f() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not implemented"
            r1.<init>(r0)
            throw r1
    }
}
