package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d51  reason: default package */
/* loaded from: classes.dex */
public final class d51 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mi2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d51(int i, j11 j11Var, mi2 mi2Var) {
        super(2, j11Var);
        this.X = i;
        this.Z = mi2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        zj4 zj4Var = (zj4) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((d51) t(j11Var, zj4Var)).v(o27Var);
            default:
                return ((d51) t(j11Var, zj4Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        mi2 mi2Var = this.Z;
        switch (i) {
            case 0:
                d51 d51Var = new d51(0, j11Var, mi2Var);
                d51Var.Y = obj;
                return d51Var;
            default:
                d51 d51Var2 = new d51(1, j11Var, mi2Var);
                d51Var2.Y = obj;
                return d51Var2;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        mi2 mi2Var = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                zj4 zj4Var = (zj4) this.Y;
                zj4Var.getClass();
                return mi2Var.n(zj4Var.c());
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                zj4 zj4Var2 = (zj4) this.Y;
                zj4Var2.getClass();
                return mi2Var.n(zj4Var2.c());
        }
    }
}
