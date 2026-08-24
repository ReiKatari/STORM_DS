package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ks0  reason: default package */
/* loaded from: classes.dex */
public final class ks0 {
    public int a;
    public defpackage.ls0 b;
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i;

    public ks0(byte[] r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0.i = r4
            r0.c = r1
            int r3 = r3 + r2
            r0.d = r3
            r0.f = r2
            r0.g = r2
            return
    }

    public static int a(int r1) {
            int r0 = r1 >>> 1
            r1 = r1 & 1
            int r1 = -r1
            r1 = r1 ^ r0
            return r1
    }

    public static long b(long r4) {
            r0 = 1
            long r0 = r4 >>> r0
            r2 = 1
            long r4 = r4 & r2
            long r4 = -r4
            long r4 = r4 ^ r0
            return r4
    }

    public final int c() {
            r1 = this;
            int r0 = r1.f
            int r1 = r1.g
            int r0 = r0 - r1
            return r0
    }

    public final boolean d() {
            r1 = this;
            int r0 = r1.f
            int r1 = r1.d
            if (r0 != r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final int e(int r2) {
            r1 = this;
            if (r2 < 0) goto L16
            int r0 = r1.c()
            int r0 = r0 + r2
            int r2 = r1.i
            if (r0 > r2) goto L11
            r1.i = r0
            r1.m()
            return r2
        L11:
            ub3 r1 = defpackage.ub3.e()
            throw r1
        L16:
            ub3 r1 = defpackage.ub3.c()
            throw r1
    }

    public final boolean f() {
            r4 = this;
            long r0 = r4.j()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            r4 = 1
            return r4
        Lc:
            r4 = 0
            return r4
    }

    public final int g() {
            r3 = this;
            int r0 = r3.f
            int r1 = r3.d
            int r1 = r1 - r0
            r2 = 4
            if (r1 < r2) goto L2e
            int r1 = r0 + 4
            r3.f = r1
            byte[] r3 = r3.c
            r1 = r3[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r0 + 1
            r2 = r3[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r0 + 2
            r2 = r3[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r0 = r0 + 3
            r3 = r3[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 24
            r3 = r3 | r1
            return r3
        L2e:
            ub3 r3 = defpackage.ub3.e()
            throw r3
    }

    public final long h() {
            r9 = this;
            int r0 = r9.f
            int r1 = r9.d
            int r1 = r1 - r0
            r2 = 8
            if (r1 < r2) goto L5c
            int r1 = r0 + 8
            r9.f = r1
            byte[] r9 = r9.c
            r1 = r9[r0]
            long r3 = (long) r1
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r1 = r0 + 1
            r1 = r9[r1]
            long r7 = (long) r1
            long r7 = r7 & r5
            long r1 = r7 << r2
            long r1 = r1 | r3
            int r3 = r0 + 2
            r3 = r9[r3]
            long r3 = (long) r3
            long r3 = r3 & r5
            r7 = 16
            long r3 = r3 << r7
            long r1 = r1 | r3
            int r3 = r0 + 3
            r3 = r9[r3]
            long r3 = (long) r3
            long r3 = r3 & r5
            r7 = 24
            long r3 = r3 << r7
            long r1 = r1 | r3
            int r3 = r0 + 4
            r3 = r9[r3]
            long r3 = (long) r3
            long r3 = r3 & r5
            r7 = 32
            long r3 = r3 << r7
            long r1 = r1 | r3
            int r3 = r0 + 5
            r3 = r9[r3]
            long r3 = (long) r3
            long r3 = r3 & r5
            r7 = 40
            long r3 = r3 << r7
            long r1 = r1 | r3
            int r3 = r0 + 6
            r3 = r9[r3]
            long r3 = (long) r3
            long r3 = r3 & r5
            r7 = 48
            long r3 = r3 << r7
            long r1 = r1 | r3
            int r0 = r0 + 7
            r9 = r9[r0]
            long r3 = (long) r9
            long r3 = r3 & r5
            r9 = 56
            long r3 = r3 << r9
            long r0 = r1 | r3
            return r0
        L5c:
            ub3 r9 = defpackage.ub3.e()
            throw r9
    }

    public final int i() {
            r7 = this;
            int r0 = r7.f
            int r1 = r7.d
            if (r1 != r0) goto L7
            goto L6b
        L7:
            int r2 = r0 + 1
            byte[] r3 = r7.c
            r4 = r3[r0]
            if (r4 < 0) goto L12
            r7.f = r2
            return r4
        L12:
            int r1 = r1 - r2
            r5 = 9
            if (r1 >= r5) goto L18
            goto L6b
        L18:
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L24
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L79
        L24:
            int r4 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r2
            if (r1 < 0) goto L31
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r4
            goto L79
        L31:
            int r2 = r0 + 4
            r4 = r3[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            if (r1 >= 0) goto L40
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
        L3e:
            r1 = r2
            goto L79
        L40:
            int r4 = r0 + 5
            r2 = r3[r2]
            int r5 = r2 << 28
            r1 = r1 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r1 = r1 ^ r5
            if (r2 >= 0) goto L75
            int r2 = r0 + 6
            r4 = r3[r4]
            if (r4 >= 0) goto L77
            int r4 = r0 + 7
            r2 = r3[r2]
            if (r2 >= 0) goto L75
            int r2 = r0 + 8
            r4 = r3[r4]
            if (r4 >= 0) goto L77
            int r4 = r0 + 9
            r2 = r3[r2]
            if (r2 >= 0) goto L75
            int r0 = r0 + 10
            r2 = r3[r4]
            if (r2 >= 0) goto L71
        L6b:
            long r0 = r7.k()
            int r7 = (int) r0
            return r7
        L71:
            r6 = r1
            r1 = r0
            r0 = r6
            goto L79
        L75:
            r0 = r1
            goto L2f
        L77:
            r0 = r1
            goto L3e
        L79:
            r7.f = r1
            return r0
    }

    public final long j() {
            r12 = this;
            int r0 = r12.f
            int r1 = r12.d
            if (r1 != r0) goto L8
            goto Lb6
        L8:
            int r2 = r0 + 1
            byte[] r3 = r12.c
            r4 = r3[r0]
            if (r4 < 0) goto L14
            r12.f = r2
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r2
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb6
        L1b:
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L29
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            long r2 = (long) r0
            goto Lbd
        L29:
            int r4 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r2
            if (r1 < 0) goto L38
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            long r2 = (long) r0
            r1 = r4
            goto Lbd
        L38:
            int r2 = r0 + 4
            r4 = r3[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            if (r1 >= 0) goto L4b
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            long r0 = (long) r0
        L46:
            r10 = r0
            r1 = r2
            r2 = r10
            goto Lbd
        L4b:
            long r4 = (long) r1
            int r1 = r0 + 5
            r2 = r3[r2]
            long r6 = (long) r2
            r2 = 28
            long r6 = r6 << r2
            long r4 = r4 ^ r6
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L60
            r2 = 266354560(0xfe03f80, double:1.315966377E-315)
        L5e:
            long r2 = r2 ^ r4
            goto Lbd
        L60:
            int r2 = r0 + 6
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 35
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L74
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L72:
            long r0 = r0 ^ r4
            goto L46
        L74:
            int r1 = r0 + 7
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 42
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L87
            r2 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L5e
        L87:
            int r2 = r0 + 8
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 49
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L9a
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L72
        L9a:
            int r1 = r0 + 9
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 56
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto Lbc
            int r0 = r0 + 10
            r1 = r3[r1]
            long r1 = (long) r1
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lbb
        Lb6:
            long r0 = r12.k()
            return r0
        Lbb:
            r1 = r0
        Lbc:
            r2 = r4
        Lbd:
            r12.f = r1
            return r2
    }

    public final long k() {
            r6 = this;
            r0 = 0
            r2 = 0
        L3:
            r3 = 64
            if (r2 >= r3) goto L27
            int r3 = r6.f
            int r4 = r6.d
            if (r3 == r4) goto L22
            int r4 = r3 + 1
            r6.f = r4
            byte[] r4 = r6.c
            r3 = r4[r3]
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r2
            long r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L1f
            return r0
        L1f:
            int r2 = r2 + 7
            goto L3
        L22:
            ub3 r6 = defpackage.ub3.e()
            throw r6
        L27:
            ub3 r6 = new ub3
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            r6.<init>(r0)
            throw r6
    }

    public final int l() {
            r1 = this;
            boolean r0 = r1.d()
            if (r0 == 0) goto La
            r0 = 0
            r1.h = r0
            return r0
        La:
            int r0 = r1.i()
            r1.h = r0
            int r1 = r0 >>> 3
            if (r1 == 0) goto L15
            return r0
        L15:
            ub3 r1 = new ub3
            java.lang.String r0 = "Protocol message contained an invalid tag (zero)."
            r1.<init>(r0)
            throw r1
    }

    public final void m() {
            r3 = this;
            int r0 = r3.d
            int r1 = r3.e
            int r0 = r0 + r1
            r3.d = r0
            int r1 = r3.g
            int r1 = r0 - r1
            int r2 = r3.i
            if (r1 <= r2) goto L16
            int r1 = r1 - r2
            r3.e = r1
            int r0 = r0 - r1
            r3.d = r0
            return
        L16:
            r0 = 0
            r3.e = r0
            return
    }
}
