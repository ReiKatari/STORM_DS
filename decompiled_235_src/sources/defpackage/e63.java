package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e63  reason: default package */
/* loaded from: classes.dex */
public final class e63 extends h63 {
    public final Integer a;
    public final int b;
    public final d63 c;

    public e63(Integer num, int i, d63 d63Var) {
        d63Var.getClass();
        this.a = num;
        this.b = i;
        this.c = d63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e63)) {
            return false;
        }
        e63 e63Var = (e63) obj;
        if (nb3.k(this.a, e63Var.a) && this.b == e63Var.b && this.c == e63Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return this.c.hashCode() + lb1.a(this.b, hashCode * 31, 31);
    }

    public final String toString() {
        return "Axis(deviceId=" + this.a + ", axisCode=" + this.b + ", direction=" + this.c + ")";
    }
}
