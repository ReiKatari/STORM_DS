package w3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f14114a;

    /* renamed from: b  reason: collision with root package name */
    public float f14115b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f14114a == aVar.f14114a && Float.compare(this.f14115b, aVar.f14115b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14115b) + (Long.hashCode(this.f14114a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f14114a);
        sb2.append(", dataPoint=");
        return w.d.o(sb2, this.f14115b, ')');
    }
}
