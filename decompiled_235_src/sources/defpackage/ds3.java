package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds3  reason: default package */
/* loaded from: classes.dex */
public final class ds3 implements js3 {
    public final d95 a;
    public final ls3 b;

    public ds3(d95 d95Var) {
        d95Var.getClass();
        this.a = d95Var;
        this.b = new ls3(d95Var.a, d95Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ds3) && nb3.k(this.a, ((ds3) obj).a)) {
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
        return "Failed(event=" + this.a + ")";
    }
}
