package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e30  reason: default package */
/* loaded from: classes.dex */
public final class e30 extends dz3 {
    public final mi2 a;

    public e30(mi2 mi2Var) {
        this.a = mi2Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new f30(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e30)) {
            return false;
        }
        if (this.a == ((e30) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        m74 m74Var;
        f30 f30Var = (f30) yy3Var;
        mi2 mi2Var = this.a;
        f30Var.j0 = mi2Var;
        if (f30Var.A.i0 && (m74Var = l.N(f30Var, 2).m0) != null) {
            m74Var.x1(mi2Var, true);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
