package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzam implements java.util.Map.Entry {
    public zzam() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L25
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r2 = r4.getKey()
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzw.zza(r0, r2)
            if (r0 == 0) goto L25
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r4 = r4.getValue()
            boolean r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzw.zza(r3, r4)
            if (r3 == 0) goto L25
            r3 = 1
            return r3
        L25:
            return r1
    }

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getKey();

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1 = 0
            if (r0 != 0) goto Ld
            r0 = r1
            goto L11
        Ld:
            int r0 = r0.hashCode()
        L11:
            if (r2 != 0) goto L14
            goto L18
        L14:
            int r1 = r2.hashCode()
        L18:
            r2 = r0 ^ r1
            return r2
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "="
            java.lang.String r2 = defpackage.lb1.m(r0, r1, r2)
            return r2
    }
}
