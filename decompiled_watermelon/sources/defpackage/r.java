package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r  reason: default package */
/* loaded from: classes.dex */
public abstract class r implements Parcelable {
    public static final q B = new r();
    public static final Parcelable.Creator<r> CREATOR = new sj4(1);
    public final Parcelable A;

    public r(Parcelable parcelable) {
        if (parcelable != null) {
            this.A = parcelable == B ? null : parcelable;
        } else {
            i.i("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A, i);
    }

    public r() {
        this.A = null;
    }

    public r(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A = readParcelable == null ? B : readParcelable;
    }
}
