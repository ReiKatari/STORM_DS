package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qi3  reason: default package */
/* loaded from: classes.dex */
public final class qi3 extends dz3 {
    public final vi3 a;
    public final l50 b;
    public final jf4 c;

    public qi3(vi3 vi3Var, l50 l50Var, jf4 jf4Var) {
        this.a = vi3Var;
        this.b = l50Var;
        this.c = jf4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, ui3] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        yy3Var.l0 = this.c;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qi3) {
                qi3 qi3Var = (qi3) obj;
                if (!b53.x(this.a, qi3Var.a) || !b53.x(this.b, qi3Var.b) || this.c != qi3Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ui3 ui3Var = (ui3) yy3Var;
        ui3Var.j0 = this.a;
        ui3Var.k0 = this.b;
        ui3Var.l0 = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, false, 31);
    }
}
