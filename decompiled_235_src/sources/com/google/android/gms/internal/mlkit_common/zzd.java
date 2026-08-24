package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzd extends zzk {
    @Override // com.google.android.gms.internal.mlkit_common.zzk
    public final int zza(Context context, zzj zzjVar, boolean z) {
        if (zzjVar.zza.getAuthority().lastIndexOf(64) >= 0 && mp2.p(context, "android.permission.INTERACT_ACROSS_USERS") == 0) {
            return 2;
        }
        return 3;
    }
}
