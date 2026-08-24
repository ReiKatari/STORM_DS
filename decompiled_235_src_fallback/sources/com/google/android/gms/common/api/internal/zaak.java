package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaak implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;

    public zaak(com.google.android.gms.common.api.internal.zaaw r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            com.google.android.gms.common.api.internal.zaaw r1 = r1.zaa
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.api.internal.zaaw.zaf(r1)
            android.content.Context r1 = com.google.android.gms.common.api.internal.zaaw.zac(r1)
            r0.cancelAvailabilityErrorNotifications(r1)
            return
    }
}
