package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mz7  reason: default package */
/* loaded from: classes.dex */
public abstract class mz7 extends hz7 {
    @Override // defpackage.hz7
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) kz7.a(parcel, ConnectionResult.CREATOR);
                fz7 fz7Var = (fz7) kz7.a(parcel, fz7.CREATOR);
                kz7.b(parcel);
                break;
            case 4:
                Status status = (Status) kz7.a(parcel, Status.CREATOR);
                kz7.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) kz7.a(parcel, Status.CREATOR);
                kz7.b(parcel);
                break;
            case 7:
                Status status3 = (Status) kz7.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) kz7.a(parcel, GoogleSignInAccount.CREATOR);
                kz7.b(parcel);
                break;
            case 8:
                kz7.b(parcel);
                zab((xz7) kz7.a(parcel, xz7.CREATOR));
                break;
            case 9:
                sz7 sz7Var = (sz7) kz7.a(parcel, sz7.CREATOR);
                kz7.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract void zab(xz7 xz7Var);
}
