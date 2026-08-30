package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sz3  reason: default package */
/* loaded from: classes.dex */
public final class sz3 extends rz3 {
    public float a = RecyclerView.A1;
    public float b = RecyclerView.A1;
    public float c;
    public final /* synthetic */ MotionLayout d;

    public sz3(MotionLayout motionLayout) {
        this.d = motionLayout;
    }

    @Override // defpackage.rz3
    public final float a() {
        return this.d.r0;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.a;
        int i = (f2 > RecyclerView.A1 ? 1 : (f2 == RecyclerView.A1 ? 0 : -1));
        float f3 = this.c;
        MotionLayout motionLayout = this.d;
        if (i > 0) {
            float f4 = f2 / f3;
            if (f4 < f) {
                f = f4;
            }
            float f5 = f3 * f;
            motionLayout.r0 = f2 - f5;
            return ((f2 * f) - ((f5 * f) / 2.0f)) + this.b;
        }
        float f6 = (-f2) / f3;
        if (f6 < f) {
            f = f6;
        }
        float f7 = f3 * f;
        motionLayout.r0 = f7 + f2;
        return ((f7 * f) / 2.0f) + (f2 * f) + this.b;
    }
}
