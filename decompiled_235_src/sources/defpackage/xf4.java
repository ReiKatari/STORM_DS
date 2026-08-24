package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xf4 implements eo2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ ao2 X;

    public /* synthetic */ xf4(String str, boolean z, boolean z2, qn2 qn2Var, int i) {
        this.R = str;
        this.B = z;
        this.L = z2;
        this.X = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        ao2 ao2Var = this.X;
        Object obj3 = this.R;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(1);
                f04.j(this.B, this.L, (on2) obj3, (on2) ao2Var, (px0) obj, a0);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                int a02 = ii2.a0(1);
                lt5.c((String) obj3, this.B, this.L, (qn2) ao2Var, (px0) obj, a02);
                return jg7Var;
        }
    }

    public /* synthetic */ xf4(boolean z, boolean z2, on2 on2Var, on2 on2Var2, int i) {
        this.B = z;
        this.L = z2;
        this.R = on2Var;
        this.X = on2Var2;
    }
}
