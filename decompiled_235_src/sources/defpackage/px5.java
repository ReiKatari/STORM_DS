package defpackage;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: px5  reason: default package */
/* loaded from: classes.dex */
public abstract class px5 {
    public static final pq4 a = ge7.j(8.0f, 8.0f, 8.0f, 4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0266  */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, a74] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(a74 a74Var, pq5 pq5Var, on2 on2Var, qn2 qn2Var, lq4 lq4Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        zh d;
        jx5 jx5Var;
        int i6;
        pn pnVar;
        ne neVar;
        int i7;
        boolean z3;
        Bitmap bitmap;
        pq5 pq5Var2 = pq5Var;
        a74Var.getClass();
        pq5Var2.getClass();
        on2Var.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(693467345);
        if (xq2Var.h(pq5Var2)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i8 = i | i2;
        if (xq2Var.h(on2Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i9 = i8 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i10 = i9 | i4;
        if (xq2Var.f(lq4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i11 & 1, z)) {
            if ((i11 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z2 || P == vs0Var) {
                P = new x7(17, on2Var);
                xq2Var.l0(P);
            }
            a74 u = mb3.u(a74Var, false, null, (on2) P, 15);
            c40 c40Var = d90.k0;
            yt0 a2 = wt0.a(ju.c, c40Var, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, u);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar2 = ix0.f;
            yh2.K(xq2Var, pnVar2, a2);
            pn pnVar3 = ix0.e;
            yh2.K(xq2Var, pnVar3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar4 = ix0.g;
            yh2.K(xq2Var, pnVar4, valueOf);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var, neVar2);
            pn pnVar5 = ix0.d;
            yh2.K(xq2Var, pnVar5, E);
            gb3 gb3Var = gb3.Min;
            x64 x64Var = x64.a;
            a74 N = ge7.N(g04.G(x64Var, gb3Var), lq4Var);
            d40 d40Var = d90.h0;
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, N);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar2, a3);
            yh2.K(xq2Var, pnVar3, l2);
            i61.w(hashCode2, xq2Var, pnVar4, xq2Var, neVar2);
            yh2.K(xq2Var, pnVar5, E2);
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = np2.Y(null);
                xq2Var.l0(P2);
            }
            qa4 qa4Var = (qa4) P2;
            Integer valueOf2 = Integer.valueOf(pq5Var.hashCode());
            boolean h = xq2Var.h(qn2Var);
            Object P3 = xq2Var.P();
            if (h || P3 == vs0Var) {
                P3 = new u12(qn2Var, qa4Var, (r41) null, 29);
                xq2Var.l0(P3);
            }
            mb3.i(xq2Var, (eo2) P3, valueOf2);
            a74 i12 = dj6.i(x64Var, 48.0f);
            d40 d40Var2 = d90.i0;
            a74 d2 = i12.d(new Object());
            ix5 ix5Var = (ix5) qa4Var.getValue();
            if (ix5Var != null && (bitmap = ix5Var.a) != null) {
                d = new zh(bitmap);
            } else {
                d = uj2.d(1, 1, 0, 28);
            }
            ix5 ix5Var2 = (ix5) qa4Var.getValue();
            if (ix5Var2 != null) {
                jx5Var = ix5Var2.b;
            } else {
                jx5Var = null;
            }
            if (jx5Var == null) {
                i6 = -1;
            } else {
                i6 = ox5.a[jx5Var.ordinal()];
            }
            if (i6 != -1) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        i.d();
                        return;
                    }
                } else {
                    pnVar = pnVar3;
                    neVar = neVar2;
                    i7 = 0;
                    bl2.c(d, d2, i7, xq2Var, 48, 120);
                    a74 Q = ge7.Q(dj6.b(new vn3(1.0f, true), 1.0f), 8.0f, RecyclerView.B1, 2);
                    yt0 a4 = wt0.a(ju.e, c40Var, xq2Var, 6);
                    int hashCode3 = Long.hashCode(xq2Var.T);
                    xv4 l3 = xq2Var.l();
                    a74 E3 = l.E(xq2Var, Q);
                    xq2Var.f0();
                    if (!xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar2, a4);
                    yh2.K(xq2Var, pnVar, l3);
                    i61.w(hashCode3, xq2Var, pnVar4, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar5, E3);
                    a74 G = g04.G(x64Var, gb3Var);
                    l26 a5 = k26.a(duVar, d40Var2, xq2Var, 48);
                    int hashCode4 = Long.hashCode(xq2Var.T);
                    xv4 l4 = xq2Var.l();
                    a74 E4 = l.E(xq2Var, G);
                    xq2Var.f0();
                    if (!xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar2, a5);
                    yh2.K(xq2Var, pnVar, l4);
                    i61.w(hashCode4, xq2Var, pnVar4, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar5, E4);
                    pq5Var2 = pq5Var;
                    if (!pq5Var2.h) {
                        xq2Var.b0(261992107);
                        z3 = true;
                        bl2.b(kj2.R(xq2Var, R.drawable.logo_dsiware), dj6.l(x64Var, 50.0f), null, y31.c, RecyclerView.B1, xq2Var, 25016, 104);
                        xq2Var = xq2Var;
                        gi2.h(xq2Var, dj6.l(x64Var, 4.0f));
                        xq2Var.p(false);
                    } else {
                        z3 = true;
                        xq2Var.b0(262378429);
                        xq2Var.p(false);
                    }
                    String str = pq5Var2.a;
                    nq6 nq6Var = ye7.b;
                    xq2 xq2Var2 = xq2Var;
                    x37.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, s47.a(((xe7) xq2Var.j(nq6Var)).i, 0L, hi2.E(18), null, null, 0L, 0L, null, 16777213), xq2Var2, 0, 3120, 55294);
                    xq2Var2.p(z3);
                    vy7.h(pq5Var2.c, null, 0L, 0L, 0L, 0L, 2, false, 1, 0, null, ((xe7) xq2Var2.j(nq6Var)).j, xq2Var2, 0, 55294);
                    xq2Var2.p(z3);
                    xq2Var2.p(z3);
                    l.c(null, 0L, RecyclerView.B1, xq2Var2, 0, 15);
                    xq2Var = xq2Var2;
                    xq2Var.p(z3);
                }
            }
            pnVar = pnVar3;
            neVar = neVar2;
            i7 = 1;
            bl2.c(d, d2, i7, xq2Var, 48, 120);
            a74 Q2 = ge7.Q(dj6.b(new vn3(1.0f, true), 1.0f), 8.0f, RecyclerView.B1, 2);
            yt0 a42 = wt0.a(ju.e, c40Var, xq2Var, 6);
            int hashCode32 = Long.hashCode(xq2Var.T);
            xv4 l32 = xq2Var.l();
            a74 E32 = l.E(xq2Var, Q2);
            xq2Var.f0();
            if (!xq2Var.S) {
            }
            yh2.K(xq2Var, pnVar2, a42);
            yh2.K(xq2Var, pnVar, l32);
            i61.w(hashCode32, xq2Var, pnVar4, xq2Var, neVar);
            yh2.K(xq2Var, pnVar5, E32);
            a74 G2 = g04.G(x64Var, gb3Var);
            l26 a52 = k26.a(duVar, d40Var2, xq2Var, 48);
            int hashCode42 = Long.hashCode(xq2Var.T);
            xv4 l42 = xq2Var.l();
            a74 E42 = l.E(xq2Var, G2);
            xq2Var.f0();
            if (!xq2Var.S) {
            }
            yh2.K(xq2Var, pnVar2, a52);
            yh2.K(xq2Var, pnVar, l42);
            i61.w(hashCode42, xq2Var, pnVar4, xq2Var, neVar);
            yh2.K(xq2Var, pnVar5, E42);
            pq5Var2 = pq5Var;
            if (!pq5Var2.h) {
            }
            String str2 = pq5Var2.a;
            nq6 nq6Var2 = ye7.b;
            xq2 xq2Var22 = xq2Var;
            x37.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, s47.a(((xe7) xq2Var.j(nq6Var2)).i, 0L, hi2.E(18), null, null, 0L, 0L, null, 16777213), xq2Var22, 0, 3120, 55294);
            xq2Var22.p(z3);
            vy7.h(pq5Var2.c, null, 0L, 0L, 0L, 0L, 2, false, 1, 0, null, ((xe7) xq2Var22.j(nq6Var2)).j, xq2Var22, 0, 55294);
            xq2Var22.p(z3);
            xq2Var22.p(z3);
            l.c(null, 0L, RecyclerView.B1, xq2Var22, 0, 15);
            xq2Var = xq2Var22;
            xq2Var.p(z3);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ne4(a74Var, pq5Var2, on2Var, qn2Var, lq4Var, i);
        }
    }
}
