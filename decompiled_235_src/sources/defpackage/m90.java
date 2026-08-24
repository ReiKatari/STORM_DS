package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m90  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m90 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ lq4 B;
    public final /* synthetic */ fo2 L;

    public /* synthetic */ m90(lq4 lq4Var, fo2 fo2Var, int i) {
        this.A = i;
        this.B = lq4Var;
        this.L = fo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z = false;
        fo2 fo2Var = this.L;
        lq4 lq4Var = this.B;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    x37.a(((xe7) xq2Var.j(ye7.b)).k, n16.I(165539859, new m90(lq4Var, fo2Var, 1), xq2Var), xq2Var, 48);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z)) {
                    a74 N = ge7.N(dj6.a(x64.a, k90.b, k90.c), lq4Var);
                    l26 a = k26.a(ju.d, d90.i0, xq2Var2, 54);
                    int B = ge7.B(xq2Var2);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, N);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, ix0.f, a);
                    yh2.K(xq2Var2, ix0.e, l);
                    pn pnVar = ix0.g;
                    if (xq2Var2.S || !nb3.k(xq2Var2.P(), Integer.valueOf(B))) {
                        i61.v(B, xq2Var2, B, pnVar);
                    }
                    yh2.K(xq2Var2, ix0.d, E);
                    fo2Var.e(n26.a, xq2Var2, 6);
                    xq2Var2.p(true);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
