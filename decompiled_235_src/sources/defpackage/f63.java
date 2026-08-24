package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f63  reason: default package */
/* loaded from: classes.dex */
public final class f63 extends h63 {
    public final Integer a;
    public final int b;

    public f63(int i, Integer num) {
        this.a = num;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f63)) {
            return false;
        }
        f63 f63Var = (f63) obj;
        if (nb3.k(this.a, f63Var.a) && this.b == f63Var.b) {
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
        return Integer.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "Key(deviceId=" + this.a + ", keyCode=" + this.b + ")";
    }
}
