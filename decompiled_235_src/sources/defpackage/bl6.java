package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bl6 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ el6 B;

    public /* synthetic */ bl6(el6 el6Var, int i) {
        this.A = i;
        this.B = el6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z2 = false;
        el6 el6Var = this.B;
        switch (i) {
            case 0:
                zv0 zv0Var = q60.g;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(1 & intValue, z)) {
                    el6Var.getClass();
                    zv0Var.e(el6Var, xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    x37.b(el6Var.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 0, 0, 131070);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
