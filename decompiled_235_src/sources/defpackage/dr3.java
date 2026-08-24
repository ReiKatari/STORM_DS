package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dr3 implements go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ fo2 B;

    public /* synthetic */ dr3(fo2 fo2Var, int i) {
        this.A = i;
        this.B = fo2Var;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        fo2 fo2Var = this.B;
        switch (i2) {
            case 0:
                lp3 lp3Var = (lp3) obj;
                ((Integer) obj2).intValue();
                px0 px0Var = (px0) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var).f(lp3Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 131) != 130) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    fo2Var.e(lp3Var, xq2Var, Integer.valueOf(intValue & 14));
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                jk4 jk4Var = (jk4) obj;
                Float f = (Float) obj2;
                f.floatValue();
                Float f2 = (Float) obj4;
                f2.floatValue();
                fo2Var.e(f, (jk4) obj3, f2);
                return jg7Var;
        }
    }
}
