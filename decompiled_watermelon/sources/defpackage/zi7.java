package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zi7  reason: default package */
/* loaded from: classes.dex */
public final class zi7 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ aj7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi7(aj7 aj7Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = aj7Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((zi7) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((zi7) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        aj7 aj7Var = this.Z;
        switch (i) {
            case 0:
                return new zi7(aj7Var, j11Var, 0);
            default:
                return new zi7(aj7Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        aj7 aj7Var = this.Z;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    ee eeVar = aj7Var.A;
                    this.Y = 1;
                    Object l = eeVar.x0.l(this);
                    if (l != p31Var) {
                        l = o27Var;
                    }
                    if (l == p31Var) {
                        return p31Var;
                    }
                }
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    ee eeVar2 = aj7Var.A;
                    this.Y = 1;
                    Object a = eeVar2.y0.a(this);
                    if (a != p31Var2) {
                        a = o27Var;
                    }
                    if (a == p31Var2) {
                        return p31Var2;
                    }
                }
                return o27Var;
        }
    }
}
