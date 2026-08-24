package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m21  reason: default package */
/* loaded from: classes.dex */
public final class m21 extends defpackage.l21 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public defpackage.jl0[] E0;
    public defpackage.jl0[] F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public java.lang.ref.WeakReference J0;
    public java.lang.ref.WeakReference K0;
    public java.lang.ref.WeakReference L0;
    public java.lang.ref.WeakReference M0;
    public final java.util.HashSet N0;
    public final defpackage.e30 O0;
    public java.util.ArrayList t0;
    public final defpackage.bt u0;
    public final defpackage.ai1 v0;
    public int w0;
    public defpackage.p11 x0;
    public boolean y0;
    public final defpackage.jv3 z0;

    public m21() {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.t0 = r0
            bt r0 = new bt
            r0.<init>(r4)
            r4.u0 = r0
            ai1 r0 = new ai1
            r0.<init>()
            r1 = 1
            r0.b = r1
            r0.c = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1 = 0
            r0.h = r1
            e30 r2 = new e30
            r2.<init>()
            r0.i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.g = r2
            r0.d = r4
            r0.e = r4
            r4.v0 = r0
            r4.x0 = r1
            r0 = 0
            r4.y0 = r0
            jv3 r2 = new jv3
            r2.<init>()
            r4.z0 = r2
            r4.C0 = r0
            r4.D0 = r0
            r2 = 4
            jl0[] r3 = new defpackage.jl0[r2]
            r4.E0 = r3
            jl0[] r2 = new defpackage.jl0[r2]
            r4.F0 = r2
            r2 = 257(0x101, float:3.6E-43)
            r4.G0 = r2
            r4.H0 = r0
            r4.I0 = r0
            r4.J0 = r1
            r4.K0 = r1
            r4.L0 = r1
            r4.M0 = r1
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.N0 = r0
            e30 r0 = new e30
            r0.<init>()
            r4.O0 = r0
            return
    }

    public static void W(defpackage.l21 r8, defpackage.p11 r9, defpackage.e30 r10) {
            if (r9 != 0) goto L3
            return
        L3:
            int r0 = r8.h0
            int[] r1 = r8.t
            r2 = 8
            r3 = 0
            if (r0 == r2) goto L11d
            boolean r0 = r8 instanceof defpackage.av2
            if (r0 != 0) goto L11d
            boolean r0 = r8 instanceof defpackage.a20
            if (r0 == 0) goto L16
            goto L11d
        L16:
            k21[] r0 = r8.T
            r2 = r0[r3]
            r10.a = r2
            r2 = 1
            r0 = r0[r2]
            r10.b = r0
            int r0 = r8.r()
            r10.c = r0
            int r0 = r8.l()
            r10.d = r0
            r10.i = r3
            r10.j = r3
            k21 r0 = r10.a
            k21 r4 = defpackage.k21.MATCH_CONSTRAINT
            if (r0 != r4) goto L39
            r0 = r2
            goto L3a
        L39:
            r0 = r3
        L3a:
            k21 r5 = r10.b
            if (r5 != r4) goto L40
            r4 = r2
            goto L41
        L40:
            r4 = r3
        L41:
            r5 = 0
            if (r0 == 0) goto L4c
            float r6 = r8.X
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 <= 0) goto L4c
            r6 = r2
            goto L4d
        L4c:
            r6 = r3
        L4d:
            if (r4 == 0) goto L57
            float r7 = r8.X
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L57
            r5 = r2
            goto L58
        L57:
            r5 = r3
        L58:
            if (r0 == 0) goto L75
            boolean r7 = r8.u(r3)
            if (r7 == 0) goto L75
            int r7 = r8.r
            if (r7 != 0) goto L75
            if (r6 != 0) goto L75
            k21 r0 = defpackage.k21.WRAP_CONTENT
            r10.a = r0
            if (r4 == 0) goto L74
            int r0 = r8.s
            if (r0 != 0) goto L74
            k21 r0 = defpackage.k21.FIXED
            r10.a = r0
        L74:
            r0 = r3
        L75:
            if (r4 == 0) goto L92
            boolean r7 = r8.u(r2)
            if (r7 == 0) goto L92
            int r7 = r8.s
            if (r7 != 0) goto L92
            if (r5 != 0) goto L92
            k21 r4 = defpackage.k21.WRAP_CONTENT
            r10.b = r4
            if (r0 == 0) goto L91
            int r4 = r8.r
            if (r4 != 0) goto L91
            k21 r4 = defpackage.k21.FIXED
            r10.b = r4
        L91:
            r4 = r3
        L92:
            boolean r7 = r8.B()
            if (r7 == 0) goto L9d
            k21 r0 = defpackage.k21.FIXED
            r10.a = r0
            r0 = r3
        L9d:
            boolean r7 = r8.C()
            if (r7 == 0) goto La8
            k21 r4 = defpackage.k21.FIXED
            r10.b = r4
            r4 = r3
        La8:
            r7 = 4
            if (r6 == 0) goto Ld1
            r6 = r1[r3]
            if (r6 != r7) goto Lb4
            k21 r4 = defpackage.k21.FIXED
            r10.a = r4
            goto Ld1
        Lb4:
            if (r4 != 0) goto Ld1
            k21 r4 = r10.b
            k21 r6 = defpackage.k21.FIXED
            if (r4 != r6) goto Lbf
            int r4 = r10.d
            goto Lc8
        Lbf:
            k21 r4 = defpackage.k21.WRAP_CONTENT
            r10.a = r4
            r9.b(r8, r10)
            int r4 = r10.f
        Lc8:
            r10.a = r6
            float r6 = r8.X
            float r4 = (float) r4
            float r6 = r6 * r4
            int r4 = (int) r6
            r10.c = r4
        Ld1:
            if (r5 == 0) goto L104
            r1 = r1[r2]
            if (r1 != r7) goto Ldc
            k21 r0 = defpackage.k21.FIXED
            r10.b = r0
            goto L104
        Ldc:
            if (r0 != 0) goto L104
            k21 r0 = r10.a
            k21 r1 = defpackage.k21.FIXED
            if (r0 != r1) goto Le7
            int r0 = r10.c
            goto Lf0
        Le7:
            k21 r0 = defpackage.k21.WRAP_CONTENT
            r10.b = r0
            r9.b(r8, r10)
            int r0 = r10.e
        Lf0:
            r10.b = r1
            int r1 = r8.Y
            float r2 = r8.X
            r4 = -1
            if (r1 != r4) goto Lff
            float r0 = (float) r0
            float r0 = r0 / r2
            int r0 = (int) r0
            r10.d = r0
            goto L104
        Lff:
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            r10.d = r0
        L104:
            r9.b(r8, r10)
            int r9 = r10.e
            r8.P(r9)
            int r9 = r10.f
            r8.M(r9)
            boolean r9 = r10.h
            r8.E = r9
            int r9 = r10.g
            r8.J(r9)
            r10.j = r3
            return
        L11d:
            r10.e = r3
            r10.f = r3
            return
    }

    @Override // defpackage.l21
    public final void D() {
            r1 = this;
            jv3 r0 = r1.z0
            r0.t()
            r0 = 0
            r1.A0 = r0
            r1.B0 = r0
            java.util.ArrayList r0 = r1.t0
            r0.clear()
            super.D()
            return
    }

    @Override // defpackage.l21
    public final void G(defpackage.bt r4) {
            r3 = this;
            super.G(r4)
            java.util.ArrayList r0 = r3.t0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList r2 = r3.t0
            java.lang.Object r2 = r2.get(r1)
            l21 r2 = (defpackage.l21) r2
            r2.G(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // defpackage.l21
    public final void Q(boolean r4, boolean r5) {
            r3 = this;
            super.Q(r4, r5)
            java.util.ArrayList r0 = r3.t0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList r2 = r3.t0
            java.lang.Object r2 = r2.get(r1)
            l21 r2 = (defpackage.l21) r2
            r2.Q(r4, r5)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    public final void S(defpackage.l21 r6, int r7) {
            r5 = this;
            r0 = 1
            if (r7 != 0) goto L28
            int r7 = r5.C0
            int r7 = r7 + r0
            jl0[] r1 = r5.F0
            int r2 = r1.length
            if (r7 < r2) goto L16
            int r7 = r1.length
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r7)
            jl0[] r7 = (defpackage.jl0[]) r7
            r5.F0 = r7
        L16:
            jl0[] r7 = r5.F0
            int r1 = r5.C0
            jl0 r2 = new jl0
            r3 = 0
            boolean r4 = r5.y0
            r2.<init>(r6, r3, r4)
            r7[r1] = r2
            int r1 = r1 + r0
            r5.C0 = r1
            return
        L28:
            if (r7 != r0) goto L4d
            int r7 = r5.D0
            int r7 = r7 + r0
            jl0[] r1 = r5.E0
            int r2 = r1.length
            if (r7 < r2) goto L3d
            int r7 = r1.length
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r7)
            jl0[] r7 = (defpackage.jl0[]) r7
            r5.E0 = r7
        L3d:
            jl0[] r7 = r5.E0
            int r1 = r5.D0
            jl0 r2 = new jl0
            boolean r3 = r5.y0
            r2.<init>(r6, r0, r3)
            r7[r1] = r2
            int r1 = r1 + r0
            r5.D0 = r1
        L4d:
            return
    }

    public final void T(defpackage.jv3 r13) {
            r12 = this;
            r0 = 64
            boolean r0 = r12.X(r0)
            r12.b(r13, r0)
            java.util.ArrayList r1 = r12.t0
            int r1 = r1.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L12:
            r5 = 1
            if (r3 >= r1) goto L2b
            java.util.ArrayList r6 = r12.t0
            java.lang.Object r6 = r6.get(r3)
            l21 r6 = (defpackage.l21) r6
            boolean[] r7 = r6.S
            r7[r2] = r2
            r7[r5] = r2
            boolean r6 = r6 instanceof defpackage.a20
            if (r6 == 0) goto L28
            r4 = r5
        L28:
            int r3 = r3 + 1
            goto L12
        L2b:
            if (r4 == 0) goto L6e
            r3 = r2
        L2e:
            if (r3 >= r1) goto L6e
            java.util.ArrayList r4 = r12.t0
            java.lang.Object r4 = r4.get(r3)
            l21 r4 = (defpackage.l21) r4
            boolean r6 = r4 instanceof defpackage.a20
            if (r6 == 0) goto L6b
            a20 r4 = (defpackage.a20) r4
            r6 = r2
        L3f:
            int r7 = r4.u0
            if (r6 >= r7) goto L6b
            l21[] r7 = r4.t0
            r7 = r7[r6]
            boolean r8 = r4.w0
            if (r8 != 0) goto L52
            boolean r8 = r7.c()
            if (r8 != 0) goto L52
            goto L68
        L52:
            int r8 = r4.v0
            if (r8 == 0) goto L64
            if (r8 != r5) goto L59
            goto L64
        L59:
            r9 = 2
            if (r8 == r9) goto L5f
            r9 = 3
            if (r8 != r9) goto L68
        L5f:
            boolean[] r7 = r7.S
            r7[r5] = r5
            goto L68
        L64:
            boolean[] r7 = r7.S
            r7[r2] = r5
        L68:
            int r6 = r6 + 1
            goto L3f
        L6b:
            int r3 = r3 + 1
            goto L2e
        L6e:
            java.util.HashSet r3 = r12.N0
            r3.clear()
            r4 = r2
        L74:
            if (r4 >= r1) goto L95
            java.util.ArrayList r6 = r12.t0
            java.lang.Object r6 = r6.get(r4)
            l21 r6 = (defpackage.l21) r6
            r6.getClass()
            boolean r7 = r6 instanceof defpackage.rq7
            if (r7 != 0) goto L89
            boolean r8 = r6 instanceof defpackage.av2
            if (r8 == 0) goto L92
        L89:
            if (r7 == 0) goto L8f
            r3.add(r6)
            goto L92
        L8f:
            r6.b(r13, r0)
        L92:
            int r4 = r4 + 1
            goto L74
        L95:
            int r4 = r3.size()
            if (r4 <= 0) goto Le8
            int r4 = r3.size()
            java.util.Iterator r6 = r3.iterator()
        La3:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lca
            java.lang.Object r7 = r6.next()
            l21 r7 = (defpackage.l21) r7
            rq7 r7 = (defpackage.rq7) r7
            r8 = r2
        Lb2:
            int r9 = r7.u0
            if (r8 >= r9) goto La3
            l21[] r9 = r7.t0
            r9 = r9[r8]
            boolean r9 = r3.contains(r9)
            if (r9 == 0) goto Lc7
            r7.b(r13, r0)
            r3.remove(r7)
            goto Lca
        Lc7:
            int r8 = r8 + 1
            goto Lb2
        Lca:
            int r6 = r3.size()
            if (r4 != r6) goto L95
            java.util.Iterator r4 = r3.iterator()
        Ld4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Le4
            java.lang.Object r6 = r4.next()
            l21 r6 = (defpackage.l21) r6
            r6.b(r13, r0)
            goto Ld4
        Le4:
            r3.clear()
            goto L95
        Le8:
            boolean r3 = defpackage.jv3.q
            if (r3 == 0) goto L137
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r3 = r2
        Lf2:
            if (r3 >= r1) goto L10e
            java.util.ArrayList r4 = r12.t0
            java.lang.Object r4 = r4.get(r3)
            l21 r4 = (defpackage.l21) r4
            r4.getClass()
            boolean r6 = r4 instanceof defpackage.rq7
            if (r6 != 0) goto L10b
            boolean r6 = r4 instanceof defpackage.av2
            if (r6 == 0) goto L108
            goto L10b
        L108:
            r9.add(r4)
        L10b:
            int r3 = r3 + 1
            goto Lf2
        L10e:
            k21[] r1 = r12.T
            r1 = r1[r2]
            k21 r3 = defpackage.k21.WRAP_CONTENT
            if (r1 != r3) goto L118
            r10 = r2
            goto L119
        L118:
            r10 = r5
        L119:
            r11 = 0
            r7 = r12
            r6 = r12
            r8 = r13
            r6.a(r7, r8, r9, r10, r11)
            java.util.Iterator r12 = r9.iterator()
        L124:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L17e
            java.lang.Object r13 = r12.next()
            l21 r13 = (defpackage.l21) r13
            defpackage.n16.q(r6, r8, r13)
            r13.b(r8, r0)
            goto L124
        L137:
            r6 = r12
            r8 = r13
            r12 = r2
        L13a:
            if (r12 >= r1) goto L17e
            java.util.ArrayList r13 = r6.t0
            java.lang.Object r13 = r13.get(r12)
            l21 r13 = (defpackage.l21) r13
            boolean r3 = r13 instanceof defpackage.m21
            if (r3 == 0) goto L16c
            k21[] r3 = r13.T
            r4 = r3[r2]
            r3 = r3[r5]
            k21 r7 = defpackage.k21.WRAP_CONTENT
            if (r4 != r7) goto L157
            k21 r9 = defpackage.k21.FIXED
            r13.N(r9)
        L157:
            if (r3 != r7) goto L15e
            k21 r9 = defpackage.k21.FIXED
            r13.O(r9)
        L15e:
            r13.b(r8, r0)
            if (r4 != r7) goto L166
            r13.N(r4)
        L166:
            if (r3 != r7) goto L17b
            r13.O(r3)
            goto L17b
        L16c:
            defpackage.n16.q(r6, r8, r13)
            boolean r3 = r13 instanceof defpackage.rq7
            if (r3 != 0) goto L17b
            boolean r3 = r13 instanceof defpackage.av2
            if (r3 == 0) goto L178
            goto L17b
        L178:
            r13.b(r8, r0)
        L17b:
            int r12 = r12 + 1
            goto L13a
        L17e:
            int r12 = r6.C0
            r13 = 0
            if (r12 <= 0) goto L186
            defpackage.nc1.C(r6, r8, r13, r2)
        L186:
            int r12 = r6.D0
            if (r12 <= 0) goto L18d
            defpackage.nc1.C(r6, r8, r13, r5)
        L18d:
            return
    }

    public final boolean U(int r13, boolean r14) {
            r12 = this;
            ai1 r12 = r12.v0
            java.lang.Object r0 = r12.f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r12.d
            m21 r1 = (defpackage.m21) r1
            r2 = 0
            k21 r3 = r1.k(r2)
            r4 = 1
            k21 r5 = r1.k(r4)
            int r6 = r1.s()
            int r7 = r1.t()
            if (r14 == 0) goto L7b
            k21 r8 = defpackage.k21.WRAP_CONTENT
            if (r3 == r8) goto L24
            if (r5 != r8) goto L7b
        L24:
            int r8 = r0.size()
            r9 = r2
        L29:
            if (r9 >= r8) goto L3e
            java.lang.Object r10 = r0.get(r9)
            int r9 = r9 + 1
            ct7 r10 = (defpackage.ct7) r10
            int r11 = r10.f
            if (r11 != r13) goto L29
            boolean r10 = r10.k()
            if (r10 != 0) goto L29
            r14 = r2
        L3e:
            if (r13 != 0) goto L5e
            if (r14 == 0) goto L7b
            k21 r14 = defpackage.k21.WRAP_CONTENT
            if (r3 != r14) goto L7b
            k21 r14 = defpackage.k21.FIXED
            r1.N(r14)
            int r14 = r12.e(r1, r2)
            r1.P(r14)
            ly2 r14 = r1.d
            rj1 r14 = r14.e
            int r8 = r1.r()
            r14.d(r8)
            goto L7b
        L5e:
            if (r14 == 0) goto L7b
            k21 r14 = defpackage.k21.WRAP_CONTENT
            if (r5 != r14) goto L7b
            k21 r14 = defpackage.k21.FIXED
            r1.O(r14)
            int r14 = r12.e(r1, r4)
            r1.M(r14)
            lm7 r14 = r1.e
            rj1 r14 = r14.e
            int r8 = r1.l()
            r14.d(r8)
        L7b:
            k21[] r14 = r1.T
            if (r13 != 0) goto L9f
            r14 = r14[r2]
            k21 r7 = defpackage.k21.FIXED
            if (r14 == r7) goto L89
            k21 r7 = defpackage.k21.MATCH_PARENT
            if (r14 != r7) goto Laa
        L89:
            int r14 = r1.r()
            int r14 = r14 + r6
            ly2 r7 = r1.d
            ci1 r7 = r7.i
            r7.d(r14)
            ly2 r7 = r1.d
            rj1 r7 = r7.e
            int r14 = r14 - r6
            r7.d(r14)
        L9d:
            r14 = r4
            goto Lc1
        L9f:
            r14 = r14[r4]
            k21 r6 = defpackage.k21.FIXED
            if (r14 == r6) goto Lac
            k21 r6 = defpackage.k21.MATCH_PARENT
            if (r14 != r6) goto Laa
            goto Lac
        Laa:
            r14 = r2
            goto Lc1
        Lac:
            int r14 = r1.l()
            int r14 = r14 + r7
            lm7 r6 = r1.e
            ci1 r6 = r6.i
            r6.d(r14)
            lm7 r6 = r1.e
            rj1 r6 = r6.e
            int r14 = r14 - r7
            r6.d(r14)
            goto L9d
        Lc1:
            r12.i()
            int r12 = r0.size()
            r6 = r2
        Lc9:
            if (r6 >= r12) goto Le5
            java.lang.Object r7 = r0.get(r6)
            int r6 = r6 + 1
            ct7 r7 = (defpackage.ct7) r7
            int r8 = r7.f
            if (r8 == r13) goto Ld8
            goto Lc9
        Ld8:
            l21 r8 = r7.b
            if (r8 != r1) goto Le1
            boolean r8 = r7.g
            if (r8 != 0) goto Le1
            goto Lc9
        Le1:
            r7.e()
            goto Lc9
        Le5:
            int r12 = r0.size()
            r6 = r2
        Lea:
            if (r6 >= r12) goto L119
            java.lang.Object r7 = r0.get(r6)
            int r6 = r6 + 1
            ct7 r7 = (defpackage.ct7) r7
            int r8 = r7.f
            if (r8 == r13) goto Lf9
            goto Lea
        Lf9:
            if (r14 != 0) goto L100
            l21 r8 = r7.b
            if (r8 != r1) goto L100
            goto Lea
        L100:
            ci1 r8 = r7.h
            boolean r8 = r8.j
            if (r8 != 0) goto L107
            goto L11a
        L107:
            ci1 r8 = r7.i
            boolean r8 = r8.j
            if (r8 != 0) goto L10e
            goto L11a
        L10e:
            boolean r8 = r7 instanceof defpackage.kl0
            if (r8 != 0) goto Lea
            rj1 r7 = r7.e
            boolean r7 = r7.j
            if (r7 != 0) goto Lea
            goto L11a
        L119:
            r2 = r4
        L11a:
            r1.N(r3)
            r1.O(r5)
            return r2
    }

    public final void V() {
            r30 = this;
            r1 = r30
            boolean[] r2 = defpackage.n16.n
            r3 = 0
            r1.Z = r3
            r1.a0 = r3
            r1.H0 = r3
            r1.I0 = r3
            java.util.ArrayList r0 = r1.t0
            int r4 = r0.size()
            int r0 = r1.r()
            int r0 = java.lang.Math.max(r3, r0)
            int r5 = r1.l()
            int r5 = java.lang.Math.max(r3, r5)
            k21[] r6 = r1.T
            r7 = 1
            r8 = r6[r7]
            r6 = r6[r3]
            int r9 = r1.w0
            h11 r10 = r1.J
            h11 r11 = r1.I
            if (r9 != 0) goto L262
            int r9 = r1.G0
            boolean r9 = defpackage.n16.v(r9, r7)
            if (r9 == 0) goto L262
            p11 r9 = r1.x0
            k21[] r13 = r1.T
            r14 = r13[r3]
            r13 = r13[r7]
            r1.F()
            java.util.ArrayList r15 = r1.t0
            int r12 = r15.size()
            r7 = r3
        L4c:
            if (r7 >= r12) goto L5a
            java.lang.Object r17 = r15.get(r7)
            l21 r17 = (defpackage.l21) r17
            r17.F()
            int r7 = r7 + 1
            goto L4c
        L5a:
            boolean r7 = r1.y0
            k21 r3 = defpackage.k21.FIXED
            if (r14 != r3) goto L69
            int r3 = r1.r()
            r14 = 0
            r1.K(r14, r3)
            goto L6f
        L69:
            r14 = 0
            r11.l(r14)
            r1.Z = r14
        L6f:
            r3 = 0
            r14 = 0
            r18 = 0
        L73:
            r19 = 1056964608(0x3f000000, float:0.5)
            if (r14 >= r12) goto Lde
            java.lang.Object r20 = r15.get(r14)
            r21 = r2
            r2 = r20
            l21 r2 = (defpackage.l21) r2
            r20 = r3
            boolean r3 = r2 instanceof defpackage.av2
            if (r3 == 0) goto Lc7
            av2 r2 = (defpackage.av2) r2
            int r3 = r2.x0
            r22 = r14
            r14 = 1
            if (r3 != r14) goto Lc4
            int r3 = r2.u0
            r14 = -1
            if (r3 == r14) goto L99
            r2.S(r3)
            goto Lc2
        L99:
            int r3 = r2.v0
            if (r3 == r14) goto Lae
            boolean r3 = r1.B()
            if (r3 == 0) goto Lae
            int r3 = r1.r()
            int r14 = r2.v0
            int r3 = r3 - r14
            r2.S(r3)
            goto Lc2
        Lae:
            boolean r3 = r1.B()
            if (r3 == 0) goto Lc2
            float r3 = r2.t0
            int r14 = r1.r()
            float r14 = (float) r14
            float r3 = r3 * r14
            float r3 = r3 + r19
            int r3 = (int) r3
            r2.S(r3)
        Lc2:
            r20 = 1
        Lc4:
            r3 = r20
            goto Ld9
        Lc7:
            r22 = r14
            boolean r3 = r2 instanceof defpackage.a20
            if (r3 == 0) goto Lc4
            a20 r2 = (defpackage.a20) r2
            int r2 = r2.W()
            if (r2 != 0) goto Lc4
            r3 = r20
            r18 = 1
        Ld9:
            int r14 = r22 + 1
            r2 = r21
            goto L73
        Lde:
            r21 = r2
            r20 = r3
            if (r20 == 0) goto L107
            r2 = 0
        Le5:
            if (r2 >= r12) goto L107
            java.lang.Object r3 = r15.get(r2)
            l21 r3 = (defpackage.l21) r3
            boolean r14 = r3 instanceof defpackage.av2
            if (r14 == 0) goto L101
            av2 r3 = (defpackage.av2) r3
            int r14 = r3.x0
            r20 = r2
            r2 = 1
            if (r14 != r2) goto Lff
            r14 = 0
            defpackage.l.y(r14, r9, r3, r7)
            goto L104
        Lff:
            r14 = 0
            goto L104
        L101:
            r20 = r2
            goto Lff
        L104:
            int r2 = r20 + 1
            goto Le5
        L107:
            r14 = 0
            defpackage.l.y(r14, r9, r1, r7)
            if (r18 == 0) goto L12f
            r2 = 0
        L10e:
            if (r2 >= r12) goto L12f
            java.lang.Object r3 = r15.get(r2)
            l21 r3 = (defpackage.l21) r3
            boolean r14 = r3 instanceof defpackage.a20
            if (r14 == 0) goto L12c
            a20 r3 = (defpackage.a20) r3
            int r14 = r3.W()
            if (r14 != 0) goto L12c
            boolean r14 = r3.V()
            if (r14 == 0) goto L12c
            r14 = 1
            defpackage.l.y(r14, r9, r3, r7)
        L12c:
            int r2 = r2 + 1
            goto L10e
        L12f:
            k21 r2 = defpackage.k21.FIXED
            if (r13 != r2) goto L13c
            int r2 = r1.l()
            r14 = 0
            r1.L(r14, r2)
            goto L142
        L13c:
            r14 = 0
            r10.l(r14)
            r1.a0 = r14
        L142:
            r2 = 0
            r3 = 0
            r13 = 0
        L145:
            if (r2 >= r12) goto L19e
            java.lang.Object r14 = r15.get(r2)
            l21 r14 = (defpackage.l21) r14
            r18 = r2
            boolean r2 = r14 instanceof defpackage.av2
            if (r2 == 0) goto L18d
            av2 r14 = (defpackage.av2) r14
            int r2 = r14.x0
            if (r2 != 0) goto L19b
            int r2 = r14.u0
            r3 = -1
            if (r2 == r3) goto L162
            r14.S(r2)
            goto L18b
        L162:
            int r2 = r14.v0
            if (r2 == r3) goto L177
            boolean r2 = r1.C()
            if (r2 == 0) goto L177
            int r2 = r1.l()
            int r3 = r14.v0
            int r2 = r2 - r3
            r14.S(r2)
            goto L18b
        L177:
            boolean r2 = r1.C()
            if (r2 == 0) goto L18b
            float r2 = r14.t0
            int r3 = r1.l()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r19
            int r2 = (int) r2
            r14.S(r2)
        L18b:
            r3 = 1
            goto L19b
        L18d:
            boolean r2 = r14 instanceof defpackage.a20
            if (r2 == 0) goto L19b
            a20 r14 = (defpackage.a20) r14
            int r2 = r14.W()
            r14 = 1
            if (r2 != r14) goto L19b
            r13 = 1
        L19b:
            int r2 = r18 + 1
            goto L145
        L19e:
            if (r3 == 0) goto L1ba
            r2 = 0
        L1a1:
            if (r2 >= r12) goto L1ba
            java.lang.Object r3 = r15.get(r2)
            l21 r3 = (defpackage.l21) r3
            boolean r14 = r3 instanceof defpackage.av2
            if (r14 == 0) goto L1b7
            av2 r3 = (defpackage.av2) r3
            int r14 = r3.x0
            if (r14 != 0) goto L1b7
            r14 = 1
            defpackage.l.U(r14, r9, r3)
        L1b7:
            int r2 = r2 + 1
            goto L1a1
        L1ba:
            r14 = 0
            defpackage.l.U(r14, r9, r1)
            if (r13 == 0) goto L1e2
            r2 = 0
        L1c1:
            if (r2 >= r12) goto L1e2
            java.lang.Object r3 = r15.get(r2)
            l21 r3 = (defpackage.l21) r3
            boolean r13 = r3 instanceof defpackage.a20
            if (r13 == 0) goto L1df
            a20 r3 = (defpackage.a20) r3
            int r13 = r3.W()
            r14 = 1
            if (r13 != r14) goto L1df
            boolean r13 = r3.V()
            if (r13 == 0) goto L1df
            defpackage.l.U(r14, r9, r3)
        L1df:
            int r2 = r2 + 1
            goto L1c1
        L1e2:
            r2 = 0
        L1e3:
            if (r2 >= r12) goto L21b
            java.lang.Object r3 = r15.get(r2)
            l21 r3 = (defpackage.l21) r3
            boolean r13 = r3.A()
            if (r13 == 0) goto L218
            boolean r13 = defpackage.l.m(r3)
            if (r13 == 0) goto L218
            e30 r13 = defpackage.l.f
            W(r3, r9, r13)
            boolean r13 = r3 instanceof defpackage.av2
            if (r13 == 0) goto L211
            r13 = r3
            av2 r13 = (defpackage.av2) r13
            int r13 = r13.x0
            if (r13 != 0) goto L20c
            r14 = 0
            defpackage.l.U(r14, r9, r3)
            goto L218
        L20c:
            r14 = 0
            defpackage.l.y(r14, r9, r3, r7)
            goto L218
        L211:
            r14 = 0
            defpackage.l.y(r14, r9, r3, r7)
            defpackage.l.U(r14, r9, r3)
        L218:
            int r2 = r2 + 1
            goto L1e3
        L21b:
            r2 = 0
        L21c:
            if (r2 >= r4) goto L264
            java.util.ArrayList r3 = r1.t0
            java.lang.Object r3 = r3.get(r2)
            l21 r3 = (defpackage.l21) r3
            boolean r7 = r3.A()
            if (r7 == 0) goto L25f
            boolean r7 = r3 instanceof defpackage.av2
            if (r7 != 0) goto L25f
            boolean r7 = r3 instanceof defpackage.a20
            if (r7 != 0) goto L25f
            boolean r7 = r3 instanceof defpackage.rq7
            if (r7 != 0) goto L25f
            boolean r7 = r3.F
            if (r7 != 0) goto L25f
            r14 = 0
            k21 r7 = r3.k(r14)
            r14 = 1
            k21 r9 = r3.k(r14)
            k21 r12 = defpackage.k21.MATCH_CONSTRAINT
            if (r7 != r12) goto L255
            int r7 = r3.r
            if (r7 == r14) goto L255
            if (r9 != r12) goto L255
            int r7 = r3.s
            if (r7 == r14) goto L255
            goto L25f
        L255:
            e30 r7 = new e30
            r7.<init>()
            p11 r9 = r1.x0
            W(r3, r9, r7)
        L25f:
            int r2 = r2 + 1
            goto L21c
        L262:
            r21 = r2
        L264:
            r2 = 2
            jv3 r7 = r1.z0
            if (r4 <= r2) goto L270
            k21 r9 = defpackage.k21.WRAP_CONTENT
            if (r6 == r9) goto L27c
            if (r8 != r9) goto L270
            goto L27c
        L270:
            r22 = r4
            r2 = r6
            r20 = r10
            r23 = r11
            r4 = r0
            r6 = r5
            r5 = r8
            goto L672
        L27c:
            int r9 = r1.G0
            r12 = 1024(0x400, float:1.435E-42)
            boolean r9 = defpackage.n16.v(r9, r12)
            if (r9 == 0) goto L270
            p11 r9 = r1.x0
            java.util.ArrayList r12 = r1.t0
            int r13 = r12.size()
            r14 = 0
        L28f:
            if (r14 >= r13) goto L2cc
            java.lang.Object r15 = r12.get(r14)
            l21 r15 = (defpackage.l21) r15
            k21[] r2 = r1.T
            r17 = 0
            r3 = r2[r17]
            r16 = 1
            r2 = r2[r16]
            r20 = r14
            k21[] r14 = r15.T
            r22 = r14
            r14 = r22[r17]
            r23 = r11
            r11 = r22[r16]
            boolean r2 = defpackage.kj2.e0(r3, r2, r14, r11)
            if (r2 != 0) goto L2c1
        L2b3:
            r26 = r0
            r22 = r4
            r24 = r5
            r29 = r6
            r27 = r8
            r20 = r10
            goto L629
        L2c1:
            boolean r2 = r15 instanceof defpackage.me2
            if (r2 == 0) goto L2c6
            goto L2b3
        L2c6:
            int r14 = r20 + 1
            r11 = r23
            r2 = 2
            goto L28f
        L2cc:
            r23 = r11
            r22 = r4
            r20 = r10
            r2 = 0
            r3 = 0
            r4 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
        L2d9:
            if (r2 >= r13) goto L3c1
            java.lang.Object r24 = r12.get(r2)
            r25 = r2
            r2 = r24
            l21 r2 = (defpackage.l21) r2
            r24 = r5
            k21[] r5 = r1.T
            r26 = r5
            r17 = 0
            r5 = r26[r17]
            r27 = r8
            r16 = 1
            r8 = r26[r16]
            r26 = r0
            k21[] r0 = r2.T
            r28 = r0
            r0 = r28[r17]
            r29 = r6
            r6 = r28[r16]
            boolean r0 = defpackage.kj2.e0(r5, r8, r0, r6)
            if (r0 != 0) goto L30c
            e30 r0 = r1.O0
            W(r2, r9, r0)
        L30c:
            boolean r0 = r2 instanceof defpackage.av2
            if (r0 == 0) goto L331
            r5 = r2
            av2 r5 = (defpackage.av2) r5
            int r6 = r5.x0
            if (r6 != 0) goto L322
            if (r14 != 0) goto L31f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r14 = r6
        L31f:
            r14.add(r5)
        L322:
            int r6 = r5.x0
            r8 = 1
            if (r6 != r8) goto L331
            if (r3 != 0) goto L32e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L32e:
            r3.add(r5)
        L331:
            boolean r5 = r2 instanceof defpackage.gx2
            if (r5 == 0) goto L377
            boolean r5 = r2 instanceof defpackage.a20
            if (r5 == 0) goto L360
            r5 = r2
            a20 r5 = (defpackage.a20) r5
            int r6 = r5.W()
            if (r6 != 0) goto L34d
            if (r11 != 0) goto L34a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r11 = r6
        L34a:
            r11.add(r5)
        L34d:
            int r6 = r5.W()
            r8 = 1
            if (r6 != r8) goto L377
            if (r15 != 0) goto L35c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r15 = r6
        L35c:
            r15.add(r5)
            goto L377
        L360:
            r5 = r2
            gx2 r5 = (defpackage.gx2) r5
            if (r11 != 0) goto L36a
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L36a:
            r11.add(r5)
            if (r15 != 0) goto L374
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L374:
            r15.add(r5)
        L377:
            h11 r5 = r2.I
            h11 r5 = r5.f
            if (r5 != 0) goto L393
            h11 r5 = r2.K
            h11 r5 = r5.f
            if (r5 != 0) goto L393
            if (r0 != 0) goto L393
            boolean r5 = r2 instanceof defpackage.a20
            if (r5 != 0) goto L393
            if (r10 != 0) goto L390
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L390:
            r10.add(r2)
        L393:
            h11 r5 = r2.J
            h11 r5 = r5.f
            if (r5 != 0) goto L3b5
            h11 r5 = r2.L
            h11 r5 = r5.f
            if (r5 != 0) goto L3b5
            h11 r5 = r2.M
            h11 r5 = r5.f
            if (r5 != 0) goto L3b5
            if (r0 != 0) goto L3b5
            boolean r0 = r2 instanceof defpackage.a20
            if (r0 != 0) goto L3b5
            if (r4 != 0) goto L3b2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L3b2:
            r4.add(r2)
        L3b5:
            int r2 = r25 + 1
            r5 = r24
            r0 = r26
            r8 = r27
            r6 = r29
            goto L2d9
        L3c1:
            r26 = r0
            r24 = r5
            r29 = r6
            r27 = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L3e5
            int r2 = r3.size()
            r5 = 0
        L3d5:
            if (r5 >= r2) goto L3e5
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            av2 r6 = (defpackage.av2) r6
            r8 = 0
            r9 = 0
            defpackage.kj2.x(r6, r9, r0, r8)
            goto L3d5
        L3e5:
            if (r11 == 0) goto L403
            int r2 = r11.size()
            r3 = 0
        L3ec:
            if (r3 >= r2) goto L403
            java.lang.Object r5 = r11.get(r3)
            int r3 = r3 + 1
            gx2 r5 = (defpackage.gx2) r5
            r8 = 0
            r9 = 0
            zs7 r6 = defpackage.kj2.x(r5, r9, r0, r8)
            r5.T(r9, r6, r0)
            r6.a(r0)
            goto L3ec
        L403:
            g11 r2 = defpackage.g11.LEFT
            h11 r2 = r1.j(r2)
            java.util.HashSet r2 = r2.a
            if (r2 == 0) goto L425
            java.util.Iterator r2 = r2.iterator()
        L411:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L425
            java.lang.Object r3 = r2.next()
            h11 r3 = (defpackage.h11) r3
            l21 r3 = r3.d
            r8 = 0
            r9 = 0
            defpackage.kj2.x(r3, r9, r0, r8)
            goto L411
        L425:
            g11 r2 = defpackage.g11.RIGHT
            h11 r2 = r1.j(r2)
            java.util.HashSet r2 = r2.a
            if (r2 == 0) goto L447
            java.util.Iterator r2 = r2.iterator()
        L433:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L447
            java.lang.Object r3 = r2.next()
            h11 r3 = (defpackage.h11) r3
            l21 r3 = r3.d
            r8 = 0
            r9 = 0
            defpackage.kj2.x(r3, r9, r0, r8)
            goto L433
        L447:
            g11 r2 = defpackage.g11.CENTER
            h11 r2 = r1.j(r2)
            java.util.HashSet r2 = r2.a
            if (r2 == 0) goto L469
            java.util.Iterator r2 = r2.iterator()
        L455:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L469
            java.lang.Object r3 = r2.next()
            h11 r3 = (defpackage.h11) r3
            l21 r3 = r3.d
            r8 = 0
            r9 = 0
            defpackage.kj2.x(r3, r9, r0, r8)
            goto L455
        L469:
            if (r10 == 0) goto L480
            int r2 = r10.size()
            r3 = 0
        L470:
            if (r3 >= r2) goto L480
            java.lang.Object r5 = r10.get(r3)
            int r3 = r3 + 1
            l21 r5 = (defpackage.l21) r5
            r8 = 0
            r9 = 0
            defpackage.kj2.x(r5, r9, r0, r8)
            goto L470
        L480:
            if (r14 == 0) goto L497
            int r2 = r14.size()
            r3 = 0
        L487:
            if (r3 >= r2) goto L497
            java.lang.Object r5 = r14.get(r3)
            int r3 = r3 + 1
            av2 r5 = (defpackage.av2) r5
            r6 = 1
            r8 = 0
            defpackage.kj2.x(r5, r6, r0, r8)
            goto L487
        L497:
            if (r15 == 0) goto L4b5
            int r2 = r15.size()
            r3 = 0
        L49e:
            if (r3 >= r2) goto L4b5
            java.lang.Object r5 = r15.get(r3)
            int r3 = r3 + 1
            gx2 r5 = (defpackage.gx2) r5
            r8 = 0
            r14 = 1
            zs7 r6 = defpackage.kj2.x(r5, r14, r0, r8)
            r5.T(r14, r6, r0)
            r6.a(r0)
            goto L49e
        L4b5:
            g11 r2 = defpackage.g11.TOP
            h11 r2 = r1.j(r2)
            java.util.HashSet r2 = r2.a
            if (r2 == 0) goto L4d7
            java.util.Iterator r2 = r2.iterator()
        L4c3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4d7
            java.lang.Object r3 = r2.next()
            h11 r3 = (defpackage.h11) r3
            l21 r3 = r3.d
            r8 = 0
            r14 = 1
            defpackage.kj2.x(r3, r14, r0, r8)
            goto L4c3
        L4d7:
            g11 r2 = defpackage.g11.BASELINE
            h11 r2 = r1.j(r2)
            java.util.HashSet r2 = r2.a
            if (r2 == 0) goto L4f9
            java.util.Iterator r2 = r2.iterator()
        L4e5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4f9
            java.lang.Object r3 = r2.next()
            h11 r3 = (defpackage.h11) r3
            l21 r3 = r3.d
            r8 = 0
            r14 = 1
            defpackage.kj2.x(r3, r14, r0, r8)
            goto L4e5
        L4f9:
            g11 r2 = defpackage.g11.BOTTOM
            h11 r2 = r1.j(r2)
            java.util.HashSet r2 = r2.a
            if (r2 == 0) goto L51b
            java.util.Iterator r2 = r2.iterator()
        L507:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L51b
            java.lang.Object r3 = r2.next()
            h11 r3 = (defpackage.h11) r3
            l21 r3 = r3.d
            r8 = 0
            r14 = 1
            defpackage.kj2.x(r3, r14, r0, r8)
            goto L507
        L51b:
            g11 r2 = defpackage.g11.CENTER
            h11 r2 = r1.j(r2)
            java.util.HashSet r2 = r2.a
            if (r2 == 0) goto L53d
            java.util.Iterator r2 = r2.iterator()
        L529:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L53d
            java.lang.Object r3 = r2.next()
            h11 r3 = (defpackage.h11) r3
            l21 r3 = r3.d
            r8 = 0
            r14 = 1
            defpackage.kj2.x(r3, r14, r0, r8)
            goto L529
        L53d:
            if (r4 == 0) goto L554
            int r2 = r4.size()
            r3 = 0
        L544:
            if (r3 >= r2) goto L554
            java.lang.Object r5 = r4.get(r3)
            int r3 = r3 + 1
            l21 r5 = (defpackage.l21) r5
            r8 = 0
            r14 = 1
            defpackage.kj2.x(r5, r14, r0, r8)
            goto L544
        L554:
            r2 = 0
        L555:
            if (r2 >= r13) goto L5ae
            java.lang.Object r3 = r12.get(r2)
            l21 r3 = (defpackage.l21) r3
            k21[] r4 = r3.T
            r17 = 0
            r5 = r4[r17]
            k21 r6 = defpackage.k21.MATCH_CONSTRAINT
            if (r5 != r6) goto L5ab
            r16 = 1
            r4 = r4[r16]
            if (r4 != r6) goto L5ab
            int r4 = r3.r0
            int r5 = r0.size()
            r6 = 0
        L574:
            if (r6 >= r5) goto L584
            java.lang.Object r8 = r0.get(r6)
            zs7 r8 = (defpackage.zs7) r8
            int r9 = r8.b
            if (r4 != r9) goto L581
            goto L585
        L581:
            int r6 = r6 + 1
            goto L574
        L584:
            r8 = 0
        L585:
            int r3 = r3.s0
            int r4 = r0.size()
            r5 = 0
        L58c:
            if (r5 >= r4) goto L59c
            java.lang.Object r6 = r0.get(r5)
            zs7 r6 = (defpackage.zs7) r6
            int r9 = r6.b
            if (r3 != r9) goto L599
            goto L59d
        L599:
            int r5 = r5 + 1
            goto L58c
        L59c:
            r6 = 0
        L59d:
            if (r8 == 0) goto L5ab
            if (r6 == 0) goto L5ab
            r9 = 0
            r8.c(r9, r6)
            r3 = 2
            r6.c = r3
            r0.remove(r8)
        L5ab:
            int r2 = r2 + 1
            goto L555
        L5ae:
            int r2 = r0.size()
            r14 = 1
            if (r2 > r14) goto L5b7
            goto L629
        L5b7:
            k21[] r2 = r1.T
            r17 = 0
            r2 = r2[r17]
            k21 r3 = defpackage.k21.WRAP_CONTENT
            if (r2 != r3) goto L5ed
            int r2 = r0.size()
            r3 = 0
            r4 = 0
            r5 = 0
        L5c8:
            if (r4 >= r2) goto L5e2
            java.lang.Object r6 = r0.get(r4)
            int r4 = r4 + 1
            zs7 r6 = (defpackage.zs7) r6
            int r8 = r6.c
            r14 = 1
            if (r8 != r14) goto L5d8
            goto L5c8
        L5d8:
            r9 = 0
            int r8 = r6.b(r7, r9)
            if (r8 <= r3) goto L5c8
            r5 = r6
            r3 = r8
            goto L5c8
        L5e2:
            if (r5 == 0) goto L5ed
            k21 r2 = defpackage.k21.FIXED
            r1.N(r2)
            r1.P(r3)
            goto L5ee
        L5ed:
            r5 = 0
        L5ee:
            k21[] r2 = r1.T
            r16 = 1
            r2 = r2[r16]
            k21 r3 = defpackage.k21.WRAP_CONTENT
            if (r2 != r3) goto L623
            int r2 = r0.size()
            r3 = 0
            r4 = 0
            r6 = 0
        L5ff:
            if (r4 >= r2) goto L618
            java.lang.Object r8 = r0.get(r4)
            int r4 = r4 + 1
            zs7 r8 = (defpackage.zs7) r8
            int r9 = r8.c
            if (r9 != 0) goto L60e
            goto L5ff
        L60e:
            r14 = 1
            int r9 = r8.b(r7, r14)
            if (r9 <= r3) goto L5ff
            r6 = r8
            r3 = r9
            goto L5ff
        L618:
            if (r6 == 0) goto L623
            k21 r0 = defpackage.k21.FIXED
            r1.O(r0)
            r1.M(r3)
            goto L624
        L623:
            r6 = 0
        L624:
            if (r5 != 0) goto L632
            if (r6 == 0) goto L629
            goto L632
        L629:
            r6 = r24
            r4 = r26
            r5 = r27
            r2 = r29
            goto L672
        L632:
            k21 r0 = defpackage.k21.WRAP_CONTENT
            r2 = r29
            if (r2 != r0) goto L650
            int r3 = r1.r()
            r4 = r26
            if (r4 >= r3) goto L649
            if (r4 <= 0) goto L649
            r1.P(r4)
            r14 = 1
            r1.H0 = r14
            goto L652
        L649:
            int r3 = r1.r()
        L64d:
            r5 = r27
            goto L654
        L650:
            r4 = r26
        L652:
            r3 = r4
            goto L64d
        L654:
            if (r5 != r0) goto L66c
            int r0 = r1.l()
            r6 = r24
            if (r6 >= r0) goto L667
            if (r6 <= 0) goto L667
            r1.M(r6)
            r14 = 1
            r1.I0 = r14
            goto L66e
        L667:
            int r0 = r1.l()
            goto L66f
        L66c:
            r6 = r24
        L66e:
            r0 = r6
        L66f:
            r6 = r0
            r0 = 1
            goto L674
        L672:
            r3 = r4
            r0 = 0
        L674:
            r4 = 64
            boolean r8 = r1.X(r4)
            if (r8 != 0) goto L687
            r8 = 128(0x80, float:1.8E-43)
            boolean r8 = r1.X(r8)
            if (r8 == 0) goto L685
            goto L687
        L685:
            r8 = 0
            goto L688
        L687:
            r8 = 1
        L688:
            r7.getClass()
            r9 = 0
            r7.h = r9
            int r10 = r1.G0
            if (r10 == 0) goto L698
            if (r8 == 0) goto L698
            r14 = 1
            r7.h = r14
            goto L699
        L698:
            r14 = 1
        L699:
            java.util.ArrayList r8 = r1.t0
            k21[] r10 = r1.T
            r11 = r10[r9]
            k21 r12 = defpackage.k21.WRAP_CONTENT
            if (r11 == r12) goto L6aa
            r10 = r10[r14]
            if (r10 != r12) goto L6a8
            goto L6aa
        L6a8:
            r14 = r9
            goto L6ab
        L6aa:
            r14 = 1
        L6ab:
            r1.C0 = r9
            r1.D0 = r9
            r10 = r22
            r9 = 0
        L6b2:
            if (r9 >= r10) goto L6c8
            java.util.ArrayList r11 = r1.t0
            java.lang.Object r11 = r11.get(r9)
            l21 r11 = (defpackage.l21) r11
            boolean r12 = r11 instanceof defpackage.m21
            if (r12 == 0) goto L6c5
            m21 r11 = (defpackage.m21) r11
            r11.V()
        L6c5:
            int r9 = r9 + 1
            goto L6b2
        L6c8:
            boolean r9 = r1.X(r4)
            r11 = r0
            r0 = 0
            r12 = 1
        L6cf:
            if (r12 == 0) goto L932
            r16 = 1
            int r13 = r0 + 1
            r7.t()     // Catch: java.lang.Exception -> L6f1
            r15 = 0
            r1.C0 = r15     // Catch: java.lang.Exception -> L6f1
            r1.D0 = r15     // Catch: java.lang.Exception -> L6f1
            r1.h(r7)     // Catch: java.lang.Exception -> L6f1
            r0 = 0
        L6e1:
            if (r0 >= r10) goto L6f9
            java.util.ArrayList r15 = r1.t0     // Catch: java.lang.Exception -> L6f1
            java.lang.Object r15 = r15.get(r0)     // Catch: java.lang.Exception -> L6f1
            l21 r15 = (defpackage.l21) r15     // Catch: java.lang.Exception -> L6f1
            r15.h(r7)     // Catch: java.lang.Exception -> L6f1
            int r0 = r0 + 1
            goto L6e1
        L6f1:
            r0 = move-exception
            r22 = r11
            r15 = r20
            r4 = 0
            goto L7b4
        L6f9:
            r1.T(r7)     // Catch: java.lang.Exception -> L6f1
            java.lang.ref.WeakReference r0 = r1.J0     // Catch: java.lang.Exception -> L72c
            r12 = 5
            if (r0 == 0) goto L732
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L72c
            if (r0 == 0) goto L732
            java.lang.ref.WeakReference r0 = r1.J0     // Catch: java.lang.Exception -> L72c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L72c
            h11 r0 = (defpackage.h11) r0     // Catch: java.lang.Exception -> L72c
            r15 = r20
            en6 r4 = r7.k(r15)     // Catch: java.lang.Exception -> L728
            en6 r0 = r7.k(r0)     // Catch: java.lang.Exception -> L728
            r22 = r11
            r11 = 0
            r7.f(r0, r4, r11, r12)     // Catch: java.lang.Exception -> L723
            r4 = 0
            r1.J0 = r4     // Catch: java.lang.Exception -> L723
            goto L736
        L723:
            r0 = move-exception
        L724:
            r4 = 0
        L725:
            r12 = 1
            goto L7b4
        L728:
            r0 = move-exception
            r22 = r11
            goto L724
        L72c:
            r0 = move-exception
            r22 = r11
            r15 = r20
            goto L724
        L732:
            r22 = r11
            r15 = r20
        L736:
            java.lang.ref.WeakReference r0 = r1.L0     // Catch: java.lang.Exception -> L723
            if (r0 == 0) goto L759
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L723
            if (r0 == 0) goto L759
            java.lang.ref.WeakReference r0 = r1.L0     // Catch: java.lang.Exception -> L723
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L723
            h11 r0 = (defpackage.h11) r0     // Catch: java.lang.Exception -> L723
            h11 r4 = r1.L     // Catch: java.lang.Exception -> L723
            en6 r4 = r7.k(r4)     // Catch: java.lang.Exception -> L723
            en6 r0 = r7.k(r0)     // Catch: java.lang.Exception -> L723
            r11 = 0
            r7.f(r4, r0, r11, r12)     // Catch: java.lang.Exception -> L723
            r4 = 0
            r1.L0 = r4     // Catch: java.lang.Exception -> L723
        L759:
            java.lang.ref.WeakReference r0 = r1.K0     // Catch: java.lang.Exception -> L723
            if (r0 == 0) goto L783
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L723
            if (r0 == 0) goto L783
            java.lang.ref.WeakReference r0 = r1.K0     // Catch: java.lang.Exception -> L723
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L723
            h11 r0 = (defpackage.h11) r0     // Catch: java.lang.Exception -> L723
            r4 = r23
            en6 r11 = r7.k(r4)     // Catch: java.lang.Exception -> L77f
            en6 r0 = r7.k(r0)     // Catch: java.lang.Exception -> L77f
            r23 = r4
            r4 = 0
            r7.f(r0, r11, r4, r12)     // Catch: java.lang.Exception -> L723
            r4 = 0
            r1.K0 = r4     // Catch: java.lang.Exception -> L723
            goto L783
        L77f:
            r0 = move-exception
            r23 = r4
            goto L724
        L783:
            java.lang.ref.WeakReference r0 = r1.M0     // Catch: java.lang.Exception -> L723
            if (r0 == 0) goto L7ad
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L723
            if (r0 == 0) goto L7ad
            java.lang.ref.WeakReference r0 = r1.M0     // Catch: java.lang.Exception -> L723
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L723
            h11 r0 = (defpackage.h11) r0     // Catch: java.lang.Exception -> L723
            h11 r4 = r1.K     // Catch: java.lang.Exception -> L723
            en6 r4 = r7.k(r4)     // Catch: java.lang.Exception -> L723
            en6 r0 = r7.k(r0)     // Catch: java.lang.Exception -> L7aa
            r11 = 0
            r7.f(r4, r0, r11, r12)     // Catch: java.lang.Exception -> L7aa
            r4 = 0
            r1.M0 = r4     // Catch: java.lang.Exception -> L7a7
            goto L7ae
        L7a7:
            r0 = move-exception
            goto L725
        L7aa:
            r0 = move-exception
            goto L724
        L7ad:
            r4 = 0
        L7ae:
            r7.p()     // Catch: java.lang.Exception -> L7a7
            r24 = 1
            goto L7cc
        L7b4:
            r0.printStackTrace()
            java.io.PrintStream r11 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r24 = r12
            java.lang.String r12 = "EXCEPTION : "
            r4.<init>(r12)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r11.println(r0)
        L7cc:
            if (r24 == 0) goto L80c
            r17 = 0
            r18 = 2
            r21[r18] = r17
            r4 = 64
            boolean r0 = r1.X(r4)
            r1.R(r7, r0)
            java.util.ArrayList r11 = r1.t0
            int r11 = r11.size()
            r4 = 0
            r12 = 0
        L7e5:
            if (r4 >= r11) goto L80a
            r24 = r11
            java.util.ArrayList r11 = r1.t0
            java.lang.Object r11 = r11.get(r4)
            l21 r11 = (defpackage.l21) r11
            r11.R(r7, r0)
            r25 = r0
            int r0 = r11.h
            r26 = r4
            r4 = -1
            if (r0 != r4) goto L801
            int r0 = r11.i
            if (r0 == r4) goto L802
        L801:
            r12 = 1
        L802:
            int r0 = r26 + 1
            r4 = r0
            r11 = r24
            r0 = r25
            goto L7e5
        L80a:
            r4 = -1
            goto L822
        L80c:
            r4 = -1
            r1.R(r7, r9)
            r0 = 0
        L811:
            if (r0 >= r10) goto L821
            java.util.ArrayList r11 = r1.t0
            java.lang.Object r11 = r11.get(r0)
            l21 r11 = (defpackage.l21) r11
            r11.R(r7, r9)
            int r0 = r0 + 1
            goto L811
        L821:
            r12 = 0
        L822:
            r0 = 8
            if (r14 == 0) goto L89d
            if (r13 >= r0) goto L89d
            r18 = 2
            boolean r11 = r21[r18]
            if (r11 == 0) goto L898
            r0 = 0
            r4 = 0
            r11 = 0
        L831:
            if (r11 >= r10) goto L85d
            r25 = r9
            java.util.ArrayList r9 = r1.t0
            java.lang.Object r9 = r9.get(r11)
            l21 r9 = (defpackage.l21) r9
            r26 = r10
            int r10 = r9.Z
            int r27 = r9.r()
            int r10 = r27 + r10
            int r4 = java.lang.Math.max(r4, r10)
            int r10 = r9.a0
            int r9 = r9.l()
            int r9 = r9 + r10
            int r0 = java.lang.Math.max(r0, r9)
            int r11 = r11 + 1
            r9 = r25
            r10 = r26
            goto L831
        L85d:
            r25 = r9
            r26 = r10
            int r9 = r1.c0
            int r4 = java.lang.Math.max(r9, r4)
            int r9 = r1.d0
            int r0 = java.lang.Math.max(r9, r0)
            k21 r9 = defpackage.k21.WRAP_CONTENT
            if (r2 != r9) goto L883
            int r10 = r1.r()
            if (r10 >= r4) goto L883
            r1.P(r4)
            k21[] r4 = r1.T
            r17 = 0
            r4[r17] = r9
            r12 = 1
            r22 = 1
        L883:
            if (r5 != r9) goto L8a3
            int r4 = r1.l()
            if (r4 >= r0) goto L8a3
            r1.M(r0)
            k21[] r0 = r1.T
            r16 = 1
            r0[r16] = r9
            r12 = 1
            r22 = 1
            goto L8a3
        L898:
            r25 = r9
            r26 = r10
            goto L8a3
        L89d:
            r25 = r9
            r26 = r10
            r18 = 2
        L8a3:
            int r0 = r1.c0
            int r4 = r1.r()
            int r0 = java.lang.Math.max(r0, r4)
            int r4 = r1.r()
            if (r0 <= r4) goto L8c1
            r1.P(r0)
            k21[] r0 = r1.T
            k21 r4 = defpackage.k21.FIXED
            r17 = 0
            r0[r17] = r4
            r12 = 1
            r22 = 1
        L8c1:
            int r0 = r1.d0
            int r4 = r1.l()
            int r0 = java.lang.Math.max(r0, r4)
            int r4 = r1.l()
            if (r0 <= r4) goto L8df
            r1.M(r0)
            k21[] r0 = r1.T
            k21 r4 = defpackage.k21.FIXED
            r9 = 1
            r0[r9] = r4
            r12 = r9
            r22 = r12
            goto L8e0
        L8df:
            r9 = 1
        L8e0:
            if (r22 != 0) goto L920
            k21[] r0 = r1.T
            r17 = 0
            r0 = r0[r17]
            k21 r4 = defpackage.k21.WRAP_CONTENT
            if (r0 != r4) goto L902
            if (r3 <= 0) goto L902
            int r0 = r1.r()
            if (r0 <= r3) goto L902
            r1.H0 = r9
            k21[] r0 = r1.T
            k21 r10 = defpackage.k21.FIXED
            r0[r17] = r10
            r1.P(r3)
            r12 = r9
            r22 = r12
        L902:
            k21[] r0 = r1.T
            r0 = r0[r9]
            if (r0 != r4) goto L920
            if (r6 <= 0) goto L920
            int r0 = r1.l()
            if (r0 <= r6) goto L920
            r1.I0 = r9
            k21[] r0 = r1.T
            k21 r4 = defpackage.k21.FIXED
            r0[r9] = r4
            r1.M(r6)
            r0 = 8
            r11 = 1
            r12 = 1
            goto L924
        L920:
            r11 = r22
            r0 = 8
        L924:
            if (r13 <= r0) goto L927
            r12 = 0
        L927:
            r0 = r13
            r20 = r15
            r9 = r25
            r10 = r26
            r4 = 64
            goto L6cf
        L932:
            r22 = r11
            r1.t0 = r8
            if (r22 == 0) goto L942
            k21[] r0 = r1.T
            r17 = 0
            r0[r17] = r2
            r16 = 1
            r0[r16] = r5
        L942:
            bt r0 = r7.m
            r1.G(r0)
            return
    }

    public final boolean X(int r1) {
            r0 = this;
            int r0 = r0.G0
            r0 = r0 & r1
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // defpackage.l21
    public final void o(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ":{\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "  actualWidth:"
            r0.<init>(r1)
            int r1 = r3.V
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = "\n"
            r4.append(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "  actualHeight:"
            r1.<init>(r2)
            int r2 = r3.W
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.append(r1)
            r4.append(r0)
            java.util.ArrayList r3 = r3.t0
            int r0 = r3.size()
            r1 = 0
        L4b:
            if (r1 >= r0) goto L5e
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            l21 r2 = (defpackage.l21) r2
            r2.o(r4)
            java.lang.String r2 = ",\n"
            r4.append(r2)
            goto L4b
        L5e:
            java.lang.String r3 = "}"
            r4.append(r3)
            return
    }
}
