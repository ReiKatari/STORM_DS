package h5;

import androidx.constraintlayout.motion.widget.MotionLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends q {

    /* renamed from: a  reason: collision with root package name */
    public float f6235a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f6236b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f6237c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MotionLayout f6238d;

    public s(MotionLayout motionLayout) {
        this.f6238d = motionLayout;
    }

    @Override // h5.q
    public final float a() {
        return this.f6238d.f1093q0;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f8) {
        float f10 = this.f6235a;
        int i2 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        float f11 = this.f6237c;
        MotionLayout motionLayout = this.f6238d;
        if (i2 > 0) {
            float f12 = f10 / f11;
            if (f12 < f8) {
                f8 = f12;
            }
            float f13 = f11 * f8;
            motionLayout.f1093q0 = f10 - f13;
            return ((f10 * f8) - ((f13 * f8) / 2.0f)) + this.f6236b;
        }
        float f14 = (-f10) / f11;
        if (f14 < f8) {
            f8 = f14;
        }
        float f15 = f11 * f8;
        motionLayout.f1093q0 = f15 + f10;
        return ((f15 * f8) / 2.0f) + (f10 * f8) + this.f6236b;
    }
}
