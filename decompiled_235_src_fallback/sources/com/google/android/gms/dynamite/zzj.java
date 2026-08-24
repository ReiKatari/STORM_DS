package com.google.android.gms.dynamite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzj implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    public zzj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r4, java.lang.String r5, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r6) {
            r3 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r3 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r3.<init>()
            int r0 = r6.zza(r4, r5)
            r3.localVersion = r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            int r4 = r6.zzb(r4, r5, r2)
            r3.remoteVersion = r4
            goto L1c
        L16:
            int r4 = r6.zzb(r4, r5, r1)
            r3.remoteVersion = r4
        L1c:
            int r5 = r3.localVersion
            if (r5 != 0) goto L24
            if (r4 != 0) goto L25
            r1 = r2
            goto L28
        L24:
            r2 = r5
        L25:
            if (r2 < r4) goto L28
            r1 = -1
        L28:
            r3.selection = r1
            return r3
    }
}
