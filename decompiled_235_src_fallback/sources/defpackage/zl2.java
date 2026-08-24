package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zl2  reason: default package */
/* loaded from: classes.dex */
public final class zl2 implements android.transition.Transition.TransitionListener {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.util.ArrayList b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.util.ArrayList d;
    public final /* synthetic */ defpackage.bm2 e;

    public zl2(defpackage.bm2 r1, java.lang.Object r2, java.util.ArrayList r3, java.lang.Object r4, java.util.ArrayList r5) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
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
            r1.removeListener(r0)
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
    public final void onTransitionStart(android.transition.Transition r4) {
            r3 = this;
            r4 = 0
            bm2 r0 = r3.e
            java.lang.Object r1 = r3.a
            if (r1 == 0) goto Lc
            java.util.ArrayList r2 = r3.b
            r0.A(r1, r2, r4)
        Lc:
            java.lang.Object r1 = r3.c
            if (r1 == 0) goto L15
            java.util.ArrayList r3 = r3.d
            r0.A(r1, r3, r4)
        L15:
            return
    }
}
