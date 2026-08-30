package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r43  reason: default package */
/* loaded from: classes.dex */
public final class r43 extends v43 {
    public u43 k0;
    public boolean l0;

    @Override // defpackage.v43, defpackage.mf3
    public final int H(fs3 fs3Var, mv3 mv3Var, int i) {
        if (this.k0 == u43.Min) {
            return mv3Var.g0(i);
        }
        return mv3Var.f(i);
    }

    @Override // defpackage.v43
    public final long R0(mv3 mv3Var, long j) {
        int f;
        if (this.k0 == u43.Min) {
            f = mv3Var.g0(lz0.h(j));
        } else {
            f = mv3Var.f(lz0.h(j));
        }
        if (f < 0) {
            f = 0;
        }
        if (f < 0) {
            oz2.a("height must be >= 0");
        }
        return nz0.h(0, Preference.DEFAULT_ORDER, f, f);
    }

    @Override // defpackage.v43
    public final boolean S0() {
        return this.l0;
    }

    @Override // defpackage.v43, defpackage.mf3
    public final int r(fs3 fs3Var, mv3 mv3Var, int i) {
        if (this.k0 == u43.Min) {
            return mv3Var.g0(i);
        }
        return mv3Var.f(i);
    }
}
