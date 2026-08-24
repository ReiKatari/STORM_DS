package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi2  reason: default package */
/* loaded from: classes.dex */
public final class vi2 implements defpackage.vs1 {
    public final android.content.Context a;
    public final defpackage.ui2 b;
    public final defpackage.w31 c;
    public final java.lang.Object d;
    public android.os.Handler e;
    public java.util.concurrent.ThreadPoolExecutor f;
    public java.util.concurrent.ThreadPoolExecutor g;
    public defpackage.hv h;

    public vi2(android.content.Context r2, defpackage.ui2 r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.d = r0
            java.lang.String r0 = "Context cannot be null"
            defpackage.np2.x(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            r1.a = r2
            r1.b = r3
            w31 r2 = defpackage.wi2.d
            r1.c = r2
            return
    }

    @Override // defpackage.vs1
    public final void a(defpackage.hv r10) {
            r9 = this;
            java.lang.Object r1 = r9.d
            monitor-enter(r1)
            r9.h = r10     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.Object r10 = r9.d
            monitor-enter(r10)
            hv r0 = r9.h     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L12
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            r9 = r0
            goto L43
        L12:
            java.util.concurrent.ThreadPoolExecutor r0 = r9.f     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L35
            java.lang.String r0 = "emojiCompat"
            ry0 r8 = new ry0     // Catch: java.lang.Throwable -> Lf
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.LinkedBlockingDeque r7 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> Lf
            r7.<init>()     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r3 = 1
            r4 = 15
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            r1.allowCoreThreadTimeOut(r0)     // Catch: java.lang.Throwable -> Lf
            r9.g = r1     // Catch: java.lang.Throwable -> Lf
            r9.f = r1     // Catch: java.lang.Throwable -> Lf
        L35:
            java.util.concurrent.ThreadPoolExecutor r0 = r9.f     // Catch: java.lang.Throwable -> Lf
            n0 r1 = new n0     // Catch: java.lang.Throwable -> Lf
            r2 = 26
            r1.<init>(r9, r2)     // Catch: java.lang.Throwable -> Lf
            r0.execute(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        L43:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            throw r9
        L45:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r9
    }

    public final void b() {
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            r1 = 0
            r3.h = r1     // Catch: java.lang.Throwable -> Le
            android.os.Handler r2 = r3.e     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L10
            r2.removeCallbacks(r1)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L1f
        L10:
            r3.e = r1     // Catch: java.lang.Throwable -> Le
            java.util.concurrent.ThreadPoolExecutor r2 = r3.g     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L19
            r2.shutdown()     // Catch: java.lang.Throwable -> Le
        L19:
            r3.f = r1     // Catch: java.lang.Throwable -> Le
            r3.g = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    public final defpackage.rj2 c() {
            r4 = this;
            r0 = 0
            w31 r1 = r4.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            android.content.Context r2 = r4.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            ui2 r4 = r4.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r1.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r3 = 1
            r1.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r3 = 0
            r4 = r4[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.util.Objects.requireNonNull(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            r1.add(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.util.List r4 = java.util.Collections.unmodifiableList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            qj2 r4 = defpackage.ti2.a(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            int r1 = r4.a
            if (r1 != 0) goto L3f
            java.util.List r4 = r4.b
            java.lang.Object r4 = r4.get(r3)
            rj2[] r4 = (defpackage.rj2[]) r4
            if (r4 == 0) goto L39
            int r1 = r4.length
            if (r1 == 0) goto L39
            r4 = r4[r3]
            return r4
        L39:
            java.lang.String r4 = "fetchFonts failed (empty result)"
            defpackage.u34.j(r4)
            return r0
        L3f:
            java.lang.String r4 = "fetchFonts failed ("
            java.lang.String r2 = ")"
            java.lang.String r4 = defpackage.lb1.k(r4, r1, r2)
            defpackage.u34.j(r4)
            return r0
        L4b:
            r4 = move-exception
            java.lang.String r1 = "provider not found"
            defpackage.u34.p(r1, r4)
            return r0
    }
}
