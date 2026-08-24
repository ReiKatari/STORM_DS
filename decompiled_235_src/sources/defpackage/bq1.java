package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bq1 implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ float B;

    public /* synthetic */ bq1(float f) {
        this.B = f;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        float f = this.B;
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
                    nc1.j(f, xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                num.getClass();
                nc1.j(f, px0Var, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ bq1(int i, float f) {
        this.B = f;
    }
}
