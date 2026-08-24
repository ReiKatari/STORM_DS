package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x53  reason: default package */
/* loaded from: classes.dex */
public final class x53 extends mz3 {
    @Override // defpackage.mz3
    public final void P0() {
        rz3 rz3Var = this.k0.k0.C0.q;
        rz3Var.getClass();
        rz3Var.A0();
    }

    @Override // defpackage.x24
    public final int V(int i) {
        yc1 u = this.k0.k0.u();
        e34 D = u.D();
        sm3 sm3Var = (sm3) u.A;
        return D.i((eg4) sm3Var.B0.e, sm3Var.l(), i);
    }

    @Override // defpackage.x24
    public final int c(int i) {
        yc1 u = this.k0.k0.u();
        e34 D = u.D();
        sm3 sm3Var = (sm3) u.A;
        return D.g((eg4) sm3Var.B0.e, sm3Var.l(), i);
    }

    @Override // defpackage.x24
    public final int n(int i) {
        yc1 u = this.k0.k0.u();
        e34 D = u.D();
        sm3 sm3Var = (sm3) u.A;
        return D.e((eg4) sm3Var.B0.e, sm3Var.l(), i);
    }

    @Override // defpackage.x24
    public final int u(int i) {
        yc1 u = this.k0.k0.u();
        e34 D = u.D();
        sm3 sm3Var = (sm3) u.A;
        return D.a((eg4) sm3Var.B0.e, sm3Var.l(), i);
    }

    @Override // defpackage.kz3
    public final int u0(ey2 ey2Var) {
        int i;
        rz3 rz3Var = this.k0.k0.C0.q;
        rz3Var.getClass();
        tm3 tm3Var = rz3Var.n0;
        if (!rz3Var.g0) {
            wm3 wm3Var = rz3Var.Y;
            if (wm3Var.d == om3.LookaheadMeasuring) {
                tm3Var.f = true;
                if (tm3Var.b) {
                    wm3Var.f = true;
                    wm3Var.g = true;
                }
            } else {
                tm3Var.g = true;
            }
        }
        x53 x53Var = rz3Var.f().Q0;
        if (x53Var != null) {
            x53Var.g0 = true;
        }
        rz3Var.I();
        x53 x53Var2 = rz3Var.f().Q0;
        if (x53Var2 != null) {
            x53Var2.g0 = false;
        }
        Integer num = (Integer) tm3Var.i.get(ey2Var);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        this.p0.g(i, ey2Var);
        return i;
    }

    @Override // defpackage.x24
    public final dx4 y(long j) {
        m0(j);
        eg4 eg4Var = this.k0;
        ua4 z = eg4Var.k0.z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            rz3 rz3Var = ((sm3) objArr[i2]).C0.q;
            rz3Var.getClass();
            rz3Var.f0 = qm3.NotUsed;
        }
        sm3 sm3Var = eg4Var.k0;
        mz3.N0(this, sm3Var.s0.d(this, sm3Var.l(), j));
        return this;
    }
}
