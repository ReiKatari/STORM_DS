package w4;

import i3.l0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a  reason: collision with root package name */
    public final l0 f14126a;

    /* renamed from: b  reason: collision with root package name */
    public final float f14127b;

    public b(l0 l0Var, float f8) {
        this.f14126a = l0Var;
        this.f14127b = f8;
    }

    @Override // w4.o
    public final float a() {
        return this.f14127b;
    }

    @Override // w4.o
    public final long b() {
        int i2 = i3.s.f6688i;
        return i3.s.f6687h;
    }

    @Override // w4.o
    public final i3.o c() {
        return this.f14126a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (nc.k.a(this.f14126a, bVar.f14126a) && Float.compare(this.f14127b, bVar.f14127b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14127b) + (this.f14126a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f14126a);
        sb2.append(", alpha=");
        return w.d.o(sb2, this.f14127b, ')');
    }
}
