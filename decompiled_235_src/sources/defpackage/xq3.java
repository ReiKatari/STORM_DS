package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xq3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xq3 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ zq3 B;

    public /* synthetic */ xq3(zq3 zq3Var, int i) {
        this.A = i;
        this.B = zq3Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        zq3 zq3Var = this.B;
        switch (i) {
            case 0:
                cq3 cq3Var = (cq3) zq3Var.k0.c();
                int a = cq3Var.a();
                int i2 = 0;
                while (true) {
                    if (i2 < a) {
                        if (!cq3Var.c(i2).equals(obj)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                cq3 cq3Var2 = (cq3) zq3Var.k0.c();
                if (intValue < 0 || intValue >= cq3Var2.a()) {
                    StringBuilder t = xg6.t("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    t.append(cq3Var2.a());
                    t.append(')');
                    s53.a(t.toString());
                }
                hv.L(zq3Var.F0(), null, null, new l7(zq3Var, intValue, null, 2), 3);
                return Boolean.TRUE;
        }
    }
}
