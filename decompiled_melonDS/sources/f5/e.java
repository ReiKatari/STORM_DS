package f5;

import ah.m1;
import android.content.Context;
import f1.k0;
import fj.x;
import g2.l5;
import j7.e0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4854a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4855b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4856c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4857d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4858e;

    /* renamed from: f  reason: collision with root package name */
    public Object f4859f;

    /* renamed from: g  reason: collision with root package name */
    public Object f4860g;

    /* renamed from: h  reason: collision with root package name */
    public Object f4861h;

    /* renamed from: i  reason: collision with root package name */
    public Object f4862i;

    public e(k7.b bVar, e0 e0Var, k0 k0Var) {
        int i2;
        m7.e eVar;
        Object obj;
        this.f4854a = 2;
        k7.s sVar = bVar.f7995g;
        u7.b bVar2 = bVar.f7991c;
        t7.b bVar3 = bVar.f8003p;
        String str = bVar.f7990b;
        this.f4857d = bVar;
        this.f4858e = e0Var;
        Object obj2 = bVar.f7993e;
        this.f4859f = obj2 == null ? zb.q.A : obj2;
        if (bVar3 == null) {
            if (bVar2 != null) {
                Context context = bVar.f7989a;
                context.getClass();
                u7.c e6 = bVar2.e(new u7.a(context, str, new bk.a(this, e0Var.f7541a), false, false));
                this.f4861h = e6;
                this.f4860g = new m7.r(new rd.k(e6), str == null ? ":memory:" : str, k0Var);
            } else {
                a0.j.h("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
        } else {
            this.f4861h = null;
            if (bVar3.k()) {
                obj = new m7.r(new jb.c(this, bVar3), str == null ? ":memory:" : str, k0Var);
            } else {
                if (str == null) {
                    eVar = new m7.e(new jb.c(this, bVar3));
                } else {
                    jb.c cVar = new jb.c(this, bVar3);
                    sVar.getClass();
                    int[] iArr = k7.a.f7988a;
                    int i10 = iArr[sVar.ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i2 = 4;
                        } else {
                            throw new IllegalStateException(("Can't get max number of reader for journal mode '" + sVar + '\'').toString());
                        }
                    } else {
                        i2 = 1;
                    }
                    int i11 = iArr[sVar.ordinal()];
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + sVar + '\'').toString());
                    }
                    eVar = new m7.e(cVar, str, i2);
                }
                obj = eVar;
            }
            this.f4860g = obj;
        }
        boolean z10 = sVar == k7.s.WRITE_AHEAD_LOGGING;
        u7.c cVar2 = (u7.c) this.f4861h;
        if (cVar2 != null) {
            cVar2.setWriteAheadLoggingEnabled(z10);
        }
    }

    public static final void a(e eVar, t7.a aVar) {
        Object kVar;
        e0 e0Var = (e0) eVar.f4858e;
        f(aVar);
        k7.b bVar = (k7.b) eVar.f4857d;
        k7.s sVar = bVar.f7995g;
        k7.s sVar2 = k7.s.WRITE_AHEAD_LOGGING;
        if (sVar == sVar2) {
            zb.k.r(aVar, "PRAGMA journal_mode = WAL");
        } else {
            zb.k.r(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (bVar.f7995g == sVar2) {
            zb.k.r(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            zb.k.r(aVar, "PRAGMA synchronous = FULL");
        }
        t7.c T = aVar.T("PRAGMA user_version");
        try {
            T.N();
            int i2 = (int) T.getLong(0);
            q8.r.q(T, null);
            int i10 = e0Var.f7541a;
            if (i2 != i10) {
                zb.k.r(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i2 == 0) {
                        eVar.j(aVar);
                    } else {
                        eVar.k(aVar, i2, i10);
                    }
                    zb.k.r(aVar, "PRAGMA user_version = " + i10);
                    kVar = y.f14813a;
                } catch (Throwable th2) {
                    kVar = new yb.k(th2);
                }
                if (!(kVar instanceof yb.k)) {
                    y yVar = (y) kVar;
                    zb.k.r(aVar, "END TRANSACTION");
                }
                Throwable a10 = yb.l.a(kVar);
                if (a10 != null) {
                    zb.k.r(aVar, "ROLLBACK TRANSACTION");
                    throw a10;
                }
            }
            eVar.l(aVar);
        } finally {
        }
    }

    public static void f(t7.a aVar) {
        t7.c T = aVar.T("PRAGMA busy_timeout");
        try {
            T.N();
            long j2 = T.getLong(0);
            q8.r.q(T, null);
            if (j2 < 3000) {
                zb.k.r(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                q8.r.q(T, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [f5.n, java.lang.Object] */
    public void b(g gVar, int i2, ArrayList arrayList, n nVar) {
        t tVar = gVar.f4866d;
        n nVar2 = tVar.f4892c;
        g gVar2 = tVar.f4898i;
        g gVar3 = tVar.f4897h;
        if (nVar2 == null) {
            e5.h hVar = (e5.h) this.f4857d;
            if (tVar != hVar.f4294d) {
                n nVar3 = nVar;
                if (tVar != hVar.f4296e) {
                    if (nVar == null) {
                        ?? obj = new Object();
                        obj.f4878a = null;
                        obj.f4879b = new ArrayList();
                        obj.f4878a = tVar;
                        arrayList.add(obj);
                        nVar3 = obj;
                    }
                    tVar.f4892c = nVar3;
                    nVar3.f4879b.add(tVar);
                    ArrayList arrayList2 = gVar3.f4873k;
                    int size = arrayList2.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        d dVar = (d) obj2;
                        if (dVar instanceof g) {
                            b((g) dVar, i2, arrayList, nVar3);
                        }
                    }
                    ArrayList arrayList3 = gVar2.f4873k;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        d dVar2 = (d) obj3;
                        if (dVar2 instanceof g) {
                            b((g) dVar2, i2, arrayList, nVar3);
                        }
                    }
                    if (i2 == 1 && (tVar instanceof p)) {
                        ArrayList arrayList4 = ((p) tVar).f4881k.f4873k;
                        int size3 = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj4 = arrayList4.get(i13);
                            i13++;
                            d dVar3 = (d) obj4;
                            if (dVar3 instanceof g) {
                                b((g) dVar3, i2, arrayList, nVar3);
                            }
                        }
                    }
                    ArrayList arrayList5 = gVar3.f4874l;
                    int size4 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size4) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        b((g) obj5, i2, arrayList, nVar3);
                    }
                    ArrayList arrayList6 = gVar2.f4874l;
                    int size5 = arrayList6.size();
                    int i15 = 0;
                    while (i15 < size5) {
                        Object obj6 = arrayList6.get(i15);
                        i15++;
                        b((g) obj6, i2, arrayList, nVar3);
                    }
                    if (i2 == 1 && (tVar instanceof p)) {
                        ArrayList arrayList7 = ((p) tVar).f4881k.f4874l;
                        int size6 = arrayList7.size();
                        while (i10 < size6) {
                            Object obj7 = arrayList7.get(i10);
                            i10++;
                            b((g) obj7, i2, arrayList, nVar3);
                        }
                    }
                }
            }
        }
    }

    public void c(e5.h hVar) {
        float f8;
        ArrayList arrayList;
        e5.f fVar;
        e5.f fVar2;
        e5.f fVar3;
        e5.f fVar4;
        ArrayList arrayList2 = hVar.f4331t0;
        int size = arrayList2.size();
        char c4 = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            e5.g gVar = (e5.g) obj;
            e5.f[] fVarArr = gVar.T;
            e5.d[] dVarArr = gVar.Q;
            e5.d dVar = gVar.L;
            e5.d dVar2 = gVar.J;
            e5.d dVar3 = gVar.K;
            e5.d dVar4 = gVar.I;
            e5.f fVar5 = fVarArr[c4];
            e5.f fVar6 = fVarArr[1];
            if (gVar.f4303h0 == 8) {
                gVar.f4288a = true;
            } else {
                float f10 = gVar.f4327w;
                char c10 = c4;
                if (f10 < 1.0f) {
                    f8 = 1.0f;
                    if (fVar5 == e5.f.MATCH_CONSTRAINT) {
                        gVar.f4320r = 2;
                    }
                } else {
                    f8 = 1.0f;
                }
                float f11 = gVar.f4330z;
                if (f11 < f8 && fVar6 == e5.f.MATCH_CONSTRAINT) {
                    gVar.f4322s = 2;
                }
                if (gVar.X > 0.0f) {
                    e5.f fVar7 = e5.f.MATCH_CONSTRAINT;
                    if (fVar5 != fVar7 || (fVar6 != e5.f.WRAP_CONTENT && fVar6 != e5.f.FIXED)) {
                        int i10 = 3;
                        if (fVar6 == fVar7) {
                            if (fVar5 != e5.f.WRAP_CONTENT && fVar5 != e5.f.FIXED) {
                                i10 = 3;
                            } else {
                                gVar.f4322s = 3;
                            }
                        }
                        if (fVar5 == fVar7 && fVar6 == fVar7) {
                            if (gVar.f4320r == 0) {
                                gVar.f4320r = i10;
                            }
                            if (gVar.f4322s == 0) {
                                gVar.f4322s = i10;
                            }
                        }
                    } else {
                        gVar.f4320r = 3;
                    }
                }
                e5.f fVar8 = e5.f.MATCH_CONSTRAINT;
                if (fVar5 == fVar8) {
                    arrayList = arrayList2;
                    if (gVar.f4320r == 1 && (dVar4.f4283f == null || dVar3.f4283f == null)) {
                        fVar5 = e5.f.WRAP_CONTENT;
                    }
                } else {
                    arrayList = arrayList2;
                }
                if (fVar6 == fVar8 && gVar.f4322s == 1 && (dVar2.f4283f == null || dVar.f4283f == null)) {
                    fVar6 = e5.f.WRAP_CONTENT;
                }
                m mVar = gVar.f4294d;
                mVar.f4893d = fVar5;
                int i11 = gVar.f4320r;
                mVar.f4890a = i11;
                p pVar = gVar.f4296e;
                pVar.f4893d = fVar6;
                int i12 = size;
                int i13 = gVar.f4322s;
                pVar.f4890a = i13;
                e5.f fVar9 = e5.f.MATCH_PARENT;
                if ((fVar5 != fVar9 && fVar5 != e5.f.FIXED && fVar5 != e5.f.WRAP_CONTENT) || (fVar6 != fVar9 && fVar6 != e5.f.FIXED && fVar6 != e5.f.WRAP_CONTENT)) {
                    if (fVar5 != fVar8 || (fVar6 != (fVar4 = e5.f.WRAP_CONTENT) && fVar6 != e5.f.FIXED)) {
                        fVar = fVar6;
                    } else if (i11 == 3) {
                        if (fVar6 == fVar4) {
                            h(gVar, fVar4, 0, fVar4, 0);
                        }
                        int l10 = gVar.l();
                        e5.f fVar10 = e5.f.FIXED;
                        h(gVar, fVar10, (int) ((l10 * gVar.X) + 0.5f), fVar10, l10);
                        gVar.f4294d.f4894e.d(gVar.r());
                        gVar.f4296e.f4894e.d(gVar.l());
                        gVar.f4288a = true;
                    } else if (i11 == 1) {
                        h(gVar, fVar4, 0, fVar6, 0);
                        gVar.f4294d.f4894e.m = gVar.r();
                    } else {
                        fVar = fVar6;
                        if (i11 == 2) {
                            e5.f fVar11 = hVar.T[c10];
                            e5.f fVar12 = e5.f.FIXED;
                            if (fVar11 == fVar12 || fVar11 == fVar9) {
                                h(gVar, fVar12, (int) ((f10 * hVar.r()) + 0.5f), fVar, gVar.l());
                                gVar.f4294d.f4894e.d(gVar.r());
                                gVar.f4296e.f4894e.d(gVar.l());
                                gVar.f4288a = true;
                            }
                        } else if (dVarArr[c10].f4283f == null || dVarArr[1].f4283f == null) {
                            h(gVar, fVar4, 0, fVar, 0);
                            gVar.f4294d.f4894e.d(gVar.r());
                            gVar.f4296e.f4894e.d(gVar.l());
                            gVar.f4288a = true;
                        }
                    }
                    if (fVar != fVar8 || (fVar5 != (fVar3 = e5.f.WRAP_CONTENT) && fVar5 != e5.f.FIXED)) {
                        fVar2 = fVar;
                    } else if (i13 == 3) {
                        if (fVar5 == fVar3) {
                            h(gVar, fVar3, 0, fVar3, 0);
                        }
                        int r5 = gVar.r();
                        float f12 = gVar.X;
                        if (gVar.Y == -1) {
                            f12 = f8 / f12;
                        }
                        e5.f fVar13 = e5.f.FIXED;
                        h(gVar, fVar13, r5, fVar13, (int) ((r5 * f12) + 0.5f));
                        gVar.f4294d.f4894e.d(gVar.r());
                        gVar.f4296e.f4894e.d(gVar.l());
                        gVar.f4288a = true;
                    } else if (i13 == 1) {
                        h(gVar, fVar5, 0, fVar3, 0);
                        gVar.f4296e.f4894e.m = gVar.l();
                    } else {
                        e5.f fVar14 = fVar5;
                        if (i13 == 2) {
                            e5.f fVar15 = hVar.T[1];
                            fVar2 = fVar;
                            e5.f fVar16 = e5.f.FIXED;
                            if (fVar15 != fVar16 && fVar15 != fVar9) {
                                fVar5 = fVar14;
                            } else {
                                h(gVar, fVar14, gVar.r(), fVar16, (int) ((f11 * hVar.l()) + 0.5f));
                                gVar.f4294d.f4894e.d(gVar.r());
                                gVar.f4296e.f4894e.d(gVar.l());
                                gVar.f4288a = true;
                            }
                        } else {
                            fVar5 = fVar14;
                            fVar2 = fVar;
                            if (dVarArr[2].f4283f == null || dVarArr[3].f4283f == null) {
                                h(gVar, fVar3, 0, fVar2, 0);
                                gVar.f4294d.f4894e.d(gVar.r());
                                gVar.f4296e.f4894e.d(gVar.l());
                                gVar.f4288a = true;
                            }
                        }
                    }
                    if (fVar5 == fVar8 && fVar2 == fVar8) {
                        if (i11 != 1 && i13 != 1) {
                            if (i13 == 2 && i11 == 2) {
                                e5.f[] fVarArr2 = hVar.T;
                                e5.f fVar17 = fVarArr2[c10];
                                e5.f fVar18 = e5.f.FIXED;
                                if (fVar17 == fVar18 && fVarArr2[1] == fVar18) {
                                    h(gVar, fVar18, (int) ((f10 * hVar.r()) + 0.5f), fVar18, (int) ((f11 * hVar.l()) + 0.5f));
                                    gVar.f4294d.f4894e.d(gVar.r());
                                    gVar.f4296e.f4894e.d(gVar.l());
                                    gVar.f4288a = true;
                                }
                            }
                        } else {
                            e5.f fVar19 = e5.f.WRAP_CONTENT;
                            h(gVar, fVar19, 0, fVar19, 0);
                            gVar.f4294d.f4894e.m = gVar.r();
                            gVar.f4296e.f4894e.m = gVar.l();
                        }
                    }
                } else {
                    int r10 = gVar.r();
                    if (fVar5 == fVar9) {
                        r10 = (hVar.r() - dVar4.f4284g) - dVar3.f4284g;
                        fVar5 = e5.f.FIXED;
                    }
                    int l11 = gVar.l();
                    if (fVar6 == fVar9) {
                        l11 = (hVar.l() - dVar2.f4284g) - dVar.f4284g;
                        fVar6 = e5.f.FIXED;
                    }
                    h(gVar, fVar5, r10, fVar6, l11);
                    gVar.f4294d.f4894e.d(gVar.r());
                    gVar.f4296e.f4894e.d(gVar.l());
                    gVar.f4288a = true;
                }
                c4 = c10;
                arrayList2 = arrayList;
                size = i12;
                i2 = i2;
            }
        }
    }

    public void d() {
        e5.h hVar = (e5.h) this.f4857d;
        ArrayList arrayList = (ArrayList) this.f4860g;
        ArrayList arrayList2 = (ArrayList) this.f4859f;
        arrayList2.clear();
        e5.h hVar2 = (e5.h) this.f4858e;
        hVar2.f4294d.f();
        hVar2.f4296e.f();
        arrayList2.add(hVar2.f4294d);
        arrayList2.add(hVar2.f4296e);
        ArrayList arrayList3 = hVar2.f4331t0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            e5.g gVar = (e5.g) obj;
            if (gVar instanceof e5.l) {
                t tVar = new t(gVar);
                gVar.f4294d.f();
                gVar.f4296e.f();
                tVar.f4895f = ((e5.l) gVar).f4365x0;
                arrayList2.add(tVar);
            } else {
                if (gVar.y()) {
                    if (gVar.f4290b == null) {
                        gVar.f4290b = new c(gVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gVar.f4290b);
                } else {
                    arrayList2.add(gVar.f4294d);
                }
                if (gVar.z()) {
                    if (gVar.f4292c == null) {
                        gVar.f4292c = new c(gVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gVar.f4292c);
                } else {
                    arrayList2.add(gVar.f4296e);
                }
                if (gVar instanceof e5.m) {
                    arrayList2.add(new t(gVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((t) obj2).f();
        }
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            t tVar2 = (t) obj3;
            if (tVar2.f4891b != hVar2) {
                tVar2.d();
            }
        }
        arrayList.clear();
        g(hVar.f4294d, 0, arrayList);
        g(hVar.f4296e, 1, arrayList);
        this.f4855b = false;
    }

    public int e(e5.h hVar, int i2) {
        t tVar;
        t tVar2;
        ArrayList arrayList;
        int i10;
        long j2;
        float f8;
        long j10;
        e5.h hVar2 = hVar;
        ArrayList arrayList2 = (ArrayList) this.f4860g;
        int size = arrayList2.size();
        long j11 = 0;
        int i11 = 0;
        long j12 = 0;
        while (i11 < size) {
            t tVar3 = ((n) arrayList2.get(i11)).f4878a;
            if (!(tVar3 instanceof c) ? !(i2 != 0 ? (tVar3 instanceof p) : (tVar3 instanceof m)) : ((c) tVar3).f4895f != i2) {
                arrayList = arrayList2;
                i10 = size;
                j2 = j11;
            } else {
                if (i2 == 0) {
                    tVar = hVar2.f4294d;
                } else {
                    tVar = hVar2.f4296e;
                }
                g gVar = tVar.f4897h;
                if (i2 == 0) {
                    tVar2 = hVar2.f4294d;
                } else {
                    tVar2 = hVar2.f4296e;
                }
                g gVar2 = tVar2.f4898i;
                g gVar3 = tVar3.f4897h;
                g gVar4 = tVar3.f4898i;
                boolean contains = gVar3.f4874l.contains(gVar);
                boolean contains2 = gVar4.f4874l.contains(gVar2);
                long j13 = tVar3.j();
                if (contains && contains2) {
                    long b10 = n.b(gVar3, j11);
                    long a10 = n.a(gVar4, j11);
                    long j14 = b10 - j13;
                    int i12 = gVar4.f4868f;
                    arrayList = arrayList2;
                    i10 = size;
                    if (j14 >= (-i12)) {
                        j14 += i12;
                    }
                    long j15 = gVar3.f4868f;
                    long j16 = ((-a10) - j13) - j15;
                    if (j16 >= j15) {
                        j16 -= j15;
                    }
                    e5.g gVar5 = tVar3.f4891b;
                    if (i2 == 0) {
                        f8 = gVar5.f4297e0;
                    } else if (i2 == 1) {
                        f8 = gVar5.f4299f0;
                    } else {
                        gVar5.getClass();
                        f8 = -1.0f;
                    }
                    if (f8 > 0.0f) {
                        j10 = (((float) j14) / (1.0f - f8)) + (((float) j16) / f8);
                    } else {
                        j10 = 0;
                    }
                    float f10 = (float) j10;
                    j2 = (gVar3.f4868f + ((((f10 * f8) + 0.5f) + j13) + w.d.a(1.0f, f8, f10, 0.5f))) - gVar4.f4868f;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    if (contains) {
                        j2 = Math.max(n.b(gVar3, gVar3.f4868f), gVar3.f4868f + j13);
                    } else if (contains2) {
                        j2 = Math.max(-n.a(gVar4, gVar4.f4868f), (-gVar4.f4868f) + j13);
                    } else {
                        j2 = (tVar3.j() + gVar3.f4868f) - gVar4.f4868f;
                    }
                }
            }
            j12 = Math.max(j12, j2);
            i11++;
            hVar2 = hVar;
            arrayList2 = arrayList;
            size = i10;
            j11 = 0;
        }
        return (int) j12;
    }

    public void g(t tVar, int i2, ArrayList arrayList) {
        g gVar = tVar.f4897h;
        g gVar2 = tVar.f4898i;
        ArrayList arrayList2 = gVar.f4873k;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            d dVar = (d) obj;
            if (dVar instanceof g) {
                b((g) dVar, i2, arrayList, null);
            } else if (dVar instanceof t) {
                b(((t) dVar).f4897h, i2, arrayList, null);
            }
        }
        ArrayList arrayList3 = gVar2.f4873k;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof g) {
                b((g) dVar2, i2, arrayList, null);
            } else if (dVar2 instanceof t) {
                b(((t) dVar2).f4898i, i2, arrayList, null);
            }
        }
        if (i2 == 1) {
            ArrayList arrayList4 = ((p) tVar).f4881k.f4873k;
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj3 = arrayList4.get(i10);
                i10++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof g) {
                    b((g) dVar3, i2, arrayList, null);
                }
            }
        }
    }

    public void h(e5.g gVar, e5.f fVar, int i2, e5.f fVar2, int i10) {
        b bVar = (b) this.f4862i;
        bVar.f4842a = fVar;
        bVar.f4843b = fVar2;
        bVar.f4844c = i2;
        bVar.f4845d = i10;
        ((i5.g) this.f4861h).b(gVar, bVar);
        gVar.P(bVar.f4846e);
        gVar.M(bVar.f4847f);
        gVar.E = bVar.f4849h;
        gVar.J(bVar.f4848g);
    }

    public void i() {
        boolean z10;
        boolean z11;
        a aVar;
        ArrayList arrayList = ((e5.h) this.f4857d).f4331t0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            e5.g gVar = (e5.g) obj;
            if (!gVar.f4288a) {
                e5.f[] fVarArr = gVar.T;
                e5.f fVar = fVarArr[0];
                e5.f fVar2 = fVarArr[1];
                int i10 = gVar.f4320r;
                int i11 = gVar.f4322s;
                e5.f fVar3 = e5.f.WRAP_CONTENT;
                if (fVar != fVar3 && (fVar != e5.f.MATCH_CONSTRAINT || i10 != 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (fVar2 != fVar3 && (fVar2 != e5.f.MATCH_CONSTRAINT || i11 != 1)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                h hVar = gVar.f4294d.f4894e;
                boolean z12 = hVar.f4872j;
                h hVar2 = gVar.f4296e.f4894e;
                boolean z13 = hVar2.f4872j;
                if (z12 && z13) {
                    e5.f fVar4 = e5.f.FIXED;
                    h(gVar, fVar4, hVar.f4869g, fVar4, hVar2.f4869g);
                    gVar.f4288a = true;
                } else if (z12 && z11) {
                    h(gVar, e5.f.FIXED, hVar.f4869g, fVar3, hVar2.f4869g);
                    e5.f fVar5 = e5.f.MATCH_CONSTRAINT;
                    p pVar = gVar.f4296e;
                    if (fVar2 == fVar5) {
                        pVar.f4894e.m = gVar.l();
                    } else {
                        pVar.f4894e.d(gVar.l());
                        gVar.f4288a = true;
                    }
                } else if (z13 && z10) {
                    h(gVar, fVar3, hVar.f4869g, e5.f.FIXED, hVar2.f4869g);
                    e5.f fVar6 = e5.f.MATCH_CONSTRAINT;
                    m mVar = gVar.f4294d;
                    if (fVar == fVar6) {
                        mVar.f4894e.m = gVar.r();
                    } else {
                        mVar.f4894e.d(gVar.r());
                        gVar.f4288a = true;
                    }
                }
                if (gVar.f4288a && (aVar = gVar.f4296e.f4882l) != null) {
                    aVar.d(gVar.f4291b0);
                }
            }
        }
    }

    public void j(t7.a aVar) {
        e0 e0Var = (e0) this.f4858e;
        aVar.getClass();
        t7.c T = aVar.T("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (T.N()) {
                if (T.getLong(0) == 0) {
                    z10 = true;
                }
            }
            q8.r.q(T, null);
            e0Var.a(aVar);
            if (!z10) {
                a0.l v10 = e0Var.v(aVar);
                if (!v10.A) {
                    fj.j.u((String) v10.B, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            m(aVar);
            e0Var.r(aVar);
            for (k7.r rVar : (List) this.f4859f) {
                rVar.getClass();
                if (aVar instanceof w7.a) {
                    rVar.a(((w7.a) aVar).A);
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                q8.r.q(T, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x00a4 A[EDGE_INSN: B:127:0x00a4->B:40:0x00a4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(t7.a r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.e.k(t7.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(t7.a r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.e.l(t7.a):void");
    }

    public void m(t7.a aVar) {
        zb.k.r(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        zb.k.r(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((e0) this.f4858e).f7542b) + "')");
    }

    public String toString() {
        switch (this.f4854a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                Map map = (Map) this.f4862i;
                Long l10 = (Long) this.f4861h;
                Long l11 = (Long) this.f4860g;
                Long l12 = (Long) this.f4859f;
                Long l13 = (Long) this.f4858e;
                ArrayList arrayList = new ArrayList();
                if (this.f4855b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f4856c) {
                    arrayList.add("isDirectory");
                }
                if (l13 != null) {
                    arrayList.add("byteCount=" + l13.longValue());
                }
                if (l12 != null) {
                    arrayList.add("createdAt=" + l12.longValue());
                }
                if (l11 != null) {
                    arrayList.add("lastModifiedAt=" + l11.longValue());
                }
                if (l10 != null) {
                    arrayList.add("lastAccessedAt=" + l10.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return zb.l.Y(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public e(k7.b bVar, l5 l5Var, k0 k0Var) {
        this.f4854a = 2;
        this.f4857d = bVar;
        this.f4858e = new e0("", -1, "");
        List list = bVar.f7993e;
        zb.q qVar = zb.q.A;
        this.f4859f = list == null ? qVar : list;
        zb.l.d0(list == null ? qVar : list, new k7.p(new a2.c(26, this)));
        Context context = bVar.f7989a;
        m1 m1Var = bVar.f7992d;
        k7.s sVar = bVar.f7995g;
        Executor executor = bVar.f7996h;
        Executor executor2 = bVar.f7997i;
        List list2 = bVar.m;
        List list3 = bVar.f8001n;
        context.getClass();
        m1Var.getClass();
        sVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        throw new yb.i(0);
    }

    public /* synthetic */ e() {
        this.f4854a = 0;
    }

    public e(boolean z10, boolean z11, x xVar, Long l10, Long l11, Long l12, Long l13, Map map) {
        this.f4854a = 1;
        map.getClass();
        this.f4855b = z10;
        this.f4856c = z11;
        this.f4857d = xVar;
        this.f4858e = l10;
        this.f4859f = l11;
        this.f4860g = l12;
        this.f4861h = l13;
        this.f4862i = v.I(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z10, boolean z11, x xVar, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, xVar, l10, l11, l12, l13, zb.r.A);
        this.f4854a = 1;
    }
}
