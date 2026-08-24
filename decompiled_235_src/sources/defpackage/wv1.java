package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv1  reason: default package */
/* loaded from: classes.dex */
public final class wv1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ EmulatorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv1(EmulatorActivity emulatorActivity, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = emulatorActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((wv1) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((wv1) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((wv1) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((wv1) q(r41Var, w61Var)).s(jg7Var);
            case 4:
                return ((wv1) q(r41Var, w61Var)).s(jg7Var);
            case 5:
                return ((wv1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((wv1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        EmulatorActivity emulatorActivity = this.Z;
        switch (i) {
            case 0:
                return new wv1(emulatorActivity, r41Var, 0);
            case 1:
                return new wv1(emulatorActivity, r41Var, 1);
            case 2:
                return new wv1(emulatorActivity, r41Var, 2);
            case 3:
                return new wv1(emulatorActivity, r41Var, 3);
            case 4:
                return new wv1(emulatorActivity, r41Var, 4);
            case 5:
                return new wv1(emulatorActivity, r41Var, 5);
            default:
                return new wv1(emulatorActivity, r41Var, 6);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        EmulatorActivity emulatorActivity = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i3 = EmulatorActivity.Z1;
                de5 de5Var = emulatorActivity.W().q0;
                xd1 xd1Var = new xd1(emulatorActivity, null, 2);
                this.Y = 1;
                if (f04.v(de5Var, xd1Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ku3 ku3Var = emulatorActivity.A;
                tt3 tt3Var = tt3.CREATED;
                wv1 wv1Var = new wv1(emulatorActivity, null, 0);
                this.Y = 1;
                if (np2.c0(ku3Var, tt3Var, wv1Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                rt7.c0.getClass();
                pb0 p = f04.p(new vy5(qt7.a(emulatorActivity), emulatorActivity, (r41) null, 19));
                xe1 xe1Var = xk1.a;
                le2 E = f04.E(p, e04.a);
                sv1 sv1Var = new sv1(emulatorActivity, 4);
                this.Y = 1;
                if (E.b(sv1Var, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ku3 ku3Var2 = emulatorActivity.A;
                tt3 tt3Var2 = tt3.STARTED;
                wv1 wv1Var2 = new wv1(emulatorActivity, null, 2);
                this.Y = 1;
                if (np2.c0(ku3Var2, tt3Var2, wv1Var2, this) == x61Var4) {
                    return x61Var4;
                }
                return jg7Var;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                at atVar = emulatorActivity.H0;
                if (atVar != null) {
                    of6 of6Var = atVar.a;
                    sv1 sv1Var2 = new sv1(emulatorActivity, 5);
                    this.Y = 1;
                    of6Var.getClass();
                    if (of6.m(of6Var, sv1Var2, this) == x61Var5) {
                        return x61Var5;
                    }
                    return jg7Var;
                }
                nb3.a0("appForegroundStateObserver");
                throw null;
            case 5:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ku3 ku3Var3 = emulatorActivity.A;
                tt3 tt3Var3 = tt3.CREATED;
                wv1 wv1Var3 = new wv1(emulatorActivity, null, 4);
                this.Y = 1;
                if (np2.c0(ku3Var3, tt3Var3, wv1Var3, this) == x61Var6) {
                    return x61Var6;
                }
                return jg7Var;
            default:
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                if (i9 != 0 && i9 != 1) {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                do {
                    int i10 = EmulatorActivity.Z1;
                    if (((Number) emulatorActivity.l0().A).intValue() == 0) {
                        this.Y = 1;
                    } else {
                        return jg7Var;
                    }
                } while (q60.t(50L, this) != x61Var7);
                return x61Var7;
        }
    }
}
