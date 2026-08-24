package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class zzai extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzai zzc;
    final Collection zzd;
    final /* synthetic */ zzal zze;

    public zzai(zzal zzalVar, Object obj, Collection collection, zzai zzaiVar) {
        Collection collection2;
        this.zze = zzalVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzaiVar;
        if (zzaiVar == null) {
            collection2 = null;
        } else {
            collection2 = zzaiVar.zzb;
        }
        this.zzd = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzal zzalVar = this.zze;
            zzal.zzj(zzalVar, zzal.zzd(zzalVar) + 1);
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzal zzalVar = this.zze;
            zzal.zzj(zzalVar, zzal.zzd(zzalVar) + (size2 - size));
            if (size == 0) {
                zza();
                return true;
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzal zzalVar = this.zze;
        zzal.zzj(zzalVar, zzal.zzd(zzalVar) - size);
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzah(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzal zzalVar = this.zze;
            zzal.zzj(zzalVar, zzal.zzd(zzalVar) - 1);
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzal zzalVar = this.zze;
            zzal.zzj(zzalVar, zzal.zzd(zzalVar) + (size2 - size));
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzal zzalVar = this.zze;
            zzal.zzj(zzalVar, zzal.zzd(zzalVar) + (size2 - size));
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    public final void zza() {
        zzai zzaiVar = this.zzc;
        if (zzaiVar != null) {
            zzaiVar.zza();
            return;
        }
        zzal zzalVar = this.zze;
        zzal.zzg(zzalVar).put(this.zza, this.zzb);
    }

    public final void zzb() {
        zzai zzaiVar = this.zzc;
        if (zzaiVar != null) {
            zzaiVar.zzb();
            zzai zzaiVar2 = this.zzc;
            if (zzaiVar2.zzb != this.zzd) {
                i.l();
            }
        } else if (this.zzb.isEmpty()) {
            zzal zzalVar = this.zze;
            Collection collection = (Collection) zzal.zzg(zzalVar).get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    public final void zzc() {
        zzai zzaiVar = this.zzc;
        if (zzaiVar != null) {
            zzaiVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzal zzalVar = this.zze;
            zzal.zzg(zzalVar).remove(this.zza);
        }
    }
}
