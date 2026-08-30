package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uf6  reason: default package */
/* loaded from: classes.dex */
public final class uf6 {
    public final int a;

    public static String a(int i) {
        return wh1.g(i, "Stream-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uf6) {
            if (this.a != ((uf6) obj).a) {
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
