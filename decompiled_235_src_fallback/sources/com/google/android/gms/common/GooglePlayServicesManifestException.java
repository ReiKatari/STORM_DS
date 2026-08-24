package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends java.lang.IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.zza = r1
            return
    }

    public int getActualVersion() {
            r0 = this;
            int r0 = r0.zza
            return r0
    }

    public int getExpectedVersion() {
            r0 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            return r0
    }
}
