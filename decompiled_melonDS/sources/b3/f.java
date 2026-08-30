package b3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final float f1763a;

    public f(float f8) {
        this.f1763a = f8;
    }

    public final int a(int i2, int i10, x4.m mVar) {
        float f8 = (i10 - i2) / 2.0f;
        x4.m mVar2 = x4.m.Ltr;
        float f10 = this.f1763a;
        if (mVar != mVar2) {
            f10 *= -1;
        }
        return Math.round((1 + f10) * f8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && Float.compare(this.f1763a, ((f) obj).f1763a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1763a);
    }

    public final String toString() {
        return w.d.o(new StringBuilder("Horizontal(bias="), this.f1763a, ')');
    }
}
