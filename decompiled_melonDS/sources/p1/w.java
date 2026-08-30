package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final a1.m0 f11272a;

    /* renamed from: b  reason: collision with root package name */
    public c8.c0 f11273b;

    /* renamed from: c  reason: collision with root package name */
    public final a1.n0 f11274c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f11275d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f11276e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f11277f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f11278g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f11279h;

    /* renamed from: i  reason: collision with root package name */
    public final b3.p f11280i;

    public w() {
        long[] jArr = a1.u0.f103a;
        this.f11272a = new a1.m0();
        a1.n0 n0Var = a1.v0.f110a;
        this.f11274c = new a1.n0();
        this.f11275d = new ArrayList();
        this.f11276e = new ArrayList();
        this.f11277f = new ArrayList();
        this.f11278g = new ArrayList();
        this.f11279h = new ArrayList();
        this.f11280i = new t(this);
    }

    public static int e(int[] iArr, g0 g0Var) {
        int i2 = g0Var.i();
        int g10 = g0Var.g() + i2;
        int i10 = 0;
        while (i2 < g10) {
            int e6 = g0Var.e() + iArr[i2];
            iArr[i2] = e6;
            i10 = Math.max(i10, e6);
            i2++;
        }
        return i10;
    }

    public final void a(int i2, Object obj) {
        w.d.A(this.f11272a.g(obj));
    }

    public final long b() {
        ArrayList arrayList = this.f11279h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        w.d.A(arrayList.get(0));
        throw null;
    }

    public final void c(int i2, int i10, ArrayList arrayList, c8.c0 c0Var, a3.b bVar, boolean z10, int i11, boolean z11, int i12, int i13) {
        boolean z12;
        Throwable th2;
        c8.c0 c0Var2 = this.f11273b;
        this.f11273b = c0Var;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            g0 g0Var = (g0) arrayList.get(i14);
            int a10 = g0Var.a();
            for (int i15 = 0; i15 < a10; i15++) {
                g0Var.h(i15);
            }
        }
        a1.m0 m0Var = this.f11272a;
        if (m0Var.i()) {
            d();
            return;
        }
        g0 g0Var2 = (g0) zb.l.T(arrayList);
        if (!z10 && z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        Object[] objArr = m0Var.f68b;
        long[] jArr = m0Var.f67a;
        int length = jArr.length - 2;
        a1.n0 n0Var = this.f11274c;
        if (length >= 0) {
            int i16 = 0;
            while (true) {
                long j2 = jArr[i16];
                int i17 = i16;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    long j10 = j2;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j10 & 255) < 128) {
                            n0Var.a(objArr[(i17 << 3) + i19]);
                        }
                        j10 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    }
                }
                if (i17 == length) {
                    break;
                }
                i16 = i17 + 1;
            }
        }
        int size2 = arrayList.size();
        for (int i20 = 0; i20 < size2; i20++) {
            g0 g0Var3 = (g0) arrayList.get(i20);
            n0Var.l(g0Var3.getKey());
            int a11 = g0Var3.a();
            for (int i21 = 0; i21 < a11; i21++) {
                g0Var3.h(i21);
            }
            w.d.A(this.f11272a.k(g0Var3.getKey()));
        }
        int[] iArr = new int[i11];
        ArrayList arrayList2 = this.f11276e;
        ArrayList arrayList3 = this.f11275d;
        if (z12 && c0Var2 != null) {
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    zb.o.I(arrayList3, new v(c0Var2, 2));
                }
                if (arrayList3.size() <= 0) {
                    Arrays.fill(iArr, 0, i11, 0);
                } else {
                    g0 g0Var4 = (g0) arrayList3.get(0);
                    e(iArr, g0Var4);
                    Object g10 = m0Var.g(g0Var4.getKey());
                    g10.getClass();
                    w.d.A(g10);
                    g0Var4.f(0);
                    throw null;
                }
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    zb.o.I(arrayList2, new v(c0Var2, 0));
                }
                if (arrayList2.size() <= 0) {
                    Arrays.fill(iArr, 0, i11, 0);
                } else {
                    g0 g0Var5 = (g0) arrayList2.get(0);
                    e(iArr, g0Var5);
                    Object g11 = m0Var.g(g0Var5.getKey());
                    g11.getClass();
                    w.d.A(g11);
                    g0Var5.f(0);
                    throw null;
                }
            }
        }
        Object[] objArr2 = n0Var.f75b;
        long[] jArr2 = n0Var.f74a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            Throwable th3 = null;
            int i22 = 0;
            while (true) {
                long j11 = jArr2[i22];
                th2 = th3;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                    long j12 = j11;
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j12 & 255) < 128) {
                            w.d.A(m0Var.g(objArr2[(i22 << 3) + i24]));
                        }
                        j12 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length2) {
                    break;
                }
                i22++;
                th3 = th2;
            }
        } else {
            th2 = null;
        }
        ArrayList arrayList4 = this.f11277f;
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() > 1) {
                zb.o.I(arrayList4, new v(c0Var, 3));
            }
            if (arrayList4.size() > 0) {
                g0 g0Var6 = (g0) arrayList4.get(0);
                Object g12 = m0Var.g(g0Var6.getKey());
                g12.getClass();
                w.d.A(g12);
                e(iArr, g0Var6);
                if (z10) {
                    ((g0) zb.l.R(arrayList)).f(0);
                }
                throw th2;
            }
            Arrays.fill(iArr, 0, i11, 0);
        }
        ArrayList arrayList5 = this.f11278g;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 1) {
                zb.o.I(arrayList5, new v(c0Var, 1));
            }
            if (arrayList5.size() > 0) {
                g0 g0Var7 = (g0) arrayList5.get(0);
                Object g13 = m0Var.g(g0Var7.getKey());
                g13.getClass();
                w.d.A(g13);
                e(iArr, g0Var7);
                throw th2;
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        n0Var.b();
    }

    public final void d() {
        a1.m0 m0Var = this.f11272a;
        if (m0Var.j()) {
            Object[] objArr = m0Var.f69c;
            long[] jArr = m0Var.f67a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j2) >= 128) {
                                j2 >>= 8;
                            } else {
                                w.d.A(objArr[(i2 << 3) + i11]);
                                throw null;
                            }
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            m0Var.a();
        }
    }
}
