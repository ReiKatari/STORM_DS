package p2;

import a1.f0;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import nc.k;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements RandomAccess {
    public Object[] A;
    public f0 B;
    public int L = 0;

    public b(Object[] objArr) {
        this.A = objArr;
    }

    public final void a(int i2, Object obj) {
        int i10 = this.L + 1;
        if (this.A.length < i10) {
            m(i10);
        }
        Object[] objArr = this.A;
        int i11 = this.L;
        if (i2 != i11) {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i11 - i2);
        }
        objArr[i2] = obj;
        this.L++;
    }

    public final void b(Object obj) {
        int i2 = this.L + 1;
        if (this.A.length < i2) {
            m(i2);
        }
        Object[] objArr = this.A;
        int i10 = this.L;
        objArr[i10] = obj;
        this.L = i10 + 1;
    }

    public final void c(int i2, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i10 = this.L + size;
        if (this.A.length < i10) {
            m(i10);
        }
        Object[] objArr = this.A;
        int i11 = this.L;
        if (i2 != i11) {
            System.arraycopy(objArr, i2, objArr, i2 + size, i11 - i2);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr[i2 + i12] = list.get(i12);
        }
        this.L += size;
    }

    public final void d(int i2, b bVar) {
        int i10 = bVar.L;
        if (i10 == 0) {
            return;
        }
        int i11 = this.L + i10;
        if (this.A.length < i11) {
            m(i11);
        }
        Object[] objArr = this.A;
        int i12 = this.L;
        if (i2 != i12) {
            System.arraycopy(objArr, i2, objArr, i2 + i10, i12 - i2);
        }
        System.arraycopy(bVar.A, 0, objArr, i2, i10);
        this.L += i10;
    }

    public final boolean e(int i2, Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i11 = this.L + size;
        if (this.A.length < i11) {
            m(i11);
        }
        Object[] objArr = this.A;
        int i12 = this.L;
        if (i2 != i12) {
            System.arraycopy(objArr, i2, objArr, i2 + size, i12 - i2);
        }
        for (Object obj : collection) {
            int i13 = i10 + 1;
            if (i10 >= 0) {
                objArr[i10 + i2] = obj;
                i10 = i13;
            } else {
                t.F();
                throw null;
            }
        }
        this.L += size;
        return true;
    }

    public final List f() {
        f0 f0Var = this.B;
        if (f0Var == null) {
            f0 f0Var2 = new f0(1, this);
            this.B = f0Var2;
            return f0Var2;
        }
        return f0Var;
    }

    public final void g() {
        Object[] objArr = this.A;
        int i2 = this.L;
        for (int i10 = 0; i10 < i2; i10++) {
            objArr[i10] = null;
        }
        this.L = 0;
    }

    public final boolean h(Object obj) {
        int i2 = this.L - 1;
        if (i2 >= 0) {
            for (int i10 = 0; !k.a(this.A[i10], obj); i10++) {
                if (i10 != i2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.A;
        int i2 = this.L;
        for (int i10 = 0; i10 < i2; i10++) {
            if (k.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i2 = i(obj);
        if (i2 >= 0) {
            k(i2);
            return true;
        }
        return false;
    }

    public final Object k(int i2) {
        Object[] objArr = this.A;
        Object obj = objArr[i2];
        int i10 = this.L;
        if (i2 != i10 - 1) {
            int i11 = i2 + 1;
            System.arraycopy(objArr, i11, objArr, i2, i10 - i11);
        }
        int i12 = this.L - 1;
        this.L = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void l(int i2, int i10) {
        if (i10 > i2) {
            int i11 = this.L;
            if (i10 < i11) {
                Object[] objArr = this.A;
                System.arraycopy(objArr, i10, objArr, i2, i11 - i10);
            }
            int i12 = this.L;
            int i13 = i12 - (i10 - i2);
            int i14 = i12 - 1;
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    this.A[i15] = null;
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            }
            this.L = i13;
        }
    }

    public final void m(int i2) {
        Object[] objArr = this.A;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i2, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.A = objArr2;
    }
}
