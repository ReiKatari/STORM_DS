package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fa5  reason: default package */
/* loaded from: classes.dex */
public final class fa5 {
    public final String a;
    public final long b;

    public fa5(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa5)) {
            return false;
        }
        fa5 fa5Var = (fa5) obj;
        if (nb3.k(this.a, fa5Var.a) && this.b == fa5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RAGameHashEntity(gameHash=" + this.a + ", gameId=" + this.b + ")";
    }
}
