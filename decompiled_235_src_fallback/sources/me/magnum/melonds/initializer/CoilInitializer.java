package me.magnum.melonds.initializer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CoilInitializer implements defpackage.j53 {
    public CoilInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.j53
    public final java.util.List a() {
            r0 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @Override // defpackage.j53
    public final java.lang.Object b(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            android.content.Context r1 = r2.getApplicationContext()
            r2 = 0
            if (r1 == 0) goto L30
            java.lang.Class<k53> r0 = defpackage.k53.class
            java.lang.Object r1 = defpackage.hv.D(r1, r0)
            k53 r1 = (defpackage.k53) r1
            sb1 r1 = (defpackage.sb1) r1
            m55 r1 = r1.F
            java.lang.Object r1 = r1.get()
            pe5 r1 = (defpackage.pe5) r1
            if (r1 == 0) goto L2a
            java.lang.Class<vs0> r0 = defpackage.vs0.class
            monitor-enter(r0)
            defpackage.vs0.L = r1     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            jg7 r1 = defpackage.jg7.a
            return r1
        L27:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
        L2a:
            java.lang.String r1 = "imageLoader"
            defpackage.nb3.a0(r1)
            throw r2
        L30:
            defpackage.e41.m()
            return r2
    }
}
