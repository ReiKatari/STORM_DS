package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yw3  reason: default package */
/* loaded from: classes.dex */
public final class yw3 implements android.widget.AbsListView.OnScrollListener {
    public final /* synthetic */ defpackage.ax3 a;

    public yw3(defpackage.ax3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView r3, int r4) {
            r2 = this;
            ax3 r2 = r2.a
            xw3 r3 = r2.n0
            pr r0 = r2.v0
            r1 = 1
            if (r4 != r1) goto L1f
            int r4 = r0.getInputMethodMode()
            r1 = 2
            if (r4 != r1) goto L11
            return
        L11:
            android.view.View r4 = r0.getContentView()
            if (r4 == 0) goto L1f
            android.os.Handler r2 = r2.r0
            r2.removeCallbacks(r3)
            r3.run()
        L1f:
            return
    }
}
