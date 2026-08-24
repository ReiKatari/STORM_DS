package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yj0  reason: default package */
/* loaded from: classes.dex */
public final class yj0 {
    public qh1 a;
    public kk3 b;
    public xj0 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yj0) {
                yj0 yj0Var = (yj0) obj;
                if (!nb3.k(this.a, yj0Var.a) || this.b != yj0Var.b || !nb3.k(this.c, yj0Var.c) || !xi6.b(this.d, yj0Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Long.hashCode(this.d) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) xi6.g(this.d)) + ')';
    }
}
