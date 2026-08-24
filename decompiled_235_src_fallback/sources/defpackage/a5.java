package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a5 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ a5(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public /* synthetic */ a5(defpackage.lg0 r1, androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk r2) {
            r0 = this;
            r2 = 1
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    private final java.lang.Object a() {
            r4 = this;
            java.lang.Object r4 = r4.B
            jn0 r4 = (defpackage.jn0) r4
            boolean r0 = r4 instanceof defpackage.gn0
            if (r0 == 0) goto L23
            xn0 r0 = new xn0
            gn0 r4 = (defpackage.gn0) r4
            me.magnum.melonds.domain.model.Cheat r4 = r4.b
            java.lang.String r1 = r4.getName()
            java.lang.String r2 = r4.getDescription()
            if (r2 != 0) goto L1a
            java.lang.String r2 = ""
        L1a:
            java.lang.String r4 = r4.getCode()
            r3 = 0
            r0.<init>(r1, r2, r4, r3)
            return r0
        L23:
            xn0 r4 = new xn0
            r0 = 1
            r4.<init>(r0)
            return r4
    }

    private final java.lang.Object b() {
            r0 = this;
            java.lang.Object r0 = r0.B
            gu0 r0 = (defpackage.gu0) r0
            on2 r0 = r0.H0
            if (r0 == 0) goto Lb
            r0.c()
        Lb:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    private final java.lang.Object f() {
            r2 = this;
            java.lang.Object r2 = r2.B
            lo4 r2 = (defpackage.lo4) r2
            i27 r0 = new i27
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private final java.lang.Object h() {
            r4 = this;
            java.lang.Object r4 = r4.B
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment r4 = (me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment) r4
            p15 r0 = new p15
            wh7 r1 = r4.e0
            r2 = 0
            if (r1 == 0) goto L19
            yj1 r3 = r4.f0
            if (r3 == 0) goto L13
            r0.<init>(r4, r1, r3)
            return r0
        L13:
            java.lang.String r4 = "directoryAccessValidator"
            defpackage.nb3.a0(r4)
            throw r2
        L19:
            java.lang.String r4 = "uriPermissionManager"
            defpackage.nb3.a0(r4)
            throw r2
    }

    private final java.lang.Object i() {
            r1 = this;
            java.lang.Object r1 = r1.B
            me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity r1 = (me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity) r1
            int r0 = me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity.B0
            r1.x()
            jg7 r1 = defpackage.jg7.a
            return r1
    }

    private final java.lang.Object j() {
            r2 = this;
            java.lang.Object r2 = r2.B
            db1 r2 = (defpackage.db1) r2
            android.content.Context r2 = r2.a
            java.lang.String r0 = "dsiware_titles_meta"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    private final java.lang.Object k() {
            r0 = this;
            java.lang.Object r0 = r0.B
            x07 r0 = (defpackage.x07) r0
            r0.close()
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    private final java.lang.Object q() {
            r1 = this;
            java.lang.Object r1 = r1.B
            me.magnum.melonds.ui.dldi.DldiFileManagerActivity r1 = (me.magnum.melonds.ui.dldi.DldiFileManagerActivity) r1
            int r0 = me.magnum.melonds.ui.dldi.DldiFileManagerActivity.r0
            r1.finish()
            jg7 r1 = defpackage.jg7.a
            return r1
    }

    private final java.lang.Object r() {
            r1 = this;
            java.lang.Object r1 = r1.B
            ep1 r1 = (defpackage.ep1) r1
            qh1 r1 = r1.a()
            sc7 r0 = defpackage.dp1.a
            r0 = 1137180672(0x43c80000, float:400.0)
            float r1 = r1.e0(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }

    private final java.lang.Object s() {
            r4 = this;
            java.lang.Object r4 = r4.B
            me.magnum.melonds.ui.settings.fragments.FirmwarePreferencesFragment r4 = (me.magnum.melonds.ui.settings.fragments.FirmwarePreferencesFragment) r4
            p15 r0 = new p15
            wh7 r1 = r4.d0
            r2 = 0
            if (r1 == 0) goto L19
            yj1 r3 = r4.e0
            if (r3 == 0) goto L13
            r0.<init>(r4, r1, r3)
            return r0
        L13:
            java.lang.String r4 = "directoryAccessValidator"
            defpackage.nb3.a0(r4)
            throw r2
        L19:
            java.lang.String r4 = "uriPermissionManager"
            defpackage.nb3.a0(r4)
            throw r2
    }

    private final java.lang.Object t() {
            r11 = this;
            java.lang.Object r11 = r11.B
            bn2 r11 = (defpackage.bn2) r11
            java.lang.String r0 = r11.B
            r1 = 21
            if (r0 == 0) goto L34
            boolean r2 = r11.R
            if (r2 == 0) goto L34
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r11.A
            r3.getClass()
            java.io.File r3 = r3.getNoBackupFilesDir()
            r3.getClass()
            r2.<init>(r3, r0)
            an2 r4 = new an2
            android.content.Context r5 = r11.A
            java.lang.String r6 = r2.getAbsolutePath()
            d51 r7 = new d51
            r7.<init>(r1)
            zb r8 = r11.L
            boolean r9 = r11.X
            r4.<init>(r5, r6, r7, r8, r9)
            goto L47
        L34:
            an2 r5 = new an2
            android.content.Context r6 = r11.A
            java.lang.String r7 = r11.B
            d51 r8 = new d51
            r8.<init>(r1)
            zb r9 = r11.L
            boolean r10 = r11.X
            r5.<init>(r6, r7, r8, r9, r10)
            r4 = r5
        L47:
            boolean r11 = r11.Z
            r4.setWriteAheadLoggingEnabled(r11)
            return r4
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r21 = this;
            r0 = r21
            int r1 = r0.A
            java.lang.String r2 = "CXCP"
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            r5 = 0
            r6 = 1
            java.lang.Object r7 = r0.B
            switch(r1) {
                case 0: goto Lb44;
                case 1: goto Laab;
                case 2: goto Laa5;
                case 3: goto La9e;
                case 4: goto La96;
                case 5: goto La8b;
                case 6: goto La83;
                case 7: goto La80;
                case 8: goto L7a3;
                case 9: goto L7a0;
                case 10: goto L772;
                case 11: goto L767;
                case 12: goto L7a;
                case 13: goto L6f;
                case 14: goto L64;
                case 15: goto L5f;
                case 16: goto L58;
                case 17: goto L53;
                case 18: goto L4a;
                case 19: goto L45;
                case 20: goto L3e;
                case 21: goto L39;
                case 22: goto L34;
                case 23: goto L2f;
                case 24: goto L2a;
                case 25: goto L25;
                case 26: goto L20;
                case 27: goto L1b;
                case 28: goto L16;
                default: goto L10;
            }
        L10:
            o60 r7 = (defpackage.o60) r7
            r7.dismiss()
            return r4
        L16:
            java.lang.Object r0 = r0.t()
            return r0
        L1b:
            java.lang.Object r0 = r0.s()
            return r0
        L20:
            java.lang.Object r0 = r0.r()
            return r0
        L25:
            java.lang.Object r0 = r0.q()
            return r0
        L2a:
            java.lang.Object r0 = r0.k()
            return r0
        L2f:
            java.lang.Object r0 = r0.j()
            return r0
        L34:
            java.lang.Object r0 = r0.i()
            return r0
        L39:
            java.lang.Object r0 = r0.h()
            return r0
        L3e:
            jt3 r7 = (defpackage.jt3) r7
            b47 r0 = r7.d()
            return r0
        L45:
            java.lang.Object r0 = r0.f()
            return r0
        L4a:
            u63 r7 = (defpackage.u63) r7
            java.lang.String r0 = ":memory:"
            e36 r0 = r7.f(r0)
            return r0
        L53:
            java.lang.Object r0 = r0.b()
            return r0
        L58:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r0 = r7.iterator()
            return r0
        L5f:
            java.lang.Object r0 = r0.a()
            return r0
        L64:
            ok0 r7 = (defpackage.ok0) r7
            n55 r0 = r7.a
            java.lang.Object r0 = r0.get()
            nk0 r0 = (defpackage.nk0) r0
            return r0
        L6f:
            nk0 r7 = (defpackage.nk0) r7
            n55 r0 = r7.a
            java.lang.Object r0 = r0.get()
            wi7 r0 = (defpackage.wi7) r0
            return r0
        L7a:
            jh0 r7 = (defpackage.jh0) r7
            w65 r0 = defpackage.w65.c
            r0.getClass()
            ra4 r0 = r0.a     // Catch: java.lang.Throwable -> L75e
            java.lang.Object r0 = r0.d     // Catch: java.lang.Throwable -> L75e
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch: java.lang.Throwable -> L75e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L75e
            boolean r1 = r0 instanceof defpackage.xy     // Catch: java.lang.Throwable -> L75e
            if (r1 == 0) goto L95
            n33 r0 = new n33     // Catch: java.lang.Throwable -> L75e
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L75e
            goto L99
        L95:
            n33 r0 = defpackage.l.z(r0)     // Catch: java.lang.Throwable -> L75e
        L99:
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L75e
            v65 r0 = (defpackage.v65) r0     // Catch: java.lang.Throwable -> L75e
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            lg0 r4 = r7.a
            if (r4 != 0) goto Lbd
            boolean r0 = defpackage.kj2.G()
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "Failed to enable quirks: camera metadata injection failed"
            android.util.Log.e(r2, r0)
        Lb6:
            y65 r0 = new y65
            r0.<init>(r1)
            goto L75b
        Lbd:
            kg0 r2 = defpackage.lg0.g
            r2.getClass()
            boolean r2 = defpackage.kg0.c(r4)
            java.lang.Class<androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk> r5 = androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk.class
            boolean r2 = r0.a(r5, r2)
            if (r2 == 0) goto Ld6
            androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk r2 = new androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk
            r2.<init>(r4)
            r1.add(r2)
        Ld6:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r2.getClass()
            java.lang.String r5 = "Samsung"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 != 0) goto Lee
            java.lang.String r2 = android.os.Build.BRAND
            r2.getClass()
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L10d
        Lee:
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 33
            if (r2 >= r8) goto L10d
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r2.getClass()
            r8 = r4
            qc0 r8 = (defpackage.qc0) r8
            java.lang.Object r2 = r8.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L105
            goto L10d
        L105:
            int r2 = r2.intValue()
            if (r2 != 0) goto L10d
            r2 = r6
            goto L10e
        L10d:
            r2 = r3
        L10e:
            java.lang.Class<androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk> r8 = androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk.class
            boolean r2 = r0.a(r8, r2)
            if (r2 == 0) goto L11e
            androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk r2 = new androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk
            r2.<init>()
            r1.add(r2)
        L11e:
            defpackage.kg0.c(r4)
            java.lang.Class<androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk> r2 = androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk.class
            boolean r2 = r0.a(r2, r3)
            if (r2 == 0) goto L131
            androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk r2 = new androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk
            r2.<init>()
            r1.add(r2)
        L131:
            java.lang.Class<androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk> r2 = androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk.class
            boolean r8 = defpackage.kg0.c(r4)
            boolean r2 = r0.a(r2, r8)
            if (r2 == 0) goto L147
            androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk r2 = new androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk
            dr6 r7 = r7.b
            r2.<init>(r7)
            r1.add(r2)
        L147:
            java.util.List r2 = androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.a
            java.lang.String r7 = android.os.Build.MODEL
            r7.getClass()
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toUpperCase(r8)
            r7.getClass()
            boolean r2 = r2.contains(r7)
            if (r2 == 0) goto L176
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r2.getClass()
            r7 = r4
            qc0 r7 = (defpackage.qc0) r7
            java.lang.Object r2 = r7.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L16e
            goto L176
        L16e:
            int r2 = r2.intValue()
            if (r2 != r6) goto L176
            r2 = r6
            goto L177
        L176:
            r2 = r3
        L177:
            java.lang.Class<androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk> r7 = androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L187
            androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk r2 = new androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk
            r2.<init>()
            r1.add(r2)
        L187:
            java.lang.Class<androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk> r2 = androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk.class
            boolean r2 = r0.a(r2, r3)
            if (r2 == 0) goto L197
            androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk r2 = new androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk
            r2.<init>()
            r1.add(r2)
        L197:
            java.lang.Class<androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk> r2 = androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk.class
            boolean r2 = r0.a(r2, r6)
            if (r2 == 0) goto L1a7
            androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk r2 = new androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk
            r2.<init>()
            r1.add(r2)
        L1a7:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk> r2 = androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class
            boolean r7 = defpackage.kg0.c(r4)
            boolean r2 = r0.a(r2, r7)
            if (r2 == 0) goto L1bb
            androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk r2 = new androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk
            r2.<init>()
            r1.add(r2)
        L1bb:
            java.lang.Class<androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk> r2 = androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk.class
            boolean r2 = r0.a(r2, r6)
            if (r2 == 0) goto L1cb
            androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk r2 = new androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk
            r2.<init>()
            r1.add(r2)
        L1cb:
            java.util.List r2 = androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk.a
            java.util.Iterator r2 = r2.iterator()
        L1d1:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L20a
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = android.os.Build.MODEL
            r8.getClass()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toUpperCase(r9)
            r8.getClass()
            boolean r7 = defpackage.xs6.g0(r8, r7, r3)
            if (r7 == 0) goto L1d1
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r2.getClass()
            r7 = r4
            qc0 r7 = (defpackage.qc0) r7
            java.lang.Object r2 = r7.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L202
            goto L20a
        L202:
            int r2 = r2.intValue()
            if (r2 != r6) goto L20a
            r2 = r6
            goto L20b
        L20a:
            r2 = r3
        L20b:
            java.lang.Class<androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk> r7 = androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L21b
            androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk r2 = new androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk
            r2.<init>()
            r1.add(r2)
        L21b:
            java.util.List r2 = androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.a
            java.lang.String r7 = android.os.Build.MODEL
            r7.getClass()
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r9 = r7.toLowerCase(r8)
            r9.getClass()
            boolean r2 = r2.contains(r9)
            if (r2 == 0) goto L24a
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r2.getClass()
            r9 = r4
            qc0 r9 = (defpackage.qc0) r9
            java.lang.Object r2 = r9.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L242
            goto L24a
        L242:
            int r2 = r2.intValue()
            if (r2 != 0) goto L24a
            r2 = r6
            goto L24b
        L24a:
            r2 = r3
        L24b:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk> r9 = androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.class
            boolean r2 = r0.a(r9, r2)
            if (r2 == 0) goto L25b
            androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk r2 = new androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk
            r2.<init>()
            r1.add(r2)
        L25b:
            java.util.List r2 = androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.b
            java.lang.String r9 = r7.toLowerCase(r8)
            r9.getClass()
            boolean r2 = r2.contains(r9)
            if (r2 == 0) goto L283
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r2.getClass()
            r9 = r4
            qc0 r9 = (defpackage.qc0) r9
            java.lang.Object r2 = r9.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L27b
            goto L283
        L27b:
            int r2 = r2.intValue()
            if (r2 != 0) goto L283
            r2 = r6
            goto L284
        L283:
            r2 = r3
        L284:
            java.util.List r9 = androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.a
            java.lang.String r10 = r7.toLowerCase(r8)
            r10.getClass()
            boolean r9 = r9.contains(r10)
            if (r2 != 0) goto L298
            if (r9 == 0) goto L296
            goto L298
        L296:
            r2 = r3
            goto L299
        L298:
            r2 = r6
        L299:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk> r9 = androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk.class
            boolean r2 = r0.a(r9, r2)
            if (r2 == 0) goto L2a9
            androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk r2 = new androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk
            r2.<init>()
            r1.add(r2)
        L2a9:
            java.util.List r2 = androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk.a
            java.lang.String r9 = r7.toUpperCase(r8)
            r9.getClass()
            boolean r2 = r2.contains(r9)
            if (r2 == 0) goto L2d1
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r2.getClass()
            r9 = r4
            qc0 r9 = (defpackage.qc0) r9
            java.lang.Object r2 = r9.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L2c9
            goto L2d1
        L2c9:
            int r2 = r2.intValue()
            if (r2 != r6) goto L2d1
            r2 = r6
            goto L2d2
        L2d1:
            r2 = r3
        L2d2:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk> r9 = androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk.class
            boolean r2 = r0.a(r9, r2)
            if (r2 == 0) goto L2e2
            androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk r2 = new androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk
            r2.<init>()
            r1.add(r2)
        L2e2:
            java.util.List r2 = androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.a
            java.lang.String r9 = r7.toLowerCase(r8)
            r9.getClass()
            boolean r2 = r2.contains(r9)
            if (r2 == 0) goto L30a
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r2.getClass()
            r9 = r4
            qc0 r9 = (defpackage.qc0) r9
            java.lang.Object r2 = r9.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L302
            goto L30a
        L302:
            int r2 = r2.intValue()
            if (r2 != r6) goto L30a
            r2 = r6
            goto L30b
        L30a:
            r2 = r3
        L30b:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk> r9 = androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.class
            boolean r2 = r0.a(r9, r2)
            if (r2 == 0) goto L31b
            androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk r2 = new androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk
            r2.<init>()
            r1.add(r2)
        L31b:
            java.util.List r2 = androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk.a
            java.lang.String r9 = android.os.Build.DEVICE
            r9.getClass()
            java.lang.String r9 = r9.toLowerCase(r8)
            r9.getClass()
            boolean r2 = r2.contains(r9)
            java.lang.Class<androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk> r9 = androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk.class
            boolean r2 = r0.a(r9, r2)
            if (r2 == 0) goto L33d
            androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk r2 = new androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk
            r2.<init>()
            r1.add(r2)
        L33d:
            androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk r2 = androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk.a
            java.util.Set r9 = androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk.b
            java.lang.String r7 = r7.toLowerCase(r8)
            r7.getClass()
            boolean r7 = r9.contains(r7)
            if (r7 == 0) goto L367
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r7.getClass()
            r8 = r4
            qc0 r8 = (defpackage.qc0) r8
            java.lang.Object r7 = r8.c(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L35f
            goto L367
        L35f:
            int r7 = r7.intValue()
            if (r7 != 0) goto L367
            r7 = r6
            goto L368
        L367:
            r7 = r3
        L368:
            java.lang.Class<androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk> r8 = androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L373
            r1.add(r2)
        L373:
            kg0 r2 = defpackage.lg0.g
            r2.getClass()
            boolean r2 = defpackage.kg0.c(r4)
            java.lang.Class<androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk> r7 = androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L38c
            androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk r2 = new androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk
            r2.<init>()
            r1.add(r2)
        L38c:
            java.lang.Class<androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk> r2 = androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk.class
            boolean r2 = r0.a(r2, r3)
            if (r2 == 0) goto L39c
            androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk r2 = new androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk
            r2.<init>()
            r1.add(r2)
        L39c:
            java.util.ArrayList r2 = androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.a
            int r7 = r2.size()
            r8 = r3
        L3a3:
            if (r8 >= r7) goto L3da
            java.lang.Object r9 = r2.get(r8)
            int r8 = r8 + 1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = android.os.Build.MODEL
            r10.getClass()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toUpperCase(r11)
            r10.getClass()
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L3a3
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r2.getClass()
            r7 = r4
            qc0 r7 = (defpackage.qc0) r7
            java.lang.Object r2 = r7.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L3d2
            goto L3da
        L3d2:
            int r2 = r2.intValue()
            if (r2 != 0) goto L3da
            r2 = r6
            goto L3db
        L3da:
            r2 = r3
        L3db:
            java.lang.Class<androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk> r7 = androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L3eb
            androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r2 = new androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk
            r2.<init>()
            r1.add(r2)
        L3eb:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r2.getClass()
            java.lang.String r7 = "Motorola"
            boolean r8 = r2.equalsIgnoreCase(r7)
            if (r8 != 0) goto L403
            java.lang.String r8 = android.os.Build.BRAND
            r8.getClass()
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L40f
        L403:
            java.lang.String r8 = "MotoG3"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L40f
            goto L49d
        L40f:
            boolean r8 = r2.equalsIgnoreCase(r5)
            if (r8 != 0) goto L420
            java.lang.String r8 = android.os.Build.BRAND
            r8.getClass()
            boolean r8 = r8.equalsIgnoreCase(r5)
            if (r8 == 0) goto L42c
        L420:
            java.lang.String r8 = "SM-G532F"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L42c
            goto L49d
        L42c:
            boolean r8 = r2.equalsIgnoreCase(r5)
            if (r8 != 0) goto L43d
            java.lang.String r8 = android.os.Build.BRAND
            r8.getClass()
            boolean r8 = r8.equalsIgnoreCase(r5)
            if (r8 == 0) goto L448
        L43d:
            java.lang.String r8 = "SM-J700F"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L448
            goto L49d
        L448:
            boolean r8 = r2.equalsIgnoreCase(r5)
            if (r8 != 0) goto L459
            java.lang.String r8 = android.os.Build.BRAND
            r8.getClass()
            boolean r8 = r8.equalsIgnoreCase(r5)
            if (r8 == 0) goto L464
        L459:
            java.lang.String r8 = "SM-A920F"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L464
            goto L49d
        L464:
            boolean r8 = r2.equalsIgnoreCase(r5)
            if (r8 != 0) goto L475
            java.lang.String r8 = android.os.Build.BRAND
            r8.getClass()
            boolean r8 = r8.equalsIgnoreCase(r5)
            if (r8 == 0) goto L480
        L475:
            java.lang.String r8 = "SM-J415F"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L480
            goto L49d
        L480:
            java.lang.String r8 = "Xiaomi"
            boolean r9 = r2.equalsIgnoreCase(r8)
            if (r9 != 0) goto L493
            java.lang.String r9 = android.os.Build.BRAND
            r9.getClass()
            boolean r8 = r9.equalsIgnoreCase(r8)
            if (r8 == 0) goto L49f
        L493:
            java.lang.String r8 = "Mi A1"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L49f
        L49d:
            r8 = r6
            goto L4a0
        L49f:
            r8 = r3
        L4a0:
            java.lang.Class<androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk> r9 = androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk.class
            boolean r8 = r0.a(r9, r8)
            if (r8 == 0) goto L4b0
            androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk r8 = new androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk
            r8.<init>()
            r1.add(r8)
        L4b0:
            java.lang.String r8 = "Huawei"
            boolean r9 = r2.equalsIgnoreCase(r8)
            if (r9 != 0) goto L4c3
            java.lang.String r9 = android.os.Build.BRAND
            r9.getClass()
            boolean r9 = r9.equalsIgnoreCase(r8)
            if (r9 == 0) goto L4cf
        L4c3:
            java.lang.String r9 = "HUAWEI ALE-L04"
            java.lang.String r10 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L4cf
            goto L55d
        L4cf:
            boolean r9 = r2.equalsIgnoreCase(r5)
            if (r9 != 0) goto L4e0
            java.lang.String r9 = android.os.Build.BRAND
            r9.getClass()
            boolean r9 = r9.equalsIgnoreCase(r5)
            if (r9 == 0) goto L4ec
        L4e0:
            java.lang.String r9 = "sm-j320f"
            java.lang.String r10 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L4ec
            goto L55d
        L4ec:
            boolean r9 = r2.equalsIgnoreCase(r5)
            if (r9 != 0) goto L4fd
            java.lang.String r9 = android.os.Build.BRAND
            r9.getClass()
            boolean r9 = r9.equalsIgnoreCase(r5)
            if (r9 == 0) goto L508
        L4fd:
            java.lang.String r9 = "sm-j700f"
            java.lang.String r10 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L508
            goto L55d
        L508:
            boolean r9 = r2.equalsIgnoreCase(r5)
            if (r9 != 0) goto L519
            java.lang.String r9 = android.os.Build.BRAND
            r9.getClass()
            boolean r9 = r9.equalsIgnoreCase(r5)
            if (r9 == 0) goto L524
        L519:
            java.lang.String r9 = "sm-j111f"
            java.lang.String r10 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L524
            goto L55d
        L524:
            java.lang.String r9 = "Oppo"
            boolean r10 = r2.equalsIgnoreCase(r9)
            if (r10 != 0) goto L537
            java.lang.String r10 = android.os.Build.BRAND
            r10.getClass()
            boolean r9 = r10.equalsIgnoreCase(r9)
            if (r9 == 0) goto L542
        L537:
            java.lang.String r9 = "A37F"
            java.lang.String r10 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L542
            goto L55d
        L542:
            boolean r9 = r2.equalsIgnoreCase(r5)
            if (r9 != 0) goto L553
            java.lang.String r9 = android.os.Build.BRAND
            r9.getClass()
            boolean r9 = r9.equalsIgnoreCase(r5)
            if (r9 == 0) goto L55f
        L553:
            java.lang.String r9 = "sm-j510fn"
            java.lang.String r10 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L55f
        L55d:
            r9 = r6
            goto L560
        L55f:
            r9 = r3
        L560:
            java.lang.Class<androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk> r10 = androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class
            boolean r9 = r0.a(r10, r9)
            if (r9 == 0) goto L570
            androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk r9 = new androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk
            r9.<init>()
            r1.add(r9)
        L570:
            boolean r9 = r2.equalsIgnoreCase(r8)
            if (r9 != 0) goto L584
            java.lang.String r9 = android.os.Build.BRAND
            r9.getClass()
            boolean r9 = r9.equalsIgnoreCase(r8)
            if (r9 == 0) goto L582
            goto L584
        L582:
            r9 = r3
            goto L585
        L584:
            r9 = r6
        L585:
            java.lang.Class<androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk> r10 = androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class
            boolean r9 = r0.a(r10, r9)
            if (r9 == 0) goto L595
            androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk r9 = new androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk
            r9.<init>()
            r1.add(r9)
        L595:
            boolean r9 = r2.equalsIgnoreCase(r5)
            if (r9 != 0) goto L5a6
            java.lang.String r9 = android.os.Build.BRAND
            r9.getClass()
            boolean r9 = r9.equalsIgnoreCase(r5)
            if (r9 == 0) goto L5b3
        L5a6:
            kg0 r9 = defpackage.lg0.g
            r9.getClass()
            boolean r9 = defpackage.kg0.c(r4)
            if (r9 == 0) goto L5b3
            r9 = r6
            goto L5b4
        L5b3:
            r9 = r3
        L5b4:
            java.lang.Class<androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk> r10 = androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class
            boolean r9 = r0.a(r10, r9)
            if (r9 == 0) goto L5c4
            androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk r9 = new androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk
            r9.<init>()
            r1.add(r9)
        L5c4:
            boolean r9 = defpackage.xk2.x()
            if (r9 != 0) goto L651
            boolean r9 = defpackage.xk2.y()
            if (r9 != 0) goto L651
            boolean r9 = defpackage.xk2.A()
            if (r9 != 0) goto L651
            boolean r9 = defpackage.xk2.z()
            if (r9 != 0) goto L651
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r10 = "pixel 4 xl"
            boolean r10 = r10.equalsIgnoreCase(r9)
            if (r10 == 0) goto L5ed
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            if (r10 != r11) goto L5ed
            goto L651
        L5ed:
            boolean r10 = r2.equalsIgnoreCase(r7)
            if (r10 != 0) goto L5fe
            java.lang.String r10 = android.os.Build.BRAND
            r10.getClass()
            boolean r7 = r10.equalsIgnoreCase(r7)
            if (r7 == 0) goto L607
        L5fe:
            java.lang.String r7 = "moto e13"
            boolean r7 = r7.equalsIgnoreCase(r9)
            if (r7 == 0) goto L607
            goto L651
        L607:
            boolean r7 = r2.equalsIgnoreCase(r5)
            if (r7 != 0) goto L618
            java.lang.String r7 = android.os.Build.BRAND
            r7.getClass()
            boolean r7 = r7.equalsIgnoreCase(r5)
            if (r7 == 0) goto L62b
        L618:
            java.lang.String r7 = android.os.Build.DEVICE
            java.lang.String r10 = "gta8"
            boolean r10 = r10.equalsIgnoreCase(r7)
            if (r10 != 0) goto L651
            java.lang.String r10 = "gta8wifi"
            boolean r7 = r10.equalsIgnoreCase(r7)
            if (r7 == 0) goto L62b
            goto L651
        L62b:
            boolean r7 = r2.equalsIgnoreCase(r5)
            if (r7 != 0) goto L63c
            java.lang.String r7 = android.os.Build.BRAND
            r7.getClass()
            boolean r5 = r7.equalsIgnoreCase(r5)
            if (r5 == 0) goto L648
        L63c:
            r9.getClass()
            java.lang.String r5 = "SM-A536"
            boolean r5 = defpackage.xs6.g0(r9, r5, r3)
            if (r5 == 0) goto L648
            goto L651
        L648:
            boolean r5 = defpackage.lb4.C()
            if (r5 == 0) goto L64f
            goto L651
        L64f:
            r5 = r3
            goto L652
        L651:
            r5 = r6
        L652:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk> r7 = androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class
            boolean r5 = r0.a(r7, r5)
            if (r5 == 0) goto L662
            androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk r5 = new androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk
            r5.<init>()
            r1.add(r5)
        L662:
            java.lang.String r5 = android.os.Build.MODEL
            java.lang.String r7 = "Pixel 8"
            boolean r7 = r7.equalsIgnoreCase(r5)
            if (r7 == 0) goto L685
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r7.getClass()
            r9 = r4
            qc0 r9 = (defpackage.qc0) r9
            java.lang.Object r7 = r9.c(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L67d
            goto L685
        L67d:
            int r7 = r7.intValue()
            if (r7 != 0) goto L685
            r7 = r6
            goto L686
        L685:
            r7 = r3
        L686:
            java.lang.Class<androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk> r9 = androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk.class
            boolean r7 = r0.a(r9, r7)
            if (r7 == 0) goto L696
            androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk r7 = new androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk
            r7.<init>()
            r1.add(r7)
        L696:
            java.util.Set r7 = androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.a
            r5.getClass()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r9 = r5.toLowerCase(r9)
            r9.getClass()
            boolean r7 = r7.contains(r9)
            if (r7 != 0) goto L6cc
            boolean r7 = defpackage.lb4.C()
            if (r7 != 0) goto L6cc
            boolean r2 = r2.equalsIgnoreCase(r8)
            if (r2 != 0) goto L6c1
            java.lang.String r2 = android.os.Build.BRAND
            r2.getClass()
            boolean r2 = r2.equalsIgnoreCase(r8)
            if (r2 == 0) goto L6ca
        L6c1:
            java.lang.String r2 = "FIG-LX1"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L6ca
            goto L6cc
        L6ca:
            r2 = r3
            goto L6cd
        L6cc:
            r2 = r6
        L6cd:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk> r5 = androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class
            boolean r2 = r0.a(r5, r2)
            if (r2 == 0) goto L6dd
            androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk r2 = new androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk
            r2.<init>()
            r1.add(r2)
        L6dd:
            java.lang.Class<androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk> r2 = androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class
            boolean r5 = defpackage.ge7.J()
            boolean r2 = r0.a(r2, r5)
            if (r2 == 0) goto L6f1
            androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk r2 = new androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk
            r2.<init>()
            r1.add(r2)
        L6f1:
            java.util.List r2 = androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.a
            if (r2 == 0) goto L6fc
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L6fc
            goto L737
        L6fc:
            java.util.Iterator r2 = r2.iterator()
        L700:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L737
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = android.os.Build.MODEL
            r7.getClass()
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            r7.getClass()
            boolean r5 = defpackage.xs6.g0(r7, r5, r3)
            if (r5 == 0) goto L700
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r2.getClass()
            qc0 r4 = (defpackage.qc0) r4
            java.lang.Object r2 = r4.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L730
            goto L737
        L730:
            int r2 = r2.intValue()
            if (r2 != r6) goto L737
            r3 = r6
        L737:
            java.lang.Class<androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk> r2 = androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.class
            boolean r0 = r0.a(r2, r3)
            if (r0 == 0) goto L747
            androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk r0 = new androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk
            r0.<init>()
            r1.add(r0)
        L747:
            y65 r0 = new y65
            r0.<init>(r1)
            java.lang.String r1 = defpackage.y65.d(r0)
            java.lang.String r2 = "camera2 CameraQuirks = "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "CameraQuirks"
            defpackage.kj2.t(r2, r1)
        L75b:
            return r0
        L75c:
            r0 = move-exception
            goto L75f
        L75e:
            r0 = move-exception
        L75f:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Unexpected error in QuirkSettings StateObservable"
            r1.<init>(r2, r0)
            throw r1
        L767:
            ed0 r7 = (defpackage.ed0) r7
            n55 r0 = r7.d
            java.lang.Object r0 = r0.get()
            af0 r0 = (defpackage.af0) r0
            return r0
        L772:
            androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk r7 = (androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk) r7
            dr6 r0 = r7.a
            r1 = 34
            android.util.Size[] r0 = r0.a(r1)
            if (r0 == 0) goto L786
            java.util.List r0 = java.util.Arrays.asList(r0)
            r0.getClass()
            goto L788
        L786:
            yt1 r0 = defpackage.yt1.A
        L788:
            boolean r1 = defpackage.kj2.F(r2)
            if (r1 == 0) goto L79f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "supportedResolutions = "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L79f:
            return r0
        L7a0:
            of5 r7 = (defpackage.of5) r7
            return r7
        L7a3:
            s40 r7 = (defpackage.s40) r7
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            fo4 r1 = r7.b
            p40 r2 = new p40
            b33 r4 = r7.a
            z80 r8 = r4.h()
            r2.<init>(r8)
            fe5 r8 = new fe5
            r8.<init>(r2)
            r0.inJustDecodeBounds = r6
            wu4 r9 = new wu4
            r9.<init>(r8)
            fe5 r10 = new fe5
            r10.<init>(r9)
            j80 r9 = new j80
            r9.<init>(r10, r6)
            android.graphics.BitmapFactory.decodeStream(r9, r5, r0)
            java.lang.Object r9 = r2.L
            java.lang.Exception r9 = (java.lang.Exception) r9
            if (r9 != 0) goto La7f
            r0.inJustDecodeBounds = r3
            android.graphics.Paint r9 = defpackage.v72.a
            java.lang.String r9 = r0.outMimeType
            u72 r7 = r7.d
            java.util.Set r10 = defpackage.x72.a
            int[] r10 = defpackage.w72.a
            int r7 = r7.ordinal()
            r7 = r10[r7]
            r11 = 90
            r12 = 2
            if (r7 == r6) goto L7f8
            if (r7 == r12) goto L845
            r9 = 3
            if (r7 != r9) goto L7f3
            goto L802
        L7f3:
            defpackage.i.d()
            goto La74
        L7f8:
            if (r9 == 0) goto L845
            java.util.Set r7 = defpackage.x72.a
            boolean r7 = r7.contains(r9)
            if (r7 == 0) goto L845
        L802:
            r72 r7 = new r72
            t72 r9 = new t72
            wu4 r13 = new wu4
            r13.<init>(r8)
            fe5 r14 = new fe5
            r14.<init>(r13)
            j80 r13 = new j80
            r13.<init>(r14, r6)
            r9.<init>(r13)
            r7.<init>(r9)
            g72 r9 = new g72
            java.lang.String r13 = "Orientation"
            int r14 = r7.c(r6, r13)
            if (r14 == r12) goto L830
            r15 = 7
            if (r14 == r15) goto L830
            r15 = 4
            if (r14 == r15) goto L830
            r15 = 5
            if (r14 == r15) goto L830
            r14 = r3
            goto L831
        L830:
            r14 = r6
        L831:
            int r7 = r7.c(r6, r13)
            switch(r7) {
                case 3: goto L83f;
                case 4: goto L83f;
                case 5: goto L83c;
                case 6: goto L83a;
                case 7: goto L83a;
                case 8: goto L83c;
                default: goto L838;
            }
        L838:
            r7 = r3
            goto L841
        L83a:
            r7 = r11
            goto L841
        L83c:
            r7 = 270(0x10e, float:3.78E-43)
            goto L841
        L83f:
            r7 = 180(0xb4, float:2.52E-43)
        L841:
            r9.<init>(r14, r7)
            goto L847
        L845:
            g72 r9 = defpackage.g72.c
        L847:
            int r7 = r9.b
            boolean r9 = r9.a
            java.lang.Object r13 = r2.L
            java.lang.Exception r13 = (java.lang.Exception) r13
            if (r13 != 0) goto La7e
            r0.inMutable = r3
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 26
            if (r13 < r14) goto L860
            android.graphics.ColorSpace r15 = r1.c
            if (r15 == 0) goto L860
            defpackage.au.l(r0, r15)
        L860:
            boolean r15 = r1.h
            android.content.Context r5 = r1.a
            wi6 r3 = r1.d
            r0.inPremultiplied = r15
            android.graphics.Bitmap$Config r15 = r1.b
            if (r9 != 0) goto L86e
            if (r7 <= 0) goto L878
        L86e:
            if (r15 == 0) goto L876
            boolean r16 = defpackage.nb3.B(r15)
            if (r16 == 0) goto L878
        L876:
            android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.ARGB_8888
        L878:
            boolean r12 = r1.g
            if (r12 == 0) goto L88c
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
            if (r15 != r12) goto L88c
            java.lang.String r12 = r0.outMimeType
            java.lang.String r10 = "image/jpeg"
            boolean r10 = defpackage.nb3.k(r12, r10)
            if (r10 == 0) goto L88c
            android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.RGB_565
        L88c:
            if (r13 < r14) goto L8a2
            android.graphics.Bitmap$Config r10 = defpackage.au.a(r0)
            android.graphics.Bitmap$Config r12 = defpackage.k2.b()
            if (r10 != r12) goto L8a2
            android.graphics.Bitmap$Config r10 = defpackage.k2.A()
            if (r15 == r10) goto L8a2
            android.graphics.Bitmap$Config r15 = defpackage.k2.b()
        L8a2:
            r0.inPreferredConfig = r15
            qo2 r4 = r4.e()
            boolean r10 = r4 instanceof defpackage.pl5
            if (r10 == 0) goto L8cf
            wi6 r10 = defpackage.wi6.c
            boolean r10 = defpackage.nb3.k(r3, r10)
            if (r10 == 0) goto L8cf
            r0.inSampleSize = r6
            r0.inScaled = r6
            pl5 r4 = (defpackage.pl5) r4
            int r1 = r4.b
            r0.inDensity = r1
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            r0.inTargetDensity = r1
            r13 = r5
            r11 = r6
            r1 = 0
            goto L9a2
        L8cf:
            int r4 = r0.outWidth
            if (r4 <= 0) goto L8d7
            int r10 = r0.outHeight
            if (r10 > 0) goto L8db
        L8d7:
            r13 = r5
            r11 = r6
            goto L99d
        L8db:
            r12 = 270(0x10e, float:3.78E-43)
            if (r7 == r11) goto L8e4
            if (r7 != r12) goto L8e2
            goto L8e4
        L8e2:
            r13 = r4
            goto L8e5
        L8e4:
            r13 = r10
        L8e5:
            if (r7 == r11) goto L8eb
            if (r7 != r12) goto L8ea
            goto L8eb
        L8ea:
            r4 = r10
        L8eb:
            y56 r10 = r1.e
            wi6 r12 = defpackage.wi6.c
            boolean r14 = defpackage.nb3.k(r3, r12)
            if (r14 == 0) goto L8f7
            r14 = r13
            goto L8fd
        L8f7:
            ge7 r14 = r3.a
            int r14 = defpackage.k.d(r14, r10)
        L8fd:
            boolean r12 = defpackage.nb3.k(r3, r12)
            if (r12 == 0) goto L905
            r3 = r4
            goto L90b
        L905:
            ge7 r3 = r3.b
            int r3 = defpackage.k.d(r3, r10)
        L90b:
            int r12 = r13 / r14
            int r12 = java.lang.Integer.highestOneBit(r12)
            int r15 = r4 / r3
            int r15 = java.lang.Integer.highestOneBit(r15)
            int[] r17 = defpackage.rc1.a
            int r18 = r10.ordinal()
            r11 = r17[r18]
            if (r11 == r6) goto L930
            r6 = 2
            if (r11 != r6) goto L92a
            int r6 = java.lang.Math.max(r12, r15)
        L928:
            r11 = 1
            goto L935
        L92a:
            defpackage.i.d()
        L92d:
            r5 = 0
            goto La74
        L930:
            int r6 = java.lang.Math.min(r12, r15)
            goto L928
        L935:
            if (r6 >= r11) goto L938
            r6 = 1
        L938:
            r0.inSampleSize = r6
            double r11 = (double) r13
            r13 = r5
            double r5 = (double) r6
            double r11 = r11 / r5
            r19 = r5
            double r4 = (double) r4
            double r4 = r4 / r19
            double r14 = (double) r14
            r19 = r4
            double r3 = (double) r3
            double r14 = r14 / r11
            double r3 = r3 / r19
            int r5 = r10.ordinal()
            r5 = r17[r5]
            r11 = 1
            if (r5 == r11) goto L95f
            r6 = 2
            if (r5 != r6) goto L95b
            double r3 = java.lang.Math.min(r14, r3)
            goto L963
        L95b:
            defpackage.i.d()
            goto L92d
        L95f:
            double r3 = java.lang.Math.max(r14, r3)
        L963:
            boolean r1 = r1.f
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 == 0) goto L96e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L96e
            r3 = r5
        L96e:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L974
            r1 = 1
            goto L975
        L974:
            r1 = 0
        L975:
            r10 = r1 ^ 1
            r0.inScaled = r10
            if (r1 != 0) goto L990
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 2147483647(0x7fffffff, float:NaN)
            r10 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            if (r1 <= 0) goto L993
            double r10 = r10 / r3
            int r1 = defpackage.u24.D(r10)
            r0.inDensity = r1
            r0.inTargetDensity = r5
        L990:
            r1 = 0
            r11 = 1
            goto L9a2
        L993:
            r0.inDensity = r5
            double r10 = r10 * r3
            int r1 = defpackage.u24.D(r10)
            r0.inTargetDensity = r1
            goto L990
        L99d:
            r0.inSampleSize = r11
            r1 = 0
            r0.inScaled = r1
        L9a2:
            j80 r3 = new j80     // Catch: java.lang.Throwable -> La76
            r3.<init>(r8, r11)     // Catch: java.lang.Throwable -> La76
            r4 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r3, r4, r0)     // Catch: java.lang.Throwable -> La76
            r8.close()
            java.lang.Object r2 = r2.L
            java.lang.Exception r2 = (java.lang.Exception) r2
            if (r2 != 0) goto La75
            if (r3 == 0) goto La6e
            android.content.res.Resources r2 = r13.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.densityDpi
            r3.setDensity(r2)
            if (r9 != 0) goto L9c8
            if (r7 <= 0) goto La52
        L9c8:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int r4 = r3.getWidth()
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            int r6 = r3.getHeight()
            float r6 = (float) r6
            float r6 = r6 / r5
            if (r9 == 0) goto L9e4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r5, r8, r4, r6)
        L9e4:
            if (r7 <= 0) goto L9ea
            float r5 = (float) r7
            r2.postRotate(r5, r4, r6)
        L9ea:
            android.graphics.RectF r4 = new android.graphics.RectF
            int r5 = r3.getWidth()
            float r5 = (float) r5
            int r6 = r3.getHeight()
            float r6 = (float) r6
            r8 = 0
            r4.<init>(r8, r8, r5, r6)
            r2.mapRect(r4)
            float r5 = r4.left
            int r6 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r6 != 0) goto La0c
            float r6 = r4.top
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto La0c
        La09:
            r4 = 90
            goto La14
        La0c:
            float r5 = -r5
            float r4 = r4.top
            float r4 = -r4
            r2.postTranslate(r5, r4)
            goto La09
        La14:
            if (r7 == r4) goto La30
            r12 = 270(0x10e, float:3.78E-43)
            if (r7 != r12) goto La1b
            goto La30
        La1b:
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            android.graphics.Bitmap$Config r6 = r3.getConfig()
            if (r6 != 0) goto La2b
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        La2b:
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)
            goto La44
        La30:
            int r4 = r3.getHeight()
            int r5 = r3.getWidth()
            android.graphics.Bitmap$Config r6 = r3.getConfig()
            if (r6 != 0) goto La40
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        La40:
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)
        La44:
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r4)
            android.graphics.Paint r6 = defpackage.v72.a
            r5.drawBitmap(r3, r2, r6)
            r3.recycle()
            r3 = r4
        La52:
            qc1 r5 = new qc1
            android.content.res.Resources r2 = r13.getResources()
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            r4.<init>(r2, r3)
            int r2 = r0.inSampleSize
            r11 = 1
            if (r2 > r11) goto La69
            boolean r0 = r0.inScaled
            if (r0 == 0) goto La67
            goto La69
        La67:
            r3 = r1
            goto La6a
        La69:
            r3 = r11
        La6a:
            r5.<init>(r4, r3)
            goto La74
        La6e:
            java.lang.String r0 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
            defpackage.i.m(r0)
            r5 = r4
        La74:
            return r5
        La75:
            throw r2
        La76:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> La79
        La79:
            r0 = move-exception
            defpackage.ge7.t(r8, r1)
            throw r0
        La7e:
            throw r13
        La7f:
            throw r9
        La80:
            fp r7 = (defpackage.fp) r7
            return r7
        La83:
            me.magnum.melonds.ui.backgrounds.BackgroundsActivity r7 = (me.magnum.melonds.ui.backgrounds.BackgroundsActivity) r7
            int r0 = me.magnum.melonds.ui.backgrounds.BackgroundsActivity.B0
            r7.finish()
            return r4
        La8b:
            lw r7 = (defpackage.lw) r7
            vs4 r0 = r7.n0
            java.lang.Object r0 = r0.getValue()
            z23 r0 = (defpackage.z23) r0
            return r0
        La96:
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            w0 r0 = new w0
            r0.<init>(r7)
            return r0
        La9e:
            m07 r7 = (defpackage.m07) r7
            l07 r0 = r7.R()
            return r0
        Laa5:
            ql r7 = (defpackage.ql) r7
            defpackage.f04.I(r7)
            return r4
        Laab:
            r1 = r3
            r4 = r5
            lg0 r7 = (defpackage.lg0) r7
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            r0.getClass()
            qc0 r7 = (defpackage.qc0) r7
            java.lang.Object r0 = r7.c(r0)
            android.util.Range[] r0 = (android.util.Range[]) r0
            if (r0 == 0) goto Lb42
            int r2 = r0.length
            if (r2 != 0) goto Lac3
            goto Lb42
        Lac3:
            int r2 = r0.length
            r3 = r1
            r5 = r4
        Lac6:
            if (r3 >= r2) goto Lb43
            r1 = r0[r3]
            java.lang.Comparable r4 = r1.getUpper()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Comparable r6 = r1.getLower()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Comparable r7 = r1.getUpper()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r7 < r8) goto Laf3
            java.lang.Comparable r4 = r1.getUpper()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 / r8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        Laf3:
            java.lang.Comparable r7 = r1.getLower()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 < r8) goto Lb0e
            java.lang.Comparable r1 = r1.getLower()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 / r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        Lb0e:
            android.util.Range r1 = new android.util.Range
            r1.<init>(r6, r4)
            java.lang.Comparable r4 = r1.getUpper()
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto Lb1c
            goto Lb3f
        Lb1c:
            int r4 = r4.intValue()
            r6 = 30
            if (r4 == r6) goto Lb25
            goto Lb3f
        Lb25:
            if (r5 != 0) goto Lb28
            goto Lb3e
        Lb28:
            java.lang.Comparable r4 = r1.getLower()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Comparable r6 = r5.getLower()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r4 >= r6) goto Lb3f
        Lb3e:
            r5 = r1
        Lb3f:
            int r3 = r3 + 1
            goto Lac6
        Lb42:
            r5 = r4
        Lb43:
            return r5
        Lb44:
            ts4 r7 = (defpackage.ts4) r7
            long r0 = r7.h()
            r2 = 1
            long r0 = r0 + r2
            r7.i(r0)
            return r4
    }
}
