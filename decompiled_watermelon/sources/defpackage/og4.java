package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: og4  reason: default package */
/* loaded from: classes.dex */
public final class og4 {
    public final int a;

    public static String a(int i) {
        return ej6.e("MirrorMode(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof og4) {
            if (this.a != ((og4) obj).a) {
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
