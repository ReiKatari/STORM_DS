package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j01  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j01 implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ j01(String str, boolean z, boolean z2, on2 on2Var, int i, int i2) {
        this.Y = str;
        this.B = z;
        this.L = z2;
        this.Z = on2Var;
        this.R = i;
        this.X = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = this.R;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(i2 | 1);
                mb3.c((String) obj4, this.B, this.L, (on2) obj3, (px0) obj, a0, this.X);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                int a02 = ii2.a0(i2 | 1);
                is7.f(this.B, (qn2) obj4, (a74) obj3, this.L, (px0) obj, a02, this.X);
                return jg7Var;
        }
    }

    public /* synthetic */ j01(boolean z, qn2 qn2Var, a74 a74Var, boolean z2, int i, int i2) {
        this.B = z;
        this.Y = qn2Var;
        this.Z = a74Var;
        this.L = z2;
        this.R = i;
        this.X = i2;
    }
}
