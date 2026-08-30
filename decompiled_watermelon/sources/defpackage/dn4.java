package defpackage;

import java.util.Arrays;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dn4  reason: default package */
/* loaded from: classes.dex */
public final class dn4 extends g1 {
    public final Object[] A;
    public final Object[] B;
    public final int L;
    public final int R;

    public dn4(Object[] objArr, Object[] objArr2, int i, int i2) {
        boolean z;
        this.A = objArr;
        this.B = objArr2;
        this.L = i;
        this.R = i2;
        if (b() > 32) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            or4.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] n(Object[] objArr, int i, int i2, Object obj, s2 s2Var) {
        Object[] copyOf;
        int E = mj2.E(i2, i);
        if (i == 0) {
            if (E == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            nu.f0(objArr, copyOf, E + 1, E, 31);
            s2Var.b = objArr[31];
            copyOf[E] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[E];
        obj2.getClass();
        copyOf2[E] = n((Object[]) obj2, i3, i2, obj, s2Var);
        while (true) {
            E++;
            if (E >= 32 || copyOf2[E] == null) {
                break;
            }
            Object obj3 = objArr[E];
            obj3.getClass();
            copyOf2[E] = n((Object[]) obj3, i3, 0, s2Var.b, s2Var);
        }
        return copyOf2;
    }

    public static Object[] p(Object[] objArr, int i, int i2, s2 s2Var) {
        Object[] p;
        int E = mj2.E(i2, i);
        if (i == 5) {
            s2Var.b = objArr[E];
            p = null;
        } else {
            Object obj = objArr[E];
            obj.getClass();
            p = p((Object[]) obj, i - 5, i2, s2Var);
        }
        if (p == null && E == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[E] = p;
        return copyOf;
    }

    public static Object[] v(int i, int i2, Object obj, Object[] objArr) {
        int E = mj2.E(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[E] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[E];
        obj2.getClass();
        copyOf[E] = v(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // defpackage.k0
    public final int b() {
        return this.L;
    }

    @Override // defpackage.g1
    public final g1 c(int i, Object obj) {
        int i2 = this.L;
        sn2.q(i, i2);
        if (i == i2) {
            return d(obj);
        }
        int u = u();
        Object[] objArr = this.A;
        if (i >= u) {
            return o(objArr, i - u, obj);
        }
        s2 s2Var = new s2(3, null);
        return o(n(objArr, this.R, i, obj, s2Var), 0, s2Var.b);
    }

    @Override // defpackage.g1
    public final g1 d(Object obj) {
        int u = u();
        int i = this.L;
        int i2 = i - u;
        Object[] objArr = this.A;
        Object[] objArr2 = this.B;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new dn4(objArr, copyOf, i + 1, this.R);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return q(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        sn2.p(i, b());
        if (u() <= i) {
            objArr = this.B;
        } else {
            Object[] objArr2 = this.A;
            for (int i2 = this.R; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[mj2.E(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.g1
    public final en4 j() {
        return new en4(this, this.A, this.B, this.R);
    }

    @Override // defpackage.g1
    public final g1 k(f1 f1Var) {
        en4 en4Var = new en4(this, this.A, this.B, this.R);
        en4Var.D(f1Var);
        return en4Var.d();
    }

    @Override // defpackage.g1
    public final g1 l(int i) {
        sn2.p(i, b());
        int u = u();
        int i2 = this.R;
        Object[] objArr = this.A;
        if (i >= u) {
            return t(objArr, u, i2, i - u);
        }
        return t(s(objArr, i2, i, new s2(3, this.B[0])), u, i2, 0);
    }

    @Override // defpackage.y0, java.util.List
    public final ListIterator listIterator(int i) {
        sn2.q(i, this.L);
        return new fn4(this.A, this.B, i, this.L, (this.R / 5) + 1);
    }

    @Override // defpackage.g1
    public final g1 m(int i, Object obj) {
        int i2 = this.L;
        sn2.p(i, i2);
        int u = u();
        Object[] objArr = this.A;
        Object[] objArr2 = this.B;
        int i3 = this.R;
        if (u <= i) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i & 31] = obj;
            return new dn4(objArr, copyOf, i2, i3);
        }
        return new dn4(v(i3, i, obj, objArr), objArr2, i2, i3);
    }

    public final dn4 o(Object[] objArr, int i, Object obj) {
        int u = u();
        int i2 = this.L;
        int i3 = i2 - u;
        Object[] objArr2 = this.B;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            nu.f0(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new dn4(objArr, copyOf, i2 + 1, this.R);
        }
        Object obj2 = objArr2[31];
        nu.f0(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return q(objArr, copyOf, objArr3);
    }

    public final dn4 q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.L;
        int i2 = i >> 5;
        int i3 = this.R;
        if (i2 > (1 << i3)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i4 = i3 + 5;
            return new dn4(r(i4, objArr4, objArr2), objArr3, i + 1, i4);
        }
        return new dn4(r(i3, objArr, objArr2), objArr3, i + 1, i3);
    }

    public final Object[] r(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int E = mj2.E(b() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[E] = objArr2;
            return objArr3;
        }
        objArr3[E] = r(i - 5, (Object[]) objArr3[E], objArr2);
        return objArr3;
    }

    public final Object[] s(Object[] objArr, int i, int i2, s2 s2Var) {
        Object[] copyOf;
        int E = mj2.E(i2, i);
        int i3 = 31;
        if (i == 0) {
            if (E == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            nu.f0(objArr, copyOf, E, E + 1, 32);
            copyOf[31] = s2Var.b;
            s2Var.b = objArr[E];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = mj2.E(u() - 1, i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        int i5 = E + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj = copyOf2[i3];
                obj.getClass();
                copyOf2[i3] = s((Object[]) obj, i4, 0, s2Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf2[E];
        obj2.getClass();
        copyOf2[E] = s((Object[]) obj2, i4, i2, s2Var);
        return copyOf2;
    }

    public final g1 t(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.L - i;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                }
                return new a96(objArr);
            }
            s2 s2Var = new s2(3, null);
            Object[] p = p(objArr, i2, i - 1, s2Var);
            p.getClass();
            Object obj = s2Var.b;
            obj.getClass();
            Object[] objArr2 = (Object[]) obj;
            if (p[1] == null) {
                Object obj2 = p[0];
                obj2.getClass();
                return new dn4((Object[]) obj2, objArr2, i, i2 - 5);
            }
            return new dn4(p, objArr2, i, i2);
        }
        Object[] objArr3 = this.B;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        int i5 = i4 - 1;
        if (i3 < i5) {
            nu.f0(objArr3, copyOf, i3, i3 + 1, i4);
        }
        copyOf[i5] = null;
        return new dn4(objArr, copyOf, (i + i4) - 1, i2);
    }

    public final int u() {
        return (this.L - 1) & (-32);
    }
}
