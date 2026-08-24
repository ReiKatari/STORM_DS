package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaaw implements zabf {
    private final zabi zaa;
    private final Lock zab;
    private final Context zac;
    private final GoogleApiAvailabilityLight zad;
    private ConnectionResult zae;
    private int zaf;
    private int zah;
    private oz7 zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private IAccountAccessor zao;
    private boolean zap;
    private boolean zaq;
    private final ClientSettings zar;
    private final Map zas;
    private final Api.AbstractClientBuilder zat;
    private int zag = 0;
    private final Bundle zai = new Bundle();
    private final Set zaj = new HashSet();
    private final ArrayList zau = new ArrayList();

    public zaaw(zabi zabiVar, ClientSettings clientSettings, Map map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder abstractClientBuilder, Lock lock, Context context) {
        this.zaa = zabiVar;
        this.zar = clientSettings;
        this.zas = map;
        this.zad = googleApiAvailabilityLight;
        this.zat = abstractClientBuilder;
        this.zab = lock;
        this.zac = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaA() {
        this.zam = false;
        this.zaa.zag.zad = Collections.EMPTY_SET;
        for (Api.AnyClientKey anyClientKey : this.zaj) {
            if (!this.zaa.zab.containsKey(anyClientKey)) {
                zabi zabiVar = this.zaa;
                zabiVar.zab.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    private final void zaB(boolean z) {
        oz7 oz7Var = this.zak;
        if (oz7Var != null) {
            if (oz7Var.isConnected() && z) {
                oz7Var.zaa();
            }
            oz7Var.disconnect();
            ClientSettings clientSettings = (ClientSettings) Preconditions.checkNotNull(this.zar);
            this.zao = null;
        }
    }

    private final void zaC() {
        Bundle bundle;
        this.zaa.zai();
        zabj.zaa().execute(new zaak(this));
        oz7 oz7Var = this.zak;
        if (oz7Var != null) {
            if (this.zap) {
                oz7Var.a((IAccountAccessor) Preconditions.checkNotNull(this.zao), this.zaq);
            }
            zaB(false);
        }
        for (Api.AnyClientKey anyClientKey : this.zaa.zab.keySet()) {
            ((Api.Client) Preconditions.checkNotNull((Api.Client) this.zaa.zaa.get(anyClientKey))).disconnect();
        }
        if (this.zai.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.zai;
        }
        this.zaa.zah.zab(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaD(ConnectionResult connectionResult) {
        zaz();
        zaB(!connectionResult.hasResolution());
        this.zaa.zak(connectionResult);
        this.zaa.zah.zaa(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaE(ConnectionResult connectionResult, Api api, boolean z) {
        int priority = api.zac().getPriority();
        if ((!z || connectionResult.hasResolution() || this.zad.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) && (this.zae == null || priority < this.zaf)) {
            this.zae = connectionResult;
            this.zaf = priority;
        }
        zabi zabiVar = this.zaa;
        zabiVar.zab.put(api.zab(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaF() {
        if (this.zah == 0) {
            if (!this.zam || this.zan) {
                ArrayList arrayList = new ArrayList();
                this.zag = 1;
                this.zah = this.zaa.zaa.size();
                for (Api.AnyClientKey anyClientKey : this.zaa.zaa.keySet()) {
                    if (this.zaa.zab.containsKey(anyClientKey)) {
                        if (zaH()) {
                            zaC();
                        }
                    } else {
                        arrayList.add((Api.Client) this.zaa.zaa.get(anyClientKey));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.zau.add(zabj.zaa().submit(new zaap(this, arrayList)));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaG(int i) {
        if (this.zag != i) {
            Log.w("GACConnecting", this.zaa.zag.zaf());
            Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
            int i2 = this.zah;
            Log.w("GACConnecting", "mRemainingConnections=" + i2);
            StringBuilder t = i61.t("GoogleApiClient connecting is in step ", zaJ(this.zag), " but received callback for step ");
            t.append(zaJ(i));
            Log.e("GACConnecting", t.toString(), new Exception());
            zaD(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaH() {
        int i = this.zah - 1;
        this.zah = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.zaa.zag.zaf());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            zaD(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.zae;
        if (connectionResult != null) {
            this.zaa.zaf = this.zaf;
            zaD(connectionResult);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaI(ConnectionResult connectionResult) {
        if (this.zal && !connectionResult.hasResolution()) {
            return true;
        }
        return false;
    }

    private static final String zaJ(int i) {
        if (i != 0) {
            return "STEP_GETTING_REMOTE_SERVICE";
        }
        return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static /* bridge */ /* synthetic */ Set zao(zaaw zaawVar) {
        ClientSettings clientSettings = zaawVar.zar;
        if (clientSettings == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(clientSettings.getRequiredScopes());
        Map zad = zaawVar.zar.zad();
        for (Api api : zad.keySet()) {
            zabi zabiVar = zaawVar.zaa;
            if (!zabiVar.zab.containsKey(api.zab())) {
                hashSet.addAll(((com.google.android.gms.common.internal.zab) zad.get(api)).zaa);
            }
        }
        return hashSet;
    }

    public static void zar(zaaw zaawVar, xz7 xz7Var) {
        if (!zaawVar.zaG(0)) {
            return;
        }
        ConnectionResult connectionResult = xz7Var.B;
        if (connectionResult.isSuccess()) {
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) Preconditions.checkNotNull(xz7Var.L);
            ConnectionResult zaa = zavVar.zaa();
            if (!zaa.isSuccess()) {
                String valueOf = String.valueOf(zaa);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                zaawVar.zaD(zaa);
                return;
            }
            zaawVar.zan = true;
            zaawVar.zao = (IAccountAccessor) Preconditions.checkNotNull(zavVar.zab());
            zaawVar.zap = zavVar.zac();
            zaawVar.zaq = zavVar.zad();
            zaawVar.zaF();
        } else if (zaawVar.zaI(connectionResult)) {
            zaawVar.zaA();
            zaawVar.zaF();
        } else {
            zaawVar.zaD(connectionResult);
        }
    }

    private final void zaz() {
        ArrayList arrayList = this.zau;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.zau.clear();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zaa(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zaa.zag.zaa.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zab(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.Api$Client, oz7] */
    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
        boolean z;
        this.zaa.zab.clear();
        this.zam = false;
        this.zae = null;
        this.zag = 0;
        this.zal = true;
        this.zan = false;
        this.zap = false;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        for (Api api : this.zas.keySet()) {
            Api.Client client = (Api.Client) Preconditions.checkNotNull((Api.Client) this.zaa.zaa.get(api.zab()));
            if (api.zac().getPriority() == 1) {
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
            boolean booleanValue = ((Boolean) this.zas.get(api)).booleanValue();
            if (client.requiresSignIn()) {
                this.zam = true;
                if (booleanValue) {
                    this.zaj.add(api.zab());
                } else {
                    this.zal = false;
                }
            }
            hashMap.put(client, new zaal(this, api, booleanValue));
        }
        if (z2) {
            this.zam = false;
        }
        if (this.zam) {
            Preconditions.checkNotNull(this.zar);
            Preconditions.checkNotNull(this.zat);
            this.zar.zae(Integer.valueOf(System.identityHashCode(this.zaa.zag)));
            zaat zaatVar = new zaat(this, null);
            Api.AbstractClientBuilder abstractClientBuilder = this.zat;
            Context context = this.zac;
            zabi zabiVar = this.zaa;
            ClientSettings clientSettings = this.zar;
            this.zak = abstractClientBuilder.buildClient(context, zabiVar.zag.getLooper(), clientSettings, (ClientSettings) clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) zaatVar, (GoogleApiClient.OnConnectionFailedListener) zaatVar);
        }
        this.zah = this.zaa.zaa.size();
        this.zau.add(zabj.zaa().submit(new zaao(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(Bundle bundle) {
        if (zaG(1)) {
            if (bundle != null) {
                this.zai.putAll(bundle);
            }
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult, Api api, boolean z) {
        if (zaG(1)) {
            zaE(connectionResult, api, z);
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i) {
        zaD(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        zaz();
        zaB(true);
        this.zaa.zak(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }
}
