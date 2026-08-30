package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: es3  reason: default package */
/* loaded from: classes.dex */
public final class es3 extends ic3 implements ki2 {
    public final /* synthetic */ fs3 B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ ao4 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es3(fs3 fs3Var, long j, long j2, ao4 ao4Var) {
        super(0);
        this.B = fs3Var;
        this.L = j;
        this.R = j2;
        this.X = ao4Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        fs3 fs3Var = this.B;
        fs3Var.J0().A = false;
        fs3Var.J0().B = this.L;
        fs3Var.J0().L = this.R;
        mi2 d = this.X.A.d();
        if (d != null) {
            d.n(fs3Var.J0());
        }
        return o27.a;
    }
}
