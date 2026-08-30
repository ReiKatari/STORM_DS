package mh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements h1.d {

    /* renamed from: b  reason: collision with root package name */
    public final float f9693b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9694c;

    public i(float f8, float f10) {
        this.f9693b = f8;
        this.f9694c = f10;
    }

    @Override // h1.d
    public final float a(float f8, float f10, float f11) {
        float f12 = f10 + f8;
        float f13 = this.f9693b;
        int i2 = (f8 > f13 ? 1 : (f8 == f13 ? 0 : -1));
        float f14 = this.f9694c;
        if (i2 >= 0 && f12 <= f11 - f14) {
            return 0.0f;
        }
        if (f8 < f13 && f12 > f11 - f14) {
            return 0.0f;
        }
        if (Math.abs(f8 + f13) < Math.abs(f12 - (f11 - f14))) {
            return f8 - f13;
        }
        return (f12 - f11) + f14;
    }
}
