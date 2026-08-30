package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10801c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10802d;

    public q(float f8, float f10) {
        super(1);
        this.f10801c = f8;
        this.f10802d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(this.f10801c, qVar.f10801c) == 0 && Float.compare(this.f10802d, qVar.f10802d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10802d) + (Float.hashCode(this.f10801c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f10801c);
        sb2.append(", y=");
        return w.d.o(sb2, this.f10802d, ')');
    }
}
