package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ht6  reason: default package */
/* loaded from: classes.dex */
public final class ht6 implements List, ag3 {
    public final mm6 A;
    public final int B;
    public int L;
    public int R;

    public ht6(mm6 mm6Var, int i, int i2) {
        this.A = mm6Var;
        this.B = i;
        this.L = ge7.F(mm6Var);
        this.R = i2 - i;
    }

    public final void a() {
        if (ge7.F(this.A) == this.L) {
            return;
        }
        i.l();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.B + this.R;
        mm6 mm6Var = this.A;
        mm6Var.add(i, obj);
        this.R++;
        this.L = ge7.F(mm6Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.B;
        mm6 mm6Var = this.A;
        boolean addAll = mm6Var.addAll(i2, collection);
        if (addAll) {
            this.R = collection.size() + this.R;
            this.L = ge7.F(mm6Var);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.R > 0) {
            a();
            int i = this.R;
            int i2 = this.B;
            mm6 mm6Var = this.A;
            mm6Var.c(i2, i + i2);
            this.R = 0;
            this.L = ge7.F(mm6Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection<Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        ge7.m(i, this.R);
        return this.A.get(this.B + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.R;
        int i2 = this.B;
        Iterator it = gi2.R(i2, i + i2).iterator();
        while (((k93) it).L) {
            int nextInt = ((e93) it).nextInt();
            if (nb3.k(obj, this.A.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.R == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.R;
        int i2 = this.B;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (nb3.k(obj, this.A.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bh5] */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        ?? obj = new Object();
        obj.A = i - 1;
        return new qp5((bh5) obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.B + i;
        mm6 mm6Var = this.A;
        Object remove = mm6Var.remove(i2);
        this.R--;
        this.L = ge7.F(mm6Var);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        while (true) {
            boolean z = false;
            for (Object obj : collection) {
                if (remove(obj) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        h1 h1Var;
        vl6 j;
        boolean o;
        a();
        mm6 mm6Var = this.A;
        int i2 = this.B;
        int i3 = this.R + i2;
        int size = mm6Var.size();
        do {
            synchronized (ge7.i) {
                bq6 bq6Var = mm6Var.A;
                bq6Var.getClass();
                bq6 bq6Var2 = (bq6) bm6.h(bq6Var);
                i = bq6Var2.d;
                h1Var = bq6Var2.c;
            }
            h1Var.getClass();
            jw4 f = h1Var.f();
            f.subList(i2, i3).retainAll(collection);
            h1 c = f.c();
            if (nb3.k(c, h1Var)) {
                break;
            }
            bq6 bq6Var3 = mm6Var.A;
            bq6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                o = ge7.o((bq6) bm6.w(bq6Var3, mm6Var, j), i, c, true);
            }
            bm6.n(j, mm6Var);
        } while (!o);
        int size2 = size - mm6Var.size();
        if (size2 > 0) {
            this.L = ge7.F(this.A);
            this.R -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        ge7.m(i, this.R);
        a();
        int i2 = i + this.B;
        mm6 mm6Var = this.A;
        Object obj2 = mm6Var.set(i2, obj);
        this.L = ge7.F(mm6Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.R;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.R) {
            r05.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.B;
        return new ht6(this.A, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return nb3.b0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nb3.c0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.B + i;
        mm6 mm6Var = this.A;
        mm6Var.add(i2, obj);
        this.R++;
        this.L = ge7.F(mm6Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.R, collection);
    }
}
