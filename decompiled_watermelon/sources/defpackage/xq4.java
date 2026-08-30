package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xq4  reason: default package */
/* loaded from: classes.dex */
public final class xq4 extends ic3 implements ki2 {
    public final /* synthetic */ m75 B;
    public final /* synthetic */ yq4 L;
    public final /* synthetic */ e33 R;
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq4(m75 m75Var, yq4 yq4Var, e33 e33Var, long j, long j2) {
        super(0);
        this.B = m75Var;
        this.L = yq4Var;
        this.R = e33Var;
        this.X = j;
        this.Y = j2;
    }

    @Override // defpackage.ki2
    public final Object c() {
        yq4 yq4Var = this.L;
        this.B.A = yq4Var.getPositionProvider().a(this.R, this.X, yq4Var.getParentLayoutDirection(), this.Y);
        return o27.a;
    }
}
