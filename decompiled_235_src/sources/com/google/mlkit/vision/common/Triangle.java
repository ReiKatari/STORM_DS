package com.google.mlkit.vision.common;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Triangle<T> {
    private final zzp zza;

    public Triangle(T t, T t2, T t3) {
        this.zza = zzp.zzj(t, t2, t3);
    }

    public List<T> getAllPoints() {
        return this.zza;
    }
}
