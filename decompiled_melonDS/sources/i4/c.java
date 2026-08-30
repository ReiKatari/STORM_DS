package i4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f6711a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6712b;

    public c(int i2, int i10) {
        this.f6711a = i2;
        this.f6712b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f6711a == cVar.f6711a && this.f6712b == cVar.f6712b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6712b) + (Integer.hashCode(this.f6711a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionInfo(rowCount=");
        sb2.append(this.f6711a);
        sb2.append(", columnCount=");
        return w.d.p(sb2, this.f6712b, ')');
    }
}
