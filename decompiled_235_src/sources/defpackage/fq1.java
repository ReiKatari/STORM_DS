package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fq1 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ float L;

    public /* synthetic */ fq1(float f, int i, a74 a74Var) {
        this.A = 0;
        this.L = f;
        this.B = a74Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        float f = this.L;
        Object obj3 = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(1);
                nc1.u(f, a0, (px0) obj, (a74) obj3);
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                int a02 = ii2.a0(49);
                js7.a(f, a02, (px0) obj, (a74) obj3);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                l.a((String) obj3, f, (px0) obj, ii2.a0(49));
                return jg7Var;
        }
    }

    public /* synthetic */ fq1(Object obj, float f, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = f;
    }
}
