package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: in  reason: default package */
/* loaded from: classes.dex */
public final class in<S> extends dz3 {
    public final ax6 a;
    public final k24 b;
    public final mn c;

    public in(ax6 ax6Var, k24 k24Var, mn mnVar) {
        this.a = ax6Var;
        this.b = k24Var;
        this.c = mnVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ln, yy3, v43] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? v43Var = new v43(1);
        v43Var.k0 = this.a;
        v43Var.l0 = this.b;
        v43Var.m0 = this.c;
        v43Var.n0 = -9223372034707292160L;
        return v43Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof in) {
            in inVar = (in) obj;
            if (b53.x(inVar.a, this.a) && inVar.b.equals(this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ln lnVar = (ln) yy3Var;
        lnVar.k0 = this.a;
        lnVar.l0 = this.b;
        lnVar.m0 = this.c;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        ax6 ax6Var = this.a;
        if (ax6Var != null) {
            i = ax6Var.hashCode();
        } else {
            i = 0;
        }
        return this.b.hashCode() + ((hashCode + i) * 31);
    }
}
