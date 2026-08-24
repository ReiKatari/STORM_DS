package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbtw extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl implements java.util.RandomAccess, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuk {
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw zba = null;
    private float[] zbb;
    private int zbc;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw
            r1 = 0
            float[] r2 = new float[r1]
            r0.<init>(r2, r1, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw.zba = r0
            return
    }

    public zbtw() {
            r3 = this;
            r0 = 10
            float[] r0 = new float[r0]
            r1 = 0
            r2 = 1
            r3.<init>(r0, r1, r2)
            return
    }

    private zbtw(float[] r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            r0.zbb = r1
            r0.zbc = r2
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw zbf() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw.zba
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
    public final /* synthetic */ void add(int r7, java.lang.Object r8) {
            r6 = this;
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r6.zba()
            if (r7 < 0) goto L41
            int r0 = r6.zbc
            if (r7 > r0) goto L41
            int r1 = r7 + 1
            float[] r2 = r6.zbb
            int r3 = r2.length
            r4 = 1
            if (r0 >= r3) goto L1c
            int r0 = r0 - r7
            java.lang.System.arraycopy(r2, r7, r2, r1, r0)
            goto L32
        L1c:
            r3 = 3
            r5 = 2
            int r0 = defpackage.xg6.c(r0, r3, r5, r4)
            float[] r0 = new float[r0]
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r7)
            float[] r2 = r6.zbb
            int r3 = r6.zbc
            int r3 = r3 - r7
            java.lang.System.arraycopy(r2, r7, r0, r1, r3)
            r6.zbb = r0
        L32:
            float[] r0 = r6.zbb
            r0[r7] = r8
            int r7 = r6.zbc
            int r7 = r7 + r4
            r6.zbc = r7
            int r7 = r6.modCount
            int r7 = r7 + r4
            r6.modCount = r7
            return
        L41:
            java.lang.String r6 = r6.zbh(r7)
            defpackage.e41.q(r6)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.zbg(r1)
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r6) {
            r5 = this;
            r5.zba()
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            r6.getClass()
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw
            if (r0 != 0) goto L11
            boolean r5 = super.addAll(r6)
            return r5
        L11:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw) r6
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
            float[] r0 = r5.zbb
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            float[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.zbb = r0
        L2d:
            float[] r0 = r6.zbb
            float[] r3 = r5.zbb
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
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw
            if (r1 != 0) goto Ld
            boolean r5 = super.equals(r6)
            return r5
        Ld:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw) r6
            int r1 = r5.zbc
            int r2 = r6.zbc
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            float[] r6 = r6.zbb
            r1 = r3
        L1a:
            int r2 = r5.zbc
            if (r1 >= r2) goto L32
            float[] r2 = r5.zbb
            r2 = r2[r1]
            int r2 = java.lang.Float.floatToIntBits(r2)
            r4 = r6[r1]
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r2 == r4) goto L2f
            return r3
        L2f:
            int r1 = r1 + 1
            goto L1a
        L32:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            r0.zbi(r1)
            float[] r0 = r0.zbb
            r0 = r0[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r3 = this;
            r0 = 0
            r1 = 1
        L2:
            int r2 = r3.zbc
            if (r0 >= r2) goto L14
            int r1 = r1 * 31
            float[] r2 = r3.zbb
            r2 = r2[r0]
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L14:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Float
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r0 = r4.zbc
            r2 = 0
        Lf:
            if (r2 >= r0) goto L1d
            float[] r3 = r4.zbb
            r3 = r3[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1a
            return r2
        L1a:
            int r2 = r2 + 1
            goto Lf
        L1d:
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r5) {
            r4 = this;
            r4.zba()
            r4.zbi(r5)
            float[] r0 = r4.zbb
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
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            return r4
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
            r2 = this;
            r2.zba()
            if (r4 < r3) goto L1a
            float[] r0 = r2.zbb
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
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.zba()
            r1.zbi(r2)
            float[] r1 = r1.zbb
            r0 = r1[r2]
            r1[r2] = r3
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
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
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw
            float[] r1 = r2.zbb
            float[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r2 = r2.zbc
            r1 = 1
            r0.<init>(r3, r2, r1)
            return r0
        L13:
            defpackage.u34.t()
            r2 = 0
            return r2
    }

    public final float zbe(int r1) {
            r0 = this;
            r0.zbi(r1)
            float[] r0 = r0.zbb
            r0 = r0[r1]
            return r0
    }

    public final void zbg(float r6) {
            r5 = this;
            r5.zba()
            int r0 = r5.zbc
            float[] r1 = r5.zbb
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = defpackage.xg6.c(r0, r2, r3, r4)
            float[] r2 = new float[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.zbb = r2
        L19:
            float[] r0 = r5.zbb
            int r1 = r5.zbc
            int r2 = r1 + 1
            r5.zbc = r2
            r0[r1] = r6
            return
    }
}
