package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zabh extends defpackage.b08 {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabi zaa;

    public zabh(com.google.android.gms.common.api.internal.zabi r1, android.os.Looper r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            int r0 = r3.what
            r1 = 1
            if (r0 == r1) goto L21
            r2 = 2
            if (r0 == r2) goto L1c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown message id: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GACStateManager"
            android.util.Log.w(r3, r2)
            return
        L1c:
            java.lang.Object r2 = r3.obj
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L21:
            java.lang.Object r3 = r3.obj
            com.google.android.gms.common.api.internal.zabg r3 = (com.google.android.gms.common.api.internal.zabg) r3
            com.google.android.gms.common.api.internal.zabi r2 = r2.zaa
            r3.zab(r2)
            return
    }
}
