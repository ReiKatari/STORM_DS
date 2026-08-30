package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f5491a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5492b;

    /* renamed from: c  reason: collision with root package name */
    public final float f5493c;

    /* renamed from: d  reason: collision with root package name */
    public final float f5494d;

    public z0(float f8, float f10, float f11, float f12) {
        this.f5491a = f8;
        this.f5492b = f10;
        this.f5493c = f11;
        this.f5494d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (!x4.f.b(this.f5491a, z0Var.f5491a) || !x4.f.b(this.f5492b, z0Var.f5492b) || !x4.f.b(this.f5493c, z0Var.f5493c)) {
                return false;
            }
            return x4.f.b(this.f5494d, z0Var.f5494d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5494d) + w.d.b(this.f5493c, w.d.b(this.f5492b, Float.hashCode(this.f5491a) * 31, 31), 31);
    }
}
