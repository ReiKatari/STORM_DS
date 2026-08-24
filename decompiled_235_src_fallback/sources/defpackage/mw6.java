package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw6  reason: default package */
/* loaded from: classes.dex */
public final class mw6 implements defpackage.qh1, defpackage.r41 {
    public final /* synthetic */ defpackage.ow6 A;
    public final defpackage.rj0 B;
    public defpackage.rj0 L;
    public defpackage.py4 R;
    public final defpackage.vt1 X;
    public final /* synthetic */ defpackage.ow6 Y;

    public mw6(defpackage.ow6 r1, defpackage.rj0 r2) {
            r0 = this;
            r0.<init>()
            r0.Y = r1
            r0.A = r1
            r0.B = r2
            py4 r1 = defpackage.py4.Main
            r0.R = r1
            vt1 r1 = defpackage.vt1.A
            r0.X = r1
            return
    }

    @Override // defpackage.qh1
    public final long M(float r1) {
            r0 = this;
            ow6 r0 = r0.A
            long r0 = r0.M(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float Q(int r1) {
            r0 = this;
            ow6 r0 = r0.A
            float r0 = r0.Q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float T(float r1) {
            r0 = this;
            ow6 r0 = r0.A
            float r0 = r0.a()
            float r1 = r1 / r0
            return r1
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            ow6 r0 = r0.A
            float r0 = r0.Y()
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            ow6 r0 = r0.A
            float r0 = r0.a()
            return r0
    }

    @Override // defpackage.r41
    public final defpackage.l61 b() {
            r0 = this;
            vt1 r0 = r0.X
            return r0
    }

    public final java.lang.Object c(defpackage.py4 r3, defpackage.d20 r4) {
            r2 = this;
            rj0 r0 = new rj0
            r41 r4 = defpackage.np2.V(r4)
            r1 = 1
            r0.<init>(r1, r4)
            r0.v()
            r2.R = r3
            r2.L = r0
            java.lang.Object r2 = r0.s()
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            return r2
    }

    public final long d() {
            r9 = this;
            ow6 r9 = r9.Y
            sm3 r0 = defpackage.nc1.f0(r9)
            fo7 r0 = r0.w0
            long r0 = r0.d()
            long r0 = r9.v0(r0)
            long r2 = r9.u0
            r9 = 32
            long r4 = r0 >> r9
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r5 = r2 >> r9
            int r5 = (int) r5
            float r5 = (float) r5
            float r4 = r4 - r5
            r5 = 0
            float r4 = java.lang.Math.max(r5, r4)
            r6 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r6
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r7
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r1 = r2 & r7
            int r1 = (int) r1
            float r1 = (float) r1
            float r0 = r0 - r1
            float r0 = java.lang.Math.max(r5, r0)
            float r0 = r0 / r6
            int r1 = java.lang.Float.floatToRawIntBits(r4)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r3 = (long) r0
            long r0 = r1 << r9
            long r2 = r3 & r7
            long r0 = r0 | r2
            return r0
    }

    @Override // defpackage.qh1
    public final float e0(float r1) {
            r0 = this;
            ow6 r0 = r0.A
            float r0 = r0.a()
            float r0 = r0 * r1
            return r0
    }

    public final defpackage.fo7 f() {
            r0 = this;
            ow6 r0 = r0.Y
            sm3 r0 = defpackage.nc1.f0(r0)
            fo7 r0 = r0.w0
            return r0
    }

    @Override // defpackage.r41
    public final void i(java.lang.Object r3) {
            r2 = this;
            ow6 r0 = r2.Y
            ua4 r1 = r0.r0
            monitor-enter(r1)
            ua4 r0 = r0.q0     // Catch: java.lang.Throwable -> L11
            r0.j(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            rj0 r2 = r2.B
            r2.i(r3)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final java.lang.Object k(long r11, defpackage.eo2 r13, defpackage.s41 r14) {
            r10 = this;
            boolean r0 = r14 instanceof defpackage.kw6
            if (r0 == 0) goto L13
            r0 = r14
            kw6 r0 = (defpackage.kw6) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kw6 r0 = new kw6
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            ap6 r10 = r0.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L29
            goto L6c
        L29:
            r0 = move-exception
            r11 = r0
            goto L72
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L33:
            defpackage.oi2.Y(r14)
            r4 = 0
            int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r14 > 0) goto L4d
            rj0 r14 = r10.L
            if (r14 == 0) goto L4d
            qy4 r2 = new qy4
            r2.<init>(r11)
            em5 r4 = new em5
            r4.<init>(r2)
            r14.i(r4)
        L4d:
            ow6 r14 = r10.Y
            w61 r14 = r14.F0()
            jc0 r4 = new jc0
            r9 = 2
            r8 = 0
            r7 = r10
            r5 = r11
            r4.<init>(r5, r7, r8, r9)
            r10 = 3
            ap6 r10 = defpackage.hv.L(r14, r8, r8, r4, r10)
            r0.R = r10     // Catch: java.lang.Throwable -> L29
            r0.Z = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r14 = r13.o(r7, r0)     // Catch: java.lang.Throwable -> L29
            if (r14 != r1) goto L6c
            return r1
        L6c:
            nj0 r11 = defpackage.nj0.B
            r10.h(r11)
            return r14
        L72:
            nj0 r12 = defpackage.nj0.B
            r10.h(r12)
            throw r11
    }

    @Override // defpackage.qh1
    public final int k0(long r1) {
            r0 = this;
            ow6 r0 = r0.A
            int r0 = r0.k0(r1)
            return r0
    }

    public final java.lang.Object l(long r6, defpackage.eo2 r8, defpackage.s41 r9) {
            r5 = this;
            boolean r0 = r9 instanceof defpackage.lw6
            if (r0 == 0) goto L13
            r0 = r9
            lw6 r0 = (defpackage.lw6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            lw6 r0 = new lw6
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r9)     // Catch: defpackage.qy4 -> L3b
            return r9
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2e:
            defpackage.oi2.Y(r9)
            r0.Y = r4     // Catch: defpackage.qy4 -> L3b
            java.lang.Object r5 = r5.k(r6, r8, r0)     // Catch: defpackage.qy4 -> L3b
            if (r5 != r1) goto L3a
            return r1
        L3a:
            return r5
        L3b:
            return r3
    }

    @Override // defpackage.qh1
    public final long p(float r1) {
            r0 = this;
            ow6 r0 = r0.A
            long r0 = r0.p(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long q(long r1) {
            r0 = this;
            ow6 r0 = r0.A
            long r0 = r0.q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final int r0(float r1) {
            r0 = this;
            ow6 r0 = r0.A
            int r0 = r0.r0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long v0(long r1) {
            r0 = this;
            ow6 r0 = r0.A
            long r0 = r0.v0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float x(long r1) {
            r0 = this;
            ow6 r0 = r0.A
            float r0 = r0.x(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float y0(long r1) {
            r0 = this;
            ow6 r0 = r0.A
            float r0 = r0.y0(r1)
            return r0
    }
}
