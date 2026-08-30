package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xa6  reason: default package */
/* loaded from: classes.dex */
public final class xa6 implements Parcelable, pe6, List, RandomAccess, g93 {
    public static final Parcelable.Creator<xa6> CREATOR = new wa6(0);
    public me6 A;

    public xa6(g1 g1Var) {
        ga6 j = ma6.j();
        me6 me6Var = new me6(j.g(), g1Var);
        if (!(j instanceof jm2)) {
            me6Var.b = new me6(1L, g1Var);
        }
        this.A = me6Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        g1 g1Var;
        ga6 j;
        boolean y;
        do {
            synchronized (b53.d) {
                me6 me6Var = this.A;
                me6Var.getClass();
                me6 me6Var2 = (me6) ma6.h(me6Var);
                i = me6Var2.d;
                g1Var = me6Var2.c;
            }
            g1Var.getClass();
            g1 d = g1Var.d(obj);
            if (d.equals(g1Var)) {
                return false;
            }
            me6 me6Var3 = this.A;
            me6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                y = b53.y((me6) ma6.w(me6Var3, this, j), i, d, true);
            }
            ma6.n(j, this);
        } while (!y);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        g1 g1Var;
        ga6 j;
        boolean y;
        do {
            synchronized (b53.d) {
                me6 me6Var = this.A;
                me6Var.getClass();
                me6 me6Var2 = (me6) ma6.h(me6Var);
                i = me6Var2.d;
                g1Var = me6Var2.c;
            }
            g1Var.getClass();
            g1 i2 = g1Var.i(collection);
            if (b53.x(i2, g1Var)) {
                return false;
            }
            me6 me6Var3 = this.A;
            me6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                y = b53.y((me6) ma6.w(me6Var3, this, j), i, i2, true);
            }
            ma6.n(j, this);
        } while (!y);
        return true;
    }

    @Override // defpackage.pe6
    public final se6 b() {
        return this.A;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ga6 j;
        me6 me6Var = this.A;
        me6Var.getClass();
        synchronized (ma6.c) {
            j = ma6.j();
            me6 me6Var2 = (me6) ma6.w(me6Var, this, j);
            synchronized (b53.d) {
                me6Var2.c = a96.B;
                me6Var2.d++;
                me6Var2.e++;
            }
        }
        ma6.n(j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return b53.P(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return b53.P(this).c.containsAll(collection);
    }

    @Override // defpackage.pe6
    public final void d(se6 se6Var) {
        se6Var.b = this.A;
        this.A = (me6) se6Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return b53.P(this).c.get(i);
    }

    public final void i(int i, int i2) {
        int i3;
        g1 g1Var;
        ga6 j;
        boolean y;
        do {
            synchronized (b53.d) {
                me6 me6Var = this.A;
                me6Var.getClass();
                me6 me6Var2 = (me6) ma6.h(me6Var);
                i3 = me6Var2.d;
                g1Var = me6Var2.c;
            }
            g1Var.getClass();
            en4 j2 = g1Var.j();
            j2.subList(i, i2).clear();
            g1 d = j2.d();
            if (!b53.x(d, g1Var)) {
                me6 me6Var3 = this.A;
                me6Var3.getClass();
                synchronized (ma6.c) {
                    j = ma6.j();
                    y = b53.y((me6) ma6.w(me6Var3, this, j), i3, d, true);
                }
                ma6.n(j, this);
            } else {
                return;
            }
        } while (!y);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return b53.P(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return b53.P(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return b53.P(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new wr2(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        g1 g1Var;
        g1 g1Var2;
        ga6 j;
        boolean y;
        do {
            synchronized (b53.d) {
                me6 me6Var = this.A;
                me6Var.getClass();
                me6 me6Var2 = (me6) ma6.h(me6Var);
                i = me6Var2.d;
                g1Var = me6Var2.c;
            }
            g1Var.getClass();
            int indexOf = g1Var.indexOf(obj);
            if (indexOf != -1) {
                g1Var2 = g1Var.l(indexOf);
            } else {
                g1Var2 = g1Var;
            }
            if (g1Var2.equals(g1Var)) {
                return false;
            }
            me6 me6Var3 = this.A;
            me6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                y = b53.y((me6) ma6.w(me6Var3, this, j), i, g1Var2, true);
            }
            ma6.n(j, this);
        } while (!y);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        g1 g1Var;
        ga6 j;
        boolean y;
        do {
            synchronized (b53.d) {
                me6 me6Var = this.A;
                me6Var.getClass();
                me6 me6Var2 = (me6) ma6.h(me6Var);
                i = me6Var2.d;
                g1Var = me6Var2.c;
            }
            g1Var.getClass();
            g1 k = g1Var.k(new f1(0, collection));
            if (b53.x(k, g1Var)) {
                return false;
            }
            me6 me6Var3 = this.A;
            me6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                y = b53.y((me6) ma6.w(me6Var3, this, j), i, k, true);
            }
            ma6.n(j, this);
        } while (!y);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return b53.V(this, new f1(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        g1 g1Var;
        ga6 j;
        boolean y;
        Object obj2 = get(i);
        do {
            synchronized (b53.d) {
                me6 me6Var = this.A;
                me6Var.getClass();
                me6 me6Var2 = (me6) ma6.h(me6Var);
                i2 = me6Var2.d;
                g1Var = me6Var2.c;
            }
            g1Var.getClass();
            g1 m = g1Var.m(i, obj);
            if (m.equals(g1Var)) {
                break;
            }
            me6 me6Var3 = this.A;
            me6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                y = b53.y((me6) ma6.w(me6Var3, this, j), i2, m, false);
            }
            ma6.n(j, this);
        } while (!y);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return b53.P(this).c.b();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        boolean z;
        if (i >= 0 && i <= i2 && i2 <= size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            or4.a("fromIndex or toIndex are out of bounds");
        }
        return new qh6(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return b53.h0(this);
    }

    public final String toString() {
        me6 me6Var = this.A;
        me6Var.getClass();
        return "SnapshotStateList(value=" + ((me6) ma6.h(me6Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g1 g1Var = b53.P(this).c;
        int b = g1Var.b();
        parcel.writeInt(b);
        for (int i2 = 0; i2 < b; i2++) {
            parcel.writeValue(g1Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return b53.i0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new wr2(this, i);
    }

    public xa6() {
        this(a96.B);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        g1 g1Var;
        ga6 j;
        boolean y;
        do {
            synchronized (b53.d) {
                me6 me6Var = this.A;
                me6Var.getClass();
                me6 me6Var2 = (me6) ma6.h(me6Var);
                i2 = me6Var2.d;
                g1Var = me6Var2.c;
            }
            g1Var.getClass();
            g1 c = g1Var.c(i, obj);
            if (c.equals(g1Var)) {
                return;
            }
            me6 me6Var3 = this.A;
            me6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                y = b53.y((me6) ma6.w(me6Var3, this, j), i2, c, true);
            }
            ma6.n(j, this);
        } while (!y);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return b53.V(this, new hi3(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        g1 g1Var;
        ga6 j;
        boolean y;
        Object obj = get(i);
        do {
            synchronized (b53.d) {
                me6 me6Var = this.A;
                me6Var.getClass();
                me6 me6Var2 = (me6) ma6.h(me6Var);
                i2 = me6Var2.d;
                g1Var = me6Var2.c;
            }
            g1Var.getClass();
            g1 l = g1Var.l(i);
            if (l.equals(g1Var)) {
                break;
            }
            me6 me6Var3 = this.A;
            me6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                y = b53.y((me6) ma6.w(me6Var3, this, j), i2, l, true);
            }
            ma6.n(j, this);
        } while (!y);
        return obj;
    }
}
