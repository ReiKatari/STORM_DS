package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r00  reason: default package */
/* loaded from: classes.dex */
public final class r00 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ nd3 Z;
    public final /* synthetic */ s00 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r00(s00 s00Var, nd3 nd3Var, j11 j11Var) {
        super(2, j11Var);
        this.c0 = s00Var;
        this.Z = nd3Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((r00) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((r00) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new r00(this.c0, this.Z, j11Var);
            default:
                return new r00(this.Z, this.c0, j11Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        s00 s00Var = this.c0;
        nd3 nd3Var = this.Z;
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
                k43 k43Var = s00Var.b;
                this.Y = 1;
                if (k43Var.f(nd3Var, this) == p31Var) {
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
                if (b53.x(nd3Var.a, s00Var.f().A.getValue())) {
                    s00Var.e();
                }
                k43 k43Var2 = s00Var.b;
                this.Y = 1;
                if (k43Var2.b(nd3Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r00(nd3 nd3Var, s00 s00Var, j11 j11Var) {
        super(2, j11Var);
        this.Z = nd3Var;
        this.c0 = s00Var;
    }
}
