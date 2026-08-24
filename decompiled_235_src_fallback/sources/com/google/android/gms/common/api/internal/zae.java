package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zae extends com.google.android.gms.common.api.internal.zai {
    protected final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa;

    public zae(int r1, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r2) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "Null methods are not runnable."
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r1 = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) r1
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r1 = r1.zaa     // Catch: java.lang.IllegalStateException -> L6
            r1.setFailedResult(r2)     // Catch: java.lang.IllegalStateException -> L6
            return
        L6:
            r1 = move-exception
            java.lang.String r2 = "ApiCallRunner"
            java.lang.String r0 = "Exception reporting failure"
            android.util.Log.w(r2, r0, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception r4) {
            r3 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r4 = r4.getLocalizedMessage()
            java.lang.String r2 = ": "
            java.lang.String r4 = defpackage.lb1.m(r1, r2, r4)
            r1 = 10
            r0.<init>(r1, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.zaa     // Catch: java.lang.IllegalStateException -> L1f
            r3.setFailedResult(r0)     // Catch: java.lang.IllegalStateException -> L1f
            return
        L1f:
            r3 = move-exception
            java.lang.String r4 = "ApiCallRunner"
            java.lang.String r0 = "Exception reporting failure"
            android.util.Log.w(r4, r0, r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = r1.zaa     // Catch: java.lang.RuntimeException -> La
            com.google.android.gms.common.api.Api$Client r2 = r2.zaf()     // Catch: java.lang.RuntimeException -> La
            r0.run(r2)     // Catch: java.lang.RuntimeException -> La
            return
        La:
            r2 = move-exception
            r1.zae(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(com.google.android.gms.common.api.internal.zaad r1, boolean r2) {
            r0 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = r0.zaa
            r1.zac(r0, r2)
            return
    }
}
