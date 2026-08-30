package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ma6  reason: default package */
/* loaded from: classes.dex */
public abstract class ma6 {
    public static final d96 a = new d96(1);
    public static final n85 b = new n85(8, (byte) 0);
    public static final Object c = new Object();
    public static ka6 d;
    public static long e;
    public static final ny0 f;
    public static final sh g;
    public static List h;
    public static List i;
    public static final jm2 j;
    public static final dw k;

    /* JADX WARN: Type inference failed for: r0v12, types: [dw, java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ny0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Cloneable, int[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Cloneable, int[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [i24, ga6, jm2] */
    static {
        ka6 ka6Var = ka6.X;
        d = ka6Var;
        e = 2L;
        ?? obj = new Object();
        obj.c = new long[16];
        obj.d = new int[16];
        ?? r3 = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            r3[i2] = i3;
            i2 = i3;
        }
        obj.e = r3;
        f = obj;
        sh shVar = new sh(7);
        shVar.c = new int[16];
        shVar.d = new wd7[16];
        g = shVar;
        pp1 pp1Var = pp1.A;
        h = pp1Var;
        i = pp1Var;
        long j2 = e;
        e = 1 + j2;
        ?? i24Var = new i24(j2, ka6Var, null, new qu1(10));
        d = d.j(i24Var.b);
        j = i24Var;
        k = new AtomicInteger(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, i24 i24Var, ka6 ka6Var) {
        long[] jArr;
        ka6 ka6Var2;
        long[] jArr2;
        ka6 ka6Var3;
        int i2;
        int i3;
        se6 s;
        e24 x = i24Var.x();
        if (x != null) {
            long g2 = i24Var.g();
            ka6 i4 = i24Var.d().j(g2).i(i24Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i5 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j3 & 255) < 128) {
                                pe6 pe6Var = (pe6) objArr[(i5 << 3) + i8];
                                se6 b2 = pe6Var.b();
                                jArr2 = jArr3;
                                i2 = i6;
                                i3 = i8;
                                se6 s2 = s(b2, j2, ka6Var);
                                if (s2 != null && (s = s(b2, g2, i4)) != null && !s2.equals(s)) {
                                    ka6Var3 = i4;
                                    se6 s3 = s(b2, g2, i24Var.d());
                                    if (s3 != null) {
                                        se6 c2 = pe6Var.c(s, s2, s3);
                                        if (c2 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(s2, c2);
                                        hashMap = hashMap;
                                    } else {
                                        r();
                                        throw null;
                                    }
                                } else {
                                    ka6Var3 = i4;
                                }
                            } else {
                                jArr2 = jArr3;
                                ka6Var3 = i4;
                                i2 = i6;
                                i3 = i8;
                            }
                            j3 >>= i2;
                            i8 = i3 + 1;
                            i6 = i2;
                            jArr3 = jArr2;
                            i4 = ka6Var3;
                        }
                        jArr = jArr3;
                        ka6Var2 = i4;
                        if (i7 != i6) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        ka6Var2 = i4;
                    }
                    if (i5 != length) {
                        i5++;
                        jArr3 = jArr;
                        i4 = ka6Var2;
                    } else {
                        return hashMap;
                    }
                }
            }
        }
        return null;
    }

    public static final void c(ga6 ga6Var) {
        i24 i24Var;
        Object obj;
        long j2;
        if (!d.d(ga6Var.g())) {
            StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
            sb.append(ga6Var.g());
            sb.append(", disposed=");
            sb.append(ga6Var.c);
            sb.append(", applied=");
            if (ga6Var instanceof i24) {
                i24Var = (i24) ga6Var;
            } else {
                i24Var = null;
            }
            if (i24Var != null) {
                obj = Boolean.valueOf(i24Var.m);
            } else {
                obj = "read-only";
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (c) {
                ny0 ny0Var = f;
                if (ny0Var.a > 0) {
                    j2 = ((long[]) ny0Var.c)[0];
                } else {
                    j2 = -1;
                }
            }
            sb.append(j2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public static final ka6 d(ka6 ka6Var, long j2, long j3) {
        while (b53.F(j2, j3) < 0) {
            ka6Var = ka6Var.j(j2);
            j2++;
        }
        return ka6Var;
    }

    public static final Object e(mi2 mi2Var) {
        e24 e24Var;
        Object v;
        jm2 jm2Var = j;
        synchronized (c) {
            try {
                e24Var = jm2Var.h;
                if (e24Var != null) {
                    k.addAndGet(1);
                }
                v = v(jm2Var, mi2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e24Var != null) {
            try {
                List list = h;
                yu5 yu5Var = new yu5(e24Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((aj2) list.get(i2)).j(yu5Var, jm2Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            f();
            if (e24Var != null) {
                Object[] objArr = e24Var.b;
                long[] jArr = e24Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((pe6) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return v;
    }

    public static final void f() {
        sh shVar = g;
        int i2 = shVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= i2) {
                break;
            }
            wd7 wd7Var = ((wd7[]) shVar.d)[i3];
            if (wd7Var != null) {
                obj = wd7Var.get();
            }
            if (obj != null && p((pe6) obj)) {
                if (i4 != i3) {
                    ((wd7[]) shVar.d)[i4] = wd7Var;
                    int[] iArr = (int[]) shVar.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((wd7[]) shVar.d)[i5] = null;
            ((int[]) shVar.c)[i5] = 0;
        }
        if (i4 != i2) {
            shVar.b = i4;
        }
    }

    public static final ga6 g(ga6 ga6Var, mi2 mi2Var, boolean z) {
        i24 i24Var;
        boolean z2 = ga6Var instanceof i24;
        if (!z2 && ga6Var != null) {
            return new xx6(ga6Var, mi2Var, false, z);
        }
        if (z2) {
            i24Var = (i24) ga6Var;
        } else {
            i24Var = null;
        }
        return new wx6(i24Var, mi2Var, null, false, z);
    }

    public static final se6 h(se6 se6Var) {
        se6 s;
        ga6 j2 = j();
        se6 s2 = s(se6Var, j2.g(), j2.d());
        if (s2 == null) {
            synchronized (c) {
                ga6 j3 = j();
                s = s(se6Var, j3.g(), j3.d());
            }
            if (s != null) {
                return s;
            }
            r();
            throw null;
        }
        return s2;
    }

    public static final se6 i(se6 se6Var, ga6 ga6Var) {
        se6 s;
        se6 s2 = s(se6Var, ga6Var.g(), ga6Var.d());
        if (s2 == null) {
            synchronized (c) {
                s = s(se6Var, ga6Var.g(), ga6Var.d());
            }
            if (s != null) {
                return s;
            }
            r();
            throw null;
        }
        return s2;
    }

    public static final ga6 j() {
        ga6 ga6Var = (ga6) b.d();
        if (ga6Var == null) {
            return j;
        }
        return ga6Var;
    }

    public static final mi2 k(mi2 mi2Var, mi2 mi2Var2, boolean z) {
        if (!z) {
            mi2Var2 = null;
        }
        if (mi2Var != null && mi2Var2 != null && mi2Var != mi2Var2) {
            return new la6(mi2Var, mi2Var2, 0);
        }
        if (mi2Var == null) {
            return mi2Var2;
        }
        return mi2Var;
    }

    public static final mi2 l(mi2 mi2Var, mi2 mi2Var2) {
        if (mi2Var != null && mi2Var2 != null && mi2Var != mi2Var2) {
            return new la6(mi2Var, mi2Var2, 1);
        }
        if (mi2Var == null) {
            return mi2Var2;
        }
        return mi2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.se6 m(defpackage.se6 r10, defpackage.pe6 r11) {
        /*
            se6 r0 = r11.b()
            long r1 = defpackage.ma6.e
            ny0 r3 = defpackage.ma6.f
            int r4 = r3.a
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.c
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = defpackage.b53.F(r5, r1)
            if (r7 > 0) goto L48
            ka6 r7 = defpackage.ka6.X
            boolean r5 = r7.d(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = defpackage.b53.F(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            se6 r0 = r0.b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.a = r0
            return r3
        L55:
            se6 r10 = r10.b(r0)
            se6 r0 = r11.b()
            r10.b = r0
            r11.d(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma6.m(se6, pe6):se6");
    }

    public static final void n(ga6 ga6Var, pe6 pe6Var) {
        ga6Var.t(ga6Var.h() + 1);
        mi2 i2 = ga6Var.i();
        if (i2 != null) {
            i2.n(pe6Var);
        }
    }

    public static final se6 o(se6 se6Var, qe6 qe6Var, ga6 ga6Var, se6 se6Var2) {
        se6 m;
        if (ga6Var.f()) {
            ga6Var.n(qe6Var);
        }
        long g2 = ga6Var.g();
        if (se6Var2.a == g2) {
            return se6Var2;
        }
        synchronized (c) {
            m = m(se6Var, qe6Var);
        }
        m.a = g2;
        if (se6Var2.a != 1) {
            ga6Var.n(qe6Var);
        }
        return m;
    }

    public static final boolean p(pe6 pe6Var) {
        se6 se6Var;
        long j2 = e;
        ny0 ny0Var = f;
        if (ny0Var.a > 0) {
            j2 = ((long[]) ny0Var.c)[0];
        }
        se6 se6Var2 = null;
        se6 se6Var3 = null;
        int i2 = 0;
        for (se6 b2 = pe6Var.b(); b2 != null; b2 = b2.b) {
            long j3 = b2.a;
            if (j3 != 0) {
                if (b53.F(j3, j2) < 0) {
                    if (se6Var2 == null) {
                        i2++;
                        se6Var2 = b2;
                    } else {
                        if (b53.F(b2.a, se6Var2.a) < 0) {
                            se6Var = se6Var2;
                            se6Var2 = b2;
                        } else {
                            se6Var = b2;
                        }
                        if (se6Var3 == null) {
                            se6Var3 = pe6Var.b();
                            se6 se6Var4 = se6Var3;
                            while (true) {
                                if (se6Var3 != null) {
                                    if (b53.F(se6Var3.a, j2) >= 0) {
                                        break;
                                    }
                                    if (b53.F(se6Var4.a, se6Var3.a) < 0) {
                                        se6Var4 = se6Var3;
                                    }
                                    se6Var3 = se6Var3.b;
                                } else {
                                    se6Var3 = se6Var4;
                                    break;
                                }
                            }
                        }
                        se6Var2.a = 0L;
                        se6Var2.a(se6Var3);
                        se6Var2 = se6Var;
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
    public static final void q(pe6 pe6Var) {
        Object obj;
        Object obj2;
        Object obj3;
        if (p(pe6Var)) {
            sh shVar = g;
            int i2 = shVar.b;
            int identityHashCode = System.identityHashCode(pe6Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = shVar.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = ((int[]) shVar.c)[i6];
                        if (i7 < identityHashCode) {
                            i5 = i6 + 1;
                        } else if (i7 > identityHashCode) {
                            i4 = i6 - 1;
                        } else {
                            wd7 wd7Var = ((wd7[]) shVar.d)[i6];
                            if (wd7Var != null) {
                                obj = wd7Var.get();
                            } else {
                                obj = null;
                            }
                            if (pe6Var != obj) {
                                for (int i8 = i6 - 1; -1 < i8 && ((int[]) shVar.c)[i8] == identityHashCode; i8--) {
                                    wd7 wd7Var2 = ((wd7[]) shVar.d)[i8];
                                    if (wd7Var2 != null) {
                                        obj3 = wd7Var2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == pe6Var) {
                                        i3 = i8;
                                        break;
                                    }
                                }
                                i6++;
                                int i9 = shVar.b;
                                while (true) {
                                    if (i6 < i9) {
                                        if (((int[]) shVar.c)[i6] != identityHashCode) {
                                            i3 = -(i6 + 1);
                                            break;
                                        }
                                        wd7 wd7Var3 = ((wd7[]) shVar.d)[i6];
                                        if (wd7Var3 != null) {
                                            obj2 = wd7Var3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == pe6Var) {
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        i3 = -(shVar.b + 1);
                                        break;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    } else {
                        i3 = -(i5 + 1);
                        break;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            wd7[] wd7VarArr = (wd7[]) shVar.d;
            int length = wd7VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                wd7[] wd7VarArr2 = new wd7[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(wd7VarArr, i10, wd7VarArr2, i12, i2 - i10);
                System.arraycopy((wd7[]) shVar.d, 0, wd7VarArr2, 0, i10);
                nu.d0(i12, i10, i2, (int[]) shVar.c, iArr);
                nu.h0(0, i10, 6, (int[]) shVar.c, iArr);
                shVar.d = wd7VarArr2;
                shVar.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(wd7VarArr, i10, wd7VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) shVar.c;
                nu.d0(i13, i10, i2, iArr2, iArr2);
            }
            ((wd7[]) shVar.d)[i10] = new WeakReference(pe6Var);
            ((int[]) shVar.c)[i10] = identityHashCode;
            shVar.b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final se6 s(se6 se6Var, long j2, ka6 ka6Var) {
        se6 se6Var2 = null;
        while (se6Var != null) {
            long j3 = se6Var.a;
            if (j3 != 0 && b53.F(j3, j2) <= 0 && !ka6Var.d(j3) && (se6Var2 == null || b53.F(se6Var2.a, se6Var.a) < 0)) {
                se6Var2 = se6Var;
            }
            se6Var = se6Var.b;
        }
        if (se6Var2 == null) {
            return null;
        }
        return se6Var2;
    }

    public static final se6 t(se6 se6Var, pe6 pe6Var) {
        se6 s;
        ga6 j2 = j();
        mi2 e2 = j2.e();
        if (e2 != null) {
            e2.n(pe6Var);
        }
        se6 s2 = s(se6Var, j2.g(), j2.d());
        if (s2 == null) {
            synchronized (c) {
                ga6 j3 = j();
                se6 b2 = pe6Var.b();
                b2.getClass();
                s = s(b2, j3.g(), j3.d());
                if (s == null) {
                    r();
                    throw null;
                }
            }
            return s;
        }
        return s2;
    }

    public static final void u(int i2) {
        ny0 ny0Var = f;
        int i3 = ((int[]) ny0Var.e)[i2];
        ny0Var.c(i3, ny0Var.a - 1);
        ny0Var.a--;
        long[] jArr = (long[]) ny0Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (b53.F(jArr[i5], j2) <= 0) {
                break;
            }
            ny0Var.c(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) ny0Var.c;
        int i6 = ny0Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < ny0Var.a && b53.F(jArr2[i7], jArr2[i8]) < 0) {
                if (b53.F(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                ny0Var.c(i7, i3);
                i3 = i7;
            } else if (b53.F(jArr2[i8], jArr2[i3]) >= 0) {
                break;
            } else {
                ny0Var.c(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) ny0Var.e)[i2] = ny0Var.b;
        ny0Var.b = i2;
    }

    public static final Object v(jm2 jm2Var, mi2 mi2Var) {
        long j2 = jm2Var.b;
        Object n = mi2Var.n(d.c(j2));
        long j3 = e;
        e = 1 + j3;
        ka6 c2 = d.c(j2);
        d = c2;
        jm2Var.b = j3;
        jm2Var.a = c2;
        jm2Var.g = 0;
        jm2Var.h = null;
        jm2Var.o();
        d = d.j(j3);
        return n;
    }

    public static final se6 w(se6 se6Var, pe6 pe6Var, ga6 ga6Var) {
        se6 s;
        if (ga6Var.f()) {
            ga6Var.n(pe6Var);
        }
        long g2 = ga6Var.g();
        se6 s2 = s(se6Var, g2, ga6Var.d());
        if (s2 != null) {
            if (s2.a == ga6Var.g()) {
                return s2;
            }
            synchronized (c) {
                s = s(pe6Var.b(), g2, ga6Var.d());
                if (s != null) {
                    if (s.a != g2) {
                        se6 m = m(s, pe6Var);
                        m.a(s);
                        m.a = ga6Var.g();
                        s = m;
                    }
                } else {
                    r();
                    throw null;
                }
            }
            if (s2.a != 1) {
                ga6Var.n(pe6Var);
            }
            return s;
        }
        r();
        throw null;
    }
}
