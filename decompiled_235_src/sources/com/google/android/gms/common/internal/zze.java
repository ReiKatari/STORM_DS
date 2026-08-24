package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zze implements ServiceConnection {
    final /* synthetic */ BaseGmsClient zza;
    private final int zzb;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        IGmsServiceBroker zzadVar;
        BaseGmsClient baseGmsClient = this.zza;
        if (iBinder != null) {
            obj = baseGmsClient.zzq;
            synchronized (obj) {
                try {
                    BaseGmsClient baseGmsClient2 = this.zza;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof IGmsServiceBroker)) {
                        zzadVar = (IGmsServiceBroker) queryLocalInterface;
                    } else {
                        zzadVar = new zzad(iBinder);
                    }
                    baseGmsClient2.zzr = zzadVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.zza.zzl(0, null, this.zzb);
            return;
        }
        BaseGmsClient.zzk(baseGmsClient, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.zza.zzq;
        synchronized (obj) {
            this.zza.zzr = null;
        }
        BaseGmsClient baseGmsClient = this.zza;
        int i = this.zzb;
        Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
