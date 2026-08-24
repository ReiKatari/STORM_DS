package defpackage;

import android.widget.AbsListView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yw3  reason: default package */
/* loaded from: classes.dex */
public final class yw3 implements AbsListView.OnScrollListener {
    public final /* synthetic */ ax3 a;

    public yw3(ax3 ax3Var) {
        this.a = ax3Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        ax3 ax3Var = this.a;
        xw3 xw3Var = ax3Var.n0;
        pr prVar = ax3Var.v0;
        if (i == 1 && prVar.getInputMethodMode() != 2 && prVar.getContentView() != null) {
            ax3Var.r0.removeCallbacks(xw3Var);
            xw3Var.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
