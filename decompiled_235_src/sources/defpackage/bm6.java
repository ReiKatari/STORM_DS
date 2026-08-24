package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm6  reason: default package */
/* loaded from: classes.dex */
public abstract class bm6 {
    public static final r76 a = new r76(12);
    public static final m44 b = new m44(19, (byte) 0);
    public static final Object c = new Object();
    public static zl6 d;
    public static long e;
    public static final s11 f;
    public static final ei g;
    public static List h;
    public static List i;
    public static final os2 j;
    public static final vw k;

    /* JADX WARN: Type inference failed for: r0v12, types: [vw, java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [s11, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Cloneable, int[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Cloneable, int[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [vl6, oa4, os2] */
    static {
        zl6 zl6Var = zl6.X;
        d = zl6Var;
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
        ei eiVar = new ei(7);
        eiVar.L = new int[16];
        eiVar.R = new ts7[16];
        g = eiVar;
        yt1 yt1Var = yt1.A;
        h = yt1Var;
        i = yt1Var;
        long j2 = e;
        e = 1 + j2;
        ?? oa4Var = new oa4(j2, zl6Var, null, new bz1(21));
        d = d.f(oa4Var.b);
        j = oa4Var;
        k = new AtomicInteger(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, oa4 oa4Var, zl6 zl6Var) {
        long[] jArr;
        zl6 zl6Var2;
        long[] jArr2;
        zl6 zl6Var3;
        int i2;
        int i3;
        hq6 s;
        ka4 x = oa4Var.x();
        if (x != null) {
            long g2 = oa4Var.g();
            zl6 d2 = oa4Var.d().f(g2).d(oa4Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                eq6 eq6Var = (eq6) objArr[(i4 << 3) + i7];
                                hq6 a2 = eq6Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                hq6 s2 = s(a2, j2, zl6Var);
                                if (s2 != null && (s = s(a2, g2, d2)) != null && !s2.equals(s)) {
                                    zl6Var3 = d2;
                                    hq6 s3 = s(a2, g2, oa4Var.d());
                                    if (s3 != null) {
                                        hq6 b2 = eq6Var.b(s, s2, s3);
                                        if (b2 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(s2, b2);
                                        hashMap = hashMap;
                                    } else {
                                        r();
                                        throw null;
                                    }
                                } else {
                                    zl6Var3 = d2;
                                }
                            } else {
                                jArr2 = jArr3;
                                zl6Var3 = d2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            d2 = zl6Var3;
                        }
                        jArr = jArr3;
                        zl6Var2 = d2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        zl6Var2 = d2;
                    }
                    if (i4 != length) {
                        i4++;
                        jArr3 = jArr;
                        d2 = zl6Var2;
                    } else {
                        return hashMap;
                    }
                }
            }
        }
        return null;
    }

    public static final void c(vl6 vl6Var) {
        oa4 oa4Var;
        Object obj;
        long j2;
        if (!d.c(vl6Var.g())) {
            StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
            sb.append(vl6Var.g());
            sb.append(", disposed=");
            sb.append(vl6Var.c);
            sb.append(", applied=");
            if (vl6Var instanceof oa4) {
                oa4Var = (oa4) vl6Var;
            } else {
                oa4Var = null;
            }
            if (oa4Var != null) {
                obj = Boolean.valueOf(oa4Var.m);
            } else {
                obj = "read-only";
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (c) {
                s11 s11Var = f;
                if (s11Var.a > 0) {
                    j2 = ((long[]) s11Var.c)[0];
                } else {
                    j2 = -1;
                }
            }
            sb.append(j2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public static final zl6 d(zl6 zl6Var, long j2, long j3) {
        while (nb3.q(j2, j3) < 0) {
            zl6Var = zl6Var.f(j2);
            j2++;
        }
        return zl6Var;
    }

    public static final Object e(qn2 qn2Var) {
        ka4 ka4Var;
        Object v;
        os2 os2Var = j;
        synchronized (c) {
            try {
                ka4Var = os2Var.h;
                if (ka4Var != null) {
                    k.addAndGet(1);
                }
                v = v(os2Var, qn2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ka4Var != null) {
            try {
                List list = h;
                d66 d66Var = new d66(ka4Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((eo2) list.get(i2)).o(d66Var, os2Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            f();
            if (ka4Var != null) {
                Object[] objArr = ka4Var.b;
                long[] jArr = ka4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((eq6) objArr[(i3 << 3) + i5]);
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
        ei eiVar = g;
        int i2 = eiVar.B;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= i2) {
                break;
            }
            ts7 ts7Var = ((ts7[]) eiVar.R)[i3];
            if (ts7Var != null) {
                obj = ts7Var.get();
            }
            if (obj != null && p((eq6) obj)) {
                if (i4 != i3) {
                    ((ts7[]) eiVar.R)[i4] = ts7Var;
                    int[] iArr = (int[]) eiVar.L;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((ts7[]) eiVar.R)[i5] = null;
            ((int[]) eiVar.L)[i5] = 0;
        }
        if (i4 != i2) {
            eiVar.B = i4;
        }
    }

    public static final vl6 g(vl6 vl6Var, qn2 qn2Var, boolean z) {
        oa4 oa4Var;
        boolean z2 = vl6Var instanceof oa4;
        if (!z2 && vl6Var != null) {
            return new ob7(vl6Var, qn2Var, false, z);
        }
        if (z2) {
            oa4Var = (oa4) vl6Var;
        } else {
            oa4Var = null;
        }
        return new nb7(oa4Var, qn2Var, null, false, z);
    }

    public static final hq6 h(hq6 hq6Var) {
        hq6 s;
        vl6 j2 = j();
        hq6 s2 = s(hq6Var, j2.g(), j2.d());
        if (s2 == null) {
            synchronized (c) {
                vl6 j3 = j();
                s = s(hq6Var, j3.g(), j3.d());
            }
            if (s != null) {
                return s;
            }
            r();
            throw null;
        }
        return s2;
    }

    public static final hq6 i(hq6 hq6Var, vl6 vl6Var) {
        hq6 s;
        hq6 s2 = s(hq6Var, vl6Var.g(), vl6Var.d());
        if (s2 == null) {
            synchronized (c) {
                s = s(hq6Var, vl6Var.g(), vl6Var.d());
            }
            if (s != null) {
                return s;
            }
            r();
            throw null;
        }
        return s2;
    }

    public static final vl6 j() {
        vl6 vl6Var = (vl6) b.f();
        if (vl6Var == null) {
            return j;
        }
        return vl6Var;
    }

    public static final qn2 k(qn2 qn2Var, qn2 qn2Var2, boolean z) {
        if (!z) {
            qn2Var2 = null;
        }
        if (qn2Var != null && qn2Var2 != null && qn2Var != qn2Var2) {
            return new am6(qn2Var, qn2Var2, 0);
        }
        if (qn2Var == null) {
            return qn2Var2;
        }
        return qn2Var;
    }

    public static final qn2 l(qn2 qn2Var, qn2 qn2Var2) {
        if (qn2Var != null && qn2Var2 != null && qn2Var != qn2Var2) {
            return new am6(qn2Var, qn2Var2, 1);
        }
        if (qn2Var == null) {
            return qn2Var2;
        }
        return qn2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hq6 m(hq6 hq6Var, eq6 eq6Var) {
        hq6 a2 = eq6Var.a();
        long j2 = e;
        s11 s11Var = f;
        if (s11Var.a > 0) {
            j2 = ((long[]) s11Var.c)[0];
        }
        long j3 = j2 - 1;
        hq6 hq6Var2 = null;
        hq6 hq6Var3 = null;
        while (true) {
            if (a2 == null) {
                break;
            }
            long j4 = a2.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && nb3.q(j4, j3) <= 0 && !zl6.X.c(j4)) {
                if (hq6Var3 == null) {
                    hq6Var3 = a2;
                } else if (nb3.q(a2.a, hq6Var3.a) >= 0) {
                    hq6Var2 = hq6Var3;
                }
            }
            a2 = a2.b;
        }
        if (hq6Var2 != null) {
            hq6Var2.a = Long.MAX_VALUE;
            return hq6Var2;
        }
        hq6 b2 = hq6Var.b(Long.MAX_VALUE);
        b2.b = eq6Var.a();
        eq6Var.f(b2);
        return b2;
    }

    public static final void n(vl6 vl6Var, eq6 eq6Var) {
        vl6Var.t(vl6Var.h() + 1);
        qn2 i2 = vl6Var.i();
        if (i2 != null) {
            i2.g(eq6Var);
        }
    }

    public static final hq6 o(hq6 hq6Var, fq6 fq6Var, vl6 vl6Var, hq6 hq6Var2) {
        hq6 m;
        if (vl6Var.f()) {
            vl6Var.n(fq6Var);
        }
        long g2 = vl6Var.g();
        if (hq6Var2.a == g2) {
            return hq6Var2;
        }
        synchronized (c) {
            m = m(hq6Var, fq6Var);
        }
        m.a = g2;
        if (hq6Var2.a != 1) {
            vl6Var.n(fq6Var);
        }
        return m;
    }

    public static final boolean p(eq6 eq6Var) {
        hq6 hq6Var;
        long j2 = e;
        s11 s11Var = f;
        if (s11Var.a > 0) {
            j2 = ((long[]) s11Var.c)[0];
        }
        hq6 hq6Var2 = null;
        hq6 hq6Var3 = null;
        int i2 = 0;
        for (hq6 a2 = eq6Var.a(); a2 != null; a2 = a2.b) {
            long j3 = a2.a;
            if (j3 != 0) {
                if (nb3.q(j3, j2) < 0) {
                    if (hq6Var2 == null) {
                        i2++;
                        hq6Var2 = a2;
                    } else {
                        if (nb3.q(a2.a, hq6Var2.a) < 0) {
                            hq6Var = hq6Var2;
                            hq6Var2 = a2;
                        } else {
                            hq6Var = a2;
                        }
                        if (hq6Var3 == null) {
                            hq6Var3 = eq6Var.a();
                            hq6 hq6Var4 = hq6Var3;
                            while (true) {
                                if (hq6Var3 != null) {
                                    if (nb3.q(hq6Var3.a, j2) >= 0) {
                                        break;
                                    }
                                    if (nb3.q(hq6Var4.a, hq6Var3.a) < 0) {
                                        hq6Var4 = hq6Var3;
                                    }
                                    hq6Var3 = hq6Var3.b;
                                } else {
                                    hq6Var3 = hq6Var4;
                                    break;
                                }
                            }
                        }
                        hq6Var2.a = 0L;
                        hq6Var2.a(hq6Var3);
                        hq6Var2 = hq6Var;
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
    public static final void q(eq6 eq6Var) {
        Object obj;
        Object obj2;
        Object obj3;
        if (p(eq6Var)) {
            ei eiVar = g;
            int i2 = eiVar.B;
            int identityHashCode = System.identityHashCode(eq6Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = eiVar.B - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = ((int[]) eiVar.L)[i6];
                        if (i7 < identityHashCode) {
                            i5 = i6 + 1;
                        } else if (i7 > identityHashCode) {
                            i4 = i6 - 1;
                        } else {
                            ts7 ts7Var = ((ts7[]) eiVar.R)[i6];
                            if (ts7Var != null) {
                                obj = ts7Var.get();
                            } else {
                                obj = null;
                            }
                            if (eq6Var != obj) {
                                for (int i8 = i6 - 1; -1 < i8 && ((int[]) eiVar.L)[i8] == identityHashCode; i8--) {
                                    ts7 ts7Var2 = ((ts7[]) eiVar.R)[i8];
                                    if (ts7Var2 != null) {
                                        obj3 = ts7Var2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == eq6Var) {
                                        i3 = i8;
                                        break;
                                    }
                                }
                                i6++;
                                int i9 = eiVar.B;
                                while (true) {
                                    if (i6 < i9) {
                                        if (((int[]) eiVar.L)[i6] != identityHashCode) {
                                            i3 = -(i6 + 1);
                                            break;
                                        }
                                        ts7 ts7Var3 = ((ts7[]) eiVar.R)[i6];
                                        if (ts7Var3 != null) {
                                            obj2 = ts7Var3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == eq6Var) {
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        i3 = -(eiVar.B + 1);
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
            ts7[] ts7VarArr = (ts7[]) eiVar.R;
            int length = ts7VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                ts7[] ts7VarArr2 = new ts7[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(ts7VarArr, i10, ts7VarArr2, i12, i2 - i10);
                System.arraycopy((ts7[]) eiVar.R, 0, ts7VarArr2, 0, i10);
                fv.r0(i12, i10, i2, (int[]) eiVar.L, iArr);
                fv.v0(0, i10, 6, (int[]) eiVar.L, iArr);
                eiVar.R = ts7VarArr2;
                eiVar.L = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(ts7VarArr, i10, ts7VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) eiVar.L;
                fv.r0(i13, i10, i2, iArr2, iArr2);
            }
            ((ts7[]) eiVar.R)[i10] = new WeakReference(eq6Var);
            ((int[]) eiVar.L)[i10] = identityHashCode;
            eiVar.B++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final hq6 s(hq6 hq6Var, long j2, zl6 zl6Var) {
        hq6 hq6Var2 = null;
        while (hq6Var != null) {
            long j3 = hq6Var.a;
            if (j3 != 0 && nb3.q(j3, j2) <= 0 && !zl6Var.c(j3) && (hq6Var2 == null || nb3.q(hq6Var2.a, hq6Var.a) < 0)) {
                hq6Var2 = hq6Var;
            }
            hq6Var = hq6Var.b;
        }
        if (hq6Var2 == null) {
            return null;
        }
        return hq6Var2;
    }

    public static final hq6 t(hq6 hq6Var, eq6 eq6Var) {
        hq6 s;
        vl6 j2 = j();
        qn2 e2 = j2.e();
        if (e2 != null) {
            e2.g(eq6Var);
        }
        hq6 s2 = s(hq6Var, j2.g(), j2.d());
        if (s2 == null) {
            synchronized (c) {
                vl6 j3 = j();
                hq6 a2 = eq6Var.a();
                a2.getClass();
                s = s(a2, j3.g(), j3.d());
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
        s11 s11Var = f;
        int i3 = ((int[]) s11Var.e)[i2];
        s11Var.c(i3, s11Var.a - 1);
        s11Var.a--;
        long[] jArr = (long[]) s11Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (nb3.q(jArr[i5], j2) <= 0) {
                break;
            }
            s11Var.c(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) s11Var.c;
        int i6 = s11Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < s11Var.a && nb3.q(jArr2[i7], jArr2[i8]) < 0) {
                if (nb3.q(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                s11Var.c(i7, i3);
                i3 = i7;
            } else if (nb3.q(jArr2[i8], jArr2[i3]) >= 0) {
                break;
            } else {
                s11Var.c(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) s11Var.e)[i2] = s11Var.b;
        s11Var.b = i2;
    }

    public static final Object v(os2 os2Var, qn2 qn2Var) {
        long j2 = os2Var.b;
        Object g2 = qn2Var.g(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        zl6 b2 = d.b(j2);
        d = b2;
        os2Var.b = j3;
        os2Var.a = b2;
        os2Var.g = 0;
        os2Var.h = null;
        os2Var.o();
        d = d.f(j3);
        return g2;
    }

    public static final hq6 w(hq6 hq6Var, eq6 eq6Var, vl6 vl6Var) {
        hq6 s;
        if (vl6Var.f()) {
            vl6Var.n(eq6Var);
        }
        long g2 = vl6Var.g();
        hq6 s2 = s(hq6Var, g2, vl6Var.d());
        if (s2 != null) {
            if (s2.a == vl6Var.g()) {
                return s2;
            }
            synchronized (c) {
                s = s(eq6Var.a(), g2, vl6Var.d());
                if (s != null) {
                    if (s.a != g2) {
                        hq6 m = m(s, eq6Var);
                        m.a(s);
                        m.a = vl6Var.g();
                        s = m;
                    }
                } else {
                    r();
                    throw null;
                }
            }
            if (s2.a != 1) {
                vl6Var.n(eq6Var);
            }
            return s;
        }
        r();
        throw null;
    }
}
