package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zabc extends defpackage.b08 {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zaa;

    public zabc(com.google.android.gms.common.api.internal.zabe r1, android.os.Looper r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r2) {
            r1 = this;
            int r2 = r2.what
            r0 = 1
            if (r2 == r0) goto L22
            r0 = 2
            if (r2 == r0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown message id: "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GoogleApiClientImpl"
            android.util.Log.w(r2, r1)
            return
        L1c:
            com.google.android.gms.common.api.internal.zabe r1 = r1.zaa
            com.google.android.gms.common.api.internal.zabe.zai(r1)
            return
        L22:
            com.google.android.gms.common.api.internal.zabe r1 = r1.zaa
            com.google.android.gms.common.api.internal.zabe.zaj(r1)
            return
    }
}
