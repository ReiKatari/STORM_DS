package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zas extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;

    public zas(com.google.android.gms.common.moduleinstall.internal.zay r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zab(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.tasks.TaskCompletionSource r1 = r1.zaa
            com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(r2, r0, r1)
            return
    }
}
