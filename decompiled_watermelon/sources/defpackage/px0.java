package defpackage;

import java.util.Iterator;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: px0  reason: default package */
/* loaded from: classes.dex */
public abstract class px0 {
    public static final long a = mh7.d(3758622474L);
    public static final /* synthetic */ int b = 0;

    public static final void a(String str, List list, int i, mi2 mi2Var, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i8;
        boolean z6;
        long j;
        float f;
        String str2;
        jd7 jd7Var;
        int i9;
        wc2 wc2Var;
        boolean z7;
        pe2 pe2Var;
        is2 is2Var = iq2.g;
        i20 i20Var = y60.h0;
        mi2Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1821035555);
        if (sk2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (sk2Var.h(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (sk2Var.d(i)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (sk2Var.h(mi2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (sk2Var.h(ki2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if ((i14 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i14 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new wc2();
                sk2Var.h0(L);
            }
            wc2 wc2Var2 = (wc2) L;
            int i15 = i14 & 57344;
            if (i15 == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L2 = sk2Var.L();
            if (z2 || L2 == sn1Var) {
                L2 = new w7(3, ki2Var);
                sk2Var.h0(L2);
            }
            b53.d(false, (ki2) L2, sk2Var, 0, 1);
            s72 s72Var = o76.c;
            zy3 i16 = dk7.i(s72Var, a, is2Var);
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = new nl0(8);
                sk2Var.h0(L3);
            }
            zy3 C2 = a53.C(i16, (mi2) L3);
            Object L4 = sk2Var.L();
            if (L4 == sn1Var) {
                L4 = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L4;
            if (i15 == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L5 = sk2Var.L();
            if (z3 || L5 == sn1Var) {
                L5 = new w7(4, ki2Var);
                sk2Var.h0(L5);
            }
            zy3 r = a53.r(C2, l14Var, null, false, null, (ki2) L5, 28);
            if (i15 == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object L6 = sk2Var.L();
            if (!z4 && L6 != sn1Var) {
                z5 = false;
            } else {
                z5 = false;
                L6 = new ox0(0, ki2Var);
                sk2Var.h0(L6);
            }
            zy3 B = w81.B(r, (mi2) L6);
            tv3 d = d50.d(y60.L, z5);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, B);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, d);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            zy3 m0 = mh7.m0(s72Var, mh7.o);
            Object L7 = sk2Var.L();
            if (L7 == sn1Var) {
                i8 = i14;
                L7 = new nl0(9);
                sk2Var.h0(L7);
            } else {
                i8 = i14;
            }
            zy3 C3 = a53.C(m0, (mi2) L7);
            Object L8 = sk2Var.L();
            if (L8 == sn1Var) {
                L8 = b31.f(sk2Var);
            }
            l14 l14Var2 = (l14) L8;
            Object L9 = sk2Var.L();
            if (L9 == sn1Var) {
                L9 = new d5(20);
                sk2Var.h0(L9);
            }
            zy3 r2 = a53.r(C3, l14Var2, null, false, null, (ki2) L9, 28);
            h20 h20Var = y60.j0;
            lr0 a2 = jr0.a(rt.c, h20Var, sk2Var, 0);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, r2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a2);
            oo2.S(sk2Var, dnVar2, l2);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            wy3 wy3Var = wy3.a;
            zy3 a0 = b53.a0(o76.c(wy3Var, 1.0f), 12.0f, 8.0f, 22.0f, 8.0f);
            lt ltVar = rt.a;
            sr5 a3 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, a0);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a3);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            zy3 t = a53.t(o76.h(wy3Var, 38.0f), gr5.a);
            Object L10 = sk2Var.L();
            if (L10 == sn1Var) {
                L10 = new nl0(10);
                sk2Var.h0(L10);
            }
            zy3 s = a53.s(a53.C(t, (mi2) L10), false, null, ki2Var, 15);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode4 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e04 = l07.e0(sk2Var, s);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d2);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode4, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e04);
            ax2 A = se.A();
            String X = me2.X(sk2Var, R.string.pause_hint_back);
            long j2 = xq0.d;
            jd7 jd7Var2 = C;
            wc2 wc2Var3 = wc2Var2;
            int i17 = i8;
            lt ltVar2 = ltVar;
            boolean z8 = true;
            ev2.a(A, X, o76.h(wy3Var, 20.0f), j2, sk2Var, 3456, 0);
            sk2Var.p(true);
            cg2.k(sk2Var, o76.k(wy3Var, 10.0f));
            i20 i20Var2 = i20Var;
            int i18 = i17;
            float f2 = 10.0f;
            ir6.b(str, null, j2, hi2.B(16), pe2.c0, td7.a, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var, (i17 & 14) | 1772928, 3120, 120722);
            sk2 sk2Var2 = sk2Var;
            sk2Var2.p(true);
            int i19 = 6;
            d50.a(dk7.i(o76.d(o76.c(wy3Var, 1.0f), 1.0f), xq0.b(0.09f, j2), is2Var), sk2Var2, 6);
            ot otVar = new ot(5.0f, true, new i(1));
            zy3 Y = b53.Y(se.Z(o76.l(640.0f, 1, mr0.a()).f(new bs2(y60.k0)), se.R(sk2Var2)), 22.0f, 12.0f);
            lr0 a4 = jr0.a(otVar, h20Var, sk2Var2, 6);
            int hashCode5 = Long.hashCode(sk2Var2.T);
            sm4 l5 = sk2Var2.l();
            zy3 e05 = l07.e0(sk2Var2, Y);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, a4);
            oo2.S(sk2Var2, dnVar2, l5);
            b31.x(hashCode5, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e05);
            sk2Var2.X(321035194);
            Iterator it = list.iterator();
            int i20 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i21 = i20 + 1;
                if (i20 >= 0) {
                    String str3 = (String) next;
                    Object L11 = sk2Var2.L();
                    if (L11 == sn1Var) {
                        L11 = b31.f(sk2Var2);
                    }
                    l14 l14Var3 = (l14) L11;
                    k24 a5 = bh7.a(l14Var3, sk2Var2, i19);
                    if (i20 == i) {
                        z6 = z8;
                    } else {
                        z6 = false;
                    }
                    fr5 b2 = gr5.b(f2);
                    zy3 t2 = a53.t(o76.e(42.0f, 2, o76.c(wy3Var, 1.0f)), b2);
                    if (((Boolean) a5.getValue()).booleanValue()) {
                        j = xq0.d;
                        f = 0.16f;
                    } else {
                        int i22 = xq0.i;
                        j = xq0.d;
                        f = 0.045f;
                    }
                    zy3 i23 = dk7.i(t2, xq0.b(f, j), is2Var);
                    if (((Boolean) a5.getValue()).booleanValue()) {
                        str2 = str3;
                        jd7Var = jd7Var2;
                        i23 = b53.z(2.0f, jd7Var.j, i23, b2);
                    } else {
                        str2 = str3;
                        jd7Var = jd7Var2;
                    }
                    if (i < 0) {
                        i9 = 0;
                    } else {
                        i9 = i;
                    }
                    if (i20 == i9) {
                        wc2Var = wc2Var3;
                        i23 = b53.I(i23, wc2Var);
                    } else {
                        wc2Var = wc2Var3;
                    }
                    int i24 = i18;
                    if ((i24 & 7168) == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean d3 = z7 | sk2Var2.d(i20);
                    Object L12 = sk2Var2.L();
                    if (d3 || L12 == sn1Var) {
                        L12 = new mx0(mi2Var, i20, 0);
                        sk2Var2.h0(L12);
                    }
                    zy3 Y2 = b53.Y(a53.r(i23, l14Var3, null, false, null, (ki2) L12, 28), 14.0f, f2);
                    lt ltVar3 = ltVar2;
                    i20 i20Var3 = i20Var2;
                    sr5 a6 = rr5.a(ltVar3, i20Var3, sk2Var2, 48);
                    is2 is2Var2 = is2Var;
                    Iterator it2 = it;
                    int hashCode6 = Long.hashCode(sk2Var2.T);
                    sm4 l6 = sk2Var2.l();
                    zy3 e06 = l07.e0(sk2Var2, Y2);
                    nu0.i.getClass();
                    mv0 mv0Var2 = mu0.b;
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var2);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, mu0.f, a6);
                    oo2.S(sk2Var2, mu0.e, l6);
                    oo2.S(sk2Var2, mu0.g, Integer.valueOf(hashCode6));
                    oo2.P(sk2Var2, mu0.h);
                    oo2.S(sk2Var2, mu0.d, e06);
                    int i25 = xq0.i;
                    long j3 = xq0.d;
                    long A2 = hi2.A(13.5d);
                    long B2 = hi2.B(17);
                    if (z6) {
                        pe2Var = pe2.c0;
                    } else {
                        pe2Var = pe2.Y;
                    }
                    i20Var2 = i20Var3;
                    ltVar2 = ltVar3;
                    f2 = 10.0f;
                    sk2 sk2Var3 = sk2Var2;
                    jd7 jd7Var3 = jd7Var;
                    ir6.b(str2, new xg3(1.0f, true), j3, A2, pe2Var, null, 0L, null, B2, 2, false, 2, 0, null, null, sk2Var3, 3456, 3126, 119760);
                    sk2Var2 = sk2Var3;
                    if (z6) {
                        sk2Var2.X(347191917);
                        ev2.a(pu.t(), null, o76.h(wy3Var, 20.0f), jd7Var3.l, sk2Var2, 432, 0);
                        sk2Var2.p(false);
                    } else {
                        sk2Var2.X(347484867);
                        sk2Var2.p(false);
                    }
                    sk2Var2.p(true);
                    it = it2;
                    jd7Var2 = jd7Var3;
                    i19 = 6;
                    i20 = i21;
                    is2Var = is2Var2;
                    i18 = i24;
                    wc2Var3 = wc2Var;
                    z8 = true;
                } else {
                    l07.v0();
                    throw null;
                }
            }
            sk2Var2.p(false);
            sk2Var2.p(z8);
            sk2 sk2Var4 = sk2Var2;
            oo2.b(l07.c0(new lk2(null, me2.X(sk2Var2, R.string.pause_hint_navigate)), new lk2("A", me2.X(sk2Var2, R.string.pause_hint_accept)), new lk2("B", me2.X(sk2Var2, R.string.pause_hint_back))), null, false, sk2Var4, 0, 6);
            sk2Var = sk2Var4;
            sk2Var.p(true);
            oo2.k(wc2Var3, sk2Var, i19);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r3 = sk2Var.r();
        if (r3 != null) {
            r3.d = new nx0(str, list, i, mi2Var, ki2Var, i2);
        }
    }
}
