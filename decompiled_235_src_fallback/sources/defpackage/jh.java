package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jh  reason: default package */
/* loaded from: classes.dex */
public final class jh {
    public final android.content.Context a;
    public final defpackage.kd6 b;
    public final defpackage.ro6 c;
    public final defpackage.d76 d;
    public final defpackage.mp e;
    public final defpackage.uv4 f;
    public final defpackage.g91 g;
    public final defpackage.sx1 h;
    public final defpackage.fg i;
    public final defpackage.ce6 j;
    public final defpackage.fb2 k;
    public final defpackage.of6 l;
    public final defpackage.be5 m;
    public final defpackage.of6 n;
    public final defpackage.p87 o;
    public volatile boolean p;
    public final defpackage.bg1 q;
    public final me.magnum.melonds.impl.emulator.EmulatorMessageQueue r;

    public jh(android.content.Context r1, defpackage.kd6 r2, defpackage.ro6 r3, defpackage.d76 r4, defpackage.mp r5, defpackage.uv4 r6, defpackage.g91 r7, defpackage.sx1 r8, defpackage.fg r9, defpackage.ce6 r10, defpackage.fb2 r11) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r3 = 5
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            of6 r3 = defpackage.pf6.b(r4, r5, r6, r3)
            r0.l = r3
            be5 r7 = new be5
            r7.<init>(r3)
            r0.m = r7
            r3 = 4
            of6 r3 = defpackage.pf6.b(r4, r5, r6, r3)
            r0.n = r3
            p87 r3 = new p87
            r3.<init>()
            r3.a = r1
            r3.b = r2
            java.io.File r2 = new java.io.File
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r4 = "dldi"
            r2.<init>(r1, r4)
            r3.d = r2
            java.io.File r1 = new java.io.File
            java.lang.String r4 = "sync"
            r1.<init>(r2, r4)
            r3.e = r1
            java.io.File r1 = new java.io.File
            java.lang.String r4 = "dldi_sd.img"
            r1.<init>(r2, r4)
            r3.f = r1
            java.io.File r1 = new java.io.File
            java.lang.String r4 = "dldi_sync_state.json"
            r1.<init>(r2, r4)
            r3.g = r1
            r0.o = r3
            bg1 r1 = new bg1
            r2 = 1
            r1.<init>(r2)
            r0.q = r1
            me.magnum.melonds.impl.emulator.EmulatorMessageQueue r1 = new me.magnum.melonds.impl.emulator.EmulatorMessageQueue
            h61 r3 = new h61
            r3.<init>(r0, r2)
            r1.<init>(r3)
            r0.r = r1
            return
    }

    public static final boolean a(defpackage.jh r10, me.magnum.melonds.domain.model.EmulatorConfiguration r11) {
            r10.getClass()
            me.magnum.melonds.domain.model.RendererConfiguration r0 = r11.getRendererConfiguration()
            po5 r1 = r0.getRetroArchShader()
            me.magnum.melonds.domain.model.VideoRenderer r2 = r0.getRenderer()
            me.magnum.melonds.domain.model.VideoFiltering r0 = r0.getVideoFiltering()
            java.lang.String r3 = r1.a
            if (r3 != 0) goto L19
            java.lang.String r3 = "<none>"
        L19:
            hp5 r4 = r1.b
            int r5 = r1.c
            long r6 = r1.d
            boolean r1 = r1.f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "RetroArchShaderLaunch: renderer="
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r2 = " filter="
            r8.append(r2)
            r8.append(r0)
            java.lang.String r0 = " preset="
            r8.append(r0)
            r8.append(r3)
            java.lang.String r0 = " source="
            r8.append(r0)
            r8.append(r4)
            java.lang.String r0 = " passes="
            r8.append(r0)
            r8.append(r5)
            java.lang.String r0 = " sourceBytes="
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = " clearHistory="
            r8.append(r0)
            r8.append(r1)
            java.lang.String r0 = r8.toString()
            java.lang.String r1 = "AndroidEmulatorManager"
            android.util.Log.i(r1, r0)
            me.magnum.melonds.domain.model.RendererConfiguration r0 = r11.getRendererConfiguration()
            me.magnum.melonds.domain.model.VideoRenderer r0 = r0.getRenderer()
            me.magnum.melonds.domain.model.VideoRenderer r1 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r0 == r1) goto L72
            r10 = 1
            return r10
        L72:
            me.magnum.melonds.domain.model.RendererConfiguration r0 = r11.getRendererConfiguration()
            po5 r0 = r0.getRetroArchShader()
            long r1 = android.os.SystemClock.elapsedRealtime()
            me.magnum.melonds.domain.model.RendererConfiguration r11 = r11.getRendererConfiguration()
            me.magnum.melonds.domain.model.VideoFiltering r11 = r11.getVideoFiltering()
            int r4 = r11.ordinal()
            java.lang.String r5 = r0.a
            hp5 r11 = r0.b
            java.lang.String r11 = r11.name()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r6 = r11.toLowerCase(r3)
            r6.getClass()
            int r7 = r0.c
            java.util.Map r8 = r0.e
            me.magnum.melonds.MelonEmulator r3 = me.magnum.melonds.MelonEmulator.a
            boolean r11 = r3.precompileVulkanPipelines(r4, r5, r6, r7, r8)
            java.lang.String r0 = r0.a
            if (r11 == 0) goto Lb7
            if (r0 == 0) goto Lb7
            ce6 r10 = r10.j
            be6 r3 = defpackage.be6.VULKAN
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r1
            r10.a(r0, r3, r4)
        Lb7:
            return r11
    }

    public static final void b(defpackage.jh r3, me.magnum.melonds.domain.model.EmulatorConfiguration r4) {
            r3.getClass()
            me.magnum.melonds.domain.model.RendererConfiguration r0 = r4.getRendererConfiguration()
            me.magnum.melonds.domain.model.VideoRenderer r0 = r0.getRenderer()
            me.magnum.melonds.domain.model.VideoRenderer r1 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r0 != r1) goto L27
            kd6 r0 = r3.b
            android.content.Context r1 = r3.a
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            java.lang.String r1 = r1.nativeLibraryDir
            r1.getClass()
            ng6 r0 = (defpackage.ng6) r0
            yq7 r0 = r0.z(r1)
            me.magnum.melonds.MelonDSAndroidInterface r1 = me.magnum.melonds.MelonDSAndroidInterface.a
            r1.b(r0)
        L27:
            g91 r0 = r3.g
            d76 r3 = r3.d
            java.nio.ByteBuffer r1 = r3.a
            if (r1 == 0) goto L30
            goto L43
        L30:
            r1 = 393216(0x60000, float:5.51013E-40)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r1 = r1.order(r2)
            r3.a = r1
            r1.getClass()
        L43:
            me.magnum.melonds.MelonEmulator r3 = me.magnum.melonds.MelonEmulator.a
            r3.setupEmulator(r4, r0, r1)
            return
    }

    public static final me.magnum.melonds.domain.model.EmulatorConfiguration c(defpackage.jh r47, me.magnum.melonds.domain.model.EmulatorConfiguration r48) {
            r0 = r47
            p87 r1 = r0.o
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r2 = r48.getDldiSdCardConfiguration()
            java.lang.Object r0 = r1.b
            kd6 r0 = (defpackage.kd6) r0
            java.lang.Object r3 = r1.f
            r9 = r3
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r3 = r1.d
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r4 = r1.e
            java.io.File r4 = (java.io.File) r4
            r2.getClass()
            boolean r5 = r2.getEnabled()
            r10 = 0
            if (r5 != 0) goto L3b
            r1.c = r10
            r5 = r4
            java.lang.String r4 = r9.getAbsolutePath()
            java.lang.String r7 = r5.getAbsolutePath()
            r8 = 5
            r9 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r0 = me.magnum.melonds.domain.model.DldiSdCardConfiguration.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
        L37:
            r42 = r0
            goto L143
        L3b:
            r11 = r2
            r5 = r4
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r12 = r0.b
            java.lang.String r0 = "system_dldi_sd_card_dir"
            java.util.Set r0 = r12.getStringSet(r0, r10)
            if (r0 == 0) goto L52
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = defpackage.gt0.I0(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L53
        L52:
            r0 = r10
        L53:
            if (r0 == 0) goto L5b
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r13 = r0
            goto L5c
        L5b:
            r13 = r10
        L5c:
            if (r13 == 0) goto L68
            java.lang.Object r0 = r1.a
            android.content.Context r0 = (android.content.Context) r0
            qi6 r0 = defpackage.zl1.h(r0, r13)
            r2 = r0
            goto L69
        L68:
            r2 = r10
        L69:
            java.lang.String r14 = "DldiFolderSync"
            if (r13 == 0) goto L13a
            if (r2 == 0) goto L13a
            boolean r0 = r2.e()
            if (r0 == 0) goto L13a
            boolean r0 = r2.k()
            if (r0 == 0) goto L13a
            boolean r0 = r2.a()
            if (r0 != 0) goto L83
            goto L13a
        L83:
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto Laa
            boolean r0 = r3.mkdirs()
            if (r0 != 0) goto Laa
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not create DLDI root directory: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r14, r0)
            r1.c = r10
        La6:
            r42 = r10
            goto L143
        Laa:
            boolean r0 = r5.exists()
            if (r0 != 0) goto Lce
            boolean r0 = r5.mkdirs()
            if (r0 != 0) goto Lce
            java.lang.String r0 = r5.getAbsolutePath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not create DLDI mirror directory: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r14, r0)
            r1.c = r10
            goto La6
        Lce:
            tl1 r0 = r1.q(r13)
            java.util.Map r6 = r0.b
            java.util.Map r7 = defpackage.p87.h(r5)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r0 = ""
            defpackage.p87.g(r2, r0, r8)
            vl1 r4 = defpackage.vl1.DOCUMENT     // Catch: java.lang.Throwable -> Lf6
            r3 = r5
            java.lang.String r5 = ""
            r1.s(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lf4
            java.util.LinkedHashMap r0 = defpackage.p87.d(r2, r3)     // Catch: java.lang.Throwable -> Lf4
            r1.v(r13, r0)     // Catch: java.lang.Throwable -> Lf4
            jg7 r0 = defpackage.jg7.a     // Catch: java.lang.Throwable -> Lf4
            goto Lfe
        Lf4:
            r0 = move-exception
            goto Lf8
        Lf6:
            r0 = move-exception
            r3 = r5
        Lf8:
            em5 r2 = new em5
            r2.<init>(r0)
            r0 = r2
        Lfe:
            java.lang.Throwable r0 = defpackage.hm5.a(r0)
            if (r0 == 0) goto L10c
            java.lang.String r2 = "Could not reconcile DLDI folder before launch"
            android.util.Log.w(r14, r2, r0)
            r1.c = r10
            goto La6
        L10c:
            r1.c = r13
            java.lang.String r4 = r9.getAbsolutePath()
            java.lang.String r0 = "system_dldi_sd_card_image_size"
            java.lang.String r1 = "0"
            java.lang.String r0 = r12.getString(r0, r1)
            r1 = 0
            if (r0 == 0) goto L12c
            java.lang.Integer r0 = defpackage.xs6.h0(r0)
            if (r0 == 0) goto L12c
            int r0 = r0.intValue()
            r2 = 5
            int r1 = defpackage.gi2.q(r0, r1, r2)
        L12c:
            r5 = r1
            r6 = 1
            java.lang.String r7 = r3.getAbsolutePath()
            r3 = 1
            r2 = r11
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r0 = r2.copy(r3, r4, r5, r6, r7)
            goto L37
        L13a:
            java.lang.String r0 = "DLDI SD card is enabled but the selected folder is not readable"
            android.util.Log.w(r14, r0)
            r1.c = r10
            goto La6
        L143:
            if (r42 != 0) goto L146
            goto L187
        L146:
            r45 = 201326591(0xbffffff, float:9.860761E-32)
            r46 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r43 = 0
            r15 = r48
            me.magnum.melonds.domain.model.EmulatorConfiguration r10 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r46)
        L187:
            return r10
    }

    public static final void d(defpackage.jh r38, defpackage.pq5 r39, java.lang.String r40, boolean r41, java.lang.String r42, java.lang.String r43) {
            r0 = r38
            r1 = r39
            r2 = r40
            java.lang.String r3 = "  Details: "
            java.lang.String r4 = "  Boot Method: "
            java.lang.String r5 = "AndroidEmulatorManager"
            android.content.Context r6 = r0.a
            fb2 r7 = r0.k
            java.lang.String r8 = "_"
            kd6 r0 = r0.b
            java.lang.String r9 = "Wrote diagnostic log to: "
            java.lang.String r10 = "\n==================================================\n"
            java.lang.String r11 = "  Status: "
            java.lang.String r12 = "\n--------------------------------------------------\nEXECUTION TELEMETRY:\n"
            java.lang.String r13 = "  DSi Custom BIOS/NAND Status: "
            java.lang.String r14 = "  DS Custom BIOS Status: "
            java.lang.String r15 = "  Custom BIOS Enabled: "
            r16 = r6
            java.lang.String r6 = "  JIT Recompiler: "
            r17 = r5
            java.lang.String r5 = "  Video Renderer: "
            r38 = r9
            java.lang.String r9 = "  Console Target: "
            r18 = r10
            java.lang.String r10 = "\n--------------------------------------------------\nEMULATION CONFIGURATION:\n"
            r19 = r3
            java.lang.String r3 = "  Installed DSiWare TitleId: "
            r20 = r11
            java.lang.String r11 = "  Is Installed DSiWare Shortcut: "
            r21 = r4
            java.lang.String r4 = "  Is DSiWare Title: "
            r22 = r12
            java.lang.String r12 = "  ROM URI: "
            r23 = r13
            java.lang.String r13 = "  Game Code / Title ID: "
            r24 = r14
            java.lang.String r14 = "  File Name: "
            r25 = r15
            java.lang.String r15 = "  Game Name: "
            r26 = r6
            java.lang.String r6 = "\n--------------------------------------------------\nGAME INFORMATION:\n"
            r27 = r5
            java.lang.String r5 = "Device Model: "
            r28 = r9
            java.lang.String r9 = "Timestamp: "
            r29 = r10
            java.lang.String r10 = "STORM DS v"
            r30 = r3
            java.lang.String r3 = "==================================================\n"
            r31 = r0
            java.lang.String r0 = "STORM_DS_"
            java.lang.String r32 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Throwable -> L133
            r33 = r11
            java.io.File r11 = android.os.Environment.getExternalStoragePublicDirectory(r32)     // Catch: java.lang.Throwable -> L133
            r32 = r4
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L133
            r34 = r12
            java.lang.String r12 = "STORM DS LOGS"
            r4.<init>(r11, r12)     // Catch: java.lang.Throwable -> L133
            r4.mkdirs()     // Catch: java.lang.Throwable -> L133
            java.lang.String r11 = r1.a     // Catch: java.lang.Throwable -> L133
            java.lang.String r12 = "[^a-zA-Z0-9_-]"
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12)     // Catch: java.lang.Throwable -> L133
            r12.getClass()     // Catch: java.lang.Throwable -> L133
            r11.getClass()     // Catch: java.lang.Throwable -> L133
            java.util.regex.Matcher r11 = r12.matcher(r11)     // Catch: java.lang.Throwable -> L133
            java.lang.String r11 = r11.replaceAll(r8)     // Catch: java.lang.Throwable -> L133
            r11.getClass()     // Catch: java.lang.Throwable -> L133
            java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L133
            r35 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L133
            r13.append(r11)     // Catch: java.lang.Throwable -> L133
            r13.append(r8)     // Catch: java.lang.Throwable -> L133
            r13.append(r2)     // Catch: java.lang.Throwable -> L133
            java.lang.String r0 = ".log"
            r13.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L133
            r12.<init>(r4, r0)     // Catch: java.lang.Throwable -> L133
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L133
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.util.Locale r8 = java.util.Locale.US     // Catch: java.lang.Throwable -> L133
            r0.<init>(r4, r8)     // Catch: java.lang.Throwable -> L133
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.Throwable -> L133
            r4.<init>()     // Catch: java.lang.Throwable -> L133
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Throwable -> L133
            me.magnum.melonds.domain.model.ConsoleType r0 = me.magnum.melonds.domain.model.ConsoleType.DS     // Catch: java.lang.Throwable -> L133
            dz0 r8 = r7.b(r0)     // Catch: java.lang.Throwable -> L133
            me.magnum.melonds.domain.model.ConsoleType r0 = me.magnum.melonds.domain.model.ConsoleType.DSi     // Catch: java.lang.Throwable -> L133
            dz0 r7 = r7.b(r0)     // Catch: java.lang.Throwable -> L133
            r0 = r31
            ng6 r0 = (defpackage.ng6) r0     // Catch: java.lang.Throwable -> L133
            me.magnum.melonds.domain.model.VideoRenderer r11 = r0.e()     // Catch: java.lang.Throwable -> L133
            r0 = r31
            ng6 r0 = (defpackage.ng6) r0     // Catch: java.lang.Throwable -> L133
            java.lang.String[] r13 = android.os.Build.SUPPORTED_64_BIT_ABIS     // Catch: java.lang.Throwable -> L133
            r13.getClass()     // Catch: java.lang.Throwable -> L133
            int r13 = r13.length     // Catch: java.lang.Throwable -> L133
            r36 = r13
            r37 = 1
            if (r36 != 0) goto Lec
            r36 = r37
            goto Lee
        Lec:
            r36 = 0
        Lee:
            r13 = r36 ^ 1
            android.content.SharedPreferences r0 = r0.b     // Catch: java.lang.Throwable -> L133
            r36 = r12
            java.lang.String r12 = "enable_jit"
            boolean r12 = r0.getBoolean(r12, r13)     // Catch: java.lang.Throwable -> L133
            r0 = r31
            ng6 r0 = (defpackage.ng6) r0     // Catch: java.lang.Throwable -> L133
            boolean r13 = r0.Q()     // Catch: java.lang.Throwable -> L133
            android.content.pm.PackageManager r0 = r16.getPackageManager()     // Catch: java.lang.Throwable -> L11c
            r31 = r7
            java.lang.String r7 = r16.getPackageName()     // Catch: java.lang.Throwable -> L118
            r16 = r8
            r8 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r8)     // Catch: java.lang.Throwable -> L116
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> L116
            goto L126
        L116:
            r0 = move-exception
            goto L120
        L118:
            r0 = move-exception
        L119:
            r16 = r8
            goto L120
        L11c:
            r0 = move-exception
            r31 = r7
            goto L119
        L120:
            em5 r7 = new em5     // Catch: java.lang.Throwable -> L133
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L133
            r0 = r7
        L126:
            boolean r7 = r0 instanceof defpackage.em5     // Catch: java.lang.Throwable -> L133
            if (r7 == 0) goto L12c
            r0 = 0
        L12c:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L133
            if (r0 != 0) goto L138
            java.lang.String r0 = "2.3.5"
            goto L138
        L133:
            r0 = move-exception
            r2 = r17
            goto L337
        L138:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L133
            r3.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.String r0 = " - Game Execution Diagnostic Log"
            r3.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            r0 = 10
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L133
            r3.append(r4)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r3)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L133
            java.lang.String r4 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L133
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L133
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r10.<init>(r5)     // Catch: java.lang.Throwable -> L133
            r10.append(r3)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = " "
            r10.append(r3)     // Catch: java.lang.Throwable -> L133
            r10.append(r4)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = " (Android "
            r10.append(r3)     // Catch: java.lang.Throwable -> L133
            r10.append(r8)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = ", API "
            r10.append(r3)     // Catch: java.lang.Throwable -> L133
            r10.append(r9)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = ")"
            r10.append(r3)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = r10.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r3)     // Catch: java.lang.Throwable -> L133
            r7.append(r6)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = r1.a     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r4.<init>(r15)     // Catch: java.lang.Throwable -> L133
            r4.append(r3)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r3)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = r1.c     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r4.<init>(r14)     // Catch: java.lang.Throwable -> L133
            r4.append(r3)     // Catch: java.lang.Throwable -> L133
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r3)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r4 = r35
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L133
            r3.append(r2)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            android.net.Uri r2 = r1.d     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r4 = r34
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L133
            r3.append(r2)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            boolean r2 = r1.h     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r4 = r32
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L133
            r3.append(r2)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            boolean r2 = r1.c()     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r4 = r33
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L133
            r3.append(r2)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.Long r2 = r1.l     // Catch: java.lang.Throwable -> L133
            if (r2 == 0) goto L236
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L133
            r4 = 16
            defpackage.g04.y(r4)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = java.lang.Long.toString(r2, r4)     // Catch: java.lang.Throwable -> L133
            r2.getClass()     // Catch: java.lang.Throwable -> L133
        L233:
            r3 = r30
            goto L239
        L236:
            java.lang.String r2 = "null"
            goto L233
        L239:
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r2 = r29
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            jt5 r2 = r1.f     // Catch: java.lang.Throwable -> L133
            u26 r2 = r2.a     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r4 = r28
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L133
            r3.append(r2)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r3 = r27
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L133
            r2.append(r11)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r3 = r26
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L133
            r2.append(r12)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r3 = r25
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L133
            r2.append(r13)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            r2 = r16
            cz0 r2 = r2.b     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r4 = r24
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L133
            r3.append(r2)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            r2 = r31
            cz0 r2 = r2.b     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r4 = r23
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L133
            r3.append(r2)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r2 = r22
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r2 = r43
            r3 = r21
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            if (r41 == 0) goto L2e0
            java.lang.String r2 = "SUCCESS"
        L2dd:
            r3 = r20
            goto L2e3
        L2e0:
            java.lang.String r2 = "FAILED"
            goto L2dd
        L2e3:
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            r2 = r42
            r3 = r19
            java.lang.String r0 = r3.concat(r2)     // Catch: java.lang.Throwable -> L133
            r7.append(r0)     // Catch: java.lang.Throwable -> L133
            r2 = r18
            r7.append(r2)     // Catch: java.lang.Throwable -> L133
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L133
            java.nio.charset.Charset r2 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L133
            r2.getClass()     // Catch: java.lang.Throwable -> L133
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L133
            r4 = r36
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L133
            defpackage.jc2.G0(r3, r0, r2)     // Catch: java.lang.Throwable -> L32d
            r3.close()     // Catch: java.lang.Throwable -> L133
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L133
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L133
            r3 = r38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L133
            r2.append(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L133
            r2 = r17
            android.util.Log.i(r2, r0)     // Catch: java.lang.Throwable -> L32b
            goto L34a
        L32b:
            r0 = move-exception
            goto L337
        L32d:
            r0 = move-exception
            r2 = r17
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L332
        L332:
            r0 = move-exception
            defpackage.ge7.t(r3, r4)     // Catch: java.lang.Throwable -> L32b
            throw r0     // Catch: java.lang.Throwable -> L32b
        L337:
            java.lang.String r1 = r1.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to write diagnostic log for "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r2, r1, r0)
        L34a:
            return
    }

    public static void i() {
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a
            r0.pauseEmulation()
            return
    }

    public static java.lang.Object j(boolean r3, defpackage.hw6 r4) {
            xe1 r0 = defpackage.xk1.a
            fh r1 = new fh
            r2 = 0
            r1.<init>(r3, r2)
            java.lang.Object r3 = defpackage.hv.d0(r0, r1, r4)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L11
            return r3
        L11:
            jg7 r3 = defpackage.jg7.a
            return r3
    }

    public final java.lang.Object e(me.magnum.melonds.domain.model.ConsoleType r40, defpackage.s41 r41) {
            r39 = this;
            r0 = r39
            r1 = r41
            boolean r2 = r1 instanceof defpackage.yg
            if (r2 == 0) goto L17
            r2 = r1
            yg r2 = (defpackage.yg) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            yg r2 = new yg
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Z
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3d
            if (r4 == r7) goto L35
            if (r4 != r6) goto L2f
            defpackage.oi2.Y(r1)
            goto L99
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L35:
            me.magnum.melonds.domain.model.ConsoleType r4 = r2.R
            defpackage.oi2.Y(r1)
            r25 = r4
            goto L54
        L3d:
            defpackage.oi2.Y(r1)
            r1 = r40
            r2.R = r1
            r2.Z = r7
            kd6 r4 = r0.b
            ng6 r4 = (defpackage.ng6) r4
            java.lang.Object r4 = r4.k(r2)
            if (r4 != r3) goto L51
            goto L98
        L51:
            r25 = r1
            r1 = r4
        L54:
            r7 = r1
            me.magnum.melonds.domain.model.EmulatorConfiguration r7 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r7
            r37 = 134086652(0x7fdfffc, float:3.8217663E-34)
            r38 = 0
            r8 = 1
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38)
            r2.R = r5
            r2.Z = r6
            java.lang.Object r1 = r0.f(r1, r2)
            if (r1 != r3) goto L99
        L98:
            return r3
        L99:
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r1
            return r1
    }

    public final java.lang.Object f(me.magnum.melonds.domain.model.EmulatorConfiguration r38, defpackage.s41 r39) {
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r39
            boolean r3 = r2 instanceof defpackage.zg
            if (r3 == 0) goto L19
            r3 = r2
            zg r3 = (defpackage.zg) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Z = r4
            goto L1e
        L19:
            zg r3 = new zg
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.X
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.Z
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L30
            me.magnum.melonds.domain.model.EmulatorConfiguration r0 = r3.R
            defpackage.oi2.Y(r2)
            r5 = r0
            goto L52
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L37:
            defpackage.oi2.Y(r2)
            me.magnum.melonds.domain.model.MicSource r2 = r1.getMicSource()
            me.magnum.melonds.domain.model.MicSource r5 = me.magnum.melonds.domain.model.MicSource.DEVICE
            if (r2 != r5) goto L93
            r3.R = r1
            r3.Z = r6
            uv4 r0 = r0.f
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            java.lang.Object r2 = r0.a(r2, r3)
            if (r2 != r4) goto L51
            return r4
        L51:
            r5 = r1
        L52:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L92
            me.magnum.melonds.domain.model.MicSource r29 = me.magnum.melonds.domain.model.MicSource.NONE
            r35 = 260046847(0xf7fffff, float:1.2621774E-29)
            r36 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            me.magnum.melonds.domain.model.EmulatorConfiguration r0 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36)
            return r0
        L92:
            return r5
        L93:
            return r1
    }

    public final java.lang.Object g(defpackage.pq5 r42, defpackage.s41 r43) {
            r41 = this;
            r0 = r41
            r1 = r42
            r2 = r43
            boolean r3 = r2 instanceof defpackage.ah
            if (r3 == 0) goto L19
            r3 = r2
            ah r3 = (defpackage.ah) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Z = r4
            goto L1e
        L19:
            ah r3 = new ah
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.X
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.Z
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L3e
            if (r5 == r8) goto L38
            if (r5 != r6) goto L32
            defpackage.oi2.Y(r2)
            goto L124
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r7
        L38:
            pq5 r1 = r3.R
            defpackage.oi2.Y(r2)
            goto L53
        L3e:
            defpackage.oi2.Y(r2)
            jt5 r2 = r1.f
            r3.R = r1
            r3.Z = r8
            kd6 r5 = r0.b
            ng6 r5 = (defpackage.ng6) r5
            java.lang.Object r2 = r5.l(r2, r3)
            if (r2 != r4) goto L53
            goto L123
        L53:
            r9 = r2
            me.magnum.melonds.domain.model.EmulatorConfiguration r9 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r9
            boolean r2 = r1.c()
            r5 = 0
            if (r2 != 0) goto L64
            boolean r2 = r1.h
            if (r2 == 0) goto L62
            goto L64
        L62:
            r2 = r5
            goto L65
        L64:
            r2 = r8
        L65:
            if (r2 != 0) goto L78
            boolean r10 = r9.getUseCustomBios()
            if (r10 != 0) goto L78
            jt5 r10 = r1.f
            u26 r10 = r10.a
            u26 r11 = defpackage.u26.DEFAULT
            if (r10 == r11) goto L76
            goto L78
        L76:
            r10 = r5
            goto L79
        L78:
            r10 = r8
        L79:
            if (r2 == 0) goto L80
            me.magnum.melonds.domain.model.ConsoleType r11 = me.magnum.melonds.domain.model.ConsoleType.DSi
        L7d:
            r27 = r11
            goto Lac
        L80:
            boolean r11 = r9.getUseCustomBios()
            if (r11 != 0) goto L91
            jt5 r11 = r1.f
            u26 r11 = r11.a
            u26 r12 = defpackage.u26.DEFAULT
            if (r11 != r12) goto L91
            me.magnum.melonds.domain.model.ConsoleType r11 = me.magnum.melonds.domain.model.ConsoleType.DS
            goto L7d
        L91:
            jt5 r11 = r1.f
            u26 r11 = r11.a
            me.magnum.melonds.domain.model.ConsoleType r12 = r9.getConsoleType()
            java.lang.Object r13 = r11.getDefault()
            boolean r13 = defpackage.nb3.k(r13, r11)
            if (r13 == 0) goto La4
            goto La8
        La4:
            java.lang.Object r12 = r11.getValue()
        La8:
            r11 = r12
            me.magnum.melonds.domain.model.ConsoleType r11 = (me.magnum.melonds.domain.model.ConsoleType) r11
            goto L7d
        Lac:
            if (r2 == 0) goto Lb0
        Lae:
            r11 = r5
            goto Lb9
        Lb0:
            boolean r2 = r9.getShowBootScreen()
            if (r2 == 0) goto Lae
            if (r10 == 0) goto Lae
            r11 = r8
        Lb9:
            sx1 r2 = r0.h
            boolean r2 = r2.a
            if (r2 == 0) goto Lc4
            r2 = 1065353216(0x3f800000, float:1.0)
        Lc1:
            r21 = r2
            goto Lc9
        Lc4:
            float r2 = r9.getFrameLimitSpeedMultiplier()
            goto Lc1
        Lc9:
            jt5 r1 = r1.f
            boolean r2 = r1.f
            a36 r1 = r1.b
            me.magnum.melonds.domain.model.MicSource r5 = r9.getMicSource()
            java.lang.Object r8 = r1.getDefault()
            boolean r8 = defpackage.nb3.k(r8, r1)
            if (r8 == 0) goto Lde
            goto Le2
        Lde:
            java.lang.Object r5 = r1.getValue()
        Le2:
            r33 = r5
            me.magnum.melonds.domain.model.MicSource r33 = (me.magnum.melonds.domain.model.MicSource) r33
            r39 = 125630460(0x77cf7fc, float:1.9031249E-34)
            r40 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r26 = r2
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r40)
            r3.R = r7
            r3.Z = r6
            java.lang.Object r2 = r0.f(r1, r3)
            if (r2 != r4) goto L124
        L123:
            return r4
        L124:
            me.magnum.melonds.domain.model.EmulatorConfiguration r2 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r2
            return r2
    }

    public final void h(java.lang.String r2, long r3, long r5, long r7, java.lang.String r9) {
            r1 = this;
            boolean r1 = r1.p
            if (r1 != 0) goto L5
            return
        L5:
            java.lang.CharSequence r1 = defpackage.qs6.T0(r9)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "event_type=jni_event_received jni_event="
            r9.<init>(r0)
            r9.append(r2)
            java.lang.String r2 = " leaderboard_id="
            r9.append(r2)
            r9.append(r3)
            java.lang.String r2 = " attempt_id="
            java.lang.String r3 = " event_sequence="
            defpackage.xg6.B(r9, r2, r5, r3)
            r9.append(r7)
            java.lang.String r2 = " "
            r9.append(r2)
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            java.lang.String r2 = "RASubmission"
            android.util.Log.i(r2, r1)
            return
    }

    public final java.lang.Object k(defpackage.ep2 r12, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r13, defpackage.s41 r14) {
            r11 = this;
            boolean r0 = r14 instanceof defpackage.gh
            if (r0 == 0) goto L13
            r0 = r14
            gh r0 = (defpackage.gh) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            gh r0 = new gh
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            jh r11 = r0.Y
            java.lang.String r11 = (java.lang.String) r11
            defpackage.oi2.Y(r14)
            goto L97
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            r11 = 0
            return r11
        L36:
            jh r12 = r0.Y
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r13 = r0.X
            ep2 r2 = r0.R
            defpackage.oi2.Y(r14)
            r6 = r2
        L40:
            r8 = r13
            goto L64
        L42:
            defpackage.oi2.Y(r14)
            bg1 r14 = r11.q
            r14.k()
            kd6 r14 = r11.b
            ng6 r14 = (defpackage.ng6) r14
            wp0 r14 = r14.C()
            r0.R = r12
            r0.X = r13
            r0.Y = r11
            r0.e0 = r4
            java.lang.Object r14 = defpackage.f04.D(r14, r0)
            if (r14 != r1) goto L61
            goto L96
        L61:
            r6 = r12
            r12 = r11
            goto L40
        L64:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r13 = defpackage.nb3.k(r14, r13)
            r12.p = r13
            kd6 r11 = r11.b
            ng6 r11 = (defpackage.ng6) r11
            android.content.SharedPreferences r11 = r11.b
            java.lang.String r12 = "ra_rich_presence"
            boolean r11 = r11.getBoolean(r12, r4)
            r9 = 0
            if (r11 == 0) goto L7f
            java.lang.String r11 = r6.e
            r7 = r11
            goto L80
        L7f:
            r7 = r9
        L80:
            xe1 r11 = defpackage.xk1.a
            ag r5 = new ag
            r10 = 1
            r5.<init>(r6, r7, r8, r9, r10)
            r0.R = r9
            r0.X = r9
            r0.Y = r9
            r0.e0 = r3
            java.lang.Object r11 = defpackage.hv.d0(r11, r5, r0)
            if (r11 != r1) goto L97
        L96:
            return r1
        L97:
            jg7 r11 = defpackage.jg7.a
            return r11
    }

    public final java.lang.Object l(me.magnum.melonds.domain.model.ConsoleType r5, defpackage.s41 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hh
            if (r0 == 0) goto L13
            r0 = r6
            hh r0 = (defpackage.hh) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            hh r0 = new hh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r6)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.oi2.Y(r6)
            r0.Y = r3
            java.lang.Object r6 = r4.e(r5, r0)
            if (r6 != r1) goto L3a
            return r1
        L3a:
            me.magnum.melonds.domain.model.EmulatorConfiguration r6 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r6
            me.magnum.melonds.MelonEmulator r4 = me.magnum.melonds.MelonEmulator.a
            r4.updateEmulatorConfiguration(r6)
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    public final java.lang.Object m(defpackage.pq5 r5, defpackage.s41 r6) {
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ih
            if (r0 == 0) goto L13
            r0 = r6
            ih r0 = (defpackage.ih) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ih r0 = new ih
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r6)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.oi2.Y(r6)
            r0.Y = r3
            java.lang.Object r6 = r4.g(r5, r0)
            if (r6 != r1) goto L3a
            return r1
        L3a:
            me.magnum.melonds.domain.model.EmulatorConfiguration r6 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r6
            me.magnum.melonds.MelonEmulator r4 = me.magnum.melonds.MelonEmulator.a
            r4.updateEmulatorConfiguration(r6)
            jg7 r4 = defpackage.jg7.a
            return r4
    }
}
