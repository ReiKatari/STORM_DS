package z2;

import android.os.Parcel;
import android.os.Parcelable;
import g2.c3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import n2.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements Parcelable, y, List, RandomAccess, oc.b {
    public static final Parcelable.Creator<p> CREATOR = new o(0);
    public v A;

    public p(r2.c cVar) {
        f j2 = l.j();
        v vVar = new v(j2.g(), cVar);
        if (!(j2 instanceof a)) {
            vVar.f14883b = new v(1, cVar);
        }
        this.A = vVar;
    }

    @Override // z2.y
    public final a0 a() {
        return this.A;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i2;
        r2.c cVar;
        f j2;
        boolean b10;
        do {
            synchronized (q.f14929a) {
                v vVar = this.A;
                vVar.getClass();
                v vVar2 = (v) l.h(vVar);
                i2 = vVar2.f14956d;
                cVar = vVar2.f14955c;
            }
            cVar.getClass();
            r2.c c4 = cVar.c(obj);
            if (c4.equals(cVar)) {
                return false;
            }
            v vVar3 = this.A;
            vVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                b10 = q.b((v) l.w(vVar3, this, j2), i2, c4, true);
            }
            l.n(j2, this);
        } while (!b10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i2;
        r2.c cVar;
        f j2;
        boolean b10;
        do {
            synchronized (q.f14929a) {
                v vVar = this.A;
                vVar.getClass();
                v vVar2 = (v) l.h(vVar);
                i2 = vVar2.f14956d;
                cVar = vVar2.f14955c;
            }
            cVar.getClass();
            r2.c d4 = cVar.d(collection);
            if (nc.k.a(d4, cVar)) {
                return false;
            }
            v vVar3 = this.A;
            vVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                b10 = q.b((v) l.w(vVar3, this, j2), i2, d4, true);
            }
            l.n(j2, this);
        } while (!b10);
        return true;
    }

    @Override // z2.y
    public final void c(a0 a0Var) {
        a0Var.f14883b = this.A;
        this.A = (v) a0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        f j2;
        v vVar = this.A;
        vVar.getClass();
        synchronized (l.f14919c) {
            j2 = l.j();
            v vVar2 = (v) l.w(vVar, this, j2);
            synchronized (q.f14929a) {
                vVar2.f14955c = r2.i.B;
                vVar2.f14956d++;
                vVar2.f14957e++;
            }
        }
        l.n(j2, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return q.f(this).f14955c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return q.f(this).f14955c.containsAll(collection);
    }

    public final void d(int i2, int i10) {
        int i11;
        r2.c cVar;
        f j2;
        boolean b10;
        do {
            synchronized (q.f14929a) {
                v vVar = this.A;
                vVar.getClass();
                v vVar2 = (v) l.h(vVar);
                i11 = vVar2.f14956d;
                cVar = vVar2.f14955c;
            }
            cVar.getClass();
            r2.f e6 = cVar.e();
            e6.subList(i2, i10).clear();
            r2.c c4 = e6.c();
            if (!nc.k.a(c4, cVar)) {
                v vVar3 = this.A;
                vVar3.getClass();
                synchronized (l.f14919c) {
                    j2 = l.j();
                    b10 = q.b((v) l.w(vVar3, this, j2), i11, c4, true);
                }
                l.n(j2, this);
            } else {
                return;
            }
        } while (!b10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return q.f(this).f14955c.get(i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return q.f(this).f14955c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return q.f(this).f14955c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return q.f(this).f14955c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new a4.r(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i2;
        r2.c cVar;
        r2.c cVar2;
        f j2;
        boolean b10;
        do {
            synchronized (q.f14929a) {
                v vVar = this.A;
                vVar.getClass();
                v vVar2 = (v) l.h(vVar);
                i2 = vVar2.f14956d;
                cVar = vVar2.f14955c;
            }
            cVar.getClass();
            int indexOf = cVar.indexOf(obj);
            if (indexOf != -1) {
                cVar2 = cVar.g(indexOf);
            } else {
                cVar2 = cVar;
            }
            if (cVar2.equals(cVar)) {
                return false;
            }
            v vVar3 = this.A;
            vVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                b10 = q.b((v) l.w(vVar3, this, j2), i2, cVar2, true);
            }
            l.n(j2, this);
        } while (!b10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i2;
        r2.c cVar;
        f j2;
        boolean b10;
        do {
            synchronized (q.f14929a) {
                v vVar = this.A;
                vVar.getClass();
                v vVar2 = (v) l.h(vVar);
                i2 = vVar2.f14956d;
                cVar = vVar2.f14955c;
            }
            cVar.getClass();
            r2.c f8 = cVar.f(new r2.b(0, collection));
            if (nc.k.a(f8, cVar)) {
                return false;
            }
            v vVar3 = this.A;
            vVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                b10 = q.b((v) l.w(vVar3, this, j2), i2, f8, true);
            }
            l.n(j2, this);
        } while (!b10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return q.i(this, new r2.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        int i10;
        r2.c cVar;
        f j2;
        boolean b10;
        Object obj2 = get(i2);
        do {
            synchronized (q.f14929a) {
                v vVar = this.A;
                vVar.getClass();
                v vVar2 = (v) l.h(vVar);
                i10 = vVar2.f14956d;
                cVar = vVar2.f14955c;
            }
            cVar.getClass();
            r2.c h2 = cVar.h(i2, obj);
            if (h2.equals(cVar)) {
                break;
            }
            v vVar3 = this.A;
            vVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                b10 = q.b((v) l.w(vVar3, this, j2), i10, h2, false);
            }
            l.n(j2, this);
        } while (!b10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return q.f(this).f14955c.a();
    }

    @Override // java.util.List
    public final List subList(int i2, int i10) {
        boolean z10;
        if (i2 >= 0 && i2 <= i10 && i10 <= size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            l1.a("fromIndex or toIndex are out of bounds");
        }
        return new c0(this, i2, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return nc.j.a(this);
    }

    public final String toString() {
        v vVar = this.A;
        vVar.getClass();
        return "SnapshotStateList(value=" + ((v) l.h(vVar)).f14955c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        r2.c cVar = q.f(this).f14955c;
        int a10 = cVar.a();
        parcel.writeInt(a10);
        for (int i10 = 0; i10 < a10; i10++) {
            parcel.writeValue(cVar.get(i10));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nc.j.b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new a4.r(this, i2);
    }

    public p() {
        this(r2.i.B);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        int i10;
        r2.c cVar;
        f j2;
        boolean b10;
        do {
            synchronized (q.f14929a) {
                v vVar = this.A;
                vVar.getClass();
                v vVar2 = (v) l.h(vVar);
                i10 = vVar2.f14956d;
                cVar = vVar2.f14955c;
            }
            cVar.getClass();
            r2.c b11 = cVar.b(i2, obj);
            if (b11.equals(cVar)) {
                return;
            }
            v vVar3 = this.A;
            vVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                b10 = q.b((v) l.w(vVar3, this, j2), i10, b11, true);
            }
            l.n(j2, this);
        } while (!b10);
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        return q.i(this, new c3(i2, collection));
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        int i10;
        r2.c cVar;
        f j2;
        boolean b10;
        Object obj = get(i2);
        do {
            synchronized (q.f14929a) {
                v vVar = this.A;
                vVar.getClass();
                v vVar2 = (v) l.h(vVar);
                i10 = vVar2.f14956d;
                cVar = vVar2.f14955c;
            }
            cVar.getClass();
            r2.c g10 = cVar.g(i2);
            if (g10.equals(cVar)) {
                break;
            }
            v vVar3 = this.A;
            vVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                b10 = q.b((v) l.w(vVar3, this, j2), i10, g10, true);
            }
            l.n(j2, this);
        } while (!b10);
        return obj;
    }
}
