package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xm3  reason: default package */
/* loaded from: classes.dex */
public final class xm3 implements defpackage.qt6, defpackage.g34 {
    public final /* synthetic */ defpackage.an3 A;
    public final /* synthetic */ defpackage.gn3 B;

    public xm3(defpackage.gn3 r1) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            an3 r1 = r1.d0
            r0.A = r1
            return
    }

    @Override // defpackage.g34
    public final defpackage.f34 K(int r7, int r8, java.util.Map r9, defpackage.qn2 r10) {
            r6 = this;
            an3 r0 = r6.A
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            f34 r6 = r0.o0(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // defpackage.qh1
    public final long M(float r1) {
            r0 = this;
            an3 r0 = r0.A
            long r0 = r0.M(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float Q(int r1) {
            r0 = this;
            an3 r0 = r0.A
            float r0 = r0.Q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float T(float r1) {
            r0 = this;
            an3 r0 = r0.A
            float r0 = r0.a()
            float r1 = r1 / r0
            return r1
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            an3 r0 = r0.A
            float r0 = r0.L
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            an3 r0 = r0.A
            float r0 = r0.B
            return r0
    }

    @Override // defpackage.eb3
    public final boolean a0() {
            r0 = this;
            an3 r0 = r0.A
            boolean r0 = r0.a0()
            return r0
    }

    @Override // defpackage.qh1
    public final float e0(float r1) {
            r0 = this;
            an3 r0 = r0.A
            float r0 = r0.a()
            float r0 = r0 * r1
            return r0
    }

    @Override // defpackage.eb3
    public final defpackage.kk3 getLayoutDirection() {
            r0 = this;
            an3 r0 = r0.A
            kk3 r0 = r0.A
            return r0
    }

    @Override // defpackage.qh1
    public final int k0(long r1) {
            r0 = this;
            an3 r0 = r0.A
            int r0 = r0.k0(r1)
            return r0
    }

    @Override // defpackage.g34
    public final defpackage.f34 o0(int r1, int r2, java.util.Map r3, defpackage.qn2 r4, defpackage.qn2 r5) {
            r0 = this;
            an3 r0 = r0.A
            f34 r0 = r0.o0(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.qh1
    public final long p(float r1) {
            r0 = this;
            an3 r0 = r0.A
            long r0 = r0.p(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long q(long r1) {
            r0 = this;
            an3 r0 = r0.A
            long r0 = r0.q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final int r0(float r1) {
            r0 = this;
            an3 r0 = r0.A
            int r0 = r0.r0(r1)
            return r0
    }

    @Override // defpackage.qt6
    public final java.util.List v(defpackage.eo2 r10, java.lang.Object r11) {
            r9 = this;
            gn3 r9 = r9.B
            sm3 r0 = r9.A
            ja4 r1 = r9.Z
            java.lang.Object r2 = r1.g(r11)
            sm3 r2 = (defpackage.sm3) r2
            if (r2 == 0) goto L25
            java.util.List r3 = r0.o()
            aa4 r3 = (defpackage.aa4) r3
            java.lang.Object r3 = r3.B
            ua4 r3 = (defpackage.ua4) r3
            int r3 = r3.i(r2)
            int r4 = r9.R
            if (r3 >= r4) goto L25
            java.util.List r9 = r2.m()
            return r9
        L25:
            ja4 r2 = r9.h0
            ja4 r3 = r9.f0
            ua4 r4 = r9.i0
            int r5 = r4.L
            int r6 = r9.X
            if (r5 < r6) goto L32
            goto L37
        L32:
            java.lang.String r5 = "Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list."
            defpackage.p53.a(r5)
        L37:
            java.lang.Object r5 = r1.g(r11)
            sm3 r5 = (defpackage.sm3) r5
            int r6 = r4.L
            int r7 = r9.X
            if (r6 != r7) goto L47
            r4.b(r11)
            goto L4d
        L47:
            java.lang.Object[] r4 = r4.A
            r6 = r4[r7]
            r4[r7] = r11
        L4d:
            int r4 = r9.X
            r6 = 1
            int r4 = r4 + r6
            r9.X = r4
            boolean r4 = r3.b(r11)
            r7 = 0
            if (r4 != 0) goto L67
            if (r5 != 0) goto L67
            r9.k(r11, r10, r7)
            nt6 r9 = r9.f(r11)
            r2.m(r11, r9)
            goto Lc8
        L67:
            if (r4 != 0) goto La3
            if (r5 == 0) goto La3
            java.util.List r4 = r0.o()
            aa4 r4 = (defpackage.aa4) r4
            java.lang.Object r4 = r4.B
            ua4 r4 = (defpackage.ua4) r4
            int r4 = r4.i(r5)
            java.util.List r8 = r0.o()
            aa4 r8 = (defpackage.aa4) r8
            java.lang.Object r8 = r8.B
            ua4 r8 = (defpackage.ua4) r8
            int r8 = r8.L
            r9.j(r4, r8)
            int r4 = r9.k0
            int r4 = r4 + r6
            r9.k0 = r4
            r1.k(r11)
            r3.m(r11, r5)
            nt6 r1 = r9.f(r11)
            r2.m(r11, r1)
            boolean r0 = r0.H()
            if (r0 == 0) goto La3
            r9.h()
        La3:
            java.lang.Object r0 = r3.g(r11)
            sm3 r0 = (defpackage.sm3) r0
            r1 = 0
            if (r0 == 0) goto Lb5
            ja4 r2 = r9.Y
            java.lang.Object r2 = r2.g(r0)
            ym3 r2 = (defpackage.ym3) r2
            goto Lb6
        Lb5:
            r2 = r1
        Lb6:
            if (r2 == 0) goto Lbf
            boolean r4 = r2.d
            if (r4 != r6) goto Lbf
            r9.m(r0, r11, r7, r10)
        Lbf:
            if (r2 == 0) goto Lc3
            tu4 r1 = r2.f
        Lc3:
            if (r1 == 0) goto Lc8
            r9.d(r2, r6)
        Lc8:
            java.lang.Object r9 = r3.g(r11)
            sm3 r9 = (defpackage.sm3) r9
            if (r9 == 0) goto Lf1
            wm3 r9 = r9.C0
            d34 r9 = r9.p
            java.util.List r9 = r9.s0()
            r10 = r9
            aa4 r10 = (defpackage.aa4) r10
            java.lang.Object r11 = r10.B
            ua4 r11 = (defpackage.ua4) r11
            int r11 = r11.L
        Le1:
            if (r7 >= r11) goto Lf0
            java.lang.Object r0 = r10.get(r7)
            d34 r0 = (defpackage.d34) r0
            wm3 r0 = r0.Y
            r0.b = r6
            int r7 = r7 + 1
            goto Le1
        Lf0:
            return r9
        Lf1:
            yt1 r9 = defpackage.yt1.A
            return r9
    }

    @Override // defpackage.qh1
    public final long v0(long r1) {
            r0 = this;
            an3 r0 = r0.A
            long r0 = r0.v0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float x(long r1) {
            r0 = this;
            an3 r0 = r0.A
            float r0 = r0.x(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float y0(long r1) {
            r0 = this;
            an3 r0 = r0.A
            float r0 = r0.y0(r1)
            return r0
    }
}
