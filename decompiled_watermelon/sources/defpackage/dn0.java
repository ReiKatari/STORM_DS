package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dn0  reason: default package */
/* loaded from: classes.dex */
public final class dn0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ pn0 Z;
    public final /* synthetic */ l44 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn0(pn0 pn0Var, l44 l44Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = pn0Var;
        this.c0 = l44Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((dn0) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((dn0) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((dn0) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((dn0) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new dn0(this.Z, this.c0, j11Var, 0);
            case 1:
                return new dn0(this.Z, this.c0, j11Var, 1);
            case 2:
                return new dn0(this.Z, this.c0, j11Var, 2);
            default:
                return new dn0(this.Z, this.c0, j11Var, 3);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        l44 l44Var = this.c0;
        pn0 pn0Var = this.Z;
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
                mj0 mj0Var = pn0Var.m;
                cn0 cn0Var = new cn0(l44Var, 0);
                this.Y = 1;
                if (mj0Var.a(cn0Var, this) == p31Var) {
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
                mj0 mj0Var2 = pn0Var.o;
                cn0 cn0Var2 = new cn0(l44Var, 1);
                this.Y = 1;
                if (mj0Var2.a(cn0Var2, this) == p31Var2) {
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
                mj0 mj0Var3 = pn0Var.q;
                cn0 cn0Var3 = new cn0(l44Var, 2);
                this.Y = 1;
                if (mj0Var3.a(cn0Var3, this) == p31Var3) {
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
                mj0 mj0Var4 = pn0Var.s;
                cn0 cn0Var4 = new cn0(l44Var, 3);
                this.Y = 1;
                if (mj0Var4.a(cn0Var4, this) == p31Var4) {
                    return p31Var4;
                }
                return o27Var;
        }
    }
}
