package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w1  reason: default package */
/* loaded from: classes.dex */
public final class w1 {
    public final String a;
    public final wi2 b;

    public w1(String str, wi2 wi2Var) {
        this.a = str;
        this.b = wi2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        if (b53.x(this.a, w1Var.a) && b53.x(this.b, w1Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        wi2 wi2Var = this.b;
        if (wi2Var != null) {
            i2 = wi2Var.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
