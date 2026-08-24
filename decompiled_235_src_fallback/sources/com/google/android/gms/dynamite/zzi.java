package com.google.android.gms.dynamite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzi implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    public zzi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r2, java.lang.String r3, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r4) {
            r1 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r1 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r1.<init>()
            int r0 = r4.zza(r2, r3)
            r1.localVersion = r0
            r0 = 1
            int r2 = r4.zzb(r2, r3, r0)
            r1.remoteVersion = r2
            int r3 = r1.localVersion
            if (r3 != 0) goto L1b
            r3 = 0
            if (r2 != 0) goto L1b
            r0 = r3
            goto L1e
        L1b:
            if (r3 < r2) goto L1e
            r0 = -1
        L1e:
            r1.selection = r0
            return r1
    }
}
