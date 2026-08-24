package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ba4  reason: default package */
/* loaded from: classes.dex */
public final class ba4 implements java.util.List, defpackage.ag3 {
    public final /* synthetic */ int A;
    public final java.util.List B;
    public final int L;
    public int R;

    public /* synthetic */ ba4(java.util.List r1, int r2, int r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // java.util.List
    public final void add(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.A
            int r1 = r3.L
            java.util.List r2 = r3.B
            switch(r0) {
                case 0: goto L14;
                default: goto L9;
            }
        L9:
            int r4 = r4 + r1
            r2.add(r4, r5)
            int r4 = r3.R
            int r4 = r4 + 1
            r3.R = r4
            return
        L14:
            int r4 = r4 + r1
            r2.add(r4, r5)
            int r4 = r3.R
            int r4 = r4 + 1
            r3.R = r4
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.A
            r1 = 1
            java.util.List r2 = r4.B
            switch(r0) {
                case 0: goto L12;
                default: goto L8;
            }
        L8:
            int r0 = r4.R
            int r3 = r0 + 1
            r4.R = r3
            r2.add(r0, r5)
            return r1
        L12:
            int r0 = r4.R
            int r3 = r0 + 1
            r4.R = r3
            r2.add(r0, r5)
            return r1
    }

    @Override // java.util.List
    public final boolean addAll(int r6, java.util.Collection r7) {
            r5 = this;
            int r0 = r5.A
            r1 = 0
            r2 = 1
            int r3 = r5.L
            java.util.List r4 = r5.B
            switch(r0) {
                case 0: goto L1c;
                default: goto Lb;
            }
        Lb:
            int r6 = r6 + r3
            r4.addAll(r6, r7)
            int r6 = r7.size()
            int r7 = r5.R
            int r7 = r7 + r6
            r5.R = r7
            if (r6 <= 0) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            r7.getClass()
            int r6 = r6 + r3
            r4.addAll(r6, r7)
            int r6 = r5.R
            int r0 = r7.size()
            int r0 = r0 + r6
            r5.R = r0
            int r5 = r7.size()
            if (r5 <= 0) goto L33
            r1 = r2
        L33:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            r2 = 1
            java.util.List r3 = r4.B
            switch(r0) {
                case 0: goto L1b;
                default: goto L9;
            }
        L9:
            int r0 = r4.R
            r3.addAll(r0, r5)
            int r5 = r5.size()
            int r0 = r4.R
            int r0 = r0 + r5
            r4.R = r0
            if (r5 <= 0) goto L1a
            r1 = r2
        L1a:
            return r1
        L1b:
            r5.getClass()
            int r0 = r4.R
            r3.addAll(r0, r5)
            int r0 = r4.R
            int r3 = r5.size()
            int r3 = r3 + r0
            r4.R = r3
            int r4 = r5.size()
            if (r4 <= 0) goto L33
            r1 = r2
        L33:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r3 = this;
            int r0 = r3.A
            java.util.List r1 = r3.B
            int r2 = r3.L
            switch(r0) {
                case 0: goto L1a;
                default: goto L9;
            }
        L9:
            int r0 = r3.R
            int r0 = r0 + (-1)
            if (r2 > r0) goto L17
        Lf:
            r1.remove(r0)
            if (r0 == r2) goto L17
            int r0 = r0 + (-1)
            goto Lf
        L17:
            r3.R = r2
            return
        L1a:
            int r0 = r3.R
            int r0 = r0 + (-1)
            if (r2 > r0) goto L28
        L20:
            r1.remove(r0)
            if (r0 == r2) goto L28
            int r0 = r0 + (-1)
            goto L20
        L28:
            r3.R = r2
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            r1 = 0
            java.util.List r2 = r5.B
            int r3 = r5.L
            r4 = 1
            switch(r0) {
                case 0: goto L1f;
                default: goto Lb;
            }
        Lb:
            int r5 = r5.R
        Ld:
            if (r3 >= r5) goto L1e
            java.lang.Object r0 = r2.get(r3)
            boolean r0 = defpackage.nb3.k(r0, r6)
            if (r0 == 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            int r3 = r3 + 1
            goto Ld
        L1e:
            return r1
        L1f:
            int r5 = r5.R
        L21:
            if (r3 >= r5) goto L32
            java.lang.Object r0 = r2.get(r3)
            boolean r0 = defpackage.nb3.k(r0, r6)
            if (r0 == 0) goto L2f
            r1 = r4
            goto L32
        L2f:
            int r3 = r3 + 1
            goto L21
        L32:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r4) {
            r3 = this;
            int r0 = r3.A
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L1f;
                default: goto L7;
            }
        L7:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r4.next()
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto Ld
            r1 = r2
        L1e:
            return r1
        L1f:
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L28:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L28
            r1 = r2
        L39:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            int r0 = r3.A
            int r1 = r3.L
            java.util.List r2 = r3.B
            switch(r0) {
                case 0: goto L12;
                default: goto L9;
            }
        L9:
            defpackage.va4.a(r4, r3)
            int r4 = r4 + r1
            java.lang.Object r3 = r2.get(r4)
            return r3
        L12:
            defpackage.uh4.a(r4, r3)
            int r4 = r4 + r1
            java.lang.Object r3 = r2.get(r4)
            return r3
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            r1 = -1
            java.util.List r2 = r5.B
            int r3 = r5.L
            switch(r0) {
                case 0: goto L20;
                default: goto La;
            }
        La:
            int r5 = r5.R
            r0 = r3
        Ld:
            if (r0 >= r5) goto L1f
            java.lang.Object r4 = r2.get(r0)
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 == 0) goto L1c
            int r1 = r0 - r3
            goto L1f
        L1c:
            int r0 = r0 + 1
            goto Ld
        L1f:
            return r1
        L20:
            int r5 = r5.R
            r0 = r3
        L23:
            if (r0 >= r5) goto L35
            java.lang.Object r4 = r2.get(r0)
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 == 0) goto L32
            int r1 = r0 - r3
            goto L35
        L32:
            int r0 = r0 + 1
            goto L23
        L35:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            int r0 = r1.R
            int r1 = r1.L
            if (r0 != r1) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
        Lf:
            int r0 = r1.R
            int r1 = r1.L
            if (r0 != r1) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
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
    public final int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.A
            java.util.List r1 = r4.B
            int r2 = r4.L
            r3 = -1
            switch(r0) {
                case 0: goto L23;
                default: goto La;
            }
        La:
            int r4 = r4.R
            int r4 = r4 + (-1)
            if (r2 > r4) goto L22
        L10:
            java.lang.Object r0 = r1.get(r4)
            boolean r0 = defpackage.nb3.k(r0, r5)
            if (r0 == 0) goto L1d
            int r3 = r4 - r2
            goto L22
        L1d:
            if (r4 == r2) goto L22
            int r4 = r4 + (-1)
            goto L10
        L22:
            return r3
        L23:
            int r4 = r4.R
            int r4 = r4 + (-1)
            if (r2 > r4) goto L3b
        L29:
            java.lang.Object r0 = r1.get(r4)
            boolean r0 = defpackage.nb3.k(r0, r5)
            if (r0 == 0) goto L36
            int r3 = r4 - r2
            goto L3b
        L36:
            if (r4 == r2) goto L3b
            int r4 = r4 + (-1)
            goto L29
        L3b:
            return r3
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
    public final java.lang.Object remove(int r4) {
            r3 = this;
            int r0 = r3.A
            int r1 = r3.L
            java.util.List r2 = r3.B
            switch(r0) {
                case 0: goto L18;
                default: goto L9;
            }
        L9:
            defpackage.va4.a(r4, r3)
            int r4 = r4 + r1
            java.lang.Object r4 = r2.remove(r4)
            int r0 = r3.R
            int r0 = r0 + (-1)
            r3.R = r0
            return r4
        L18:
            defpackage.uh4.a(r4, r3)
            int r4 = r4 + r1
            java.lang.Object r4 = r2.remove(r4)
            int r0 = r3.R
            int r0 = r0 + (-1)
            r3.R = r0
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.A
            r1 = 0
            int r2 = r6.L
            java.util.List r3 = r6.B
            r4 = 1
            switch(r0) {
                case 0: goto L28;
                default: goto Lb;
            }
        Lb:
            int r0 = r6.R
        Ld:
            if (r2 >= r0) goto L27
            java.lang.Object r5 = r3.get(r2)
            boolean r5 = defpackage.nb3.k(r5, r7)
            if (r5 == 0) goto L24
            r3.remove(r2)
            int r7 = r6.R
            int r7 = r7 + (-1)
            r6.R = r7
            r1 = r4
            goto L27
        L24:
            int r2 = r2 + 1
            goto Ld
        L27:
            return r1
        L28:
            int r0 = r6.R
        L2a:
            if (r2 >= r0) goto L44
            java.lang.Object r5 = r3.get(r2)
            boolean r5 = defpackage.nb3.k(r5, r7)
            if (r5 == 0) goto L41
            r3.remove(r2)
            int r7 = r6.R
            int r7 = r7 + (-1)
            r6.R = r7
            r1 = r4
            goto L44
        L41:
            int r2 = r2 + 1
            goto L2a
        L44:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L23;
                default: goto L7;
            }
        L7:
            int r0 = r4.R
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r5.next()
            r4.remove(r3)
            goto Lf
        L1d:
            int r4 = r4.R
            if (r0 == r4) goto L22
            r1 = r2
        L22:
            return r1
        L23:
            r5.getClass()
            int r0 = r4.R
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L2e:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r5.next()
            r4.remove(r3)
            goto L2e
        L3c:
            int r4 = r4.R
            if (r0 == r4) goto L41
            r1 = r2
        L41:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r8) {
            r7 = this;
            int r0 = r7.A
            r1 = 0
            int r2 = r7.L
            r3 = 1
            java.util.List r4 = r7.B
            switch(r0) {
                case 0: goto L2f;
                default: goto Lb;
            }
        Lb:
            int r0 = r7.R
            int r5 = r0 + (-1)
            if (r2 > r5) goto L29
        L11:
            java.lang.Object r6 = r4.get(r5)
            boolean r6 = r8.contains(r6)
            if (r6 != 0) goto L24
            r4.remove(r5)
            int r6 = r7.R
            int r6 = r6 + (-1)
            r7.R = r6
        L24:
            if (r5 == r2) goto L29
            int r5 = r5 + (-1)
            goto L11
        L29:
            int r7 = r7.R
            if (r0 == r7) goto L2e
            r1 = r3
        L2e:
            return r1
        L2f:
            r8.getClass()
            int r0 = r7.R
            int r5 = r0 + (-1)
            if (r2 > r5) goto L50
        L38:
            java.lang.Object r6 = r4.get(r5)
            boolean r6 = r8.contains(r6)
            if (r6 != 0) goto L4b
            r4.remove(r5)
            int r6 = r7.R
            int r6 = r6 + (-1)
            r7.R = r6
        L4b:
            if (r5 == r2) goto L50
            int r5 = r5 + (-1)
            goto L38
        L50:
            int r7 = r7.R
            if (r0 == r7) goto L55
            r1 = r3
        L55:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object set(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.A
            int r1 = r3.L
            java.util.List r2 = r3.B
            switch(r0) {
                case 0: goto L12;
                default: goto L9;
            }
        L9:
            defpackage.va4.a(r4, r3)
            int r4 = r4 + r1
            java.lang.Object r3 = r2.set(r4, r5)
            return r3
        L12:
            defpackage.uh4.a(r4, r3)
            int r4 = r4 + r1
            java.lang.Object r3 = r2.set(r4, r5)
            return r3
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            int r0 = r1.R
            int r1 = r1.L
        L9:
            int r0 = r0 - r1
            return r0
        Lb:
            int r0 = r1.R
            int r1 = r1.L
            goto L9
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
