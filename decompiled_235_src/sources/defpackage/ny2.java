package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny2  reason: default package */
/* loaded from: classes.dex */
public abstract class ny2 extends z64 implements ub7, yy4, fy0 {
    public tm1 k0;
    public sj l0;
    public boolean m0;

    public ny2(sj sjVar, tm1 tm1Var) {
        this.k0 = tm1Var;
        this.l0 = sjVar;
    }

    @Override // defpackage.yy4
    public final void I() {
        V0();
    }

    @Override // defpackage.z64
    public final void K0() {
        V0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dh5, java.lang.Object] */
    public final void R0() {
        sj sjVar;
        ?? obj = new Object();
        ii2.W(this, new hh2(obj));
        ny2 ny2Var = (ny2) obj.A;
        if (ny2Var == null || (sjVar = ny2Var.l0) == null) {
            sjVar = this.l0;
        }
        S0(sjVar);
    }

    public abstract void S0(ty4 ty4Var);

    /* JADX WARN: Type inference failed for: r0v0, types: [zg5, java.lang.Object] */
    public final void T0() {
        ?? obj = new Object();
        obj.A = true;
        ii2.Y(this, new xm1(obj));
        if (obj.A) {
            R0();
        }
    }

    public abstract boolean U0(int i);

    /* JADX WARN: Type inference failed for: r0v3, types: [dh5, java.lang.Object] */
    public final void V0() {
        if (this.m0) {
            this.m0 = false;
            if (this.j0) {
                ?? obj = new Object();
                ii2.W(this, new me(1, obj));
                ny2 ny2Var = (ny2) obj.A;
                if (ny2Var != null) {
                    ny2Var.R0();
                } else {
                    S0(null);
                }
            }
        }
    }

    @Override // defpackage.yy4
    public final long o() {
        if (this.k0 != null) {
            qh1 qh1Var = nc1.f0(this).u0;
            int i = s87.b;
            return x31.v(qh1Var.r0(10.0f), qh1Var.r0(40.0f), qh1Var.r0(10.0f), qh1Var.r0(40.0f));
        }
        return s87.a;
    }

    @Override // defpackage.yy4
    public final void w(oy4 oy4Var, py4 py4Var, long j) {
        if (py4Var == py4.Main) {
            List list = oy4Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (U0(((vy4) list.get(i)).i)) {
                    int i2 = oy4Var.f;
                    if (i2 == 4) {
                        this.m0 = true;
                        T0();
                        return;
                    } else if (i2 == 5) {
                        V0();
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
