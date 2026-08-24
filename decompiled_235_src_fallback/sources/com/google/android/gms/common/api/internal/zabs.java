package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zabs {
    private final com.google.android.gms.common.api.internal.ApiKey zaa;
    private final com.google.android.gms.common.Feature zab;

    public /* synthetic */ zabs(com.google.android.gms.common.api.internal.ApiKey r1, com.google.android.gms.common.Feature r2, com.google.android.gms.common.api.internal.zabr r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.Feature zaa(com.google.android.gms.common.api.internal.zabs r0) {
            com.google.android.gms.common.Feature r0 = r0.zab
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.ApiKey zab(com.google.android.gms.common.api.internal.zabs r0) {
            com.google.android.gms.common.api.internal.ApiKey r0 = r0.zaa
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1f
            boolean r1 = r4 instanceof com.google.android.gms.common.api.internal.zabs
            if (r1 == 0) goto L1f
            com.google.android.gms.common.api.internal.zabs r4 = (com.google.android.gms.common.api.internal.zabs) r4
            com.google.android.gms.common.api.internal.ApiKey r1 = r3.zaa
            com.google.android.gms.common.api.internal.ApiKey r2 = r4.zaa
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r2)
            if (r1 == 0) goto L1f
            com.google.android.gms.common.Feature r3 = r3.zab
            com.google.android.gms.common.Feature r4 = r4.zab
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r4)
            if (r3 == 0) goto L1f
            r3 = 1
            return r3
        L1f:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.common.api.internal.ApiKey r0 = r1.zaa
            com.google.android.gms.common.Feature r1 = r1.zab
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            int r1 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = "key"
            com.google.android.gms.common.api.internal.ApiKey r2 = r3.zaa
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r1, r2)
            java.lang.String r1 = "feature"
            com.google.android.gms.common.Feature r3 = r3.zab
            com.google.android.gms.common.internal.Objects$ToStringHelper r3 = r0.add(r1, r3)
            java.lang.String r3 = r3.toString()
            return r3
    }
}
