package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: is3  reason: default package */
/* loaded from: classes.dex */
public final class is3 implements js3 {
    public final a95 a;
    public final ls3 b;

    public is3(a95 a95Var) {
        a95Var.getClass();
        this.a = a95Var;
        this.b = new ls3(a95Var.a, a95Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof is3) && nb3.k(this.a, ((is3) obj).a)) {
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
        return "Updated(event=" + this.a + ")";
    }
}
