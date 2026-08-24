package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s  reason: default package */
/* loaded from: classes.dex */
public abstract class s implements Parcelable {
    public static final r B = new s();
    public static final Parcelable.Creator<s> CREATOR = new us4(1);
    public final Parcelable A;

    public s(Parcelable parcelable) {
        if (parcelable != null) {
            this.A = parcelable == B ? null : parcelable;
        } else {
            i.h("superState must not be null");
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

    public s() {
        this.A = null;
    }

    public s(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A = readParcelable == null ? B : readParcelable;
    }
}
