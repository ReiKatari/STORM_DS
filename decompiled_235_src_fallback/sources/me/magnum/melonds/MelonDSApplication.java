package me.magnum.melonds;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MelonDSApplication extends android.app.Application implements defpackage.kr2 {
    public static final /* synthetic */ int f0 = 0;
    public boolean A;
    public final defpackage.mt B;
    public defpackage.rx2 L;
    public defpackage.kd6 R;
    public defpackage.m44 X;
    public defpackage.uh7 Y;
    public defpackage.xv2 Z;
    public defpackage.jd6 d0;
    public defpackage.ft e0;

    public MelonDSApplication() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.A = r0
            mt r0 = new mt
            d51 r1 = new d51
            r2 = 27
            r1.<init>(r3, r2)
            r0.<init>(r1)
            r3.B = r0
            return
    }

    public final void a() {
            r7 = this;
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            android.media.AudioAttributes r1 = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT
            r2 = 2131952303(0x7f1302af, float:1.9541045E38)
            java.lang.String r2 = r7.getString(r2)
            ch4 r3 = new ch4
            r3.<init>(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r7 >= r4) goto L18
            r0 = 0
            goto L38
        L18:
            r5 = 2
            java.lang.String r6 = "channel_cheat_importing"
            android.app.NotificationChannel r2 = defpackage.pt0.c(r5, r2, r6)
            defpackage.pt0.r(r2)
            defpackage.pt0.s(r2)
            defpackage.pt0.A(r2)
            defpackage.pt0.B(r2, r0, r1)
            defpackage.pt0.f(r2)
            defpackage.pt0.w(r2)
            defpackage.pt0.E(r2)
            defpackage.pt0.g(r2)
            r0 = r2
        L38:
            if (r7 < r4) goto L3f
            android.app.NotificationManager r7 = r3.b
            defpackage.pt0.d(r7, r0)
        L3f:
            return
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            super.attachBaseContext(r2)
            d90 r1 = defpackage.d90.w0
            boolean r2 = defpackage.d90.x0
            if (r2 == 0) goto Ld
            return
        Ld:
            monitor-enter(r1)
            boolean r2 = defpackage.d90.x0     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L14
            monitor-exit(r1)
            return
        L14:
            java.lang.String r2 = "melonDS-android-frontend"
            java.lang.System.loadLibrary(r2)     // Catch: java.lang.Throwable -> L25
            r2 = 1
            defpackage.d90.x0 = r2     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "NativeCore"
            java.lang.String r0 = "backend=source_multi_profile library=melonDS-android-frontend source=HEAD"
            android.util.Log.w(r2, r0)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            return
        L25:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final void b() {
            r4 = this;
            java.lang.String r0 = "HOME"
            java.io.File r1 = r4.getFilesDir()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            android.system.Os.setenv(r0, r1, r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "XDG_CACHE_HOME"
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L25
            java.io.File r4 = r4.getFilesDir()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "cache"
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L25
            android.system.Os.setenv(r0, r4, r2)     // Catch: java.lang.Throwable -> L25
            jg7 r4 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r4 = move-exception
            em5 r0 = new em5
            r0.<init>(r4)
            r4 = r0
        L2c:
            java.lang.Throwable r4 = defpackage.hm5.a(r4)
            if (r4 == 0) goto L39
            java.lang.String r0 = "MelonDSApplication"
            java.lang.String r1 = "Could not point librashader at a cache directory"
            android.util.Log.w(r0, r1, r4)
        L39:
            return
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r0 = this;
            mt r0 = r0.B
            java.lang.Object r0 = r0.c()
            return r0
    }

    public final void d() {
            r15 = this;
            boolean r0 = r15.A
            if (r0 != 0) goto L161
            r0 = 1
            r15.A = r0
            mt r1 = r15.B
            java.lang.Object r1 = r1.c()
            q34 r1 = (defpackage.q34) r1
            sb1 r1 = (defpackage.sb1) r1
            r1.getClass()
            wb1 r2 = new wb1
            r3 = 3
            r2.<init>(r3)
            java.lang.String r4 = "me.magnum.melonds.common.workers.CheatImportWorker"
            m55 r5 = r1.g
            r2.g(r4, r5)
            java.lang.String r4 = "me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker"
            m55 r5 = r1.o
            r2.g(r4, r5)
            java.lang.String r4 = "me.magnum.melonds.common.workers.RetroArchShaderInstallWorker"
            m55 r5 = r1.q
            r2.g(r4, r5)
            java.util.Map r2 = r2.f()
            rx2 r4 = new rx2
            r4.<init>(r2)
            r15.L = r4
            m55 r2 = r1.s
            java.lang.Object r2 = r2.get()
            kd6 r2 = (defpackage.kd6) r2
            r15.R = r2
            rh r2 = r1.a
            android.content.Context r2 = r2.a
            m55 r4 = r1.d
            java.lang.Object r4 = r4.get()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            m55 r5 = r1.v
            java.lang.Object r5 = r5.get()
            kx5 r5 = (defpackage.kx5) r5
            m55 r6 = r1.x
            java.lang.Object r6 = r6.get()
            p06 r6 = (defpackage.p06) r6
            m55 r7 = r1.s
            java.lang.Object r7 = r7.get()
            kd6 r7 = (defpackage.kd6) r7
            m55 r8 = r1.y
            java.lang.Object r8 = r8.get()
            yj1 r8 = (defpackage.yj1) r8
            m55 r9 = r1.r
            java.lang.Object r9 = r9.get()
            uh7 r9 = (defpackage.uh7) r9
            m55 r10 = r1.w
            java.lang.Object r10 = r10.get()
            su2 r10 = (defpackage.su2) r10
            m55 r11 = r1.h
            java.lang.Object r11 = r11.get()
            id3 r11 = (defpackage.id3) r11
            m55 r12 = r1.w
            java.lang.Object r12 = r12.get()
            su2 r12 = (defpackage.su2) r12
            r12.getClass()
            yc1 r13 = new yc1
            r13.<init>(r2, r12)
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            m44 r12 = new m44
            r12.<init>(r2, r4)
            h64 r14 = new h64
            r14.<init>(r4, r0)
            r12.E(r14)
            g64 r14 = new g64
            r14.<init>(r2, r3)
            r12.E(r14)
            x54 r3 = new x54
            r14 = 0
            r3.<init>(r5, r14)
            r12.E(r3)
            x54 r3 = new x54
            r3.<init>(r6, r0)
            r12.E(r3)
            z54 r3 = new z54
            r3.<init>(r7, r6, r8, r14)
            r12.E(r3)
            z54 r3 = new z54
            r3.<init>(r2, r10, r9, r0)
            r12.E(r3)
            b64 r3 = new b64
            r3.<init>(r13, r2)
            r12.E(r3)
            c64 r3 = new c64
            r3.<init>(r14, r13)
            r12.E(r3)
            d64 r3 = new d64
            r3.<init>(r13)
            r12.E(r3)
            e64 r3 = new e64
            r3.<init>(r13, r2)
            r12.E(r3)
            f64 r3 = new f64
            r3.<init>(r2, r11)
            r12.E(r3)
            g64 r3 = new g64
            r3.<init>(r2, r14)
            r12.E(r3)
            g64 r3 = new g64
            r3.<init>(r13, r2)
            r12.E(r3)
            c64 r3 = new c64
            r3.<init>(r0, r13)
            r12.E(r3)
            g64 r0 = new g64
            r3 = 2
            r0.<init>(r2, r3)
            r12.E(r0)
            h64 r0 = new h64
            r0.<init>(r4, r14)
            r12.E(r0)
            r15.X = r12
            m55 r0 = r1.r
            java.lang.Object r0 = r0.get()
            uh7 r0 = (defpackage.uh7) r0
            r15.Y = r0
            m55 r0 = r1.z
            java.lang.Object r0 = r0.get()
            xv2 r0 = (defpackage.xv2) r0
            r15.Z = r0
            m55 r0 = r1.e
            java.lang.Object r0 = r0.get()
            jd6 r0 = (defpackage.jd6) r0
            r15.d0 = r0
            m55 r0 = r1.A
            java.lang.Object r0 = r0.get()
            ft r0 = (defpackage.ft) r0
            r15.e0 = r0
        L161:
            super.onCreate()
            return
    }

    public final void e() {
            r12 = this;
            m44 r12 = r12.X
            if (r12 == 0) goto L7d
            java.lang.Object r0 = r12.L
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = "last_version"
            r2 = 6
            long r4 = r0.getLong(r1, r2)
            long r6 = r12.j()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L7c
            long r2 = r0.getLong(r1, r2)
            long r4 = r12.j()
            java.lang.Object r6 = r12.R
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            zh2 r7 = new zh2
            r8 = 22
            r7.<init>(r8)
            java.util.List r6 = defpackage.gt0.d1(r6, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L38:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L5b
            java.lang.Object r8 = r6.next()
            r9 = r8
            y54 r9 = (defpackage.y54) r9
            int r10 = r9.a()
            long r10 = (long) r10
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 < 0) goto L38
            int r9 = r9.c()
            long r9 = (long) r9
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto L38
            r7.add(r8)
            goto L38
        L5b:
            int r2 = r7.size()
            r3 = 0
        L60:
            if (r3 >= r2) goto L6e
            java.lang.Object r4 = r7.get(r3)
            int r3 = r3 + 1
            y54 r4 = (defpackage.y54) r4
            r4.b()     // Catch: java.lang.Throwable -> L60
            goto L60
        L6e:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r2 = r12.j()
            r0.putLong(r1, r2)
            r0.apply()
        L7c:
            return
        L7d:
            java.lang.String r12 = "migrator"
            defpackage.nb3.a0(r12)
            r12 = 0
            throw r12
    }

    public final void f() {
            r10 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lf
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            int r0 = defpackage.ge7.s(r10, r0)
            if (r0 == 0) goto Lf
            goto L2e
        Lf:
            xv2 r0 = r10.Z
            java.lang.String r1 = "hardcoreOfflineLossTracker"
            r2 = 0
            if (r0 == 0) goto L95
            wv2 r3 = r0.d()
            if (r3 != 0) goto L1e
            r3 = r2
            goto L21
        L1e:
            r0.a()
        L21:
            if (r3 != 0) goto L24
            goto L2e
        L24:
            java.lang.String r9 = r3.c
            int r0 = r3.e
            int r4 = r3.d
            int r5 = r4 + r0
            if (r5 > 0) goto L2f
        L2e:
            return
        L2f:
            xg4 r5 = new xg4
            java.lang.String r6 = "channel_cheat_importing"
            r5.<init>(r10, r6)
            r6 = 2131230963(0x7f0800f3, float:1.8077994E38)
            android.app.Notification r7 = r5.t
            r7.icon = r6
            r6 = 2131952312(0x7f1302b8, float:1.9541063E38)
            java.lang.String r6 = r10.getString(r6)
            java.lang.CharSequence r6 = defpackage.xg4.b(r6)
            r5.e = r6
            int r6 = r4 + r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r4, r0, r9}
            r4 = 2131952406(0x7f130316, float:1.9541254E38)
            java.lang.String r0 = r10.getString(r4, r0)
            java.lang.CharSequence r0 = defpackage.xg4.b(r0)
            r5.f = r0
            r0 = 0
            r5.h = r0
            r0 = 16
            r5.c(r0)
            android.app.Notification r0 = r5.a()
            r0.getClass()
            ch4 r4 = new ch4     // Catch: java.lang.SecurityException -> L81
            r4.<init>(r10)     // Catch: java.lang.SecurityException -> L81
            r4.a(r0)     // Catch: java.lang.SecurityException -> L81
            return
        L81:
            xv2 r4 = r10.Z
            if (r4 == 0) goto L91
            java.lang.String r7 = r3.a
            java.lang.String r8 = r3.b
            int r5 = r3.d
            int r6 = r3.e
            r4.c(r5, r6, r7, r8, r9)
            return
        L91:
            defpackage.nb3.a0(r1)
            throw r2
        L95:
            defpackage.nb3.a0(r1)
            throw r2
    }

    @Override // android.app.Application
    public final void onCreate() {
            r5 = this;
            r5.d()
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            o34 r1 = new o34
            r1.<init>(r5, r0)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
            r5.b()     // Catch: java.lang.Throwable -> L12
        L12:
            defpackage.n90.a(r5)     // Catch: java.lang.Throwable -> L15
        L15:
            r0 = 0
            vs4 r1 = defpackage.ht.a     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = defpackage.v15.b(r5)     // Catch: java.lang.Throwable -> L42
            android.content.SharedPreferences r1 = r5.getSharedPreferences(r1, r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "theme"
            java.lang.String r3 = "dark"
            java.lang.String r2 = r1.getString(r2, r3)     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = r2
        L2c:
            vs4 r2 = defpackage.ht.a     // Catch: java.lang.Throwable -> L42
            e57 r4 = defpackage.g57.Companion     // Catch: java.lang.Throwable -> L42
            r4.getClass()     // Catch: java.lang.Throwable -> L42
            g57 r3 = defpackage.e57.a(r3)     // Catch: java.lang.Throwable -> L42
            r2.setValue(r3)     // Catch: java.lang.Throwable -> L42
            gt r2 = new gt     // Catch: java.lang.Throwable -> L42
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L42
            r1.registerOnSharedPreferenceChangeListener(r2)     // Catch: java.lang.Throwable -> L42
        L42:
            r1 = 2
            java.lang.String r2 = defpackage.v15.b(r5)     // Catch: java.lang.Throwable -> L61
            android.content.SharedPreferences r0 = r5.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = "rom_display_name_mode"
            java.lang.String r3 = "file_name"
            java.lang.String r2 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> L61
            if (r2 != 0) goto L56
            goto L57
        L56:
            r3 = r2
        L57:
            defpackage.gi2.c = r3     // Catch: java.lang.Throwable -> L61
            gt r2 = new gt     // Catch: java.lang.Throwable -> L61
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L61
            r0.registerOnSharedPreferenceChangeListener(r2)     // Catch: java.lang.Throwable -> L61
        L61:
            r5.a()     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = 0
            ms2 r2 = defpackage.ms2.A     // Catch: java.lang.Throwable -> L73
            xe1 r3 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L73
            jv2 r3 = defpackage.e04.a     // Catch: java.lang.Throwable -> L73
            ns3 r4 = new ns3     // Catch: java.lang.Throwable -> L73
            r4.<init>(r5, r0, r1)     // Catch: java.lang.Throwable -> L73
            defpackage.hv.L(r2, r3, r0, r4, r1)     // Catch: java.lang.Throwable -> L73
        L73:
            r5.e()     // Catch: java.lang.Throwable -> L76
        L76:
            jd6 r2 = r5.d0     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L7e
            r2.i()     // Catch: java.lang.Throwable -> L84
            goto L84
        L7e:
            java.lang.String r2 = "settingsBackupManager"
            defpackage.nb3.a0(r2)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        L84:
            ft r2 = r5.e0     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L94
            o41 r3 = r2.c     // Catch: java.lang.Throwable -> L9a
            a6 r4 = new a6     // Catch: java.lang.Throwable -> L9a
            r4.<init>(r2, r0, r1)     // Catch: java.lang.Throwable -> L9a
            r1 = 3
            defpackage.hv.L(r3, r0, r0, r4, r1)     // Catch: java.lang.Throwable -> L9a
            goto L9a
        L94:
            java.lang.String r1 = "appLogFileRecorder"
            defpackage.nb3.a0(r1)     // Catch: java.lang.Throwable -> L9a
            throw r0     // Catch: java.lang.Throwable -> L9a
        L9a:
            r5.f()     // Catch: java.lang.Throwable -> L9d
        L9d:
            me.magnum.melonds.MelonDSAndroidInterface r1 = me.magnum.melonds.MelonDSAndroidInterface.a     // Catch: java.lang.Throwable -> Lcb
            me.magnum.melonds.common.UriFileHandler r2 = new me.magnum.melonds.common.UriFileHandler     // Catch: java.lang.Throwable -> Lcb
            uh7 r3 = r5.Y     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto Lc5
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> Lcb
            kd6 r3 = r5.R     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto Lbf
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r5 = r5.nativeLibraryDir     // Catch: java.lang.Throwable -> Lcb
            r5.getClass()     // Catch: java.lang.Throwable -> Lcb
            ng6 r3 = (defpackage.ng6) r3     // Catch: java.lang.Throwable -> Lcb
            yq7 r5 = r3.z(r5)     // Catch: java.lang.Throwable -> Lcb
            r1.d(r2, r5)     // Catch: java.lang.Throwable -> Lcb
            goto Lcb
        Lbf:
            java.lang.String r5 = "settingsRepository"
            defpackage.nb3.a0(r5)     // Catch: java.lang.Throwable -> Lcb
            throw r0     // Catch: java.lang.Throwable -> Lcb
        Lc5:
            java.lang.String r5 = "uriHandler"
            defpackage.nb3.a0(r5)     // Catch: java.lang.Throwable -> Lcb
            throw r0     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            return
    }

    @Override // android.app.Application
    public final void onTerminate() {
            r1 = this;
            super.onTerminate()
            ft r1 = r1.e0
            r0 = 0
            if (r1 == 0) goto L13
            o41 r1 = r1.c
            defpackage.g04.x(r1, r0)
            me.magnum.melonds.MelonDSAndroidInterface r1 = me.magnum.melonds.MelonDSAndroidInterface.a
            r1.cleanup()
            return
        L13:
            java.lang.String r1 = "appLogFileRecorder"
            defpackage.nb3.a0(r1)
            throw r0
    }
}
