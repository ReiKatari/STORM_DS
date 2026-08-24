package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u4 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ on2 L;

    public /* synthetic */ u4(on2 on2Var, boolean z) {
        this.A = 2;
        this.B = z;
        this.L = on2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        long g;
        gp1 gp1Var;
        int i = this.A;
        boolean z2 = this.B;
        jg7 jg7Var = jg7.a;
        on2 on2Var = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                nc1.s(z2, on2Var, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                ak7.A(z2, on2Var, (px0) obj, ii2.a0(1));
                return jg7Var;
            default:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    x64 x64Var = x64.a;
                    a74 O = ge7.O(dj6.c(x64Var, 1.0f), 16.0f);
                    l26 a = k26.a(ju.a, d90.i0, xq2Var, 48);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, O);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var, pnVar, a);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var, pnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var, pnVar3, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var, pnVar4, E);
                    boolean f = xq2Var.f(on2Var);
                    Object P = xq2Var.P();
                    if (f || P == ox0.a) {
                        P = new x7(22, on2Var);
                        xq2Var.l0(P);
                    }
                    on2 on2Var2 = (on2) P;
                    boolean z3 = this.B;
                    if (z3) {
                        xq2Var.b0(89603352);
                        xq2Var.p(false);
                        g = hv.c(4278556265L);
                    } else {
                        xq2Var.b0(89604750);
                        g = ((ut0) xq2Var.j(vt0.a)).g();
                        xq2Var.p(false);
                    }
                    kd5.a(z3, on2Var2, null, false, jx2.n(g, 0L, xq2Var, 0, 6), xq2Var, 0, 28);
                    gi2.h(xq2Var, dj6.l(x64Var, 12.0f));
                    vn3 vn3Var = new vn3(1.0f, true);
                    yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
                    int hashCode2 = Long.hashCode(xq2Var.T);
                    xv4 l2 = xq2Var.l();
                    a74 E2 = l.E(xq2Var, vn3Var);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, a2);
                    yh2.K(xq2Var, pnVar2, l2);
                    i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E2);
                    oj2 oj2Var = oj2.e0;
                    long E3 = hi2.E(15);
                    nq6 nq6Var = vt0.a;
                    x37.b("Системный драйвер Android (По умолчанию)", null, ((ut0) xq2Var.j(nq6Var)).f(), E3, oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 199686, 0, 131026);
                    x37.b("Встроенный драйвер от производителя устройства", null, kt0.c(0.7f, ((ut0) xq2Var.j(nq6Var)).f()), hi2.E(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 3078, 0, 131058);
                    xq2Var.p(true);
                    if (z3) {
                        gp1Var = gp1.ACTIVE;
                    } else {
                        gp1Var = gp1.INSTALLED;
                    }
                    vy7.k(gp1Var, null, xq2Var, 0);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ u4(boolean z, on2 on2Var, int i, int i2) {
        this.A = i2;
        this.B = z;
        this.L = on2Var;
    }
}
