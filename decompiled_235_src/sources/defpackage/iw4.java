package defpackage;

import java.util.Arrays;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw4  reason: default package */
/* loaded from: classes.dex */
public final class iw4 extends h1 {
    public final Object[] A;
    public final Object[] B;
    public final int L;
    public final int R;

    public iw4(Object[] objArr, Object[] objArr2, int i, int i2) {
        boolean z;
        this.A = objArr;
        this.B = objArr2;
        this.L = i;
        this.R = i2;
        if (a() > 32) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            r05.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] j(Object[] objArr, int i, int i2, Object obj, u2 u2Var) {
        Object[] copyOf;
        int R = uj2.R(i2, i);
        if (i == 0) {
            if (R == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            fv.t0(objArr, copyOf, R + 1, R, 31);
            u2Var.b = objArr[31];
            copyOf[R] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[R];
        obj2.getClass();
        copyOf2[R] = j((Object[]) obj2, i3, i2, obj, u2Var);
        while (true) {
            R++;
            if (R >= 32 || copyOf2[R] == null) {
                break;
            }
            Object obj3 = objArr[R];
            obj3.getClass();
            copyOf2[R] = j((Object[]) obj3, i3, 0, u2Var.b, u2Var);
        }
        return copyOf2;
    }

    public static Object[] m(Object[] objArr, int i, int i2, u2 u2Var) {
        Object[] m;
        int R = uj2.R(i2, i);
        if (i == 5) {
            u2Var.b = objArr[R];
            m = null;
        } else {
            Object obj = objArr[R];
            obj.getClass();
            m = m((Object[]) obj, i - 5, i2, u2Var);
        }
        if (m == null && R == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[R] = m;
        return copyOf;
    }

    public static Object[] t(int i, int i2, Object obj, Object[] objArr) {
        int R = uj2.R(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[R] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[R];
        obj2.getClass();
        copyOf[R] = t(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // defpackage.l0
    public final int a() {
        return this.L;
    }

    @Override // defpackage.h1
    public final h1 b(int i, Object obj) {
        int i2 = this.L;
        np2.y(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int s = s();
        Object[] objArr = this.A;
        if (i >= s) {
            return l(obj, objArr, i - s);
        }
        u2 u2Var = new u2((Object) null, 5);
        return l(u2Var.b, j(objArr, this.R, i, obj, u2Var), 0);
    }

    @Override // defpackage.h1
    public final h1 c(Object obj) {
        int s = s();
        int i = this.L;
        int i2 = i - s;
        Object[] objArr = this.A;
        Object[] objArr2 = this.B;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new iw4(objArr, copyOf, i + 1, this.R);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return o(objArr, objArr2, objArr3);
    }

    @Override // defpackage.h1
    public final jw4 f() {
        return new jw4(this, this.A, this.B, this.R);
    }

    @Override // defpackage.h1
    public final h1 g(g1 g1Var) {
        jw4 jw4Var = new jw4(this, this.A, this.B, this.R);
        jw4Var.D(g1Var);
        return jw4Var.c();
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        np2.w(i, a());
        if (s() <= i) {
            objArr = this.B;
        } else {
            Object[] objArr2 = this.A;
            for (int i2 = this.R; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[uj2.R(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.h1
    public final h1 h(int i) {
        np2.w(i, a());
        int s = s();
        int i2 = this.R;
        Object[] objArr = this.A;
        if (i >= s) {
            return r(objArr, s, i2, i - s);
        }
        return r(q(objArr, i2, i, new u2(this.B[0], 5)), s, i2, 0);
    }

    @Override // defpackage.h1
    public final h1 i(int i, Object obj) {
        int i2 = this.L;
        np2.w(i, i2);
        int s = s();
        Object[] objArr = this.A;
        Object[] objArr2 = this.B;
        int i3 = this.R;
        if (s <= i) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i & 31] = obj;
            return new iw4(objArr, copyOf, i2, i3);
        }
        return new iw4(t(i3, i, obj, objArr), objArr2, i2, i3);
    }

    public final iw4 l(Object obj, Object[] objArr, int i) {
        int s = s();
        int i2 = this.L;
        int i3 = i2 - s;
        Object[] objArr2 = this.B;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            fv.t0(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new iw4(objArr, copyOf, i2 + 1, this.R);
        }
        Object obj2 = objArr2[31];
        fv.t0(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return o(objArr, copyOf, objArr3);
    }

    @Override // defpackage.z0, java.util.List
    public final ListIterator listIterator(int i) {
        np2.y(i, this.L);
        return new kw4(this.A, this.B, i, this.L, (this.R / 5) + 1);
    }

    public final iw4 o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.L;
        int i2 = i >> 5;
        int i3 = this.R;
        if (i2 > (1 << i3)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i4 = i3 + 5;
            return new iw4(p(i4, objArr4, objArr2), objArr3, i + 1, i4);
        }
        return new iw4(p(i3, objArr, objArr2), objArr3, i + 1, i3);
    }

    public final Object[] p(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int R = uj2.R(a() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[R] = objArr2;
            return objArr3;
        }
        objArr3[R] = p(i - 5, (Object[]) objArr3[R], objArr2);
        return objArr3;
    }

    public final Object[] q(Object[] objArr, int i, int i2, u2 u2Var) {
        Object[] copyOf;
        int R = uj2.R(i2, i);
        int i3 = 31;
        if (i == 0) {
            if (R == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            fv.t0(objArr, copyOf, R, R + 1, 32);
            copyOf[31] = u2Var.b;
            u2Var.b = objArr[R];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = uj2.R(s() - 1, i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        int i5 = R + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj = copyOf2[i3];
                obj.getClass();
                copyOf2[i3] = q((Object[]) obj, i4, 0, u2Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf2[R];
        obj2.getClass();
        copyOf2[R] = q((Object[]) obj2, i4, i2, u2Var);
        return copyOf2;
    }

    public final h1 r(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.L - i;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                }
                return new qk6(objArr);
            }
            u2 u2Var = new u2((Object) null, 5);
            Object[] m = m(objArr, i2, i - 1, u2Var);
            m.getClass();
            Object obj = u2Var.b;
            obj.getClass();
            Object[] objArr2 = (Object[]) obj;
            if (m[1] == null) {
                Object obj2 = m[0];
                obj2.getClass();
                return new iw4((Object[]) obj2, objArr2, i, i2 - 5);
            }
            return new iw4(m, objArr2, i, i2);
        }
        Object[] objArr3 = this.B;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        int i5 = i4 - 1;
        if (i3 < i5) {
            fv.t0(objArr3, copyOf, i3, i3 + 1, i4);
        }
        copyOf[i5] = null;
        return new iw4(objArr, copyOf, (i + i4) - 1, i2);
    }

    public final int s() {
        return (this.L - 1) & (-32);
    }
}
