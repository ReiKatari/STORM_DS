package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f60  reason: default package */
/* loaded from: classes.dex */
public final class f60 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ f60(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r3) {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r2 = r2.b
            switch(r0) {
                case 0: goto L39;
                case 1: goto L19;
                default: goto L7;
            }
        L7:
            com.google.android.material.textfield.TextInputLayout r2 = (com.google.android.material.textfield.TextInputLayout) r2
            at0 r2 = r2.s1
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.m(r3)
            return
        L19:
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            int r3 = (int) r3
            u92 r2 = (defpackage.u92) r2
            android.graphics.drawable.StateListDrawable r0 = r2.c
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r2.d
            r0.setAlpha(r3)
            androidx.recyclerview.widget.RecyclerView r2 = r2.s
            r2.invalidate()
            return
        L39:
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            p24 r2 = r2.i
            if (r2 == 0) goto L5b
            n24 r0 = r2.B
            float r1 = r0.j
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L5b
            r0.j = r3
            r3 = 1
            r2.Y = r3
            r2.Z = r3
            r2.invalidateSelf()
        L5b:
            return
    }
}
