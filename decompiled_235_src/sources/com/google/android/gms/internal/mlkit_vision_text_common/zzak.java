package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class zzak extends zzai implements List {
    final /* synthetic */ zzal zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzal zzalVar, Object obj, List list, zzai zzaiVar) {
        super(zzalVar, obj, list, zzaiVar);
        this.zzf = zzalVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzal zzalVar = this.zzf;
        i2 = zzalVar.zzb;
        zzalVar.zzb = i2 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzal zzalVar = this.zzf;
            i2 = zzalVar.zzb;
            zzalVar.zzb = i2 + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzaj(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zzb();
        Object remove = ((List) this.zzb).remove(i);
        zzal zzalVar = this.zzf;
        i2 = zzalVar.zzb;
        zzalVar.zzb = i2 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List subList = ((List) this.zzb).subList(i, i2);
        zzai zzaiVar = this.zzc;
        if (zzaiVar == null) {
            zzaiVar = this;
        }
        return this.zzf.zzf(this.zza, subList, zzaiVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzaj(this, i);
    }
}
