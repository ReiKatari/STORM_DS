package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzf extends zza {
    public final IBinder zze;
    final /* synthetic */ BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(ConnectionResult connectionResult) {
        if (this.zzf.zzx != null) {
            this.zzf.zzx.onConnectionFailed(connectionResult);
        }
        this.zzf.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zzd() {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            boolean equals = this.zzf.getServiceDescriptor().equals(interfaceDescriptor);
            BaseGmsClient baseGmsClient = this.zzf;
            if (!equals) {
                lb1.w("service descriptor mismatch: ", baseGmsClient.getServiceDescriptor(), " vs. ", interfaceDescriptor, "GmsClient");
                return false;
            }
            IInterface createServiceInterface = baseGmsClient.createServiceInterface(this.zze);
            if (createServiceInterface != null && (BaseGmsClient.zzn(this.zzf, 2, 4, createServiceInterface) || BaseGmsClient.zzn(this.zzf, 3, 4, createServiceInterface))) {
                this.zzf.zzB = null;
                BaseGmsClient baseGmsClient2 = this.zzf;
                Bundle connectionHint = baseGmsClient2.getConnectionHint();
                baseConnectionCallbacks = baseGmsClient2.zzw;
                if (baseConnectionCallbacks != null) {
                    baseConnectionCallbacks2 = this.zzf.zzw;
                    baseConnectionCallbacks2.onConnected(connectionHint);
                    return true;
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
