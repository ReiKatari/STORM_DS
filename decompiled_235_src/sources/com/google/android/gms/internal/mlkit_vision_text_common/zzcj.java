package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzcj extends zzbm {
    final transient Object[] zza;

    private zzcj(Object obj, Object[] objArr, int i) {
        this.zza = objArr;
    }

    public static zzcj zzg(int i, Object[] objArr, zzbl zzblVar) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        zzaq.zzb(obj, obj2);
        return new zzcj(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.zza;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
                if (obj2 != null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final zzbf zza() {
        return new zzci(this.zza, 1, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final zzbn zzd() {
        return new zzcg(this, this.zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final zzbn zze() {
        return new zzch(this, new zzci(this.zza, 0, 1));
    }
}
