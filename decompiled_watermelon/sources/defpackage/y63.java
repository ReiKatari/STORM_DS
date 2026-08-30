package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06(with = b73.class)
/* renamed from: y63  reason: default package */
/* loaded from: classes.dex */
public final class y63 extends k73 implements List<k73>, f93 {
    public static final x63 Companion = new Object();
    public final List A;

    public y63(List list) {
        list.getClass();
        this.A = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, k73 k73Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends k73> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof k73)) {
            return false;
        }
        return this.A.contains((k73) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.A.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return b53.x(this.A, obj);
    }

    @Override // java.util.List
    public final k73 get(int i) {
        return (k73) this.A.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof k73)) {
            return -1;
        }
        return this.A.indexOf((k73) obj);
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
        if (!(obj instanceof k73)) {
            return -1;
        }
        return this.A.lastIndexOf((k73) obj);
    }

    @Override // java.util.List
    public final ListIterator<k73> listIterator() {
        return this.A.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ k73 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<k73> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ k73 set(int i, k73 k73Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.A.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super k73> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<k73> subList(int i, int i2) {
        return this.A.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return b53.i0(this, objArr);
    }

    public final String toString() {
        return tq0.S0(this.A, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public final ListIterator<k73> listIterator(int i) {
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
        return b53.h0(this);
    }
}
