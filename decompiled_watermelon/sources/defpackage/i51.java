package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i51  reason: default package */
/* loaded from: classes.dex */
public final class i51 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ mi2 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i51(mi2 mi2Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 2;
        this.c0 = mi2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((i51) t((j11) obj2, (zj4) obj)).v(o27Var);
            case 1:
                return ((i51) t((j11) obj2, (zj4) obj)).v(o27Var);
            default:
                return ((i51) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                i51 i51Var = new i51(0, j11Var, this.c0);
                i51Var.Z = obj;
                return i51Var;
            case 1:
                i51 i51Var2 = new i51(1, j11Var, this.c0);
                i51Var2.Z = obj;
                return i51Var2;
            default:
                i51 i51Var3 = new i51(this.c0, j11Var);
                i51Var3.Z = obj;
                return i51Var3;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        mi2 mi2Var = this.c0;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                zj4 zj4Var = (zj4) this.Z;
                this.Y = 1;
                Object n = mi2Var.n(this);
                if (n == p31Var) {
                    return p31Var;
                }
                return n;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                zj4 zj4Var2 = (zj4) this.Z;
                this.Y = 1;
                Object n2 = mi2Var.n(this);
                if (n2 == p31Var2) {
                    return p31Var2;
                }
                return n2;
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                } else {
                    me2.a0(obj);
                    if (((o31) this.Z).w().I(ow6.B) != null) {
                        this.Y = 1;
                        Object n3 = mi2Var.n(this);
                        if (n3 == p31Var3) {
                            return p31Var3;
                        }
                        return n3;
                    }
                    i.n("Expected a TransactionElement in the CoroutineContext but none was found.");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i51(int i, j11 j11Var, mi2 mi2Var) {
        super(2, j11Var);
        this.X = i;
        this.c0 = mi2Var;
    }
}
