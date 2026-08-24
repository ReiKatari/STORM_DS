package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vn  reason: default package */
/* loaded from: classes.dex */
public final class vn extends aj3 implements qn2 {
    public final /* synthetic */ xn B;
    public final /* synthetic */ dx4 L;
    public final /* synthetic */ long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(xn xnVar, dx4 dx4Var, long j) {
        super(1);
        this.B = xnVar;
        this.L = dx4Var;
        this.R = j;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        ic icVar = this.B.n0.b;
        dx4 dx4Var = this.L;
        int i = dx4Var.A;
        cx4.k((cx4) obj, dx4Var, icVar.a((dx4Var.B & 4294967295L) | (i << 32), this.R, kk3.Ltr));
        return jg7.a;
    }
}
