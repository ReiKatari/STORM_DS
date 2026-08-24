package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: no3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class no3 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qn2 B;

    public /* synthetic */ no3(int i, qn2 qn2Var) {
        this.A = i;
        this.B = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        qn2 qn2Var = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                return (ju2) qn2Var.g((cp3) obj);
            case 1:
                qn2Var.g(new to5(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
                return jg7Var;
            default:
                jg7 jg7Var2 = (jg7) obj2;
                qn2Var.g(obj);
                return jg7Var;
        }
    }
}
