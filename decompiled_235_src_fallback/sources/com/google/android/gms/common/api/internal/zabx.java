package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zabx extends android.content.BroadcastReceiver {
    android.content.Context zaa;
    private final com.google.android.gms.common.api.internal.zabw zab;

    public zabx(com.google.android.gms.common.api.internal.zabw r1) {
            r0 = this;
            r0.<init>()
            r0.zab = r1
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            android.net.Uri r1 = r2.getData()
            if (r1 == 0) goto Lb
            java.lang.String r1 = r1.getSchemeSpecificPart()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1c
            com.google.android.gms.common.api.internal.zabw r1 = r0.zab
            r1.zaa()
            r0.zab()
        L1c:
            return
    }

    public final void zaa(android.content.Context r1) {
            r0 = this;
            r0.zaa = r1
            return
    }

    public final synchronized void zab() {
            r1 = this;
            monitor-enter(r1)
            android.content.Context r0 = r1.zaa     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.unregisterReceiver(r1)     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r0 = move-exception
            goto L10
        Lb:
            r0 = 0
            r1.zaa = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }
}
