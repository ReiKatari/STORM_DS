package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf0  reason: default package */
/* loaded from: classes.dex */
public final class xf0 {
    public final String a;

    public /* synthetic */ xf0(String str) {
        this.a = str;
    }

    public static void a(String str) {
        str.getClass();
        if (!qs6.v0(str)) {
            return;
        }
        i.h("CameraId cannot be null or blank!");
    }

    public static String b(String str) {
        return i61.m("CameraId-", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xf0) {
            if (!nb3.k(this.a, ((xf0) obj).a)) {
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
