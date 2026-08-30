package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: od0  reason: default package */
/* loaded from: classes.dex */
public final class od0 {
    public final String a;

    public /* synthetic */ od0(String str) {
        this.a = str;
    }

    public static void a(String str) {
        str.getClass();
        if (!zg6.B0(str)) {
            return;
        }
        i.i("CameraId cannot be null or blank!");
    }

    public static String b(String str) {
        return b31.p("CameraId-", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof od0) {
            if (!b53.x(this.a, ((od0) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
