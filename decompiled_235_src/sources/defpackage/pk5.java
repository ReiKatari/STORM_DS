package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk5  reason: default package */
/* loaded from: classes.dex */
public final class pk5 extends lh0 {
    public final n8 a;

    public pk5(n8 n8Var) {
        n8Var.getClass();
        this.a = n8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pk5) && nb3.k(this.a, ((pk5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestClose(activeCamera=" + this.a + ')';
    }
}
