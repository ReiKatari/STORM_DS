package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd0  reason: default package */
/* loaded from: classes.dex */
public final class qd0 {
    public final String a;

    public /* synthetic */ qd0(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return i61.k(')', "CameraBackendId(value=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qd0) {
            if (!nb3.k(this.a, ((qd0) obj).a)) {
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
