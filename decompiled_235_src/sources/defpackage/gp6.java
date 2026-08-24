package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gp6  reason: default package */
/* loaded from: classes.dex */
public final class gp6 implements to {
    public final to a;
    public final long b;

    public gp6(rc2 rc2Var, long j) {
        this.a = rc2Var;
        this.b = j;
    }

    @Override // defpackage.to
    public final il7 a(wc7 wc7Var) {
        return new hp6(this.a.a(wc7Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gp6)) {
            return false;
        }
        gp6 gp6Var = (gp6) obj;
        if (gp6Var.b != this.b || !nb3.k(gp6Var.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
