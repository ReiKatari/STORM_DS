package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzbu {
    public static List zza(List list, zzu zzuVar) {
        if (list instanceof RandomAccess) {
            return new zzbr(list, zzuVar);
        }
        return new zzbt(list, zzuVar);
    }
}
