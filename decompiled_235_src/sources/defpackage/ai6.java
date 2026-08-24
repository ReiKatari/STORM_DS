package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import org.json.JSONException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai6  reason: default package */
/* loaded from: classes.dex */
public final class ai6 extends GmsClient implements oz7 {
    public final boolean a;
    public final ClientSettings b;
    public final Bundle c;
    public final Integer d;

    public ai6(Context context, Looper looper, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.a = true;
        this.b = clientSettings;
        this.c = bundle;
        this.d = clientSettings.zab();
    }

    @Override // defpackage.oz7
    public final void a(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            qz7 qz7Var = (qz7) getService();
            int intValue = ((Integer) Preconditions.checkNotNull(this.d)).intValue();
            Parcel zaa = qz7Var.zaa();
            kz7.d(zaa, iAccountAccessor);
            zaa.writeInt(intValue);
            zaa.writeInt(z ? 1 : 0);
            qz7Var.zac(9, zaa);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // defpackage.oz7
    public final void b(jz7 jz7Var) {
        GoogleSignInAccount googleSignInAccount;
        String b;
        Preconditions.checkNotNull(jz7Var, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.b.getAccountOrDefault();
            if ("<<default account>>".equals(accountOrDefault.name)) {
                br6 a = br6.a(getContext());
                String b2 = a.b("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(b2) && (b = a.b(br6.d("googleSignInAccount", b2))) != null) {
                    try {
                        googleSignInAccount = GoogleSignInAccount.h(b);
                    } catch (JSONException unused) {
                    }
                    zat zatVar = new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.d)).intValue(), googleSignInAccount);
                    qz7 qz7Var = (qz7) getService();
                    uz7 uz7Var = new uz7(1, zatVar);
                    Parcel zaa = qz7Var.zaa();
                    kz7.c(zaa, uz7Var);
                    kz7.d(zaa, jz7Var);
                    qz7Var.zac(12, zaa);
                }
            }
            googleSignInAccount = null;
            zat zatVar2 = new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.d)).intValue(), googleSignInAccount);
            qz7 qz7Var2 = (qz7) getService();
            uz7 uz7Var2 = new uz7(1, zatVar2);
            Parcel zaa2 = qz7Var2.zaa();
            kz7.c(zaa2, uz7Var2);
            kz7.d(zaa2, jz7Var);
            qz7Var2.zac(12, zaa2);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                jz7Var.zab(new xz7(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof qz7) {
            return (qz7) queryLocalInterface;
        }
        return new gz7(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        ClientSettings clientSettings = this.b;
        boolean equals = getContext().getPackageName().equals(clientSettings.getRealClientPackageName());
        Bundle bundle = this.c;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", clientSettings.getRealClientPackageName());
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.a;
    }

    @Override // defpackage.oz7
    public final void zaa() {
        try {
            qz7 qz7Var = (qz7) getService();
            int intValue = ((Integer) Preconditions.checkNotNull(this.d)).intValue();
            Parcel zaa = qz7Var.zaa();
            zaa.writeInt(intValue);
            qz7Var.zac(7, zaa);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // defpackage.oz7
    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }
}
