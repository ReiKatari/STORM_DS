package g2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class p4 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5340a = 10;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5341b = 24;

    /* renamed from: c  reason: collision with root package name */
    public static final float f5342c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final float f5343d = 6;

    /* renamed from: e  reason: collision with root package name */
    public static final float f5344e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final b3.p f5345f = l1.r1.e(l1.r1.m(b3.m.f1770a, 144, 0.0f, 2), 0.0f, 48, 1);

    /* renamed from: g  reason: collision with root package name */
    public static final d1.v1 f5346g = new d1.v1(100, (d1.v) null, 6);

    public static final void a(final mc.l lVar, final sc.a aVar, final sc.a aVar2, final n2.w0 w0Var, final float f8, n2.m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-743965752);
        if (rVar.h(lVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i2 | i10;
        if (rVar.f(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.f(aVar2)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar.c(f8)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i17 = i16 | i13;
        boolean z14 = false;
        if ((i17 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i17 & 1, z10)) {
            if ((i17 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i17 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z15 = z12 | z11;
            if ((57344 & i17) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z16 = z15 | z13;
            if ((i17 & 896) == 256) {
                z14 = true;
            }
            boolean z17 = z16 | z14;
            Object L = rVar.L();
            if (z17 || L == n2.l.f9953a) {
                mc.a aVar3 = new mc.a() { // from class: g2.c4
                    @Override // mc.a
                    public final Object b() {
                        sc.a aVar4 = sc.a.this;
                        float f10 = (aVar4.f12864b - aVar4.f12863a) / 1000;
                        float floatValue = ((Number) lVar.k(Float.valueOf(f8))).floatValue();
                        n2.w0 w0Var2 = w0Var;
                        if (Math.abs(floatValue - ((Number) w0Var2.getValue()).floatValue()) > f10) {
                            float floatValue2 = ((Number) ((Comparable) w0Var2.getValue())).floatValue();
                            sc.a aVar5 = aVar2;
                            if (floatValue2 >= aVar5.f12863a && floatValue2 <= aVar5.f12864b) {
                                w0Var2.setValue(Float.valueOf(floatValue));
                            }
                        }
                        return yb.y.f14813a;
                    }
                };
                rVar.h0(aVar3);
                L = aVar3;
            }
            n2.s.h((mc.a) L, rVar);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(aVar, aVar2, w0Var, f8, i2) { // from class: g2.d4
                public final /* synthetic */ sc.a B;
                public final /* synthetic */ sc.a L;
                public final /* synthetic */ n2.w0 R;
                public final /* synthetic */ float X;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(3073);
                    p4.a(mc.l.this, this.B, this.L, this.R, this.X, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void b(final float f8, final mc.l lVar, b3.p pVar, final boolean z10, final sc.a aVar, final mc.a aVar2, final b1 b1Var, n2.m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        b3.p pVar2;
        boolean z12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1962335196);
        if (rVar.c(f8)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i16 = i2 | i10;
        if (rVar.h(lVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i17 = i16 | i11;
        if (rVar.g(z10)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i18 = i17 | i12;
        if (rVar.f(aVar)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i19 = i18 | i13 | 196608;
        if (rVar.h(aVar2)) {
            i14 = 1048576;
        } else {
            i14 = 524288;
        }
        int i20 = i19 | i14 | 12582912;
        if (rVar.f(b1Var)) {
            i15 = 67108864;
        } else {
            i15 = 33554432;
        }
        int i21 = i20 | i15;
        if ((38347923 & i21) != 38347922) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i21 & 1, z11)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
            }
            rVar.q();
            rVar.X(-1127489737);
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new j1.i();
                rVar.h0(L);
            }
            final j1.i iVar = (j1.i) L;
            rVar.p(false);
            final n2.w0 A = n2.s.A(lVar, rVar);
            n2.w0 A2 = n2.s.A(aVar2, rVar);
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = zb.q.A;
                rVar.h0(L2);
            }
            final List list = (List) L2;
            n2.t2 t2Var = d2.f5111a;
            pVar2 = pVar;
            b3.p f10 = pVar2.f(j2.f5197a);
            float f11 = f5340a * 2;
            b3.p h2 = l1.r1.h(f10, f11, f11, 0.0f, 0.0f, 12);
            final float f12 = p7.j.f(f8, aVar.f12863a, aVar.f12864b);
            b3.p k10 = f1.n.k(i4.n.a(i4.n.a(h2, false, new mc.l() { // from class: g2.b4
                @Override // mc.l
                public final Object k(Object obj) {
                    i4.x xVar = (i4.x) obj;
                    yb.y yVar = yb.y.f14813a;
                    if (!z10) {
                        tc.c[] cVarArr = i4.v.f6808a;
                        xVar.a(i4.t.f6789i, yVar);
                    }
                    i1.g gVar = new i1.g(aVar, f12, lVar, aVar2);
                    tc.c[] cVarArr2 = i4.v.f6808a;
                    xVar.a(i4.l.f6748i, new i4.a(null, gVar));
                    return yVar;
                }
            }), true, new d1.o1(f8, aVar, 1)), z10, iVar);
            if (rVar.j(b4.q1.f1924n) == x4.m.Rtl) {
                z12 = true;
            } else {
                z12 = false;
            }
            l1.c.a(t3.c.d(k10, new m4(z10, aVar, A, f8, z12, A2)), null, v2.h.c(2085116814, new mc.q() { // from class: g2.z3
                /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, nc.q] */
                /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, nc.q] */
                @Override // mc.q
                public final Object i(Object obj, Object obj2, Object obj3) {
                    boolean z13;
                    final boolean z14;
                    float f13;
                    sc.a aVar3;
                    n2.b1 b1Var2;
                    nc.q qVar;
                    nc.q qVar2;
                    Object obj4;
                    nc.q qVar3;
                    float f14;
                    float f15;
                    float f16;
                    int i22;
                    sc.a aVar4 = sc.a.this;
                    float f17 = aVar4.f12864b;
                    float f18 = aVar4.f12863a;
                    l1.t tVar = (l1.t) obj;
                    n2.m mVar2 = (n2.m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        if (((n2.r) mVar2).f(tVar)) {
                            i22 = 4;
                        } else {
                            i22 = 2;
                        }
                        intValue |= i22;
                    }
                    if ((intValue & 19) != 18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    n2.r rVar2 = (n2.r) mVar2;
                    if (rVar2.O(intValue & 1, z13)) {
                        if (rVar2.j(b4.q1.f1924n) == x4.m.Rtl) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        final float h10 = x4.a.h(tVar.f8628b);
                        ?? obj5 = new Object();
                        ?? obj6 = new Object();
                        x4.c cVar = (x4.c) rVar2.j(b4.q1.f1919h);
                        float f19 = p4.f5340a;
                        obj5.A = Math.max(h10 - cVar.v(f19), 0.0f);
                        obj6.A = Math.min(cVar.v(f19), obj5.A);
                        Object L3 = rVar2.L();
                        Object obj7 = n2.l.f9953a;
                        if (L3 == obj7) {
                            L3 = n2.s.o(rVar2);
                            rVar2.h0(L3);
                        }
                        Object obj8 = (zc.u) L3;
                        Object L4 = rVar2.L();
                        float f20 = f8;
                        if (L4 == obj7) {
                            float f21 = obj6.A;
                            float f22 = obj5.A;
                            float f23 = f17 - f18;
                            if (f23 == 0.0f) {
                                f16 = 0.0f;
                            } else {
                                f16 = (f20 - f18) / f23;
                            }
                            if (f16 < 0.0f) {
                                f16 = 0.0f;
                            }
                            if (f16 > 1.0f) {
                                f16 = 1.0f;
                            }
                            Object b1Var3 = new n2.b1(p7.l.w(f21, f22, f16));
                            rVar2.h0(b1Var3);
                            L4 = b1Var3;
                        }
                        final n2.b1 b1Var4 = (n2.b1) L4;
                        Object L5 = rVar2.L();
                        if (L5 == obj7) {
                            L5 = new n2.b1(0.0f);
                            rVar2.h0(L5);
                        }
                        n2.b1 b1Var5 = (n2.b1) L5;
                        boolean c4 = rVar2.c(obj6.A) | rVar2.c(obj5.A) | rVar2.f(aVar4);
                        Object L6 = rVar2.L();
                        if (!c4 && L6 != obj7) {
                            aVar3 = aVar4;
                            f13 = f20;
                            qVar2 = obj6;
                            qVar = obj5;
                            b1Var2 = b1Var5;
                        } else {
                            f13 = f20;
                            aVar3 = aVar4;
                            b1Var2 = b1Var5;
                            qVar = obj5;
                            qVar2 = obj6;
                            Object x3Var = new x3(new h0(b1Var4, b1Var5, obj6, obj5, A, aVar3, 1));
                            rVar2.h0(x3Var);
                            L6 = x3Var;
                        }
                        final x3 x3Var2 = (x3) L6;
                        boolean f24 = rVar2.f(aVar3) | rVar2.c(qVar2.A) | rVar2.c(qVar.A);
                        Object L7 = rVar2.L();
                        if (f24 || L7 == obj7) {
                            L7 = new i4(aVar3, qVar2, qVar);
                            rVar2.h0(L7);
                        }
                        nc.q qVar4 = qVar2;
                        float f25 = f13;
                        p4.a((mc.l) ((nc.i) L7), aVar3, new sc.a(qVar2.A, qVar.A), b1Var4, f25, rVar2, 3072);
                        Object obj9 = list;
                        boolean h11 = rVar2.h(obj9) | rVar2.c(qVar4.A) | rVar2.c(qVar.A) | rVar2.h(obj8) | rVar2.h(x3Var2);
                        Object obj10 = aVar2;
                        boolean f26 = h11 | rVar2.f(obj10);
                        Object L8 = rVar2.L();
                        if (!f26 && L8 != obj7) {
                            obj4 = obj9;
                            qVar3 = qVar4;
                        } else {
                            L8 = new b7.u(b1Var4, obj9, qVar4, qVar, obj8, x3Var2, obj10, 1);
                            obj4 = obj9;
                            qVar3 = qVar4;
                            rVar2.h0(L8);
                        }
                        final n2.w0 A3 = n2.s.A((mc.l) L8, rVar2);
                        final boolean z15 = z10;
                        final j1.i iVar2 = iVar;
                        final n2.b1 b1Var6 = b1Var2;
                        b3.k kVar = new b3.k(new mc.q() { // from class: g2.e4
                            @Override // mc.q
                            public final Object i(Object obj11, Object obj12, Object obj13) {
                                b3.p pVar3 = (b3.p) obj11;
                                ((Integer) obj13).getClass();
                                n2.r rVar3 = (n2.r) ((n2.m) obj12);
                                rVar3.X(1945228890);
                                if (z15) {
                                    rVar3.X(-1679801122);
                                    Object L9 = rVar3.L();
                                    Object obj14 = n2.l.f9953a;
                                    if (L9 == obj14) {
                                        L9 = n2.s.o(rVar3);
                                        rVar3.h0(L9);
                                    }
                                    zc.u uVar = (zc.u) L9;
                                    float f27 = h10;
                                    Float valueOf = Float.valueOf(f27);
                                    boolean z16 = z14;
                                    Boolean valueOf2 = Boolean.valueOf(z16);
                                    h1.p0 p0Var = x3Var2;
                                    Object[] objArr = {p0Var, iVar2, valueOf, valueOf2};
                                    n2.w0 w0Var = b1Var6;
                                    n2.s2 s2Var = b1Var4;
                                    n2.w0 w0Var2 = A3;
                                    boolean g10 = rVar3.g(z16) | rVar3.c(f27) | rVar3.f(w0Var) | rVar3.f(s2Var) | rVar3.h(uVar) | rVar3.h(p0Var) | rVar3.f(w0Var2);
                                    Object L10 = rVar3.L();
                                    if (g10 || L10 == obj14) {
                                        L10 = new o4(z16, f27, w0Var, s2Var, uVar, p0Var, w0Var2);
                                        rVar3.h0(L10);
                                    }
                                    v3.k kVar2 = v3.c0.f13637a;
                                    pVar3 = pVar3.f(new v3.b0(null, null, objArr, (PointerInputEventHandler) L10, 3));
                                    rVar3.p(false);
                                } else {
                                    rVar3.X(-1678708124);
                                    rVar3.p(false);
                                }
                                rVar3.p(false);
                                return pVar3;
                            }
                        });
                        h1.n1 n1Var = h1.n1.Horizontal;
                        boolean booleanValue = ((Boolean) x3Var2.B.getValue()).booleanValue();
                        boolean f27 = rVar2.f(A3);
                        Object L9 = rVar2.L();
                        if (f27 || L9 == obj7) {
                            L9 = new j4(A3, null);
                            rVar2.h0(L9);
                        }
                        b3.p a10 = h1.n0.a(b3.m.f1770a, x3Var2, n1Var, z15, iVar2, booleanValue, (mc.q) L9, z14);
                        float f28 = p7.j.f(f25, f18, f17);
                        float f29 = f17 - f18;
                        if (f29 == 0.0f) {
                            f14 = 0.0f;
                        } else {
                            f14 = (f28 - f18) / f29;
                        }
                        if (f14 < 0.0f) {
                            f14 = 0.0f;
                        }
                        if (f14 > 1.0f) {
                            f15 = 1.0f;
                        } else {
                            f15 = f14;
                        }
                        List list2 = obj4;
                        p4.c(z15, f15, list2, b1Var, qVar.A - qVar3.A, iVar2, kVar.f(a10), rVar2, 0);
                    } else {
                        rVar2.R();
                    }
                    return yb.y.f14813a;
                }
            }, rVar), rVar, 3072);
        } else {
            pVar2 = pVar;
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            final b3.p pVar3 = pVar2;
            r5.f9983d = new mc.p(f8, lVar, pVar3, z10, aVar, aVar2, b1Var, i2) { // from class: g2.a4
                public final /* synthetic */ float A;
                public final /* synthetic */ mc.l B;
                public final /* synthetic */ b3.p L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ sc.a X;
                public final /* synthetic */ mc.a Y;
                public final /* synthetic */ b1 Z;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(385);
                    p4.b(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void c(final boolean z10, final float f8, final List list, final b1 b1Var, final float f10, final j1.i iVar, final b3.p pVar, n2.m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1679682785);
        if (rVar.g(z10)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i17 = i2 | i10;
        if (rVar.c(f8)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i18 = i17 | i11;
        if (rVar.h(list)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i19 = i18 | i12;
        if (rVar.f(b1Var)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i20 = i19 | i13;
        if (rVar.c(f10)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i21 = i20 | i14;
        if (rVar.f(iVar)) {
            i15 = 131072;
        } else {
            i15 = 65536;
        }
        int i22 = i21 | i15;
        if (rVar.f(pVar)) {
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
            b3.p f11 = pVar.f(f5345f);
            y3.v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(f11, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            a4.f fVar = a4.g.f216f;
            if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode))) {
                w.d.w(hashCode, rVar, hashCode, fVar);
            }
            n2.s.C(c4, a4.g.f213c, rVar);
            x4.c cVar = (x4.c) rVar.j(b4.q1.f1919h);
            float v10 = cVar.v(f5344e);
            float f12 = f5340a;
            float v11 = cVar.v(f12);
            float f13 = f12 * 2;
            float x02 = cVar.x0(f10) * f8;
            int i24 = i23 >> 6;
            int i25 = i23 << 9;
            e(l1.r1.f8615c, b1Var, z10, f8, list, v11, v10, rVar, (i25 & 458752) | (i24 & 112) | 3078 | ((i23 << 6) & 896) | (i25 & 57344));
            d(x02, iVar, b1Var, z10, f13, rVar, (i24 & 7168) | 1572918 | ((i23 << 3) & 57344) | ((i23 << 15) & 458752));
            rVar.p(true);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(z10, f8, list, b1Var, f10, iVar, pVar, i2) { // from class: g2.f4
                public final /* synthetic */ boolean A;
                public final /* synthetic */ float B;
                public final /* synthetic */ List L;
                public final /* synthetic */ b1 R;
                public final /* synthetic */ float X;
                public final /* synthetic */ j1.i Y;
                public final /* synthetic */ b3.p Z;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(1);
                    p4.c(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void d(final float f8, final j1.i iVar, final b1 b1Var, final boolean z10, final float f10, n2.m mVar, final int i2) {
        int i10;
        boolean z11;
        boolean z12;
        float f11;
        long j2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(428907178);
        int i18 = i2 & 6;
        l1.s sVar = l1.s.f8618b;
        if (i18 == 0) {
            if (rVar.f(sVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i2;
        } else {
            i10 = i2;
        }
        int i19 = i2 & 48;
        b3.m mVar2 = b3.m.f1770a;
        if (i19 == 0) {
            if (rVar.f(mVar2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i2 & 384) == 0) {
            if (rVar.c(f8)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.f(iVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i2 & 24576) == 0) {
            if (rVar.f(b1Var)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i10 |= i13;
        }
        if ((196608 & i2) == 0) {
            if (rVar.g(z10)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        }
        if ((1572864 & i2) == 0) {
            if (rVar.c(f10)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i10 |= i11;
        }
        if ((599187 & i10) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i10 & 1, z11)) {
            b3.p e6 = sVar.e(l1.c.x(mVar2, f8, 0.0f, 0.0f, 0.0f, 14), b3.c.R);
            y3.v0 d4 = l1.p.d(b3.c.A, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(e6, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            a4.f fVar = a4.g.f216f;
            if (rVar.S || !nc.k.a(rVar.L(), Integer.valueOf(hashCode))) {
                w.d.w(hashCode, rVar, hashCode, fVar);
            }
            n2.s.C(c4, a4.g.f213c, rVar);
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new z2.p();
                rVar.h0(L);
            }
            z2.p pVar = (z2.p) L;
            if ((i10 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object L2 = rVar.L();
            if (z12 || L2 == eVar) {
                L2 = new t0(iVar, pVar, null, 1);
                rVar.h0(L2);
            }
            n2.s.g(iVar, (mc.p) L2, rVar);
            if (!pVar.isEmpty()) {
                f11 = f5343d;
            } else {
                f11 = f5342c;
            }
            b3.p m = f1.n.m(f1.x0.a(l1.r1.j(mVar2, f10, f10), iVar, j3.a(f5341b, 4, 0L, false)), iVar);
            if (!z10) {
                f11 = 0;
            }
            float f12 = f11;
            t1.d dVar = t1.e.f13079a;
            b3.p h2 = f3.g.h(m, f12, dVar, 0L, 24);
            rVar.X(-1733795637);
            if (z10) {
                j2 = b1Var.f5050a;
            } else {
                j2 = b1Var.f5051b;
            }
            n2.w0 A = n2.s.A(new i3.s(j2), rVar);
            rVar.p(false);
            l1.c.d(f1.n.f(h2, ((i3.s) A.getValue()).f6689a, dVar), rVar);
            rVar.p(true);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.g4
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p4.d(f8, iVar, b1Var, z10, f10, (n2.m) obj, n2.s.F(i2 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void e(final b3.p pVar, final b1 b1Var, final boolean z10, final float f8, final List list, final float f10, final float f11, n2.m mVar, final int i2) {
        int i10;
        final float f12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1833126050);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(b1Var)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i10 |= i17;
        }
        if ((i2 & 384) == 0) {
            if (rVar.g(z10)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i10 |= i16;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.c(0.0f)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i10 |= i15;
        }
        if ((i2 & 24576) == 0) {
            if (rVar.c(f8)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i10 |= i14;
        }
        if ((196608 & i2) == 0) {
            if (rVar.h(list)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i10 |= i13;
        }
        if ((1572864 & i2) == 0) {
            f12 = f10;
            if (rVar.c(f12)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i10 |= i12;
        } else {
            f12 = f10;
        }
        if ((12582912 & i2) == 0) {
            if (rVar.c(f11)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i10 |= i11;
        }
        int i19 = i10;
        if ((4793491 & i19) != 4793490) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i19 & 1, z11)) {
            final n2.w0 b10 = b1Var.b(z10, false, rVar);
            final n2.w0 b11 = b1Var.b(z10, true, rVar);
            final n2.w0 a10 = b1Var.a(z10, false, rVar);
            final n2.w0 a11 = b1Var.a(z10, true, rVar);
            if ((i19 & 3670016) == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean f13 = z12 | rVar.f(b10);
            if ((29360128 & i19) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z16 = f13 | z13;
            if ((57344 & i19) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z17 = z16 | z14;
            if ((i19 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean f14 = z17 | z15 | rVar.f(b11) | rVar.h(list) | rVar.f(a10) | rVar.f(a11);
            Object L = rVar.L();
            if (f14 || L == n2.l.f9953a) {
                mc.l lVar = new mc.l() { // from class: g2.h4
                    @Override // mc.l
                    public final Object k(Object obj) {
                        boolean z18;
                        float f15;
                        long j2;
                        long j10;
                        int i20;
                        n2.w0 w0Var;
                        boolean z19;
                        k3.d dVar = (k3.d) obj;
                        if (dVar.getLayoutDirection() == x4.m.Rtl) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.S() & 4294967295L));
                        long floatToRawIntBits = (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.c() >> 32)) - f12;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar.S() & 4294967295L));
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                        if (z18) {
                            j10 = floatToRawIntBits;
                            j2 = floatToRawIntBits2;
                        } else {
                            j2 = floatToRawIntBits;
                            j10 = j2;
                        }
                        if (!z18) {
                            j10 = floatToRawIntBits2;
                        }
                        long j11 = ((i3.s) b10.getValue()).f6689a;
                        float f16 = f11;
                        k3.d.p(dVar, j11, j2, j10, f16, 1, 480);
                        int i21 = (int) (j2 >> 32);
                        float f17 = f8;
                        float intBitsToFloat4 = ((Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat(i21)) * f17) + Float.intBitsToFloat(i21);
                        long j12 = j2;
                        long j13 = j10;
                        k3.d.p(dVar, ((i3.s) b11.getValue()).f6689a, (Float.floatToRawIntBits(((Float.intBitsToFloat(i20) - Float.intBitsToFloat(i21)) * 0.0f) + Float.intBitsToFloat(i21)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.S() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.S() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat4) << 32), f16, 1, 480);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list) {
                            float floatValue = ((Number) obj2).floatValue();
                            if (floatValue <= f17 && floatValue >= 0.0f) {
                                z19 = false;
                            } else {
                                z19 = true;
                            }
                            Boolean valueOf = Boolean.valueOf(z19);
                            Object obj3 = linkedHashMap.get(valueOf);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap.put(valueOf, obj3);
                            }
                            ((List) obj3).add(obj2);
                        }
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list2 = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList(list2.size());
                            int size = list2.size();
                            int i22 = 0;
                            while (i22 < size) {
                                float intBitsToFloat5 = Float.intBitsToFloat((int) (l0.f.v(((Number) list2.get(i22)).floatValue(), j12, j13) >> 32));
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (dVar.S() & 4294967295L));
                                arrayList.add(new h3.b((Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L)));
                                i22++;
                                it = it;
                                list2 = list2;
                            }
                            Iterator it2 = it;
                            if (booleanValue) {
                                w0Var = a10;
                            } else {
                                w0Var = a11;
                            }
                            dVar.L(arrayList, ((i3.s) w0Var.getValue()).f6689a, f16);
                            it = it2;
                        }
                        return yb.y.f14813a;
                    }
                };
                rVar.h0(lVar);
                L = lVar;
            }
            f1.n.a(pVar, (mc.l) L, rVar, i19 & 14);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.y3
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p4.e(b3.p.this, b1Var, z10, f8, list, f10, f11, (n2.m) obj, n2.s.F(i2 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }
}
