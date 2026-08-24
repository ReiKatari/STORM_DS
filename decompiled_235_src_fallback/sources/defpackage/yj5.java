package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yj5  reason: default package */
/* loaded from: classes.dex */
public final class yj5 {
    public static final defpackage.yj5 a = null;

    static {
            yj5 r0 = new yj5
            r0.<init>()
            defpackage.yj5.a = r0
            return
    }

    public static java.lang.String a(int r7, int r8, int[] r9) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r7 <= 0) goto L99
            if (r8 <= 0) goto L99
            int r1 = r9.length
            if (r1 != 0) goto Le
            goto L99
        Le:
            vr4 r1 = new vr4
            r1.<init>(r0, r0)
            vr4 r2 = new vr4
            java.lang.String r3 = "tl"
            r2.<init>(r3, r1)
            int r1 = r7 / 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            vr4 r4 = new vr4
            r4.<init>(r3, r0)
            vr4 r0 = new vr4
            java.lang.String r3 = "tc"
            r0.<init>(r3, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r4 = r8 / 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            vr4 r5 = new vr4
            r5.<init>(r3, r4)
            vr4 r3 = new vr4
            java.lang.String r4 = "c"
            r3.<init>(r4, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r4 = r8 + (-1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            vr4 r6 = new vr4
            r6.<init>(r1, r5)
            vr4 r1 = new vr4
            java.lang.String r5 = "bc"
            r1.<init>(r5, r6)
            int r5 = r7 + (-1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            vr4 r6 = new vr4
            r6.<init>(r5, r4)
            vr4 r4 = new vr4
            java.lang.String r5 = "br"
            r4.<init>(r5, r6)
            vr4[] r0 = new defpackage.vr4[]{r2, r0, r3, r1, r4}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = 5
            int r2 = defpackage.c14.k0(r2)
            r1.<init>(r2)
            defpackage.c14.q0(r1, r0)
            java.util.Set r0 = r1.entrySet()
            r0.getClass()
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            u84 r5 = new u84
            r5.<init>(r7, r8, r9)
            r6 = 30
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            java.lang.String r7 = defpackage.gt0.P0(r1, r2, r3, r4, r5, r6)
            return r7
        L99:
            java.lang.String r7 = "none"
            return r7
    }

    public static java.lang.String b(int[] r5) {
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L28
            r3 = r5[r2]
            r4 = r3 & 255(0xff, float:3.57E-43)
            r0.update(r4)
            int r4 = r3 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0.update(r4)
            int r4 = r3 >>> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0.update(r4)
            int r3 = r3 >>> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.update(r3)
            int r2 = r2 + 1
            goto L7
        L28:
            long r0 = r0.getValue()
            java.lang.String r5 = g(r0)
            return r5
    }

    public static java.lang.String c(int r4, int r5, int[] r6) {
            java.lang.String r0 = "x"
            if (r6 == 0) goto L53
            int r1 = r6.length
            if (r1 != 0) goto L8
            goto L53
        L8:
            if (r4 <= 0) goto Lf
            if (r5 <= 0) goto Lf
            int r1 = r4 * r5
            goto L10
        Lf:
            r1 = -1
        L10:
            java.lang.String r2 = ":"
            if (r1 <= 0) goto L31
            int r3 = r6.length
            if (r1 != r3) goto L31
            int r6 = r6.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r1.append(r5)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r4 = r1.toString()
            return r4
        L31:
            int r6 = r6.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r4 = ":expected="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = r3.toString()
            return r4
        L53:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r0)
            r6.append(r5)
            java.lang.String r4 = ":empty"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            return r4
    }

    public static boolean f(int[] r0) {
            if (r0 == 0) goto L8
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto L8
        L6:
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static java.lang.String g(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            r2.getClass()
            r3 = 8
            java.lang.String r2 = defpackage.qs6.B0(r3, r2)
            java.util.Locale r3 = java.util.Locale.US
            r3.getClass()
            java.lang.String r2 = r2.toUpperCase(r3)
            r2.getClass()
            return r2
    }

    public static int h(int[] r1, int r2) {
            if (r1 == 0) goto Le
            int r1 = r1.length
            if (r1 <= 0) goto Le
            if (r2 <= 0) goto Le
            int r0 = r1 % r2
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            int r1 = r1 / r2
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static int i(int[] r3) {
            if (r3 == 0) goto L3f
            int r3 = r3.length
            if (r3 <= 0) goto L3f
            r0 = 49152(0xc000, float:6.8877E-41)
            int r1 = r3 % r0
            if (r1 == 0) goto Ld
            goto L3f
        Ld:
            int r3 = r3 / r0
            l93 r0 = new l93
            r1 = 16
            r2 = 1
            r0.<init>(r2, r1, r2)
            java.util.Iterator r0 = r0.iterator()
        L1a:
            r1 = r0
            k93 r1 = (defpackage.k93) r1
            boolean r1 = r1.L
            if (r1 == 0) goto L33
            r1 = r0
            e93 r1 = (defpackage.e93) r1
            java.lang.Object r1 = r1.next()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r2 = r2 * r2
            if (r2 != r3) goto L1a
            goto L34
        L33:
            r1 = 0
        L34:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L3f
            int r3 = r1.intValue()
            int r3 = r3 * 256
            return r3
        L3f:
            r3 = 0
            return r3
    }

    public static void j(java.lang.String r3, java.lang.String r4, boolean r5) {
            if (r5 == 0) goto L5
            java.lang.String r5 = "begin"
            goto L7
        L5:
            java.lang.String r5 = "end"
        L7:
            java.lang.String r0 = " step="
            java.lang.String r1 = " phase="
            java.lang.String r2 = "captureId="
            java.lang.StringBuilder r3 = defpackage.i61.u(r2, r3, r0, r4, r1)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "RendererDebugCapture"
            android.util.Log.w(r4, r3)
            return
    }

    public static void k(java.lang.String r17, java.lang.String r18, int r19, int r20, int[] r21) {
            r0 = r17
            r1 = r18
            r2 = r21
            java.lang.String r3 = " kind="
            java.lang.String r4 = "captureId="
            java.lang.String r5 = "RendererDebugCapture"
            if (r2 == 0) goto L94
            int r6 = r2.length
            if (r6 != 0) goto L13
            goto L94
        L13:
            int r6 = r2.length
            r8 = 0
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = 255(0xff, float:3.57E-43)
        L1c:
            if (r8 >= r6) goto L4a
            r15 = r2[r8]
            r16 = 16777215(0xffffff, float:2.3509886E-38)
            r7 = r15 & r16
            int r15 = r15 >>> 24
            r16 = r6
            r6 = 255(0xff, float:3.57E-43)
            r15 = r15 & r6
            if (r7 == 0) goto L30
            int r9 = r9 + 1
        L30:
            if (r15 == 0) goto L34
            int r10 = r10 + 1
        L34:
            if (r15 != r6) goto L38
            int r11 = r11 + 1
        L38:
            r6 = 16711935(0xff00ff, float:2.3418409E-38)
            if (r7 != r6) goto L3f
            int r12 = r12 + 1
        L3f:
            if (r15 >= r14) goto L42
            r14 = r15
        L42:
            if (r15 <= r13) goto L45
            r13 = r15
        L45:
            int r8 = r8 + 1
            r6 = r16
            goto L1c
        L4a:
            int r6 = r2.length
            java.lang.String r7 = b(r2)
            java.lang.String r2 = a(r19, r20, r21)
            java.lang.String r8 = " size="
            java.lang.StringBuilder r0 = defpackage.i61.u(r4, r0, r3, r1, r8)
            java.lang.String r1 = "x"
            java.lang.String r3 = " pixels="
            r4 = r19
            r8 = r20
            defpackage.lb1.x(r0, r4, r1, r8, r3)
            r0.append(r6)
            java.lang.String r1 = " crc32="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " nonBlack="
            r0.append(r1)
            java.lang.String r1 = " nonTransparent="
            java.lang.String r3 = " opaque="
            defpackage.lb1.x(r0, r9, r1, r10, r3)
            java.lang.String r1 = " magenta="
            java.lang.String r3 = " alphaRange="
            defpackage.lb1.x(r0, r11, r1, r12, r3)
            java.lang.String r1 = "-"
            java.lang.String r3 = " samples="
            defpackage.lb1.x(r0, r14, r1, r13, r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r5, r0)
            return
        L94:
            java.lang.String r2 = " unavailable=1"
            java.lang.String r0 = defpackage.lb1.n(r4, r0, r3, r1, r2)
            android.util.Log.w(r5, r0)
            return
    }

    public static void l(java.io.File r13, java.lang.String r14, java.lang.String r15, int r16, int r17, int[] r18) {
            r1 = r15
            r5 = r16
            r9 = r17
            r3 = r18
            java.lang.String r10 = " kind="
            java.lang.String r11 = "RendererDebugCapture"
            java.lang.String r12 = "captureId="
            if (r13 != 0) goto L11
            goto L97
        L11:
            if (r3 != 0) goto L15
            goto L97
        L15:
            if (r5 <= 0) goto L97
            if (r9 <= 0) goto L97
            int r0 = r3.length
            int r2 = r5 * r9
            if (r0 == r2) goto L20
            goto L97
        L20:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            java.lang.String r4 = "_"
            r2.append(r4)
            r2.append(r15)
            java.lang.String r4 = ".png"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.<init>(r13, r2)
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L83
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r5, r9, r13)     // Catch: java.lang.Exception -> L83
            r2.getClass()     // Catch: java.lang.Exception -> L83
            r6 = 0
            r7 = 0
            r4 = 0
            r8 = r16
            r2.setPixels(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L83
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L83
            r13.<init>(r0)     // Catch: java.lang.Exception -> L83
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L86
            r4 = 100
            r2.compress(r3, r4, r13)     // Catch: java.lang.Throwable -> L86
            r13.close()     // Catch: java.lang.Exception -> L83
            r2.recycle()     // Catch: java.lang.Exception -> L83
            java.lang.String r13 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L83
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L83
            r0.<init>(r12)     // Catch: java.lang.Exception -> L83
            r0.append(r14)     // Catch: java.lang.Exception -> L83
            r0.append(r10)     // Catch: java.lang.Exception -> L83
            r0.append(r15)     // Catch: java.lang.Exception -> L83
            java.lang.String r2 = " png="
            r0.append(r2)     // Catch: java.lang.Exception -> L83
            r0.append(r13)     // Catch: java.lang.Exception -> L83
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Exception -> L83
            android.util.Log.w(r11, r13)     // Catch: java.lang.Exception -> L83
            return
        L83:
            r0 = move-exception
            r13 = r0
            goto L8e
        L86:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            defpackage.ge7.t(r13, r2)     // Catch: java.lang.Exception -> L83
            throw r0     // Catch: java.lang.Exception -> L83
        L8e:
            java.lang.String r0 = " png_save_failed=1"
            java.lang.String r0 = defpackage.lb1.n(r12, r14, r10, r15, r0)
            android.util.Log.w(r11, r0, r13)
        L97:
            return
    }

    public static void m(java.io.File r5, java.lang.String r6, java.lang.String r7) {
            java.lang.String r0 = " kind=softPackedFrameMeta text="
            java.lang.String r1 = "RendererDebugCapture"
            java.lang.String r2 = "captureId="
            if (r5 != 0) goto L9
            goto L53
        L9:
            if (r7 == 0) goto L53
            boolean r3 = defpackage.qs6.v0(r7)
            if (r3 != 0) goto L12
            goto L13
        L12:
            r7 = 0
        L13:
            if (r7 != 0) goto L16
            goto L53
        L16:
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "_softPackedFrameMeta.json"
            java.lang.String r4 = r6.concat(r4)
            r3.<init>(r5, r4)
            defpackage.jc2.F0(r3, r7)     // Catch: java.lang.Exception -> L3e
            java.lang.String r5 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r7.<init>(r2)     // Catch: java.lang.Exception -> L3e
            r7.append(r6)     // Catch: java.lang.Exception -> L3e
            r7.append(r0)     // Catch: java.lang.Exception -> L3e
            r7.append(r5)     // Catch: java.lang.Exception -> L3e
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Exception -> L3e
            android.util.Log.w(r1, r5)     // Catch: java.lang.Exception -> L3e
            return
        L3e:
            r5 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r6 = " kind=softPackedFrameMeta text_save_failed=1"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.w(r1, r6, r5)
        L53:
            return
    }

    public static void n(java.io.File r7, java.lang.String r8, java.lang.String r9, int r10, int r11, int[] r12, defpackage.qn2 r13) {
            if (r7 == 0) goto L36
            if (r12 == 0) goto L36
            int r0 = r12.length
            if (r0 != 0) goto L8
            goto L36
        L8:
            if (r10 <= 0) goto L36
            if (r11 <= 0) goto L36
            int r0 = r12.length
            int r1 = r10 * r11
            if (r0 == r1) goto L12
            goto L36
        L12:
            int r0 = r12.length
            int[] r6 = new int[r0]
            int r0 = r12.length
            r1 = 0
        L17:
            if (r1 >= r0) goto L2e
            r2 = r12[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r13.g(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r6[r1] = r2
            int r1 = r1 + 1
            goto L17
        L2e:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            l(r1, r2, r3, r4, r5, r6)
        L36:
            return
    }

    public final java.io.Serializable d(me.magnum.melonds.domain.model.VideoRenderer r47, java.io.File r48, java.lang.String r49, int r50, int r51, long r52, java.util.Set r54, int r55, defpackage.mi5 r56, defpackage.s41 r57) {
            r46 = this;
            r0 = r50
            r1 = r51
            r2 = r55
            r3 = r56
            r4 = r57
            boolean r5 = r4 instanceof defpackage.wj5
            if (r5 == 0) goto L1d
            r5 = r4
            wj5 r5 = (defpackage.wj5) r5
            int r6 = r5.p0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1d
            int r6 = r6 - r7
            r5.p0 = r6
            goto L24
        L1d:
            wj5 r5 = new wj5
            r6 = r46
            r5.<init>(r6, r4)
        L24:
            java.lang.Object r4 = r5.n0
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r5.p0
            r8 = 2
            r10 = 1
            if (r7 == 0) goto L98
            if (r7 == r10) goto L72
            if (r7 != r8) goto L6a
            long r0 = r5.m0
            long r2 = r5.l0
            int r7 = r5.j0
            int r12 = r5.i0
            int r13 = r5.h0
            int r14 = r5.g0
            int r15 = r5.f0
            r47 = r12
            r46 = 0
            long r11 = r5.k0
            int r9 = r5.e0
            int r8 = r5.d0
            java.io.File r10 = r5.Z
            r48 = r0
            java.util.Set r0 = r5.Y
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r1 = r5.X
            r50 = r0
            me.magnum.melonds.domain.model.VideoRenderer r0 = r5.R
            defpackage.oi2.Y(r4)
            r4 = r47
            r20 = r48
            r18 = r11
            r11 = r13
            r12 = r0
            r13 = r1
            r1 = r6
            r6 = r14
            r0 = r50
            goto L238
        L6a:
            r46 = 0
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r46
        L72:
            r46 = 0
            int r0 = r5.j0
            int r1 = r5.i0
            int r2 = r5.h0
            int r3 = r5.g0
            int r7 = r5.f0
            long r8 = r5.k0
            int r10 = r5.e0
            int r11 = r5.d0
            java.io.File r12 = r5.Z
            java.util.Set r13 = r5.Y
            java.util.Set r13 = (java.util.Set) r13
            java.lang.String r14 = r5.X
            me.magnum.melonds.domain.model.VideoRenderer r15 = r5.R
            defpackage.oi2.Y(r4)
            r4 = r14
            r14 = r13
            r13 = r4
            r4 = r12
            r12 = r15
            goto L190
        L98:
            r46 = 0
            defpackage.oi2.Y(r4)
            r4 = 1
            if (r0 >= r4) goto La2
            r7 = r4
            goto La3
        La2:
            r7 = r0
        La3:
            if (r1 >= r4) goto La7
            r4 = 1
            goto La8
        La7:
            r4 = r1
        La8:
            if (r2 >= 0) goto Lac
            r8 = 0
            goto Lad
        Lac:
            r8 = r2
        Lad:
            boolean r9 = r54.isEmpty()
            if (r9 == 0) goto Lba
            vj5 r9 = defpackage.vj5.SCREEN_FRAME
            java.util.Set r9 = defpackage.ii2.R(r9)
            goto Lbc
        Lba:
            r9 = r54
        Lbc:
            vj5 r10 = defpackage.vj5.SCREEN_FRAME
            boolean r10 = r9.contains(r10)
            vj5 r11 = defpackage.vj5.PACKED_TOP_PRIMARY
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto Lcc
            r10 = r10 | 2
        Lcc:
            vj5 r11 = defpackage.vj5.PACKED_BOTTOM_PRIMARY
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto Ld6
            r10 = r10 | 4
        Ld6:
            vj5 r11 = defpackage.vj5.RENDERER3D_CAPTURE_FRAME
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto Le0
            r10 = r10 | 8
        Le0:
            vj5 r11 = defpackage.vj5.PACKED_TOP_PLANE1
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto Lea
            r10 = r10 | 16
        Lea:
            vj5 r11 = defpackage.vj5.PACKED_TOP_CONTROL
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto Lf4
            r10 = r10 | 32
        Lf4:
            vj5 r11 = defpackage.vj5.PACKED_BOTTOM_PLANE1
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto Lfe
            r10 = r10 | 64
        Lfe:
            vj5 r11 = defpackage.vj5.PACKED_BOTTOM_CONTROL
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto L108
            r10 = r10 | 128(0x80, float:1.8E-43)
        L108:
            vj5 r11 = defpackage.vj5.CAPTURE3D_SOURCE_DS_FRAME
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto L112
            r10 = r10 | 256(0x100, float:3.59E-43)
        L112:
            vj5 r11 = defpackage.vj5.CAPTURE_LINE_USES_3D_MASK
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto L11c
            r10 = r10 | 512(0x200, float:7.17E-43)
        L11c:
            vj5 r11 = defpackage.vj5.SOFT_PACKED_FRAME_META_JSON
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto L126
            r10 = r10 | 1024(0x400, float:1.435E-42)
        L126:
            vj5 r11 = defpackage.vj5.RENDERER3D_FRAME
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto L130
            r10 = r10 | 2048(0x800, float:2.87E-42)
        L130:
            if (r10 != 0) goto L133
            r10 = 1
        L133:
            if (r48 == 0) goto L142
            boolean r11 = r48.exists()
            if (r11 != 0) goto L145
            boolean r11 = r48.mkdirs()
            if (r11 == 0) goto L142
            goto L145
        L142:
            r11 = r46
            goto L147
        L145:
            r11 = r48
        L147:
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r12 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            r12.clearPreparedRendererSnapshot()
            r12.clearDenseScreenBurstCapture()
            r12.startDenseScreenBurstCapture(r7, r4, r8, r10)
            r12 = r47
            if (r3 == 0) goto L196
            r5.R = r12
            r13 = r49
            r5.X = r13
            r14 = r9
            java.util.Set r14 = (java.util.Set) r14
            r5.Y = r14
            r5.Z = r11
            r5.d0 = r0
            r5.e0 = r1
            r14 = r52
            r5.k0 = r14
            r5.f0 = r2
            r5.g0 = r7
            r5.h0 = r4
            r5.i0 = r8
            r5.j0 = r10
            r0 = 1
            r5.p0 = r0
            r3.g(r5)
            jg7 r0 = defpackage.jg7.a
            if (r0 != r6) goto L182
            r1 = r6
            goto L22f
        L182:
            r3 = r7
            r0 = r10
            r10 = r1
            r7 = r2
            r2 = r4
            r1 = r8
            r4 = r11
            r11 = r50
            r44 = r14
            r14 = r9
            r8 = r44
        L190:
            r44 = r4
            r4 = r2
            r2 = r44
            goto L1a7
        L196:
            r13 = r49
            r14 = r52
            r3 = r7
            r0 = r10
            r10 = r1
            r7 = r2
            r1 = r8
            r2 = r11
            r11 = r50
            r44 = r14
            r14 = r9
            r8 = r44
        L1a7:
            if (r1 <= 0) goto L1bb
            r48 = r2
            r47 = r3
            long r2 = (long) r1
            r18 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r18
            r18 = 24
            long r2 = r2 / r18
            r18 = 5000(0x1388, double:2.4703E-320)
            long r2 = r2 + r18
            goto L1c1
        L1bb:
            r48 = r2
            r47 = r3
            r2 = 0
        L1c1:
            long r18 = java.lang.System.nanoTime()
            r20 = 1
            int r15 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r15 >= 0) goto L1cc
            goto L1ce
        L1cc:
            r20 = r8
        L1ce:
            long r20 = r20 + r2
            r22 = 1000000(0xf4240, double:4.940656E-318)
            long r20 = r20 * r22
            long r20 = r20 + r18
            r53 = r7
            r7 = r0
            r0 = r53
            r18 = r6
            r53 = r14
            r6 = r47
            r14 = r8
            r9 = r10
            r8 = r11
            r10 = r48
            r11 = r4
            r4 = r1
        L1e9:
            r47 = r20
            long r19 = java.lang.System.nanoTime()
            int r1 = (r19 > r47 ? 1 : (r19 == r47 ? 0 : -1))
            if (r1 >= 0) goto L240
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r1 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            boolean r1 = r1.isDenseScreenBurstCaptureComplete()
            if (r1 == 0) goto L1fc
            goto L240
        L1fc:
            r5.R = r12
            r5.X = r13
            r1 = r53
            java.util.Set r1 = (java.util.Set) r1
            r5.Y = r1
            r5.Z = r10
            r5.d0 = r8
            r5.e0 = r9
            r5.k0 = r14
            r5.f0 = r0
            r5.g0 = r6
            r5.h0 = r11
            r5.i0 = r4
            r5.j0 = r7
            r5.l0 = r2
            r19 = r0
            r0 = r47
            r5.m0 = r0
            r20 = r0
            r0 = 2
            r5.p0 = r0
            r0 = 8
            java.lang.Object r0 = defpackage.q60.t(r0, r5)
            r1 = r18
            if (r0 != r1) goto L230
        L22f:
            return r1
        L230:
            r44 = r14
            r15 = r19
            r18 = r44
            r0 = r53
        L238:
            r53 = r0
            r0 = r15
            r14 = r18
            r18 = r1
            goto L1e9
        L240:
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r0 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r1 = r0.getDenseScreenBurstScheduleStats()
            r2 = -1
            if (r1 == 0) goto L255
            r3 = 0
            java.lang.Integer r5 = defpackage.fv.I0(r1, r3)
            if (r5 == 0) goto L255
            int r3 = r5.intValue()
            goto L256
        L255:
            r3 = r2
        L256:
            if (r1 == 0) goto L264
            r5 = 1
            java.lang.Integer r7 = defpackage.fv.I0(r1, r5)
            if (r7 == 0) goto L264
            int r5 = r7.intValue()
            goto L265
        L264:
            r5 = r2
        L265:
            if (r1 == 0) goto L273
            r7 = 2
            java.lang.Integer r8 = defpackage.fv.I0(r1, r7)
            if (r8 == 0) goto L273
            int r7 = r8.intValue()
            goto L274
        L273:
            r7 = r2
        L274:
            if (r1 == 0) goto L282
            r8 = 3
            java.lang.Integer r8 = defpackage.fv.I0(r1, r8)
            if (r8 == 0) goto L282
            int r8 = r8.intValue()
            goto L283
        L282:
            r8 = r2
        L283:
            r9 = 4
            if (r1 == 0) goto L290
            java.lang.Integer r1 = defpackage.fv.I0(r1, r9)
            if (r1 == 0) goto L290
            int r2 = r1.intValue()
        L290:
            if (r3 != r4) goto L296
            if (r5 < r4) goto L296
            r1 = 1
            goto L297
        L296:
            r1 = 0
        L297:
            boolean r4 = r0.isDenseScreenBurstCaptureComplete()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r14 = "captureId="
            r11.<init>(r14)
            r11.append(r13)
            java.lang.String r15 = " source=dense_burst stage=summary requestedWarmupFrames="
            r11.append(r15)
            r11.append(r3)
            java.lang.String r3 = " observedWarmupFrames="
            r11.append(r3)
            java.lang.String r3 = " eligibleCallbacks="
            java.lang.String r15 = " firstCaptureOrdinal="
            defpackage.lb1.x(r11, r5, r3, r7, r15)
            java.lang.String r3 = " lastCaptureOrdinal="
            java.lang.String r5 = " warmupSatisfied="
            defpackage.lb1.x(r11, r8, r3, r2, r5)
            r11.append(r1)
            java.lang.String r1 = " complete="
            r11.append(r1)
            r11.append(r4)
            java.lang.String r1 = r11.toString()
            java.lang.String r2 = "RendererDebugCapture"
            android.util.Log.w(r2, r1)
            int r0 = r0.getDenseScreenBurstCaptureFrameCount()
            if (r0 <= r6) goto L2db
            goto L2dc
        L2db:
            r6 = r0
        L2dc:
            kw3 r0 = defpackage.hf.I()
            r3 = 0
        L2e1:
            if (r3 >= r6) goto L8cf
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r1 = defpackage.qs6.B0(r9, r1)
            java.lang.String r4 = "_frame_"
            java.lang.String r1 = defpackage.lb1.m(r13, r4, r1)
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r4 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int r5 = r4.getDenseScreenBurstCaptureFrameId(r3)
            boolean r7 = r4.isCurrentFrameReadyForDebug()
            vj5 r8 = defpackage.vj5.SCREEN_FRAME
            r11 = r53
            boolean r15 = r11.contains(r8)
            if (r15 == 0) goto L30a
            int[] r15 = r4.getDenseScreenBurstCaptureFrame(r3)
            goto L30c
        L30a:
            r15 = r46
        L30c:
            vj5 r9 = defpackage.vj5.PACKED_TOP_PRIMARY
            boolean r18 = r11.contains(r9)
            if (r18 == 0) goto L31b
            int[] r18 = r4.getDenseScreenBurstPackedTopFrame(r3)
        L318:
            r19 = r6
            goto L31e
        L31b:
            r18 = r46
            goto L318
        L31e:
            vj5 r6 = defpackage.vj5.PACKED_BOTTOM_PRIMARY
            boolean r20 = r11.contains(r6)
            if (r20 == 0) goto L32d
            int[] r20 = r4.getDenseScreenBurstPackedBottomFrame(r3)
        L32a:
            r47 = r10
            goto L330
        L32d:
            r20 = r46
            goto L32a
        L330:
            vj5 r10 = defpackage.vj5.PACKED_TOP_PLANE1
            boolean r21 = r11.contains(r10)
            if (r21 == 0) goto L343
            r21 = r12
            r22 = r13
            r12 = 0
            r13 = 1
            int[] r23 = r4.getDenseScreenBurstPackedPlaneFrame(r3, r12, r13)
            goto L34a
        L343:
            r21 = r12
            r22 = r13
            r12 = 0
            r23 = r46
        L34a:
            vj5 r13 = defpackage.vj5.PACKED_TOP_CONTROL
            boolean r24 = r11.contains(r13)
            if (r24 == 0) goto L35a
            r52 = r15
            r15 = 2
            int[] r24 = r4.getDenseScreenBurstPackedPlaneFrame(r3, r12, r15)
            goto L35e
        L35a:
            r52 = r15
            r24 = r46
        L35e:
            vj5 r15 = defpackage.vj5.PACKED_BOTTOM_PLANE1
            boolean r25 = r11.contains(r15)
            if (r25 == 0) goto L36e
            r12 = 1
            int[] r17 = r4.getDenseScreenBurstPackedPlaneFrame(r3, r12, r12)
            r25 = r17
            goto L370
        L36e:
            r25 = r46
        L370:
            vj5 r12 = defpackage.vj5.PACKED_BOTTOM_CONTROL
            boolean r26 = r11.contains(r12)
            if (r26 == 0) goto L383
            r54 = r0
            r55 = r12
            r0 = 2
            r12 = 1
            int[] r16 = r4.getDenseScreenBurstPackedPlaneFrame(r3, r12, r0)
            goto L38a
        L383:
            r54 = r0
            r55 = r12
            r0 = 2
            r16 = r46
        L38a:
            vj5 r12 = defpackage.vj5.CAPTURE3D_SOURCE_DS_FRAME
            boolean r26 = r11.contains(r12)
            if (r26 == 0) goto L397
            int[] r26 = r4.getDenseScreenBurstCapture3dSourceFrame(r3)
            goto L399
        L397:
            r26 = r46
        L399:
            vj5 r0 = defpackage.vj5.CAPTURE_LINE_USES_3D_MASK
            boolean r27 = r11.contains(r0)
            if (r27 == 0) goto L3a8
            int[] r27 = r4.getDenseScreenBurstCaptureLineUses3dMaskFrame(r3)
        L3a5:
            r28 = r0
            goto L3ab
        L3a8:
            r27 = r46
            goto L3a5
        L3ab:
            vj5 r0 = defpackage.vj5.SOFT_PACKED_FRAME_META_JSON
            boolean r29 = r11.contains(r0)
            if (r29 == 0) goto L3bc
            java.lang.String r29 = r4.getDenseScreenBurstSoftPackedFrameMetaJson(r3)
            r30 = r29
        L3b9:
            r29 = r0
            goto L3bf
        L3bc:
            r30 = r46
            goto L3b9
        L3bf:
            vj5 r0 = defpackage.vj5.RENDERER3D_FRAME
            boolean r31 = r11.contains(r0)
            if (r31 == 0) goto L3ce
            int[] r31 = r4.getDenseScreenBurstRenderer3dFrame(r3)
        L3cb:
            r32 = r0
            goto L3d1
        L3ce:
            r31 = r46
            goto L3cb
        L3d1:
            vj5 r0 = defpackage.vj5.RENDERER3D_CAPTURE_FRAME
            boolean r33 = r11.contains(r0)
            if (r33 == 0) goto L3e0
            int[] r4 = r4.getDenseScreenBurstRenderer3dCaptureFrame(r3)
        L3dd:
            r33 = r3
            goto L3e3
        L3e0:
            r4 = r46
            goto L3dd
        L3e3:
            java.lang.String r3 = r21.name()
            r34 = r4
            java.util.Locale r4 = java.util.Locale.US
            r4.getClass()
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            r35 = r11
            java.lang.Iterable r35 = (java.lang.Iterable) r35
            dv4 r4 = new dv4
            r41 = r0
            r0 = 21
            r4.<init>(r0)
            r40 = 30
            java.lang.String r36 = ","
            r37 = 0
            r38 = 0
            r39 = r4
            java.lang.String r0 = defpackage.gt0.P0(r35, r36, r37, r38, r39, r40)
            java.lang.String r4 = " stage=begin configuredRenderer="
            r35 = r12
            java.lang.String r12 = " frameId="
            java.lang.StringBuilder r3 = defpackage.i61.u(r14, r1, r4, r3, r12)
            java.lang.String r4 = " frameReady="
            java.lang.String r12 = " freezeSnapshot=0 kinds="
            defpackage.lb1.x(r3, r5, r4, r7, r12)
            r3.append(r0)
            java.lang.String r0 = " source=dense_burst"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r2, r0)
            boolean r0 = r11.contains(r8)
            if (r0 == 0) goto L447
            r0 = 256(0x100, float:3.59E-43)
            r3 = 384(0x180, float:5.38E-43)
            java.lang.String r4 = "screenFrame"
            r50 = r0
            r48 = r1
            r51 = r3
            r49 = r4
            l(r47, r48, r49, r50, r51, r52)
        L447:
            r0 = r47
            r3 = r52
            boolean r4 = r11.contains(r9)
            if (r4 == 0) goto L469
            r4 = 256(0x100, float:3.59E-43)
            r5 = 192(0xc0, float:2.69E-43)
            java.lang.String r7 = "packedTopPrimary"
            r47 = r0
            r48 = r1
            r50 = r4
            r51 = r5
            r49 = r7
            r52 = r18
            l(r47, r48, r49, r50, r51, r52)
            r4 = r52
            goto L46b
        L469:
            r4 = r18
        L46b:
            boolean r5 = r11.contains(r6)
            if (r5 == 0) goto L489
            r5 = 256(0x100, float:3.59E-43)
            r7 = 192(0xc0, float:2.69E-43)
            java.lang.String r12 = "packedBottomPrimary"
            r47 = r0
            r48 = r1
            r50 = r5
            r51 = r7
            r49 = r12
            r52 = r20
            l(r47, r48, r49, r50, r51, r52)
            r5 = r52
            goto L48b
        L489:
            r5 = r20
        L48b:
            boolean r7 = r11.contains(r10)
            if (r7 == 0) goto L4a9
            r7 = 256(0x100, float:3.59E-43)
            r12 = 192(0xc0, float:2.69E-43)
            java.lang.String r18 = "packedTopPlane1"
            r47 = r0
            r48 = r1
            r50 = r7
            r51 = r12
            r49 = r18
            r52 = r23
            l(r47, r48, r49, r50, r51, r52)
            r7 = r52
            goto L4ab
        L4a9:
            r7 = r23
        L4ab:
            boolean r12 = r11.contains(r13)
            if (r12 == 0) goto L4c9
            r12 = 256(0x100, float:3.59E-43)
            r18 = 192(0xc0, float:2.69E-43)
            java.lang.String r20 = "packedTopControl"
            r47 = r0
            r48 = r1
            r50 = r12
            r51 = r18
            r49 = r20
            r52 = r24
            l(r47, r48, r49, r50, r51, r52)
            r12 = r52
            goto L4cb
        L4c9:
            r12 = r24
        L4cb:
            boolean r18 = r11.contains(r15)
            if (r18 == 0) goto L4eb
            r18 = 256(0x100, float:3.59E-43)
            r20 = 192(0xc0, float:2.69E-43)
            java.lang.String r23 = "packedBottomPlane1"
            r47 = r0
            r48 = r1
            r50 = r18
            r51 = r20
            r49 = r23
            r52 = r25
            l(r47, r48, r49, r50, r51, r52)
            r0 = r52
        L4e8:
            r1 = r55
            goto L4f2
        L4eb:
            r47 = r0
            r0 = r25
            r48 = r1
            goto L4e8
        L4f2:
            boolean r18 = r11.contains(r1)
            if (r18 == 0) goto L516
            r18 = 256(0x100, float:3.59E-43)
            r20 = 192(0xc0, float:2.69E-43)
            java.lang.String r23 = "packedBottomControl"
            r52 = r16
            r50 = r18
            r51 = r20
            r49 = r23
            l(r47, r48, r49, r50, r51, r52)
            r55 = r1
            r1 = r52
            r16 = r47
            r18 = r48
        L511:
            r20 = r15
            r15 = r35
            goto L51f
        L516:
            r55 = r1
            r1 = r16
            r18 = r48
            r16 = r47
            goto L511
        L51f:
            boolean r23 = r11.contains(r15)
            if (r23 == 0) goto L543
            r23 = 256(0x100, float:3.59E-43)
            r24 = 192(0xc0, float:2.69E-43)
            java.lang.String r25 = "capture3dSourceDsFrame"
            r47 = r16
            r48 = r18
            r50 = r23
            r51 = r24
            r49 = r25
            r52 = r26
            l(r47, r48, r49, r50, r51, r52)
            r35 = r15
            r15 = r52
        L53e:
            r23 = r13
            r13 = r28
            goto L548
        L543:
            r35 = r15
            r15 = r26
            goto L53e
        L548:
            boolean r24 = r11.contains(r13)
            if (r24 == 0) goto L56c
            r24 = 256(0x100, float:3.59E-43)
            r25 = 192(0xc0, float:2.69E-43)
            java.lang.String r26 = "captureLineUses3dMask"
            r47 = r16
            r48 = r18
            r50 = r24
            r51 = r25
            r49 = r26
            r52 = r27
            l(r47, r48, r49, r50, r51, r52)
            r28 = r13
            r13 = r52
        L567:
            r24 = r10
            r10 = r41
            goto L571
        L56c:
            r28 = r13
            r13 = r27
            goto L567
        L571:
            boolean r25 = r11.contains(r10)
            if (r25 == 0) goto L59d
            r25 = 256(0x100, float:3.59E-43)
            r26 = 192(0xc0, float:2.69E-43)
            java.lang.String r27 = "renderer3dCaptureFrame"
            r47 = r16
            r48 = r18
            r50 = r25
            r51 = r26
            r49 = r27
            r52 = r34
            l(r47, r48, r49, r50, r51, r52)
            r16 = r6
            r18 = r9
            r41 = r10
            r10 = r47
            r6 = r48
            r9 = r52
        L598:
            r25 = r8
            r8 = r29
            goto L5aa
        L59d:
            r41 = r10
            r10 = r16
            r16 = r6
            r6 = r18
            r18 = r9
            r9 = r34
            goto L598
        L5aa:
            boolean r26 = r11.contains(r8)
            if (r26 == 0) goto L601
            r29 = r8
            r8 = r30
            m(r10, r6, r8)
            if (r8 == 0) goto L5c7
            boolean r26 = defpackage.qs6.v0(r8)
            if (r26 == 0) goto L5c0
            goto L5c7
        L5c0:
            r17 = 0
        L5c2:
            r27 = r8
            r26 = 1
            goto L5ca
        L5c7:
            r17 = 1
            goto L5c2
        L5ca:
            r8 = r17 ^ 1
            if (r27 == 0) goto L5d9
            int r26 = r27.length()
            r47 = r10
            r10 = r26
        L5d6:
            r34 = r9
            goto L5dd
        L5d9:
            r47 = r10
            r10 = 0
            goto L5d6
        L5dd:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r14)
            r9.append(r6)
            r48 = r6
            java.lang.String r6 = " kind=softPackedFrameMetaJson available="
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = " length="
            r9.append(r6)
            r9.append(r10)
            java.lang.String r6 = r9.toString()
            android.util.Log.w(r2, r6)
        L5fe:
            r6 = r32
            goto L60c
        L601:
            r48 = r6
            r29 = r8
            r34 = r9
            r47 = r10
            r27 = r30
            goto L5fe
        L60c:
            boolean r8 = r11.contains(r6)
            if (r8 == 0) goto L62c
            int r8 = i(r31)
            r9 = r31
            int r10 = h(r9, r8)
            java.lang.String r26 = "renderer3dFrame"
            r50 = r8
            r52 = r9
            r51 = r10
            r49 = r26
            l(r47, r48, r49, r50, r51, r52)
        L629:
            r8 = r48
            goto L62f
        L62c:
            r9 = r31
            goto L629
        L62f:
            r10 = 256(0x100, float:3.59E-43)
            r32 = r6
            r6 = 384(0x180, float:5.38E-43)
            r26 = r11
            java.lang.String r11 = c(r10, r6, r3)
            r6 = 192(0xc0, float:2.69E-43)
            r52 = r3
            java.lang.String r3 = c(r10, r6, r4)
            r30 = r4
            java.lang.String r4 = c(r10, r6, r5)
            r31 = r5
            java.lang.String r5 = c(r10, r6, r7)
            r36 = r7
            java.lang.String r7 = c(r10, r6, r12)
            r37 = r12
            java.lang.String r12 = c(r10, r6, r0)
            r38 = r0
            java.lang.String r0 = c(r10, r6, r1)
            r39 = r1
            java.lang.String r1 = c(r10, r6, r15)
            r40 = r15
            java.lang.String r15 = c(r10, r6, r13)
            if (r27 == 0) goto L67b
            boolean r42 = defpackage.qs6.v0(r27)
            if (r42 == 0) goto L676
            goto L67b
        L676:
            r17 = 0
        L678:
            r42 = 1
            goto L67e
        L67b:
            r17 = 1
            goto L678
        L67e:
            r6 = r17 ^ 1
            int r10 = i(r9)
            r17 = r13
            int r13 = i(r9)
            int r13 = h(r9, r13)
            java.lang.String r10 = c(r10, r13, r9)
            r51 = r9
            r43 = r10
            r13 = r34
            r9 = 192(0xc0, float:2.69E-43)
            r34 = r2
            r2 = 256(0x100, float:3.59E-43)
            java.lang.String r10 = c(r2, r9, r13)
            java.lang.String r2 = " kind=meta screen="
            java.lang.String r9 = " packedTop="
            java.lang.StringBuilder r2 = defpackage.i61.u(r14, r8, r2, r11, r9)
            java.lang.String r9 = " packedBottom="
            java.lang.String r11 = " packedTopPlane1="
            defpackage.i61.B(r2, r3, r9, r4, r11)
            java.lang.String r3 = " packedTopControl="
            java.lang.String r4 = " packedBottomPlane1="
            defpackage.i61.B(r2, r5, r3, r7, r4)
            java.lang.String r3 = " packedBottomControl="
            java.lang.String r4 = " capture3dSource="
            defpackage.i61.B(r2, r12, r3, r0, r4)
            java.lang.String r0 = " captureLineMask="
            java.lang.String r3 = " softPackedMeta="
            defpackage.i61.B(r2, r1, r0, r15, r3)
            r2.append(r6)
            java.lang.String r0 = " renderer3d="
            r2.append(r0)
            r0 = r43
            r2.append(r0)
            java.lang.String r0 = " renderer3dCapture="
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = " depth=0x0:empty attr=0x0:empty coverage=0x0:empty"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = r34
            android.util.Log.w(r1, r0)
            r0 = r25
            r11 = r26
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto L701
            java.lang.String r2 = "screenFrame"
            r3 = r52
            r4 = 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            k(r8, r2, r5, r4, r3)
        L6fe:
            r2 = r18
            goto L706
        L701:
            r3 = r52
            r5 = 256(0x100, float:3.59E-43)
            goto L6fe
        L706:
            boolean r4 = r11.contains(r2)
            if (r4 == 0) goto L718
            java.lang.String r4 = "packedTopPrimary"
            r6 = r30
            r9 = 192(0xc0, float:2.69E-43)
            k(r8, r4, r5, r9, r6)
        L715:
            r4 = r16
            goto L71d
        L718:
            r6 = r30
            r9 = 192(0xc0, float:2.69E-43)
            goto L715
        L71d:
            boolean r7 = r11.contains(r4)
            if (r7 == 0) goto L72d
            java.lang.String r7 = "packedBottomPrimary"
            r10 = r31
            k(r8, r7, r5, r9, r10)
        L72a:
            r7 = r24
            goto L730
        L72d:
            r10 = r31
            goto L72a
        L730:
            boolean r12 = r11.contains(r7)
            if (r12 == 0) goto L740
            java.lang.String r12 = "packedTopPlane1"
            r15 = r36
            k(r8, r12, r5, r9, r15)
        L73d:
            r12 = r23
            goto L743
        L740:
            r15 = r36
            goto L73d
        L743:
            boolean r16 = r11.contains(r12)
            r52 = r3
            if (r16 == 0) goto L757
            java.lang.String r3 = "packedTopControl"
            r30 = r6
            r6 = r37
            k(r8, r3, r5, r9, r6)
        L754:
            r3 = r20
            goto L75c
        L757:
            r30 = r6
            r6 = r37
            goto L754
        L75c:
            boolean r16 = r11.contains(r3)
            r37 = r6
            if (r16 == 0) goto L770
            java.lang.String r6 = "packedBottomPlane1"
            r31 = r10
            r10 = r38
            k(r8, r6, r5, r9, r10)
        L76d:
            r6 = r55
            goto L775
        L770:
            r31 = r10
            r10 = r38
            goto L76d
        L775:
            boolean r16 = r11.contains(r6)
            r38 = r10
            if (r16 == 0) goto L789
            java.lang.String r10 = "packedBottomControl"
            r36 = r15
            r15 = r39
            k(r8, r10, r5, r9, r15)
        L786:
            r10 = r35
            goto L78e
        L789:
            r36 = r15
            r15 = r39
            goto L786
        L78e:
            boolean r16 = r11.contains(r10)
            if (r16 == 0) goto L7a2
            r39 = r15
            java.lang.String r15 = "capture3dSourceDsFrame"
            r34 = r1
            r1 = r40
            k(r8, r15, r5, r9, r1)
        L79f:
            r15 = r28
            goto L7a9
        L7a2:
            r34 = r1
            r39 = r15
            r1 = r40
            goto L79f
        L7a9:
            boolean r16 = r11.contains(r15)
            r40 = r1
            if (r16 == 0) goto L7bd
            java.lang.String r1 = "captureLineUses3dMask"
            r48 = r14
            r14 = r17
            k(r8, r1, r5, r9, r14)
        L7ba:
            r1 = r32
            goto L7c2
        L7bd:
            r48 = r14
            r14 = r17
            goto L7ba
        L7c2:
            boolean r5 = r11.contains(r1)
            if (r5 == 0) goto L7de
            int r5 = i(r51)
            java.lang.String r9 = "renderer3dFrame"
            r32 = r1
            r17 = r14
            r14 = r51
            int r1 = h(r14, r5)
            k(r8, r9, r5, r1, r14)
        L7db:
            r1 = r41
            goto L7e5
        L7de:
            r32 = r1
            r17 = r14
            r14 = r51
            goto L7db
        L7e5:
            boolean r5 = r11.contains(r1)
            if (r5 == 0) goto L7f7
            java.lang.String r5 = "renderer3dCaptureFrame"
            r51 = r14
            r9 = 192(0xc0, float:2.69E-43)
            r14 = 256(0x100, float:3.59E-43)
            k(r8, r5, r14, r9, r13)
            goto L7f9
        L7f7:
            r51 = r14
        L7f9:
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L805
            boolean r0 = f(r52)
            if (r0 == 0) goto L891
        L805:
            boolean r0 = r11.contains(r2)
            if (r0 == 0) goto L811
            boolean r0 = f(r30)
            if (r0 == 0) goto L891
        L811:
            boolean r0 = r11.contains(r4)
            if (r0 == 0) goto L81d
            boolean r0 = f(r31)
            if (r0 == 0) goto L891
        L81d:
            boolean r0 = r11.contains(r7)
            if (r0 == 0) goto L829
            boolean r0 = f(r36)
            if (r0 == 0) goto L891
        L829:
            boolean r0 = r11.contains(r12)
            if (r0 == 0) goto L835
            boolean r0 = f(r37)
            if (r0 == 0) goto L891
        L835:
            boolean r0 = r11.contains(r3)
            if (r0 == 0) goto L841
            boolean r0 = f(r38)
            if (r0 == 0) goto L891
        L841:
            boolean r0 = r11.contains(r6)
            if (r0 == 0) goto L84d
            boolean r0 = f(r39)
            if (r0 == 0) goto L891
        L84d:
            boolean r0 = r11.contains(r10)
            if (r0 == 0) goto L859
            boolean r0 = f(r40)
            if (r0 == 0) goto L891
        L859:
            boolean r0 = r11.contains(r15)
            if (r0 == 0) goto L865
            boolean r0 = f(r17)
            if (r0 == 0) goto L891
        L865:
            r0 = r29
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L876
            if (r27 == 0) goto L891
            boolean r0 = defpackage.qs6.v0(r27)
            if (r0 == 0) goto L876
            goto L891
        L876:
            r6 = r32
            boolean r0 = r11.contains(r6)
            if (r0 == 0) goto L884
            boolean r0 = f(r51)
            if (r0 == 0) goto L891
        L884:
            boolean r0 = r11.contains(r1)
            if (r0 == 0) goto L893
            boolean r0 = f(r13)
            if (r0 == 0) goto L891
            goto L893
        L891:
            r4 = 0
            goto L895
        L893:
            r4 = r42
        L895:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r48
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r2 = " stage=end success="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2 = r34
            android.util.Log.w(r2, r0)
            ak5 r0 = new ak5
            r10 = r47
            r0.<init>(r10, r8, r4)
            r3 = r54
            r3.add(r0)
            int r0 = r33 + 1
            r53 = r3
            r3 = r0
            r0 = r53
            r14 = r1
            r53 = r11
            r6 = r19
            r12 = r21
            r13 = r22
            r9 = 4
            goto L2e1
        L8cf:
            r3 = r0
            kw3 r0 = defpackage.hf.A(r3)
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r1 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            r1.clearDenseScreenBurstCapture()
            return r0
    }

    public final defpackage.ak5 e(me.magnum.melonds.domain.model.VideoRenderer r78, java.io.File r79, java.lang.String r80, java.util.Set r81) {
            r77 = this;
            r78.getClass()
            r81.getClass()
            boolean r0 = r81.isEmpty()
            if (r0 == 0) goto L16
            uj5 r0 = defpackage.vj5.Companion
            r0.getClass()
            java.util.Set r0 = defpackage.vj5.access$getAllKinds$cp()
            goto L18
        L16:
            r0 = r81
        L18:
            if (r80 != 0) goto L24
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.Long.toHexString(r1)
            r3 = r1
            goto L26
        L24:
            r3 = r80
        L26:
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r1 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int r2 = r1.getCurrentFrameIndexForDebug()
            boolean r4 = r1.isCurrentFrameReadyForDebug()
            java.lang.String r5 = r78.name()
            java.util.Locale r6 = java.util.Locale.US
            r6.getClass()
            java.lang.String r5 = r5.toLowerCase(r6)
            r5.getClass()
            r6 = r0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            dv4 r10 = new dv4
            r7 = 20
            r10.<init>(r7)
            r11 = 30
            java.lang.String r7 = ","
            r8 = 0
            r9 = 0
            java.lang.String r6 = defpackage.gt0.P0(r6, r7, r8, r9, r10, r11)
            java.lang.String r7 = " stage=begin configuredRenderer="
            java.lang.String r8 = " frameId="
            java.lang.String r9 = "captureId="
            java.lang.StringBuilder r5 = defpackage.i61.u(r9, r3, r7, r5, r8)
            java.lang.String r7 = " frameReady="
            java.lang.String r8 = " freezeSnapshot=1 kinds="
            defpackage.lb1.x(r5, r2, r7, r4, r8)
            r5.append(r6)
            java.lang.String r2 = r5.toString()
            java.lang.String r10 = "RendererDebugCapture"
            android.util.Log.w(r10, r2)
            r1.dumpCurrentRendererSnapshot()
            vj5 r2 = defpackage.vj5.SCREEN_FRAME
            boolean r2 = r0.contains(r2)
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L8f
            r3.getClass()
            java.lang.String r2 = "captureCurrentFrame"
            j(r3, r2, r11)
            int[] r5 = r1.captureCurrentFrame()
            j(r3, r2, r12)
            r7 = r5
            goto L90
        L8f:
            r7 = 0
        L90:
            vj5 r2 = defpackage.vj5.PACKED_TOP_PRIMARY
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto La9
            r3.getClass()
            java.lang.String r2 = "captureCurrentPackedTopPrimary"
            j(r3, r2, r11)
            int[] r5 = r1.captureCurrentPackedTopPrimary()
            j(r3, r2, r12)
            r8 = r5
            goto Laa
        La9:
            r8 = 0
        Laa:
            vj5 r2 = defpackage.vj5.PACKED_BOTTOM_PRIMARY
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lc3
            r3.getClass()
            java.lang.String r2 = "captureCurrentPackedBottomPrimary"
            j(r3, r2, r11)
            int[] r5 = r1.captureCurrentPackedBottomPrimary()
            j(r3, r2, r12)
            r13 = r5
            goto Lc4
        Lc3:
            r13 = 0
        Lc4:
            vj5 r2 = defpackage.vj5.PACKED_TOP_PLANE1
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Ldd
            r3.getClass()
            java.lang.String r2 = "captureCurrentPackedPlane(top,1)"
            j(r3, r2, r11)
            int[] r5 = r1.captureCurrentPackedPlane(r12, r11)
            j(r3, r2, r12)
            r14 = r5
            goto Lde
        Ldd:
            r14 = 0
        Lde:
            vj5 r2 = defpackage.vj5.PACKED_TOP_CONTROL
            boolean r2 = r0.contains(r2)
            r5 = 2
            if (r2 == 0) goto Lf8
            r3.getClass()
            java.lang.String r2 = "captureCurrentPackedPlane(top,2)"
            j(r3, r2, r11)
            int[] r6 = r1.captureCurrentPackedPlane(r12, r5)
            j(r3, r2, r12)
            r15 = r6
            goto Lf9
        Lf8:
            r15 = 0
        Lf9:
            vj5 r2 = defpackage.vj5.PACKED_BOTTOM_PLANE1
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L113
            r3.getClass()
            java.lang.String r2 = "captureCurrentPackedPlane(bottom,1)"
            j(r3, r2, r11)
            int[] r6 = r1.captureCurrentPackedPlane(r11, r11)
            j(r3, r2, r12)
            r16 = r6
            goto L115
        L113:
            r16 = 0
        L115:
            vj5 r2 = defpackage.vj5.PACKED_BOTTOM_CONTROL
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L12f
            r3.getClass()
            java.lang.String r2 = "captureCurrentPackedPlane(bottom,2)"
            j(r3, r2, r11)
            int[] r5 = r1.captureCurrentPackedPlane(r11, r5)
            j(r3, r2, r12)
            r17 = r5
            goto L131
        L12f:
            r17 = 0
        L131:
            vj5 r2 = defpackage.vj5.CAPTURE3D_SOURCE_DS_FRAME
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L14b
            r3.getClass()
            java.lang.String r2 = "captureCurrentCapture3dSource"
            j(r3, r2, r11)
            int[] r5 = r1.captureCurrentCapture3dSource()
            j(r3, r2, r12)
            r18 = r5
            goto L14d
        L14b:
            r18 = 0
        L14d:
            vj5 r2 = defpackage.vj5.CAPTURE_LINE_USES_3D_MASK
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L167
            r3.getClass()
            java.lang.String r2 = "captureCurrentCaptureLineUses3dMask"
            j(r3, r2, r11)
            int[] r5 = r1.captureCurrentCaptureLineUses3dMask()
            j(r3, r2, r12)
            r19 = r5
            goto L169
        L167:
            r19 = 0
        L169:
            vj5 r2 = defpackage.vj5.COMP4_TOP_PLACEHOLDER
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L183
            r3.getClass()
            java.lang.String r2 = "captureCurrentComp4TopPlaceholder"
            j(r3, r2, r11)
            int[] r5 = r1.captureCurrentComp4TopPlaceholder()
            j(r3, r2, r12)
            r20 = r5
            goto L185
        L183:
            r20 = 0
        L185:
            vj5 r2 = defpackage.vj5.COMP4_BOTTOM_PLACEHOLDER
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L19f
            r3.getClass()
            java.lang.String r2 = "captureCurrentComp4BottomPlaceholder"
            j(r3, r2, r11)
            int[] r5 = r1.captureCurrentComp4BottomPlaceholder()
            j(r3, r2, r12)
            r21 = r5
            goto L1a1
        L19f:
            r21 = 0
        L1a1:
            vj5 r2 = defpackage.vj5.CAPTURE_FALLBACK_MASK
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L1bb
            r3.getClass()
            java.lang.String r2 = "captureCurrentCaptureFallbackMask"
            j(r3, r2, r11)
            int[] r5 = r1.captureCurrentCaptureFallbackMask()
            j(r3, r2, r12)
            r22 = r5
            goto L1bd
        L1bb:
            r22 = 0
        L1bd:
            vj5 r2 = defpackage.vj5.SOFT_PACKED_FRAME_META_JSON
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L1d5
            r3.getClass()
            java.lang.String r2 = "captureCurrentSoftPackedFrameMetaJson"
            j(r3, r2, r11)
            java.lang.String r5 = r1.captureCurrentSoftPackedFrameMetaJson()
            j(r3, r2, r12)
            goto L1d6
        L1d5:
            r5 = 0
        L1d6:
            vj5 r2 = defpackage.vj5.COMPOSITED_FRAME
            boolean r6 = r0.contains(r2)
            if (r6 == 0) goto L1f0
            r3.getClass()
            java.lang.String r6 = "captureCurrentCompositedDimensions"
            j(r3, r6, r11)
            int[] r23 = r1.captureCurrentCompositedDimensions()
            j(r3, r6, r12)
            r6 = r23
            goto L1f1
        L1f0:
            r6 = 0
        L1f1:
            if (r6 == 0) goto L1fe
            java.lang.Integer r23 = defpackage.fv.I0(r6, r12)
            if (r23 == 0) goto L1fe
            int r23 = r23.intValue()
            goto L200
        L1fe:
            r23 = r12
        L200:
            if (r6 == 0) goto L20f
            java.lang.Integer r6 = defpackage.fv.I0(r6, r11)
            if (r6 == 0) goto L20f
            int r6 = r6.intValue()
            r24 = r6
            goto L211
        L20f:
            r24 = r12
        L211:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L227
            r3.getClass()
            java.lang.String r2 = "captureCurrentCompositedFrame"
            j(r3, r2, r11)
            int[] r1 = r1.captureCurrentCompositedFrame()
            j(r3, r2, r12)
            goto L228
        L227:
            r1 = 0
        L228:
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r6 = r2 instanceof java.util.Collection
            if (r6 == 0) goto L23a
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L23a
        L238:
            r2 = r12
            goto L25f
        L23a:
            java.util.Iterator r2 = r2.iterator()
        L23e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L238
            java.lang.Object r6 = r2.next()
            vj5 r6 = (defpackage.vj5) r6
            vj5 r4 = defpackage.vj5.RENDERER3D_FRAME
            if (r6 == r4) goto L25e
            vj5 r4 = defpackage.vj5.RENDERER3D_CAPTURE_FRAME
            if (r6 == r4) goto L25e
            vj5 r4 = defpackage.vj5.RENDERER3D_DEPTH
            if (r6 == r4) goto L25e
            vj5 r4 = defpackage.vj5.RENDERER3D_ATTR
            if (r6 == r4) goto L25e
            vj5 r4 = defpackage.vj5.RENDERER3D_COVERAGE
            if (r6 != r4) goto L23e
        L25e:
            r2 = r11
        L25f:
            if (r2 == 0) goto L273
            r3.getClass()
            java.lang.String r4 = "captureCurrent3dDimensions"
            j(r3, r4, r11)
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r6 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r6 = r6.captureCurrent3dDimensions()
            j(r3, r4, r12)
            goto L274
        L273:
            r6 = 0
        L274:
            if (r6 == 0) goto L283
            java.lang.Integer r4 = defpackage.fv.I0(r6, r12)
            if (r4 == 0) goto L283
            int r4 = r4.intValue()
            r25 = r4
            goto L285
        L283:
            r25 = r12
        L285:
            if (r6 == 0) goto L294
            java.lang.Integer r4 = defpackage.fv.I0(r6, r11)
            if (r4 == 0) goto L294
            int r4 = r4.intValue()
            r26 = r4
            goto L296
        L294:
            r26 = r12
        L296:
            if (r2 == 0) goto L2b4
            vj5 r4 = defpackage.vj5.RENDERER3D_FRAME
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L2b4
            r3.getClass()
            java.lang.String r4 = "captureCurrent3dFrame"
            j(r3, r4, r11)
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r6 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r6 = r6.captureCurrent3dFrame()
            j(r3, r4, r12)
            r27 = r6
            goto L2b6
        L2b4:
            r27 = 0
        L2b6:
            if (r2 == 0) goto L2d4
            vj5 r4 = defpackage.vj5.RENDERER3D_CAPTURE_FRAME
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L2d4
            r3.getClass()
            java.lang.String r4 = "captureCurrent3dCaptureFrame"
            j(r3, r4, r11)
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r6 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r6 = r6.captureCurrent3dCaptureFrame()
            j(r3, r4, r12)
            r28 = r6
            goto L2d6
        L2d4:
            r28 = 0
        L2d6:
            if (r2 == 0) goto L2f4
            vj5 r4 = defpackage.vj5.RENDERER3D_DEPTH
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L2f4
            r3.getClass()
            java.lang.String r4 = "captureCurrent3dDepth"
            j(r3, r4, r11)
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r6 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r6 = r6.captureCurrent3dDepth()
            j(r3, r4, r12)
            r29 = r6
            goto L2f6
        L2f4:
            r29 = 0
        L2f6:
            if (r2 == 0) goto L314
            vj5 r4 = defpackage.vj5.RENDERER3D_ATTR
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L314
            r3.getClass()
            java.lang.String r4 = "captureCurrent3dAttributes"
            j(r3, r4, r11)
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r6 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r6 = r6.captureCurrent3dAttributes()
            j(r3, r4, r12)
            r30 = r6
            goto L316
        L314:
            r30 = 0
        L316:
            if (r2 == 0) goto L334
            vj5 r2 = defpackage.vj5.RENDERER3D_COVERAGE
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L334
            r3.getClass()
            java.lang.String r2 = "captureCurrent3dCoverage"
            j(r3, r2, r11)
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r4 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r4 = r4.captureCurrent3dCoverage()
            j(r3, r2, r12)
            r31 = r4
            goto L336
        L334:
            r31 = 0
        L336:
            if (r79 == 0) goto L345
            boolean r2 = r79.exists()
            if (r2 != 0) goto L347
            boolean r2 = r79.mkdirs()
            if (r2 == 0) goto L345
            goto L347
        L345:
            r2 = 0
            goto L349
        L347:
            r2 = r79
        L349:
            vj5 r4 = defpackage.vj5.SCREEN_FRAME
            boolean r6 = r0.contains(r4)
            if (r6 == 0) goto L369
            r3.getClass()
            r6 = r5
            r5 = 256(0x100, float:3.59E-43)
            r32 = r6
            r6 = 384(0x180, float:5.38E-43)
            r33 = r4
            java.lang.String r4 = "screenFrame"
            r80 = r11
            r12 = r32
            r11 = r33
            l(r2, r3, r4, r5, r6, r7)
            goto L36d
        L369:
            r12 = r5
            r80 = r11
            r11 = r4
        L36d:
            vj5 r4 = defpackage.vj5.PACKED_TOP_PRIMARY
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L38d
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r32 = r4
            java.lang.String r4 = "packedTopPrimary"
            r81 = r8
            r8 = r7
            r7 = r81
            r81 = r1
            r1 = r32
            l(r2, r3, r4, r5, r6, r7)
            goto L395
        L38d:
            r81 = r8
            r8 = r7
            r7 = r81
            r81 = r1
            r1 = r4
        L395:
            vj5 r4 = defpackage.vj5.PACKED_BOTTOM_PRIMARY
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L3b7
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r32 = r4
            java.lang.String r4 = "packedBottomPrimary"
            r76 = r13
            r13 = r7
            r7 = r76
            r76 = r32
            r32 = r14
            r14 = r76
            l(r2, r3, r4, r5, r6, r7)
            goto L3bf
        L3b7:
            r32 = r13
            r13 = r7
            r7 = r32
            r32 = r14
            r14 = r4
        L3bf:
            vj5 r4 = defpackage.vj5.PACKED_TOP_PLANE1
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L3dd
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r33 = r4
            java.lang.String r4 = "packedTopPlane1"
            r34 = r15
            r35 = r33
            r15 = r7
            r7 = r32
            l(r2, r3, r4, r5, r6, r7)
            goto L3e2
        L3dd:
            r35 = r4
            r34 = r15
            r15 = r7
        L3e2:
            vj5 r4 = defpackage.vj5.PACKED_TOP_CONTROL
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L400
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r7 = r4
            java.lang.String r4 = "packedTopControl"
            r36 = r7
            r33 = r14
            r14 = r32
            r7 = r34
            l(r2, r3, r4, r5, r6, r7)
            goto L406
        L400:
            r36 = r4
            r33 = r14
            r14 = r32
        L406:
            vj5 r4 = defpackage.vj5.PACKED_BOTTOM_PLANE1
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L424
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r7 = r4
            java.lang.String r4 = "packedBottomPlane1"
            r32 = r1
            r37 = r7
            r7 = r16
            r1 = r34
            l(r2, r3, r4, r5, r6, r7)
            goto L42c
        L424:
            r32 = r1
            r37 = r4
            r7 = r16
            r1 = r34
        L42c:
            vj5 r4 = defpackage.vj5.PACKED_BOTTOM_CONTROL
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L44a
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r16 = r4
            java.lang.String r4 = "packedBottomControl"
            r34 = r11
            r38 = r16
            r11 = r7
            r7 = r17
            l(r2, r3, r4, r5, r6, r7)
            goto L451
        L44a:
            r38 = r4
            r34 = r11
            r11 = r7
            r7 = r17
        L451:
            vj5 r4 = defpackage.vj5.CAPTURE3D_SOURCE_DS_FRAME
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L46f
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r16 = r4
            java.lang.String r4 = "capture3dSourceDsFrame"
            r17 = r10
            r39 = r16
            r10 = r7
            r7 = r18
            l(r2, r3, r4, r5, r6, r7)
            goto L476
        L46f:
            r39 = r4
            r17 = r10
            r10 = r7
            r7 = r18
        L476:
            vj5 r4 = defpackage.vj5.CAPTURE_LINE_USES_3D_MASK
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L494
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r16 = r4
            java.lang.String r4 = "captureLineUses3dMask"
            r18 = r9
            r40 = r16
            r9 = r7
            r7 = r19
            l(r2, r3, r4, r5, r6, r7)
            goto L49b
        L494:
            r40 = r4
            r18 = r9
            r9 = r7
            r7 = r19
        L49b:
            vj5 r4 = defpackage.vj5.COMP4_TOP_PLACEHOLDER
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L4b8
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r16 = r4
            java.lang.String r4 = "comp4TopPlaceholder"
            r41 = r7
            r42 = r16
            r7 = r20
            l(r2, r3, r4, r5, r6, r7)
            goto L4be
        L4b8:
            r42 = r4
            r41 = r7
            r7 = r20
        L4be:
            vj5 r4 = defpackage.vj5.COMP4_BOTTOM_PLACEHOLDER
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L4db
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r16 = r4
            java.lang.String r4 = "comp4BottomPlaceholder"
            r43 = r7
            r44 = r16
            r7 = r21
            l(r2, r3, r4, r5, r6, r7)
            goto L4e1
        L4db:
            r44 = r4
            r43 = r7
            r7 = r21
        L4e1:
            vj5 r4 = defpackage.vj5.CAPTURE_FALLBACK_MASK
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L4fe
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r16 = r4
            java.lang.String r4 = "captureFallbackMask"
            r45 = r7
            r46 = r16
            r7 = r22
            l(r2, r3, r4, r5, r6, r7)
            goto L504
        L4fe:
            r46 = r4
            r45 = r7
            r7 = r22
        L504:
            vj5 r4 = defpackage.vj5.SOFT_PACKED_FRAME_META_JSON
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L512
            r3.getClass()
            m(r2, r3, r12)
        L512:
            vj5 r5 = defpackage.vj5.COMPOSITED_FRAME
            boolean r6 = r0.contains(r5)
            if (r6 == 0) goto L531
            r3.getClass()
            r6 = r4
            java.lang.String r4 = "compositedFrame"
            r48 = r5
            r47 = r6
            r16 = r12
            r5 = r23
            r6 = r24
            r12 = r7
            r7 = r81
            l(r2, r3, r4, r5, r6, r7)
            goto L53e
        L531:
            r47 = r4
            r48 = r5
            r16 = r12
            r5 = r23
            r6 = r24
            r12 = r7
            r7 = r81
        L53e:
            vj5 r4 = defpackage.vj5.RENDERER3D_FRAME
            boolean r19 = r0.contains(r4)
            if (r19 == 0) goto L563
            r3.getClass()
            r19 = r4
            java.lang.String r4 = "renderer3dFrame"
            r49 = r5
            r50 = r6
            r51 = r7
            r52 = r19
            r5 = r25
            r6 = r26
            r7 = r27
            l(r2, r3, r4, r5, r6, r7)
            r19 = r5
            r20 = r6
            goto L571
        L563:
            r52 = r4
            r49 = r5
            r50 = r6
            r51 = r7
            r19 = r25
            r20 = r26
            r7 = r27
        L571:
            vj5 r4 = defpackage.vj5.RENDERER3D_CAPTURE_FRAME
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L58e
            r3.getClass()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 192(0xc0, float:2.69E-43)
            r21 = r4
            java.lang.String r4 = "renderer3dCaptureFrame"
            r53 = r7
            r54 = r21
            r7 = r28
            l(r2, r3, r4, r5, r6, r7)
            goto L594
        L58e:
            r54 = r4
            r53 = r7
            r7 = r28
        L594:
            vj5 r4 = defpackage.vj5.RENDERER3D_DEPTH
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L5ca
            r3.getClass()
            xj5 r55 = new xj5
            r62 = 0
            r63 = 0
            r56 = 1
            java.lang.Class<yj5> r58 = defpackage.yj5.class
            java.lang.String r59 = "encodeDepthDebugPixel"
            java.lang.String r60 = "encodeDepthDebugPixel(I)I"
            r61 = 0
            r57 = r77
            r55.<init>(r56, r57, r58, r59, r60, r61, r62, r63)
            r5 = r4
            java.lang.String r4 = "renderer3dDepth"
            r74 = r5
            r73 = r7
            r21 = r12
            r5 = r19
            r6 = r20
            r7 = r29
            r12 = r8
            r8 = r55
            n(r2, r3, r4, r5, r6, r7, r8)
            goto L5d7
        L5ca:
            r74 = r4
            r73 = r7
            r21 = r12
            r5 = r19
            r6 = r20
            r7 = r29
            r12 = r8
        L5d7:
            vj5 r4 = defpackage.vj5.RENDERER3D_ATTR
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L603
            r3.getClass()
            xj5 r64 = new xj5
            r71 = 0
            r72 = 1
            r65 = 1
            java.lang.Class<yj5> r67 = defpackage.yj5.class
            java.lang.String r68 = "encodeAttrDebugPixel"
            java.lang.String r69 = "encodeAttrDebugPixel(I)I"
            r70 = 0
            r66 = r77
            r64.<init>(r65, r66, r67, r68, r69, r70, r71, r72)
            java.lang.String r4 = "renderer3dAttr"
            r75 = r7
            r7 = r30
            r8 = r64
            n(r2, r3, r4, r5, r6, r7, r8)
            goto L607
        L603:
            r75 = r7
            r7 = r30
        L607:
            vj5 r4 = defpackage.vj5.RENDERER3D_COVERAGE
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L634
            r3.getClass()
            xj5 r64 = new xj5
            r71 = 0
            r72 = 2
            r65 = 1
            java.lang.Class<yj5> r67 = defpackage.yj5.class
            java.lang.String r68 = "encodeCoverageDebugPixel"
            java.lang.String r69 = "encodeCoverageDebugPixel(I)I"
            r70 = 0
            r66 = r77
            r64.<init>(r65, r66, r67, r68, r69, r70, r71, r72)
            java.lang.String r4 = "renderer3dCoverage"
            r81 = r0
            r0 = r7
            r7 = r31
            r8 = r64
            n(r2, r3, r4, r5, r6, r7, r8)
            goto L639
        L634:
            r81 = r0
            r0 = r7
            r7 = r31
        L639:
            r4 = 256(0x100, float:3.59E-43)
            r8 = 384(0x180, float:5.38E-43)
            r19 = r2
            java.lang.String r2 = c(r4, r8, r12)
            r8 = 192(0xc0, float:2.69E-43)
            r20 = r12
            java.lang.String r12 = c(r4, r8, r13)
            r22 = r13
            java.lang.String r13 = c(r4, r8, r15)
            r23 = r15
            java.lang.String r15 = c(r4, r8, r14)
            r24 = r14
            java.lang.String r14 = c(r4, r8, r1)
            r25 = r1
            java.lang.String r1 = c(r4, r8, r11)
            r26 = r11
            java.lang.String r11 = c(r4, r8, r10)
            r27 = r10
            java.lang.String r10 = c(r4, r8, r9)
            r28 = r9
            r79 = r10
            r9 = r41
            java.lang.String r10 = c(r4, r8, r9)
            r29 = r10
            r9 = r43
            java.lang.String r10 = c(r4, r8, r9)
            r30 = r10
            r9 = r45
            java.lang.String r10 = c(r4, r8, r9)
            r9 = r21
            r21 = r10
            java.lang.String r10 = c(r4, r8, r9)
            if (r16 == 0) goto L69d
            boolean r31 = defpackage.qs6.v0(r16)
            if (r31 == 0) goto L69a
            goto L69d
        L69a:
            r31 = 0
            goto L69f
        L69d:
            r31 = r80
        L69f:
            r4 = r31 ^ 1
            r8 = r49
            r49 = r9
            r9 = r50
            r50 = r4
            r4 = r51
            r51 = r10
            java.lang.String r10 = c(r8, r9, r4)
            r56 = r4
            r4 = r53
            r53 = r8
            java.lang.String r8 = c(r5, r6, r4)
            r57 = r4
            r59 = r8
            r58 = r9
            r60 = r10
            r4 = r73
            r8 = 256(0x100, float:3.59E-43)
            r9 = 192(0xc0, float:2.69E-43)
            java.lang.String r10 = c(r8, r9, r4)
            r8 = r75
            java.lang.String r9 = c(r5, r6, r8)
            java.lang.String r8 = c(r5, r6, r0)
            r61 = r0
            java.lang.String r0 = c(r5, r6, r7)
            r62 = r7
            java.lang.String r7 = " kind=meta screen="
            java.lang.String r4 = " packedTop="
            r63 = r5
            r5 = r18
            java.lang.StringBuilder r2 = defpackage.i61.u(r5, r3, r7, r2, r4)
            java.lang.String r4 = " packedBottom="
            java.lang.String r7 = " packedTopPlane1="
            defpackage.i61.B(r2, r12, r4, r13, r7)
            java.lang.String r4 = " packedTopControl="
            java.lang.String r7 = " packedBottomPlane1="
            defpackage.i61.B(r2, r15, r4, r14, r7)
            java.lang.String r4 = " packedBottomControl="
            java.lang.String r7 = " capture3dSource="
            defpackage.i61.B(r2, r1, r4, r11, r7)
            java.lang.String r1 = " captureLineMask="
            java.lang.String r4 = " comp4Top="
            r7 = r79
            r11 = r29
            defpackage.i61.B(r2, r7, r1, r11, r4)
            java.lang.String r1 = " comp4Bottom="
            java.lang.String r4 = " fallbackMask="
            r11 = r21
            r7 = r30
            defpackage.i61.B(r2, r7, r1, r11, r4)
            r1 = r51
            r2.append(r1)
            java.lang.String r1 = " softPackedMeta="
            r2.append(r1)
            r1 = r50
            r2.append(r1)
            java.lang.String r1 = " composited="
            r2.append(r1)
            java.lang.String r1 = " renderer3d="
            java.lang.String r4 = " renderer3dCapture="
            r11 = r59
            r7 = r60
            defpackage.i61.B(r2, r7, r1, r11, r4)
            java.lang.String r1 = " depth="
            java.lang.String r4 = " attr="
            defpackage.i61.B(r2, r10, r1, r9, r4)
            r2.append(r8)
            java.lang.String r1 = " coverage="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = r17
            android.util.Log.w(r1, r0)
            r0 = r81
            r11 = r34
            boolean r2 = r0.contains(r11)
            if (r2 == 0) goto L76b
            r3.getClass()
            java.lang.String r2 = "screenFrame"
            r7 = r20
            r4 = 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            k(r3, r2, r8, r4, r7)
        L768:
            r2 = r32
            goto L770
        L76b:
            r7 = r20
            r8 = 256(0x100, float:3.59E-43)
            goto L768
        L770:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L785
            r3.getClass()
            java.lang.String r2 = "packedTopPrimary"
            r13 = r22
            r9 = 192(0xc0, float:2.69E-43)
            k(r3, r2, r8, r9, r13)
        L782:
            r14 = r33
            goto L78a
        L785:
            r13 = r22
            r9 = 192(0xc0, float:2.69E-43)
            goto L782
        L78a:
            boolean r2 = r0.contains(r14)
            if (r2 == 0) goto L79d
            r3.getClass()
            java.lang.String r2 = "packedBottomPrimary"
            r15 = r23
            k(r3, r2, r8, r9, r15)
        L79a:
            r2 = r35
            goto L7a0
        L79d:
            r15 = r23
            goto L79a
        L7a0:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L7b3
            r3.getClass()
            java.lang.String r2 = "packedTopPlane1"
            r14 = r24
            k(r3, r2, r8, r9, r14)
        L7b0:
            r2 = r36
            goto L7b6
        L7b3:
            r14 = r24
            goto L7b0
        L7b6:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L7c9
            r3.getClass()
            java.lang.String r2 = "packedTopControl"
            r4 = r25
            k(r3, r2, r8, r9, r4)
        L7c6:
            r2 = r37
            goto L7cc
        L7c9:
            r4 = r25
            goto L7c6
        L7cc:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L7df
            r3.getClass()
            java.lang.String r2 = "packedBottomPlane1"
            r11 = r26
            k(r3, r2, r8, r9, r11)
        L7dc:
            r2 = r38
            goto L7e2
        L7df:
            r11 = r26
            goto L7dc
        L7e2:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L7f5
            r3.getClass()
            java.lang.String r2 = "packedBottomControl"
            r10 = r27
            k(r3, r2, r8, r9, r10)
        L7f2:
            r2 = r39
            goto L7f8
        L7f5:
            r10 = r27
            goto L7f2
        L7f8:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L80b
            r3.getClass()
            java.lang.String r2 = "capture3dSourceDsFrame"
            r12 = r28
            k(r3, r2, r8, r9, r12)
        L808:
            r2 = r40
            goto L80e
        L80b:
            r12 = r28
            goto L808
        L80e:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L823
            r3.getClass()
            java.lang.String r2 = "captureLineUses3dMask"
            r34 = r4
            r4 = r41
            k(r3, r2, r8, r9, r4)
        L820:
            r2 = r42
            goto L828
        L823:
            r34 = r4
            r4 = r41
            goto L820
        L828:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L83d
            r3.getClass()
            java.lang.String r2 = "comp4TopPlaceholder"
            r41 = r4
            r4 = r43
            k(r3, r2, r8, r9, r4)
        L83a:
            r2 = r44
            goto L842
        L83d:
            r41 = r4
            r4 = r43
            goto L83a
        L842:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L857
            r3.getClass()
            java.lang.String r2 = "comp4BottomPlaceholder"
            r43 = r4
            r4 = r45
            k(r3, r2, r8, r9, r4)
        L854:
            r2 = r46
            goto L85c
        L857:
            r43 = r4
            r4 = r45
            goto L854
        L85c:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L871
            r3.getClass()
            java.lang.String r2 = "captureFallbackMask"
            r45 = r4
            r4 = r49
            k(r3, r2, r8, r9, r4)
        L86e:
            r2 = r47
            goto L876
        L871:
            r45 = r4
            r4 = r49
            goto L86e
        L876:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L8b7
            if (r16 == 0) goto L887
            boolean r2 = defpackage.qs6.v0(r16)
            if (r2 == 0) goto L885
            goto L887
        L885:
            r2 = 0
            goto L889
        L887:
            r2 = r80
        L889:
            r2 = r2 ^ 1
            if (r16 == 0) goto L892
            int r8 = r16.length()
            goto L893
        L892:
            r8 = 0
        L893:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r5)
            r9.append(r3)
            r21 = r4
            java.lang.String r4 = " kind=softPackedFrameMetaJson available="
            r9.append(r4)
            r9.append(r2)
            java.lang.String r2 = " length="
            r9.append(r2)
            r9.append(r8)
            java.lang.String r2 = r9.toString()
            android.util.Log.w(r1, r2)
        L8b4:
            r2 = r48
            goto L8ba
        L8b7:
            r21 = r4
            goto L8b4
        L8ba:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L8d1
            r3.getClass()
            java.lang.String r2 = "compositedFrame"
            r8 = r53
            r4 = r56
            r9 = r58
            k(r3, r2, r8, r9, r4)
        L8ce:
            r2 = r52
            goto L8d4
        L8d1:
            r4 = r56
            goto L8ce
        L8d4:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L8e9
            r3.getClass()
            java.lang.String r2 = "renderer3dFrame"
            r9 = r57
            r8 = r63
            k(r3, r2, r8, r6, r9)
        L8e6:
            r2 = r54
            goto L8ee
        L8e9:
            r9 = r57
            r8 = r63
            goto L8e6
        L8ee:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L90b
            r3.getClass()
            java.lang.String r2 = "renderer3dCaptureFrame"
            r81 = r4
            r20 = r7
            r53 = r9
            r4 = r73
            r7 = 192(0xc0, float:2.69E-43)
            r9 = 256(0x100, float:3.59E-43)
            k(r3, r2, r9, r7, r4)
        L908:
            r2 = r74
            goto L914
        L90b:
            r81 = r4
            r20 = r7
            r53 = r9
            r4 = r73
            goto L908
        L914:
            boolean r2 = r0.contains(r2)
            java.lang.String r7 = " max="
            r17 = 0
            java.lang.String r9 = " samples="
            r77 = r2
            java.lang.String r2 = " crc32="
            r73 = r4
            java.lang.String r4 = " pixels="
            r27 = r10
            java.lang.String r10 = "x"
            if (r77 == 0) goto L9e7
            r3.getClass()
            r26 = r11
            r28 = r12
            if (r75 == 0) goto L93c
            r11 = r75
            int r12 = r11.length
            if (r12 != 0) goto L948
            r75 = r11
        L93c:
            r22 = r0
            r24 = r3
            r29 = r13
            r32 = r14
            r30 = r15
            goto L9d0
        L948:
            int r12 = r11.length
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r24 = -9223372036854775808
            r29 = r13
            r32 = r14
            r13 = 0
            r14 = 0
        L956:
            if (r13 >= r12) goto L97d
            r30 = r12
            r12 = r11[r13]
            r31 = r13
            long r12 = (long) r12
            r35 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r35
            int r33 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r33 >= 0) goto L96c
            r22 = r12
        L96c:
            int r33 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r33 <= 0) goto L972
            r24 = r12
        L972:
            int r12 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r12 != 0) goto L978
            int r14 = r14 + 1
        L978:
            int r13 = r31 + 1
            r12 = r30
            goto L956
        L97d:
            int r12 = r11.length
            java.lang.String r13 = b(r11)
            r30 = r15
            java.lang.String r15 = g(r22)
            r22 = r0
            java.lang.String r0 = g(r24)
            r23 = r1
            java.lang.String r1 = a(r8, r6, r11)
            r75 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r5)
            r11.append(r3)
            r24 = r3
            java.lang.String r3 = " kind=renderer3dDepth size="
            r11.append(r3)
            r11.append(r8)
            r11.append(r10)
            defpackage.lb1.x(r11, r6, r4, r12, r2)
            java.lang.String r3 = " min="
            defpackage.i61.B(r11, r13, r3, r15, r7)
            r11.append(r0)
            java.lang.String r0 = " zero="
            r11.append(r0)
            r11.append(r14)
            r11.append(r9)
            r11.append(r1)
            java.lang.String r0 = r11.toString()
            r1 = r23
            android.util.Log.w(r1, r0)
            r3 = r24
            goto L9f3
        L9d0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r3 = r24
            r0.append(r3)
            java.lang.String r11 = " kind=renderer3dDepth unavailable=1"
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            goto L9f3
        L9e7:
            r22 = r0
            r26 = r11
            r28 = r12
            r29 = r13
            r32 = r14
            r30 = r15
        L9f3:
            vj5 r0 = defpackage.vj5.RENDERER3D_ATTR
            r11 = r22
            boolean r0 = r11.contains(r0)
            java.lang.String r12 = " nonZero="
            if (r0 == 0) goto Lb38
            r3.getClass()
            if (r61 == 0) goto La0b
            r0 = r61
            int r13 = r0.length
            if (r13 != 0) goto La15
            r61 = r0
        La0b:
            r22 = r3
            r79 = r7
            r23 = r11
            r3 = r1
            r1 = r9
            goto Lb21
        La15:
            r13 = 64
            int[] r14 = new int[r13]
            int r15 = r0.length
            r24 = r1
            r79 = r7
            r23 = r11
            r22 = r14
            r1 = 0
            r7 = 0
            r11 = 0
            r13 = 0
            r14 = 0
        La27:
            if (r13 >= r15) goto La51
            r25 = r0[r13]
            if (r25 == 0) goto La2f
            int r14 = r14 + 1
        La2f:
            r31 = r25 & 15
            if (r31 == 0) goto La35
            int r7 = r7 + 1
        La35:
            r31 = 32768(0x8000, float:4.5918E-41)
            r31 = r25 & r31
            if (r31 == 0) goto La3e
            int r11 = r11 + 1
        La3e:
            r31 = r25 & 16
            if (r31 == 0) goto La44
            int r1 = r1 + 1
        La44:
            int r25 = r25 >>> 24
            r25 = r25 & 63
            r31 = r22[r25]
            int r31 = r31 + 1
            r22[r25] = r31
            int r13 = r13 + 1
            goto La27
        La51:
            r25 = r9
            r13 = 0
            r15 = 0
        La55:
            r9 = 64
            if (r13 >= r9) goto La62
            r9 = r22[r13]
            if (r9 <= 0) goto La5f
            int r15 = r15 + 1
        La5f:
            int r13 = r13 + 1
            goto La55
        La62:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r77 = r1
            r13 = 0
        La6a:
            r1 = 64
            if (r13 >= r1) goto La90
            r31 = r22[r13]
            if (r31 <= 0) goto La87
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r35 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r31)
            r31 = r15
            vr4 r15 = new vr4
            r15.<init>(r1, r13)
            r9.add(r15)
            goto La8b
        La87:
            r35 = r13
            r31 = r15
        La8b:
            int r13 = r35 + 1
            r15 = r31
            goto La6a
        La90:
            r31 = r15
            int r1 = r9.size()
            r13 = r80
            if (r1 <= r13) goto Laa4
            zh2 r1 = new zh2
            r13 = 27
            r1.<init>(r13)
            defpackage.jt0.x0(r9, r1)
        Laa4:
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto Laad
            java.lang.String r1 = "none"
            goto Lac7
        Laad:
            r1 = 6
            java.util.List r35 = defpackage.gt0.e1(r9, r1)
            dv4 r1 = new dv4
            r9 = 22
            r1.<init>(r9)
            r40 = 30
            java.lang.String r36 = ","
            r37 = 0
            r38 = 0
            r39 = r1
            java.lang.String r1 = defpackage.gt0.P0(r35, r36, r37, r38, r39, r40)
        Lac7:
            int r9 = r0.length
            java.lang.String r13 = b(r0)
            java.lang.String r15 = a(r8, r6, r0)
            r61 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r3)
            r22 = r3
            java.lang.String r3 = " kind=renderer3dAttr size="
            r0.append(r3)
            r0.append(r8)
            r0.append(r10)
            defpackage.lb1.x(r0, r6, r4, r9, r2)
            r0.append(r13)
            r0.append(r12)
            r0.append(r14)
            java.lang.String r3 = " edge="
            r0.append(r3)
            java.lang.String r3 = " fog="
            java.lang.String r9 = " backFacing="
            defpackage.lb1.x(r0, r7, r3, r11, r9)
            java.lang.String r3 = " uniquePolyIds="
            java.lang.String r7 = " topPolyIds="
            r9 = r77
            r11 = r31
            defpackage.lb1.x(r0, r9, r3, r11, r7)
            r0.append(r1)
            r1 = r25
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r3 = r24
            android.util.Log.w(r3, r0)
            r7 = r22
            goto Lb3f
        Lb21:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r7 = r22
            r0.append(r7)
            java.lang.String r9 = " kind=renderer3dAttr unavailable=1"
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            goto Lb3f
        Lb38:
            r79 = r7
            r23 = r11
            r7 = r3
            r3 = r1
            r1 = r9
        Lb3f:
            vj5 r0 = defpackage.vj5.RENDERER3D_COVERAGE
            r11 = r23
            boolean r9 = r11.contains(r0)
            if (r9 == 0) goto Lc16
            r7.getClass()
            if (r62 == 0) goto Lb55
            r9 = r62
            int r13 = r9.length
            if (r13 != 0) goto Lb5c
            r62 = r9
        Lb55:
            r77 = r0
            r1 = r3
            r22 = r11
            goto Lc01
        Lb5c:
            int r13 = r9.length
            r77 = r0
            r25 = r1
            r22 = r11
            r14 = r17
            r0 = 0
            r1 = 0
            r11 = 0
            r17 = r3
            r3 = 0
        Lb6b:
            if (r0 >= r13) goto Lb8e
            r18 = r9[r0]
            r23 = r0
            r24 = 31
            r0 = r18 & 31
            if (r0 == 0) goto Lb79
            int r11 = r11 + 1
        Lb79:
            r18 = r11
            r11 = r24
            if (r0 != r11) goto Lb81
            int r3 = r3 + 1
        Lb81:
            if (r0 <= r1) goto Lb85
            r11 = r0
            goto Lb86
        Lb85:
            r11 = r1
        Lb86:
            long r0 = (long) r0
            long r14 = r14 + r0
            int r0 = r23 + 1
            r1 = r11
            r11 = r18
            goto Lb6b
        Lb8e:
            int r0 = r9.length
            if (r0 != 0) goto Lb94
            r13 = 0
            goto Lb9b
        Lb94:
            double r13 = (double) r14
            int r0 = r9.length
            r23 = r13
            double r13 = (double) r0
            double r13 = r23 / r13
        Lb9b:
            int r0 = r9.length
            java.lang.String r15 = b(r9)
            r23 = r13
            java.util.Locale r13 = java.util.Locale.US
            java.lang.Double r14 = java.lang.Double.valueOf(r23)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            r18 = r1
            r1 = 1
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r1)
            java.lang.String r1 = "%.3f"
            java.lang.String r1 = java.lang.String.format(r13, r1, r14)
            java.lang.String r13 = a(r8, r6, r9)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r5)
            r14.append(r7)
            r62 = r9
            java.lang.String r9 = " kind=renderer3dCoverage size="
            r14.append(r9)
            r14.append(r8)
            r14.append(r10)
            defpackage.lb1.x(r14, r6, r4, r0, r2)
            r14.append(r15)
            r14.append(r12)
            r14.append(r11)
            java.lang.String r0 = " full31="
            r14.append(r0)
            java.lang.String r0 = " mean="
            r2 = r79
            r11 = r18
            defpackage.lb1.x(r14, r3, r2, r11, r0)
            r14.append(r1)
            r1 = r25
            r14.append(r1)
            r14.append(r13)
            java.lang.String r0 = r14.toString()
            r1 = r17
            android.util.Log.w(r1, r0)
            goto Lc1b
        Lc01:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r7)
            java.lang.String r2 = " kind=renderer3dCoverage unavailable=1"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            goto Lc1b
        Lc16:
            r77 = r0
            r1 = r3
            r22 = r11
        Lc1b:
            vj5 r0 = defpackage.vj5.SCREEN_FRAME
            r11 = r22
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lc2b
            boolean r0 = f(r20)
            if (r0 != 0) goto Ld29
        Lc2b:
            vj5 r0 = defpackage.vj5.PACKED_TOP_PRIMARY
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lc39
            boolean r0 = f(r29)
            if (r0 != 0) goto Ld29
        Lc39:
            vj5 r0 = defpackage.vj5.PACKED_BOTTOM_PRIMARY
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lc47
            boolean r0 = f(r30)
            if (r0 != 0) goto Ld29
        Lc47:
            vj5 r0 = defpackage.vj5.PACKED_TOP_PLANE1
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lc55
            boolean r0 = f(r32)
            if (r0 != 0) goto Ld29
        Lc55:
            vj5 r0 = defpackage.vj5.PACKED_TOP_CONTROL
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lc63
            boolean r0 = f(r34)
            if (r0 != 0) goto Ld29
        Lc63:
            vj5 r0 = defpackage.vj5.PACKED_BOTTOM_PLANE1
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lc71
            boolean r0 = f(r26)
            if (r0 != 0) goto Ld29
        Lc71:
            vj5 r0 = defpackage.vj5.PACKED_BOTTOM_CONTROL
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lc7f
            boolean r0 = f(r27)
            if (r0 != 0) goto Ld29
        Lc7f:
            vj5 r0 = defpackage.vj5.CAPTURE3D_SOURCE_DS_FRAME
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lc8d
            boolean r0 = f(r28)
            if (r0 != 0) goto Ld29
        Lc8d:
            vj5 r0 = defpackage.vj5.CAPTURE_LINE_USES_3D_MASK
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lc9b
            boolean r0 = f(r41)
            if (r0 != 0) goto Ld29
        Lc9b:
            vj5 r0 = defpackage.vj5.COMP4_TOP_PLACEHOLDER
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lca9
            boolean r0 = f(r43)
            if (r0 != 0) goto Ld29
        Lca9:
            vj5 r0 = defpackage.vj5.COMP4_BOTTOM_PLACEHOLDER
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lcb7
            boolean r0 = f(r45)
            if (r0 != 0) goto Ld29
        Lcb7:
            vj5 r0 = defpackage.vj5.CAPTURE_FALLBACK_MASK
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lcc5
            boolean r0 = f(r21)
            if (r0 != 0) goto Ld29
        Lcc5:
            vj5 r0 = defpackage.vj5.SOFT_PACKED_FRAME_META_JSON
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lcd5
            if (r16 == 0) goto Lcd5
            boolean r0 = defpackage.qs6.v0(r16)
            if (r0 == 0) goto Ld29
        Lcd5:
            vj5 r0 = defpackage.vj5.COMPOSITED_FRAME
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lce3
            boolean r0 = f(r81)
            if (r0 != 0) goto Ld29
        Lce3:
            vj5 r0 = defpackage.vj5.RENDERER3D_FRAME
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lcf1
            boolean r0 = f(r53)
            if (r0 != 0) goto Ld29
        Lcf1:
            vj5 r0 = defpackage.vj5.RENDERER3D_CAPTURE_FRAME
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Lcff
            boolean r0 = f(r73)
            if (r0 != 0) goto Ld29
        Lcff:
            vj5 r0 = defpackage.vj5.RENDERER3D_DEPTH
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Ld0d
            boolean r0 = f(r75)
            if (r0 != 0) goto Ld29
        Ld0d:
            vj5 r0 = defpackage.vj5.RENDERER3D_ATTR
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Ld1b
            boolean r0 = f(r61)
            if (r0 != 0) goto Ld29
        Ld1b:
            r0 = r77
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto Ld2b
            boolean r0 = f(r62)
            if (r0 == 0) goto Ld2b
        Ld29:
            r11 = 1
            goto Ld2c
        Ld2b:
            r11 = 0
        Ld2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r7)
            java.lang.String r2 = " stage=end success="
            r0.append(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            ak5 r0 = new ak5
            r7.getClass()
            r2 = r19
            r0.<init>(r2, r7, r11)
            return r0
    }
}
