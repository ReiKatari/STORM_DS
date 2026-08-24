package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pw6  reason: default package */
/* loaded from: classes.dex */
public final class pw6 extends defpackage.oi2 {
    public int e;
    public int f;
    public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior g;

    public pw6(com.google.android.material.behavior.SwipeDismissBehavior r1) {
            r0 = this;
            r0.<init>()
            r0.g = r1
            r1 = -1
            r0.f = r1
            return
    }

    @Override // defpackage.oi2
    public final int E(android.view.View r1) {
            r0 = this;
            int r0 = r1.getWidth()
            return r0
    }

    @Override // defpackage.oi2
    public final void P(android.view.View r1, int r2) {
            r0 = this;
            r0.f = r2
            int r2 = r1.getLeft()
            r0.e = r2
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L19
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r0.g
            r2 = 1
            r0.c = r2
            r1.requestDisallowInterceptTouchEvent(r2)
            r1 = 0
            r0.c = r1
        L19:
            return
    }

    @Override // defpackage.oi2
    public final void Q(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.oi2
    public final void R(android.view.View r4, int r5, int r6) {
            r3 = this;
            int r6 = r4.getWidth()
            float r6 = (float) r6
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r3.g
            float r1 = r0.e
            float r6 = r6 * r1
            int r1 = r4.getWidth()
            float r1 = (float) r1
            float r0 = r0.f
            float r1 = r1 * r0
            int r3 = r3.e
            int r5 = r5 - r3
            int r3 = java.lang.Math.abs(r5)
            float r3 = (float) r3
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r5 > 0) goto L24
            r4.setAlpha(r0)
            return
        L24:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r5 < 0) goto L2d
            r4.setAlpha(r2)
            return
        L2d:
            float r3 = r3 - r6
            float r1 = r1 - r6
            float r3 = r3 / r1
            float r3 = r0 - r3
            float r3 = java.lang.Math.max(r2, r3)
            float r3 = java.lang.Math.min(r3, r0)
            r4.setAlpha(r3)
            return
    }

    @Override // defpackage.oi2
    public final void S(android.view.View r9, float r10, float r11) {
            r8 = this;
            r11 = -1
            r8.f = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.g
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.d
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.e
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.e
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r8 = r8.e
            int r0 = r8 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.e
        L67:
            ho7 r8 = r3.a
            int r10 = r9.getTop()
            boolean r8 = r8.o(r0, r10)
            if (r8 == 0) goto L7b
            uo2 r8 = new uo2
            r8.<init>(r3, r9, r2)
            r9.postOnAnimation(r8)
        L7b:
            return
    }

    @Override // defpackage.oi2
    public final boolean a0(android.view.View r3, int r4) {
            r2 = this;
            int r0 = r2.f
            r1 = -1
            if (r0 == r1) goto L7
            if (r0 != r4) goto L11
        L7:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r2.g
            boolean r2 = r2.v(r3)
            if (r2 == 0) goto L11
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // defpackage.oi2
    public final int m(android.view.View r5, int r6) {
            r4 = this;
            int r0 = r5.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L9
            r0 = r1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r4.g
            int r2 = r2.d
            if (r2 != 0) goto L22
            int r1 = r4.e
            if (r0 == 0) goto L1c
            int r5 = r5.getWidth()
            int r1 = r1 - r5
            int r4 = r4.e
            goto L45
        L1c:
            int r4 = r5.getWidth()
            int r4 = r4 + r1
            goto L45
        L22:
            int r3 = r4.e
            if (r2 != r1) goto L38
            if (r0 == 0) goto L2f
            int r4 = r5.getWidth()
            int r4 = r4 + r3
            r1 = r3
            goto L45
        L2f:
            int r5 = r5.getWidth()
            int r1 = r3 - r5
            int r4 = r4.e
            goto L45
        L38:
            int r0 = r5.getWidth()
            int r1 = r3 - r0
            int r4 = r4.e
            int r5 = r5.getWidth()
            int r4 = r4 + r5
        L45:
            int r5 = java.lang.Math.max(r1, r6)
            int r4 = java.lang.Math.min(r5, r4)
            return r4
    }

    @Override // defpackage.oi2
    public final int n(android.view.View r1, int r2) {
            r0 = this;
            int r0 = r1.getTop()
            return r0
    }
}
