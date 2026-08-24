package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xp7  reason: default package */
/* loaded from: classes.dex */
public final class xp7 {
    public final int a;
    public final int b;
    public final defpackage.m74 c;
    public final int d;
    public final defpackage.ng3 e;
    public final defpackage.pa f;
    public final android.view.animation.Interpolator g;
    public boolean h;
    public float i;
    public float j;
    public long k;
    public final android.graphics.Rect l;
    public final boolean m;

    public xp7(defpackage.pa r3, defpackage.m74 r4, int r5, int r6, int r7, android.view.animation.Interpolator r8, int r9, int r10) {
            r2 = this;
            r2.<init>()
            ng3 r0 = new ng3
            r1 = 0
            r0.<init>(r1)
            r2.e = r0
            r2.h = r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.l = r0
            r2.m = r1
            r2.f = r3
            r2.c = r4
            r2.d = r6
            long r0 = java.lang.System.nanoTime()
            r2.k = r0
            java.lang.Object r4 = r3.Y
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L2f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.Y = r4
        L2f:
            java.lang.Object r3 = r3.Y
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r2)
            r2.g = r8
            r2.a = r9
            r2.b = r10
            r3 = 3
            if (r7 != r3) goto L42
            r3 = 1
            r2.m = r3
        L42:
            if (r5 != 0) goto L48
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L4c
        L48:
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = (float) r5
            float r3 = r3 / r4
        L4c:
            r2.j = r3
            r2.a()
            return
    }

    public final void a() {
            r15 = this;
            boolean r0 = r15.h
            r1 = 0
            int r2 = r15.b
            int r3 = r15.a
            android.view.animation.Interpolator r4 = r15.g
            r5 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            r7 = -1
            m74 r8 = r15.c
            pa r14 = r15.f
            if (r0 == 0) goto L77
            long r10 = java.lang.System.nanoTime()
            long r12 = r15.k
            long r12 = r10 - r12
            r15.k = r10
            float r0 = r15.i
            double r12 = (double) r12
            double r12 = r12 * r5
            float r5 = (float) r12
            float r6 = r15.j
            float r5 = r5 * r6
            float r0 = r0 - r5
            r15.i = r0
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L31
            r15.i = r5
        L31:
            float r0 = r15.i
            if (r4 != 0) goto L37
        L35:
            r9 = r0
            goto L3c
        L37:
            float r0 = r4.getInterpolation(r0)
            goto L35
        L3c:
            android.view.View r13 = r8.b
            ng3 r12 = r15.e
            boolean r0 = r8.d(r9, r10, r12, r13)
            float r4 = r15.i
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L67
            if (r3 == r7) goto L59
            android.view.View r4 = r8.b
            long r9 = java.lang.System.nanoTime()
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r4.setTag(r3, r6)
        L59:
            if (r2 == r7) goto L60
            android.view.View r3 = r8.b
            r3.setTag(r2, r1)
        L60:
            java.lang.Object r1 = r14.Z
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r15)
        L67:
            float r15 = r15.i
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 > 0) goto L6f
            if (r0 == 0) goto Ld7
        L6f:
            java.lang.Object r15 = r14.B
            androidx.constraintlayout.motion.widget.MotionLayout r15 = (androidx.constraintlayout.motion.widget.MotionLayout) r15
            r15.invalidate()
            return
        L77:
            long r10 = java.lang.System.nanoTime()
            long r12 = r15.k
            long r12 = r10 - r12
            r15.k = r10
            float r0 = r15.i
            double r12 = (double) r12
            double r12 = r12 * r5
            float r5 = (float) r12
            float r6 = r15.j
            float r5 = r5 * r6
            float r5 = r5 + r0
            r15.i = r5
            r0 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 < 0) goto L94
            r15.i = r0
        L94:
            float r5 = r15.i
            if (r4 != 0) goto L9a
        L98:
            r9 = r5
            goto L9f
        L9a:
            float r5 = r4.getInterpolation(r5)
            goto L98
        L9f:
            android.view.View r13 = r8.b
            ng3 r12 = r15.e
            boolean r4 = r8.d(r9, r10, r12, r13)
            float r5 = r15.i
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 < 0) goto Lce
            if (r3 == r7) goto Lbc
            android.view.View r5 = r8.b
            long r9 = java.lang.System.nanoTime()
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r5.setTag(r3, r6)
        Lbc:
            if (r2 == r7) goto Lc3
            android.view.View r3 = r8.b
            r3.setTag(r2, r1)
        Lc3:
            boolean r1 = r15.m
            if (r1 != 0) goto Lce
            java.lang.Object r1 = r14.Z
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r15)
        Lce:
            float r15 = r15.i
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 < 0) goto Ld8
            if (r4 == 0) goto Ld7
            goto Ld8
        Ld7:
            return
        Ld8:
            java.lang.Object r15 = r14.B
            androidx.constraintlayout.motion.widget.MotionLayout r15 = (androidx.constraintlayout.motion.widget.MotionLayout) r15
            r15.invalidate()
            return
    }

    public final void b() {
            r2 = this;
            r0 = 1
            r2.h = r0
            r0 = -1
            int r1 = r2.d
            if (r1 == r0) goto L14
            if (r1 != 0) goto Le
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L12
        Le:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r1
            float r0 = r0 / r1
        L12:
            r2.j = r0
        L14:
            pa r0 = r2.f
            java.lang.Object r0 = r0.B
            androidx.constraintlayout.motion.widget.MotionLayout r0 = (androidx.constraintlayout.motion.widget.MotionLayout) r0
            r0.invalidate()
            long r0 = java.lang.System.nanoTime()
            r2.k = r0
            return
    }
}
