package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w97  reason: default package */
/* loaded from: classes.dex */
public final class w97 {
    public final wc7 a;
    public final vs4 b = np2.Y(null);
    public final /* synthetic */ ga7 c;

    public w97(ga7 ga7Var, wc7 wc7Var, String str) {
        this.c = ga7Var;
        this.a = wc7Var;
    }

    public final v97 a(qn2 qn2Var, qn2 qn2Var2) {
        vs4 vs4Var = this.b;
        v97 v97Var = (v97) vs4Var.getValue();
        ga7 ga7Var = this.c;
        if (v97Var == null) {
            Object g = qn2Var2.g(ga7Var.a.f());
            Object g2 = qn2Var2.g(ga7Var.a.f());
            wc7 wc7Var = this.a;
            ap apVar = (ap) wc7Var.a.g(g2);
            apVar.d();
            ca7 ca7Var = new ca7(ga7Var, g, apVar, wc7Var);
            v97Var = new v97(this, ca7Var, qn2Var, qn2Var2);
            vs4Var.setValue(v97Var);
            ga7Var.i.add(ca7Var);
        }
        v97Var.L = qn2Var2;
        v97Var.B = qn2Var;
        v97Var.a(ga7Var.f());
        return v97Var;
    }
}
