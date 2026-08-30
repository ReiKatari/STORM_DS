package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kn6  reason: default package */
/* loaded from: classes.dex */
public final class kn6 {
    public final int a;

    public static String a(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        if (i == 0) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kn6) {
            if (this.a != ((kn6) obj).a) {
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
