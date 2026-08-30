package a1;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f44a;

    /* renamed from: b  reason: collision with root package name */
    public int f45b;

    /* renamed from: c  reason: collision with root package name */
    public f0 f46c;

    public h0(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = s0.f100a;
        } else {
            objArr = new Object[i2];
        }
        this.f44a = objArr;
    }

    public final void a(Object obj) {
        int i2 = this.f45b + 1;
        Object[] objArr = this.f44a;
        if (objArr.length < i2) {
            m(i2, objArr);
        }
        Object[] objArr2 = this.f44a;
        int i10 = this.f45b;
        objArr2[i10] = obj;
        this.f45b = i10 + 1;
    }

    public final void b(h0 h0Var) {
        h0Var.getClass();
        if (!h0Var.h()) {
            int i2 = this.f45b + h0Var.f45b;
            Object[] objArr = this.f44a;
            if (objArr.length < i2) {
                m(i2, objArr);
            }
            zb.k.i(h0Var.f44a, this.f44a, this.f45b, 0, h0Var.f45b);
            this.f45b += h0Var.f45b;
        }
    }

    public final void c(List list) {
        if (!list.isEmpty()) {
            int i2 = this.f45b;
            int size = list.size() + i2;
            Object[] objArr = this.f44a;
            if (objArr.length < size) {
                m(size, objArr);
            }
            Object[] objArr2 = this.f44a;
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                objArr2[i10 + i2] = list.get(i10);
            }
            this.f45b = list.size() + this.f45b;
        }
    }

    public final void d() {
        zb.k.s(0, this.f45b, null, this.f44a);
        this.f45b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.f44a[0];
        }
        m9.o.x("ObjectList is empty.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            int i2 = h0Var.f45b;
            int i10 = this.f45b;
            if (i2 == i10) {
                Object[] objArr = this.f44a;
                Object[] objArr2 = h0Var.f44a;
                sc.d L = p7.j.L(0, i10);
                int i11 = L.A;
                int i12 = L.B;
                if (i11 <= i12) {
                    while (nc.k.a(objArr[i11], objArr2[i11])) {
                        if (i11 != i12) {
                            i11++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final Object f(int i2) {
        if (i2 >= 0 && i2 < this.f45b) {
            return this.f44a[i2];
        }
        n(i2);
        throw null;
    }

    public final int g(Object obj) {
        Object[] objArr = this.f44a;
        int i2 = 0;
        if (obj == null) {
            int i10 = this.f45b;
            while (i2 < i10) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int i11 = this.f45b;
        while (i2 < i11) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final boolean h() {
        if (this.f45b == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        Object[] objArr = this.f44a;
        int i10 = this.f45b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != null) {
                i2 = obj.hashCode();
            } else {
                i2 = 0;
            }
            i11 += i2 * 31;
        }
        return i11;
    }

    public final boolean i() {
        if (this.f45b != 0) {
            return true;
        }
        return false;
    }

    public final boolean j(Object obj) {
        int g10 = g(obj);
        if (g10 >= 0) {
            k(g10);
            return true;
        }
        return false;
    }

    public final Object k(int i2) {
        int i10;
        if (i2 >= 0 && i2 < (i10 = this.f45b)) {
            Object[] objArr = this.f44a;
            Object obj = objArr[i2];
            if (i2 != i10 - 1) {
                zb.k.i(objArr, objArr, i2, i2 + 1, i10);
            }
            int i11 = this.f45b - 1;
            this.f45b = i11;
            objArr[i11] = null;
            return obj;
        }
        n(i2);
        throw null;
    }

    public final void l(int i2, int i10) {
        int i11;
        if (i2 >= 0 && i2 <= (i11 = this.f45b) && i10 >= 0 && i10 <= i11) {
            if (i10 >= i2) {
                if (i10 != i2) {
                    if (i10 < i11) {
                        Object[] objArr = this.f44a;
                        zb.k.i(objArr, objArr, i2, i10, i11);
                    }
                    int i12 = this.f45b;
                    int i13 = i12 - (i10 - i2);
                    zb.k.s(i13, i12, null, this.f44a);
                    this.f45b = i13;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i2 + ") is more than end (" + i10 + ')');
        }
        a0.j.l(kc.a.j("Start (", i2, ") and end (", i10, ") must be in 0.."), this.f45b);
    }

    public final void m(int i2, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i2, (length * 3) / 2)];
        zb.k.i(objArr, objArr2, 0, 0, length);
        this.f44a = objArr2;
    }

    public final void n(int i2) {
        StringBuilder i10 = kc.a.i("Index ", i2, " must be in 0..");
        i10.append(this.f45b - 1);
        throw new IndexOutOfBoundsException(i10.toString());
    }

    public final void o(int i2) {
        StringBuilder i10 = kc.a.i("Index ", i2, " must be in 0..");
        i10.append(this.f45b);
        throw new IndexOutOfBoundsException(i10.toString());
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f44a;
        int i2 = this.f45b;
        int i10 = 0;
        while (true) {
            if (i10 < i2) {
                Object obj = objArr[i10];
                if (i10 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                if (obj == this) {
                    valueOf = "(this)";
                } else {
                    valueOf = String.valueOf(obj);
                }
                sb2.append((CharSequence) valueOf);
                i10++;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        return sb2.toString();
    }

    public /* synthetic */ h0() {
        this(16);
    }
}
