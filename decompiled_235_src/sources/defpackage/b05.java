package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b05  reason: default package */
/* loaded from: classes.dex */
public final class b05 extends aj3 implements on2 {
    public final /* synthetic */ ch5 B;
    public final /* synthetic */ c05 L;
    public final /* synthetic */ m93 R;
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b05(ch5 ch5Var, c05 c05Var, m93 m93Var, long j, long j2) {
        super(0);
        this.B = ch5Var;
        this.L = c05Var;
        this.R = m93Var;
        this.X = j;
        this.Y = j2;
    }

    @Override // defpackage.on2
    public final Object c() {
        c05 c05Var = this.L;
        this.B.A = c05Var.getPositionProvider().a(this.R, this.X, c05Var.getParentLayoutDirection(), this.Y);
        return jg7.a;
    }
}
