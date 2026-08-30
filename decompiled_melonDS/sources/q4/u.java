package q4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u implements g {

    /* renamed from: a  reason: collision with root package name */
    public final int f12269a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12270b;

    public u(int i2, int i10) {
        this.f12269a = i2;
        this.f12270b = i10;
    }

    @Override // q4.g
    public final void a(com.google.android.material.datepicker.n nVar) {
        boolean z10;
        if (nVar.R != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        dk.a aVar = (dk.a) nVar.Y;
        if (z10) {
            nVar.R = -1;
            nVar.X = -1;
        }
        int g10 = p7.j.g(this.f12269a, 0, aVar.b());
        int g11 = p7.j.g(this.f12270b, 0, aVar.b());
        if (g10 != g11) {
            if (g10 < g11) {
                nVar.e(g10, g11);
            } else {
                nVar.e(g11, g10);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f12269a == uVar.f12269a && this.f12270b == uVar.f12270b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12269a * 31) + this.f12270b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f12269a);
        sb2.append(", end=");
        return w.d.p(sb2, this.f12270b, ')');
    }
}
