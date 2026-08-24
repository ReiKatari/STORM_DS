package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qp5  reason: default package */
/* loaded from: classes.dex */
public final class qp5 implements java.util.ListIterator, defpackage.zf3 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public qp5(defpackage.bh5 r2, defpackage.ht6 r3) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public qp5(defpackage.l14 r2, int r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.L = r2
            java.lang.Object r0 = r2.B
            java.util.List r0 = (java.util.List) r0
            int r2 = defpackage.gt0.z0(r3, r2)
            java.util.ListIterator r2 = r0.listIterator(r2)
            r1.B = r2
            return
    }

    public qp5(defpackage.rp5 r2, int r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            java.util.ArrayList r0 = r2.A
            int r2 = defpackage.gt0.z0(r3, r2)
            java.util.ListIterator r2 = r0.listIterator(r2)
            r1.B = r2
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot modify a state list through an iterator"
            r1.<init>(r2)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
        L15:
            java.lang.Object r1 = r1.B
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            r1.add(r2)
            r1.previous()
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r1 = r2.B
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L18;
                default: goto L7;
            }
        L7:
            bh5 r1 = (defpackage.bh5) r1
            int r0 = r1.A
            java.lang.Object r2 = r2.L
            ht6 r2 = (defpackage.ht6) r2
            int r2 = r2.R
            r1 = 1
            int r2 = r2 - r1
            if (r0 >= r2) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
        L18:
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            boolean r2 = r1.hasPrevious()
            return r2
        L1f:
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            boolean r2 = r1.hasPrevious()
            return r2
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto L18;
                case 1: goto L11;
                default: goto L7;
            }
        L7:
            bh5 r1 = (defpackage.bh5) r1
            int r1 = r1.A
            if (r1 < 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
        L11:
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            boolean r1 = r1.hasNext()
            return r1
        L18:
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            boolean r1 = r1.hasNext()
            return r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.A
            java.lang.Object r1 = r3.B
            switch(r0) {
                case 0: goto L24;
                case 1: goto L1d;
                default: goto L7;
            }
        L7:
            bh5 r1 = (defpackage.bh5) r1
            int r0 = r1.A
            int r0 = r0 + 1
            java.lang.Object r3 = r3.L
            ht6 r3 = (defpackage.ht6) r3
            int r2 = r3.R
            defpackage.ge7.m(r0, r2)
            r1.A = r0
            java.lang.Object r3 = r3.get(r0)
            return r3
        L1d:
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            java.lang.Object r3 = r1.previous()
            return r3
        L24:
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            java.lang.Object r3 = r1.previous()
            return r3
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r1 = r2.L
            java.lang.Object r2 = r2.B
            switch(r0) {
                case 0: goto L20;
                case 1: goto L10;
                default: goto L9;
            }
        L9:
            bh5 r2 = (defpackage.bh5) r2
            int r2 = r2.A
            int r2 = r2 + 1
            return r2
        L10:
            l14 r1 = (defpackage.l14) r1
            java.util.ListIterator r2 = (java.util.ListIterator) r2
            int r2 = r2.previousIndex()
            int r0 = r1.size()
        L1c:
            int r0 = r0 + (-1)
            int r0 = r0 - r2
            return r0
        L20:
            rp5 r1 = (defpackage.rp5) r1
            java.util.ListIterator r2 = (java.util.ListIterator) r2
            int r2 = r2.previousIndex()
            int r0 = r1.size()
            goto L1c
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            int r0 = r3.A
            java.lang.Object r1 = r3.B
            switch(r0) {
                case 0: goto L24;
                case 1: goto L1d;
                default: goto L7;
            }
        L7:
            bh5 r1 = (defpackage.bh5) r1
            int r0 = r1.A
            java.lang.Object r3 = r3.L
            ht6 r3 = (defpackage.ht6) r3
            int r2 = r3.R
            defpackage.ge7.m(r0, r2)
            int r2 = r0 + (-1)
            r1.A = r2
            java.lang.Object r3 = r3.get(r0)
            return r3
        L1d:
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            java.lang.Object r3 = r1.next()
            return r3
        L24:
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            java.lang.Object r3 = r1.next()
            return r3
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r1 = r2.L
            java.lang.Object r2 = r2.B
            switch(r0) {
                case 0: goto L1e;
                case 1: goto Le;
                default: goto L9;
            }
        L9:
            bh5 r2 = (defpackage.bh5) r2
            int r2 = r2.A
            return r2
        Le:
            l14 r1 = (defpackage.l14) r1
            java.util.ListIterator r2 = (java.util.ListIterator) r2
            int r2 = r2.nextIndex()
            int r0 = r1.size()
        L1a:
            int r0 = r0 + (-1)
            int r0 = r0 - r2
            return r0
        L1e:
            rp5 r1 = (defpackage.rp5) r1
            java.util.ListIterator r2 = (java.util.ListIterator) r2
            int r2 = r2.nextIndex()
            int r0 = r1.size()
            goto L1a
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot modify a state list through an iterator"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        L15:
            java.lang.Object r1 = r1.B
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            r1.remove()
            return
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot modify a state list through an iterator"
            r1.<init>(r2)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
        L15:
            java.lang.Object r1 = r1.B
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            r1.set(r2)
            return
    }
}
