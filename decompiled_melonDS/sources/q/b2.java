package q;

import android.widget.AbsListView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b2 implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d2 f11854a;

    public b2(d2 d2Var) {
        this.f11854a = d2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        d2 d2Var = this.f11854a;
        a2 a2Var = d2Var.f11875l0;
        y yVar = d2Var.f11882t0;
        if (i2 == 1 && yVar.getInputMethodMode() != 2 && yVar.getContentView() != null) {
            d2Var.p0.removeCallbacks(a2Var);
            a2Var.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i10, int i11) {
    }
}
