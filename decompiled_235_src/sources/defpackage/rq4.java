package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rq4  reason: default package */
/* loaded from: classes.dex */
public final class rq4 extends z64 implements jm3 {
    public lq4 k0;

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float b = this.k0.b(g34Var.getLayoutDirection());
        float d = this.k0.d();
        float c = this.k0.c(g34Var.getLayoutDirection());
        float a = this.k0.a();
        boolean z4 = false;
        if (om1.a(b, RecyclerView.B1) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (om1.a(d, RecyclerView.B1) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (om1.a(c, RecyclerView.B1) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (om1.a(a, RecyclerView.B1) >= 0) {
            z4 = true;
        }
        if (!(z6 & z4)) {
            n53.a("Padding must be non-negative");
        }
        int r0 = g34Var.r0(b);
        int r02 = g34Var.r0(c) + r0;
        int r03 = g34Var.r0(d);
        int r04 = g34Var.r0(a) + r03;
        dx4 y = x24Var.y(s21.i(j, -r02, -r04));
        return g34Var.K(s21.g(y.A + r02, j), s21.f(y.B + r04, j), zt1.A, new m83(y, r0, r03, 2));
    }
}
