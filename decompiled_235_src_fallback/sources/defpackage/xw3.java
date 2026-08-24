package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw3  reason: default package */
/* loaded from: classes.dex */
public final class xw3 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ax3 B;

    public /* synthetic */ xw3(defpackage.ax3 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.A
            ax3 r2 = r2.B
            switch(r0) {
                case 0: goto L33;
                default: goto L7;
            }
        L7:
            mp1 r0 = r2.L
            if (r0 == 0) goto L32
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L32
            mp1 r0 = r2.L
            int r0 = r0.getCount()
            mp1 r1 = r2.L
            int r1 = r1.getChildCount()
            if (r0 <= r1) goto L32
            mp1 r0 = r2.L
            int r0 = r0.getChildCount()
            int r1 = r2.i0
            if (r0 > r1) goto L32
            pr r0 = r2.v0
            r1 = 2
            r0.setInputMethodMode(r1)
            r2.e()
        L32:
            return
        L33:
            mp1 r2 = r2.L
            if (r2 == 0) goto L3e
            r0 = 1
            r2.setListSelectionHidden(r0)
            r2.requestLayout()
        L3e:
            return
    }
}
