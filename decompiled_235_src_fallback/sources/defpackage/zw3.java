package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw3  reason: default package */
/* loaded from: classes.dex */
public final class zw3 implements android.view.View.OnTouchListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ zw3(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            int r0 = r5.A
            r1 = 0
            java.lang.Object r5 = r5.B
            switch(r0) {
                case 0: goto L17;
                default: goto L8;
            }
        L8:
            android.widget.Checkable r6 = (android.widget.Checkable) r6
            boolean r6 = r6.isChecked()
            if (r6 == 0) goto L16
            android.view.GestureDetector r5 = (android.view.GestureDetector) r5
            boolean r1 = r5.onTouchEvent(r7)
        L16:
            return r1
        L17:
            ax3 r5 = (defpackage.ax3) r5
            xw3 r6 = r5.n0
            android.os.Handler r0 = r5.r0
            pr r5 = r5.v0
            int r2 = r7.getAction()
            float r3 = r7.getX()
            int r3 = (int) r3
            float r7 = r7.getY()
            int r7 = (int) r7
            if (r2 != 0) goto L4d
            if (r5 == 0) goto L4d
            boolean r4 = r5.isShowing()
            if (r4 == 0) goto L4d
            if (r3 < 0) goto L4d
            int r4 = r5.getWidth()
            if (r3 >= r4) goto L4d
            if (r7 < 0) goto L4d
            int r5 = r5.getHeight()
            if (r7 >= r5) goto L4d
            r2 = 250(0xfa, double:1.235E-321)
            r0.postDelayed(r6, r2)
            goto L53
        L4d:
            r5 = 1
            if (r2 != r5) goto L53
            r0.removeCallbacks(r6)
        L53:
            return r1
    }
}
