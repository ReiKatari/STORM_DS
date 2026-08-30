package f5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4875a = new Object();

    public static boolean a(e5.g gVar) {
        e5.h hVar;
        boolean z10;
        boolean z11;
        e5.f fVar;
        e5.f fVar2;
        e5.f[] fVarArr = gVar.T;
        e5.f fVar3 = fVarArr[0];
        e5.f fVar4 = fVarArr[1];
        e5.g gVar2 = gVar.U;
        if (gVar2 != null) {
            hVar = (e5.h) gVar2;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            e5.f fVar5 = hVar.T[0];
            e5.f fVar6 = e5.f.FIXED;
        }
        if (hVar != null) {
            e5.f fVar7 = hVar.T[1];
            e5.f fVar8 = e5.f.FIXED;
        }
        e5.f fVar9 = e5.f.FIXED;
        if (fVar3 != fVar9 && !gVar.B() && fVar3 != e5.f.WRAP_CONTENT && ((fVar3 != (fVar2 = e5.f.MATCH_CONSTRAINT) || gVar.f4320r != 0 || gVar.X != 0.0f || !gVar.u(0)) && (fVar3 != fVar2 || gVar.f4320r != 1 || !gVar.v(0, gVar.r())))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar4 != fVar9 && !gVar.C() && fVar4 != e5.f.WRAP_CONTENT && ((fVar4 != (fVar = e5.f.MATCH_CONSTRAINT) || gVar.f4322s != 0 || gVar.X != 0.0f || !gVar.u(1)) && (fVar4 != fVar || gVar.f4322s != 1 || !gVar.v(1, gVar.l())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((gVar.X <= 0.0f || (!z10 && !z11)) && (!z10 || !z11)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, f5.q] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static q b(e5.g gVar, int i2, ArrayList arrayList, q qVar) {
        int i10;
        int i11;
        if (i2 == 0) {
            i10 = gVar.f4321r0;
        } else {
            i10 = gVar.f4323s0;
        }
        int i12 = 0;
        if (i10 != -1 && (qVar == 0 || i10 != qVar.f4885b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                q qVar2 = (q) arrayList.get(i13);
                if (qVar2.f4885b == i10) {
                    if (qVar != 0) {
                        qVar.c(i2, qVar2);
                        arrayList.remove(qVar);
                    }
                    qVar = qVar2;
                } else {
                    i13++;
                }
            }
        } else if (i10 != -1) {
            return qVar;
        }
        q qVar3 = qVar;
        if (qVar == null) {
            if (gVar instanceof e5.m) {
                e5.m mVar = (e5.m) gVar;
                int i14 = 0;
                while (true) {
                    if (i14 < mVar.f4368u0) {
                        e5.g gVar2 = mVar.f4367t0[i14];
                        if ((i2 == 0 && (i11 = gVar2.f4321r0) != -1) || (i2 == 1 && (i11 = gVar2.f4323s0) != -1)) {
                            break;
                        }
                        i14++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 != -1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        }
                        q qVar4 = (q) arrayList.get(i15);
                        if (qVar4.f4885b == i11) {
                            qVar = qVar4;
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (qVar == 0) {
                qVar = new Object();
                qVar.f4884a = new ArrayList();
                qVar.f4887d = null;
                qVar.f4888e = -1;
                int i16 = q.f4883f;
                q.f4883f = i16 + 1;
                qVar.f4885b = i16;
                qVar.f4886c = i2;
            }
            arrayList.add(qVar);
            qVar3 = qVar;
        }
        ArrayList arrayList2 = qVar3.f4884a;
        if (arrayList2.contains(gVar)) {
            return qVar3;
        }
        arrayList2.add(gVar);
        if (gVar instanceof e5.l) {
            e5.l lVar = (e5.l) gVar;
            e5.d dVar = lVar.f4364w0;
            if (lVar.f4365x0 == 0) {
                i12 = 1;
            }
            dVar.c(i12, qVar3, arrayList);
        }
        int i17 = qVar3.f4885b;
        if (i2 == 0) {
            gVar.f4321r0 = i17;
            gVar.I.c(i2, qVar3, arrayList);
            gVar.K.c(i2, qVar3, arrayList);
        } else {
            gVar.f4323s0 = i17;
            gVar.J.c(i2, qVar3, arrayList);
            gVar.M.c(i2, qVar3, arrayList);
            gVar.L.c(i2, qVar3, arrayList);
        }
        gVar.P.c(i2, qVar3, arrayList);
        return qVar3;
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, f5.b] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, f5.b] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, f5.b] */
    public static void c(int i2, e5.g gVar, i5.g gVar2, boolean z10) {
        boolean z11;
        e5.d dVar;
        e5.d dVar2;
        char c4;
        char c10;
        e5.d dVar3;
        e5.d dVar4;
        if (!gVar.m) {
            if (!(gVar instanceof e5.h) && gVar.A() && a(gVar)) {
                e5.h.W(gVar, gVar2, new Object());
            }
            e5.d j2 = gVar.j(e5.c.LEFT);
            e5.d j10 = gVar.j(e5.c.RIGHT);
            int d4 = j2.d();
            int d10 = j10.d();
            HashSet hashSet = j2.f4278a;
            if (hashSet != null && j2.f4280c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    e5.d dVar5 = (e5.d) it.next();
                    e5.g gVar3 = dVar5.f4281d;
                    int i10 = i2 + 1;
                    boolean a10 = a(gVar3);
                    e5.d dVar6 = gVar3.I;
                    e5.d dVar7 = gVar3.K;
                    if (gVar3.A() && a10) {
                        c4 = 0;
                        e5.h.W(gVar3, gVar2, new Object());
                    } else {
                        c4 = 0;
                    }
                    if ((dVar5 == dVar6 && (dVar4 = dVar7.f4283f) != null && dVar4.f4280c) || (dVar5 == dVar7 && (dVar3 = dVar6.f4283f) != null && dVar3.f4280c)) {
                        c10 = 1;
                    } else {
                        c10 = c4;
                    }
                    e5.f fVar = gVar3.T[c4];
                    e5.f fVar2 = e5.f.MATCH_CONSTRAINT;
                    if (fVar == fVar2 && !a10) {
                        if (fVar == fVar2 && gVar3.f4326v >= 0 && gVar3.f4325u >= 0 && (gVar3.f4303h0 == 8 || (gVar3.f4320r == 0 && gVar3.X == 0.0f))) {
                            if (!gVar3.y() && !gVar3.F && c10 != 0 && !gVar3.y()) {
                                e(i10, gVar, gVar2, gVar3, z10);
                            }
                        }
                    } else if (!gVar3.A()) {
                        if (dVar5 == dVar6 && dVar7.f4283f == null) {
                            int e6 = dVar6.e() + d4;
                            gVar3.K(e6, gVar3.r() + e6);
                            c(i10, gVar3, gVar2, z10);
                        } else if (dVar5 == dVar7 && dVar6.f4283f == null) {
                            int e10 = d4 - dVar7.e();
                            gVar3.K(e10 - gVar3.r(), e10);
                            c(i10, gVar3, gVar2, z10);
                        } else if (c10 != 0 && !gVar3.y()) {
                            d(i10, gVar3, gVar2, z10);
                        }
                    }
                }
            }
            if (gVar instanceof e5.l) {
                return;
            }
            HashSet hashSet2 = j10.f4278a;
            if (hashSet2 != null && j10.f4280c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    e5.d dVar8 = (e5.d) it2.next();
                    e5.g gVar4 = dVar8.f4281d;
                    int i11 = i2 + 1;
                    boolean a11 = a(gVar4);
                    e5.d dVar9 = gVar4.I;
                    e5.d dVar10 = gVar4.K;
                    if (gVar4.A() && a11) {
                        e5.h.W(gVar4, gVar2, new Object());
                    }
                    if ((dVar8 == dVar9 && (dVar2 = dVar10.f4283f) != null && dVar2.f4280c) || (dVar8 == dVar10 && (dVar = dVar9.f4283f) != null && dVar.f4280c)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e5.f fVar3 = gVar4.T[0];
                    e5.f fVar4 = e5.f.MATCH_CONSTRAINT;
                    if (fVar3 == fVar4 && !a11) {
                        if (fVar3 == fVar4 && gVar4.f4326v >= 0 && gVar4.f4325u >= 0) {
                            if (gVar4.f4303h0 == 8 || (gVar4.f4320r == 0 && gVar4.X == 0.0f)) {
                                if (!gVar4.y() && !gVar4.F && z11 && !gVar4.y()) {
                                    e(i11, gVar, gVar2, gVar4, z10);
                                }
                            }
                        }
                    } else if (!gVar4.A()) {
                        if (dVar8 == dVar9 && dVar10.f4283f == null) {
                            int e11 = dVar9.e() + d10;
                            gVar4.K(e11, gVar4.r() + e11);
                            c(i11, gVar4, gVar2, z10);
                        } else if (dVar8 == dVar10 && dVar9.f4283f == null) {
                            int e12 = d10 - dVar10.e();
                            gVar4.K(e12 - gVar4.r(), e12);
                            c(i11, gVar4, gVar2, z10);
                        } else if (z11 && !gVar4.y()) {
                            d(i11, gVar4, gVar2, z10);
                        }
                    }
                }
            }
            gVar.m = true;
        }
    }

    public static void d(int i2, e5.g gVar, i5.g gVar2, boolean z10) {
        float f8;
        float f10 = gVar.f4297e0;
        e5.d dVar = gVar.I;
        int d4 = dVar.f4283f.d();
        e5.d dVar2 = gVar.K;
        int d10 = dVar2.f4283f.d();
        int e6 = dVar.e() + d4;
        int e10 = d10 - dVar2.e();
        if (d4 == d10) {
            f10 = 0.5f;
        } else {
            d4 = e6;
            d10 = e10;
        }
        int r5 = gVar.r();
        int i10 = (d10 - d4) - r5;
        if (d4 > d10) {
            i10 = (d4 - d10) - r5;
        }
        if (i10 > 0) {
            f8 = (f10 * i10) + 0.5f;
        } else {
            f8 = f10 * i10;
        }
        int i11 = ((int) f8) + d4;
        int i12 = i11 + r5;
        if (d4 > d10) {
            i12 = i11 - r5;
        }
        gVar.K(i11, i12);
        c(i2 + 1, gVar, gVar2, z10);
    }

    public static void e(int i2, e5.g gVar, i5.g gVar2, e5.g gVar3, boolean z10) {
        int r5;
        float f8 = gVar3.f4297e0;
        e5.d dVar = gVar3.I;
        int e6 = dVar.e() + dVar.f4283f.d();
        e5.d dVar2 = gVar3.K;
        int d4 = dVar2.f4283f.d() - dVar2.e();
        if (d4 >= e6) {
            int r10 = gVar3.r();
            if (gVar3.f4303h0 != 8) {
                int i10 = gVar3.f4320r;
                if (i10 == 2) {
                    if (gVar instanceof e5.h) {
                        r5 = gVar.r();
                    } else {
                        r5 = gVar.U.r();
                    }
                    r10 = (int) (gVar3.f4297e0 * 0.5f * r5);
                } else if (i10 == 0) {
                    r10 = d4 - e6;
                }
                r10 = Math.max(gVar3.f4325u, r10);
                int i11 = gVar3.f4326v;
                if (i11 > 0) {
                    r10 = Math.min(i11, r10);
                }
            }
            int i12 = e6 + ((int) ((f8 * ((d4 - e6) - r10)) + 0.5f));
            gVar3.K(i12, r10 + i12);
            c(i2 + 1, gVar3, gVar2, z10);
        }
    }

    public static void f(int i2, e5.g gVar, i5.g gVar2) {
        float f8;
        float f10 = gVar.f4299f0;
        e5.d dVar = gVar.J;
        int d4 = dVar.f4283f.d();
        e5.d dVar2 = gVar.L;
        int d10 = dVar2.f4283f.d();
        int e6 = dVar.e() + d4;
        int e10 = d10 - dVar2.e();
        if (d4 == d10) {
            f10 = 0.5f;
        } else {
            d4 = e6;
            d10 = e10;
        }
        int l10 = gVar.l();
        int i10 = (d10 - d4) - l10;
        if (d4 > d10) {
            i10 = (d4 - d10) - l10;
        }
        if (i10 > 0) {
            f8 = (f10 * i10) + 0.5f;
        } else {
            f8 = f10 * i10;
        }
        int i11 = (int) f8;
        int i12 = d4 + i11;
        int i13 = i12 + l10;
        if (d4 > d10) {
            i12 = d4 - i11;
            i13 = i12 - l10;
        }
        gVar.L(i12, i13);
        i(i2 + 1, gVar, gVar2);
    }

    public static void g(int i2, e5.g gVar, i5.g gVar2, e5.g gVar3) {
        int l10;
        float f8 = gVar3.f4299f0;
        e5.d dVar = gVar3.J;
        int e6 = dVar.e() + dVar.f4283f.d();
        e5.d dVar2 = gVar3.L;
        int d4 = dVar2.f4283f.d() - dVar2.e();
        if (d4 >= e6) {
            int l11 = gVar3.l();
            if (gVar3.f4303h0 != 8) {
                int i10 = gVar3.f4322s;
                if (i10 == 2) {
                    if (gVar instanceof e5.h) {
                        l10 = gVar.l();
                    } else {
                        l10 = gVar.U.l();
                    }
                    l11 = (int) (f8 * 0.5f * l10);
                } else if (i10 == 0) {
                    l11 = d4 - e6;
                }
                l11 = Math.max(gVar3.f4328x, l11);
                int i11 = gVar3.f4329y;
                if (i11 > 0) {
                    l11 = Math.min(i11, l11);
                }
            }
            int i12 = e6 + ((int) ((f8 * ((d4 - e6) - l11)) + 0.5f));
            gVar3.L(i12, l11 + i12);
            i(i2 + 1, gVar3, gVar2);
        }
    }

    public static boolean h(e5.f fVar, e5.f fVar2, e5.f fVar3, e5.f fVar4) {
        boolean z10;
        boolean z11;
        e5.f fVar5;
        e5.f fVar6;
        e5.f fVar7 = e5.f.FIXED;
        if (fVar3 != fVar7 && fVar3 != (fVar6 = e5.f.WRAP_CONTENT) && (fVar3 != e5.f.MATCH_PARENT || fVar == fVar6)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar4 != fVar7 && fVar4 != (fVar5 = e5.f.WRAP_CONTENT) && (fVar4 != e5.f.MATCH_PARENT || fVar2 == fVar5)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, f5.b] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, f5.b] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, f5.b] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, f5.b] */
    public static void i(int i2, e5.g gVar, i5.g gVar2) {
        boolean z10;
        boolean z11;
        char c4;
        e5.d dVar;
        e5.d dVar2;
        float f8;
        char c10;
        e5.d dVar3;
        e5.d dVar4;
        if (!gVar.f4313n) {
            if (!(gVar instanceof e5.h) && gVar.A() && a(gVar)) {
                e5.h.W(gVar, gVar2, new Object());
            }
            e5.d j2 = gVar.j(e5.c.TOP);
            e5.d j10 = gVar.j(e5.c.BOTTOM);
            int d4 = j2.d();
            int d10 = j10.d();
            HashSet hashSet = j2.f4278a;
            char c11 = 1;
            if (hashSet != null && j2.f4280c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    e5.d dVar5 = (e5.d) it.next();
                    e5.g gVar3 = dVar5.f4281d;
                    int i10 = i2 + 1;
                    boolean a10 = a(gVar3);
                    e5.d dVar6 = gVar3.J;
                    e5.d dVar7 = gVar3.L;
                    if (gVar3.A() && a10) {
                        f8 = 0.0f;
                        e5.h.W(gVar3, gVar2, new Object());
                    } else {
                        f8 = 0.0f;
                    }
                    if ((dVar5 == dVar6 && (dVar4 = dVar7.f4283f) != null && dVar4.f4280c) || (dVar5 == dVar7 && (dVar3 = dVar6.f4283f) != null && dVar3.f4280c)) {
                        c10 = c11;
                    } else {
                        c10 = 0;
                    }
                    e5.f fVar = gVar3.T[c11];
                    char c12 = c11;
                    e5.f fVar2 = e5.f.MATCH_CONSTRAINT;
                    if (fVar == fVar2 && !a10) {
                        if (fVar == fVar2 && gVar3.f4329y >= 0 && gVar3.f4328x >= 0 && ((gVar3.f4303h0 == 8 || (gVar3.f4322s == 0 && gVar3.X == f8)) && !gVar3.z() && !gVar3.F && c10 != 0 && !gVar3.z())) {
                            g(i10, gVar, gVar2, gVar3);
                        }
                    } else if (!gVar3.A()) {
                        if (dVar5 == dVar6 && dVar7.f4283f == null) {
                            int e6 = dVar6.e() + d4;
                            gVar3.L(e6, gVar3.l() + e6);
                            i(i10, gVar3, gVar2);
                        } else if (dVar5 == dVar7 && dVar6.f4283f == null) {
                            int e10 = d4 - dVar7.e();
                            gVar3.L(e10 - gVar3.l(), e10);
                            i(i10, gVar3, gVar2);
                        } else if (c10 != 0 && !gVar3.z()) {
                            f(i10, gVar3, gVar2);
                        }
                    }
                    c11 = c12;
                }
            }
            char c13 = c11;
            if (gVar instanceof e5.l) {
                return;
            }
            HashSet hashSet2 = j10.f4278a;
            if (hashSet2 != null && j10.f4280c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    e5.d dVar8 = (e5.d) it2.next();
                    e5.g gVar4 = dVar8.f4281d;
                    int i11 = i2 + 1;
                    boolean a11 = a(gVar4);
                    e5.d dVar9 = gVar4.J;
                    e5.d dVar10 = gVar4.L;
                    if (gVar4.A() && a11) {
                        e5.h.W(gVar4, gVar2, new Object());
                    }
                    if ((dVar8 == dVar9 && (dVar2 = dVar10.f4283f) != null && dVar2.f4280c) || (dVar8 == dVar10 && (dVar = dVar9.f4283f) != null && dVar.f4280c)) {
                        c4 = c13;
                    } else {
                        c4 = 0;
                    }
                    e5.f fVar3 = gVar4.T[c13];
                    e5.f fVar4 = e5.f.MATCH_CONSTRAINT;
                    if (fVar3 == fVar4 && !a11) {
                        if (fVar3 == fVar4 && gVar4.f4329y >= 0 && gVar4.f4328x >= 0 && (gVar4.f4303h0 == 8 || (gVar4.f4322s == 0 && gVar4.X == 0.0f))) {
                            if (!gVar4.z() && !gVar4.F && c4 != 0 && !gVar4.z()) {
                                g(i11, gVar, gVar2, gVar4);
                            }
                        }
                    } else if (!gVar4.A()) {
                        if (dVar8 == dVar9 && dVar10.f4283f == null) {
                            int e11 = dVar9.e() + d10;
                            gVar4.L(e11, gVar4.l() + e11);
                            i(i11, gVar4, gVar2);
                        } else if (dVar8 == dVar10 && dVar9.f4283f == null) {
                            int e12 = d10 - dVar10.e();
                            gVar4.L(e12 - gVar4.l(), e12);
                            i(i11, gVar4, gVar2);
                        } else if (c4 != 0 && !gVar4.z()) {
                            f(i11, gVar4, gVar2);
                        }
                    }
                }
            }
            e5.d j11 = gVar.j(e5.c.BASELINE);
            if (j11.f4278a != null && j11.f4280c) {
                int d11 = j11.d();
                Iterator it3 = j11.f4278a.iterator();
                while (it3.hasNext()) {
                    e5.d dVar11 = (e5.d) it3.next();
                    e5.g gVar5 = dVar11.f4281d;
                    int i12 = i2 + 1;
                    boolean a12 = a(gVar5);
                    e5.d dVar12 = gVar5.M;
                    if (gVar5.A() && a12) {
                        e5.h.W(gVar5, gVar2, new Object());
                    }
                    if (gVar5.T[c13 == 1 ? 1 : 0] != e5.f.MATCH_CONSTRAINT || a12) {
                        if (!gVar5.A()) {
                            if (dVar11 == dVar12) {
                                int e13 = dVar11.e() + d11;
                                if (!gVar5.E) {
                                    z10 = c13 == 1 ? 1 : 0;
                                } else {
                                    int i13 = e13 - gVar5.f4291b0;
                                    int i14 = gVar5.W + i13;
                                    gVar5.f4289a0 = i13;
                                    gVar5.J.l(i13);
                                    gVar5.L.l(i14);
                                    dVar12.l(e13);
                                    boolean z12 = c13 == 1 ? 1 : 0;
                                    gVar5.f4310l = z12;
                                    z10 = z12;
                                }
                                i(i12, gVar5, gVar2);
                                z11 = z10;
                                c13 = z11;
                            }
                        }
                    }
                    z11 = c13 == 1 ? 1 : 0;
                    c13 = z11;
                }
            }
            gVar.f4313n = c13;
        }
    }
}
