package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c94  reason: default package */
/* loaded from: classes.dex */
public final class c94 {
    public final int a;
    public final Integer b;

    public c94(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c94)) {
            return false;
        }
        c94 c94Var = (c94) obj;
        if (this.a == c94Var.a && b53.x(this.b, c94Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ')';
    }
}
