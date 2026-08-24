package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kx0  reason: default package */
/* loaded from: classes.dex */
public final class kx0 extends aj3 implements eo2 {
    public final /* synthetic */ int B = 1;
    public final /* synthetic */ mx0 L;
    public final /* synthetic */ te R;
    public final /* synthetic */ eo2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx0(te teVar, mx0 mx0Var, eo2 eo2Var) {
        super(2);
        this.R = teVar;
        this.L = mx0Var;
        this.X = eo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.B;
        jg7 jg7Var = jg7.a;
        eo2 eo2Var = this.X;
        te teVar = this.R;
        mx0 mx0Var = this.L;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    xq2Var.b0(866651995);
                    ky0.a(teVar, mx0Var.k, eo2Var, xq2Var, 0);
                    xq2Var.p(false);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                ((Number) obj2).intValue();
                mx0Var.a(teVar, eo2Var, (px0) obj, ii2.a0(1));
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx0(mx0 mx0Var, te teVar, eo2 eo2Var, int i) {
        super(2);
        this.L = mx0Var;
        this.R = teVar;
        this.X = eo2Var;
    }
}
