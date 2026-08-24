package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzdb implements z32 {
    public static final /* synthetic */ int zza = 0;
    private static final qh4 zzb = new qh4() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzda
        @Override // defpackage.y32
        public final void encode(Object obj, Object obj2) {
            rh4 rh4Var = (rh4) obj2;
            int i = zzdb.zza;
            throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final qh4 zze = zzb;

    @Override // defpackage.z32
    public final /* bridge */ /* synthetic */ z32 registerEncoder(Class cls, qh4 qh4Var) {
        this.zzc.put(cls, qh4Var);
        this.zzd.remove(cls);
        return this;
    }

    public final zzdc zza() {
        return new zzdc(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    public final /* bridge */ /* synthetic */ z32 registerEncoder(Class cls, lk7 lk7Var) {
        this.zzd.put(cls, lk7Var);
        this.zzc.remove(cls);
        return this;
    }
}
