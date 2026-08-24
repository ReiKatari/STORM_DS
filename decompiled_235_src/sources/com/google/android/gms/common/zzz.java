package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzz {
    private String zza = null;
    private long zzb = -1;
    private s28 zzc;
    private s28 zzd;

    public zzz() {
        q28 q28Var = s28.B;
        t28 t28Var = t28.X;
        this.zzc = t28Var;
        this.zzd = t28Var;
    }

    public final zzz zza(long j) {
        this.zzb = j;
        return this;
    }

    public final zzz zzb(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = s28.j(list);
        return this;
    }

    public final zzz zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = s28.j(list);
        return this;
    }

    public final zzz zzd(String str) {
        this.zza = str;
        return this;
    }

    public final zzab zze() {
        if (this.zza != null) {
            if (this.zzb >= 0) {
                if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
                    i.m("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                    return null;
                }
                return new zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
            }
            i.m("minimumStampedVersionNumber must be greater than or equal to 0");
            return null;
        }
        i.m("packageName must be defined");
        return null;
    }
}
