package com.google.android.gms.dynamite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zze implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions {
    public zze() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            int r0 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(android.content.Context r1, java.lang.String r2, boolean r3) {
            r0 = this;
            int r0 = com.google.android.gms.dynamite.DynamiteModule.zza(r1, r2, r3)
            return r0
    }
}
