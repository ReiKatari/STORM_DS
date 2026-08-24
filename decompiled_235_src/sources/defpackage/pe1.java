package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pe1  reason: default package */
/* loaded from: classes.dex */
public final class pe1 implements Parcelable {
    public static final Parcelable.Creator<pe1> CREATOR = new y8(9);
    public final int A;

    public pe1(int i) {
        this.A = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pe1) && this.A == ((pe1) obj).A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return xg6.q(new StringBuilder("DefaultLazyKey(index="), this.A, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A);
    }
}
