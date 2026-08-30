package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sr0  reason: default package */
/* loaded from: classes.dex */
public final class sr0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ tr0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr0(tr0 tr0Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = tr0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((sr0) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((sr0) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((sr0) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        tr0 tr0Var = this.Z;
        switch (i) {
            case 0:
                return new sr0(tr0Var, j11Var, 0);
            case 1:
                return new sr0(tr0Var, j11Var, 1);
            default:
                return new sr0(tr0Var, j11Var, 2);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        tr0 tr0Var = this.Z;
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
                    long c = ((fa7) mh7.t(tr0Var, ov0.t)).c();
                    this.Y = 1;
                    if (dk7.q(c, this) == p31Var) {
                        return p31Var;
                    }
                }
                ki2 ki2Var = tr0Var.G0;
                if (ki2Var != null) {
                    ki2Var.c();
                }
                if (tr0Var.H0) {
                    ((ho4) ((sp2) mh7.t(tr0Var, ov0.l))).a(0);
                }
                tr0Var.O0 = true;
                kd6 kd6Var = tr0Var.M0;
                if (kd6Var != null) {
                    kd6Var.i(null);
                }
                tr0Var.M0 = null;
                tr0Var.L0 = null;
                return o27Var;
            case 1:
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
                    long c2 = ((fa7) mh7.t(tr0Var, ov0.t)).c();
                    this.Y = 1;
                    if (dk7.q(c2, this) == p31Var2) {
                        return p31Var2;
                    }
                }
                ki2 ki2Var2 = tr0Var.G0;
                if (ki2Var2 != null) {
                    ki2Var2.c();
                }
                if (tr0Var.H0) {
                    ((ho4) ((sp2) mh7.t(tr0Var, ov0.l))).a(0);
                }
                tr0Var.V0 = true;
                kd6 kd6Var2 = tr0Var.T0;
                if (kd6Var2 != null) {
                    kd6Var2.i(null);
                }
                tr0Var.T0 = null;
                tr0Var.S0 = null;
                return o27Var;
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    long c3 = ((fa7) mh7.t(tr0Var, ov0.t)).c();
                    this.Y = 1;
                    if (dk7.q(c3, this) == p31Var3) {
                        return p31Var3;
                    }
                }
                ki2 ki2Var3 = tr0Var.G0;
                if (ki2Var3 != null) {
                    ki2Var3.c();
                    return o27Var;
                }
                return o27Var;
        }
    }
}
