package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yo6  reason: default package */
/* loaded from: classes.dex */
public final class yo6 implements Parcelable {
    public static final Parcelable.Creator<yo6> CREATOR = new b96(2);
    public int A;
    public int B;
    public int L;
    public int[] R;
    public int X;
    public int[] Y;
    public ArrayList Z;
    public boolean d0;
    public boolean e0;
    public boolean f0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.L);
        if (this.L > 0) {
            parcel.writeIntArray(this.R);
        }
        parcel.writeInt(this.X);
        if (this.X > 0) {
            parcel.writeIntArray(this.Y);
        }
        parcel.writeInt(this.d0 ? 1 : 0);
        parcel.writeInt(this.e0 ? 1 : 0);
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeList(this.Z);
    }
}
