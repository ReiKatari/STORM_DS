package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: pz  reason: default package */
/* loaded from: classes.dex */
public final class pz implements Parcelable {
    public final String A;
    public final String B;
    public final String L;
    public static final oz Companion = new Object();
    public static final Parcelable.Creator<pz> CREATOR = new x8(4);

    public /* synthetic */ pz(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.A = str;
            this.B = str2;
            this.L = str3;
            return;
        }
        ep2.H(i, 7, nz.a.e());
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.L);
    }

    public pz(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.A = str;
        this.B = str2;
        this.L = str3;
    }
}
