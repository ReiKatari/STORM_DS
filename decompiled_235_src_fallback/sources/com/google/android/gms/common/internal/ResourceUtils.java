package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ResourceUtils {
    private static final android.net.Uri zza = null;

    static {
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "android.resource"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "com.google.android.gms"
            android.net.Uri$Builder r0 = r0.authority(r1)
            java.lang.String r1 = "drawable"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            android.net.Uri r0 = r0.build()
            com.google.android.gms.common.internal.ResourceUtils.zza = r0
            return
    }

    private ResourceUtils() {
            r0 = this;
            r0.<init>()
            return
    }
}
