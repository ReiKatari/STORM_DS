package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u74  reason: default package */
/* loaded from: classes.dex */
public final class u74 extends t74 {
    public float a = RecyclerView.B1;
    public float b = RecyclerView.B1;
    public float c;
    public final /* synthetic */ MotionLayout d;

    public u74(MotionLayout motionLayout) {
        this.d = motionLayout;
    }

    @Override // defpackage.t74
    public final float a() {
        return this.d.s0;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.a;
        int i = (f2 > RecyclerView.B1 ? 1 : (f2 == RecyclerView.B1 ? 0 : -1));
        float f3 = this.c;
        MotionLayout motionLayout = this.d;
        if (i > 0) {
            float f4 = f2 / f3;
            if (f4 < f) {
                f = f4;
            }
            float f5 = f3 * f;
            motionLayout.s0 = f2 - f5;
            return ((f2 * f) - ((f5 * f) / 2.0f)) + this.b;
        }
        float f6 = (-f2) / f3;
        if (f6 < f) {
            f = f6;
        }
        float f7 = f3 * f;
        motionLayout.s0 = f7 + f2;
        return ((f7 * f) / 2.0f) + (f2 * f) + this.b;
    }
}
