package a1;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class w0 {
    public int[] A;
    public Object[] B;
    public int L;

    public w0(int i2) {
        int[] iArr;
        Object[] objArr;
        if (i2 == 0) {
            iArr = b1.a.f1739a;
        } else {
            iArr = new int[i2];
        }
        this.A = iArr;
        if (i2 == 0) {
            objArr = b1.a.f1741c;
        } else {
            objArr = new Object[i2 << 1];
        }
        this.B = objArr;
    }

    public final int a(Object obj) {
        int i2 = this.L * 2;
        Object[] objArr = this.B;
        if (obj == null) {
            for (int i10 = 1; i10 < i2; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i2; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i2) {
        int i10 = this.L;
        int[] iArr = this.A;
        if (iArr.length < i2) {
            this.A = Arrays.copyOf(iArr, i2);
            this.B = Arrays.copyOf(this.B, i2 * 2);
        }
        if (this.L == i10) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final int c(int i2, Object obj) {
        int i10 = this.L;
        if (i10 == 0) {
            return -1;
        }
        int a10 = b1.a.a(i10, i2, this.A);
        if (a10 < 0 || nc.k.a(obj, this.B[a10 << 1])) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.A[i11] == i2) {
            if (nc.k.a(obj, this.B[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.A[i12] == i2; i12--) {
            if (nc.k.a(obj, this.B[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void clear() {
        if (this.L > 0) {
            this.A = b1.a.f1739a;
            this.B = b1.a.f1741c;
            this.L = 0;
        }
        if (this.L <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i2 = this.L;
        if (i2 == 0) {
            return -1;
        }
        int a10 = b1.a.a(i2, 0, this.A);
        if (a10 < 0 || this.B[a10 << 1] == null) {
            return a10;
        }
        int i10 = a10 + 1;
        while (i10 < i2 && this.A[i10] == 0) {
            if (this.B[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a10 - 1; i11 >= 0 && this.A[i11] == 0; i11--) {
            if (this.B[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof w0) {
                int i2 = this.L;
                if (i2 != ((w0) obj).L) {
                    return false;
                }
                w0 w0Var = (w0) obj;
                for (int i10 = 0; i10 < i2; i10++) {
                    Object f8 = f(i10);
                    Object i11 = i(i10);
                    Object obj2 = w0Var.get(f8);
                    if (i11 == null) {
                        if (obj2 != null || !w0Var.containsKey(f8)) {
                            return false;
                        }
                    } else if (!i11.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.L != ((Map) obj).size()) {
                return false;
            } else {
                int i12 = this.L;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object f10 = f(i13);
                    Object i14 = i(i13);
                    Object obj3 = ((Map) obj).get(f10);
                    if (i14 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(f10)) {
                            return false;
                        }
                    } else if (!i14.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i2) {
        boolean z10 = false;
        if (i2 >= 0 && i2 < this.L) {
            z10 = true;
        }
        if (z10) {
            return this.B[i2 << 1];
        }
        a0.j.h(w.d.l(i2, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object g(int i2) {
        int i10;
        if (i2 >= 0 && i2 < (i10 = this.L)) {
            Object[] objArr = this.B;
            int i11 = i2 << 1;
            Object obj = objArr[i11 + 1];
            if (i10 <= 1) {
                clear();
                return obj;
            }
            int i12 = i10 - 1;
            int[] iArr = this.A;
            int i13 = 8;
            if (iArr.length > 8 && i10 < iArr.length / 3) {
                if (i10 > 8) {
                    i13 = i10 + (i10 >> 1);
                }
                this.A = Arrays.copyOf(iArr, i13);
                this.B = Arrays.copyOf(this.B, i13 << 1);
                if (i10 == this.L) {
                    if (i2 > 0) {
                        zb.k.g(0, 0, i2, iArr, this.A);
                        zb.k.i(objArr, this.B, 0, 0, i11);
                    }
                    if (i2 < i12) {
                        int i14 = i2 + 1;
                        zb.k.g(i2, i14, i10, iArr, this.A);
                        zb.k.i(objArr, this.B, i11, i14 << 1, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i2 < i12) {
                    int i15 = i2 + 1;
                    zb.k.g(i2, i15, i10, iArr, iArr);
                    Object[] objArr2 = this.B;
                    zb.k.i(objArr2, objArr2, i11, i15 << 1, i10 << 1);
                }
                Object[] objArr3 = this.B;
                int i16 = i12 << 1;
                objArr3[i16] = null;
                objArr3[i16 + 1] = null;
            }
            if (i10 == this.L) {
                this.L = i12;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        a0.j.h(w.d.l(i2, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object get(Object obj) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return this.B[(d4 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return this.B[(d4 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i2, Object obj) {
        boolean z10 = false;
        if (i2 >= 0 && i2 < this.L) {
            z10 = true;
        }
        if (z10) {
            int i10 = (i2 << 1) + 1;
            Object[] objArr = this.B;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
            return obj2;
        }
        a0.j.h(w.d.l(i2, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final int hashCode() {
        int i2;
        int[] iArr = this.A;
        Object[] objArr = this.B;
        int i10 = this.L;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj != null) {
                i2 = obj.hashCode();
            } else {
                i2 = 0;
            }
            i13 += i2 ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final Object i(int i2) {
        boolean z10 = false;
        if (i2 >= 0 && i2 < this.L) {
            z10 = true;
        }
        if (z10) {
            return this.B[(i2 << 1) + 1];
        }
        a0.j.h(w.d.l(i2, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean isEmpty() {
        if (this.L <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int e6;
        int i10 = this.L;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        if (obj != null) {
            e6 = c(i2, obj);
        } else {
            e6 = e();
        }
        if (e6 >= 0) {
            int i11 = (e6 << 1) + 1;
            Object[] objArr = this.B;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~e6;
        int[] iArr = this.A;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            this.A = Arrays.copyOf(iArr, i13);
            this.B = Arrays.copyOf(this.B, i13 << 1);
            if (i10 != this.L) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.A;
            int i14 = i12 + 1;
            zb.k.g(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.B;
            zb.k.i(objArr2, objArr2, i14 << 1, i12 << 1, this.L << 1);
        }
        int i15 = this.L;
        if (i10 == i15) {
            int[] iArr3 = this.A;
            if (i12 < iArr3.length) {
                iArr3[i12] = i2;
                Object[] objArr3 = this.B;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.L = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 >= 0 && nc.k.a(obj2, i(d4))) {
            g(d4);
            return true;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d4 = d(obj);
        if (d4 >= 0 && nc.k.a(obj2, i(d4))) {
            h(d4, obj3);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.L;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.L * 28);
        sb2.append('{');
        int i2 = this.L;
        for (int i10 = 0; i10 < i2; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object f8 = f(i10);
            if (f8 != sb2) {
                sb2.append(f8);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object i11 = i(i10);
            if (i11 != sb2) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Object remove(Object obj) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return g(d4);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return h(d4, obj2);
        }
        return null;
    }
}
