package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ib0  reason: default package */
/* loaded from: classes.dex */
public final class ib0 {
    public final String a;

    public /* synthetic */ ib0(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return b31.n(')', "CameraBackendId(value=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ib0) {
            if (!b53.x(this.a, ((ib0) obj).a)) {
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
        return a(this.a);
    }
}
