package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jw4  reason: default package */
/* loaded from: classes.dex */
public final class jw4 extends d1 implements Collection, ag3 {
    public h1 A;
    public Object[] B;
    public Object[] L;
    public int R;
    public jd1 X = new jd1(15);
    public Object[] Y;
    public Object[] Z;
    public int d0;

    public jw4(h1 h1Var, Object[] objArr, Object[] objArr2, int i) {
        this.A = h1Var;
        this.B = objArr;
        this.L = objArr2;
        this.R = i;
        this.Y = objArr;
        this.Z = objArr2;
        this.d0 = h1Var.a();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(qn2 qn2Var, Object[] objArr, int i, int i2, u2 u2Var, ArrayList arrayList, ArrayList arrayList2) {
        Object[] p;
        if (j(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = u2Var.b;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) qn2Var.g(obj2)).booleanValue()) {
                if (i2 == 32) {
                    if (!arrayList.isEmpty()) {
                        p = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        p = p();
                    }
                    objArr3 = p;
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        u2Var.b = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int B(qn2 qn2Var, Object[] objArr, int i, u2 u2Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) qn2Var.g(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = m(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        u2Var.b = objArr2;
        return i2;
    }

    public final int C(qn2 qn2Var, int i, u2 u2Var) {
        int B = B(qn2Var, this.Z, i, u2Var);
        Object obj = u2Var.b;
        if (B == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, B, i, (Object) null);
        this.Z = objArr;
        this.d0 -= i - B;
        return B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r1 != r8) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (C(r1, r8, r5) != r8) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(qn2 qn2Var) {
        int i;
        qn2 qn2Var2 = qn2Var;
        int J = J();
        Object[] objArr = null;
        u2 u2Var = new u2((Object) null, 5);
        boolean z = false;
        if (this.Y != null) {
            a1 l = l(0);
            int i2 = 32;
            while (i2 == 32 && l.hasNext()) {
                i2 = B(qn2Var2, (Object[]) l.next(), 32, u2Var);
            }
            if (i2 == 32) {
                int C = C(qn2Var2, J, u2Var);
                if (C == 0) {
                    t(this.Y, this.d0, this.R);
                }
            } else {
                int i3 = (l.A - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (l.hasNext()) {
                    i4 = A(qn2Var2, (Object[]) l.next(), 32, i4, u2Var, arrayList2, arrayList);
                    qn2Var2 = qn2Var;
                }
                int A = A(qn2Var, this.Z, J, i4, u2Var, arrayList2, arrayList);
                Object obj = u2Var.b;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, A, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.Y;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = w(objArr3, i3, this.R, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    r05.a("invalid size");
                }
                if (size == 0) {
                    this.R = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.R;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.R = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = r(objArr3, i5, i);
                }
                this.Y = objArr;
                this.Z = objArr2;
                this.d0 = size + A;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] E(Object[] objArr, int i, int i2, u2 u2Var) {
        int R = uj2.R(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[R];
            Object[] m = m(objArr);
            fv.t0(objArr, m, R, R + 1, 32);
            m[31] = u2Var.b;
            u2Var.b = obj;
            return m;
        }
        if (objArr[31] == null) {
            i3 = uj2.R(G() - 1, i);
        }
        Object[] m2 = m(objArr);
        int i4 = i - 5;
        int i5 = R + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj2 = m2[i3];
                obj2.getClass();
                m2[i3] = E((Object[]) obj2, i4, 0, u2Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = m2[R];
        obj3.getClass();
        m2[R] = E((Object[]) obj3, i4, i2, u2Var);
        return m2;
    }

    public final Object F(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d0 - i;
        Object[] objArr2 = this.Z;
        if (i4 == 1) {
            Object obj = objArr2[0];
            t(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] m = m(objArr2);
        fv.t0(objArr2, m, i3, i3 + 1, i4);
        m[i4 - 1] = null;
        this.Y = objArr;
        this.Z = m;
        this.d0 = (i + i4) - 1;
        this.R = i2;
        return obj2;
    }

    public final int G() {
        int i = this.d0;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] H(Object[] objArr, int i, int i2, Object obj, u2 u2Var) {
        int R = uj2.R(i2, i);
        Object[] m = m(objArr);
        if (i == 0) {
            if (m != objArr) {
                ((AbstractList) this).modCount++;
            }
            u2Var.b = m[R];
            m[R] = obj;
            return m;
        }
        Object obj2 = m[R];
        obj2.getClass();
        m[R] = H((Object[]) obj2, i - 5, i2, obj, u2Var);
        return m;
    }

    public final void I(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] p;
        if (i3 < 1) {
            r05.a("requires at least one nullBuffer");
        }
        Object[] m = m(objArr);
        objArr2[0] = m;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            fv.t0(m, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                p = m;
            } else {
                p = p();
                i3--;
                objArr2[i3] = p;
            }
            int i7 = i2 - i6;
            fv.t0(m, objArr3, 0, i7, i2);
            fv.t0(m, p, size + 1, i4, i7);
            objArr3 = p;
        }
        Iterator it = collection.iterator();
        d(m, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] p2 = p();
            d(p2, 0, it);
            objArr2[i8] = p2;
        }
        d(objArr3, 0, it);
    }

    public final int J() {
        int i = this.d0;
        if (i <= 32) {
            return i;
        }
        return i - ((i - 1) & (-32));
    }

    @Override // defpackage.d1
    public final int a() {
        return this.d0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        np2.y(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int G = G();
        if (i >= G) {
            i(obj, this.Y, i - G);
            return;
        }
        u2 u2Var = new u2((Object) null, 5);
        Object[] objArr = this.Y;
        objArr.getClass();
        i(u2Var.b, h(objArr, this.R, i, obj, u2Var), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] p;
        np2.y(i, this.d0);
        if (i == this.d0) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.d0 - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.Z;
            Object[] m = m(objArr);
            fv.t0(objArr, m, size2 + 1, i3, J());
            d(m, i3, collection.iterator());
            this.Z = m;
            this.d0 = collection.size() + this.d0;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int J = J();
        int size3 = collection.size() + this.d0;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= G()) {
            p = p();
            collection2 = collection;
            I(collection2, i, this.Z, J, objArr2, size, p);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.Z;
            if (size3 > J) {
                int i4 = size3 - J;
                Object[] o = o(i4, objArr3);
                g(collection2, i, i4, objArr2, size, o);
                objArr2 = objArr2;
                p = o;
            } else {
                p = p();
                int i5 = J - size3;
                fv.t0(objArr3, p, 0, i5, J);
                int i6 = 32 - i5;
                Object[] o2 = o(i6, this.Z);
                int i7 = size - 1;
                objArr2[i7] = o2;
                g(collection2, i, i6, objArr2, i7, o2);
                collection2 = collection2;
            }
        }
        this.Y = x(this.Y, i2, objArr2);
        this.Z = p;
        this.d0 = collection2.size() + this.d0;
        return true;
    }

    @Override // defpackage.d1
    public final Object b(int i) {
        np2.w(i, a());
        ((AbstractList) this).modCount++;
        int G = G();
        if (i >= G) {
            return F(this.Y, G, this.R, i - G);
        }
        u2 u2Var = new u2(this.Z[0], 5);
        Object[] objArr = this.Y;
        objArr.getClass();
        F(E(objArr, this.R, i, u2Var), G, this.R, 0);
        return u2Var.b;
    }

    public final h1 c() {
        h1 iw4Var;
        Object[] objArr = this.Y;
        if (objArr == this.B && this.Z == this.L) {
            iw4Var = this.A;
        } else {
            this.X = new jd1(15);
            this.B = objArr;
            Object[] objArr2 = this.Z;
            this.L = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    iw4Var = qk6.B;
                } else {
                    iw4Var = new qk6(Arrays.copyOf(objArr2, this.d0));
                }
            } else {
                iw4Var = new iw4(objArr, objArr2, this.d0, this.R);
            }
        }
        this.A = iw4Var;
        return iw4Var;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.Y != null) {
            int i4 = i >> 5;
            a1 l = l(G() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (l.A - 1 != i4) {
                Object[] objArr4 = (Object[]) l.previous();
                fv.t0(objArr4, objArr3, 0, 32 - i2, 32);
                objArr3 = o(i2, objArr4);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) l.previous();
            int G = i3 - (((G() >> 5) - 1) - i4);
            if (G < i3) {
                objArr2 = objArr[G];
                objArr2.getClass();
            }
            I(collection, i, objArr5, 32, objArr, G, objArr2);
            return;
        }
        i.m("root is null");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        np2.w(i, a());
        if (G() <= i) {
            objArr = this.Z;
        } else {
            Object[] objArr2 = this.Y;
            objArr2.getClass();
            for (int i2 = this.R; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[uj2.R(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, u2 u2Var) {
        Object obj2;
        int R = uj2.R(i2, i);
        if (i == 0) {
            u2Var.b = objArr[31];
            Object[] m = m(objArr);
            fv.t0(objArr, m, R + 1, R, 31);
            m[R] = obj;
            return m;
        }
        Object[] m2 = m(objArr);
        int i3 = i - 5;
        Object obj3 = m2[R];
        obj3.getClass();
        m2[R] = h((Object[]) obj3, i3, i2, obj, u2Var);
        while (true) {
            R++;
            if (R >= 32 || (obj2 = m2[R]) == null) {
                break;
            }
            m2[R] = h((Object[]) obj2, i3, 0, u2Var.b, u2Var);
        }
        return m2;
    }

    public final void i(Object obj, Object[] objArr, int i) {
        int J = J();
        Object[] m = m(this.Z);
        Object[] objArr2 = this.Z;
        if (J < 32) {
            fv.t0(objArr2, m, i + 1, i, J);
            m[i] = obj;
            this.Y = objArr;
            this.Z = m;
            this.d0++;
            return;
        }
        Object obj2 = objArr2[31];
        fv.t0(objArr2, m, i + 1, i, 31);
        m[i] = obj;
        y(objArr, m, q(obj2));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.X) {
            return true;
        }
        return false;
    }

    public final a1 l(int i) {
        Object[] objArr = this.Y;
        if (objArr != null) {
            int G = G() >> 5;
            np2.y(i, G);
            int i2 = this.R;
            if (i2 == 0) {
                return new l80(objArr, i);
            }
            return new zb7(objArr, i, G, i2 / 5);
        }
        i.m("Invalid root");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        np2.y(i, this.d0);
        return new lw4(this, i);
    }

    public final Object[] m(Object[] objArr) {
        if (objArr == null) {
            return p();
        }
        if (j(objArr)) {
            return objArr;
        }
        Object[] p = p();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        fv.w0(objArr, p, 0, length, 6);
        return p;
    }

    public final Object[] o(int i, Object[] objArr) {
        if (j(objArr)) {
            fv.t0(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] p = p();
        fv.t0(objArr, p, i, 0, 32 - i);
        return p;
    }

    public final Object[] p() {
        Object[] objArr = new Object[33];
        objArr[32] = this.X;
        return objArr;
    }

    public final Object[] q(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.X;
        return objArr;
    }

    public final Object[] r(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            r05.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int R = uj2.R(i, i2);
        Object obj = objArr[R];
        obj.getClass();
        Object r = r((Object[]) obj, i, i2 - 5);
        if (R < 31) {
            int i3 = R + 1;
            if (objArr[i3] != null) {
                if (j(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] p = p();
                fv.t0(objArr, p, 0, 0, i3);
                objArr = p;
            }
        }
        if (r != objArr[R]) {
            Object[] m = m(objArr);
            m[R] = r;
            return m;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return D(new g1(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, int i2, u2 u2Var) {
        Object[] s;
        int R = uj2.R(i2 - 1, i);
        if (i == 5) {
            u2Var.b = objArr[R];
            s = null;
        } else {
            Object obj = objArr[R];
            obj.getClass();
            s = s((Object[]) obj, i - 5, i2, u2Var);
        }
        if (s == null && R == 0) {
            return null;
        }
        Object[] m = m(objArr);
        m[R] = s;
        return m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        np2.w(i, a());
        if (G() <= i) {
            Object[] m = m(this.Z);
            if (m != this.Z) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            Object obj2 = m[i2];
            m[i2] = obj;
            this.Z = m;
            return obj2;
        }
        u2 u2Var = new u2((Object) null, 5);
        Object[] objArr = this.Y;
        objArr.getClass();
        this.Y = H(objArr, this.R, i, obj, u2Var);
        return u2Var.b;
    }

    public final void t(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.Y = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.Z = objArr;
            this.d0 = i;
            this.R = i2;
            return;
        }
        u2 u2Var = new u2((Object) null, 5);
        objArr.getClass();
        Object[] s = s(objArr, i2, i, u2Var);
        s.getClass();
        Object obj = u2Var.b;
        obj.getClass();
        this.Z = (Object[]) obj;
        this.d0 = i;
        if (s[1] == null) {
            this.Y = (Object[]) s[0];
            this.R = i2 - 5;
            return;
        }
        this.Y = s;
        this.R = i2;
    }

    public final Object[] w(Object[] objArr, int i, int i2, Iterator it) {
        boolean z;
        if (!it.hasNext()) {
            r05.a("invalid buffersIterator");
        }
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            r05.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] m = m(objArr);
        int R = uj2.R(i, i2);
        int i3 = i2 - 5;
        m[R] = w((Object[]) m[R], i, i3, it);
        while (true) {
            R++;
            if (R >= 32 || !it.hasNext()) {
                break;
            }
            m[R] = w((Object[]) m[R], 0, i3, it);
        }
        return m;
    }

    public final Object[] x(Object[] objArr, int i, Object[][] objArr2) {
        Object[] m;
        Iterator w0Var = new w0(objArr2);
        int i2 = i >> 5;
        int i3 = this.R;
        if (i2 < (1 << i3)) {
            m = w(objArr, i, i3, w0Var);
        } else {
            m = m(objArr);
        }
        while (w0Var.hasNext()) {
            this.R += 5;
            m = q(m);
            int i4 = this.R;
            w(m, 1 << i4, i4, w0Var);
        }
        return m;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d0;
        int i2 = i >> 5;
        int i3 = this.R;
        if (i2 > (1 << i3)) {
            this.Y = z(this.R + 5, q(objArr), objArr2);
            this.Z = objArr3;
            this.R += 5;
            this.d0++;
        } else if (objArr == null) {
            this.Y = objArr2;
            this.Z = objArr3;
            this.d0 = i + 1;
        } else {
            this.Y = z(i3, objArr, objArr2);
            this.Z = objArr3;
            this.d0++;
        }
    }

    public final Object[] z(int i, Object[] objArr, Object[] objArr2) {
        int R = uj2.R(a() - 1, i);
        Object[] m = m(objArr);
        if (i == 5) {
            m[R] = objArr2;
            return m;
        }
        m[R] = z(i - 5, (Object[]) m[R], objArr2);
        return m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int J = J();
        if (J < 32) {
            Object[] m = m(this.Z);
            m[J] = obj;
            this.Z = m;
            this.d0 = a() + 1;
        } else {
            y(this.Y, this.Z, q(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int J = J();
        Iterator it = collection.iterator();
        if (32 - J >= collection.size()) {
            Object[] m = m(this.Z);
            d(m, J, it);
            this.Z = m;
            this.d0 = collection.size() + this.d0;
            return true;
        }
        int size = ((collection.size() + J) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] m2 = m(this.Z);
        d(m2, J, it);
        objArr[0] = m2;
        for (int i = 1; i < size; i++) {
            Object[] p = p();
            d(p, 0, it);
            objArr[i] = p;
        }
        this.Y = x(this.Y, G(), objArr);
        Object[] p2 = p();
        d(p2, 0, it);
        this.Z = p2;
        this.d0 = collection.size() + this.d0;
        return true;
    }
}
