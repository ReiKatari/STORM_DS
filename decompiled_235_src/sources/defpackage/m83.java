package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m83  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m83 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ dx4 L;
    public final /* synthetic */ int R;

    public /* synthetic */ m83(int i, dx4 dx4Var, int i2) {
        this.A = 1;
        this.B = i;
        this.L = dx4Var;
        this.R = i2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = this.R;
        int i3 = this.B;
        dx4 dx4Var = this.L;
        cx4 cx4Var = (cx4) obj;
        switch (i) {
            case 0:
                cx4.j(cx4Var, dx4Var, i3, i2);
                return jg7Var;
            case 1:
                cx4.j(cx4Var, dx4Var, u24.E((i3 - dx4Var.A) / 2.0f), u24.E((i2 - dx4Var.B) / 2.0f));
                return jg7Var;
            default:
                cx4.j(cx4Var, dx4Var, i3, i2);
                return jg7Var;
        }
    }

    public /* synthetic */ m83(dx4 dx4Var, int i, int i2, int i3) {
        this.A = i3;
        this.L = dx4Var;
        this.B = i;
        this.R = i2;
    }
}
