package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ms2  reason: default package */
/* loaded from: classes.dex */
public abstract class ms2 extends yy3 implements zx6, up4, jv0 {
    public oi1 j0;
    public gj k0;
    public boolean l0;

    public ms2(gj gjVar, oi1 oi1Var) {
        this.j0 = oi1Var;
        this.k0 = gjVar;
    }

    @Override // defpackage.yy3
    public final void K0() {
        V0();
    }

    @Override // defpackage.up4
    public final void O(kp4 kp4Var, lp4 lp4Var, long j) {
        if (lp4Var == lp4.Main) {
            List list = kp4Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (U0(((rp4) list.get(i)).i)) {
                    int i2 = kp4Var.f;
                    if (i2 == 4) {
                        this.l0 = true;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, n75] */
    public final void R0() {
        gj gjVar;
        ?? obj = new Object();
        ve2.X(this, new qc2(obj));
        ms2 ms2Var = (ms2) obj.A;
        if (ms2Var == null || (gjVar = ms2Var.k0) == null) {
            gjVar = this.k0;
        }
        S0(gjVar);
    }

    public abstract void S0(pp4 pp4Var);

    /* JADX WARN: Type inference failed for: r0v0, types: [j75, java.lang.Object] */
    public final void T0() {
        ?? obj = new Object();
        obj.A = true;
        ve2.Z(this, new ri1(obj));
        if (obj.A) {
            R0();
        }
    }

    public abstract boolean U0(int i);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, n75] */
    public final void V0() {
        if (this.l0) {
            this.l0 = false;
            if (this.i0) {
                ?? obj = new Object();
                ve2.X(this, new xd(1, obj));
                ms2 ms2Var = (ms2) obj.A;
                if (ms2Var != null) {
                    ms2Var.R0();
                } else {
                    S0(null);
                }
            }
        }
    }

    @Override // defpackage.up4
    public final void q0() {
        V0();
    }

    @Override // defpackage.up4
    public final long v() {
        if (this.j0 != null) {
            od1 od1Var = l.P(this).t0;
            int i = fw6.b;
            return so1.l(od1Var.Y(10.0f), od1Var.Y(40.0f), od1Var.Y(10.0f), od1Var.Y(40.0f));
        }
        return fw6.a;
    }
}
