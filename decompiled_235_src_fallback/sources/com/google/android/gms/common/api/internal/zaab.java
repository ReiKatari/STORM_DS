package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaab implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaad zab;

    public zaab(com.google.android.gms.common.api.internal.zaad r1, com.google.android.gms.common.api.internal.BasePendingResult r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zaad r1 = r0.zab
            java.util.Map r1 = com.google.android.gms.common.api.internal.zaad.zaa(r1)
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r0.zaa
            r1.remove(r0)
            return
    }
}
