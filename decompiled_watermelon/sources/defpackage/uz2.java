package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uz2  reason: default package */
/* loaded from: classes.dex */
public final class uz2 extends hs3 {
    @Override // defpackage.hs3
    public final void P0() {
        ms3 ms3Var = this.j0.j0.B0.q;
        ms3Var.getClass();
        ms3Var.B0();
    }

    @Override // defpackage.mv3
    public final int T(int i) {
        k91 t = this.j0.j0.t();
        tv3 E = t.E();
        vf3 vf3Var = (vf3) t.A;
        return E.i((m74) vf3Var.A0.e, vf3Var.l(), i);
    }

    @Override // defpackage.mv3
    public final yn4 c(long j) {
        q0(j);
        m74 m74Var = this.j0;
        o24 y = m74Var.j0.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            ms3 ms3Var = ((vf3) objArr[i2]).B0.q;
            ms3Var.getClass();
            ms3Var.e0 = tf3.NotUsed;
        }
        vf3 vf3Var = m74Var.j0;
        hs3.N0(this, vf3Var.r0.f(this, vf3Var.l(), j));
        return this;
    }

    @Override // defpackage.mv3
    public final int e0(int i) {
        k91 t = this.j0.j0.t();
        tv3 E = t.E();
        vf3 vf3Var = (vf3) t.A;
        return E.b((m74) vf3Var.A0.e, vf3Var.l(), i);
    }

    @Override // defpackage.mv3
    public final int f(int i) {
        k91 t = this.j0.j0.t();
        tv3 E = t.E();
        vf3 vf3Var = (vf3) t.A;
        return E.a((m74) vf3Var.A0.e, vf3Var.l(), i);
    }

    @Override // defpackage.mv3
    public final int g0(int i) {
        k91 t = this.j0.j0.t();
        tv3 E = t.E();
        vf3 vf3Var = (vf3) t.A;
        return E.g((m74) vf3Var.A0.e, vf3Var.l(), i);
    }

    @Override // defpackage.fs3
    public final int t0(ds2 ds2Var) {
        int i;
        ms3 ms3Var = this.j0.j0.B0.q;
        ms3Var.getClass();
        wf3 wf3Var = ms3Var.m0;
        if (!ms3Var.f0) {
            zf3 zf3Var = ms3Var.Y;
            if (zf3Var.d == rf3.LookaheadMeasuring) {
                wf3Var.f = true;
                if (wf3Var.b) {
                    zf3Var.f = true;
                    zf3Var.g = true;
                }
            } else {
                wf3Var.g = true;
            }
        }
        uz2 uz2Var = ms3Var.r().P0;
        if (uz2Var != null) {
            uz2Var.f0 = true;
        }
        ms3Var.v();
        uz2 uz2Var2 = ms3Var.r().P0;
        if (uz2Var2 != null) {
            uz2Var2.f0 = false;
        }
        Integer num = (Integer) wf3Var.i.get(ds2Var);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        this.o0.g(i, ds2Var);
        return i;
    }
}
