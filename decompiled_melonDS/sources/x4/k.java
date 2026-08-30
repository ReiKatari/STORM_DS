package x4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final k f14341e = new k(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f14342a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14343b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14344c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14345d;

    public k(int i2, int i10, int i11, int i12) {
        this.f14342a = i2;
        this.f14343b = i10;
        this.f14344c = i11;
        this.f14345d = i12;
    }

    public final int a() {
        return this.f14345d - this.f14343b;
    }

    public final long b() {
        return (this.f14342a << 32) | (this.f14343b & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f14342a == kVar.f14342a && this.f14343b == kVar.f14343b && this.f14344c == kVar.f14344c && this.f14345d == kVar.f14345d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14345d) + w.d.c(this.f14344c, w.d.c(this.f14343b, Integer.hashCode(this.f14342a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f14342a);
        sb2.append(", ");
        sb2.append(this.f14343b);
        sb2.append(", ");
        sb2.append(this.f14344c);
        sb2.append(", ");
        return w.d.p(sb2, this.f14345d, ')');
    }
}
