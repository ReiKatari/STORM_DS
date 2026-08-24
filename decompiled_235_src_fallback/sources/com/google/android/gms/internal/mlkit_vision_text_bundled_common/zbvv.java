package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvv extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl implements java.util.RandomAccess {
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv zba = null;
    private java.lang.Object[] zbb;
    private int zbc;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv.zba = r0
            return
    }

    public zbvv() {
            r3 = this;
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 1
            r3.<init>(r0, r1, r2)
            return
    }

    private zbvv(java.lang.Object[] r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            r0.zbb = r1
            r0.zbc = r2
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv zbe() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv.zba
            return r0
    }

    private final java.lang.String zbf(int r3) {
            r2 = this;
            int r2 = r2.zbc
            java.lang.String r0 = "Index:"
            java.lang.String r1 = ", Size:"
            java.lang.String r2 = defpackage.lb1.j(r0, r3, r2, r1)
            return r2
    }

    private final void zbg(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.zbc
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.String r1 = r1.zbf(r2)
            defpackage.e41.q(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final void add(int r7, java.lang.Object r8) {
            r6 = this;
            r6.zba()
            if (r7 < 0) goto L3b
            int r0 = r6.zbc
            if (r7 > r0) goto L3b
            int r1 = r7 + 1
            java.lang.Object[] r2 = r6.zbb
            int r3 = r2.length
            r4 = 1
            if (r0 >= r3) goto L16
            int r0 = r0 - r7
            java.lang.System.arraycopy(r2, r7, r2, r1, r0)
            goto L2c
        L16:
            r3 = 3
            r5 = 2
            int r0 = defpackage.xg6.c(r0, r3, r5, r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r7)
            java.lang.Object[] r2 = r6.zbb
            int r3 = r6.zbc
            int r3 = r3 - r7
            java.lang.System.arraycopy(r2, r7, r0, r1, r3)
            r6.zbb = r0
        L2c:
            java.lang.Object[] r0 = r6.zbb
            r0[r7] = r8
            int r7 = r6.zbc
            int r7 = r7 + r4
            r6.zbc = r7
            int r7 = r6.modCount
            int r7 = r7 + r4
            r6.modCount = r7
            return
        L3b:
            java.lang.String r6 = r6.zbf(r7)
            defpackage.e41.q(r6)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r5) {
            r4 = this;
            r4.zba()
            int r0 = r4.zbc
            java.lang.Object[] r1 = r4.zbb
            int r2 = r1.length
            r3 = 1
            if (r0 != r2) goto L16
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r4.zbb = r0
        L16:
            java.lang.Object[] r0 = r4.zbb
            int r1 = r4.zbc
            int r2 = r1 + 1
            r4.zbc = r2
            r0[r1] = r5
            int r5 = r4.modCount
            int r5 = r5 + r3
            r4.modCount = r5
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            r0.zbg(r1)
            java.lang.Object[] r0 = r0.zbb
            r0 = r0[r1]
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int r5) {
            r4 = this;
            r4.zba()
            r4.zbg(r5)
            java.lang.Object[] r0 = r4.zbb
            r1 = r0[r5]
            int r2 = r4.zbc
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.zbc
            int r5 = r5 + (-1)
            r4.zbc = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.zba()
            r2.zbg(r3)
            java.lang.Object[] r0 = r2.zbb
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
            int r0 = r0.zbc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun zbd(int r3) {
            r2 = this;
            int r0 = r2.zbc
            if (r3 < r0) goto L13
            java.lang.Object[] r0 = r2.zbb
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvv
            int r2 = r2.zbc
            r1 = 1
            r0.<init>(r3, r2, r1)
            return r0
        L13:
            defpackage.u34.t()
            r2 = 0
            return r2
    }
}
