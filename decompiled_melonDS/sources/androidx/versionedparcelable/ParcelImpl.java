package androidx.versionedparcelable;

import a8.l;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import e8.b;
import e8.c;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new l(17);
    public final c A;

    public ParcelImpl(Parcel parcel) {
        this.A = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new b(parcel).i(this.A);
    }
}
