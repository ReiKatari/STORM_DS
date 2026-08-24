package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q04  reason: default package */
/* loaded from: classes.dex */
public final class q04 extends defpackage.e1 {
    public final /* synthetic */ int A;
    public final defpackage.p04 B;

    public /* synthetic */ q04(defpackage.p04 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.e1
    public final int a() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            p04 r1 = r1.B
            int r1 = r1.e0
            return r1
        La:
            p04 r1 = r1.B
            int r1 = r1.e0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        Lb:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r1.getClass()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.A
            r1.getClass()
            switch(r0) {
                case 0: goto Le;
                default: goto L8;
            }
        L8:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        Le:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            p04 r1 = r1.B
            r1.clear()
            return
        Lb:
            p04 r1 = r1.B
            r1.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            p04 r2 = r2.B
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r2 = r2.containsKey(r3)
            return r2
        Lc:
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L12
            goto L31
        L12:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r2.getClass()
            java.lang.Object r0 = r3.getKey()
            int r0 = r2.g(r0)
            if (r0 >= 0) goto L22
            goto L31
        L22:
            java.lang.Object[] r2 = r2.B
            r2.getClass()
            r2 = r2[r0]
            java.lang.Object r3 = r3.getValue()
            boolean r1 = defpackage.nb3.k(r2, r3)
        L31:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.containsAll(r2)
            return r1
        La:
            r2.getClass()
            p04 r1 = r1.B
            boolean r1 = r1.e(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            p04 r1 = r1.B
            boolean r1 = r1.isEmpty()
            return r1
        Lc:
            p04 r1 = r1.B
            boolean r1 = r1.isEmpty()
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.A
            p04 r2 = r2.B
            switch(r0) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            r2.getClass()
            m04 r0 = new m04
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L11:
            r2.getClass()
            m04 r0 = new m04
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.A
            r1 = 1
            r2 = 0
            p04 r4 = r4.B
            switch(r0) {
                case 0: goto L18;
                default: goto L9;
            }
        L9:
            r4.c()
            int r5 = r4.g(r5)
            if (r5 >= 0) goto L14
            r1 = r2
            goto L17
        L14:
            r4.k(r5)
        L17:
            return r1
        L18:
            boolean r0 = r5 instanceof java.util.Map.Entry
            if (r0 != 0) goto L1e
        L1c:
            r1 = r2
            goto L46
        L1e:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r4.getClass()
            r4.c()
            java.lang.Object r0 = r5.getKey()
            int r0 = r4.g(r0)
            if (r0 >= 0) goto L31
            goto L42
        L31:
            java.lang.Object[] r3 = r4.B
            r3.getClass()
            r3 = r3[r0]
            java.lang.Object r5 = r5.getValue()
            boolean r5 = defpackage.nb3.k(r3, r5)
            if (r5 != 0) goto L43
        L42:
            goto L1c
        L43:
            r4.k(r0)
        L46:
            return r1
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.A
            p04 r1 = r2.B
            r3.getClass()
            switch(r0) {
                case 0: goto L12;
                default: goto La;
            }
        La:
            r1.c()
            boolean r2 = super.removeAll(r3)
            return r2
        L12:
            r1.c()
            boolean r2 = super.removeAll(r3)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.A
            p04 r1 = r2.B
            r3.getClass()
            switch(r0) {
                case 0: goto L12;
                default: goto La;
            }
        La:
            r1.c()
            boolean r2 = super.retainAll(r3)
            return r2
        L12:
            r1.c()
            boolean r2 = super.retainAll(r3)
            return r2
    }
}
