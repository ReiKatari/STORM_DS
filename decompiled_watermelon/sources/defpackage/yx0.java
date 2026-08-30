package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yx0  reason: default package */
/* loaded from: classes.dex */
public abstract class yx0 {
    public static final long a = mh7.d(4077389577L);
    public static final /* synthetic */ int b = 0;

    public static final void a(cm1 cm1Var, mi2 mi2Var, boolean z, mi2 mi2Var2, boolean z2, mi2 mi2Var3, boolean z3, mi2 mi2Var4, boolean z4, mi2 mi2Var5, boolean z5, mi2 mi2Var6, boolean z6, mi2 mi2Var7, gv5 gv5Var, mi2 mi2Var8, gv5 gv5Var2, mi2 mi2Var9, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int ordinal;
        boolean z7;
        int i3;
        int i4;
        cm1Var.getClass();
        mi2Var.getClass();
        mi2Var2.getClass();
        mi2Var3.getClass();
        mi2Var4.getClass();
        mi2Var5.getClass();
        mi2Var6.getClass();
        mi2Var7.getClass();
        mi2Var8.getClass();
        mi2Var9.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-363551146);
        int i5 = i | (sk2Var.d(cm1Var.ordinal()) ? 4 : 2) | (sk2Var.h(mi2Var) ? 32 : 16) | (sk2Var.g(z) ? 256 : 128) | (sk2Var.h(mi2Var2) ? 2048 : 1024) | (sk2Var.g(z2) ? 16384 : 8192) | (sk2Var.h(mi2Var3) ? 131072 : 65536) | (sk2Var.g(z3) ? 1048576 : 524288) | (sk2Var.h(mi2Var4) ? 8388608 : 4194304) | (sk2Var.g(z4) ? 67108864 : 33554432) | (sk2Var.h(mi2Var5) ? 536870912 : 268435456);
        int i6 = (sk2Var.g(z5) ? (char) 4 : (char) 2) | (sk2Var.h(mi2Var6) ? ' ' : (char) 16) | (sk2Var.g(z6) ? 256 : 128) | (sk2Var.h(mi2Var7) ? 2048 : 1024);
        if (gv5Var == null) {
            i2 = i5;
            ordinal = -1;
        } else {
            i2 = i5;
            ordinal = gv5Var.ordinal();
        }
        int i7 = i6 | (sk2Var.d(ordinal) ? (char) 16384 : (char) 8192) | (sk2Var.h(mi2Var8) ? (char) 0 : (char) 0) | (sk2Var.d(gv5Var2 != null ? gv5Var2.ordinal() : -1) ? (char) 0 : (char) 0) | (sk2Var.h(mi2Var9) ? (char) 0 : (char) 0) | (sk2Var.h(ki2Var) ? (char) 0 : (char) 0);
        if (sk2Var.O(i2 & 1, ((i2 & 306783379) == 306783378 && (i7 & 38347923) == 38347922) ? false : true)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = me2.G(dt4.MAIN);
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) L;
            int i8 = i7 & 234881024;
            boolean z8 = i8 == 67108864;
            Object L2 = sk2Var.L();
            if (z8 || L2 == sn1Var) {
                L2 = new bz(ki2Var, k24Var, 4);
                sk2Var.h0(L2);
            }
            b53.d(false, (ki2) L2, sk2Var, 0, 1);
            int i9 = xx0.a[((dt4) k24Var.getValue()).ordinal()];
            if (i9 == 1) {
                z7 = false;
                i3 = -1480264606;
                i4 = R.string.dual_screen_presets;
            } else if (i9 == 2) {
                z7 = false;
                i3 = -1480261910;
                i4 = R.string.dual_screen_fill_area_title;
            } else if (i9 != 3) {
                throw ej6.d(sk2Var, -1480265944, false);
            } else {
                i3 = -1480258669;
                i4 = R.string.dual_screen_vertical_alignment_title;
                z7 = false;
            }
            String o = b31.o(sk2Var, i3, i4, sk2Var, z7);
            boolean z9 = i8 == 67108864 ? true : z7;
            Object L3 = sk2Var.L();
            if (z9 || L3 == sn1Var) {
                L3 = new bz(ki2Var, k24Var, 5);
                sk2Var.h0(L3);
            }
            c(o, (ki2) L3, ct3.H0(1026676182, new wx0(cm1Var, z, mi2Var2, z2, mi2Var3, z3, mi2Var4, z4, mi2Var5, z5, mi2Var6, z6, mi2Var7, k24Var, mi2Var, gv5Var, mi2Var8, gv5Var2, mi2Var9), sk2Var), sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new wx0(cm1Var, mi2Var, z, mi2Var2, z2, mi2Var3, z3, mi2Var4, z4, mi2Var5, z5, mi2Var6, z6, mi2Var7, gv5Var, mi2Var8, gv5Var2, mi2Var9, ki2Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r33, boolean r34, defpackage.wc2 r35, boolean r36, defpackage.ki2 r37, defpackage.aj2 r38, defpackage.tu0 r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx0.b(java.lang.String, boolean, wc2, boolean, ki2, aj2, tu0, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static final void c(String str, ki2 ki2Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        et0 et0Var2;
        sk2 sk2Var;
        boolean z2;
        boolean z3;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-902534990);
        if (sk2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (sk2Var2.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i5 & 1, z)) {
            s72 s72Var = o76.c;
            is2 is2Var = iq2.g;
            zy3 i6 = dk7.i(s72Var, a, is2Var);
            Object L = sk2Var2.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new nl0(11);
                sk2Var2.h0(L);
            }
            zy3 C = a53.C(i6, (mi2) L);
            Object L2 = sk2Var2.L();
            if (L2 == sn1Var) {
                L2 = b31.f(sk2Var2);
            }
            l14 l14Var = (l14) L2;
            int i7 = i5 & 112;
            if (i7 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L3 = sk2Var2.L();
            if (z2 || L3 == sn1Var) {
                L3 = new w7(5, ki2Var);
                sk2Var2.h0(L3);
            }
            zy3 r = a53.r(C, l14Var, null, false, null, (ki2) L3, 28);
            if (i7 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L4 = sk2Var2.L();
            if (z3 || L4 == sn1Var) {
                L4 = new ox0(1, ki2Var);
                sk2Var2.h0(L4);
            }
            zy3 B = w81.B(r, (mi2) L4);
            tv3 d = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l = sk2Var2.l();
            zy3 e0 = l07.e0(sk2Var2, B);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var2, dnVar, d);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var2, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var2, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var2, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var2, dnVar4, e0);
            zy3 m0 = mh7.m0(s72Var, mh7.o);
            Object L5 = sk2Var2.L();
            if (L5 == sn1Var) {
                L5 = new nl0(12);
                sk2Var2.h0(L5);
            }
            zy3 C2 = a53.C(m0, (mi2) L5);
            Object L6 = sk2Var2.L();
            if (L6 == sn1Var) {
                L6 = b31.f(sk2Var2);
            }
            l14 l14Var2 = (l14) L6;
            Object L7 = sk2Var2.L();
            if (L7 == sn1Var) {
                L7 = new d5(21);
                sk2Var2.h0(L7);
            }
            zy3 r2 = a53.r(C2, l14Var2, null, false, null, (ki2) L7, 28);
            h20 h20Var = y60.j0;
            lr0 a2 = jr0.a(rt.c, h20Var, sk2Var2, 0);
            int hashCode2 = Long.hashCode(sk2Var2.T);
            sm4 l2 = sk2Var2.l();
            zy3 e02 = l07.e0(sk2Var2, r2);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, a2);
            oo2.S(sk2Var2, dnVar2, l2);
            b31.x(hashCode2, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e02);
            i20 i20Var = y60.h0;
            wy3 wy3Var = wy3.a;
            zy3 a0 = b53.a0(o76.c(wy3Var, 1.0f), 12.0f, 8.0f, 22.0f, 8.0f);
            sr5 a3 = rr5.a(rt.a, i20Var, sk2Var2, 48);
            int hashCode3 = Long.hashCode(sk2Var2.T);
            sm4 l3 = sk2Var2.l();
            zy3 e03 = l07.e0(sk2Var2, a0);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, a3);
            oo2.S(sk2Var2, dnVar2, l3);
            b31.x(hashCode3, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e03);
            zy3 t = a53.t(o76.h(wy3Var, 38.0f), gr5.a);
            Object L8 = sk2Var2.L();
            if (L8 == sn1Var) {
                L8 = new nl0(13);
                sk2Var2.h0(L8);
            }
            zy3 s = a53.s(a53.C(t, (mi2) L8), false, null, ki2Var, 15);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode4 = Long.hashCode(sk2Var2.T);
            sm4 l4 = sk2Var2.l();
            zy3 e04 = l07.e0(sk2Var2, s);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, d2);
            oo2.S(sk2Var2, dnVar2, l4);
            b31.x(hashCode4, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e04);
            ax2 A = se.A();
            long j = xq0.d;
            ev2.a(A, null, o76.h(wy3Var, 20.0f), j, sk2Var2, 3504, 0);
            sk2Var2.p(true);
            cg2.k(sk2Var2, o76.k(wy3Var, 10.0f));
            ir6.b(str, null, j, hi2.B(16), pe2.c0, td7.a, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var2, 1772928 | (i5 & 14), 3120, 120722);
            sk2Var2.p(true);
            d50.a(dk7.i(o76.d(o76.c(wy3Var, 1.0f), 1.0f), xq0.b(0.09f, j), is2Var), sk2Var2, 6);
            ot otVar = new ot(5.0f, true, new i(1));
            zy3 Y = b53.Y(se.Z(o76.c(o76.l(720.0f, 1, mr0.a()).f(new bs2(y60.k0)), 1.0f), se.R(sk2Var2)), 22.0f, 12.0f);
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
            et0Var2 = et0Var;
            et0Var2.j(sk2Var2, 6);
            sk2Var2.p(true);
            oo2.b(l07.c0(new lk2(null, me2.X(sk2Var2, R.string.pause_hint_navigate)), new lk2("A", me2.X(sk2Var2, R.string.pause_hint_accept)), new lk2("B", me2.X(sk2Var2, R.string.pause_hint_back))), null, false, sk2Var2, 0, 6);
            sk2Var = sk2Var2;
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            et0Var2 = et0Var;
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r3 = sk2Var.r();
        if (r3 != null) {
            r3.d = new w3(str, ki2Var, et0Var2, i, 9);
        }
    }

    public static final void d(String str, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(748457454);
        if (sk2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i3 & 1, z)) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sk2Var = sk2Var2;
            ir6.b(upperCase, b53.b0(wy3.a, 2.0f, 8.0f, RecyclerView.A1, 2.0f, 4), xq0.b(0.45f, xq0.d), hi2.B(10), pe2.c0, td7.c, hi2.A(0.8d), null, 0L, 0, false, 0, 0, null, null, sk2Var, 14355888, 0, 130832);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new h5(str, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.String r16, final boolean r17, final defpackage.mi2 r18, boolean r19, boolean r20, defpackage.tu0 r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx0.e(java.lang.String, boolean, mi2, boolean, boolean, tu0, int, int):void");
    }

    public static final wc2 f(tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        if (L == su0.a) {
            L = new wc2();
            sk2Var.h0(L);
        }
        wc2 wc2Var = (wc2) L;
        oo2.k(wc2Var, sk2Var, 6);
        return wc2Var;
    }
}
