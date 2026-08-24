package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lk0 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ sg0 B;

    public /* synthetic */ lk0(sg0 sg0Var, int i) {
        this.A = i;
        this.B = sg0Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        boolean V;
        int i = this.A;
        sg0 sg0Var = this.B;
        switch (i) {
            case 0:
                V = nc1.V(sg0Var);
                break;
            default:
                kg0 kg0Var = lg0.g;
                lg0 lg0Var = sg0Var.b;
                kg0Var.getClass();
                V = kg0.c(lg0Var);
                break;
        }
        return Boolean.valueOf(V);
    }
}
