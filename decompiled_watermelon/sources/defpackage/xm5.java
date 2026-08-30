package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xm5  reason: default package */
/* loaded from: classes.dex */
public final class xm5 implements Parcelable {
    public static final Parcelable.Creator<xm5> CREATOR = new x8(29);
    public final String A;
    public final int B;
    public final String L;
    public final String R;

    public xm5(int i, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.A = str;
        this.B = i;
        this.L = str2;
        this.R = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeString(this.L);
        parcel.writeString(this.R);
    }
}
