package z2;

import a1.n0;
import a1.v0;
import java.util.ArrayList;
import java.util.HashMap;
import n2.l1;
import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b extends f {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f14884n = new int[0];

    /* renamed from: e  reason: collision with root package name */
    public final mc.l f14885e;

    /* renamed from: f  reason: collision with root package name */
    public final mc.l f14886f;

    /* renamed from: g  reason: collision with root package name */
    public int f14887g;

    /* renamed from: h  reason: collision with root package name */
    public n0 f14888h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f14889i;

    /* renamed from: j  reason: collision with root package name */
    public j f14890j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f14891k;

    /* renamed from: l  reason: collision with root package name */
    public int f14892l;
    public boolean m;

    public b(long j2, j jVar, mc.l lVar, mc.l lVar2) {
        super(j2, jVar);
        this.f14885e = lVar;
        this.f14886f = lVar2;
        this.f14890j = j.X;
        this.f14891k = f14884n;
        this.f14892l = 1;
    }

    public final void A(long j2) {
        synchronized (l.f14919c) {
            this.f14890j = this.f14890j.e(j2);
        }
    }

    public void B(n0 n0Var) {
        this.f14888h = n0Var;
    }

    public b C(mc.l lVar, mc.l lVar2) {
        if (this.f14912c) {
            l1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.f14913d < 0) {
            l1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = l.f14919c;
        synchronized (obj) {
            try {
                long j2 = l.f14921e;
                long j10 = 1;
                l.f14921e = j2 + j10;
                l.f14920d = l.f14920d.e(j2);
                j d4 = d();
                r(d4.e(j2));
                try {
                    c cVar = new c(j2, l.d(d4, g() + j10, j2), l.k(lVar, e(), true), l.l(lVar2, i()), this);
                    if (!this.m && !this.f14912c) {
                        long g10 = g();
                        synchronized (obj) {
                            long j11 = l.f14921e;
                            l.f14921e = j11 + j10;
                            s(j11);
                            l.f14920d = l.f14920d.e(g());
                        }
                        r(l.d(d(), g10 + j10, g()));
                        return cVar;
                    }
                    return cVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // z2.f
    public final void b() {
        l.f14920d = l.f14920d.b(g()).a(this.f14890j);
    }

    @Override // z2.f
    public void c() {
        if (!this.f14912c) {
            this.f14912c = true;
            synchronized (l.f14919c) {
                o();
            }
            l();
        }
    }

    @Override // z2.f
    public boolean f() {
        return false;
    }

    @Override // z2.f
    public int h() {
        return this.f14887g;
    }

    @Override // z2.f
    public mc.l i() {
        return this.f14886f;
    }

    @Override // z2.f
    public void k() {
        this.f14892l++;
    }

    @Override // z2.f
    public void l() {
        if (this.f14892l <= 0) {
            l1.a("no pending nested snapshots");
        }
        int i2 = this.f14892l - 1;
        this.f14892l = i2;
        if (i2 == 0 && !this.m) {
            n0 x9 = x();
            if (x9 != null) {
                if (this.m) {
                    l1.b("Unsupported operation on a snapshot that has been applied");
                }
                B(null);
                long g10 = g();
                Object[] objArr = x9.f75b;
                long[] jArr = x9.f74a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j2 = jArr[i10];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j2) < 128) {
                                    for (a0 a10 = ((y) objArr[(i10 << 3) + i12]).a(); a10 != null; a10 = a10.f14883b) {
                                        long j10 = a10.f14882a;
                                        if (j10 == g10 || zb.l.N(this.f14890j, Long.valueOf(j10))) {
                                            h1 h1Var = l.f14917a;
                                            a10.f14882a = 0L;
                                        }
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            a();
        }
    }

    @Override // z2.f
    public void m() {
        if (!this.m && !this.f14912c) {
            v();
        }
    }

    @Override // z2.f
    public void n(y yVar) {
        n0 x9 = x();
        if (x9 == null) {
            n0 n0Var = v0.f110a;
            x9 = new n0();
            B(x9);
        }
        x9.a(yVar);
    }

    @Override // z2.f
    public final void p() {
        int length = this.f14891k.length;
        for (int i2 = 0; i2 < length; i2++) {
            l.u(this.f14891k[i2]);
        }
        o();
    }

    @Override // z2.f
    public void t(int i2) {
        this.f14887g = i2;
    }

    @Override // z2.f
    public f u(mc.l lVar) {
        if (this.f14912c) {
            l1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.f14913d < 0) {
            l1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g10 = g();
        A(g());
        Object obj = l.f14919c;
        synchronized (obj) {
            try {
                long j2 = l.f14921e;
                long j10 = 1;
                l.f14921e = j2 + j10;
                l.f14920d = l.f14920d.e(j2);
                try {
                    d dVar = new d(j2, l.d(d(), g10 + j10, j2), l.k(lVar, e(), true), this);
                    if (!this.m && !this.f14912c) {
                        long g11 = g();
                        synchronized (obj) {
                            long j11 = l.f14921e;
                            l.f14921e = j11 + j10;
                            s(j11);
                            l.f14920d = l.f14920d.e(g());
                        }
                        r(l.d(d(), g11 + j10, g()));
                        return dVar;
                    }
                    return dVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void v() {
        long j2;
        A(g());
        if (!this.m && !this.f14912c) {
            long g10 = g();
            synchronized (l.f14919c) {
                long j10 = l.f14921e;
                j2 = 1;
                l.f14921e = j10 + j2;
                s(j10);
                l.f14920d = l.f14920d.e(g());
            }
            r(l.d(d(), g10 + j2, g()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[LOOP:1: B:39:0x00a9->B:40:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z2.q w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.b.w():z2.q");
    }

    public n0 x() {
        return this.f14888h;
    }

    @Override // z2.f
    /* renamed from: y */
    public mc.l e() {
        return this.f14885e;
    }

    public final q z(long j2, n0 n0Var, HashMap hashMap, j jVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        j jVar2;
        Object[] objArr;
        long[] jArr;
        j jVar3;
        Object[] objArr2;
        long[] jArr2;
        int i2;
        long j10;
        ArrayList arrayList4;
        a0 b10;
        yb.j jVar4;
        ArrayList arrayList5;
        j d4 = d().e(g()).d(this.f14890j);
        Object[] objArr3 = n0Var.f75b;
        long[] jArr3 = n0Var.f74a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j11 = jArr3[i10];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j11 & 255) < 128) {
                            objArr2 = objArr3;
                            y yVar = (y) objArr3[(i10 << 3) + i12];
                            jArr2 = jArr3;
                            a0 a10 = yVar.a();
                            i2 = i12;
                            ArrayList arrayList6 = arrayList3;
                            a0 s10 = l.s(a10, j2, jVar);
                            if (s10 == null) {
                                jVar3 = d4;
                                arrayList4 = arrayList2;
                                j10 = j11;
                            } else {
                                arrayList4 = arrayList2;
                                j10 = j11;
                                a0 s11 = l.s(a10, g(), d4);
                                if (s11 == null) {
                                    jVar3 = d4;
                                } else {
                                    jVar3 = d4;
                                    if (s11.f14882a != 1 && !s10.equals(s11)) {
                                        a0 s12 = l.s(a10, g(), d());
                                        if (s12 != null) {
                                            if (hashMap == null || (b10 = (a0) hashMap.get(s10)) == null) {
                                                b10 = yVar.b(s11, s10, s12);
                                            }
                                            if (b10 == null) {
                                                return new g(this);
                                            }
                                            if (!b10.equals(s12)) {
                                                if (b10.equals(s10)) {
                                                    if (arrayList6 == null) {
                                                        arrayList5 = new ArrayList();
                                                    } else {
                                                        arrayList5 = arrayList6;
                                                    }
                                                    arrayList5.add(new yb.j(yVar, s10.b(g())));
                                                    if (arrayList4 == null) {
                                                        arrayList2 = new ArrayList();
                                                    } else {
                                                        arrayList2 = arrayList4;
                                                    }
                                                    arrayList2.add(yVar);
                                                    arrayList3 = arrayList5;
                                                } else {
                                                    if (arrayList6 == null) {
                                                        arrayList3 = new ArrayList();
                                                    } else {
                                                        arrayList3 = arrayList6;
                                                    }
                                                    if (!b10.equals(s11)) {
                                                        jVar4 = new yb.j(yVar, b10);
                                                    } else {
                                                        jVar4 = new yb.j(yVar, s11.b(g()));
                                                    }
                                                    arrayList3.add(jVar4);
                                                    arrayList2 = arrayList4;
                                                }
                                            }
                                        } else {
                                            l.r();
                                            throw null;
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList6;
                            arrayList2 = arrayList4;
                        } else {
                            jVar3 = d4;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i2 = i12;
                            j10 = j11;
                        }
                        j11 = j10 >> 8;
                        i12 = i2 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d4 = jVar3;
                    }
                    jVar2 = d4;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    jVar2 = d4;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i10 != length) {
                    i10++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    d4 = jVar2;
                } else {
                    arrayList = arrayList3;
                    break;
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i13 = 0; i13 < size; i13++) {
                yb.j jVar5 = (yb.j) arrayList3.get(i13);
                y yVar2 = (y) jVar5.A;
                a0 a0Var = (a0) jVar5.B;
                a0Var.f14882a = j2;
                synchronized (l.f14919c) {
                    a0Var.f14883b = yVar2.a();
                    yVar2.c(a0Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                n0Var.l((y) arrayList2.get(i14));
            }
            ArrayList arrayList7 = this.f14889i;
            if (arrayList7 != null) {
                arrayList2 = zb.l.e0(arrayList7, arrayList2);
            }
            this.f14889i = arrayList2;
        }
        return h.f14915c;
    }
}
