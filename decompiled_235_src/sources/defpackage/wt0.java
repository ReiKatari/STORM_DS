package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wt0  reason: default package */
/* loaded from: classes.dex */
public abstract class wt0 {
    public static final yt0 a = new yt0(ju.c, d90.k0);

    public static final yt0 a(iu iuVar, c40 c40Var, px0 px0Var, int i) {
        boolean z;
        if (iuVar.equals(ju.c) && nb3.k(c40Var, d90.k0)) {
            xq2 xq2Var = (xq2) px0Var;
            xq2Var.b0(-1446604504);
            xq2Var.p(false);
            return a;
        }
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.b0(-1446550657);
        boolean z2 = true;
        if ((((i & 14) ^ 6) > 4 && xq2Var2.f(iuVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) <= 32 || !xq2Var2.f(c40Var)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object P = xq2Var2.P();
        if (z3 || P == ox0.a) {
            P = new yt0(iuVar, c40Var);
            xq2Var2.l0(P);
        }
        yt0 yt0Var = (yt0) P;
        xq2Var2.p(false);
        return yt0Var;
    }
}
