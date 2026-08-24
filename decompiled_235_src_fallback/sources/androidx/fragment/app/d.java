package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class d extends androidx.fragment.app.f {
    public final boolean b;
    public boolean c;
    public defpackage.yc1 d;

    public d(androidx.fragment.app.b0 r1, boolean r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            r0.b = r2
            return
    }

    public final defpackage.yc1 b(android.content.Context r9) {
            r8 = this;
            boolean r0 = r8.c
            if (r0 == 0) goto L7
            yc1 r8 = r8.d
            return r8
        L7:
            androidx.fragment.app.b0 r0 = r8.a
            androidx.fragment.app.o r1 = r0.c
            ao6 r0 = r0.a
            ao6 r2 = defpackage.ao6.VISIBLE
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L15
            r0 = r4
            goto L16
        L15:
            r0 = r3
        L16:
            int r2 = r1.getNextTransition()
            boolean r5 = r8.b
            if (r5 == 0) goto L2a
            if (r0 == 0) goto L25
            int r5 = r1.getPopEnterAnim()
            goto L35
        L25:
            int r5 = r1.getPopExitAnim()
            goto L35
        L2a:
            if (r0 == 0) goto L31
            int r5 = r1.getEnterAnim()
            goto L35
        L31:
            int r5 = r1.getExitAnim()
        L35:
            r1.setAnimations(r3, r3, r3, r3)
            android.view.ViewGroup r3 = r1.mContainer
            r6 = 0
            if (r3 == 0) goto L4b
            r7 = 2131428082(0x7f0b02f2, float:1.8477798E38)
            java.lang.Object r3 = r3.getTag(r7)
            if (r3 == 0) goto L4b
            android.view.ViewGroup r3 = r1.mContainer
            r3.setTag(r7, r6)
        L4b:
            android.view.ViewGroup r3 = r1.mContainer
            if (r3 == 0) goto L57
            android.animation.LayoutTransition r3 = r3.getLayoutTransition()
            if (r3 == 0) goto L57
            goto L10b
        L57:
            android.view.animation.Animation r3 = r1.onCreateAnimation(r2, r0, r5)
            if (r3 == 0) goto L64
            yc1 r6 = new yc1
            r6.<init>(r3)
            goto L10b
        L64:
            android.animation.Animator r1 = r1.onCreateAnimator(r2, r0, r5)
            if (r1 == 0) goto L71
            yc1 r6 = new yc1
            r6.<init>(r1)
            goto L10b
        L71:
            if (r5 != 0) goto Lce
            if (r2 == 0) goto Lce
            r1 = 4097(0x1001, float:5.741E-42)
            if (r2 == r1) goto Lc4
            r1 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r1) goto Lba
            r1 = 8197(0x2005, float:1.1486E-41)
            if (r2 == r1) goto La8
            r1 = 4099(0x1003, float:5.744E-42)
            if (r2 == r1) goto L9e
            r1 = 4100(0x1004, float:5.745E-42)
            if (r2 == r1) goto L8c
            r0 = -1
        L8a:
            r5 = r0
            goto Lce
        L8c:
            if (r0 == 0) goto L96
            r0 = 16842936(0x10100b8, float:2.3694074E-38)
            int r0 = defpackage.xk2.J(r9, r0)
            goto L8a
        L96:
            r0 = 16842937(0x10100b9, float:2.3694076E-38)
            int r0 = defpackage.xk2.J(r9, r0)
            goto L8a
        L9e:
            if (r0 == 0) goto La4
            r0 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L8a
        La4:
            r0 = 2130837512(0x7f020008, float:1.727998E38)
            goto L8a
        La8:
            if (r0 == 0) goto Lb2
            r0 = 16842938(0x10100ba, float:2.369408E-38)
            int r0 = defpackage.xk2.J(r9, r0)
            goto L8a
        Lb2:
            r0 = 16842939(0x10100bb, float:2.3694082E-38)
            int r0 = defpackage.xk2.J(r9, r0)
            goto L8a
        Lba:
            if (r0 == 0) goto Lc0
            r0 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L8a
        Lc0:
            r0 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L8a
        Lc4:
            if (r0 == 0) goto Lca
            r0 = 2130837513(0x7f020009, float:1.7279982E38)
            goto L8a
        Lca:
            r0 = 2130837514(0x7f02000a, float:1.7279984E38)
            goto L8a
        Lce:
            if (r5 == 0) goto L10b
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r0 = r0.getResourceTypeName(r5)
            java.lang.String r1 = "anim"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lef
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r9, r5)     // Catch: android.content.res.Resources.NotFoundException -> Led java.lang.RuntimeException -> Lef
            if (r1 == 0) goto L10b
            yc1 r2 = new yc1     // Catch: android.content.res.Resources.NotFoundException -> Led java.lang.RuntimeException -> Lef
            r2.<init>(r1)     // Catch: android.content.res.Resources.NotFoundException -> Led java.lang.RuntimeException -> Lef
        Leb:
            r6 = r2
            goto L10b
        Led:
            r8 = move-exception
            throw r8
        Lef:
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r9, r5)     // Catch: java.lang.RuntimeException -> Lfb
            if (r1 == 0) goto L10b
            yc1 r2 = new yc1     // Catch: java.lang.RuntimeException -> Lfb
            r2.<init>(r1)     // Catch: java.lang.RuntimeException -> Lfb
            goto Leb
        Lfb:
            r1 = move-exception
            if (r0 != 0) goto L10a
            android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r5)
            if (r9 == 0) goto L10b
            yc1 r6 = new yc1
            r6.<init>(r9)
            goto L10b
        L10a:
            throw r1
        L10b:
            r8.d = r6
            r8.c = r4
            return r6
    }
}
