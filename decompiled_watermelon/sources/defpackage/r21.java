package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r21  reason: default package */
/* loaded from: classes.dex */
public final class r21 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ vp4 Z;
    public final /* synthetic */ vo6 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r21(vp4 vp4Var, vo6 vo6Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = vp4Var;
        this.c0 = vo6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((r21) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((r21) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((r21) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new r21(this.Z, this.c0, j11Var, 0);
            case 1:
                return new r21(this.Z, this.c0, j11Var, 1);
            default:
                return new r21(this.Z, this.c0, j11Var, 2);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        vo6 vo6Var = this.c0;
        vp4 vp4Var = this.Z;
        Object obj2 = o27.a;
        switch (i) {
            case 0:
                Object obj3 = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return obj2;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                this.Y = 1;
                Object k = iq2.k(new ug(vp4Var, vo6Var, null, 5), this);
                if (k != obj3) {
                    k = obj2;
                }
                if (k == obj3) {
                    return obj3;
                }
                return obj2;
            case 1:
                Object obj4 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return obj2;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                this.Y = 1;
                Object m = ve2.m(vp4Var, new ue2(vo6Var, null, 1), this);
                if (m != obj4) {
                    m = obj2;
                }
                if (m == obj4) {
                    return obj4;
                }
                return obj2;
            default:
                Object obj5 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return obj2;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                this.Y = 1;
                xr3 xr3Var = new xr3(vo6Var, 0);
                yr3 yr3Var = new yr3(vo6Var, 0);
                yr3 yr3Var2 = new yr3(vo6Var, 1);
                z5 z5Var = new z5(18, vo6Var);
                float f = mj1.a;
                Object m2 = ve2.m(vp4Var, new ij1(new d5(28), new km4(6, xr3Var), z5Var, yr3Var2, new j0(21, yr3Var), (j11) null), this);
                Object obj6 = m2;
                if (m2 != obj5) {
                    obj6 = obj2;
                }
                if (obj6 != obj5) {
                    obj6 = obj2;
                }
                if (obj6 != obj5) {
                    obj6 = obj2;
                }
                if (obj6 == obj5) {
                    return obj5;
                }
                return obj2;
        }
    }
}
