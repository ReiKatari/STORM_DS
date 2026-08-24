package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzah {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzag zzc;

    public final zzah zza(Object obj, Object obj2) {
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzaa.zza(length, i2));
        }
        zzw.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i3 = this.zzb;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.zzb = i3 + 1;
        return this;
    }

    public final zzai zzb() {
        zzag zzagVar = this.zzc;
        if (zzagVar == null) {
            zzaq zzg = zzaq.zzg(this.zzb, this.zza, this);
            zzag zzagVar2 = this.zzc;
            if (zzagVar2 == null) {
                return zzg;
            }
            throw zzagVar2.zza();
        }
        throw zzagVar.zza();
    }
}
