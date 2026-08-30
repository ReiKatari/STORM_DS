package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wb2  reason: default package */
/* loaded from: classes.dex */
public final class wb2 implements u92 {
    public final /* synthetic */ u92 A;
    public final /* synthetic */ sq5 B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ mi2 R;

    public wb2(u92 u92Var, sq5 sq5Var, boolean z, mi2 mi2Var) {
        this.A = u92Var;
        this.B = sq5Var;
        this.L = z;
        this.R = mi2Var;
    }

    @Override // defpackage.u92
    public final Object a(w92 w92Var, j11 j11Var) {
        Object a = this.A.a(new vb2(w92Var, this.B, this.L, this.R), j11Var);
        if (a == p31.COROUTINE_SUSPENDED) {
            return a;
        }
        return o27.a;
    }
}
