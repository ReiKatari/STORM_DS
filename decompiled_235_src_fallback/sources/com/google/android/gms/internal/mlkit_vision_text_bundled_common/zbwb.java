package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwb implements java.util.Map.Entry, java.lang.Comparable {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh zba;
    private final java.lang.Comparable zbb;
    private java.lang.Object zbc;

    public zbwb(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r1, java.lang.Comparable r2, java.lang.Object r3) {
            r0 = this;
            r0.zba = r1
            r0.<init>()
            r0.zbb = r2
            r0.zbc = r3
            return
    }

    private static final boolean zbb(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 == 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r1
            java.lang.Comparable r1 = r1.zbb
            java.lang.Comparable r0 = r0.zbb
            int r0 = r0.compareTo(r1)
            return r0
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Comparable r1 = r4.zbb
            java.lang.Object r3 = r5.getKey()
            boolean r1 = zbb(r1, r3)
            if (r1 == 0) goto L25
            java.lang.Object r4 = r4.zbc
            java.lang.Object r5 = r5.getValue()
            boolean r4 = zbb(r4, r5)
            if (r4 == 0) goto L25
            return r0
        L25:
            return r2
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
            r0 = this;
            java.lang.Comparable r0 = r0.zbb
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.zbc
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            java.lang.Comparable r0 = r2.zbb
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            java.lang.Object r2 = r2.zbc
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            r2 = r0 ^ r1
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0 = r1.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh.zbi(r0)
            java.lang.Object r0 = r1.zbc
            r1.zbc = r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Comparable r0 = r2.zbb
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r2 = r2.zbc
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "="
            java.lang.String r2 = defpackage.lb1.m(r0, r1, r2)
            return r2
    }

    public final java.lang.Comparable zba() {
            r0 = this;
            java.lang.Comparable r0 = r0.zbb
            return r0
    }
}
