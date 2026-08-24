package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ne4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ne4 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ ne4(on2 on2Var, nx1 nx1Var, qn2 qn2Var, qa4 qa4Var, qa4 qa4Var2) {
        this.A = 1;
        this.B = on2Var;
        this.X = nx1Var;
        this.L = qn2Var;
        this.Y = qa4Var;
        this.R = qa4Var2;
    }

    private final Object a(Object obj, Object obj2) {
        boolean z;
        long j;
        long j2;
        oj2 oj2Var;
        List<vr4> list = (List) this.X;
        final eo2 eo2Var = (eo2) this.L;
        final qa4 qa4Var = (qa4) this.R;
        final qa4 qa4Var2 = (qa4) this.B;
        final qa4 qa4Var3 = (qa4) this.Y;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        boolean z2 = true;
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        if (xq2Var.S(intValue & 1, z)) {
            x64 x64Var = x64.a;
            float f = 1.0f;
            a74 c = dj6.c(x64Var, 1.0f);
            yt0 a = wt0.a(new gu(6.0f, true, new i(1)), d90.k0, xq2Var, 6);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, c);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            xq2Var.b0(-1510416753);
            for (vr4 vr4Var : list) {
                final String str = (String) vr4Var.A;
                String str2 = (String) vr4Var.B;
                boolean k = nb3.k(str, (String) qa4Var.getValue());
                a74 g = u24.g(dj6.c(x64Var, f), z16.b(8.0f));
                if (k) {
                    xq2Var.b0(1653630343);
                    j = kt0.c(0.15f, bl2.F(xq2Var).l);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(1653632255);
                    xq2Var.p(false);
                    j = kt0.g;
                }
                a74 L = vy7.L(g, j, u24.m);
                boolean f2 = xq2Var.f(str) | xq2Var.f(eo2Var);
                Object P = xq2Var.P();
                vs0 vs0Var = ox0.a;
                if (f2 || P == vs0Var) {
                    on2 on2Var = new on2() { // from class: bb7
                        @Override // defpackage.on2
                        public final Object c() {
                            int i = r6;
                            jg7 jg7Var = jg7.a;
                            qa4 qa4Var4 = qa4Var3;
                            qa4 qa4Var5 = qa4Var2;
                            qa4 qa4Var6 = qa4Var;
                            eo2 eo2Var2 = eo2Var;
                            String str3 = str;
                            switch (i) {
                                case 0:
                                    qa4Var6.setValue(str3);
                                    eo2Var2.o("translator_tts_voice_engine", str3);
                                    eo2Var2.o("translator_tts_neural_enabled", Boolean.valueOf(nb3.k(str3, "neural_edge")));
                                    eo2Var2.o("translator_tts_multi_voice", Boolean.valueOf(!nb3.k(str3, "single")));
                                    if (nb3.k(str3, "local_multi")) {
                                        Boolean bool = Boolean.TRUE;
                                        qa4Var5.setValue(bool);
                                        eo2Var2.o("translator_local_voice_actor_studio", bool);
                                    }
                                    qa4Var4.setValue(Boolean.FALSE);
                                    return jg7Var;
                                default:
                                    qa4Var6.setValue(str3);
                                    eo2Var2.o("translator_tts_voice_engine", str3);
                                    eo2Var2.o("translator_tts_neural_enabled", Boolean.valueOf(nb3.k(str3, "neural_edge")));
                                    eo2Var2.o("translator_tts_multi_voice", Boolean.valueOf(!nb3.k(str3, "single")));
                                    if (nb3.k(str3, "local_multi")) {
                                        Boolean bool2 = Boolean.TRUE;
                                        qa4Var5.setValue(bool2);
                                        eo2Var2.o("translator_local_voice_actor_studio", bool2);
                                    }
                                    qa4Var4.setValue(Boolean.FALSE);
                                    return jg7Var;
                            }
                        }
                    };
                    xq2Var.l0(on2Var);
                    P = on2Var;
                }
                a74 P2 = ge7.P(mb3.u(L, false, null, (on2) P, 15), 12.0f, 10.0f);
                l26 a2 = k26.a(ju.e, d90.i0, xq2Var, 54);
                int hashCode2 = Long.hashCode(xq2Var.T);
                xv4 l2 = xq2Var.l();
                a74 E2 = l.E(xq2Var, P2);
                jx0.i.getClass();
                iy0 iy0Var2 = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var2);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, a2);
                yh2.K(xq2Var, ix0.e, l2);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode2));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E2);
                if (k) {
                    xq2Var.b0(-383165963);
                    j2 = bl2.F(xq2Var).l;
                } else {
                    xq2Var.b0(-383165260);
                    j2 = bl2.F(xq2Var).g;
                }
                xq2Var.p(false);
                if (k) {
                    oj2Var = oj2.e0;
                } else {
                    oj2Var = oj2.Y;
                }
                xq2 xq2Var2 = xq2Var;
                x37.b(str2, new vn3(1.0f, true), j2, hi2.E(13), oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 3072, 0, 131024);
                boolean f3 = xq2Var2.f(str) | xq2Var2.f(eo2Var);
                Object P3 = xq2Var2.P();
                if (f3 || P3 == vs0Var) {
                    on2 on2Var2 = new on2() { // from class: bb7
                        @Override // defpackage.on2
                        public final Object c() {
                            int i = r6;
                            jg7 jg7Var = jg7.a;
                            qa4 qa4Var4 = qa4Var3;
                            qa4 qa4Var5 = qa4Var2;
                            qa4 qa4Var6 = qa4Var;
                            eo2 eo2Var2 = eo2Var;
                            String str3 = str;
                            switch (i) {
                                case 0:
                                    qa4Var6.setValue(str3);
                                    eo2Var2.o("translator_tts_voice_engine", str3);
                                    eo2Var2.o("translator_tts_neural_enabled", Boolean.valueOf(nb3.k(str3, "neural_edge")));
                                    eo2Var2.o("translator_tts_multi_voice", Boolean.valueOf(!nb3.k(str3, "single")));
                                    if (nb3.k(str3, "local_multi")) {
                                        Boolean bool = Boolean.TRUE;
                                        qa4Var5.setValue(bool);
                                        eo2Var2.o("translator_local_voice_actor_studio", bool);
                                    }
                                    qa4Var4.setValue(Boolean.FALSE);
                                    return jg7Var;
                                default:
                                    qa4Var6.setValue(str3);
                                    eo2Var2.o("translator_tts_voice_engine", str3);
                                    eo2Var2.o("translator_tts_neural_enabled", Boolean.valueOf(nb3.k(str3, "neural_edge")));
                                    eo2Var2.o("translator_tts_multi_voice", Boolean.valueOf(!nb3.k(str3, "single")));
                                    if (nb3.k(str3, "local_multi")) {
                                        Boolean bool2 = Boolean.TRUE;
                                        qa4Var5.setValue(bool2);
                                        eo2Var2.o("translator_local_voice_actor_studio", bool2);
                                    }
                                    qa4Var4.setValue(Boolean.FALSE);
                                    return jg7Var;
                            }
                        }
                    };
                    xq2Var2.l0(on2Var2);
                    P3 = on2Var2;
                }
                kd5.a(k, (on2) P3, null, false, jx2.n(bl2.F(xq2Var2).l, bl2.F(xq2Var2).h, xq2Var2, 0, 4), xq2Var2, 0, 28);
                xq2Var2.p(true);
                f = 1.0f;
                xq2Var = xq2Var2;
                z2 = true;
            }
            boolean z3 = z2;
            xq2 xq2Var3 = xq2Var;
            xq2Var3.p(false);
            xq2Var3.p(z3);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        iy0 iy0Var;
        float f;
        ne neVar;
        long j;
        float f2;
        qa4 qa4Var;
        boolean z2;
        long j2;
        long c;
        long c2;
        n26 n26Var;
        long j3;
        qa4 qa4Var2;
        int i;
        xq2 xq2Var;
        d40 d40Var;
        long c3;
        long c4;
        a74 L;
        boolean z3;
        int i2 = this.A;
        vs0 vs0Var = ox0.a;
        boolean z4 = false;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.Y;
        Object obj4 = this.R;
        Object obj5 = this.B;
        Object obj6 = this.L;
        Object obj7 = this.X;
        switch (i2) {
            case 0:
                List list = (List) obj7;
                qn2 qn2Var = (qn2) obj6;
                on2 on2Var = (on2) obj5;
                qa4 qa4Var3 = (qa4) obj4;
                Context context = (Context) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z)) {
                    lc2 lc2Var = dj6.c;
                    int i3 = kt0.i;
                    long j4 = kt0.b;
                    long c5 = kt0.c(0.9f, j4);
                    jy2 jy2Var = u24.m;
                    a74 O = ge7.O(vy7.L(lc2Var, c5, jy2Var), 16.0f);
                    e40 e40Var = d90.Z;
                    e34 d = h70.d(e40Var, false);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, O);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var2, pnVar, d);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var2, pnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var2, pnVar3, valueOf);
                    ne neVar2 = ix0.h;
                    yh2.F(xq2Var2, neVar2);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var2, pnVar4, E);
                    x64 x64Var = x64.a;
                    a74 O2 = ge7.O(vy7.L(u24.g(dj6.b(dj6.c(x64Var, 0.95f), 0.88f), z16.b(20.0f)), hv.c(4279441186L), jy2Var), 20.0f);
                    c40 c40Var = d90.k0;
                    eu euVar = ju.c;
                    yt0 a = wt0.a(euVar, c40Var, xq2Var2, 0);
                    int hashCode2 = Long.hashCode(xq2Var2.T);
                    xv4 l2 = xq2Var2.l();
                    a74 E2 = l.E(xq2Var2, O2);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a);
                    yh2.K(xq2Var2, pnVar2, l2);
                    i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar2);
                    yh2.K(xq2Var2, pnVar4, E2);
                    a74 c6 = dj6.c(x64Var, 1.0f);
                    d40 d40Var2 = d90.i0;
                    vs0 vs0Var2 = ju.e;
                    l26 a2 = k26.a(vs0Var2, d40Var2, xq2Var2, 54);
                    int hashCode3 = Long.hashCode(xq2Var2.T);
                    xv4 l3 = xq2Var2.l();
                    a74 E3 = l.E(xq2Var2, c6);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        iy0Var = iy0Var2;
                        xq2Var2.k(iy0Var);
                    } else {
                        iy0Var = iy0Var2;
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a2);
                    yh2.K(xq2Var2, pnVar2, l3);
                    i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar2);
                    yh2.K(xq2Var2, pnVar4, E3);
                    du duVar = ju.a;
                    l26 a3 = k26.a(duVar, d40Var2, xq2Var2, 48);
                    int hashCode4 = Long.hashCode(xq2Var2.T);
                    xv4 l4 = xq2Var2.l();
                    a74 E4 = l.E(xq2Var2, x64Var);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a3);
                    yh2.K(xq2Var2, pnVar2, l4);
                    i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar2);
                    yh2.K(xq2Var2, pnVar4, E4);
                    a74 g = u24.g(dj6.i(x64Var, 36.0f), z16.a);
                    long j5 = kt0.d;
                    iy0 iy0Var3 = iy0Var;
                    ej2.b(on2Var, vy7.L(g, kt0.c(0.12f, j5), jy2Var), false, u24.c, xq2Var2, 24576, 12);
                    gi2.h(xq2Var2, dj6.l(x64Var, 10.0f));
                    yt0 a4 = wt0.a(euVar, c40Var, xq2Var2, 0);
                    int hashCode5 = Long.hashCode(xq2Var2.T);
                    xv4 l5 = xq2Var2.l();
                    a74 E5 = l.E(xq2Var2, x64Var);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var3);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a4);
                    yh2.K(xq2Var2, pnVar2, l5);
                    i61.w(hashCode5, xq2Var2, pnVar3, xq2Var2, neVar2);
                    yh2.K(xq2Var2, pnVar4, E5);
                    pi2 pi2Var = qs7.a;
                    long E6 = hi2.E(14);
                    oj2 oj2Var = oj2.e0;
                    x37.b("NETPLAY & NIFI МУЛЬТИПЛЕЕР", null, j5, E6, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772934, 0, 130962);
                    long c7 = kt0.c(0.6f, j5);
                    sr2 sr2Var = qs7.c;
                    x37.b("Беспроводная игра вдвоем (Wi-Fi / Hotspot) и онлайн", null, c7, hi2.E(9), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1576326, 0, 130994);
                    i61.y(xq2Var2, true, true, true);
                    gi2.h(xq2Var2, dj6.e(x64Var, 14.0f));
                    a74 O3 = ge7.O(vy7.L(u24.g(dj6.c(x64Var, 1.0f), z16.b(12.0f)), hv.c(4280165427L), jy2Var), 4.0f);
                    gu guVar = new gu(4.0f, true, new i(1));
                    d40 d40Var3 = d90.h0;
                    l26 a5 = k26.a(guVar, d40Var3, xq2Var2, 6);
                    int hashCode6 = Long.hashCode(xq2Var2.T);
                    xv4 l6 = xq2Var2.l();
                    a74 E7 = l.E(xq2Var2, O3);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var3);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a5);
                    yh2.K(xq2Var2, pnVar2, l6);
                    i61.w(hashCode6, xq2Var2, pnVar3, xq2Var2, neVar2);
                    yh2.K(xq2Var2, pnVar4, E7);
                    n26 n26Var2 = n26.a;
                    a74 g2 = u24.g(n26Var2.b(x64Var, 1.0f, true), z16.b(9.0f));
                    if (((Number) qa4Var3.getValue()).intValue() == 0) {
                        f = 9.0f;
                        neVar = neVar2;
                        j = kt0.c(0.25f, hv.c(4278248959L));
                    } else {
                        f = 9.0f;
                        neVar = neVar2;
                        j = kt0.g;
                    }
                    a74 L2 = vy7.L(g2, j, jy2Var);
                    Object P = xq2Var2.P();
                    if (P == vs0Var) {
                        f2 = f;
                        qa4Var = qa4Var3;
                        z2 = false;
                        P = new oe4(qa4Var, 0);
                        xq2Var2.l0(P);
                    } else {
                        f2 = f;
                        qa4Var = qa4Var3;
                        z2 = false;
                    }
                    ne neVar3 = neVar;
                    a74 Q = ge7.Q(mb3.u(L2, z2, null, (on2) P, 15), RecyclerView.B1, 8.0f, 1);
                    e34 d2 = h70.d(e40Var, z2);
                    int hashCode7 = Long.hashCode(xq2Var2.T);
                    xv4 l7 = xq2Var2.l();
                    a74 E8 = l.E(xq2Var2, Q);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var3);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, d2);
                    yh2.K(xq2Var2, pnVar2, l7);
                    i61.w(hashCode7, xq2Var2, pnVar3, xq2Var2, neVar3);
                    yh2.K(xq2Var2, pnVar4, E8);
                    l26 a6 = k26.a(duVar, d40Var2, xq2Var2, 48);
                    int hashCode8 = Long.hashCode(xq2Var2.T);
                    xv4 l8 = xq2Var2.l();
                    a74 E9 = l.E(xq2Var2, x64Var);
                    xq2Var2.f0();
                    qa4 qa4Var4 = qa4Var;
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var3);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a6);
                    yh2.K(xq2Var2, pnVar2, l8);
                    i61.w(hashCode8, xq2Var2, pnVar3, xq2Var2, neVar3);
                    yh2.K(xq2Var2, pnVar4, E9);
                    e33 a7 = dt7.a();
                    if (((Number) qa4Var4.getValue()).intValue() == 0) {
                        c = hv.c(4278248959L);
                        j2 = j5;
                    } else {
                        j2 = j5;
                        c = kt0.c(0.6f, j2);
                    }
                    i13.a(a7, null, dj6.i(x64Var, 16.0f), c, xq2Var2, 432, 0);
                    gi2.h(xq2Var2, dj6.l(x64Var, 6.0f));
                    if (((Number) qa4Var4.getValue()).intValue() == 0) {
                        c2 = hv.c(4278248959L);
                    } else {
                        c2 = kt0.c(0.7f, j2);
                    }
                    x37.b("NiFi Local (Wi-Fi)", null, c2, hi2.E(10), oj2Var, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772550, 0, 130962);
                    xq2Var2.p(true);
                    xq2Var2.p(true);
                    a74 g3 = u24.g(n26Var2.b(x64Var, 1.0f, true), z16.b(f2));
                    if (((Number) qa4Var4.getValue()).intValue() == 1) {
                        n26Var = n26Var2;
                        j3 = kt0.c(0.25f, hv.c(4279286145L));
                    } else {
                        n26Var = n26Var2;
                        j3 = kt0.g;
                    }
                    a74 L3 = vy7.L(g3, j3, jy2Var);
                    Object P2 = xq2Var2.P();
                    if (P2 == vs0Var) {
                        qa4Var2 = qa4Var4;
                        i = 1;
                        P2 = new oe4(qa4Var2, 1);
                        xq2Var2.l0(P2);
                    } else {
                        qa4Var2 = qa4Var4;
                        i = 1;
                    }
                    qa4 qa4Var5 = qa4Var2;
                    a74 Q2 = ge7.Q(mb3.u(L3, false, null, (on2) P2, 15), RecyclerView.B1, 8.0f, i);
                    e34 d3 = h70.d(e40Var, false);
                    int hashCode9 = Long.hashCode(xq2Var2.T);
                    xv4 l9 = xq2Var2.l();
                    a74 E10 = l.E(xq2Var2, Q2);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var3);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, d3);
                    yh2.K(xq2Var2, pnVar2, l9);
                    i61.w(hashCode9, xq2Var2, pnVar3, xq2Var2, neVar3);
                    yh2.K(xq2Var2, pnVar4, E10);
                    l26 a8 = k26.a(duVar, d40Var2, xq2Var2, 48);
                    int hashCode10 = Long.hashCode(xq2Var2.T);
                    xv4 l10 = xq2Var2.l();
                    a74 E11 = l.E(xq2Var2, x64Var);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var3);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a8);
                    yh2.K(xq2Var2, pnVar2, l10);
                    i61.w(hashCode10, xq2Var2, pnVar3, xq2Var2, neVar3);
                    yh2.K(xq2Var2, pnVar4, E11);
                    e33 e33Var = jx2.b;
                    if (e33Var != null) {
                        d40Var = d40Var2;
                        xq2Var = xq2Var2;
                    } else {
                        d33 d33Var = new d33("Filled.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = el7.a;
                        cn6 cn6Var = new cn6(kt0.b);
                        ww2 ww2Var = new ww2(1, (byte) 0);
                        ww2Var.o(11.99f, 2.0f);
                        ww2Var.h(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        xq2Var = xq2Var2;
                        ww2Var.q(4.47f, 10.0f, 9.99f, 10.0f);
                        ww2Var.h(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                        ww2Var.p(17.52f, 2.0f, 11.99f, 2.0f);
                        ww2Var.g();
                        ww2Var.o(18.92f, 8.0f);
                        ww2Var.l(-2.95f);
                        ww2Var.i(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
                        ww2Var.i(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
                        ww2Var.g();
                        ww2Var.o(12.0f, 4.04f);
                        ww2Var.i(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
                        ww2Var.l(-3.82f);
                        ww2Var.i(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
                        ww2Var.g();
                        ww2Var.o(4.26f, 14.0f);
                        ww2Var.h(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
                        d40Var = d40Var2;
                        ww2Var.q(0.1f, -1.36f, 0.26f, -2.0f);
                        ww2Var.l(3.38f);
                        ww2Var.i(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
                        ww2Var.i(RecyclerView.B1, 0.68f, 0.06f, 1.34f, 0.14f, 2.0f);
                        ww2Var.m(4.26f, 14.0f);
                        ww2Var.g();
                        ww2Var.o(5.08f, 16.0f);
                        ww2Var.l(2.95f);
                        ww2Var.i(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
                        ww2Var.i(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
                        ww2Var.g();
                        ww2Var.o(8.03f, 8.0f);
                        ww2Var.m(5.08f, 8.0f);
                        ww2Var.i(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
                        ww2Var.h(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
                        ww2Var.g();
                        ww2Var.o(12.0f, 19.96f);
                        ww2Var.i(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
                        ww2Var.l(3.82f);
                        ww2Var.i(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
                        ww2Var.g();
                        ww2Var.o(14.34f, 14.0f);
                        ww2Var.m(9.66f, 14.0f);
                        ww2Var.i(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
                        ww2Var.i(RecyclerView.B1, -0.68f, 0.07f, -1.35f, 0.16f, -2.0f);
                        ww2Var.l(4.68f);
                        ww2Var.i(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
                        ww2Var.i(RecyclerView.B1, 0.68f, -0.07f, 1.34f, -0.16f, 2.0f);
                        ww2Var.g();
                        ww2Var.o(14.59f, 19.56f);
                        ww2Var.i(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
                        ww2Var.l(2.95f);
                        ww2Var.i(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
                        ww2Var.g();
                        ww2Var.o(16.36f, 14.0f);
                        ww2Var.i(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
                        ww2Var.i(RecyclerView.B1, -0.68f, -0.06f, -1.34f, -0.14f, -2.0f);
                        ww2Var.l(3.38f);
                        ww2Var.i(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
                        ww2Var.q(-0.1f, 1.36f, -0.26f, 2.0f);
                        ww2Var.l(-3.38f);
                        ww2Var.g();
                        d33.a(d33Var, ww2Var.b, 0, cn6Var);
                        e33Var = d33Var.b();
                        jx2.b = e33Var;
                    }
                    e33 e33Var2 = e33Var;
                    if (((Number) qa4Var5.getValue()).intValue() == 1) {
                        c3 = hv.c(4279286145L);
                    } else {
                        c3 = kt0.c(0.6f, j2);
                    }
                    xq2 xq2Var3 = xq2Var;
                    i13.a(e33Var2, null, dj6.i(x64Var, 16.0f), c3, xq2Var3, 432, 0);
                    gi2.h(xq2Var3, dj6.l(x64Var, 6.0f));
                    if (((Number) qa4Var5.getValue()).intValue() == 1) {
                        c4 = hv.c(4279286145L);
                    } else {
                        c4 = kt0.c(0.7f, j2);
                    }
                    x37.b("WFC Онлайн", null, c4, hi2.E(10), oj2Var, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772550, 0, 130962);
                    i61.y(xq2Var3, true, true, true);
                    gi2.h(xq2Var3, dj6.e(x64Var, 14.0f));
                    if (((Number) qa4Var5.getValue()).intValue() == 0) {
                        xq2Var3.b0(-1546224689);
                        a74 O4 = ge7.O(vy7.L(u24.g(zt0.a(dj6.c(x64Var, 1.0f)), z16.b(14.0f)), hv.c(4280165427L), jy2Var), 16.0f);
                        yt0 a9 = wt0.a(vs0Var2, c40Var, xq2Var3, 6);
                        int hashCode11 = Long.hashCode(xq2Var3.T);
                        xv4 l11 = xq2Var3.l();
                        a74 E12 = l.E(xq2Var3, O4);
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var3);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, pnVar, a9);
                        yh2.K(xq2Var3, pnVar2, l11);
                        i61.w(hashCode11, xq2Var3, pnVar3, xq2Var3, neVar3);
                        yh2.K(xq2Var3, pnVar4, E12);
                        yt0 a10 = wt0.a(euVar, c40Var, xq2Var3, 0);
                        int hashCode12 = Long.hashCode(xq2Var3.T);
                        xv4 l12 = xq2Var3.l();
                        a74 E13 = l.E(xq2Var3, x64Var);
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var3);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, pnVar, a10);
                        yh2.K(xq2Var3, pnVar2, l12);
                        i61.w(hashCode12, xq2Var3, pnVar3, xq2Var3, neVar3);
                        yh2.K(xq2Var3, pnVar4, E13);
                        l26 a11 = k26.a(duVar, d40Var, xq2Var3, 48);
                        int hashCode13 = Long.hashCode(xq2Var3.T);
                        xv4 l13 = xq2Var3.l();
                        a74 E14 = l.E(xq2Var3, x64Var);
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var3);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, pnVar, a11);
                        yh2.K(xq2Var3, pnVar2, l13);
                        i61.w(hashCode13, xq2Var3, pnVar3, xq2Var3, neVar3);
                        yh2.K(xq2Var3, pnVar4, E14);
                        i13.a(dt7.a(), null, dj6.i(x64Var, 20.0f), hv.c(4278248959L), xq2Var3, 3504, 0);
                        gi2.h(xq2Var3, dj6.l(x64Var, 8.0f));
                        long j6 = j2;
                        x37.b("Локальный беспроводной NiFi (Прямой Wi-Fi / Hotspot)", null, j6, hi2.E(13), oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772934, 0, 130962);
                        xq2Var3.p(true);
                        gi2.h(xq2Var3, dj6.e(x64Var, 10.0f));
                        x37.b("• Подключите оба устройства к одной Wi-Fi сети или раздайте точку доступа (Wi-Fi Hotspot) с одного из телефонов.\n\n• Запустите игру на обоих смартфонах.\n\n• В меню игры выберите «Wireless Communications» или «Multi-Card Play».\n\n• STORM DS автоматически пересылает 802.11b пакеты между эмуляторами в локальной сети без проводов!", null, kt0.c(0.85f, j6), hi2.D(11.5d), null, null, 0L, null, hi2.E(17), 0, false, 0, 0, null, null, xq2Var3, 3462, 6, 130034);
                        xq2Var3.p(true);
                        a74 J = vy7.J(u24.g(dj6.c(x64Var, 1.0f), z16.b(12.0f)), d90.k(hf.c0(new kt0(hv.c(4278355143L)), new kt0(hv.c(4278248959L))), RecyclerView.B1, RecyclerView.B1, 14));
                        boolean h = xq2Var3.h(context) | xq2Var3.f(on2Var);
                        Object P3 = xq2Var3.P();
                        if (h || P3 == vs0Var) {
                            P3 = new pe4(context, on2Var);
                            xq2Var3.l0(P3);
                        }
                        a74 Q3 = ge7.Q(mb3.u(J, false, null, (on2) P3, 15), RecyclerView.B1, 12.0f, 1);
                        e34 d4 = h70.d(e40Var, false);
                        int hashCode14 = Long.hashCode(xq2Var3.T);
                        xv4 l14 = xq2Var3.l();
                        a74 E15 = l.E(xq2Var3, Q3);
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var3);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, pnVar, d4);
                        yh2.K(xq2Var3, pnVar2, l14);
                        i61.w(hashCode14, xq2Var3, pnVar3, xq2Var3, neVar3);
                        yh2.K(xq2Var3, pnVar4, E15);
                        x37.b("ЗАПУСТИТЬ С NIFI LOCAL WIRELESS", null, j4, hi2.E(11), oj2Var, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772934, 0, 130962);
                        i61.y(xq2Var3, true, true, false);
                    } else {
                        d40 d40Var4 = d40Var;
                        xq2Var3.b0(-1543155999);
                        a74 c8 = dj6.c(x64Var, 1.0f);
                        l26 a12 = k26.a(new gu(10.0f, true, new i(1)), d40Var3, xq2Var3, 6);
                        int hashCode15 = Long.hashCode(xq2Var3.T);
                        xv4 l15 = xq2Var3.l();
                        a74 E16 = l.E(xq2Var3, c8);
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var3);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, pnVar, a12);
                        yh2.K(xq2Var3, pnVar2, l15);
                        i61.w(hashCode15, xq2Var3, pnVar3, xq2Var3, neVar3);
                        yh2.K(xq2Var3, pnVar4, E16);
                        a74 J2 = vy7.J(u24.g(n26Var.b(x64Var, 1.0f, true), z16.b(12.0f)), d90.k(hf.c0(new kt0(hv.c(4278556265L)), new kt0(hv.c(4279286145L))), RecyclerView.B1, RecyclerView.B1, 14));
                        boolean h2 = xq2Var3.h(context);
                        Object P4 = xq2Var3.P();
                        if (h2 || P4 == vs0Var) {
                            P4 = new ej0(context, 6);
                            xq2Var3.l0(P4);
                        }
                        a74 Q4 = ge7.Q(mb3.u(J2, false, null, (on2) P4, 15), RecyclerView.B1, 10.0f, 1);
                        e34 d5 = h70.d(e40Var, false);
                        int hashCode16 = Long.hashCode(xq2Var3.T);
                        xv4 l16 = xq2Var3.l();
                        a74 E17 = l.E(xq2Var3, Q4);
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var3);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, pnVar, d5);
                        yh2.K(xq2Var3, pnVar2, l16);
                        i61.w(hashCode16, xq2Var3, pnVar3, xq2Var3, neVar3);
                        yh2.K(xq2Var3, pnVar4, E17);
                        l26 a13 = k26.a(duVar, d40Var4, xq2Var3, 48);
                        int hashCode17 = Long.hashCode(xq2Var3.T);
                        xv4 l17 = xq2Var3.l();
                        a74 E18 = l.E(xq2Var3, x64Var);
                        xq2Var3.f0();
                        if (xq2Var3.D()) {
                            xq2Var3.k(iy0Var3);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, ix0.d(), a13);
                        yh2.K(xq2Var3, ix0.f(), l17);
                        yh2.K(xq2Var3, ix0.c(), Integer.valueOf(hashCode17));
                        yh2.F(xq2Var3, ix0.a());
                        yh2.K(xq2Var3, ix0.e(), E18);
                        i13.a(ej2.G(), null, dj6.i(x64Var, 16.0f), xd5.q(), xq2Var3, 3504, 0);
                        gi2.h(xq2Var3, dj6.l(x64Var, 6.0f));
                        x37.b("СОЗДАТЬ ОНЛАЙН КОМНАТУ", null, xd5.q(), hi2.E(10), nj2.p(), qs7.b(), 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772934, 0, 130962);
                        xq2Var3.r();
                        xq2Var3.r();
                        L = vy7.L(u24.g(x64Var, z16.b(12.0f)), kt0.c(0.12f, xd5.q()), u24.m);
                        boolean h3 = xq2Var3.h(context);
                        Object P5 = xq2Var3.P();
                        if (h3 || P5 == vs0Var) {
                            P5 = new ej0(context, 7);
                            xq2Var3.l0(P5);
                        }
                        a74 P6 = ge7.P(mb3.u(L, false, null, (on2) P5, 15), 14.0f, 10.0f);
                        e34 d6 = h70.d(e40Var, false);
                        int hashCode18 = Long.hashCode(ge7.C(xq2Var3));
                        xv4 z5 = xq2Var3.z();
                        a74 E19 = l.E(xq2Var3, P6);
                        iy0 b = ix0.b();
                        xq2Var3.f0();
                        if (xq2Var3.D()) {
                            xq2Var3.k(b);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, ix0.d(), d6);
                        yh2.K(xq2Var3, ix0.f(), z5);
                        yh2.K(xq2Var3, ix0.c(), Integer.valueOf(hashCode18));
                        yh2.F(xq2Var3, ix0.a());
                        yh2.K(xq2Var3, ix0.e(), E19);
                        i13.a(bl2.E(), "Refresh", dj6.i(x64Var, 18.0f), xd5.q(), xq2Var3, 3504, 0);
                        xq2Var3.r();
                        xq2Var3.r();
                        gi2.h(xq2Var3, dj6.e(x64Var, 12.0f));
                        a74 a14 = zt0.a(x64Var);
                        gu guVar2 = new gu(10.0f, true, new i(1));
                        boolean h4 = xq2Var3.h(list) | xq2Var3.f(qn2Var);
                        Object P7 = xq2Var3.P();
                        if (h4 || P7 == vs0Var) {
                            P7 = new t32(list, qn2Var, 3);
                            xq2Var3.l0(P7);
                        }
                        gi2.e(a14, null, null, guVar2, null, null, false, null, (qn2) P7, xq2Var3, 24576, 494);
                        xq2Var3.s();
                    }
                    xq2Var3.r();
                    xq2Var3.r();
                    return jg7Var;
                }
                xq2Var2.V();
                return jg7Var;
            case 1:
                on2 on2Var2 = (on2) obj5;
                nx1 nx1Var = (nx1) obj7;
                qn2 qn2Var2 = (qn2) obj6;
                pp6 pp6Var = (pp6) obj3;
                qa4 qa4Var6 = (qa4) obj4;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z4 = true;
                }
                xq2 xq2Var4 = (xq2) px0Var2;
                if (xq2Var4.S(intValue2 & 1, z4)) {
                    hv.d(j31.a.a(new kt0(((ut0) xq2Var4.j(vt0.a)).f())), n16.I(246518593, new c4(bl2.F(xq2Var4), on2Var2, nx1Var, qn2Var2, pp6Var, qa4Var6), xq2Var4), xq2Var4, 56);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 2:
                ((Integer) obj2).getClass();
                nc1.o((a74) obj7, (ta5) obj4, (ss3) obj3, (on2) obj5, (qn2) obj6, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 3:
                ((Integer) obj2).getClass();
                vy7.p((a74) obj7, (lq4) obj5, (rp0) obj4, (qn2) obj6, (qn2) obj3, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 4:
                ((Integer) obj2).getClass();
                vy7.v((a74) obj5, (lq4) obj4, (List) obj7, (qn2) obj6, (qn2) obj3, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 5:
                a74 a74Var = (a74) obj7;
                qa4 qa4Var7 = (qa4) obj4;
                zv0 zv0Var = (zv0) obj6;
                h30 h30Var = (h30) obj3;
                on2 on2Var3 = (on2) obj5;
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var5 = (xq2) px0Var3;
                if (xq2Var5.S(intValue3 & 1, z3)) {
                    Object P8 = xq2Var5.P();
                    if (P8 == vs0Var) {
                        P8 = new j4(qa4Var7, 15);
                        xq2Var5.l0(P8);
                    }
                    a74 z6 = u24.z(a74Var, (qn2) P8);
                    e34 d7 = h70.d(d90.L, true);
                    int hashCode19 = Long.hashCode(xq2Var5.T);
                    xv4 l18 = xq2Var5.l();
                    a74 E20 = l.E(xq2Var5, z6);
                    jx0.i.getClass();
                    iy0 iy0Var4 = ix0.b;
                    xq2Var5.f0();
                    if (xq2Var5.S) {
                        xq2Var5.k(iy0Var4);
                    } else {
                        xq2Var5.o0();
                    }
                    yh2.K(xq2Var5, ix0.f, d7);
                    yh2.K(xq2Var5, ix0.e, l18);
                    yh2.K(xq2Var5, ix0.g, Integer.valueOf(hashCode19));
                    yh2.F(xq2Var5, ix0.h);
                    yh2.K(xq2Var5, ix0.d, E20);
                    zv0Var.o(xq2Var5, 0);
                    h30Var.b(on2Var3, xq2Var5, 6);
                    xq2Var5.p(true);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 6:
                ((Integer) obj2).getClass();
                px5.a((a74) obj7, (pq5) obj4, (on2) obj5, (qn2) obj6, (lq4) obj3, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 7:
                return a(obj, obj2);
            default:
                dh5 dh5Var = (dh5) obj7;
                dh5 dh5Var2 = (dh5) obj6;
                dh5Var.A = (p66) obj;
                dh5Var2.A = (p66) obj2;
                VideoPreferencesFragment.v((dh5) obj3, dh5Var, dh5Var2, (TextView) obj5, (VideoPreferencesFragment) obj4);
                return jg7Var;
        }
    }

    public /* synthetic */ ne4(a74 a74Var, qa4 qa4Var, zv0 zv0Var, h30 h30Var, on2 on2Var) {
        this.A = 5;
        this.X = a74Var;
        this.R = qa4Var;
        this.L = zv0Var;
        this.Y = h30Var;
        this.B = on2Var;
    }

    public /* synthetic */ ne4(a74 a74Var, lq4 lq4Var, rp0 rp0Var, qn2 qn2Var, qn2 qn2Var2, int i) {
        this.A = 3;
        this.X = a74Var;
        this.B = lq4Var;
        this.R = rp0Var;
        this.L = qn2Var;
        this.Y = qn2Var2;
    }

    public /* synthetic */ ne4(a74 a74Var, lq4 lq4Var, List list, qn2 qn2Var, qn2 qn2Var2, int i) {
        this.A = 4;
        this.B = a74Var;
        this.R = lq4Var;
        this.X = list;
        this.L = qn2Var;
        this.Y = qn2Var2;
    }

    public /* synthetic */ ne4(a74 a74Var, ta5 ta5Var, ss3 ss3Var, on2 on2Var, qn2 qn2Var, int i) {
        this.A = 2;
        this.X = a74Var;
        this.R = ta5Var;
        this.Y = ss3Var;
        this.B = on2Var;
        this.L = qn2Var;
    }

    public /* synthetic */ ne4(a74 a74Var, pq5 pq5Var, on2 on2Var, qn2 qn2Var, lq4 lq4Var, int i) {
        this.A = 6;
        this.X = a74Var;
        this.R = pq5Var;
        this.B = on2Var;
        this.L = qn2Var;
        this.Y = lq4Var;
    }

    public /* synthetic */ ne4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.X = obj;
        this.L = obj2;
        this.B = obj3;
        this.R = obj4;
        this.Y = obj5;
    }

    public /* synthetic */ ne4(List list, eo2 eo2Var, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3) {
        this.A = 7;
        this.X = list;
        this.L = eo2Var;
        this.R = qa4Var;
        this.B = qa4Var2;
        this.Y = qa4Var3;
    }
}
