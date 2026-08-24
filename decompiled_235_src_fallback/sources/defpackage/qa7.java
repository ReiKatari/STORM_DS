package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qa7  reason: default package */
/* loaded from: classes.dex */
public class qa7 extends defpackage.ea7 {
    public java.util.ArrayList A0;
    public boolean B0;
    public int C0;
    public boolean D0;
    public int E0;
    public defpackage.ea7[] F0;

    public qa7() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A0 = r0
            r0 = 1
            r1.B0 = r0
            r0 = 0
            r1.D0 = r0
            r1.E0 = r0
            return
    }

    @Override // defpackage.ea7
    public final void B(android.view.View r4) {
            r3 = this;
            super.B(r4)
            java.util.ArrayList r0 = r3.A0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList r2 = r3.A0
            java.lang.Object r2 = r2.get(r1)
            ea7 r2 = (defpackage.ea7) r2
            r2.B(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // defpackage.ea7
    public final void C() {
            r8 = this;
            r0 = 0
            r8.t0 = r0
            pa7 r0 = new pa7
            r1 = 0
            r0.<init>(r8, r1)
        La:
            java.util.ArrayList r2 = r8.A0
            int r2 = r2.size()
            if (r1 >= r2) goto L37
            java.util.ArrayList r2 = r8.A0
            java.lang.Object r2 = r2.get(r1)
            ea7 r2 = (defpackage.ea7) r2
            r2.a(r0)
            r2.C()
            long r3 = r2.t0
            boolean r5 = r8.B0
            long r6 = r8.t0
            if (r5 == 0) goto L2f
            long r2 = java.lang.Math.max(r6, r3)
            r8.t0 = r2
            goto L34
        L2f:
            r2.v0 = r6
            long r6 = r6 + r3
            r8.t0 = r6
        L34:
            int r1 = r1 + 1
            goto La
        L37:
            return
    }

    @Override // defpackage.ea7
    public final defpackage.ea7 D(defpackage.da7 r1) {
            r0 = this;
            super.D(r1)
            return r0
    }

    @Override // defpackage.ea7
    public final void E(android.view.View r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r2.A0
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList r1 = r2.A0
            java.lang.Object r1 = r1.get(r0)
            ea7 r1 = (defpackage.ea7) r1
            r1.E(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            java.util.ArrayList r2 = r2.Y
            r2.remove(r3)
            return
    }

    @Override // defpackage.ea7
    public final void F(android.view.View r6) {
            r5 = this;
            super.F(r6)
            ea7[] r0 = r5.F0
            r1 = 0
            r5.F0 = r1
            if (r0 != 0) goto L12
            java.util.ArrayList r0 = r5.A0
            int r0 = r0.size()
            ea7[] r0 = new defpackage.ea7[r0]
        L12:
            java.util.ArrayList r2 = r5.A0
            java.lang.Object[] r0 = r2.toArray(r0)
            ea7[] r0 = (defpackage.ea7[]) r0
            java.util.ArrayList r2 = r5.A0
            int r2 = r2.size()
            r3 = 0
        L21:
            if (r3 >= r2) goto L2b
            r4 = r0[r3]
            r4.F(r6)
            int r3 = r3 + 1
            goto L21
        L2b:
            java.util.Arrays.fill(r0, r1)
            r5.F0 = r0
            return
    }

    @Override // defpackage.ea7
    public final void G() {
            r6 = this;
            java.util.ArrayList r0 = r6.A0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            r6.O()
            r6.n()
            return
        Lf:
            pa7 r0 = new pa7
            r0.<init>()
            r0.b = r6
            java.util.ArrayList r1 = r6.A0
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L1e:
            if (r4 >= r2) goto L2c
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            ea7 r5 = (defpackage.ea7) r5
            r5.a(r0)
            goto L1e
        L2c:
            java.util.ArrayList r0 = r6.A0
            int r0 = r0.size()
            r6.C0 = r0
            boolean r0 = r6.B0
            if (r0 != 0) goto L6b
            r0 = 1
        L39:
            java.util.ArrayList r1 = r6.A0
            int r1 = r1.size()
            java.util.ArrayList r2 = r6.A0
            if (r0 >= r1) goto L5f
            int r1 = r0 + (-1)
            java.lang.Object r1 = r2.get(r1)
            ea7 r1 = (defpackage.ea7) r1
            java.util.ArrayList r2 = r6.A0
            java.lang.Object r2 = r2.get(r0)
            ea7 r2 = (defpackage.ea7) r2
            pa7 r4 = new pa7
            r5 = 2
            r4.<init>(r2, r5)
            r1.a(r4)
            int r0 = r0 + 1
            goto L39
        L5f:
            java.lang.Object r6 = r2.get(r3)
            ea7 r6 = (defpackage.ea7) r6
            if (r6 == 0) goto L7f
            r6.G()
            return
        L6b:
            java.util.ArrayList r6 = r6.A0
            int r0 = r6.size()
        L71:
            if (r3 >= r0) goto L7f
            java.lang.Object r1 = r6.get(r3)
            int r3 = r3 + 1
            ea7 r1 = (defpackage.ea7) r1
            r1.G()
            goto L71
        L7f:
            return
    }

    @Override // defpackage.ea7
    public final void H(long r20, long r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r5 = r0.t0
            qa7 r7 = r0.e0
            r8 = 0
            if (r7 == 0) goto L20
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L16
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto Lde
        L16:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L20
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L20
            goto Lde
        L20:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            r11 = 1
            if (r7 >= 0) goto L28
            r12 = r11
            goto L29
        L28:
            r12 = r10
        L29:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L31
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L39
        L31:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L40
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L40
        L39:
            r0.n0 = r10
            fa6 r14 = defpackage.fa6.B
            r0.A(r0, r14, r12)
        L40:
            boolean r14 = r0.B0
            if (r14 == 0) goto L5e
        L44:
            java.util.ArrayList r7 = r0.A0
            int r7 = r7.size()
            if (r10 >= r7) goto L5a
            java.util.ArrayList r7 = r0.A0
            java.lang.Object r7 = r7.get(r10)
            ea7 r7 = (defpackage.ea7) r7
            r7.H(r1, r3)
            int r10 = r10 + 1
            goto L44
        L5a:
            r16 = r8
            goto Lc3
        L5e:
            r10 = r11
        L5f:
            java.util.ArrayList r14 = r0.A0
            int r14 = r14.size()
            java.util.ArrayList r15 = r0.A0
            if (r10 >= r14) goto L7a
            java.lang.Object r14 = r15.get(r10)
            ea7 r14 = (defpackage.ea7) r14
            long r14 = r14.v0
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 <= 0) goto L77
        L75:
            int r10 = r10 - r11
            goto L7f
        L77:
            int r10 = r10 + 1
            goto L5f
        L7a:
            int r10 = r15.size()
            goto L75
        L7f:
            if (r7 < 0) goto La6
        L81:
            java.util.ArrayList r7 = r0.A0
            int r7 = r7.size()
            if (r10 >= r7) goto L5a
            java.util.ArrayList r7 = r0.A0
            java.lang.Object r7 = r7.get(r10)
            ea7 r7 = (defpackage.ea7) r7
            long r14 = r7.v0
            r16 = r8
            long r8 = r1 - r14
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 >= 0) goto L9c
            goto Lc3
        L9c:
            long r14 = r3 - r14
            r7.H(r8, r14)
            int r10 = r10 + 1
            r8 = r16
            goto L81
        La6:
            r16 = r8
        La8:
            if (r10 < 0) goto Lc3
            java.util.ArrayList r7 = r0.A0
            java.lang.Object r7 = r7.get(r10)
            ea7 r7 = (defpackage.ea7) r7
            long r8 = r7.v0
            long r14 = r1 - r8
            long r8 = r3 - r8
            r7.H(r14, r8)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 < 0) goto Lc0
            goto Lc3
        Lc0:
            int r10 = r10 + (-1)
            goto La8
        Lc3:
            qa7 r7 = r0.e0
            if (r7 == 0) goto Lde
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lcf
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Ld5
        Lcf:
            if (r13 >= 0) goto Lde
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 < 0) goto Lde
        Ld5:
            if (r1 <= 0) goto Ld9
            r0.n0 = r11
        Ld9:
            fa6 r1 = defpackage.fa6.L
            r0.A(r0, r1, r12)
        Lde:
            return
    }

    @Override // defpackage.ea7
    public final void I(long r4) {
            r3 = this;
            r3.L = r4
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L21
            java.util.ArrayList r0 = r3.A0
            if (r0 == 0) goto L21
            int r0 = r0.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L21
            java.util.ArrayList r2 = r3.A0
            java.lang.Object r2 = r2.get(r1)
            ea7 r2 = (defpackage.ea7) r2
            r2.I(r4)
            int r1 = r1 + 1
            goto L11
        L21:
            return
    }

    @Override // defpackage.ea7
    public final void J(defpackage.yh2 r4) {
            r3 = this;
            r3.r0 = r4
            int r0 = r3.E0
            r0 = r0 | 8
            r3.E0 = r0
            java.util.ArrayList r0 = r3.A0
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            java.util.ArrayList r2 = r3.A0
            java.lang.Object r2 = r2.get(r1)
            ea7 r2 = (defpackage.ea7) r2
            r2.J(r4)
            int r1 = r1 + 1
            goto Lf
        L1f:
            return
    }

    @Override // defpackage.ea7
    public final void K(android.animation.TimeInterpolator r4) {
            r3 = this;
            int r0 = r3.E0
            r0 = r0 | 1
            r3.E0 = r0
            java.util.ArrayList r0 = r3.A0
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            java.util.ArrayList r2 = r3.A0
            java.lang.Object r2 = r2.get(r1)
            ea7 r2 = (defpackage.ea7) r2
            r2.K(r4)
            int r1 = r1 + 1
            goto Lf
        L1f:
            r3.R = r4
            return
    }

    @Override // defpackage.ea7
    public final void L(defpackage.x31 r3) {
            r2 = this;
            super.L(r3)
            int r0 = r2.E0
            r0 = r0 | 4
            r2.E0 = r0
            java.util.ArrayList r0 = r2.A0
            if (r0 == 0) goto L24
            r0 = 0
        Le:
            java.util.ArrayList r1 = r2.A0
            int r1 = r1.size()
            if (r0 >= r1) goto L24
            java.util.ArrayList r1 = r2.A0
            java.lang.Object r1 = r1.get(r0)
            ea7 r1 = (defpackage.ea7) r1
            r1.L(r3)
            int r0 = r0 + 1
            goto Le
        L24:
            return
    }

    @Override // defpackage.ea7
    public final void M() {
            r3 = this;
            int r0 = r3.E0
            r0 = r0 | 2
            r3.E0 = r0
            java.util.ArrayList r0 = r3.A0
            int r0 = r0.size()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1d
            java.util.ArrayList r2 = r3.A0
            java.lang.Object r2 = r2.get(r1)
            ea7 r2 = (defpackage.ea7) r2
            r2.M()
            int r1 = r1 + 1
            goto Ld
        L1d:
            return
    }

    @Override // defpackage.ea7
    public final void N(long r1) {
            r0 = this;
            r0.B = r1
            return
    }

    @Override // defpackage.ea7
    public final java.lang.String P(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = super.P(r5)
            r1 = 0
        L5:
            java.util.ArrayList r2 = r4.A0
            int r2 = r2.size()
            if (r1 >= r2) goto L2f
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r0 = defpackage.i61.r(r0, r2)
            java.util.ArrayList r2 = r4.A0
            java.lang.Object r2 = r2.get(r1)
            ea7 r2 = (defpackage.ea7) r2
            java.lang.String r3 = "  "
            java.lang.String r3 = r5.concat(r3)
            java.lang.String r2 = r2.P(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r1 + 1
            goto L5
        L2f:
            return r0
    }

    public final void Q(defpackage.ea7 r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.A0
            r0.add(r5)
            r5.e0 = r4
            long r0 = r4.L
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L12
            r5.I(r0)
        L12:
            int r0 = r4.E0
            r0 = r0 & 1
            if (r0 == 0) goto L1d
            android.animation.TimeInterpolator r0 = r4.R
            r5.K(r0)
        L1d:
            int r0 = r4.E0
            r0 = r0 & 2
            if (r0 == 0) goto L26
            r5.M()
        L26:
            int r0 = r4.E0
            r0 = r0 & 4
            if (r0 == 0) goto L31
            x31 r0 = r4.s0
            r5.L(r0)
        L31:
            int r0 = r4.E0
            r0 = r0 & 8
            if (r0 == 0) goto L3c
            yh2 r4 = r4.r0
            r5.J(r4)
        L3c:
            return
    }

    public final defpackage.ea7 R(int r2) {
            r1 = this;
            if (r2 < 0) goto L14
            java.util.ArrayList r0 = r1.A0
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L14
        Lb:
            java.util.ArrayList r1 = r1.A0
            java.lang.Object r1 = r1.get(r2)
            ea7 r1 = (defpackage.ea7) r1
            return r1
        L14:
            r1 = 0
            return r1
    }

    @Override // defpackage.ea7
    public final void b(android.view.View r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r2.A0
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList r1 = r2.A0
            java.lang.Object r1 = r1.get(r0)
            ea7 r1 = (defpackage.ea7) r1
            r1.b(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            java.util.ArrayList r2 = r2.Y
            r2.add(r3)
            return
    }

    @Override // defpackage.ea7
    public final void cancel() {
            r5 = this;
            super.cancel()
            ea7[] r0 = r5.F0
            r1 = 0
            r5.F0 = r1
            if (r0 != 0) goto L12
            java.util.ArrayList r0 = r5.A0
            int r0 = r0.size()
            ea7[] r0 = new defpackage.ea7[r0]
        L12:
            java.util.ArrayList r2 = r5.A0
            java.lang.Object[] r0 = r2.toArray(r0)
            ea7[] r0 = (defpackage.ea7[]) r0
            java.util.ArrayList r2 = r5.A0
            int r2 = r2.size()
            r3 = 0
        L21:
            if (r3 >= r2) goto L2b
            r4 = r0[r3]
            r4.cancel()
            int r3 = r3 + 1
            goto L21
        L2b:
            java.util.Arrays.fill(r0, r1)
            r5.F0 = r0
            return
    }

    @Override // defpackage.ea7
    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            ea7 r0 = r0.k()
            return r0
    }

    @Override // defpackage.ea7
    public final void d(defpackage.sa7 r6) {
            r5 = this;
            android.view.View r0 = r6.b
            boolean r1 = r5.y(r0)
            if (r1 == 0) goto L28
            java.util.ArrayList r5 = r5.A0
            int r1 = r5.size()
            r2 = 0
        Lf:
            if (r2 >= r1) goto L28
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            ea7 r3 = (defpackage.ea7) r3
            boolean r4 = r3.y(r0)
            if (r4 == 0) goto Lf
            r3.d(r6)
            java.util.ArrayList r4 = r6.c
            r4.add(r3)
            goto Lf
        L28:
            return
    }

    @Override // defpackage.ea7
    public final void f(defpackage.sa7 r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.A0
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList r2 = r3.A0
            java.lang.Object r2 = r2.get(r1)
            ea7 r2 = (defpackage.ea7) r2
            r2.f(r4)
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    @Override // defpackage.ea7
    public final void g(defpackage.sa7 r6) {
            r5 = this;
            android.view.View r0 = r6.b
            boolean r1 = r5.y(r0)
            if (r1 == 0) goto L28
            java.util.ArrayList r5 = r5.A0
            int r1 = r5.size()
            r2 = 0
        Lf:
            if (r2 >= r1) goto L28
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            ea7 r3 = (defpackage.ea7) r3
            boolean r4 = r3.y(r0)
            if (r4 == 0) goto Lf
            r3.g(r6)
            java.util.ArrayList r4 = r6.c
            r4.add(r3)
            goto Lf
        L28:
            return
    }

    @Override // defpackage.ea7
    public final defpackage.ea7 k() {
            r5 = this;
            ea7 r0 = super.k()
            qa7 r0 = (defpackage.qa7) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.A0 = r1
            java.util.ArrayList r1 = r5.A0
            int r1 = r1.size()
            r2 = 0
        L14:
            if (r2 >= r1) goto L2c
            java.util.ArrayList r3 = r5.A0
            java.lang.Object r3 = r3.get(r2)
            ea7 r3 = (defpackage.ea7) r3
            ea7 r3 = r3.k()
            java.util.ArrayList r4 = r0.A0
            r4.add(r3)
            r3.e0 = r0
            int r2 = r2 + 1
            goto L14
        L2c:
            return r0
    }

    @Override // defpackage.ea7
    public final void m(android.view.ViewGroup r12, defpackage.eb r13, defpackage.eb r14, java.util.ArrayList r15, java.util.ArrayList r16) {
            r11 = this;
            long r0 = r11.B
            java.util.ArrayList r2 = r11.A0
            int r2 = r2.size()
            r3 = 0
        L9:
            if (r3 >= r2) goto L3d
            java.util.ArrayList r4 = r11.A0
            java.lang.Object r4 = r4.get(r3)
            r5 = r4
            ea7 r5 = (defpackage.ea7) r5
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L21
            boolean r4 = r11.B0
            if (r4 != 0) goto L28
            if (r3 != 0) goto L21
            goto L28
        L21:
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            goto L37
        L28:
            long r8 = r5.B
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L33
            long r8 = r8 + r0
            r5.N(r8)
            goto L21
        L33:
            r5.N(r0)
            goto L21
        L37:
            r5.m(r6, r7, r8, r9, r10)
            int r3 = r3 + 1
            goto L9
        L3d:
            return
    }

    @Override // defpackage.ea7
    public final boolean u() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList r2 = r3.A0
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList r2 = r3.A0
            java.lang.Object r2 = r2.get(r1)
            ea7 r2 = (defpackage.ea7) r2
            boolean r2 = r2.u()
            if (r2 == 0) goto L1a
            r3 = 1
            return r3
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }

    @Override // defpackage.ea7
    public final boolean v() {
            r4 = this;
            java.util.ArrayList r0 = r4.A0
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1c
            java.util.ArrayList r3 = r4.A0
            java.lang.Object r3 = r3.get(r2)
            ea7 r3 = (defpackage.ea7) r3
            boolean r3 = r3.v()
            if (r3 != 0) goto L19
            return r1
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            r4 = 1
            return r4
    }
}
