package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: id6  reason: default package */
/* loaded from: classes.dex */
public final class id6 implements Parcelable {
    public static final Parcelable.Creator<id6> CREATOR = new px5(2);
    public int A;
    public int B;
    public int L;
    public int[] R;
    public int X;
    public int[] Y;
    public ArrayList Z;
    public boolean c0;
    public boolean d0;
    public boolean e0;

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
        parcel.writeInt(this.c0 ? 1 : 0);
        parcel.writeInt(this.d0 ? 1 : 0);
        parcel.writeInt(this.e0 ? 1 : 0);
        parcel.writeList(this.Z);
    }
}
