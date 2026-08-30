package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qj0  reason: default package */
/* loaded from: classes.dex */
public final class qj0 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ tj0 c0;
    public final /* synthetic */ w92 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(tj0 tj0Var, w92 w92Var, Object obj, j11 j11Var) {
        super(2, j11Var);
        this.c0 = tj0Var;
        this.d0 = w92Var;
        this.Z = obj;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((qj0) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((qj0) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        w92 w92Var = this.d0;
        tj0 tj0Var = this.c0;
        switch (i) {
            case 0:
                return new qj0(tj0Var, w92Var, this.Z, j11Var);
            default:
                qj0 qj0Var = new qj0(tj0Var, w92Var, j11Var);
                qj0Var.Z = obj;
                return qj0Var;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                bj2 bj2Var = this.c0.X;
                Object obj2 = this.Z;
                this.Y = 1;
                if (bj2Var.i(this.d0, obj2, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                o31 o31Var = (o31) this.Z;
                Object obj3 = new Object();
                tj0 tj0Var = this.c0;
                u92 u92Var = tj0Var.R;
                sj0 sj0Var = new sj0(obj3, o31Var, tj0Var, this.d0, 0);
                this.Y = 1;
                if (u92Var.a(sj0Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(tj0 tj0Var, w92 w92Var, j11 j11Var) {
        super(2, j11Var);
        this.c0 = tj0Var;
        this.d0 = w92Var;
    }
}
