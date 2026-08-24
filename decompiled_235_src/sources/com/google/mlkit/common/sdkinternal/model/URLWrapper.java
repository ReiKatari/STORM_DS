package com.google.mlkit.common.sdkinternal.model;

import java.net.URL;
import java.net.URLConnection;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class URLWrapper {
    private final URL zza;

    public URLWrapper(String str) {
        this.zza = new URL(str);
    }

    public URLConnection openConnection() {
        return this.zza.openConnection();
    }
}
