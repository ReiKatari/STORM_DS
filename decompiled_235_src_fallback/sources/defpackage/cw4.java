package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cw4  reason: default package */
/* loaded from: classes.dex */
public final class cw4 extends defpackage.e1 {
    public final /* synthetic */ int A;
    public final defpackage.aw4 B;

    public /* synthetic */ cw4(int r1, defpackage.aw4 r2) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            r0.B = r2
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
            aw4 r1 = r1.B
            int r1 = r1.Y
            return r1
        La:
            aw4 r1 = r1.B
            int r1 = r1.Y
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
            aw4 r1 = r1.B
            r1.clear()
            return
        Lb:
            aw4 r1 = r1.B
            r1.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            aw4 r2 = r2.B
            boolean r2 = r2.containsKey(r3)
            return r2
        Lc:
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L12
            goto L3a
        L12:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            aw4 r2 = r2.B
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L29
            java.lang.Object r2 = r3.getValue()
            boolean r1 = r0.equals(r2)
            goto L3a
        L29:
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L3a
            java.lang.Object r3 = r3.getKey()
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L3a
            r1 = 1
        L3a:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.A
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            ew4 r0 = new ew4
            r1 = 8
            bc7[] r2 = new defpackage.bc7[r1]
            r3 = 0
        Lc:
            if (r3 >= r1) goto L19
            cc7 r4 = new cc7
            r5 = 1
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto Lc
        L19:
            aw4 r6 = r6.B
            r0.<init>(r6, r2)
            return r0
        L1f:
            dw4 r0 = new dw4
            aw4 r6 = r6.B
            r0.<init>(r6)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            r1 = 0
            switch(r0) {
                case 0: goto L13;
                default: goto L6;
            }
        L6:
            aw4 r2 = r2.B
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L12
            r2.remove(r3)
            r1 = 1
        L12:
            return r1
        L13:
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 != 0) goto L18
            goto L28
        L18:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            aw4 r2 = r2.B
            boolean r1 = r2.remove(r0, r3)
        L28:
            return r1
    }
}
