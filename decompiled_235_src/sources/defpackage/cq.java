package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cq implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ tt7 B;
    public final /* synthetic */ lq4 L;
    public final /* synthetic */ zv0 R;

    public /* synthetic */ cq(tt7 tt7Var, lq4 lq4Var, zv0 zv0Var, int i) {
        this.A = i;
        this.B = tt7Var;
        this.L = lq4Var;
        this.R = zv0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        float f;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z = false;
        zv0 zv0Var = this.R;
        lq4 lq4Var = this.L;
        tt7 tt7Var = this.B;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    py0 py0Var = g31.a;
                    long j = ((kt0) xq2Var.j(j31.a)).a;
                    if (!((ut0) xq2Var.j(vt0.a)).k() ? hv.N(j) < 0.5d : hv.N(j) > 0.5d) {
                        f = 0.74f;
                    } else {
                        f = 0.6f;
                    }
                    hv.d(py0Var.a(Float.valueOf(f)), n16.I(597057613, new cq(tt7Var, lq4Var, zv0Var, 1), xq2Var), xq2Var, 56);
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
                    a74 e = dj6.e(ge7.N(q60.d0(dj6.c(x64.a, 1.0f), tt7Var), lq4Var), 56.0f);
                    l26 a = k26.a(ju.a, d90.i0, xq2Var2, 54);
                    int B = ge7.B(xq2Var2);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, e);
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
                    zv0Var.e(n26.a, xq2Var2, 6);
                    xq2Var2.p(true);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
