package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm6  reason: default package */
/* loaded from: classes.dex */
public final class mm6 implements Parcelable, eq6, List, RandomAccess, ag3 {
    public static final Parcelable.Creator<mm6> CREATOR = new lm6(0);
    public bq6 A;

    public mm6(h1 h1Var) {
        vl6 j = bm6.j();
        bq6 bq6Var = new bq6(j.g(), h1Var);
        if (!(j instanceof os2)) {
            bq6Var.b = new bq6(1L, h1Var);
        }
        this.A = bq6Var;
    }

    @Override // defpackage.eq6
    public final hq6 a() {
        return this.A;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        h1 h1Var;
        vl6 j;
        boolean o;
        do {
            synchronized (ge7.i) {
                bq6 bq6Var = this.A;
                bq6Var.getClass();
                bq6 bq6Var2 = (bq6) bm6.h(bq6Var);
                i = bq6Var2.d;
                h1Var = bq6Var2.c;
            }
            h1Var.getClass();
            h1 c = h1Var.c(obj);
            if (c.equals(h1Var)) {
                return false;
            }
            bq6 bq6Var3 = this.A;
            bq6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                o = ge7.o((bq6) bm6.w(bq6Var3, this, j), i, c, true);
            }
            bm6.n(j, this);
        } while (!o);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        h1 h1Var;
        vl6 j;
        boolean o;
        do {
            synchronized (ge7.i) {
                bq6 bq6Var = this.A;
                bq6Var.getClass();
                bq6 bq6Var2 = (bq6) bm6.h(bq6Var);
                i = bq6Var2.d;
                h1Var = bq6Var2.c;
            }
            h1Var.getClass();
            h1 d = h1Var.d(collection);
            if (nb3.k(d, h1Var)) {
                return false;
            }
            bq6 bq6Var3 = this.A;
            bq6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                o = ge7.o((bq6) bm6.w(bq6Var3, this, j), i, d, true);
            }
            bm6.n(j, this);
        } while (!o);
        return true;
    }

    public final void c(int i, int i2) {
        int i3;
        h1 h1Var;
        vl6 j;
        boolean o;
        do {
            synchronized (ge7.i) {
                bq6 bq6Var = this.A;
                bq6Var.getClass();
                bq6 bq6Var2 = (bq6) bm6.h(bq6Var);
                i3 = bq6Var2.d;
                h1Var = bq6Var2.c;
            }
            h1Var.getClass();
            jw4 f = h1Var.f();
            f.subList(i, i2).clear();
            h1 c = f.c();
            if (!nb3.k(c, h1Var)) {
                bq6 bq6Var3 = this.A;
                bq6Var3.getClass();
                synchronized (bm6.c) {
                    j = bm6.j();
                    o = ge7.o((bq6) bm6.w(bq6Var3, this, j), i3, c, true);
                }
                bm6.n(j, this);
            } else {
                return;
            }
        } while (!o);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        vl6 j;
        bq6 bq6Var = this.A;
        bq6Var.getClass();
        synchronized (bm6.c) {
            j = bm6.j();
            bq6 bq6Var2 = (bq6) bm6.w(bq6Var, this, j);
            synchronized (ge7.i) {
                bq6Var2.c = qk6.B;
                bq6Var2.d++;
                bq6Var2.e++;
            }
        }
        bm6.n(j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ge7.E(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ge7.E(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eq6
    public final void f(hq6 hq6Var) {
        hq6Var.b = this.A;
        this.A = (bq6) hq6Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ge7.E(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return ge7.E(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ge7.E(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ge7.E(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new xx2(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        h1 h1Var;
        h1 h1Var2;
        vl6 j;
        boolean o;
        do {
            synchronized (ge7.i) {
                bq6 bq6Var = this.A;
                bq6Var.getClass();
                bq6 bq6Var2 = (bq6) bm6.h(bq6Var);
                i = bq6Var2.d;
                h1Var = bq6Var2.c;
            }
            h1Var.getClass();
            int indexOf = h1Var.indexOf(obj);
            if (indexOf != -1) {
                h1Var2 = h1Var.h(indexOf);
            } else {
                h1Var2 = h1Var;
            }
            if (h1Var2.equals(h1Var)) {
                return false;
            }
            bq6 bq6Var3 = this.A;
            bq6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                o = ge7.o((bq6) bm6.w(bq6Var3, this, j), i, h1Var2, true);
            }
            bm6.n(j, this);
        } while (!o);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        h1 h1Var;
        vl6 j;
        boolean o;
        do {
            synchronized (ge7.i) {
                bq6 bq6Var = this.A;
                bq6Var.getClass();
                bq6 bq6Var2 = (bq6) bm6.h(bq6Var);
                i = bq6Var2.d;
                h1Var = bq6Var2.c;
            }
            h1Var.getClass();
            h1 g = h1Var.g(new g1(0, collection));
            if (nb3.k(g, h1Var)) {
                return false;
            }
            bq6 bq6Var3 = this.A;
            bq6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                o = ge7.o((bq6) bm6.w(bq6Var3, this, j), i, g, true);
            }
            bm6.n(j, this);
        } while (!o);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return ge7.M(this, new g1(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        h1 h1Var;
        vl6 j;
        boolean o;
        Object obj2 = get(i);
        do {
            synchronized (ge7.i) {
                bq6 bq6Var = this.A;
                bq6Var.getClass();
                bq6 bq6Var2 = (bq6) bm6.h(bq6Var);
                i2 = bq6Var2.d;
                h1Var = bq6Var2.c;
            }
            h1Var.getClass();
            h1 i3 = h1Var.i(i, obj);
            if (i3.equals(h1Var)) {
                break;
            }
            bq6 bq6Var3 = this.A;
            bq6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                o = ge7.o((bq6) bm6.w(bq6Var3, this, j), i2, i3, false);
            }
            bm6.n(j, this);
        } while (!o);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ge7.E(this).c.a();
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
            r05.a("fromIndex or toIndex are out of bounds");
        }
        return new ht6(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return nb3.b0(this);
    }

    public final String toString() {
        bq6 bq6Var = this.A;
        bq6Var.getClass();
        return "SnapshotStateList(value=" + ((bq6) bm6.h(bq6Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        h1 h1Var = ge7.E(this).c;
        int a = h1Var.a();
        parcel.writeInt(a);
        for (int i2 = 0; i2 < a; i2++) {
            parcel.writeValue(h1Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nb3.c0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new xx2(this, i);
    }

    public mm6() {
        this(qk6.B);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        h1 h1Var;
        vl6 j;
        boolean o;
        do {
            synchronized (ge7.i) {
                bq6 bq6Var = this.A;
                bq6Var.getClass();
                bq6 bq6Var2 = (bq6) bm6.h(bq6Var);
                i2 = bq6Var2.d;
                h1Var = bq6Var2.c;
            }
            h1Var.getClass();
            h1 b = h1Var.b(i, obj);
            if (b.equals(h1Var)) {
                return;
            }
            bq6 bq6Var3 = this.A;
            bq6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                o = ge7.o((bq6) bm6.w(bq6Var3, this, j), i2, b, true);
            }
            bm6.n(j, this);
        } while (!o);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return ge7.M(this, new fp3(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        h1 h1Var;
        vl6 j;
        boolean o;
        Object obj = get(i);
        do {
            synchronized (ge7.i) {
                bq6 bq6Var = this.A;
                bq6Var.getClass();
                bq6 bq6Var2 = (bq6) bm6.h(bq6Var);
                i2 = bq6Var2.d;
                h1Var = bq6Var2.c;
            }
            h1Var.getClass();
            h1 h = h1Var.h(i);
            if (h.equals(h1Var)) {
                break;
            }
            bq6 bq6Var3 = this.A;
            bq6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                o = ge7.o((bq6) bm6.w(bq6Var3, this, j), i2, h, true);
            }
            bm6.n(j, this);
        } while (!o);
        return obj;
    }
}
