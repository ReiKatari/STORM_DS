package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: va6  reason: default package */
/* loaded from: classes.dex */
public final class va6 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ aj2 c0;
    public final /* synthetic */ k24 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va6(aj2 aj2Var, k24 k24Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = aj2Var;
        this.d0 = k24Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((va6) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((va6) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((va6) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((va6) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                va6 va6Var = new va6(this.c0, this.d0, j11Var, 0);
                va6Var.Z = obj;
                return va6Var;
            case 1:
                va6 va6Var2 = new va6(this.c0, this.d0, j11Var, 1);
                va6Var2.Z = obj;
                return va6Var2;
            case 2:
                va6 va6Var3 = new va6(this.c0, this.d0, j11Var, 2);
                va6Var3.Z = obj;
                return va6Var3;
            default:
                va6 va6Var4 = new va6(this.c0, this.d0, j11Var, 3);
                va6Var4.Z = obj;
                return va6Var4;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        k24 k24Var = this.d0;
        aj2 aj2Var = this.c0;
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
                mu4 mu4Var = new mu4(k24Var, ((o31) this.Z).w());
                this.Y = 1;
                if (aj2Var.j(mu4Var, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
            case 1:
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
                mu4 mu4Var2 = new mu4(k24Var, ((o31) this.Z).w());
                this.Y = 1;
                if (aj2Var.j(mu4Var2, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                mu4 mu4Var3 = new mu4(k24Var, ((o31) this.Z).w());
                this.Y = 1;
                if (aj2Var.j(mu4Var3, this) == p31Var3) {
                    return p31Var3;
                }
                return o27Var;
            default:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                mu4 mu4Var4 = new mu4(k24Var, ((o31) this.Z).w());
                this.Y = 1;
                if (aj2Var.j(mu4Var4, this) == p31Var4) {
                    return p31Var4;
                }
                return o27Var;
        }
    }
}
