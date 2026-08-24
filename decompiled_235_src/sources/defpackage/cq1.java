package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cq1 implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ float R;
    public final /* synthetic */ Object X;

    public /* synthetic */ cq1(String str, boolean z, float f, qa4 qa4Var) {
        this.B = str;
        this.L = z;
        this.R = f;
        this.X = qa4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z2 = true;
        Object obj3 = this.X;
        switch (i) {
            case 0:
                qa4 qa4Var = (qa4) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    if (!((Boolean) qa4Var.getValue()).booleanValue() || this.L) {
                        z2 = false;
                    }
                    nc1.h(this.B, z2, this.R, xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                uj2.g(this.B, this.L, (qn2) obj3, this.R, (px0) obj, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ cq1(String str, boolean z, qn2 qn2Var, float f, int i) {
        this.B = str;
        this.L = z;
        this.X = qn2Var;
        this.R = f;
    }
}
