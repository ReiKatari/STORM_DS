package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ta1  reason: default package */
/* loaded from: classes.dex */
public final class ta1 implements Parcelable {
    public static final Parcelable.Creator<ta1> CREATOR = new x8(9);
    public final int A;

    public ta1(int i) {
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
        if ((obj instanceof ta1) && this.A == ((ta1) obj).A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return ej6.g(new StringBuilder("DefaultLazyKey(index="), this.A, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A);
    }
}
