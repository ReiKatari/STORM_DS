package me.magnum.melonds.initializer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class AppForegroundStateTrackerInitializer implements defpackage.j53 {
    public AppForegroundStateTrackerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.j53
    public final java.util.List a() {
            r0 = this;
            yt1 r0 = defpackage.yt1.A
            return r0
    }

    @Override // defpackage.j53
    public final java.lang.Object b(android.content.Context r3) {
            r2 = this;
            r3.getClass()
            android.content.Context r2 = r3.getApplicationContext()
            r0 = 0
            if (r2 == 0) goto L2e
            java.lang.Class<k53> r1 = defpackage.k53.class
            java.lang.Object r2 = defpackage.hv.D(r2, r1)
            k53 r2 = (defpackage.k53) r2
            sb1 r2 = (defpackage.sb1) r2
            m55 r2 = r2.G
            java.lang.Object r2 = r2.get()
            at r2 = (defpackage.at) r2
            if (r2 == 0) goto L28
            android.app.Application r3 = (android.app.Application) r3
            zs r2 = r2.c
            r3.registerActivityLifecycleCallbacks(r2)
            jg7 r2 = defpackage.jg7.a
            return r2
        L28:
            java.lang.String r2 = "appForegroundStateTracker"
            defpackage.nb3.a0(r2)
            throw r0
        L2e:
            defpackage.e41.m()
            return r0
    }
}
