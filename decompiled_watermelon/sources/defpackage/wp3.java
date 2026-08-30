package defpackage;

import android.widget.AbsListView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wp3  reason: default package */
/* loaded from: classes.dex */
public final class wp3 implements AbsListView.OnScrollListener {
    public final /* synthetic */ yp3 a;

    public wp3(yp3 yp3Var) {
        this.a = yp3Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        yp3 yp3Var = this.a;
        vp3 vp3Var = yp3Var.m0;
        cr crVar = yp3Var.u0;
        if (i == 1 && crVar.getInputMethodMode() != 2 && crVar.getContentView() != null) {
            yp3Var.q0.removeCallbacks(vp3Var);
            vp3Var.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
