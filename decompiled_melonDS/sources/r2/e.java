package r2;

import java.util.Arrays;
import java.util.ListIterator;
import n2.l1;
import p7.k;
import p7.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends c {
    public final Object[] A;
    public final Object[] B;
    public final int L;
    public final int R;

    public e(Object[] objArr, Object[] objArr2, int i2, int i10) {
        boolean z10;
        this.A = objArr;
        this.B = objArr2;
        this.L = i2;
        this.R = i10;
        if (a() > 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            l1.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] i(Object[] objArr, int i2, int i10, Object obj, b6.f fVar) {
        Object[] copyOf;
        int q10 = k.q(i10, i2);
        if (i2 == 0) {
            if (q10 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            zb.k.i(objArr, copyOf, q10 + 1, q10, 31);
            fVar.f2075b = objArr[31];
            copyOf[q10] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i11 = i2 - 5;
        Object obj2 = objArr[q10];
        obj2.getClass();
        copyOf2[q10] = i((Object[]) obj2, i11, i10, obj, fVar);
        while (true) {
            q10++;
            if (q10 >= 32 || copyOf2[q10] == null) {
                break;
            }
            Object obj3 = objArr[q10];
            obj3.getClass();
            copyOf2[q10] = i((Object[]) obj3, i11, 0, fVar.f2075b, fVar);
        }
        return copyOf2;
    }

    public static Object[] k(Object[] objArr, int i2, int i10, b6.f fVar) {
        Object[] k10;
        int q10 = k.q(i10, i2);
        if (i2 == 5) {
            fVar.f2075b = objArr[q10];
            k10 = null;
        } else {
            Object obj = objArr[q10];
            obj.getClass();
            k10 = k((Object[]) obj, i2 - 5, i10, fVar);
        }
        if (k10 == null && q10 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[q10] = k10;
        return copyOf;
    }

    public static Object[] q(int i2, int i10, Object obj, Object[] objArr) {
        int q10 = k.q(i10, i2);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i2 == 0) {
            copyOf[q10] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[q10];
        obj2.getClass();
        copyOf[q10] = q(i2 - 5, i10, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // zb.b
    public final int a() {
        return this.L;
    }

    @Override // r2.c
    public final c b(int i2, Object obj) {
        int i10 = this.L;
        m.m(i2, i10);
        if (i2 == i10) {
            return c(obj);
        }
        int p10 = p();
        Object[] objArr = this.A;
        if (i2 >= p10) {
            return j(objArr, i2 - p10, obj);
        }
        b6.f fVar = new b6.f(4, null);
        return j(i(objArr, this.R, i2, obj, fVar), 0, fVar.f2075b);
    }

    @Override // r2.c
    public final c c(Object obj) {
        int p10 = p();
        int i2 = this.L;
        int i10 = i2 - p10;
        Object[] objArr = this.A;
        Object[] objArr2 = this.B;
        if (i10 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i10] = obj;
            return new e(objArr, copyOf, i2 + 1, this.R);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return l(objArr, objArr2, objArr3);
    }

    @Override // r2.c
    public final f e() {
        return new f(this, this.A, this.B, this.R);
    }

    @Override // r2.c
    public final c f(b bVar) {
        f fVar = new f(this, this.A, this.B, this.R);
        fVar.y(bVar);
        return fVar.c();
    }

    @Override // r2.c
    public final c g(int i2) {
        m.k(i2, a());
        int p10 = p();
        int i10 = this.R;
        Object[] objArr = this.A;
        if (i2 >= p10) {
            return o(objArr, p10, i10, i2 - p10);
        }
        return o(n(objArr, i10, i2, new b6.f(4, this.B[0])), p10, i10, 0);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object[] objArr;
        m.k(i2, a());
        if (p() <= i2) {
            objArr = this.B;
        } else {
            objArr = this.A;
            for (int i10 = this.R; i10 > 0; i10 -= 5) {
                Object obj = objArr[k.q(i2, i10)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i2 & 31];
    }

    @Override // r2.c
    public final c h(int i2, Object obj) {
        int i10 = this.L;
        m.k(i2, i10);
        int p10 = p();
        Object[] objArr = this.A;
        Object[] objArr2 = this.B;
        int i11 = this.R;
        if (p10 <= i2) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2 & 31] = obj;
            return new e(objArr, copyOf, i10, i11);
        }
        return new e(q(i11, i2, obj, objArr), objArr2, i10, i11);
    }

    public final e j(Object[] objArr, int i2, Object obj) {
        int p10 = p();
        int i10 = this.L;
        int i11 = i10 - p10;
        Object[] objArr2 = this.B;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i11 < 32) {
            zb.k.i(objArr2, copyOf, i2 + 1, i2, i11);
            copyOf[i2] = obj;
            return new e(objArr, copyOf, i10 + 1, this.R);
        }
        Object obj2 = objArr2[31];
        zb.k.i(objArr2, copyOf, i2 + 1, i2, i11 - 1);
        copyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, copyOf, objArr3);
    }

    public final e l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i2 = this.L;
        int i10 = i2 >> 5;
        int i11 = this.R;
        if (i10 > (1 << i11)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i12 = i11 + 5;
            return new e(m(i12, objArr4, objArr2), objArr3, i2 + 1, i12);
        }
        return new e(m(i11, objArr, objArr2), objArr3, i2 + 1, i11);
    }

    @Override // zb.e, java.util.List
    public final ListIterator listIterator(int i2) {
        m.m(i2, this.L);
        return new g(this.A, this.B, i2, this.L, (this.R / 5) + 1);
    }

    public final Object[] m(int i2, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int q10 = k.q(a() - 1, i2);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i2 == 5) {
            objArr3[q10] = objArr2;
            return objArr3;
        }
        objArr3[q10] = m(i2 - 5, (Object[]) objArr3[q10], objArr2);
        return objArr3;
    }

    public final Object[] n(Object[] objArr, int i2, int i10, b6.f fVar) {
        Object[] copyOf;
        int q10 = k.q(i10, i2);
        int i11 = 31;
        if (i2 == 0) {
            if (q10 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            zb.k.i(objArr, copyOf, q10, q10 + 1, 32);
            copyOf[31] = fVar.f2075b;
            fVar.f2075b = objArr[q10];
            return copyOf;
        }
        if (objArr[31] == null) {
            i11 = k.q(p() - 1, i2);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i12 = i2 - 5;
        int i13 = q10 + 1;
        if (i13 <= i11) {
            while (true) {
                Object obj = copyOf2[i11];
                obj.getClass();
                copyOf2[i11] = n((Object[]) obj, i12, 0, fVar);
                if (i11 == i13) {
                    break;
                }
                i11--;
            }
        }
        Object obj2 = copyOf2[q10];
        obj2.getClass();
        copyOf2[q10] = n((Object[]) obj2, i12, i10, fVar);
        return copyOf2;
    }

    public final c o(Object[] objArr, int i2, int i10, int i11) {
        int i12 = this.L - i2;
        if (i12 == 1) {
            if (i10 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                }
                return new i(objArr);
            }
            b6.f fVar = new b6.f(4, null);
            Object[] k10 = k(objArr, i10, i2 - 1, fVar);
            k10.getClass();
            Object obj = fVar.f2075b;
            obj.getClass();
            Object[] objArr2 = (Object[]) obj;
            if (k10[1] == null) {
                Object obj2 = k10[0];
                obj2.getClass();
                return new e((Object[]) obj2, objArr2, i2, i10 - 5);
            }
            return new e(k10, objArr2, i2, i10);
        }
        Object[] objArr3 = this.B;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        int i13 = i12 - 1;
        if (i11 < i13) {
            zb.k.i(objArr3, copyOf, i11, i11 + 1, i12);
        }
        copyOf[i13] = null;
        return new e(objArr, copyOf, (i2 + i12) - 1, i10);
    }

    public final int p() {
        return (this.L - 1) & (-32);
    }
}
