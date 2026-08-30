package a6;

import android.view.WindowInsetsAnimation;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n1 extends o1 {

    /* renamed from: e  reason: collision with root package name */
    public final WindowInsetsAnimation f494e;

    public n1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f494e = windowInsetsAnimation;
    }

    @Override // a6.o1
    public final float a() {
        float alpha;
        alpha = this.f494e.getAlpha();
        return alpha;
    }

    @Override // a6.o1
    public final long b() {
        long durationMillis;
        durationMillis = this.f494e.getDurationMillis();
        return durationMillis;
    }

    @Override // a6.o1
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.f494e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // a6.o1
    public final int d() {
        int typeMask;
        typeMask = this.f494e.getTypeMask();
        return typeMask;
    }

    @Override // a6.o1
    public final void e(float f8) {
        this.f494e.setFraction(f8);
    }
}
