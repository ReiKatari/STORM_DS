package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e0  reason: default package */
/* loaded from: classes.dex */
public final class e0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ g0 Z;
    public final /* synthetic */ jt4 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(g0 g0Var, jt4 jt4Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = g0Var;
        this.c0 = jt4Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((e0) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((e0) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((e0) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((e0) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        jt4 jt4Var = this.c0;
        g0 g0Var = this.Z;
        switch (i) {
            case 0:
                return new e0(g0Var, jt4Var, j11Var, 0);
            case 1:
                return new e0(g0Var, jt4Var, j11Var, 1);
            case 2:
                return new e0(g0Var, jt4Var, j11Var, 2);
            default:
                return new e0(g0Var, jt4Var, j11Var, 3);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        jt4 jt4Var = this.c0;
        g0 g0Var = this.Z;
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
                l14 l14Var = g0Var.l0;
                if (l14Var != null) {
                    it4 it4Var = new it4(jt4Var);
                    this.Y = 1;
                    if (l14Var.a(it4Var, this) == p31Var) {
                        return p31Var;
                    }
                    return o27Var;
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
                l14 l14Var2 = g0Var.l0;
                if (l14Var2 != null) {
                    it4 it4Var2 = new it4(jt4Var);
                    this.Y = 1;
                    if (l14Var2.a(it4Var2, this) == p31Var2) {
                        return p31Var2;
                    }
                    return o27Var;
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
                l14 l14Var3 = g0Var.l0;
                if (l14Var3 != null) {
                    this.Y = 1;
                    if (l14Var3.a(jt4Var, this) == p31Var3) {
                        return p31Var3;
                    }
                    return o27Var;
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
                l14 l14Var4 = g0Var.l0;
                if (l14Var4 != null) {
                    kt4 kt4Var = new kt4(jt4Var);
                    this.Y = 1;
                    if (l14Var4.a(kt4Var, this) == p31Var4) {
                        return p31Var4;
                    }
                    return o27Var;
                }
                return o27Var;
        }
    }
}
