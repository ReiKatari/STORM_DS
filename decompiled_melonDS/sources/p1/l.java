package p1;

import android.view.View;
import h1.n1;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.R;
import n2.p1;
import n2.t2;
import y3.q1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a4.e0 f11230a = new a4.e0(9);

    public static final void a(final mc.a aVar, final b3.p pVar, final o0 o0Var, final e0 e0Var, n2.m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1055276397);
        if (rVar.h(aVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i10 | i2;
        if (rVar.f(pVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.f(o0Var)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar.f(e0Var)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i17 = i16 | i13;
        if ((i17 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i17 & 1, z10)) {
            final n2.w0 A = n2.s.A(aVar, rVar);
            c(v2.h.c(-933153643, new mc.q() { // from class: p1.b0
                @Override // mc.q
                public final Object i(Object obj, Object obj2, Object obj3) {
                    b3.p f8;
                    y2.d dVar = (y2.d) obj;
                    ((Integer) obj3).getClass();
                    n2.r rVar2 = (n2.r) ((n2.m) obj2);
                    Object L = rVar2.L();
                    n2.e eVar = n2.l.f9953a;
                    if (L == eVar) {
                        L = new y(dVar, new ai.s(A, 17));
                        rVar2.h0(L);
                    }
                    final y yVar = (y) L;
                    Object L2 = rVar2.L();
                    if (L2 == eVar) {
                        L2 = new q1(new a0(yVar));
                        rVar2.h0(L2);
                    }
                    final q1 q1Var = (q1) L2;
                    final o0 o0Var2 = o0.this;
                    if (o0Var2 != null) {
                        rVar2.X(1743490539);
                        rVar2.X(887527095);
                        final d1 d1Var = f1.f11208a;
                        if (d1Var != null) {
                            rVar2.X(1345554384);
                            rVar2.p(false);
                        } else {
                            rVar2.X(1345603457);
                            View view = (View) rVar2.j(b4.r0.f1941f);
                            boolean f10 = rVar2.f(view);
                            Object L3 = rVar2.L();
                            if (f10 || L3 == eVar) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                if (tag instanceof d1) {
                                    L3 = (d1) tag;
                                } else {
                                    L3 = null;
                                }
                                if (L3 == null) {
                                    L3 = new a(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, L3);
                                }
                                rVar2.h0(L3);
                            }
                            d1Var = (d1) L3;
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        Object[] objArr = {o0Var2, yVar, q1Var, d1Var};
                        boolean f11 = rVar2.f(o0Var2) | rVar2.h(yVar) | rVar2.h(q1Var) | rVar2.h(d1Var);
                        Object L4 = rVar2.L();
                        if (f11 || L4 == eVar) {
                            L4 = new mc.l() { // from class: p1.d0
                                /* JADX WARN: Type inference failed for: r3v2, types: [e9.a, java.lang.Object] */
                                @Override // mc.l
                                public final Object k(Object obj4) {
                                    n2.h0 h0Var = (n2.h0) obj4;
                                    ?? obj5 = new Object();
                                    obj5.f4415b = yVar;
                                    obj5.f4416c = q1Var;
                                    obj5.f4417d = d1Var;
                                    obj5.f4414a = true;
                                    o0 o0Var3 = o0.this;
                                    o0Var3.f11240c = obj5;
                                    return new a5.a(8, o0Var3);
                                }
                            };
                            rVar2.h0(L4);
                        }
                        n2.s.e(objArr, (mc.l) L4, rVar2);
                    } else {
                        rVar2.X(1737291469);
                    }
                    rVar2.p(false);
                    int i18 = p0.f11248a;
                    b3.p pVar2 = pVar;
                    if (o0Var2 != null && (f8 = pVar2.f(new i1(o0Var2))) != null) {
                        pVar2 = f8;
                    }
                    boolean f12 = rVar2.f(yVar);
                    e0 e0Var2 = e0Var;
                    boolean f13 = f12 | rVar2.f(e0Var2);
                    Object L5 = rVar2.L();
                    if (f13 || L5 == eVar) {
                        L5 = new ai.r0(27, yVar, e0Var2);
                        rVar2.h0(L5);
                    }
                    y3.c0.c(q1Var, pVar2, (mc.p) L5, rVar2, 8);
                    return yb.y.f14813a;
                }
            }, rVar), rVar, 6);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(pVar, o0Var, e0Var, i2) { // from class: p1.c0
                public final /* synthetic */ b3.p B;
                public final /* synthetic */ o0 L;
                public final /* synthetic */ e0 R;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(1);
                    l.a(mc.a.this, this.B, this.L, this.R, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void b(final Object obj, final int i2, final l0 l0Var, final v2.c cVar, n2.m mVar, final int i10) {
        int i11;
        boolean z10;
        mc.l lVar;
        int i12;
        int i13;
        int i14;
        int i15;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(872548579);
        if ((i10 & 6) == 0) {
            if (rVar.h(obj)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.d(i2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (rVar.h(l0Var)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.h(cVar)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            boolean f8 = rVar.f(obj) | rVar.f(l0Var);
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (f8 || L == eVar) {
                L = new j0(obj, l0Var);
                rVar.h0(L);
            }
            j0 j0Var = (j0) L;
            j0Var.f11221c = i2;
            n2.f1 f1Var = j0Var.f11225g;
            n2.b0 b0Var = y3.g1.f14680a;
            j0 j0Var2 = (j0) rVar.j(b0Var);
            z2.f e6 = z2.q.e();
            if (e6 != null) {
                lVar = e6.e();
            } else {
                lVar = null;
            }
            z2.f h2 = z2.q.h(e6);
            try {
                if (j0Var2 != ((j0) f1Var.getValue())) {
                    f1Var.setValue(j0Var2);
                    if (j0Var.f11222d > 0) {
                        j0 j0Var3 = j0Var.f11223e;
                        if (j0Var3 != null) {
                            j0Var3.b();
                        }
                        if (j0Var2 != null) {
                            j0Var2.a();
                        } else {
                            j0Var2 = null;
                        }
                        j0Var.f11223e = j0Var2;
                    }
                }
                z2.q.k(e6, h2, lVar);
                boolean f10 = rVar.f(j0Var);
                Object L2 = rVar.L();
                if (f10 || L2 == eVar) {
                    L2 = new mh.z(13, j0Var);
                    rVar.h0(L2);
                }
                n2.s.d(j0Var, (mc.l) L2, rVar);
                n2.s.a(b0Var.a(j0Var), cVar, rVar, ((i11 >> 6) & 112) | 8);
            } catch (Throwable th2) {
                z2.q.k(e6, h2, lVar);
                throw th2;
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: p1.k0
                @Override // mc.p
                public final Object j(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    l.b(obj, i2, l0Var, cVar, (n2.m) obj2, n2.s.F(i10 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void c(v2.c cVar, n2.m mVar, int i2) {
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-709502251);
        if ((i2 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i2 & 1, z10)) {
            t2 t2Var = y2.h.f14658a;
            y2.f fVar = (y2.f) rVar.j(t2Var);
            y2.e f8 = y2.k.f(rVar);
            Object[] objArr = {fVar};
            a0 a0Var = new a0(28, new mg.m(9, (byte) 0), new he.g(19, fVar, f8));
            boolean h2 = rVar.h(fVar) | rVar.h(f8);
            Object L = rVar.L();
            if (h2 || L == n2.l.f9953a) {
                L = new a3.e(28, fVar, f8);
                rVar.h0(L);
            }
            z0 z0Var = (z0) y2.k.d(objArr, a0Var, (mc.a) L, rVar, 0);
            n2.s.a(t2Var.a(z0Var), v2.h.c(-412824043, new ai.r0(28, cVar, z0Var), rVar), rVar, 56);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g2.y(cVar, i2, 7);
        }
    }

    public static final void d(z zVar, Object obj, int i2, Object obj2, n2.m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1439843069);
        if (rVar.f(zVar)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i15 = i11 | i10;
        if (rVar.f(obj)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i16 = i15 | i12;
        if (rVar.d(i2)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i17 = i16 | i13;
        if (rVar.f(obj2)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i18 = i17 | i14;
        if ((i18 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i18 & 1, z10)) {
            ((y2.d) obj).a(obj2, v2.h.c(980966366, new ai.r(i2, obj2, zVar), rVar), rVar, 48);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(zVar, obj, i2, obj2, i10);
        }
    }

    public static final int e(int i2, p2.b bVar) {
        int i10 = bVar.L - 1;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = ((i10 - i11) / 2) + i11;
            Object[] objArr = bVar.A;
            int i13 = ((h) objArr[i12]).f11212a;
            if (i13 != i2) {
                if (i13 < i2) {
                    i11 = i12 + 1;
                    if (i2 < ((h) objArr[i11]).f11212a) {
                    }
                } else {
                    i10 = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }

    public static final List f(h0 h0Var, int i2, int i10, ArrayList arrayList, a1.w wVar, int i11, int i12, int i13, mc.l lVar) {
        int i14;
        a1.w wVar2;
        g0 g0Var;
        long j2;
        long j10;
        int i15;
        Object obj;
        int i16;
        int max;
        long j11;
        if (h0Var != null && !arrayList.isEmpty() && (i14 = wVar.f112b) != 0) {
            int i17 = -1;
            if (i10 - i2 >= 0 && i14 != 0) {
                sc.d L = p7.j.L(0, i14);
                int i18 = L.A;
                int i19 = L.B;
                int i20 = -1;
                if (i18 <= i19) {
                    while (wVar.c(i18) <= i2) {
                        i20 = wVar.c(i18);
                        if (i18 == i19) {
                            break;
                        }
                        i18++;
                    }
                }
                if (i20 == -1) {
                    wVar2 = a1.k.f60a;
                } else {
                    a1.w wVar3 = a1.k.f60a;
                    wVar2 = new a1.w(1);
                    wVar2.a(i20);
                }
            } else {
                wVar2 = a1.k.f60a;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i21 = 0; i21 < size; i21++) {
                Object obj2 = arrayList.get(i21);
                int index = ((g0) obj2).getIndex();
                int[] iArr = wVar.f111a;
                int i22 = wVar.f112b;
                int i23 = 0;
                while (true) {
                    if (i23 >= i22) {
                        break;
                    } else if (iArr[i23] == index) {
                        arrayList3.add(obj2);
                        break;
                    } else {
                        i23++;
                    }
                }
            }
            int[] iArr2 = wVar2.f111a;
            int i24 = wVar2.f112b;
            int i25 = 0;
            while (i25 < i24) {
                int i26 = iArr2[i25];
                int size2 = arrayList.size();
                int i27 = 0;
                int i28 = 0;
                while (true) {
                    if (i28 < size2) {
                        Object obj3 = arrayList.get(i28);
                        i28++;
                        if (((g0) obj3).getIndex() == i26) {
                            break;
                        }
                        i27++;
                    } else {
                        i27 = i17;
                        break;
                    }
                }
                if (i27 == i17) {
                    g0Var = (g0) lVar.k(Integer.valueOf(i26));
                } else {
                    g0Var = (g0) arrayList.remove(i27);
                }
                int e6 = g0Var.e();
                if (i27 == i17) {
                    j2 = 4294967295L;
                    i15 = Integer.MIN_VALUE;
                } else {
                    long f8 = g0Var.f(0);
                    if (g0Var.b()) {
                        j2 = 4294967295L;
                        j10 = f8 & 4294967295L;
                    } else {
                        j2 = 4294967295L;
                        j10 = f8 >> 32;
                    }
                    i15 = (int) j10;
                }
                int size3 = arrayList3.size();
                int i29 = 0;
                while (true) {
                    if (i29 < size3) {
                        obj = arrayList3.get(i29);
                        if (((g0) obj).getIndex() != i26) {
                            break;
                        }
                        i29++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                g0 g0Var2 = (g0) obj;
                if (g0Var2 != null) {
                    long f10 = g0Var2.f(0);
                    if (g0Var2.b()) {
                        j11 = f10 & j2;
                    } else {
                        j11 = f10 >> 32;
                    }
                    i16 = (int) j11;
                } else {
                    i16 = Integer.MIN_VALUE;
                }
                if (i15 == Integer.MIN_VALUE) {
                    max = -i11;
                } else {
                    max = Math.max(-i11, i15);
                }
                if (i16 != Integer.MIN_VALUE) {
                    max = Math.min(max, i16 - e6);
                }
                g0Var.c();
                g0Var.d(max, i12, i13);
                arrayList2.add(g0Var);
                i25++;
                i17 = -1;
            }
            return arrayList2;
        }
        return zb.q.A;
    }

    public static final List g(z zVar, l0 l0Var, h1.a aVar) {
        boolean z10;
        sc.b bVar;
        p2.b bVar2 = aVar.f5838a;
        if (bVar2.L != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && l0Var.A.isEmpty()) {
            return zb.q.A;
        }
        ArrayList arrayList = new ArrayList();
        if (aVar.f5838a.L != 0) {
            int i2 = bVar2.L;
            if (i2 != 0) {
                Object[] objArr = bVar2.A;
                int i10 = ((j) objArr[0]).f11217a;
                for (int i11 = 0; i11 < i2; i11++) {
                    int i12 = ((j) objArr[i11]).f11217a;
                    if (i12 < i10) {
                        i10 = i12;
                    }
                }
                if (i10 < 0) {
                    k1.b.a("negative minIndex");
                }
                int i13 = bVar2.L;
                if (i13 != 0) {
                    Object[] objArr2 = bVar2.A;
                    int i14 = ((j) objArr2[0]).f11218b;
                    for (int i15 = 0; i15 < i13; i15++) {
                        int i16 = ((j) objArr2[i15]).f11218b;
                        if (i16 > i14) {
                            i14 = i16;
                        }
                    }
                    bVar = new sc.b(i10, Math.min(i14, zVar.a() - 1), 1);
                } else {
                    m9.o.x("MutableVector is empty.");
                    return null;
                }
            } else {
                m9.o.x("MutableVector is empty.");
                return null;
            }
        } else {
            bVar = sc.d.R;
        }
        int size = l0Var.A.size();
        for (int i17 = 0; i17 < size; i17++) {
            j0 j0Var = (j0) l0Var.get(i17);
            int i18 = i(j0Var.f11221c, j0Var.f11219a, zVar);
            int i19 = bVar.A;
            if ((i18 > bVar.B || i19 > i18) && i18 >= 0 && i18 < zVar.a()) {
                arrayList.add(Integer.valueOf(i18));
            }
        }
        int i20 = bVar.A;
        int i21 = bVar.B;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }

    public static n2.w0 h() {
        return new n2.f1(yb.y.f14813a, n2.e.R);
    }

    public static final int i(int i2, Object obj, z zVar) {
        int d4;
        if (obj != null && zVar.a() != 0 && ((i2 >= zVar.a() || !obj.equals(zVar.b(i2))) && (d4 = zVar.d(obj)) != -1)) {
            return d4;
        }
        return i2;
    }

    public static final b3.p m(q qVar, h1.a aVar, n1 n1Var) {
        return new k(qVar, aVar, n1Var);
    }

    public static final b3.p n(b3.p pVar, ed.i iVar, u0 u0Var, n1 n1Var, boolean z10) {
        return pVar.f(new v0(iVar, u0Var, n1Var, z10));
    }

    public static final List o(int i2, int i10, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return zb.q.A;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            g0 g0Var = (g0) arrayList.get(i11);
            int index = g0Var.getIndex();
            if (i2 <= index && index <= i10) {
                arrayList2.add(g0Var);
            }
        }
        zb.o.I(arrayList2, f11230a);
        return arrayList2;
    }

    public Object j(int i2) {
        h d4 = k().d(i2);
        return d4.f11214c.a().k(Integer.valueOf(i2 - d4.f11212a));
    }

    public abstract c8.c0 k();

    public Object l(int i2) {
        Object k10;
        h d4 = k().d(i2);
        int i10 = i2 - d4.f11212a;
        mc.l key = d4.f11214c.getKey();
        if (key != null && (k10 = key.k(Integer.valueOf(i10))) != null) {
            return k10;
        }
        return new f(i2);
    }
}
