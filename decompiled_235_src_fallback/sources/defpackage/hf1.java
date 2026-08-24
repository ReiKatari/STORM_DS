package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hf1  reason: default package */
/* loaded from: classes.dex */
public final class hf1 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ android.view.ViewGroup a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ androidx.fragment.app.b0 d;
    public final /* synthetic */ androidx.fragment.app.e e;

    public hf1(android.view.ViewGroup r1, android.view.View r2, boolean r3, androidx.fragment.app.b0 r4, androidx.fragment.app.e r5) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r5) {
            r4 = this;
            r5.getClass()
            android.view.ViewGroup r5 = r4.a
            android.view.View r0 = r4.b
            r5.endViewTransition(r0)
            boolean r1 = r4.c
            androidx.fragment.app.b0 r2 = r4.d
            if (r1 != 0) goto L16
            ao6 r1 = r2.a
            ao6 r3 = defpackage.ao6.GONE
            if (r1 != r3) goto L1e
        L16:
            ao6 r1 = r2.a
            r0.getClass()
            r1.applyState(r0, r5)
        L1e:
            androidx.fragment.app.e r4 = r4.e
            androidx.fragment.app.d r5 = r4.c
            androidx.fragment.app.b0 r5 = r5.a
            r5.c(r4)
            r4 = 2
            boolean r4 = androidx.fragment.app.u.K(r4)
            if (r4 == 0) goto L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Animator from operation "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r5 = " has ended."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r4)
        L46:
            return
    }
}
