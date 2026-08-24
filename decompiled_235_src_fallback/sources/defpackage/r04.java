package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r04  reason: default package */
/* loaded from: classes.dex */
public final class r04 extends java.util.AbstractCollection implements java.util.Collection, defpackage.ag3 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public /* synthetic */ r04(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
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
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.addAll(r2)
            return r1
        La:
            r2.getClass()
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            aw4 r1 = (defpackage.aw4) r1
            r1.clear()
            return
        Ld:
            java.lang.Object r1 = r1.B
            p04 r1 = (defpackage.p04) r1
            r1.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            aw4 r1 = (defpackage.aw4) r1
            boolean r1 = r1.containsValue(r2)
            return r1
        Le:
            java.lang.Object r1 = r1.B
            p04 r1 = (defpackage.p04) r1
            boolean r1 = r1.containsValue(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.isEmpty()
            return r1
        La:
            java.lang.Object r1 = r1.B
            p04 r1 = (defpackage.p04) r1
            boolean r1 = r1.isEmpty()
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.A
            r1 = 2
            java.lang.Object r6 = r6.B
            switch(r0) {
                case 0: goto L21;
                default: goto L8;
            }
        L8:
            ew4 r0 = new ew4
            aw4 r6 = (defpackage.aw4) r6
            r2 = 8
            bc7[] r3 = new defpackage.bc7[r2]
            r4 = 0
        L11:
            if (r4 >= r2) goto L1d
            cc7 r5 = new cc7
            r5.<init>(r1)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L11
        L1d:
            r0.<init>(r6, r3)
            return r0
        L21:
            p04 r6 = (defpackage.p04) r6
            r6.getClass()
            m04 r0 = new m04
            r0.<init>(r6, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.remove(r2)
            return r1
        La:
            java.lang.Object r1 = r1.B
            p04 r1 = (defpackage.p04) r1
            r1.c()
            int r2 = r1.h(r2)
            if (r2 >= 0) goto L19
            r1 = 0
            goto L1d
        L19:
            r1.k(r2)
            r1 = 1
        L1d:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.removeAll(r2)
            return r1
        La:
            r2.getClass()
            java.lang.Object r0 = r1.B
            p04 r0 = (defpackage.p04) r0
            r0.c()
            boolean r1 = super.removeAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.retainAll(r2)
            return r1
        La:
            r2.getClass()
            java.lang.Object r0 = r1.B
            p04 r0 = (defpackage.p04) r0
            r0.c()
            boolean r1 = super.retainAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            aw4 r1 = (defpackage.aw4) r1
            int r1 = r1.Y
            goto L12
        Lc:
            java.lang.Object r1 = r1.B
            p04 r1 = (defpackage.p04) r1
            int r1 = r1.e0
        L12:
            return r1
    }
}
