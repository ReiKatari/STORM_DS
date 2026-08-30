package eg;

import a8.l;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new l(19);
    public final String A;
    public final int B;
    public final String L;
    public final String R;

    public h(int i2, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.A = str;
        this.B = i2;
        this.L = str2;
        this.R = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeString(this.L);
        parcel.writeString(this.R);
    }
}
