package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cs3  reason: default package */
/* loaded from: classes.dex */
public final class cs3 implements js3 {
    public final w85 a;
    public final ls3 b;

    public cs3(w85 w85Var) {
        w85Var.getClass();
        this.a = w85Var;
        this.b = new ls3(w85Var.a, w85Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cs3) && nb3.k(this.a, ((cs3) obj).a)) {
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
        return "Canceled(event=" + this.a + ")";
    }
}
