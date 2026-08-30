package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xv1  reason: default package */
/* loaded from: classes.dex */
public final class xv1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ hv1 Z;
    public final /* synthetic */ String c0;
    public final /* synthetic */ String d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv1(hv1 hv1Var, String str, String str2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = hv1Var;
        this.c0 = str;
        this.d0 = str2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((xv1) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((xv1) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((xv1) t(j11Var, o31Var)).v(o27Var);
            case 3:
                return ((xv1) t(j11Var, o31Var)).v(o27Var);
            case 4:
                return ((xv1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((xv1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new xv1(this.Z, this.c0, this.d0, j11Var, 0);
            case 1:
                return new xv1(this.Z, this.c0, this.d0, j11Var, 1);
            case 2:
                return new xv1(this.Z, this.c0, this.d0, j11Var, 2);
            case 3:
                return new xv1(this.Z, this.c0, this.d0, j11Var, 3);
            case 4:
                return new xv1(this.Z, this.c0, this.d0, j11Var, 4);
            default:
                return new xv1(this.Z, this.c0, this.d0, j11Var, 5);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object i;
        int i2 = this.X;
        String str = this.d0;
        String str2 = this.c0;
        hv1 hv1Var = this.Z;
        switch (i2) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
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
                fb4 fb4Var = hv1Var.j;
                this.Y = 1;
                Object b = fb4Var.b(str2, str, this);
                if (b == p31Var) {
                    return p31Var;
                }
                return b;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
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
                ra4 ra4Var = hv1Var.i;
                this.Y = 1;
                Object g = ra4Var.g(str2, str, this);
                if (g == p31Var2) {
                    return p31Var2;
                }
                return g;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ra4 ra4Var2 = hv1Var.i;
                this.Y = 1;
                Object g2 = ra4Var2.g(str2, str, this);
                if (g2 == p31Var3) {
                    return p31Var3;
                }
                return g2;
            case 3:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        me2.a0(obj);
                        i = ((nc5) obj).A;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    ra4 ra4Var3 = hv1Var.i;
                    this.Y = 1;
                    i = ra4Var3.i(str2, str, this);
                    if (i == p31Var4) {
                        return p31Var4;
                    }
                }
                return new nc5(i);
            case 4:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ra4 ra4Var4 = hv1Var.i;
                this.Y = 1;
                Object g3 = ra4Var4.g(str2, str, this);
                if (g3 == p31Var5) {
                    return p31Var5;
                }
                return g3;
            default:
                p31 p31Var6 = p31.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ra4 ra4Var5 = hv1Var.i;
                this.Y = 1;
                Object g4 = ra4Var5.g(str2, str, this);
                if (g4 == p31Var6) {
                    return p31Var6;
                }
                return g4;
        }
    }
}
