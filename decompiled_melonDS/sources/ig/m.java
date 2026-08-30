package ig;

import a4.f0;
import ai.c0;
import ai.k0;
import ai.s0;
import ai.w;
import ai.x;
import ai.y0;
import android.content.Context;
import b4.q1;
import b4.r0;
import c1.p;
import c1.y1;
import f1.n;
import f1.u;
import g2.a0;
import g2.f3;
import g2.l0;
import g2.l5;
import g2.m0;
import g2.n0;
import g2.o3;
import g2.r3;
import g2.t3;
import g2.u3;
import g2.w3;
import g2.w6;
import i3.p0;
import i3.s;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import l1.c2;
import l1.d1;
import l1.e0;
import l1.h1;
import l1.r1;
import mc.q;
import me.magnum.melonds.R;
import n2.p1;
import n2.r;
import n2.s2;
import n2.t2;
import n2.w0;
import p7.t;
import y3.v0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f7076a = new v2.c(1568795229, false, new ai.m(19));

    /* renamed from: b  reason: collision with root package name */
    public static final v2.c f7077b = new v2.c(-254675756, false, new ai.m(20));

    /* renamed from: c  reason: collision with root package name */
    public static final v2.c f7078c = new v2.c(1379786867, false, new w6(1));

    /* renamed from: d  reason: collision with root package name */
    public static final v2.c f7079d = new v2.c(36126994, false, new w6(2));

    /* renamed from: e  reason: collision with root package name */
    public static final v2.c f7080e = new v2.c(-783268272, false, new w6(3));

    /* renamed from: f  reason: collision with root package name */
    public static final v2.c f7081f = new v2.c(1006516898, false, new w6(4));

    /* renamed from: g  reason: collision with root package name */
    public static final v2.c f7082g = new v2.c(325879492, false, new w6(5));

    public static final void a(int i2, mc.a aVar, n2.m mVar) {
        int i10;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(584970726);
        if (rVar.h(aVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            s sVar = new s(s.f6681b);
            long j2 = s.f6686g;
            long j10 = s.f6683d;
            a0.c(f7081f, n.e(na.f.l(t.y(sVar, new s(j2)), 0.0f, 0.0f, 14)), v2.h.c(-1286564128, new k0(4, aVar), rVar), null, j2, j10, 0, rVar, 1794486, 8);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new k0(i2, 5, aVar);
        }
    }

    public static final void b(final oe.a aVar, final boolean z10, final y1 y1Var, final p pVar, final mc.a aVar2, final mc.a aVar3, final mc.a aVar4, n2.m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        String str;
        y1Var.getClass();
        pVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        r rVar = (r) mVar;
        rVar.Z(2119961070);
        if (rVar.h(aVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i17 = i2 | i10;
        if (rVar.g(z10)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i18 = i17 | i11;
        if (rVar.f(y1Var)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i19 = i18 | i12;
        if (rVar.h(pVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i20 = i19 | i13;
        if (rVar.h(aVar2)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i21 = i20 | i14;
        if (rVar.h(aVar3)) {
            i15 = 131072;
        } else {
            i15 = 65536;
        }
        int i22 = i21 | i15;
        if (rVar.h(aVar4)) {
            i16 = 1048576;
        } else {
            i16 = 524288;
        }
        int i23 = i22 | i16;
        if ((599187 & i23) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i23 & 1, z11)) {
            UUID uuid = aVar.f10905a;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            int i24 = i23 << 9;
            int i25 = ((i23 << 6) & 7168) | 24576 | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192);
            c(str, aVar.f10906b, c9.m.f(aVar, rVar, i23 & 14), z10, true, y1Var, pVar, aVar2, aVar3, aVar4, rVar, i25);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(z10, y1Var, pVar, aVar2, aVar3, aVar4, i2) { // from class: ig.a
                public final /* synthetic */ boolean B;
                public final /* synthetic */ y1 L;
                public final /* synthetic */ p R;
                public final /* synthetic */ mc.a X;
                public final /* synthetic */ mc.a Y;
                public final /* synthetic */ mc.a Z;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(1);
                    m.b(oe.a.this, this.B, this.L, this.R, this.X, this.Y, this.Z, (n2.m) obj, F);
                    return y.f14813a;
                }
            };
        }
    }

    public static final void c(final String str, final String str2, final n3.b bVar, final boolean z10, final boolean z11, final y1 y1Var, final p pVar, final mc.a aVar, final mc.a aVar2, final mc.a aVar3, n2.m mVar, final int i2) {
        int i10;
        p pVar2;
        mc.a aVar4;
        mc.a aVar5;
        boolean z12;
        r rVar;
        w0 w0Var;
        b3.p pVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean h2;
        int i18;
        int i19;
        int i20;
        r rVar2 = (r) mVar;
        rVar2.Z(1538479222);
        if ((i2 & 6) == 0) {
            if (rVar2.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i10 = i20 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar2.f(str2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i10 |= i19;
        }
        if ((i2 & 384) == 0) {
            if ((i2 & 512) == 0) {
                h2 = rVar2.f(bVar);
            } else {
                h2 = rVar2.h(bVar);
            }
            if (h2) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i10 |= i18;
        }
        if ((i2 & 3072) == 0) {
            if (rVar2.g(z10)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i10 |= i17;
        }
        if ((i2 & 24576) == 0) {
            if (rVar2.g(z11)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i10 |= i16;
        }
        if ((196608 & i2) == 0) {
            if (rVar2.f(y1Var)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i10 |= i15;
        }
        if ((1572864 & i2) == 0) {
            pVar2 = pVar;
            if (rVar2.h(pVar2)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i10 |= i14;
        } else {
            pVar2 = pVar;
        }
        if ((12582912 & i2) == 0) {
            if (rVar2.h(aVar)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i10 |= i13;
        }
        if ((100663296 & i2) == 0) {
            aVar4 = aVar2;
            if (rVar2.h(aVar4)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i10 |= i12;
        } else {
            aVar4 = aVar2;
        }
        if ((805306368 & i2) == 0) {
            aVar5 = aVar3;
            if (rVar2.h(aVar5)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i10 |= i11;
        } else {
            aVar5 = aVar3;
        }
        int i21 = i10;
        if ((306783379 & i21) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar2.O(i21 & 1, z12)) {
            Object L = rVar2.L();
            if (L == n2.l.f9953a) {
                L = n2.s.w(Boolean.FALSE);
                rVar2.h0(L);
            }
            w0 w0Var2 = (w0) L;
            if (z10) {
                rVar2.X(1238955243);
                long i22 = ((l0) rVar2.j(m0.f5257a)).i();
                w0Var = w0Var2;
                pVar3 = new u(4, new p0(i22), ((u3) rVar2.j(w3.f5448a)).f5421b);
                rVar2.p(false);
            } else {
                w0Var = w0Var2;
                rVar2.X(1239147660);
                rVar2.p(false);
                pVar3 = b3.m.f1770a;
            }
            b3.p pVar4 = pVar3;
            v2.c c4 = v2.h.c(-1422284196, new b(y1Var, pVar2, bVar, str, str2, z11, w0Var, aVar4, aVar5), rVar2);
            t1.d dVar = ((u3) rVar2.j(w3.f5448a)).f5421b;
            long j2 = ((l0) rVar2.j(m0.f5257a)).j();
            rVar = rVar2;
            n0.i(aVar, pVar4, true, dVar, j2, m0.b(j2, rVar2), 4, null, c4, rVar, (((i21 >> 21) & 14) | 817889280) & 2147483646, 0);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: ig.c
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m.c(str, str2, bVar, z10, z11, y1Var, pVar, aVar, aVar2, aVar3, (n2.m) obj, n2.s.F(i2 | 1));
                    return y.f14813a;
                }
            };
        }
    }

    public static final void d(final b3.p pVar, final d1 d1Var, final List list, final UUID uuid, final y1 y1Var, final p pVar2, final mc.l lVar, final mc.l lVar2, final mc.l lVar3, n2.m mVar, final int i2) {
        int i10;
        y1 y1Var2;
        mc.l lVar4;
        mc.l lVar5;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        o1.a aVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        r rVar = (r) mVar;
        rVar.Z(-1872213612);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i10 = i19 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(d1Var)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i10 |= i18;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(list)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i10 |= i17;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(uuid)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i10 |= i16;
        }
        if ((i2 & 24576) == 0) {
            y1Var2 = y1Var;
            if (rVar.f(y1Var2)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i10 |= i15;
        } else {
            y1Var2 = y1Var;
        }
        if ((196608 & i2) == 0) {
            if (rVar.h(pVar2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i10 |= i14;
        }
        if ((1572864 & i2) == 0) {
            lVar4 = lVar;
            if (rVar.h(lVar4)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i10 |= i13;
        } else {
            lVar4 = lVar;
        }
        if ((12582912 & i2) == 0) {
            if (rVar.h(lVar2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i10 |= i12;
        }
        if ((100663296 & i2) == 0) {
            lVar5 = lVar3;
            if (rVar.h(lVar5)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i10 |= i11;
        } else {
            lVar5 = lVar3;
        }
        boolean z14 = false;
        if ((i10 & 38347923) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            b3.p k10 = l1.c.k(pVar, d1Var);
            o1.a aVar2 = new o1.a(140);
            t2 t2Var = q1.f1924n;
            float f8 = 16;
            h1 h1Var = new h1(l1.c.j(d1Var, (x4.m) rVar.j(t2Var)) + f8, d1Var.b() + f8, l1.c.i(d1Var, (x4.m) rVar.j(t2Var)) + f8, d1Var.a() + f8 + 56 + f8);
            l1.g g10 = l1.i.g(f8);
            l1.g g11 = l1.i.g(f8);
            boolean h2 = rVar.h(list) | rVar.h(uuid);
            if ((3670016 & i10) == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = h2 | z11;
            if ((57344 & i10) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean h10 = z15 | z12 | rVar.h(pVar2);
            if ((29360128 & i10) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z16 = h10 | z13;
            if ((i10 & 234881024) == 67108864) {
                z14 = true;
            }
            boolean z17 = z16 | z14;
            Object L = rVar.L();
            if (!z17 && L != n2.l.f9953a) {
                aVar = aVar2;
            } else {
                aVar = aVar2;
                b7.u uVar = new b7.u(list, uuid, lVar4, y1Var2, pVar2, lVar2, lVar5);
                rVar.h0(uVar);
                L = uVar;
            }
            ij.a.t(aVar, k10, null, h1Var, g11, g10, null, false, null, (mc.l) L, rVar, 1769472);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: ig.g
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m.d(b3.p.this, d1Var, list, uuid, y1Var, pVar2, lVar, lVar2, lVar3, (n2.m) obj, n2.s.F(i2 | 1));
                    return y.f14813a;
                }
            };
        }
    }

    public static final void e(final hg.l lVar, final y1 y1Var, final p pVar, mc.l lVar2, mc.l lVar3, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        mc.l lVar4;
        mc.l lVar5;
        boolean z10;
        r rVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        y1Var.getClass();
        pVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.Z(-602231173);
        if ((i2 & 6) == 0) {
            if (rVar2.h(lVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar2.f(y1Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i2 & 384) == 0) {
            if (rVar2.h(pVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i2 & 3072) == 0) {
            lVar4 = lVar2;
            if (rVar2.h(lVar4)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        } else {
            lVar4 = lVar2;
        }
        if ((i2 & 24576) == 0) {
            lVar5 = lVar3;
            if (rVar2.h(lVar5)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        } else {
            lVar5 = lVar3;
        }
        if ((196608 & i2) == 0) {
            if (rVar2.h(aVar)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i10 |= i11;
        }
        if ((74899 & i10) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i10 & 1, z10)) {
            Context context = (Context) rVar2.j(r0.f1937b);
            rg.d D = p7.m.D(rVar2);
            final w0 l10 = p7.j.l(lVar.f6504e, rVar2);
            final w0 l11 = p7.j.l(lVar.f6506g, rVar2);
            vd.a aVar2 = new vd.a(sd.f.READ, 1);
            boolean h2 = rVar2.h(context) | rVar2.f(D) | rVar2.h(lVar);
            Object L = rVar2.L();
            Object obj = n2.l.f9953a;
            if (h2 || L == obj) {
                L = new c0(context, D, lVar, 9);
                rVar2.h0(L);
            }
            e.k S = a.a.S(aVar2, (mc.l) L, rVar2, 0);
            final String I = l0.f.I(rVar2, R.string.background_deleted);
            final String I2 = l0.f.I(rVar2, R.string.undo);
            final t3 d4 = r3.d(null, rVar2, 3);
            Object L2 = rVar2.L();
            if (L2 == obj) {
                L2 = n2.s.o(rVar2);
                rVar2.h0(L2);
            }
            final zc.u uVar = (zc.u) L2;
            s9.a a10 = s9.c.a(rVar2);
            t2 t2Var = m0.f5257a;
            s9.a.b(a10, ((l0) rVar2.j(t2Var)).h());
            a10.a(false);
            long j2 = ((l0) rVar2.j(t2Var)).j();
            WeakHashMap weakHashMap = c2.f8518w;
            final mc.l lVar6 = lVar4;
            final mc.l lVar7 = lVar5;
            r3.b(l1.s.f(rVar2).f8530l, null, d4, v2.h.c(53066997, new k0(2, aVar), rVar2), null, null, v2.h.c(890052242, new s0(6, S), rVar2), 0, false, null, 0.0f, 0L, 0L, 0L, j2, 0L, v2.h.c(1830809564, new q() { // from class: ig.h
                @Override // mc.q
                public final Object i(Object obj2, Object obj3, Object obj4) {
                    boolean z11;
                    int i17;
                    d1 d1Var = (d1) obj2;
                    n2.m mVar2 = (n2.m) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    d1Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (((r) mVar2).f(d1Var)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        intValue |= i17;
                    }
                    if ((intValue & 19) != 18) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r rVar3 = (r) mVar2;
                    if (rVar3.O(intValue & 1, z11)) {
                        s2 s2Var = l10;
                        if (((List) s2Var.getValue()) == null) {
                            rVar3.X(-141920713);
                            m.g(l1.c.s(l1.c.D(b3.m.f1770a, new l5(29)), d1Var).f(r1.f8615c), rVar3, 0);
                            rVar3.p(false);
                        } else {
                            rVar3.X(-141737813);
                            e0 e0Var = r1.f8615c;
                            List list = (List) s2Var.getValue();
                            if (list == null) {
                                list = zb.q.A;
                            }
                            UUID uuid = (UUID) l11.getValue();
                            Object obj5 = lVar;
                            boolean h10 = rVar3.h(obj5);
                            Object obj6 = lVar6;
                            boolean f8 = h10 | rVar3.f(obj6);
                            Object L3 = rVar3.L();
                            Object obj7 = n2.l.f9953a;
                            if (f8 || L3 == obj7) {
                                L3 = new he.g(5, obj5, obj6);
                                rVar3.h0(L3);
                            }
                            mc.l lVar8 = (mc.l) L3;
                            mc.l lVar9 = lVar7;
                            boolean f10 = rVar3.f(lVar9);
                            Object L4 = rVar3.L();
                            if (f10 || L4 == obj7) {
                                L4 = new w(lVar9, 9);
                                rVar3.h0(L4);
                            }
                            mc.l lVar10 = (mc.l) L4;
                            boolean h11 = rVar3.h(obj5);
                            Object obj8 = uVar;
                            boolean h12 = h11 | rVar3.h(obj8);
                            Object obj9 = d4;
                            boolean f11 = h12 | rVar3.f(obj9);
                            Object obj10 = I;
                            Object obj11 = I2;
                            boolean f12 = f11 | rVar3.f(obj10) | rVar3.f(obj11);
                            Object L5 = rVar3.L();
                            if (f12 || L5 == obj7) {
                                Object aVar3 = new d2.a(obj5, obj8, obj9, obj10, obj11, 4);
                                rVar3.h0(aVar3);
                                L5 = aVar3;
                            }
                            m.d(e0Var, d1Var, list, uuid, y1.this, pVar, lVar8, lVar10, (mc.l) L5, rVar3, ((intValue << 3) & 112) | 6);
                            rVar3.p(false);
                        }
                    } else {
                        rVar3.R();
                    }
                    return y.f14813a;
                }
            }, rVar2), rVar2, 1575936, 100663296, 196530);
            rVar = rVar2;
            p7.m.c(l0.f.I(rVar, R.string.background_name), D, null, null, rVar, 0, 12);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new o3(lVar, y1Var, pVar, lVar2, lVar3, aVar, i2);
        }
    }

    public static final void f(oe.a aVar, y1 y1Var, p pVar, mc.a aVar2, n2.m mVar, int i2) {
        int i10;
        y1 y1Var2;
        boolean z10;
        r rVar;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        y1Var.getClass();
        pVar.getClass();
        aVar2.getClass();
        r rVar2 = (r) mVar;
        rVar2.Z(149535180);
        if ((i2 & 6) == 0) {
            if (rVar2.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            y1Var2 = y1Var;
            if (rVar2.f(y1Var2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        } else {
            y1Var2 = y1Var;
        }
        if ((i2 & 384) == 0) {
            if (rVar2.h(pVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i2 & 3072) == 0) {
            if (rVar2.h(aVar2)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i10 & 1, z10)) {
            Object L = rVar2.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = n2.s.w(Boolean.TRUE);
                rVar2.h0(L);
            }
            w0 w0Var = (w0) L;
            Context context = (Context) rVar2.j(r0.f1937b);
            s9.a a10 = s9.c.a(rVar2);
            boolean booleanValue = ((Boolean) w0Var.getValue()).booleanValue();
            a0.b bVar = a10.f12850b;
            if (booleanValue) {
                if (bVar != null) {
                    ((aj.g) bVar.B).q0(2);
                }
            } else if (bVar != null) {
                ((aj.g) bVar.B).H(2);
            }
            a10.a(true);
            boolean f8 = rVar2.f(a10);
            Object L2 = rVar2.L();
            if (f8 || L2 == eVar) {
                L2 = new a9.k(5, null, a10);
                rVar2.h0(L2);
            }
            n2.s.g(y.f14813a, (mc.p) L2, rVar2);
            boolean f10 = rVar2.f(a10);
            if ((i10 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z11 | f10;
            Object L3 = rVar2.L();
            if (z12 || L3 == eVar) {
                L3 = new k(a10, aVar2, 0);
                rVar2.h0(L3);
            }
            aj.g.a(false, (mc.a) L3, rVar2, 0, 1);
            rVar = rVar2;
            r3.a(null, null, null, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, s.f6681b, 0L, v2.h.c(1815374670, new l(y1Var2, aVar, pVar, context, w0Var, a10, aVar2, 0), rVar2), rVar, 0);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new y0(aVar, y1Var, pVar, aVar2, i2, 2);
        }
    }

    public static final void g(b3.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(351258571);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            f3.a(l1.s.f8618b.e(b3.m.f1770a, b3.c.X), ((l0) rVar.j(m0.f5257a)).i(), 0.0f, 0L, 0, rVar, 0, 28);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new x(pVar, i2, 3);
        }
    }

    public static final void h(boolean z10, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        mc.a aVar2;
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(-1700814396);
        if (rVar.g(z10)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i13 & 1, z11)) {
            String I = l0.f.I(rVar, R.string.none);
            n3.b z13 = k7.w.z(rVar, R.drawable.ic_block);
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new a3.g(14);
                rVar.h0(L);
            }
            mc.a aVar3 = (mc.a) L;
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = new a3.g(14);
                rVar.h0(L2);
            }
            z12 = z10;
            aVar2 = aVar;
            c(null, I, z13, z12, false, null, null, aVar2, aVar3, (mc.a) L2, rVar, ((i13 << 9) & 7168) | 907764230 | ((i13 << 18) & 29360128));
        } else {
            z12 = z10;
            aVar2 = aVar;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new c7.a(z12, aVar2, i2, 2);
        }
    }
}
