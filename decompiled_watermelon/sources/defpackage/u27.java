package defpackage;

import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u27  reason: default package */
/* loaded from: classes.dex */
public final class u27 implements ListIterator {
    public ListIterator A;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.A.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.A.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.A.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
