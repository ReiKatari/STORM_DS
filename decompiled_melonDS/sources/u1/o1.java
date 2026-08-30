package u1;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public final n2.f1 f13376a = n2.s.w(null);

    /* renamed from: b  reason: collision with root package name */
    public l4.h f13377b;

    /* renamed from: c  reason: collision with root package name */
    public final z2.p f13378c;

    public o1(l4.h hVar) {
        h1 h1Var = new h1(1);
        hVar.getClass();
        l4.e eVar = new l4.e(hVar);
        ArrayList arrayList = eVar.L;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) h1Var.k(((l4.d) arrayList.get(i2)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                l4.f fVar = (l4.f) list.get(i10);
                arrayList3.add(new l4.d(fVar.f8791b, fVar.f8792c, fVar.f8790a, fVar.f8793d));
            }
            zb.l.L(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f13377b = eVar.h();
        this.f13378c = new z2.p();
    }

    public static l4.f c(l4.f fVar, l4.o0 o0Var) {
        l4.q qVar = o0Var.f8866b;
        int c4 = qVar.c(qVar.f8880f - 1, false);
        if (fVar.f8791b >= c4) {
            return null;
        }
        return l4.f.a(fVar, null, Math.min(fVar.f8792c, c4), 11);
    }

    public final void a(n2.m mVar, int i2) {
        int i10;
        boolean z10;
        char c4;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        l4.j0 j0Var;
        l4.j0 j0Var2;
        l4.j0 j0Var3;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1154651354);
        char c10 = 2;
        if (rVar.h(this)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        boolean z15 = false;
        if ((i12 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i12 & 1, z10)) {
            b4.b1 b1Var = (b4.b1) rVar.j(b4.q1.f1928r);
            l4.h hVar = this.f13377b;
            List a10 = hVar.a(hVar.B.length());
            int size = a10.size();
            int i13 = 0;
            while (i13 < size) {
                l4.f fVar = (l4.f) a10.get(i13);
                int i14 = fVar.f8791b;
                Object obj = fVar.f8790a;
                if (i14 != fVar.f8792c) {
                    rVar.X(725478935);
                    Object L = rVar.L();
                    n2.e eVar = n2.l.f9953a;
                    if (L == eVar) {
                        L = new j1.i();
                        rVar.h0(L);
                    }
                    j1.i iVar = (j1.i) L;
                    c4 = c10;
                    b3.p m = i3.z.m(b3.m.f1770a, new l1(0, this, fVar));
                    Object L2 = rVar.L();
                    if (L2 == eVar) {
                        L2 = new h1(2);
                        rVar.h0(L2);
                    }
                    b3.p m10 = f1.n.m(i4.n.a(m, z15, (mc.l) L2).f(new p1(new bi.h(11, this, fVar))), iVar);
                    v3.q.f13686a.getClass();
                    b3.p g10 = v3.s.g(m10, v3.s.f13689c);
                    boolean h2 = rVar.h(this) | rVar.f(fVar) | rVar.h(b1Var);
                    Object L3 = rVar.L();
                    if (h2 || L3 == eVar) {
                        L3 = new q1.e(this, fVar, b1Var);
                        rVar.h0(L3);
                    }
                    l1.p.a(f1.n.j(g10, iVar, (mc.a) L3), rVar, 0);
                    l4.p pVar = (l4.p) obj;
                    l4.p0 a11 = pVar.a();
                    if (a11 != null) {
                        if (a11.f8871a == null && a11.f8872b == null && a11.f8873c == null && a11.f8874d == null) {
                            i11 = 716130110;
                            z11 = false;
                        } else {
                            rVar.X(726303039);
                            Object L4 = rVar.L();
                            if (L4 == eVar) {
                                L4 = new q0(iVar);
                                rVar.h0(L4);
                            }
                            q0 q0Var = (q0) L4;
                            Object L5 = rVar.L();
                            l4.j0 j0Var4 = null;
                            if (L5 == eVar) {
                                L5 = new m1(0, null, q0Var);
                                rVar.h0(L5);
                            }
                            n2.s.g(yb.y.f14813a, (mc.p) L5, rVar);
                            n2.c1 c1Var = q0Var.f13416b;
                            n2.c1 c1Var2 = q0Var.f13416b;
                            if ((c1Var.g() & 2) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            Boolean valueOf = Boolean.valueOf(z12);
                            if ((c1Var2.g() & 1) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            Boolean valueOf2 = Boolean.valueOf(z13);
                            if ((c1Var2.g() & 4) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            Boolean valueOf3 = Boolean.valueOf(z14);
                            l4.p0 a12 = pVar.a();
                            if (a12 != null) {
                                j0Var = a12.f8871a;
                            } else {
                                j0Var = null;
                            }
                            l4.p0 a13 = pVar.a();
                            if (a13 != null) {
                                j0Var2 = a13.f8872b;
                            } else {
                                j0Var2 = null;
                            }
                            l4.p0 a14 = pVar.a();
                            if (a14 != null) {
                                j0Var3 = a14.f8873c;
                            } else {
                                j0Var3 = null;
                            }
                            l4.p0 a15 = pVar.a();
                            if (a15 != null) {
                                j0Var4 = a15.f8874d;
                            }
                            Object[] objArr = {valueOf, valueOf2, valueOf3, j0Var, j0Var2, j0Var3, j0Var4};
                            boolean h10 = rVar.h(this) | rVar.f(fVar);
                            Object L6 = rVar.L();
                            if (h10 || L6 == eVar) {
                                L6 = new l1(this, fVar, q0Var);
                                rVar.h0(L6);
                            }
                            b(objArr, (mc.l) L6, rVar, (i12 << 6) & 896);
                            z11 = false;
                            rVar.p(z11);
                        }
                    } else {
                        z11 = false;
                        i11 = 716130110;
                    }
                    rVar.X(i11);
                    rVar.p(z11);
                } else {
                    c4 = c10;
                    z11 = z15;
                    rVar.X(716130110);
                }
                rVar.p(z11);
                i13++;
                z15 = z11;
                c10 = c4;
            }
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.s0(i2, 27, this);
        }
    }

    public final void b(Object[] objArr, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-2083052099);
        if ((i2 & 48) == 0) {
            if (rVar.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 = i14 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(this)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        rVar.V(-358306546, Integer.valueOf(objArr.length));
        boolean z11 = false;
        if (rVar.d(objArr.length)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i15 = i10 | i11;
        for (Object obj : objArr) {
            if (rVar.h(obj)) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            i15 |= i12;
        }
        rVar.p(false);
        if ((i15 & 14) == 0) {
            i15 |= 2;
        }
        if ((i15 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            j0.o1 o1Var = new j0.o1(2);
            o1Var.a(lVar);
            o1Var.d(objArr);
            ArrayList arrayList = o1Var.f7269a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean h2 = rVar.h(this);
            if ((i15 & 112) == 32) {
                z11 = true;
            }
            boolean z12 = h2 | z11;
            Object L = rVar.L();
            if (z12 || L == n2.l.f9953a) {
                L = new l(this, lVar, 1);
                rVar.h0(L);
            }
            n2.s.e(array, (mc.l) L, rVar);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(this, objArr, lVar, i2, 9);
        }
    }
}
