package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: en4  reason: default package */
/* loaded from: classes.dex */
public final class en4 extends c1 implements Collection, g93 {
    public g1 A;
    public Object[] B;
    public Object[] L;
    public int R;
    public hm1 X = new Object();
    public Object[] Y;
    public Object[] Z;
    public int c0;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, hm1] */
    public en4(g1 g1Var, Object[] objArr, Object[] objArr2, int i) {
        this.A = g1Var;
        this.B = objArr;
        this.L = objArr2;
        this.R = i;
        this.Y = objArr;
        this.Z = objArr2;
        this.c0 = g1Var.b();
    }

    public static void i(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(mi2 mi2Var, Object[] objArr, int i, int i2, s2 s2Var, ArrayList arrayList, ArrayList arrayList2) {
        Object[] r;
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = s2Var.b;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) mi2Var.n(obj2)).booleanValue()) {
                if (i2 == 32) {
                    if (!arrayList.isEmpty()) {
                        r = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        r = r();
                    }
                    objArr3 = r;
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        s2Var.b = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int B(mi2 mi2Var, Object[] objArr, int i, s2 s2Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) mi2Var.n(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        s2Var.b = objArr2;
        return i2;
    }

    public final int C(mi2 mi2Var, int i, s2 s2Var) {
        int B = B(mi2Var, this.Z, i, s2Var);
        Object obj = s2Var.b;
        if (B == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, B, i, (Object) null);
        this.Z = objArr;
        this.c0 -= i - B;
        return B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r0 != r8) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (C(r1, r8, r5) != r8) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(defpackage.mi2 r16) {
        /*
            r15 = this;
            r1 = r16
            int r8 = r15.J()
            s2 r5 = new s2
            r0 = 3
            r9 = 0
            r5.<init>(r0, r9)
            java.lang.Object[] r0 = r15.Y
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L1c
            int r0 = r15.C(r1, r8, r5)
            if (r0 == r8) goto Ld2
        L19:
            r10 = r11
            goto Ld2
        L1c:
            z0 r12 = r15.o(r10)
            r13 = 32
            r0 = r13
        L23:
            if (r0 != r13) goto L36
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.B(r1, r0, r13, r5)
            goto L23
        L36:
            if (r0 != r13) goto L4a
            int r0 = r15.C(r1, r8, r5)
            if (r0 != 0) goto L47
            java.lang.Object[] r1 = r15.Y
            int r2 = r15.c0
            int r3 = r15.R
            r15.v(r1, r2, r3)
        L47:
            if (r0 == r8) goto Ld2
            goto L19
        L4a:
            int r2 = r12.A
            int r2 = r2 - r11
            int r14 = r2 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r0
        L5a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r15
            int r4 = r0.A(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L5a
        L71:
            java.lang.Object[] r2 = r15.Z
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.A(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.b
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.Arrays.fill(r2, r1, r13, r9)
            boolean r3 = r7.isEmpty()
            java.lang.Object[] r4 = r15.Y
            if (r3 == 0) goto L91
            r4.getClass()
            goto L9b
        L91:
            int r3 = r15.R
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r4 = r15.w(r4, r14, r3, r5)
        L9b:
            int r3 = r7.size()
            int r3 = r3 << 5
            int r14 = r14 + r3
            r3 = r14 & 31
            if (r3 != 0) goto La7
            goto Lac
        La7:
            java.lang.String r3 = "invalid size"
            defpackage.or4.a(r3)
        Lac:
            if (r14 != 0) goto Lb1
            r15.R = r10
            goto Lc9
        Lb1:
            int r3 = r14 + (-1)
        Lb3:
            int r5 = r15.R
            int r6 = r3 >> r5
            if (r6 != 0) goto Lc5
            int r5 = r5 + (-5)
            r15.R = r5
            r4 = r4[r10]
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto Lb3
        Lc5:
            java.lang.Object[] r9 = r15.t(r4, r3, r5)
        Lc9:
            r15.Y = r9
            r15.Z = r2
            int r14 = r14 + r1
            r15.c0 = r14
            goto L19
        Ld2:
            if (r10 == 0) goto Ld9
            int r1 = r15.modCount
            int r1 = r1 + r11
            r15.modCount = r1
        Ld9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en4.D(mi2):boolean");
    }

    public final Object[] E(Object[] objArr, int i, int i2, s2 s2Var) {
        int E = mj2.E(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[E];
            Object[] p = p(objArr);
            nu.f0(objArr, p, E, E + 1, 32);
            p[31] = s2Var.b;
            s2Var.b = obj;
            return p;
        }
        if (objArr[31] == null) {
            i3 = mj2.E(G() - 1, i);
        }
        Object[] p2 = p(objArr);
        int i4 = i - 5;
        int i5 = E + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj2 = p2[i3];
                obj2.getClass();
                p2[i3] = E((Object[]) obj2, i4, 0, s2Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = p2[E];
        obj3.getClass();
        p2[E] = E((Object[]) obj3, i4, i2, s2Var);
        return p2;
    }

    public final Object F(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c0 - i;
        Object[] objArr2 = this.Z;
        if (i4 == 1) {
            Object obj = objArr2[0];
            v(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] p = p(objArr2);
        nu.f0(objArr2, p, i3, i3 + 1, i4);
        p[i4 - 1] = null;
        this.Y = objArr;
        this.Z = p;
        this.c0 = (i + i4) - 1;
        this.R = i2;
        return obj2;
    }

    public final int G() {
        int i = this.c0;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] H(Object[] objArr, int i, int i2, Object obj, s2 s2Var) {
        int E = mj2.E(i2, i);
        Object[] p = p(objArr);
        if (i == 0) {
            if (p != objArr) {
                ((AbstractList) this).modCount++;
            }
            s2Var.b = p[E];
            p[E] = obj;
            return p;
        }
        Object obj2 = p[E];
        obj2.getClass();
        p[E] = H((Object[]) obj2, i - 5, i2, obj, s2Var);
        return p;
    }

    public final void I(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] r;
        if (i3 < 1) {
            or4.a("requires at least one nullBuffer");
        }
        Object[] p = p(objArr);
        objArr2[0] = p;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            nu.f0(p, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                r = p;
            } else {
                r = r();
                i3--;
                objArr2[i3] = r;
            }
            int i7 = i2 - i6;
            nu.f0(p, objArr3, 0, i7, i2);
            nu.f0(p, r, size + 1, i4, i7);
            objArr3 = r;
        }
        Iterator it = collection.iterator();
        i(p, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] r2 = r();
            i(r2, 0, it);
            objArr2[i8] = r2;
        }
        i(objArr3, 0, it);
    }

    public final int J() {
        int i = this.c0;
        if (i <= 32) {
            return i;
        }
        return i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        sn2.q(i, b());
        if (i == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int G = G();
        if (i >= G) {
            m(this.Y, i - G, obj);
            return;
        }
        s2 s2Var = new s2(3, null);
        Object[] objArr = this.Y;
        objArr.getClass();
        m(l(objArr, this.R, i, obj, s2Var), 0, s2Var.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] r;
        sn2.q(i, this.c0);
        if (i == this.c0) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.c0 - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.Z;
            Object[] p = p(objArr);
            nu.f0(objArr, p, size2 + 1, i3, J());
            i(p, i3, collection.iterator());
            this.Z = p;
            this.c0 = collection.size() + this.c0;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int J = J();
        int size3 = collection.size() + this.c0;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= G()) {
            r = r();
            collection2 = collection;
            I(collection2, i, this.Z, J, objArr2, size, r);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.Z;
            if (size3 > J) {
                int i4 = size3 - J;
                Object[] q = q(i4, objArr3);
                k(collection2, i, i4, objArr2, size, q);
                objArr2 = objArr2;
                r = q;
            } else {
                r = r();
                int i5 = J - size3;
                nu.f0(objArr3, r, 0, i5, J);
                int i6 = 32 - i5;
                Object[] q2 = q(i6, this.Z);
                int i7 = size - 1;
                objArr2[i7] = q2;
                k(collection2, i, i6, objArr2, i7, q2);
                collection2 = collection2;
            }
        }
        this.Y = x(this.Y, i2, objArr2);
        this.Z = r;
        this.c0 = collection2.size() + this.c0;
        return true;
    }

    @Override // defpackage.c1
    public final int b() {
        return this.c0;
    }

    @Override // defpackage.c1
    public final Object c(int i) {
        sn2.p(i, b());
        ((AbstractList) this).modCount++;
        int G = G();
        if (i >= G) {
            return F(this.Y, G, this.R, i - G);
        }
        s2 s2Var = new s2(3, this.Z[0]);
        Object[] objArr = this.Y;
        objArr.getClass();
        F(E(objArr, this.R, i, s2Var), G, this.R, 0);
        return s2Var.b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, hm1] */
    public final g1 d() {
        g1 dn4Var;
        Object[] objArr = this.Y;
        if (objArr == this.B && this.Z == this.L) {
            dn4Var = this.A;
        } else {
            this.X = new Object();
            this.B = objArr;
            Object[] objArr2 = this.Z;
            this.L = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    dn4Var = a96.B;
                } else {
                    dn4Var = new a96(Arrays.copyOf(objArr2, this.c0));
                }
            } else {
                dn4Var = new dn4(objArr, objArr2, this.c0, this.R);
            }
        }
        this.A = dn4Var;
        return dn4Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        sn2.p(i, b());
        if (G() <= i) {
            objArr = this.Z;
        } else {
            Object[] objArr2 = this.Y;
            objArr2.getClass();
            for (int i2 = this.R; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[mj2.E(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j() {
        return ((AbstractList) this).modCount;
    }

    public final void k(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.Y != null) {
            int i4 = i >> 5;
            z0 o = o(G() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (o.A - 1 != i4) {
                Object[] objArr4 = (Object[]) o.previous();
                nu.f0(objArr4, objArr3, 0, 32 - i2, 32);
                objArr3 = q(i2, objArr4);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) o.previous();
            int G = i3 - (((G() >> 5) - 1) - i4);
            if (G < i3) {
                objArr2 = objArr[G];
                objArr2.getClass();
            }
            I(collection, i, objArr5, 32, objArr, G, objArr2);
            return;
        }
        i.n("root is null");
    }

    public final Object[] l(Object[] objArr, int i, int i2, Object obj, s2 s2Var) {
        Object obj2;
        int E = mj2.E(i2, i);
        if (i == 0) {
            s2Var.b = objArr[31];
            Object[] p = p(objArr);
            nu.f0(objArr, p, E + 1, E, 31);
            p[E] = obj;
            return p;
        }
        Object[] p2 = p(objArr);
        int i3 = i - 5;
        Object obj3 = p2[E];
        obj3.getClass();
        p2[E] = l((Object[]) obj3, i3, i2, obj, s2Var);
        while (true) {
            E++;
            if (E >= 32 || (obj2 = p2[E]) == null) {
                break;
            }
            p2[E] = l((Object[]) obj2, i3, 0, s2Var.b, s2Var);
        }
        return p2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        sn2.q(i, this.c0);
        return new gn4(this, i);
    }

    public final void m(Object[] objArr, int i, Object obj) {
        int J = J();
        Object[] p = p(this.Z);
        Object[] objArr2 = this.Z;
        if (J < 32) {
            nu.f0(objArr2, p, i + 1, i, J);
            p[i] = obj;
            this.Y = objArr;
            this.Z = p;
            this.c0++;
            return;
        }
        Object obj2 = objArr2[31];
        nu.f0(objArr2, p, i + 1, i, 31);
        p[i] = obj;
        y(objArr, p, s(obj2));
    }

    public final boolean n(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.X) {
            return true;
        }
        return false;
    }

    public final z0 o(int i) {
        Object[] objArr = this.Y;
        if (objArr != null) {
            int G = G() >> 5;
            sn2.q(i, G);
            int i2 = this.R;
            if (i2 == 0) {
                return new g60(i, objArr);
            }
            return new ey6(objArr, i, G, i2 / 5);
        }
        i.n("Invalid root");
        return null;
    }

    public final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] r = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        nu.i0(objArr, r, 0, length, 6);
        return r;
    }

    public final Object[] q(int i, Object[] objArr) {
        if (n(objArr)) {
            nu.f0(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] r = r();
        nu.f0(objArr, r, i, 0, 32 - i);
        return r;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.X;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return D(new f1(1, collection));
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.X;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        sn2.p(i, b());
        if (G() <= i) {
            Object[] p = p(this.Z);
            if (p != this.Z) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            Object obj2 = p[i2];
            p[i2] = obj;
            this.Z = p;
            return obj2;
        }
        s2 s2Var = new s2(3, null);
        Object[] objArr = this.Y;
        objArr.getClass();
        this.Y = H(objArr, this.R, i, obj, s2Var);
        return s2Var.b;
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            or4.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int E = mj2.E(i, i2);
        Object obj = objArr[E];
        obj.getClass();
        Object t = t((Object[]) obj, i, i2 - 5);
        if (E < 31) {
            int i3 = E + 1;
            if (objArr[i3] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] r = r();
                nu.f0(objArr, r, 0, 0, i3);
                objArr = r;
            }
        }
        if (t != objArr[E]) {
            Object[] p = p(objArr);
            p[E] = t;
            return p;
        }
        return objArr;
    }

    public final Object[] u(Object[] objArr, int i, int i2, s2 s2Var) {
        Object[] u;
        int E = mj2.E(i2 - 1, i);
        if (i == 5) {
            s2Var.b = objArr[E];
            u = null;
        } else {
            Object obj = objArr[E];
            obj.getClass();
            u = u((Object[]) obj, i - 5, i2, s2Var);
        }
        if (u == null && E == 0) {
            return null;
        }
        Object[] p = p(objArr);
        p[E] = u;
        return p;
    }

    public final void v(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.Y = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.Z = objArr;
            this.c0 = i;
            this.R = i2;
            return;
        }
        s2 s2Var = new s2(3, null);
        objArr.getClass();
        Object[] u = u(objArr, i2, i, s2Var);
        u.getClass();
        Object obj = s2Var.b;
        obj.getClass();
        this.Z = (Object[]) obj;
        this.c0 = i;
        if (u[1] == null) {
            this.Y = (Object[]) u[0];
            this.R = i2 - 5;
            return;
        }
        this.Y = u;
        this.R = i2;
    }

    public final Object[] w(Object[] objArr, int i, int i2, Iterator it) {
        boolean z;
        if (!it.hasNext()) {
            or4.a("invalid buffersIterator");
        }
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            or4.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] p = p(objArr);
        int E = mj2.E(i, i2);
        int i3 = i2 - 5;
        p[E] = w((Object[]) p[E], i, i3, it);
        while (true) {
            E++;
            if (E >= 32 || !it.hasNext()) {
                break;
            }
            p[E] = w((Object[]) p[E], 0, i3, it);
        }
        return p;
    }

    public final Object[] x(Object[] objArr, int i, Object[][] objArr2) {
        Object[] p;
        Iterator v0Var = new v0(objArr2);
        int i2 = i >> 5;
        int i3 = this.R;
        if (i2 < (1 << i3)) {
            p = w(objArr, i, i3, v0Var);
        } else {
            p = p(objArr);
        }
        while (v0Var.hasNext()) {
            this.R += 5;
            p = s(p);
            int i4 = this.R;
            w(p, 1 << i4, i4, v0Var);
        }
        return p;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c0;
        int i2 = i >> 5;
        int i3 = this.R;
        if (i2 > (1 << i3)) {
            this.Y = z(this.R + 5, s(objArr), objArr2);
            this.Z = objArr3;
            this.R += 5;
            this.c0++;
        } else if (objArr == null) {
            this.Y = objArr2;
            this.Z = objArr3;
            this.c0 = i + 1;
        } else {
            this.Y = z(i3, objArr, objArr2);
            this.Z = objArr3;
            this.c0++;
        }
    }

    public final Object[] z(int i, Object[] objArr, Object[] objArr2) {
        int E = mj2.E(b() - 1, i);
        Object[] p = p(objArr);
        if (i == 5) {
            p[E] = objArr2;
            return p;
        }
        p[E] = z(i - 5, (Object[]) p[E], objArr2);
        return p;
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
            Object[] p = p(this.Z);
            p[J] = obj;
            this.Z = p;
            this.c0 = b() + 1;
        } else {
            y(this.Y, this.Z, s(obj));
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
            Object[] p = p(this.Z);
            i(p, J, it);
            this.Z = p;
            this.c0 = collection.size() + this.c0;
            return true;
        }
        int size = ((collection.size() + J) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] p2 = p(this.Z);
        i(p2, J, it);
        objArr[0] = p2;
        for (int i = 1; i < size; i++) {
            Object[] r = r();
            i(r, 0, it);
            objArr[i] = r;
        }
        this.Y = x(this.Y, G(), objArr);
        Object[] r2 = r();
        i(r2, 0, it);
        this.Z = r2;
        this.c0 = collection.size() + this.c0;
        return true;
    }
}
