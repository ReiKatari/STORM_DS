package x8;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f14386a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14387b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14388c;

    public f(String str, int i2, int i10) {
        str.getClass();
        this.f14386a = str;
        this.f14387b = i2;
        this.f14388c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (nc.k.a(this.f14386a, fVar.f14386a) && this.f14387b == fVar.f14387b && this.f14388c == fVar.f14388c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14388c) + w.d.c(this.f14387b, this.f14386a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f14386a);
        sb2.append(", generation=");
        sb2.append(this.f14387b);
        sb2.append(", systemId=");
        return w.d.p(sb2, this.f14388c, ')');
    }
}
