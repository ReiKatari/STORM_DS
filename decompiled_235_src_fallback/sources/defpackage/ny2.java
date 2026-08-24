package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny2  reason: default package */
/* loaded from: classes.dex */
public abstract class ny2 extends defpackage.z64 implements defpackage.ub7, defpackage.yy4, defpackage.fy0 {
    public defpackage.tm1 k0;
    public defpackage.sj l0;
    public boolean m0;

    public ny2(defpackage.sj r1, defpackage.tm1 r2) {
            r0 = this;
            r0.<init>()
            r0.k0 = r2
            r0.l0 = r1
            return
    }

    @Override // defpackage.yy4
    public final void I() {
            r0 = this;
            r0.V0()
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r0 = this;
            r0.V0()
            return
    }

    public final void R0() {
            r2 = this;
            dh5 r0 = new dh5
            r0.<init>()
            hh2 r1 = new hh2
            r1.<init>(r0)
            defpackage.ii2.W(r2, r1)
            java.lang.Object r0 = r0.A
            ny2 r0 = (defpackage.ny2) r0
            if (r0 == 0) goto L17
            sj r0 = r0.l0
            if (r0 != 0) goto L19
        L17:
            sj r0 = r2.l0
        L19:
            r2.S0(r0)
            return
    }

    public abstract void S0(defpackage.ty4 r1);

    public final void T0() {
            r2 = this;
            zg5 r0 = new zg5
            r0.<init>()
            r1 = 1
            r0.A = r1
            xm1 r1 = new xm1
            r1.<init>(r0)
            defpackage.ii2.Y(r2, r1)
            boolean r0 = r0.A
            if (r0 == 0) goto L17
            r2.R0()
        L17:
            return
    }

    public abstract boolean U0(int r1);

    public final void V0() {
            r3 = this;
            boolean r0 = r3.m0
            if (r0 == 0) goto L27
            r0 = 0
            r3.m0 = r0
            boolean r0 = r3.j0
            if (r0 == 0) goto L27
            dh5 r0 = new dh5
            r0.<init>()
            me r1 = new me
            r2 = 1
            r1.<init>(r2, r0)
            defpackage.ii2.W(r3, r1)
            java.lang.Object r0 = r0.A
            ny2 r0 = (defpackage.ny2) r0
            if (r0 == 0) goto L23
            r0.R0()
            return
        L23:
            r0 = 0
            r3.S0(r0)
        L27:
            return
    }

    @Override // defpackage.yy4
    public final long o() {
            r4 = this;
            tm1 r0 = r4.k0
            if (r0 == 0) goto L25
            sm3 r4 = defpackage.nc1.f0(r4)
            qh1 r4 = r4.u0
            int r0 = defpackage.s87.b
            r0 = 1092616192(0x41200000, float:10.0)
            int r1 = r4.r0(r0)
            r2 = 1109393408(0x42200000, float:40.0)
            int r3 = r4.r0(r2)
            int r0 = r4.r0(r0)
            int r4 = r4.r0(r2)
            long r0 = defpackage.x31.v(r1, r3, r0, r4)
            return r0
        L25:
            long r0 = defpackage.s87.a
            return r0
    }

    @Override // defpackage.yy4
    public final void w(defpackage.oy4 r2, defpackage.py4 r3, long r4) {
            r1 = this;
            py4 r4 = defpackage.py4.Main
            if (r3 != r4) goto L31
            java.util.List r3 = r2.a
            int r4 = r3.size()
            r5 = 0
        Lb:
            if (r5 >= r4) goto L31
            java.lang.Object r0 = r3.get(r5)
            vy4 r0 = (defpackage.vy4) r0
            int r0 = r0.i
            boolean r0 = r1.U0(r0)
            if (r0 == 0) goto L2e
            int r2 = r2.f
            r3 = 4
            if (r2 != r3) goto L27
            r2 = 1
            r1.m0 = r2
            r1.T0()
            return
        L27:
            r3 = 5
            if (r2 != r3) goto L31
            r1.V0()
            return
        L2e:
            int r5 = r5 + 1
            goto Lb
        L31:
            return
    }
}
