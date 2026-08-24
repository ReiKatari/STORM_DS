package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class q implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ androidx.fragment.app.x A;
    public final /* synthetic */ androidx.fragment.app.r B;

    public q(androidx.fragment.app.r r1, androidx.fragment.app.x r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.A = r2
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.x r2 = r1.A
            androidx.fragment.app.o r0 = r2.c
            r2.k()
            android.view.View r2 = r0.mView
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            androidx.fragment.app.r r1 = r1.B
            androidx.fragment.app.u r1 = r1.A
            androidx.fragment.app.h r1 = androidx.fragment.app.h.j(r2, r1)
            r1.i()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            return
    }
}
