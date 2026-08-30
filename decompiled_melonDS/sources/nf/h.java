package nf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f10430a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10431b;

    /* renamed from: c  reason: collision with root package name */
    public final g f10432c;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public h(String str, String str2, g gVar) {
        str.getClass();
        str2.getClass();
        this.f10430a = str;
        this.f10431b = str2;
        this.f10432c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (!nc.k.a(this.f10430a, hVar.f10430a) || !nc.k.a(this.f10431b, hVar.f10431b) || !this.f10432c.equals(hVar.f10432c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10432c.hashCode() + w.d.d(this.f10430a.hashCode() * 31, 31, this.f10431b);
    }

    public final String toString() {
        StringBuilder k10 = kc.a.k("ScreenFoldDto(orientation=", this.f10430a, ", type=", this.f10431b, ", foldBounds=");
        k10.append(this.f10432c);
        k10.append(")");
        return k10.toString();
    }
}
