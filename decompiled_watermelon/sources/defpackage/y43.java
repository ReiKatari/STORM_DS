package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y43  reason: default package */
/* loaded from: classes.dex */
public final class y43 extends v43 {
    public u43 k0;
    public boolean l0;

    @Override // defpackage.v43
    public final long R0(mv3 mv3Var, long j) {
        int e0;
        if (this.k0 == u43.Min) {
            e0 = mv3Var.T(lz0.g(j));
        } else {
            e0 = mv3Var.e0(lz0.g(j));
        }
        if (e0 < 0) {
            e0 = 0;
        }
        if (e0 < 0) {
            oz2.a("width must be >= 0");
        }
        return nz0.h(e0, e0, 0, Preference.DEFAULT_ORDER);
    }

    @Override // defpackage.v43
    public final boolean S0() {
        return this.l0;
    }

    @Override // defpackage.v43, defpackage.mf3
    public final int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        if (this.k0 == u43.Min) {
            return mv3Var.T(i);
        }
        return mv3Var.e0(i);
    }

    @Override // defpackage.v43, defpackage.mf3
    public final int h(fs3 fs3Var, mv3 mv3Var, int i) {
        if (this.k0 == u43.Min) {
            return mv3Var.T(i);
        }
        return mv3Var.e0(i);
    }
}
