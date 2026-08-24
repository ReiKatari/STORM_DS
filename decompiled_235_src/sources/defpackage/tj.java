package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tj  reason: default package */
/* loaded from: classes.dex */
public final class tj extends aj3 implements qn2 {
    public final /* synthetic */ c05 B;
    public final /* synthetic */ on2 L;
    public final /* synthetic */ g05 R;
    public final /* synthetic */ String X;
    public final /* synthetic */ kk3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(c05 c05Var, on2 on2Var, g05 g05Var, String str, kk3 kk3Var) {
        super(1);
        this.B = c05Var;
        this.L = on2Var;
        this.R = g05Var;
        this.X = str;
        this.Y = kk3Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        gl1 gl1Var = (gl1) obj;
        c05 c05Var = this.B;
        c05Var.o0.addView(c05Var, c05Var.p0);
        c05Var.n(this.L, this.R, this.X, this.Y);
        return new z3(c05Var, 3);
    }
}
