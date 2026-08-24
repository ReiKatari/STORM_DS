package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: on1  reason: default package */
/* loaded from: classes.dex */
public final class on1 extends dm5 implements eo2 {
    public final /* synthetic */ int L;
    public int R;
    public /* synthetic */ Object X;
    public Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ ao2 d0;
    public final /* synthetic */ ao2 e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(c5 c5Var, ov4 ov4Var, z5 z5Var, dz3 dz3Var, k0 k0Var, r41 r41Var) {
        super(2, r41Var);
        this.L = 0;
        this.Y = c5Var;
        this.Z = ov4Var;
        this.d0 = z5Var;
        this.e0 = dz3Var;
        this.f0 = k0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.L;
        jg7 jg7Var = jg7.a;
        mw6 mw6Var = (mw6) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((on1) q(r41Var, mw6Var)).s(jg7Var);
            case 1:
                return ((on1) q(r41Var, mw6Var)).s(jg7Var);
            default:
                return ((on1) q(r41Var, mw6Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.L;
        Object obj2 = this.f0;
        ao2 ao2Var = this.e0;
        ao2 ao2Var2 = this.d0;
        Object obj3 = this.Z;
        switch (i) {
            case 0:
                on1 on1Var = new on1((c5) this.Y, (ov4) obj3, (z5) ao2Var2, (dz3) ao2Var, (k0) obj2, r41Var);
                on1Var.X = obj;
                return on1Var;
            case 1:
                on1 on1Var2 = new on1((br5) obj3, (dr5) ao2Var2, (cr5) ao2Var, (cr5) obj2, r41Var, 1);
                on1Var2.X = obj;
                return on1Var2;
            default:
                on1 on1Var3 = new on1((w61) obj3, (c27) ao2Var2, (j4) ao2Var, (j25) obj2, r41Var, 2);
                on1Var3.X = obj;
                return on1Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
        if (r1 == r14) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0192, code lost:
        if (r0 == r14) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d8, code lost:
        if (r2 == r12) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        mw6 mw6Var;
        Object a;
        mw6 mw6Var2;
        Object b;
        Object d;
        mw6 mw6Var3;
        ah5 ah5Var;
        vy4 vy4Var;
        Object i;
        Object b2;
        mw6 mw6Var4;
        ap6 ap6Var;
        r41 r41Var;
        Object i2;
        rc3 rc3Var;
        vy4 vy4Var2;
        int i3 = this.L;
        jg7 jg7Var = jg7.a;
        ao2 ao2Var = this.e0;
        ao2 ao2Var2 = this.d0;
        Object obj2 = this.f0;
        Object obj3 = this.Z;
        switch (i3) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i4 = this.R;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mw6Var = (mw6) this.X;
                    oi2.Y(obj);
                    a = obj;
                } else {
                    oi2.Y(obj);
                    mw6Var = (mw6) this.X;
                    py4 py4Var = py4.Initial;
                    this.X = mw6Var;
                    this.R = 1;
                    a = hz6.a(mw6Var, false, py4Var, this);
                    break;
                }
                this.X = null;
                this.R = 2;
                if (sn1.h(mw6Var, (vy4) a, (c5) this.Y, (ov4) obj3, (z5) ao2Var2, (dz3) ao2Var, (k0) obj2, this) != x61Var) {
                    return jg7Var;
                }
                return x61Var;
            case 1:
                dr5 dr5Var = (dr5) ao2Var2;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i5 = this.R;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                oi2.Y(obj);
                                i = obj;
                                if (((Boolean) i).booleanValue()) {
                                    ((cr5) ao2Var).c();
                                    return jg7Var;
                                }
                                ((cr5) obj2).c();
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        mw6Var3 = (mw6) this.X;
                        d = obj;
                        ah5Var = (ah5) this.Y;
                        vy4Var = (vy4) d;
                        if (vy4Var == null) {
                            br5 br5Var = (br5) obj3;
                            long j = vy4Var.c;
                            qa4 qa4Var = br5Var.A;
                            int i6 = br5Var.B;
                            boolean z = br5Var.L;
                            on2 on2Var = br5Var.R;
                            List list = br5Var.X;
                            Map map = br5Var.Y;
                            qa4 qa4Var2 = br5Var.Z;
                            qa4 qa4Var3 = br5Var.d0;
                            qa4 qa4Var4 = br5Var.e0;
                            eo2 eo2Var = br5Var.f0;
                            qa4Var.setValue(Boolean.TRUE);
                            ak7.F(i6, z, on2Var, list, map, qa4Var2, qa4Var3, qa4Var4, eo2Var, Float.intBitsToFloat((int) (j & 4294967295L)));
                            dr5Var.o(vy4Var, new Float(ah5Var.A));
                            long j2 = vy4Var.a;
                            k0 k0Var = new k0(dr5Var, 22);
                            this.X = null;
                            this.Y = null;
                            this.R = 3;
                            i = sn1.i(mw6Var3, j2, k0Var, this);
                            break;
                        } else {
                            return jg7Var;
                        }
                    } else {
                        mw6Var2 = (mw6) this.X;
                        oi2.Y(obj);
                        b = obj;
                    }
                } else {
                    oi2.Y(obj);
                    mw6Var2 = (mw6) this.X;
                    this.X = mw6Var2;
                    this.R = 1;
                    b = hz6.b(mw6Var2, this, 2);
                    break;
                }
                vy4 vy4Var3 = (vy4) b;
                Object obj4 = new Object();
                long j3 = vy4Var3.a;
                int i7 = vy4Var3.i;
                z5 z5Var = new z5(obj4, 10);
                this.X = mw6Var2;
                this.Y = obj4;
                this.R = 2;
                d = sn1.d(mw6Var2, j3, i7, z5Var, this);
                if (d != x61Var2) {
                    mw6Var3 = mw6Var2;
                    ah5Var = obj4;
                    vy4Var = (vy4) d;
                    if (vy4Var == null) {
                    }
                }
                return x61Var2;
            default:
                w61 w61Var = (w61) obj3;
                j25 j25Var = (j25) obj2;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i8 = this.R;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            rc3Var = (rc3) this.X;
                            oi2.Y(obj);
                            i2 = obj;
                            r41Var = null;
                            vy4Var2 = (vy4) i2;
                            if (vy4Var2 != null) {
                                hz6.f(w61Var, rc3Var, new az6(j25Var, r41Var, 0));
                                return jg7Var;
                            }
                            vy4Var2.a();
                            hz6.f(w61Var, rc3Var, new az6(j25Var, r41Var, 1));
                            ((j4) ao2Var).g(new jk4(vy4Var2.c));
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ap6Var = (ap6) this.Y;
                    oi2.Y(obj);
                    mw6Var4 = (mw6) this.X;
                    b2 = obj;
                } else {
                    oi2.Y(obj);
                    mw6 mw6Var5 = (mw6) this.X;
                    ap6 L = hv.L(w61Var, null, a71.UNDISPATCHED, new bz6(j25Var, null, 0), 1);
                    this.X = mw6Var5;
                    this.Y = L;
                    this.R = 1;
                    b2 = hz6.b(mw6Var5, this, 3);
                    if (b2 != x61Var3) {
                        mw6Var4 = mw6Var5;
                        ap6Var = L;
                    }
                    return x61Var3;
                }
                vy4 vy4Var4 = (vy4) b2;
                vy4Var4.a();
                c27 c27Var = (c27) ao2Var2;
                if (c27Var != hz6.a) {
                    r41Var = null;
                    hz6.f(w61Var, ap6Var, new vy5(c27Var, j25Var, vy4Var4, null, 11));
                } else {
                    r41Var = null;
                }
                this.X = ap6Var;
                this.Y = r41Var;
                this.R = 2;
                i2 = hz6.i(mw6Var4, py4.Main, this);
                if (i2 != x61Var3) {
                    rc3Var = ap6Var;
                    vy4Var2 = (vy4) i2;
                    if (vy4Var2 != null) {
                    }
                }
                return x61Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on1(Object obj, ao2 ao2Var, ao2 ao2Var2, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.L = i;
        this.Z = obj;
        this.d0 = ao2Var;
        this.e0 = ao2Var2;
        this.f0 = obj2;
    }
}
