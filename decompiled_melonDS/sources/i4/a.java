package i4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f6707a;

    /* renamed from: b  reason: collision with root package name */
    public final yb.d f6708b;

    public a(String str, yb.d dVar) {
        this.f6707a = str;
        this.f6708b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (nc.k.a(this.f6707a, aVar.f6707a) && nc.k.a(this.f6708b, aVar.f6708b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i10 = 0;
        String str = this.f6707a;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = i2 * 31;
        yb.d dVar = this.f6708b;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f6707a + ", action=" + this.f6708b + ')';
    }
}
