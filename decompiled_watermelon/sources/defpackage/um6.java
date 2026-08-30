package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: um6  reason: default package */
/* loaded from: classes.dex */
public final class um6 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ bj2 Z;
    public final /* synthetic */ ht4 c0;
    public final /* synthetic */ rp4 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um6(bj2 bj2Var, ht4 ht4Var, rp4 rp4Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = bj2Var;
        this.c0 = ht4Var;
        this.d0 = rp4Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((um6) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((um6) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new um6(this.Z, this.c0, this.d0, j11Var, 0);
            default:
                return new um6(this.Z, this.c0, this.d0, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        rp4 rp4Var = this.d0;
        ht4 ht4Var = this.c0;
        bj2 bj2Var = this.Z;
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
                mb4 mb4Var = new mb4(rp4Var.c);
                this.Y = 1;
                if (bj2Var.i(ht4Var, mb4Var, this) == p31Var) {
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
                mb4 mb4Var2 = new mb4(rp4Var.c);
                this.Y = 1;
                if (bj2Var.i(ht4Var, mb4Var2, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }
}
