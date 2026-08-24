package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nz3  reason: default package */
/* loaded from: classes.dex */
public final class nz3 implements defpackage.jk3 {
    public final defpackage.mz3 A;

    public nz3(defpackage.mz3 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.jk3
    public final long A(long r3) {
            r2 = this;
            mz3 r0 = r2.A
            eg4 r0 = r0.k0
            long r3 = r0.A(r3)
            long r0 = r2.a()
            long r2 = defpackage.jk4.f(r3, r0)
            return r2
    }

    @Override // defpackage.jk3
    public final defpackage.jk3 D() {
            r1 = this;
            boolean r0 = r1.t()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            defpackage.p53.c(r0)
        Lb:
            mz3 r1 = r1.A
            eg4 r1 = r1.k0
            sm3 r1 = r1.k0
            if0 r1 = r1.B0
            java.lang.Object r1 = r1.e
            eg4 r1 = (defpackage.eg4) r1
            eg4 r1 = r1.o0
            if (r1 == 0) goto L24
            mz3 r1 = r1.W0()
            if (r1 == 0) goto L24
            nz3 r1 = r1.n0
            return r1
        L24:
            r1 = 0
            return r1
    }

    @Override // defpackage.jk3
    public final long J(defpackage.jk3 r2, long r3) {
            r1 = this;
            r0 = 1
            long r1 = r1.R(r2, r3, r0)
            return r1
    }

    @Override // defpackage.jk3
    public final long N(long r3) {
            r2 = this;
            mz3 r0 = r2.A
            eg4 r0 = r0.k0
            long r3 = r0.N(r3)
            long r0 = r2.a()
            long r2 = defpackage.jk4.f(r3, r0)
            return r2
    }

    @Override // defpackage.jk3
    public final defpackage.of5 O(defpackage.jk3 r1, boolean r2) {
            r0 = this;
            mz3 r0 = r0.A
            eg4 r0 = r0.k0
            of5 r0 = r0.O(r1, r2)
            return r0
    }

    @Override // defpackage.jk3
    public final long P(long r4) {
            r3 = this;
            mz3 r0 = r3.A
            eg4 r0 = r0.k0
            long r1 = r3.a()
            long r3 = defpackage.jk4.f(r4, r1)
            long r3 = r0.P(r3)
            return r3
    }

    @Override // defpackage.jk3
    public final long R(defpackage.jk3 r10, long r11, boolean r13) {
            r9 = this;
            boolean r0 = r10 instanceof defpackage.nz3
            mz3 r1 = r9.A
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 32
            if (r0 == 0) goto La0
            nz3 r10 = (defpackage.nz3) r10
            mz3 r9 = r10.A
            eg4 r10 = r9.k0
            r10.h1()
            eg4 r0 = r1.k0
            eg4 r10 = r0.U0(r10)
            mz3 r10 = r10.W0()
            if (r10 == 0) goto L4f
            r13 = r13 ^ 1
            long r5 = r9.R0(r10, r13)
            long r11 = defpackage.kn2.a0(r11)
            long r11 = defpackage.i93.c(r5, r11)
            long r9 = r1.R0(r10, r13)
            long r9 = defpackage.i93.b(r11, r9)
            long r11 = r9 >> r4
            int r11 = (int) r11
            float r11 = (float) r11
            long r9 = r9 & r2
            int r9 = (int) r9
            float r9 = (float) r9
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r12 = (long) r9
            long r9 = r10 << r4
            long r11 = r12 & r2
            long r9 = r9 | r11
            return r9
        L4f:
            mz3 r10 = defpackage.xk2.t(r9)
            r0 = r13 ^ 1
            long r5 = r9.R0(r10, r0)
            long r7 = r10.l0
            long r5 = defpackage.i93.c(r5, r7)
            long r11 = defpackage.kn2.a0(r11)
            long r11 = defpackage.i93.c(r5, r11)
            mz3 r9 = defpackage.xk2.t(r1)
            long r0 = r1.R0(r9, r0)
            long r5 = r9.l0
            long r0 = defpackage.i93.c(r0, r5)
            long r11 = defpackage.i93.b(r11, r0)
            long r0 = r11 >> r4
            int r0 = (int) r0
            float r0 = (float) r0
            long r11 = r11 & r2
            int r11 = (int) r11
            float r11 = (float) r11
            int r12 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r12
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r11 = (long) r11
            long r0 = r0 << r4
            long r11 = r11 & r2
            long r11 = r11 | r0
            eg4 r9 = r9.k0
            eg4 r9 = r9.o0
            r9.getClass()
            eg4 r10 = r10.k0
            eg4 r10 = r10.o0
            r10.getClass()
            long r9 = r9.R(r10, r11, r13)
            return r9
        La0:
            mz3 r0 = defpackage.xk2.t(r1)
            eg4 r1 = r0.k0
            nz3 r5 = r0.n0
            long r11 = r9.R(r5, r11, r13)
            long r5 = r0.l0
            long r7 = r5 >> r4
            int r9 = (int) r7
            float r9 = (float) r9
            long r5 = r5 & r2
            int r0 = (int) r5
            float r0 = (float) r0
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r5 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r0)
            long r7 = (long) r9
            long r4 = r5 << r4
            long r2 = r2 & r7
            long r2 = r2 | r4
            long r11 = defpackage.jk4.e(r11, r2)
            z64 r9 = r1.Y0()
            boolean r9 = r9.j0
            if (r9 != 0) goto Ld4
            java.lang.String r9 = "LayoutCoordinate operations are only valid when isAttached is true"
            defpackage.p53.c(r9)
        Ld4:
            r1.h1()
            eg4 r9 = r1.o0
            if (r9 != 0) goto Ldc
            goto Ldd
        Ldc:
            r1 = r9
        Ldd:
            r2 = 0
            long r9 = r1.R(r10, r2, r13)
            long r9 = defpackage.jk4.f(r11, r9)
            return r9
    }

    public final long a() {
            r8 = this;
            mz3 r0 = r8.A
            mz3 r1 = defpackage.xk2.t(r0)
            nz3 r2 = r1.n0
            r3 = 0
            r5 = 1
            long r6 = r8.R(r2, r3, r5)
            eg4 r8 = r0.k0
            eg4 r0 = r1.k0
            long r0 = r8.R(r0, r3, r5)
            long r0 = defpackage.jk4.e(r6, r0)
            return r0
    }

    @Override // defpackage.jk3
    public final long d(long r4) {
            r3 = this;
            mz3 r0 = r3.A
            eg4 r0 = r0.k0
            long r1 = r3.a()
            long r3 = defpackage.jk4.f(r4, r1)
            long r3 = r0.d(r3)
            return r3
    }

    @Override // defpackage.jk3
    public final void k(float[] r1) {
            r0 = this;
            mz3 r0 = r0.A
            eg4 r0 = r0.k0
            r0.k(r1)
            return
    }

    @Override // defpackage.jk3
    public final void l(defpackage.jk3 r1, float[] r2) {
            r0 = this;
            mz3 r0 = r0.A
            eg4 r0 = r0.k0
            r0.l(r1, r2)
            return
    }

    @Override // defpackage.jk3
    public final long m() {
            r6 = this;
            mz3 r6 = r6.A
            int r0 = r6.A
            int r6 = r6.B
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    @Override // defpackage.jk3
    public final boolean t() {
            r0 = this;
            mz3 r0 = r0.A
            eg4 r0 = r0.k0
            z64 r0 = r0.Y0()
            boolean r0 = r0.j0
            return r0
    }

    @Override // defpackage.jk3
    public final long w(long r5) {
            r4 = this;
            mz3 r5 = r4.A
            eg4 r5 = r5.k0
            long r0 = r4.a()
            r2 = 0
            long r0 = defpackage.jk4.f(r2, r0)
            long r4 = r5.w(r0)
            return r4
    }
}
