package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tn3  reason: default package */
/* loaded from: classes.dex */
public final class tn3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof tn3) {
            if (this.a != ((tn3) obj).a) {
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
