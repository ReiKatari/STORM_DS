package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c73  reason: default package */
/* loaded from: classes.dex */
public final class c73 {
    public float a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c73) {
                c73 c73Var = (c73) obj;
                if (Float.compare(this.a, c73Var.a) != 0 || this.b != c73Var.b) {
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
