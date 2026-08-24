package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w82  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w82 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ x82 B;

    public /* synthetic */ w82(x82 x82Var, int i) {
        this.A = i;
        this.B = x82Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        jg7 jg7Var;
        boolean z2;
        int i = this.A;
        jg7 jg7Var2 = jg7.a;
        x82 x82Var = this.B;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    a74 L = vy7.L(dj6.c, es7.s, u24.m);
                    e34 d = h70.d(d90.L, false);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, L);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, d);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    eo2 eo2Var = (eo2) x82Var.B.getValue();
                    if (eo2Var == null) {
                        xq2Var.b0(908576654);
                        xq2Var.p(false);
                        jg7Var = null;
                    } else {
                        xq2Var.b0(-1356164397);
                        eo2Var.o(xq2Var, 0);
                        xq2Var.p(false);
                        jg7Var = jg7Var2;
                    }
                    if (jg7Var == null) {
                        xq2Var.b0(-1356164003);
                        g04.m(xq2Var, 0);
                    } else {
                        xq2Var.b0(-1356164840);
                    }
                    xq2Var.p(false);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var2;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    bl2.e(true, n16.I(918246117, new w82(x82Var, 0), xq2Var2), xq2Var2, 54, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var2;
        }
    }
}
