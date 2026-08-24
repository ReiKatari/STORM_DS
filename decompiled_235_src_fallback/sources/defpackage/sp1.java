package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sp1 implements android.view.View.OnTouchListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ sp1(java.lang.Object r1, int r2) {
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
            r2 = 1
            java.lang.Object r5 = r5.B
            switch(r0) {
                case 0: goto L31;
                default: goto L9;
            }
        L9:
            me.magnum.melonds.ui.layouteditor.b r5 = (me.magnum.melonds.ui.layouteditor.b) r5
            int r7 = r7.getActionMasked()
            if (r7 == 0) goto L24
            r0 = 3
            if (r7 == r2) goto L1b
            if (r7 == r0) goto L17
            goto L30
        L17:
            r6 = 0
            r5.v0 = r6
            goto L30
        L1b:
            cl3 r7 = new cl3
            r7.<init>(r5, r0)
            r6.post(r7)
            goto L30
        L24:
            nb1 r6 = r5.L
            java.lang.Object r6 = r6.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r6 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r6
            nj3 r6 = r6.getSelectedComponent()
            r5.v0 = r6
        L30:
            return r1
        L31:
            vp1 r5 = (defpackage.vp1) r5
            int r6 = r7.getAction()
            if (r6 != r2) goto L59
            long r6 = android.os.SystemClock.uptimeMillis()
            long r3 = r5.o
            long r6 = r6 - r3
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L4c
            r3 = 300(0x12c, double:1.48E-321)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L4e
        L4c:
            r5.m = r1
        L4e:
            r5.t()
            r5.m = r2
            long r6 = android.os.SystemClock.uptimeMillis()
            r5.o = r6
        L59:
            return r1
    }
}
