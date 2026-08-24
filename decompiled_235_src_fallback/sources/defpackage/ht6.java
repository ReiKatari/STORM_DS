package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ht6  reason: default package */
/* loaded from: classes.dex */
public final class ht6 implements java.util.List, defpackage.ag3 {
    public final defpackage.mm6 A;
    public final int B;
    public int L;
    public int R;

    public ht6(defpackage.mm6 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            int r1 = defpackage.ge7.F(r1)
            r0.L = r1
            int r3 = r3 - r2
            r0.R = r3
            return
    }

    public final void a() {
            r1 = this;
            mm6 r0 = r1.A
            int r0 = defpackage.ge7.F(r0)
            int r1 = r1.L
            if (r0 != r1) goto Lb
            return
        Lb:
            defpackage.i.l()
            return
    }

    @Override // java.util.List
    public final void add(int r2, java.lang.Object r3) {
            r1 = this;
            r1.a()
            int r0 = r1.B
            int r0 = r0 + r2
            mm6 r2 = r1.A
            r2.add(r0, r3)
            int r3 = r1.R
            int r3 = r3 + 1
            r1.R = r3
            int r2 = defpackage.ge7.F(r2)
            r1.L = r2
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            r2.a()
            int r0 = r2.B
            int r1 = r2.R
            int r0 = r0 + r1
            mm6 r1 = r2.A
            r1.add(r0, r3)
            int r3 = r2.R
            r0 = 1
            int r3 = r3 + r0
            r2.R = r3
            int r3 = defpackage.ge7.F(r1)
            r2.L = r3
            return r0
    }

    @Override // java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r2.a()
            int r0 = r2.B
            int r3 = r3 + r0
            mm6 r0 = r2.A
            boolean r3 = r0.addAll(r3, r4)
            if (r3 == 0) goto L1d
            int r1 = r2.R
            int r4 = r4.size()
            int r4 = r4 + r1
            r2.R = r4
            int r4 = defpackage.ge7.F(r0)
            r2.L = r4
        L1d:
            return r3
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.R
            boolean r1 = r1.addAll(r0, r2)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r3 = this;
            int r0 = r3.R
            if (r0 <= 0) goto L1a
            r3.a()
            int r0 = r3.R
            int r1 = r3.B
            int r0 = r0 + r1
            mm6 r2 = r3.A
            r2.c(r1, r0)
            r0 = 0
            r3.R = r0
            int r0 = defpackage.ge7.F(r2)
            r3.L = r0
        L1a:
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L11
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L15
            r2 = 0
            return r2
        L27:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            r1.a()
            int r0 = r1.R
            defpackage.ge7.m(r2, r0)
            int r0 = r1.B
            int r0 = r0 + r2
            mm6 r1 = r1.A
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            r4.a()
            int r0 = r4.R
            int r1 = r4.B
            int r0 = r0 + r1
            l93 r0 = defpackage.gi2.R(r1, r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            r2 = r0
            k93 r2 = (defpackage.k93) r2
            boolean r2 = r2.L
            if (r2 == 0) goto L2c
            r2 = r0
            e93 r2 = (defpackage.e93) r2
            int r2 = r2.nextInt()
            mm6 r3 = r4.A
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = defpackage.nb3.k(r5, r3)
            if (r3 == 0) goto L10
            int r2 = r2 - r1
            return r2
        L2c:
            r4 = -1
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.R
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r3.a()
            int r0 = r3.R
            int r1 = r3.B
            int r0 = r0 + r1
            int r0 = r0 + (-1)
        La:
            if (r0 < r1) goto L1d
            mm6 r2 = r3.A
            java.lang.Object r2 = r2.get(r0)
            boolean r2 = defpackage.nb3.k(r4, r2)
            if (r2 == 0) goto L1a
            int r0 = r0 - r1
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto La
        L1d:
            r3 = -1
            return r3
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            r1.a()
            bh5 r0 = new bh5
            r0.<init>()
            int r2 = r2 + (-1)
            r0.A = r2
            qp5 r2 = new qp5
            r2.<init>(r0, r1)
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r3) {
            r2 = this;
            r2.a()
            int r0 = r2.B
            int r0 = r0 + r3
            mm6 r3 = r2.A
            java.lang.Object r0 = r3.remove(r0)
            int r1 = r2.R
            int r1 = r1 + (-1)
            r2.R = r1
            int r3 = defpackage.ge7.F(r3)
            r2.L = r3
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lb
            r0.remove(r1)
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L5:
            r1 = r0
        L6:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r4.next()
            boolean r2 = r3.remove(r2)
            if (r2 != 0) goto L18
            if (r1 == 0) goto L5
        L18:
            r1 = 1
            goto L6
        L1a:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r11) {
            r10 = this;
            r10.a()
            mm6 r0 = r10.A
            int r1 = r10.B
            int r2 = r10.R
            int r2 = r2 + r1
            int r3 = r0.size()
        Le:
            java.lang.Object r4 = defpackage.ge7.i
            monitor-enter(r4)
            bq6 r5 = r0.A     // Catch: java.lang.Throwable -> L73
            r5.getClass()     // Catch: java.lang.Throwable -> L73
            hq6 r5 = defpackage.bm6.h(r5)     // Catch: java.lang.Throwable -> L73
            bq6 r5 = (defpackage.bq6) r5     // Catch: java.lang.Throwable -> L73
            int r6 = r5.d     // Catch: java.lang.Throwable -> L73
            h1 r5 = r5.c     // Catch: java.lang.Throwable -> L73
            monitor-exit(r4)
            r5.getClass()
            jw4 r4 = r5.f()
            java.util.List r7 = r4.subList(r1, r2)
            r7.retainAll(r11)
            h1 r4 = r4.c()
            boolean r5 = defpackage.nb3.k(r4, r5)
            r7 = 1
            if (r5 != 0) goto L5a
            bq6 r5 = r0.A
            r5.getClass()
            java.lang.Object r8 = defpackage.bm6.c
            monitor-enter(r8)
            vl6 r9 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L57
            hq6 r5 = defpackage.bm6.w(r5, r0, r9)     // Catch: java.lang.Throwable -> L57
            bq6 r5 = (defpackage.bq6) r5     // Catch: java.lang.Throwable -> L57
            boolean r4 = defpackage.ge7.o(r5, r6, r4, r7)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r8)
            defpackage.bm6.n(r9, r0)
            if (r4 == 0) goto Le
            goto L5a
        L57:
            r10 = move-exception
            monitor-exit(r8)
            throw r10
        L5a:
            int r11 = r0.size()
            int r3 = r3 - r11
            if (r3 <= 0) goto L6e
            mm6 r11 = r10.A
            int r11 = defpackage.ge7.F(r11)
            r10.L = r11
            int r11 = r10.R
            int r11 = r11 - r3
            r10.R = r11
        L6e:
            if (r3 <= 0) goto L71
            return r7
        L71:
            r10 = 0
            return r10
        L73:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
    }

    @Override // java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.R
            defpackage.ge7.m(r2, r0)
            r1.a()
            int r0 = r1.B
            int r2 = r2 + r0
            mm6 r0 = r1.A
            java.lang.Object r2 = r0.set(r2, r3)
            int r3 = defpackage.ge7.F(r0)
            r1.L = r3
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r0 = this;
            int r0 = r0.R
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L9
            if (r3 > r4) goto L9
            int r0 = r2.R
            if (r4 > r0) goto L9
            goto Le
        L9:
            java.lang.String r0 = "fromIndex or toIndex are out of bounds"
            defpackage.r05.a(r0)
        Le:
            r2.a()
            ht6 r0 = new ht6
            int r1 = r2.B
            int r3 = r3 + r1
            int r4 = r4 + r1
            mm6 r2 = r2.A
            r0.<init>(r2, r3, r4)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = defpackage.nb3.b0(r0)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r0 = defpackage.nb3.c0(r0, r1)
            return r0
    }
}
