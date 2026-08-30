package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oh4  reason: default package */
/* loaded from: classes.dex */
public final class oh4 extends yy3 implements mf3 {
    public ih4 j0;

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float a = this.j0.a(vv3Var.getLayoutDirection());
        float d = this.j0.d();
        float b = this.j0.b(vv3Var.getLayoutDirection());
        float c = this.j0.c();
        boolean z4 = false;
        if (ji1.a(a, RecyclerView.A1) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (ji1.a(d, RecyclerView.A1) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (ji1.a(b, RecyclerView.A1) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (ji1.a(c, RecyclerView.A1) >= 0) {
            z4 = true;
        }
        if (!(z6 & z4)) {
            kz2.a("Padding must be non-negative");
        }
        int Y = vv3Var.Y(a);
        int Y2 = vv3Var.Y(b) + Y;
        int Y3 = vv3Var.Y(d);
        int Y4 = vv3Var.Y(c) + Y3;
        yn4 c2 = mv3Var.c(nz0.i(j, -Y2, -Y4));
        return vv3Var.s0(nz0.g(c2.A + Y2, j), nz0.f(c2.B + Y4, j), qp1.A, new f23(c2, Y, Y3, 2));
    }
}
