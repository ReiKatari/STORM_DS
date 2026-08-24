package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbva extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl implements java.util.RandomAccess, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbum {
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva zba = null;
    private long[] zbb;
    private int zbc;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            r1 = 0
            long[] r2 = new long[r1]
            r0.<init>(r2, r1, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva.zba = r0
            return
    }

    public zbva() {
            r3 = this;
            r0 = 10
            long[] r0 = new long[r0]
            r1 = 0
            r2 = 1
            r3.<init>(r0, r1, r2)
            return
    }

    private zbva(long[] r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            r0.zbb = r1
            r0.zbc = r2
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva zbf() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva.zba
            return r0
    }

    private final java.lang.String zbh(int r3) {
            r2 = this;
            int r2 = r2.zbc
            java.lang.String r0 = "Index:"
            java.lang.String r1 = ", Size:"
            java.lang.String r2 = defpackage.lb1.j(r0, r3, r2, r1)
            return r2
    }

    private final void zbi(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.zbc
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.String r1 = r1.zbh(r2)
            defpackage.e41.q(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Long r9 = (java.lang.Long) r9
            long r0 = r9.longValue()
            r7.zba()
            if (r8 < 0) goto L41
            int r9 = r7.zbc
            if (r8 > r9) goto L41
            int r2 = r8 + 1
            long[] r3 = r7.zbb
            int r4 = r3.length
            r5 = 1
            if (r9 >= r4) goto L1c
            int r9 = r9 - r8
            java.lang.System.arraycopy(r3, r8, r3, r2, r9)
            goto L32
        L1c:
            r4 = 3
            r6 = 2
            int r9 = defpackage.xg6.c(r9, r4, r6, r5)
            long[] r9 = new long[r9]
            r4 = 0
            java.lang.System.arraycopy(r3, r4, r9, r4, r8)
            long[] r3 = r7.zbb
            int r4 = r7.zbc
            int r4 = r4 - r8
            java.lang.System.arraycopy(r3, r8, r9, r2, r4)
            r7.zbb = r9
        L32:
            long[] r9 = r7.zbb
            r9[r8] = r0
            int r8 = r7.zbc
            int r8 = r8 + r5
            r7.zbc = r8
            int r8 = r7.modCount
            int r8 = r8 + r5
            r7.modCount = r8
            return
        L41:
            java.lang.String r7 = r7.zbh(r8)
            defpackage.e41.q(r7)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r3) {
            r2 = this;
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            r2.zbg(r0)
            r2 = 1
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r6) {
            r5 = this;
            r5.zba()
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            r6.getClass()
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            if (r0 != 0) goto L11
            boolean r5 = super.addAll(r6)
            return r5
        L11:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r6
            int r0 = r6.zbc
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.zbc
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            long[] r0 = r5.zbb
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.zbb = r0
        L2d:
            long[] r0 = r6.zbb
            long[] r3 = r5.zbb
            int r4 = r5.zbc
            int r6 = r6.zbc
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.zbc = r2
            int r6 = r5.modCount
            r0 = 1
            int r6 = r6 + r0
            r5.modCount = r6
            return r0
        L41:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            if (r1 != 0) goto Ld
            boolean r8 = super.equals(r9)
            return r8
        Ld:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r9 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r9
            int r1 = r8.zbc
            int r2 = r9.zbc
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            long[] r9 = r9.zbb
            r1 = r3
        L1a:
            int r2 = r8.zbc
            if (r1 >= r2) goto L2c
            long[] r2 = r8.zbb
            r4 = r2[r1]
            r6 = r9[r1]
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L29
            return r3
        L29:
            int r1 = r1 + 1
            goto L1a
        L2c:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int r3) {
            r2 = this;
            r2.zbi(r3)
            long[] r2 = r2.zbb
            r0 = r2[r3]
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r7 = this;
            r0 = 0
            r1 = 1
        L2:
            int r2 = r7.zbc
            if (r0 >= r2) goto L19
            int r1 = r1 * 31
            long[] r2 = r7.zbb
            r3 = r2[r0]
            byte[] r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            r2 = 32
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r2 = (int) r2
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L19:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof java.lang.Long
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Long r8 = (java.lang.Long) r8
            long r2 = r8.longValue()
            int r8 = r7.zbc
            r0 = 0
        Lf:
            if (r0 >= r8) goto L1d
            long[] r4 = r7.zbb
            r5 = r4[r0]
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto Lf
        L1d:
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r6) {
            r5 = this;
            r5.zba()
            r5.zbi(r6)
            long[] r0 = r5.zbb
            r1 = r0[r6]
            int r3 = r5.zbc
            int r4 = r3 + (-1)
            if (r6 >= r4) goto L18
            int r4 = r6 + 1
            int r3 = r3 - r6
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r4, r0, r6, r3)
        L18:
            int r6 = r5.zbc
            int r6 = r6 + (-1)
            r5.zbc = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            return r5
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
            r2 = this;
            r2.zba()
            if (r4 < r3) goto L1a
            long[] r0 = r2.zbb
            int r1 = r2.zbc
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.zbc
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.zbc = r0
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
            return
        L1a:
            java.lang.String r2 = "toIndex < fromIndex"
            defpackage.e41.q(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.zba()
            r4.zbi(r5)
            long[] r4 = r4.zbb
            r2 = r4[r5]
            r4[r5] = r0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            int r0 = r0.zbc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun zbd(int r3) {
            r2 = this;
            int r0 = r2.zbc
            if (r3 < r0) goto L13
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            long[] r1 = r2.zbb
            long[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r2 = r2.zbc
            r1 = 1
            r0.<init>(r3, r2, r1)
            return r0
        L13:
            defpackage.u34.t()
            r2 = 0
            return r2
    }

    public final long zbe(int r3) {
            r2 = this;
            r2.zbi(r3)
            long[] r2 = r2.zbb
            r0 = r2[r3]
            return r0
    }

    public final void zbg(long r6) {
            r5 = this;
            r5.zba()
            int r0 = r5.zbc
            long[] r1 = r5.zbb
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = defpackage.xg6.c(r0, r2, r3, r4)
            long[] r2 = new long[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.zbb = r2
        L19:
            long[] r0 = r5.zbb
            int r1 = r5.zbc
            int r2 = r1 + 1
            r5.zbc = r2
            r0[r1] = r6
            return
    }
}
