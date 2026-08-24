package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaab extends com.google.android.gms.common.moduleinstall.internal.zag {
    private final com.google.android.gms.common.api.internal.ListenerHolder zaa;

    public zaab(com.google.android.gms.common.api.internal.ListenerHolder r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zah
    public final void zab(com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate r2) {
            r1 = this;
            com.google.android.gms.common.moduleinstall.internal.zaaa r0 = new com.google.android.gms.common.moduleinstall.internal.zaaa
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.ListenerHolder r1 = r1.zaa
            r1.notifyListener(r0)
            return
    }
}
