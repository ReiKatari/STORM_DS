package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hc  reason: default package */
/* loaded from: classes.dex */
public abstract class hc {
    public static final a74 a;
    public static final a74 b;
    public static final long c;
    public static final long d;
    public static final long e;

    static {
        x64 x64Var = x64.a;
        a = ge7.S(x64Var, 24.0f, RecyclerView.B1, 24.0f, RecyclerView.B1, 10);
        b = ge7.S(x64Var, 24.0f, RecyclerView.B1, 24.0f, 28.0f, 2);
        c = hi2.E(40);
        d = hi2.E(36);
        e = hi2.E(38);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [eo2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0, types: [eo2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public static final void a(eo2 eo2Var, eo2 eo2Var2, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        ?? r3;
        boolean z2;
        boolean z3;
        boolean z4;
        e40 e40Var = d90.L;
        c40 c40Var = d90.k0;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1213983107);
        if (xq2Var.h(eo2Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i4 = i | i2;
        if (xq2Var.h(eo2Var2)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            vn3 vn3Var = new vn3(1.0f, false);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = fc.b;
                xq2Var.l0(P);
            }
            e34 e34Var = (e34) P;
            int B = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, vn3Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, e34Var);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            pn pnVar3 = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                i61.v(B, xq2Var, B, pnVar3);
            }
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            if (eo2Var == 0) {
                xq2Var.b0(1809237538);
                xq2Var.p(false);
                z2 = false;
            } else {
                xq2Var.b0(1809237539);
                a74 d2 = lb4.D(a, "title").d(new cy2(c40Var));
                e34 d3 = h70.d(e40Var, false);
                int B2 = ge7.B(xq2Var);
                xv4 l2 = xq2Var.l();
                a74 E2 = l.E(xq2Var, d2);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d3);
                yh2.K(xq2Var, pnVar2, l2);
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B2))) {
                    i61.v(B2, xq2Var, B2, pnVar3);
                }
                yh2.K(xq2Var, pnVar4, E2);
                eo2Var.o(xq2Var, 0);
                xq2Var.p(true);
                z2 = false;
                xq2Var.p(false);
            }
            if (eo2Var2 == 0) {
                xq2Var.b0(1809370342);
                xq2Var.p(z2);
                z4 = z2;
                z3 = true;
            } else {
                xq2Var.b0(1809370343);
                a74 d4 = lb4.D(b, "text").d(new cy2(c40Var));
                e34 d5 = h70.d(e40Var, z2);
                int B3 = ge7.B(xq2Var);
                xv4 l3 = xq2Var.l();
                a74 E3 = l.E(xq2Var, d4);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d5);
                yh2.K(xq2Var, pnVar2, l3);
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B3))) {
                    i61.v(B3, xq2Var, B3, pnVar3);
                }
                yh2.K(xq2Var, pnVar4, E3);
                eo2Var2.o(xq2Var, 0);
                z3 = true;
                xq2Var.p(true);
                z4 = false;
                xq2Var.p(false);
            }
            xq2Var.p(z3);
            r3 = z4;
        } else {
            r3 = 0;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new cc(eo2Var, eo2Var2, i, r3);
        }
    }

    public static final void b(zv0 zv0Var, a74 a74Var, eo2 eo2Var, eo2 eo2Var2, ke6 ke6Var, long j, long j2, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1945098332);
        if (xq2Var.h(zv0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (xq2Var.f(a74Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (xq2Var.h(eo2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (xq2Var.h(eo2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (xq2Var.f(ke6Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (xq2Var.e(j)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (xq2Var.e(j2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i15 & 1, z)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
            }
            xq2Var.q();
            int i16 = i15 >> 9;
            ej2.c(a74Var, ke6Var, j, j2, RecyclerView.B1, n16.I(802957984, new x3(eo2Var, eo2Var2, zv0Var, 2), xq2Var), xq2Var, ((i15 >> 3) & 14) | 1572864 | (i16 & 112) | (i16 & 896) | (i16 & 7168), 48);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new dc(zv0Var, a74Var, eo2Var, eo2Var2, ke6Var, j, j2, i);
        }
    }
}
