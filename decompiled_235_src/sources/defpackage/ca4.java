package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ca4  reason: default package */
/* loaded from: classes.dex */
public final class ca4 {
    public Object[] a;
    public int b;
    public aa4 c;

    public ca4(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = uh4.a;
        } else {
            objArr = new Object[i];
        }
        this.a = objArr;
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(ca4 ca4Var) {
        ca4Var.getClass();
        if (!ca4Var.h()) {
            int i = this.b + ca4Var.b;
            Object[] objArr = this.a;
            if (objArr.length < i) {
                m(i, objArr);
            }
            fv.t0(ca4Var.a, this.a, this.b, 0, ca4Var.b);
            this.b += ca4Var.b;
        }
    }

    public final void c(List list) {
        if (!list.isEmpty()) {
            int i = this.b;
            int size = list.size() + i;
            Object[] objArr = this.a;
            if (objArr.length < size) {
                m(size, objArr);
            }
            Object[] objArr2 = this.a;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                objArr2[i2 + i] = list.get(i2);
            }
            this.b = list.size() + this.b;
        }
    }

    public final void d() {
        fv.z0(0, this.b, null, this.a);
        this.b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.a[0];
        }
        fa6.e("ObjectList is empty.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ca4) {
            ca4 ca4Var = (ca4) obj;
            int i = ca4Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = ca4Var.a;
                l93 R = gi2.R(0, i2);
                int i3 = R.A;
                int i4 = R.B;
                if (i3 <= i4) {
                    while (nb3.k(objArr[i3], objArr2[i3])) {
                        if (i3 != i4) {
                            i3++;
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

    public final Object f(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        o(i);
        throw null;
    }

    public final int g(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean h() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 += i * 31;
        }
        return i3;
    }

    public final boolean i() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final boolean j(Object obj) {
        int g = g(obj);
        if (g >= 0) {
            k(g);
            return true;
        }
        return false;
    }

    public final Object k(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            Object[] objArr = this.a;
            Object obj = objArr[i];
            if (i != i2 - 1) {
                fv.t0(objArr, objArr, i, i + 1, i2);
            }
            int i3 = this.b - 1;
            this.b = i3;
            objArr[i3] = null;
            return obj;
        }
        o(i);
        throw null;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this.b) && i2 >= 0 && i2 <= i3) {
            if (i2 >= i) {
                if (i2 != i) {
                    if (i2 < i3) {
                        Object[] objArr = this.a;
                        fv.t0(objArr, objArr, i, i2, i3);
                    }
                    int i4 = this.b;
                    int i5 = i4 - (i2 - i);
                    fv.z0(i5, i4, null, this.a);
                    this.b = i5;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        u34.q(i61.q(i, i2, "Start (", ") and end (", ") must be in 0.."), this.b);
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        fv.t0(objArr, objArr2, 0, 0, length);
        this.a = objArr2;
    }

    public final Object n(int i, Object obj) {
        if (i >= 0 && i < this.b) {
            Object[] objArr = this.a;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        o(i);
        throw null;
    }

    public final void o(int i) {
        StringBuilder t = xg6.t("Index ", i, " must be in 0..");
        t.append(this.b - 1);
        throw new IndexOutOfBoundsException(t.toString());
    }

    public final void p(int i) {
        StringBuilder t = xg6.t("Index ", i, " must be in 0..");
        t.append(this.b);
        throw new IndexOutOfBoundsException(t.toString());
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                Object obj = objArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                if (obj == this) {
                    valueOf = "(this)";
                } else {
                    valueOf = String.valueOf(obj);
                }
                sb.append((CharSequence) valueOf);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }

    public /* synthetic */ ca4() {
        this(16);
    }
}
