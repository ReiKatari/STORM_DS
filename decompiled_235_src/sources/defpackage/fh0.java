package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fh0  reason: default package */
/* loaded from: classes.dex */
public final class fh0 {
    public final ci0 a;
    public final ov2 b;

    public fh0(ci0 ci0Var, ov2 ov2Var) {
        this.a = ci0Var;
        this.b = ov2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh0)) {
            return false;
        }
        fh0 fh0Var = (fh0) obj;
        if (this.a == fh0Var.a && this.b == fh0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ListenerWrapper(listener=" + this.a + ", executor=" + this.b + ')';
    }
}
