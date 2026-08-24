package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wr  reason: default package */
/* loaded from: classes.dex */
public final class wr implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ wr(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r4 = this;
            int r0 = r4.A
            java.lang.Object r1 = r4.B
            switch(r0) {
                case 0: goto L85;
                case 1: goto L68;
                case 2: goto L28;
                default: goto L7;
            }
        L7:
            ep6 r1 = (defpackage.ep6) r1
            z44 r4 = r1.d0
            boolean r0 = r1.a()
            if (r0 == 0) goto L27
            boolean r0 = r4.u0
            if (r0 != 0) goto L27
            android.view.View r0 = r1.i0
            if (r0 == 0) goto L24
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L20
            goto L24
        L20:
            r4.e()
            goto L27
        L24:
            r1.dismiss()
        L27:
            return
        L28:
            gl0 r1 = (defpackage.gl0) r1
            java.util.ArrayList r4 = r1.d0
            boolean r0 = r1.a()
            if (r0 == 0) goto L67
            int r0 = r4.size()
            if (r0 <= 0) goto L67
            r0 = 0
            java.lang.Object r2 = r4.get(r0)
            fl0 r2 = (defpackage.fl0) r2
            z44 r2 = r2.a
            boolean r2 = r2.u0
            if (r2 != 0) goto L67
            android.view.View r2 = r1.k0
            if (r2 == 0) goto L64
            boolean r2 = r2.isShown()
            if (r2 != 0) goto L50
            goto L64
        L50:
            int r1 = r4.size()
        L54:
            if (r0 >= r1) goto L67
            java.lang.Object r2 = r4.get(r0)
            int r0 = r0 + 1
            fl0 r2 = (defpackage.fl0) r2
            z44 r2 = r2.a
            r2.e()
            goto L54
        L64:
            r1.dismiss()
        L67:
            return
        L68:
            cs r1 = (defpackage.cs) r1
            fs r4 = r1.C0
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L81
            android.graphics.Rect r0 = r1.A0
            boolean r4 = r4.getGlobalVisibleRect(r0)
            if (r4 == 0) goto L81
            r1.r()
            r1.e()
            goto L84
        L81:
            r1.dismiss()
        L84:
            return
        L85:
            fs r1 = (defpackage.fs) r1
            es r0 = r1.getInternalPopup()
            boolean r0 = r0.a()
            if (r0 != 0) goto L9e
            es r0 = r1.e0
            int r2 = r1.getTextDirection()
            int r3 = r1.getTextAlignment()
            r0.l(r2, r3)
        L9e:
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            if (r0 == 0) goto La7
            r0.removeOnGlobalLayoutListener(r4)
        La7:
            return
    }
}
