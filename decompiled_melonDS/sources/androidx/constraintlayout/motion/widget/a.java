package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.MotionLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public float f1104a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    public float f1105b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    public int f1106c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f1107d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MotionLayout f1108e;

    public a(MotionLayout motionLayout) {
        this.f1108e = motionLayout;
    }

    public final void a() {
        int i2 = this.f1106c;
        MotionLayout motionLayout = this.f1108e;
        if (i2 != -1 || this.f1107d != -1) {
            int i10 = this.f1107d;
            if (i2 == -1) {
                motionLayout.z(i10);
            } else if (i10 == -1) {
                motionLayout.w(i2);
            } else {
                motionLayout.x(i2, i10);
            }
            motionLayout.setState(MotionLayout.a.SETUP);
        }
        boolean isNaN = Float.isNaN(this.f1105b);
        float f8 = this.f1104a;
        if (isNaN) {
            if (Float.isNaN(f8)) {
                return;
            }
            motionLayout.setProgress(this.f1104a);
            return;
        }
        float f10 = this.f1105b;
        if (!motionLayout.isAttachedToWindow()) {
            if (motionLayout.f1082h1 == null) {
                motionLayout.f1082h1 = new a(motionLayout);
            }
            a aVar = motionLayout.f1082h1;
            aVar.f1104a = f8;
            aVar.f1105b = f10;
        } else {
            motionLayout.setProgress(f8);
            motionLayout.setState(MotionLayout.a.MOVING);
            motionLayout.f1093q0 = f10;
            float f11 = 0.0f;
            int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (i11 > 0) {
                    f11 = 1.0f;
                }
                motionLayout.p(f11);
            } else if (f8 != 0.0f && f8 != 1.0f) {
                if (f8 > 0.5f) {
                    f11 = 1.0f;
                }
                motionLayout.p(f11);
            }
        }
        this.f1104a = Float.NaN;
        this.f1105b = Float.NaN;
        this.f1106c = -1;
        this.f1107d = -1;
    }
}
