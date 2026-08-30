package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bi5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bi5 implements aj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ ri5 B;
    public final /* synthetic */ pk3 L;
    public final /* synthetic */ Map R;
    public final /* synthetic */ Map X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Set Z;
    public final /* synthetic */ boolean c0;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ int f0;
    public final /* synthetic */ float g0;
    public final /* synthetic */ Map h0;
    public final /* synthetic */ int i0;
    public final /* synthetic */ mi2 j0;
    public final /* synthetic */ mi2 k0;
    public final /* synthetic */ mi2 l0;
    public final /* synthetic */ mi2 m0;
    public final /* synthetic */ mi2 n0;
    public final /* synthetic */ mi2 o0;
    public final /* synthetic */ mi2 p0;
    public final /* synthetic */ mi2 q0;
    public final /* synthetic */ ki2 r0;
    public final /* synthetic */ mi2 s0;

    public /* synthetic */ bi5(ri5 ri5Var, pk3 pk3Var, Map map, Map map2, boolean z, Set set, boolean z2, boolean z3, boolean z4, int i, float f, Map map3, int i2, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3, mi2 mi2Var4, mi2 mi2Var5, mi2 mi2Var6, mi2 mi2Var7, mi2 mi2Var8, ki2 ki2Var, mi2 mi2Var9, int i3) {
        this.B = ri5Var;
        this.L = pk3Var;
        this.R = map;
        this.X = map2;
        this.Y = z;
        this.Z = set;
        this.c0 = z2;
        this.d0 = z3;
        this.e0 = z4;
        this.f0 = i;
        this.g0 = f;
        this.h0 = map3;
        this.i0 = i2;
        this.j0 = mi2Var;
        this.k0 = mi2Var2;
        this.l0 = mi2Var3;
        this.m0 = mi2Var4;
        this.n0 = mi2Var5;
        this.o0 = mi2Var6;
        this.p0 = mi2Var7;
        this.q0 = mi2Var8;
        this.r0 = ki2Var;
        this.s0 = mi2Var9;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        float f;
        Integer num;
        float f2;
        int i = this.A;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(1 & intValue, z)) {
                    s72 s72Var = o76.c;
                    if (this.Y) {
                        f = 28.0f;
                    } else {
                        f = 0.0f;
                    }
                    pk3 pk3Var = this.L;
                    Iterator it = pk3Var.j().k.iterator();
                    if (!it.hasNext()) {
                        num = null;
                    } else {
                        Integer valueOf = Integer.valueOf(((kk3) it.next()).m);
                        while (it.hasNext()) {
                            Integer valueOf2 = Integer.valueOf(((kk3) it.next()).m);
                            if (valueOf.compareTo(valueOf2) < 0) {
                                valueOf = valueOf2;
                            }
                        }
                        num = valueOf;
                    }
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    final ri5 ri5Var = this.B;
                    if (ri5Var.g == bm5.FAVORITES) {
                        f2 = 96.0f;
                    } else {
                        f2 = 32.0f;
                    }
                    mh4 mh4Var = new mh4(RecyclerView.A1, RecyclerView.A1, f, dt3.m0(this.g0, i2, f2, sk2Var));
                    boolean h = sk2Var.h(ri5Var);
                    final mi2 mi2Var = this.j0;
                    final boolean z2 = this.c0;
                    final Map map = this.R;
                    boolean f3 = h | sk2Var.f(mi2Var) | sk2Var.g(z2) | sk2Var.h(map);
                    final Map map2 = this.X;
                    boolean h2 = f3 | sk2Var.h(map2);
                    final mi2 mi2Var2 = this.k0;
                    boolean f4 = h2 | sk2Var.f(mi2Var2);
                    final mi2 mi2Var3 = this.l0;
                    boolean f5 = f4 | sk2Var.f(mi2Var3);
                    final mi2 mi2Var4 = this.m0;
                    boolean f6 = f5 | sk2Var.f(mi2Var4);
                    final mi2 mi2Var5 = this.n0;
                    final boolean z3 = this.d0;
                    final int i3 = this.f0;
                    final ki2 ki2Var = this.r0;
                    final mi2 mi2Var6 = this.o0;
                    final mi2 mi2Var7 = this.p0;
                    final Map map3 = this.h0;
                    final int i4 = this.i0;
                    final mi2 mi2Var8 = this.q0;
                    final boolean z4 = this.e0;
                    final Set set = this.Z;
                    final mi2 mi2Var9 = this.s0;
                    boolean f7 = f6 | sk2Var.f(mi2Var5) | sk2Var.g(z3) | sk2Var.d(i3) | sk2Var.f(ki2Var) | sk2Var.f(mi2Var6) | sk2Var.f(mi2Var7) | sk2Var.h(map3) | sk2Var.d(i4) | sk2Var.f(mi2Var8) | sk2Var.g(z4) | sk2Var.h(set) | sk2Var.f(mi2Var9);
                    Object L = sk2Var.L();
                    if (f7 || L == su0.a) {
                        mi2 mi2Var10 = new mi2() { // from class: qh5
                            @Override // defpackage.mi2
                            public final Object n(Object obj3) {
                                mi2 mi2Var11;
                                mi2 mi2Var12;
                                ek3 ek3Var = (ek3) obj3;
                                ek3Var.getClass();
                                final ri5 ri5Var2 = ri5Var;
                                ek3.a0(ek3Var, "filters", null, new et0(-1751004163, true, new ci5(ri5Var2, mi2Var, 0)), 2);
                                boolean z5 = z2;
                                Map map4 = map;
                                Map map5 = map2;
                                mi2 mi2Var13 = mi2Var2;
                                mi2 mi2Var14 = mi2Var3;
                                mi2 mi2Var15 = mi2Var5;
                                if (z5) {
                                    mi2Var11 = mi2Var13;
                                    mi2Var12 = mi2Var14;
                                    ek3.a0(ek3Var, "continue", null, new et0(-521848040, true, new oh5(ri5Var2, map4, map5, mi2Var13, mi2Var14, mi2Var4, mi2Var15, 1)), 2);
                                } else {
                                    mi2Var11 = mi2Var13;
                                    mi2Var12 = mi2Var14;
                                }
                                if (z3) {
                                    final int i5 = i3;
                                    final ki2 ki2Var2 = ki2Var;
                                    final mi2 mi2Var16 = mi2Var6;
                                    ek3.a0(ek3Var, "section_header", null, new et0(-717957041, true, new bj2() { // from class: di5
                                        @Override // defpackage.bj2
                                        public final Object i(Object obj4, Object obj5, Object obj6) {
                                            boolean z6;
                                            String o;
                                            tu0 tu0Var2 = (tu0) obj5;
                                            int intValue2 = ((Integer) obj6).intValue();
                                            ((ni3) obj4).getClass();
                                            if ((intValue2 & 17) != 16) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            sk2 sk2Var2 = (sk2) tu0Var2;
                                            if (sk2Var2.O(intValue2 & 1, z6)) {
                                                ri5 ri5Var3 = ri5.this;
                                                if (ri5Var3.c) {
                                                    sk2Var2.X(279028075);
                                                    o = (String) tq0.U0(ri5Var3.b);
                                                    if (o == null) {
                                                        o = b31.o(sk2Var2, 1533022613, R.string.rom_all_games, sk2Var2, false);
                                                    } else {
                                                        sk2Var2.X(1533021559);
                                                        sk2Var2.p(false);
                                                    }
                                                    sk2Var2.p(false);
                                                } else {
                                                    o = b31.o(sk2Var2, 1533024021, R.string.rom_all_games, sk2Var2, false);
                                                }
                                                nk2.h(o, ri5Var3.c, ri5Var3.h, ri5Var3.i, ri5Var3.a.size() - i5, ki2Var2, mi2Var16, null, sk2Var2, 0, 128);
                                            } else {
                                                sk2Var2.R();
                                            }
                                            return o27.a;
                                        }
                                    }), 2);
                                }
                                List list = ri5Var2.a;
                                ek3Var.b0(list.size(), new s5(21, new qt0(26), list), new k5(17, list), new et0(2039820996, true, new hi5(list, mi2Var7, map3, i4, mi2Var8, ri5Var2, mi2Var15, map4, map5, z4, set, mi2Var11, mi2Var12, mi2Var9)));
                                return o27.a;
                            }
                        };
                        sk2Var.h0(mi2Var10);
                        L = mi2Var10;
                    }
                    io2.b(s72Var, pk3Var, mh4Var, null, null, null, false, null, (mi2) L, sk2Var, 6, 504);
                    return o27Var;
                }
                sk2Var.R();
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                dt3.I(this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0, this.s0, (tu0) obj, ep2.I(1));
                return o27Var;
        }
    }

    public /* synthetic */ bi5(boolean z, float f, pk3 pk3Var, ri5 ri5Var, mi2 mi2Var, boolean z2, Map map, Map map2, mi2 mi2Var2, mi2 mi2Var3, mi2 mi2Var4, mi2 mi2Var5, boolean z3, int i, ki2 ki2Var, mi2 mi2Var6, mi2 mi2Var7, Map map3, int i2, mi2 mi2Var8, boolean z4, Set set, mi2 mi2Var9) {
        this.Y = z;
        this.g0 = f;
        this.L = pk3Var;
        this.B = ri5Var;
        this.j0 = mi2Var;
        this.c0 = z2;
        this.R = map;
        this.X = map2;
        this.k0 = mi2Var2;
        this.l0 = mi2Var3;
        this.m0 = mi2Var4;
        this.n0 = mi2Var5;
        this.d0 = z3;
        this.f0 = i;
        this.r0 = ki2Var;
        this.o0 = mi2Var6;
        this.p0 = mi2Var7;
        this.h0 = map3;
        this.i0 = i2;
        this.q0 = mi2Var8;
        this.e0 = z4;
        this.Z = set;
        this.s0 = mi2Var9;
    }
}
