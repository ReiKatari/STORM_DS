package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc0  reason: default package */
/* loaded from: classes.dex */
public final class wc0 extends hw6 implements qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc0(Object obj, r41 r41Var, int i) {
        super(1, r41Var);
        this.X = i;
        this.Z = obj;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.Z;
        r41 r41Var = (r41) obj;
        switch (i) {
            case 0:
                return new wc0((vc0) obj2, r41Var, 0).s(jg7Var);
            case 1:
                return new wc0((EmulatorActivity) obj2, r41Var, 1).s(jg7Var);
            case 2:
                return new wc0((sz1) obj2, r41Var, 2).s(jg7Var);
            case 3:
                return new wc0((bn5) obj2, r41Var, 3).s(jg7Var);
            case 4:
                return new wc0((p27) obj2, r41Var, 4).s(jg7Var);
            default:
                return new wc0((ri7) obj2, r41Var, 5).s(jg7Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r2.s(r14) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c9, code lost:
        if (r14 == r0) goto L54;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object obj2;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.Z;
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
                this.Y = 1;
                Object q = ((vc0) obj3).l.q(this);
                if (q != x61Var) {
                    q = jg7Var;
                }
                if (q == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i4 = EmulatorActivity.Z1;
                sz1 W = ((EmulatorActivity) obj3).W();
                this.Y = 1;
                W.getClass();
                xe1 xe1Var = xk1.a;
                Object d0 = hv.d0(de1.L, new hz1(11, null, W), this);
                if (d0 == x61Var2) {
                    return x61Var2;
                }
                return d0;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object l0 = ((sz1) obj3).l0(this);
                if (l0 == x61Var3) {
                    return x61Var3;
                }
                return l0;
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
                this.Y = 1;
                if (vm5.e((bn5) obj3, this) == x61Var4) {
                    return x61Var4;
                }
                return jg7Var;
            case 4:
                p27 p27Var = (p27) obj3;
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            oi2.Y(obj);
                            p27Var.B = true;
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    break;
                }
                vr4 a = p27.a(p27Var);
                if (a != null) {
                    String str = (String) a.A;
                    long j = ((k47) a.B).a;
                    zx4 zx4Var = p27Var.j;
                    if (zx4Var != null) {
                        this.Y = 2;
                        if (str.length() == 0 || k47.c(j)) {
                            obj2 = jg7Var;
                        } else {
                            obj2 = hv.d0(zx4Var.a, new l5(zx4Var, new c0(j, null, zx4Var, str), (r41) null, 24), this);
                        }
                        if (obj2 != x61Var5) {
                            obj2 = jg7Var;
                            break;
                        }
                    }
                }
                p27Var.B = true;
                return jg7Var;
            default:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                try {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        if (kj2.F("CXCP")) {
                            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOnAsync");
                        }
                        sf0 a2 = ((ri7) obj3).c.a();
                        this.Y = 1;
                        obj = a2.h(this);
                        if (obj == x61Var6) {
                            return x61Var6;
                        }
                    }
                    AutoCloseable autoCloseable = (AutoCloseable) obj;
                    tu0 h = ((vf0) autoCloseable).h();
                    lb4.p(autoCloseable, null);
                    return h;
                } catch (CancellationException e) {
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
                    }
                    return ri7.l;
                }
        }
    }
}
