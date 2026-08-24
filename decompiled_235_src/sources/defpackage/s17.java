package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s17  reason: default package */
/* loaded from: classes.dex */
public final class s17 implements io2 {
    public final /* synthetic */ eo2 A;
    public final /* synthetic */ eo2 B;
    public final /* synthetic */ String L;
    public final /* synthetic */ i17 R;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ r94 Z;
    public final /* synthetic */ ke6 d0;
    public final /* synthetic */ b37 e0;
    public final /* synthetic */ eo2 f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ lq4 h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ zv0 j0;

    public s17(eo2 eo2Var, eo2 eo2Var2, String str, i17 i17Var, boolean z, boolean z2, r94 r94Var, ke6 ke6Var, b37 b37Var, eo2 eo2Var3, boolean z3, lq4 lq4Var, boolean z4, zv0 zv0Var) {
        this.A = eo2Var;
        this.B = eo2Var2;
        this.L = str;
        this.R = i17Var;
        this.X = z;
        this.Y = z2;
        this.Z = r94Var;
        this.d0 = ke6Var;
        this.e0 = b37Var;
        this.f0 = eo2Var3;
        this.g0 = z3;
        this.h0 = lq4Var;
        this.i0 = z4;
        this.j0 = zv0Var;
    }

    @Override // defpackage.io2
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        boolean z;
        xq2 xq2Var;
        zv0 zv0Var;
        zv0 zv0Var2;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        final float floatValue = ((Number) obj).floatValue();
        final long j = ((kt0) obj2).a;
        final long j2 = ((kt0) obj3).a;
        final float floatValue2 = ((Number) obj4).floatValue();
        px0 px0Var = (px0) obj5;
        int intValue = ((Number) obj6).intValue();
        if ((intValue & 6) == 0) {
            if (((xq2) px0Var).c(floatValue)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i = i5 | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            if (((xq2) px0Var).e(j)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i |= i4;
        }
        if ((intValue & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (((xq2) px0Var).e(j2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i |= i3;
        }
        if ((intValue & 3072) == 0) {
            if (((xq2) px0Var).c(floatValue2)) {
                i2 = 2048;
            } else {
                i2 = 1024;
            }
            i |= i2;
        }
        int i6 = i;
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var2 = (xq2) px0Var;
        if (xq2Var2.S(i6 & 1, z)) {
            final eo2 eo2Var = this.A;
            if (eo2Var == null) {
                xq2Var2.b0(986681709);
                xq2Var2.p(false);
                xq2Var = xq2Var2;
                zv0Var = null;
            } else {
                xq2Var2.b0(986681710);
                xq2Var = xq2Var2;
                final boolean z3 = this.i0;
                eo2 eo2Var2 = new eo2() { // from class: p17
                    @Override // defpackage.eo2
                    public final Object o(Object obj7, Object obj8) {
                        boolean z4;
                        float f;
                        float f2;
                        ge6 O;
                        ge6 ge6Var;
                        cy4 cy4Var;
                        ux4 ux4Var;
                        ux4 ux4Var2;
                        px0 px0Var2 = (px0) obj7;
                        int intValue2 = ((Integer) obj8).intValue();
                        if ((intValue2 & 3) != 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        xq2 xq2Var3 = (xq2) px0Var2;
                        if (xq2Var3.S(intValue2 & 1, z4)) {
                            nq6 nq6Var = ye7.b;
                            s47 s47Var = ((xe7) xq2Var3.j(nq6Var)).g;
                            s47 s47Var2 = ((xe7) xq2Var3.j(nq6Var)).l;
                            nn6 nn6Var = s47Var.a;
                            nn6 nn6Var2 = s47Var2.a;
                            e37 e37Var = on6.d;
                            e37 e37Var2 = nn6Var.a;
                            e37 e37Var3 = nn6Var2.a;
                            boolean z5 = e37Var2 instanceof h80;
                            e37 e37Var4 = d37.a;
                            float f3 = floatValue;
                            if (!z5 && !(e37Var3 instanceof h80)) {
                                long M = hv.M(f3, e37Var2.b(), e37Var3.b());
                                if (M != 16) {
                                    e37Var4 = new st0(M);
                                }
                            } else if (z5 && (e37Var3 instanceof h80)) {
                                h80 h80Var = (h80) e37Var2;
                                h80 h80Var2 = (h80) e37Var3;
                                f80 f80Var = (f80) on6.b(h80Var.a, h80Var2.a, f3);
                                float L = oi2.L(h80Var.b, h80Var2.b, f3);
                                if (f80Var != null) {
                                    if (f80Var instanceof cn6) {
                                        long N = oi2.N(L, ((cn6) f80Var).a);
                                        if (N != 16) {
                                            e37Var4 = new st0(N);
                                        }
                                    } else if (f80Var instanceof xd6) {
                                        e37Var4 = new h80((xd6) f80Var, L);
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                }
                            } else {
                                e37Var4 = (e37) on6.b(e37Var2, e37Var3, f3);
                            }
                            e37 e37Var5 = e37Var4;
                            li2 li2Var = (li2) on6.b(nn6Var.f, nn6Var2.f, f3);
                            long c = on6.c(f3, nn6Var.b, nn6Var2.b);
                            oj2 oj2Var = nn6Var.c;
                            if (oj2Var == null) {
                                oj2Var = oj2.Y;
                            }
                            oj2 oj2Var2 = nn6Var2.c;
                            if (oj2Var2 == null) {
                                oj2Var2 = oj2.Y;
                            }
                            oj2 oj2Var3 = new oj2(gi2.q(oi2.M(f3, oj2Var.A, oj2Var2.A), 1, 1000));
                            ij2 ij2Var = (ij2) on6.b(nn6Var.d, nn6Var2.d, f3);
                            jj2 jj2Var = (jj2) on6.b(nn6Var.e, nn6Var2.e, f3);
                            String str = (String) on6.b(nn6Var.g, nn6Var2.g, f3);
                            long c2 = on6.c(f3, nn6Var.h, nn6Var2.h);
                            x20 x20Var = nn6Var.i;
                            if (x20Var != null) {
                                f = x20Var.a;
                            } else {
                                f = 0.0f;
                            }
                            x20 x20Var2 = nn6Var2.i;
                            if (x20Var2 != null) {
                                f2 = x20Var2.a;
                            } else {
                                f2 = 0.0f;
                            }
                            float L2 = oi2.L(f, f2, f3);
                            f37 f37Var = nn6Var.j;
                            f37 f37Var2 = f37.c;
                            if (f37Var == null) {
                                f37Var = f37Var2;
                            }
                            f37 f37Var3 = nn6Var2.j;
                            if (f37Var3 != null) {
                                f37Var2 = f37Var3;
                            }
                            f37 f37Var4 = new f37(oi2.L(f37Var.a, f37Var2.a, f3), oi2.L(f37Var.b, f37Var2.b, f3));
                            gy3 gy3Var = (gy3) on6.b(nn6Var.k, nn6Var2.k, f3);
                            long M2 = hv.M(f3, nn6Var.l, nn6Var2.l);
                            b17 b17Var = (b17) on6.b(nn6Var.m, nn6Var2.m, f3);
                            ge6 ge6Var2 = nn6Var.n;
                            ge6 ge6Var3 = nn6Var2.n;
                            if (ge6Var2 == null && ge6Var3 == null) {
                                ge6Var = null;
                            } else {
                                if (ge6Var2 == null) {
                                    ge6Var3.getClass();
                                    O = kj2.O(new ge6(ge6Var3.c, kt0.c(RecyclerView.B1, ge6Var3.a), ge6Var3.b), ge6Var3, f3);
                                } else if (ge6Var3 == null) {
                                    O = kj2.O(ge6Var2, new ge6(ge6Var2.c, kt0.c(RecyclerView.B1, ge6Var2.a), ge6Var2.b), f3);
                                } else {
                                    O = kj2.O(ge6Var2, ge6Var3, f3);
                                }
                                ge6Var = O;
                            }
                            cy4 cy4Var2 = nn6Var.o;
                            cy4 cy4Var3 = nn6Var2.o;
                            if (cy4Var2 == null && cy4Var3 == null) {
                                cy4Var = null;
                            } else {
                                if (cy4Var2 == null) {
                                    cy4Var2 = cy4.a;
                                }
                                cy4Var = cy4Var2;
                            }
                            nn6 nn6Var3 = new nn6(e37Var5, c, oj2Var3, ij2Var, jj2Var, li2Var, str, c2, new x20(L2), f37Var4, gy3Var, M2, b17Var, ge6Var, cy4Var, (oo1) on6.b(nn6Var.p, nn6Var2.p, f3));
                            ds4 ds4Var = s47Var.b;
                            ds4 ds4Var2 = s47Var2.b;
                            int i7 = es4.b;
                            int i8 = ((wz6) on6.b(new wz6(ds4Var.a), new wz6(ds4Var2.a), f3)).a;
                            int i9 = ((e17) on6.b(new e17(ds4Var.b), new e17(ds4Var2.b), f3)).a;
                            long c3 = on6.c(f3, ds4Var.c, ds4Var2.c);
                            g37 g37Var = ds4Var.d;
                            if (g37Var == null) {
                                g37Var = g37.c;
                            }
                            g37 g37Var2 = ds4Var2.d;
                            if (g37Var2 == null) {
                                g37Var2 = g37.c;
                            }
                            g37 g37Var3 = new g37(on6.c(f3, g37Var.a, g37Var2.a), on6.c(f3, g37Var.b, g37Var2.b));
                            ux4 ux4Var3 = ds4Var.e;
                            ux4 ux4Var4 = ds4Var2.e;
                            if (ux4Var3 == null && ux4Var4 == null) {
                                ux4Var2 = null;
                            } else {
                                ux4 ux4Var5 = ux4.c;
                                if (ux4Var3 == null) {
                                    ux4Var = ux4Var5;
                                } else {
                                    ux4Var = ux4Var3;
                                }
                                boolean z6 = ux4Var.a;
                                if (ux4Var4 == null) {
                                    ux4Var4 = ux4Var5;
                                }
                                boolean z7 = ux4Var4.a;
                                if (z6 == z7) {
                                    ux4Var2 = ux4Var;
                                } else {
                                    ux4Var2 = new ux4(((jt1) on6.b(new jt1(ux4Var.b), new jt1(ux4Var4.b), f3)).a, ((Boolean) on6.b(Boolean.valueOf(z6), Boolean.valueOf(z7), f3)).booleanValue());
                                }
                            }
                            s47 s47Var3 = new s47(nn6Var3, new ds4(i8, i9, c3, g37Var3, ux4Var2, (xu3) on6.b(ds4Var.f, ds4Var2.f, f3), ((su3) on6.b(new su3(ds4Var.g), new su3(ds4Var2.g), f3)).a, ((q03) on6.b(new q03(ds4Var.h), new q03(ds4Var2.h), f3)).a, (i47) on6.b(ds4Var.i, ds4Var2.i, f3)));
                            if (z3) {
                                s47Var3 = s47.a(s47Var3, j, 0L, null, null, 0L, 0L, null, 16777214);
                            }
                            nj2.b(j2, s47Var3, eo2Var, xq2Var3, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        } else {
                            xq2Var3.V();
                        }
                        return jg7.a;
                    }
                };
                floatValue = floatValue;
                zv0 I = n16.I(723429411, eo2Var2, xq2Var);
                xq2Var.p(false);
                zv0Var = I;
            }
            final boolean z4 = this.X;
            final i17 i17Var = this.R;
            final eo2 eo2Var3 = this.B;
            if (eo2Var3 != null && this.L.length() == 0 && floatValue2 > RecyclerView.B1) {
                xq2Var.b0(987666549);
                zv0Var2 = n16.I(-426706263, new fo2() { // from class: q17
                    @Override // defpackage.fo2
                    public final Object e(Object obj7, Object obj8, Object obj9) {
                        boolean z5;
                        int i7;
                        a74 a74Var = (a74) obj7;
                        px0 px0Var2 = (px0) obj8;
                        int intValue2 = ((Integer) obj9).intValue();
                        if ((intValue2 & 6) == 0) {
                            if (((xq2) px0Var2).f(a74Var)) {
                                i7 = 4;
                            } else {
                                i7 = 2;
                            }
                            intValue2 |= i7;
                        }
                        if ((intValue2 & 19) != 18) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        xq2 xq2Var3 = (xq2) px0Var2;
                        if (xq2Var3.S(intValue2 & 1, z5)) {
                            a74 j3 = jw2.j(a74Var, floatValue2);
                            e34 d = h70.d(d90.L, false);
                            int B = ge7.B(xq2Var3);
                            xv4 l = xq2Var3.l();
                            a74 E = l.E(xq2Var3, j3);
                            jx0.i.getClass();
                            iy0 iy0Var = ix0.b;
                            xq2Var3.f0();
                            if (xq2Var3.S) {
                                xq2Var3.k(iy0Var);
                            } else {
                                xq2Var3.o0();
                            }
                            yh2.K(xq2Var3, ix0.f, d);
                            yh2.K(xq2Var3, ix0.e, l);
                            pn pnVar = ix0.g;
                            if (xq2Var3.S || !nb3.k(xq2Var3.P(), Integer.valueOf(B))) {
                                i61.v(B, xq2Var3, B, pnVar);
                            }
                            yh2.K(xq2Var3, ix0.d, E);
                            nj2.b(((kt0) i17Var.h(z4, xq2Var3).getValue()).a, ((xe7) xq2Var3.j(ye7.b)).g, eo2Var3, xq2Var3, 0, 4);
                            xq2Var3.p(true);
                        } else {
                            xq2Var3.V();
                        }
                        return jg7.a;
                    }
                }, xq2Var);
                xq2Var.p(false);
            } else {
                xq2Var.b0(988093542);
                xq2Var.p(false);
                zv0Var2 = null;
            }
            boolean z5 = this.Y;
            long j3 = ((kt0) i17Var.a(z4, z5, xq2Var).getValue()).a;
            xq2Var.b0(988282301);
            xq2Var.p(false);
            long j4 = ((kt0) i17Var.g(z4, z5, this.Z, xq2Var).getValue()).a;
            xq2Var.b0(988575964);
            xq2Var.p(false);
            a74 L = vy7.L(x64.a, ((kt0) i17Var.d(xq2Var).getValue()).a, this.d0);
            int i7 = r17.a[this.e0.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    xq2Var.b0(989436742);
                    Object P = xq2Var.P();
                    vs0 vs0Var = ox0.a;
                    if (P == vs0Var) {
                        P = np2.Y(new xi6(0L));
                        xq2Var.l0(P);
                    }
                    qa4 qa4Var = (qa4) P;
                    zv0 I2 = n16.I(-1107746014, new e46(qa4Var, this.h0, this.j0, 2), xq2Var);
                    if ((i6 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P2 = xq2Var.P();
                    if (z2 || P2 == vs0Var) {
                        P2 = new n4(floatValue, qa4Var, 1);
                        xq2Var.l0(P2);
                    }
                    zv0 zv0Var3 = zv0Var2;
                    zv0 zv0Var4 = zv0Var;
                    zo4.c(L, this.f0, zv0Var3, zv0Var4, null, null, this.g0, floatValue, (qn2) P2, I2, this.h0, xq2Var, ((i6 << 21) & 29360128) | 805306368);
                    xq2Var.p(false);
                } else {
                    throw xg6.f(xq2Var, 1971561250, false);
                }
            } else {
                xq2Var.b0(988856360);
                uj2.h(L, this.f0, zv0Var, zv0Var2, null, null, this.g0, floatValue, this.h0, xq2Var, (i6 << 21) & 29360128);
                xq2Var.p(false);
            }
        } else {
            xq2Var2.V();
        }
        return jg7.a;
    }
}
