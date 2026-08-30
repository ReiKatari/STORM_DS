package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10791c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10792d;

    public n(float f8, float f10) {
        super(3);
        this.f10791c = f8;
        this.f10792d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (Float.compare(this.f10791c, nVar.f10791c) == 0 && Float.compare(this.f10792d, nVar.f10792d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10792d) + (Float.hashCode(this.f10791c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f10791c);
        sb2.append(", y=");
        return w.d.o(sb2, this.f10792d, ')');
    }
}
