package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fo3  reason: default package */
/* loaded from: classes.dex */
public final class fo3 implements Parcelable {
    public static final Parcelable.Creator<fo3> CREATOR = new x8(16);
    public int A;
    public int B;
    public boolean L;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.L ? 1 : 0);
    }
}
