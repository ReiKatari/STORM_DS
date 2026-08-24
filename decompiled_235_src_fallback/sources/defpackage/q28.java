package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q28  reason: default package */
/* loaded from: classes.dex */
public final class q28 implements java.util.ListIterator, java.util.Iterator {
    public final int A;
    public int B;
    public final defpackage.s28 L;

    public q28(defpackage.s28 r2, int r3) {
            r1 = this;
            int r0 = r2.size()
            r1.<init>()
            defpackage.su7.c(r3, r0)
            r1.A = r0
            r1.B = r3
            r1.L = r2
            return
    }

    public final java.lang.Object a(int r1) {
            r0 = this;
            s28 r0 = r0.L
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.B
            int r1 = r1.A
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r0 = this;
            int r0 = r0.B
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L11
            int r0 = r2.B
            int r1 = r0 + 1
            r2.B = r1
            java.lang.Object r2 = r2.a(r0)
            return r2
        L11:
            defpackage.fa6.c()
            r2 = 0
            return r2
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L11
            int r0 = r1.B
            int r0 = r0 + (-1)
            r1.B = r0
            java.lang.Object r1 = r1.a(r0)
            return r1
        L11:
            defpackage.fa6.c()
            r1 = 0
            return r1
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r0 = this;
            int r0 = r0.B
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
