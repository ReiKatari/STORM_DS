package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xp4  reason: default package */
/* loaded from: classes.dex */
public final class xp4 {
    public final int a;

    public static String a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "Unknown";
                    }
                    return "Eraser";
                }
                return "Stylus";
            }
            return "Mouse";
        }
        return "Touch";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xp4) {
            if (this.a != ((xp4) obj).a) {
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
        return a(this.a);
    }
}
