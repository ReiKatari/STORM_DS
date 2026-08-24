package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k44  reason: default package */
/* loaded from: classes.dex */
public final class k44 implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, defpackage.a54 {
    public defpackage.it6 A;
    public defpackage.ac B;
    public defpackage.uw3 L;

    @Override // defpackage.a54
    public final boolean M(defpackage.i44 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.a54
    public final void d(defpackage.i44 r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L6
            it6 r2 = r0.A
            if (r1 != r2) goto Ld
        L6:
            ac r0 = r0.B
            if (r0 == 0) goto Ld
            r0.dismiss()
        Ld:
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            it6 r2 = r1.A
            uw3 r1 = r1.L
            tw3 r0 = r1.Y
            if (r0 != 0) goto Lf
            tw3 r0 = new tw3
            r0.<init>(r1)
            r1.Y = r0
        Lf:
            tw3 r1 = r1.Y
            o44 r1 = r1.b(r3)
            r3 = 0
            r0 = 0
            r2.q(r1, r0, r3)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            uw3 r2 = r1.L
            it6 r1 = r1.A
            r0 = 1
            r2.d(r1, r0)
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface r4, int r5, android.view.KeyEvent r6) {
            r3 = this;
            it6 r0 = r3.A
            r1 = 82
            if (r5 == r1) goto L9
            r1 = 4
            if (r5 != r1) goto L5b
        L9:
            int r1 = r6.getAction()
            r2 = 1
            if (r1 != 0) goto L2e
            int r1 = r6.getRepeatCount()
            if (r1 != 0) goto L2e
            ac r4 = r3.B
            android.view.Window r4 = r4.getWindow()
            if (r4 == 0) goto L5b
            android.view.View r4 = r4.getDecorView()
            if (r4 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r4 = r4.getKeyDispatcherState()
            if (r4 == 0) goto L5b
            r4.startTracking(r6, r3)
            return r2
        L2e:
            int r1 = r6.getAction()
            if (r1 != r2) goto L5b
            boolean r1 = r6.isCanceled()
            if (r1 != 0) goto L5b
            ac r3 = r3.B
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L5b
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L5b
            boolean r3 = r3.isTracking(r6)
            if (r3 == 0) goto L5b
            r0.c(r2)
            r4.dismiss()
            return r2
        L5b:
            r3 = 0
            boolean r3 = r0.performShortcut(r5, r6, r3)
            return r3
    }
}
