package defpackage;

import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q28  reason: default package */
/* loaded from: classes.dex */
public final class q28 implements ListIterator, Iterator {
    public final int A;
    public int B;
    public final s28 L;

    public q28(s28 s28Var, int i) {
        int size = s28Var.size();
        su7.c(i, size);
        this.A = size;
        this.B = i;
        this.L = s28Var;
    }

    public final Object a(int i) {
        return this.L.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.B < this.A) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.B > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i = this.B;
            this.B = i + 1;
            return a(i);
        }
        fa6.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.B;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.B - 1;
            this.B = i;
            return a(i);
        }
        fa6.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.B - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
