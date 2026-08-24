package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dj1  reason: default package */
/* loaded from: classes.dex */
public final class dj1 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public dj1(sb4 sb4Var, sn snVar) {
        this.A = 2;
        this.L = sb4Var;
        this.B = snVar;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.B;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    xq2 xq2Var = (xq2) px0Var;
                    if (xq2Var.E()) {
                        xq2Var.V();
                        return jg7Var;
                    }
                }
                ((hj1) obj3).Z.e((sb4) obj4, px0Var, 0);
                return jg7Var;
            case 1:
                px0 px0Var2 = (px0) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    xq2 xq2Var2 = (xq2) px0Var2;
                    if (xq2Var2.E()) {
                        xq2Var2.V();
                        return jg7Var;
                    }
                }
                kn2.g((o46) obj3, (zv0) obj4, px0Var2, 0);
                return jg7Var;
            default:
                px0 px0Var3 = (px0) obj;
                sb4 sb4Var = (sb4) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    xq2 xq2Var3 = (xq2) px0Var3;
                    if (xq2Var3.E()) {
                        xq2Var3.V();
                        return jg7Var;
                    }
                }
                ic4 ic4Var = sb4Var.B;
                ic4Var.getClass();
                ((tw0) ic4Var).Y.l((sn) obj3, sb4Var, px0Var3, 0);
                return jg7Var;
        }
    }

    public /* synthetic */ dj1(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
