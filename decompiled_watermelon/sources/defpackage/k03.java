package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k03  reason: default package */
/* loaded from: classes.dex */
public final class k03 implements Parcelable {
    public static final j03 CREATOR = new Object();
    public final f03 A;

    public k03(Parcel parcel) {
        j03 j03Var = CREATOR;
        this.A = new f03((yz2) ((f12) yz2.getEntries()).get(parcel.readInt()), j03.a(j03Var, parcel), j03.a(j03Var, parcel));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        f03 f03Var = this.A;
        parcel.writeInt(f03Var.a.ordinal());
        j03 j03Var = CREATOR;
        j03.b(j03Var, parcel, f03Var.b);
        j03.b(j03Var, parcel, f03Var.c);
    }

    public k03(f03 f03Var) {
        f03Var.getClass();
        this.A = f03Var;
    }
}
