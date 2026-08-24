package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ml2  reason: default package */
/* loaded from: classes.dex */
public final class ml2 implements Parcelable {
    public static final Parcelable.Creator<ml2> CREATOR = new y8(12);
    public ArrayList A;
    public ArrayList B;
    public b[] L;
    public int R;
    public String X;
    public ArrayList Y;
    public ArrayList Z;
    public ArrayList d0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A);
        parcel.writeStringList(this.B);
        parcel.writeTypedArray(this.L, i);
        parcel.writeInt(this.R);
        parcel.writeString(this.X);
        parcel.writeStringList(this.Y);
        parcel.writeTypedList(this.Z);
        parcel.writeTypedList(this.d0);
    }
}
