package x8;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f14391a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14392b;

    public i(String str, int i2) {
        str.getClass();
        this.f14391a = str;
        this.f14392b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (nc.k.a(this.f14391a, iVar.f14391a) && this.f14392b == iVar.f14392b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14392b) + (this.f14391a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f14391a);
        sb2.append(", generation=");
        return w.d.p(sb2, this.f14392b, ')');
    }
}
