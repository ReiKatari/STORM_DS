package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ua4  reason: default package */
/* loaded from: classes.dex */
public final class ua4 implements RandomAccess {
    public Object[] A;
    public aa4 B;
    public int L = 0;

    public ua4(Object[] objArr) {
        this.A = objArr;
    }

    public final void a(int i, Object obj) {
        int i2 = this.L + 1;
        if (this.A.length < i2) {
            n(i2);
        }
        Object[] objArr = this.A;
        int i3 = this.L;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.L++;
    }

    public final void b(Object obj) {
        int i = this.L + 1;
        if (this.A.length < i) {
            n(i);
        }
        Object[] objArr = this.A;
        int i2 = this.L;
        objArr[i2] = obj;
        this.L = i2 + 1;
    }

    public final void c(int i, ua4 ua4Var) {
        int i2 = ua4Var.L;
        if (i2 == 0) {
            return;
        }
        int i3 = this.L + i2;
        if (this.A.length < i3) {
            n(i3);
        }
        Object[] objArr = this.A;
        int i4 = this.L;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(ua4Var.A, 0, objArr, i, i2);
        this.L += i2;
    }

    public final void d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.L + size;
        if (this.A.length < i2) {
            n(i2);
        }
        Object[] objArr = this.A;
        int i3 = this.L;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.L += size;
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.L + size;
        if (this.A.length < i3) {
            n(i3);
        }
        Object[] objArr = this.A;
        int i4 = this.L;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                objArr[i2 + i] = obj;
                i2 = i5;
            } else {
                hf.q0();
                throw null;
            }
        }
        this.L += size;
        return true;
    }

    public final List f() {
        aa4 aa4Var = this.B;
        if (aa4Var == null) {
            aa4 aa4Var2 = new aa4(this, 1);
            this.B = aa4Var2;
            return aa4Var2;
        }
        return aa4Var;
    }

    public final void g() {
        Object[] objArr = this.A;
        int i = this.L;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.L = 0;
    }

    public final boolean h(Object obj) {
        int i = this.L - 1;
        if (i >= 0) {
            for (int i2 = 0; !nb3.k(this.A[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.A;
        int i = this.L;
        for (int i2 = 0; i2 < i; i2++) {
            if (nb3.k(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i = i(obj);
        if (i >= 0) {
            l(i);
            return true;
        }
        return false;
    }

    public final Object l(int i) {
        Object[] objArr = this.A;
        Object obj = objArr[i];
        int i2 = this.L;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.L - 1;
        this.L = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        if (i2 > i) {
            int i3 = this.L;
            if (i2 < i3) {
                Object[] objArr = this.A;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.L;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.A[i7] = null;
                    if (i7 == i6) {
                        break;
                    }
                    i7++;
                }
            }
            this.L = i5;
        }
    }

    public final void n(int i) {
        Object[] objArr = this.A;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.A = objArr2;
    }
}
