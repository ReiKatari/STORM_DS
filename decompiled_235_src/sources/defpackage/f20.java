package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f20  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f20 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ String L;
    public final /* synthetic */ zv0 R;
    public final /* synthetic */ eo2 X;

    public /* synthetic */ f20(boolean z, String str, zv0 zv0Var, eo2 eo2Var, int i) {
        this.A = i;
        this.B = z;
        this.L = str;
        this.R = zv0Var;
        this.X = eo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i;
        a74 a74Var;
        boolean z2;
        boolean z3;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        x64 x64Var = x64.a;
        boolean z4 = false;
        switch (i2) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z4 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z4)) {
                    hf.b(nc1.j0(dj6.c(x64Var, 1.0f), nc1.n), null, 0L, RecyclerView.B1, n16.I(1626890049, new f20(this.B, this.L, this.R, this.X, 1), xq2Var), xq2Var, 1572864, 62);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    a74 c = dj6.c(x64Var, 1.0f);
                    c40 c40Var = d90.k0;
                    eu euVar = ju.c;
                    yt0 a = wt0.a(euVar, c40Var, xq2Var2, 0);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, c);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var2, pnVar, a);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var2, pnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var2, pnVar3, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var2, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var2, pnVar4, E);
                    a74 Q = ge7.Q(dj6.f(x64Var, 64.0f, RecyclerView.B1, 2), 24.0f, RecyclerView.B1, 2);
                    e34 d = h70.d(d90.Y, false);
                    int hashCode2 = Long.hashCode(xq2Var2.T);
                    xv4 l2 = xq2Var2.l();
                    a74 E2 = l.E(xq2Var2, Q);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, d);
                    yh2.K(xq2Var2, pnVar2, l2);
                    i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar4, E2);
                    x37.b(this.L, null, 0L, 0L, oj2.e0, null, 0L, null, 0L, 2, false, 2, 0, null, ((xe7) xq2Var2.j(ye7.b)).f, xq2Var2, 196608, 3120, 55262);
                    xq2Var2.p(true);
                    boolean z5 = this.B;
                    if (z5) {
                        xq2Var2.b0(-2120780912);
                        a74Var = nb3.W(x64Var, nb3.U(xq2Var2), true);
                        i = 0;
                        xq2Var2.p(false);
                    } else {
                        i = 0;
                        xq2Var2.b0(-2120779565);
                        xq2Var2.p(false);
                        a74Var = x64Var;
                    }
                    yt0 a2 = wt0.a(euVar, c40Var, xq2Var2, i);
                    int hashCode3 = Long.hashCode(xq2Var2.T);
                    xv4 l3 = xq2Var2.l();
                    a74 E3 = l.E(xq2Var2, a74Var);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a2);
                    yh2.K(xq2Var2, pnVar2, l3);
                    i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar4, E3);
                    zv0 zv0Var = this.R;
                    if (z5) {
                        xq2Var2.b0(-1306580429);
                        zv0Var.e(ge7.i(2, 24.0f), xq2Var2, 6);
                        z2 = false;
                        xq2Var2.p(false);
                    } else {
                        xq2Var2.b0(-1306482252);
                        vn3 vn3Var = new vn3(1.0f, false);
                        e34 d2 = h70.d(d90.L, false);
                        int hashCode4 = Long.hashCode(xq2Var2.T);
                        xv4 l4 = xq2Var2.l();
                        a74 E4 = l.E(xq2Var2, vn3Var);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar, d2);
                        yh2.K(xq2Var2, pnVar2, l4);
                        i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
                        yh2.K(xq2Var2, pnVar4, E4);
                        zv0Var.e(ge7.i(2, 24.0f), xq2Var2, 6);
                        xq2Var2.p(true);
                        z2 = false;
                        xq2Var2.p(false);
                    }
                    eo2 eo2Var = this.X;
                    if (eo2Var == null) {
                        xq2Var2.b0(-1306261285);
                        xq2Var2.p(z2);
                        z3 = true;
                    } else {
                        xq2Var2.b0(-1306261284);
                        a74 R = ge7.R(dj6.c(x64Var, 1.0f), 24.0f, 8.0f, 8.0f, 8.0f);
                        l26 a3 = k26.a(new gu(8.0f, true, new h61(d90.m0, 2)), d90.h0, xq2Var2, 6);
                        int hashCode5 = Long.hashCode(xq2Var2.T);
                        xv4 l5 = xq2Var2.l();
                        a74 E5 = l.E(xq2Var2, R);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar, a3);
                        yh2.K(xq2Var2, pnVar2, l5);
                        i61.w(hashCode5, xq2Var2, pnVar3, xq2Var2, neVar);
                        yh2.K(xq2Var2, pnVar4, E5);
                        eo2Var.o(xq2Var2, 0);
                        z3 = true;
                        xq2Var2.p(true);
                        xq2Var2.p(false);
                    }
                    xq2Var2.p(z3);
                    xq2Var2.p(z3);
                    return jg7Var;
                }
                xq2Var2.V();
                return jg7Var;
        }
    }
}
