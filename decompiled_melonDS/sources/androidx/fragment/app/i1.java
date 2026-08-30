package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 implements Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new a8.l(4);
    public ArrayList A;
    public ArrayList B;
    public b[] L;
    public int R;
    public String X;
    public ArrayList Y;
    public ArrayList Z;

    /* renamed from: b0  reason: collision with root package name */
    public ArrayList f1339b0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.A);
        parcel.writeStringList(this.B);
        parcel.writeTypedArray(this.L, i2);
        parcel.writeInt(this.R);
        parcel.writeString(this.X);
        parcel.writeStringList(this.Y);
        parcel.writeTypedList(this.Z);
        parcel.writeTypedList(this.f1339b0);
    }
}
