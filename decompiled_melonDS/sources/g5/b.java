package g5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends h5.q {

    /* renamed from: a  reason: collision with root package name */
    public d5.o f5562a;

    /* renamed from: b  reason: collision with root package name */
    public d5.l f5563b;

    /* renamed from: c  reason: collision with root package name */
    public d5.n f5564c;

    @Override // h5.q
    public final float a() {
        return this.f5564c.b();
    }

    public final void b(float f8, float f10, float f11, float f12, float f13, float f14) {
        boolean z10;
        d5.o oVar = this.f5562a;
        this.f5564c = oVar;
        oVar.f3888l = f8;
        if (f8 > f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        oVar.f3887k = z10;
        if (z10) {
            oVar.d(-f11, f8 - f10, f13, f14, f12);
        } else {
            oVar.d(f11, f10 - f8, f13, f14, f12);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f8) {
        return this.f5564c.getInterpolation(f8);
    }
}
