package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qn  reason: default package */
/* loaded from: classes.dex */
public final class qn extends aj3 implements qn2 {
    public final /* synthetic */ dx4[] B;
    public final /* synthetic */ rn L;
    public final /* synthetic */ int R;
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(dx4[] dx4VarArr, rn rnVar, int i, int i2) {
        super(1);
        this.B = dx4VarArr;
        this.L = rnVar;
        this.R = i;
        this.X = i2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        dx4[] dx4VarArr;
        cx4 cx4Var = (cx4) obj;
        for (dx4 dx4Var : this.B) {
            if (dx4Var != null) {
                long a = this.L.a.b.a((dx4Var.A << 32) | (dx4Var.B & 4294967295L), (this.R << 32) | (this.X & 4294967295L), kk3.Ltr);
                cx4.j(cx4Var, dx4Var, (int) (a >> 32), (int) (a & 4294967295L));
            }
        }
        return jg7.a;
    }
}
