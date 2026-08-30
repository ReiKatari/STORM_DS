package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v12  reason: default package */
/* loaded from: classes.dex */
public final class v12 extends x12 {
    public final ih0 L;
    public final /* synthetic */ z12 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v12(z12 z12Var, long j, ih0 ih0Var) {
        super(j);
        this.R = z12Var;
        this.L = ih0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.L.H(this.R, o27.a);
    }

    @Override // defpackage.x12
    public final String toString() {
        return super.toString() + this.L;
    }
}
