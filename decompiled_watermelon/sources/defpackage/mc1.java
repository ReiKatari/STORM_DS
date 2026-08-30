package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mc1  reason: default package */
/* loaded from: classes.dex */
public final class mc1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ pc1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc1(pc1 pc1Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = pc1Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((mc1) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((mc1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((mc1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        pc1 pc1Var = this.Z;
        switch (i) {
            case 0:
                return new mc1(pc1Var, j11Var, 0);
            case 1:
                return new mc1(pc1Var, j11Var, 1);
            default:
                return new mc1(pc1Var, j11Var, 2);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        pc1 pc1Var = this.Z;
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
                t47 k = pc1.k(pc1Var);
                this.Y = 1;
                Object f = k.f(this);
                if (f == p31Var) {
                    return p31Var;
                }
                return f;
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
                ic1 g = pc1.k(pc1Var).g();
                this.Y = 1;
                Object h = ((gs0) g).h(this);
                if (h == p31Var2) {
                    return p31Var2;
                }
                return h;
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ic1 c = pc1.k(pc1Var).c();
                this.Y = 1;
                Object h2 = ((gs0) c).h(this);
                if (h2 == p31Var3) {
                    return p31Var3;
                }
                return h2;
        }
    }
}
