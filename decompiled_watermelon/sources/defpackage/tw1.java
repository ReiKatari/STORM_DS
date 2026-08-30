package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tw1  reason: default package */
/* loaded from: classes.dex */
public final class tw1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ hv1 Z;
    public final /* synthetic */ rg5 c0;
    public final /* synthetic */ boolean d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tw1(hv1 hv1Var, rg5 rg5Var, boolean z, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = hv1Var;
        this.c0 = rg5Var;
        this.d0 = z;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((tw1) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((tw1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((tw1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new tw1(this.Z, this.c0, this.d0, j11Var, 0);
            case 1:
                return new tw1(this.Z, this.c0, this.d0, j11Var, 1);
            default:
                return new tw1(this.Z, this.c0, this.d0, j11Var, 2);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object j;
        Object x;
        Object A;
        int i = this.X;
        boolean z = this.d0;
        rg5 rg5Var = this.c0;
        hv1 hv1Var = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        j = ((nc5) obj).A;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    ud5 ud5Var = hv1Var.g;
                    String str = rg5Var.i;
                    this.Y = 1;
                    j = ((dl) ud5Var).j(str, z, this);
                    if (j == p31Var) {
                        return p31Var;
                    }
                }
                return new nc5(j);
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        x = ((nc5) obj).A;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    ud5 ud5Var2 = hv1Var.g;
                    String str2 = rg5Var.i;
                    this.Y = 1;
                    x = ((dl) ud5Var2).x(str2, z, this);
                    if (x == p31Var2) {
                        return p31Var2;
                    }
                }
                Object obj2 = x;
                me2.a0(obj2);
                return obj2;
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        A = ((nc5) obj).A;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    ud5 ud5Var3 = hv1Var.g;
                    String str3 = rg5Var.i;
                    this.Y = 1;
                    A = ((dl) ud5Var3).A(str3, z, this);
                    if (A == p31Var3) {
                        return p31Var3;
                    }
                }
                return new nc5(A);
        }
    }
}
