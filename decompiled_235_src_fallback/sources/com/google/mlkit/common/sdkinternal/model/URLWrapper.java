package com.google.mlkit.common.sdkinternal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class URLWrapper {
    private final java.net.URL zza;

    public URLWrapper(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.net.URL r0 = new java.net.URL
            r0.<init>(r2)
            r1.zza = r0
            return
    }

    public java.net.URLConnection openConnection() {
            r0 = this;
            java.net.URL r0 = r0.zza
            java.net.URLConnection r0 = r0.openConnection()
            return r0
    }
}
