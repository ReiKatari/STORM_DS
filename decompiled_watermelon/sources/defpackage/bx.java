package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bx  reason: default package */
/* loaded from: classes.dex */
public final class bx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bx(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof bx) {
                bx bxVar = (bx) obj;
                if (this.a.equals(bxVar.a) && this.b.equals(bxVar.b) && this.c.equals(bxVar.c) && this.d.equals(bxVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return b31.q(sb, this.d, "}");
    }
}
