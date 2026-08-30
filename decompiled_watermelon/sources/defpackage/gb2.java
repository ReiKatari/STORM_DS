package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gb2  reason: default package */
/* loaded from: classes.dex */
public final class gb2 implements u92 {
    public final /* synthetic */ u92 A;
    public final /* synthetic */ u92 B;
    public final /* synthetic */ bj2 L;

    public gb2(u92 u92Var, u92 u92Var2, bj2 bj2Var) {
        this.A = u92Var;
        this.B = u92Var2;
        this.L = bj2Var;
    }

    @Override // defpackage.u92
    public final Object a(w92 w92Var, j11 j11Var) {
        Object G = n40.G(j11Var, w92Var, ux.R, new dx1(this.L, (j11) null, 5), new u92[]{this.A, this.B});
        if (G == p31.COROUTINE_SUSPENDED) {
            return G;
        }
        return o27.a;
    }
}
