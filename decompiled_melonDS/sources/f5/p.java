package f5;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: k  reason: collision with root package name */
    public g f4881k;

    /* renamed from: l  reason: collision with root package name */
    public a f4882l;

    @Override // f5.d
    public final void a(d dVar) {
        h hVar;
        float f8;
        float f10;
        float f11;
        int i2;
        if (o.f4880a[this.f4899j.ordinal()] != 3) {
            h hVar2 = this.f4894e;
            if (hVar2.f4865c && !hVar2.f4872j && this.f4893d == e5.f.MATCH_CONSTRAINT) {
                e5.g gVar = this.f4891b;
                int i10 = gVar.f4322s;
                if (i10 != 2) {
                    if (i10 == 3) {
                        h hVar3 = gVar.f4294d.f4894e;
                        if (hVar3.f4872j) {
                            int i11 = gVar.Y;
                            if (i11 != -1) {
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        i2 = 0;
                                        hVar2.d(i2);
                                    } else {
                                        f8 = hVar3.f4869g;
                                        f10 = gVar.X;
                                    }
                                } else {
                                    f11 = hVar3.f4869g * gVar.X;
                                    i2 = (int) (f11 + 0.5f);
                                    hVar2.d(i2);
                                }
                            } else {
                                f8 = hVar3.f4869g;
                                f10 = gVar.X;
                            }
                            f11 = f8 / f10;
                            i2 = (int) (f11 + 0.5f);
                            hVar2.d(i2);
                        }
                    }
                } else {
                    e5.g gVar2 = gVar.U;
                    if (gVar2 != null) {
                        if (gVar2.f4296e.f4894e.f4872j) {
                            hVar2.d((int) ((hVar.f4869g * gVar.f4330z) + 0.5f));
                        }
                    }
                }
            }
            g gVar3 = this.f4897h;
            boolean z10 = gVar3.f4865c;
            ArrayList arrayList = gVar3.f4874l;
            if (z10) {
                g gVar4 = this.f4898i;
                boolean z11 = gVar4.f4865c;
                ArrayList arrayList2 = gVar4.f4874l;
                if (z11) {
                    if (!gVar3.f4872j || !gVar4.f4872j || !hVar2.f4872j) {
                        if (!hVar2.f4872j && this.f4893d == e5.f.MATCH_CONSTRAINT) {
                            e5.g gVar5 = this.f4891b;
                            if (gVar5.f4320r == 0 && !gVar5.z()) {
                                int i12 = ((g) arrayList.get(0)).f4869g + gVar3.f4868f;
                                int i13 = ((g) arrayList2.get(0)).f4869g + gVar4.f4868f;
                                gVar3.d(i12);
                                gVar4.d(i13);
                                hVar2.d(i13 - i12);
                                return;
                            }
                        }
                        if (!hVar2.f4872j && this.f4893d == e5.f.MATCH_CONSTRAINT && this.f4890a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            int i14 = (((g) arrayList2.get(0)).f4869g + gVar4.f4868f) - (((g) arrayList.get(0)).f4869g + gVar3.f4868f);
                            int i15 = hVar2.m;
                            if (i14 < i15) {
                                hVar2.d(i14);
                            } else {
                                hVar2.d(i15);
                            }
                        }
                        if (hVar2.f4872j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            g gVar6 = (g) arrayList.get(0);
                            g gVar7 = (g) arrayList2.get(0);
                            int i16 = gVar6.f4869g;
                            int i17 = gVar3.f4868f + i16;
                            int i18 = gVar7.f4869g;
                            int i19 = gVar4.f4868f + i18;
                            float f12 = this.f4891b.f4299f0;
                            if (gVar6 == gVar7) {
                                f12 = 0.5f;
                            } else {
                                i16 = i17;
                                i18 = i19;
                            }
                            gVar3.d((int) ((((i18 - i16) - hVar2.f4869g) * f12) + i16 + 0.5f));
                            gVar4.d(gVar3.f4869g + hVar2.f4869g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        e5.g gVar8 = this.f4891b;
        l(gVar8.J, gVar8.L, 1);
    }

    /* JADX WARN: Type inference failed for: r1v113, types: [f5.h, f5.a] */
    @Override // f5.t
    public final void d() {
        e5.g gVar;
        e5.g gVar2;
        e5.g gVar3;
        e5.g gVar4;
        g gVar5 = this.f4881k;
        e5.g gVar6 = this.f4891b;
        boolean z10 = gVar6.f4288a;
        h hVar = this.f4894e;
        if (z10) {
            hVar.d(gVar6.l());
        }
        boolean z11 = hVar.f4872j;
        ArrayList arrayList = hVar.f4873k;
        ArrayList arrayList2 = hVar.f4874l;
        g gVar7 = this.f4898i;
        g gVar8 = this.f4897h;
        if (!z11) {
            e5.g gVar9 = this.f4891b;
            this.f4893d = gVar9.T[1];
            if (gVar9.E) {
                this.f4882l = new h(this);
            }
            e5.f fVar = this.f4893d;
            if (fVar != e5.f.MATCH_CONSTRAINT) {
                if (fVar == e5.f.MATCH_PARENT && (gVar4 = this.f4891b.U) != null && gVar4.T[1] == e5.f.FIXED) {
                    int l10 = (gVar4.l() - this.f4891b.J.e()) - this.f4891b.L.e();
                    t.b(gVar8, gVar4.f4296e.f4897h, this.f4891b.J.e());
                    t.b(gVar7, gVar4.f4296e.f4898i, -this.f4891b.L.e());
                    hVar.d(l10);
                    return;
                } else if (fVar == e5.f.FIXED) {
                    hVar.d(this.f4891b.l());
                }
            }
        } else if (this.f4893d == e5.f.MATCH_PARENT && (gVar2 = (gVar = this.f4891b).U) != null && gVar2.T[1] == e5.f.FIXED) {
            t.b(gVar8, gVar2.f4296e.f4897h, gVar.J.e());
            t.b(gVar7, gVar2.f4296e.f4898i, -this.f4891b.L.e());
            return;
        }
        boolean z12 = hVar.f4872j;
        if (z12) {
            e5.g gVar10 = this.f4891b;
            if (gVar10.f4288a) {
                e5.d[] dVarArr = gVar10.Q;
                e5.d dVar = dVarArr[2];
                e5.d dVar2 = dVar.f4283f;
                if (dVar2 != null && dVarArr[3].f4283f != null) {
                    boolean z13 = gVar10.z();
                    e5.g gVar11 = this.f4891b;
                    if (z13) {
                        gVar8.f4868f = gVar11.Q[2].e();
                        gVar7.f4868f = -this.f4891b.Q[3].e();
                    } else {
                        g h2 = t.h(gVar11.Q[2]);
                        if (h2 != null) {
                            t.b(gVar8, h2, this.f4891b.Q[2].e());
                        }
                        g h10 = t.h(this.f4891b.Q[3]);
                        if (h10 != null) {
                            t.b(gVar7, h10, -this.f4891b.Q[3].e());
                        }
                        gVar8.f4864b = true;
                        gVar7.f4864b = true;
                    }
                    e5.g gVar12 = this.f4891b;
                    if (gVar12.E) {
                        t.b(gVar5, gVar8, gVar12.f4291b0);
                        return;
                    }
                    return;
                } else if (dVar2 != null) {
                    g h11 = t.h(dVar);
                    if (h11 != null) {
                        t.b(gVar8, h11, this.f4891b.Q[2].e());
                        t.b(gVar7, gVar8, hVar.f4869g);
                        e5.g gVar13 = this.f4891b;
                        if (gVar13.E) {
                            t.b(gVar5, gVar8, gVar13.f4291b0);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    e5.d dVar3 = dVarArr[3];
                    if (dVar3.f4283f != null) {
                        g h12 = t.h(dVar3);
                        if (h12 != null) {
                            t.b(gVar7, h12, -this.f4891b.Q[3].e());
                            t.b(gVar8, gVar7, -hVar.f4869g);
                        }
                        e5.g gVar14 = this.f4891b;
                        if (gVar14.E) {
                            t.b(gVar5, gVar8, gVar14.f4291b0);
                            return;
                        }
                        return;
                    }
                    e5.d dVar4 = dVarArr[4];
                    if (dVar4.f4283f != null) {
                        g h13 = t.h(dVar4);
                        if (h13 != null) {
                            t.b(gVar5, h13, 0);
                            t.b(gVar8, gVar5, -this.f4891b.f4291b0);
                            t.b(gVar7, gVar8, hVar.f4869g);
                            return;
                        }
                        return;
                    } else if (!(gVar10 instanceof e5.m) && gVar10.U != null && gVar10.j(e5.c.CENTER).f4283f == null) {
                        e5.g gVar15 = this.f4891b;
                        t.b(gVar8, gVar15.U.f4296e.f4897h, gVar15.t());
                        t.b(gVar7, gVar8, hVar.f4869g);
                        e5.g gVar16 = this.f4891b;
                        if (gVar16.E) {
                            t.b(gVar5, gVar8, gVar16.f4291b0);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!z12 && this.f4893d == e5.f.MATCH_CONSTRAINT) {
            e5.g gVar17 = this.f4891b;
            int i2 = gVar17.f4322s;
            if (i2 != 2) {
                if (i2 == 3 && !gVar17.z()) {
                    e5.g gVar18 = this.f4891b;
                    if (gVar18.f4320r != 3) {
                        h hVar2 = gVar18.f4294d.f4894e;
                        arrayList2.add(hVar2);
                        hVar2.f4873k.add(hVar);
                        hVar.f4864b = true;
                        arrayList.add(gVar8);
                        arrayList.add(gVar7);
                    }
                }
            } else {
                e5.g gVar19 = gVar17.U;
                if (gVar19 != null) {
                    h hVar3 = gVar19.f4296e.f4894e;
                    arrayList2.add(hVar3);
                    hVar3.f4873k.add(hVar);
                    hVar.f4864b = true;
                    arrayList.add(gVar8);
                    arrayList.add(gVar7);
                }
            }
        } else {
            hVar.b(this);
        }
        e5.g gVar20 = this.f4891b;
        e5.d[] dVarArr2 = gVar20.Q;
        e5.d dVar5 = dVarArr2[2];
        e5.d dVar6 = dVar5.f4283f;
        if (dVar6 != null && dVarArr2[3].f4283f != null) {
            boolean z14 = gVar20.z();
            e5.g gVar21 = this.f4891b;
            if (z14) {
                gVar8.f4868f = gVar21.Q[2].e();
                gVar7.f4868f = -this.f4891b.Q[3].e();
            } else {
                g h14 = t.h(gVar21.Q[2]);
                g h15 = t.h(this.f4891b.Q[3]);
                if (h14 != null) {
                    h14.b(this);
                }
                if (h15 != null) {
                    h15.b(this);
                }
                this.f4899j = s.CENTER;
            }
            if (this.f4891b.E) {
                c(gVar5, gVar8, 1, this.f4882l);
            }
        } else if (dVar6 != null) {
            g h16 = t.h(dVar5);
            if (h16 != null) {
                t.b(gVar8, h16, this.f4891b.Q[2].e());
                c(gVar7, gVar8, 1, hVar);
                if (this.f4891b.E) {
                    c(gVar5, gVar8, 1, this.f4882l);
                }
                e5.f fVar2 = this.f4893d;
                e5.f fVar3 = e5.f.MATCH_CONSTRAINT;
                if (fVar2 == fVar3) {
                    e5.g gVar22 = this.f4891b;
                    if (gVar22.X > 0.0f) {
                        m mVar = gVar22.f4294d;
                        if (mVar.f4893d == fVar3) {
                            mVar.f4894e.f4873k.add(hVar);
                            arrayList2.add(this.f4891b.f4294d.f4894e);
                            hVar.f4863a = this;
                        }
                    }
                }
            }
        } else {
            e5.d dVar7 = dVarArr2[3];
            if (dVar7.f4283f != null) {
                g h17 = t.h(dVar7);
                if (h17 != null) {
                    t.b(gVar7, h17, -this.f4891b.Q[3].e());
                    c(gVar8, gVar7, -1, hVar);
                    if (this.f4891b.E) {
                        c(gVar5, gVar8, 1, this.f4882l);
                    }
                }
            } else {
                e5.d dVar8 = dVarArr2[4];
                if (dVar8.f4283f != null) {
                    g h18 = t.h(dVar8);
                    if (h18 != null) {
                        t.b(gVar5, h18, 0);
                        c(gVar8, gVar5, -1, this.f4882l);
                        c(gVar7, gVar8, 1, hVar);
                    }
                } else if (!(gVar20 instanceof e5.m) && (gVar3 = gVar20.U) != null) {
                    t.b(gVar8, gVar3.f4296e.f4897h, gVar20.t());
                    c(gVar7, gVar8, 1, hVar);
                    if (this.f4891b.E) {
                        c(gVar5, gVar8, 1, this.f4882l);
                    }
                    e5.f fVar4 = this.f4893d;
                    e5.f fVar5 = e5.f.MATCH_CONSTRAINT;
                    if (fVar4 == fVar5) {
                        e5.g gVar23 = this.f4891b;
                        if (gVar23.X > 0.0f) {
                            m mVar2 = gVar23.f4294d;
                            if (mVar2.f4893d == fVar5) {
                                mVar2.f4894e.f4873k.add(hVar);
                                arrayList2.add(this.f4891b.f4294d.f4894e);
                                hVar.f4863a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            hVar.f4865c = true;
        }
    }

    @Override // f5.t
    public final void e() {
        g gVar = this.f4897h;
        if (gVar.f4872j) {
            this.f4891b.f4289a0 = gVar.f4869g;
        }
    }

    @Override // f5.t
    public final void f() {
        this.f4892c = null;
        this.f4897h.c();
        this.f4898i.c();
        this.f4881k.c();
        this.f4894e.c();
        this.f4896g = false;
    }

    @Override // f5.t
    public final boolean k() {
        if (this.f4893d != e5.f.MATCH_CONSTRAINT || this.f4891b.f4322s == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f4896g = false;
        g gVar = this.f4897h;
        gVar.c();
        gVar.f4872j = false;
        g gVar2 = this.f4898i;
        gVar2.c();
        gVar2.f4872j = false;
        g gVar3 = this.f4881k;
        gVar3.c();
        gVar3.f4872j = false;
        this.f4894e.f4872j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4891b.f4307j0;
    }
}
