package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wi5  reason: default package */
/* loaded from: classes.dex */
public abstract class wi5 {
    public static final tv0 a = new tv0(new vq3(24));

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r38, java.lang.String r39, boolean r40, boolean r41, defpackage.ki2 r42, defpackage.tu0 r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi5.a(java.lang.String, java.lang.String, boolean, boolean, ki2, tu0, int, int):void");
    }

    public static final void b(String str, zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        zy3 zy3Var2;
        wy3 wy3Var;
        int i5;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1065174758);
        if ((i & 6) == 0) {
            if (sk2Var.f(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(et0Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            wy3 wy3Var2 = wy3.a;
            if (i7 != 0) {
                wy3Var = wy3Var2;
            } else {
                wy3Var = zy3Var;
            }
            zy3 Z = b53.Z(o76.c(wy3Var, 1.0f), 16.0f, RecyclerView.A1, 2);
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
            if (str != null) {
                sk2Var.X(-762688195);
                oo2.n(str, null, sk2Var, i3 & 14);
                sk2Var.p(false);
            } else {
                sk2Var.X(-762629698);
                cg2.k(sk2Var, o76.h(wy3Var2, 12.0f));
                sk2Var.p(false);
            }
            oo2.l(null, et0Var, sk2Var, (i3 >> 3) & 112);
            sk2Var.p(true);
            zy3Var2 = wy3Var;
        } else {
            sk2Var.R();
            zy3Var2 = zy3Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new g4(str, zy3Var2, et0Var, i, i2, 3);
        }
    }

    public static final void c(final String str, final boolean z, boolean z2, final mi2 mi2Var, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z3;
        final boolean z4;
        boolean z5;
        boolean z6;
        str.getClass();
        mi2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1706892854);
        if (sk2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2 | 48;
        if (sk2Var.g(z)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3 | 27648;
        if (sk2Var.h(mi2Var)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        int i7 = i6 | i4;
        if ((74899 & i7) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sk2Var.O(i7 & 1, z3)) {
            jd7 C = mj2.C(sk2Var);
            sk2Var.X(1927471948);
            sk2Var.p(false);
            sk2Var.X(-353462893);
            wy3 wy3Var = wy3.a;
            zy3 c = o76.c(wy3Var, 1.0f);
            sk2Var.X(17548395);
            if ((458752 & i7) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i7 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z7 = z6 | z5;
            Object L = sk2Var.L();
            if (z7 || L == su0.a) {
                L = new sx0(mi2Var, z, 1);
                sk2Var.h0(L);
            }
            zy3 s = a53.s(c, false, null, (ki2) L, 15);
            sk2Var.p(false);
            sk2Var.p(false);
            zy3 Y = b53.Y(o76.e(48.0f, 2, l.r(s, 1.0f)), 15.0f, 13.0f);
            sr5 a2 = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
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
            xg3 xg3Var = new xg3(1.0f, true);
            lr0 a3 = jr0.a(rt.d, y60.j0, sk2Var, 6);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, xg3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a3);
            oo2.S(sk2Var, dnVar2, l2);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ir6.b(str, null, C.g, hi2.A(13.5d), pe2.Z, null, 0L, null, hi2.B(17), 2, false, 2, 0, null, null, sk2Var, (i7 & 14) | 199680, 3126, 119762);
            sk2Var = sk2Var;
            sk2Var.X(1548234674);
            sk2Var.p(false);
            sk2Var.p(true);
            cg2.k(sk2Var, o76.k(wy3Var, 16.0f));
            z4 = true;
            oo2.o(z, mi2Var, null, true, sk2Var, ((i7 >> 6) & 14) | 3072, 4);
            sk2Var.p(true);
        } else {
            sk2Var.R();
            z4 = z2;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(str, z, z4, mi2Var, i) { // from class: vi5
                public final /* synthetic */ String A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ mi2 R;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1);
                    wi5.c(this.A, this.B, this.L, this.R, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }
}
