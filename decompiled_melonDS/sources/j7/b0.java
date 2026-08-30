package j7;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new a8.l(26);
    public int A;
    public int B;
    public boolean L;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.L ? 1 : 0);
    }
}
