package com.google.android.gms.internal.mlkit_vision_common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzan {
    private final Map zza;
    private final Map zzb;
    private final qh4 zzc;

    public zzan(Map map, Map map2, qh4 qh4Var) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = qh4Var;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzak(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
