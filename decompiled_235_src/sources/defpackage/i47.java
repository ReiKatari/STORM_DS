package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i47  reason: default package */
/* loaded from: classes.dex */
public final class i47 {
    public static final i47 c = new i47(2, false);
    public static final i47 d = new i47(1, true);
    public final int a;
    public final boolean b;

    public i47(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i47)) {
            return false;
        }
        i47 i47Var = (i47) obj;
        if (this.a == i47Var.a && this.b == i47Var.b) {
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
