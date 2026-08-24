package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ut7  reason: default package */
/* loaded from: classes.dex */
public final class ut7 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ defpackage.au7 a;
    public final /* synthetic */ defpackage.vu7 b;
    public final /* synthetic */ defpackage.vu7 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ android.view.View e;

    public ut7(defpackage.au7 r1, defpackage.vu7 r2, defpackage.vu7 r3, int r4, android.view.View r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r15) {
            r14 = this;
            float r15 = r15.getAnimatedFraction()
            au7 r0 = r14.a
            zt7 r1 = r0.a
            r1.e(r15)
            float r15 = r1.c()
            android.view.animation.PathInterpolator r1 = defpackage.wt7.e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 36
            vu7 r3 = r14.b
            if (r1 < r2) goto L1f
            hu7 r1 = new hu7
            r1.<init>(r3)
            goto L56
        L1f:
            r2 = 35
            if (r1 < r2) goto L29
            gu7 r1 = new gu7
            r1.<init>(r3)
            goto L56
        L29:
            r2 = 34
            if (r1 < r2) goto L33
            fu7 r1 = new fu7
            r1.<init>(r3)
            goto L56
        L33:
            r2 = 31
            if (r1 < r2) goto L3d
            eu7 r1 = new eu7
            r1.<init>(r3)
            goto L56
        L3d:
            r2 = 30
            if (r1 < r2) goto L47
            du7 r1 = new du7
            r1.<init>(r3)
            goto L56
        L47:
            r2 = 29
            if (r1 < r2) goto L51
            cu7 r1 = new cu7
            r1.<init>(r3)
            goto L56
        L51:
            bu7 r1 = new bu7
            r1.<init>(r3)
        L56:
            r2 = 1
        L57:
            r4 = 512(0x200, float:7.17E-43)
            if (r2 > r4) goto Lad
            int r4 = r14.d
            r4 = r4 & r2
            ru7 r5 = r3.a
            if (r4 != 0) goto L6a
            e83 r4 = r5.h(r2)
            r1.d(r2, r4)
            goto Laa
        L6a:
            e83 r4 = r5.h(r2)
            vu7 r5 = r14.c
            ru7 r5 = r5.a
            e83 r5 = r5.h(r2)
            int r6 = r4.a
            int r7 = r5.a
            int r6 = r6 - r7
            float r6 = (float) r6
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r15
            float r6 = r6 * r7
            double r8 = (double) r6
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 + r10
            int r6 = (int) r8
            int r8 = r4.b
            int r9 = r5.b
            int r8 = r8 - r9
            float r8 = (float) r8
            float r8 = r8 * r7
            double r8 = (double) r8
            double r8 = r8 + r10
            int r8 = (int) r8
            int r9 = r4.c
            int r12 = r5.c
            int r9 = r9 - r12
            float r9 = (float) r9
            float r9 = r9 * r7
            double r12 = (double) r9
            double r12 = r12 + r10
            int r9 = (int) r12
            int r12 = r4.d
            int r5 = r5.d
            int r12 = r12 - r5
            float r5 = (float) r12
            float r5 = r5 * r7
            double r12 = (double) r5
            double r12 = r12 + r10
            int r5 = (int) r12
            e83 r4 = defpackage.vu7.e(r4, r6, r8, r9, r5)
            r1.d(r2, r4)
        Laa:
            int r2 = r2 << 1
            goto L57
        Lad:
            vu7 r15 = r1.b()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            android.view.View r14 = r14.e
            defpackage.wt7.h(r14, r15, r0)
            return
    }
}
