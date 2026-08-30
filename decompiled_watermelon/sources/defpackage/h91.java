package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h91  reason: default package */
/* loaded from: classes.dex */
public final class h91 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ l14 Z;
    public final /* synthetic */ xa6 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h91(l14 l14Var, xa6 xa6Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = l14Var;
        this.c0 = xa6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((h91) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((h91) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((h91) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new h91(this.Z, this.c0, j11Var, 0);
            case 1:
                return new h91(this.Z, this.c0, j11Var, 1);
            default:
                return new h91(this.Z, this.c0, j11Var, 2);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        xa6 xa6Var = this.c0;
        l14 l14Var = this.Z;
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
                c46 c46Var = l14Var.a;
                g91 g91Var = new g91(xa6Var, 0);
                this.Y = 1;
                c46Var.getClass();
                if (c46.l(c46Var, g91Var, this) == p31Var) {
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
                c46 c46Var2 = l14Var.a;
                g91 g91Var2 = new g91(xa6Var, 1);
                this.Y = 1;
                c46Var2.getClass();
                if (c46.l(c46Var2, g91Var2, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
            default:
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
                c46 c46Var3 = l14Var.a;
                g91 g91Var3 = new g91(xa6Var, 2);
                this.Y = 1;
                c46Var3.getClass();
                if (c46.l(c46Var3, g91Var3, this) == p31Var3) {
                    return p31Var3;
                }
                return o27Var;
        }
    }
}
