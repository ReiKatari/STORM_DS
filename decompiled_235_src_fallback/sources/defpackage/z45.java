package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z45  reason: default package */
/* loaded from: classes.dex */
public final class z45 extends defpackage.j1 implements java.util.RandomAccess {
    public static final defpackage.z45 R = null;
    public java.lang.Object[] B;
    public int L;

    static {
            z45 r0 = new z45
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            defpackage.z45.R = r0
            r0.A = r1
            return
    }

    public z45(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.L = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r6, java.lang.Object r7) {
            r5 = this;
            r5.a()
            if (r6 < 0) goto L3d
            int r0 = r5.L
            if (r6 > r0) goto L3d
            java.lang.Object[] r1 = r5.B
            int r2 = r1.length
            r3 = 1
            if (r0 >= r2) goto L16
            int r2 = r6 + 1
            int r0 = r0 - r6
            java.lang.System.arraycopy(r1, r6, r1, r2, r0)
            goto L2e
        L16:
            r2 = 3
            r4 = 2
            int r0 = defpackage.xg6.c(r0, r2, r4, r3)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r6)
            java.lang.Object[] r1 = r5.B
            int r2 = r6 + 1
            int r4 = r5.L
            int r4 = r4 - r6
            java.lang.System.arraycopy(r1, r6, r0, r2, r4)
            r5.B = r0
        L2e:
            java.lang.Object[] r0 = r5.B
            r0[r6] = r7
            int r6 = r5.L
            int r6 = r6 + r3
            r5.L = r6
            int r6 = r5.modCount
            int r6 = r6 + r3
            r5.modCount = r6
            return
        L3d:
            java.lang.String r7 = "Index:"
            java.lang.String r0 = ", Size:"
            java.lang.StringBuilder r6 = defpackage.xg6.t(r7, r6, r0)
            int r5 = r5.L
            defpackage.u34.q(r6, r5)
            return
    }

    @Override // defpackage.j1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r5) {
            r4 = this;
            r4.a()
            int r0 = r4.L
            java.lang.Object[] r1 = r4.B
            int r2 = r1.length
            r3 = 1
            if (r0 != r2) goto L16
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r4.B = r0
        L16:
            java.lang.Object[] r0 = r4.B
            int r1 = r4.L
            int r2 = r1 + 1
            r4.L = r2
            r0[r1] = r5
            int r5 = r4.modCount
            int r5 = r5 + r3
            r4.modCount = r5
            return r3
    }

    public final void b(int r3) {
            r2 = this;
            if (r3 < 0) goto L7
            int r0 = r2.L
            if (r3 >= r0) goto L7
            return
        L7:
            java.lang.String r0 = "Index:"
            java.lang.String r1 = ", Size:"
            java.lang.StringBuilder r3 = defpackage.xg6.t(r0, r3, r1)
            int r2 = r2.L
            defpackage.u34.q(r3, r2)
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            r0.b(r1)
            java.lang.Object[] r0 = r0.B
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.z93
    public final defpackage.z93 k(int r2) {
            r1 = this;
            int r0 = r1.L
            if (r2 < r0) goto L12
            java.lang.Object[] r0 = r1.B
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            z45 r0 = new z45
            int r1 = r1.L
            r0.<init>(r2, r1)
            return r0
        L12:
            defpackage.u34.t()
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int r5) {
            r4 = this;
            r4.a()
            r4.b(r5)
            java.lang.Object[] r0 = r4.B
            r1 = r0[r5]
            int r2 = r4.L
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.L
            int r5 = r5 + (-1)
            r4.L = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.a()
            r2.b(r3)
            java.lang.Object[] r0 = r2.B
            r1 = r0[r3]
            r0[r3] = r4
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            int r0 = r0.L
            return r0
    }
}
