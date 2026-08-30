package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ke2  reason: default package */
/* loaded from: classes.dex */
public final class ke2 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ke2) {
            if (this.a != ((ke2) obj).a) {
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
            return "Normal";
        }
        if (i == 1) {
            return "Italic";
        }
        return "Invalid";
    }
}
