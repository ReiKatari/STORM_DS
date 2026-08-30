package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vw5  reason: default package */
/* loaded from: classes.dex */
public final class vw5 implements dw5 {
    public final /* synthetic */ ax5 a;
    public final /* synthetic */ xw5 b;

    public vw5(ax5 ax5Var, xw5 xw5Var) {
        this.a = ax5Var;
        this.b = xw5Var;
    }

    @Override // defpackage.dw5
    public final float a(float f) {
        int i = (Math.abs(f) > RecyclerView.A1 ? 1 : (Math.abs(f) == RecyclerView.A1 ? 0 : -1));
        ax5 ax5Var = this.a;
        if (i == 0 || ((Boolean) ax5Var.h.c()).booleanValue()) {
            return ax5Var.d(ax5Var.g(this.b.a(2, ax5Var.e(ax5Var.h(f)))));
        }
        throw new po4("The fling animation was cancelled", 0);
    }
}
