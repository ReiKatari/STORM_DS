package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final float f2394a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2395b;

    public c(float f8, float f10) {
        this.f2394a = f8;
        this.f2395b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Float.compare(this.f2394a, cVar.f2394a) == 0 && Float.compare(this.f2395b, cVar.f2395b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2395b) + (Float.hashCode(this.f2394a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f2394a);
        sb2.append(", velocityCoefficient=");
        return w.d.o(sb2, this.f2395b, ')');
    }
}
