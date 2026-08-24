package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wk0  reason: default package */
/* loaded from: classes.dex */
public final class wk0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ long d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk0(zi6 zi6Var, long j, bj6 bj6Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 3;
        this.Z = zi6Var;
        this.d0 = j;
        this.e0 = bj6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((wk0) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((wk0) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((wk0) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((wk0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((wk0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        long j = this.d0;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                wk0 wk0Var = new wk0(j, (yk0) obj2, r41Var);
                wk0Var.Z = obj;
                return wk0Var;
            case 1:
                wk0 wk0Var2 = new wk0((fo1) obj2, j, r41Var);
                wk0Var2.Z = obj;
                return wk0Var2;
            case 2:
                return new wk0(2, this.d0, r41Var, (sz1) this.Z, (nv4) obj2);
            case 3:
                return new wk0((zi6) this.Z, this.d0, (bj6) obj2, r41Var);
            default:
                return new wk0(4, this.d0, r41Var, (t57) this.Z, (qn2) obj2);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object c;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        long j = this.d0;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Log.d("CXCP", "Finalizing " + ((w61) this.Z) + " in " + j + " ms");
                    this.Y = 1;
                    if (q60.t(j, this) == x61Var) {
                        return x61Var;
                    }
                }
                ((yk0) obj2).n(0L);
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                fo2 fo2Var = ((fo1) obj2).I0;
                jk4 jk4Var = new jk4(j);
                this.Y = 1;
                if (fo2Var.e((w61) this.Z, jk4Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                b7 b7Var = new b7(((sz1) this.Z).i0, 10);
                u22 u22Var = new u22((nv4) obj2, j, null);
                this.Y = 1;
                Object C = f04.C(b7Var, u22Var, this);
                if (C != x61Var3) {
                    return C;
                }
                return x61Var3;
            case 3:
                bj6 bj6Var = (bj6) obj2;
                zi6 zi6Var = (zi6) this.Z;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        c = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    gn gnVar = zi6Var.a;
                    q93 q93Var = new q93(j);
                    io6 io6Var = bj6Var.l0;
                    this.Y = 1;
                    c = gn.c(gnVar, q93Var, io6Var, null, this, 12);
                    if (c == x61Var4) {
                        return x61Var4;
                    }
                }
                mo moVar = ((ro) c).b;
                mo moVar2 = mo.BoundReached;
                return jg7Var;
            default:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                t57 t57Var = (t57) this.Z;
                ns3 ns3Var = new ns3(hv.i(t57Var.b, t57Var.f, null, new v27(1, null, (qn2) obj2), 2), null, 15);
                this.Y = 1;
                Object N = xk2.N(j, ns3Var, this);
                if (N != x61Var5) {
                    return N;
                }
                return x61Var5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk0(long j, yk0 yk0Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 0;
        this.d0 = j;
        this.e0 = yk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk0(fo1 fo1Var, long j, r41 r41Var) {
        super(2, r41Var);
        this.X = 1;
        this.e0 = fo1Var;
        this.d0 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk0(int i, long j, r41 r41Var, Object obj, Object obj2) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.e0 = obj2;
        this.d0 = j;
    }
}
