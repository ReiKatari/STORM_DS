package q4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements g {

    /* renamed from: a  reason: collision with root package name */
    public final int f12273a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12274b;

    public w(int i2, int i10) {
        this.f12273a = i2;
        this.f12274b = i10;
    }

    @Override // q4.g
    public final void a(com.google.android.material.datepicker.n nVar) {
        int g10 = p7.j.g(this.f12273a, 0, ((dk.a) nVar.Y).b());
        int g11 = p7.j.g(this.f12274b, 0, ((dk.a) nVar.Y).b());
        if (g10 < g11) {
            nVar.f(g10, g11);
        } else {
            nVar.f(g11, g10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f12273a == wVar.f12273a && this.f12274b == wVar.f12274b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12273a * 31) + this.f12274b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f12273a);
        sb2.append(", end=");
        return w.d.p(sb2, this.f12274b, ')');
    }
}
