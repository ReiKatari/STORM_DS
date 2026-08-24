package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wh6  reason: default package */
/* loaded from: classes.dex */
public final class wh6 implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public final java.lang.Object L;

    public /* synthetic */ wh6(android.view.View r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    public wh6(defpackage.xh6 r2, android.app.Activity r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.L = r2
            return
    }

    private final void a(android.view.View r1) {
            r0 = this;
            return
    }

    private final void b(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r4) {
            r3 = this;
            int r0 = r3.A
            java.lang.Object r1 = r3.L
            java.lang.Object r2 = r3.B
            switch(r0) {
                case 0: goto L48;
                case 1: goto L3c;
                case 2: goto La;
                default: goto L9;
            }
        L9:
            return
        La:
            p0 r2 = (defpackage.p0) r2
            hu3 r4 = defpackage.bl2.B(r2)
            if (r4 == 0) goto L22
            dh5 r1 = (defpackage.dh5) r1
            ut3 r4 = r4.getLifecycle()
            le r4 = defpackage.ii2.o(r2, r4)
            r1.A = r4
            r2.removeOnAttachStateChangeListener(r3)
            goto L3b
        L22:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "View tree for "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = " has no ViewTreeLifecycleOwner"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            defpackage.p53.d(r3)
            defpackage.e41.c()
        L3b:
            return
        L3c:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            fx6 r1 = (defpackage.fx6) r1
            r0 = 0
            r2.addView(r1, r0)
            r4.removeOnAttachStateChangeListener(r3)
            return
        L48:
            r4.getClass()
            r4.removeOnAttachStateChangeListener(r3)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r3 = r1.get()
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L67
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L67
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            if (r4 == 0) goto L67
            android.os.IBinder r4 = r4.token
            goto L68
        L67:
            r4 = 0
        L68:
            if (r3 != 0) goto L6b
            goto L73
        L6b:
            if (r4 != 0) goto L6e
            goto L73
        L6e:
            xh6 r2 = (defpackage.xh6) r2
            r2.c(r4, r3)
        L73:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r4) {
            r3 = this;
            int r0 = r3.A
            java.lang.Object r1 = r3.L
            java.lang.Object r2 = r3.B
            switch(r0) {
                case 0: goto L20;
                case 1: goto L14;
                case 2: goto L13;
                default: goto L9;
            }
        L9:
            android.view.View r2 = (android.view.View) r2
            r2.removeOnAttachStateChangeListener(r3)
            if5 r1 = (defpackage.if5) r1
            r1.x()
        L13:
            return
        L14:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            fx6 r1 = (defpackage.fx6) r1
            r0 = 0
            r2.addView(r1, r0)
            r4.removeOnAttachStateChangeListener(r3)
            return
        L20:
            r4.getClass()
            return
    }
}
