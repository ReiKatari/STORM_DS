package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ex2  reason: default package */
/* loaded from: classes.dex */
public final class ex2 extends defpackage.z64 implements defpackage.fy0, defpackage.jm3, defpackage.gi4 {
    public defpackage.s47 k0;
    public int l0;
    public int m0;
    public boolean n0;
    public int o0;
    public int p0;
    public defpackage.s47 q0;
    public defpackage.we7 r0;

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.z64
    public final void J0() {
            r6 = this;
            nq6 r0 = defpackage.ky0.k
            java.lang.Object r0 = defpackage.hf.K(r6, r0)
            ki2 r0 = (defpackage.ki2) r0
            s47 r1 = r6.k0
            sm3 r2 = defpackage.nc1.f0(r6)
            kk3 r2 = r2.v0
            s47 r1 = defpackage.gi2.N(r1, r2)
            r6.q0 = r1
            s47 r1 = r6.R0()
            nn6 r1 = r1.a
            li2 r1 = r1.f
            s47 r2 = r6.R0()
            nn6 r2 = r2.a
            oj2 r2 = r2.c
            if (r2 != 0) goto L2a
            oj2 r2 = defpackage.oj2.Y
        L2a:
            s47 r3 = r6.R0()
            nn6 r3 = r3.a
            ij2 r3 = r3.d
            r4 = 0
            if (r3 == 0) goto L38
            int r3 = r3.a
            goto L39
        L38:
            r3 = r4
        L39:
            s47 r5 = r6.R0()
            nn6 r5 = r5.a
            jj2 r5 = r5.e
            if (r5 == 0) goto L46
            int r5 = r5.a
            goto L49
        L46:
            r5 = 65535(0xffff, float:9.1834E-41)
        L49:
            mi2 r0 = (defpackage.mi2) r0
            we7 r0 = r0.b(r1, r2, r3, r5)
            r6.r0 = r0
            dx2 r0 = new dx2
            r0.<init>(r6, r4)
            defpackage.jx2.B(r6, r0)
            r0 = 1
            r6.n0 = r0
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r1 = this;
            r0 = 0
            r1.q0 = r0
            r1.r0 = r0
            r0 = 0
            r1.n0 = r0
            return
    }

    public final defpackage.s47 R0() {
            r0 = this;
            s47 r0 = r0.q0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Resolved style is not set."
            ug r0 = defpackage.lb1.c(r0)
            throw r0
    }

    @Override // defpackage.xg1
    public final void S() {
            r2 = this;
            s47 r0 = r2.k0
            sm3 r1 = defpackage.nc1.f0(r2)
            kk3 r1 = r1.v0
            s47 r0 = defpackage.gi2.N(r0, r1)
            r2.q0 = r0
            r0 = 1
            r2.n0 = r0
            defpackage.xk2.w(r2)
            return
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r11, defpackage.x24 r12, long r13) {
            r10 = this;
            boolean r0 = r10.n0
            r1 = -1
            if (r0 == 0) goto L57
            s47 r0 = r10.R0()
            nq6 r2 = defpackage.ky0.k
            java.lang.Object r2 = defpackage.hf.K(r10, r2)
            ki2 r2 = (defpackage.ki2) r2
            java.lang.String r3 = defpackage.l17.a
            r4 = 1
            long r5 = defpackage.l17.a(r0, r11, r2, r3, r4)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r5 = (int) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r9 = 10
            r6.append(r9)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r6 = 2
            long r2 = defpackage.l17.a(r0, r11, r2, r3, r6)
            long r2 = r2 & r7
            int r0 = (int) r2
            int r0 = r0 - r5
            int r2 = r10.l0
            if (r2 != r4) goto L41
            r2 = r1
            goto L44
        L41:
            int r2 = r2 - r4
            int r2 = r2 * r0
            int r2 = r2 + r5
        L44:
            r10.o0 = r2
            int r2 = r10.m0
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L4f
            r2 = r1
            goto L52
        L4f:
            int r2 = r2 - r4
            int r2 = r2 * r0
            int r2 = r2 + r5
        L52:
            r10.p0 = r2
            r0 = 0
            r10.n0 = r0
        L57:
            int r0 = r10.o0
            if (r0 == r1) goto L69
            int r2 = defpackage.q21.i(r13)
            int r3 = defpackage.q21.g(r13)
            int r0 = defpackage.gi2.q(r0, r2, r3)
        L67:
            r6 = r0
            goto L6e
        L69:
            int r0 = defpackage.q21.i(r13)
            goto L67
        L6e:
            int r10 = r10.p0
            if (r10 == r1) goto L80
            int r0 = defpackage.q21.i(r13)
            int r1 = defpackage.q21.g(r13)
            int r10 = defpackage.gi2.q(r10, r0, r1)
        L7e:
            r7 = r10
            goto L85
        L80:
            int r10 = defpackage.q21.g(r13)
            goto L7e
        L85:
            r5 = 0
            r8 = 3
            r4 = 0
            r2 = r13
            long r13 = defpackage.q21.a(r2, r4, r5, r6, r7, r8)
            dx4 r10 = r12.y(r13)
            int r12 = r10.A
            int r13 = r10.B
            jv r14 = new jv
            r0 = 4
            r14.<init>(r10, r0)
            zt1 r10 = defpackage.zt1.A
            f34 r10 = r11.K(r12, r13, r10, r14)
            return r10
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
            r1 = this;
            r0 = 1
            r1.n0 = r0
            defpackage.xk2.w(r1)
            return
    }

    @Override // defpackage.gi4
    public final void l0() {
            r2 = this;
            we7 r0 = r2.r0
            if (r0 == 0) goto Ld
            dx2 r0 = new dx2
            r1 = 1
            r0.<init>(r2, r1)
            defpackage.jx2.B(r2, r0)
        Ld:
            r0 = 1
            r2.n0 = r0
            defpackage.xk2.w(r2)
            return
    }
}
