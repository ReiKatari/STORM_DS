package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wk2  reason: default package */
/* loaded from: classes.dex */
public final class wk2 extends android.view.animation.AnimationSet implements java.lang.Runnable {
    public final android.view.ViewGroup A;
    public final android.view.View B;
    public boolean L;
    public boolean R;
    public boolean X;

    public wk2(android.view.animation.Animation r2, android.view.ViewGroup r3, android.view.View r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = 1
            r1.X = r0
            r1.A = r3
            r1.B = r4
            r1.addAnimation(r2)
            r3.post(r1)
            return
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long r3, android.view.animation.Transformation r5) {
            r2 = this;
            r0 = 1
            r2.X = r0
            boolean r1 = r2.L
            if (r1 == 0) goto Lb
            boolean r2 = r2.R
            r2 = r2 ^ r0
            return r2
        Lb:
            boolean r3 = super.getTransformation(r3, r5)
            if (r3 != 0) goto L18
            r2.L = r0
            android.view.ViewGroup r3 = r2.A
            defpackage.fm4.a(r3, r2)
        L18:
            return r0
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long r3, android.view.animation.Transformation r5, float r6) {
            r2 = this;
            r0 = 1
            r2.X = r0
            boolean r1 = r2.L
            if (r1 == 0) goto Lb
            boolean r2 = r2.R
            r2 = r2 ^ r0
            return r2
        Lb:
            boolean r3 = super.getTransformation(r3, r5, r6)
            if (r3 != 0) goto L18
            r2.L = r0
            android.view.ViewGroup r3 = r2.A
            defpackage.fm4.a(r3, r2)
        L18:
            return r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            boolean r0 = r2.L
            android.view.ViewGroup r1 = r2.A
            if (r0 != 0) goto L11
            boolean r0 = r2.X
            if (r0 == 0) goto L11
            r0 = 0
            r2.X = r0
            r1.post(r2)
            return
        L11:
            android.view.View r0 = r2.B
            r1.endViewTransition(r0)
            r0 = 1
            r2.R = r0
            return
    }
}
