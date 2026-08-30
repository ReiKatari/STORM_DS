package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nc1  reason: default package */
/* loaded from: classes.dex */
public final class nc1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ pc1 Z;
    public final /* synthetic */ Map c0;
    public final /* synthetic */ m47 d0;
    public final /* synthetic */ bw0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc1(pc1 pc1Var, j11 j11Var, Map map, m47 m47Var, bw0 bw0Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = pc1Var;
        this.c0 = map;
        this.d0 = m47Var;
        this.e0 = bw0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((nc1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((nc1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new nc1(this.Z, j11Var, this.c0, this.d0, this.e0, 0);
            default:
                return new nc1(this.Z, j11Var, this.c0, this.d0, this.e0, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        bw0 bw0Var = this.e0;
        m47 m47Var = this.d0;
        Map map = this.c0;
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
                ic1 e = pc1.k(pc1Var).e(map, m47Var, bw0Var);
                this.Y = 1;
                Object h = ((gs0) e).h(this);
                if (h == p31Var) {
                    return p31Var;
                }
                return h;
            default:
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
                ic1 b = pc1.k(pc1Var).b(map, m47Var, bw0Var);
                this.Y = 1;
                Object F = b.F(this);
                if (F == p31Var2) {
                    return p31Var2;
                }
                return F;
        }
    }
}
