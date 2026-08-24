package defpackage;

import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.MlKitException;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k65  reason: default package */
/* loaded from: classes.dex */
public abstract class k65 {
    public static final y16 a = z16.a;
    public static final float b = 7.5f;
    public static final float c = 2.5f;
    public static final float d = 10.0f;
    public static final float e = 5.0f;
    public static final float f = 6.0f;
    public static final sc7 g = ge7.Y(MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE, 0, ir1.c, 2);

    public static final void a(n65 n65Var, long j, a74 a74Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        a74 a74Var2;
        xq2 xq2Var;
        a74 a74Var3;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-486016981);
        if (xq2Var2.h(n65Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (xq2Var2.e(j)) {
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
        if (xq2Var2.S(i5 & 1, z)) {
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            hj hjVar = P;
            if (P == vs0Var) {
                hj a2 = lj.a();
                a2.h(1);
                xq2Var2.l0(a2);
                hjVar = a2;
            }
            hj hjVar2 = (hj) hjVar;
            boolean f2 = xq2Var2.f(n65Var);
            Object P2 = xq2Var2.P();
            if (f2 || P2 == vs0Var) {
                P2 = np2.I(new j65(n65Var, 0));
                xq2Var2.l0(P2);
            }
            pp6 b2 = in.b(((Number) ((pp6) P2).getValue()).floatValue(), g, null, xq2Var2, 48, 28);
            xq2Var = xq2Var2;
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = new dv4(15);
                xq2Var.l0(P3);
            }
            a74Var2 = a74Var;
            a74 a3 = ua6.a(a74Var2, false, (qn2) P3);
            boolean h = xq2Var.h(n65Var) | xq2Var.f(b2);
            if ((i5 & 112) != 32) {
                z2 = false;
            }
            boolean h2 = h | z2 | xq2Var.h(hjVar2);
            Object P4 = xq2Var.P();
            if (!h2 && P4 != vs0Var) {
                a74Var3 = a3;
            } else {
                a74Var3 = a3;
                z50 z50Var = new z50(n65Var, b2, j, hjVar2, 2);
                xq2Var.l0(z50Var);
                P4 = z50Var;
            }
            ak7.j(a74Var3, (qn2) P4, xq2Var, 0);
        } else {
            a74Var2 = a74Var;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new i7(n65Var, j, a74Var2, i, 2);
        }
    }

    public static final void b(final boolean z, final n65 n65Var, final a74 a74Var, final long j, final long j2, px0 px0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        pp6 pp6Var;
        kt0 kt0Var;
        long j3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(308716636);
        if (xq2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (xq2Var.h(n65Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (xq2Var.f(a74Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (xq2Var.e(j)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (xq2Var.e(j2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6 | 196608;
        if ((74899 & i11) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i11 & 1, z2)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
            }
            xq2Var.q();
            int i12 = i11 & 14;
            if (i12 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f2 = z3 | xq2Var.f(n65Var);
            Object P = xq2Var.P();
            if (f2 || P == ox0.a) {
                P = np2.I(new sz0(z, n65Var, 3));
                xq2Var.l0(P);
            }
            pp6 pp6Var2 = (pp6) P;
            qd1 qd1Var = (qd1) xq2Var.j(os1.a);
            float f3 = f;
            if (qd1Var == null) {
                xq2Var.b0(1453038224);
                xq2Var.p(false);
                pp6Var = pp6Var2;
                kt0Var = null;
            } else {
                xq2Var.b0(323966865);
                pp6Var = pp6Var2;
                long a2 = qd1.a(j, f3, xq2Var, ((i11 >> 9) & 14) | 48);
                xq2Var.p(false);
                kt0Var = new kt0(a2);
            }
            if (kt0Var != null) {
                j3 = kt0Var.a;
            } else {
                j3 = j;
            }
            a74 G = hv.G(q60.y(dj6.i(a74Var, 40.0f), new dv4(16)), new bg2(n65Var, 24));
            if (!((Boolean) pp6Var.getValue()).booleanValue()) {
                f3 = RecyclerView.B1;
            }
            float f4 = f3;
            y16 y16Var = a;
            a74 L = vy7.L(nj2.E(G, f4, y16Var, true, 0L, 24), j3, y16Var);
            e34 d2 = h70.d(d90.L, false);
            int B = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, L);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l);
            pn pnVar = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                i61.v(B, xq2Var, B, pnVar);
            }
            yh2.K(xq2Var, ix0.d, E);
            n16.d(Boolean.valueOf(z), null, ge7.Y(100, 0, null, 6), null, n16.I(1853731063, new fo2() { // from class: h65
                @Override // defpackage.fo2
                public final Object e(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    xq2 xq2Var2;
                    int i13;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    px0 px0Var2 = (px0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        if (((xq2) px0Var2).g(booleanValue)) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        intValue |= i13;
                    }
                    if ((intValue & 19) != 18) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xq2 xq2Var3 = (xq2) px0Var2;
                    if (xq2Var3.S(intValue & 1, z4)) {
                        lc2 lc2Var = dj6.c;
                        e34 d3 = h70.d(d90.Z, false);
                        int B2 = ge7.B(xq2Var3);
                        xv4 l2 = xq2Var3.l();
                        a74 E2 = l.E(xq2Var3, lc2Var);
                        jx0.i.getClass();
                        iy0 iy0Var2 = ix0.b;
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var2);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, ix0.f, d3);
                        yh2.K(xq2Var3, ix0.e, l2);
                        pn pnVar2 = ix0.g;
                        if (xq2Var3.S || !nb3.k(xq2Var3.P(), Integer.valueOf(B2))) {
                            i61.v(B2, xq2Var3, B2, pnVar2);
                        }
                        yh2.K(xq2Var3, ix0.d, E2);
                        float f5 = k65.b;
                        float f6 = k65.c;
                        float f7 = (f5 + f6) * 2.0f;
                        long j4 = j2;
                        x64 x64Var = x64.a;
                        if (booleanValue) {
                            xq2Var3.b0(-1916589279);
                            xq2Var2 = xq2Var3;
                            e45.a(dj6.i(x64Var, f7), j4, f6, 0L, 0, xq2Var2, 390, 24);
                            xq2Var2.p(false);
                        } else {
                            xq2Var2 = xq2Var3;
                            xq2Var2.b0(-1916362142);
                            k65.a(n65Var, j4, dj6.i(x64Var, f7), xq2Var3, RendererDebugBridge.CAPTURE_HEIGHT);
                            xq2Var2.p(false);
                        }
                        xq2Var2.p(true);
                    } else {
                        xq2Var3.V();
                    }
                    return jg7.a;
                }
            }, xq2Var), xq2Var, i12 | 24960, 10);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(z, n65Var, a74Var, j, j2, i) { // from class: i65
                public final /* synthetic */ boolean A;
                public final /* synthetic */ n65 B;
                public final /* synthetic */ a74 L;
                public final /* synthetic */ long R;
                public final /* synthetic */ long X;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(65);
                    k65.b(this.A, this.B, this.L, this.R, this.X, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void c(no1 no1Var, hj hjVar, of5 of5Var, long j, float f2, gv gvVar) {
        hjVar.g();
        Path path = hjVar.a;
        path.moveTo(RecyclerView.B1, RecyclerView.B1);
        float f3 = d;
        float e0 = no1Var.e0(f3);
        float f4 = gvVar.b;
        hjVar.e(e0 * f4, RecyclerView.B1);
        hjVar.e((no1Var.e0(f3) * f4) / 2.0f, no1Var.e0(e) * f4);
        float intBitsToFloat = Float.intBitsToFloat((int) (of5Var.b() >> 32)) + (Math.min(of5Var.c - of5Var.a, of5Var.d - of5Var.b) / 2.0f);
        float e02 = (no1Var.e0(c) / 2.0f) + Float.intBitsToFloat((int) (of5Var.b() & 4294967295L));
        hjVar.i((Float.floatToRawIntBits(intBitsToFloat - ((no1Var.e0(f3) * f4) / 2.0f)) << 32) | (Float.floatToRawIntBits(e02) & 4294967295L));
        path.close();
        float f5 = gvVar.a;
        long t0 = no1Var.t0();
        bt i0 = no1Var.i0();
        long L = i0.L();
        i0.G().h();
        try {
            ((os0) i0.B).e0(f5, t0);
            no1.B0(no1Var, hjVar, j, f2, null, 56);
        } finally {
            xg6.v(i0, L);
        }
    }
}
