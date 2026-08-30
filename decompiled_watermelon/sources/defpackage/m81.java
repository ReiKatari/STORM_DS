package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m81  reason: default package */
/* loaded from: classes.dex */
public final class m81 implements Parcelable {
    public static final Parcelable.Creator<m81> CREATOR = new x8(8);
    public final long A;

    public m81(long j) {
        this.A = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m81) && this.A == ((m81) obj).A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A);
    }
}
