package a3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f148a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f149b;

    public c(int i2, ij.a aVar, Integer num) {
        this.f148a = i2;
        this.f149b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f148a == cVar.f148a && nc.k.a(null, null) && nc.k.a(this.f149b, cVar.f149b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 0;
        int hashCode = ((Integer.hashCode(this.f148a) * 31) + 0) * 31;
        Integer num = this.f149b;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f148a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f149b + ')';
    }
}
