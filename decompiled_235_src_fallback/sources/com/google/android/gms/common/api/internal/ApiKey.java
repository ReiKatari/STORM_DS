package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.ApiOptions;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ApiKey<O extends com.google.android.gms.common.api.Api.ApiOptions> {
    private final int zaa;
    private final com.google.android.gms.common.api.Api zab;
    private final com.google.android.gms.common.api.Api.ApiOptions zac;
    private final java.lang.String zad;

    private ApiKey(com.google.android.gms.common.api.Api r1, com.google.android.gms.common.api.Api.ApiOptions r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.zab = r1
            r0.zac = r2
            r0.zad = r3
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            int r1 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            r0.zaa = r1
            return
    }

    public static <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.common.api.internal.ApiKey<O> getSharedApiKey(com.google.android.gms.common.api.Api<O> r1, O r2, java.lang.String r3) {
            com.google.android.gms.common.api.internal.ApiKey r0 = new com.google.android.gms.common.api.internal.ApiKey
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r4) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.common.api.internal.ApiKey
            if (r2 != 0) goto Ld
            return r0
        Ld:
            com.google.android.gms.common.api.internal.ApiKey r5 = (com.google.android.gms.common.api.internal.ApiKey) r5
            com.google.android.gms.common.api.Api r2 = r4.zab
            com.google.android.gms.common.api.Api r3 = r5.zab
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L2e
            com.google.android.gms.common.api.Api$ApiOptions r2 = r4.zac
            com.google.android.gms.common.api.Api$ApiOptions r3 = r5.zac
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L2e
            java.lang.String r4 = r4.zad
            java.lang.String r5 = r5.zad
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r5)
            if (r4 == 0) goto L2e
            return r1
        L2e:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.zaa
            return r0
    }

    public final java.lang.String zaa() {
            r0 = this;
            com.google.android.gms.common.api.Api r0 = r0.zab
            java.lang.String r0 = r0.zad()
            return r0
    }
}
