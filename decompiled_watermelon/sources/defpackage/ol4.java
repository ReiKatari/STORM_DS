package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ol4  reason: default package */
/* loaded from: classes.dex */
public abstract class ol4 {
    public static final long a = mh7.d(3758622474L);
    public static final /* synthetic */ int b = 0;

    public static final void a(final String str, final long j, final long j2, final ki2 ki2Var, final zy3 zy3Var, tu0 tu0Var, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1464249217);
        if ((i & 6) == 0) {
            if (sk2Var.f(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.e(j)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.e(j2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.h(ki2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.f(zy3Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L;
            k24 a2 = bh7.a(l14Var, sk2Var, 6);
            fr5 b2 = gr5.b(11.0f);
            zy3 i8 = dk7.i(a53.t(o76.d(zy3Var, 42.0f), b2), j, iq2.g);
            if (((Boolean) a2.getValue()).booleanValue()) {
                i8 = b53.z(2.0f, C.j, i8, b2);
            }
            zy3 r = a53.r(i8, l14Var, null, false, null, ki2Var, 28);
            tv3 d = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, r);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            ir6.b(str, null, j2, hi2.B(13), pe2.c0, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, (i2 & 14) | 199680 | (i2 & 896), 0, 131026);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new aj2() { // from class: ml4
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ol4.a(str, j, j2, ki2Var, zy3Var, (tu0) obj, ep2.I(i | 1));
                    return o27.a;
                }
            };
        }
    }

    public static final void b(ll4 ll4Var, ki2 ki2Var, ki2 ki2Var2, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        ax2 v;
        float f;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1775077993);
        if (sk2Var.f(ll4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (sk2Var.h(ki2Var2)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i8 = i7 | i3;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i8 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            if (ll4Var != cp5.RESET && ll4Var != k82.RESET) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i4 = R.string.pause_confirm_reset_title;
            } else {
                i4 = R.string.pause_confirm_exit_title;
            }
            String X = me2.X(sk2Var, i4);
            if (z2) {
                i5 = R.string.pause_confirm_reset_message;
            } else {
                i5 = R.string.pause_confirm_exit_message;
            }
            String X2 = me2.X(sk2Var, i5);
            if (z2) {
                i6 = R.string.reset;
            } else {
                i6 = R.string.exit;
            }
            String X3 = me2.X(sk2Var, i6);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new wc2();
                sk2Var.h0(L);
            }
            wc2 wc2Var = (wc2) L;
            s72 s72Var = o76.c;
            long b2 = xq0.b(0.6f, xq0.b);
            is2 is2Var = iq2.g;
            zy3 i9 = dk7.i(s72Var, b2, is2Var);
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = new n44(17);
                sk2Var.h0(L2);
            }
            zy3 C2 = a53.C(i9, (mi2) L2);
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L3;
            Object L4 = sk2Var.L();
            if (L4 == sn1Var) {
                L4 = new w7(13, ki2Var);
                sk2Var.h0(L4);
            }
            zy3 r = a53.r(C2, l14Var, null, false, null, (ki2) L4, 28);
            tv3 d = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, r);
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
            h20 h20Var = y60.k0;
            wy3 wy3Var = wy3.a;
            boolean z3 = z2;
            zy3 z4 = b53.z(1.0f, C.f, dk7.i(a53.t(o76.l(330.0f, 1, b53.X(wy3Var, 28.0f)), gr5.b(17.0f)), C.c, is2Var), gr5.b(17.0f));
            Object L5 = sk2Var.L();
            if (L5 == sn1Var) {
                L5 = new n44(13);
                sk2Var.h0(L5);
            }
            zy3 C3 = a53.C(z4, (mi2) L5);
            Object L6 = sk2Var.L();
            if (L6 == sn1Var) {
                L6 = b31.f(sk2Var);
            }
            l14 l14Var2 = (l14) L6;
            Object L7 = sk2Var.L();
            if (L7 == sn1Var) {
                L7 = new vq3(19);
                sk2Var.h0(L7);
            }
            zy3 a0 = b53.a0(a53.r(C3, l14Var2, null, false, null, (ki2) L7, 28), 20.0f, 22.0f, 20.0f, 16.0f);
            lr0 a2 = jr0.a(rt.c, h20Var, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, a0);
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
            if (z3) {
                v = ep2.v();
            } else {
                v = yf2.v();
            }
            ev2.a(v, null, o76.h(wy3Var, 34.0f), C.j, sk2Var, 432, 0);
            ir6.b(X, b53.b0(wy3Var, RecyclerView.A1, 10.0f, RecyclerView.A1, RecyclerView.A1, 13), C.g, hi2.B(17), pe2.d0, td7.a, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 1772592, 0, 130960);
            ir6.b(X2, b53.b0(wy3Var, RecyclerView.A1, 6.0f, RecyclerView.A1, RecyclerView.A1, 13), C.i, hi2.A(12.5d), null, null, 0L, new kn6(3), hi2.B(18), 0, false, 0, 0, null, null, sk2Var, 3120, 6, 129520);
            sk2Var = sk2Var;
            zy3 b0 = b53.b0(o76.c(wy3Var, 1.0f), RecyclerView.A1, 16.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a3 = rr5.a(rt.a, y60.g0, sk2Var, 0);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, b0);
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
            String X4 = me2.X(sk2Var, R.string.cancel);
            long j = C.d;
            long j2 = C.g;
            if (1.0f <= 0.0d) {
                kz2.a("invalid weight; must be greater than zero");
            }
            float f2 = Float.MAX_VALUE;
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            a(X4, j, j2, ki2Var, new xg3(f, true), sk2Var, 3072);
            cg2.k(sk2Var, o76.k(wy3Var, 9.0f));
            long j3 = C.j;
            long j4 = xq0.d;
            if (1.0f <= 0.0d) {
                kz2.a("invalid weight; must be greater than zero");
            }
            if (1.0f <= Float.MAX_VALUE) {
                f2 = 1.0f;
            }
            a(X3, j3, j4, ki2Var2, b53.I(new xg3(f2, true), wc2Var), sk2Var, ((i8 << 3) & 7168) | RendererDebugBridge.CAPTURE_HEIGHT);
            sk2Var.p(true);
            sk2Var.p(true);
            sk2Var.p(true);
            oo2.k(wc2Var, sk2Var, 6);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new w3(ll4Var, ki2Var, ki2Var2, i, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x066c  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.kl4 r59, defpackage.rg5 r60, defpackage.mi2 r61, defpackage.ki2 r62, defpackage.tu0 r63, int r64) {
        /*
            Method dump skipped, instructions count: 1691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol4.c(kl4, rg5, mi2, ki2, tu0, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r33, defpackage.ax2 r34, boolean r35, boolean r36, defpackage.ki2 r37, defpackage.wc2 r38, defpackage.tu0 r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol4.d(java.lang.String, ax2, boolean, boolean, ki2, wc2, tu0, int, int):void");
    }
}
