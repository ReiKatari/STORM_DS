package r2;

import a1.z0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import mc.l;
import n2.l1;
import p7.m;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends zb.f implements Collection, oc.b {
    public c A;
    public Object[] B;
    public Object[] L;
    public int R;
    public u2.b X = new Object();
    public Object[] Y;
    public Object[] Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f12614b0;

    /* JADX WARN: Type inference failed for: r4v1, types: [u2.b, java.lang.Object] */
    public f(c cVar, Object[] objArr, Object[] objArr2, int i2) {
        this.A = cVar;
        this.B = objArr;
        this.L = objArr2;
        this.R = i2;
        this.Y = objArr;
        this.Z = objArr2;
        this.f12614b0 = cVar.a();
    }

    public static void d(Object[] objArr, int i2, Iterator it) {
        while (i2 < 32 && it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
    }

    public final Object A(Object[] objArr, int i2, int i10, int i11) {
        int i12 = this.f12614b0 - i2;
        Object[] objArr2 = this.Z;
        if (i12 == 1) {
            Object obj = objArr2[0];
            q(objArr, i2, i10);
            return obj;
        }
        Object obj2 = objArr2[i11];
        Object[] k10 = k(objArr2);
        k.i(objArr2, k10, i11, i11 + 1, i12);
        k10[i12 - 1] = null;
        this.Y = objArr;
        this.Z = k10;
        this.f12614b0 = (i2 + i12) - 1;
        this.R = i10;
        return obj2;
    }

    public final int B() {
        int i2 = this.f12614b0;
        if (i2 <= 32) {
            return 0;
        }
        return (i2 - 1) & (-32);
    }

    public final Object[] C(Object[] objArr, int i2, int i10, Object obj, b6.f fVar) {
        int q10 = p7.k.q(i10, i2);
        Object[] k10 = k(objArr);
        if (i2 == 0) {
            if (k10 != objArr) {
                ((AbstractList) this).modCount++;
            }
            fVar.f2075b = k10[q10];
            k10[q10] = obj;
            return k10;
        }
        Object obj2 = k10[q10];
        obj2.getClass();
        k10[q10] = C((Object[]) obj2, i2 - 5, i10, obj, fVar);
        return k10;
    }

    public final void D(Collection collection, int i2, Object[] objArr, int i10, Object[][] objArr2, int i11, Object[] objArr3) {
        Object[] m;
        if (i11 < 1) {
            l1.a("requires at least one nullBuffer");
        }
        Object[] k10 = k(objArr);
        objArr2[0] = k10;
        int i12 = i2 & 31;
        int size = ((collection.size() + i2) - 1) & 31;
        int i13 = (i10 - i12) + size;
        if (i13 < 32) {
            k.i(k10, objArr3, size + 1, i12, i10);
        } else {
            int i14 = i13 - 31;
            if (i11 == 1) {
                m = k10;
            } else {
                m = m();
                i11--;
                objArr2[i11] = m;
            }
            int i15 = i10 - i14;
            k.i(k10, objArr3, 0, i15, i10);
            k.i(k10, m, size + 1, i12, i15);
            objArr3 = m;
        }
        Iterator it = collection.iterator();
        d(k10, i12, it);
        for (int i16 = 1; i16 < i11; i16++) {
            Object[] m10 = m();
            d(m10, 0, it);
            objArr2[i16] = m10;
        }
        d(objArr3, 0, it);
    }

    public final int E() {
        int i2 = this.f12614b0;
        if (i2 <= 32) {
            return i2;
        }
        return i2 - ((i2 - 1) & (-32));
    }

    @Override // zb.f
    public final int a() {
        return this.f12614b0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        m.m(i2, a());
        if (i2 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int B = B();
        if (i2 >= B) {
            h(this.Y, i2 - B, obj);
            return;
        }
        b6.f fVar = new b6.f(4, null);
        Object[] objArr = this.Y;
        objArr.getClass();
        h(g(objArr, this.R, i2, obj, fVar), 0, fVar.f2075b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] m;
        m.m(i2, this.f12614b0);
        if (i2 == this.f12614b0) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (i2 >> 5) << 5;
        int size = ((collection.size() + (this.f12614b0 - i10)) - 1) / 32;
        if (size == 0) {
            int i11 = i2 & 31;
            int size2 = ((collection.size() + i2) - 1) & 31;
            Object[] objArr = this.Z;
            Object[] k10 = k(objArr);
            k.i(objArr, k10, size2 + 1, i11, E());
            d(k10, i11, collection.iterator());
            this.Z = k10;
            this.f12614b0 = collection.size() + this.f12614b0;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int E = E();
        int size3 = collection.size() + this.f12614b0;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i2 >= B()) {
            m = m();
            collection2 = collection;
            D(collection2, i2, this.Z, E, objArr2, size, m);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            Object[] objArr3 = fVar.Z;
            if (size3 > E) {
                int i12 = size3 - E;
                Object[] l10 = l(i12, objArr3);
                fVar.f(collection2, i2, i12, objArr2, size, l10);
                objArr2 = objArr2;
                m = l10;
            } else {
                m = m();
                int i13 = E - size3;
                k.i(objArr3, m, 0, i13, E);
                int i14 = 32 - i13;
                Object[] l11 = l(i14, fVar.Z);
                int i15 = size - 1;
                objArr2[i15] = l11;
                fVar.f(collection2, i2, i14, objArr2, i15, l11);
                collection2 = collection2;
            }
        }
        fVar.Y = s(fVar.Y, i10, objArr2);
        fVar.Z = m;
        fVar.f12614b0 = collection2.size() + fVar.f12614b0;
        return true;
    }

    @Override // zb.f
    public final Object b(int i2) {
        m.k(i2, a());
        ((AbstractList) this).modCount++;
        int B = B();
        if (i2 >= B) {
            return A(this.Y, B, this.R, i2 - B);
        }
        b6.f fVar = new b6.f(4, this.Z[0]);
        Object[] objArr = this.Y;
        objArr.getClass();
        A(z(objArr, this.R, i2, fVar), B, this.R, 0);
        return fVar.f2075b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [u2.b, java.lang.Object] */
    public final c c() {
        c eVar;
        Object[] objArr = this.Y;
        if (objArr == this.B && this.Z == this.L) {
            eVar = this.A;
        } else {
            this.X = new Object();
            this.B = objArr;
            Object[] objArr2 = this.Z;
            this.L = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    eVar = i.B;
                } else {
                    eVar = new i(Arrays.copyOf(objArr2, this.f12614b0));
                }
            } else {
                eVar = new e(objArr, objArr2, this.f12614b0, this.R);
            }
        }
        this.A = eVar;
        return eVar;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i2, int i10, Object[][] objArr, int i11, Object[] objArr2) {
        if (this.Y != null) {
            int i12 = i2 >> 5;
            a j2 = j(B() >> 5);
            int i13 = i11;
            Object[] objArr3 = objArr2;
            while (j2.A - 1 != i12) {
                Object[] objArr4 = (Object[]) j2.previous();
                k.i(objArr4, objArr3, 0, 32 - i10, 32);
                objArr3 = l(i10, objArr4);
                i13--;
                objArr[i13] = objArr3;
            }
            Object[] objArr5 = (Object[]) j2.previous();
            int B = i11 - (((B() >> 5) - 1) - i12);
            if (B < i11) {
                objArr2 = objArr[B];
                objArr2.getClass();
            }
            D(collection, i2, objArr5, 32, objArr, B, objArr2);
            return;
        }
        a0.j.p("root is null");
    }

    public final Object[] g(Object[] objArr, int i2, int i10, Object obj, b6.f fVar) {
        Object obj2;
        int q10 = p7.k.q(i10, i2);
        if (i2 == 0) {
            fVar.f2075b = objArr[31];
            Object[] k10 = k(objArr);
            k.i(objArr, k10, q10 + 1, q10, 31);
            k10[q10] = obj;
            return k10;
        }
        Object[] k11 = k(objArr);
        int i11 = i2 - 5;
        Object obj3 = k11[q10];
        obj3.getClass();
        k11[q10] = g((Object[]) obj3, i11, i10, obj, fVar);
        while (true) {
            q10++;
            if (q10 >= 32 || (obj2 = k11[q10]) == null) {
                break;
            }
            k11[q10] = g((Object[]) obj2, i11, 0, fVar.f2075b, fVar);
        }
        return k11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        Object[] objArr;
        m.k(i2, a());
        if (B() <= i2) {
            objArr = this.Z;
        } else {
            objArr = this.Y;
            objArr.getClass();
            for (int i10 = this.R; i10 > 0; i10 -= 5) {
                Object obj = objArr[p7.k.q(i2, i10)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i2 & 31];
    }

    public final void h(Object[] objArr, int i2, Object obj) {
        int E = E();
        Object[] k10 = k(this.Z);
        Object[] objArr2 = this.Z;
        if (E < 32) {
            k.i(objArr2, k10, i2 + 1, i2, E);
            k10[i2] = obj;
            this.Y = objArr;
            this.Z = k10;
            this.f12614b0++;
            return;
        }
        Object obj2 = objArr2[31];
        k.i(objArr2, k10, i2 + 1, i2, 31);
        k10[i2] = obj;
        t(objArr, k10, n(obj2));
    }

    public final boolean i(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.X) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final a j(int i2) {
        Object[] objArr = this.Y;
        if (objArr != null) {
            int B = B() >> 5;
            m.m(i2, B);
            int i10 = this.R;
            if (i10 == 0) {
                return new d(i2, objArr);
            }
            return new j(objArr, i2, B, i10 / 5);
        }
        a0.j.p("Invalid root");
        return null;
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] m = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        k.l(objArr, m, 0, length, 6);
        return m;
    }

    public final Object[] l(int i2, Object[] objArr) {
        if (i(objArr)) {
            k.i(objArr, objArr, i2, 0, 32 - i2);
            return objArr;
        }
        Object[] m = m();
        k.i(objArr, m, i2, 0, 32 - i2);
        return m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        m.m(i2, this.f12614b0);
        return new h(this, i2);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.X;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.X;
        return objArr;
    }

    public final Object[] o(Object[] objArr, int i2, int i10) {
        if (i10 < 0) {
            l1.a("shift should be positive");
        }
        if (i10 == 0) {
            return objArr;
        }
        int q10 = p7.k.q(i2, i10);
        Object obj = objArr[q10];
        obj.getClass();
        Object o5 = o((Object[]) obj, i2, i10 - 5);
        if (q10 < 31) {
            int i11 = q10 + 1;
            if (objArr[i11] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i11, 32, (Object) null);
                }
                Object[] m = m();
                k.i(objArr, m, 0, 0, i11);
                objArr = m;
            }
        }
        if (o5 != objArr[q10]) {
            Object[] k10 = k(objArr);
            k10[q10] = o5;
            return k10;
        }
        return objArr;
    }

    public final Object[] p(Object[] objArr, int i2, int i10, b6.f fVar) {
        Object[] p10;
        int q10 = p7.k.q(i10 - 1, i2);
        if (i2 == 5) {
            fVar.f2075b = objArr[q10];
            p10 = null;
        } else {
            Object obj = objArr[q10];
            obj.getClass();
            p10 = p((Object[]) obj, i2 - 5, i10, fVar);
        }
        if (p10 == null && q10 == 0) {
            return null;
        }
        Object[] k10 = k(objArr);
        k10[q10] = p10;
        return k10;
    }

    public final void q(Object[] objArr, int i2, int i10) {
        if (i10 == 0) {
            this.Y = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.Z = objArr;
            this.f12614b0 = i2;
            this.R = i10;
            return;
        }
        b6.f fVar = new b6.f(4, null);
        objArr.getClass();
        Object[] p10 = p(objArr, i10, i2, fVar);
        p10.getClass();
        Object obj = fVar.f2075b;
        obj.getClass();
        this.Z = (Object[]) obj;
        this.f12614b0 = i2;
        if (p10[1] == null) {
            this.Y = (Object[]) p10[0];
            this.R = i10 - 5;
            return;
        }
        this.Y = p10;
        this.R = i10;
    }

    public final Object[] r(Object[] objArr, int i2, int i10, Iterator it) {
        boolean z10;
        if (!it.hasNext()) {
            l1.a("invalid buffersIterator");
        }
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            l1.a("negative shift");
        }
        if (i10 == 0) {
            return (Object[]) it.next();
        }
        Object[] k10 = k(objArr);
        int q10 = p7.k.q(i2, i10);
        int i11 = i10 - 5;
        k10[q10] = r((Object[]) k10[q10], i2, i11, it);
        while (true) {
            q10++;
            if (q10 >= 32 || !it.hasNext()) {
                break;
            }
            k10[q10] = r((Object[]) k10[q10], 0, i11, it);
        }
        return k10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i2, Object[][] objArr2) {
        Object[] k10;
        Iterator z0Var = new z0(objArr2);
        int i10 = i2 >> 5;
        int i11 = this.R;
        if (i10 < (1 << i11)) {
            k10 = r(objArr, i2, i11, z0Var);
        } else {
            k10 = k(objArr);
        }
        while (z0Var.hasNext()) {
            this.R += 5;
            k10 = n(k10);
            int i12 = this.R;
            r(k10, 1 << i12, i12, z0Var);
        }
        return k10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m.k(i2, a());
        if (B() <= i2) {
            Object[] k10 = k(this.Z);
            if (k10 != this.Z) {
                ((AbstractList) this).modCount++;
            }
            int i10 = i2 & 31;
            Object obj2 = k10[i10];
            k10[i10] = obj;
            this.Z = k10;
            return obj2;
        }
        b6.f fVar = new b6.f(4, null);
        Object[] objArr = this.Y;
        objArr.getClass();
        this.Y = C(objArr, this.R, i2, obj, fVar);
        return fVar.f2075b;
    }

    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i2 = this.f12614b0;
        int i10 = i2 >> 5;
        int i11 = this.R;
        if (i10 > (1 << i11)) {
            this.Y = u(this.R + 5, n(objArr), objArr2);
            this.Z = objArr3;
            this.R += 5;
            this.f12614b0++;
        } else if (objArr == null) {
            this.Y = objArr2;
            this.Z = objArr3;
            this.f12614b0 = i2 + 1;
        } else {
            this.Y = u(i11, objArr, objArr2);
            this.Z = objArr3;
            this.f12614b0++;
        }
    }

    public final Object[] u(int i2, Object[] objArr, Object[] objArr2) {
        int q10 = p7.k.q(a() - 1, i2);
        Object[] k10 = k(objArr);
        if (i2 == 5) {
            k10[q10] = objArr2;
            return k10;
        }
        k10[q10] = u(i2 - 5, (Object[]) k10[q10], objArr2);
        return k10;
    }

    public final int v(l lVar, Object[] objArr, int i2, int i10, b6.f fVar, ArrayList arrayList, ArrayList arrayList2) {
        Object[] m;
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = fVar.f2075b;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i11 = 0; i11 < i2; i11++) {
            Object obj2 = objArr[i11];
            if (!((Boolean) lVar.k(obj2)).booleanValue()) {
                if (i10 == 32) {
                    if (!arrayList.isEmpty()) {
                        m = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        m = m();
                    }
                    objArr3 = m;
                    i10 = 0;
                }
                objArr3[i10] = obj2;
                i10++;
            }
        }
        fVar.f2075b = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i10;
    }

    public final int w(l lVar, Object[] objArr, int i2, b6.f fVar) {
        Object[] objArr2 = objArr;
        int i10 = i2;
        boolean z10 = false;
        for (int i11 = 0; i11 < i2; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) lVar.k(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = k(objArr);
                    z10 = true;
                    i10 = i11;
                }
            } else if (z10) {
                objArr2[i10] = obj;
                i10++;
            }
        }
        fVar.f2075b = objArr2;
        return i10;
    }

    public final int x(l lVar, int i2, b6.f fVar) {
        int w10 = w(lVar, this.Z, i2, fVar);
        Object obj = fVar.f2075b;
        if (w10 == i2) {
            return i2;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, w10, i2, (Object) null);
        this.Z = objArr;
        this.f12614b0 -= i2 - w10;
        return w10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r0 != r8) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (x(r1, r8, r5) != r8) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(mc.l r16) {
        /*
            r15 = this;
            r1 = r16
            int r8 = r15.E()
            b6.f r5 = new b6.f
            r0 = 4
            r9 = 0
            r5.<init>(r0, r9)
            java.lang.Object[] r0 = r15.Y
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L1c
            int r0 = r15.x(r1, r8, r5)
            if (r0 == r8) goto Ld2
        L19:
            r10 = r11
            goto Ld2
        L1c:
            r2.a r12 = r15.j(r10)
            r13 = 32
            r0 = r13
        L23:
            if (r0 != r13) goto L36
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.w(r1, r0, r13, r5)
            goto L23
        L36:
            if (r0 != r13) goto L4a
            int r0 = r15.x(r1, r8, r5)
            if (r0 != 0) goto L47
            java.lang.Object[] r1 = r15.Y
            int r2 = r15.f12614b0
            int r3 = r15.R
            r15.q(r1, r2, r3)
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
            int r4 = r0.v(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L5a
        L71:
            java.lang.Object[] r2 = r15.Z
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.v(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.f2075b
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
            java.lang.Object[] r4 = r15.r(r4, r14, r3, r5)
        L9b:
            int r3 = r7.size()
            int r3 = r3 << 5
            int r14 = r14 + r3
            r3 = r14 & 31
            if (r3 != 0) goto La7
            goto Lac
        La7:
            java.lang.String r3 = "invalid size"
            n2.l1.a(r3)
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
            java.lang.Object[] r9 = r15.o(r4, r3, r5)
        Lc9:
            r15.Y = r9
            r15.Z = r2
            int r14 = r14 + r1
            r15.f12614b0 = r14
            goto L19
        Ld2:
            if (r10 == 0) goto Ld9
            int r1 = r15.modCount
            int r1 = r1 + r11
            r15.modCount = r1
        Ld9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.f.y(mc.l):boolean");
    }

    public final Object[] z(Object[] objArr, int i2, int i10, b6.f fVar) {
        int q10 = p7.k.q(i10, i2);
        int i11 = 31;
        if (i2 == 0) {
            Object obj = objArr[q10];
            Object[] k10 = k(objArr);
            k.i(objArr, k10, q10, q10 + 1, 32);
            k10[31] = fVar.f2075b;
            fVar.f2075b = obj;
            return k10;
        }
        if (objArr[31] == null) {
            i11 = p7.k.q(B() - 1, i2);
        }
        Object[] k11 = k(objArr);
        int i12 = i2 - 5;
        int i13 = q10 + 1;
        if (i13 <= i11) {
            while (true) {
                Object obj2 = k11[i11];
                obj2.getClass();
                k11[i11] = z((Object[]) obj2, i12, 0, fVar);
                if (i11 == i13) {
                    break;
                }
                i11--;
            }
        }
        Object obj3 = k11[q10];
        obj3.getClass();
        k11[q10] = z((Object[]) obj3, i12, i10, fVar);
        return k11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int E = E();
        if (E < 32) {
            Object[] k10 = k(this.Z);
            k10[E] = obj;
            this.Z = k10;
            this.f12614b0 = a() + 1;
        } else {
            t(this.Y, this.Z, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int E = E();
        Iterator it = collection.iterator();
        if (32 - E >= collection.size()) {
            Object[] k10 = k(this.Z);
            d(k10, E, it);
            this.Z = k10;
            this.f12614b0 = collection.size() + this.f12614b0;
            return true;
        }
        int size = ((collection.size() + E) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] k11 = k(this.Z);
        d(k11, E, it);
        objArr[0] = k11;
        for (int i2 = 1; i2 < size; i2++) {
            Object[] m = m();
            d(m, 0, it);
            objArr[i2] = m;
        }
        this.Y = s(this.Y, B(), objArr);
        Object[] m10 = m();
        d(m10, 0, it);
        this.Z = m10;
        this.f12614b0 = collection.size() + this.f12614b0;
        return true;
    }
}
