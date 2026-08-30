package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c03  reason: default package */
/* loaded from: classes.dex */
public final class c03 extends e03 {
    public final Integer a;
    public final int b;

    public c03(int i, Integer num) {
        this.a = num;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c03)) {
            return false;
        }
        c03 c03Var = (c03) obj;
        if (b53.x(this.a, c03Var.a) && this.b == c03Var.b) {
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
