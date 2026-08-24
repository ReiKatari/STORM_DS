package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gf1  reason: default package */
/* loaded from: classes.dex */
public final class gf1 implements android.view.animation.Animation.AnimationListener {
    public final /* synthetic */ androidx.fragment.app.b0 a;
    public final /* synthetic */ android.view.ViewGroup b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ androidx.fragment.app.c d;

    public gf1(androidx.fragment.app.b0 r1, android.view.ViewGroup r2, android.view.View r3, androidx.fragment.app.c r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation r5) {
            r4 = this;
            r5.getClass()
            v r5 = new v
            r0 = 10
            android.view.ViewGroup r1 = r4.b
            android.view.View r2 = r4.c
            androidx.fragment.app.c r3 = r4.d
            r5.<init>(r1, r2, r3, r0)
            r1.post(r5)
            r5 = 2
            boolean r5 = androidx.fragment.app.u.K(r5)
            if (r5 == 0) goto L34
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Animation from operation "
            r5.<init>(r0)
            androidx.fragment.app.b0 r4 = r4.a
            r5.append(r4)
            java.lang.String r4 = " has ended."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r4)
        L34:
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation r2) {
            r1 = this;
            r2.getClass()
            r2 = 2
            boolean r2 = androidx.fragment.app.u.K(r2)
            if (r2 == 0) goto L24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Animation from operation "
            r2.<init>(r0)
            androidx.fragment.app.b0 r1 = r1.a
            r2.append(r1)
            java.lang.String r1 = " has reached onAnimationStart."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L24:
            return
    }
}
