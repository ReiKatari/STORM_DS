package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fq implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ fo2 B;

    public /* synthetic */ fq(fo2 fo2Var, int i) {
        this.A = i;
        this.B = fo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        float f = 1.0f;
        n26 n26Var = n26.a;
        jg7 jg7Var = jg7.a;
        boolean z3 = false;
        fo2 fo2Var = this.B;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z3)) {
                    a74 b = dj6.b(x64.a, 1.0f);
                    l26 a = k26.a(ju.b, d90.i0, xq2Var, 54);
                    int B = ge7.B(xq2Var);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, b);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, a);
                    yh2.K(xq2Var, ix0.e, l);
                    pn pnVar = ix0.g;
                    if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                        i61.v(B, xq2Var, B, pnVar);
                    }
                    yh2.K(xq2Var, ix0.d, E);
                    fo2Var.e(n26Var, xq2Var, 6);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z)) {
                    xq2Var2.b0(-1691869137);
                    long j = ((kt0) xq2Var2.j(j31.a)).a;
                    if (!((ut0) xq2Var2.j(vt0.a)).k() ? hv.N(j) >= 0.5d : hv.N(j) <= 0.5d) {
                        f = 0.87f;
                    }
                    xq2Var2.p(false);
                    hv.d(g31.a.a(Float.valueOf(f)), n16.I(-308149173, new fq(fo2Var, 2), xq2Var2), xq2Var2, 56);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var;
                if (xq2Var3.S(intValue & 1, z2)) {
                    fo2Var.e(n26Var, xq2Var3, 0);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
        }
    }
}
