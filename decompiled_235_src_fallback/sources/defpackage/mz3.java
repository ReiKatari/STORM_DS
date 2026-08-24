package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mz3  reason: default package */
/* loaded from: classes.dex */
public abstract class mz3 extends defpackage.kz3 implements defpackage.x24 {
    public final defpackage.eg4 k0;
    public long l0;
    public java.util.LinkedHashMap m0;
    public final defpackage.nz3 n0;
    public defpackage.f34 o0;
    public final defpackage.y94 p0;

    public mz3(defpackage.eg4 r3) {
            r2 = this;
            r2.<init>()
            r2.k0 = r3
            r0 = 0
            r2.l0 = r0
            nz3 r3 = new nz3
            r3.<init>(r2)
            r2.n0 = r3
            y94 r3 = defpackage.th4.a
            y94 r3 = new y94
            r3.<init>()
            r2.p0 = r3
            return
    }

    public static final void N0(defpackage.mz3 r6, defpackage.f34 r7) {
            if (r7 == 0) goto L1a
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            long r0 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            r6.l0(r0)
            goto L1f
        L1a:
            r0 = 0
            r6.l0(r0)
        L1f:
            f34 r0 = r6.o0
            boolean r0 = defpackage.nb3.k(r0, r7)
            if (r0 != 0) goto L6e
            if (r7 == 0) goto L6e
            java.util.LinkedHashMap r0 = r6.m0
            if (r0 == 0) goto L33
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3d
        L33:
            java.util.Map r0 = r7.b()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6e
        L3d:
            java.util.Map r0 = r7.b()
            java.util.LinkedHashMap r1 = r6.m0
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L6e
            eg4 r0 = r6.k0
            sm3 r0 = r0.k0
            wm3 r0 = r0.C0
            rz3 r0 = r0.q
            r0.getClass()
            tm3 r0 = r0.n0
            r0.f()
            java.util.LinkedHashMap r0 = r6.m0
            if (r0 != 0) goto L64
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r6.m0 = r0
        L64:
            r0.clear()
            java.util.Map r1 = r7.b()
            r0.putAll(r1)
        L6e:
            r6.o0 = r7
            return
    }

    @Override // defpackage.kz3
    public final defpackage.jk3 A0() {
            r0 = this;
            nz3 r0 = r0.n0
            return r0
    }

    @Override // defpackage.dx4, defpackage.x24
    public final java.lang.Object B() {
            r0 = this;
            eg4 r0 = r0.k0
            java.lang.Object r0 = r0.B()
            return r0
    }

    @Override // defpackage.kz3
    public final boolean C0() {
            r0 = this;
            f34 r0 = r0.o0
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.kz3
    public final defpackage.sm3 F0() {
            r0 = this;
            eg4 r0 = r0.k0
            sm3 r0 = r0.k0
            return r0
    }

    @Override // defpackage.kz3
    public final defpackage.f34 G0() {
            r0 = this;
            f34 r0 = r0.o0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "LookaheadDelegate has not been measured yet when measureResult is requested."
            ug r0 = defpackage.i61.e(r0)
            throw r0
    }

    @Override // defpackage.kz3
    public final defpackage.kz3 H0() {
            r0 = this;
            eg4 r0 = r0.k0
            eg4 r0 = r0.o0
            if (r0 == 0) goto Lb
            mz3 r0 = r0.W0()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // defpackage.kz3
    public final long I0() {
            r2 = this;
            long r0 = r2.l0
            return r0
    }

    @Override // defpackage.kz3
    public final void M0() {
            r4 = this;
            long r0 = r4.l0
            r2 = 0
            r3 = 0
            r4.h0(r0, r2, r3)
            return
    }

    public final long O0() {
            r6 = this;
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

    public void P0() {
            r0 = this;
            f34 r0 = r0.G0()
            r0.a()
            return
    }

    public final void Q0(long r3) {
            r2 = this;
            long r0 = r2.l0
            boolean r0 = defpackage.i93.a(r0, r3)
            if (r0 != 0) goto L1a
            r2.l0 = r3
            eg4 r3 = r2.k0
            sm3 r4 = r3.k0
            wm3 r4 = r4.C0
            rz3 r4 = r4.q
            if (r4 == 0) goto L17
            r4.x0()
        L17:
            defpackage.kz3.K0(r3)
        L1a:
            boolean r3 = r2.g0
            if (r3 != 0) goto L25
            f34 r3 = r2.G0()
            r2.x0(r3)
        L25:
            return
    }

    public final long R0(defpackage.mz3 r5, boolean r6) {
            r4 = this;
            r0 = 0
        L2:
            boolean r2 = r4.equals(r5)
            if (r2 != 0) goto L23
            boolean r2 = r4.e0
            if (r2 == 0) goto Le
            if (r6 != 0) goto L14
        Le:
            long r2 = r4.l0
            long r0 = defpackage.i93.c(r0, r2)
        L14:
            eg4 r4 = r4.k0
            eg4 r4 = r4.o0
            r4.getClass()
            mz3 r4 = r4.W0()
            r4.getClass()
            goto L2
        L23:
            return r0
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            eg4 r0 = r0.k0
            float r0 = r0.Y()
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            eg4 r0 = r0.k0
            float r0 = r0.a()
            return r0
    }

    @Override // defpackage.kz3, defpackage.eb3
    public final boolean a0() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.eb3
    public final defpackage.kk3 getLayoutDirection() {
            r0 = this;
            eg4 r0 = r0.k0
            sm3 r0 = r0.k0
            kk3 r0 = r0.v0
            return r0
    }

    @Override // defpackage.dx4
    public final void h0(long r1, float r3, defpackage.qn2 r4) {
            r0 = this;
            r0.Q0(r1)
            boolean r1 = r0.f0
            if (r1 == 0) goto L8
            return
        L8:
            r0.P0()
            return
    }

    @Override // defpackage.kz3
    public final defpackage.kz3 z0() {
            r0 = this;
            eg4 r0 = r0.k0
            eg4 r0 = r0.n0
            if (r0 == 0) goto Lb
            mz3 r0 = r0.W0()
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
