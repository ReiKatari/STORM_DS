package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n50  reason: default package */
/* loaded from: classes.dex */
public final class n50 extends aj3 implements qn2 {
    public final /* synthetic */ float B;
    public final /* synthetic */ float L;
    public final /* synthetic */ int R;
    public final /* synthetic */ boolean X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(float f, float f2, int i, boolean z) {
        super(1);
        this.B = f;
        this.L = f2;
        this.R = i;
        this.X = z;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        m50 m50Var;
        jy2 jy2Var = u24.m;
        op5 op5Var = (op5) obj;
        float a = op5Var.l0.a() * this.B;
        float a2 = op5Var.l0.a() * this.L;
        if (a > RecyclerView.B1 && a2 > RecyclerView.B1) {
            m50Var = new m50(a, a2, this.R);
        } else {
            m50Var = null;
        }
        op5Var.i(m50Var);
        op5Var.n(jy2Var);
        op5Var.f(this.X);
        return jg7.a;
    }
}
