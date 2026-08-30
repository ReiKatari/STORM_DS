package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e23  reason: default package */
/* loaded from: classes.dex */
public final class e23 extends dz3 {
    public final re7 a;

    public e23(re7 re7Var) {
        this.a = re7Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new g23(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e23)) {
            return false;
        }
        return b53.x(((e23) obj).a, this.a);
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        g23 g23Var = (g23) yy3Var;
        re7 re7Var = g23Var.l0;
        re7 re7Var2 = this.a;
        if (!b53.x(re7Var2, re7Var)) {
            g23Var.l0 = re7Var2;
            g23Var.S0();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
