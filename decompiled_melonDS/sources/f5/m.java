package f5;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends t {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4877k = new int[2];

    public static void m(int[] iArr, int i2, int i10, int i11, int i12, float f8, int i13) {
        int i14 = i10 - i2;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    iArr[0] = i14;
                    iArr[1] = (int) ((i14 * f8) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i15 * f8) + 0.5f);
            iArr[1] = i15;
            return;
        }
        int i16 = (int) ((i15 * f8) + 0.5f);
        int i17 = (int) ((i14 / f8) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x023f, code lost:
        if (r15 != 1) goto L127;
     */
    @Override // f5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(f5.d r23) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.m.a(f5.d):void");
    }

    @Override // f5.t
    public final void d() {
        e5.g gVar;
        e5.g gVar2;
        e5.f fVar;
        e5.g gVar3;
        e5.g gVar4;
        e5.f fVar2;
        e5.g gVar5 = this.f4891b;
        boolean z10 = gVar5.f4288a;
        h hVar = this.f4894e;
        if (z10) {
            hVar.d(gVar5.r());
        }
        boolean z11 = hVar.f4872j;
        ArrayList arrayList = hVar.f4873k;
        ArrayList arrayList2 = hVar.f4874l;
        g gVar6 = this.f4898i;
        g gVar7 = this.f4897h;
        if (!z11) {
            e5.g gVar8 = this.f4891b;
            e5.f fVar3 = gVar8.T[0];
            this.f4893d = fVar3;
            if (fVar3 != e5.f.MATCH_CONSTRAINT) {
                e5.f fVar4 = e5.f.MATCH_PARENT;
                if (fVar3 == fVar4 && (gVar4 = gVar8.U) != null && ((fVar2 = gVar4.T[0]) == e5.f.FIXED || fVar2 == fVar4)) {
                    int r5 = (gVar4.r() - this.f4891b.I.e()) - this.f4891b.K.e();
                    t.b(gVar7, gVar4.f4294d.f4897h, this.f4891b.I.e());
                    t.b(gVar6, gVar4.f4294d.f4898i, -this.f4891b.K.e());
                    hVar.d(r5);
                    return;
                } else if (fVar3 == e5.f.FIXED) {
                    hVar.d(gVar8.r());
                }
            }
        } else {
            e5.f fVar5 = this.f4893d;
            e5.f fVar6 = e5.f.MATCH_PARENT;
            if (fVar5 == fVar6 && (gVar2 = (gVar = this.f4891b).U) != null && ((fVar = gVar2.T[0]) == e5.f.FIXED || fVar == fVar6)) {
                t.b(gVar7, gVar2.f4294d.f4897h, gVar.I.e());
                t.b(gVar6, gVar2.f4294d.f4898i, -this.f4891b.K.e());
                return;
            }
        }
        if (hVar.f4872j) {
            e5.g gVar9 = this.f4891b;
            if (gVar9.f4288a) {
                e5.d[] dVarArr = gVar9.Q;
                e5.d dVar = dVarArr[0];
                e5.d dVar2 = dVar.f4283f;
                if (dVar2 != null && dVarArr[1].f4283f != null) {
                    boolean y10 = gVar9.y();
                    e5.g gVar10 = this.f4891b;
                    if (y10) {
                        gVar7.f4868f = gVar10.Q[0].e();
                        gVar6.f4868f = -this.f4891b.Q[1].e();
                        return;
                    }
                    g h2 = t.h(gVar10.Q[0]);
                    if (h2 != null) {
                        t.b(gVar7, h2, this.f4891b.Q[0].e());
                    }
                    g h10 = t.h(this.f4891b.Q[1]);
                    if (h10 != null) {
                        t.b(gVar6, h10, -this.f4891b.Q[1].e());
                    }
                    gVar7.f4864b = true;
                    gVar6.f4864b = true;
                    return;
                } else if (dVar2 != null) {
                    g h11 = t.h(dVar);
                    if (h11 != null) {
                        t.b(gVar7, h11, this.f4891b.Q[0].e());
                        t.b(gVar6, gVar7, hVar.f4869g);
                        return;
                    }
                    return;
                } else {
                    e5.d dVar3 = dVarArr[1];
                    if (dVar3.f4283f != null) {
                        g h12 = t.h(dVar3);
                        if (h12 != null) {
                            t.b(gVar6, h12, -this.f4891b.Q[1].e());
                            t.b(gVar7, gVar6, -hVar.f4869g);
                            return;
                        }
                        return;
                    } else if (!(gVar9 instanceof e5.m) && gVar9.U != null && gVar9.j(e5.c.CENTER).f4283f == null) {
                        e5.g gVar11 = this.f4891b;
                        t.b(gVar7, gVar11.U.f4294d.f4897h, gVar11.s());
                        t.b(gVar6, gVar7, hVar.f4869g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.f4893d == e5.f.MATCH_CONSTRAINT) {
            e5.g gVar12 = this.f4891b;
            int i2 = gVar12.f4320r;
            if (i2 != 2) {
                if (i2 == 3) {
                    if (gVar12.f4322s == 3) {
                        gVar7.f4863a = this;
                        gVar6.f4863a = this;
                        p pVar = gVar12.f4296e;
                        pVar.f4897h.f4863a = this;
                        pVar.f4898i.f4863a = this;
                        hVar.f4863a = this;
                        if (gVar12.z()) {
                            arrayList2.add(this.f4891b.f4296e.f4894e);
                            this.f4891b.f4296e.f4894e.f4873k.add(hVar);
                            p pVar2 = this.f4891b.f4296e;
                            pVar2.f4894e.f4863a = this;
                            arrayList2.add(pVar2.f4897h);
                            arrayList2.add(this.f4891b.f4296e.f4898i);
                            this.f4891b.f4296e.f4897h.f4873k.add(hVar);
                            this.f4891b.f4296e.f4898i.f4873k.add(hVar);
                        } else {
                            boolean y11 = this.f4891b.y();
                            e5.g gVar13 = this.f4891b;
                            if (y11) {
                                gVar13.f4296e.f4894e.f4874l.add(hVar);
                                arrayList.add(this.f4891b.f4296e.f4894e);
                            } else {
                                gVar13.f4296e.f4894e.f4874l.add(hVar);
                            }
                        }
                    } else {
                        h hVar2 = gVar12.f4296e.f4894e;
                        arrayList2.add(hVar2);
                        hVar2.f4873k.add(hVar);
                        this.f4891b.f4296e.f4897h.f4873k.add(hVar);
                        this.f4891b.f4296e.f4898i.f4873k.add(hVar);
                        hVar.f4864b = true;
                        arrayList.add(gVar7);
                        arrayList.add(gVar6);
                        gVar7.f4874l.add(hVar);
                        gVar6.f4874l.add(hVar);
                    }
                }
            } else {
                e5.g gVar14 = gVar12.U;
                if (gVar14 != null) {
                    h hVar3 = gVar14.f4296e.f4894e;
                    arrayList2.add(hVar3);
                    hVar3.f4873k.add(hVar);
                    hVar.f4864b = true;
                    arrayList.add(gVar7);
                    arrayList.add(gVar6);
                }
            }
        }
        e5.g gVar15 = this.f4891b;
        e5.d[] dVarArr2 = gVar15.Q;
        e5.d dVar4 = dVarArr2[0];
        e5.d dVar5 = dVar4.f4283f;
        if (dVar5 != null && dVarArr2[1].f4283f != null) {
            boolean y12 = gVar15.y();
            e5.g gVar16 = this.f4891b;
            if (y12) {
                gVar7.f4868f = gVar16.Q[0].e();
                gVar6.f4868f = -this.f4891b.Q[1].e();
                return;
            }
            g h13 = t.h(gVar16.Q[0]);
            g h14 = t.h(this.f4891b.Q[1]);
            if (h13 != null) {
                h13.b(this);
            }
            if (h14 != null) {
                h14.b(this);
            }
            this.f4899j = s.CENTER;
        } else if (dVar5 != null) {
            g h15 = t.h(dVar4);
            if (h15 != null) {
                t.b(gVar7, h15, this.f4891b.Q[0].e());
                c(gVar6, gVar7, 1, hVar);
            }
        } else {
            e5.d dVar6 = dVarArr2[1];
            if (dVar6.f4283f != null) {
                g h16 = t.h(dVar6);
                if (h16 != null) {
                    t.b(gVar6, h16, -this.f4891b.Q[1].e());
                    c(gVar7, gVar6, -1, hVar);
                }
            } else if (!(gVar15 instanceof e5.m) && (gVar3 = gVar15.U) != null) {
                t.b(gVar7, gVar3.f4294d.f4897h, gVar15.s());
                c(gVar6, gVar7, 1, hVar);
            }
        }
    }

    @Override // f5.t
    public final void e() {
        g gVar = this.f4897h;
        if (gVar.f4872j) {
            this.f4891b.Z = gVar.f4869g;
        }
    }

    @Override // f5.t
    public final void f() {
        this.f4892c = null;
        this.f4897h.c();
        this.f4898i.c();
        this.f4894e.c();
        this.f4896g = false;
    }

    @Override // f5.t
    public final boolean k() {
        if (this.f4893d != e5.f.MATCH_CONSTRAINT || this.f4891b.f4320r == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f4896g = false;
        g gVar = this.f4897h;
        gVar.c();
        gVar.f4872j = false;
        g gVar2 = this.f4898i;
        gVar2.c();
        gVar2.f4872j = false;
        this.f4894e.f4872j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4891b.f4307j0;
    }
}
