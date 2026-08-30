package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class a {
    public float a = Float.NaN;
    public float b = Float.NaN;
    public int c = -1;
    public int d = -1;
    public final /* synthetic */ MotionLayout e;

    public a(MotionLayout motionLayout) {
        this.e = motionLayout;
    }

    public final void a() {
        int i = this.c;
        MotionLayout motionLayout = this.e;
        if (i != -1 || this.d != -1) {
            int i2 = this.d;
            if (i == -1) {
                motionLayout.z(i2);
            } else if (i2 == -1) {
                motionLayout.w(i);
            } else {
                motionLayout.x(i, i2);
            }
            motionLayout.setState(MotionLayout.a.SETUP);
        }
        boolean isNaN = Float.isNaN(this.b);
        float f = this.a;
        if (isNaN) {
            if (Float.isNaN(f)) {
                return;
            }
            motionLayout.setProgress(this.a);
            return;
        }
        float f2 = this.b;
        if (!motionLayout.isAttachedToWindow()) {
            if (motionLayout.i1 == null) {
                motionLayout.i1 = new a(motionLayout);
            }
            a aVar = motionLayout.i1;
            aVar.a = f;
            aVar.b = f2;
        } else {
            motionLayout.setProgress(f);
            motionLayout.setState(MotionLayout.a.MOVING);
            motionLayout.r0 = f2;
            float f3 = RecyclerView.A1;
            int i3 = (f2 > RecyclerView.A1 ? 1 : (f2 == RecyclerView.A1 ? 0 : -1));
            if (i3 != 0) {
                if (i3 > 0) {
                    f3 = 1.0f;
                }
                motionLayout.p(f3);
            } else if (f != RecyclerView.A1 && f != 1.0f) {
                if (f > 0.5f) {
                    f3 = 1.0f;
                }
                motionLayout.p(f3);
            }
        }
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = -1;
        this.d = -1;
    }
}
