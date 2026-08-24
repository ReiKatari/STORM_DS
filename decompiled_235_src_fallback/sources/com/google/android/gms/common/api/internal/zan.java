package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zan extends com.google.android.gms.common.api.internal.zabw {
    final /* synthetic */ android.app.Dialog zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zao zab;

    public zan(com.google.android.gms.common.api.internal.zao r1, android.app.Dialog r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
            r1 = this;
            com.google.android.gms.common.api.internal.zao r0 = r1.zab
            com.google.android.gms.common.api.internal.zap r0 = r0.zaa
            com.google.android.gms.common.api.internal.zap.zag(r0)
            android.app.Dialog r0 = r1.zaa
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L14
            android.app.Dialog r1 = r1.zaa
            r1.dismiss()
        L14:
            return
    }
}
