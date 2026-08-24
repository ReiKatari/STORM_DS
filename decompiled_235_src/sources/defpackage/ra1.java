package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ra1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ra1 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pa1 B;
    public final /* synthetic */ on2 L;
    public final /* synthetic */ qn2 R;
    public final /* synthetic */ eo2 X;
    public final /* synthetic */ int Y;

    public /* synthetic */ ra1(pa1 pa1Var, on2 on2Var, qn2 qn2Var, eo2 eo2Var, int i, int i2) {
        this.A = i2;
        this.B = pa1Var;
        this.L = on2Var;
        this.R = qn2Var;
        this.X = eo2Var;
        this.Y = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = this.Y;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int a0 = ii2.a0(i2 | 1);
                nb3.f(this.B, this.L, this.R, this.X, (px0) obj, a0);
                return jg7Var;
            case 1:
                ((Integer) obj2).intValue();
                int a02 = ii2.a0(i2 | 1);
                nb3.h(this.B, this.L, this.R, this.X, (px0) obj, a02);
                return jg7Var;
            default:
                ((Integer) obj2).intValue();
                int a03 = ii2.a0(i2 | 1);
                nb3.j(this.B, this.L, this.R, this.X, (px0) obj, a03);
                return jg7Var;
        }
    }
}
