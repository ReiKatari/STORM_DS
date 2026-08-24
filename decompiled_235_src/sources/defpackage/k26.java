package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k26  reason: default package */
/* loaded from: classes.dex */
public abstract class k26 {
    public static final l26 a = new l26(ju.a, d90.h0);

    public static final l26 a(fu fuVar, d40 d40Var, px0 px0Var, int i) {
        boolean z;
        if (fuVar.equals(ju.a) && nb3.k(d40Var, d90.h0)) {
            xq2 xq2Var = (xq2) px0Var;
            xq2Var.b0(-1073830487);
            xq2Var.p(false);
            return a;
        }
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.b0(-1073779616);
        boolean z2 = true;
        if ((((i & 14) ^ 6) > 4 && xq2Var2.f(fuVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) <= 32 || !xq2Var2.f(d40Var)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object P = xq2Var2.P();
        if (z3 || P == ox0.a) {
            P = new l26(fuVar, d40Var);
            xq2Var2.l0(P);
        }
        l26 l26Var = (l26) P;
        xq2Var2.p(false);
        return l26Var;
    }
}
