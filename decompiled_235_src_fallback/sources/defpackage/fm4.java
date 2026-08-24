package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fm4  reason: default package */
/* loaded from: classes.dex */
public final class fm4 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    public final android.view.View A;
    public android.view.ViewTreeObserver B;
    public final java.lang.Runnable L;

    public fm4(android.view.View r1, java.lang.Runnable r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.B = r1
            r0.L = r2
            return
    }

    public static void a(android.view.View r1, java.lang.Runnable r2) {
            if (r1 == 0) goto L12
            fm4 r0 = new fm4
            r0.<init>(r1, r2)
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.addOnPreDrawListener(r0)
            r1.addOnAttachStateChangeListener(r0)
            return
        L12:
            java.lang.String r1 = "view == null"
            defpackage.u34.x(r1)
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r2 = this;
            android.view.ViewTreeObserver r0 = r2.B
            boolean r0 = r0.isAlive()
            android.view.View r1 = r2.A
            if (r0 == 0) goto L10
            android.view.ViewTreeObserver r0 = r2.B
            r0.removeOnPreDrawListener(r2)
            goto L17
        L10:
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            r0.removeOnPreDrawListener(r2)
        L17:
            r1.removeOnAttachStateChangeListener(r2)
            java.lang.Runnable r2 = r2.L
            r2.run()
            r2 = 1
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.B = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            android.view.ViewTreeObserver r2 = r1.B
            boolean r2 = r2.isAlive()
            android.view.View r0 = r1.A
            if (r2 == 0) goto L10
            android.view.ViewTreeObserver r2 = r1.B
            r2.removeOnPreDrawListener(r1)
            goto L17
        L10:
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r2.removeOnPreDrawListener(r1)
        L17:
            r0.removeOnAttachStateChangeListener(r1)
            return
    }
}
