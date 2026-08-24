package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa4  reason: default package */
/* loaded from: classes.dex */
public final class aa4 implements List, ag3 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ aa4(Object obj, int i) {
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
                ca4 ca4Var = (ca4) obj2;
                if (i >= 0 && i <= (i2 = ca4Var.b)) {
                    int i4 = i2 + 1;
                    Object[] objArr = ca4Var.a;
                    if (objArr.length < i4) {
                        ca4Var.m(i4, objArr);
                    }
                    Object[] objArr2 = ca4Var.a;
                    int i5 = ca4Var.b;
                    if (i != i5) {
                        fv.t0(objArr2, objArr2, i + 1, i, i5);
                    }
                    objArr2[i] = obj;
                    ca4Var.b++;
                    return;
                }
                ca4Var.p(i);
                throw null;
            default:
                ((ua4) obj2).a(i, obj);
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
                ca4 ca4Var = (ca4) obj;
                if (i >= 0 && i <= ca4Var.b) {
                    int i3 = 0;
                    if (collection.isEmpty()) {
                        return false;
                    }
                    int size = collection.size() + ca4Var.b;
                    Object[] objArr = ca4Var.a;
                    if (objArr.length < size) {
                        ca4Var.m(size, objArr);
                    }
                    Object[] objArr2 = ca4Var.a;
                    if (i != ca4Var.b) {
                        fv.t0(objArr2, objArr2, collection.size() + i, i, ca4Var.b);
                    }
                    for (Object obj2 : collection) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            objArr2[i3 + i] = obj2;
                            i3 = i4;
                        } else {
                            hf.q0();
                            throw null;
                        }
                    }
                    ca4Var.b = collection.size() + ca4Var.b;
                    return true;
                }
                ca4Var.p(i);
                throw null;
            default:
                return ((ua4) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((ca4) obj).d();
                return;
            default:
                ((ua4) obj).g();
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                if (((ca4) obj2).g(obj) >= 0) {
                    return true;
                }
                return false;
            default:
                return ((ua4) obj2).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                collection.getClass();
                ca4 ca4Var = (ca4) obj;
                for (Object obj2 : collection) {
                    if (ca4Var.g(obj2) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                ua4 ua4Var = (ua4) obj;
                for (Object obj3 : collection) {
                    if (!ua4Var.h(obj3)) {
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
                uh4.a(i, this);
                return ((ca4) obj).f(i);
            default:
                va4.a(i, this);
                return ((ua4) obj).A[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                return ((ca4) obj2).g(obj);
            default:
                return ((ua4) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((ca4) obj).h();
            default:
                if (((ua4) obj).L == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new z94(0, this, 0);
            default:
                return new z94(0, this, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.A;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                ca4 ca4Var = (ca4) obj2;
                Object[] objArr = ca4Var.a;
                int i3 = ca4Var.b;
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
                ua4 ua4Var = (ua4) obj2;
                Object[] objArr2 = ua4Var.A;
                for (int i4 = ua4Var.L - 1; i4 >= 0; i4--) {
                    if (nb3.k(obj, objArr2[i4])) {
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
                return new z94(0, this, 0);
            default:
                return new z94(0, this, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                uh4.a(i, this);
                return ((ca4) obj).k(i);
            default:
                va4.a(i, this);
                return ((ua4) obj).l(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                collection.getClass();
                ca4 ca4Var = (ca4) obj;
                int i2 = ca4Var.b;
                for (Object obj2 : collection) {
                    ca4Var.j(obj2);
                }
                if (i2 != ca4Var.b) {
                    return true;
                }
                return false;
            default:
                ua4 ua4Var = (ua4) obj;
                if (!collection.isEmpty()) {
                    int i3 = ua4Var.L;
                    for (Object obj3 : collection) {
                        ua4Var.j(obj3);
                    }
                    if (i3 != ua4Var.L) {
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
                ca4 ca4Var = (ca4) obj;
                int i2 = ca4Var.b;
                Object[] objArr = ca4Var.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        ca4Var.k(i3);
                    }
                }
                if (i2 == ca4Var.b) {
                    return false;
                }
                return true;
            default:
                ua4 ua4Var = (ua4) obj;
                int i4 = ua4Var.L;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(ua4Var.A[i5])) {
                        ua4Var.l(i5);
                    }
                }
                if (i4 == ua4Var.L) {
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
                uh4.a(i, this);
                return ((ca4) obj2).n(i, obj);
            default:
                va4.a(i, this);
                Object[] objArr = ((ua4) obj2).A;
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
                return ((ca4) obj).b;
            default:
                return ((ua4) obj).L;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.A) {
            case 0:
                uh4.b(i, this, i2);
                return new ba4(this, i, i2, 0);
            default:
                va4.b(i, this, i2);
                return new ba4(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                objArr.getClass();
                return nb3.c0(this, objArr);
            default:
                return nb3.c0(this, objArr);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                return nb3.b0(this);
            default:
                return nb3.b0(this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.A) {
            case 0:
                return new z94(i, this, 0);
            default:
                return new z94(i, this, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                return ((ca4) obj2).j(obj);
            default:
                return ((ua4) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                ((ca4) obj2).a(obj);
                return true;
            default:
                ((ua4) obj2).b(obj);
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
                ca4 ca4Var = (ca4) obj;
                int i2 = ca4Var.b;
                for (Object obj2 : collection) {
                    ca4Var.a(obj2);
                }
                return i2 != ca4Var.b;
            default:
                ua4 ua4Var = (ua4) obj;
                return ua4Var.e(ua4Var.L, collection);
        }
    }
}
