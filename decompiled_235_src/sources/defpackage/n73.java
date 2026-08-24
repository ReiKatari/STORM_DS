package defpackage;

import com.stormds.emulator.R;
import java.util.List;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n73  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n73 implements fo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ List B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ on2 R;
    public final /* synthetic */ on2 X;
    public final /* synthetic */ qn2 Y;
    public final /* synthetic */ on2 Z;
    public final /* synthetic */ qn2 d0;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ ao2 h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;

    public /* synthetic */ n73(ue1 ue1Var, List list, pq5 pq5Var, cu5 cu5Var, qn2 qn2Var, on2 on2Var, eo2 eo2Var, j06 j06Var, oi4 oi4Var, eo2 eo2Var2, on2 on2Var2, qn2 qn2Var2, on2 on2Var3, qn2 qn2Var3) {
        this.e0 = ue1Var;
        this.B = list;
        this.f0 = pq5Var;
        this.g0 = cu5Var;
        this.L = qn2Var;
        this.R = on2Var;
        this.h0 = eo2Var;
        this.i0 = j06Var;
        this.j0 = oi4Var;
        this.k0 = eo2Var2;
        this.X = on2Var2;
        this.Y = qn2Var2;
        this.Z = on2Var3;
        this.d0 = qn2Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0261  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v19 */
    @Override // defpackage.fo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        int ordinal;
        b.a aVar;
        ?? r4;
        String str;
        int i;
        int i2;
        boolean z2;
        int i3 = this.A;
        jg7 jg7Var = jg7.a;
        boolean z3 = false;
        int i4 = 2;
        Object obj4 = this.k0;
        Object obj5 = this.j0;
        Object obj6 = this.i0;
        ao2 ao2Var = this.h0;
        Object obj7 = this.g0;
        Object obj8 = this.f0;
        Object obj9 = this.e0;
        switch (i3) {
            case 0:
                final b63 b63Var = (b63) obj8;
                final List list = (List) obj9;
                final kk6 kk6Var = (kk6) obj5;
                final b.a aVar2 = (b.a) obj4;
                final qn2 qn2Var = (qn2) obj7;
                final qn2 qn2Var2 = (qn2) ao2Var;
                final qn2 qn2Var3 = (qn2) obj6;
                lq4 lq4Var = (lq4) obj;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var).f(lq4Var)) {
                        i4 = 4;
                    }
                    intValue |= i4;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    lc2 lc2Var = dj6.c;
                    a74 s = q60.s(lc2Var, lq4Var);
                    e34 d = h70.d(d90.L, false);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, s);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, d);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    pq4 pq4Var = new pq4(16.0f, lq4Var.d() + 12.0f, 16.0f, lq4Var.a() + 24.0f);
                    gu guVar = new gu(8.0f, true, new i(1));
                    final List list2 = this.B;
                    boolean h = xq2Var.h(list2);
                    int i5 = -1;
                    if (b63Var == null) {
                        ordinal = -1;
                    } else {
                        ordinal = b63Var.ordinal();
                    }
                    boolean d2 = h | xq2Var.d(ordinal);
                    final qn2 qn2Var4 = this.L;
                    final qn2 qn2Var5 = this.Y;
                    boolean f = d2 | xq2Var.f(qn2Var4) | xq2Var.f(qn2Var5) | xq2Var.h(list) | xq2Var.f(kk6Var);
                    if (aVar2 != null) {
                        i5 = aVar2.ordinal();
                    }
                    boolean d3 = f | xq2Var.d(i5);
                    final on2 on2Var = this.R;
                    final on2 on2Var2 = this.X;
                    final qn2 qn2Var6 = this.d0;
                    boolean f2 = d3 | xq2Var.f(on2Var) | xq2Var.f(on2Var2) | xq2Var.f(qn2Var6) | xq2Var.f(qn2Var) | xq2Var.f(qn2Var2) | xq2Var.f(qn2Var3);
                    Object P = xq2Var.P();
                    if (!f2 && P != ox0.a) {
                        aVar = aVar2;
                    } else {
                        P = new qn2() { // from class: p73
                            @Override // defpackage.qn2
                            public final Object g(Object obj10) {
                                er3 er3Var = (er3) obj10;
                                er3Var.getClass();
                                er3.g0(er3Var, null, null, jw0.a, 3);
                                bz1 bz1Var = new bz1(27);
                                List list3 = list2;
                                int size = list3.size();
                                r5 r5Var = new r5(12, bz1Var, list3);
                                j5 j5Var = new j5(11, list3);
                                b63 b63Var2 = b63Var;
                                qn2 qn2Var7 = qn2Var4;
                                qn2 qn2Var8 = qn2Var5;
                                er3Var.h0(size, r5Var, j5Var, new zv0(802480018, true, new v73(list3, b63Var2, qn2Var7, qn2Var8, 0)));
                                er3.g0(er3Var, null, null, jw0.b, 3);
                                bz1 bz1Var2 = new bz1(25);
                                List list4 = list;
                                er3Var.h0(list4.size(), new r5(13, bz1Var2, list4), new j5(12, list4), new zv0(802480018, true, new v73(list4, b63Var2, qn2Var7, qn2Var8, 1)));
                                er3.g0(er3Var, null, null, jw0.c, 3);
                                er3.g0(er3Var, null, null, new zv0(-395958851, true, new xn3(kk6Var, aVar2, on2Var, on2Var2, qn2Var6, qn2Var, qn2Var2, qn2Var3)), 3);
                                return jg7.a;
                            }
                        };
                        aVar = aVar2;
                        xq2Var.l0(P);
                    }
                    gi2.e(lc2Var, null, pq4Var, guVar, null, null, false, null, (qn2) P, xq2Var, 24582, 490);
                    if (b63Var != null) {
                        i = -200087531;
                        i2 = R.string.waiting_for_input;
                        z2 = false;
                    } else {
                        r4 = 0;
                        z2 = false;
                        z2 = false;
                        if (aVar == b.a.X) {
                            i = -200083137;
                            i2 = R.string.slot2_analog_waiting_axis_x;
                        } else if (aVar == b.a.Y) {
                            i = -200078433;
                            i2 = R.string.slot2_analog_waiting_axis_y;
                        } else {
                            xq2Var.b0(-1907389230);
                            xq2Var.p(false);
                            str = null;
                            if (str == null) {
                                xq2Var.b0(-1907327353);
                                x73.f(str, this.Z, xq2Var, r4);
                                xq2Var.p(r4);
                            } else {
                                xq2Var.b0(-1907158217);
                                xq2Var.p(r4);
                            }
                            xq2Var.p(true);
                        }
                    }
                    str = i61.l(xq2Var, i, i2, xq2Var, z2);
                    r4 = z2;
                    if (str == null) {
                    }
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                ue1 ue1Var = (ue1) obj9;
                final pq5 pq5Var = (pq5) obj8;
                final cu5 cu5Var = (cu5) obj7;
                final eo2 eo2Var = (eo2) ao2Var;
                final j06 j06Var = (j06) obj6;
                final oi4 oi4Var = (oi4) obj5;
                final eo2 eo2Var2 = (eo2) obj4;
                final lq4 lq4Var2 = (lq4) obj;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                lq4Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var2).f(lq4Var2)) {
                        i4 = 4;
                    }
                    intValue2 |= i4;
                }
                if ((intValue2 & 19) != 18) {
                    z3 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z3)) {
                    lc2 lc2Var2 = dj6.c;
                    final List list3 = this.B;
                    final qn2 qn2Var7 = this.L;
                    final on2 on2Var3 = this.R;
                    final on2 on2Var4 = this.X;
                    final qn2 qn2Var8 = this.Y;
                    final on2 on2Var5 = this.Z;
                    final qn2 qn2Var9 = this.d0;
                    yh2.b(ue1Var, lc2Var2, null, null, null, null, false, null, null, null, n16.I(-755415069, new go2() { // from class: tv5
                        @Override // defpackage.go2
                        public final Object l(Object obj10, Object obj11, Object obj12, Object obj13) {
                            int intValue3 = ((Integer) obj11).intValue();
                            px0 px0Var3 = (px0) obj12;
                            ((Integer) obj13).getClass();
                            ((dr4) obj10).getClass();
                            nh2 nh2Var = (nh2) list3.get(intValue3);
                            int tabIndex = vv5.CONFIG.getTabIndex();
                            lq4 lq4Var3 = lq4Var2;
                            pq5 pq5Var2 = pq5Var;
                            Object obj14 = ox0.a;
                            if (intValue3 == tabIndex) {
                                xq2 xq2Var3 = (xq2) px0Var3;
                                xq2Var3.b0(1058462580);
                                a74 S = ak7.S(dj6.c, nh2Var);
                                eo2 eo2Var3 = eo2Var;
                                boolean f3 = xq2Var3.f(eo2Var3);
                                Object P2 = xq2Var3.P();
                                if (f3 || P2 == obj14) {
                                    P2 = new bc(7, eo2Var3);
                                    xq2Var3.l0(P2);
                                }
                                qo2.j(S, lq4Var3, pq5Var2, cu5Var, qn2Var7, on2Var3, (eo2) P2, xq2Var3, 0);
                                xq2Var3.p(false);
                            } else if (intValue3 == vv5.CHEATS.getTabIndex()) {
                                xq2 xq2Var4 = (xq2) px0Var3;
                                xq2Var4.b0(1059051828);
                                vy7.C(pq5Var2, ak7.S(dj6.c, nh2Var), xq2Var4, 0);
                                xq2Var4.p(false);
                            } else {
                                int tabIndex2 = vv5.RETRO_ACHIEVEMENTS.getTabIndex();
                                oi4 oi4Var2 = oi4Var;
                                on2 on2Var6 = on2Var5;
                                if (intValue3 == tabIndex2) {
                                    xq2 xq2Var5 = (xq2) px0Var3;
                                    xq2Var5.b0(1059330828);
                                    a74 S2 = ak7.S(dj6.c, nh2Var);
                                    qn2 qn2Var10 = qn2Var9;
                                    boolean f4 = xq2Var5.f(qn2Var10);
                                    Object P3 = xq2Var5.P();
                                    if (f4 || P3 == obj14) {
                                        P3 = new y00(23, qn2Var10);
                                        xq2Var5.l0(P3);
                                    }
                                    q60.i(S2, lq4Var3, j06Var, oi4Var2, eo2Var2, on2Var4, qn2Var8, on2Var6, null, null, (qn2) P3, xq2Var5, 0);
                                    xq2Var5.p(false);
                                } else if (intValue3 == vv5.OFFLINE_ACHIEVEMENTS.getTabIndex()) {
                                    xq2 xq2Var6 = (xq2) px0Var3;
                                    xq2Var6.b0(1060100899);
                                    uj2.f(ak7.S(dj6.c, nh2Var), lq4Var3, oi4Var2, on2Var6, xq2Var6, 0);
                                    xq2Var6.p(false);
                                } else {
                                    xq2 xq2Var7 = (xq2) px0Var3;
                                    xq2Var7.b0(1060479967);
                                    xq2Var7.p(false);
                                }
                            }
                            return jg7.a;
                        }
                    }, xq2Var2), xq2Var2, 100663344);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ n73(List list, b63 b63Var, qn2 qn2Var, qn2 qn2Var2, List list2, kk6 kk6Var, b.a aVar, on2 on2Var, on2 on2Var2, qn2 qn2Var3, qn2 qn2Var4, qn2 qn2Var5, qn2 qn2Var6, on2 on2Var3) {
        this.B = list;
        this.f0 = b63Var;
        this.L = qn2Var;
        this.Y = qn2Var2;
        this.e0 = list2;
        this.j0 = kk6Var;
        this.k0 = aVar;
        this.R = on2Var;
        this.X = on2Var2;
        this.d0 = qn2Var3;
        this.g0 = qn2Var4;
        this.h0 = qn2Var5;
        this.i0 = qn2Var6;
        this.Z = on2Var3;
    }
}
