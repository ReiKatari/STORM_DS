package ac;

import a0.j;
import androidx.preference.Preference;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import nc.k;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements Map, Serializable, oc.d {

    /* renamed from: h0  reason: collision with root package name */
    public static final e f698h0;
    public Object[] A;
    public Object[] B;
    public int[] L;
    public int[] R;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f699b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f700c0;

    /* renamed from: d0  reason: collision with root package name */
    public f f701d0;

    /* renamed from: e0  reason: collision with root package name */
    public g f702e0;

    /* renamed from: f0  reason: collision with root package name */
    public f f703f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f704g0;

    static {
        e eVar = new e(0);
        eVar.f704g0 = true;
        f698h0 = eVar;
    }

    public e(int i2) {
        if (i2 >= 0) {
            Object[] objArr = new Object[i2];
            int[] iArr = new int[i2];
            int highestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
            this.A = objArr;
            this.B = null;
            this.L = iArr;
            this.R = new int[highestOneBit];
            this.X = 2;
            this.Y = 0;
            this.Z = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        j.h("capacity must be non-negative.");
        throw null;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i2 = i(obj);
            int i10 = this.X * 2;
            int length = this.R.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.R;
                int i12 = iArr[i2];
                if (i12 <= 0) {
                    int i13 = this.Y;
                    Object[] objArr = this.A;
                    if (i13 >= objArr.length) {
                        f(1);
                    } else {
                        int i14 = i13 + 1;
                        this.Y = i14;
                        objArr[i13] = obj;
                        this.L[i13] = i2;
                        iArr[i2] = i14;
                        this.f700c0++;
                        this.f699b0++;
                        if (i11 > this.X) {
                            this.X = i11;
                        }
                        return i13;
                    }
                } else if (k.a(this.A[i12 - 1], obj)) {
                    return -i12;
                } else {
                    i11++;
                    if (i11 > i10) {
                        j(this.R.length * 2);
                        break;
                    }
                    int i15 = i2 - 1;
                    if (i2 == 0) {
                        i2 = this.R.length - 1;
                    } else {
                        i2 = i15;
                    }
                }
            }
        }
    }

    public final e b() {
        c();
        this.f704g0 = true;
        if (this.f700c0 > 0) {
            return this;
        }
        e eVar = f698h0;
        eVar.getClass();
        return eVar;
    }

    public final void c() {
        if (!this.f704g0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i2 = this.Y - 1;
        if (i2 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.L;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.R[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i2) {
                    break;
                }
                i10++;
            }
        }
        r.R(this.A, 0, this.Y);
        Object[] objArr = this.B;
        if (objArr != null) {
            r.R(objArr, 0, this.Y);
        }
        this.f700c0 = 0;
        this.Y = 0;
        this.f699b0++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void d(boolean z10) {
        int i2;
        Object[] objArr = this.B;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i2 = this.Y;
            if (i10 >= i2) {
                break;
            }
            int[] iArr = this.L;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.A;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z10) {
                    iArr[i11] = i12;
                    this.R[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        r.R(this.A, i11, i2);
        if (objArr != null) {
            r.R(objArr, i11, this.Y);
        }
        this.Y = i11;
    }

    public final boolean e(Collection collection) {
        boolean a10;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int g10 = g(entry.getKey());
                    if (g10 < 0) {
                        a10 = false;
                        continue;
                    } else {
                        Object[] objArr = this.B;
                        objArr.getClass();
                        a10 = k.a(objArr[g10], entry.getValue());
                        continue;
                    }
                    if (!a10) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.f703f0;
        if (fVar == null) {
            f fVar2 = new f(this, 0);
            this.f703f0 = fVar2;
            return fVar2;
        }
        return fVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f700c0 != map.size() || !e(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(int i2) {
        Object[] objArr;
        Object[] objArr2 = this.A;
        int length = objArr2.length;
        int i10 = this.Y;
        int i11 = length - i10;
        int i12 = i10 - this.f700c0;
        int i13 = 1;
        if (i11 < i2 && i11 + i12 >= i2 && i12 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i14 = i10 + i2;
        if (i14 >= 0) {
            if (i14 > objArr2.length) {
                int length2 = objArr2.length;
                int i15 = length2 + (length2 >> 1);
                if (i15 - i14 < 0) {
                    i15 = i14;
                }
                if (i15 - 2147483639 > 0) {
                    if (i14 > 2147483639) {
                        i15 = Preference.DEFAULT_ORDER;
                    } else {
                        i15 = 2147483639;
                    }
                }
                this.A = Arrays.copyOf(objArr2, i15);
                Object[] objArr3 = this.B;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i15);
                } else {
                    objArr = null;
                }
                this.B = objArr;
                this.L = Arrays.copyOf(this.L, i15);
                if (i15 >= 1) {
                    i13 = i15;
                }
                int highestOneBit = Integer.highestOneBit(i13 * 3);
                if (highestOneBit > this.R.length) {
                    j(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    public final int g(Object obj) {
        int i2 = i(obj);
        int i10 = this.X;
        while (true) {
            int i11 = this.R[i2];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (k.a(this.A[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            int i13 = i2 - 1;
            if (i2 == 0) {
                i2 = this.R.length - 1;
            } else {
                i2 = i13;
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g10 = g(obj);
        if (g10 < 0) {
            return null;
        }
        Object[] objArr = this.B;
        objArr.getClass();
        return objArr[g10];
    }

    public final int h(Object obj) {
        int i2 = this.Y;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.L[i2] >= 0) {
                Object[] objArr = this.B;
                objArr.getClass();
                if (k.a(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i2;
        int i10;
        c cVar = new c(this, 0);
        int i11 = 0;
        while (cVar.hasNext()) {
            int i12 = cVar.A;
            e eVar = (e) cVar.R;
            if (i12 < eVar.Y) {
                cVar.A = i12 + 1;
                cVar.B = i12;
                Object obj = eVar.A[i12];
                if (obj != null) {
                    i2 = obj.hashCode();
                } else {
                    i2 = 0;
                }
                Object[] objArr = eVar.B;
                objArr.getClass();
                Object obj2 = objArr[cVar.B];
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                } else {
                    i10 = 0;
                }
                cVar.e();
                i11 += i2 ^ i10;
            } else {
                fj.j.l();
                return 0;
            }
        }
        return i11;
    }

    public final int i(Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return (i2 * (-1640531527)) >>> this.Z;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f700c0 == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        r3[r0] = r6;
        r5.L[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r6) {
        /*
            r5 = this;
            int r0 = r5.f699b0
            int r0 = r0 + 1
            r5.f699b0 = r0
            int r0 = r5.Y
            int r1 = r5.f700c0
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.R = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.Z = r6
        L1c:
            int r6 = r5.Y
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.A
            r0 = r0[r2]
            int r0 = r5.i(r0)
            int r1 = r5.X
        L2c:
            int[] r3 = r5.R
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.L
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            a0.j.p(r6)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.e.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.A
            r0.getClass()
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.B
            if (r0 == 0) goto Le
            r0[r12] = r1
        Le:
            int[] r0 = r11.L
            r0 = r0[r12]
            int r1 = r11.X
            int r1 = r1 * 2
            int[] r2 = r11.R
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1e
            r1 = r2
        L1e:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L22:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2c
            int[] r0 = r11.R
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2d
        L2c:
            r0 = r5
        L2d:
            int r4 = r4 + 1
            int r5 = r11.X
            int[] r6 = r11.R
            r7 = -1
            if (r4 <= r5) goto L39
            r6[r1] = r2
            goto L68
        L39:
            r5 = r6[r0]
            if (r5 != 0) goto L40
            r6[r1] = r2
            goto L68
        L40:
            if (r5 >= 0) goto L47
            r6[r1] = r7
        L44:
            r1 = r0
            r4 = r2
            goto L61
        L47:
            java.lang.Object[] r6 = r11.A
            int r8 = r5 + (-1)
            r6 = r6[r8]
            int r6 = r11.i(r6)
            int r6 = r6 - r0
            int[] r9 = r11.R
            int r10 = r9.length
            int r10 = r10 + (-1)
            r6 = r6 & r10
            if (r6 < r4) goto L61
            r9[r1] = r5
            int[] r4 = r11.L
            r4[r8] = r1
            goto L44
        L61:
            int r3 = r3 + r7
            if (r3 >= 0) goto L22
            int[] r0 = r11.R
            r0[r1] = r7
        L68:
            int[] r0 = r11.L
            r0[r12] = r7
            int r12 = r11.f700c0
            int r12 = r12 + r7
            r11.f700c0 = r12
            int r12 = r11.f699b0
            int r12 = r12 + 1
            r11.f699b0 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.e.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.f701d0;
        if (fVar == null) {
            f fVar2 = new f(this, 1);
            this.f701d0 = fVar2;
            return fVar2;
        }
        return fVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a10 = a(obj);
        Object[] objArr = this.B;
        if (objArr == null) {
            int length = this.A.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.B = objArr;
            } else {
                j.h("capacity must be non-negative.");
                return null;
            }
        }
        if (a10 < 0) {
            int i2 = (-a10) - 1;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        objArr[a10] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a10 = a(entry.getKey());
                Object[] objArr = this.B;
                if (objArr == null) {
                    int length = this.A.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.B = objArr;
                    } else {
                        j.h("capacity must be non-negative.");
                        return;
                    }
                }
                if (a10 >= 0) {
                    objArr[a10] = entry.getValue();
                } else {
                    int i2 = (-a10) - 1;
                    if (!k.a(entry.getValue(), objArr[i2])) {
                        objArr[i2] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g10 = g(obj);
        if (g10 < 0) {
            return null;
        }
        Object[] objArr = this.B;
        objArr.getClass();
        Object obj2 = objArr[g10];
        k(g10);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f700c0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f700c0 * 3) + 2);
        sb2.append("{");
        int i2 = 0;
        c cVar = new c(this, 0);
        while (cVar.hasNext()) {
            if (i2 > 0) {
                sb2.append(", ");
            }
            int i10 = cVar.A;
            e eVar = (e) cVar.R;
            if (i10 < eVar.Y) {
                cVar.A = i10 + 1;
                cVar.B = i10;
                Object obj = eVar.A[i10];
                if (obj == eVar) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = eVar.B;
                objArr.getClass();
                Object obj2 = objArr[cVar.B];
                if (obj2 == eVar) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                cVar.e();
                i2++;
            } else {
                fj.j.l();
                return null;
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        g gVar = this.f702e0;
        if (gVar == null) {
            g gVar2 = new g(0, this);
            this.f702e0 = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public e() {
        this(8);
    }
}
