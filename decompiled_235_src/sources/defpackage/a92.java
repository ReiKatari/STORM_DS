package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a92  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a92 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ c92 B;

    public /* synthetic */ a92(c92 c92Var, int i) {
        this.A = i;
        this.B = c92Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        c92 c92Var = this.B;
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
                    bl2.e(true, n16.I(1730256364, new a92(c92Var, 1), xq2Var), xq2Var, 54, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    eo2 eo2Var = (eo2) c92Var.X.getValue();
                    if (eo2Var == null) {
                        xq2Var2.b0(-2130102771);
                    } else {
                        xq2Var2.b0(624023668);
                        eo2Var.o(xq2Var2, 0);
                    }
                    xq2Var2.p(false);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
