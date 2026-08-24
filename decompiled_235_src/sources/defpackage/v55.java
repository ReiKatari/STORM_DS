package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v55  reason: default package */
/* loaded from: classes.dex */
public final class v55 implements w55 {
    public final n8 a;
    public final jb4 b;

    public v55(n8 n8Var, jb4 jb4Var) {
        this.a = n8Var;
        this.b = jb4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v55)) {
            return false;
        }
        v55 v55Var = (v55) obj;
        if (this.a == v55Var.a && this.b == v55Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(activeCamera=" + this.a + ", token=" + this.b + ')';
    }
}
