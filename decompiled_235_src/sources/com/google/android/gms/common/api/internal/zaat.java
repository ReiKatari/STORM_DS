package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ zaaw zaa;

    public /* synthetic */ zaat(zaaw zaawVar, zaas zaasVar) {
        this.zaa = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        ClientSettings clientSettings;
        oz7 oz7Var;
        clientSettings = this.zaa.zar;
        ClientSettings clientSettings2 = (ClientSettings) Preconditions.checkNotNull(clientSettings);
        oz7Var = this.zaa.zak;
        ((oz7) Preconditions.checkNotNull(oz7Var)).b(new zaar(this.zaa));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean zaI;
        Lock lock3;
        lock = this.zaa.zab;
        lock.lock();
        try {
            zaI = this.zaa.zaI(connectionResult);
            zaaw zaawVar = this.zaa;
            if (zaI) {
                zaawVar.zaA();
                this.zaa.zaF();
            } else {
                zaawVar.zaD(connectionResult);
            }
            lock3 = this.zaa.zab;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.zaa.zab;
            lock2.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
