package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 implements Parcelable {
    public static final Parcelable.Creator<c1> CREATOR = new a8.l(3);
    public String A;
    public int B;

    public c1(String str, int i2) {
        this.A = str;
        this.B = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
    }
}
