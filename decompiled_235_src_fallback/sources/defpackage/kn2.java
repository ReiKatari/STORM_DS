package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kn2  reason: default package */
/* loaded from: classes.dex */
public abstract class kn2 {
    public static defpackage.e33 a;
    public static defpackage.e33 b;

    public static defpackage.af4 A(int[] r12, int[] r13) {
            af4 r0 = new af4
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            int r2 = r12.length
            r3 = 0
            r4 = r3
        La:
            r5 = 5
            r6 = 39
            if (r4 >= r2) goto L2e
            r7 = r12[r4]
            r1.addCapability(r7)     // Catch: java.lang.IllegalArgumentException -> L15
            goto L2b
        L15:
            r8 = move-exception
            ga0 r9 = defpackage.ga0.f()
            java.lang.String r10 = defpackage.af4.b
            java.lang.String r10 = defpackage.af4.b
            java.lang.String r11 = "Ignoring adding capability '"
            java.lang.String r6 = defpackage.xg6.o(r11, r7, r6)
            int r7 = r9.b
            if (r7 > r5) goto L2b
            android.util.Log.w(r10, r6, r8)
        L2b:
            int r4 = r4 + 1
            goto La
        L2e:
            int[] r2 = defpackage.nb3.q
            r4 = r3
        L31:
            r7 = 3
            if (r4 >= r7) goto L59
            r7 = r2[r4]
            boolean r8 = defpackage.fv.m0(r12, r7)
            if (r8 != 0) goto L56
            r1.removeCapability(r7)     // Catch: java.lang.IllegalArgumentException -> L40
            goto L56
        L40:
            r8 = move-exception
            ga0 r9 = defpackage.ga0.f()
            java.lang.String r10 = defpackage.af4.b
            java.lang.String r10 = defpackage.af4.b
            java.lang.String r11 = "Ignoring removing default capability '"
            java.lang.String r7 = defpackage.xg6.o(r11, r7, r6)
            int r9 = r9.b
            if (r9 > r5) goto L56
            android.util.Log.w(r10, r7, r8)
        L56:
            int r4 = r4 + 1
            goto L31
        L59:
            int r12 = r13.length
        L5a:
            if (r3 >= r12) goto L64
            r2 = r13[r3]
            r1.addTransportType(r2)
            int r3 = r3 + 1
            goto L5a
        L64:
            android.net.NetworkRequest r12 = r1.build()
            r12.getClass()
            r0.<init>(r12)
            return r0
    }

    public static defpackage.iu4[] B(java.lang.String r17) {
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r5 = r2
            r4 = 1
        La:
            int r6 = r0.length()
            if (r4 >= r6) goto Ldd
        L10:
            int r6 = r0.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L34
            char r6 = r0.charAt(r4)
            int r9 = r6 + (-65)
            int r10 = r6 + (-90)
            int r10 = r10 * r9
            if (r10 <= 0) goto L2c
            int r9 = r6 + (-97)
            int r10 = r6 + (-122)
            int r10 = r10 * r9
            if (r10 > 0) goto L31
        L2c:
            if (r6 == r8) goto L31
            if (r6 == r7) goto L31
            goto L34
        L31:
            int r4 = r4 + 1
            goto L10
        L34:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto Ld6
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto Lc8
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L54
            goto Lc8
        L54:
            int r6 = r5.length()     // Catch: java.lang.NumberFormatException -> Laa
            float[] r6 = new float[r6]     // Catch: java.lang.NumberFormatException -> Laa
            int r9 = r5.length()     // Catch: java.lang.NumberFormatException -> Laa
            r11 = r2
            r10 = 1
        L60:
            if (r10 >= r9) goto Lb4
            r13 = r2
            r14 = r13
            r15 = r14
            r16 = r15
            r12 = r10
        L68:
            int r3 = r5.length()     // Catch: java.lang.NumberFormatException -> Laa
            if (r12 >= r3) goto L9a
            char r3 = r5.charAt(r12)     // Catch: java.lang.NumberFormatException -> Laa
            r2 = 32
            if (r3 == r2) goto L91
            if (r3 == r7) goto L8f
            if (r3 == r8) goto L8f
            switch(r3) {
                case 44: goto L91;
                case 45: goto L88;
                case 46: goto L7e;
                default: goto L7d;
            }     // Catch: java.lang.NumberFormatException -> Laa
        L7d:
            goto L8d
        L7e:
            if (r14 != 0) goto L83
            r13 = 0
            r14 = 1
            goto L93
        L83:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L93
        L88:
            if (r12 == r10) goto L8d
            if (r13 != 0) goto L8d
            goto L83
        L8d:
            r13 = 0
            goto L93
        L8f:
            r13 = 1
            goto L93
        L91:
            r13 = 0
            r15 = 1
        L93:
            if (r15 == 0) goto L96
            goto L9a
        L96:
            int r12 = r12 + 1
            r2 = 0
            goto L68
        L9a:
            if (r10 >= r12) goto Lac
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch: java.lang.NumberFormatException -> Laa
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> Laa
            r6[r11] = r3     // Catch: java.lang.NumberFormatException -> Laa
            r11 = r2
            goto Lac
        Laa:
            r0 = move-exception
            goto Lbb
        Lac:
            if (r16 == 0) goto Lb1
            r10 = r12
        Laf:
            r2 = 0
            goto L60
        Lb1:
            int r10 = r12 + 1
            goto Laf
        Lb4:
            float[] r2 = w(r6, r11)     // Catch: java.lang.NumberFormatException -> Laa
            r3 = r2
            r2 = 0
            goto Lca
        Lbb:
            java.lang.String r1 = "error in parsing \""
            java.lang.String r2 = "\""
            java.lang.String r1 = defpackage.lb1.A(r1, r5, r2)
            defpackage.u34.p(r1, r0)
            r0 = 0
            return r0
        Lc8:
            float[] r3 = new float[r2]
        Lca:
            char r5 = r5.charAt(r2)
            iu4 r2 = new iu4
            r2.<init>(r5, r3)
            r1.add(r2)
        Ld6:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto La
        Ldd:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto Lf7
            int r2 = r0.length()
            if (r5 >= r2) goto Lf7
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r3 = new float[r2]
            iu4 r4 = new iu4
            r4.<init>(r0, r3)
            r1.add(r4)
            goto Lf8
        Lf7:
            r2 = 0
        Lf8:
            iu4[] r0 = new defpackage.iu4[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            iu4[] r0 = (defpackage.iu4[]) r0
            return r0
    }

    public static final defpackage.g56 C(android.view.View r3) {
            r3.getClass()
        L3:
            r0 = 0
            if (r3 == 0) goto L25
            r1 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            java.lang.Object r1 = r3.getTag(r1)
            boolean r2 = r1 instanceof defpackage.g56
            if (r2 == 0) goto L14
            g56 r1 = (defpackage.g56) r1
            goto L15
        L14:
            r1 = r0
        L15:
            if (r1 == 0) goto L18
            return r1
        L18:
            android.view.ViewParent r3 = defpackage.xk2.s(r3)
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L23
            android.view.View r3 = (android.view.View) r3
            goto L3
        L23:
            r3 = r0
            goto L3
        L25:
            return r0
    }

    public static byte D(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = r1 >> r2
            r1 = r1 & 31
            byte r1 = (byte) r1
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r1 << 3
            int r1 = r1 >> 2
            int r2 = r2 + r1
            r1 = r2 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            return r1
    }

    public static final defpackage.pe5 E(defpackage.l55 r0, defpackage.px0 r1) {
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r0 = r1.j(r0)
            pe5 r0 = (defpackage.pe5) r0
            if (r0 != 0) goto L16
            nq6 r0 = defpackage.kf.b
            java.lang.Object r0 = r1.j(r0)
            android.content.Context r0 = (android.content.Context) r0
            pe5 r0 = defpackage.vs0.q(r0)
        L16:
            return r0
    }

    public static final int F(defpackage.v84 r4, long r5, defpackage.fo7 r7) {
            if (r7 == 0) goto L7
            float r7 = r7.g()
            goto L8
        L7:
            r7 = 0
        L8:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r1 = r4.e(r1)
            float r2 = java.lang.Float.intBitsToFloat(r0)
            float r3 = r4.f(r1)
            float r3 = r3 - r7
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L4c
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r2 = r4.b(r1)
            float r2 = r2 + r7
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L32
            goto L4c
        L32:
            r0 = 32
            long r5 = r5 >> r0
            int r5 = (int) r5
            float r6 = java.lang.Float.intBitsToFloat(r5)
            float r0 = -r7
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 < 0) goto L4c
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r4 = r4.d
            float r4 = r4 + r7
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L4b
            goto L4c
        L4b:
            return r1
        L4c:
            r4 = -1
            return r4
    }

    public static final int G(android.view.KeyEvent r4) {
            boolean r0 = r4.isAltPressed()
            boolean r1 = r4.isCtrlPressed()
            boolean r2 = r4.isMetaPressed()
            boolean r4 = r4.isShiftPressed()
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            goto L16
        L15:
            r1 = r3
        L16:
            r0 = r0 | r1
            if (r2 == 0) goto L1b
            r1 = 4
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r0 = r0 | r1
            if (r4 == 0) goto L21
            r3 = 8
        L21:
            r4 = r0 | r3
            return r4
    }

    public static final long H(defpackage.jt3 r4, defpackage.of5 r5, int r6) {
            fa6 r0 = defpackage.cs1.o0
            b47 r1 = r4.d()
            if (r1 == 0) goto Ld
            a47 r1 = r1.a
            v84 r1 = r1.b
            goto Le
        Ld:
            r1 = 0
        Le:
            jk3 r4 = r4.c()
            if (r1 == 0) goto L26
            if (r4 != 0) goto L17
            goto L26
        L17:
            r2 = 0
            long r2 = r4.N(r2)
            of5 r4 = r5.i(r2)
            long r4 = r1.h(r4, r6, r0)
            return r4
        L26:
            long r4 = defpackage.k47.b
            return r4
    }

    public static android.graphics.Bitmap I(java.io.InputStream r17) {
            r0 = r17
            r1 = 104(0x68, double:5.14E-322)
            r3 = 0
            b0(r0, r1)     // Catch: java.lang.Throwable -> L5a
            r1 = 4
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L5a
            int r4 = r0.read(r2)     // Catch: java.lang.Throwable -> L5a
            if (r4 >= r1) goto L12
            goto L3d
        L12:
            r4 = 0
            int r2 = t(r2, r4)     // Catch: java.lang.Throwable -> L5a
            if (r2 > 0) goto L1a
            goto L3d
        L1a:
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L5a
            r7 = -76
            long r5 = r5 + r7
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L25
            goto L3d
        L25:
            b0(r0, r5)     // Catch: java.lang.Throwable -> L5a
            r2 = 512(0x200, float:7.17E-43)
            byte[] r5 = new byte[r2]     // Catch: java.lang.Throwable -> L5a
            int r6 = r0.read(r5)     // Catch: java.lang.Throwable -> L5a
            if (r6 >= r2) goto L33
            goto L3d
        L33:
            r2 = 32
            byte[] r6 = new byte[r2]     // Catch: java.lang.Throwable -> L5a
            int r0 = r0.read(r6)     // Catch: java.lang.Throwable -> L5a
            if (r0 >= r2) goto L3e
        L3d:
            return r3
        L3e:
            r0 = 16
            short[] r7 = new short[r0]     // Catch: java.lang.Throwable -> L5a
            r8 = r4
        L43:
            r9 = 255(0xff, float:3.57E-43)
            if (r8 >= r0) goto L5d
            int r10 = r8 * 2
            r11 = r6[r10]     // Catch: java.lang.Throwable -> L5a
            int r10 = r10 + 1
            r10 = r6[r10]     // Catch: java.lang.Throwable -> L5a
            r10 = r10 & r9
            int r10 = r10 << 8
            r9 = r9 & r11
            r9 = r9 | r10
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L5a
            r7[r8] = r9     // Catch: java.lang.Throwable -> L5a
            int r8 = r8 + 1
            goto L43
        L5a:
            r0 = move-exception
            goto L107
        L5d:
            int[] r6 = new int[r0]     // Catch: java.lang.Throwable -> L5a
            r8 = r4
        L60:
            if (r8 >= r0) goto L84
            short r10 = r7[r8]     // Catch: java.lang.Throwable -> L5a
            byte r11 = D(r10, r4)     // Catch: java.lang.Throwable -> L5a
            r11 = r11 & r9
            r12 = 5
            byte r12 = D(r10, r12)     // Catch: java.lang.Throwable -> L5a
            r12 = r12 & r9
            r13 = 10
            byte r10 = D(r10, r13)     // Catch: java.lang.Throwable -> L5a
            r10 = r10 & r9
            if (r8 != 0) goto L7a
            r13 = r4
            goto L7b
        L7a:
            r13 = r9
        L7b:
            int r10 = android.graphics.Color.argb(r13, r11, r12, r10)     // Catch: java.lang.Throwable -> L5a
            r6[r8] = r10     // Catch: java.lang.Throwable -> L5a
            int r8 = r8 + 1
            goto L60
        L84:
            r0 = 1024(0x400, float:1.435E-42)
            int[] r7 = new int[r0]     // Catch: java.lang.Throwable -> L5a
            r8 = r4
        L89:
            if (r8 >= r1) goto Lcf
            r10 = r4
        L8c:
            if (r10 >= r1) goto Lcc
            r11 = r4
        L8f:
            if (r11 >= r2) goto Lc9
            int r12 = r8 * 4
            int r12 = r12 + r10
            int r12 = r12 * r2
            int r12 = r12 + r11
            r12 = r5[r12]     // Catch: java.lang.Throwable -> L5a
            r13 = r12 & (-16)
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L5a
            r13 = r13 & r9
            int r13 = r13 >> r1
            r12 = r12 & 15
            int r14 = r10 * 8
            int r15 = r11 % 4
            int r15 = r15 * 2
            int r15 = r15 + r14
            int r14 = r8 * 8
            int r16 = r11 / 4
            int r16 = r16 + r14
            int r16 = r16 * 32
            int r16 = r16 + r15
            if (r12 != 0) goto Lb5
            r7[r16] = r4     // Catch: java.lang.Throwable -> L5a
            goto Lb9
        Lb5:
            r12 = r6[r12]     // Catch: java.lang.Throwable -> L5a
            r7[r16] = r12     // Catch: java.lang.Throwable -> L5a
        Lb9:
            if (r13 != 0) goto Lc0
            int r16 = r16 + 1
            r7[r16] = r4     // Catch: java.lang.Throwable -> L5a
            goto Lc6
        Lc0:
            int r16 = r16 + 1
            r12 = r6[r13]     // Catch: java.lang.Throwable -> L5a
            r7[r16] = r12     // Catch: java.lang.Throwable -> L5a
        Lc6:
            int r11 = r11 + 1
            goto L8f
        Lc9:
            int r10 = r10 + 1
            goto L8c
        Lcc:
            int r8 = r8 + 1
            goto L89
        Lcf:
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L5a
        Ld3:
            if (r4 >= r0) goto Lf9
            r5 = r7[r4]     // Catch: java.lang.Throwable -> L5a
            int r6 = r4 * 4
            int r8 = r5 >> 16
            r8 = r8 & r9
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L5a
            r1[r6] = r8     // Catch: java.lang.Throwable -> L5a
            int r8 = r6 + 1
            int r10 = r5 >> 8
            r10 = r10 & r9
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L5a
            r1[r8] = r10     // Catch: java.lang.Throwable -> L5a
            int r8 = r6 + 2
            r10 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L5a
            r1[r8] = r10     // Catch: java.lang.Throwable -> L5a
            int r6 = r6 + 3
            int r5 = r5 >> 24
            r5 = r5 & r9
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L5a
            r1[r6] = r5     // Catch: java.lang.Throwable -> L5a
            int r4 = r4 + 1
            goto Ld3
        Lf9:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L5a
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r2, r0)     // Catch: java.lang.Throwable -> L5a
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)     // Catch: java.lang.Throwable -> L5a
            r0.copyPixelsFromBuffer(r1)     // Catch: java.lang.Throwable -> L5a
            goto L10d
        L107:
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L10d:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 == 0) goto L113
            goto L114
        L113:
            r3 = r0
        L114:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            return r3
    }

    public static defpackage.lx5 J(defpackage.pq5 r11, java.io.InputStream r12) {
            r11.getClass()
            r1 = 0
            r0 = 512(0x200, float:7.17E-43)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L3f
            int r12 = r12.read(r2)     // Catch: java.lang.Throwable -> L3f
            if (r12 >= r0) goto Lf
            return r1
        Lf:
            r12 = 5
            r3 = 12
            r4 = 0
            java.lang.String r8 = defpackage.xs6.W(r4, r2, r3, r12)     // Catch: java.lang.Throwable -> L3f
            r12 = 16
            r5 = 4
            java.lang.String r6 = defpackage.xs6.W(r3, r2, r12, r5)     // Catch: java.lang.Throwable -> L3f
            r12 = -1
            r7 = r12
        L20:
            int r12 = r0 + (-1)
            if (r0 <= 0) goto L35
            r0 = r2[r4]     // Catch: java.lang.Throwable -> L3f
            r0 = r0 ^ r7
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r7 >>> 8
            int[] r5 = defpackage.lb4.h     // Catch: java.lang.Throwable -> L3f
            r0 = r5[r0]     // Catch: java.lang.Throwable -> L3f
            r7 = r3 ^ r0
            int r4 = r4 + 1
            r0 = r12
            goto L20
        L35:
            lx5 r5 = new lx5     // Catch: java.lang.Throwable -> L3f
            java.lang.String r9 = r11.a     // Catch: java.lang.Throwable -> L3f
            boolean r10 = r11.h     // Catch: java.lang.Throwable -> L3f
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r0 = move-exception
            r11 = r0
            em5 r5 = new em5
            r5.<init>(r11)
        L46:
            boolean r11 = r5 instanceof defpackage.em5
            if (r11 == 0) goto L4b
            goto L4c
        L4b:
            r1 = r5
        L4c:
            lx5 r1 = (defpackage.lx5) r1
            return r1
    }

    public static defpackage.uz5 K(java.io.InputStream r14) {
            r0 = 0
            bg1 r1 = new bg1     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L5b
            r14 = 352(0x160, float:4.93E-43)
            r2 = 0
            byte[] r14 = r1.i(r2, r14)     // Catch: java.lang.Throwable -> L5b
            if (r14 != 0) goto L11
            goto L134
        L11:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L5b
            java.nio.charset.Charset r4 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L5b
            r5 = 4
            r6 = 12
            r3.<init>(r14, r6, r5, r4)     // Catch: java.lang.Throwable -> L5b
            r4 = 32
            int r6 = t(r14, r4)     // Catch: java.lang.Throwable -> L5b
            r7 = 44
            int r7 = t(r14, r7)     // Catch: java.lang.Throwable -> L5b
            if (r7 < 0) goto L134
            r8 = 3931649(0x3bfe01, float:5.509414E-39)
            if (r7 >= r8) goto L134
            r9 = 48
            int r9 = t(r14, r9)     // Catch: java.lang.Throwable -> L5b
            r10 = 60
            int r10 = t(r14, r10)     // Catch: java.lang.Throwable -> L5b
            if (r10 < 0) goto L134
            if (r10 >= r8) goto L134
            r8 = 104(0x68, float:1.46E-43)
            int r8 = t(r14, r8)     // Catch: java.lang.Throwable -> L5b
            r11 = 18
            r11 = r14[r11]     // Catch: java.lang.Throwable -> L5b
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 3
            r13 = 1
            if (r11 != r12) goto L7b
            r11 = 564(0x234, float:7.9E-43)
            byte[] r5 = r1.i(r11, r5)     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L5e
            int r5 = t(r5, r2)     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r14 = move-exception
            goto L135
        L5e:
            r5 = r2
        L5f:
            r11 = 196612(0x30004, float:2.75512E-40)
            if (r5 == r11) goto L7a
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L5b
            if (r5 <= 0) goto L7b
            char r5 = r3.charAt(r2)     // Catch: java.lang.Throwable -> L5b
            r11 = 72
            if (r5 == r11) goto L7a
            char r3 = r3.charAt(r2)     // Catch: java.lang.Throwable -> L5b
            r5 = 75
            if (r3 != r5) goto L7b
        L7a:
            r2 = r13
        L7b:
            a06 r3 = new a06     // Catch: java.lang.Throwable -> L5b
            zz5 r5 = defpackage.zz5.ARM9     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r6, r7, r5)     // Catch: java.lang.Throwable -> L5b
            a06 r5 = new a06     // Catch: java.lang.Throwable -> L5b
            zz5 r6 = defpackage.zz5.ARM7     // Catch: java.lang.Throwable -> L5b
            r5.<init>(r9, r10, r6)     // Catch: java.lang.Throwable -> L5b
            a06 r6 = new a06     // Catch: java.lang.Throwable -> L5b
            zz5 r7 = defpackage.zz5.BANNER     // Catch: java.lang.Throwable -> L5b
            r9 = 2560(0xa00, float:3.587E-42)
            r6.<init>(r8, r9, r7)     // Catch: java.lang.Throwable -> L5b
            a06[] r3 = new defpackage.a06[]{r3, r5, r6}     // Catch: java.lang.Throwable -> L5b
            java.util.List r3 = defpackage.hf.c0(r3)     // Catch: java.lang.Throwable -> L5b
            tp5 r5 = new tp5     // Catch: java.lang.Throwable -> L5b
            r6 = 5
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L5b
            java.util.List r3 = defpackage.gt0.d1(r3, r5)     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L5b
            r5 = r0
            r6 = r5
            r7 = r6
        Lab:
            boolean r8 = r3.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r8 == 0) goto Le0
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L5b
            a06 r8 = (defpackage.a06) r8     // Catch: java.lang.Throwable -> L5b
            int r9 = r8.a     // Catch: java.lang.Throwable -> L5b
            int r10 = r8.b     // Catch: java.lang.Throwable -> L5b
            byte[] r9 = r1.i(r9, r10)     // Catch: java.lang.Throwable -> L5b
            if (r9 != 0) goto Lc3
            goto L134
        Lc3:
            zz5 r8 = r8.c     // Catch: java.lang.Throwable -> L5b
            int[] r10 = defpackage.b06.a     // Catch: java.lang.Throwable -> L5b
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L5b
            r8 = r10[r8]     // Catch: java.lang.Throwable -> L5b
            if (r8 == r13) goto Lde
            r10 = 2
            if (r8 == r10) goto Ldc
            if (r8 != r12) goto Ld6
            r7 = r9
            goto Lab
        Ld6:
            ug r14 = new ug     // Catch: java.lang.Throwable -> L5b
            r14.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r14     // Catch: java.lang.Throwable -> L5b
        Ldc:
            r6 = r9
            goto Lab
        Lde:
            r5 = r9
            goto Lab
        Le0:
            if (r5 != 0) goto Le3
            goto L134
        Le3:
            if (r6 != 0) goto Le6
            goto L134
        Le6:
            if (r7 != 0) goto Le9
            goto L134
        Le9:
            vr4 r1 = Y(r7)     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto Lf4
            java.lang.Object r3 = r1.A     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5b
            goto Lf5
        Lf4:
            r3 = r0
        Lf5:
            java.lang.String r8 = ""
            if (r3 != 0) goto Lfa
            r3 = r8
        Lfa:
            if (r1 == 0) goto L101
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5b
            goto L102
        L101:
            r1 = r0
        L102:
            if (r1 != 0) goto L105
            goto L106
        L105:
            r8 = r1
        L106:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L5b
            r1.update(r14)     // Catch: java.lang.Throwable -> L5b
            r1.update(r5)     // Catch: java.lang.Throwable -> L5b
            r1.update(r6)     // Catch: java.lang.Throwable -> L5b
            r1.update(r7)     // Catch: java.lang.Throwable -> L5b
            byte[] r14 = r1.digest()     // Catch: java.lang.Throwable -> L5b
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r13, r14)     // Catch: java.lang.Throwable -> L5b
            r14 = 16
            java.lang.String r14 = r1.toString(r14)     // Catch: java.lang.Throwable -> L5b
            r14.getClass()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r14 = defpackage.qs6.B0(r4, r14)     // Catch: java.lang.Throwable -> L5b
            uz5 r1 = new uz5     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r3, r8, r14, r2)     // Catch: java.lang.Throwable -> L5b
            goto L13a
        L134:
            return r0
        L135:
            em5 r1 = new em5
            r1.<init>(r14)
        L13a:
            boolean r14 = r1 instanceof defpackage.em5
            if (r14 == 0) goto L13f
            goto L140
        L13f:
            r0 = r1
        L140:
            uz5 r0 = (defpackage.uz5) r0
            return r0
    }

    public static final defpackage.of5 L(defpackage.eb r4) {
            java.lang.Object r0 = r4.L
            vs4 r0 = (defpackage.vs4) r0
            java.lang.Object r0 = r0.getValue()
            jk4 r0 = (defpackage.jk4) r0
            long r0 = r0.a
            java.lang.Object r2 = r4.R
            vs4 r2 = (defpackage.vs4) r2
            java.lang.Object r2 = r2.getValue()
            jk4 r2 = (defpackage.jk4) r2
            long r2 = r2.a
            long r0 = defpackage.jk4.f(r0, r2)
            java.lang.Object r4 = r4.B
            vs4 r4 = (defpackage.vs4) r4
            java.lang.Object r4 = r4.getValue()
            xi6 r4 = (defpackage.xi6) r4
            long r2 = r4.a
            of5 r4 = defpackage.kj2.b(r0, r2)
            return r4
    }

    public static java.io.File M(android.content.Context r5) {
            java.io.File r5 = r5.getCacheDir()
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".font"
            r1.<init>(r2)
            int r2 = android.os.Process.myPid()
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            int r3 = android.os.Process.myTid()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
        L2a:
            r3 = 100
            if (r2 >= r3) goto L4c
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r5, r4)
            boolean r4 = r3.createNewFile()     // Catch: java.io.IOException -> L49
            if (r4 == 0) goto L49
            return r3
        L49:
            int r2 = r2 + 1
            goto L2a
        L4c:
            return r0
    }

    public static final boolean N(int r1) {
            int r1 = java.lang.Character.getType(r1)
            r0 = 23
            if (r1 == r0) goto L23
            r0 = 20
            if (r1 == r0) goto L23
            r0 = 22
            if (r1 == r0) goto L23
            r0 = 30
            if (r1 == r0) goto L23
            r0 = 29
            if (r1 == r0) goto L23
            r0 = 24
            if (r1 == r0) goto L23
            r0 = 21
            if (r1 != r0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }

    public static final boolean O(defpackage.p27 r5, boolean r6) {
            jt3 r0 = r5.d
            if (r0 == 0) goto L40
            jk3 r0 = r0.c()
            if (r0 == 0) goto L40
            of5 r0 = defpackage.uj2.f0(r0)
            long r5 = r5.l(r6)
            float r1 = r0.a
            float r2 = r0.c
            r3 = 32
            long r3 = r5 >> r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L40
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 > 0) goto L40
            float r1 = r0.b
            float r0 = r0.d
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r2
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 > 0) goto L40
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L40
            r5 = 1
            return r5
        L40:
            r5 = 0
            return r5
    }

    public static final boolean P(int r1) {
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto Ld
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 != r0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public static final boolean Q(int r2) {
            boolean r0 = P(r2)
            if (r0 == 0) goto L19
            int r0 = java.lang.Character.getType(r2)
            r1 = 14
            if (r0 == r1) goto L19
            r1 = 13
            if (r0 == r1) goto L19
            r0 = 10
            if (r2 != r0) goto L17
            goto L19
        L17:
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public static final defpackage.p75 R(defpackage.o75 r21) {
            r0 = r21
            r0.getClass()
            p75 r1 = new p75
            r3 = r1
            long r1 = r0.a
            r5 = r3
            long r3 = r0.b
            r7 = r5
            long r5 = r0.c
            java.lang.Integer r8 = r0.d
            r9 = 0
            if (r8 == 0) goto L1a
            int r8 = r8.intValue()
            goto L1b
        L1a:
            r8 = r9
        L1b:
            java.lang.Integer r10 = r0.e
            if (r10 == 0) goto L25
            int r10 = r10.intValue()
            r11 = r9
            goto L27
        L25:
            r10 = r9
            r11 = r10
        L27:
            java.lang.String r9 = r0.f
            r12 = r7
            r7 = r8
            r8 = r10
            java.lang.String r10 = r0.g
            r13 = r11
            int r11 = r0.h
            r14 = r12
            int r12 = r0.i
            java.net.URL r15 = r0.j
            java.lang.String r15 = r15.toString()
            r15.getClass()
            java.net.URL r13 = r0.k
            java.lang.String r13 = r13.toString()
            r13.getClass()
            r17 = r14
            r14 = r13
            r13 = r15
            java.lang.String r15 = r0.l
            n75 r0 = r0.m
            int[] r18 = defpackage.q75.a
            int r0 = r0.ordinal()
            r0 = r18[r0]
            r19 = r1
            r1 = 1
            if (r0 == r1) goto L6a
            r2 = 2
            if (r0 != r2) goto L65
            r16 = r1
        L60:
            r0 = r17
            r1 = r19
            goto L6d
        L65:
            defpackage.i.d()
            r0 = 0
            return r0
        L6a:
            r16 = 0
            goto L60
        L6d:
            r0.<init>(r1, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    public static final defpackage.o75 S(defpackage.p75 r20) {
            r0 = r20
            r0.getClass()
            o75 r1 = new o75
            r3 = r1
            long r1 = r0.a
            r5 = r3
            long r3 = r0.b
            r7 = r5
            long r5 = r0.c
            int r8 = r0.d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = r0.e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = r7
            r7 = r8
            r8 = r9
            java.lang.String r9 = r0.f
            r11 = r10
            java.lang.String r10 = r0.g
            r12 = r11
            int r11 = r0.h
            r13 = r12
            int r12 = r0.i
            r14 = r13
            java.net.URL r13 = new java.net.URL
            java.lang.String r15 = r0.j
            r13.<init>(r15)
            r15 = r14
            java.net.URL r14 = new java.net.URL
            r16 = r1
            java.lang.String r1 = r0.k
            r14.<init>(r1)
            r1 = r15
            java.lang.String r15 = r0.l
            int r0 = r0.m
            if (r0 == 0) goto L5b
            r2 = 1
            if (r0 != r2) goto L50
            n75 r0 = defpackage.n75.UNOFFICIAL
        L48:
            r18 = r16
            r16 = r0
            r0 = r1
            r1 = r18
            goto L5e
        L50:
            java.lang.String r1 = "Unknown achievement type: "
            java.lang.String r0 = defpackage.lb1.g(r0, r1)
            defpackage.fa6.h(r0)
            r0 = 0
            return r0
        L5b:
            n75 r0 = defpackage.n75.CORE
            goto L48
        L5e:
            r0.<init>(r1, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r15 = r0
            return r15
    }

    public static java.nio.MappedByteBuffer T(android.content.Context r8, android.net.Uri r9) {
            android.content.ContentResolver r8 = r8.getContentResolver()
            r1 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r9, r0, r1)     // Catch: java.io.IOException -> L4c
            if (r8 != 0) goto L13
            if (r8 == 0) goto L4c
            r8.close()     // Catch: java.io.IOException -> L4c
            return r1
        L13:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33
            java.io.FileDescriptor r0 = r8.getFileDescriptor()     // Catch: java.lang.Throwable -> L33
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L33
            java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch: java.lang.Throwable -> L36
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L36
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L36
            r4 = 0
            java.nio.MappedByteBuffer r0 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L36
            r9.close()     // Catch: java.lang.Throwable -> L33
            r8.close()     // Catch: java.io.IOException -> L4c
            return r0
        L33:
            r0 = move-exception
            r9 = r0
            goto L42
        L36:
            r0 = move-exception
            r2 = r0
            r9.close()     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r0 = move-exception
            r9 = r0
            r2.addSuppressed(r9)     // Catch: java.lang.Throwable -> L33
        L41:
            throw r2     // Catch: java.lang.Throwable -> L33
        L42:
            r8.close()     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r0 = move-exception
            r8 = r0
            r9.addSuppressed(r8)     // Catch: java.io.IOException -> L4c
        L4b:
            throw r9     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
    }

    public static final long U(long r6, long r8) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r8 >> r0
            int r2 = (int) r2
            float r2 = (float) r2
            float r1 = r1 + r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r8 & r2
            int r7 = (int) r7
            float r7 = (float) r7
            float r6 = r6 + r7
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r8 = r4 & r2
            long r6 = r6 | r8
            return r6
    }

    public static final void V(android.view.ViewStructure r38, defpackage.sm3 r39, android.view.autofill.AutofillId r40, java.lang.String r41, defpackage.rf5 r42) {
            r0 = r38
            r1 = r39
            fb6 r2 = defpackage.bb6.a
            fb6 r2 = defpackage.sa6.a
            ta6 r2 = r1.x()
            r8 = 2
            r11 = 8
            r14 = 1
            if (r2 == 0) goto L1a0
            ja4 r2 = r2.A
            if (r2 == 0) goto L1a0
            java.lang.Object[] r15 = r2.b
            r16 = 128(0x80, double:6.3E-322)
            java.lang.Object[] r3 = r2.c
            long[] r2 = r2.a
            int r4 = r2.length
            int r4 = r4 - r8
            r31 = r8
            if (r4 < 0) goto L179
            r28 = r14
            r5 = 0
            r6 = 0
            r18 = 255(0xff, double:1.26E-321)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 7
        L3e:
            r7 = r2[r5]
            r32 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = ~r7
            long r9 = r9 << r30
            long r9 = r9 & r7
            long r9 = r9 & r32
            int r9 = (r9 > r32 ? 1 : (r9 == r32 ? 0 : -1))
            if (r9 == 0) goto L173
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        L57:
            if (r10 >= r9) goto L171
            long r34 = r7 & r18
            int r34 = (r34 > r16 ? 1 : (r34 == r16 ? 0 : -1))
            if (r34 >= 0) goto L16c
            int r34 = r5 << 3
            int r34 = r34 + r10
            r35 = r15[r34]
            r34 = r3[r34]
            r12 = r35
            fb6 r12 = (defpackage.fb6) r12
            fb6 r13 = defpackage.bb6.s
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L7c
            r34.getClass()
            r6 = r34
            rf r6 = (defpackage.rf) r6
            goto L16c
        L7c:
            fb6 r13 = defpackage.bb6.a
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L96
            r34.getClass()
            java.util.List r34 = (java.util.List) r34
            java.lang.Object r12 = defpackage.gt0.J0(r34)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L16c
            r0.setContentDescription(r12)
            goto L16c
        L96:
            fb6 r13 = defpackage.bb6.r
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto La7
            r34.getClass()
            r24 = r34
            d41 r24 = (defpackage.d41) r24
            goto L16c
        La7:
            fb6 r13 = defpackage.bb6.t
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto Lb8
            r34.getClass()
            r23 = r34
            oh r23 = (defpackage.oh) r23
            goto L16c
        Lb8:
            fb6 r13 = defpackage.bb6.G
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto Lc9
            r34.getClass()
            r22 = r34
            fp r22 = (defpackage.fp) r22
            goto L16c
        Lc9:
            fb6 r13 = defpackage.bb6.l
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto Ldf
            r34.getClass()
            java.lang.Boolean r34 = (java.lang.Boolean) r34
            boolean r12 = r34.booleanValue()
            r0.setFocused(r12)
            goto L16c
        Ldf:
            fb6 r13 = defpackage.bb6.P
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto Lf0
            r34.getClass()
            r29 = r34
            java.lang.Integer r29 = (java.lang.Integer) r29
            goto L16c
        Lf0:
            fb6 r13 = defpackage.bb6.L
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto Lfc
            r27 = r14
            goto L16c
        Lfc:
            fb6 r13 = defpackage.bb6.o
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L10e
            r34.getClass()
            java.lang.Boolean r34 = (java.lang.Boolean) r34
            boolean r28 = r34.booleanValue()
            goto L16c
        L10e:
            fb6 r13 = defpackage.bb6.z
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L11e
            r34.getClass()
            r26 = r34
            mq5 r26 = (defpackage.mq5) r26
            goto L16c
        L11e:
            fb6 r13 = defpackage.bb6.J
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L12e
            r34.getClass()
            r25 = r34
            java.lang.Boolean r25 = (java.lang.Boolean) r25
            goto L16c
        L12e:
            fb6 r13 = defpackage.bb6.K
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L13e
            r34.getClass()
            r21 = r34
            a87 r21 = (defpackage.a87) r21
            goto L16c
        L13e:
            fb6 r13 = defpackage.sa6.b
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L14a
            r0.setClickable(r14)
            goto L16c
        L14a:
            fb6 r13 = defpackage.sa6.c
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L156
            r0.setLongClickable(r14)
            goto L16c
        L156:
            fb6 r13 = defpackage.sa6.w
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L162
            r0.setFocusable(r14)
            goto L16c
        L162:
            fb6 r13 = defpackage.sa6.k
            boolean r12 = defpackage.nb3.k(r12, r13)
            if (r12 == 0) goto L16c
            r20 = r14
        L16c:
            long r7 = r7 >> r11
            int r10 = r10 + 1
            goto L57
        L171:
            if (r9 != r11) goto L197
        L173:
            if (r5 == r4) goto L197
            int r5 = r5 + 1
            goto L3e
        L179:
            r18 = 255(0xff, double:1.26E-321)
            r30 = 7
            r32 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r28 = r14
            r6 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        L197:
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r26
            goto L1be
        L1a0:
            r31 = r8
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r30 = 7
            r32 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r28 = r14
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r20 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r29 = 0
        L1be:
            ta6 r7 = r1.x()
            if (r7 == 0) goto L212
            boolean r8 = r7.L
            if (r8 == 0) goto L212
            boolean r8 = r7.R
            if (r8 == 0) goto L1cd
            goto L212
        L1cd:
            ta6 r7 = r7.b()
            ca4 r8 = new ca4
            java.util.List r9 = r1.n()
            aa4 r9 = (defpackage.aa4) r9
            java.lang.Object r9 = r9.B
            ua4 r9 = (defpackage.ua4) r9
            int r9 = r9.L
            r8.<init>(r9)
            java.util.List r9 = r1.n()
            r8.c(r9)
        L1e9:
            boolean r9 = r8.i()
            if (r9 == 0) goto L212
            int r9 = r8.b
            int r9 = r9 - r14
            java.lang.Object r9 = r8.k(r9)
            sm3 r9 = (defpackage.sm3) r9
            ta6 r10 = r9.x()
            if (r10 == 0) goto L1e9
            boolean r12 = r10.L
            if (r12 == 0) goto L203
            goto L1e9
        L203:
            r7.d(r10)
            boolean r10 = r10.R
            if (r10 != 0) goto L1e9
            java.util.List r9 = r9.n()
            r8.c(r9)
            goto L1e9
        L212:
            if (r7 == 0) goto L29d
            ja4 r7 = r7.A
            if (r7 == 0) goto L29d
            java.lang.Object[] r8 = r7.b
            java.lang.Object[] r9 = r7.c
            long[] r7 = r7.a
            int r10 = r7.length
            int r10 = r10 + (-2)
            r21 = r14
            if (r10 < 0) goto L29f
            r12 = 0
            r13 = 0
        L227:
            r14 = r7[r12]
            r22 = r11
            r23 = r12
            long r11 = ~r14
            long r11 = r11 << r30
            long r11 = r11 & r14
            long r11 = r11 & r32
            int r11 = (r11 > r32 ? 1 : (r11 == r32 ? 0 : -1))
            if (r11 == 0) goto L28c
            int r12 = r23 - r10
            int r11 = ~r12
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L23f:
            if (r12 >= r11) goto L281
            long r36 = r14 & r18
            int r26 = (r36 > r16 ? 1 : (r36 == r16 ? 0 : -1))
            if (r26 >= 0) goto L274
            int r26 = r23 << 3
            int r26 = r26 + r12
            r34 = r8[r26]
            r26 = r9[r26]
            r36 = r7
            r7 = r34
            fb6 r7 = (defpackage.fb6) r7
            r34 = r8
            fb6 r8 = defpackage.bb6.j
            boolean r8 = defpackage.nb3.k(r7, r8)
            if (r8 == 0) goto L264
            r8 = 0
            r0.setEnabled(r8)
            goto L278
        L264:
            fb6 r8 = defpackage.bb6.C
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 == 0) goto L278
            r26.getClass()
            r13 = r26
            java.util.List r13 = (java.util.List) r13
            goto L278
        L274:
            r36 = r7
            r34 = r8
        L278:
            long r14 = r14 >> r22
            int r12 = r12 + 1
            r8 = r34
            r7 = r36
            goto L23f
        L281:
            r36 = r7
            r34 = r8
            r7 = r22
            if (r11 != r7) goto L2a0
        L289:
            r8 = r23
            goto L293
        L28c:
            r36 = r7
            r34 = r8
            r7 = r22
            goto L289
        L293:
            if (r8 == r10) goto L2a0
            int r12 = r8 + 1
            r11 = r7
            r8 = r34
            r7 = r36
            goto L227
        L29d:
            r21 = r14
        L29f:
            r13 = 0
        L2a0:
            int r7 = r1.B
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            sm3 r8 = r1.v()
            if (r8 != 0) goto L2ad
            r7 = 0
        L2ad:
            if (r7 == 0) goto L2b6
            int r7 = r7.intValue()
        L2b3:
            r8 = r40
            goto L2b8
        L2b6:
            r7 = -1
            goto L2b3
        L2b8:
            defpackage.au.q(r0, r8, r7)
            r8 = r41
            r9 = 0
            r0.setId(r7, r8, r9, r9)
            if (r6 == 0) goto L2ca
            int r6 = r6.a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            goto L2d9
        L2ca:
            if (r20 == 0) goto L2d1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r21)
            goto L2d9
        L2d1:
            if (r2 == 0) goto L2d8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r31)
            goto L2d9
        L2d8:
            r12 = r9
        L2d9:
            if (r12 == 0) goto L2e2
            int r6 = r12.intValue()
            defpackage.au.p(r0, r6)
        L2e2:
            if (r3 == 0) goto L315
            java.lang.String r3 = r3.B
            int r6 = r3.length()
            r7 = 5000(0x1388, float:7.006E-42)
            if (r6 >= r7) goto L2ef
            goto L30e
        L2ef:
            r6 = 4999(0x1387, float:7.005E-42)
            char r8 = r3.charAt(r6)
            boolean r8 = java.lang.Character.isHighSurrogate(r8)
            if (r8 == 0) goto L30a
            char r8 = r3.charAt(r7)
            boolean r8 = java.lang.Character.isLowSurrogate(r8)
            if (r8 == 0) goto L30a
            java.lang.String r3 = defpackage.qs6.S0(r6, r3)
            goto L30e
        L30a:
            java.lang.String r3 = defpackage.qs6.S0(r7, r3)
        L30e:
            android.view.autofill.AutofillValue r3 = defpackage.au.d(r3)
            defpackage.au.r(r0, r3)
        L315:
            if (r4 == 0) goto L31c
            android.view.autofill.AutofillValue r3 = r4.a
            defpackage.au.r(r0, r3)
        L31c:
            if (r24 == 0) goto L327
            java.lang.String[] r3 = defpackage.lb4.t(r24)
            if (r3 == 0) goto L327
            defpackage.au.t(r0, r3)
        L327:
            r3 = r42
            ei r3 = r3.b
            int r4 = r1.B
            vz4 r6 = new vz4
            r6.<init>(r0)
            r3.m(r4, r6)
            if (r25 == 0) goto L33e
            boolean r3 = r25.booleanValue()
            r0.setSelected(r3)
        L33e:
            r3 = 4
            if (r2 == 0) goto L351
            r4 = r21
            r0.setCheckable(r4)
            a87 r4 = defpackage.a87.On
            if (r2 != r4) goto L34c
            r2 = 1
            goto L34d
        L34c:
            r2 = 0
        L34d:
            r0.setChecked(r2)
            goto L366
        L351:
            if (r25 == 0) goto L366
            if (r5 != 0) goto L357
        L355:
            r4 = 1
            goto L35c
        L357:
            int r2 = r5.a
            if (r2 != r3) goto L355
            goto L366
        L35c:
            r0.setCheckable(r4)
            boolean r2 = r25.booleanValue()
            r0.setChecked(r2)
        L366:
            c41 r2 = defpackage.d41.a
            r2.getClass()
            sf r2 = defpackage.c41.c
            java.lang.String[] r2 = defpackage.lb4.t(r2)
            java.lang.Object r2 = defpackage.fv.D0(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r24 == 0) goto L38a
            java.lang.String[] r4 = defpackage.lb4.t(r24)
            if (r4 == 0) goto L38a
            boolean r2 = defpackage.fv.o0(r4, r2)
            r4 = 1
            if (r2 != r4) goto L388
            r2 = r4
            goto L38c
        L388:
            r2 = 0
            goto L38c
        L38a:
            r4 = 1
            goto L388
        L38c:
            if (r27 != 0) goto L393
            if (r2 == 0) goto L391
            goto L393
        L391:
            r2 = 0
            goto L394
        L393:
            r2 = r4
        L394:
            if (r2 != 0) goto L39b
            if (r28 == 0) goto L399
            goto L39b
        L399:
            r14 = 0
            goto L39c
        L39b:
            r14 = r4
        L39c:
            defpackage.au.s(r0, r14)
            if0 r4 = r1.B0
            java.lang.Object r4 = r4.e
            eg4 r4 = (defpackage.eg4) r4
            boolean r4 = r4.g1()
            if (r4 == 0) goto L3ac
            goto L3ad
        L3ac:
            r3 = 0
        L3ad:
            r0.setVisibility(r3)
            if (r13 == 0) goto L3d8
            int r3 = r13.size()
            java.lang.String r4 = ""
            r6 = 0
        L3b9:
            if (r6 >= r3) goto L3d0
            java.lang.Object r7 = r13.get(r6)
            fp r7 = (defpackage.fp) r7
            java.lang.StringBuilder r4 = defpackage.lb1.s(r4)
            java.lang.String r7 = r7.B
            r8 = 10
            java.lang.String r4 = defpackage.lb1.q(r4, r7, r8)
            int r6 = r6 + 1
            goto L3b9
        L3d0:
            r0.setText(r4)
            java.lang.String r3 = "android.widget.TextView"
            r0.setClassName(r3)
        L3d8:
            java.util.List r1 = r1.n()
            aa4 r1 = (defpackage.aa4) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3f1
            if (r5 == 0) goto L3f1
            int r1 = r5.a
            java.lang.String r1 = defpackage.ln2.d0(r1)
            if (r1 == 0) goto L3f1
            r0.setClassName(r1)
        L3f1:
            if (r20 == 0) goto L40c
            java.lang.String r1 = "android.widget.EditText"
            r0.setClassName(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 < r3) goto L407
            if (r29 == 0) goto L407
            int r1 = r29.intValue()
            defpackage.j2.s(r0, r1)
        L407:
            if (r2 == 0) goto L40c
            defpackage.au.o(r0)
        L40c:
            return
    }

    public static defpackage.zz3 W(defpackage.fy7 r2) {
            if (r2 != 0) goto La
            long r0 = java.lang.System.nanoTime()
            fy7 r2 = defpackage.yh2.d(r0)
        La:
            java.util.List r0 = defpackage.zz3.b
            r1 = 3
            byte[] r1 = new byte[r1]
            byte[] r2 = r2.b(r1)
            af7 r1 = new af7
            r1.<init>(r2)
            java.util.List r2 = defpackage.gt0.k1(r1)
            java.util.ArrayList r2 = defpackage.gt0.V0(r0, r2)
            zz3 r0 = new zz3
            r0.<init>(r2)
            return r0
    }

    public static defpackage.qy6 X(defpackage.e36 r31, java.lang.String r32) {
            r0 = r31
            r1 = r32
            r0.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "PRAGMA table_info(`"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = "`)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            j36 r2 = r0.i0(r2)
            boolean r4 = r2.f0()     // Catch: java.lang.Throwable -> L32
            r5 = 0
            java.lang.String r7 = "name"
            r10 = 0
            if (r4 != 0) goto L36
            zt1 r4 = defpackage.zt1.A     // Catch: java.lang.Throwable -> L32
            defpackage.lb4.p(r2, r10)
            r23 = r5
            goto La0
        L32:
            r0 = move-exception
            r1 = r0
            goto L204
        L36:
            int r4 = defpackage.ej2.s(r2, r7)     // Catch: java.lang.Throwable -> L32
            java.lang.String r11 = "type"
            int r11 = defpackage.ej2.s(r2, r11)     // Catch: java.lang.Throwable -> L32
            java.lang.String r12 = "notnull"
            int r12 = defpackage.ej2.s(r2, r12)     // Catch: java.lang.Throwable -> L32
            java.lang.String r13 = "pk"
            int r13 = defpackage.ej2.s(r2, r13)     // Catch: java.lang.Throwable -> L32
            java.lang.String r14 = "dflt_value"
            int r14 = defpackage.ej2.s(r2, r14)     // Catch: java.lang.Throwable -> L32
            p04 r15 = new p04     // Catch: java.lang.Throwable -> L32
            r15.<init>()     // Catch: java.lang.Throwable -> L32
        L57:
            java.lang.String r17 = r2.R(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r18 = r2.R(r11)     // Catch: java.lang.Throwable -> L32
            long r19 = r2.getLong(r12)     // Catch: java.lang.Throwable -> L32
            int r16 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r16 == 0) goto L6c
            r19 = 1
        L69:
            r23 = r5
            goto L6f
        L6c:
            r19 = 0
            goto L69
        L6f:
            long r5 = r2.getLong(r13)     // Catch: java.lang.Throwable -> L32
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L32
            boolean r6 = r2.isNull(r14)     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L7d
            r21 = r10
            goto L83
        L7d:
            java.lang.String r6 = r2.R(r14)     // Catch: java.lang.Throwable -> L32
            r21 = r6
        L83:
            ny6 r16 = new ny6     // Catch: java.lang.Throwable -> L32
            r22 = 2
            r20 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L32
            r6 = r16
            r5 = r17
            r15.put(r5, r6)     // Catch: java.lang.Throwable -> L32
            boolean r5 = r2.f0()     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L200
            p04 r4 = r15.b()     // Catch: java.lang.Throwable -> L32
            defpackage.lb4.p(r2, r10)
        La0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "PRAGMA foreign_key_list(`"
            r2.<init>(r5)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            j36 r2 = r0.i0(r2)
            java.lang.String r5 = "id"
            int r5 = defpackage.ej2.s(r2, r5)     // Catch: java.lang.Throwable -> L125
            java.lang.String r6 = "seq"
            int r6 = defpackage.ej2.s(r2, r6)     // Catch: java.lang.Throwable -> L125
            java.lang.String r11 = "table"
            int r11 = defpackage.ej2.s(r2, r11)     // Catch: java.lang.Throwable -> L125
            java.lang.String r12 = "on_delete"
            int r12 = defpackage.ej2.s(r2, r12)     // Catch: java.lang.Throwable -> L125
            java.lang.String r13 = "on_update"
            int r13 = defpackage.ej2.s(r2, r13)     // Catch: java.lang.Throwable -> L125
            java.util.List r14 = defpackage.qo2.G(r2)     // Catch: java.lang.Throwable -> L125
            r2.reset()     // Catch: java.lang.Throwable -> L125
            ad6 r15 = new ad6     // Catch: java.lang.Throwable -> L125
            r15.<init>()     // Catch: java.lang.Throwable -> L125
        Ldf:
            boolean r16 = r2.f0()     // Catch: java.lang.Throwable -> L125
            if (r16 == 0) goto L16e
            long r16 = r2.getLong(r6)     // Catch: java.lang.Throwable -> L125
            int r16 = (r16 > r23 ? 1 : (r16 == r23 ? 0 : -1))
            if (r16 == 0) goto Lee
            goto Ldf
        Lee:
            long r8 = r2.getLong(r5)     // Catch: java.lang.Throwable -> L125
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L125
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L125
            r9.<init>()     // Catch: java.lang.Throwable -> L125
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L125
            r10.<init>()     // Catch: java.lang.Throwable -> L125
            r19 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L125
            r5.<init>()     // Catch: java.lang.Throwable -> L125
            java.util.Iterator r20 = r14.iterator()     // Catch: java.lang.Throwable -> L125
        L108:
            boolean r21 = r20.hasNext()     // Catch: java.lang.Throwable -> L125
            if (r21 == 0) goto L129
            r21 = r6
            java.lang.Object r6 = r20.next()     // Catch: java.lang.Throwable -> L125
            r22 = r14
            r14 = r6
            yj2 r14 = (defpackage.yj2) r14     // Catch: java.lang.Throwable -> L125
            int r14 = r14.A     // Catch: java.lang.Throwable -> L125
            if (r14 != r8) goto L120
            r5.add(r6)     // Catch: java.lang.Throwable -> L125
        L120:
            r6 = r21
            r14 = r22
            goto L108
        L125:
            r0 = move-exception
            r1 = r0
            goto L1fa
        L129:
            r21 = r6
            r22 = r14
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L125
            r8 = 0
        L132:
            if (r8 >= r6) goto L14b
            java.lang.Object r14 = r5.get(r8)     // Catch: java.lang.Throwable -> L125
            int r8 = r8 + 1
            yj2 r14 = (defpackage.yj2) r14     // Catch: java.lang.Throwable -> L125
            r20 = r5
            java.lang.String r5 = r14.L     // Catch: java.lang.Throwable -> L125
            r9.add(r5)     // Catch: java.lang.Throwable -> L125
            java.lang.String r5 = r14.R     // Catch: java.lang.Throwable -> L125
            r10.add(r5)     // Catch: java.lang.Throwable -> L125
            r5 = r20
            goto L132
        L14b:
            oy6 r25 = new oy6     // Catch: java.lang.Throwable -> L125
            java.lang.String r26 = r2.R(r11)     // Catch: java.lang.Throwable -> L125
            java.lang.String r27 = r2.R(r12)     // Catch: java.lang.Throwable -> L125
            java.lang.String r28 = r2.R(r13)     // Catch: java.lang.Throwable -> L125
            r29 = r9
            r30 = r10
            r25.<init>(r26, r27, r28, r29, r30)     // Catch: java.lang.Throwable -> L125
            r5 = r25
            r15.add(r5)     // Catch: java.lang.Throwable -> L125
            r5 = r19
            r6 = r21
            r14 = r22
            r10 = 0
            goto Ldf
        L16e:
            ad6 r5 = defpackage.ii2.p(r15)     // Catch: java.lang.Throwable -> L125
            r6 = 0
            defpackage.lb4.p(r2, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "PRAGMA index_list(`"
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            j36 r2 = r0.i0(r2)
            int r3 = defpackage.ej2.s(r2, r7)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r6 = "origin"
            int r6 = defpackage.ej2.s(r2, r6)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r7 = "unique"
            int r7 = defpackage.ej2.s(r2, r7)     // Catch: java.lang.Throwable -> L1dd
            r8 = -1
            if (r3 == r8) goto L1a2
            if (r6 == r8) goto L1a2
            if (r7 != r8) goto L1a4
        L1a2:
            r6 = 0
            goto L1ea
        L1a4:
            ad6 r8 = new ad6     // Catch: java.lang.Throwable -> L1dd
            r8.<init>()     // Catch: java.lang.Throwable -> L1dd
        L1a9:
            boolean r9 = r2.f0()     // Catch: java.lang.Throwable -> L1dd
            if (r9 == 0) goto L1e0
            java.lang.String r9 = r2.R(r6)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r10 = "c"
            boolean r9 = r10.equals(r9)     // Catch: java.lang.Throwable -> L1dd
            if (r9 != 0) goto L1bc
            goto L1a9
        L1bc:
            java.lang.String r9 = r2.R(r3)     // Catch: java.lang.Throwable -> L1dd
            long r10 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L1dd
            r12 = 1
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L1cc
            r10 = 1
            goto L1cd
        L1cc:
            r10 = 0
        L1cd:
            py6 r9 = defpackage.qo2.H(r0, r9, r10)     // Catch: java.lang.Throwable -> L1dd
            if (r9 != 0) goto L1d9
            r10 = 0
            defpackage.lb4.p(r2, r10)
            r10 = 0
            goto L1ee
        L1d9:
            r8.add(r9)     // Catch: java.lang.Throwable -> L1dd
            goto L1a9
        L1dd:
            r0 = move-exception
            r1 = r0
            goto L1f4
        L1e0:
            ad6 r0 = defpackage.ii2.p(r8)     // Catch: java.lang.Throwable -> L1dd
            r6 = 0
            defpackage.lb4.p(r2, r6)
            r10 = r0
            goto L1ee
        L1ea:
            defpackage.lb4.p(r2, r6)
            r10 = r6
        L1ee:
            qy6 r0 = new qy6
            r0.<init>(r1, r4, r5, r10)
            return r0
        L1f4:
            throw r1     // Catch: java.lang.Throwable -> L1f5
        L1f5:
            r0 = move-exception
            defpackage.lb4.p(r2, r1)
            throw r0
        L1fa:
            throw r1     // Catch: java.lang.Throwable -> L1fb
        L1fb:
            r0 = move-exception
            defpackage.lb4.p(r2, r1)
            throw r0
        L200:
            r5 = r23
            goto L57
        L204:
            throw r1     // Catch: java.lang.Throwable -> L205
        L205:
            r0 = move-exception
            defpackage.lb4.p(r2, r1)
            throw r0
    }

    public static defpackage.vr4 Y(byte[] r11) {
            int r0 = r11.length
            r1 = 832(0x340, float:1.166E-42)
            if (r0 >= r1) goto L7
            goto Lc6
        L7:
            r0 = 0
            r0 = r11[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 1
            r3 = r11[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r3 = r3 | r0
            short r3 = (short) r3
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            if (r2 > r3) goto L20
            r4 = 772(0x304, float:1.082E-42)
            if (r3 >= r4) goto L20
            goto L25
        L20:
            if (r2 > r0) goto Lc6
            r2 = 4
            if (r0 >= r2) goto Lc6
        L25:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0 = 576(0x240, float:8.07E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 1088(0x440, float:1.525E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 1344(0x540, float:1.883E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 1600(0x640, float:2.242E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 1856(0x740, float:2.601E-42)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r0 = 2112(0x840, float:2.96E-42)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = 2368(0x940, float:3.318E-42)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r0 = defpackage.hf.c0(r0)
            java.util.Iterator r0 = r0.iterator()
        L5f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc6
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r2 = r11.length
            int r3 = r1 + 256
            if (r2 < r3) goto L5f
            byte[] r1 = defpackage.fv.x0(r11, r1, r3)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            r2.getClass()
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r2)
            java.lang.CharSequence r1 = defpackage.qs6.T0(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "\u0000"
            java.lang.String r3 = ""
            java.lang.String r1 = defpackage.xs6.e0(r1, r2, r3)
            boolean r2 = defpackage.qs6.v0(r1)
            if (r2 != 0) goto L5f
            r2 = 10
            java.lang.String r4 = defpackage.qs6.R0(r2, r1, r1)
            java.lang.String r5 = "\n"
            java.lang.String r6 = " "
            java.lang.String r4 = defpackage.xs6.e0(r4, r5, r6)
            java.lang.CharSequence r4 = defpackage.qs6.T0(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = defpackage.qs6.O0(r2, r1, r3)
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)
            java.lang.String r1 = r1.toString()
            boolean r2 = defpackage.qs6.v0(r4)
            if (r2 != 0) goto L5f
            vr4 r11 = new vr4
            r11.<init>(r4, r1)
            return r11
        Lc6:
            r11 = 0
            return r11
    }

    public static final defpackage.gl7 Z(defpackage.e33 r12, defpackage.px0 r13) {
            nq6 r0 = defpackage.ky0.h
            xq2 r13 = (defpackage.xq2) r13
            java.lang.Object r0 = r13.j(r0)
            qh1 r0 = (defpackage.qh1) r0
            int r1 = r12.j
            float r1 = (float) r1
            float r2 = r0.a()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r3 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            r5 = 32
            long r3 = r3 << r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r6
            long r1 = r1 | r3
            boolean r1 = r13.e(r1)
            java.lang.Object r2 = r13.P()
            if (r1 != 0) goto L33
            vs0 r1 = defpackage.ox0.a
            if (r2 != r1) goto Lc6
        L33:
            mu2 r1 = new mu2
            r1.<init>()
            dl7 r2 = r12.f
            z(r1, r2)
            float r2 = r12.b
            float r3 = r12.c
            float r2 = r0.e0(r2)
            float r0 = r0.e0(r3)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r2
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r8 = (long) r0
            long r2 = r2 << r5
            long r8 = r8 & r6
            long r2 = r2 | r8
            float r0 = r12.d
            float r4 = r12.e
            boolean r8 = java.lang.Float.isNaN(r0)
            if (r8 == 0) goto L67
            long r8 = r2 >> r5
            int r0 = (int) r8
            float r0 = java.lang.Float.intBitsToFloat(r0)
        L67:
            boolean r8 = java.lang.Float.isNaN(r4)
            if (r8 == 0) goto L74
            long r8 = r2 & r6
            int r4 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r4)
        L74:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r8 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r4)
            long r10 = (long) r0
            long r4 = r8 << r5
            long r6 = r6 & r10
            long r4 = r4 | r6
            gl7 r0 = new gl7
            r0.<init>(r1)
            java.lang.String r1 = r12.a
            long r6 = r12.g
            int r8 = r12.h
            r9 = 16
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 == 0) goto L99
            z40 r9 = new z40
            r9.<init>(r8, r6)
            goto L9a
        L99:
            r9 = 0
        L9a:
            boolean r12 = r12.i
            xi6 r6 = new xi6
            r6.<init>(r2)
            vs4 r2 = r0.X
            r2.setValue(r6)
            vs4 r2 = r0.Y
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r2.setValue(r12)
            qk7 r12 = r0.Z
            vs4 r2 = r12.g
            r2.setValue(r9)
            vs4 r2 = r12.i
            xi6 r3 = new xi6
            r3.<init>(r4)
            r2.setValue(r3)
            r12.c = r1
            r13.l0(r0)
            r2 = r0
        Lc6:
            gl7 r2 = (defpackage.gl7) r2
            return r2
    }

    public static final void a(java.lang.String r26, defpackage.on2 r27, defpackage.px0 r28, int r29) {
            r0 = r27
            r1 = r29
            r2 = r28
            xq2 r2 = (defpackage.xq2) r2
            r3 = 225368435(0xd6ed973, float:7.3601157E-31)
            r2.d0(r3)
            boolean r3 = r2.h(r0)
            if (r3 == 0) goto L17
            r3 = 32
            goto L19
        L17:
            r3 = 16
        L19:
            r3 = r3 | r1
            r4 = r3 & 19
            r5 = 18
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L24
            r4 = r7
            goto L25
        L24:
            r4 = r6
        L25:
            r3 = r3 & r7
            boolean r3 = r2.S(r3, r4)
            if (r3 == 0) goto Le2
            r3 = 1096810496(0x41600000, float:14.0)
            y16 r4 = defpackage.z16.b(r3)
            x64 r5 = defpackage.x64.a
            a74 r4 = defpackage.u24.g(r5, r4)
            long r8 = defpackage.kt0.d
            r5 = 1046562734(0x3e6147ae, float:0.22)
            long r10 = defpackage.kt0.c(r5, r8)
            jy2 r5 = defpackage.u24.m
            a74 r4 = defpackage.vy7.L(r4, r10, r5)
            r5 = 0
            r10 = 15
            a74 r4 = defpackage.mb3.u(r4, r6, r5, r0, r10)
            r5 = 1090519040(0x41000000, float:8.0)
            a74 r3 = defpackage.ge7.P(r4, r3, r5)
            e40 r4 = defpackage.d90.L
            e34 r4 = defpackage.h70.d(r4, r6)
            long r10 = r2.T
            int r5 = java.lang.Long.hashCode(r10)
            xv4 r10 = r2.l()
            a74 r3 = defpackage.l.E(r2, r3)
            ix0 r11 = defpackage.jx0.i
            r11.getClass()
            iy0 r11 = defpackage.ix0.b
            r2.f0()
            boolean r12 = r2.S
            if (r12 == 0) goto L7a
            r2.k(r11)
            goto L7d
        L7a:
            r2.o0()
        L7d:
            pn r11 = defpackage.ix0.f
            defpackage.yh2.K(r2, r11, r4)
            pn r4 = defpackage.ix0.e
            defpackage.yh2.K(r2, r4, r10)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            pn r5 = defpackage.ix0.g
            defpackage.yh2.K(r2, r5, r4)
            ne r4 = defpackage.ix0.h
            defpackage.yh2.F(r2, r4)
            pn r4 = defpackage.ix0.d
            defpackage.yh2.K(r2, r4, r3)
            r4 = r8
            sr2 r9 = defpackage.qs7.c
            r3 = 12
            long r10 = defpackage.hi2.E(r3)
            oj2 r8 = defpackage.oj2.e0
            r23 = 0
            r24 = 130962(0x1ff92, float:1.83517E-40)
            r3 = 0
            r12 = r6
            r13 = r7
            r6 = r10
            r10 = 0
            r14 = r12
            r12 = 0
            r16 = r13
            r15 = r14
            r13 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r20 = r18
            r18 = 0
            r21 = r19
            r19 = 0
            r22 = r20
            r20 = 0
            r25 = r22
            r22 = 1772934(0x1b0d86, float:2.48441E-39)
            r21 = r2
            r0 = r25
            r2 = r26
            defpackage.x37.b(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r21
            r2.p(r0)
            goto Le5
        Le2:
            r2.V()
        Le5:
            cf5 r0 = r2.t()
            if (r0 == 0) goto Lf7
            in2 r2 = new in2
            r12 = 0
            r3 = r26
            r4 = r27
            r2.<init>(r3, r4, r1, r12)
            r0.d = r2
        Lf7:
            return
    }

    public static final long a0(long r6) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = java.lang.Math.round(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = java.lang.Math.round(r6)
            long r4 = (long) r1
            long r0 = r4 << r0
            long r6 = (long) r6
            long r6 = r6 & r2
            long r6 = r6 | r0
            return r6
    }

    public static final void b(defpackage.pq5 r20, java.lang.String r21, defpackage.on2 r22, defpackage.px0 r23, int r24) {
            r4 = r24
            r20.getClass()
            r22.getClass()
            r8 = r23
            xq2 r8 = (defpackage.xq2) r8
            r0 = 883584458(0x34aa6dca, float:3.174485E-7)
            r8.d0(r0)
            r0 = r4 & 6
            r1 = 4
            if (r0 != 0) goto L24
            r0 = r20
            boolean r2 = r8.h(r0)
            if (r2 == 0) goto L21
            r2 = r1
            goto L22
        L21:
            r2 = 2
        L22:
            r2 = r2 | r4
            goto L27
        L24:
            r0 = r20
            r2 = r4
        L27:
            r3 = r4 & 48
            r14 = r21
            if (r3 != 0) goto L39
            boolean r3 = r8.f(r14)
            if (r3 == 0) goto L36
            r3 = 32
            goto L38
        L36:
            r3 = 16
        L38:
            r2 = r2 | r3
        L39:
            r3 = r4 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L4c
            r3 = r22
            boolean r5 = r8.h(r3)
            if (r5 == 0) goto L48
            r5 = 256(0x100, float:3.59E-43)
            goto L4a
        L48:
            r5 = 128(0x80, float:1.8E-43)
        L4a:
            r2 = r2 | r5
            goto L4e
        L4c:
            r3 = r22
        L4e:
            r5 = r2 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            r7 = 0
            r9 = 1
            if (r5 == r6) goto L58
            r5 = r9
            goto L59
        L58:
            r5 = r7
        L59:
            r6 = r2 & 1
            boolean r5 = r8.S(r6, r5)
            if (r5 == 0) goto L11c
            nq6 r5 = defpackage.kf.b
            java.lang.Object r5 = r8.j(r5)
            r15 = r5
            android.content.Context r15 = (android.content.Context) r15
            java.lang.Object r5 = r8.P()
            vs0 r6 = defpackage.ox0.a
            if (r5 != r6) goto L79
            w61 r5 = defpackage.mb3.w(r8)
            r8.l0(r5)
        L79:
            r19 = r5
            w61 r19 = (defpackage.w61) r19
            es7 r18 = defpackage.bl2.F(r8)
            java.lang.Object r5 = r8.P()
            if (r5 != r6) goto L91
            rs4 r5 = new rs4
            r10 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r10)
            r8.l0(r5)
        L91:
            r12 = r5
            rs4 r12 = (defpackage.rs4) r12
            java.lang.Object r5 = r8.P()
            if (r5 != r6) goto La8
            jk4 r5 = new jk4
            r10 = 0
            r5.<init>(r10)
            vs4 r5 = defpackage.np2.Y(r5)
            r8.l0(r5)
        La8:
            r13 = r5
            qa4 r13 = (defpackage.qa4) r13
            java.lang.Object r5 = r8.P()
            if (r5 != r6) goto Lb9
            l4 r5 = new l4
            r5.<init>(r1, r12, r13)
            r8.l0(r5)
        Lb9:
            fo2 r5 = (defpackage.fo2) r5
            java.lang.Object r1 = r8.P()
            if (r1 != r6) goto Lc9
            dr3 r1 = new dr3
            r1.<init>(r5, r9)
            r8.l0(r1)
        Lc9:
            go2 r1 = (defpackage.go2) r1
            qa4 r1 = defpackage.np2.b0(r1, r8)
            java.lang.Object r5 = r8.P()
            if (r5 != r6) goto Le4
            fj r5 = new fj
            r9 = 5
            r5.<init>(r1, r9)
            ag1 r1 = new ag1
            r1.<init>(r5)
            r8.l0(r1)
            r5 = r1
        Le4:
            r11 = r5
            ag1 r11 = (defpackage.ag1) r11
            java.lang.Object r1 = r8.P()
            if (r1 != r6) goto Lf6
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            vs4 r1 = defpackage.np2.Y(r1)
            r8.l0(r1)
        Lf6:
            r10 = r1
            qa4 r10 = (defpackage.qa4) r10
            jj1 r6 = new jj1
            r1 = 3
            r6.<init>(r1, r7, r7)
            gn2 r9 = new gn2
            r16 = r0
            r17 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 1606079699(0x5fbad4d3, float:2.6925234E19)
            zv0 r7 = defpackage.n16.I(r0, r9, r8)
            int r0 = r2 >> 6
            r0 = r0 & 14
            r9 = r0 | 432(0x1b0, float:6.05E-43)
            r10 = 0
            r5 = r22
            defpackage.nw7.o(r5, r6, r7, r8, r9, r10)
            goto L11f
        L11c:
            r8.V()
        L11f:
            cf5 r6 = r8.t()
            if (r6 == 0) goto L134
            rl r0 = new rl
            r5 = 11
            r1 = r20
            r2 = r21
            r3 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L134:
            return
    }

    public static void b0(java.io.InputStream r4, long r5) {
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
        L4:
            r1 = 1024(0x400, double:5.06E-321)
            long r1 = java.lang.Math.min(r5, r1)
            r3 = 0
            int r1 = (int) r1
            int r1 = r4.read(r0, r3, r1)
            if (r1 > 0) goto L13
            goto L1b
        L13:
            long r1 = (long) r1
            long r5 = r5 - r1
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L4
        L1b:
            return
    }

    public static final void c(defpackage.w61 r11, android.content.Context r12, java.lang.String r13, defpackage.pq5 r14, defpackage.qa4 r15, android.graphics.Bitmap.CompressFormat r16, java.lang.String r17, java.lang.String r18) {
            xe1 r0 = defpackage.xk1.a
            de1 r0 = defpackage.de1.L
            ja1 r1 = new ja1
            r9 = 0
            r10 = 5
            r2 = r12
            r3 = r13
            r4 = r14
            r8 = r15
            r7 = r16
            r5 = r17
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12 = 2
            r13 = 0
            defpackage.hv.L(r11, r0, r13, r1, r12)
            return
    }

    public static final long c0(long r5, long r7) {
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r7 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 * r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r6 = r7 & r3
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 * r5
            int r5 = java.lang.Float.floatToRawIntBits(r2)
            long r7 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            long r7 = r7 << r0
            long r5 = r5 & r3
            long r5 = r5 | r7
            return r5
    }

    public static final void d(defpackage.fk3 r22, defpackage.on2 r23, defpackage.go2 r24, defpackage.px0 r25, int r26) {
            r1 = r22
            r23.getClass()
            r24.getClass()
            r7 = r25
            xq2 r7 = (defpackage.xq2) r7
            r0 = 559938776(0x215ffcd8, float:7.5889975E-19)
            r7.d0(r0)
            boolean r0 = r7.h(r1)
            r2 = 2
            r10 = 4
            if (r0 == 0) goto L1c
            r0 = r10
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r0 = r26 | r0
            r12 = r23
            boolean r3 = r7.h(r12)
            if (r3 == 0) goto L2a
            r3 = 32
            goto L2c
        L2a:
            r3 = 16
        L2c:
            r0 = r0 | r3
            r13 = r24
            boolean r3 = r7.h(r13)
            if (r3 == 0) goto L38
            r3 = 256(0x100, float:3.59E-43)
            goto L3a
        L38:
            r3 = 128(0x80, float:1.8E-43)
        L3a:
            r0 = r0 | r3
            r3 = r0 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L45
            r3 = r5
            goto L46
        L45:
            r3 = r6
        L46:
            r4 = r0 & 1
            boolean r3 = r7.S(r4, r3)
            if (r3 == 0) goto L1e2
            r3 = 2131951838(0x7f1300de, float:1.9540102E38)
            java.lang.String r17 = defpackage.yh2.O(r7, r3)
            java.lang.String r3 = r1.b
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            boolean r4 = r7.h(r1)
            java.lang.Object r8 = r7.P()
            vs0 r9 = defpackage.ox0.a
            if (r4 != 0) goto L69
            if (r8 != r9) goto L71
        L69:
            in3 r8 = new in3
            r8.<init>(r1, r6)
            r7.l0(r8)
        L71:
            on2 r8 = (defpackage.on2) r8
            java.lang.Object r3 = defpackage.qo2.I(r3, r8, r7, r6)
            r14 = r3
            qa4 r14 = (defpackage.qa4) r14
            ck3 r3 = r1.d
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            boolean r4 = r7.h(r1)
            java.lang.Object r8 = r7.P()
            if (r4 != 0) goto L8c
            if (r8 != r9) goto L94
        L8c:
            in3 r8 = new in3
            r8.<init>(r1, r5)
            r7.l0(r8)
        L94:
            on2 r8 = (defpackage.on2) r8
            java.lang.Object r3 = defpackage.qo2.I(r3, r8, r7, r6)
            r15 = r3
            qa4 r15 = (defpackage.qa4) r15
            boolean r3 = r1.e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            boolean r4 = r7.h(r1)
            java.lang.Object r8 = r7.P()
            if (r4 != 0) goto Lb3
            if (r8 != r9) goto Lbb
        Lb3:
            in3 r8 = new in3
            r8.<init>(r1, r2)
            r7.l0(r8)
        Lbb:
            on2 r8 = (defpackage.on2) r8
            java.lang.Object r2 = defpackage.qo2.I(r3, r8, r7, r6)
            r16 = r2
            qa4 r16 = (defpackage.qa4) r16
            int r2 = r1.f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            boolean r3 = r7.h(r1)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto Ldb
            if (r4 != r9) goto Le4
        Ldb:
            in3 r4 = new in3
            r3 = 3
            r4.<init>(r1, r3)
            r7.l0(r4)
        Le4:
            on2 r4 = (defpackage.on2) r4
            java.lang.Object r2 = defpackage.qo2.I(r2, r4, r7, r6)
            r21 = r2
            rs4 r21 = (defpackage.rs4) r21
            j37 r3 = defpackage.mp2.T(r7)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Object r4 = r7.P()
            if (r4 != r9) goto L102
            pi3 r4 = new pi3
            r4.<init>(r5)
            r7.l0(r4)
        L102:
            on2 r4 = (defpackage.on2) r4
            r5 = 48
            java.lang.Object r2 = defpackage.qo2.I(r2, r4, r7, r5)
            qa4 r2 = (defpackage.qa4) r2
            r4 = 2130903072(0x7f030020, float:1.7412952E38)
            java.lang.String[] r18 = defpackage.yh2.M(r7, r4)
            r4 = 2131952386(0x7f130302, float:1.9541213E38)
            java.lang.String r4 = defpackage.yh2.O(r7, r4)
            r20 = r16
            r16 = r14
            ln3 r14 = new ln3
            r19 = r15
            r15 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r3 = r18
            r17 = r21
            r18 = r15
            r15 = r19
            r5 = 1972798883(0x759685a3, float:3.8161865E32)
            zv0 r5 = defpackage.n16.I(r5, r14, r7)
            c4 r11 = new c4
            r14 = r16
            r16 = r20
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r8 = -127883039(0xfffffffff860a8e1, float:-1.8226559E34)
            zv0 r8 = defpackage.n16.I(r8, r11, r7)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            r11 = r9
            r9 = 16
            r12 = r6
            r6 = 0
            r13 = r8
            r8 = r0
            r0 = r2
            r2 = r4
            r4 = r5
            r5 = r13
            r13 = r12
            r12 = r11
            r11 = r3
            r3 = r23
            defpackage.q60.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 2131952135(0x7f130207, float:1.9540704E38)
            java.lang.String r2 = defpackage.yh2.O(r7, r2)
            java.lang.Object r3 = r7.P()
            if (r3 != r12) goto L173
            v83 r3 = new v83
            r4 = 8
            r3.<init>(r4)
            r7.l0(r3)
        L173:
            r4 = r3
            qn2 r4 = (defpackage.qn2) r4
            r6 = r7
            r7 = 384(0x180, float:5.38E-43)
            r8 = 8
            r5 = 0
            r3 = r18
            defpackage.mp2.e(r2, r3, r4, r5, r6, r7, r8)
            r7 = r6
            java.lang.Object r2 = r0.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1d8
            r2 = -513244900(0xffffffffe168811c, float:-2.6805925E20)
            r7.b0(r2)
            r2 = 2131952138(0x7f13020a, float:1.954071E38)
            java.lang.String r2 = defpackage.yh2.O(r7, r2)
            boolean r3 = r7.f(r0)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto L1a7
            if (r4 != r12) goto L1b1
        L1a7:
            f4 r4 = new f4
            r3 = 23
            r4.<init>(r0, r3)
            r7.l0(r4)
        L1b1:
            r3 = r4
            on2 r3 = (defpackage.on2) r3
            m4 r4 = new m4
            r4.<init>(r15, r0, r11)
            r5 = 1554765950(0x5cabd87e, float:3.8696205E17)
            zv0 r4 = defpackage.n16.I(r5, r4, r7)
            e4 r5 = new e4
            r5.<init>(r0, r10)
            r0 = -1094089156(0xffffffffbec9863c, float:-0.39360225)
            zv0 r5 = defpackage.n16.I(r0, r5, r7)
            r8 = 3456(0xd80, float:4.843E-42)
            r9 = 16
            r6 = 0
            defpackage.q60.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r7.p(r13)
            goto L1e5
        L1d8:
            r0 = -511355574(0xffffffffe185554a, float:-3.0744534E20)
            r7.b0(r0)
            r7.p(r13)
            goto L1e5
        L1e2:
            r7.V()
        L1e5:
            cf5 r6 = r7.t()
            if (r6 == 0) goto L1fa
            x3 r0 = new x3
            r5 = 20
            r2 = r23
            r3 = r24
            r4 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L1fa:
            return
    }

    public static java.lang.String d0(defpackage.sw2 r3) {
            int[] r0 = defpackage.cs6.a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2b
            r1 = 2
            if (r0 == r1) goto L28
            r1 = 3
            if (r0 != r1) goto L14
            java.lang.String r3 = "HmacSha512"
            return r3
        L14:
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "hash unsupported for HMAC: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L28:
            java.lang.String r3 = "HmacSha256"
            return r3
        L2b:
            java.lang.String r3 = "HmacSha1"
            return r3
    }

    public static final void e(defpackage.on2 r9, defpackage.a74 r10, defpackage.pq3 r11, defpackage.eq3 r12, defpackage.px0 r13, int r14) {
            r0 = r13
            xq2 r0 = (defpackage.xq2) r0
            r2 = 1055276397(0x3ee63d6d, float:0.4496874)
            r0.d0(r2)
            boolean r2 = r0.h(r9)
            if (r2 == 0) goto L11
            r2 = 4
            goto L12
        L11:
            r2 = 2
        L12:
            r2 = r2 | r14
            boolean r3 = r0.f(r10)
            if (r3 == 0) goto L1c
            r3 = 32
            goto L1e
        L1c:
            r3 = 16
        L1e:
            r2 = r2 | r3
            boolean r4 = r0.f(r11)
            if (r4 == 0) goto L28
            r4 = 256(0x100, float:3.59E-43)
            goto L2a
        L28:
            r4 = 128(0x80, float:1.8E-43)
        L2a:
            r2 = r2 | r4
            boolean r6 = r0.f(r12)
            if (r6 == 0) goto L34
            r6 = 2048(0x800, float:2.87E-42)
            goto L36
        L34:
            r6 = 1024(0x400, float:1.435E-42)
        L36:
            r2 = r2 | r6
            r6 = r2 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r8 = 1
            if (r6 == r7) goto L40
            r6 = r8
            goto L41
        L40:
            r6 = 0
        L41:
            r2 = r2 & r8
            boolean r2 = r0.S(r2, r6)
            if (r2 == 0) goto L61
            qa4 r7 = defpackage.np2.b0(r9, r0)
            dq3 r3 = new dq3
            r8 = 0
            r5 = r10
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -933153643(0xffffffffc8613495, float:-230610.33)
            zv0 r2 = defpackage.n16.I(r2, r3, r0)
            r3 = 6
            defpackage.gi2.g(r2, r0, r3)
            goto L64
        L61:
            r0.V()
        L64:
            cf5 r7 = r0.t()
            if (r7 == 0) goto L78
            p4 r0 = new p4
            r6 = 8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L78:
            return
    }

    public static final void f(defpackage.sb4 r6, defpackage.o46 r7, defpackage.zv0 r8, defpackage.px0 r9, int r10) {
            xq2 r9 = (defpackage.xq2) r9
            r0 = 233973821(0xdf2283d, float:1.49240885E-30)
            r9.d0(r0)
            boolean r0 = r9.h(r6)
            if (r0 == 0) goto L10
            r0 = 4
            goto L11
        L10:
            r0 = 2
        L11:
            r0 = r0 | r10
            boolean r1 = r9.h(r7)
            if (r1 == 0) goto L1b
            r1 = 32
            goto L1d
        L1b:
            r1 = 16
        L1d:
            r0 = r0 | r1
            r0 = r0 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r0 != r1) goto L2f
            boolean r0 = r9.E()
            if (r0 != 0) goto L2b
            goto L2f
        L2b:
            r9.V()
            goto L57
        L2f:
            py0 r0 = defpackage.ey3.a
            pq r0 = r0.a(r6)
            l55 r1 = defpackage.zx3.a
            pq r1 = r1.a(r6)
            l55 r2 = defpackage.dy3.a
            pq r2 = r2.a(r6)
            pq[] r0 = new defpackage.pq[]{r0, r1, r2}
            dj1 r1 = new dj1
            r2 = 1
            r1.<init>(r2, r7, r8)
            r2 = 1808964477(0x6bd29b7d, float:5.092174E26)
            zv0 r1 = defpackage.n16.I(r2, r1, r9)
            r2 = 56
            defpackage.hv.e(r0, r1, r9, r2)
        L57:
            cf5 r9 = r9.t()
            if (r9 == 0) goto L6a
            x3 r0 = new x3
            r5 = 23
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r9.d = r0
        L6a:
            return
    }

    public static final void g(defpackage.o46 r8, defpackage.zv0 r9, defpackage.px0 r10, int r11) {
            xq2 r10 = (defpackage.xq2) r10
            r0 = 832919318(0x31a55716, float:4.8120326E-9)
            r10.d0(r0)
            boolean r0 = r10.h(r8)
            r1 = 2
            if (r0 == 0) goto L11
            r0 = 4
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 | r11
            boolean r2 = r10.h(r9)
            if (r2 == 0) goto L1c
            r2 = 32
            goto L1e
        L1c:
            r2 = 16
        L1e:
            r0 = r0 | r2
            r2 = r0 & 19
            r3 = 18
            if (r2 != r3) goto L30
            boolean r2 = r10.E()
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            r10.V()
            goto L86
        L30:
            java.lang.Object r2 = r10.P()
            vs0 r3 = defpackage.ox0.a
            if (r2 != r3) goto L40
            x84 r2 = new x84
            r2.<init>(r1)
            r10.l0(r2)
        L40:
            qn2 r2 = (defpackage.qn2) r2
            bp7 r3 = defpackage.ey3.a(r10)
            if (r3 == 0) goto L96
            java.lang.Class<k00> r4 = defpackage.k00.class
            ar0 r5 = defpackage.gh5.a(r4)
            wb1 r6 = new wb1
            r7 = 0
            r6.<init>(r1, r7)
            ar0 r1 = defpackage.gh5.a(r4)
            r6.b(r1, r2)
            m9 r1 = r6.d()
            boolean r2 = r3 instanceof defpackage.mw2
            if (r2 == 0) goto L6b
            r2 = r3
            mw2 r2 = (defpackage.mw2) r2
            j71 r2 = r2.getDefaultViewModelCreationExtras()
            goto L6d
        L6b:
            h71 r2 = defpackage.h71.b
        L6d:
            qo7 r1 = defpackage.nj2.G(r5, r3, r1, r2, r10)
            k00 r1 = (defpackage.k00) r1
            j97 r2 = new j97
            r2.<init>(r8)
            r1.c = r2
            java.lang.String r1 = r1.b
            r2 = r0 & 112(0x70, float:1.57E-43)
            int r0 = r0 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r8.b(r1, r9, r10, r0)
        L86:
            cf5 r10 = r10.t()
            if (r10 == 0) goto L95
            ql1 r0 = new ql1
            r1 = 25
            r0.<init>(r8, r11, r1, r9)
            r10.d = r0
        L95:
            return
        L96:
            java.lang.String r8 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            defpackage.i.m(r8)
            return
    }

    public static final defpackage.xa6 h(defpackage.sm3 r8, boolean r9) {
            if0 r0 = r8.B0
            java.lang.Object r0 = r0.g
            z64 r0 = (defpackage.z64) r0
            int r1 = r0.R
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L66
        Ld:
            if (r0 == 0) goto L66
            int r1 = r0.L
            r1 = r1 & 8
            if (r1 == 0) goto L5d
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5d
            boolean r4 = r1 instanceof defpackage.va6
            if (r4 == 0) goto L1f
            r2 = r1
            goto L66
        L1f:
            int r4 = r1.L
            r4 = r4 & 8
            if (r4 == 0) goto L58
            boolean r4 = r1 instanceof defpackage.zg1
            if (r4 == 0) goto L58
            r4 = r1
            zg1 r4 = (defpackage.zg1) r4
            z64 r4 = r4.l0
            r5 = 0
        L2f:
            r6 = 1
            if (r4 == 0) goto L55
            int r7 = r4.L
            r7 = r7 & 8
            if (r7 == 0) goto L52
            int r5 = r5 + 1
            if (r5 != r6) goto L3e
            r1 = r4
            goto L52
        L3e:
            if (r3 != 0) goto L49
            ua4 r3 = new ua4
            r6 = 16
            z64[] r6 = new defpackage.z64[r6]
            r3.<init>(r6)
        L49:
            if (r1 == 0) goto L4f
            r3.b(r1)
            r1 = r2
        L4f:
            r3.b(r4)
        L52:
            z64 r4 = r4.Y
            goto L2f
        L55:
            if (r5 != r6) goto L58
            goto L17
        L58:
            z64 r1 = defpackage.nc1.A(r3)
            goto L17
        L5d:
            int r1 = r0.R
            r1 = r1 & 8
            if (r1 == 0) goto L66
            z64 r0 = r0.Y
            goto Ld
        L66:
            r2.getClass()
            va6 r2 = (defpackage.va6) r2
            z64 r2 = (defpackage.z64) r2
            z64 r0 = r2.A
            ta6 r1 = r8.x()
            if (r1 != 0) goto L7a
            ta6 r1 = new ta6
            r1.<init>()
        L7a:
            xa6 r2 = new xa6
            r2.<init>(r0, r9, r8, r1)
            return r2
    }

    public static final java.lang.Object i(defpackage.p76 r10, float r11, defpackage.uo r12, defpackage.oc1 r13, defpackage.qn2 r14, defpackage.s41 r15) {
            boolean r0 = r15 instanceof defpackage.sl6
            if (r0 == 0) goto L13
            r0 = r15
            sl6 r0 = (defpackage.sl6) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            sl6 r0 = new sl6
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            float r11 = r0.R
            ah5 r10 = r0.Y
            uo r12 = r0.X
            defpackage.oi2.Y(r15)
            goto L69
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L34:
            defpackage.oi2.Y(r15)
            ah5 r6 = new ah5
            r6.<init>()
            java.lang.Object r15 = r12.a()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r2 = 0
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L4d
            r15 = r3
            goto L4e
        L4d:
            r15 = 0
        L4e:
            r15 = r15 ^ r3
            rl6 r4 = new rl6
            r9 = 0
            r7 = r10
            r5 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.X = r12
            r0.Y = r6
            r0.R = r5
            r0.d0 = r3
            java.lang.Object r10 = defpackage.kj2.m(r12, r13, r15, r4, r0)
            if (r10 != r1) goto L67
            return r1
        L67:
            r11 = r5
            r10 = r6
        L69:
            qo r13 = new qo
            float r10 = r10.A
            float r11 = r11 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r11)
            r13.<init>(r10, r12)
            return r13
    }

    public static final java.lang.Object j(defpackage.p76 r16, float r17, float r18, defpackage.uo r19, defpackage.io6 r20, defpackage.qn2 r21, defpackage.s41 r22) {
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.tl6
            if (r2 == 0) goto L18
            r2 = r1
            tl6 r2 = (defpackage.tl6) r2
            int r3 = r2.e0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.e0 = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            tl6 r2 = new tl6
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.d0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r8.e0
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L38
            float r0 = r8.X
            float r2 = r8.R
            ah5 r3 = r8.Z
            uo r4 = r8.Y
            defpackage.oi2.Y(r1)
            r1 = r0
            r0 = r2
            goto L90
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L3f:
            defpackage.oi2.Y(r1)
            ah5 r12 = new ah5
            r12.<init>()
            java.lang.Object r1 = r19.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Object r5 = r19.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L66
            r5 = r4
            goto L67
        L66:
            r5 = 0
        L67:
            r6 = r5 ^ 1
            rl6 r10 = new rl6
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r3
            r3 = r19
            r8.Y = r3
            r8.Z = r12
            r8.R = r0
            r8.X = r1
            r8.e0 = r4
            r4 = r5
            r7 = r10
            r5 = r20
            java.lang.Object r4 = defpackage.kj2.n(r3, r4, r5, r6, r7, r8)
            if (r4 != r2) goto L8d
            return r2
        L8d:
            r4 = r19
            r3 = r12
        L90:
            java.lang.Object r2 = r4.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = v(r2, r1)
            qo r2 = new qo
            float r3 = r3.A
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            uo r0 = defpackage.ak7.O(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
    }

    public static final defpackage.n14 k(java.util.regex.Matcher r0, int r1, java.lang.CharSequence r2) {
            boolean r1 = r0.find(r1)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            n14 r1 = new n14
            r1.<init>(r0, r2)
            return r1
    }

    public static final int l(defpackage.jt3 r2, long r3, defpackage.fo7 r5) {
            b47 r0 = r2.d()
            r1 = -1
            if (r0 == 0) goto L32
            a47 r0 = r0.a
            v84 r0 = r0.b
            jk3 r2 = r2.c()
            if (r2 == 0) goto L32
            long r2 = r2.N(r3)
            int r4 = F(r0, r2, r5)
            if (r4 != r1) goto L1c
            goto L32
        L1c:
            float r5 = r0.f(r4)
            float r4 = r0.b(r4)
            float r4 = r4 + r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            r5 = 1
            long r2 = defpackage.jk4.a(r2, r4, r5)
            int r2 = r0.g(r2)
            return r2
        L32:
            return r1
    }

    public static final long m(defpackage.jt3 r2, defpackage.of5 r3, defpackage.of5 r4, int r5) {
            long r0 = H(r2, r3, r5)
            boolean r3 = defpackage.k47.c(r0)
            if (r3 == 0) goto Ld
            long r2 = defpackage.k47.b
            return r2
        Ld:
            long r2 = H(r2, r4, r5)
            boolean r4 = defpackage.k47.c(r2)
            if (r4 == 0) goto L1a
            long r2 = defpackage.k47.b
            return r2
        L1a:
            r4 = 32
            long r4 = r0 >> r4
            int r4 = (int) r4
            int r4 = java.lang.Math.min(r4, r4)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            int r2 = java.lang.Math.max(r2, r2)
            long r2 = defpackage.jx2.f(r4, r2)
            return r2
    }

    public static final boolean n(defpackage.a47 r5, int r6) {
            v84 r0 = r5.b
            int r1 = r0.d(r6)
            int r2 = r5.g(r1)
            r3 = 1
            r4 = 0
            if (r6 == r2) goto L21
            int r0 = r0.c(r1, r4)
            if (r6 != r0) goto L15
            goto L21
        L15:
            jl5 r0 = r5.a(r6)
            int r6 = r6 - r3
            jl5 r5 = r5.a(r6)
            if (r0 == r5) goto L2c
            goto L2b
        L21:
            jl5 r0 = r5.h(r6)
            jl5 r5 = r5.a(r6)
            if (r0 == r5) goto L2c
        L2b:
            return r3
        L2c:
            return r4
    }

    public static final defpackage.of5 o(defpackage.gf6 r3, defpackage.cf6 r4) {
            if (r4 == 0) goto L46
            java.util.List r3 = r3.b()
            int r0 = r3.size()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L46
            java.lang.Object r2 = r3.get(r1)
            if6 r2 = (defpackage.if6) r2
            cf6 r2 = r2.h0
            boolean r2 = defpackage.nb3.k(r2, r4)
            if (r2 == 0) goto L43
            boolean r3 = r4.j0
            if (r3 != 0) goto L20
            goto L46
        L20:
            boolean r3 = r4.l0
            if (r3 != 0) goto L27
            of5 r3 = r4.k0
            return r3
        L27:
            jk3 r3 = r4.S0()
            eg4 r0 = defpackage.nc1.e0(r4)
            r1 = 6
            long r0 = defpackage.jk3.i(r3, r0, r1)
            eg4 r3 = defpackage.nc1.e0(r4)
            long r3 = r3.L
            long r3 = defpackage.qo2.S(r3)
            of5 r3 = defpackage.kj2.b(r0, r3)
            return r3
        L43:
            int r1 = r1 + 1
            goto Lb
        L46:
            r3 = 0
            return r3
    }

    public static final long p(android.graphics.PointF r6) {
            float r0 = r6.x
            float r6 = r6.y
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r2 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    public static final void q(defpackage.eb r6, long r7, long r9, long r11, boolean r13) {
            java.lang.Object r0 = r6.L
            vs4 r0 = (defpackage.vs4) r0
            java.lang.Object r1 = r6.X
            vs4 r1 = (defpackage.vs4) r1
            java.lang.Object r2 = r6.B
            vs4 r2 = (defpackage.vs4) r2
            java.lang.Object r6 = r6.R
            vs4 r6 = (defpackage.vs4) r6
            java.lang.Object r3 = r6.getValue()
            jk4 r3 = (defpackage.jk4) r3
            long r3 = r3.a
            boolean r3 = defpackage.jk4.c(r3, r11)
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.getValue()
            xi6 r3 = (defpackage.xi6) r3
            long r3 = r3.a
            boolean r3 = defpackage.xi6.b(r3, r7)
            if (r3 == 0) goto L2e
            if (r13 == 0) goto L64
        L2e:
            xi6 r3 = new xi6
            r3.<init>(r7)
            r2.setValue(r3)
            jk4 r7 = new jk4
            r7.<init>(r11)
            r6.setValue(r7)
            if (r13 == 0) goto L64
            long r6 = defpackage.jk4.e(r9, r11)
            java.lang.Object r8 = r1.getValue()
            jk4 r8 = (defpackage.jk4) r8
            long r2 = r8.a
            java.lang.Object r8 = r0.getValue()
            jk4 r8 = (defpackage.jk4) r8
            long r4 = r8.a
            long r2 = defpackage.jk4.e(r2, r4)
            long r6 = defpackage.jk4.e(r6, r2)
            jk4 r8 = new jk4
            r8.<init>(r6)
            r0.setValue(r8)
        L64:
            long r6 = defpackage.jk4.e(r9, r11)
            jk4 r8 = new jk4
            r8.<init>(r6)
            r1.setValue(r8)
            return
    }

    public static final void r(defpackage.so r1, defpackage.p76 r2, defpackage.qn2 r3, float r4) {
            float r2 = r2.a(r4)     // Catch: java.util.concurrent.CancellationException -> L5
            goto L9
        L5:
            r1.a()
            r2 = 0
        L9:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r3.g(r0)
            float r4 = r4 - r2
            float r2 = java.lang.Math.abs(r4)
            r3 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1e
            r1.a()
        L1e:
            return
    }

    public static float s(float[] r8) {
            int r0 = r8.length
            r1 = 6
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            r0 = 0
            r0 = r8[r0]
            r1 = 1
            r1 = r8[r1]
            r3 = 2
            r3 = r8[r3]
            r4 = 3
            r4 = r8[r4]
            r5 = 4
            r5 = r8[r5]
            r6 = 5
            r8 = r8[r6]
            float r6 = r0 * r4
            float r7 = r1 * r5
            float r7 = r7 + r6
            float r6 = r3 * r8
            float r6 = r6 + r7
            float r4 = r4 * r5
            float r6 = r6 - r4
            float r1 = r1 * r3
            float r6 = r6 - r1
            float r0 = r0 * r8
            float r6 = r6 - r0
            r8 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r8
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L2f
            float r8 = -r6
            return r8
        L2f:
            return r6
    }

    public static int t(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static final void u(int r1) {
            r0 = 1
            if (r1 < r0) goto L4
            return
        L4:
            java.lang.String r0 = "Expected positive parallelism level, but got "
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            defpackage.i.f(r1)
            return
    }

    public static final float v(float r2, float r3) {
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            return r0
        L6:
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lf
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L14
            goto L13
        Lf:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L14
        L13:
            return r3
        L14:
            return r2
    }

    public static float[] w(float[] r2, int r3) {
            if (r3 < 0) goto L16
            int r0 = r2.length
            if (r0 < 0) goto L10
            int r0 = java.lang.Math.min(r3, r0)
            float[] r3 = new float[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
        L10:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
        L16:
            defpackage.u34.t()
            r2 = 0
            return r2
    }

    public static boolean x(java.io.File r0, android.content.res.Resources r1, int r2) {
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch: java.lang.Throwable -> L10
            boolean r0 = y(r1, r0)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Ld
            r1.close()     // Catch: java.io.IOException -> Ld
        Ld:
            return r0
        Le:
            r0 = move-exception
            goto L12
        L10:
            r0 = move-exception
            r1 = 0
        L12:
            if (r1 == 0) goto L17
            r1.close()     // Catch: java.io.IOException -> L17
        L17:
            throw r0
    }

    public static boolean y(java.io.InputStream r5, java.io.File r6) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r3.<init>(r6, r1)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
        Lf:
            int r2 = r5.read(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            r4 = -1
            if (r2 == r4) goto L20
            r3.write(r6, r1, r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            goto Lf
        L1a:
            r5 = move-exception
            r2 = r3
            goto L4e
        L1d:
            r5 = move-exception
            r2 = r3
            goto L2b
        L20:
            r3.close()     // Catch: java.io.IOException -> L23
        L23:
            android.os.StrictMode.setThreadPolicy(r0)
            r5 = 1
            return r5
        L28:
            r5 = move-exception
            goto L4e
        L2a:
            r5 = move-exception
        L2b:
            java.lang.String r6 = "TypefaceCompatUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "Error copying resource contents to temp file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L28
            r3.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L28
            android.util.Log.e(r6, r5)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L4a
        L4a:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L4e:
            if (r2 == 0) goto L53
            r2.close()     // Catch: java.io.IOException -> L53
        L53:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
    }

    public static final void z(defpackage.mu2 r7, defpackage.dl7 r8) {
            java.util.List r8 = r8.f0
            int r0 = r8.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto Lf4
            java.lang.Object r2 = r8.get(r1)
            fl7 r2 = (defpackage.fl7) r2
            boolean r3 = r2 instanceof defpackage.hl7
            r4 = 1
            if (r3 == 0) goto L90
            nt4 r3 = new nt4
            r3.<init>()
            hl7 r2 = (defpackage.hl7) r2
            java.util.List r5 = r2.B
            r3.d = r5
            r3.n = r4
            r3.c()
            int r5 = r2.L
            hj r6 = r3.s
            r6.h(r5)
            r3.c()
            r3.c()
            f80 r5 = r2.R
            r3.b = r5
            r3.c()
            float r5 = r2.X
            r3.c = r5
            r3.c()
            f80 r5 = r2.Y
            r3.g = r5
            r3.c()
            float r5 = r2.Z
            r3.e = r5
            r3.c()
            float r5 = r2.d0
            r3.f = r5
            r3.o = r4
            r3.c()
            int r5 = r2.e0
            r3.h = r5
            r3.o = r4
            r3.c()
            int r5 = r2.f0
            r3.i = r5
            r3.o = r4
            r3.c()
            float r5 = r2.g0
            r3.j = r5
            r3.o = r4
            r3.c()
            float r5 = r2.h0
            r3.k = r5
            r3.p = r4
            r3.c()
            float r5 = r2.i0
            r3.l = r5
            r3.p = r4
            r3.c()
            float r2 = r2.j0
            r3.m = r2
            r3.p = r4
            r3.c()
            r7.e(r1, r3)
            goto Lf0
        L90:
            boolean r3 = r2 instanceof defpackage.dl7
            if (r3 == 0) goto Lf0
            mu2 r3 = new mu2
            r3.<init>()
            dl7 r2 = (defpackage.dl7) r2
            java.lang.String r5 = r2.A
            r3.k = r5
            r3.c()
            float r5 = r2.B
            r3.l = r5
            r3.s = r4
            r3.c()
            float r5 = r2.X
            r3.o = r5
            r3.s = r4
            r3.c()
            float r5 = r2.Y
            r3.p = r5
            r3.s = r4
            r3.c()
            float r5 = r2.Z
            r3.q = r5
            r3.s = r4
            r3.c()
            float r5 = r2.d0
            r3.r = r5
            r3.s = r4
            r3.c()
            float r5 = r2.L
            r3.m = r5
            r3.s = r4
            r3.c()
            float r5 = r2.R
            r3.n = r5
            r3.s = r4
            r3.c()
            java.util.List r5 = r2.e0
            r3.f = r5
            r3.g = r4
            r3.c()
            z(r3, r2)
            r7.e(r1, r3)
        Lf0:
            int r1 = r1 + 1
            goto L7
        Lf4:
            return
    }
}
