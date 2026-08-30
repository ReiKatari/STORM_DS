package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uy  reason: default package */
/* loaded from: classes.dex */
public final class uy implements Parcelable {
    public static final Parcelable.Creator<uy> CREATOR = new x8(3);
    public final ArrayList A;
    public final ArrayList B;

    public uy(Parcel parcel) {
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
