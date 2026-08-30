package p4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final p f11317a;

    /* renamed from: b  reason: collision with root package name */
    public final j f11318b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11319c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11320d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f11321e;

    public q(p pVar, j jVar, int i2, int i10, Object obj) {
        this.f11317a = pVar;
        this.f11318b = jVar;
        this.f11319c = i2;
        this.f11320d = i10;
        this.f11321e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (nc.k.a(this.f11317a, qVar.f11317a) && nc.k.a(this.f11318b, qVar.f11318b) && this.f11319c == qVar.f11319c && this.f11320d == qVar.f11320d && nc.k.a(this.f11321e, qVar.f11321e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2 = 0;
        p pVar = this.f11317a;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        int c4 = w.d.c(this.f11320d, w.d.c(this.f11319c, ((hashCode * 31) + this.f11318b.A) * 31, 31), 31);
        Object obj = this.f11321e;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return c4 + i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f11317a);
        sb2.append(", fontWeight=");
        sb2.append(this.f11318b);
        sb2.append(", fontStyle=");
        String str2 = "Invalid";
        int i2 = this.f11319c;
        if (i2 == 0) {
            str = "Normal";
        } else if (i2 != 1) {
            str = "Invalid";
        } else {
            str = "Italic";
        }
        sb2.append((Object) str);
        sb2.append(", fontSynthesis=");
        int i10 = this.f11320d;
        if (i10 == 0) {
            str2 = "None";
        } else if (i10 == 1) {
            str2 = "Weight";
        } else if (i10 == 2) {
            str2 = "Style";
        } else if (i10 == 65535) {
            str2 = "All";
        }
        sb2.append((Object) str2);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f11321e);
        sb2.append(')');
        return sb2.toString();
    }
}
