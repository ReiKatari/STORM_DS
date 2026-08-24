package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z94  reason: default package */
/* loaded from: classes.dex */
public final class z94 implements java.util.ListIterator, defpackage.zf3 {
    public final /* synthetic */ int A;
    public final java.util.List B;
    public int L;

    public z94(int r1, java.util.List r2, int r3) {
            r0 = this;
            r0.A = r3
            switch(r3) {
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r0.B = r2
            int r1 = r1 + (-1)
            r0.L = r1
            return
        Lf:
            r0.<init>()
            r0.B = r2
            r0.L = r1
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            java.util.List r1 = r2.B
            switch(r0) {
                case 0: goto L13;
                default: goto L7;
            }
        L7:
            int r0 = r2.L
            r1.add(r0, r3)
            int r3 = r2.L
            int r3 = r3 + 1
            r2.L = r3
            return
        L13:
            int r0 = r2.L
            int r0 = r0 + 1
            r2.L = r0
            r1.add(r0, r3)
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            r2 = 1
            java.util.List r3 = r4.B
            switch(r0) {
                case 0: goto L13;
                default: goto L9;
            }
        L9:
            int r4 = r4.L
            int r0 = r3.size()
            if (r4 >= r0) goto L12
            r1 = r2
        L12:
            return r1
        L13:
            int r4 = r4.L
            int r0 = r3.size()
            int r0 = r0 - r2
            if (r4 >= r0) goto L1d
            r1 = r2
        L1d:
            return r1
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            int r1 = r1.L
            if (r1 <= 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
        Ld:
            int r1 = r1.L
            if (r1 < 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.A
            java.util.List r1 = r3.B
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            int r0 = r3.L
            int r2 = r0 + 1
            r3.L = r2
            java.lang.Object r3 = r1.get(r0)
            return r3
        L12:
            int r0 = r3.L
            int r0 = r0 + 1
            r3.L = r0
            java.lang.Object r3 = r1.get(r0)
            return r3
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r1 = r1.L
            return r1
        L8:
            int r1 = r1.L
            int r1 = r1 + 1
            return r1
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            int r0 = r3.A
            java.util.List r1 = r3.B
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            int r0 = r3.L
            int r0 = r0 + (-1)
            r3.L = r0
            java.lang.Object r3 = r1.get(r0)
            return r3
        L12:
            int r0 = r3.L
            int r2 = r0 + (-1)
            r3.L = r2
            java.lang.Object r3 = r1.get(r0)
            return r3
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r1.L
            int r1 = r1 + (-1)
            return r1
        La:
            int r1 = r1.L
            return r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.A
            java.util.List r1 = r2.B
            switch(r0) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            int r0 = r2.L
            int r0 = r0 + (-1)
            r2.L = r0
            r1.remove(r0)
            return
        L11:
            int r0 = r2.L
            r1.remove(r0)
            int r0 = r2.L
            int r0 = r0 + (-1)
            r2.L = r0
            return
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            java.util.List r1 = r2.B
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            int r2 = r2.L
            r1.set(r2, r3)
            return
        Ld:
            int r2 = r2.L
            r1.set(r2, r3)
            return
    }
}
