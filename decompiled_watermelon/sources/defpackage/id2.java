package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: id2  reason: default package */
/* loaded from: classes.dex */
public final class id2 extends dz3 {
    public final l14 a;

    public id2(l14 l14Var) {
        this.a = l14Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new kd2(this.a, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id2)) {
            return false;
        }
        if (b53.x(this.a, ((id2) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((kd2) yy3Var).V0(this.a);
    }

    public final int hashCode() {
        l14 l14Var = this.a;
        if (l14Var != null) {
            return l14Var.hashCode();
        }
        return 0;
    }
}
