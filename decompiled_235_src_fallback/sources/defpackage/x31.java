package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x31  reason: default package */
/* loaded from: classes.dex */
public final class x31 implements defpackage.z31, defpackage.rs7, defpackage.x92, defpackage.mo2, defpackage.x93, defpackage.a15, defpackage.jy4, defpackage.t35, me.magnum.melonds.MelonRomDecryptor.DecryptProgressCallback, defpackage.eh6 {
    public static volatile defpackage.x31 B;
    public static defpackage.x31 L;
    public final /* synthetic */ int A;

    public /* synthetic */ x31(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public x31(defpackage.d23 r1) {
            r0 = this;
            r1 = 9
            r0.A = r1
            r0.<init>()
            return
    }

    public static final android.graphics.Bitmap l(android.media.Image r8) {
            boolean r0 = me.magnum.melonds.translator.capture.ScreenCaptureService.A
            android.media.Image$Plane[] r0 = r8.getPlanes()     // Catch: java.lang.Throwable -> L83
            r1 = 0
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L83
            java.nio.ByteBuffer r2 = r2.getBuffer()     // Catch: java.lang.Throwable -> L83
            r3 = r0[r1]     // Catch: java.lang.Throwable -> L83
            int r3 = r3.getPixelStride()     // Catch: java.lang.Throwable -> L83
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L83
            int r0 = r0.getRowStride()     // Catch: java.lang.Throwable -> L83
            int r4 = r8.getWidth()     // Catch: java.lang.Throwable -> L83
            int r4 = r4 * r3
            int r0 = r0 - r4
            int r4 = r8.getWidth()     // Catch: java.lang.Throwable -> L83
            int r0 = r0 / r3
            int r4 = r4 + r0
            int r0 = r8.getHeight()     // Catch: java.lang.Throwable -> L83
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L83
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r0, r3)     // Catch: java.lang.Throwable -> L83
            r0.getClass()     // Catch: java.lang.Throwable -> L83
            r0.copyPixelsFromBuffer(r2)     // Catch: java.lang.Throwable -> L83
            int r2 = r8.getWidth()     // Catch: java.lang.Throwable -> L83
            int r4 = r8.getHeight()     // Catch: java.lang.Throwable -> L83
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r4, r3)     // Catch: java.lang.Throwable -> L83
            r2.getClass()     // Catch: java.lang.Throwable -> L83
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L83
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L83
            android.graphics.ColorMatrix r4 = new android.graphics.ColorMatrix     // Catch: java.lang.Throwable -> L83
            r5 = 20
            float[] r5 = new float[r5]     // Catch: java.lang.Throwable -> L83
            r5 = {x008e: FILL_ARRAY_DATA  , data: [1065353216, 0, 0, 0, 0, 0, 1065353216, 0, 0, 0, 0, 0, 1065353216, 0, 0, 0, 0, 0, 0, 1132396544} // fill-array     // Catch: java.lang.Throwable -> L83
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L83
            android.graphics.Paint r5 = new android.graphics.Paint     // Catch: java.lang.Throwable -> L83
            r5.<init>()     // Catch: java.lang.Throwable -> L83
            android.graphics.ColorMatrixColorFilter r6 = new android.graphics.ColorMatrixColorFilter     // Catch: java.lang.Throwable -> L83
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L83
            r5.setColorFilter(r6)     // Catch: java.lang.Throwable -> L83
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L83
            int r6 = r8.getWidth()     // Catch: java.lang.Throwable -> L83
            int r7 = r8.getHeight()     // Catch: java.lang.Throwable -> L83
            r4.<init>(r1, r1, r6, r7)     // Catch: java.lang.Throwable -> L83
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L83
            int r7 = r8.getWidth()     // Catch: java.lang.Throwable -> L83
            int r8 = r8.getHeight()     // Catch: java.lang.Throwable -> L83
            r6.<init>(r1, r1, r7, r8)     // Catch: java.lang.Throwable -> L83
            r3.drawBitmap(r0, r4, r6, r5)     // Catch: java.lang.Throwable -> L83
            r0.recycle()     // Catch: java.lang.Throwable -> L83
            return r2
        L83:
            r8 = move-exception
            java.lang.String r0 = "ScreenCaptureService"
            java.lang.String r1 = "Failed to convert Image to Bitmap"
            android.util.Log.e(r0, r1, r8)
            r8 = 0
            return r8
    }

    public static final float m(float r7, float[] r8, float[] r9) {
            float r0 = java.lang.Math.abs(r7)
            float r1 = java.lang.Math.signum(r7)
            int r2 = java.util.Arrays.binarySearch(r8, r0)
            if (r2 < 0) goto L12
            r7 = r9[r2]
            float r1 = r1 * r7
            return r1
        L12:
            int r2 = r2 + 1
            int r2 = -r2
            int r3 = r2 + (-1)
            int r4 = r8.length
            int r4 = r4 + (-1)
            r5 = 0
            if (r3 < r4) goto L2f
            int r0 = r8.length
            int r0 = r0 + (-1)
            r0 = r8[r0]
            int r8 = r8.length
            int r8 = r8 + (-1)
            r8 = r9[r8]
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 != 0) goto L2c
            return r5
        L2c:
            float r8 = r8 / r0
            float r8 = r8 * r7
            return r8
        L2f:
            r7 = -1
            if (r3 != r7) goto L3b
            r7 = 0
            r8 = r8[r7]
            r7 = r9[r7]
            r9 = r8
            r8 = r5
            r3 = r8
            goto L47
        L3b:
            r7 = r8[r3]
            r8 = r8[r2]
            r3 = r9[r3]
            r9 = r9[r2]
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L47:
            int r2 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r2 != 0) goto L4d
            r0 = r5
            goto L50
        L4d:
            float r0 = r0 - r8
            float r9 = r9 - r8
            float r0 = r0 / r9
        L50:
            r8 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r8, r0)
            float r8 = java.lang.Math.max(r5, r8)
            float r7 = r7 - r3
            float r7 = r7 * r8
            float r7 = r7 + r3
            float r7 = r7 * r1
            return r7
    }

    public static final void n(defpackage.q61 r8) {
            tp6 r0 = defpackage.if5.z
        L2:
            tp6 r0 = defpackage.if5.z
            java.lang.Object r1 = r0.getValue()
            hw4 r1 = (defpackage.hw4) r1
            yv4 r2 = r1.L
            java.lang.Object r3 = r2.get(r8)
            ew3 r3 = (defpackage.ew3) r3
            if (r3 != 0) goto L16
            r3 = r1
            goto L78
        L16:
            java.lang.Object r4 = r3.a
            java.lang.Object r3 = r3.b
            ac7 r5 = r2.A
            r6 = 0
            if (r8 == 0) goto L24
            int r7 = r8.hashCode()
            goto L25
        L24:
            r7 = r6
        L25:
            ac7 r6 = r5.v(r8, r7, r6)
            if (r5 != r6) goto L2c
            goto L3b
        L2c:
            if (r6 != 0) goto L31
            yv4 r2 = defpackage.yv4.L
            goto L3b
        L31:
            yv4 r5 = new yv4
            int r2 = r2.B
            int r2 = r2 + (-1)
            r5.<init>(r6, r2)
            r2 = r5
        L3b:
            d90 r5 = defpackage.d90.t0
            if (r4 == r5) goto L53
            java.lang.Object r6 = r2.get(r4)
            r6.getClass()
            ew3 r6 = (defpackage.ew3) r6
            ew3 r7 = new ew3
            java.lang.Object r6 = r6.a
            r7.<init>(r6, r3)
            yv4 r2 = r2.c(r4, r7)
        L53:
            if (r3 == r5) goto L69
            java.lang.Object r6 = r2.get(r3)
            r6.getClass()
            ew3 r6 = (defpackage.ew3) r6
            ew3 r7 = new ew3
            java.lang.Object r6 = r6.b
            r7.<init>(r4, r6)
            yv4 r2 = r2.c(r3, r7)
        L69:
            if (r4 == r5) goto L6e
            java.lang.Object r6 = r1.A
            goto L6f
        L6e:
            r6 = r3
        L6f:
            if (r3 == r5) goto L73
            java.lang.Object r4 = r1.B
        L73:
            hw4 r3 = new hw4
            r3.<init>(r6, r4, r2)
        L78:
            if (r1 == r3) goto L80
            boolean r0 = r0.j(r1, r3)
            if (r0 == 0) goto L2
        L80:
            return
    }

    public static final void o(java.util.List r6, java.lang.StringBuilder r7) {
            r0 = 0
            int r1 = r6.size()
            l93 r0 = defpackage.gi2.R(r0, r1)
            r1 = 2
            j93 r0 = defpackage.gi2.P(r1, r0)
            int r1 = r0.A
            int r2 = r0.B
            int r0 = r0.L
            if (r0 <= 0) goto L18
            if (r1 <= r2) goto L1c
        L18:
            if (r0 >= 0) goto L42
            if (r2 > r1) goto L42
        L1c:
            java.lang.Object r3 = r6.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r1 + 1
            java.lang.Object r4 = r6.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r1 <= 0) goto L31
            r5 = 38
            r7.append(r5)
        L31:
            r7.append(r3)
            if (r4 == 0) goto L3e
            r3 = 61
            r7.append(r3)
            r7.append(r4)
        L3e:
            if (r1 == r2) goto L42
            int r1 = r1 + r0
            goto L1c
        L42:
            return
    }

    public static final int p(int r1, long r2) {
            int r0 = defpackage.s87.b
            int r1 = r1 * 15
            long r1 = r2 >> r1
            int r1 = (int) r1
            r1 = r1 & 32767(0x7fff, float:4.5916E-41)
            return r1
    }

    public static void q() {
            r0 = 0
            me.magnum.melonds.translator.capture.ScreenCaptureService.A = r0
            android.graphics.Bitmap r0 = me.magnum.melonds.translator.capture.ScreenCaptureService.d0     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto La
            r0.recycle()     // Catch: java.lang.Throwable -> L29
        La:
            r0 = 0
            me.magnum.melonds.translator.capture.ScreenCaptureService.d0 = r0     // Catch: java.lang.Throwable -> L29
            android.hardware.display.VirtualDisplay r1 = me.magnum.melonds.translator.capture.ScreenCaptureService.X     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L14
            r1.release()     // Catch: java.lang.Throwable -> L29
        L14:
            me.magnum.melonds.translator.capture.ScreenCaptureService.X = r0     // Catch: java.lang.Throwable -> L29
            android.media.ImageReader r1 = me.magnum.melonds.translator.capture.ScreenCaptureService.Y     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L1d
            r1.close()     // Catch: java.lang.Throwable -> L29
        L1d:
            me.magnum.melonds.translator.capture.ScreenCaptureService.Y = r0     // Catch: java.lang.Throwable -> L29
            android.media.projection.MediaProjection r1 = me.magnum.melonds.translator.capture.ScreenCaptureService.R     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L26
            r1.stop()     // Catch: java.lang.Throwable -> L29
        L26:
            me.magnum.melonds.translator.capture.ScreenCaptureService.R = r0     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r0 = move-exception
            java.lang.String r1 = "ScreenCaptureService"
            java.lang.String r2 = "Error cleaning up screen capture"
            android.util.Log.e(r1, r2, r0)
            return
    }

    public static defpackage.sb4 r(defpackage.rh r9, defpackage.ic4 r10, android.os.Bundle r11, defpackage.tt3 r12, defpackage.ac4 r13) {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r7 = r0.toString()
            r7.getClass()
            r10.getClass()
            r12.getClass()
            sb4 r1 = new sb4
            r8 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public static defpackage.pp4 s(int r17, int r18, defpackage.vs0 r19, defpackage.qp4 r20, defpackage.rp4 r21, defpackage.sp4 r22, defpackage.tp4 r23, android.util.Size r24, java.lang.String r25) {
            r0 = r18
            vs0 r1 = defpackage.vs0.m0
            r2 = r0 & 8
            if (r2 == 0) goto La
            r7 = r1
            goto Lc
        La:
            r7 = r19
        Lc:
            r2 = r0 & 64
            r3 = 0
            if (r2 == 0) goto L13
            r9 = r3
            goto L15
        L13:
            r9 = r20
        L15:
            r2 = r0 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L1b
            r10 = r3
            goto L1d
        L1b:
            r10 = r22
        L1d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L23
            r11 = r3
            goto L25
        L23:
            r11 = r23
        L25:
            r24.getClass()
            vs0 r0 = defpackage.vs0.o0
            yt1 r12 = defpackage.yt1.A
            if (r7 == r0) goto L5d
            vs0 r0 = defpackage.vs0.n0
            if (r7 == r0) goto L5d
            vs0 r0 = defpackage.vs0.q0
            if (r7 == r0) goto L3b
            vs0 r0 = defpackage.vs0.r0
            if (r7 == r0) goto L3b
            goto L42
        L3b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r0 < r2) goto L42
            goto L5d
        L42:
            if (r7 != r1) goto L57
            op4 r8 = new op4
            r13 = r9
            r14 = r10
            r15 = r11
            r16 = r12
            r10 = r17
            r12 = r21
            r9 = r24
            r11 = r25
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L57:
            java.lang.String r0 = "Check failed."
            defpackage.i.m(r0)
            return r3
        L5d:
            np4 r3 = new np4
            r5 = r17
            r8 = r21
            r4 = r24
            r6 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
    }

    public static android.graphics.Typeface t(java.lang.String r1, defpackage.oj2 r2, int r3) {
            if (r3 != 0) goto L15
            oj2 r0 = defpackage.oj2.Y
            boolean r0 = defpackage.nb3.k(r2, r0)
            if (r0 == 0) goto L15
            if (r1 == 0) goto L12
            int r0 = r1.length()
            if (r0 != 0) goto L15
        L12:
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            return r1
        L15:
            int r2 = defpackage.vy7.j0(r3, r2)
            if (r1 == 0) goto L27
            int r3 = r1.length()
            if (r3 != 0) goto L22
            goto L27
        L22:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r2)
            return r1
        L27:
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r2)
            return r1
    }

    public static android.graphics.Path u(float r1, float r2, float r3, float r4) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r0.moveTo(r1, r2)
            r0.lineTo(r3, r4)
            return r0
    }

    public static long v(int r3, int r4, int r5, int r6) {
            r3 = r3 & 32767(0x7fff, float:4.5916E-41)
            long r0 = (long) r3
            r3 = r4 & 32767(0x7fff, float:4.5916E-41)
            long r3 = (long) r3
            r2 = 15
            long r3 = r3 << r2
            long r3 = r3 | r0
            r5 = r5 & 32767(0x7fff, float:4.5916E-41)
            long r0 = (long) r5
            r5 = 30
            long r0 = r0 << r5
            long r3 = r3 | r0
            r5 = r6 & 32767(0x7fff, float:4.5916E-41)
            long r5 = (long) r5
            r0 = 45
            long r5 = r5 << r0
            long r3 = r3 | r5
            r5 = -9223372036854775808
            long r3 = r3 | r5
            return r3
    }

    @Override // defpackage.rs7
    public defpackage.d44 a(defpackage.c44 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.mo2
    public java.lang.Object apply(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    @Override // defpackage.rs7
    public void b(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.z31
    public long c(long r6, long r8) {
            r5 = this;
            r5 = 32
            long r0 = r6 >> r5
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r1 = r8 >> r5
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 > 0) goto L3f
            long r3 = r6 & r1
            int r0 = (int) r3
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r3 = r8 & r1
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L3f
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = java.lang.Float.floatToRawIntBits(r6)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r3 = (long) r6
            long r5 = r7 << r5
            long r7 = r3 & r1
            long r5 = r5 | r7
            int r7 = defpackage.a66.a
            return r5
        L3f:
            float r6 = defpackage.u24.d(r6, r8)
            int r7 = java.lang.Float.floatToRawIntBits(r6)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r3 = (long) r6
            long r5 = r7 << r5
            long r7 = r3 & r1
            long r5 = r5 | r7
            int r7 = defpackage.a66.a
            return r5
    }

    @Override // defpackage.eh6
    public defpackage.le2 d(defpackage.yt6 r3) {
            r2 = this;
            bf4 r2 = new bf4
            r0 = 0
            r1 = 19
            r2.<init>(r3, r0, r1)
            g21 r3 = new g21
            r0 = 7
            r3.<init>(r2, r0)
            return r3
    }

    @Override // defpackage.jy4
    public android.graphics.Typeface e(int r1, defpackage.oj2 r2) {
            r0 = this;
            r0 = 0
            android.graphics.Typeface r0 = t(r0, r2, r1)
            return r0
    }

    @Override // defpackage.x92
    public boolean f(defpackage.rc6 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.rs7
    public void g(defpackage.c44 r1, android.graphics.Bitmap r2, java.util.Map r3, int r4) {
            r0 = this;
            return
    }

    @Override // defpackage.t35
    public void h() {
            r1 = this;
            java.lang.String r1 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
            java.lang.String r0 = "ProfileInstaller"
            android.util.Log.d(r0, r1)
            return
    }

    @Override // defpackage.a15
    public java.lang.CharSequence i(androidx.preference.Preference r1) {
            r0 = this;
            androidx.preference.ListPreference r1 = (androidx.preference.ListPreference) r1
            java.lang.CharSequence r0 = r1.f()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L18
            android.content.Context r0 = r1.getContext()
            r1 = 2131952302(0x7f1302ae, float:1.9541043E38)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L18:
            java.lang.CharSequence r0 = r1.f()
            return r0
    }

    @Override // defpackage.t35
    public void j(int r3, java.lang.Object r4) {
            r2 = this;
            switch(r3) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                case 9: goto L3;
                case 10: goto L9;
                case 11: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r2 = ""
            goto L23
        L6:
            java.lang.String r2 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L23
        L9:
            java.lang.String r2 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L23
        Lc:
            java.lang.String r2 = "RESULT_PARSE_EXCEPTION"
            goto L23
        Lf:
            java.lang.String r2 = "RESULT_IO_EXCEPTION"
            goto L23
        L12:
            java.lang.String r2 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L23
        L15:
            java.lang.String r2 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L23
        L18:
            java.lang.String r2 = "RESULT_NOT_WRITABLE"
            goto L23
        L1b:
            java.lang.String r2 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L23
        L1e:
            java.lang.String r2 = "RESULT_ALREADY_INSTALLED"
            goto L23
        L21:
            java.lang.String r2 = "RESULT_INSTALL_SUCCESS"
        L23:
            r0 = 6
            java.lang.String r1 = "ProfileInstaller"
            if (r3 == r0) goto L33
            r0 = 7
            if (r3 == r0) goto L33
            r0 = 8
            if (r3 == r0) goto L33
            android.util.Log.d(r1, r2)
            return
        L33:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            android.util.Log.e(r1, r2, r4)
            return
    }

    @Override // defpackage.jy4
    public android.graphics.Typeface k(defpackage.sr2 r4, defpackage.oj2 r5, int r6) {
            r3 = this;
            java.lang.String r3 = r4.R
            int r0 = r5.A
            int r0 = r0 / 100
            r1 = 2
            if (r0 < 0) goto L12
            if (r0 >= r1) goto L12
            java.lang.String r0 = "-thin"
            java.lang.String r3 = r3.concat(r0)
            goto L3f
        L12:
            r2 = 4
            if (r1 > r0) goto L1e
            if (r0 >= r2) goto L1e
            java.lang.String r0 = "-light"
            java.lang.String r3 = r3.concat(r0)
            goto L3f
        L1e:
            if (r0 != r2) goto L21
            goto L3f
        L21:
            r1 = 5
            if (r0 != r1) goto L2b
            java.lang.String r0 = "-medium"
            java.lang.String r3 = r3.concat(r0)
            goto L3f
        L2b:
            r1 = 6
            r2 = 8
            if (r1 > r0) goto L33
            if (r0 >= r2) goto L33
            goto L3f
        L33:
            if (r2 > r0) goto L3f
            r1 = 11
            if (r0 >= r1) goto L3f
            java.lang.String r0 = "-black"
            java.lang.String r3 = r3.concat(r0)
        L3f:
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L47
            goto L66
        L47:
            android.graphics.Typeface r3 = t(r3, r5, r6)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            int r2 = defpackage.vy7.j0(r6, r5)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2)
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 != 0) goto L66
            android.graphics.Typeface r0 = t(r1, r5, r6)
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 != 0) goto L66
            r1 = r3
        L66:
            if (r1 != 0) goto L6f
            java.lang.String r3 = r4.R
            android.graphics.Typeface r3 = t(r3, r5, r6)
            return r3
        L6f:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 25: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = "SharingStarted.Lazily"
            return r1
    }
}
