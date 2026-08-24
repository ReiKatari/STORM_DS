package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zacx implements com.google.android.gms.tasks.Continuation {
    public zacx() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task r3) {
            r2 = this;
            java.lang.Object r2 = r3.getResult()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Le
            r2 = 0
            return r2
        Le:
            com.google.android.gms.common.api.ApiException r2 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            r0 = 13
            java.lang.String r1 = "listener already unregistered"
            r3.<init>(r0, r1)
            r2.<init>(r3)
            throw r2
    }
}
