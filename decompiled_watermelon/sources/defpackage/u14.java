package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u14  reason: default package */
/* loaded from: classes.dex */
public final class u14 implements List, g93 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ u14(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.A;
        Object obj2 = this.B;
        switch (i3) {
            case 0:
                w14 w14Var = (w14) obj2;
                if (i >= 0 && i <= (i2 = w14Var.b)) {
                    int i4 = i2 + 1;
                    Object[] objArr = w14Var.a;
                    if (objArr.length < i4) {
                        w14Var.m(i4, objArr);
                    }
                    Object[] objArr2 = w14Var.a;
                    int i5 = w14Var.b;
                    if (i != i5) {
                        nu.f0(objArr2, objArr2, i + 1, i, i5);
                    }
                    objArr2[i] = obj;
                    w14Var.b++;
                    return;
                }
                w14Var.p(i);
                throw null;
            default:
                ((o24) obj2).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                collection.getClass();
                w14 w14Var = (w14) obj;
                if (i >= 0 && i <= w14Var.b) {
                    int i3 = 0;
                    if (collection.isEmpty()) {
                        return false;
                    }
                    int size = collection.size() + w14Var.b;
                    Object[] objArr = w14Var.a;
                    if (objArr.length < size) {
                        w14Var.m(size, objArr);
                    }
                    Object[] objArr2 = w14Var.a;
                    if (i != w14Var.b) {
                        nu.f0(objArr2, objArr2, collection.size() + i, i, w14Var.b);
                    }
                    for (Object obj2 : collection) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            objArr2[i3 + i] = obj2;
                            i3 = i4;
                        } else {
                            l07.v0();
                            throw null;
                        }
                    }
                    w14Var.b = collection.size() + w14Var.b;
                    return true;
                }
                w14Var.p(i);
                throw null;
            default:
                return ((o24) obj).f(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((w14) obj).d();
                return;
            default:
                ((o24) obj).h();
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                if (((w14) obj2).g(obj) >= 0) {
                    return true;
                }
                return false;
            default:
                return ((o24) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                collection.getClass();
                w14 w14Var = (w14) obj;
                for (Object obj2 : collection) {
                    if (w14Var.g(obj2) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                o24 o24Var = (o24) obj;
                for (Object obj3 : collection) {
                    if (!o24Var.i(obj3)) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                b94.a(i, this);
                return ((w14) obj).f(i);
            default:
                p24.a(i, this);
                return ((o24) obj).A[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                return ((w14) obj2).g(obj);
            default:
                return ((o24) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((w14) obj).h();
            default:
                if (((o24) obj).L == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new t14(0, 0, this);
            default:
                return new t14(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.A;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                w14 w14Var = (w14) obj2;
                Object[] objArr = w14Var.a;
                int i3 = w14Var.b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                o24 o24Var = (o24) obj2;
                Object[] objArr2 = o24Var.A;
                for (int i4 = o24Var.L - 1; i4 >= 0; i4--) {
                    if (b53.x(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.A) {
            case 0:
                return new t14(0, 0, this);
            default:
                return new t14(0, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                b94.a(i, this);
                return ((w14) obj).k(i);
            default:
                p24.a(i, this);
                return ((o24) obj).l(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                collection.getClass();
                w14 w14Var = (w14) obj;
                int i2 = w14Var.b;
                for (Object obj2 : collection) {
                    w14Var.j(obj2);
                }
                if (i2 != w14Var.b) {
                    return true;
                }
                return false;
            default:
                o24 o24Var = (o24) obj;
                if (!collection.isEmpty()) {
                    int i3 = o24Var.L;
                    for (Object obj3 : collection) {
                        o24Var.k(obj3);
                    }
                    if (i3 != o24Var.L) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                collection.getClass();
                w14 w14Var = (w14) obj;
                int i2 = w14Var.b;
                Object[] objArr = w14Var.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        w14Var.k(i3);
                    }
                }
                if (i2 == w14Var.b) {
                    return false;
                }
                return true;
            default:
                o24 o24Var = (o24) obj;
                int i4 = o24Var.L;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(o24Var.A[i5])) {
                        o24Var.l(i5);
                    }
                }
                if (i4 == o24Var.L) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.A;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                b94.a(i, this);
                return ((w14) obj2).n(i, obj);
            default:
                p24.a(i, this);
                Object[] objArr = ((o24) obj2).A;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((w14) obj).b;
            default:
                return ((o24) obj).L;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.A) {
            case 0:
                b94.b(i, i2, this);
                return new v14(this, i, i2, 0);
            default:
                p24.b(i, i2, this);
                return new v14(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                objArr.getClass();
                return b53.i0(this, objArr);
            default:
                return b53.i0(this, objArr);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                return b53.h0(this);
            default:
                return b53.h0(this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.A) {
            case 0:
                return new t14(i, 0, this);
            default:
                return new t14(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                return ((w14) obj2).j(obj);
            default:
                return ((o24) obj2).k(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                ((w14) obj2).a(obj);
                return true;
            default:
                ((o24) obj2).b(obj);
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                collection.getClass();
                w14 w14Var = (w14) obj;
                int i2 = w14Var.b;
                for (Object obj2 : collection) {
                    w14Var.a(obj2);
                }
                return i2 != w14Var.b;
            default:
                o24 o24Var = (o24) obj;
                return o24Var.f(o24Var.L, collection);
        }
    }
}
