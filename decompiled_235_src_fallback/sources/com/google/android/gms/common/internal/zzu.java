package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzu {
    private static final android.net.Uri zza = null;
    private static final android.net.Uri zzb = null;

    static {
            java.lang.String r0 = "https://plus.google.com/"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.gms.common.internal.zzu.zza = r0
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "circles"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "find"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            android.net.Uri r0 = r0.build()
            com.google.android.gms.common.internal.zzu.zzb = r0
            return
    }
}
