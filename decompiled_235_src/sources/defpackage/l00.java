package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l00  reason: default package */
/* loaded from: classes.dex */
public final class l00 implements Parcelable {
    public static final Parcelable.Creator<l00> CREATOR = new y8(3);
    public final ArrayList A;
    public final ArrayList B;

    public l00(Parcel parcel) {
        this.A = parcel.createStringArrayList();
        this.B = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A);
        parcel.writeTypedList(this.B);
    }
}
