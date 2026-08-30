package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jb5  reason: default package */
/* loaded from: classes.dex */
public final class jb5 {
    public final int a;

    public static final String a(int i) {
        switch (i) {
            case 1:
                return "TEMPLATE_PREVIEW";
            case 2:
                return "TEMPLATE_STILL_CAPTURE";
            case 3:
                return "TEMPLATE_RECORD";
            case 4:
                return "TEMPLATE_VIDEO_SNAPSHOT";
            case 5:
                return "TEMPLATE_ZERO_SHUTTER_LAG";
            case ig7.b /* 6 */:
                return "TEMPLATE_MANUAL";
            default:
                return wh1.g(i, "UNKNOWN-");
        }
    }

    public static String b(int i) {
        return ej6.e("RequestTemplate(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jb5) {
            if (this.a != ((jb5) obj).a) {
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
        return b(this.a);
    }
}
