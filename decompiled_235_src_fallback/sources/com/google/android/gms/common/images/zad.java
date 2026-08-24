package com.google.android.gms.common.images;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zad {
    public final android.net.Uri zaa;

    public zad(android.net.Uri r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.common.images.zad
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            com.google.android.gms.common.images.zad r2 = (com.google.android.gms.common.images.zad) r2
            android.net.Uri r2 = r2.zaa
            android.net.Uri r1 = r1.zaa
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r2, r1)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            android.net.Uri r0 = r0.zaa
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }
}
