package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p04  reason: default package */
/* loaded from: classes.dex */
public final class p04 implements Map, Serializable, cg3 {
    public static final p04 j0;
    public Object[] A;
    public Object[] B;
    public int[] L;
    public int[] R;
    public int X;
    public int Y;
    public int Z;
    public int d0;
    public int e0;
    public q04 f0;
    public r04 g0;
    public q04 h0;
    public boolean i0;

    static {
        p04 p04Var = new p04(0);
        p04Var.i0 = true;
        j0 = p04Var;
    }

    public p04(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.A = objArr;
            this.B = null;
            this.L = iArr;
            this.R = new int[highestOneBit];
            this.X = 2;
            this.Y = 0;
            this.Z = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        i.h("capacity must be non-negative.");
        throw null;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.X * 2;
            int length = this.R.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.R;
                int i4 = iArr[i];
                if (i4 == 0) {
                    int i5 = this.Y;
                    Object[] objArr = this.A;
                    if (i5 >= objArr.length) {
                        f(1);
                    } else {
                        int i6 = i5 + 1;
                        this.Y = i6;
                        objArr[i5] = obj;
                        this.L[i5] = i;
                        iArr[i] = i6;
                        this.e0++;
                        this.d0++;
                        if (i3 > this.X) {
                            this.X = i3;
                        }
                        return i5;
                    }
                } else if (nb3.k(this.A[i4 - 1], obj)) {
                    return -i4;
                } else {
                    i3++;
                    if (i3 > i2) {
                        j(this.R.length * 2);
                        break;
                    }
                    int i7 = i - 1;
                    if (i == 0) {
                        i = this.R.length - 1;
                    } else {
                        i = i7;
                    }
                }
            }
        }
    }

    public final p04 b() {
        c();
        this.i0 = true;
        if (this.e0 > 0) {
            return this;
        }
        p04 p04Var = j0;
        p04Var.getClass();
        return p04Var;
    }

    public final void c() {
        if (!this.i0) {
            return;
        }
        e41.t();
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.Y - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.L;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.R[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        qo2.L(this.A, 0, this.Y);
        Object[] objArr = this.B;
        if (objArr != null) {
            qo2.L(objArr, 0, this.Y);
        }
        this.e0 = 0;
        this.Y = 0;
        this.d0++;
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

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.B;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.Y;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.L;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.A;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.R[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        qo2.L(this.A, i3, i);
        if (objArr != null) {
            qo2.L(objArr, i3, this.Y);
        }
        this.Y = i3;
    }

    public final boolean e(Collection collection) {
        boolean k;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = g(entry.getKey());
                    if (g < 0) {
                        k = false;
                        continue;
                    } else {
                        Object[] objArr = this.B;
                        objArr.getClass();
                        k = nb3.k(objArr[g], entry.getValue());
                        continue;
                    }
                    if (!k) {
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
        q04 q04Var = this.h0;
        if (q04Var == null) {
            q04 q04Var2 = new q04(this, 0);
            this.h0 = q04Var2;
            return q04Var2;
        }
        return q04Var;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.e0 != map.size() || !e(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
        Object[] objArr;
        Object[] objArr2 = this.A;
        int length = objArr2.length;
        int i2 = this.Y;
        int i3 = length - i2;
        int i4 = i2 - this.e0;
        int i5 = 1;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i6 = i2 + i;
        if (i6 >= 0) {
            if (i6 > objArr2.length) {
                int length2 = objArr2.length;
                int i7 = length2 + (length2 >> 1);
                if (i7 - i6 < 0) {
                    i7 = i6;
                }
                if (i7 - 2147483639 > 0) {
                    if (i6 > 2147483639) {
                        i7 = Integer.MAX_VALUE;
                    } else {
                        i7 = 2147483639;
                    }
                }
                this.A = Arrays.copyOf(objArr2, i7);
                Object[] objArr3 = this.B;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i7);
                } else {
                    objArr = null;
                }
                this.B = objArr;
                this.L = Arrays.copyOf(this.L, i7);
                if (i7 >= 1) {
                    i5 = i7;
                }
                int highestOneBit = Integer.highestOneBit(i5 * 3);
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
        int i = i(obj);
        int i2 = this.X;
        while (true) {
            int i3 = this.R[i];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (nb3.k(this.A[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            int i5 = i - 1;
            if (i == 0) {
                i = this.R.length - 1;
            } else {
                i = i5;
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.B;
        objArr.getClass();
        return objArr[g];
    }

    public final int h(Object obj) {
        int i = this.Y;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.L[i] >= 0) {
                Object[] objArr = this.B;
                objArr.getClass();
                if (nb3.k(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i2;
        m04 m04Var = new m04(this, 0);
        int i3 = 0;
        while (m04Var.hasNext()) {
            int i4 = m04Var.A;
            p04 p04Var = (p04) m04Var.R;
            if (i4 < p04Var.Y) {
                m04Var.A = i4 + 1;
                m04Var.B = i4;
                Object obj = p04Var.A[i4];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = p04Var.B;
                objArr.getClass();
                Object obj2 = objArr[m04Var.B];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                m04Var.e();
                i3 += i ^ i2;
            } else {
                fa6.c();
                return 0;
            }
        }
        return i3;
    }

    public final int i(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.Z;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.e0 == 0) {
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
    */
    public final void j(int i) {
        this.d0++;
        int i2 = 0;
        if (this.Y > this.e0) {
            d(false);
        }
        this.R = new int[i];
        this.Z = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.Y) {
            int i3 = i2 + 1;
            int i4 = i(this.A[i2]);
            int i5 = this.X;
            while (true) {
                int[] iArr = this.R;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 >= 0) {
                    int i6 = i4 - 1;
                    if (i4 == 0) {
                        i4 = iArr.length - 1;
                    } else {
                        i4 = i6;
                    }
                } else {
                    i.m("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
            }
        }
    }

    public final void k(int i) {
        int i2;
        int i3;
        int[] iArr;
        Object[] objArr = this.A;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.B;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.L[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                int i7 = i4 - 1;
                if (i4 == 0) {
                    i4 = this.R.length - 1;
                } else {
                    i4 = i7;
                }
                int[] iArr2 = this.R;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.X) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iArr = this.R;
                }
            } while (((i(this.A[i3]) - i4) & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.L[i3] = i5;
        }
        this.L[i] = -1;
        this.e0--;
        this.d0++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        q04 q04Var = this.f0;
        if (q04Var == null) {
            q04 q04Var2 = new q04(this, 1);
            this.f0 = q04Var2;
            return q04Var2;
        }
        return q04Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.B;
        if (objArr == null) {
            int length = this.A.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.B = objArr;
            } else {
                i.h("capacity must be non-negative.");
                return null;
            }
        }
        if (a < 0) {
            int i = (-a) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[a] = obj2;
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
                int a = a(entry.getKey());
                Object[] objArr = this.B;
                if (objArr == null) {
                    int length = this.A.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.B = objArr;
                    } else {
                        i.h("capacity must be non-negative.");
                        return;
                    }
                }
                if (a >= 0) {
                    objArr[a] = entry.getValue();
                } else {
                    int i = (-a) - 1;
                    if (!nb3.k(entry.getValue(), objArr[i])) {
                        objArr[i] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.B;
        objArr.getClass();
        Object obj2 = objArr[g];
        k(g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.e0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.e0 * 3) + 2);
        sb.append("{");
        int i = 0;
        m04 m04Var = new m04(this, 0);
        while (m04Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = m04Var.A;
            p04 p04Var = (p04) m04Var.R;
            if (i2 < p04Var.Y) {
                m04Var.A = i2 + 1;
                m04Var.B = i2;
                Object obj = p04Var.A[i2];
                if (obj == p04Var) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = p04Var.B;
                objArr.getClass();
                Object obj2 = objArr[m04Var.B];
                if (obj2 == p04Var) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                m04Var.e();
                i++;
            } else {
                fa6.c();
                return null;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        r04 r04Var = this.g0;
        if (r04Var == null) {
            r04 r04Var2 = new r04(this, 0);
            this.g0 = r04Var2;
            return r04Var2;
        }
        return r04Var;
    }

    public p04() {
        this(8);
    }
}
