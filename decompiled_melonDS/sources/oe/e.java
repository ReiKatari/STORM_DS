package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final d f10920a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10921b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10922c;

    public e(d dVar, float f8, String str) {
        dVar.getClass();
        this.f10920a = dVar;
        this.f10921b = f8;
        this.f10922c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f10920a == eVar.f10920a && Float.compare(this.f10921b, eVar.f10921b) == 0 && nc.k.a(this.f10922c, eVar.f10922c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = w.d.b(this.f10921b, this.f10920a.hashCode() * 31, 31);
        String str = this.f10922c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return b10 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheatImportProgress(status=");
        sb2.append(this.f10920a);
        sb2.append(", progress=");
        sb2.append(this.f10921b);
        sb2.append(", ongoingItemName=");
        return w.d.s(sb2, this.f10922c, ")");
    }
}
