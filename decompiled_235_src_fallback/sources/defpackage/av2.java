package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av2  reason: default package */
/* loaded from: classes.dex */
public final class av2 extends defpackage.l21 {
    public float t0;
    public int u0;
    public int v0;
    public defpackage.h11 w0;
    public int x0;
    public boolean y0;

    public av2() {
            r4 = this;
            r4.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.t0 = r0
            r0 = -1
            r4.u0 = r0
            r4.v0 = r0
            h11 r0 = r4.J
            r4.w0 = r0
            r0 = 0
            r4.x0 = r0
            java.util.ArrayList r1 = r4.R
            r1.clear()
            java.util.ArrayList r1 = r4.R
            h11 r2 = r4.w0
            r1.add(r2)
            h11[] r1 = r4.Q
            int r1 = r1.length
        L22:
            if (r0 >= r1) goto L2d
            h11[] r2 = r4.Q
            h11 r3 = r4.w0
            r2[r0] = r3
            int r0 = r0 + 1
            goto L22
        L2d:
            return
    }

    @Override // defpackage.l21
    public final boolean B() {
            r0 = this;
            boolean r0 = r0.y0
            return r0
    }

    @Override // defpackage.l21
    public final boolean C() {
            r0 = this;
            boolean r0 = r0.y0
            return r0
    }

    @Override // defpackage.l21
    public final void R(defpackage.jv3 r3, boolean r4) {
            r2 = this;
            l21 r4 = r2.U
            if (r4 != 0) goto L5
            return
        L5:
            h11 r4 = r2.w0
            r3.getClass()
            int r3 = defpackage.jv3.n(r4)
            int r4 = r2.x0
            r0 = 1
            r1 = 0
            if (r4 != r0) goto L25
            r2.Z = r3
            r2.a0 = r1
            l21 r3 = r2.U
            int r3 = r3.l()
            r2.M(r3)
            r2.P(r1)
            return
        L25:
            r2.Z = r1
            r2.a0 = r3
            l21 r3 = r2.U
            int r3 = r3.r()
            r2.P(r3)
            r2.M(r1)
            return
    }

    public final void S(int r2) {
            r1 = this;
            h11 r0 = r1.w0
            r0.l(r2)
            r2 = 1
            r1.y0 = r2
            return
    }

    public final void T(int r4) {
            r3 = this;
            int r0 = r3.x0
            if (r0 != r4) goto L5
            goto L2c
        L5:
            r3.x0 = r4
            java.util.ArrayList r4 = r3.R
            r4.clear()
            int r0 = r3.x0
            r1 = 1
            if (r0 != r1) goto L16
            h11 r0 = r3.I
            r3.w0 = r0
            goto L1a
        L16:
            h11 r0 = r3.J
            r3.w0 = r0
        L1a:
            h11 r0 = r3.w0
            r4.add(r0)
            h11[] r4 = r3.Q
            int r0 = r4.length
            r1 = 0
        L23:
            if (r1 >= r0) goto L2c
            h11 r2 = r3.w0
            r4[r1] = r2
            int r1 = r1 + 1
            goto L23
        L2c:
            return
    }

    @Override // defpackage.l21
    public final void b(defpackage.jv3 r8, boolean r9) {
            r7 = this;
            l21 r9 = r7.U
            m21 r9 = (defpackage.m21) r9
            if (r9 != 0) goto L8
            goto Le7
        L8:
            g11 r0 = defpackage.g11.LEFT
            h11 r0 = r9.j(r0)
            g11 r1 = defpackage.g11.RIGHT
            h11 r1 = r9.j(r1)
            l21 r2 = r7.U
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L24
            k21[] r2 = r2.T
            r2 = r2[r4]
            k21 r5 = defpackage.k21.WRAP_CONTENT
            if (r2 != r5) goto L24
            r2 = r3
            goto L25
        L24:
            r2 = r4
        L25:
            int r5 = r7.x0
            if (r5 != 0) goto L44
            g11 r0 = defpackage.g11.TOP
            h11 r0 = r9.j(r0)
            g11 r1 = defpackage.g11.BOTTOM
            h11 r1 = r9.j(r1)
            l21 r9 = r7.U
            if (r9 == 0) goto L42
            k21[] r9 = r9.T
            r9 = r9[r3]
            k21 r2 = defpackage.k21.WRAP_CONTENT
            if (r9 != r2) goto L42
            goto L43
        L42:
            r3 = r4
        L43:
            r2 = r3
        L44:
            boolean r9 = r7.y0
            r3 = -1
            r5 = 5
            if (r9 == 0) goto L82
            h11 r9 = r7.w0
            boolean r6 = r9.c
            if (r6 == 0) goto L82
            en6 r9 = r8.k(r9)
            h11 r6 = r7.w0
            int r6 = r6.d()
            r8.d(r9, r6)
            int r6 = r7.u0
            if (r6 == r3) goto L6b
            if (r2 == 0) goto L7f
            en6 r0 = r8.k(r1)
            r8.f(r0, r9, r4, r5)
            goto L7f
        L6b:
            int r6 = r7.v0
            if (r6 == r3) goto L7f
            if (r2 == 0) goto L7f
            en6 r1 = r8.k(r1)
            en6 r0 = r8.k(r0)
            r8.f(r9, r0, r4, r5)
            r8.f(r1, r9, r4, r5)
        L7f:
            r7.y0 = r4
            return
        L82:
            int r9 = r7.u0
            r6 = 8
            if (r9 == r3) goto La1
            h11 r9 = r7.w0
            en6 r9 = r8.k(r9)
            en6 r0 = r8.k(r0)
            int r7 = r7.u0
            r8.e(r9, r0, r7, r6)
            if (r2 == 0) goto Le7
            en6 r7 = r8.k(r1)
            r8.f(r7, r9, r4, r5)
            return
        La1:
            int r9 = r7.v0
            if (r9 == r3) goto Lc2
            h11 r9 = r7.w0
            en6 r9 = r8.k(r9)
            en6 r1 = r8.k(r1)
            int r7 = r7.v0
            int r7 = -r7
            r8.e(r9, r1, r7, r6)
            if (r2 == 0) goto Le7
            en6 r7 = r8.k(r0)
            r8.f(r9, r7, r4, r5)
            r8.f(r1, r9, r4, r5)
            return
        Lc2:
            float r9 = r7.t0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 == 0) goto Le7
            h11 r9 = r7.w0
            en6 r9 = r8.k(r9)
            en6 r1 = r8.k(r1)
            float r7 = r7.t0
            yu r2 = r8.l()
            qu r3 = r2.d
            r3.g(r9, r0)
            qu r9 = r2.d
            r9.g(r1, r7)
            r8.c(r2)
        Le7:
            return
    }

    @Override // defpackage.l21
    public final boolean c() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.l21
    public final void g(defpackage.l21 r1, java.util.HashMap r2) {
            r0 = this;
            super.g(r1, r2)
            av2 r1 = (defpackage.av2) r1
            float r2 = r1.t0
            r0.t0 = r2
            int r2 = r1.u0
            r0.u0 = r2
            int r2 = r1.v0
            r0.v0 = r2
            int r1 = r1.x0
            r0.T(r1)
            return
    }

    @Override // defpackage.l21
    public final defpackage.h11 j(defpackage.g11 r3) {
            r2 = this;
            int[] r0 = defpackage.yu2.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L1c
            r1 = 2
            if (r3 == r1) goto L1c
            r0 = 3
            if (r3 == r0) goto L15
            r0 = 4
            if (r3 == r0) goto L15
            goto L23
        L15:
            int r3 = r2.x0
            if (r3 != 0) goto L23
            h11 r2 = r2.w0
            return r2
        L1c:
            int r3 = r2.x0
            if (r3 != r0) goto L23
            h11 r2 = r2.w0
            return r2
        L23:
            r2 = 0
            return r2
    }
}
