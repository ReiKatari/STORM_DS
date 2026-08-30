package i4;

import a1.m0;
import a4.l2;
import a4.o0;
import a4.r1;
import java.util.ArrayList;
import java.util.List;
import y3.c0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public final b3.o f6767a;

    /* renamed from: b */
    public final boolean f6768b;

    /* renamed from: c */
    public final o0 f6769c;

    /* renamed from: d */
    public final m f6770d;

    /* renamed from: e */
    public boolean f6771e;

    /* renamed from: f */
    public p f6772f;

    /* renamed from: g */
    public final int f6773g;

    public p(b3.o oVar, boolean z10, o0 o0Var, m mVar) {
        this.f6767a = oVar;
        this.f6768b = z10;
        this.f6769c = o0Var;
        this.f6770d = mVar;
        this.f6773g = o0Var.B;
    }

    public static /* synthetic */ List j(int i2, p pVar) {
        boolean z10;
        boolean z11 = false;
        if ((i2 & 1) != 0) {
            z10 = !pVar.f6768b;
        } else {
            z10 = false;
        }
        if ((i2 & 2) == 0) {
            z11 = true;
        }
        return pVar.i(z10, z11);
    }

    public final h3.c a(r1 r1Var) {
        b3.o oVar;
        p l10 = l();
        if (l10 == null) {
            return h3.c.f6051e;
        }
        b3.o oVar2 = l10.f6769c.A0.f268f;
        r1 r1Var2 = null;
        if ((oVar2.R & 8) != 0) {
            loop0: while (oVar2 != null) {
                if ((oVar2.L & 8) != 0) {
                    oVar = oVar2;
                    p2.b bVar = null;
                    while (oVar != null) {
                        if (oVar instanceof l2) {
                            if (((l2) oVar).e()) {
                                break loop0;
                            }
                        } else if ((oVar.L & 8) != 0 && (oVar instanceof a4.k)) {
                            int i2 = 0;
                            for (b3.o oVar3 = ((a4.k) oVar).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                if ((oVar3.L & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        oVar = oVar3;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new p2.b(new b3.o[16]);
                                        }
                                        if (oVar != null) {
                                            bVar.b(oVar);
                                            oVar = null;
                                        }
                                        bVar.b(oVar3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        oVar = a4.l.e(bVar);
                    }
                }
                if ((oVar2.R & 8) == 0) {
                    break;
                }
                oVar2 = oVar2.Y;
            }
        }
        oVar = null;
        l2 l2Var = (l2) oVar;
        if (l2Var != null) {
            r1Var2 = a4.l.r(l2Var, 8);
        }
        if (r1Var2 == null) {
            return l10.a(r1Var);
        }
        return r1Var2.k(r1Var, true);
    }

    public final p b(i iVar, mc.l lVar) {
        int i2;
        m mVar = new m();
        mVar.L = false;
        mVar.R = false;
        lVar.k(mVar);
        o oVar = new o(lVar);
        int i10 = this.f6773g;
        if (iVar != null) {
            i2 = 1000000000;
        } else {
            i2 = 2000000000;
        }
        p pVar = new p(oVar, false, new o0(i10 + i2, true), mVar);
        pVar.f6771e = true;
        pVar.f6772f = this;
        return pVar;
    }

    public final void c(o0 o0Var, ArrayList arrayList) {
        p2.b y10 = o0Var.y();
        Object[] objArr = y10.A;
        int i2 = y10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var2 = (o0) objArr[i10];
            if (o0Var2.H() && !o0Var2.J0) {
                if (o0Var2.A0.d(8)) {
                    arrayList.add(s.a(o0Var2, this.f6768b));
                } else {
                    c(o0Var2, arrayList);
                }
            }
        }
    }

    public final r1 d() {
        if (this.f6771e) {
            p l10 = l();
            if (l10 != null) {
                return l10.d();
            }
            return null;
        }
        l2 f8 = f();
        if (f8 != null) {
            return a4.l.r(f8, 8);
        }
        return this.f6769c.A0.f265c;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        p(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (pVar.m()) {
                arrayList2.add(pVar);
            } else if (!pVar.f6770d.R) {
                pVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l2 f() {
        b3.o oVar;
        boolean z10 = this.f6770d.L;
        l2 l2Var = null;
        o0 o0Var = this.f6769c;
        if (z10) {
            b3.o oVar2 = o0Var.A0.f268f;
            if ((oVar2.R & 8) != 0) {
                oVar = null;
                while (oVar2 != null) {
                    if ((oVar2.L & 8) != 0) {
                        b3.o oVar3 = oVar2;
                        p2.b bVar = null;
                        while (oVar3 != null) {
                            if (oVar3 instanceof l2) {
                                l2 l2Var2 = (l2) oVar3;
                                if (l2Var2.e()) {
                                    if (l2Var2.j0()) {
                                        return l2Var2;
                                    }
                                    if (oVar == null) {
                                        oVar = l2Var2;
                                    }
                                }
                            } else if ((oVar3.L & 8) != 0 && (oVar3 instanceof a4.k)) {
                                int i2 = 0;
                                for (b3.o oVar4 = ((a4.k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                    if ((oVar4.L & 8) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            oVar3 = oVar4;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new p2.b(new b3.o[16]);
                                            }
                                            if (oVar3 != null) {
                                                bVar.b(oVar3);
                                                oVar3 = null;
                                            }
                                            bVar.b(oVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            oVar3 = a4.l.e(bVar);
                        }
                    }
                    if ((oVar2.R & 8) == 0) {
                        break;
                    }
                    oVar2 = oVar2.Y;
                }
                l2Var = oVar;
            }
            return l2Var;
        }
        b3.o oVar5 = o0Var.A0.f268f;
        if ((oVar5.R & 8) != 0) {
            loop3: while (oVar5 != null) {
                if ((oVar5.L & 8) != 0) {
                    oVar = oVar5;
                    p2.b bVar2 = null;
                    while (oVar != null) {
                        if (oVar instanceof l2) {
                            if (((l2) oVar).e()) {
                                l2Var = oVar;
                            }
                        } else if ((oVar.L & 8) != 0 && (oVar instanceof a4.k)) {
                            int i10 = 0;
                            for (b3.o oVar6 = ((a4.k) oVar).f247j0; oVar6 != null; oVar6 = oVar6.Y) {
                                if ((oVar6.L & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        oVar = oVar6;
                                    } else {
                                        if (bVar2 == null) {
                                            bVar2 = new p2.b(new b3.o[16]);
                                        }
                                        if (oVar != null) {
                                            bVar2.b(oVar);
                                            oVar = null;
                                        }
                                        bVar2.b(oVar6);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        oVar = a4.l.e(bVar2);
                    }
                }
                if ((oVar5.R & 8) == 0) {
                    break;
                }
                oVar5 = oVar5.Y;
            }
        }
        return l2Var;
    }

    public final h3.c g() {
        r1 d4 = d();
        if (d4 != null) {
            if (!d4.X0().f1777h0) {
                d4 = null;
            }
            if (d4 != null) {
                return c0.i(d4).k(d4, true);
            }
        }
        return h3.c.f6051e;
    }

    public final h3.c h() {
        r1 d4 = d();
        if (d4 != null) {
            if (!d4.X0().f1777h0) {
                d4 = null;
            }
            if (d4 != null) {
                return c0.g(d4, true);
            }
        }
        return h3.c.f6051e;
    }

    public final List i(boolean z10, boolean z11) {
        if (!z10 && this.f6770d.R) {
            return zb.q.A;
        }
        ArrayList arrayList = new ArrayList();
        if (m()) {
            ArrayList arrayList2 = new ArrayList();
            e(arrayList, arrayList2);
            return arrayList2;
        }
        return p(arrayList, z11);
    }

    public final m k() {
        boolean m = m();
        m mVar = this.f6770d;
        if (m) {
            m b10 = mVar.b();
            o(new ArrayList(), b10);
            return b10;
        }
        return mVar;
    }

    public final p l() {
        o0 o0Var;
        p pVar = this.f6772f;
        if (pVar != null) {
            return pVar;
        }
        o0 o0Var2 = this.f6769c;
        boolean z10 = this.f6768b;
        if (z10) {
            o0Var = o0Var2.u();
            while (o0Var != null) {
                m x9 = o0Var.x();
                if (x9 != null && x9.L) {
                    break;
                }
                o0Var = o0Var.u();
            }
        }
        o0Var = null;
        if (o0Var == null) {
            o0 u4 = o0Var2.u();
            while (true) {
                if (u4 != null) {
                    if (u4.A0.d(8)) {
                        o0Var = u4;
                        break;
                    }
                    u4 = u4.u();
                } else {
                    o0Var = null;
                    break;
                }
            }
        }
        if (o0Var == null) {
            return null;
        }
        return s.a(o0Var, z10);
    }

    public final boolean m() {
        if (this.f6768b && this.f6770d.L) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f6771e && j(4, this).isEmpty()) {
            o0 u4 = this.f6769c.u();
            while (true) {
                if (u4 != null) {
                    m x9 = u4.x();
                    if (x9 != null && x9.L) {
                        break;
                    }
                    u4 = u4.u();
                } else {
                    u4 = null;
                    break;
                }
            }
            if (u4 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(ArrayList arrayList, m mVar) {
        if (!this.f6770d.R) {
            p(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                p pVar = (p) arrayList.get(size2);
                if (!pVar.m()) {
                    mVar.d(pVar.f6770d);
                    pVar.o(arrayList, mVar);
                }
            }
        }
    }

    public final List p(ArrayList arrayList, boolean z10) {
        String str;
        if (this.f6771e) {
            return zb.q.A;
        }
        c(this.f6769c, arrayList);
        if (z10) {
            m mVar = this.f6770d;
            m0 m0Var = mVar.A;
            Object g10 = m0Var.g(t.f6804y);
            if (g10 == null) {
                g10 = null;
            }
            i iVar = (i) g10;
            if (iVar != null && mVar.L && !arrayList.isEmpty()) {
                arrayList.add(b(iVar, new a4.a(16, iVar)));
            }
            w wVar = t.f6781a;
            if (m0Var.c(wVar) && !arrayList.isEmpty() && mVar.L) {
                Object g11 = m0Var.g(wVar);
                if (g11 == null) {
                    g11 = null;
                }
                List list = (List) g11;
                if (list != null) {
                    str = (String) zb.l.T(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, b(null, new a4.a(17, str)));
                }
            }
        }
        return arrayList;
    }
}
