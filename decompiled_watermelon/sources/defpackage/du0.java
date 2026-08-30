package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: du0  reason: default package */
/* loaded from: classes.dex */
public final class du0 extends nk6 implements bj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du0(Object obj, j11 j11Var, int i) {
        super(3, j11Var);
        this.X = i;
        this.Y = obj;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        w92 w92Var = (w92) obj;
        Throwable th = (Throwable) obj2;
        j11 j11Var = (j11) obj3;
        switch (i) {
            case 0:
                new du0((j75) this.Y, j11Var, 0).v(o27Var);
                return o27Var;
            case 1:
                new du0((tf0) this.Y, j11Var, 1).v(o27Var);
                return o27Var;
            default:
                du0 du0Var = new du0(3, j11Var);
                du0Var.Y = th;
                du0Var.v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ((j75) this.Y).A = true;
                return o27Var;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                tf0 tf0Var = (tf0) this.Y;
                ee6 ee6Var = (ee6) tf0Var.Z;
                ee6Var.getClass();
                ee6Var.l(null, pp1.A);
                q60 q60Var = (q60) tf0Var.Y;
                if (q60Var != null) {
                    q60Var.i(null);
                }
                tf0Var.Y = null;
                return o27Var;
            default:
                Throwable th = (Throwable) this.Y;
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (th instanceof lt6) {
                    return o27Var;
                }
                throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du0(int i, j11 j11Var) {
        super(i, j11Var);
        this.X = 2;
    }
}
