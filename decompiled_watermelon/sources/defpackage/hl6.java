package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hl6  reason: default package */
/* loaded from: classes.dex */
public abstract class hl6 {
    public static final float a = 14.0f;
    public static final xy6 b = new xy6(100, (bn1) null, 6);
    public static final float c = 1.0f;
    public static final float d = 6.0f;
    public static final float e = 125.0f;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r29, defpackage.mi2 r30, defpackage.zy3 r31, boolean r32, defpackage.tb1 r33, defpackage.tu0 r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl6.a(boolean, mi2, zy3, boolean, tb1, tu0, int, int):void");
    }

    public static final void b(final boolean z, final boolean z2, final tb1 tb1Var, final ki2 ki2Var, final l14 l14Var, tu0 tu0Var, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        float f;
        long j;
        long j2;
        boolean z5;
        long j3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        y60 y60Var = y60.n0;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(70908914);
        if ((i & 6) == 0) {
            if (sk2Var.f(y60Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.g(z)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.g(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.f(tb1Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.h(ki2Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.f(l14Var)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i9 = i2;
        boolean z6 = true;
        if ((74899 & i9) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sk2Var.O(i9 & 1, z3)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new xa6();
                sk2Var.h0(L);
            }
            xa6 xa6Var = (xa6) L;
            if ((i9 & 458752) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object L2 = sk2Var.L();
            if (z4 || L2 == sn1Var) {
                L2 = new h91(l14Var, xa6Var, null, 2);
                sk2Var.h0(L2);
            }
            l.g(sk2Var, (aj2) L2, l14Var);
            if (!xa6Var.isEmpty()) {
                f = d;
            } else {
                f = c;
            }
            float f2 = f;
            tb1Var.getClass();
            sk2Var.X(-1176343362);
            if (z2) {
                if (z) {
                    j = tb1Var.b;
                } else {
                    j = tb1Var.d;
                }
            } else if (z) {
                j = tb1Var.f;
            } else {
                j = tb1Var.h;
            }
            k24 g = b31.g(j, sk2Var, false);
            j20 j20Var = y60.Z;
            wy3 wy3Var = wy3.a;
            zy3 f3 = y60Var.i(wy3Var, j20Var).f(o76.c);
            boolean f4 = sk2Var.f(g);
            Object L3 = sk2Var.L();
            if (f4 || L3 == sn1Var) {
                L3 = new j4(g, 23);
                sk2Var.h0(L3);
            }
            dt3.j(f3, (mi2) L3, sk2Var, 0);
            sk2Var.X(-66424183);
            if (z2) {
                if (z) {
                    j2 = tb1Var.a;
                } else {
                    j2 = tb1Var.c;
                }
            } else if (z) {
                j2 = tb1Var.e;
            } else {
                j2 = tb1Var.g;
            }
            k24 g2 = b31.g(j2, sk2Var, false);
            u91 u91Var = (u91) sk2Var.j(eo1.a);
            float f5 = ((ji1) sk2Var.j(eo1.b)).A + f2;
            if (xq0.c(((xq0) g2.getValue()).a, ((hr0) sk2Var.j(ir0.a)).j()) && u91Var != null) {
                sk2Var.X(-674840005);
                z5 = false;
                j3 = u91.a(((xq0) g2.getValue()).a, f5, sk2Var, 0);
                sk2Var.p(false);
            } else {
                z5 = false;
                sk2Var.X(-674751066);
                sk2Var.p(false);
                j3 = ((xq0) g2.getValue()).a;
            }
            long j4 = j3;
            boolean z7 = z5;
            ae6 a2 = f76.a(j4, null, sk2Var, 0, 14);
            zy3 i10 = y60Var.i(wy3Var, y60.Y);
            if ((57344 & i9) != 16384) {
                z6 = z7;
            }
            Object L4 = sk2Var.L();
            if (z6 || L4 == sn1Var) {
                L4 = new el0(7, ki2Var);
                sk2Var.h0(L4);
            }
            zy3 f6 = o76.f(gy2.a(n40.Z(i10, (mi2) L4), l14Var, lg5.a(4, z7)));
            fr5 fr5Var = gr5.a;
            cg2.k(sk2Var, dk7.i(jk2.Q(f6, f2, fr5Var, false, 0L, 24), ((xq0) a2.getValue()).a, fr5Var));
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: el6
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hl6.b(z, z2, tb1Var, ki2Var, l14Var, (tu0) obj, ep2.I(i | 1));
                    return o27.a;
                }
            };
        }
    }
}
