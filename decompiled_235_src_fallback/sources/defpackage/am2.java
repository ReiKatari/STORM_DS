package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: am2  reason: default package */
/* loaded from: classes.dex */
public final class am2 implements android.transition.Transition.TransitionListener {
    public final /* synthetic */ java.lang.Runnable a;

    public am2(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(android.transition.Transition r1) {
            r0 = this;
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(android.transition.Transition r1) {
            r0 = this;
            java.lang.Runnable r0 = r0.a
            r0.run()
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
            return
    }
}
