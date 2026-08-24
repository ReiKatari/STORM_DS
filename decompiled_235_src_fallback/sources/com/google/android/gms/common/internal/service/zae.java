package com.google.android.gms.common.internal.service;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zae {
    public zae() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.common.api.PendingResult zaa(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.common.internal.service.zac r0 = new com.google.android.gms.common.internal.service.zac
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r1 = r2.execute(r0)
            return r1
    }
}
