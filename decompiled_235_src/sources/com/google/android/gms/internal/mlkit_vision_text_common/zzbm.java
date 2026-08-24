package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzbm implements Map, Serializable {
    private transient zzbn zza;
    private transient zzbn zzb;
    private transient zzbf zzc;

    public static zzbm zzc(Object obj, Object obj2) {
        zzaq.zzb("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
        return zzcj.zzg(1, new Object[]{"optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzcl.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzbn zzbnVar = this.zzb;
        if (zzbnVar == null) {
            zzbn zze = zze();
            this.zzb = zze;
            return zze;
        }
        return zzbnVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzaq.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzbf zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzbf values() {
        zzbf zzbfVar = this.zzc;
        if (zzbfVar == null) {
            zzbf zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzbfVar;
    }

    public abstract zzbn zzd();

    public abstract zzbn zze();

    @Override // java.util.Map
    /* renamed from: zzf */
    public final zzbn entrySet() {
        zzbn zzbnVar = this.zza;
        if (zzbnVar == null) {
            zzbn zzd = zzd();
            this.zza = zzd;
            return zzd;
        }
        return zzbnVar;
    }
}
