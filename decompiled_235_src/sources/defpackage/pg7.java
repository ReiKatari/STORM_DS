package defpackage;

import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pg7  reason: default package */
/* loaded from: classes.dex */
public final class pg7 implements ListIterator {
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
