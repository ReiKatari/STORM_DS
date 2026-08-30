package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m66  reason: default package */
/* loaded from: classes.dex */
public class m66 {
    public int[] A;
    public Object[] B;
    public int L;

    public m66(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = pu.e;
        } else {
            iArr = new int[i];
        }
        this.A = iArr;
        if (i == 0) {
            objArr = pu.g;
        } else {
            objArr = new Object[i << 1];
        }
        this.B = objArr;
    }

    public final int a(Object obj) {
        int i = this.L * 2;
        Object[] objArr = this.B;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.L;
        int[] iArr = this.A;
        if (iArr.length < i) {
            this.A = Arrays.copyOf(iArr, i);
            this.B = Arrays.copyOf(this.B, i * 2);
        }
        if (this.L == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final int c(int i, Object obj) {
        int i2 = this.L;
        if (i2 == 0) {
            return -1;
        }
        int l = pu.l(i2, i, this.A);
        if (l < 0 || b53.x(obj, this.B[l << 1])) {
            return l;
        }
        int i3 = l + 1;
        while (i3 < i2 && this.A[i3] == i) {
            if (b53.x(obj, this.B[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = l - 1; i4 >= 0 && this.A[i4] == i; i4--) {
            if (b53.x(obj, this.B[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.L > 0) {
            this.A = pu.e;
            this.B = pu.g;
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
        int i = this.L;
        if (i == 0) {
            return -1;
        }
        int l = pu.l(i, 0, this.A);
        if (l < 0 || this.B[l << 1] == null) {
            return l;
        }
        int i2 = l + 1;
        while (i2 < i && this.A[i2] == 0) {
            if (this.B[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = l - 1; i3 >= 0 && this.A[i3] == 0; i3--) {
            if (this.B[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof m66) {
                int i = this.L;
                if (i != ((m66) obj).L) {
                    return false;
                }
                m66 m66Var = (m66) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object f = f(i2);
                    Object i3 = i(i2);
                    Object obj2 = m66Var.get(f);
                    if (i3 == null) {
                        if (obj2 != null || !m66Var.containsKey(f)) {
                            return false;
                        }
                    } else if (!i3.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.L != ((Map) obj).size()) {
                return false;
            } else {
                int i4 = this.L;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object f2 = f(i5);
                    Object i6 = i(i5);
                    Object obj3 = ((Map) obj).get(f2);
                    if (i6 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(f2)) {
                            return false;
                        }
                    } else if (!i6.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.L) {
            z = true;
        }
        if (z) {
            return this.B[i << 1];
        }
        i.i(wh1.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object g(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.L)) {
            Object[] objArr = this.B;
            int i3 = i << 1;
            Object obj = objArr[i3 + 1];
            if (i2 <= 1) {
                clear();
                return obj;
            }
            int i4 = i2 - 1;
            int[] iArr = this.A;
            int i5 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                this.A = Arrays.copyOf(iArr, i5);
                this.B = Arrays.copyOf(this.B, i5 << 1);
                if (i2 == this.L) {
                    if (i > 0) {
                        nu.d0(0, 0, i, iArr, this.A);
                        nu.f0(objArr, this.B, 0, 0, i3);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        nu.d0(i, i6, i2, iArr, this.A);
                        nu.f0(objArr, this.B, i3, i6 << 1, i2 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    nu.d0(i, i7, i2, iArr, iArr);
                    Object[] objArr2 = this.B;
                    nu.f0(objArr2, objArr2, i3, i7 << 1, i2 << 1);
                }
                Object[] objArr3 = this.B;
                int i8 = i4 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            }
            if (i2 == this.L) {
                this.L = i4;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        i.i(wh1.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.B[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return this.B[(d << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.L) {
            z = true;
        }
        if (z) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.B;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        i.i(wh1.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.A;
        Object[] objArr = this.B;
        int i2 = this.L;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final Object i(int i) {
        boolean z = false;
        if (i >= 0 && i < this.L) {
            z = true;
        }
        if (z) {
            return this.B[(i << 1) + 1];
        }
        i.i(wh1.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean isEmpty() {
        if (this.L <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int e;
        int i2 = this.L;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj != null) {
            e = c(i, obj);
        } else {
            e = e();
        }
        if (e >= 0) {
            int i3 = (e << 1) + 1;
            Object[] objArr = this.B;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~e;
        int[] iArr = this.A;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            this.A = Arrays.copyOf(iArr, i5);
            this.B = Arrays.copyOf(this.B, i5 << 1);
            if (i2 != this.L) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.A;
            int i6 = i4 + 1;
            nu.d0(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.B;
            nu.f0(objArr2, objArr2, i6 << 1, i4 << 1, this.L << 1);
        }
        int i7 = this.L;
        if (i2 == i7) {
            int[] iArr3 = this.A;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.B;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.L = i7 + 1;
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
        int d = d(obj);
        if (d >= 0 && b53.x(obj2, i(d))) {
            g(d);
            return true;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d >= 0 && b53.x(obj2, i(d))) {
            h(d, obj3);
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
        StringBuilder sb = new StringBuilder(this.L * 28);
        sb.append('{');
        int i = this.L;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i3 = i(i2);
            if (i3 != sb) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return g(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return h(d, obj2);
        }
        return null;
    }
}
