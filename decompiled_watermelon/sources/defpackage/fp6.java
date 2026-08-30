package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fp6  reason: default package */
/* loaded from: classes.dex */
public final class fp6 implements ej2 {
    public final /* synthetic */ aj2 A;
    public final /* synthetic */ yb1 B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ l14 X;
    public final /* synthetic */ y26 Y;
    public final /* synthetic */ nq6 Z;
    public final /* synthetic */ aj2 c0;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ ih4 e0;
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ et0 g0;

    public fp6(aj2 aj2Var, String str, yb1 yb1Var, boolean z, boolean z2, l14 l14Var, y26 y26Var, nq6 nq6Var, aj2 aj2Var2, boolean z3, ih4 ih4Var, boolean z4, et0 et0Var) {
        this.A = aj2Var;
        this.B = yb1Var;
        this.L = z;
        this.R = z2;
        this.X = l14Var;
        this.Y = y26Var;
        this.Z = nq6Var;
        this.c0 = aj2Var2;
        this.d0 = z3;
        this.e0 = ih4Var;
        this.f0 = z4;
        this.g0 = et0Var;
    }

    @Override // defpackage.ej2
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        boolean z;
        et0 et0Var;
        long j;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        final float floatValue = ((Number) obj).floatValue();
        final long j3 = ((xq0) obj2).a;
        final long j4 = ((xq0) obj3).a;
        float floatValue2 = ((Number) obj4).floatValue();
        tu0 tu0Var = (tu0) obj5;
        int intValue = ((Number) obj6).intValue();
        if ((intValue & 6) == 0) {
            if (((sk2) tu0Var).c(floatValue)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i = i5 | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            if (((sk2) tu0Var).e(j3)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i |= i4;
        }
        if ((intValue & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (((sk2) tu0Var).e(j4)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i |= i3;
        }
        if ((intValue & 3072) == 0) {
            if (((sk2) tu0Var).c(floatValue2)) {
                i2 = 2048;
            } else {
                i2 = 1024;
            }
            i |= i2;
        }
        int i6 = i;
        boolean z2 = true;
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        sk2 sk2Var = (sk2) tu0Var;
        if (sk2Var.O(i6 & 1, z)) {
            final aj2 aj2Var = this.A;
            if (aj2Var == null) {
                sk2Var.X(986681709);
                sk2Var.p(false);
                et0Var = null;
            } else {
                sk2Var.X(986681710);
                final boolean z3 = this.f0;
                aj2 aj2Var2 = new aj2() { // from class: dp6
                    @Override // defpackage.aj2
                    public final Object j(Object obj7, Object obj8) {
                        boolean z4;
                        float f;
                        float f2;
                        u26 H;
                        u26 u26Var;
                        yo4 yo4Var;
                        qo4 qo4Var;
                        qo4 qo4Var2;
                        tu0 tu0Var2 = (tu0) obj7;
                        int intValue2 = ((Integer) obj8).intValue();
                        if ((intValue2 & 3) != 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        sk2 sk2Var2 = (sk2) tu0Var2;
                        if (sk2Var2.O(intValue2 & 1, z4)) {
                            ye6 ye6Var = d17.b;
                            ds6 ds6Var = ((c17) sk2Var2.j(ye6Var)).g;
                            ds6 ds6Var2 = ((c17) sk2Var2.j(ye6Var)).l;
                            xb6 xb6Var = ds6Var.a;
                            xb6 xb6Var2 = ds6Var2.a;
                            qq6 qq6Var = yb6.d;
                            qq6 qq6Var2 = xb6Var.a;
                            qq6 qq6Var3 = xb6Var2.a;
                            boolean z5 = qq6Var2 instanceof d60;
                            qq6 qq6Var4 = pq6.a;
                            float f3 = floatValue;
                            if (!z5 && !(qq6Var3 instanceof d60)) {
                                long U = mh7.U(qq6Var2.b(), qq6Var3.b(), f3);
                                if (U != 16) {
                                    qq6Var4 = new fr0(U);
                                }
                            } else if (z5 && (qq6Var3 instanceof d60)) {
                                d60 d60Var = (d60) qq6Var2;
                                d60 d60Var2 = (d60) qq6Var3;
                                b60 b60Var = (b60) yb6.b(d60Var.a, d60Var2.a, f3);
                                float y = ep2.y(d60Var.b, d60Var2.b, f3);
                                if (b60Var != null) {
                                    if (b60Var instanceof mb6) {
                                        long L = mj2.L(y, ((mb6) b60Var).a);
                                        if (L != 16) {
                                            qq6Var4 = new fr0(L);
                                        }
                                    } else if (b60Var instanceof l26) {
                                        qq6Var4 = new d60((l26) b60Var, y);
                                    } else {
                                        i.c();
                                        return null;
                                    }
                                }
                            } else {
                                qq6Var4 = (qq6) yb6.b(qq6Var2, qq6Var3, f3);
                            }
                            qq6 qq6Var5 = qq6Var4;
                            pd2 pd2Var = (pd2) yb6.b(xb6Var.f, xb6Var2.f, f3);
                            long c = yb6.c(xb6Var.b, xb6Var2.b, f3);
                            pe2 pe2Var = xb6Var.c;
                            if (pe2Var == null) {
                                pe2Var = pe2.Y;
                            }
                            pe2 pe2Var2 = xb6Var2.c;
                            if (pe2Var2 == null) {
                                pe2Var2 = pe2.Y;
                            }
                            pe2 pe2Var3 = new pe2(io2.m(ep2.z(f3, pe2Var.A, pe2Var2.A), 1, 1000));
                            ke2 ke2Var = (ke2) yb6.b(xb6Var.d, xb6Var2.d, f3);
                            le2 le2Var = (le2) yb6.b(xb6Var.e, xb6Var2.e, f3);
                            String str = (String) yb6.b(xb6Var.g, xb6Var2.g, f3);
                            long c2 = yb6.c(xb6Var.h, xb6Var2.h, f3);
                            d10 d10Var = xb6Var.i;
                            if (d10Var != null) {
                                f = d10Var.a;
                            } else {
                                f = 0.0f;
                            }
                            d10 d10Var2 = xb6Var2.i;
                            if (d10Var2 != null) {
                                f2 = d10Var2.a;
                            } else {
                                f2 = 0.0f;
                            }
                            float y2 = ep2.y(f, f2, f3);
                            rq6 rq6Var = xb6Var.j;
                            rq6 rq6Var2 = rq6.c;
                            if (rq6Var == null) {
                                rq6Var = rq6Var2;
                            }
                            rq6 rq6Var3 = xb6Var2.j;
                            if (rq6Var3 != null) {
                                rq6Var2 = rq6Var3;
                            }
                            rq6 rq6Var4 = new rq6(ep2.y(rq6Var.a, rq6Var2.a, f3), ep2.y(rq6Var.b, rq6Var2.b, f3));
                            fr3 fr3Var = (fr3) yb6.b(xb6Var.k, xb6Var2.k, f3);
                            long U2 = mh7.U(xb6Var.l, xb6Var2.l, f3);
                            qo6 qo6Var = (qo6) yb6.b(xb6Var.m, xb6Var2.m, f3);
                            u26 u26Var2 = xb6Var.n;
                            u26 u26Var3 = xb6Var2.n;
                            if (u26Var2 == null && u26Var3 == null) {
                                u26Var = null;
                            } else {
                                if (u26Var2 == null) {
                                    u26Var3.getClass();
                                    H = hk2.H(new u26(xq0.b(RecyclerView.A1, u26Var3.a), u26Var3.b, u26Var3.c), u26Var3, f3);
                                } else if (u26Var3 == null) {
                                    H = hk2.H(u26Var2, new u26(xq0.b(RecyclerView.A1, u26Var2.a), u26Var2.b, u26Var2.c), f3);
                                } else {
                                    H = hk2.H(u26Var2, u26Var3, f3);
                                }
                                u26Var = H;
                            }
                            yo4 yo4Var2 = xb6Var.o;
                            yo4 yo4Var3 = xb6Var2.o;
                            if (yo4Var2 == null && yo4Var3 == null) {
                                yo4Var = null;
                            } else {
                                if (yo4Var2 == null) {
                                    yo4Var2 = yo4.a;
                                }
                                yo4Var = yo4Var2;
                            }
                            xb6 xb6Var3 = new xb6(qq6Var5, c, pe2Var3, ke2Var, le2Var, pd2Var, str, c2, new d10(y2), rq6Var4, fr3Var, U2, qo6Var, u26Var, yo4Var, (ik1) yb6.b(xb6Var.p, xb6Var2.p, f3));
                            bj4 bj4Var = ds6Var.b;
                            bj4 bj4Var2 = ds6Var2.b;
                            int i7 = cj4.b;
                            int i8 = ((kn6) yb6.b(new kn6(bj4Var.a), new kn6(bj4Var2.a), f3)).a;
                            int i9 = ((to6) yb6.b(new to6(bj4Var.b), new to6(bj4Var2.b), f3)).a;
                            long c3 = yb6.c(bj4Var.c, bj4Var2.c, f3);
                            sq6 sq6Var = bj4Var.d;
                            if (sq6Var == null) {
                                sq6Var = sq6.c;
                            }
                            sq6 sq6Var2 = bj4Var2.d;
                            if (sq6Var2 == null) {
                                sq6Var2 = sq6.c;
                            }
                            sq6 sq6Var3 = new sq6(yb6.c(sq6Var.a, sq6Var2.a, f3), yb6.c(sq6Var.b, sq6Var2.b, f3));
                            qo4 qo4Var3 = bj4Var.e;
                            qo4 qo4Var4 = bj4Var2.e;
                            if (qo4Var3 == null && qo4Var4 == null) {
                                qo4Var2 = null;
                            } else {
                                qo4 qo4Var5 = qo4.c;
                                if (qo4Var3 == null) {
                                    qo4Var = qo4Var5;
                                } else {
                                    qo4Var = qo4Var3;
                                }
                                boolean z6 = qo4Var.a;
                                if (qo4Var4 == null) {
                                    qo4Var4 = qo4Var5;
                                }
                                boolean z7 = qo4Var4.a;
                                if (z6 == z7) {
                                    qo4Var2 = qo4Var;
                                } else {
                                    qo4Var2 = new qo4(((ap1) yb6.b(new ap1(qo4Var.b), new ap1(qo4Var4.b), f3)).a, ((Boolean) yb6.b(Boolean.valueOf(z6), Boolean.valueOf(z7), f3)).booleanValue());
                                }
                            }
                            ds6 ds6Var3 = new ds6(xb6Var3, new bj4(i8, i9, c3, sq6Var3, qo4Var2, (vn3) yb6.b(bj4Var.f, bj4Var2.f, f3), ((qn3) yb6.b(new qn3(bj4Var.g), new qn3(bj4Var2.g), f3)).a, ((pu2) yb6.b(new pu2(bj4Var.h), new pu2(bj4Var2.h), f3)).a, (tr6) yb6.b(bj4Var.i, bj4Var2.i, f3)));
                            if (z3) {
                                ds6Var3 = ds6.a(ds6Var3, j3, 0L, null, null, 0L, 0L, null, 16777214);
                            }
                            jk2.c(j4, ds6Var3, aj2Var, sk2Var2, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        } else {
                            sk2Var2.R();
                        }
                        return o27.a;
                    }
                };
                floatValue = floatValue;
                et0 H0 = ct3.H0(723429411, aj2Var2, sk2Var);
                sk2Var.p(false);
                et0Var = H0;
            }
            sk2Var.X(988093542);
            sk2Var.p(false);
            sk2Var.X(-1036335134);
            sk2Var.X(-776179197);
            boolean z4 = this.R;
            boolean z5 = this.L;
            yb1 yb1Var = this.B;
            if (!z5) {
                j = yb1Var.j;
            } else if (z4) {
                j = yb1Var.k;
            } else {
                j = yb1Var.i;
            }
            k24 g = b31.g(j, sk2Var, false);
            sk2Var.p(false);
            long j5 = ((xq0) g.getValue()).a;
            sk2Var.X(988282301);
            sk2Var.p(false);
            sk2Var.X(79259602);
            k24 a = bh7.a(this.X, sk2Var, 0);
            if (!z5) {
                j2 = yb1Var.n;
            } else if (z4) {
                j2 = yb1Var.o;
            } else if (((Boolean) a.getValue()).booleanValue()) {
                j2 = yb1Var.m;
            } else {
                j2 = yb1Var.l;
            }
            long j6 = ((xq0) b31.g(j2, sk2Var, false).getValue()).a;
            sk2Var.X(988575964);
            sk2Var.p(false);
            sk2Var.X(-28962788);
            zy3 i7 = dk7.i(wy3.a, ((xq0) b31.g(yb1Var.p, sk2Var, false).getValue()).a, this.Y);
            int i8 = ep6.a[this.Z.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    sk2Var.X(989436742);
                    Object L = sk2Var.L();
                    sn1 sn1Var = su0.a;
                    if (L == sn1Var) {
                        L = me2.G(new i76(0L));
                        sk2Var.h0(L);
                    }
                    k24 k24Var = (k24) L;
                    et0 H02 = ct3.H0(-1107746014, new w3(k24Var, this.e0, this.g0, 27), sk2Var);
                    if ((i6 & 14) != 4) {
                        z2 = false;
                    }
                    Object L2 = sk2Var.L();
                    if (z2 || L2 == sn1Var) {
                        L2 = new n4(floatValue, k24Var, 2);
                        sk2Var.h0(L2);
                    }
                    vf4.c(i7, this.c0, null, et0Var, null, null, this.d0, floatValue, (mi2) L2, H02, this.e0, sk2Var, ((i6 << 21) & 29360128) | 805306368);
                    sk2Var.p(false);
                } else {
                    throw ej6.d(sk2Var, 1971561250, false);
                }
            } else {
                sk2Var.X(988856360);
                nk2.i(i7, this.c0, et0Var, null, null, null, this.d0, floatValue, this.e0, sk2Var, (i6 << 21) & 29360128);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
