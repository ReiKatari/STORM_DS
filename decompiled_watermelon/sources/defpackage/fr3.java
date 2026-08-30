package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fr3  reason: default package */
/* loaded from: classes.dex */
public final class fr3 implements Collection, f93 {
    public static final fr3 L = new fr3(pp1.A);
    public final List A;
    public final int B;

    public fr3(List list) {
        this.A = list;
        this.B = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof er3)) {
            return false;
        }
        return this.A.contains((er3) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.A.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fr3) {
                if (!this.A.equals(((fr3) obj).A)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.A.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.B;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return b53.h0(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.A + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return b53.i0(this, objArr);
    }
}
