package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q6 implements mc.t {
    public final /* synthetic */ mc.p A;
    public final /* synthetic */ d1 B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ j1.i X;
    public final /* synthetic */ i3.n0 Y;
    public final /* synthetic */ b7 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ mc.p f5371b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ boolean f5372c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ l1.d1 f5373d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ boolean f5374e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ v2.c f5375f0;

    public q6(mc.p pVar, String str, d1 d1Var, boolean z10, boolean z11, j1.i iVar, i3.n0 n0Var, b7 b7Var, mc.p pVar2, boolean z12, l1.d1 d1Var2, boolean z13, v2.c cVar) {
        this.A = pVar;
        this.B = d1Var;
        this.L = z10;
        this.R = z11;
        this.X = iVar;
        this.Y = n0Var;
        this.Z = b7Var;
        this.f5371b0 = pVar2;
        this.f5372c0 = z12;
        this.f5373d0 = d1Var2;
        this.f5374e0 = z13;
        this.f5375f0 = cVar;
    }

    @Override // mc.t
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i2;
        boolean z10;
        v2.c cVar;
        long j2;
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        final float floatValue = ((Number) obj).floatValue();
        final long j11 = ((i3.s) obj2).f6689a;
        final long j12 = ((i3.s) obj3).f6689a;
        float floatValue2 = ((Number) obj4).floatValue();
        n2.m mVar = (n2.m) obj5;
        int intValue = ((Number) obj6).intValue();
        if ((intValue & 6) == 0) {
            if (((n2.r) mVar).c(floatValue)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i2 = i13 | intValue;
        } else {
            i2 = intValue;
        }
        if ((intValue & 48) == 0) {
            if (((n2.r) mVar).e(j11)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i2 |= i12;
        }
        if ((intValue & 384) == 0) {
            if (((n2.r) mVar).e(j12)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i2 |= i11;
        }
        if ((intValue & 3072) == 0) {
            if (((n2.r) mVar).c(floatValue2)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i2 |= i10;
        }
        int i14 = i2;
        boolean z11 = true;
        if ((i14 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        n2.r rVar = (n2.r) mVar;
        if (rVar.O(i14 & 1, z10)) {
            final mc.p pVar = this.A;
            if (pVar == null) {
                rVar.X(986681709);
                rVar.p(false);
                cVar = null;
            } else {
                rVar.X(986681710);
                final boolean z12 = this.f5374e0;
                mc.p pVar2 = new mc.p() { // from class: g2.o6
                    @Override // mc.p
                    public final Object j(Object obj7, Object obj8) {
                        boolean z13;
                        float f8;
                        l4.z zVar;
                        l4.y yVar;
                        l4.y yVar2;
                        n2.m mVar2 = (n2.m) obj7;
                        int intValue2 = ((Integer) obj8).intValue();
                        if ((intValue2 & 3) != 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        n2.r rVar2 = (n2.r) mVar2;
                        if (rVar2.O(intValue2 & 1, z13)) {
                            n2.t2 t2Var = g7.f5161b;
                            l4.r0 r0Var = ((f7) rVar2.j(t2Var)).f5148g;
                            l4.r0 r0Var2 = ((f7) rVar2.j(t2Var)).f5153l;
                            l4.j0 j0Var = r0Var.f8887a;
                            l4.j0 j0Var2 = r0Var2.f8887a;
                            w4.o oVar = l4.k0.f8845d;
                            w4.o oVar2 = j0Var.f8827a;
                            w4.o oVar3 = j0Var2.f8827a;
                            boolean z14 = oVar2 instanceof w4.b;
                            w4.o oVar4 = w4.n.f14148a;
                            float f10 = floatValue;
                            if (!z14 && !(oVar3 instanceof w4.b)) {
                                long q10 = i3.z.q(f10, oVar2.b(), oVar3.b());
                                if (q10 != 16) {
                                    oVar4 = new w4.c(q10);
                                }
                            } else if (z14 && (oVar3 instanceof w4.b)) {
                                w4.b bVar = (w4.b) oVar2;
                                w4.b bVar2 = (w4.b) oVar3;
                                i3.o oVar5 = (i3.o) l4.k0.b(bVar.f14126a, bVar2.f14126a, f10);
                                float w10 = p7.l.w(bVar.f14127b, bVar2.f14127b, f10);
                                if (oVar5 != null) {
                                    if (oVar5 instanceof i3.p0) {
                                        long z15 = p7.t.z(((i3.p0) oVar5).f6676a, w10);
                                        if (z15 != 16) {
                                            oVar4 = new w4.c(z15);
                                        }
                                    } else if (oVar5 instanceof i3.l0) {
                                        oVar4 = new w4.b((i3.l0) oVar5, w10);
                                    } else {
                                        m9.o.o();
                                        return null;
                                    }
                                }
                            } else {
                                oVar4 = (w4.o) l4.k0.b(oVar2, oVar3, f10);
                            }
                            w4.o oVar6 = oVar4;
                            p4.p pVar3 = (p4.p) l4.k0.b(j0Var.f8832f, j0Var2.f8832f, f10);
                            long c4 = l4.k0.c(f10, j0Var.f8828b, j0Var2.f8828b);
                            p4.j jVar = j0Var.f8829c;
                            if (jVar == null) {
                                jVar = p4.j.R;
                            }
                            p4.j jVar2 = j0Var2.f8829c;
                            if (jVar2 == null) {
                                jVar2 = p4.j.R;
                            }
                            p4.j jVar3 = new p4.j(p7.j.g(p7.l.x(f10, jVar.A, jVar2.A), 1, 1000));
                            p4.h hVar = (p4.h) l4.k0.b(j0Var.f8830d, j0Var2.f8830d, f10);
                            p4.i iVar = (p4.i) l4.k0.b(j0Var.f8831e, j0Var2.f8831e, f10);
                            String str = (String) l4.k0.b(j0Var.f8833g, j0Var2.f8833g, f10);
                            long c10 = l4.k0.c(f10, j0Var.f8834h, j0Var2.f8834h);
                            w4.a aVar = j0Var.f8835i;
                            float f11 = 0.0f;
                            if (aVar != null) {
                                f8 = aVar.f14125a;
                            } else {
                                f8 = 0.0f;
                            }
                            w4.a aVar2 = j0Var2.f8835i;
                            if (aVar2 != null) {
                                f11 = aVar2.f14125a;
                            }
                            float w11 = p7.l.w(f8, f11, f10);
                            w4.p pVar4 = j0Var.f8836j;
                            w4.p pVar5 = w4.p.f14149c;
                            if (pVar4 == null) {
                                pVar4 = pVar5;
                            }
                            w4.p pVar6 = j0Var2.f8836j;
                            if (pVar6 != null) {
                                pVar5 = pVar6;
                            }
                            w4.p pVar7 = new w4.p(p7.l.w(pVar4.f14150a, pVar5.f14150a, f10), p7.l.w(pVar4.f14151b, pVar5.f14151b, f10));
                            s4.b bVar3 = (s4.b) l4.k0.b(j0Var.f8837k, j0Var2.f8837k, f10);
                            long q11 = i3.z.q(f10, j0Var.f8838l, j0Var2.f8838l);
                            w4.l lVar = (w4.l) l4.k0.b(j0Var.m, j0Var2.m, f10);
                            i3.m0 m0Var = j0Var.f8839n;
                            if (m0Var == null) {
                                m0Var = new i3.m0();
                            }
                            i3.m0 m0Var2 = j0Var2.f8839n;
                            if (m0Var2 == null) {
                                m0Var2 = new i3.m0();
                            }
                            i3.m0 m0Var3 = new i3.m0(p7.l.w(m0Var.f6662c, m0Var2.f6662c, f10), i3.z.q(f10, m0Var.f6660a, m0Var2.f6660a), l0.f.v(f10, m0Var.f6661b, m0Var2.f6661b));
                            l4.z zVar2 = j0Var.f8840o;
                            l4.z zVar3 = j0Var2.f8840o;
                            if (zVar2 == null && zVar3 == null) {
                                zVar = null;
                            } else {
                                if (zVar2 == null) {
                                    zVar2 = l4.z.f8919a;
                                }
                                zVar = zVar2;
                            }
                            l4.j0 j0Var3 = new l4.j0(oVar6, c4, jVar3, hVar, iVar, pVar3, str, c10, new w4.a(w11), pVar7, bVar3, q11, lVar, m0Var3, zVar, (k3.e) l4.k0.b(j0Var.f8841p, j0Var2.f8841p, f10));
                            l4.v vVar = r0Var.f8888b;
                            l4.v vVar2 = r0Var2.f8888b;
                            int i15 = l4.w.f8913b;
                            int i16 = ((w4.k) l4.k0.b(new w4.k(vVar.f8903a), new w4.k(vVar2.f8903a), f10)).f14142a;
                            int i17 = ((w4.m) l4.k0.b(new w4.m(vVar.f8904b), new w4.m(vVar2.f8904b), f10)).f14147a;
                            long c11 = l4.k0.c(f10, vVar.f8905c, vVar2.f8905c);
                            w4.q qVar = vVar.f8906d;
                            if (qVar == null) {
                                qVar = w4.q.f14152c;
                            }
                            w4.q qVar2 = vVar2.f8906d;
                            if (qVar2 == null) {
                                qVar2 = w4.q.f14152c;
                            }
                            w4.q qVar3 = new w4.q(l4.k0.c(f10, qVar.f14153a, qVar2.f14153a), l4.k0.c(f10, qVar.f14154b, qVar2.f14154b));
                            l4.y yVar3 = vVar.f8907e;
                            l4.y yVar4 = vVar2.f8907e;
                            if (yVar3 == null && yVar4 == null) {
                                yVar2 = null;
                            } else {
                                l4.y yVar5 = l4.y.f8916c;
                                if (yVar3 == null) {
                                    yVar = yVar5;
                                } else {
                                    yVar = yVar3;
                                }
                                boolean z16 = yVar.f8917a;
                                if (yVar4 == null) {
                                    yVar4 = yVar5;
                                }
                                boolean z17 = yVar4.f8917a;
                                if (z16 == z17) {
                                    yVar2 = yVar;
                                } else {
                                    yVar2 = new l4.y(((l4.m) l4.k0.b(new l4.m(yVar.f8918b), new l4.m(yVar4.f8918b), f10)).f8848a, ((Boolean) l4.k0.b(Boolean.valueOf(z16), Boolean.valueOf(z17), f10)).booleanValue());
                                }
                            }
                            l4.r0 r0Var3 = new l4.r0(j0Var3, new l4.v(i16, i17, c11, qVar3, yVar2, (w4.i) l4.k0.b(vVar.f8908f, vVar2.f8908f, f10), ((w4.e) l4.k0.b(new w4.e(vVar.f8909g), new w4.e(vVar2.f8909g), f10)).f14131a, ((w4.d) l4.k0.b(new w4.d(vVar.f8910h), new w4.d(vVar2.f8910h), f10)).f14129a, (w4.s) l4.k0.b(vVar.f8911i, vVar2.f8911i, f10)));
                            if (z12) {
                                r0Var3 = l4.r0.a(r0Var3, j11, 0L, null, null, 0L, 0L, null, 16777214);
                            }
                            s6.b(j12, r0Var3, pVar, rVar2, 384, 0);
                        } else {
                            rVar2.R();
                        }
                        return yb.y.f14813a;
                    }
                };
                floatValue = floatValue;
                v2.c c4 = v2.h.c(723429411, pVar2, rVar);
                rVar.p(false);
                cVar = c4;
            }
            rVar.X(988093542);
            rVar.p(false);
            d1 d1Var = this.B;
            d1Var.getClass();
            rVar.X(-1036335134);
            rVar.X(-776179197);
            boolean z13 = this.R;
            boolean z14 = this.L;
            if (!z14) {
                j2 = d1Var.f5099j;
            } else if (z13) {
                j2 = d1Var.f5100k;
            } else {
                j2 = d1Var.f5098i;
            }
            n2.w0 v10 = w.d.v(j2, rVar, false);
            rVar.p(false);
            long j13 = ((i3.s) v10.getValue()).f6689a;
            rVar.X(988282301);
            rVar.p(false);
            rVar.X(79259602);
            n2.w0 m = a.a.m(this.X, rVar, 0);
            if (!z14) {
                j10 = d1Var.f5102n;
            } else if (z13) {
                j10 = d1Var.f5103o;
            } else if (((Boolean) m.getValue()).booleanValue()) {
                j10 = d1Var.m;
            } else {
                j10 = d1Var.f5101l;
            }
            long j14 = ((i3.s) w.d.v(j10, rVar, false).getValue()).f6689a;
            rVar.X(988575964);
            rVar.p(false);
            rVar.X(-28962788);
            b3.p f8 = f1.n.f(b3.m.f1770a, ((i3.s) w.d.v(d1Var.f5104p, rVar, false).getValue()).f6689a, this.Y);
            int i15 = p6.f5359a[this.Z.ordinal()];
            if (i15 != 1) {
                if (i15 == 2) {
                    rVar.X(989436742);
                    Object L = rVar.L();
                    n2.e eVar = n2.l.f9953a;
                    if (L == eVar) {
                        L = n2.s.w(new h3.e(0L));
                        rVar.h0(L);
                    }
                    n2.w0 w0Var = (n2.w0) L;
                    v2.c c10 = v2.h.c(-1107746014, new ai.m0(w0Var, this.f5373d0, this.f5375f0, 5), rVar);
                    if ((i14 & 14) != 4) {
                        z11 = false;
                    }
                    Object L2 = rVar.L();
                    if (z11 || L2 == eVar) {
                        L2 = new d1.o1(floatValue, w0Var, 2);
                        rVar.h0(L2);
                    }
                    v2.c(f8, this.f5371b0, null, cVar, null, null, this.f5372c0, floatValue, (mc.l) L2, c10, this.f5373d0, rVar, ((i14 << 21) & 29360128) | 805306368);
                    rVar.p(false);
                } else {
                    throw w.d.i(rVar, 1971561250, false);
                }
            } else {
                rVar.X(988856360);
                u6.a(f8, this.f5371b0, cVar, null, null, null, this.f5372c0, floatValue, this.f5373d0, rVar, (i14 << 21) & 29360128);
                rVar.p(false);
            }
        } else {
            rVar.R();
        }
        return yb.y.f14813a;
    }
}
