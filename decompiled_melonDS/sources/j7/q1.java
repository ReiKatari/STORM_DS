package j7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q1 implements Parcelable {
    public static final Parcelable.Creator<q1> CREATOR = new a8.l(28);
    public int A;
    public int B;
    public int L;
    public int[] R;
    public int X;
    public int[] Y;
    public ArrayList Z;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f7656b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f7657c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f7658d0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
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
        parcel.writeInt(this.f7656b0 ? 1 : 0);
        parcel.writeInt(this.f7657c0 ? 1 : 0);
        parcel.writeInt(this.f7658d0 ? 1 : 0);
        parcel.writeList(this.Z);
    }
}
