package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jq6  reason: default package */
/* loaded from: classes.dex */
final class jq6 extends dz3 {
    public final ds6 a;

    public jq6(ds6 ds6Var) {
        this.a = ds6Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new kq6(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq6)) {
            return false;
        }
        return b53.x(this.a, ((jq6) obj).a);
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        kq6 kq6Var = (kq6) yy3Var;
        kq6Var.getClass();
        ds6 T = cg2.T(this.a, l.P(kq6Var).u0);
        kq6Var.R0(T, (od2) mh7.t(kq6Var, ov0.k));
        iq6 iq6Var = kq6Var.l0;
        if (iq6Var != null) {
            iq6.a(iq6Var, null, null, T, 23);
            hi2.D(kq6Var);
            return;
        }
        throw wh1.c("Min size state is not set.");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
