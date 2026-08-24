package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbtm extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl implements java.util.RandomAccess, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun {
    private double[] zba;
    private int zbb;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm
            r1 = 0
            double[] r2 = new double[r1]
            r0.<init>(r2, r1, r1)
            return
    }

    public zbtm() {
            r3 = this;
            r0 = 10
            double[] r0 = new double[r0]
            r1 = 0
            r2 = 1
            r3.<init>(r0, r1, r2)
            return
    }

    private zbtm(double[] r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            r0.zba = r1
            r0.zbb = r2
            return
    }

    private final java.lang.String zbg(int r3) {
            r2 = this;
            int r2 = r2.zbb
            java.lang.String r0 = "Index:"
            java.lang.String r1 = ", Size:"
            java.lang.String r2 = defpackage.lb1.j(r0, r3, r2, r1)
            return r2
    }

    private final void zbh(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.zbb
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.String r1 = r1.zbg(r2)
            defpackage.e41.q(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r8, java.lang.Object r9) {
            r7 = this;
            java.lang.Double r9 = (java.lang.Double) r9
            double r0 = r9.doubleValue()
            r7.zba()
            if (r8 < 0) goto L41
            int r9 = r7.zbb
            if (r8 > r9) goto L41
            int r2 = r8 + 1
            double[] r3 = r7.zba
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
            double[] r9 = new double[r9]
            r4 = 0
            java.lang.System.arraycopy(r3, r4, r9, r4, r8)
            double[] r3 = r7.zba
            int r4 = r7.zbb
            int r4 = r4 - r8
            java.lang.System.arraycopy(r3, r8, r9, r2, r4)
            r7.zba = r9
        L32:
            double[] r9 = r7.zba
            r9[r8] = r0
            int r8 = r7.zbb
            int r8 = r8 + r5
            r7.zbb = r8
            int r8 = r7.modCount
            int r8 = r8 + r5
            r7.modCount = r8
            return
        L41:
            java.lang.String r7 = r7.zbg(r8)
            defpackage.e41.q(r7)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r3) {
            r2 = this;
            java.lang.Double r3 = (java.lang.Double) r3
            double r0 = r3.doubleValue()
            r2.zbf(r0)
            r2 = 1
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r6) {
            r5 = this;
            r5.zba()
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            r6.getClass()
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm
            if (r0 != 0) goto L11
            boolean r5 = super.addAll(r6)
            return r5
        L11:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm) r6
            int r0 = r6.zbb
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.zbb
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            double[] r0 = r5.zba
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            double[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.zba = r0
        L2d:
            double[] r0 = r6.zba
            double[] r3 = r5.zba
            int r4 = r5.zbb
            int r6 = r6.zbb
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.zbb = r2
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
            boolean r1 = r9 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm
            if (r1 != 0) goto Ld
            boolean r8 = super.equals(r9)
            return r8
        Ld:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm r9 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm) r9
            int r1 = r8.zbb
            int r2 = r9.zbb
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            double[] r9 = r9.zba
            r1 = r3
        L1a:
            int r2 = r8.zbb
            if (r1 >= r2) goto L34
            double[] r2 = r8.zba
            r4 = r2[r1]
            long r4 = java.lang.Double.doubleToLongBits(r4)
            r6 = r9[r1]
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L31
            return r3
        L31:
            int r1 = r1 + 1
            goto L1a
        L34:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int r3) {
            r2 = this;
            r2.zbh(r3)
            double[] r2 = r2.zba
            r0 = r2[r3]
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r6 = this;
            r0 = 0
            r1 = 1
        L2:
            int r2 = r6.zbb
            if (r0 >= r2) goto L1c
            double[] r2 = r6.zba
            r3 = r2[r0]
            long r2 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            r4 = 32
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r2 = (int) r2
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L1c:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof java.lang.Double
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Double r8 = (java.lang.Double) r8
            double r2 = r8.doubleValue()
            int r8 = r7.zbb
            r0 = 0
        Lf:
            if (r0 >= r8) goto L1d
            double[] r4 = r7.zba
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
            r5.zbh(r6)
            double[] r0 = r5.zba
            r1 = r0[r6]
            int r3 = r5.zbb
            int r4 = r3 + (-1)
            if (r6 >= r4) goto L18
            int r4 = r6 + 1
            int r3 = r3 - r6
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r4, r0, r6, r3)
        L18:
            int r6 = r5.zbb
            int r6 = r6 + (-1)
            r5.zbb = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            java.lang.Double r5 = java.lang.Double.valueOf(r1)
            return r5
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
            r2 = this;
            r2.zba()
            if (r4 < r3) goto L1a
            double[] r0 = r2.zba
            int r1 = r2.zbb
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.zbb
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.zbb = r0
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
            java.lang.Double r6 = (java.lang.Double) r6
            double r0 = r6.doubleValue()
            r4.zba()
            r4.zbh(r5)
            double[] r4 = r4.zba
            r2 = r4[r5]
            r4[r5] = r0
            java.lang.Double r4 = java.lang.Double.valueOf(r2)
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            int r0 = r0.zbb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun zbd(int r3) {
            r2 = this;
            int r0 = r2.zbb
            if (r3 < r0) goto L13
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm
            double[] r1 = r2.zba
            double[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r2 = r2.zbb
            r1 = 1
            r0.<init>(r3, r2, r1)
            return r0
        L13:
            defpackage.u34.t()
            r2 = 0
            return r2
    }

    public final double zbe(int r3) {
            r2 = this;
            r2.zbh(r3)
            double[] r2 = r2.zba
            r0 = r2[r3]
            return r0
    }

    public final void zbf(double r6) {
            r5 = this;
            r5.zba()
            int r0 = r5.zbb
            double[] r1 = r5.zba
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = defpackage.xg6.c(r0, r2, r3, r4)
            double[] r2 = new double[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.zba = r2
        L19:
            double[] r0 = r5.zba
            int r1 = r5.zbb
            int r2 = r1 + 1
            r5.zbb = r2
            r0[r1] = r6
            return
    }
}
