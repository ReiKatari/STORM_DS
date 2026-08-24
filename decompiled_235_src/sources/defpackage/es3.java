package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: es3  reason: default package */
/* loaded from: classes.dex */
public final class es3 implements js3 {
    public final z85 a;
    public final ls3 b;

    public es3(z85 z85Var) {
        z85Var.getClass();
        this.a = z85Var;
        this.b = new ls3(z85Var.a, z85Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof es3) && nb3.k(this.a, ((es3) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.js3
    public final ls3 getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Pending(event=" + this.a + ")";
    }
}
