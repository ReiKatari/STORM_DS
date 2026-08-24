package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y1  reason: default package */
/* loaded from: classes.dex */
public final class y1 {
    public final String a;
    public final ao2 b;

    public y1(String str, ao2 ao2Var) {
        this.a = str;
        this.b = ao2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        if (nb3.k(this.a, y1Var.a) && nb3.k(this.b, y1Var.b)) {
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
        ao2 ao2Var = this.b;
        if (ao2Var != null) {
            i2 = ao2Var.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
