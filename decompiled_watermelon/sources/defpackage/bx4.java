package defpackage;

import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bx4  reason: default package */
/* loaded from: classes.dex */
public abstract class bx4 {
    public static final fr5 a = gr5.a;
    public static final float b = 7.5f;
    public static final float c = 2.5f;
    public static final float d = 10.0f;
    public static final float e = 5.0f;
    public static final float f = 6.0f;
    public static final xy6 g = ct3.V0(300, 0, cn1.c, 2);

    public static final void a(ex4 ex4Var, long j, zy3 zy3Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        zy3 zy3Var2;
        sk2 sk2Var;
        zy3 zy3Var3;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-486016981);
        if (sk2Var2.h(ex4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (sk2Var2.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = true;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i5 & 1, z)) {
            Object L = sk2Var2.L();
            sn1 sn1Var = su0.a;
            vi viVar = L;
            if (L == sn1Var) {
                vi a2 = zi.a();
                a2.h(1);
                sk2Var2.h0(a2);
                viVar = a2;
            }
            vi viVar2 = (vi) viVar;
            boolean f2 = sk2Var2.f(ex4Var);
            Object L2 = sk2Var2.L();
            if (f2 || L2 == sn1Var) {
                L2 = me2.q(new ax4(ex4Var, 0));
                sk2Var2.h0(L2);
            }
            ae6 b2 = wm.b(((Number) ((ae6) L2).getValue()).floatValue(), g, null, sk2Var2, 48, 28);
            sk2Var = sk2Var2;
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = new vu4(3);
                sk2Var.h0(L3);
            }
            zy3Var2 = zy3Var;
            zy3 a3 = fz5.a(zy3Var2, false, (mi2) L3);
            boolean h = sk2Var.h(ex4Var) | sk2Var.f(b2);
            if ((i5 & 112) != 32) {
                z2 = false;
            }
            boolean h2 = h | z2 | sk2Var.h(viVar2);
            Object L4 = sk2Var.L();
            if (!h2 && L4 != sn1Var) {
                zy3Var3 = a3;
            } else {
                zy3Var3 = a3;
                b40 b40Var = new b40(ex4Var, b2, j, viVar2, 2);
                sk2Var.h0(b40Var);
                L4 = b40Var;
            }
            dt3.j(zy3Var3, (mi2) L4, sk2Var, 0);
        } else {
            zy3Var2 = zy3Var;
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new h7(ex4Var, j, zy3Var2, i, 2);
        }
    }

    public static final void b(final boolean z, final ex4 ex4Var, final zy3 zy3Var, final long j, final long j2, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        xq0 xq0Var;
        long j3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(308716636);
        if (sk2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (sk2Var.h(ex4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (sk2Var.f(zy3Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (sk2Var.e(j)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (sk2Var.e(j2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6 | 196608;
        if ((74899 & i12) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i12 & 1, z2)) {
            sk2Var.T();
            if ((i & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
            }
            sk2Var.q();
            int i13 = i12 & 14;
            if (i13 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f2 = z3 | sk2Var.f(ex4Var);
            Object L = sk2Var.L();
            if (f2 || L == su0.a) {
                L = me2.q(new vw0(z, ex4Var, 3));
                sk2Var.h0(L);
            }
            ae6 ae6Var = (ae6) L;
            u91 u91Var = (u91) sk2Var.j(eo1.a);
            float f3 = f;
            if (u91Var == null) {
                sk2Var.X(1453038224);
                sk2Var.p(false);
                i7 = i13;
                xq0Var = null;
            } else {
                sk2Var.X(323966865);
                i7 = i13;
                long a2 = u91.a(j, f3, sk2Var, ((i12 >> 9) & 14) | 48);
                sk2Var.p(false);
                xq0Var = new xq0(a2);
            }
            if (xq0Var != null) {
                j3 = xq0Var.a;
            } else {
                j3 = j;
            }
            zy3 q = tq5.q(l07.G(o76.h(zy3Var, 40.0f), new vu4(4)), new kb2(26, ex4Var));
            if (!((Boolean) ae6Var.getValue()).booleanValue()) {
                f3 = RecyclerView.A1;
            }
            float f4 = f3;
            fr5 fr5Var = a;
            zy3 i14 = dk7.i(jk2.Q(q, f4, fr5Var, true, 0L, 24), j3, fr5Var);
            tv3 d2 = d50.d(y60.L, false);
            int j0 = dt3.j0(sk2Var);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, i14);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l);
            dn dnVar = mu0.g;
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j0))) {
                b31.w(j0, sk2Var, j0, dnVar);
            }
            oo2.S(sk2Var, mu0.d, e0);
            ct3.x(Boolean.valueOf(z), null, ct3.V0(100, 0, null, 6), null, ct3.H0(1853731063, new bj2() { // from class: yw4
                @Override // defpackage.bj2
                public final Object i(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    sk2 sk2Var2;
                    int i15;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    tu0 tu0Var2 = (tu0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        if (((sk2) tu0Var2).g(booleanValue)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        intValue |= i15;
                    }
                    if ((intValue & 19) != 18) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sk2 sk2Var3 = (sk2) tu0Var2;
                    if (sk2Var3.O(intValue & 1, z4)) {
                        s72 s72Var = o76.c;
                        tv3 d3 = d50.d(y60.Z, false);
                        int j02 = dt3.j0(sk2Var3);
                        sm4 l2 = sk2Var3.l();
                        zy3 e02 = l07.e0(sk2Var3, s72Var);
                        nu0.i.getClass();
                        mv0 mv0Var2 = mu0.b;
                        sk2Var3.b0();
                        if (sk2Var3.S) {
                            sk2Var3.k(mv0Var2);
                        } else {
                            sk2Var3.k0();
                        }
                        oo2.S(sk2Var3, mu0.f, d3);
                        oo2.S(sk2Var3, mu0.e, l2);
                        dn dnVar2 = mu0.g;
                        if (sk2Var3.S || !b53.x(sk2Var3.L(), Integer.valueOf(j02))) {
                            b31.w(j02, sk2Var3, j02, dnVar2);
                        }
                        oo2.S(sk2Var3, mu0.d, e02);
                        float f5 = bx4.b;
                        float f6 = bx4.c;
                        float f7 = (f5 + f6) * 2.0f;
                        long j4 = j2;
                        wy3 wy3Var = wy3.a;
                        if (booleanValue) {
                            sk2Var3.X(-1916589279);
                            sk2Var2 = sk2Var3;
                            yu4.a(o76.h(wy3Var, f7), j4, f6, 0L, 0, sk2Var2, 390, 24);
                            sk2Var2.p(false);
                        } else {
                            sk2Var2 = sk2Var3;
                            sk2Var2.X(-1916362142);
                            bx4.a(ex4Var, j4, o76.h(wy3Var, f7), sk2Var3, RendererDebugBridge.CAPTURE_HEIGHT);
                            sk2Var2.p(false);
                        }
                        sk2Var2.p(true);
                    } else {
                        sk2Var3.R();
                    }
                    return o27.a;
                }
            }, sk2Var), sk2Var, i7 | 24960, 10);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(z, ex4Var, zy3Var, j, j2, i) { // from class: zw4
                public final /* synthetic */ boolean A;
                public final /* synthetic */ ex4 B;
                public final /* synthetic */ zy3 L;
                public final /* synthetic */ long R;
                public final /* synthetic */ long X;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(65);
                    bx4.b(this.A, this.B, this.L, this.R, this.X, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void c(hk1 hk1Var, vi viVar, y55 y55Var, long j, float f2, ou ouVar) {
        viVar.g();
        Path path = viVar.a;
        path.moveTo(RecyclerView.A1, RecyclerView.A1);
        float f3 = d;
        float C = hk1Var.C(f3);
        float f4 = ouVar.b;
        viVar.e(C * f4, RecyclerView.A1);
        viVar.e((hk1Var.C(f3) * f4) / 2.0f, hk1Var.C(e) * f4);
        float intBitsToFloat = Float.intBitsToFloat((int) (y55Var.b() >> 32)) + (Math.min(y55Var.c - y55Var.a, y55Var.d - y55Var.b) / 2.0f);
        float C2 = (hk1Var.C(c) / 2.0f) + Float.intBitsToFloat((int) (y55Var.b() & 4294967295L));
        viVar.i((Float.floatToRawIntBits(intBitsToFloat - ((hk1Var.C(f3) * f4) / 2.0f)) << 32) | (Float.floatToRawIntBits(C2) & 4294967295L));
        path.close();
        float f5 = ouVar.a;
        long f0 = hk1Var.f0();
        os I = hk1Var.I();
        long E = I.E();
        I.s().m();
        try {
            ((bq0) I.B).c0(f5, f0);
            hk1Var.j(viVar, j, f2, r72.a);
        } finally {
            wh1.u(I, E);
        }
    }
}
