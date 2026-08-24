package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zar extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;

    public zar(com.google.android.gms.common.moduleinstall.internal.zay r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zae(com.google.android.gms.common.api.Status r1, com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse r2) {
            r0 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zaa
            com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(r1, r2, r0)
            return
    }
}
