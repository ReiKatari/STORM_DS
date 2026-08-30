package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iw5  reason: default package */
/* loaded from: classes.dex */
public final class iw5 extends dz3 {
    public final sw5 a;
    public final jf4 b;
    public final boolean c;
    public final boolean d;
    public final l14 e;

    public iw5(sw5 sw5Var, jf4 jf4Var, boolean z, boolean z2, l14 l14Var) {
        this.a = sw5Var;
        this.b = jf4Var;
        this.c = z;
        this.d = z2;
        this.e = l14Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new rw5(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iw5) {
                iw5 iw5Var = (iw5) obj;
                if (!b53.x(this.a, iw5Var.a) || this.b != iw5Var.b || this.c != iw5Var.c || this.d != iw5Var.d || !b53.x(this.e, iw5Var.e)) {
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
        ((rw5) yy3Var).m1(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final int hashCode() {
        int i;
        int c = ej6.c(ej6.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, this.c, 31), this.d, 961);
        l14 l14Var = this.e;
        if (l14Var != null) {
            i = l14Var.hashCode();
        } else {
            i = 0;
        }
        return (c + i) * 31;
    }
}
