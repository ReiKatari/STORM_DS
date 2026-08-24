package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n17  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n17 implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ Float B;
    public final /* synthetic */ eo2 L;
    public final /* synthetic */ long R;

    public /* synthetic */ n17(long j, Float f, eo2 eo2Var) {
        this.R = j;
        this.B = f;
        this.L = eo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z2 = false;
        long j = this.R;
        eo2 eo2Var = this.L;
        Float f = this.B;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z2)) {
                    hv.d(j31.a.a(new kt0(j)), n16.I(-1624601445, new n17(f, eo2Var, j), xq2Var), xq2Var, 56);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z)) {
                    if (f != null) {
                        xq2Var2.b0(1484860324);
                        hv.d(g31.a.a(f), eo2Var, xq2Var2, 8);
                        xq2Var2.p(false);
                    } else {
                        xq2Var2.b0(1485059902);
                        hv.d(g31.a.a(Float.valueOf(kt0.e(j))), eo2Var, xq2Var2, 8);
                        xq2Var2.p(false);
                    }
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ n17(Float f, eo2 eo2Var, long j) {
        this.B = f;
        this.L = eo2Var;
        this.R = j;
    }
}
