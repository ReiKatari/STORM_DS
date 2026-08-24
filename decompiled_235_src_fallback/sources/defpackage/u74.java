package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u74  reason: default package */
/* loaded from: classes.dex */
public final class u74 extends defpackage.t74 {
    public float a;
    public float b;
    public float c;
    public final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout d;

    public u74(androidx.constraintlayout.motion.widget.MotionLayout r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r1 = 0
            r0.a = r1
            r0.b = r1
            return
    }

    @Override // defpackage.t74
    public final float a() {
            r0 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r0.d
            float r0 = r0.s0
            return r0
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r7) {
            r6 = this;
            float r0 = r6.a
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            float r2 = r6.c
            r3 = 1073741824(0x40000000, float:2.0)
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r6.d
            if (r1 <= 0) goto L21
            float r1 = r0 / r2
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 >= 0) goto L14
            r7 = r1
        L14:
            float r2 = r2 * r7
            float r1 = r0 - r2
            r4.s0 = r1
            float r0 = r0 * r7
            float r2 = r2 * r7
            float r2 = r2 / r3
            float r0 = r0 - r2
            float r6 = r6.b
            float r0 = r0 + r6
            return r0
        L21:
            float r1 = -r0
            float r1 = r1 / r2
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 >= 0) goto L28
            r7 = r1
        L28:
            float r2 = r2 * r7
            float r1 = r2 + r0
            r4.s0 = r1
            float r0 = r0 * r7
            float r2 = r2 * r7
            float r2 = r2 / r3
            float r2 = r2 + r0
            float r6 = r6.b
            float r2 = r2 + r6
            return r2
    }
}
