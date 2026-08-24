package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mx5  reason: default package */
/* loaded from: classes.dex */
public final class mx5 implements Parcelable {
    public static final Parcelable.Creator<mx5> CREATOR = new y8(29);
    public final String A;
    public final int B;
    public final String L;
    public final String R;
    public final boolean X;

    public mx5(String str, int i, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.A = str;
        this.B = i;
        this.L = str2;
        this.R = str3;
        this.X = z;
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
        parcel.writeInt(this.X ? 1 : 0);
    }
}
