package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final float f274a;

    /* renamed from: b  reason: collision with root package name */
    public final float f275b;

    /* renamed from: c  reason: collision with root package name */
    public final float f276c;

    /* renamed from: d  reason: collision with root package name */
    public final float f277d;

    public o(float f8, float f10, float f11, float f12) {
        this.f274a = f8;
        this.f275b = f10;
        this.f276c = f11;
        this.f277d = f12;
        if (f8 < 0.0f) {
            x3.a.a("Left must be non-negative");
        }
        if (f10 < 0.0f) {
            x3.a.a("Top must be non-negative");
        }
        if (f11 < 0.0f) {
            x3.a.a("Right must be non-negative");
        }
        if (f12 >= 0.0f) {
            return;
        }
        x3.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (x4.f.b(this.f274a, oVar.f274a) && x4.f.b(this.f275b, oVar.f275b) && x4.f.b(this.f276c, oVar.f276c) && x4.f.b(this.f277d, oVar.f277d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + w.d.b(this.f277d, w.d.b(this.f276c, w.d.b(this.f275b, Float.hashCode(this.f274a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) x4.f.c(this.f274a)) + ", top=" + ((Object) x4.f.c(this.f275b)) + ", end=" + ((Object) x4.f.c(this.f276c)) + ", bottom=" + ((Object) x4.f.c(this.f277d)) + ", isLayoutDirectionAware=true)";
    }
}
