package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jy0  reason: default package */
/* loaded from: classes.dex */
public final class jy0 extends aj3 implements eo2 {
    public final /* synthetic */ int B = 1;
    public final /* synthetic */ eo2 L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(zp4 zp4Var, vm vmVar, eo2 eo2Var, int i) {
        super(2);
        this.R = zp4Var;
        this.X = vmVar;
        this.L = eo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.B;
        jg7 jg7Var = jg7.a;
        eo2 eo2Var = this.L;
        Object obj3 = this.X;
        Object obj4 = this.R;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ky0.a((zp4) obj4, (vm) obj3, eo2Var, (px0) obj, ii2.a0(1));
                return jg7Var;
            default:
                px0 px0Var = (px0) obj;
                int intValue = ((Number) obj2).intValue();
                xx7 xx7Var = (xx7) obj4;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    te teVar = xx7Var.A;
                    boolean h = xq2Var.h(xx7Var);
                    Object P = xq2Var.P();
                    vs0 vs0Var = ox0.a;
                    if (h || P == vs0Var) {
                        P = new wx7(xx7Var, null, 0);
                        xq2Var.l0(P);
                    }
                    mb3.i(xq2Var, (eo2) P, teVar);
                    boolean h2 = xq2Var.h(xx7Var);
                    Object P2 = xq2Var.P();
                    if (h2 || P2 == vs0Var) {
                        P2 = new wx7(xx7Var, null, 1);
                        xq2Var.l0(P2);
                    }
                    mb3.i(xq2Var, (eo2) P2, teVar);
                    ((mx0) obj3).a(teVar, eo2Var, xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(xx7 xx7Var, mx0 mx0Var, eo2 eo2Var) {
        super(2);
        this.R = xx7Var;
        this.X = mx0Var;
        this.L = eo2Var;
    }
}
