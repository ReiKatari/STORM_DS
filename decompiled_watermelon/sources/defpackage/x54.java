package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x54  reason: default package */
/* loaded from: classes.dex */
public final class x54 extends dz3 {
    public final u54 a;

    public x54(u54 u54Var) {
        this.a = u54Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new a64(this.a, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x54) || !b53.x(((x54) obj).a, this.a)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        a64 a64Var = (a64) yy3Var;
        a64Var.j0 = this.a;
        q9 q9Var = a64Var.k0;
        if (((a64) q9Var.B) == a64Var) {
            q9Var.B = null;
        }
        q9 q9Var2 = new q9(14);
        a64Var.k0 = q9Var2;
        if (a64Var.i0) {
            q9Var2.B = a64Var;
            q9Var2.L = null;
            a64Var.l0 = null;
            q9Var2.R = new dj(14, a64Var);
            q9Var2.X = a64Var.F0();
        }
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
