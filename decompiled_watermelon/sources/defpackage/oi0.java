package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oi0  reason: default package */
/* loaded from: classes.dex */
public final class oi0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ long c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi0(k76 k76Var, long j, m76 m76Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 3;
        this.Z = k76Var;
        this.c0 = j;
        this.d0 = m76Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((oi0) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((oi0) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((oi0) t(j11Var, o31Var)).v(o27Var);
            case 3:
                return ((oi0) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((oi0) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        long j = this.c0;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                oi0 oi0Var = new oi0(j, (qi0) obj2, j11Var);
                oi0Var.Z = obj;
                return oi0Var;
            case 1:
                oi0 oi0Var2 = new oi0((zj1) obj2, j, j11Var);
                oi0Var2.Z = obj;
                return oi0Var2;
            case 2:
                return new oi0(2, this.c0, j11Var, (hv1) this.Z, (jm4) obj2);
            case 3:
                return new oi0((k76) this.Z, this.c0, (m76) obj2, j11Var);
            default:
                return new oi0(4, this.c0, j11Var, (ct6) this.Z, (mi2) obj2);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object c;
        int i = this.X;
        o27 o27Var = o27.a;
        long j = this.c0;
        Object obj2 = this.d0;
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
                    Log.d("CXCP", "Finalizing " + ((o31) this.Z) + " in " + j + " ms");
                    this.Y = 1;
                    if (dk7.q(j, this) == p31Var) {
                        return p31Var;
                    }
                }
                ((qi0) obj2).n(0L);
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
                bj2 bj2Var = ((zj1) obj2).H0;
                mb4 mb4Var = new mb4(j);
                this.Y = 1;
                if (bj2Var.i((o31) this.Z, mb4Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
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
                a7 a7Var = new a7(((hv1) this.Z).i0, 10);
                jy1 jy1Var = new jy1((jm4) obj2, j, null);
                this.Y = 1;
                Object v = se.v(a7Var, jy1Var, this);
                if (v != p31Var3) {
                    return v;
                }
                return p31Var3;
            case 3:
                m76 m76Var = (m76) obj2;
                k76 k76Var = (k76) this.Z;
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        me2.a0(obj);
                        c = obj;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    um umVar = k76Var.a;
                    i33 i33Var = new i33(j);
                    sc6 sc6Var = m76Var.k0;
                    this.Y = 1;
                    c = um.c(umVar, i33Var, sc6Var, null, this, 12);
                    if (c == p31Var4) {
                        return p31Var4;
                    }
                }
                zn znVar = ((fo) c).b;
                zn znVar2 = zn.BoundReached;
                return o27Var;
            default:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ct6 ct6Var = (ct6) this.Z;
                ys3 ys3Var = new ys3(tq5.e(ct6Var.b, ct6Var.f, null, new hq6(1, null, (mi2) obj2), 2), null, 14);
                this.Y = 1;
                Object W = ln2.W(j, ys3Var, this);
                if (W != p31Var5) {
                    return W;
                }
                return p31Var5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi0(long j, qi0 qi0Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 0;
        this.c0 = j;
        this.d0 = qi0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi0(zj1 zj1Var, long j, j11 j11Var) {
        super(2, j11Var);
        this.X = 1;
        this.d0 = zj1Var;
        this.c0 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi0(int i, long j, j11 j11Var, Object obj, Object obj2) {
        super(2, j11Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.c0 = j;
    }
}
