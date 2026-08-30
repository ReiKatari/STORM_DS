package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final float f10829c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10830d;

    public y(float f8, float f10) {
        super(1);
        this.f10829c = f8;
        this.f10830d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (Float.compare(this.f10829c, yVar.f10829c) == 0 && Float.compare(this.f10830d, yVar.f10830d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10830d) + (Float.hashCode(this.f10829c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f10829c);
        sb2.append(", dy=");
        return w.d.o(sb2, this.f10830d, ')');
    }
}
