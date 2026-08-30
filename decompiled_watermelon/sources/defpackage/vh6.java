package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vh6  reason: default package */
/* loaded from: classes.dex */
public abstract class vh6 {
    public static final vn1 a = new vn1(23);
    public static final Object b = new Object();

    public static final void a(zy3 zy3Var, aj2 aj2Var, tu0 tu0Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1298353104);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(aj2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            if (i6 != 0) {
                zy3Var = wy3.a;
            }
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = new yh6(y60.w0);
                sk2Var.h0(L);
            }
            b((yh6) L, zy3Var, aj2Var, sk2Var, (i3 << 3) & 1008);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new th6(zy3Var, aj2Var, i, i2);
        }
    }

    public static final void b(yh6 yh6Var, zy3 zy3Var, aj2 aj2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-511989831);
        if ((i & 6) == 0) {
            if (sk2Var.h(yh6Var)) {
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
            if (sk2Var.h(aj2Var)) {
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
            int hashCode = Long.hashCode(sk2Var.T);
            qk2 k0 = dt3.k0(sk2Var);
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            sm4 l = sk2Var.l();
            mv0 mv0Var = mv0.h0;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, yh6Var.c, yh6Var);
            oo2.S(sk2Var, yh6Var.d, k0);
            oo2.S(sk2Var, yh6Var.e, aj2Var);
            nu0.i.getClass();
            oo2.S(sk2Var, mu0.e, l);
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            sk2Var.p(true);
            if (!sk2Var.A()) {
                sk2Var.X(-1259245908);
                boolean h = sk2Var.h(yh6Var);
                Object L = sk2Var.L();
                if (h || L == su0.a) {
                    L = new dj(18, yh6Var);
                    sk2Var.h0(L);
                }
                l.j((ki2) L, sk2Var);
                sk2Var.p(false);
            } else {
                sk2Var.X(-1259187287);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new uh6(yh6Var, zy3Var, aj2Var, i);
        }
    }
}
