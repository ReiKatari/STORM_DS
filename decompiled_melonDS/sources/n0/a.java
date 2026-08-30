package n0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f9709a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9710b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9711c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9712d;

    public a(float f8, float f10, float f11, float f12) {
        this.f9709a = f8;
        this.f9710b = f10;
        this.f9711c = f11;
        this.f9712d = f12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.floatToIntBits(this.f9709a) == Float.floatToIntBits(aVar.f9709a) && Float.floatToIntBits(this.f9710b) == Float.floatToIntBits(aVar.f9710b) && Float.floatToIntBits(this.f9711c) == Float.floatToIntBits(aVar.f9711c) && Float.floatToIntBits(this.f9712d) == Float.floatToIntBits(aVar.f9712d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f9709a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f9710b)) * 1000003) ^ Float.floatToIntBits(this.f9711c)) * 1000003) ^ Float.floatToIntBits(this.f9712d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f9709a + ", maxZoomRatio=" + this.f9710b + ", minZoomRatio=" + this.f9711c + ", linearZoom=" + this.f9712d + "}";
    }
}
