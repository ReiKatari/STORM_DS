package com.google.android.gms.common.internal.service;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zad extends com.google.android.gms.common.internal.service.zaa {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zaa;

    public zad(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void zab(int r2) {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r1 = r1.zaa
            r1.setResult(r0)
            return
    }
}
