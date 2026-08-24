package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yl2  reason: default package */
/* loaded from: classes.dex */
public final class yl2 implements android.transition.Transition.TransitionListener {
    public final /* synthetic */ android.view.View a;
    public final /* synthetic */ java.util.ArrayList b;

    public yl2(android.view.View r1, java.util.ArrayList r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(android.transition.Transition r1) {
            r0 = this;
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(android.transition.Transition r4) {
            r3 = this;
            r4.removeListener(r3)
            android.view.View r4 = r3.a
            r0 = 8
            r4.setVisibility(r0)
            java.util.ArrayList r3 = r3.b
            int r4 = r3.size()
            r0 = 0
            r1 = r0
        L12:
            if (r1 >= r4) goto L20
            java.lang.Object r2 = r3.get(r1)
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r0)
            int r1 = r1 + 1
            goto L12
        L20:
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(android.transition.Transition r1) {
            r0 = this;
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(android.transition.Transition r1) {
            r0 = this;
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(android.transition.Transition r1) {
            r0 = this;
            r1.removeListener(r0)
            r1.addListener(r0)
            return
    }
}
