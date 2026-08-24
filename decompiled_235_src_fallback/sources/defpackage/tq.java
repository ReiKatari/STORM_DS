package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq  reason: default package */
/* loaded from: classes.dex */
public abstract class tq {
    public static final defpackage.zb6 A = null;
    public static int B;
    public static defpackage.hy3 L;
    public static defpackage.hy3 R;
    public static java.lang.Boolean X;
    public static boolean Y;
    public static final defpackage.zu Z = null;
    public static final java.lang.Object d0 = null;
    public static final java.lang.Object e0 = null;

    static {
            zb6 r0 = new zb6
            uj1 r1 = new uj1
            r2 = 1
            r1.<init>(r2)
            r0.<init>(r1)
            defpackage.tq.A = r0
            r0 = -100
            defpackage.tq.B = r0
            r0 = 0
            defpackage.tq.L = r0
            defpackage.tq.R = r0
            defpackage.tq.X = r0
            r0 = 0
            defpackage.tq.Y = r0
            zu r1 = new zu
            r1.<init>(r0)
            defpackage.tq.Z = r1
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.tq.d0 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.tq.e0 = r0
            return
    }

    public static void a() {
            zu r0 = defpackage.tq.Z
            r0.getClass()
            su r1 = new su
            r1.<init>(r0)
        La:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r1.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            tq r0 = (defpackage.tq) r0
            if (r0 == 0) goto La
            fr r0 = (defpackage.fr) r0
            android.content.Context r2 = r0.g0
            boolean r3 = e(r2)
            r4 = 1
            if (r3 == 0) goto L3f
            hy3 r3 = defpackage.tq.L
            if (r3 == 0) goto L3f
            hy3 r5 = defpackage.tq.R
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L3f
            qq r3 = new qq
            r3.<init>(r2, r4)
            zb6 r2 = defpackage.tq.A
            r2.execute(r3)
        L3f:
            r0.q(r4, r4)
            goto La
        L43:
            return
    }

    public static java.lang.Object b() {
            zu r0 = defpackage.tq.Z
            r0.getClass()
            su r1 = new su
            r1.<init>(r0)
        La:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r1.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            tq r0 = (defpackage.tq) r0
            if (r0 == 0) goto La
            fr r0 = (defpackage.fr) r0
            android.content.Context r0 = r0.g0
            if (r0 == 0) goto La
            java.lang.String r1 = "locale"
            java.lang.Object r0 = r0.getSystemService(r1)
            return r0
        L2b:
            r0 = 0
            return r0
    }

    public static boolean e(android.content.Context r4) {
            java.lang.Boolean r0 = defpackage.tq.X
            if (r0 != 0) goto L37
            int r0 = defpackage.dt.A     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            int r0 = defpackage.ct.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            r0 = r0 | 128(0x80, float:1.8E-43)
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            java.lang.Class<dt> r3 = defpackage.dt.class
            r2.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.content.pm.ServiceInfo r4 = r1.getServiceInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            if (r4 == 0) goto L37
            java.lang.String r0 = "autoStoreLocales"
            boolean r4 = r4.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            defpackage.tq.X = r4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            goto L37
        L2c:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r0 = "Checking for metadata for AppLocalesMetadataHolderService : Service not found"
            android.util.Log.d(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            defpackage.tq.X = r4
        L37:
            java.lang.Boolean r4 = defpackage.tq.X
            boolean r4 = r4.booleanValue()
            return r4
    }

    public static void h(defpackage.fr r3) {
            java.lang.Object r0 = defpackage.tq.d0
            monitor-enter(r0)
            zu r1 = defpackage.tq.Z     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            su r2 = new su     // Catch: java.lang.Throwable -> L27
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L27
        Ld:
            boolean r1 = r2.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L27
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L27
            tq r1 = (defpackage.tq) r1     // Catch: java.lang.Throwable -> L27
            if (r1 == r3) goto L23
            if (r1 != 0) goto Ld
        L23:
            r2.remove()     // Catch: java.lang.Throwable -> L27
            goto Ld
        L27:
            r3 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    public static void j(defpackage.hy3 r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1f
            java.lang.Object r0 = b()
            if (r0 == 0) goto L34
            iy3 r2 = r2.a
            android.os.LocaleList r2 = r2.a
            java.lang.String r2 = r2.toLanguageTags()
            android.os.LocaleList r2 = defpackage.rq.a(r2)
            defpackage.sq.b(r0, r2)
            return
        L1f:
            hy3 r0 = defpackage.tq.L
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L34
            java.lang.Object r0 = defpackage.tq.d0
            monitor-enter(r0)
            defpackage.tq.L = r2     // Catch: java.lang.Throwable -> L31
            a()     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r2
        L34:
            return
    }

    public static void p(android.content.Context r3) {
            boolean r0 = e(r3)
            if (r0 != 0) goto L7
            goto L1c
        L7:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1d
            boolean r0 = defpackage.tq.Y
            if (r0 != 0) goto L1c
            zb6 r0 = defpackage.tq.A
            qq r1 = new qq
            r2 = 0
            r1.<init>(r3, r2)
            r0.execute(r1)
        L1c:
            return
        L1d:
            java.lang.Object r0 = defpackage.tq.e0
            monitor-enter(r0)
            hy3 r1 = defpackage.tq.L     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L48
            hy3 r1 = defpackage.tq.R     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            java.lang.String r3 = defpackage.lb4.G(r3)     // Catch: java.lang.Throwable -> L33
            hy3 r3 = defpackage.hy3.a(r3)     // Catch: java.lang.Throwable -> L33
            defpackage.tq.R = r3     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r3 = move-exception
            goto L61
        L35:
            hy3 r3 = defpackage.tq.R     // Catch: java.lang.Throwable -> L33
            iy3 r3 = r3.a     // Catch: java.lang.Throwable -> L33
            android.os.LocaleList r3 = r3.a     // Catch: java.lang.Throwable -> L33
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L43:
            hy3 r3 = defpackage.tq.R     // Catch: java.lang.Throwable -> L33
            defpackage.tq.L = r3     // Catch: java.lang.Throwable -> L33
            goto L5f
        L48:
            hy3 r2 = defpackage.tq.R     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L5f
            hy3 r1 = defpackage.tq.L     // Catch: java.lang.Throwable -> L33
            defpackage.tq.R = r1     // Catch: java.lang.Throwable -> L33
            iy3 r1 = r1.a     // Catch: java.lang.Throwable -> L33
            android.os.LocaleList r1 = r1.a     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.toLanguageTags()     // Catch: java.lang.Throwable -> L33
            defpackage.lb4.F(r3, r1)     // Catch: java.lang.Throwable -> L33
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
    }

    public abstract void c();

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int r1);

    public abstract void k(int r1);

    public abstract void l(android.view.View r1);

    public abstract void m(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    public abstract void o(java.lang.CharSequence r1);
}
