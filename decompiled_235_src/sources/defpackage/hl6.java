package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hl6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hl6 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ eo2 B;
    public final /* synthetic */ zv0 L;

    public /* synthetic */ hl6(zv0 zv0Var, eo2 eo2Var, int i) {
        this.A = 2;
        this.L = zv0Var;
        this.B = eo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        float f;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z3 = false;
        zv0 zv0Var = this.L;
        eo2 eo2Var = this.B;
        px0 px0Var = (px0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    if (eo2Var == null) {
                        xq2Var.b0(1845819398);
                        bl2.l(zv0Var, xq2Var, 0);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(1845823628);
                        bl2.g(zv0Var, eo2Var, xq2Var, 0);
                        xq2Var.p(false);
                    }
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    x37.a(((xe7) xq2Var2.j(ye7.b)).j, n16.I(1789628237, new hl6(eo2Var, zv0Var, 0), xq2Var2), xq2Var2, 48);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                num.getClass();
                bl2.g(zv0Var, eo2Var, px0Var, ii2.a0(1));
                return jg7Var;
            default:
                int intValue3 = num.intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var;
                if (xq2Var3.S(intValue3 & 1, z3)) {
                    py0 py0Var = g31.a;
                    long j = ((kt0) xq2Var3.j(j31.a)).a;
                    if (!((ut0) xq2Var3.j(vt0.a)).k() ? hv.N(j) < 0.5d : hv.N(j) > 0.5d) {
                        f = 1.0f;
                    } else {
                        f = 0.87f;
                    }
                    hv.d(py0Var.a(Float.valueOf(f)), n16.I(1236486620, new hl6(eo2Var, zv0Var, 1), xq2Var3), xq2Var3, 56);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ hl6(eo2 eo2Var, zv0 zv0Var, int i) {
        this.A = i;
        this.B = eo2Var;
        this.L = zv0Var;
    }
}
