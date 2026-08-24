package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class zbwh extends java.util.AbstractMap {
    private java.lang.Object[] zba;
    private int zbb;
    private java.util.Map zbc;
    private boolean zbd;
    private volatile com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwf zbe;
    private java.util.Map zbf;

    private zbwh() {
            r1 = this;
            r1.<init>()
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r1.zbc = r0
            r1.zbf = r0
            return
    }

    public /* synthetic */ zbwh(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwg r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.zbc = r1
            r0.zbf = r1
            return
    }

    public static /* bridge */ /* synthetic */ int zbb(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0) {
            int r0 = r0.zbb
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zbe(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0, int r1) {
            java.lang.Object r0 = r0.zbm(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zbh(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0) {
            java.util.Map r0 = r0.zbc
            return r0
    }

    public static /* bridge */ /* synthetic */ void zbi(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0) {
            r0.zbo()
            return
    }

    public static /* bridge */ /* synthetic */ java.lang.Object[] zbk(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0) {
            java.lang.Object[] r0 = r0.zba
            return r0
    }

    private final int zbl(java.lang.Comparable r5) {
            r4 = this;
            int r0 = r4.zbb
            int r1 = r0 + (-1)
            r2 = 0
            if (r1 < 0) goto L1f
            java.lang.Object[] r3 = r4.zba
            r3 = r3[r1]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r3
            java.lang.Comparable r3 = r3.zba()
            int r3 = r5.compareTo(r3)
            if (r3 <= 0) goto L1b
            int r0 = r0 + 1
            int r4 = -r0
            return r4
        L1b:
            if (r3 == 0) goto L1e
            goto L1f
        L1e:
            return r1
        L1f:
            if (r2 > r1) goto L3e
            int r0 = r2 + r1
            int r0 = r0 / 2
            java.lang.Object[] r3 = r4.zba
            r3 = r3[r0]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r3
            java.lang.Comparable r3 = r3.zba()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L38
            int r1 = r0 + (-1)
            goto L1f
        L38:
            if (r3 <= 0) goto L3d
            int r2 = r0 + 1
            goto L1f
        L3d:
            return r0
        L3e:
            int r2 = r2 + 1
            int r4 = -r2
            return r4
    }

    private final java.lang.Object zbm(int r7) {
            r6 = this;
            r6.zbo()
            java.lang.Object[] r0 = r6.zba
            r0 = r0[r7]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Object[] r1 = r6.zba
            int r2 = r6.zbb
            int r2 = r2 - r7
            int r2 = r2 + (-1)
            int r3 = r7 + 1
            java.lang.System.arraycopy(r1, r3, r1, r7, r2)
            int r7 = r6.zbb
            int r7 = r7 + (-1)
            r6.zbb = r7
            java.util.Map r7 = r6.zbc
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L57
            java.util.SortedMap r7 = r6.zbn()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object[] r1 = r6.zba
            int r2 = r6.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r3 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb
            java.lang.Object r4 = r7.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            java.lang.Object r4 = r4.getValue()
            r3.<init>(r6, r5, r4)
            r1[r2] = r3
            int r1 = r6.zbb
            int r1 = r1 + 1
            r6.zbb = r1
            r7.remove()
        L57:
            return r0
    }

    private final java.util.SortedMap zbn() {
            r1 = this;
            r1.zbo()
            java.util.Map r0 = r1.zbc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e
            java.util.Map r0 = r1.zbc
            boolean r0 = r0 instanceof java.util.TreeMap
            if (r0 != 0) goto L1e
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.zbc = r0
            java.util.NavigableMap r0 = r0.descendingMap()
            r1.zbf = r0
        L1e:
            java.util.Map r1 = r1.zbc
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            return r1
    }

    private final void zbo() {
            r0 = this;
            boolean r0 = r0.zbd
            if (r0 != 0) goto L5
            return
        L5:
            defpackage.e41.t()
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            r1.zbo()
            int r0 = r1.zbb
            if (r0 == 0) goto Ld
            r0 = 0
            r1.zba = r0
            r0 = 0
            r1.zbb = r0
        Ld:
            java.util.Map r0 = r1.zbc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1a
            java.util.Map r1 = r1.zbc
            r1.clear()
        L1a:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zbl(r2)
            if (r0 >= 0) goto L13
            java.util.Map r1 = r1.zbc
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwf r0 = r2.zbe
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwf r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwf
            r1 = 0
            r0.<init>(r2, r1)
            r2.zbe = r0
        Lc:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwf r2 = r2.zbe
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh
            if (r1 != 0) goto Ld
            boolean r7 = super.equals(r8)
            return r7
        Ld:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r8 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh) r8
            int r1 = r7.size()
            int r2 = r8.size()
            r3 = 0
            if (r1 != r2) goto L4e
            int r2 = r7.zbb
            int r4 = r8.zbb
            if (r2 != r4) goto L41
            r4 = r3
        L21:
            if (r4 >= r2) goto L35
            java.util.Map$Entry r5 = r7.zbg(r4)
            java.util.Map$Entry r6 = r8.zbg(r4)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L32
            return r3
        L32:
            int r4 = r4 + 1
            goto L21
        L35:
            if (r2 == r1) goto L40
            java.util.Map r7 = r7.zbc
            java.util.Map r8 = r8.zbc
            boolean r7 = r7.equals(r8)
            return r7
        L40:
            return r0
        L41:
            java.util.Set r7 = r7.entrySet()
            java.util.Set r8 = r8.entrySet()
            boolean r7 = r7.equals(r8)
            return r7
        L4e:
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zbl(r2)
            if (r0 < 0) goto L13
            java.lang.Object[] r1 = r1.zba
            r1 = r1[r0]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r1
            java.lang.Object r1 = r1.getValue()
            return r1
        L13:
            java.util.Map r1 = r1.zbc
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r4 = this;
            int r0 = r4.zbb
            r1 = 0
            r2 = r1
        L4:
            if (r1 >= r0) goto L12
            java.lang.Object[] r3 = r4.zba
            r3 = r3[r1]
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L4
        L12:
            java.util.Map r0 = r4.zbc
            int r0 = r0.size()
            if (r0 <= 0) goto L22
            java.util.Map r4 = r4.zbc
            int r4 = r4.hashCode()
            int r4 = r4 + r2
            return r4
        L22:
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r0 = r0.zbf(r1, r2)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            r1.zbo()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.zbl(r2)
            if (r0 < 0) goto L10
            java.lang.Object r1 = r1.zbm(r0)
            return r1
        L10:
            java.util.Map r0 = r1.zbc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            r1 = 0
            return r1
        L1a:
            java.util.Map r1 = r1.zbc
            java.lang.Object r1 = r1.remove(r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r1 = this;
            int r0 = r1.zbb
            java.util.Map r1 = r1.zbc
            int r1 = r1.size()
            int r1 = r1 + r0
            return r1
    }

    public void zba() {
            r1 = this;
            boolean r0 = r1.zbd
            if (r0 != 0) goto L2d
            java.util.Map r0 = r1.zbc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            goto L15
        Lf:
            java.util.Map r0 = r1.zbc
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L15:
            r1.zbc = r0
            java.util.Map r0 = r1.zbf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            goto L28
        L22:
            java.util.Map r0 = r1.zbf
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L28:
            r1.zbf = r0
            r0 = 1
            r1.zbd = r0
        L2d:
            return
    }

    public final int zbc() {
            r0 = this;
            int r0 = r0.zbb
            return r0
    }

    public final java.lang.Iterable zbd() {
            r1 = this;
            java.util.Map r0 = r1.zbc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            return r1
        Lb:
            java.util.Map r1 = r1.zbc
            java.util.Set r1 = r1.entrySet()
            return r1
    }

    public final java.lang.Object zbf(java.lang.Comparable r5, java.lang.Object r6) {
            r4 = this;
            r4.zbo()
            int r0 = r4.zbl(r5)
            if (r0 < 0) goto L14
            java.lang.Object[] r4 = r4.zba
            r4 = r4[r0]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r4
            java.lang.Object r4 = r4.setValue(r6)
            return r4
        L14:
            r4.zbo()
            java.lang.Object[] r1 = r4.zba
            r2 = 16
            if (r1 != 0) goto L21
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r4.zba = r1
        L21:
            int r0 = r0 + 1
            int r0 = -r0
            if (r0 < r2) goto L2f
            java.util.SortedMap r4 = r4.zbn()
            java.lang.Object r4 = r4.put(r5, r6)
            return r4
        L2f:
            int r1 = r4.zbb
            if (r1 != r2) goto L4c
            java.lang.Object[] r1 = r4.zba
            r2 = 15
            r1 = r1[r2]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r1
            r4.zbb = r2
            java.util.SortedMap r2 = r4.zbn()
            java.lang.Comparable r3 = r1.zba()
            java.lang.Object r1 = r1.getValue()
            r2.put(r3, r1)
        L4c:
            java.lang.Object[] r1 = r4.zba
            int r2 = r0 + 1
            int r3 = r1.length
            int r3 = 15 - r0
            java.lang.System.arraycopy(r1, r0, r1, r2, r3)
            java.lang.Object[] r1 = r4.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r2 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb
            r2.<init>(r4, r5, r6)
            r1[r0] = r2
            int r5 = r4.zbb
            int r5 = r5 + 1
            r4.zbb = r5
            r4 = 0
            return r4
    }

    public final java.util.Map.Entry zbg(int r2) {
            r1 = this;
            int r0 = r1.zbb
            if (r2 >= r0) goto Lb
            java.lang.Object[] r1 = r1.zba
            r1 = r1[r2]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r1
            return r1
        Lb:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r2)
            throw r1
    }

    public final boolean zbj() {
            r0 = this;
            boolean r0 = r0.zbd
            return r0
    }
}
