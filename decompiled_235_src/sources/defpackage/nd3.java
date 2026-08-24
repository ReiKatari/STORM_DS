package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6(with = qd3.class)
/* renamed from: nd3  reason: default package */
/* loaded from: classes.dex */
public final class nd3 extends de3 implements List<de3>, zf3 {
    public static final md3 Companion = new Object();
    public final List A;

    public nd3(List list) {
        list.getClass();
        this.A = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, de3 de3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends de3> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof de3)) {
            return false;
        }
        return this.A.contains((de3) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.A.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return nb3.k(this.A, obj);
    }

    @Override // java.util.List
    public final de3 get(int i) {
        return (de3) this.A.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof de3)) {
            return -1;
        }
        return this.A.indexOf((de3) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.A.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof de3)) {
            return -1;
        }
        return this.A.lastIndexOf((de3) obj);
    }

    @Override // java.util.List
    public final ListIterator<de3> listIterator() {
        return this.A.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ de3 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<de3> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ de3 set(int i, de3 de3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.A.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super de3> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<de3> subList(int i, int i2) {
        return this.A.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return nb3.c0(this, objArr);
    }

    public final String toString() {
        return gt0.P0(this.A, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public final ListIterator<de3> listIterator(int i) {
        return this.A.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return nb3.b0(this);
    }
}
