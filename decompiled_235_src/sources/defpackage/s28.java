package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s28  reason: default package */
/* loaded from: classes.dex */
public abstract class s28 extends p28 implements List, RandomAccess {
    public static final q28 B = new q28(t28.X, 0);

    public static t28 h(int i, Object[] objArr) {
        if (i == 0) {
            return t28.X;
        }
        return new t28(objArr, i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q, java.lang.Object] */
    public static s28 i(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return j((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return t28.X;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            kt7.b(1, objArr);
            return h(1, objArr);
        }
        ?? obj = new Object();
        obj.c = new Object[4];
        obj.a = 0;
        obj.d(next);
        while (it.hasNext()) {
            obj.d(it.next());
        }
        obj.b = true;
        return h(obj.a, (Object[]) obj.c);
    }

    public static s28 j(Collection collection) {
        if (collection instanceof p28) {
            s28 s28Var = (s28) ((p28) collection);
            if (s28Var.d()) {
                Object[] array = s28Var.toArray(p28.A);
                return h(array.length, array);
            }
            return s28Var;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        kt7.b(length, array2);
        return h(length, array2);
    }

    @Override // defpackage.p28
    public int a(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i = 0; i < size; i++) {
                            Object obj2 = get(i);
                            Object obj3 = list.get(i);
                            if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            }
                        }
                        return true;
                    }
                    q28 listIterator = listIterator(0);
                    Iterator it = list.iterator();
                    while (true) {
                        if (listIterator.hasNext()) {
                            if (!it.hasNext() || ((next = listIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.List
    /* renamed from: g */
    public s28 subList(int i, int i2) {
        su7.d(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return t28.X;
        }
        return new r28(this, i, i3);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l */
    public final q28 listIterator(int i) {
        su7.c(i, size());
        if (isEmpty()) {
            return B;
        }
        return new q28(this, i);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
