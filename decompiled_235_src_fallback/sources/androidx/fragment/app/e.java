package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class e extends defpackage.wn6 {
    public final androidx.fragment.app.d c;
    public android.animation.AnimatorSet d;

    public e(androidx.fragment.app.d r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @Override // defpackage.wn6
    public final void b(android.view.ViewGroup r3) {
            r2 = this;
            r3.getClass()
            android.animation.AnimatorSet r3 = r2.d
            androidx.fragment.app.d r0 = r2.c
            androidx.fragment.app.b0 r0 = r0.a
            if (r3 != 0) goto Lf
            r0.c(r2)
            return
        Lf:
            boolean r2 = r0.g
            if (r2 == 0) goto L1f
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r2 < r1) goto L22
            jf1 r2 = defpackage.jf1.a
            r2.a(r3)
            goto L22
        L1f:
            r3.end()
        L22:
            r2 = 2
            boolean r2 = androidx.fragment.app.u.K(r2)
            if (r2 == 0) goto L52
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Animator from operation "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " has been canceled"
            r2.append(r3)
            boolean r3 = r0.g
            if (r3 == 0) goto L3f
            java.lang.String r3 = " with seeking."
            goto L41
        L3f:
            java.lang.String r3 = "."
        L41:
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L52:
            return
    }

    @Override // defpackage.wn6
    public final void c(android.view.ViewGroup r2) {
            r1 = this;
            r2.getClass()
            androidx.fragment.app.d r2 = r1.c
            androidx.fragment.app.b0 r2 = r2.a
            android.animation.AnimatorSet r0 = r1.d
            if (r0 != 0) goto Lf
            r2.c(r1)
            return
        Lf:
            r0.start()
            r1 = 2
            boolean r1 = androidx.fragment.app.u.K(r1)
            if (r1 == 0) goto L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Animator from operation "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r2 = " has started."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L31:
            return
    }

    @Override // defpackage.wn6
    public final void d(defpackage.b00 r10, android.view.ViewGroup r11) {
            r9 = this;
            r11.getClass()
            androidx.fragment.app.d r11 = r9.c
            androidx.fragment.app.b0 r11 = r11.a
            android.animation.AnimatorSet r0 = r9.d
            if (r0 != 0) goto Lf
            r11.c(r9)
            return
        Lf:
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r9 < r1) goto L7b
            androidx.fragment.app.o r9 = r11.c
            boolean r9 = r9.mTransitioning
            if (r9 == 0) goto L7b
            r9 = 2
            boolean r1 = androidx.fragment.app.u.K(r9)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Adding BackProgressCallbacks for Animators to operation "
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L35:
            if1 r1 = defpackage.if1.a
            long r3 = r1.a(r0)
            float r10 = r10.c
            float r1 = (float) r3
            float r10 = r10 * r1
            long r5 = (long) r10
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r7 = 1
            if (r10 != 0) goto L49
            r5 = r7
        L49:
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L4f
            long r5 = r3 - r7
        L4f:
            boolean r9 = androidx.fragment.app.u.K(r9)
            if (r9 == 0) goto L76
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Setting currentPlayTime to "
            r9.<init>(r10)
            r9.append(r5)
            java.lang.String r10 = " for Animator "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r10 = " on operation "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r2, r9)
        L76:
            jf1 r9 = defpackage.jf1.a
            r9.b(r0, r5)
        L7b:
            return
    }

    @Override // defpackage.wn6
    public final void e(android.view.ViewGroup r9) {
            r8 = this;
            r9.getClass()
            androidx.fragment.app.d r0 = r8.c
            boolean r1 = r0.a()
            if (r1 == 0) goto Lc
            goto L4c
        Lc:
            android.content.Context r1 = r9.getContext()
            r1.getClass()
            yc1 r1 = r0.b(r1)
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r1.B
            android.animation.AnimatorSet r1 = (android.animation.AnimatorSet) r1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            r8.d = r1
            androidx.fragment.app.b0 r6 = r0.a
            androidx.fragment.app.o r0 = r6.c
            ao6 r1 = r6.a
            ao6 r2 = defpackage.ao6.GONE
            if (r1 != r2) goto L2e
            r1 = 1
        L2c:
            r5 = r1
            goto L30
        L2e:
            r1 = 0
            goto L2c
        L30:
            android.view.View r4 = r0.mView
            r9.startViewTransition(r4)
            android.animation.AnimatorSet r0 = r8.d
            if (r0 == 0) goto L44
            hf1 r2 = new hf1
            r7 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0.addListener(r2)
            goto L45
        L44:
            r7 = r8
        L45:
            android.animation.AnimatorSet r8 = r7.d
            if (r8 == 0) goto L4c
            r8.setTarget(r4)
        L4c:
            return
    }
}
