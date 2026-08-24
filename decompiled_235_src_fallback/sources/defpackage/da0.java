package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da0  reason: default package */
/* loaded from: classes.dex */
public class da0 implements java.io.Serializable, java.lang.Comparable {
    public static final defpackage.da0 R = null;
    public final byte[] A;
    public transient int B;
    public transient java.lang.String L;

    static {
            da0 r0 = new da0
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            defpackage.da0.R = r0
            return
    }

    public da0(byte[] r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    public static int g(defpackage.da0 r1, defpackage.da0 r2) {
            r1.getClass()
            r2.getClass()
            byte[] r2 = r2.h()
            r0 = 0
            int r1 = r1.f(r2, r0)
            return r1
    }

    public static int k(defpackage.da0 r0, defpackage.da0 r1) {
            r0.getClass()
            r1.getClass()
            byte[] r1 = r1.h()
            int r0 = r0.j(r1)
            return r0
    }

    public static /* synthetic */ defpackage.da0 p(defpackage.da0 r1, int r2, int r3, int r4) {
            r0 = r4 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            r3 = -1234567890(0xffffffffb669fd2e, float:-3.4867076E-6)
        Lc:
            da0 r1 = r1.o(r2, r3)
            return r1
    }

    public java.lang.String a() {
            r12 = this;
            byte[] r0 = defpackage.a.a
            byte[] r12 = r12.A
            r12.getClass()
            r0.getClass()
            int r1 = r12.length
            r2 = 2
            int r1 = r1 + r2
            int r1 = r1 / 3
            int r1 = r1 * 4
            byte[] r1 = new byte[r1]
            int r3 = r12.length
            int r4 = r12.length
            int r4 = r4 % 3
            int r3 = r3 - r4
            r4 = 0
            r5 = r4
        L1a:
            if (r4 >= r3) goto L57
            int r6 = r4 + 1
            r7 = r12[r4]
            int r8 = r4 + 2
            r6 = r12[r6]
            int r4 = r4 + 3
            r8 = r12[r8]
            int r9 = r5 + 1
            r10 = r7 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> r2
            r10 = r0[r10]
            r1[r5] = r10
            int r10 = r5 + 2
            r7 = r7 & 3
            int r7 = r7 << 4
            r11 = r6 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> 4
            r7 = r7 | r11
            r7 = r0[r7]
            r1[r9] = r7
            int r7 = r5 + 3
            r6 = r6 & 15
            int r6 = r6 << r2
            r9 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 6
            r6 = r6 | r9
            r6 = r0[r6]
            r1[r10] = r6
            int r5 = r5 + 4
            r6 = r8 & 63
            r6 = r0[r6]
            r1[r7] = r6
            goto L1a
        L57:
            int r6 = r12.length
            int r6 = r6 - r3
            r3 = 1
            r7 = 61
            if (r6 == r3) goto L8b
            if (r6 == r2) goto L61
            goto La7
        L61:
            int r3 = r4 + 1
            r4 = r12[r4]
            r12 = r12[r3]
            int r3 = r5 + 1
            r6 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r6 >> r2
            r6 = r0[r6]
            r1[r5] = r6
            int r6 = r5 + 2
            r4 = r4 & 3
            int r4 = r4 << 4
            r8 = r12 & 255(0xff, float:3.57E-43)
            int r8 = r8 >> 4
            r4 = r4 | r8
            r4 = r0[r4]
            r1[r3] = r4
            int r5 = r5 + 3
            r12 = r12 & 15
            int r12 = r12 << r2
            r12 = r0[r12]
            r1[r6] = r12
            r1[r5] = r7
            goto La7
        L8b:
            r12 = r12[r4]
            int r3 = r5 + 1
            r4 = r12 & 255(0xff, float:3.57E-43)
            int r2 = r4 >> 2
            r2 = r0[r2]
            r1[r5] = r2
            int r2 = r5 + 2
            r12 = r12 & 3
            int r12 = r12 << 4
            r12 = r0[r12]
            r1[r3] = r12
            int r5 = r5 + 3
            r1[r2] = r7
            r1[r5] = r7
        La7:
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.qm0.a
            r12.<init>(r1, r0)
            return r12
    }

    public final int b(defpackage.da0 r10) {
            r9 = this;
            r10.getClass()
            int r0 = r9.d()
            int r1 = r10.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L11:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2a
            byte r7 = r9.i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.i(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L26
            int r4 = r4 + 1
            goto L11
        L26:
            if (r7 >= r8) goto L29
            return r5
        L29:
            return r6
        L2a:
            if (r0 != r1) goto L2d
            return r3
        L2d:
            if (r0 >= r1) goto L30
            return r5
        L30:
            return r6
    }

    public defpackage.da0 c(java.lang.String r3) {
            r2 = this;
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            r0 = 0
            int r1 = r2.d()
            byte[] r2 = r2.A
            r3.update(r2, r0, r1)
            byte[] r2 = r3.digest()
            da0 r3 = new da0
            r2.getClass()
            r3.<init>(r2)
            return r3
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            da0 r1 = (defpackage.da0) r1
            int r0 = r0.b(r1)
            return r0
    }

    public int d() {
            r0 = this;
            byte[] r0 = r0.A
            int r0 = r0.length
            return r0
    }

    public java.lang.String e() {
            r8 = this;
            byte[] r8 = r8.A
            int r0 = r8.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            int r1 = r8.length
            r2 = 0
            r3 = r2
        La:
            if (r2 >= r1) goto L25
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = defpackage.l.a
            int r7 = r4 >> 4
            r7 = r7 & 15
            char r7 = r6[r7]
            r0[r3] = r7
            int r3 = r3 + 2
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r4 != r3) goto L3
            goto L1a
        L3:
            boolean r0 = r4 instanceof defpackage.da0
            r1 = 0
            if (r0 == 0) goto L1c
            da0 r4 = (defpackage.da0) r4
            int r0 = r4.d()
            byte[] r3 = r3.A
            int r2 = r3.length
            if (r0 != r2) goto L1c
            int r0 = r3.length
            boolean r3 = r4.m(r1, r3, r1, r0)
            if (r3 == 0) goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            return r1
    }

    public int f(byte[] r4, int r5) {
            r3 = this;
            r4.getClass()
            byte[] r3 = r3.A
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 - r1
            r1 = 0
            int r5 = java.lang.Math.max(r5, r1)
            if (r5 > r0) goto L1c
        Lf:
            int r2 = r4.length
            boolean r2 = defpackage.hf.x(r5, r1, r2, r3, r4)
            if (r2 == 0) goto L17
            return r5
        L17:
            if (r5 == r0) goto L1c
            int r5 = r5 + 1
            goto Lf
        L1c:
            r3 = -1
            return r3
    }

    public byte[] h() {
            r0 = this;
            byte[] r0 = r0.A
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.B
            if (r0 == 0) goto L5
            return r0
        L5:
            byte[] r0 = r1.A
            int r0 = java.util.Arrays.hashCode(r0)
            r1.B = r0
            return r0
    }

    public byte i(int r1) {
            r0 = this;
            byte[] r0 = r0.A
            r0 = r0[r1]
            return r0
    }

    public int j(byte[] r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.d()
            byte[] r3 = r3.A
            int r1 = r3.length
            int r2 = r4.length
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
        L10:
            r1 = -1
            if (r1 >= r0) goto L1f
            r1 = 0
            int r2 = r4.length
            boolean r1 = defpackage.hf.x(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L1c
            return r0
        L1c:
            int r0 = r0 + (-1)
            goto L10
        L1f:
            return r1
    }

    public boolean l(int r2, defpackage.da0 r3, int r4) {
            r1 = this;
            r3.getClass()
            byte[] r1 = r1.A
            r0 = 0
            boolean r1 = r3.m(r0, r1, r2, r4)
            return r1
    }

    public boolean m(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            r3.getClass()
            if (r2 < 0) goto L19
            byte[] r1 = r1.A
            int r0 = r1.length
            int r0 = r0 - r5
            if (r2 > r0) goto L19
            if (r4 < 0) goto L19
            int r0 = r3.length
            int r0 = r0 - r5
            if (r4 > r0) goto L19
            boolean r1 = defpackage.hf.x(r2, r4, r5, r1, r3)
            if (r1 == 0) goto L19
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    public java.lang.String n(java.nio.charset.Charset r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r1.A
            r0.<init>(r1, r2)
            return r0
    }

    public defpackage.da0 o(int r4, int r5) {
            r3 = this;
            r0 = -1234567890(0xffffffffb669fd2e, float:-3.4867076E-6)
            if (r5 != r0) goto L9
            int r5 = r3.d()
        L9:
            r0 = 0
            if (r4 < 0) goto L3d
            byte[] r1 = r3.A
            int r2 = r1.length
            if (r5 > r2) goto L2b
            int r2 = r5 - r4
            if (r2 < 0) goto L25
            if (r4 != 0) goto L1b
            int r0 = r1.length
            if (r5 != r0) goto L1b
            return r3
        L1b:
            da0 r3 = new da0
            byte[] r4 = defpackage.fv.x0(r1, r4, r5)
            r3.<init>(r4)
            return r3
        L25:
            java.lang.String r3 = "endIndex < beginIndex"
            defpackage.i.h(r3)
            return r0
        L2b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "endIndex > length("
            r3.<init>(r4)
            int r4 = r1.length
            r5 = 41
            java.lang.String r3 = defpackage.xg6.q(r3, r4, r5)
            defpackage.i.f(r3)
            return r0
        L3d:
            java.lang.String r3 = "beginIndex < 0"
            defpackage.i.h(r3)
            return r0
    }

    public defpackage.da0 q() {
            r5 = this;
            r0 = 0
        L1:
            byte[] r1 = r5.A
            int r2 = r1.length
            if (r0 >= r2) goto L38
            r2 = r1[r0]
            r3 = 65
            if (r2 < r3) goto L35
            r4 = 90
            if (r2 <= r4) goto L11
            goto L35
        L11:
            int r5 = r1.length
            byte[] r5 = java.util.Arrays.copyOf(r1, r5)
            int r1 = r0 + 1
            int r2 = r2 + 32
            byte r2 = (byte) r2
            r5[r0] = r2
        L1d:
            int r0 = r5.length
            if (r1 >= r0) goto L2f
            r0 = r5[r1]
            if (r0 < r3) goto L2c
            if (r0 <= r4) goto L27
            goto L2c
        L27:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r5[r1] = r0
        L2c:
            int r1 = r1 + 1
            goto L1d
        L2f:
            da0 r0 = new da0
            r0.<init>(r5)
            return r0
        L35:
            int r0 = r0 + 1
            goto L1
        L38:
            return r5
    }

    public byte[] r() {
            r1 = this;
            byte[] r1 = r1.A
            int r0 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            return r1
    }

    public final java.lang.String s() {
            r3 = this;
            java.lang.String r0 = r3.L
            if (r0 != 0) goto L15
            byte[] r0 = r3.h()
            r0.getClass()
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = defpackage.qm0.a
            r1.<init>(r0, r2)
            r3.L = r1
            return r1
        L15:
            return r0
    }

    public void t(defpackage.k80 r1, int r2) {
            r0 = this;
            byte[] r0 = r0.A
            r1.l0(r0, r2)
            return
    }

    public java.lang.String toString() {
            r19 = this;
            r0 = r19
            byte[] r1 = r0.A
            int r2 = r1.length
            if (r2 != 0) goto La
            java.lang.String r0 = "[size=0]"
            return r0
        La:
            int r2 = r1.length
            r4 = 0
            r5 = 0
            r6 = 0
        Le:
            r8 = 64
            if (r4 >= r2) goto L1b7
            r9 = r1[r4]
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 160(0xa0, float:2.24E-43)
            r12 = 127(0x7f, float:1.78E-43)
            r13 = 32
            r14 = 13
            r15 = 10
            r3 = 65536(0x10000, float:9.1835E-41)
            r16 = 2
            r17 = 1
            if (r9 < 0) goto L7a
            int r18 = r6 + 1
            if (r6 != r8) goto L2f
            goto L1b7
        L2f:
            if (r9 == r15) goto L3f
            if (r9 == r14) goto L3f
            if (r9 < 0) goto L39
            if (r9 >= r13) goto L39
            goto L1b6
        L39:
            if (r12 > r9) goto L3f
            if (r9 >= r11) goto L3f
            goto L1b6
        L3f:
            if (r9 != r10) goto L43
            goto L1b6
        L43:
            if (r9 >= r3) goto L48
            r6 = r17
            goto L4a
        L48:
            r6 = r16
        L4a:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L4d:
            r6 = r18
            if (r4 >= r2) goto Le
            r9 = r1[r4]
            if (r9 < 0) goto Le
            int r4 = r4 + 1
            int r18 = r6 + 1
            if (r6 != r8) goto L5d
            goto L1b7
        L5d:
            if (r9 == r15) goto L6d
            if (r9 == r14) goto L6d
            if (r9 < 0) goto L67
            if (r9 >= r13) goto L67
            goto L1b6
        L67:
            if (r12 > r9) goto L6d
            if (r9 >= r11) goto L6d
            goto L1b6
        L6d:
            if (r9 != r10) goto L71
            goto L1b6
        L71:
            if (r9 >= r3) goto L76
            r6 = r17
            goto L78
        L76:
            r6 = r16
        L78:
            int r5 = r5 + r6
            goto L4d
        L7a:
            int r7 = r9 >> 5
            r3 = -2
            r10 = 128(0x80, float:1.8E-43)
            if (r7 != r3) goto Lc8
            int r3 = r4 + 1
            if (r2 > r3) goto L89
            if (r6 != r8) goto L1b6
            goto L1b7
        L89:
            r3 = r1[r3]
            r7 = r3 & 192(0xc0, float:2.69E-43)
            if (r7 != r10) goto Lc4
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r9 << 6
            r3 = r3 ^ r7
            if (r3 >= r10) goto L9a
            if (r6 != r8) goto L1b6
            goto L1b7
        L9a:
            int r7 = r6 + 1
            if (r6 != r8) goto La0
            goto L1b7
        La0:
            if (r3 == r15) goto Lb0
            if (r3 == r14) goto Lb0
            if (r3 < 0) goto Laa
            if (r3 >= r13) goto Laa
            goto L1b6
        Laa:
            if (r12 > r3) goto Lb0
            if (r3 >= r11) goto Lb0
            goto L1b6
        Lb0:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto Lb7
            goto L1b6
        Lb7:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto Lbd
            r16 = r17
        Lbd:
            int r5 = r5 + r16
            int r4 = r4 + 2
        Lc1:
            r6 = r7
            goto Le
        Lc4:
            if (r6 != r8) goto L1b6
            goto L1b7
        Lc8:
            int r7 = r9 >> 4
            r11 = 57344(0xe000, float:8.0356E-41)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r7 != r3) goto L138
            int r3 = r4 + 2
            if (r2 > r3) goto Lda
            if (r6 != r8) goto L1b6
            goto L1b7
        Lda:
            int r7 = r4 + 1
            r7 = r1[r7]
            r13 = r7 & 192(0xc0, float:2.69E-43)
            if (r13 != r10) goto L134
            r3 = r1[r3]
            r13 = r3 & 192(0xc0, float:2.69E-43)
            if (r13 != r10) goto L130
            r10 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r10
            int r7 = r7 << 6
            r3 = r3 ^ r7
            int r7 = r9 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto Lfa
            if (r6 != r8) goto L1b6
            goto L1b7
        Lfa:
            if (r12 > r3) goto L102
            if (r3 >= r11) goto L102
            if (r6 != r8) goto L1b6
            goto L1b7
        L102:
            int r7 = r6 + 1
            if (r6 != r8) goto L108
            goto L1b7
        L108:
            if (r3 == r15) goto L11e
            if (r3 == r14) goto L11e
            if (r3 < 0) goto L114
            r6 = 32
            if (r3 >= r6) goto L114
            goto L1b6
        L114:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L11e
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L11e
            goto L1b6
        L11e:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L125
            goto L1b6
        L125:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto L12b
            r16 = r17
        L12b:
            int r5 = r5 + r16
            int r4 = r4 + 3
            goto Lc1
        L130:
            if (r6 != r8) goto L1b6
            goto L1b7
        L134:
            if (r6 != r8) goto L1b6
            goto L1b7
        L138:
            int r7 = r9 >> 3
            if (r7 != r3) goto L1b3
            int r3 = r4 + 3
            if (r2 > r3) goto L144
            if (r6 != r8) goto L1b6
            goto L1b7
        L144:
            int r7 = r4 + 1
            r7 = r1[r7]
            r13 = r7 & 192(0xc0, float:2.69E-43)
            if (r13 != r10) goto L1b0
            int r13 = r4 + 2
            r13 = r1[r13]
            r14 = r13 & 192(0xc0, float:2.69E-43)
            if (r14 != r10) goto L1ad
            r3 = r1[r3]
            r14 = r3 & 192(0xc0, float:2.69E-43)
            if (r14 != r10) goto L1aa
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r13 << 6
            r3 = r3 ^ r10
            int r7 = r7 << 12
            r3 = r3 ^ r7
            int r7 = r9 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L16f
            if (r6 != r8) goto L1b6
            goto L1b7
        L16f:
            if (r12 > r3) goto L176
            if (r3 >= r11) goto L176
            if (r6 != r8) goto L1b6
            goto L1b7
        L176:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r7) goto L17d
            if (r6 != r8) goto L1b6
            goto L1b7
        L17d:
            int r7 = r6 + 1
            if (r6 != r8) goto L182
            goto L1b7
        L182:
            if (r3 == r15) goto L198
            r6 = 13
            if (r3 == r6) goto L198
            if (r3 < 0) goto L18f
            r6 = 32
            if (r3 >= r6) goto L18f
            goto L1b6
        L18f:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L198
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L198
            goto L1b6
        L198:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L19e
            goto L1b6
        L19e:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto L1a4
            r16 = r17
        L1a4:
            int r5 = r5 + r16
            int r4 = r4 + 4
            goto Lc1
        L1aa:
            if (r6 != r8) goto L1b6
            goto L1b7
        L1ad:
            if (r6 != r8) goto L1b6
            goto L1b7
        L1b0:
            if (r6 != r8) goto L1b6
            goto L1b7
        L1b3:
            if (r6 != r8) goto L1b6
            goto L1b7
        L1b6:
            r5 = -1
        L1b7:
            java.lang.String r2 = "…]"
            java.lang.String r3 = "[size="
            r4 = 93
            r6 = -1
            if (r5 != r6) goto L21a
            int r5 = r1.length
            if (r5 > r8) goto L1d9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[hex="
            r1.<init>(r2)
            java.lang.String r0 = r0.e()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            return r0
        L1d9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            int r3 = r1.length
            r4.append(r3)
            java.lang.String r3 = " hex="
            r4.append(r3)
            int r3 = r1.length
            if (r8 > r3) goto L207
            int r3 = r1.length
            if (r8 != r3) goto L1ee
            goto L1f8
        L1ee:
            da0 r0 = new da0
            r3 = 0
            byte[] r1 = defpackage.fv.x0(r1, r3, r8)
            r0.<init>(r1)
        L1f8:
            java.lang.String r0 = r0.e()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            return r0
        L207:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "endIndex > length("
            r0.<init>(r2)
            int r1 = r1.length
            r2 = 41
            java.lang.String r0 = defpackage.xg6.q(r0, r1, r2)
            defpackage.i.f(r0)
            r0 = 0
            return r0
        L21a:
            java.lang.String r0 = r0.s()
            r6 = 0
            java.lang.String r6 = r0.substring(r6, r5)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r6 = defpackage.xs6.e0(r6, r7, r8)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r6 = defpackage.xs6.e0(r6, r7, r8)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r6 = defpackage.xs6.e0(r6, r7, r8)
            int r0 = r0.length()
            if (r5 >= r0) goto L25a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " text="
            r0.append(r1)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L25a:
            java.lang.String r0 = "[text="
            java.lang.String r0 = defpackage.i61.k(r4, r0, r6)
            return r0
    }
}
