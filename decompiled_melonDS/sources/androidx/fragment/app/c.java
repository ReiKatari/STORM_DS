package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a8.l(2);
    public final ArrayList A;
    public final ArrayList B;

    public c(Parcel parcel) {
        this.A = parcel.createStringArrayList();
        this.B = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.A);
        parcel.writeTypedList(this.B);
    }
}
