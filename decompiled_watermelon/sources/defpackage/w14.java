package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w14  reason: default package */
/* loaded from: classes.dex */
public final class w14 {
    public Object[] a;
    public int b;
    public u14 c;

    public w14(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = b94.a;
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

    public final void b(w14 w14Var) {
        w14Var.getClass();
        if (!w14Var.h()) {
            int i = this.b + w14Var.b;
            Object[] objArr = this.a;
            if (objArr.length < i) {
                m(i, objArr);
            }
            nu.f0(w14Var.a, this.a, this.b, 0, w14Var.b);
            this.b += w14Var.b;
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
        nu.l0(0, this.b, null, this.a);
        this.b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.a[0];
        }
        vd6.e("ObjectList is empty.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w14) {
            w14 w14Var = (w14) obj;
            int i = w14Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = w14Var.a;
                d33 t0 = io2.t0(0, i2);
                int i3 = t0.A;
                int i4 = t0.B;
                if (i3 <= i4) {
                    while (b53.x(objArr[i3], objArr2[i3])) {
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
                nu.f0(objArr, objArr, i, i + 1, i2);
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
                        nu.f0(objArr, objArr, i, i2, i3);
                    }
                    int i4 = this.b;
                    int i5 = i4 - (i2 - i);
                    nu.l0(i5, i4, null, this.a);
                    this.b = i5;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        c44.p(b31.s(i, i2, "Start (", ") and end (", ") must be in 0.."), this.b);
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        nu.f0(objArr, objArr2, 0, 0, length);
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
        StringBuilder s = wh1.s("Index ", i, " must be in 0..");
        s.append(this.b - 1);
        throw new IndexOutOfBoundsException(s.toString());
    }

    public final void p(int i) {
        StringBuilder s = wh1.s("Index ", i, " must be in 0..");
        s.append(this.b);
        throw new IndexOutOfBoundsException(s.toString());
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

    public /* synthetic */ w14() {
        this(16);
    }
}
