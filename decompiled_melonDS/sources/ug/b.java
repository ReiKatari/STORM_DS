package ug;

import a4.f0;
import android.content.Context;
import android.content.res.Resources;
import b3.p;
import b4.r0;
import f1.n;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.l0;
import g2.m0;
import g2.n0;
import g2.o0;
import g2.p5;
import g2.q0;
import i3.z;
import java.util.List;
import l1.m1;
import l1.o1;
import l1.r1;
import l1.u;
import l1.w;
import mc.l;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.settings.fragments.k;
import n2.b0;
import n2.b1;
import n2.m;
import n2.p1;
import n2.r;
import n2.s;
import n2.w0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f13550a = new v2.c(-531717168, false, new qh.a(2));

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r16, final java.lang.String r17, boolean r18, final mc.a r19, float r20, n2.m r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.b.a(java.lang.String, java.lang.String, boolean, mc.a, float, n2.m, int, int):void");
    }

    public static final void b(final String str, final float f8, final sc.a aVar, final boolean z10, final l lVar, final float f10, m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        float f11;
        str.getClass();
        lVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(1905014024);
        if (rVar.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i16 = i2 | i10;
        if (rVar.c(f8)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i17 = i16 | i11;
        if (rVar.f(aVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i18 = i17 | i12;
        if (rVar.g(z10)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i19 = i18 | i13;
        if (rVar.h(lVar)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i20 = i19 | i14;
        if (rVar.c(f10)) {
            i15 = 131072;
        } else {
            i15 = 65536;
        }
        int i21 = i20 | i15;
        if ((74899 & i21) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i21 & 1, z11)) {
            if ((i21 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (z12 || L == eVar) {
                L = new b1(f8);
                rVar.h0(L);
            }
            b1 b1Var = (b1) L;
            int i22 = i21 & 896;
            if (i22 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object L2 = rVar.L();
            if (z13 || L2 == eVar) {
                L2 = Float.valueOf((aVar.f12864b - aVar.f12863a) / 20.0f);
                rVar.h0(L2);
            }
            float floatValue = ((Number) L2).floatValue();
            p b10 = r1.b(b3.m.f1770a, 1.0f);
            Object L3 = rVar.L();
            if (L3 == eVar) {
                L3 = new a3.g(14);
                rVar.h0(L3);
            }
            p i23 = n.i(b10, z10, null, (mc.a) L3, 14);
            boolean f12 = rVar.f(b1Var) | rVar.c(floatValue);
            if (i22 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z15 = z14 | f12;
            Object L4 = rVar.L();
            if (z15 || L4 == eVar) {
                L4 = new d(floatValue, aVar, b1Var);
                rVar.h0(L4);
            }
            p e6 = r1.e(t3.c.d(i23, (l) L4), 64, 0.0f, 2);
            float f13 = 8;
            p w10 = l1.c.w(e6, f10, f13, f10, f13);
            w a10 = u.a(l1.i.f8573c, b3.c.f1758g0, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(w10, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a10, a4.g.f215e, rVar);
            s.C(l10, a4.g.f214d, rVar);
            s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            s.y(rVar, a4.g.f217g);
            s.C(c4, a4.g.f213c, rVar);
            b0 b0Var = o0.f5308a;
            if (z10) {
                rVar.X(-838227882);
                long j2 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
                if (!((l0) rVar.j(m0.f5257a)).k() ? z.r(j2) < 0.5d : z.r(j2) > 0.5d) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.87f;
                }
                rVar.p(false);
            } else {
                rVar.X(-838227142);
                long j10 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
                if (((l0) rVar.j(m0.f5257a)).k()) {
                    z.r(j10);
                } else {
                    z.r(j10);
                }
                rVar.p(false);
                f11 = 0.38f;
            }
            s.a(b0Var.a(Float.valueOf(f11)), v2.h.c(1351204114, new k(str, b1Var, z10, aVar, lVar), rVar), rVar, 56);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(str, f8, aVar, z10, lVar, f10, i2) { // from class: ug.c
                public final /* synthetic */ String A;
                public final /* synthetic */ float B;
                public final /* synthetic */ sc.a L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ l X;
                public final /* synthetic */ float Y;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = s.F(1);
                    b.b(this.A, this.B, this.L, this.R, this.X, this.Y, (m) obj, F);
                    return y.f14813a;
                }
            };
        }
    }

    public static final void c(String str, List list, int i2, l lVar, mc.a aVar, m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        r rVar = (r) mVar;
        rVar.Z(-1472832339);
        if ((i10 & 6) == 0) {
            if (rVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.h(list)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (rVar.d(i2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.h(lVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (rVar.h(aVar)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i11 |= i12;
        }
        if ((i11 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            og.a.a(aVar, null, v2.h.c(960321110, new g(i2, 0, str, list, aVar, lVar), rVar), rVar, ((i11 >> 12) & 14) | 384);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new rg.b(i2, i10, str, list, aVar, lVar);
        }
    }

    public static final void d(final String str, final String str2, final List list, final int i2, final l lVar, boolean z10, float f8, m mVar, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        float f10;
        int i19;
        int i20;
        boolean z12;
        final boolean z13;
        final float f11;
        final boolean z14;
        final float f12;
        float f13;
        str.getClass();
        str2.getClass();
        lVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(1352551305);
        if (rVar.f(str)) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        int i21 = i10 | i12;
        if (rVar.f(str2)) {
            i13 = 32;
        } else {
            i13 = 16;
        }
        int i22 = i21 | i13;
        if (rVar.h(list)) {
            i14 = 256;
        } else {
            i14 = 128;
        }
        int i23 = i22 | i14;
        if (rVar.d(i2)) {
            i15 = 2048;
        } else {
            i15 = 1024;
        }
        int i24 = i23 | i15;
        if (rVar.h(lVar)) {
            i16 = 16384;
        } else {
            i16 = 8192;
        }
        int i25 = i24 | i16;
        int i26 = i11 & 32;
        if (i26 != 0) {
            i18 = i25 | 196608;
            z11 = z10;
        } else {
            z11 = z10;
            if (rVar.g(z11)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i18 = i25 | i17;
        }
        int i27 = i11 & 64;
        if (i27 != 0) {
            i20 = i18 | 1572864;
            f10 = f8;
        } else {
            f10 = f8;
            if (rVar.c(f10)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i20 = i18 | i19;
        }
        if ((599187 & i20) != 599186) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar.O(i20 & 1, z12)) {
            if (i26 != 0) {
                z14 = true;
            } else {
                z14 = z11;
            }
            if (i27 != 0) {
                f12 = 16;
            } else {
                f12 = f10;
            }
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = s.w(Boolean.FALSE);
                rVar.h0(L);
            }
            final w0 w0Var = (w0) L;
            b0 b0Var = o0.f5308a;
            if (z14) {
                rVar.X(-1573274739);
                long j2 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
                if (!((l0) rVar.j(m0.f5257a)).k() ? z.r(j2) < 0.5d : z.r(j2) > 0.5d) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.87f;
                }
                rVar.p(false);
            } else {
                rVar.X(-1573273999);
                long j10 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
                if (((l0) rVar.j(m0.f5257a)).k()) {
                    z.r(j10);
                } else {
                    z.r(j10);
                }
                rVar.p(false);
                f13 = 0.38f;
            }
            s.a(b0Var.a(Float.valueOf(f13)), v2.h.c(1427320905, new mc.p() { // from class: ug.e
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    boolean z15;
                    m mVar2 = (m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    r rVar2 = (r) mVar2;
                    if (rVar2.O(intValue & 1, z15)) {
                        p b10 = r1.b(b3.m.f1770a, 1.0f);
                        Object L2 = rVar2.L();
                        if (L2 == n2.l.f9953a) {
                            L2 = new ai.s(w0Var, 23);
                            rVar2.h0(L2);
                        }
                        boolean z16 = z14;
                        p e6 = r1.e(n.l(n.i(b10, z16, null, (mc.a) L2, 14), z16, null, 2), 64, 0.0f, 2);
                        float f14 = 8;
                        float f15 = f12;
                        p w10 = l1.c.w(e6, f15, f14, f15, f14);
                        w a10 = u.a(l1.i.f8574d, b3.c.f1758g0, rVar2, 6);
                        int hashCode = Long.hashCode(rVar2.T);
                        v2.g l10 = rVar2.l();
                        p c4 = b3.a.c(w10, rVar2);
                        a4.h.f220a.getClass();
                        f0 f0Var = a4.g.f212b;
                        rVar2.b0();
                        if (rVar2.S) {
                            rVar2.k(f0Var);
                        } else {
                            rVar2.k0();
                        }
                        s.C(a10, a4.g.f215e, rVar2);
                        s.C(l10, a4.g.f214d, rVar2);
                        s.u(rVar2, Integer.valueOf(hashCode), a4.g.f216f);
                        s.y(rVar2, a4.g.f217g);
                        s.C(c4, a4.g.f213c, rVar2);
                        e7.b(str, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((f7) rVar2.j(g7.f5161b)).f5150i, rVar2, 0, 3120, 55294);
                        p7.l.b(str2, null, 0L, 0L, 0L, 0L, 2, false, 1, 0, null, null, rVar2, 0, 3120, 120830);
                        rVar2.p(true);
                    } else {
                        rVar2.R();
                    }
                    return y.f14813a;
                }
            }, rVar), rVar, 56);
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                rVar.X(-1526048517);
                Object L2 = rVar.L();
                if (L2 == eVar) {
                    L2 = new ai.s(w0Var, 22);
                    rVar.h0(L2);
                }
                int i28 = i20 >> 3;
                c(str, list, i2, lVar, (mc.a) L2, rVar, (i20 & 14) | 24576 | (i28 & 112) | (i28 & 896) | (i28 & 7168));
                rVar.p(false);
            } else {
                rVar.X(-1525804423);
                rVar.p(false);
            }
            z13 = z14;
            f11 = f12;
        } else {
            rVar.R();
            z13 = z11;
            f11 = f10;
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(str, str2, list, i2, lVar, z13, f11, i10, i11) { // from class: ug.f
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ List L;
                public final /* synthetic */ int R;
                public final /* synthetic */ l X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ float Z;

                /* renamed from: b0  reason: collision with root package name */
                public final /* synthetic */ int f13551b0;

                {
                    this.f13551b0 = i11;
                }

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = s.F(1);
                    b.d(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (m) obj, F, this.f13551b0);
                    return y.f14813a;
                }
            };
        }
    }

    public static final void e(final String str, final boolean z10, final l lVar, final float f8, m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        str.getClass();
        lVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(1457840675);
        if (rVar.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i2 | i10;
        if (rVar.g(z10)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.h(lVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar.c(f8)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i17 = i16 | i13;
        if ((i17 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i17 & 1, z11)) {
            b3.m mVar2 = b3.m.f1770a;
            p b10 = r1.b(mVar2, 1.0f);
            if ((i17 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((i17 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z14 = z13 | z12;
            Object L = rVar.L();
            if (z14 || L == n2.l.f9953a) {
                L = new g1.g(lVar, z10, 3);
                rVar.h0(L);
            }
            float f10 = 8;
            p w10 = l1.c.w(r1.e(n.l(n.i(b10, false, null, (mc.a) L, 15), false, null, 3), 48, 0.0f, 2), f8, f10, f8, f10);
            o1 a10 = m1.a(l1.i.f8571a, b3.c.f1756e0, rVar, 48);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(w10, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a10, a4.g.f215e, rVar);
            s.C(l10, a4.g.f214d, rVar);
            s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            s.y(rVar, a4.g.f217g);
            s.C(c4, a4.g.f213c, rVar);
            if (1.0f <= 0.0d) {
                m1.a.a("invalid weight; must be greater than zero");
            }
            e7.b(str, new l1.w0(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((f7) rVar.j(g7.f5161b)).f5150i, rVar, i17 & 14, 3120, 55292);
            rVar = rVar;
            l1.c.d(r1.l(mVar2, 16), rVar);
            Resources.Theme theme = ((Context) rVar.j(r0.f1937b)).getTheme();
            ThreadLocal threadLocal = p5.k.f11352a;
            p5.a(z10, null, false, n0.o(z.c(((Resources) rVar.j(r0.f1938c)).getColor(R.color.switchThumbUnselected, theme)), rVar, 1015), rVar, ((i17 >> 3) & 14) | 48);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(str, z10, lVar, f8, i2) { // from class: ug.j
                public final /* synthetic */ String A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ l L;
                public final /* synthetic */ float R;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = s.F(1);
                    b.e(this.A, this.B, this.L, this.R, (m) obj, F);
                    return y.f14813a;
                }
            };
        }
    }
}
