package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y03  reason: default package */
/* loaded from: classes.dex */
public final class y03 {
    public float a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y03) {
                y03 y03Var = (y03) obj;
                if (Float.compare(this.a, y03Var.a) != 0 || this.b != y03Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        float f = this.a;
        boolean z = this.b;
        return "AxisState(value=" + f + ", active=" + z + ")";
    }
}
