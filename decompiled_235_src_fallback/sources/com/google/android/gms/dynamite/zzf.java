package com.google.android.gms.dynamite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzf implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    public zzf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r3, java.lang.String r4, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r5) {
            r2 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r2 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r2.<init>()
            r0 = 1
            int r1 = r5.zzb(r3, r4, r0)
            r2.remoteVersion = r1
            if (r1 == 0) goto L11
            r2.selection = r0
            return r2
        L11:
            int r3 = r5.zza(r3, r4)
            r2.localVersion = r3
            if (r3 == 0) goto L1c
            r3 = -1
            r2.selection = r3
        L1c:
            return r2
    }
}
