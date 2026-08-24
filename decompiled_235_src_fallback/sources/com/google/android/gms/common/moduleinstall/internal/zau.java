package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zau extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zaa;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zab;
    final /* synthetic */ com.google.android.gms.common.moduleinstall.InstallStatusListener zac;
    final /* synthetic */ com.google.android.gms.common.moduleinstall.internal.zay zad;

    public zau(com.google.android.gms.common.moduleinstall.internal.zay r1, java.util.concurrent.atomic.AtomicReference r2, com.google.android.gms.tasks.TaskCompletionSource r3, com.google.android.gms.common.moduleinstall.InstallStatusListener r4) {
            r0 = this;
            r0.zad = r1
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(com.google.android.gms.common.api.Status r3, com.google.android.gms.common.moduleinstall.ModuleInstallResponse r4) {
            r2 = this;
            if (r4 == 0) goto L7
            java.util.concurrent.atomic.AtomicReference r0 = r2.zaa
            r0.set(r4)
        L7:
            r0 = 0
            com.google.android.gms.tasks.TaskCompletionSource r1 = r2.zab
            com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(r3, r0, r1)
            boolean r3 = r3.isSuccess()
            if (r3 == 0) goto L1d
            if (r4 == 0) goto L1c
            boolean r3 = r4.zaa()
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            com.google.android.gms.common.moduleinstall.internal.zay r3 = r2.zad
            com.google.android.gms.common.moduleinstall.InstallStatusListener r2 = r2.zac
            java.lang.String r4 = "InstallStatusListener"
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(r2, r4)
            r4 = 27306(0x6aaa, float:3.8264E-41)
            r3.doUnregisterEventListener(r2, r4)
            return
    }
}
