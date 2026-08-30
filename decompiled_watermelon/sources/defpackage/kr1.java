package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kr1  reason: default package */
/* loaded from: classes.dex */
public final class kr1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ EmulatorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr1(EmulatorActivity emulatorActivity, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = emulatorActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((kr1) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((kr1) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((kr1) t(j11Var, o31Var)).v(o27Var);
            case 3:
                return ((kr1) t(j11Var, o31Var)).v(o27Var);
            case 4:
                return ((kr1) t(j11Var, o31Var)).v(o27Var);
            case 5:
                return ((kr1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((kr1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        EmulatorActivity emulatorActivity = this.Z;
        switch (i) {
            case 0:
                return new kr1(emulatorActivity, j11Var, 0);
            case 1:
                return new kr1(emulatorActivity, j11Var, 1);
            case 2:
                return new kr1(emulatorActivity, j11Var, 2);
            case 3:
                return new kr1(emulatorActivity, j11Var, 3);
            case 4:
                return new kr1(emulatorActivity, j11Var, 4);
            case 5:
                return new kr1(emulatorActivity, j11Var, 5);
            default:
                return new kr1(emulatorActivity, j11Var, 6);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        EmulatorActivity emulatorActivity = this.Z;
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
                pe7.b0.getClass();
                h90 k = se.k(new zw5(oe7.a(emulatorActivity), emulatorActivity, null, 14));
                bb1 bb1Var = tg1.a;
                u92 x = se.x(k, bt3.a);
                ir1 ir1Var = new ir1(emulatorActivity, 3);
                this.Y = 1;
                if (x.a(ir1Var, this) == p31Var) {
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
                in3 in3Var = emulatorActivity.A;
                qm3 qm3Var = qm3.STARTED;
                kr1 kr1Var = new kr1(emulatorActivity, null, 0);
                this.Y = 1;
                if (nl2.Q(in3Var, qm3Var, kr1Var, this) == p31Var2) {
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
                ns nsVar = emulatorActivity.G0;
                if (nsVar != null) {
                    c46 c46Var = nsVar.a;
                    ir1 ir1Var2 = new ir1(emulatorActivity, 4);
                    this.Y = 1;
                    c46Var.getClass();
                    if (c46.l(c46Var, ir1Var2, this) == p31Var3) {
                        return p31Var3;
                    }
                    return o27Var;
                }
                b53.g0("appForegroundStateObserver");
                throw null;
            case 3:
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
                in3 in3Var2 = emulatorActivity.A;
                qm3 qm3Var2 = qm3.CREATED;
                kr1 kr1Var2 = new kr1(emulatorActivity, null, 2);
                this.Y = 1;
                if (nl2.Q(in3Var2, qm3Var2, kr1Var2, this) == p31Var4) {
                    return p31Var4;
                }
                return o27Var;
            case 4:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                pm4 pm4Var = emulatorActivity.E0;
                if (pm4Var != null) {
                    c46 c46Var2 = pm4Var.b;
                    ir1 ir1Var3 = new ir1(emulatorActivity, 5);
                    this.Y = 1;
                    c46Var2.getClass();
                    if (c46.l(c46Var2, ir1Var3, this) == p31Var5) {
                        return p31Var5;
                    }
                    return o27Var;
                }
                b53.g0("permissionHandler");
                throw null;
            case 5:
                p31 p31Var6 = p31.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                in3 in3Var3 = emulatorActivity.A;
                qm3 qm3Var3 = qm3.STARTED;
                kr1 kr1Var3 = new kr1(emulatorActivity, null, 4);
                this.Y = 1;
                if (nl2.Q(in3Var3, qm3Var3, kr1Var3, this) == p31Var6) {
                    return p31Var6;
                }
                return o27Var;
            default:
                p31 p31Var7 = p31.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0 && i8 != 1) {
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                do {
                    int i9 = EmulatorActivity.P1;
                    if (((Number) emulatorActivity.j0().A).intValue() == 0) {
                        this.Y = 1;
                    } else {
                        return o27Var;
                    }
                } while (dk7.q(50L, this) != p31Var7);
                return p31Var7;
        }
    }
}
