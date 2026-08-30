package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g51  reason: default package */
/* loaded from: classes.dex */
public final class g51 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ e31 Y;
    public final /* synthetic */ sq5 Z;
    public final /* synthetic */ boolean c0;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ mi2 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g51(e31 e31Var, sq5 sq5Var, boolean z, boolean z2, mi2 mi2Var, j11 j11Var) {
        super(2, j11Var);
        this.Y = e31Var;
        this.Z = sq5Var;
        this.c0 = z;
        this.d0 = z2;
        this.e0 = mi2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((g51) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new g51(this.Y, this.Z, this.c0, this.d0, this.e0, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
                return obj;
            }
            i.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        me2.a0(obj);
        f51 f51Var = new f51(this.Z, this.c0, this.d0, this.e0, (j11) null);
        this.X = 1;
        Object G = tq5.G(this.Y, f51Var, this);
        if (G == p31Var) {
            return p31Var;
        }
        return G;
    }
}
