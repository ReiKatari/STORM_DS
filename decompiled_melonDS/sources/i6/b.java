package i6;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable;
import z2.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {
    public static final a B = new b();
    public static final Parcelable.Creator<b> CREATOR = new o(3);
    public final Parcelable A;

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.A = parcelable == B ? null : parcelable;
        } else {
            j.h("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A, i2);
    }

    public b() {
        this.A = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A = readParcelable == null ? B : readParcelable;
    }
}
