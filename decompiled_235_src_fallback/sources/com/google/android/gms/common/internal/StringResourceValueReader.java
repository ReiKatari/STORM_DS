package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class StringResourceValueReader {
    private final android.content.res.Resources zza;
    private final java.lang.String zzb;

    public StringResourceValueReader(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.content.res.Resources r2 = r2.getResources()
            r1.zza = r2
            int r0 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue
            java.lang.String r2 = r2.getResourcePackageName(r0)
            r1.zzb = r2
            return
    }

    public java.lang.String getString(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.zzb
            android.content.res.Resources r1 = r3.zza
            java.lang.String r2 = "string"
            int r4 = r1.getIdentifier(r4, r2, r0)
            if (r4 != 0) goto Le
            r3 = 0
            return r3
        Le:
            android.content.res.Resources r3 = r3.zza
            java.lang.String r3 = r3.getString(r4)
            return r3
    }
}
