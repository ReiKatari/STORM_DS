package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzal extends zzan implements Serializable {
    private transient Map zza;
    private transient int zzb;

    public zzal(Map map) {
        if (map.isEmpty()) {
            this.zza = map;
        } else {
            u34.t();
            throw null;
        }
    }

    public static /* bridge */ /* synthetic */ int zzd(zzal zzalVar) {
        return zzalVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzg(zzal zzalVar) {
        return zzalVar.zza;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzal zzalVar, int i) {
        zzalVar.zzb = i;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzal zzalVar, Object obj) {
        Object obj2;
        Map map = zzalVar.zza;
        map.getClass();
        try {
            obj2 = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzalVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zze(Object obj) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            collection = zza();
        }
        return zzb(obj, collection);
    }

    public final List zzf(Object obj, List list, zzai zzaiVar) {
        if (list instanceof RandomAccess) {
            return new zzag(this, obj, list, zzaiVar);
        }
        return new zzak(this, obj, list, zzaiVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan
    public final Map zzh() {
        return new zzad(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan
    public final Set zzi() {
        return new zzaf(this, this.zza);
    }

    public final void zzl() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan, com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final boolean zzm(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }
}
