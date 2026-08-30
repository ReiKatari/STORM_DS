package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gh7  reason: default package */
/* loaded from: classes.dex */
public final class gh7 {
    public final String a;
    public final int b;

    public gh7(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh7)) {
            return false;
        }
        gh7 gh7Var = (gh7) obj;
        if (b53.x(this.a, gh7Var.a) && this.b == gh7Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return ej6.g(sb, this.b, ')');
    }
}
