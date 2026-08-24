package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b27  reason: default package */
/* loaded from: classes.dex */
public final class b27 {
    public final defpackage.fp a;
    public final long b;
    public final defpackage.a47 c;
    public final defpackage.mk4 d;
    public final defpackage.j47 e;
    public long f;
    public final defpackage.fp g;
    public final defpackage.c37 h;
    public final defpackage.b47 i;

    public b27(defpackage.c37 r5, defpackage.mk4 r6, defpackage.b47 r7, defpackage.j47 r8) {
            r4 = this;
            fp r0 = r5.a
            long r1 = r5.b
            if (r7 == 0) goto L9
            a47 r3 = r7.a
            goto La
        L9:
            r3 = 0
        La:
            r4.<init>()
            r4.a = r0
            r4.b = r1
            r4.c = r3
            r4.d = r6
            r4.e = r8
            r4.f = r1
            r4.g = r0
            r4.h = r5
            r4.i = r7
            return
    }

    public final java.util.List a(defpackage.qn2 r6) {
            r5 = this;
            long r0 = r5.f
            boolean r0 = defpackage.k47.c(r0)
            if (r0 == 0) goto L17
            java.lang.Object r5 = r6.g(r5)
            ds1 r5 = (defpackage.ds1) r5
            if (r5 == 0) goto L15
            java.util.List r5 = defpackage.hf.b0(r5)
            return r5
        L15:
            r5 = 0
            return r5
        L17:
            pu0 r6 = new pu0
            java.lang.String r0 = ""
            r1 = 0
            r6.<init>(r0, r1)
            dd6 r0 = new dd6
            long r2 = r5.f
            int r2 = defpackage.k47.f(r2)
            long r3 = r5.f
            int r5 = defpackage.k47.f(r3)
            r0.<init>(r2, r5)
            r5 = 2
            ds1[] r5 = new defpackage.ds1[r5]
            r5[r1] = r6
            r6 = 1
            r5[r6] = r0
            java.util.List r5 = defpackage.hf.c0(r5)
            return r5
    }

    public final java.lang.Integer b() {
            r3 = this;
            a47 r0 = r3.c
            if (r0 == 0) goto L24
            v84 r0 = r0.b
            long r1 = r3.f
            int r1 = defpackage.k47.e(r1)
            mk4 r3 = r3.d
            int r1 = r3.s(r1)
            int r1 = r0.d(r1)
            r2 = 1
            int r0 = r0.c(r1, r2)
            int r3 = r3.i(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L24:
            r3 = 0
            return r3
    }

    public final java.lang.Integer c() {
            r3 = this;
            a47 r0 = r3.c
            if (r0 == 0) goto L23
            long r1 = r3.f
            int r1 = defpackage.k47.f(r1)
            mk4 r3 = r3.d
            int r1 = r3.s(r1)
            v84 r2 = r0.b
            int r1 = r2.d(r1)
            int r0 = r0.g(r1)
            int r3 = r3.i(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L23:
            r3 = 0
            return r3
    }

    public final java.lang.Integer d() {
            r6 = this;
            a47 r0 = r6.c
            if (r0 == 0) goto L44
            int r1 = r6.r()
        L8:
            fp r2 = r6.a
            java.lang.String r3 = r2.B
            int r3 = r3.length()
            if (r1 < r3) goto L19
            java.lang.String r6 = r2.B
            int r6 = r6.length()
            goto L3f
        L19:
            fp r2 = r6.g
            java.lang.String r2 = r2.B
            int r2 = r2.length()
            int r2 = r2 + (-1)
            if (r1 <= r2) goto L26
            goto L27
        L26:
            r2 = r1
        L27:
            long r2 = r0.j(r2)
            int r4 = defpackage.k47.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            if (r2 > r1) goto L39
            int r1 = r1 + 1
            goto L8
        L39:
            mk4 r6 = r6.d
            int r6 = r6.i(r2)
        L3f:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L44:
            r6 = 0
            return r6
    }

    public final java.lang.Integer e() {
            r5 = this;
            a47 r0 = r5.c
            if (r0 == 0) goto L34
            int r1 = r5.r()
        L8:
            if (r1 > 0) goto Lc
            r5 = 0
            goto L2f
        Lc:
            fp r2 = r5.g
            java.lang.String r2 = r2.B
            int r2 = r2.length()
            int r2 = r2 + (-1)
            if (r1 <= r2) goto L19
            goto L1a
        L19:
            r2 = r1
        L1a:
            long r2 = r0.j(r2)
            int r4 = defpackage.k47.c
            r4 = 32
            long r2 = r2 >> r4
            int r2 = (int) r2
            if (r2 < r1) goto L29
            int r1 = r1 + (-1)
            goto L8
        L29:
            mk4 r5 = r5.d
            int r5 = r5.i(r2)
        L2f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L34:
            r5 = 0
            return r5
    }

    public final boolean f() {
            r1 = this;
            a47 r0 = r1.c
            if (r0 == 0) goto Ld
            int r1 = r1.r()
            jl5 r1 = r0.h(r1)
            goto Le
        Ld:
            r1 = 0
        Le:
            jl5 r0 = defpackage.jl5.Rtl
            if (r1 == r0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    public final int g(defpackage.a47 r6, int r7) {
            r5 = this;
            int r0 = r5.r()
            j47 r1 = r5.e
            java.lang.Float r2 = r1.a
            if (r2 != 0) goto L16
            of5 r2 = r6.c(r0)
            float r2 = r2.a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.a = r2
        L16:
            v84 r2 = r6.b
            int r0 = r2.d(r0)
            int r0 = r0 + r7
            if (r0 >= 0) goto L21
            r5 = 0
            return r5
        L21:
            int r7 = r2.f
            if (r0 < r7) goto L2e
            fp r5 = r5.g
            java.lang.String r5 = r5.B
            int r5 = r5.length()
            return r5
        L2e:
            float r7 = r2.b(r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r3
            java.lang.Float r1 = r1.a
            r1.getClass()
            float r3 = r1.floatValue()
            boolean r4 = r5.f()
            if (r4 == 0) goto L4c
            float r4 = r6.f(r0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L5a
        L4c:
            boolean r4 = r5.f()
            if (r4 != 0) goto L60
            float r6 = r6.e(r0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 > 0) goto L60
        L5a:
            r5 = 1
            int r5 = r2.c(r0, r5)
            return r5
        L60:
            float r6 = r1.floatValue()
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r0 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r7)
            long r6 = (long) r6
            r3 = 32
            long r0 = r0 << r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r3
            long r6 = r6 | r0
            int r6 = r2.g(r6)
            mk4 r5 = r5.d
            int r5 = r5.i(r6)
            return r5
    }

    public final int h(defpackage.b47 r9, int r10) {
            r8 = this;
            jk3 r0 = r9.b
            a47 r1 = r9.a
            if (r0 == 0) goto L13
            jk3 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            of5 r9 = r9.O(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            of5 r9 = defpackage.of5.e
        L15:
            c37 r0 = r8.h
            long r2 = r0.b
            int r0 = defpackage.k47.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            mk4 r8 = r8.d
            int r0 = r8.s(r0)
            of5 r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            v84 r0 = r1.b
            int r9 = r0.g(r9)
            int r8 = r8.i(r9)
            return r8
    }

    public final void i() {
            r5 = this;
            j47 r0 = r5.e
            r1 = 0
            r0.a = r1
            fp r2 = r5.g
            java.lang.String r3 = r2.B
            int r3 = r3.length()
            if (r3 <= 0) goto L3a
            boolean r3 = r5.f()
            if (r3 == 0) goto L19
            r5.k()
            return
        L19:
            r0.a = r1
            java.lang.String r0 = r2.B
            int r0 = r0.length()
            if (r0 <= 0) goto L3a
            java.lang.String r0 = r2.B
            long r1 = r5.f
            int r3 = defpackage.k47.c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            int r0 = defpackage.mp2.w(r1, r0)
            r1 = -1
            if (r0 == r1) goto L3a
            r5.q(r0, r0)
        L3a:
            return
    }

    public final void j() {
            r4 = this;
            j47 r0 = r4.e
            r1 = 0
            r0.a = r1
            fp r0 = r4.g
            java.lang.String r1 = r0.B
            java.lang.String r0 = r0.B
            int r1 = r1.length()
            if (r1 <= 0) goto L32
            long r1 = r4.f
            int r1 = defpackage.k47.e(r1)
            int r1 = defpackage.qo2.w(r1, r0)
            long r2 = r4.f
            int r2 = defpackage.k47.e(r2)
            if (r1 != r2) goto L2f
            int r2 = r0.length()
            if (r1 == r2) goto L2f
            int r1 = r1 + 1
            int r1 = defpackage.qo2.w(r1, r0)
        L2f:
            r4.q(r1, r1)
        L32:
            return
    }

    public final void k() {
            r5 = this;
            j47 r0 = r5.e
            r1 = 0
            r0.a = r1
            fp r0 = r5.g
            java.lang.String r1 = r0.B
            int r1 = r1.length()
            if (r1 <= 0) goto L26
            java.lang.String r0 = r0.B
            long r1 = r5.f
            int r3 = defpackage.k47.c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            int r0 = defpackage.mp2.x(r1, r0)
            r1 = -1
            if (r0 == r1) goto L26
            r5.q(r0, r0)
        L26:
            return
    }

    public final void l() {
            r4 = this;
            j47 r0 = r4.e
            r1 = 0
            r0.a = r1
            fp r0 = r4.g
            java.lang.String r1 = r0.B
            java.lang.String r0 = r0.B
            int r1 = r1.length()
            if (r1 <= 0) goto L2e
            long r1 = r4.f
            int r1 = defpackage.k47.f(r1)
            int r1 = defpackage.qo2.x(r1, r0)
            long r2 = r4.f
            int r2 = defpackage.k47.f(r2)
            if (r1 != r2) goto L2b
            if (r1 == 0) goto L2b
            int r1 = r1 + (-1)
            int r1 = defpackage.qo2.x(r1, r0)
        L2b:
            r4.q(r1, r1)
        L2e:
            return
    }

    public final void m() {
            r5 = this;
            j47 r0 = r5.e
            r1 = 0
            r0.a = r1
            fp r2 = r5.g
            java.lang.String r3 = r2.B
            int r3 = r3.length()
            if (r3 <= 0) goto L3a
            boolean r3 = r5.f()
            if (r3 == 0) goto L37
            r0.a = r1
            java.lang.String r0 = r2.B
            int r0 = r0.length()
            if (r0 <= 0) goto L3a
            java.lang.String r0 = r2.B
            long r1 = r5.f
            int r3 = defpackage.k47.c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            int r0 = defpackage.mp2.w(r1, r0)
            r1 = -1
            if (r0 == r1) goto L3a
            r5.q(r0, r0)
            return
        L37:
            r5.k()
        L3a:
            return
    }

    public final void n() {
            r2 = this;
            j47 r0 = r2.e
            r1 = 0
            r0.a = r1
            fp r0 = r2.g
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            if (r0 <= 0) goto L1c
            java.lang.Integer r0 = r2.b()
            if (r0 == 0) goto L1c
            int r0 = r0.intValue()
            r2.q(r0, r0)
        L1c:
            return
    }

    public final void o() {
            r2 = this;
            j47 r0 = r2.e
            r1 = 0
            r0.a = r1
            fp r0 = r2.g
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            if (r0 <= 0) goto L1c
            java.lang.Integer r0 = r2.c()
            if (r0 == 0) goto L1c
            int r0 = r0.intValue()
            r2.q(r0, r0)
        L1c:
            return
    }

    public final void p() {
            r5 = this;
            fp r0 = r5.g
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            if (r0 <= 0) goto L22
            int r0 = defpackage.k47.c
            r0 = 32
            long r1 = r5.b
            long r0 = r1 >> r0
            int r0 = (int) r0
            long r1 = r5.f
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            long r0 = defpackage.jx2.f(r0, r1)
            r5.f = r0
        L22:
            return
    }

    public final void q(int r1, int r2) {
            r0 = this;
            long r1 = defpackage.jx2.f(r1, r2)
            r0.f = r1
            return
    }

    public final int r() {
            r4 = this;
            long r0 = r4.f
            int r2 = defpackage.k47.c
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            mk4 r4 = r4.d
            int r4 = r4.s(r0)
            return r4
    }
}
