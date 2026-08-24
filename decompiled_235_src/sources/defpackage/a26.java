package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a26  reason: default package */
/* loaded from: classes.dex */
public final class a26 extends q60 {
    @Override // defpackage.q60
    public final void C(we6 we6Var, float f, float f2) {
        float f3 = f2 * f;
        we6Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        se6 se6Var = new se6(RecyclerView.B1, RecyclerView.B1, f4, f4);
        se6Var.f = 180.0f;
        se6Var.g = 90.0f;
        we6Var.f.add(se6Var);
        qe6 qe6Var = new qe6(se6Var);
        we6Var.a(180.0f);
        we6Var.g.add(qe6Var);
        we6Var.d = 270.0f;
        float f5 = (RecyclerView.B1 + f4) * 0.5f;
        float f6 = (f4 - RecyclerView.B1) / 2.0f;
        we6Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        we6Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
