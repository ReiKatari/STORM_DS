package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzd extends com.google.android.gms.internal.mlkit_common.zzk {
    public zzd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzk
    public final int zza(android.content.Context r1, com.google.android.gms.internal.mlkit_common.zzj r2, boolean r3) {
            r0 = this;
            android.net.Uri r0 = r2.zza
            java.lang.String r0 = r0.getAuthority()
            r2 = 64
            int r0 = r0.lastIndexOf(r2)
            if (r0 < 0) goto L18
            java.lang.String r0 = "android.permission.INTERACT_ACROSS_USERS"
            int r0 = defpackage.mp2.p(r1, r0)
            if (r0 != 0) goto L18
            r0 = 2
            return r0
        L18:
            r0 = 3
            return r0
    }
}
