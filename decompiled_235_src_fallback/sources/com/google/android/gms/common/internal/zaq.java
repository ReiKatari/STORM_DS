package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaq implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    final /* synthetic */ com.google.android.gms.common.api.Response zaa;

    public zaq(com.google.android.gms.common.api.Response r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result r2) {
            r1 = this;
            com.google.android.gms.common.api.Response r0 = r1.zaa
            r0.setResult(r2)
            com.google.android.gms.common.api.Response r1 = r1.zaa
            return r1
    }
}
