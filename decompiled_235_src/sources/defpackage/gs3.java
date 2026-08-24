package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs3  reason: default package */
/* loaded from: classes.dex */
public final class gs3 implements js3 {
    public final y85 a;
    public final ls3 b;

    public gs3(y85 y85Var) {
        y85Var.getClass();
        this.a = y85Var;
        this.b = new ls3(y85Var.a, y85Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gs3) && nb3.k(this.a, ((gs3) obj).a)) {
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
        return "Started(event=" + this.a + ")";
    }
}
