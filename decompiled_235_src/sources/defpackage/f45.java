package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f45  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f45 implements qn2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ bs0 B;
    public final /* synthetic */ int L;

    public /* synthetic */ f45(float f, bs0 bs0Var, int i) {
        this.A = f;
        this.B = bs0Var;
        this.L = i;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Float valueOf = Float.valueOf(this.A);
        bs0 bs0Var = this.B;
        x35 x35Var = new x35(((Number) gi2.t(valueOf, bs0Var)).floatValue(), bs0Var, this.L);
        fg3[] fg3VarArr = eb6.a;
        fb6 fb6Var = bb6.c;
        fg3 fg3Var = eb6.a[1];
        ((gb6) obj).a(fb6Var, x35Var);
        return jg7.a;
    }
}
