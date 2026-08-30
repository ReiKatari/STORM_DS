package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hj  reason: default package */
/* loaded from: classes.dex */
public final class hj extends ic3 implements mi2 {
    public final /* synthetic */ yq4 B;
    public final /* synthetic */ ki2 L;
    public final /* synthetic */ dr4 R;
    public final /* synthetic */ String X;
    public final /* synthetic */ sd3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(yq4 yq4Var, ki2 ki2Var, dr4 dr4Var, String str, sd3 sd3Var) {
        super(1);
        this.B = yq4Var;
        this.L = ki2Var;
        this.R = dr4Var;
        this.X = str;
        this.Y = sd3Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ch1 ch1Var = (ch1) obj;
        yq4 yq4Var = this.B;
        yq4Var.n0.addView(yq4Var, yq4Var.o0);
        yq4Var.n(this.L, this.R, this.X, this.Y);
        return new y3(3, yq4Var);
    }
}
