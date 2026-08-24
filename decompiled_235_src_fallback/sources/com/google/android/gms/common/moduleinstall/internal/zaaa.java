package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaaa implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier {
    final /* synthetic */ com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate zaa;

    public zaaa(com.google.android.gms.common.moduleinstall.internal.zaab r1, com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.common.moduleinstall.InstallStatusListener r1 = (com.google.android.gms.common.moduleinstall.InstallStatusListener) r1
            com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate r0 = r0.zaa
            r1.onInstallStatusUpdated(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
            r0 = this;
            return
    }
}
