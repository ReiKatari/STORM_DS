package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ze3  reason: default package */
/* loaded from: classes.dex */
public final class ze3 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ bf3 Z;
    public final /* synthetic */ nd3 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze3(bf3 bf3Var, nd3 nd3Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = bf3Var;
        this.c0 = nd3Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((ze3) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((ze3) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        nd3 nd3Var = this.c0;
        bf3 bf3Var = this.Z;
        switch (i) {
            case 0:
                return new ze3(bf3Var, nd3Var, j11Var, 0);
            default:
                return new ze3(bf3Var, nd3Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        bf3 bf3Var = this.Z;
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
                k43 k43Var = bf3Var.b;
                this.Y = 1;
                if (k43Var.f(this.c0, this) == p31Var) {
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
                k43 k43Var2 = bf3Var.b;
                nd3 a = nd3.a(this.c0, null, null, ld3.CUSTOM, null, false, 0, null, 122);
                this.Y = 1;
                if (k43Var2.f(a, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }
}
