package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ir7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ir7 implements eo2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ hm4 B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int R;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ on2 Z;

    public /* synthetic */ ir7(hm4 hm4Var, boolean z, int i, boolean z2, boolean z3, on2 on2Var, int i2) {
        this.B = hm4Var;
        this.L = z;
        this.R = i;
        this.X = z2;
        this.Y = z3;
        this.Z = on2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        gp1 gp1Var;
        long g;
        xq2 xq2Var;
        boolean z2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z)) {
                    x64 x64Var = x64.a;
                    a74 O = ge7.O(x64Var, 14.0f);
                    c40 c40Var = d90.k0;
                    eu euVar = ju.c;
                    yt0 a = wt0.a(euVar, c40Var, xq2Var2, 0);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, O);
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
                    a74 c = dj6.c(x64Var, 1.0f);
                    d40 d40Var = d90.i0;
                    l26 a2 = k26.a(ju.e, d40Var, xq2Var2, 54);
                    int hashCode2 = Long.hashCode(xq2Var2.T);
                    xv4 l2 = xq2Var2.l();
                    a74 E2 = l.E(xq2Var2, c);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a2);
                    yh2.K(xq2Var2, pnVar2, l2);
                    i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar4, E2);
                    l26 a3 = k26.a(ju.a, d40Var, xq2Var2, 48);
                    int hashCode3 = Long.hashCode(xq2Var2.T);
                    xv4 l3 = xq2Var2.l();
                    a74 E3 = l.E(xq2Var2, x64Var);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a3);
                    yh2.K(xq2Var2, pnVar2, l3);
                    i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar4, E3);
                    i13.a(kj2.D(), null, dj6.i(x64Var, 20.0f), hv.c(4294947584L), xq2Var2, 3504, 0);
                    gi2.h(xq2Var2, dj6.l(x64Var, 6.0f));
                    oj2 oj2Var = oj2.e0;
                    long E4 = hi2.E(13);
                    nq6 nq6Var = vt0.a;
                    x37.b("Рекомендуемый драйвер", null, ((ut0) xq2Var2.j(nq6Var)).g(), E4, oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 199686, 0, 131026);
                    xq2Var2.p(true);
                    final boolean z3 = this.X;
                    final boolean z4 = this.Y;
                    if (z3) {
                        gp1Var = gp1.ACTIVE;
                    } else if (z4) {
                        gp1Var = gp1.INSTALLED;
                    } else {
                        gp1Var = gp1.NOT_INSTALLED;
                    }
                    vy7.k(gp1Var, null, xq2Var2, 0);
                    xq2Var2.p(true);
                    gi2.h(xq2Var2, dj6.e(x64Var, 4.0f));
                    hm4 hm4Var = this.B;
                    x37.b(hm4Var.b, null, ((ut0) xq2Var2.j(nq6Var)).f(), hi2.E(15), oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 199680, 0, 131026);
                    x37.b(hm4Var.f, null, kt0.c(0.8f, ((ut0) xq2Var2.j(nq6Var)).f()), hi2.E(12), null, null, 0L, null, 0L, 2, false, 2, 0, null, null, xq2Var2, 3072, 3120, 120818);
                    gi2.h(xq2Var2, dj6.e(x64Var, 8.0f));
                    if (this.L) {
                        xq2Var2.b0(-605468517);
                        yt0 a4 = wt0.a(euVar, c40Var, xq2Var2, 0);
                        int hashCode4 = Long.hashCode(xq2Var2.T);
                        xv4 l4 = xq2Var2.l();
                        a74 E5 = l.E(xq2Var2, x64Var);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar, a4);
                        yh2.K(xq2Var2, pnVar2, l4);
                        i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
                        yh2.K(xq2Var2, pnVar4, E5);
                        int i2 = this.R;
                        e45.c(i2 / 100.0f, dj6.c(x64Var, 1.0f), ((ut0) xq2Var2.j(nq6Var)).g(), 0L, xq2Var2, 48, 24);
                        gi2.h(xq2Var2, dj6.e(x64Var, 4.0f));
                        x37.b("Загрузка: " + i2 + "%", null, ((ut0) xq2Var2.j(nq6Var)).g(), hi2.E(11), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 3072, 0, 131058);
                        xq2Var = xq2Var2;
                        xq2Var.p(true);
                        xq2Var.p(false);
                        z2 = true;
                    } else {
                        xq2Var2.b0(-604864854);
                        a74 c2 = dj6.c(x64Var, 1.0f);
                        l26 a5 = k26.a(ju.b, d90.h0, xq2Var2, 6);
                        int hashCode5 = Long.hashCode(xq2Var2.T);
                        xv4 l5 = xq2Var2.l();
                        a74 E6 = l.E(xq2Var2, c2);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar, a5);
                        yh2.K(xq2Var2, pnVar2, l5);
                        i61.w(hashCode5, xq2Var2, pnVar3, xq2Var2, neVar);
                        yh2.K(xq2Var2, pnVar4, E6);
                        boolean z5 = !z3;
                        y16 b = z16.b(8.0f);
                        pq4 pq4Var = k90.a;
                        if (z3) {
                            xq2Var2.b0(-718378805);
                            xq2Var2.p(false);
                            g = hv.c(4278556265L);
                        } else {
                            xq2Var2.b0(-718377407);
                            g = ((ut0) xq2Var2.j(nq6Var)).g();
                            xq2Var2.p(false);
                        }
                        mb3.a(this.Z, null, z5, null, b, null, k90.a(g, 0L, xq2Var2, 0, 14), null, n16.I(1135763274, new fo2() { // from class: jr7
                            @Override // defpackage.fo2
                            public final Object e(Object obj3, Object obj4, Object obj5) {
                                boolean z6;
                                e33 r;
                                String str;
                                px0 px0Var2 = (px0) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                ((m26) obj3).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                xq2 xq2Var3 = (xq2) px0Var2;
                                if (xq2Var3.S(intValue2 & 1, z6)) {
                                    boolean z7 = z3;
                                    boolean z8 = z4;
                                    if (!z7 && !z8) {
                                        r = hi2.B();
                                    } else {
                                        r = jw2.r();
                                    }
                                    e33 e33Var = r;
                                    x64 x64Var2 = x64.a;
                                    a74 i3 = dj6.i(x64Var2, 16.0f);
                                    nq6 nq6Var2 = vt0.a;
                                    i13.a(e33Var, null, i3, ((ut0) xq2Var3.j(nq6Var2)).d(), xq2Var3, 432, 0);
                                    gi2.h(xq2Var3, dj6.l(x64Var2, 6.0f));
                                    if (z7) {
                                        str = "Уже включен";
                                    } else if (z8) {
                                        str = "Включить";
                                    } else {
                                        str = "Скачать и установить";
                                    }
                                    x37.b(str, null, ((ut0) xq2Var3.j(nq6Var2)).d(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 0, 0, 131066);
                                } else {
                                    xq2Var3.V();
                                }
                                return jg7.a;
                            }
                        }, xq2Var2), xq2Var2, 805306368, 346);
                        xq2Var = xq2Var2;
                        z2 = true;
                        xq2Var.p(true);
                        xq2Var.p(false);
                    }
                    xq2Var.p(z2);
                    return jg7Var;
                }
                xq2Var2.V();
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                vy7.B(this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ ir7(hm4 hm4Var, boolean z, boolean z2, boolean z3, int i, on2 on2Var) {
        this.B = hm4Var;
        this.L = z;
        this.X = z2;
        this.Y = z3;
        this.R = i;
        this.Z = on2Var;
    }
}
