package t0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f13041a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13042b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13043c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13044d;

    public a(String str, String str2, String str3, String str4) {
        this.f13041a = str;
        this.f13042b = str2;
        this.f13043c = str3;
        this.f13044d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13041a.equals(aVar.f13041a) && this.f13042b.equals(aVar.f13042b) && this.f13043c.equals(aVar.f13043c) && this.f13044d.equals(aVar.f13044d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.f13041a.hashCode() ^ 1000003) * 1000003) ^ this.f13042b.hashCode()) * 1000003) ^ this.f13043c.hashCode()) * 1000003) ^ this.f13044d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb2.append(this.f13041a);
        sb2.append(", eglVersion=");
        sb2.append(this.f13042b);
        sb2.append(", glExtensions=");
        sb2.append(this.f13043c);
        sb2.append(", eglExtensions=");
        return w.d.s(sb2, this.f13044d, "}");
    }
}
