package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ia7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ia7 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ga7 B;

    public /* synthetic */ ia7(ga7 ga7Var, int i) {
        this.A = i;
        this.B = ga7Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        ga7 ga7Var = this.B;
        gl1 gl1Var = (gl1) obj;
        switch (i) {
            case 0:
                return new ka7(ga7Var, 0);
            default:
                return new ka7(ga7Var, 1);
        }
    }
}
