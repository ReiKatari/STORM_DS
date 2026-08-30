package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f11  reason: default package */
/* loaded from: classes.dex */
public abstract class f11 {
    public static final a11 a;

    static {
        mx5 mx5Var = mx5.Inherit;
        tv0 tv0Var = oj.a;
        mx5 mx5Var2 = mx5.Inherit;
        mx5 mx5Var3 = mx5.Inherit;
        long j = xq0.d;
        long j2 = xq0.b;
        a = new a11(j, j2, j2, xq0.b(0.38f, j2), xq0.b(0.38f, j2));
    }

    public static final void a(a11 a11Var, zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-527864079);
        if ((i & 6) == 0) {
            if (sk2Var.f(a11Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(et0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            i20 i20Var = d11.a;
            zy3 Z = se.Z(b53.Z(n40.f0(dk7.i(jk2.Q(zy3Var, 3.0f, gr5.b(4.0f), false, 0L, 28), a11Var.a, iq2.g), u43.Max), RecyclerView.A1, d11.d, 1), se.R(sk2Var));
            int i6 = (i2 << 3) & 7168;
            lr0 a2 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Z);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            et0Var.i(mr0.a, sk2Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(a11Var, zy3Var, et0Var, i, 6);
        }
    }

    public static final void b(zy3 zy3Var, a11 a11Var, mi2 mi2Var, tu0 tu0Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-625529233);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i4 = i | 6;
        } else {
            if (sk2Var.f(zy3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i6 = i4 | 48;
        } else {
            if (sk2Var.f(a11Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i4 | i5;
        }
        if (sk2Var.h(mi2Var)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i10 = i6 | i7;
        if ((i10 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i10 & 1, z)) {
            if (i8 != 0) {
                zy3Var = wy3.a;
            }
            if (i9 != 0) {
                a11Var = a;
            }
            a(a11Var, zy3Var, ct3.H0(-250345048, new l4(3, mi2Var, a11Var), sk2Var), sk2Var, ((i10 << 3) & 112) | ((i10 >> 3) & 14) | RendererDebugBridge.CAPTURE_HEIGHT);
        } else {
            sk2Var.R();
        }
        zy3 zy3Var2 = zy3Var;
        a11 a11Var2 = a11Var;
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(zy3Var2, a11Var2, mi2Var, i, i2, 5);
        }
    }

    public static final void c(final String str, final boolean z, final a11 a11Var, final zy3 zy3Var, final bj2 bj2Var, final ki2 ki2Var, tu0 tu0Var, final int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-2001167027);
        if ((i & 6) == 0) {
            if (sk2Var.f(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.g(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.f(a11Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.f(zy3Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.h(bj2Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.h(ki2Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((74899 & i2) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i2 & 1, z2)) {
            i20 i20Var = d11.a;
            float f = d11.c;
            ot otVar = new ot(f, true, new i(1));
            if ((i2 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((458752 & i2) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object L = sk2Var.L();
            if (z5 || L == su0.a) {
                L = new vw0(z, ki2Var, 1);
                sk2Var.h0(L);
            }
            zy3 Z = b53.Z(o76.j(o76.c(a53.s(zy3Var, z, str, (ki2) L, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, RecyclerView.A1, 2);
            sr5 a2 = rr5.a(otVar, i20Var, sk2Var, 54);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Z);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            if (bj2Var == null) {
                sk2Var.X(-1597947094);
                sk2Var.p(false);
                i3 = i2;
            } else {
                sk2Var.X(-1597947093);
                float f2 = d11.e;
                zy3 g = o76.g(wy3.a, f2, RecyclerView.A1, f2, f2, 2);
                tv3 d = d50.d(y60.L, false);
                int hashCode2 = Long.hashCode(sk2Var.T);
                sm4 l2 = sk2Var.l();
                zy3 e02 = l07.e0(sk2Var, g);
                sk2Var.b0();
                i3 = i2;
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, dnVar, d);
                oo2.S(sk2Var, dnVar2, l2);
                b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
                oo2.S(sk2Var, dnVar4, e02);
                if (z) {
                    j = a11Var.c;
                } else {
                    j = a11Var.e;
                }
                bj2Var.i(new xq0(j), sk2Var, 0);
                sk2Var.p(true);
                sk2Var.p(false);
            }
            if (z) {
                j2 = a11Var.b;
            } else {
                j2 = a11Var.d;
            }
            long j3 = j2;
            l.b(str, new xg3(1.0f, true), new ds6(j3, d11.h, d11.i, d11.k, 0L, d11.b, d11.j, 16613240), null, 0, false, 1, 0, null, sk2Var, (i3 & 14) | 1572864, 952);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: e11
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f11.c(str, z, a11Var, zy3Var, bj2Var, ki2Var, (tu0) obj, ep2.I(i | 1));
                    return o27.a;
                }
            };
        }
    }
}
