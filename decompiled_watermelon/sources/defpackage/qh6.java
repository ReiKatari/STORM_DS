package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qh6  reason: default package */
/* loaded from: classes.dex */
public final class qh6 implements List, g93 {
    public final xa6 A;
    public final int B;
    public int L;
    public int R;

    public qh6(xa6 xa6Var, int i, int i2) {
        this.A = xa6Var;
        this.B = i;
        this.L = b53.Q(xa6Var);
        this.R = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i = this.B + this.R;
        xa6 xa6Var = this.A;
        xa6Var.add(i, obj);
        this.R++;
        this.L = b53.Q(xa6Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        int i2 = i + this.B;
        xa6 xa6Var = this.A;
        boolean addAll = xa6Var.addAll(i2, collection);
        if (addAll) {
            this.R = collection.size() + this.R;
            this.L = b53.Q(xa6Var);
        }
        return addAll;
    }

    public final void b() {
        if (b53.Q(this.A) == this.L) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.R > 0) {
            b();
            int i = this.R;
            int i2 = this.B;
            xa6 xa6Var = this.A;
            xa6Var.i(i2, i + i2);
            this.R = 0;
            this.L = b53.Q(xa6Var);
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
        b();
        b53.u(i, this.R);
        return this.A.get(this.B + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.R;
        int i2 = this.B;
        Iterator it = io2.t0(i2, i + i2).iterator();
        while (((c33) it).L) {
            int nextInt = ((w23) it).nextInt();
            if (b53.x(obj, this.A.get(nextInt))) {
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
        b();
        int i = this.R;
        int i2 = this.B;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (b53.x(obj, this.A.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l75] */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        ?? obj = new Object();
        obj.A = i - 1;
        return new tf5((l75) obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        int i2 = this.B + i;
        xa6 xa6Var = this.A;
        Object remove = xa6Var.remove(i2);
        this.R--;
        this.L = b53.Q(xa6Var);
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
        g1 g1Var;
        ga6 j;
        boolean y;
        b();
        xa6 xa6Var = this.A;
        int i2 = this.B;
        int i3 = this.R + i2;
        int size = xa6Var.size();
        do {
            synchronized (b53.d) {
                me6 me6Var = xa6Var.A;
                me6Var.getClass();
                me6 me6Var2 = (me6) ma6.h(me6Var);
                i = me6Var2.d;
                g1Var = me6Var2.c;
            }
            g1Var.getClass();
            en4 j2 = g1Var.j();
            j2.subList(i2, i3).retainAll(collection);
            g1 d = j2.d();
            if (b53.x(d, g1Var)) {
                break;
            }
            me6 me6Var3 = xa6Var.A;
            me6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                y = b53.y((me6) ma6.w(me6Var3, xa6Var, j), i, d, true);
            }
            ma6.n(j, xa6Var);
        } while (!y);
        int size2 = size - xa6Var.size();
        if (size2 > 0) {
            this.L = b53.Q(this.A);
            this.R -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b53.u(i, this.R);
        b();
        int i2 = i + this.B;
        xa6 xa6Var = this.A;
        Object obj2 = xa6Var.set(i2, obj);
        this.L = b53.Q(xa6Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.R;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.R) {
            or4.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i3 = this.B;
        return new qh6(this.A, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return b53.h0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return b53.i0(this, objArr);
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
        b();
        int i2 = this.B + i;
        xa6 xa6Var = this.A;
        xa6Var.add(i2, obj);
        this.R++;
        this.L = b53.Q(xa6Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.R, collection);
    }
}
