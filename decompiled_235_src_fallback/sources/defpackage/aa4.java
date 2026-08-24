package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa4  reason: default package */
/* loaded from: classes.dex */
public final class aa4 implements java.util.List, defpackage.ag3 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public /* synthetic */ aa4(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.util.List
    public final void add(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.A
            java.lang.Object r3 = r3.B
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            ua4 r3 = (defpackage.ua4) r3
            r3.a(r4, r5)
            return
        Ld:
            ca4 r3 = (defpackage.ca4) r3
            if (r4 < 0) goto L33
            int r0 = r3.b
            if (r4 > r0) goto L33
            int r0 = r0 + 1
            java.lang.Object[] r1 = r3.a
            int r2 = r1.length
            if (r2 >= r0) goto L1f
            r3.m(r0, r1)
        L1f:
            java.lang.Object[] r0 = r3.a
            int r1 = r3.b
            if (r4 == r1) goto L2a
            int r2 = r4 + 1
            defpackage.fv.t0(r0, r0, r2, r4, r1)
        L2a:
            r0[r4] = r5
            int r4 = r3.b
            int r4 = r4 + 1
            r3.b = r4
            return
        L33:
            r3.p(r4)
            r3 = 0
            throw r3
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            r1 = 1
            java.lang.Object r2 = r2.B
            switch(r0) {
                case 0: goto Le;
                default: goto L8;
            }
        L8:
            ua4 r2 = (defpackage.ua4) r2
            r2.b(r3)
            return r1
        Le:
            ca4 r2 = (defpackage.ca4) r2
            r2.a(r3)
            return r1
    }

    @Override // java.util.List
    public final boolean addAll(int r7, java.util.Collection r8) {
            r6 = this;
            int r0 = r6.A
            java.lang.Object r6 = r6.B
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            ua4 r6 = (defpackage.ua4) r6
            boolean r6 = r6.e(r7, r8)
            return r6
        Le:
            r8.getClass()
            ca4 r6 = (defpackage.ca4) r6
            r0 = 0
            if (r7 < 0) goto L6a
            int r1 = r6.b
            if (r7 > r1) goto L6a
            boolean r1 = r8.isEmpty()
            r2 = 0
            if (r1 == 0) goto L22
            goto L69
        L22:
            int r1 = r6.b
            int r3 = r8.size()
            int r3 = r3 + r1
            java.lang.Object[] r1 = r6.a
            int r4 = r1.length
            if (r4 >= r3) goto L31
            r6.m(r3, r1)
        L31:
            java.lang.Object[] r1 = r6.a
            int r3 = r6.b
            if (r7 == r3) goto L41
            int r3 = r8.size()
            int r3 = r3 + r7
            int r4 = r6.b
            defpackage.fv.t0(r1, r1, r3, r7, r4)
        L41:
            r3 = r8
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L48:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r3.next()
            int r5 = r2 + 1
            if (r2 < 0) goto L5b
            int r2 = r2 + r7
            r1[r2] = r4
            r2 = r5
            goto L48
        L5b:
            defpackage.hf.q0()
            throw r0
        L5f:
            int r7 = r6.b
            int r8 = r8.size()
            int r8 = r8 + r7
            r6.b = r8
            r2 = 1
        L69:
            return r2
        L6a:
            r6.p(r7)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r2 = r2.B
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            ua4 r2 = (defpackage.ua4) r2
            int r0 = r2.L
            boolean r2 = r2.e(r0, r3)
            return r2
        L10:
            r3.getClass()
            ca4 r2 = (defpackage.ca4) r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r0 = r2.b
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            r2.a(r1)
            goto L1d
        L2b:
            int r2 = r2.b
            if (r0 == r2) goto L31
            r2 = 1
            goto L32
        L31:
            r2 = 0
        L32:
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            ua4 r1 = (defpackage.ua4) r1
            r1.g()
            return
        Ld:
            ca4 r1 = (defpackage.ca4) r1
            r1.d()
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            ua4 r1 = (defpackage.ua4) r1
            boolean r1 = r1.h(r2)
            return r1
        Le:
            ca4 r1 = (defpackage.ca4) r1
            int r1 = r1.g(r2)
            if (r1 < 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r4) {
            r3 = this;
            int r0 = r3.A
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r3.B
            switch(r0) {
                case 0: goto L23;
                default: goto L9;
            }
        L9:
            ua4 r3 = (defpackage.ua4) r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r4.next()
            boolean r0 = r3.h(r0)
            if (r0 != 0) goto L11
            r1 = r2
        L22:
            return r1
        L23:
            r4.getClass()
            ca4 r3 = (defpackage.ca4) r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L2e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            int r0 = r3.g(r0)
            if (r0 < 0) goto L3f
            goto L2e
        L3f:
            r1 = r2
        L40:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r1 = r2.B
            switch(r0) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            defpackage.va4.a(r3, r2)
            ua4 r1 = (defpackage.ua4) r1
            java.lang.Object[] r2 = r1.A
            r2 = r2[r3]
            return r2
        L11:
            defpackage.uh4.a(r3, r2)
            ca4 r1 = (defpackage.ca4) r1
            java.lang.Object r2 = r1.f(r3)
            return r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            ua4 r1 = (defpackage.ua4) r1
            int r1 = r1.i(r2)
            return r1
        Le:
            ca4 r1 = (defpackage.ca4) r1
            int r1 = r1.g(r2)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            ua4 r1 = (defpackage.ua4) r1
            int r1 = r1.L
            if (r1 != 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
        L11:
            ca4 r1 = (defpackage.ca4) r1
            boolean r1 = r1.h()
            return r1
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            z94 r0 = new z94
            r1 = 0
            r2 = 1
            r0.<init>(r1, r3, r2)
            return r0
        Ld:
            z94 r0 = new z94
            r1 = 0
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.A
            r1 = -1
            java.lang.Object r3 = r3.B
            switch(r0) {
                case 0: goto L20;
                default: goto L8;
            }
        L8:
            ua4 r3 = (defpackage.ua4) r3
            int r0 = r3.L
            int r0 = r0 + (-1)
            java.lang.Object[] r3 = r3.A
        L10:
            if (r0 < 0) goto L1f
            r2 = r3[r0]
            boolean r2 = defpackage.nb3.k(r4, r2)
            if (r2 == 0) goto L1c
            r1 = r0
            goto L1f
        L1c:
            int r0 = r0 + (-1)
            goto L10
        L1f:
            return r1
        L20:
            ca4 r3 = (defpackage.ca4) r3
            java.lang.Object[] r0 = r3.a
            int r3 = r3.b
            if (r4 != 0) goto L35
            int r3 = r3 + (-1)
        L2a:
            if (r1 >= r3) goto L45
            r4 = r0[r3]
            if (r4 != 0) goto L32
        L30:
            r1 = r3
            goto L45
        L32:
            int r3 = r3 + (-1)
            goto L2a
        L35:
            int r3 = r3 + (-1)
        L37:
            if (r1 >= r3) goto L45
            r2 = r0[r3]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L42
            goto L30
        L42:
            int r3 = r3 + (-1)
            goto L37
        L45:
            return r1
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            z94 r0 = new z94
            r1 = 0
            r2 = 1
            r0.<init>(r1, r3, r2)
            return r0
        Ld:
            z94 r0 = new z94
            r1 = 0
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            z94 r0 = new z94
            r1 = 1
            r0.<init>(r3, r2, r1)
            return r0
        Lc:
            z94 r0 = new z94
            r1 = 0
            r0.<init>(r3, r2, r1)
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r3) {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r1 = r2.B
            switch(r0) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            defpackage.va4.a(r3, r2)
            ua4 r1 = (defpackage.ua4) r1
            java.lang.Object r2 = r1.l(r3)
            return r2
        L11:
            defpackage.uh4.a(r3, r2)
            ca4 r1 = (defpackage.ca4) r1
            java.lang.Object r2 = r1.k(r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            ua4 r1 = (defpackage.ua4) r1
            boolean r1 = r1.j(r2)
            return r1
        Le:
            ca4 r1 = (defpackage.ca4) r1
            boolean r1 = r1.j(r2)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.A
            r1 = 1
            r2 = 0
            java.lang.Object r4 = r4.B
            switch(r0) {
                case 0: goto L2f;
                default: goto L9;
            }
        L9:
            ua4 r4 = (defpackage.ua4) r4
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L12
            goto L2d
        L12:
            int r0 = r4.L
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L1a:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L28
            java.lang.Object r3 = r5.next()
            r4.j(r3)
            goto L1a
        L28:
            int r4 = r4.L
            if (r0 == r4) goto L2d
            goto L2e
        L2d:
            r1 = r2
        L2e:
            return r1
        L2f:
            r5.getClass()
            ca4 r4 = (defpackage.ca4) r4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            int r0 = r4.b
            java.util.Iterator r5 = r5.iterator()
        L3c:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r5.next()
            r4.j(r3)
            goto L3c
        L4a:
            int r4 = r4.b
            if (r0 == r4) goto L4f
            goto L50
        L4f:
            r1 = r2
        L50:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r8) {
            r7 = this;
            int r0 = r7.A
            r1 = 0
            r2 = 1
            r3 = -1
            java.lang.Object r7 = r7.B
            switch(r0) {
                case 0: goto L28;
                default: goto La;
            }
        La:
            ua4 r7 = (defpackage.ua4) r7
            int r0 = r7.L
            int r4 = r0 + (-1)
        L10:
            if (r3 >= r4) goto L22
            java.lang.Object[] r5 = r7.A
            r5 = r5[r4]
            boolean r5 = r8.contains(r5)
            if (r5 != 0) goto L1f
            r7.l(r4)
        L1f:
            int r4 = r4 + (-1)
            goto L10
        L22:
            int r7 = r7.L
            if (r0 == r7) goto L27
            r1 = r2
        L27:
            return r1
        L28:
            r8.getClass()
            ca4 r7 = (defpackage.ca4) r7
            int r0 = r7.b
            java.lang.Object[] r4 = r7.a
            int r5 = r0 + (-1)
        L33:
            if (r3 >= r5) goto L43
            r6 = r4[r5]
            boolean r6 = r8.contains(r6)
            if (r6 != 0) goto L40
            r7.k(r5)
        L40:
            int r5 = r5 + (-1)
            goto L33
        L43:
            int r7 = r7.b
            if (r0 == r7) goto L48
            r1 = r2
        L48:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r1 = r2.B
            switch(r0) {
                case 0: goto L13;
                default: goto L7;
            }
        L7:
            defpackage.va4.a(r3, r2)
            ua4 r1 = (defpackage.ua4) r1
            java.lang.Object[] r2 = r1.A
            r0 = r2[r3]
            r2[r3] = r4
            return r0
        L13:
            defpackage.uh4.a(r3, r2)
            ca4 r1 = (defpackage.ca4) r1
            java.lang.Object r2 = r1.n(r3, r4)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            ua4 r1 = (defpackage.ua4) r1
            int r1 = r1.L
            return r1
        Lc:
            ca4 r1 = (defpackage.ca4) r1
            int r1 = r1.b
            return r1
    }

    @Override // java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            defpackage.va4.b(r3, r2, r4)
            ba4 r0 = new ba4
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            return r0
        Lf:
            defpackage.uh4.b(r3, r2, r4)
            ba4 r0 = new ba4
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object[] r1 = defpackage.nb3.b0(r1)
            return r1
        La:
            java.lang.Object[] r1 = defpackage.nb3.b0(r1)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object[] r1 = defpackage.nb3.c0(r1, r2)
            return r1
        La:
            r2.getClass()
            java.lang.Object[] r1 = defpackage.nb3.c0(r1, r2)
            return r1
    }
}
