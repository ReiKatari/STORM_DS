package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu3  reason: default package */
/* loaded from: classes.dex */
public final class vu3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof vu3) {
            if (this.a != ((vu3) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        if (i == 2) {
            return "LineHeightStyle.Mode.Tight";
        }
        return "Invalid";
    }
}
