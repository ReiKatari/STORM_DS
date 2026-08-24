package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g5 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;

    public /* synthetic */ g5(String str) {
        this.A = 3;
        this.B = str;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        String str = this.B;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                nc1.c(str, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                x01.d(str, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 2:
                ((Integer) obj2).getClass();
                x73.d(str, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 3:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(1 & intValue, z)) {
                    x37.b(this.B, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 131070);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                hi2.m(str, (px0) obj, ii2.a0(7));
                return jg7Var;
        }
    }

    public /* synthetic */ g5(String str, int i, int i2) {
        this.A = i2;
        this.B = str;
    }
}
