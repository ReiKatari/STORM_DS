package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aa2  reason: default package */
/* loaded from: classes.dex */
public final class aa2 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ u92 Z;
    public final /* synthetic */ mu4 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa2(u92 u92Var, mu4 mu4Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = u92Var;
        this.c0 = mu4Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((aa2) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((aa2) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new aa2(this.Z, this.c0, j11Var, 0);
            default:
                return new aa2(this.Z, this.c0, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        mu4 mu4Var = this.c0;
        u92 u92Var = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    me2.a0(obj);
                    return o27Var;
                }
                me2.a0(obj);
                z92 z92Var = new z92(mu4Var, 0);
                this.Y = 1;
                if (u92Var.a(z92Var, this) == p31Var) {
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
                z92 z92Var2 = new z92(mu4Var, 2);
                this.Y = 1;
                if (u92Var.a(z92Var2, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }
}
