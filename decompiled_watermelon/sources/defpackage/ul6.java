package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ul6  reason: default package */
/* loaded from: classes.dex */
public final class ul6 extends dz3 {
    public final mi2 a;

    public ul6(mi2 mi2Var) {
        this.a = mi2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [vl6, yy3, g23] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? g23Var = new g23(tq5.p);
        g23Var.m0 = this.a;
        return g23Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ul6) {
                if (this.a == ((ul6) obj).a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        vl6 vl6Var = (vl6) yy3Var;
        mi2 mi2Var = vl6Var.m0;
        mi2 mi2Var2 = this.a;
        if (mi2Var != mi2Var2) {
            vl6Var.m0 = mi2Var2;
            dg7 dg7Var = vl6Var.n0;
            if (dg7Var != null) {
                re7 re7Var = (re7) mi2Var2.n(dg7Var);
                if (!b53.x(re7Var, vl6Var.l0)) {
                    vl6Var.l0 = re7Var;
                    vl6Var.S0();
                }
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
