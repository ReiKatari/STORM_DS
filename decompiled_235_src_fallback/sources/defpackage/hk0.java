package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hk0 implements defpackage.b31 {
    public final /* synthetic */ int a;

    public /* synthetic */ hk0(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public /* synthetic */ hk0(defpackage.bt r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.<init>()
            return
    }

    @Override // defpackage.b31
    public final void accept(java.lang.Object r15) {
            r14 = this;
            int r14 = r14.a
            r0 = 0
            java.lang.String r1 = "DeviceQuirks"
            r2 = 0
            r3 = 1
            java.lang.String r4 = "Samsung"
            java.lang.String r5 = "Vivo"
            switch(r14) {
                case 0: goto L715;
                case 1: goto L709;
                case 2: goto L703;
                case 3: goto L5aa;
                case 4: goto L11;
                default: goto Le;
            }
        Le:
            java.util.Set r15 = (java.util.Set) r15
            return
        L11:
            v65 r15 = (defpackage.v65) r15
            y65 r14 = new y65
            r15.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r6 = androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk.b
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r6 < r7) goto L8f
            androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk r8 = new androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk
            ex6 r8 = androidx.camera.core.internal.compat.quirk.BackportedFixQuirk.a
            java.lang.Object r8 = r8.getValue()
            y10 r8 = (defpackage.y10) r8
            oi3 r9 = defpackage.qi3.a
            r8.getClass()
            r9.getClass()
            pi3 r10 = r9.c
            java.lang.Object r10 = r10.c()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L72
            java.util.Set r9 = r9.b
            java.lang.String r10 = android.os.Build.FINGERPRINT
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L52
            rq6 r8 = defpackage.rq6.Fixed
            goto L74
        L52:
            s35 r8 = r8.a
            r8.getClass()
            java.lang.Object r8 = r8.A
            ex6 r8 = (defpackage.ex6) r8
            java.lang.Object r8 = r8.getValue()
            java.util.Set r8 = (java.util.Set) r8
            r9 = 5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L6f
            rq6 r8 = defpackage.rq6.Fixed
            goto L74
        L6f:
            rq6 r8 = defpackage.rq6.NotFixed
            goto L74
        L72:
            rq6 r8 = defpackage.rq6.NotApplicable
        L74:
            int[] r9 = defpackage.x10.a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r3) goto L8d
            r9 = 2
            if (r8 == r9) goto L8f
            r9 = 3
            if (r8 == r9) goto L8f
            r9 = 4
            if (r8 != r9) goto L88
            goto L8d
        L88:
            defpackage.i.d()
            goto L5a9
        L8d:
            r8 = r3
            goto L90
        L8f:
            r8 = r2
        L90:
            java.lang.Class<androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk> r9 = androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk.class
            boolean r8 = r15.a(r9, r8)
            if (r8 == 0) goto La0
            androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk r8 = new androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk
            r8.<init>()
            r0.add(r8)
        La0:
            boolean r8 = androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.a
            if (r8 != 0) goto Lc7
            boolean r8 = androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.b
            if (r8 == 0) goto La9
            goto Lc7
        La9:
            r8 = 30
            if (r8 > r6) goto Lc9
            if (r6 >= r7) goto Lc9
            java.lang.String r7 = "Oppo"
            boolean r7 = defpackage.lb4.A(r7)
            if (r7 != 0) goto Lc7
            java.lang.String r7 = "OnePlus"
            boolean r7 = defpackage.lb4.A(r7)
            if (r7 != 0) goto Lc7
            java.lang.String r7 = "Realme"
            boolean r7 = defpackage.lb4.A(r7)
            if (r7 == 0) goto Lc9
        Lc7:
            r7 = r3
            goto Lf0
        Lc9:
            java.lang.String r7 = android.os.Build.MANUFACTURER
            r7.getClass()
            boolean r7 = r7.equalsIgnoreCase(r5)
            if (r7 != 0) goto Lc7
            java.lang.String r7 = android.os.Build.BRAND
            r7.getClass()
            boolean r7 = r7.equalsIgnoreCase(r5)
            if (r7 == 0) goto Le0
            goto Lc7
        Le0:
            boolean r7 = androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.c
            if (r7 == 0) goto Le5
            goto Lc7
        Le5:
            boolean r7 = androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.e
            if (r7 == 0) goto Lea
            goto Lc7
        Lea:
            boolean r7 = androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.d
            if (r7 == 0) goto Lef
            goto Lc7
        Lef:
            r7 = r2
        Lf0:
            java.lang.Class<androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk> r8 = androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.class
            boolean r7 = r15.a(r8, r7)
            if (r7 == 0) goto L100
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk r7 = new androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk
            r7.<init>()
            r0.add(r7)
        L100:
            java.util.List r7 = androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a
            java.lang.String r8 = android.os.Build.MODEL
            r8.getClass()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r10 = r8.toUpperCase(r9)
            r10.getClass()
            boolean r7 = r7.contains(r10)
            java.lang.Class<androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk> r10 = androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class
            boolean r7 = r15.a(r10, r7)
            if (r7 == 0) goto L124
            androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk r7 = new androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk
            r7.<init>()
            r0.add(r7)
        L124:
            java.lang.String r7 = android.os.Build.MANUFACTURER
            r7.getClass()
            java.lang.String r10 = "Jio"
            boolean r11 = r7.equalsIgnoreCase(r10)
            if (r11 != 0) goto L13c
            java.lang.String r11 = android.os.Build.BRAND
            r11.getClass()
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 == 0) goto L145
        L13c:
            java.lang.String r10 = "LS1542QW"
            boolean r10 = defpackage.xs6.g0(r8, r10, r3)
            if (r10 == 0) goto L145
            goto L183
        L145:
            boolean r10 = r7.equalsIgnoreCase(r4)
            if (r10 != 0) goto L156
            java.lang.String r10 = android.os.Build.BRAND
            r10.getClass()
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L167
        L156:
            java.lang.String r10 = "SM-A025"
            boolean r10 = defpackage.xs6.g0(r8, r10, r3)
            if (r10 != 0) goto L183
            java.lang.String r10 = "SM-S124DL"
            boolean r10 = r8.equalsIgnoreCase(r10)
            if (r10 == 0) goto L167
            goto L183
        L167:
            boolean r10 = r7.equalsIgnoreCase(r5)
            if (r10 != 0) goto L178
            java.lang.String r10 = android.os.Build.BRAND
            r10.getClass()
            boolean r5 = r10.equalsIgnoreCase(r5)
            if (r5 == 0) goto L181
        L178:
            java.lang.String r5 = "VIVO 2039"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L181
            goto L183
        L181:
            r5 = r2
            goto L184
        L183:
            r5 = r3
        L184:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk> r10 = androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk.class
            boolean r5 = r15.a(r10, r5)
            if (r5 == 0) goto L194
            androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk r5 = new androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk
            r5.<init>()
            r0.add(r5)
        L194:
            boolean r5 = androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.a
            java.lang.String r5 = "Tecno"
            boolean r10 = r7.equalsIgnoreCase(r5)
            if (r10 != 0) goto L1c4
            java.lang.String r10 = android.os.Build.BRAND
            r10.getClass()
            boolean r5 = r10.equalsIgnoreCase(r5)
            if (r5 == 0) goto L1aa
            goto L1c4
        L1aa:
            java.lang.String r5 = "Tecno-mobile"
            boolean r11 = r7.equalsIgnoreCase(r5)
            if (r11 != 0) goto L1c4
            boolean r5 = r10.equalsIgnoreCase(r5)
            if (r5 == 0) goto L1b9
            goto L1c4
        L1b9:
            boolean r5 = androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.a
            if (r5 != 0) goto L1c4
            boolean r5 = androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.b
            if (r5 == 0) goto L1c2
            goto L1c4
        L1c2:
            r5 = r2
            goto L1c5
        L1c4:
            r5 = r3
        L1c5:
            java.lang.Class<androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk> r10 = androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.class
            boolean r5 = r15.a(r10, r5)
            if (r5 == 0) goto L1d5
            androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk r5 = new androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk
            r5.<init>()
            r0.add(r5)
        L1d5:
            boolean r5 = r7.equalsIgnoreCase(r4)
            java.lang.String r10 = "Xiaomi"
            if (r5 != 0) goto L1f8
            java.lang.String r5 = android.os.Build.BRAND
            r5.getClass()
            boolean r11 = r5.equalsIgnoreCase(r4)
            if (r11 == 0) goto L1e9
            goto L1f8
        L1e9:
            boolean r11 = r7.equalsIgnoreCase(r10)
            if (r11 != 0) goto L1f8
            boolean r5 = r5.equalsIgnoreCase(r10)
            if (r5 == 0) goto L1f6
            goto L1f8
        L1f6:
            r5 = r2
            goto L1f9
        L1f8:
            r5 = r3
        L1f9:
            java.lang.Class<androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk> r11 = androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk.class
            boolean r5 = r15.a(r11, r5)
            if (r5 == 0) goto L209
            androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk r5 = new androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk
            r5.<init>()
            r0.add(r5)
        L209:
            java.util.Set r5 = androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.a
            md2 r11 = new md2
            java.util.Locale r12 = java.util.Locale.US
            r12.getClass()
            java.lang.String r13 = r7.toLowerCase(r12)
            r13.getClass()
            java.lang.String r12 = r8.toLowerCase(r12)
            r12.getClass()
            r11.<init>(r13, r12)
            boolean r5 = r5.contains(r11)
            java.lang.Class<androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk> r11 = androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class
            boolean r5 = r15.a(r11, r5)
            if (r5 == 0) goto L237
            androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk r5 = new androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk
            r5.<init>()
            r0.add(r5)
        L237:
            java.util.List r5 = androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.a
            boolean r5 = r5.contains(r8)
            java.lang.String r11 = "Google"
            if (r5 == 0) goto L258
            boolean r5 = r7.equalsIgnoreCase(r11)
            if (r5 != 0) goto L252
            java.lang.String r5 = android.os.Build.BRAND
            r5.getClass()
            boolean r5 = r5.equalsIgnoreCase(r11)
            if (r5 == 0) goto L258
        L252:
            r5 = 26
            if (r6 < r5) goto L258
            r5 = r3
            goto L259
        L258:
            r5 = r2
        L259:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk> r12 = androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.class
            boolean r5 = r15.a(r12, r5)
            if (r5 == 0) goto L269
            androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk r5 = new androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk
            r5.<init>()
            r0.add(r5)
        L269:
            java.util.List r5 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.a
            boolean r5 = r7.equalsIgnoreCase(r4)
            java.lang.String r12 = "TP1A"
            if (r5 != 0) goto L27e
            java.lang.String r5 = android.os.Build.BRAND
            r5.getClass()
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 == 0) goto L28b
        L27e:
            java.lang.String r5 = android.os.Build.ID
            r5.getClass()
            boolean r5 = defpackage.xs6.g0(r5, r12, r3)
            if (r5 == 0) goto L28b
            goto L31d
        L28b:
            java.util.List r5 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.a
            java.lang.String r13 = r8.toLowerCase(r9)
            r13.getClass()
            boolean r5 = r5.contains(r13)
            if (r5 == 0) goto L2b2
            java.lang.String r5 = android.os.Build.ID
            r5.getClass()
            boolean r13 = defpackage.xs6.g0(r5, r12, r3)
            if (r13 != 0) goto L31d
            r5.getClass()
            java.lang.String r13 = "TD1A"
            boolean r5 = defpackage.xs6.g0(r5, r13, r3)
            if (r5 == 0) goto L2b2
            goto L31d
        L2b2:
            java.lang.String r5 = "Redmi"
            boolean r13 = r7.equalsIgnoreCase(r5)
            if (r13 != 0) goto L2c8
            java.lang.String r13 = android.os.Build.BRAND
            r13.getClass()
            boolean r5 = r13.equalsIgnoreCase(r5)
            if (r5 == 0) goto L2c6
            goto L2c8
        L2c6:
            r5 = r2
            goto L2c9
        L2c8:
            r5 = r3
        L2c9:
            boolean r13 = r7.equalsIgnoreCase(r10)
            if (r13 != 0) goto L2dd
            java.lang.String r13 = android.os.Build.BRAND
            r13.getClass()
            boolean r13 = r13.equalsIgnoreCase(r10)
            if (r13 == 0) goto L2db
            goto L2dd
        L2db:
            r13 = r2
            goto L2de
        L2dd:
            r13 = r3
        L2de:
            r5 = r5 | r13
            if (r5 == 0) goto L2f8
            java.lang.String r5 = android.os.Build.ID
            r5.getClass()
            java.lang.String r13 = "TKQ1"
            boolean r13 = defpackage.xs6.g0(r5, r13, r3)
            if (r13 != 0) goto L31d
            r5.getClass()
            boolean r5 = defpackage.xs6.g0(r5, r12, r3)
            if (r5 == 0) goto L2f8
            goto L31d
        L2f8:
            java.util.List r5 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.c
            java.lang.String r12 = r8.toLowerCase(r9)
            r12.getClass()
            boolean r5 = r5.contains(r12)
            r12 = 33
            if (r5 == 0) goto L30c
            if (r6 != r12) goto L30c
            goto L31d
        L30c:
            java.util.List r5 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.b
            java.lang.String r13 = r8.toLowerCase(r9)
            r13.getClass()
            boolean r5 = r5.contains(r13)
            if (r5 == 0) goto L31f
            if (r6 != r12) goto L31f
        L31d:
            r5 = r3
            goto L320
        L31f:
            r5 = r2
        L320:
            java.lang.Class<androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk> r6 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.class
            boolean r5 = r15.a(r6, r5)
            if (r5 == 0) goto L330
            androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk r5 = new androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk
            r5.<init>()
            r0.add(r5)
        L330:
            boolean r5 = defpackage.nb3.E()
            if (r5 != 0) goto L369
            boolean r5 = defpackage.nb3.F()
            if (r5 != 0) goto L369
            boolean r5 = defpackage.nb3.C()
            if (r5 != 0) goto L369
            boolean r5 = defpackage.nb3.J()
            if (r5 != 0) goto L369
            boolean r5 = defpackage.nb3.I()
            if (r5 != 0) goto L369
            boolean r5 = defpackage.nb3.G()
            if (r5 != 0) goto L369
            boolean r5 = defpackage.nb3.H()
            if (r5 != 0) goto L369
            boolean r5 = defpackage.nb3.D()
            if (r5 != 0) goto L369
            boolean r5 = defpackage.nb3.K()
            if (r5 == 0) goto L367
            goto L369
        L367:
            r5 = r2
            goto L36a
        L369:
            r5 = r3
        L36a:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk> r6 = androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk.class
            boolean r5 = r15.a(r6, r5)
            if (r5 == 0) goto L37a
            androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk r5 = new androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk
            r5.<init>()
            r0.add(r5)
        L37a:
            java.util.LinkedHashMap r5 = androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.a
            boolean r5 = defpackage.n16.E()
            java.lang.Class<androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk> r6 = androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.class
            boolean r5 = r15.a(r6, r5)
            if (r5 == 0) goto L390
            androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk r5 = new androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk
            r5.<init>()
            r0.add(r5)
        L390:
            java.lang.String r5 = "Motorola"
            boolean r6 = r7.equalsIgnoreCase(r5)
            if (r6 != 0) goto L3a3
            java.lang.String r6 = android.os.Build.BRAND
            r6.getClass()
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L3ad
        L3a3:
            java.lang.String r5 = "moto e5 play"
            boolean r5 = r5.equalsIgnoreCase(r8)
            if (r5 == 0) goto L3ad
            r5 = r3
            goto L3ae
        L3ad:
            r5 = r2
        L3ae:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk> r6 = androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk.class
            boolean r5 = r15.a(r6, r5)
            if (r5 == 0) goto L3be
            androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk r5 = new androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk
            r5.<init>()
            r0.add(r5)
        L3be:
            ev6 r5 = androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.a
            java.lang.String r5 = android.os.Build.DEVICE
            java.lang.String r6 = "heroqltevzw"
            boolean r6 = r6.equalsIgnoreCase(r5)
            if (r6 != 0) goto L3e2
            java.lang.String r6 = "heroqltetmo"
            boolean r6 = r6.equalsIgnoreCase(r5)
            if (r6 == 0) goto L3d3
            goto L3e2
        L3d3:
            boolean r6 = defpackage.ge7.V()
            if (r6 != 0) goto L3e2
            boolean r6 = defpackage.ge7.W()
            if (r6 == 0) goto L3e0
            goto L3e2
        L3e0:
            r6 = r2
            goto L3e3
        L3e2:
            r6 = r3
        L3e3:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk> r12 = androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.class
            boolean r6 = r15.a(r12, r6)
            if (r6 == 0) goto L3f3
            androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk r6 = new androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk
            r6.<init>()
            r0.add(r6)
        L3f3:
            java.util.List r6 = androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.a
            boolean r6 = r7.equalsIgnoreCase(r11)
            if (r6 != 0) goto L403
            java.lang.String r6 = android.os.Build.BRAND
            r6.getClass()
            r6.equalsIgnoreCase(r11)
        L403:
            java.lang.Class<androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk> r6 = androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class
            boolean r6 = r15.a(r6, r2)
            if (r6 == 0) goto L413
            androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk r6 = new androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk
            r6.<init>()
            r0.add(r6)
        L413:
            java.util.List r6 = androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.a
            boolean r6 = r7.equalsIgnoreCase(r11)
            if (r6 != 0) goto L426
            java.lang.String r6 = android.os.Build.BRAND
            r6.getClass()
            boolean r6 = r6.equalsIgnoreCase(r11)
            if (r6 == 0) goto L441
        L426:
            java.util.List r6 = androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.a
            r5.getClass()
            java.util.Locale r11 = java.util.Locale.getDefault()
            r11.getClass()
            java.lang.String r5 = r5.toLowerCase(r11)
            r5.getClass()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L441
            r5 = r3
            goto L442
        L441:
            r5 = r2
        L442:
            java.lang.Class<androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk> r6 = androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.class
            boolean r5 = r15.a(r6, r5)
            if (r5 == 0) goto L452
            androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk r5 = new androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk
            r5.<init>()
            r0.add(r5)
        L452:
            java.lang.String r5 = "Huawei"
            boolean r6 = r7.equalsIgnoreCase(r5)
            if (r6 != 0) goto L465
            java.lang.String r6 = android.os.Build.BRAND
            r6.getClass()
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L46f
        L465:
            java.lang.String r5 = "mha-l29"
            boolean r5 = r5.equalsIgnoreCase(r8)
            if (r5 == 0) goto L46f
            r5 = r3
            goto L470
        L46f:
            r5 = r2
        L470:
            java.lang.Class<androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk> r6 = androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class
            boolean r5 = r15.a(r6, r5)
            if (r5 == 0) goto L480
            androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r5 = new androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk
            r5.<init>()
            r0.add(r5)
        L480:
            boolean r5 = r7.equalsIgnoreCase(r4)
            if (r5 != 0) goto L491
            java.lang.String r5 = android.os.Build.BRAND
            r5.getClass()
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 == 0) goto L4a2
        L491:
            java.lang.String r5 = r8.toUpperCase(r9)
            r5.getClass()
            java.lang.String r6 = "SM-A716"
            boolean r5 = defpackage.xs6.g0(r5, r6, r2)
            if (r5 == 0) goto L4a2
            r5 = r3
            goto L4a3
        L4a2:
            r5 = r2
        L4a3:
            java.lang.Class<androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk> r6 = androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk.class
            boolean r5 = r15.a(r6, r5)
            if (r5 == 0) goto L4b3
            androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk r5 = new androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk
            r5.<init>()
            r0.add(r5)
        L4b3:
            java.util.List r5 = androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.a
            java.lang.String r6 = r8.toLowerCase(r9)
            r6.getClass()
            boolean r5 = r5.contains(r6)
            java.lang.Class<androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk> r6 = androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.class
            boolean r5 = r15.a(r6, r5)
            if (r5 == 0) goto L4d0
            androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk r5 = new androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk
            r5.<init>()
            r0.add(r5)
        L4d0:
            java.util.List r5 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a
            boolean r5 = r7.equalsIgnoreCase(r4)
            if (r5 != 0) goto L4e3
            java.lang.String r5 = android.os.Build.BRAND
            r5.getClass()
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 == 0) goto L500
        L4e3:
            java.util.List r5 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a
            java.lang.String r6 = android.os.Build.HARDWARE
            r6.getClass()
            java.util.Locale r11 = java.util.Locale.getDefault()
            r11.getClass()
            java.lang.String r6 = r6.toLowerCase(r11)
            r6.getClass()
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L500
            r5 = r3
            goto L501
        L500:
            r5 = r2
        L501:
            java.lang.Class<androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk> r6 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class
            boolean r5 = r15.a(r6, r5)
            if (r5 == 0) goto L511
            androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk r5 = new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk
            r5.<init>()
            r0.add(r5)
        L511:
            java.lang.Class<androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk> r5 = androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.class
            boolean r5 = r15.a(r5, r2)
            if (r5 == 0) goto L521
            androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk r5 = new androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk
            r5.<init>()
            r0.add(r5)
        L521:
            java.util.List r5 = androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.a
            boolean r5 = r7.equalsIgnoreCase(r4)
            if (r5 != 0) goto L534
            java.lang.String r5 = android.os.Build.BRAND
            r5.getClass()
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L53d
        L534:
            java.util.List r4 = androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.a
            boolean r4 = defpackage.dt7.b(r4)
            if (r4 == 0) goto L53d
            goto L556
        L53d:
            boolean r4 = r7.equalsIgnoreCase(r10)
            if (r4 != 0) goto L54e
            java.lang.String r4 = android.os.Build.BRAND
            r4.getClass()
            boolean r4 = r4.equalsIgnoreCase(r10)
            if (r4 == 0) goto L557
        L54e:
            java.util.List r4 = androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.b
            boolean r4 = defpackage.dt7.b(r4)
            if (r4 == 0) goto L557
        L556:
            r2 = r3
        L557:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ZslDisablerQuirk> r3 = androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.class
            boolean r2 = r15.a(r3, r2)
            if (r2 == 0) goto L567
            androidx.camera.camera2.compat.quirk.ZslDisablerQuirk r2 = new androidx.camera.camera2.compat.quirk.ZslDisablerQuirk
            r2.<init>()
            r0.add(r2)
        L567:
            java.util.Map r2 = androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.a
            java.lang.String r3 = r8.toUpperCase(r9)
            r3.getClass()
            boolean r2 = r2.containsKey(r3)
            java.lang.Class<androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk> r3 = androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.class
            boolean r2 = r15.a(r3, r2)
            if (r2 == 0) goto L584
            androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk r2 = new androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk
            r2.<init>()
            r0.add(r2)
        L584:
            java.lang.Class<androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk> r2 = androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.class
            boolean r3 = androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.b
            boolean r15 = r15.a(r2, r3)
            if (r15 == 0) goto L593
            androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk r15 = androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.a
            r0.add(r15)
        L593:
            r14.<init>(r0)
            defpackage.si1.a = r14
            y65 r14 = defpackage.si1.a()
            java.lang.String r14 = defpackage.y65.d(r14)
            java.lang.String r15 = "camera2 DeviceQuirks = "
            java.lang.String r14 = r15.concat(r14)
            defpackage.kj2.t(r1, r14)
        L5a9:
            return
        L5aa:
            v65 r15 = (defpackage.v65) r15
            y65 r14 = new y65
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r6 = android.os.Build.BRAND
            java.lang.String r7 = "HUAWEI"
            boolean r7 = r7.equalsIgnoreCase(r6)
            if (r7 == 0) goto L5c8
            java.lang.String r7 = "SNE-LX1"
            java.lang.String r8 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L5c8
            goto L5da
        L5c8:
            java.lang.String r7 = "HONOR"
            boolean r7 = r7.equalsIgnoreCase(r6)
            if (r7 == 0) goto L5dc
            java.lang.String r7 = "STK-LX1"
            java.lang.String r8 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L5dc
        L5da:
            r7 = r3
            goto L5dd
        L5dc:
            r7 = r2
        L5dd:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk> r8 = androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class
            boolean r7 = r15.a(r8, r7)
            if (r7 == 0) goto L5ed
            androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk r7 = new androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk
            r7.<init>()
            r0.add(r7)
        L5ed:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk> r7 = androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class
            boolean r7 = r15.a(r7, r3)
            if (r7 == 0) goto L5fd
            androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk r7 = new androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk
            r7.<init>()
            r0.add(r7)
        L5fd:
            java.util.HashSet r7 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r8 = r6.toUpperCase(r7)
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r10 = r9.toUpperCase(r7)
            java.util.HashSet r11 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.a
            android.util.Pair r8 = android.util.Pair.create(r8, r10)
            boolean r8 = r11.contains(r8)
            java.lang.Class<androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk> r10 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.class
            boolean r8 = r15.a(r10, r8)
            if (r8 == 0) goto L625
            androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk r8 = new androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk
            r8.<init>()
            r0.add(r8)
        L625:
            java.util.HashSet r8 = androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.a
            java.lang.String r10 = r9.toUpperCase(r7)
            boolean r8 = r8.contains(r10)
            java.lang.Class<androidx.camera.core.internal.compat.quirk.LowMemoryQuirk> r10 = androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.class
            boolean r8 = r15.a(r10, r8)
            if (r8 == 0) goto L63f
            androidx.camera.core.internal.compat.quirk.LowMemoryQuirk r8 = new androidx.camera.core.internal.compat.quirk.LowMemoryQuirk
            r8.<init>()
            r0.add(r8)
        L63f:
            java.util.HashSet r8 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.a
            boolean r8 = r4.equalsIgnoreCase(r6)
            if (r8 != 0) goto L65c
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L65a
            java.util.HashSet r5 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.a
            java.lang.String r8 = r9.toUpperCase(r7)
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L65a
            goto L65c
        L65a:
            r5 = r2
            goto L65d
        L65c:
            r5 = r3
        L65d:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk> r8 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.class
            boolean r5 = r15.a(r8, r5)
            if (r5 == 0) goto L66d
            androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk r5 = new androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk
            r5.<init>()
            r0.add(r5)
        L66d:
            java.util.HashSet r5 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.a
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 == 0) goto L685
            java.util.HashSet r4 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.a
            java.lang.String r5 = android.os.Build.DEVICE
            java.lang.String r5 = r5.toUpperCase(r7)
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L685
            r4 = r3
            goto L686
        L685:
            r4 = r2
        L686:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk> r5 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class
            boolean r4 = r15.a(r5, r4)
            if (r4 == 0) goto L696
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r4 = new androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk
            r4.<init>()
            r0.add(r4)
        L696:
            java.util.HashSet r4 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.a
            java.lang.String r4 = "oneplus"
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 == 0) goto L6a9
            java.lang.String r4 = "cph2583"
            boolean r4 = r4.equalsIgnoreCase(r9)
            if (r4 == 0) goto L6a9
            goto L6bd
        L6a9:
            java.lang.String r4 = "google"
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 == 0) goto L6bf
            java.util.HashSet r4 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.a
            java.lang.String r5 = r9.toLowerCase()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L6bf
        L6bd:
            r4 = r3
            goto L6c0
        L6bf:
            r4 = r2
        L6c0:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk> r5 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.class
            boolean r4 = r15.a(r5, r4)
            if (r4 == 0) goto L6d0
            androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk r4 = new androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk
            r4.<init>()
            r0.add(r4)
        L6d0:
            androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk r4 = androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.a
            java.lang.String r5 = "motorola"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L6e3
            java.lang.String r5 = "moto e20"
            boolean r5 = r5.equalsIgnoreCase(r9)
            if (r5 == 0) goto L6e3
            r2 = r3
        L6e3:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk> r3 = androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.class
            boolean r15 = r15.a(r3, r2)
            if (r15 == 0) goto L6ee
            r0.add(r4)
        L6ee:
            r14.<init>(r0)
            defpackage.ri1.a = r14
            y65 r14 = defpackage.ri1.a
            java.lang.String r14 = defpackage.y65.d(r14)
            java.lang.String r15 = "core DeviceQuirks = "
            java.lang.String r14 = r15.concat(r14)
            defpackage.kj2.t(r1, r14)
            return
        L703:
            ez r15 = (defpackage.ez) r15
            defpackage.nj2.h()
            return
        L709:
            if (r15 != 0) goto L70f
            defpackage.nj2.h()
            throw r0
        L70f:
            java.lang.ClassCastException r14 = new java.lang.ClassCastException
            r14.<init>()
            throw r14
        L715:
            if (r15 != 0) goto L71b
            defpackage.nj2.h()
            throw r0
        L71b:
            java.lang.ClassCastException r14 = new java.lang.ClassCastException
            r14.<init>()
            throw r14
    }
}
