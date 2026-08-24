package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o43  reason: default package */
/* loaded from: classes.dex */
public final class o43 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.widget.TextView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ android.widget.TextView d;
    public final /* synthetic */ defpackage.q43 e;

    public o43(defpackage.q43 r1, int r2, android.widget.TextView r3, int r4, android.widget.TextView r5) {
            r0 = this;
            r0.e = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r4) {
            r3 = this;
            int r4 = r3.a
            q43 r0 = r3.e
            r0.n = r4
            r4 = 0
            r0.l = r4
            android.widget.TextView r1 = r3.b
            if (r1 == 0) goto L1d
            r2 = 4
            r1.setVisibility(r2)
            int r1 = r3.c
            r2 = 1
            if (r1 != r2) goto L1d
            qs r0 = r0.r
            if (r0 == 0) goto L1d
            r0.setText(r4)
        L1d:
            android.widget.TextView r3 = r3.d
            if (r3 == 0) goto L2a
            r4 = 0
            r3.setTranslationY(r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r4)
        L2a:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            android.widget.TextView r0 = r0.d
            if (r0 == 0) goto Lc
            r1 = 0
            r0.setVisibility(r1)
            r1 = 0
            r0.setAlpha(r1)
        Lc:
            return
    }
}
