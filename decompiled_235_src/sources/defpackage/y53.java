package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y53  reason: default package */
/* loaded from: classes.dex */
public final class y53 extends eg4 {
    public static final aj R0;
    public final vy6 P0;
    public x53 Q0;

    static {
        aj t = nc1.t();
        int i = kt0.i;
        t.l(kt0.e);
        t.s(1.0f);
        t.t(1);
        R0 = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [vy6, z64] */
    /* JADX WARN: Type inference failed for: r3v4, types: [mz3] */
    public y53(sm3 sm3Var) {
        super(sm3Var);
        x53 x53Var;
        ?? z64Var = new z64();
        z64Var.R = 0;
        this.P0 = z64Var;
        z64Var.d0 = this;
        if (sm3Var.e0 != null) {
            x53Var = new mz3(this);
        } else {
            x53Var = null;
        }
        this.Q0 = x53Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mz3, x53] */
    @Override // defpackage.eg4
    public final void T0() {
        if (this.Q0 == null) {
            this.Q0 = new mz3(this);
        }
    }

    @Override // defpackage.x24
    public final int V(int i) {
        yc1 u = this.k0.u();
        e34 D = u.D();
        sm3 sm3Var = (sm3) u.A;
        return D.i((eg4) sm3Var.B0.e, sm3Var.m(), i);
    }

    @Override // defpackage.eg4
    public final mz3 W0() {
        return this.Q0;
    }

    @Override // defpackage.eg4
    public final z64 Y0() {
        return this.P0;
    }

    @Override // defpackage.x24
    public final int c(int i) {
        yc1 u = this.k0.u();
        e34 D = u.D();
        sm3 sm3Var = (sm3) u.A;
        return D.g((eg4) sm3Var.B0.e, sm3Var.m(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.eg4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(cg4 cg4Var, long j, zx2 zx2Var, int i, boolean z) {
        int i2;
        boolean z2;
        sm3 sm3Var = this.k0;
        boolean z3 = false;
        if (cg4Var.i(sm3Var)) {
            if (z1(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(Q0(j, X0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (!z3) {
                int i3 = zx2Var.L;
                ua4 y = sm3Var.y();
                Object[] objArr = y.A;
                int i4 = y.L - 1;
                while (i4 >= 0) {
                    sm3 sm3Var2 = (sm3) objArr[i4];
                    if (sm3Var2.I()) {
                        cg4Var.e(sm3Var2, j, zx2Var, i2, z2);
                        long a = zx2Var.a();
                        if (vy7.m0(a) < RecyclerView.B1 && vy7.o0(a) && !vy7.n0(a) && !cg4Var.g(zx2Var, sm3Var2)) {
                            break;
                        }
                    }
                    i4--;
                    i2 = i;
                }
                zx2Var.L = i3;
                return;
            }
            return;
        }
        i2 = i;
        z2 = z;
        if (!z3) {
        }
    }

    @Override // defpackage.dx4
    public final void h0(long j, float f, qn2 qn2Var) {
        if (this.l0) {
            mz3 W0 = W0();
            W0.getClass();
            o1(W0.l0, f, qn2Var);
        } else {
            o1(j, f, qn2Var);
        }
        if (this.f0) {
            return;
        }
        this.k0.C0.p.z0();
    }

    @Override // defpackage.x24
    public final int n(int i) {
        yc1 u = this.k0.u();
        e34 D = u.D();
        sm3 sm3Var = (sm3) u.A;
        return D.e((eg4) sm3Var.B0.e, sm3Var.m(), i);
    }

    @Override // defpackage.eg4
    public final void n1(xj0 xj0Var, ut2 ut2Var) {
        sm3 sm3Var = this.k0;
        zp4 a = vm3.a(sm3Var);
        ua4 y = sm3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var2 = (sm3) objArr[i2];
            if (sm3Var2.I()) {
                sm3Var2.i(xj0Var, ut2Var);
            }
        }
        if (((te) a).getShowLayoutBounds()) {
            long j = this.L;
            xj0Var.k(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, R0);
        }
    }

    @Override // defpackage.x24
    public final int u(int i) {
        yc1 u = this.k0.u();
        e34 D = u.D();
        sm3 sm3Var = (sm3) u.A;
        return D.a((eg4) sm3Var.B0.e, sm3Var.m(), i);
    }

    @Override // defpackage.kz3
    public final int u0(ey2 ey2Var) {
        x53 x53Var = this.Q0;
        if (x53Var != null) {
            return x53Var.u0(ey2Var);
        }
        d34 d34Var = this.k0.C0.p;
        tm3 tm3Var = d34Var.t0;
        if (!d34Var.i0) {
            if (d34Var.Y.d == om3.Measuring) {
                tm3Var.f = true;
                if (tm3Var.b) {
                    d34Var.r0 = true;
                    d34Var.s0 = true;
                }
            } else {
                tm3Var.g = true;
            }
        }
        y53 f = d34Var.f();
        boolean z = f.g0;
        f.g0 = true;
        d34Var.I();
        f.g0 = z;
        Integer num = (Integer) tm3Var.i.get(ey2Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.x24
    public final dx4 y(long j) {
        if (this.m0) {
            x53 x53Var = this.Q0;
            x53Var.getClass();
            j = x53Var.R;
        }
        m0(j);
        sm3 sm3Var = this.k0;
        ua4 z = sm3Var.z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            ((sm3) objArr[i2]).C0.p.h0 = qm3.NotUsed;
        }
        r1(sm3Var.s0.d(this, sm3Var.m(), j));
        i1();
        return this;
    }
}
