package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ca7  reason: default package */
/* loaded from: classes.dex */
public final class ca7 implements defpackage.pp6 {
    public final defpackage.wc7 A;
    public final defpackage.vs4 B;
    public final defpackage.vs4 L;
    public final defpackage.vs4 R;
    public defpackage.g96 X;
    public defpackage.jz6 Y;
    public final defpackage.vs4 Z;
    public final defpackage.rs4 d0;
    public boolean e0;
    public final defpackage.vs4 f0;
    public defpackage.ap g0;
    public final defpackage.ts4 h0;
    public boolean i0;
    public final defpackage.io6 j0;
    public final /* synthetic */ defpackage.ga7 k0;

    public ca7(defpackage.ga7 r10, java.lang.Object r11, defpackage.ap r12, defpackage.wc7 r13) {
            r9 = this;
            r9.<init>()
            r9.k0 = r10
            r9.A = r13
            vs4 r10 = defpackage.np2.Y(r11)
            r9.B = r10
            r0 = 7
            r1 = 0
            r2 = 0
            io6 r0 = defpackage.ge7.U(r1, r1, r2, r0)
            vs4 r0 = defpackage.np2.Y(r0)
            r9.L = r0
            jz6 r3 = new jz6
            rc2 r4 = r9.b()
            java.lang.Object r7 = r10.getValue()
            r6 = r11
            r8 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            vs4 r10 = defpackage.np2.Y(r3)
            r9.R = r10
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            vs4 r10 = defpackage.np2.Y(r10)
            r9.Z = r10
            rs4 r10 = new rs4
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.<init>(r11)
            r9.d0 = r10
            vs4 r10 = defpackage.np2.Y(r6)
            r9.f0 = r10
            r9.g0 = r8
            jz6 r10 = r9.a()
            long r10 = r10.b()
            ts4 r12 = new ts4
            r12.<init>(r10)
            r9.h0 = r12
            java.util.Map r10 = defpackage.vq7.b
            java.lang.Object r10 = r10.get(r5)
            java.lang.Float r10 = (java.lang.Float) r10
            if (r10 == 0) goto L83
            float r10 = r10.floatValue()
            qn2 r11 = r5.a
            java.lang.Object r11 = r11.g(r6)
            ap r11 = (defpackage.ap) r11
            int r12 = r11.b()
            r13 = 0
        L73:
            if (r13 >= r12) goto L7b
            r11.e(r13, r10)
            int r13 = r13 + 1
            goto L73
        L7b:
            wc7 r10 = r9.A
            qn2 r10 = r10.b
            java.lang.Object r2 = r10.g(r11)
        L83:
            r10 = 3
            io6 r10 = defpackage.ge7.U(r1, r1, r2, r10)
            r9.j0 = r10
            return
    }

    public final defpackage.jz6 a() {
            r0 = this;
            vs4 r0 = r0.R
            java.lang.Object r0 = r0.getValue()
            jz6 r0 = (defpackage.jz6) r0
            return r0
    }

    public final defpackage.rc2 b() {
            r0 = this;
            vs4 r0 = r0.L
            java.lang.Object r0 = r0.getValue()
            rc2 r0 = (defpackage.rc2) r0
            return r0
    }

    public final void e(long r3) {
            r2 = this;
            rs4 r0 = r2.d0
            float r0 = r0.h()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L40
            r0 = 1
            r2.i0 = r0
            jz6 r0 = r2.a()
            java.lang.Object r0 = r0.L
            jz6 r1 = r2.a()
            java.lang.Object r1 = r1.R
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L2b
            jz6 r3 = r2.a()
            java.lang.Object r3 = r3.L
            r2.f(r3)
            return
        L2b:
            jz6 r0 = r2.a()
            java.lang.Object r0 = r0.g(r3)
            r2.f(r0)
            jz6 r0 = r2.a()
            ap r3 = r0.d(r3)
            r2.g0 = r3
        L40:
            return
    }

    public final void f(java.lang.Object r1) {
            r0 = this;
            vs4 r0 = r0.f0
            r0.setValue(r1)
            return
    }

    public final void g(boolean r13, java.lang.Object r14) {
            r12 = this;
            jz6 r0 = r12.Y
            if (r0 == 0) goto L7
            java.lang.Object r0 = r0.L
            goto L8
        L7:
            r0 = 0
        L8:
            vs4 r1 = r12.B
            java.lang.Object r2 = r1.getValue()
            boolean r0 = defpackage.nb3.k(r0, r2)
            ts4 r2 = r12.h0
            vs4 r3 = r12.R
            if (r0 == 0) goto L3b
            jz6 r4 = new jz6
            ap r13 = r12.g0
            ap r9 = r13.c()
            io6 r5 = r12.j0
            wc7 r6 = r12.A
            r8 = r14
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r3.setValue(r4)
            r13 = 1
            r12.e0 = r13
            jz6 r12 = r12.a()
            long r12 = r12.b()
            r2.i(r12)
            return
        L3b:
            r7 = r14
            if (r13 == 0) goto L52
            boolean r13 = r12.i0
            if (r13 != 0) goto L52
            rc2 r13 = r12.b()
            boolean r13 = r13 instanceof defpackage.io6
            if (r13 == 0) goto L4f
            rc2 r13 = r12.b()
            goto L56
        L4f:
            io6 r13 = r12.j0
            goto L56
        L52:
            rc2 r13 = r12.b()
        L56:
            ga7 r14 = r12.k0
            long r4 = r14.e()
            vs4 r0 = r14.h
            r10 = 0
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 > 0) goto L66
            r5 = r13
            goto L70
        L66:
            long r4 = r14.e()
            gp6 r6 = new gp6
            r6.<init>(r13, r4)
            r5 = r6
        L70:
            jz6 r4 = new jz6
            java.lang.Object r8 = r1.getValue()
            ap r9 = r12.g0
            wc7 r6 = r12.A
            r4.<init>(r5, r6, r7, r8, r9)
            r3.setValue(r4)
            jz6 r13 = r12.a()
            long r3 = r13.b()
            r2.i(r3)
            r13 = 0
            r12.e0 = r13
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r0.setValue(r12)
            boolean r12 = r14.g()
            if (r12 == 0) goto Lbd
            mm6 r12 = r14.i
            int r14 = r12.size()
            r1 = r10
        La0:
            if (r13 >= r14) goto Lb8
            java.lang.Object r3 = r12.get(r13)
            ca7 r3 = (defpackage.ca7) r3
            ts4 r4 = r3.h0
            long r4 = r4.h()
            long r1 = java.lang.Math.max(r1, r4)
            r3.e(r10)
            int r13 = r13 + 1
            goto La0
        Lb8:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r0.setValue(r12)
        Lbd:
            return
    }

    @Override // defpackage.pp6
    public final java.lang.Object getValue() {
            r0 = this;
            vs4 r0 = r0.f0
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public final void h(java.lang.Object r2, java.lang.Object r3, defpackage.rc2 r4) {
            r1 = this;
            vs4 r0 = r1.B
            r0.setValue(r3)
            vs4 r0 = r1.L
            r0.setValue(r4)
            jz6 r4 = r1.a()
            java.lang.Object r4 = r4.R
            boolean r4 = defpackage.nb3.k(r4, r2)
            if (r4 == 0) goto L23
            jz6 r4 = r1.a()
            java.lang.Object r4 = r4.L
            boolean r3 = defpackage.nb3.k(r4, r3)
            if (r3 == 0) goto L23
            return
        L23:
            r3 = 0
            r1.g(r3, r2)
            return
    }

    public final void i(java.lang.Object r7, defpackage.rc2 r8) {
            r6 = this;
            boolean r0 = r6.e0
            if (r0 == 0) goto L13
            jz6 r0 = r6.Y
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.L
            goto Lc
        Lb:
            r0 = 0
        Lc:
            boolean r0 = defpackage.nb3.k(r7, r0)
            if (r0 == 0) goto L13
            goto L2b
        L13:
            vs4 r0 = r6.B
            java.lang.Object r1 = r0.getValue()
            boolean r1 = defpackage.nb3.k(r1, r7)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            rs4 r3 = r6.d0
            if (r1 == 0) goto L2c
            float r1 = r3.h()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2c
        L2b:
            return
        L2c:
            r0.setValue(r7)
            vs4 r0 = r6.L
            r0.setValue(r8)
            float r8 = r3.h()
            r0 = -1069547520(0xffffffffc0400000, float:-3.0)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L40
            r8 = r7
            goto L46
        L40:
            vs4 r8 = r6.f0
            java.lang.Object r8 = r8.getValue()
        L46:
            vs4 r1 = r6.Z
            java.lang.Object r4 = r1.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 1
            r4 = r4 ^ r5
            r6.g(r4, r8)
            float r8 = r3.h()
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r4 = 0
            if (r8 != 0) goto L61
            goto L62
        L61:
            r5 = r4
        L62:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            r1.setValue(r8)
            float r8 = r3.h()
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 < 0) goto L8d
            jz6 r7 = r6.a()
            long r7 = r7.b()
            jz6 r0 = r6.a()
            float r7 = (float) r7
            float r8 = r3.h()
            float r8 = r8 * r7
            long r7 = (long) r8
            java.lang.Object r7 = r0.g(r7)
            r6.f(r7)
            goto L98
        L8d:
            float r8 = r3.h()
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L98
            r6.f(r7)
        L98:
            r6.e0 = r4
            r3.i(r2)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "current value: "
            r0.<init>(r1)
            vs4 r1 = r2.f0
            java.lang.Object r1 = r1.getValue()
            r0.append(r1)
            java.lang.String r1 = ", target: "
            r0.append(r1)
            vs4 r1 = r2.B
            java.lang.Object r1 = r1.getValue()
            r0.append(r1)
            java.lang.String r1 = ", spec: "
            r0.append(r1)
            rc2 r2 = r2.b()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
