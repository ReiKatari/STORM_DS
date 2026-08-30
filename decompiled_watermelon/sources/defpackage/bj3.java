package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bj3  reason: default package */
/* loaded from: classes.dex */
public final class bj3 {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public final Serializable f;
    public final Object g;
    public final Serializable h;
    public final Object i;

    public bj3() {
        long[] jArr = wu5.a;
        this.a = new d24();
        e24 e24Var = xu5.a;
        this.c = new e24();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new yi3(this);
    }

    public static int f(int[] iArr, hj3 hj3Var) {
        int i = hj3Var.i();
        int g = hj3Var.g() + i;
        int i2 = 0;
        while (i < g) {
            int e = hj3Var.e() + iArr[i];
            iArr[i] = e;
            i2 = Math.max(i2, e);
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        if (((defpackage.kc) r8.a).n(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[Catch: all -> 0x00a2, CancellationException -> 0x00a4, TRY_ENTER, TryCatch #6 {CancellationException -> 0x00a4, all -> 0x00a2, blocks: (B:19:0x0039, B:39:0x0081, B:36:0x0072), top: B:68:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.k11 r9) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj3.a(k11):java.lang.Object");
    }

    public void b(int i, Object obj) {
        ej6.j(((d24) this.a).g(obj));
    }

    public long c() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        ej6.j(arrayList.get(0));
        throw null;
    }

    public void d(int i, int i2, ArrayList arrayList, sh shVar, ku0 ku0Var, boolean z, int i3, boolean z2, int i4, int i5) {
        boolean z3;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z4;
        ArrayList arrayList4;
        Throwable th;
        d24 d24Var;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        d24 d24Var2;
        int i6;
        Object obj2;
        ArrayList arrayList8 = (ArrayList) this.e;
        ArrayList arrayList9 = (ArrayList) this.d;
        e24 e24Var = (e24) this.c;
        Object obj3 = this.a;
        d24 d24Var3 = (d24) obj3;
        ArrayList arrayList10 = (ArrayList) this.g;
        ArrayList arrayList11 = (ArrayList) this.f;
        sh shVar2 = (sh) this.b;
        this.b = shVar;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            hj3 hj3Var = (hj3) arrayList.get(i7);
            int a = hj3Var.a();
            for (int i8 = 0; i8 < a; i8++) {
                hj3Var.h(i8);
            }
        }
        if (d24Var3.i()) {
            e();
            return;
        }
        hj3 hj3Var2 = (hj3) tq0.M0(arrayList);
        if (!z && z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        Object[] objArr = d24Var3.b;
        long[] jArr = d24Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            z4 = z3;
            int i9 = 0;
            while (true) {
                long j = jArr[i9];
                arrayList2 = arrayList10;
                arrayList3 = arrayList11;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j & 255) < 128) {
                            obj2 = obj3;
                            e24Var.a(objArr[(i9 << 3) + i11]);
                        } else {
                            obj2 = obj3;
                        }
                        j >>= 8;
                        i11++;
                        obj3 = obj2;
                    }
                    obj = obj3;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    obj = obj3;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                arrayList10 = arrayList2;
                arrayList11 = arrayList3;
                obj3 = obj;
            }
        } else {
            obj = obj3;
            arrayList2 = arrayList10;
            arrayList3 = arrayList11;
            z4 = z3;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            hj3 hj3Var3 = (hj3) arrayList.get(i12);
            e24Var.l(hj3Var3.getKey());
            int a2 = hj3Var3.a();
            for (int i13 = 0; i13 < a2; i13++) {
                hj3Var3.h(i13);
            }
            ej6.j(((d24) obj).k(hj3Var3.getKey()));
        }
        int[] iArr = new int[i3];
        Throwable th2 = null;
        if (z4 && shVar2 != null) {
            if (!arrayList9.isEmpty()) {
                if (arrayList9.size() > 1) {
                    wq0.A0(arrayList9, new aj3(shVar2, 2));
                }
                if (arrayList9.size() <= 0) {
                    i6 = 0;
                    Arrays.fill(iArr, 0, i3, 0);
                } else {
                    hj3 hj3Var4 = (hj3) arrayList9.get(0);
                    f(iArr, hj3Var4);
                    Object g = d24Var3.g(hj3Var4.getKey());
                    g.getClass();
                    ej6.j(g);
                    hj3Var4.f(0);
                    throw null;
                }
            } else {
                i6 = 0;
            }
            if (!arrayList8.isEmpty()) {
                if (arrayList8.size() > 1) {
                    wq0.A0(arrayList8, new aj3(shVar2, i6));
                }
                if (arrayList8.size() <= 0) {
                    Arrays.fill(iArr, i6, i3, i6);
                } else {
                    hj3 hj3Var5 = (hj3) arrayList8.get(i6);
                    f(iArr, hj3Var5);
                    Object g2 = d24Var3.g(hj3Var5.getKey());
                    g2.getClass();
                    ej6.j(g2);
                    hj3Var5.f(i6);
                    throw null;
                }
            }
        }
        Object[] objArr2 = e24Var.b;
        long[] jArr2 = e24Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j2 = jArr2[i14];
                th = th2;
                d24 d24Var4 = d24Var3;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j2 & 255) < 128) {
                            arrayList7 = arrayList8;
                            d24Var2 = d24Var4;
                            ej6.j(d24Var2.g(objArr2[(i14 << 3) + i16]));
                        } else {
                            arrayList7 = arrayList8;
                            d24Var2 = d24Var4;
                        }
                        j2 >>= 8;
                        i16++;
                        d24Var4 = d24Var2;
                        arrayList8 = arrayList7;
                    }
                    arrayList4 = arrayList8;
                    d24Var = d24Var4;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    arrayList4 = arrayList8;
                    d24Var = d24Var4;
                }
                if (i14 == length2) {
                    break;
                }
                i14++;
                th2 = th;
                d24Var3 = d24Var;
                arrayList8 = arrayList4;
            }
        } else {
            arrayList4 = arrayList8;
            th = null;
            d24Var = d24Var3;
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() > 1) {
                arrayList5 = arrayList3;
                wq0.A0(arrayList5, new aj3(shVar, 3));
            } else {
                arrayList5 = arrayList3;
            }
            if (arrayList5.size() > 0) {
                hj3 hj3Var6 = (hj3) arrayList5.get(0);
                Object g3 = d24Var.g(hj3Var6.getKey());
                g3.getClass();
                ej6.j(g3);
                f(iArr, hj3Var6);
                if (z) {
                    ((hj3) tq0.K0(arrayList)).f(0);
                }
                throw th;
            }
            Arrays.fill(iArr, 0, i3, 0);
        } else {
            arrayList5 = arrayList3;
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList2.size() > 1) {
                arrayList6 = arrayList2;
                wq0.A0(arrayList6, new aj3(shVar, 1));
            } else {
                arrayList6 = arrayList2;
            }
            if (arrayList6.size() > 0) {
                hj3 hj3Var7 = (hj3) arrayList6.get(0);
                Object g4 = d24Var.g(hj3Var7.getKey());
                g4.getClass();
                ej6.j(g4);
                f(iArr, hj3Var7);
                throw th;
            }
        } else {
            arrayList6 = arrayList2;
        }
        Collections.reverse(arrayList5);
        arrayList.addAll(0, arrayList5);
        arrayList.addAll(arrayList6);
        arrayList9.clear();
        arrayList4.clear();
        arrayList5.clear();
        arrayList6.clear();
        e24Var.b();
    }

    public void e() {
        d24 d24Var = (d24) this.a;
        if (d24Var.j()) {
            Object[] objArr = d24Var.c;
            long[] jArr = d24Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) >= 128) {
                                j >>= 8;
                            } else {
                                ej6.j(objArr[(i << 3) + i3]);
                                throw null;
                            }
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            d24Var.a();
        }
    }

    public bj3(kc kcVar, by1 by1Var, mc mcVar, t6 t6Var, wx1 wx1Var, oa0 oa0Var, t6 t6Var2, cy1 cy1Var, su1 su1Var) {
        this.a = kcVar;
        this.b = by1Var;
        this.c = mcVar;
        this.d = t6Var;
        this.e = wx1Var;
        this.f = oa0Var;
        this.g = t6Var2;
        this.h = cy1Var;
        this.i = su1Var;
    }
}
