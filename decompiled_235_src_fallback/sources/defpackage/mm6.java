package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm6  reason: default package */
/* loaded from: classes.dex */
public final class mm6 implements android.os.Parcelable, defpackage.eq6, java.util.List, java.util.RandomAccess, defpackage.ag3 {
    public static final android.os.Parcelable.Creator<defpackage.mm6> CREATOR = null;
    public defpackage.bq6 A;

    static {
            lm6 r0 = new lm6
            r1 = 0
            r0.<init>(r1)
            defpackage.mm6.CREATOR = r0
            return
    }

    public mm6() {
            r1 = this;
            qk6 r0 = defpackage.qk6.B
            r1.<init>(r0)
            return
    }

    public mm6(defpackage.h1 r5) {
            r4 = this;
            r4.<init>()
            vl6 r0 = defpackage.bm6.j()
            bq6 r1 = new bq6
            long r2 = r0.g()
            r1.<init>(r2, r5)
            boolean r0 = r0 instanceof defpackage.os2
            if (r0 != 0) goto L1d
            bq6 r0 = new bq6
            r2 = 1
            r0.<init>(r2, r5)
            r1.b = r0
        L1d:
            r4.A = r1
            return
    }

    @Override // defpackage.eq6
    public final defpackage.hq6 a() {
            r0 = this;
            bq6 r0 = r0.A
            return r0
    }

    @Override // java.util.List
    public final void add(int r7, java.lang.Object r8) {
            r6 = this;
        L0:
            java.lang.Object r0 = defpackage.ge7.i
            monitor-enter(r0)
            bq6 r1 = r6.A     // Catch: java.lang.Throwable -> L42
            r1.getClass()     // Catch: java.lang.Throwable -> L42
            hq6 r1 = defpackage.bm6.h(r1)     // Catch: java.lang.Throwable -> L42
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L42
            int r2 = r1.d     // Catch: java.lang.Throwable -> L42
            h1 r1 = r1.c     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            r1.getClass()
            h1 r0 = r1.b(r7, r8)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L21
            goto L3e
        L21:
            bq6 r1 = r6.A
            r1.getClass()
            java.lang.Object r3 = defpackage.bm6.c
            monitor-enter(r3)
            vl6 r4 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L3f
            hq6 r1 = defpackage.bm6.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L3f
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L3f
            r5 = 1
            boolean r0 = defpackage.ge7.o(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r3)
            defpackage.bm6.n(r4, r6)
            if (r0 == 0) goto L0
        L3e:
            return
        L3f:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L42:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = defpackage.ge7.i
            monitor-enter(r0)
            bq6 r1 = r6.A     // Catch: java.lang.Throwable -> L43
            r1.getClass()     // Catch: java.lang.Throwable -> L43
            hq6 r1 = defpackage.bm6.h(r1)     // Catch: java.lang.Throwable -> L43
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L43
            int r2 = r1.d     // Catch: java.lang.Throwable -> L43
            h1 r1 = r1.c     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            r1.getClass()
            h1 r0 = r1.c(r7)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L22
            r6 = 0
            return r6
        L22:
            bq6 r1 = r6.A
            r1.getClass()
            java.lang.Object r3 = defpackage.bm6.c
            monitor-enter(r3)
            vl6 r4 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L40
            hq6 r1 = defpackage.bm6.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L40
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L40
            r5 = 1
            boolean r0 = defpackage.ge7.o(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)
            defpackage.bm6.n(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L40:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L43:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.List
    public final boolean addAll(int r2, java.util.Collection r3) {
            r1 = this;
            fp3 r0 = new fp3
            r0.<init>(r2, r3)
            boolean r1 = defpackage.ge7.M(r1, r0)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = defpackage.ge7.i
            monitor-enter(r0)
            bq6 r1 = r6.A     // Catch: java.lang.Throwable -> L43
            r1.getClass()     // Catch: java.lang.Throwable -> L43
            hq6 r1 = defpackage.bm6.h(r1)     // Catch: java.lang.Throwable -> L43
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L43
            int r2 = r1.d     // Catch: java.lang.Throwable -> L43
            h1 r1 = r1.c     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            r1.getClass()
            h1 r0 = r1.d(r7)
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L22
            r6 = 0
            return r6
        L22:
            bq6 r1 = r6.A
            r1.getClass()
            java.lang.Object r3 = defpackage.bm6.c
            monitor-enter(r3)
            vl6 r4 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L40
            hq6 r1 = defpackage.bm6.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L40
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L40
            r5 = 1
            boolean r0 = defpackage.ge7.o(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)
            defpackage.bm6.n(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L40:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L43:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    public final void c(int r7, int r8) {
            r6 = this;
        L0:
            java.lang.Object r0 = defpackage.ge7.i
            monitor-enter(r0)
            bq6 r1 = r6.A     // Catch: java.lang.Throwable -> L4d
            r1.getClass()     // Catch: java.lang.Throwable -> L4d
            hq6 r1 = defpackage.bm6.h(r1)     // Catch: java.lang.Throwable -> L4d
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.d     // Catch: java.lang.Throwable -> L4d
            h1 r1 = r1.c     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            r1.getClass()
            jw4 r0 = r1.f()
            java.util.List r3 = r0.subList(r7, r8)
            r3.clear()
            h1 r0 = r0.c()
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 != 0) goto L4c
            bq6 r1 = r6.A
            r1.getClass()
            java.lang.Object r3 = defpackage.bm6.c
            monitor-enter(r3)
            vl6 r4 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L49
            hq6 r1 = defpackage.bm6.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L49
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L49
            r5 = 1
            boolean r0 = defpackage.ge7.o(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)
            defpackage.bm6.n(r4, r6)
            if (r0 == 0) goto L0
            goto L4c
        L49:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r5 = this;
            bq6 r0 = r5.A
            r0.getClass()
            java.lang.Object r1 = defpackage.bm6.c
            monitor-enter(r1)
            vl6 r2 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L2b
            hq6 r0 = defpackage.bm6.w(r0, r5, r2)     // Catch: java.lang.Throwable -> L2b
            bq6 r0 = (defpackage.bq6) r0     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = defpackage.ge7.i     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L2b
            qk6 r4 = defpackage.qk6.B     // Catch: java.lang.Throwable -> L2d
            r0.c = r4     // Catch: java.lang.Throwable -> L2d
            int r4 = r0.d     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + 1
            r0.d = r4     // Catch: java.lang.Throwable -> L2d
            int r4 = r0.e     // Catch: java.lang.Throwable -> L2d
            int r4 = r4 + 1
            r0.e = r4     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            defpackage.bm6.n(r2, r5)
            return
        L2b:
            r5 = move-exception
            goto L30
        L2d:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r5     // Catch: java.lang.Throwable -> L2b
        L30:
            monitor-exit(r1)
            throw r5
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            bq6 r0 = defpackage.ge7.E(r0)
            h1 r0 = r0.c
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            bq6 r0 = defpackage.ge7.E(r0)
            h1 r0 = r0.c
            boolean r0 = r0.containsAll(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.eq6
    public final void f(defpackage.hq6 r2) {
            r1 = this;
            bq6 r0 = r1.A
            r2.b = r0
            bq6 r2 = (defpackage.bq6) r2
            r1.A = r2
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            bq6 r0 = defpackage.ge7.E(r0)
            h1 r0 = r0.c
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r1) {
            r0 = this;
            bq6 r0 = defpackage.ge7.E(r0)
            h1 r0 = r0.c
            int r0 = r0.indexOf(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            bq6 r0 = defpackage.ge7.E(r0)
            h1 r0 = r0.c
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r1) {
            r0 = this;
            bq6 r0 = defpackage.ge7.E(r0)
            h1 r0 = r0.c
            int r0 = r0.lastIndexOf(r1)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r2 = this;
            xx2 r0 = new xx2
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            xx2 r0 = new xx2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r8) {
            r7 = this;
            java.lang.Object r0 = r7.get(r8)
        L4:
            java.lang.Object r1 = defpackage.ge7.i
            monitor-enter(r1)
            bq6 r2 = r7.A     // Catch: java.lang.Throwable -> L46
            r2.getClass()     // Catch: java.lang.Throwable -> L46
            hq6 r2 = defpackage.bm6.h(r2)     // Catch: java.lang.Throwable -> L46
            bq6 r2 = (defpackage.bq6) r2     // Catch: java.lang.Throwable -> L46
            int r3 = r2.d     // Catch: java.lang.Throwable -> L46
            h1 r2 = r2.c     // Catch: java.lang.Throwable -> L46
            monitor-exit(r1)
            r2.getClass()
            h1 r1 = r2.h(r8)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L25
            goto L42
        L25:
            bq6 r2 = r7.A
            r2.getClass()
            java.lang.Object r4 = defpackage.bm6.c
            monitor-enter(r4)
            vl6 r5 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L43
            hq6 r2 = defpackage.bm6.w(r2, r7, r5)     // Catch: java.lang.Throwable -> L43
            bq6 r2 = (defpackage.bq6) r2     // Catch: java.lang.Throwable -> L43
            r6 = 1
            boolean r1 = defpackage.ge7.o(r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)
            defpackage.bm6.n(r5, r7)
            if (r1 == 0) goto L4
        L42:
            return r0
        L43:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L46:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = defpackage.ge7.i
            monitor-enter(r0)
            bq6 r1 = r6.A     // Catch: java.lang.Throwable -> L4c
            r1.getClass()     // Catch: java.lang.Throwable -> L4c
            hq6 r1 = defpackage.bm6.h(r1)     // Catch: java.lang.Throwable -> L4c
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L4c
            int r2 = r1.d     // Catch: java.lang.Throwable -> L4c
            h1 r1 = r1.c     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)
            r1.getClass()
            int r0 = r1.indexOf(r7)
            r3 = -1
            if (r0 == r3) goto L22
            h1 r0 = r1.h(r0)
            goto L23
        L22:
            r0 = r1
        L23:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2b
            r6 = 0
            return r6
        L2b:
            bq6 r1 = r6.A
            r1.getClass()
            java.lang.Object r3 = defpackage.bm6.c
            monitor-enter(r3)
            vl6 r4 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L49
            hq6 r1 = defpackage.bm6.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L49
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L49
            r5 = 1
            boolean r0 = defpackage.ge7.o(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)
            defpackage.bm6.n(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L49:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L4c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = defpackage.ge7.i
            monitor-enter(r0)
            bq6 r1 = r6.A     // Catch: java.lang.Throwable -> L48
            r1.getClass()     // Catch: java.lang.Throwable -> L48
            hq6 r1 = defpackage.bm6.h(r1)     // Catch: java.lang.Throwable -> L48
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L48
            int r2 = r1.d     // Catch: java.lang.Throwable -> L48
            h1 r1 = r1.c     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)
            r1.getClass()
            g1 r0 = new g1
            r3 = 0
            r0.<init>(r3, r7)
            h1 r0 = r1.g(r0)
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L27
            return r3
        L27:
            bq6 r1 = r6.A
            r1.getClass()
            java.lang.Object r3 = defpackage.bm6.c
            monitor-enter(r3)
            vl6 r4 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L45
            hq6 r1 = defpackage.bm6.w(r1, r6, r4)     // Catch: java.lang.Throwable -> L45
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L45
            r5 = 1
            boolean r0 = defpackage.ge7.o(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r3)
            defpackage.bm6.n(r4, r6)
            if (r0 == 0) goto L0
            return r5
        L45:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L48:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r3) {
            r2 = this;
            g1 r0 = new g1
            r1 = 2
            r0.<init>(r1, r3)
            boolean r2 = defpackage.ge7.M(r2, r0)
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object set(int r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Object r0 = r7.get(r8)
        L4:
            java.lang.Object r1 = defpackage.ge7.i
            monitor-enter(r1)
            bq6 r2 = r7.A     // Catch: java.lang.Throwable -> L46
            r2.getClass()     // Catch: java.lang.Throwable -> L46
            hq6 r2 = defpackage.bm6.h(r2)     // Catch: java.lang.Throwable -> L46
            bq6 r2 = (defpackage.bq6) r2     // Catch: java.lang.Throwable -> L46
            int r3 = r2.d     // Catch: java.lang.Throwable -> L46
            h1 r2 = r2.c     // Catch: java.lang.Throwable -> L46
            monitor-exit(r1)
            r2.getClass()
            h1 r1 = r2.i(r8, r9)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L25
            goto L42
        L25:
            bq6 r2 = r7.A
            r2.getClass()
            java.lang.Object r4 = defpackage.bm6.c
            monitor-enter(r4)
            vl6 r5 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L43
            hq6 r2 = defpackage.bm6.w(r2, r7, r5)     // Catch: java.lang.Throwable -> L43
            bq6 r2 = (defpackage.bq6) r2     // Catch: java.lang.Throwable -> L43
            r6 = 0
            boolean r1 = defpackage.ge7.o(r2, r3, r1, r6)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)
            defpackage.bm6.n(r5, r7)
            if (r1 == 0) goto L4
        L42:
            return r0
        L43:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L46:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r0 = this;
            bq6 r0 = defpackage.ge7.E(r0)
            h1 r0 = r0.c
            int r0 = r0.a()
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto Lc
            if (r2 > r3) goto Lc
            int r0 = r1.size()
            if (r3 > r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L14
            java.lang.String r0 = "fromIndex or toIndex are out of bounds"
            defpackage.r05.a(r0)
        L14:
            ht6 r0 = new ht6
            r0.<init>(r1, r2, r3)
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

    public final java.lang.String toString() {
            r3 = this;
            bq6 r0 = r3.A
            r0.getClass()
            hq6 r0 = defpackage.bm6.h(r0)
            bq6 r0 = (defpackage.bq6) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SnapshotStateList(value="
            r1.<init>(r2)
            h1 r0 = r0.c
            r1.append(r0)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r3 = r3.hashCode()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            bq6 r2 = defpackage.ge7.E(r2)
            h1 r2 = r2.c
            int r4 = r2.a()
            r3.writeInt(r4)
            r0 = 0
        Le:
            if (r0 >= r4) goto L1a
            java.lang.Object r1 = r2.get(r0)
            r3.writeValue(r1)
            int r0 = r0 + 1
            goto Le
        L1a:
            return
    }
}
