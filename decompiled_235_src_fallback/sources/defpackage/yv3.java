package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yv3  reason: default package */
/* loaded from: classes.dex */
public final class yv3 extends java.util.AbstractSet {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.Map B;

    public /* synthetic */ yv3(int r1, java.util.Map r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r2 = this;
            int r0 = r2.A
            java.util.Map r1 = r2.B
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L7;
            }
        L7:
            super.clear()
            return
        Lb:
            aw3 r1 = (defpackage.aw3) r1
            r1.clear()
            return
        L11:
            aw3 r1 = (defpackage.aw3) r1
            r1.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.A
            java.util.Map r1 = r3.B
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r3 = super.contains(r4)
            return r3
        Lc:
            aw3 r1 = (defpackage.aw3) r1
            boolean r3 = r1.containsKey(r4)
            return r3
        L13:
            boolean r3 = r4 instanceof java.util.Map.Entry
            r0 = 0
            if (r3 == 0) goto L3b
            aw3 r1 = (defpackage.aw3) r1
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r3 = r4.getKey()
            r2 = 0
            if (r3 == 0) goto L28
            zv3 r3 = r1.a(r0, r3)     // Catch: java.lang.ClassCastException -> L28
            goto L29
        L28:
            r3 = r2
        L29:
            if (r3 == 0) goto L38
            java.lang.Object r1 = r3.d0
            java.lang.Object r4 = r4.getValue()
            boolean r4 = java.util.Objects.equals(r1, r4)
            if (r4 == 0) goto L38
            r2 = r3
        L38:
            if (r2 == 0) goto L3b
            r0 = 1
        L3b:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.A
            java.util.Map r2 = r2.B
            switch(r0) {
                case 0: goto L18;
                case 1: goto Lf;
                default: goto L7;
            }
        L7:
            uu r0 = new uu
            wu r2 = (defpackage.wu) r2
            r0.<init>(r2)
            return r0
        Lf:
            xv3 r0 = new xv3
            aw3 r2 = (defpackage.aw3) r2
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L18:
            xv3 r0 = new xv3
            aw3 r2 = (defpackage.aw3) r2
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            r1 = 0
            java.util.Map r2 = r5.B
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto L20;
                case 1: goto Lf;
                default: goto La;
            }
        La:
            boolean r5 = super.remove(r6)
            return r5
        Lf:
            aw3 r2 = (defpackage.aw3) r2
            if (r6 == 0) goto L17
            zv3 r1 = r2.a(r3, r6)     // Catch: java.lang.ClassCastException -> L17
        L17:
            if (r1 == 0) goto L1c
            r2.c(r1, r4)
        L1c:
            if (r1 == 0) goto L1f
            r3 = r4
        L1f:
            return r3
        L20:
            aw3 r2 = (defpackage.aw3) r2
            boolean r5 = r6 instanceof java.util.Map.Entry
            if (r5 != 0) goto L27
            goto L4b
        L27:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r5 = r6.getKey()
            if (r5 == 0) goto L34
            zv3 r5 = r2.a(r3, r5)     // Catch: java.lang.ClassCastException -> L34
            goto L35
        L34:
            r5 = r1
        L35:
            if (r5 == 0) goto L44
            java.lang.Object r0 = r5.d0
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r0, r6)
            if (r6 == 0) goto L44
            r1 = r5
        L44:
            if (r1 != 0) goto L47
            goto L4b
        L47:
            r2.c(r1, r4)
            r3 = r4
        L4b:
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.A
            java.util.Map r1 = r1.B
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            wu r1 = (defpackage.wu) r1
            int r1 = r1.L
            return r1
        Lc:
            aw3 r1 = (defpackage.aw3) r1
            int r1 = r1.R
            return r1
        L11:
            aw3 r1 = (defpackage.aw3) r1
            int r1 = r1.R
            return r1
    }
}
