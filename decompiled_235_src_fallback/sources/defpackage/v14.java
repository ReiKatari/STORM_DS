package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v14  reason: default package */
/* loaded from: classes.dex */
public final class v14 extends defpackage.q14 {
    public final float g;
    public final float h;

    public v14(android.view.View r2) {
            r1 = this;
            r1.<init>(r2)
            android.content.res.Resources r2 = r2.getResources()
            r0 = 2131165361(0x7f0700b1, float:1.7944937E38)
            float r0 = r2.getDimension(r0)
            r1.g = r0
            r0 = 2131165362(0x7f0700b2, float:1.7944939E38)
            float r2 = r2.getDimension(r0)
            r1.h = r2
            return
    }

    public final android.animation.AnimatorSet a() {
            r8 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            android.util.Property r1 = android.view.View.SCALE_X
            r2 = 1
            float[] r3 = new float[r2]
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r3[r4] = r5
            android.view.View r8 = r8.b
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r8, r1, r3)
            android.util.Property r3 = android.view.View.SCALE_Y
            float[] r6 = new float[r2]
            r6[r4] = r5
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r8, r3, r6)
            r6 = 2
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r4] = r1
            r6[r2] = r3
            r0.playTogether(r6)
            boolean r1 = r8 instanceof android.view.ViewGroup
            if (r1 == 0) goto L4e
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r1 = r4
        L30:
            int r3 = r8.getChildCount()
            if (r1 >= r3) goto L4e
            android.view.View r3 = r8.getChildAt(r1)
            android.util.Property r6 = android.view.View.SCALE_Y
            float[] r7 = new float[r2]
            r7[r4] = r5
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r6, r7)
            android.animation.Animator[] r6 = new android.animation.Animator[r2]
            r6[r4] = r3
            r0.playTogether(r6)
            int r1 = r1 + 1
            goto L30
        L4e:
            q92 r8 = new q92
            r8.<init>(r2)
            r0.setInterpolator(r8)
            return r0
    }

    public final void b(float r7) {
            r6 = this;
            android.view.animation.PathInterpolator r0 = r6.a
            float r7 = r0.getInterpolation(r7)
            android.view.View r0 = r6.b
            int r1 = r0.getWidth()
            float r1 = (float) r1
            int r2 = r0.getHeight()
            float r2 = (float) r2
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L6e
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 > 0) goto L1c
            goto L6e
        L1c:
            float r4 = r6.g
            float r4 = r4 / r1
            float r6 = r6.h
            float r6 = r6 / r2
            float r1 = defpackage.vo.a(r3, r4, r7)
            float r6 = defpackage.vo.a(r3, r6, r7)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r1 = r7 - r1
            float r6 = r7 - r6
            boolean r4 = java.lang.Float.isNaN(r1)
            if (r4 != 0) goto L6e
            boolean r4 = java.lang.Float.isNaN(r6)
            if (r4 == 0) goto L3d
            goto L6e
        L3d:
            r0.setScaleX(r1)
            r0.setPivotY(r2)
            r0.setScaleY(r6)
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L6e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2 = 0
        L4d:
            int r4 = r0.getChildCount()
            if (r2 >= r4) goto L6e
            android.view.View r4 = r0.getChildAt(r2)
            int r5 = r4.getTop()
            int r5 = -r5
            float r5 = (float) r5
            r4.setPivotY(r5)
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 == 0) goto L67
            float r5 = r1 / r6
            goto L68
        L67:
            r5 = r7
        L68:
            r4.setScaleY(r5)
            int r2 = r2 + 1
            goto L4d
        L6e:
            return
    }
}
