package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qw6  reason: default package */
/* loaded from: classes.dex */
public final class qw6 implements android.view.animation.Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout b;

    public /* synthetic */ qw6(androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    private final void a(android.view.animation.Animation r1) {
            r0 = this;
            return
    }

    private final void b(android.view.animation.Animation r1) {
            r0 = this;
            return
    }

    private final void c(android.view.animation.Animation r1) {
            r0 = this;
            return
    }

    private final void d(android.view.animation.Animation r1) {
            r0 = this;
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation r3) {
            r2 = this;
            int r3 = r2.a
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r2.b
            switch(r3) {
                case 0: goto L24;
                default: goto L7;
            }
        L7:
            rw6 r3 = new rw6
            r0 = 1
            r3.<init>(r2, r0)
            r2.z0 = r3
            r0 = 150(0x96, double:7.4E-322)
            r3.setDuration(r0)
            sq0 r3 = r2.r0
            r0 = 0
            r3.A = r0
            r3.clearAnimation()
            sq0 r3 = r2.r0
            rw6 r2 = r2.z0
            r3.startAnimation(r2)
            return
        L24:
            boolean r3 = r2.B
            if (r3 == 0) goto L3d
            wq0 r3 = r2.x0
            r0 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r0)
            wq0 r3 = r2.x0
            r3.start()
            sq0 r3 = r2.r0
            int r3 = r3.getTop()
            r2.l0 = r3
            goto L40
        L3d:
            r2.l()
        L40:
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation r1) {
            r0 = this;
            int r0 = r0.a
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation r1) {
            r0 = this;
            int r0 = r0.a
            return
    }
}
