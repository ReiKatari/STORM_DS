package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv3  reason: default package */
/* loaded from: classes.dex */
public final class hv3 implements Parcelable {
    public static final Parcelable.Creator<hv3> CREATOR = new y8(16);
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
