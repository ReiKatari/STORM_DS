package z2;

import a1.n0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p1.c1;
import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f14917a = new h1(27);

    /* renamed from: b  reason: collision with root package name */
    public static final c1 f14918b = new c1(10);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f14919c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static j f14920d;

    /* renamed from: e  reason: collision with root package name */
    public static long f14921e;

    /* renamed from: f  reason: collision with root package name */
    public static final i5.j f14922f;

    /* renamed from: g  reason: collision with root package name */
    public static final c8.c0 f14923g;

    /* renamed from: h  reason: collision with root package name */
    public static Object f14924h;

    /* renamed from: i  reason: collision with root package name */
    public static Object f14925i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f14926j;

    /* renamed from: k  reason: collision with root package name */
    public static final v2.a f14927k;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.atomic.AtomicInteger, v2.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [z2.a, z2.b, z2.f] */
    /* JADX WARN: Type inference failed for: r2v1, types: [i5.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.lang.Cloneable] */
    static {
        j jVar = j.X;
        f14920d = jVar;
        long j2 = 1;
        f14921e = j2 + j2;
        ?? obj = new Object();
        obj.f6887c = new long[16];
        obj.f6888d = new int[16];
        ?? r5 = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i10 = i2 + 1;
            r5[i2] = i10;
            i2 = i10;
        }
        obj.f6889e = r5;
        f14922f = obj;
        c8.c0 c0Var = new c8.c0(10);
        c0Var.f2625c = new int[16];
        c0Var.f2626d = new v2.l[16];
        f14923g = c0Var;
        zb.q qVar = zb.q.A;
        f14924h = qVar;
        f14925i = qVar;
        long j10 = f14921e;
        f14921e = j2 + j10;
        ?? bVar = new b(j10, jVar, null, new h1(26));
        f14920d = f14920d.e(bVar.f14911b);
        f14926j = bVar;
        f14927k = new AtomicInteger(0);
    }

    public static final void a() {
        e(f14917a);
    }

    public static final HashMap b(long j2, b bVar, j jVar) {
        long[] jArr;
        j jVar2;
        long[] jArr2;
        j jVar3;
        int i2;
        int i10;
        a0 s10;
        n0 x9 = bVar.x();
        if (x9 != null) {
            long g10 = bVar.g();
            j d4 = bVar.d().e(g10).d(bVar.f14890j);
            Object[] objArr = x9.f75b;
            long[] jArr3 = x9.f74a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j10 = jArr3[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                y yVar = (y) objArr[(i11 << 3) + i14];
                                a0 a10 = yVar.a();
                                jArr2 = jArr3;
                                i2 = i12;
                                i10 = i14;
                                a0 s11 = s(a10, j2, jVar);
                                if (s11 != null && (s10 = s(a10, g10, d4)) != null && !s11.equals(s10)) {
                                    jVar3 = d4;
                                    a0 s12 = s(a10, g10, bVar.d());
                                    if (s12 != null) {
                                        a0 b10 = yVar.b(s10, s11, s12);
                                        if (b10 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(s11, b10);
                                        hashMap = hashMap;
                                    } else {
                                        r();
                                        throw null;
                                    }
                                } else {
                                    jVar3 = d4;
                                }
                            } else {
                                jArr2 = jArr3;
                                jVar3 = d4;
                                i2 = i12;
                                i10 = i14;
                            }
                            j10 >>= i2;
                            i14 = i10 + 1;
                            i12 = i2;
                            jArr3 = jArr2;
                            d4 = jVar3;
                        }
                        jArr = jArr3;
                        jVar2 = d4;
                        if (i13 != i12) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        jVar2 = d4;
                    }
                    if (i11 != length) {
                        i11++;
                        jArr3 = jArr;
                        d4 = jVar2;
                    } else {
                        return hashMap;
                    }
                }
            }
        }
        return null;
    }

    public static final void c(f fVar) {
        b bVar;
        Object obj;
        long j2;
        if (!f14920d.c(fVar.g())) {
            StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
            sb2.append(fVar.g());
            sb2.append(", disposed=");
            sb2.append(fVar.f14912c);
            sb2.append(", applied=");
            if (fVar instanceof b) {
                bVar = (b) fVar;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                obj = Boolean.valueOf(bVar.m);
            } else {
                obj = "read-only";
            }
            sb2.append(obj);
            sb2.append(", lowestPin=");
            synchronized (f14919c) {
                i5.j jVar = f14922f;
                if (jVar.f6885a > 0) {
                    j2 = ((long[]) jVar.f6887c)[0];
                } else {
                    j2 = -1;
                }
            }
            sb2.append(j2);
            throw new IllegalStateException(sb2.toString().toString());
        }
    }

    public static final j d(j jVar, long j2, long j10) {
        while (nc.k.c(j2, j10) < 0) {
            jVar = jVar.e(j2);
            j2++;
        }
        return jVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final Object e(mc.l lVar) {
        n0 n0Var;
        Object v10;
        a aVar = f14926j;
        synchronized (f14919c) {
            try {
                n0Var = aVar.f14888h;
                if (n0Var != null) {
                    f14927k.addAndGet(1);
                }
                v10 = v(aVar, lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (n0Var != null) {
            try {
                ?? r42 = f14924h;
                int size = r42.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((mc.p) r42.get(i2)).j(new p2.d(n0Var), aVar);
                }
            } finally {
                f14927k.addAndGet(-1);
            }
        }
        synchronized (f14919c) {
            f();
            if (n0Var != null) {
                Object[] objArr = n0Var.f75b;
                long[] jArr = n0Var.f74a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j2 = jArr[i10];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j2) < 128) {
                                    q((y) objArr[(i10 << 3) + i12]);
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
        }
        return v10;
    }

    public static final void f() {
        c8.c0 c0Var = f14923g;
        int i2 = c0Var.f2624b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            Object obj = null;
            if (i10 >= i2) {
                break;
            }
            v2.l lVar = ((v2.l[]) c0Var.f2626d)[i10];
            if (lVar != null) {
                obj = lVar.get();
            }
            if (obj != null && p((y) obj)) {
                if (i11 != i10) {
                    ((v2.l[]) c0Var.f2626d)[i11] = lVar;
                    int[] iArr = (int[]) c0Var.f2625c;
                    iArr[i11] = iArr[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < i2; i12++) {
            ((v2.l[]) c0Var.f2626d)[i12] = null;
            ((int[]) c0Var.f2625c)[i12] = 0;
        }
        if (i11 != i2) {
            c0Var.f2624b = i11;
        }
    }

    public static final f g(f fVar, mc.l lVar, boolean z10) {
        b bVar;
        boolean z11 = fVar instanceof b;
        if (!z11 && fVar != null) {
            return new e0(fVar, lVar, false, z10);
        }
        if (z11) {
            bVar = (b) fVar;
        } else {
            bVar = null;
        }
        return new d0(bVar, lVar, null, false, z10);
    }

    public static final a0 h(a0 a0Var) {
        a0 s10;
        f j2 = j();
        a0 s11 = s(a0Var, j2.g(), j2.d());
        if (s11 == null) {
            synchronized (f14919c) {
                f j10 = j();
                s10 = s(a0Var, j10.g(), j10.d());
            }
            if (s10 != null) {
                return s10;
            }
            r();
            throw null;
        }
        return s11;
    }

    public static final a0 i(a0 a0Var, f fVar) {
        a0 s10;
        a0 s11 = s(a0Var, fVar.g(), fVar.d());
        if (s11 == null) {
            synchronized (f14919c) {
                s10 = s(a0Var, fVar.g(), fVar.d());
            }
            if (s10 != null) {
                return s10;
            }
            r();
            throw null;
        }
        return s11;
    }

    public static final f j() {
        f fVar = (f) f14918b.d();
        if (fVar == null) {
            return f14926j;
        }
        return fVar;
    }

    public static final mc.l k(mc.l lVar, mc.l lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        if (lVar != null && lVar2 != null && lVar != lVar2) {
            return new k(lVar, lVar2, 0);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    public static final mc.l l(mc.l lVar, mc.l lVar2) {
        if (lVar != null && lVar2 != null && lVar != lVar2) {
            return new k(lVar, lVar2, 1);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final z2.a0 m(z2.a0 r10, z2.y r11) {
        /*
            z2.a0 r0 = r11.a()
            long r1 = z2.l.f14921e
            i5.j r3 = z2.l.f14922f
            int r4 = r3.f6885a
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f6887c
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.f14882a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = nc.k.c(r5, r1)
            if (r7 > 0) goto L48
            z2.j r7 = z2.j.X
            boolean r5 = r7.c(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.f14882a
            long r5 = r4.f14882a
            int r1 = nc.k.c(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            z2.a0 r0 = r0.f14883b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.f14882a = r0
            return r3
        L55:
            z2.a0 r10 = r10.b(r0)
            z2.a0 r0 = r11.a()
            r10.f14883b = r0
            r11.c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.l.m(z2.a0, z2.y):z2.a0");
    }

    public static final void n(f fVar, y yVar) {
        fVar.t(fVar.h() + 1);
        mc.l i2 = fVar.i();
        if (i2 != null) {
            i2.k(yVar);
        }
    }

    public static final a0 o(a0 a0Var, z zVar, f fVar, a0 a0Var2) {
        a0 m;
        if (fVar.f()) {
            fVar.n(zVar);
        }
        long g10 = fVar.g();
        if (a0Var2.f14882a == g10) {
            return a0Var2;
        }
        synchronized (f14919c) {
            m = m(a0Var, zVar);
        }
        m.f14882a = g10;
        if (a0Var2.f14882a != 1) {
            fVar.n(zVar);
        }
        return m;
    }

    public static final boolean p(y yVar) {
        a0 a0Var;
        long j2 = f14921e;
        i5.j jVar = f14922f;
        if (jVar.f6885a > 0) {
            j2 = ((long[]) jVar.f6887c)[0];
        }
        a0 a0Var2 = null;
        a0 a0Var3 = null;
        int i2 = 0;
        for (a0 a10 = yVar.a(); a10 != null; a10 = a10.f14883b) {
            long j10 = a10.f14882a;
            if (j10 != 0) {
                if (nc.k.c(j10, j2) < 0) {
                    if (a0Var2 == null) {
                        i2++;
                        a0Var2 = a10;
                    } else {
                        if (nc.k.c(a10.f14882a, a0Var2.f14882a) < 0) {
                            a0Var = a0Var2;
                            a0Var2 = a10;
                        } else {
                            a0Var = a10;
                        }
                        if (a0Var3 == null) {
                            a0Var3 = yVar.a();
                            a0 a0Var4 = a0Var3;
                            while (true) {
                                if (a0Var3 != null) {
                                    if (nc.k.c(a0Var3.f14882a, j2) >= 0) {
                                        break;
                                    }
                                    if (nc.k.c(a0Var4.f14882a, a0Var3.f14882a) < 0) {
                                        a0Var4 = a0Var3;
                                    }
                                    a0Var3 = a0Var3.f14883b;
                                } else {
                                    a0Var3 = a0Var4;
                                    break;
                                }
                            }
                        }
                        a0Var2.f14882a = 0L;
                        a0Var2.a(a0Var3);
                        a0Var2 = a0Var;
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i2 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(y yVar) {
        Object obj;
        Object obj2;
        Object obj3;
        if (p(yVar)) {
            c8.c0 c0Var = f14923g;
            int i2 = c0Var.f2624b;
            int identityHashCode = System.identityHashCode(yVar);
            int i10 = -1;
            if (i2 > 0) {
                int i11 = c0Var.f2624b - 1;
                int i12 = 0;
                while (true) {
                    if (i12 <= i11) {
                        int i13 = (i12 + i11) >>> 1;
                        int i14 = ((int[]) c0Var.f2625c)[i13];
                        if (i14 < identityHashCode) {
                            i12 = i13 + 1;
                        } else if (i14 > identityHashCode) {
                            i11 = i13 - 1;
                        } else {
                            v2.l lVar = ((v2.l[]) c0Var.f2626d)[i13];
                            if (lVar != null) {
                                obj = lVar.get();
                            } else {
                                obj = null;
                            }
                            if (yVar != obj) {
                                for (int i15 = i13 - 1; -1 < i15 && ((int[]) c0Var.f2625c)[i15] == identityHashCode; i15--) {
                                    v2.l lVar2 = ((v2.l[]) c0Var.f2626d)[i15];
                                    if (lVar2 != null) {
                                        obj3 = lVar2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == yVar) {
                                        i10 = i15;
                                        break;
                                    }
                                }
                                i13++;
                                int i16 = c0Var.f2624b;
                                while (true) {
                                    if (i13 < i16) {
                                        if (((int[]) c0Var.f2625c)[i13] != identityHashCode) {
                                            i10 = -(i13 + 1);
                                            break;
                                        }
                                        v2.l lVar3 = ((v2.l[]) c0Var.f2626d)[i13];
                                        if (lVar3 != null) {
                                            obj2 = lVar3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == yVar) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        i10 = -(c0Var.f2624b + 1);
                                        break;
                                    }
                                }
                            }
                            i10 = i13;
                        }
                    } else {
                        i10 = -(i12 + 1);
                        break;
                    }
                }
                if (i10 >= 0) {
                    return;
                }
            }
            int i17 = -(i10 + 1);
            v2.l[] lVarArr = (v2.l[]) c0Var.f2626d;
            int length = lVarArr.length;
            if (i2 == length) {
                int i18 = length * 2;
                v2.l[] lVarArr2 = new v2.l[i18];
                int[] iArr = new int[i18];
                int i19 = i17 + 1;
                System.arraycopy(lVarArr, i17, lVarArr2, i19, i2 - i17);
                System.arraycopy((v2.l[]) c0Var.f2626d, 0, lVarArr2, 0, i17);
                zb.k.g(i19, i17, i2, (int[]) c0Var.f2625c, iArr);
                zb.k.j(0, i17, 6, (int[]) c0Var.f2625c, iArr);
                c0Var.f2626d = lVarArr2;
                c0Var.f2625c = iArr;
            } else {
                int i20 = i17 + 1;
                System.arraycopy(lVarArr, i17, lVarArr, i20, i2 - i17);
                int[] iArr2 = (int[]) c0Var.f2625c;
                zb.k.g(i20, i17, i2, iArr2, iArr2);
            }
            ((v2.l[]) c0Var.f2626d)[i17] = new WeakReference(yVar);
            ((int[]) c0Var.f2625c)[i17] = identityHashCode;
            c0Var.f2624b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final a0 s(a0 a0Var, long j2, j jVar) {
        a0 a0Var2 = null;
        while (a0Var != null) {
            long j10 = a0Var.f14882a;
            if (j10 != 0 && nc.k.c(j10, j2) <= 0 && !jVar.c(j10) && (a0Var2 == null || nc.k.c(a0Var2.f14882a, a0Var.f14882a) < 0)) {
                a0Var2 = a0Var;
            }
            a0Var = a0Var.f14883b;
        }
        if (a0Var2 == null) {
            return null;
        }
        return a0Var2;
    }

    public static final a0 t(a0 a0Var, y yVar) {
        a0 s10;
        f j2 = j();
        mc.l e6 = j2.e();
        if (e6 != null) {
            e6.k(yVar);
        }
        a0 s11 = s(a0Var, j2.g(), j2.d());
        if (s11 == null) {
            synchronized (f14919c) {
                f j10 = j();
                a0 a10 = yVar.a();
                a10.getClass();
                s10 = s(a10, j10.g(), j10.d());
                if (s10 == null) {
                    r();
                    throw null;
                }
            }
            return s10;
        }
        return s11;
    }

    public static final void u(int i2) {
        i5.j jVar = f14922f;
        int i10 = ((int[]) jVar.f6889e)[i2];
        jVar.c(i10, jVar.f6885a - 1);
        jVar.f6885a--;
        long[] jArr = (long[]) jVar.f6887c;
        long j2 = jArr[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = ((i11 + 1) >> 1) - 1;
            if (nc.k.c(jArr[i12], j2) <= 0) {
                break;
            }
            jVar.c(i12, i11);
            i11 = i12;
        }
        long[] jArr2 = (long[]) jVar.f6887c;
        int i13 = jVar.f6885a >> 1;
        while (i10 < i13) {
            int i14 = (i10 + 1) << 1;
            int i15 = i14 - 1;
            if (i14 < jVar.f6885a && nc.k.c(jArr2[i14], jArr2[i15]) < 0) {
                if (nc.k.c(jArr2[i14], jArr2[i10]) >= 0) {
                    break;
                }
                jVar.c(i14, i10);
                i10 = i14;
            } else if (nc.k.c(jArr2[i15], jArr2[i10]) >= 0) {
                break;
            } else {
                jVar.c(i15, i10);
                i10 = i15;
            }
        }
        ((int[]) jVar.f6889e)[i2] = jVar.f6886b;
        jVar.f6886b = i2;
    }

    public static final Object v(a aVar, mc.l lVar) {
        long j2 = aVar.f14911b;
        Object k10 = lVar.k(f14920d.b(j2));
        long j10 = f14921e;
        f14921e = 1 + j10;
        j b10 = f14920d.b(j2);
        f14920d = b10;
        aVar.f14911b = j10;
        aVar.f14910a = b10;
        aVar.f14887g = 0;
        aVar.f14888h = null;
        aVar.o();
        f14920d = f14920d.e(j10);
        return k10;
    }

    public static final a0 w(a0 a0Var, y yVar, f fVar) {
        a0 s10;
        if (fVar.f()) {
            fVar.n(yVar);
        }
        long g10 = fVar.g();
        a0 s11 = s(a0Var, g10, fVar.d());
        if (s11 != null) {
            if (s11.f14882a == fVar.g()) {
                return s11;
            }
            synchronized (f14919c) {
                s10 = s(yVar.a(), g10, fVar.d());
                if (s10 != null) {
                    if (s10.f14882a != g10) {
                        a0 m = m(s10, yVar);
                        m.a(s10);
                        m.f14882a = fVar.g();
                        s10 = m;
                    }
                } else {
                    r();
                    throw null;
                }
            }
            if (s11.f14882a != 1) {
                fVar.n(yVar);
            }
            return s10;
        }
        r();
        throw null;
    }
}
