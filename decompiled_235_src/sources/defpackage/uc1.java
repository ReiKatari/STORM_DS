package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uc1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uc1 implements eo2 {
    public final /* synthetic */ int A = 2;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ float X;

    public /* synthetic */ uc1(float f, qa4 qa4Var, String str, String str2) {
        this.X = f;
        this.R = qa4Var;
        this.B = str;
        this.L = str2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        x64 x64Var = x64.a;
        boolean z2 = false;
        final float f = this.X;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.L;
        Object obj4 = this.B;
        Object obj5 = this.R;
        switch (i) {
            case 0:
                xc1 xc1Var = (xc1) obj5;
                final on2 on2Var = (on2) obj4;
                final on2 on2Var2 = (on2) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    a74 O = ge7.O(vy7.L(u24.g(dj6.c(x64Var, 1.0f), z16.b(16.0f)), bl2.F(xq2Var).d, u24.m), 24.0f);
                    e34 d = h70.d(d90.L, false);
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
                    yh2.K(xq2Var, ix0.f, d);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    f04.c(xc1Var, null, null, null, "DecryptionState", null, n16.I(847740477, new go2() { // from class: vc1
                        @Override // defpackage.go2
                        public final Object l(Object obj6, Object obj7, Object obj8, Object obj9) {
                            xq2 xq2Var2;
                            xc1 xc1Var2 = (xc1) obj7;
                            px0 px0Var2 = (px0) obj8;
                            ((Integer) obj9).getClass();
                            d40 d40Var = d90.h0;
                            c40 c40Var = d90.l0;
                            ((sn) obj6).getClass();
                            xc1Var2.getClass();
                            int i2 = wc1.a[xc1Var2.ordinal()];
                            x64 x64Var2 = x64.a;
                            on2 on2Var3 = on2.this;
                            du duVar = ju.b;
                            eu euVar = ju.c;
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 == 4) {
                                            xq2Var2 = (xq2) px0Var2;
                                            xq2Var2.b0(633941083);
                                            a74 c = dj6.c(x64Var2, 1.0f);
                                            yt0 a = wt0.a(euVar, c40Var, xq2Var2, 48);
                                            int hashCode2 = Long.hashCode(xq2Var2.T);
                                            xv4 l2 = xq2Var2.l();
                                            a74 E2 = l.E(xq2Var2, c);
                                            jx0.i.getClass();
                                            iy0 iy0Var2 = ix0.b;
                                            xq2Var2.f0();
                                            if (xq2Var2.S) {
                                                xq2Var2.k(iy0Var2);
                                            } else {
                                                xq2Var2.o0();
                                            }
                                            pn pnVar = ix0.f;
                                            yh2.K(xq2Var2, pnVar, a);
                                            pn pnVar2 = ix0.e;
                                            yh2.K(xq2Var2, pnVar2, l2);
                                            Integer valueOf = Integer.valueOf(hashCode2);
                                            pn pnVar3 = ix0.g;
                                            yh2.K(xq2Var2, pnVar3, valueOf);
                                            ne neVar = ix0.h;
                                            yh2.F(xq2Var2, neVar);
                                            pn pnVar4 = ix0.d;
                                            yh2.K(xq2Var2, pnVar4, E2);
                                            x37.b("❌", ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 16.0f, 7), 0L, hi2.E(48), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 3126, 0, 131060);
                                            x37.b(yh2.O(xq2Var2, R.string.decrypt_rom_error), ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 24.0f, 7), bl2.F(xq2Var2).j, hi2.E(18), oj2.e0, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var2, 199728, 0, 130512);
                                            a74 c2 = dj6.c(x64Var2, 1.0f);
                                            l26 a2 = k26.a(duVar, d40Var, xq2Var2, 6);
                                            int hashCode3 = Long.hashCode(xq2Var2.T);
                                            xv4 l3 = xq2Var2.l();
                                            a74 E3 = l.E(xq2Var2, c2);
                                            xq2Var2.f0();
                                            if (xq2Var2.S) {
                                                xq2Var2.k(iy0Var2);
                                            } else {
                                                xq2Var2.o0();
                                            }
                                            yh2.K(xq2Var2, pnVar, a2);
                                            yh2.K(xq2Var2, pnVar2, l3);
                                            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
                                            yh2.K(xq2Var2, pnVar4, E3);
                                            mb3.o(on2Var3, null, false, null, q60.f, xq2Var2, 805306368, 510);
                                        } else {
                                            throw xg6.f((xq2) px0Var2, -1365180367, false);
                                        }
                                    } else {
                                        xq2Var2 = (xq2) px0Var2;
                                        xq2Var2.b0(632532567);
                                        a74 c3 = dj6.c(x64Var2, 1.0f);
                                        yt0 a3 = wt0.a(euVar, c40Var, xq2Var2, 48);
                                        int hashCode4 = Long.hashCode(xq2Var2.T);
                                        xv4 l4 = xq2Var2.l();
                                        a74 E4 = l.E(xq2Var2, c3);
                                        jx0.i.getClass();
                                        iy0 iy0Var3 = ix0.b;
                                        xq2Var2.f0();
                                        if (xq2Var2.S) {
                                            xq2Var2.k(iy0Var3);
                                        } else {
                                            xq2Var2.o0();
                                        }
                                        pn pnVar5 = ix0.f;
                                        yh2.K(xq2Var2, pnVar5, a3);
                                        pn pnVar6 = ix0.e;
                                        yh2.K(xq2Var2, pnVar6, l4);
                                        Integer valueOf2 = Integer.valueOf(hashCode4);
                                        pn pnVar7 = ix0.g;
                                        yh2.K(xq2Var2, pnVar7, valueOf2);
                                        ne neVar2 = ix0.h;
                                        yh2.F(xq2Var2, neVar2);
                                        pn pnVar8 = ix0.d;
                                        yh2.K(xq2Var2, pnVar8, E4);
                                        x37.b("🔓", ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 16.0f, 7), 0L, hi2.E(48), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 3126, 0, 131060);
                                        x37.b(yh2.O(xq2Var2, R.string.decrypt_rom_success), ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 24.0f, 7), bl2.F(xq2Var2).g, hi2.E(18), oj2.e0, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var2, 199728, 0, 130512);
                                        a74 c4 = dj6.c(x64Var2, 1.0f);
                                        l26 a4 = k26.a(duVar, d40Var, xq2Var2, 6);
                                        int hashCode5 = Long.hashCode(xq2Var2.T);
                                        xv4 l5 = xq2Var2.l();
                                        a74 E5 = l.E(xq2Var2, c4);
                                        xq2Var2.f0();
                                        if (xq2Var2.S) {
                                            xq2Var2.k(iy0Var3);
                                        } else {
                                            xq2Var2.o0();
                                        }
                                        yh2.K(xq2Var2, pnVar5, a4);
                                        yh2.K(xq2Var2, pnVar6, l5);
                                        i61.w(hashCode5, xq2Var2, pnVar7, xq2Var2, neVar2);
                                        yh2.K(xq2Var2, pnVar8, E5);
                                        mb3.o(on2Var3, null, false, null, q60.e, xq2Var2, 805306368, 510);
                                    }
                                } else {
                                    xq2 xq2Var3 = (xq2) px0Var2;
                                    xq2Var3.b0(631049868);
                                    a74 c5 = dj6.c(x64Var2, 1.0f);
                                    yt0 a5 = wt0.a(euVar, c40Var, xq2Var3, 48);
                                    int hashCode6 = Long.hashCode(xq2Var3.T);
                                    xv4 l6 = xq2Var3.l();
                                    a74 E6 = l.E(xq2Var3, c5);
                                    jx0.i.getClass();
                                    iy0 iy0Var4 = ix0.b;
                                    xq2Var3.f0();
                                    if (xq2Var3.S) {
                                        xq2Var3.k(iy0Var4);
                                    } else {
                                        xq2Var3.o0();
                                    }
                                    yh2.K(xq2Var3, ix0.f, a5);
                                    yh2.K(xq2Var3, ix0.e, l6);
                                    yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode6));
                                    yh2.F(xq2Var3, ix0.h);
                                    yh2.K(xq2Var3, ix0.d, E6);
                                    x37.b(yh2.O(xq2Var3, R.string.decrypt_rom_progress), ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 16.0f, 7), bl2.F(xq2Var3).g, hi2.E(18), oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 199728, 0, 131024);
                                    long j = bl2.F(xq2Var3).l;
                                    long j2 = bl2.F(xq2Var3).e;
                                    a74 g = u24.g(dj6.e(dj6.c(x64Var2, 1.0f), 8.0f), z16.b(4.0f));
                                    float f2 = f;
                                    e45.c(f2, g, j, j2, xq2Var3, 0, 16);
                                    x37.b(((int) (100.0f * f2)) + "%", ge7.S(x64Var2, RecyclerView.B1, 8.0f, RecyclerView.B1, RecyclerView.B1, 13), bl2.F(xq2Var3).h, hi2.E(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 3120, 0, 131056);
                                    xq2Var3.p(true);
                                    xq2Var3.p(false);
                                    return jg7.a;
                                }
                            } else {
                                xq2Var2 = (xq2) px0Var2;
                                xq2Var2.b0(629036201);
                                a74 c6 = dj6.c(x64Var2, 1.0f);
                                yt0 a6 = wt0.a(euVar, c40Var, xq2Var2, 48);
                                int hashCode7 = Long.hashCode(xq2Var2.T);
                                xv4 l7 = xq2Var2.l();
                                a74 E7 = l.E(xq2Var2, c6);
                                jx0.i.getClass();
                                iy0 iy0Var5 = ix0.b;
                                xq2Var2.f0();
                                if (xq2Var2.S) {
                                    xq2Var2.k(iy0Var5);
                                } else {
                                    xq2Var2.o0();
                                }
                                pn pnVar9 = ix0.f;
                                yh2.K(xq2Var2, pnVar9, a6);
                                pn pnVar10 = ix0.e;
                                yh2.K(xq2Var2, pnVar10, l7);
                                Integer valueOf3 = Integer.valueOf(hashCode7);
                                pn pnVar11 = ix0.g;
                                yh2.K(xq2Var2, pnVar11, valueOf3);
                                ne neVar3 = ix0.h;
                                yh2.F(xq2Var2, neVar3);
                                pn pnVar12 = ix0.d;
                                yh2.K(xq2Var2, pnVar12, E7);
                                x37.b("🔒", ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 16.0f, 7), 0L, hi2.E(48), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 3126, 0, 131060);
                                x37.b(yh2.O(xq2Var2, R.string.decrypt_rom_title), ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 8.0f, 7), bl2.F(xq2Var2).g, hi2.E(20), oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 199728, 0, 131024);
                                x37.b(yh2.O(xq2Var2, R.string.decrypt_rom_description), ge7.S(x64Var2, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 24.0f, 7), bl2.F(xq2Var2).h, hi2.E(14), null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var2, 3120, 0, 130544);
                                a74 c7 = dj6.c(x64Var2, 1.0f);
                                l26 a7 = k26.a(duVar, d40Var, xq2Var2, 6);
                                int hashCode8 = Long.hashCode(xq2Var2.T);
                                xv4 l8 = xq2Var2.l();
                                a74 E8 = l.E(xq2Var2, c7);
                                xq2Var2.f0();
                                if (xq2Var2.S) {
                                    xq2Var2.k(iy0Var5);
                                } else {
                                    xq2Var2.o0();
                                }
                                yh2.K(xq2Var2, pnVar9, a7);
                                yh2.K(xq2Var2, pnVar10, l8);
                                i61.w(hashCode8, xq2Var2, pnVar11, xq2Var2, neVar3);
                                yh2.K(xq2Var2, pnVar12, E8);
                                mb3.o(on2Var3, null, false, null, q60.c, xq2Var2, 805306368, 510);
                                gi2.h(xq2Var2, dj6.l(x64Var2, 8.0f));
                                mb3.o(on2Var2, null, false, null, q60.d, xq2Var2, 805306368, 510);
                            }
                            i61.y(xq2Var2, true, true, false);
                            return jg7.a;
                        }
                    }, xq2Var), xq2Var, 1597440, 46);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                nw7.n((on2) obj4, (on2) obj3, (xc1) obj5, this.X, (px0) obj, ii2.a0(55));
                return jg7Var;
            default:
                qa4 qa4Var = (qa4) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    a74 c = dj6.c(x64Var, 1.0f);
                    Object P = xq2Var2.P();
                    if (P == ox0.a) {
                        P = new oe4(qa4Var, 25);
                        xq2Var2.l0(P);
                    }
                    a74 R = ge7.R(dj6.f(nw7.f0(mb3.u(c, true, null, (on2) P, 14), true, null, 2), 64.0f, RecyclerView.B1, 2), f, 8.0f, f, 8.0f);
                    yt0 a = wt0.a(ju.d, d90.k0, xq2Var2, 6);
                    int hashCode2 = Long.hashCode(xq2Var2.T);
                    xv4 l2 = xq2Var2.l();
                    a74 E2 = l.E(xq2Var2, R);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, ix0.f, a);
                    yh2.K(xq2Var2, ix0.e, l2);
                    yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode2));
                    yh2.F(xq2Var2, ix0.h);
                    yh2.K(xq2Var2, ix0.d, E2);
                    x37.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((xe7) xq2Var2.j(ye7.b)).i, xq2Var2, 0, 3120, 55294);
                    vy7.h(str2, null, 0L, 0L, 0L, 0L, 2, false, 1, 0, null, null, xq2Var2, 0, 120830);
                    xq2Var2.p(true);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ uc1(xc1 xc1Var, on2 on2Var, on2 on2Var2, float f) {
        this.R = xc1Var;
        this.B = on2Var;
        this.L = on2Var2;
        this.X = f;
    }

    public /* synthetic */ uc1(on2 on2Var, on2 on2Var2, xc1 xc1Var, float f, int i) {
        this.B = on2Var;
        this.L = on2Var2;
        this.R = xc1Var;
        this.X = f;
    }
}
