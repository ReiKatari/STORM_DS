package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k7  reason: default package */
/* loaded from: classes.dex */
public final class k7 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ga7 B;

    public /* synthetic */ k7(ga7 ga7Var, int i) {
        this.A = i;
        this.B = ga7Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        ga7 ga7Var = this.B;
        switch (i) {
            case 0:
                return ga7Var.d.getValue();
            case 1:
                return ga7Var.f();
            case 2:
                return ga7Var.d.getValue();
            default:
                return ga7Var.f();
        }
    }
}
