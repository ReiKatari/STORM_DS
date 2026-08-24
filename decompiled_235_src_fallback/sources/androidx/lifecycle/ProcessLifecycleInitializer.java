package androidx.lifecycle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements defpackage.j53 {
    public ProcessLifecycleInitializer() {
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
            bt r2 = defpackage.bt.J(r3)
            r2.getClass()
            java.lang.Object r2 = r2.L
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L56
            java.util.concurrent.atomic.AtomicBoolean r2 = defpackage.cu3.a
            r0 = 1
            boolean r2 = r2.getAndSet(r0)
            if (r2 == 0) goto L20
            goto L31
        L20:
            android.content.Context r2 = r3.getApplicationContext()
            r2.getClass()
            android.app.Application r2 = (android.app.Application) r2
            bu3 r0 = new bu3
            r0.<init>()
            r2.registerActivityLifecycleCallbacks(r0)
        L31:
            h35 r2 = defpackage.h35.e0
            r2.getClass()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.X = r0
            ku3 r0 = r2.Y
            st3 r1 = defpackage.st3.ON_CREATE
            r0.f(r1)
            android.content.Context r3 = r3.getApplicationContext()
            r3.getClass()
            android.app.Application r3 = (android.app.Application) r3
            g35 r0 = new g35
            r0.<init>(r2)
            r3.registerActivityLifecycleCallbacks(r0)
            return r2
        L56:
            java.lang.String r2 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml"
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }
}
