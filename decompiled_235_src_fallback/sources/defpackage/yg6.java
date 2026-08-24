package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg6  reason: default package */
/* loaded from: classes.dex */
public final class yg6 extends defpackage.z64 implements defpackage.jm3, defpackage.gi4, defpackage.mo1, defpackage.fy0 {
    public defpackage.sg6 k0;

    @Override // defpackage.z64
    public final void J0() {
            r1 = this;
            sg6 r0 = r1.k0
            pj r0 = r0.R
            defpackage.jx2.B(r1, r0)
            sg6 r1 = r1.k0
            r1.getClass()
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r0 = this;
            sg6 r0 = r0.k0
            r0.getClass()
            return
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r3, defpackage.x24 r4, long r5) {
            r2 = this;
            dx4 r4 = r4.y(r5)
            int r5 = r4.A
            int r6 = r4.B
            ln r0 = new ln
            r1 = 7
            r0.<init>(r3, r2, r4, r1)
            zt1 r2 = defpackage.zt1.A
            f34 r2 = r3.K(r5, r6, r2, r0)
            return r2
    }

    @Override // defpackage.gi4
    public final void l0() {
            r1 = this;
            sg6 r0 = r1.k0
            r0.f()
            sg6 r0 = r1.k0
            pj r0 = r0.R
            defpackage.jx2.B(r1, r0)
            return
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r13) {
            r12 = this;
            r13.b()
            sg6 r12 = r12.k0
            zj0 r0 = r13.A
            mm6 r12 = r12.Z
            int r1 = r12.size()
            r2 = 1
            if (r1 <= r2) goto L1a
            tp5 r1 = new tp5
            r2 = 8
            r1.<init>(r2)
            defpackage.jt0.x0(r12, r1)
        L1a:
            int r1 = r12.size()
            r2 = 0
        L1f:
            if (r2 >= r1) goto Ld4
            java.lang.Object r3 = r12.get(r2)
            if6 r3 = (defpackage.if6) r3
            vs4 r4 = r3.i0
            java.lang.Object r4 = r4.getValue()
            ut2 r4 = (defpackage.ut2) r4
            if (r4 != 0) goto L33
            goto Ld0
        L33:
            gf6 r5 = r3.e()
            mg5 r5 = r5.c
            zg6 r5 = r5.d()
            of5 r5 = r5.c()
            if (r5 != 0) goto L45
            goto Ld0
        L45:
            boolean r6 = r3.g()
            if (r6 == 0) goto Ld0
            long r5 = r5.d()
            r7 = 32
            long r7 = r5 >> r7
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r8
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            hj r3 = r3.f0
            if (r3 == 0) goto Lad
            bt r6 = r0.B
            bt r8 = r0.B
            long r9 = r6.L()
            xj0 r11 = r6.G()
            r11.h()
            java.lang.Object r11 = r6.B     // Catch: java.lang.Throwable -> L9c
            os0 r11 = (defpackage.os0) r11     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r11 = r11.B     // Catch: java.lang.Throwable -> L9c
            bt r11 = (defpackage.bt) r11     // Catch: java.lang.Throwable -> L9c
            xj0 r11 = r11.G()     // Catch: java.lang.Throwable -> L9c
            r11.m(r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r3 = r8.B     // Catch: java.lang.Throwable -> L9c
            os0 r3 = (defpackage.os0) r3     // Catch: java.lang.Throwable -> L9c
            r3.g0(r7, r5)     // Catch: java.lang.Throwable -> L9c
            defpackage.oi2.u(r13, r4)     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r3 = r8.B     // Catch: java.lang.Throwable -> L9c
            os0 r3 = (defpackage.os0) r3     // Catch: java.lang.Throwable -> L9c
            float r4 = -r7
            float r5 = -r5
            r3.g0(r4, r5)     // Catch: java.lang.Throwable -> L9c
            defpackage.xg6.v(r6, r9)
            goto Ld0
        L9c:
            r12 = move-exception
            goto La9
        L9e:
            r12 = move-exception
            java.lang.Object r13 = r8.B     // Catch: java.lang.Throwable -> L9c
            os0 r13 = (defpackage.os0) r13     // Catch: java.lang.Throwable -> L9c
            float r0 = -r7
            float r1 = -r5
            r13.g0(r0, r1)     // Catch: java.lang.Throwable -> L9c
            throw r12     // Catch: java.lang.Throwable -> L9c
        La9:
            defpackage.xg6.v(r6, r9)
            throw r12
        Lad:
            bt r3 = r0.B
            bt r6 = r0.B
            java.lang.Object r3 = r3.B
            os0 r3 = (defpackage.os0) r3
            r3.g0(r7, r5)
            defpackage.oi2.u(r13, r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r3 = r6.B
            os0 r3 = (defpackage.os0) r3
            float r4 = -r7
            float r5 = -r5
            r3.g0(r4, r5)
            goto Ld0
        Lc5:
            r12 = move-exception
            java.lang.Object r13 = r6.B
            os0 r13 = (defpackage.os0) r13
            float r0 = -r7
            float r1 = -r5
            r13.g0(r0, r1)
            throw r12
        Ld0:
            int r2 = r2 + 1
            goto L1f
        Ld4:
            return
    }
}
