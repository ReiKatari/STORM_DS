package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dz3 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ g17 B;

    public /* synthetic */ dz3(g17 g17Var, int i) {
        this.A = i;
        this.B = g17Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        g17 g17Var = this.B;
        switch (i) {
            case 0:
                g17Var.b();
                return jg7Var;
            default:
                g17Var.onCancel();
                return jg7Var;
        }
    }
}
