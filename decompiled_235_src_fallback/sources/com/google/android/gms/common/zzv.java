package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzv extends com.google.android.gms.common.zzx {
    private final java.util.concurrent.Callable zze;

    public /* synthetic */ zzv(java.util.concurrent.Callable r8, com.google.android.gms.common.zzu r9) {
            r7 = this;
            r5 = 0
            r6 = 0
            r1 = 0
            r2 = 1
            r3 = 5
            r4 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.zze = r8
            return
    }

    @Override // com.google.android.gms.common.zzx
    public final java.lang.String zza() {
            r1 = this;
            java.util.concurrent.Callable r1 = r1.zze     // Catch: java.lang.Exception -> L9
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Exception -> L9
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }
}
