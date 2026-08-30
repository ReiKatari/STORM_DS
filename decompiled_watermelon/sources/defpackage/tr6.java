package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tr6  reason: default package */
/* loaded from: classes.dex */
public final class tr6 {
    public static final tr6 c = new tr6(2, false);
    public static final tr6 d = new tr6(1, true);
    public final int a;
    public final boolean b;

    public tr6(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr6)) {
            return false;
        }
        tr6 tr6Var = (tr6) obj;
        if (this.a == tr6Var.a && this.b == tr6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return "TextMotion.Static";
        }
        if (equals(d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
