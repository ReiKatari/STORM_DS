package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jp  reason: default package */
/* loaded from: classes.dex */
public abstract class jp {
    public static final vr4 a;

    static {
        yt1 yt1Var = yt1.A;
        a = new vr4(yt1Var, yt1Var);
    }

    public static final void a(fp fpVar, List list, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1794596951);
        if ((i & 6) == 0) {
            if (xq2Var.f(fpVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(list)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ep epVar = (ep) list.get(i6);
                fo2 fo2Var = (fo2) epVar.a;
                int i7 = epVar.b;
                int i8 = epVar.c;
                Object P = xq2Var.P();
                if (P == ox0.a) {
                    P = fc.e;
                    xq2Var.l0(P);
                }
                e34 e34Var = (e34) P;
                int hashCode = Long.hashCode(xq2Var.T);
                xv4 l = xq2Var.l();
                a74 E = l.E(xq2Var, x64.a);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, e34Var);
                yh2.K(xq2Var, ix0.e, l);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E);
                fo2Var.e(fpVar.subSequence(i7, i8).B, xq2Var, 0);
                xq2Var.p(true);
            }
            i3 = 0;
        } else {
            i3 = 0;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hp(fpVar, i, i3, list);
        }
    }
}
