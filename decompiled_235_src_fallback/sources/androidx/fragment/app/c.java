package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class c extends defpackage.wn6 {
    public final androidx.fragment.app.d c;

    public c(androidx.fragment.app.d r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @Override // defpackage.wn6
    public final void b(android.view.ViewGroup r3) {
            r2 = this;
            r3.getClass()
            androidx.fragment.app.d r0 = r2.c
            androidx.fragment.app.b0 r0 = r0.a
            androidx.fragment.app.o r1 = r0.c
            android.view.View r1 = r1.mView
            r1.clearAnimation()
            r3.endViewTransition(r1)
            r0.c(r2)
            r2 = 2
            boolean r2 = androidx.fragment.app.u.K(r2)
            if (r2 == 0) goto L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Animation from operation "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " has been cancelled."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L33:
            return
    }

    @Override // defpackage.wn6
    public final void c(android.view.ViewGroup r6) {
            r5 = this;
            r6.getClass()
            androidx.fragment.app.d r0 = r5.c
            androidx.fragment.app.b0 r1 = r0.a
            boolean r2 = r0.a()
            if (r2 == 0) goto L11
            r1.c(r5)
            return
        L11:
            android.content.Context r2 = r6.getContext()
            androidx.fragment.app.o r3 = r1.c
            android.view.View r3 = r3.mView
            r2.getClass()
            yc1 r0 = r0.b(r2)
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r0.A
            android.view.animation.Animation r0 = (android.view.animation.Animation) r0
            if (r0 == 0) goto L6a
            ao6 r2 = r1.a
            ao6 r4 = defpackage.ao6.REMOVED
            if (r2 == r4) goto L37
            r3.startAnimation(r0)
            r1.c(r5)
            return
        L37:
            r6.startViewTransition(r3)
            wk2 r2 = new wk2
            r2.<init>(r0, r6, r3)
            gf1 r0 = new gf1
            r0.<init>(r1, r6, r3, r5)
            r2.setAnimationListener(r0)
            r3.startAnimation(r2)
            r5 = 2
            boolean r5 = androidx.fragment.app.u.K(r5)
            if (r5 == 0) goto L69
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Animation from operation "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = " has started."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "FragmentManager"
            android.util.Log.v(r6, r5)
        L69:
            return
        L6a:
            defpackage.i.m(r2)
            return
        L6e:
            defpackage.i.m(r2)
            return
    }
}
