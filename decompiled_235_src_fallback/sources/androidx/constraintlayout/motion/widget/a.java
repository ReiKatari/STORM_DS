package androidx.constraintlayout.motion.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a {
    public float a;
    public float b;
    public int c;
    public int d;
    public final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout e;

    public a(androidx.constraintlayout.motion.widget.MotionLayout r1) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.a = r1
            r0.b = r1
            r1 = -1
            r0.c = r1
            r0.d = r1
            return
    }

    public final void a() {
            r6 = this;
            int r0 = r6.c
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r6.e
            r2 = -1
            if (r0 != r2) goto Lb
            int r3 = r6.d
            if (r3 == r2) goto L21
        Lb:
            int r3 = r6.d
            if (r0 != r2) goto L13
            r1.z(r3)
            goto L1c
        L13:
            if (r3 != r2) goto L19
            r1.w(r0)
            goto L1c
        L19:
            r1.x(r0, r3)
        L1c:
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.SETUP
            r1.setState(r0)
        L21:
            float r0 = r6.b
            boolean r0 = java.lang.Float.isNaN(r0)
            float r3 = r6.a
            if (r0 == 0) goto L38
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto L32
            return
        L32:
            float r6 = r6.a
            r1.setProgress(r6)
            return
        L38:
            float r0 = r6.b
            boolean r4 = r1.isAttachedToWindow()
            if (r4 != 0) goto L52
            androidx.constraintlayout.motion.widget.a r4 = r1.j1
            if (r4 != 0) goto L4b
            androidx.constraintlayout.motion.widget.a r4 = new androidx.constraintlayout.motion.widget.a
            r4.<init>(r1)
            r1.j1 = r4
        L4b:
            androidx.constraintlayout.motion.widget.a r1 = r1.j1
            r1.a = r3
            r1.b = r0
            goto L7c
        L52:
            r1.setProgress(r3)
            androidx.constraintlayout.motion.widget.MotionLayout$a r4 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r1.setState(r4)
            r1.s0 = r0
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L6a
            if (r0 <= 0) goto L66
            r4 = r5
        L66:
            r1.p(r4)
            goto L7c
        L6a:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 == 0) goto L7c
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L7c
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L79
            r4 = r5
        L79:
            r1.p(r4)
        L7c:
            r0 = 2143289344(0x7fc00000, float:NaN)
            r6.a = r0
            r6.b = r0
            r6.c = r2
            r6.d = r2
            return
    }
}
