package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b03  reason: default package */
/* loaded from: classes.dex */
public final class b03 extends e03 {
    public final Integer a;
    public final int b;
    public final a03 c;

    public b03(Integer num, int i, a03 a03Var) {
        a03Var.getClass();
        this.a = num;
        this.b = i;
        this.c = a03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b03)) {
            return false;
        }
        b03 b03Var = (b03) obj;
        if (b53.x(this.a, b03Var.a) && this.b == b03Var.b && this.c == b03Var.c) {
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
        return this.c.hashCode() + wh1.a(this.b, hashCode * 31, 31);
    }

    public final String toString() {
        return "Axis(deviceId=" + this.a + ", axisCode=" + this.b + ", direction=" + this.c + ")";
    }
}
