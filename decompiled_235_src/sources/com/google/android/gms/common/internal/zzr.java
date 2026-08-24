package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzr implements Handler.Callback {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzr(zzs zzsVar, zzq zzqVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.zza.zzb;
            synchronized (hashMap) {
                try {
                    zzo zzoVar = (zzo) message.obj;
                    hashMap2 = this.zza.zzb;
                    zzp zzpVar = (zzp) hashMap2.get(zzoVar);
                    if (zzpVar != null && zzpVar.zzi()) {
                        if (zzpVar.zzj()) {
                            zzpVar.zzg("GmsClientSupervisor");
                        }
                        hashMap3 = this.zza.zzb;
                        hashMap3.remove(zzoVar);
                    }
                } finally {
                }
            }
            return true;
        } else if (i == 1) {
            hashMap4 = this.zza.zzb;
            synchronized (hashMap4) {
                try {
                    zzo zzoVar2 = (zzo) message.obj;
                    hashMap5 = this.zza.zzb;
                    zzp zzpVar2 = (zzp) hashMap5.get(zzoVar2);
                    if (zzpVar2 != null && zzpVar2.zza() == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(zzoVar2)), new Exception());
                        ComponentName zzb = zzpVar2.zzb();
                        if (zzb == null) {
                            zzb = zzoVar2.zza();
                        }
                        if (zzb == null) {
                            String zzc = zzoVar2.zzc();
                            Preconditions.checkNotNull(zzc);
                            zzb = new ComponentName(zzc, "unknown");
                        }
                        zzpVar2.onServiceDisconnected(zzb);
                    }
                } finally {
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
