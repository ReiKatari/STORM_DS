package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ng2  reason: default package */
/* loaded from: classes.dex */
public final class ng2 implements Parcelable {
    public static final Parcelable.Creator<ng2> CREATOR = new x8(12);
    public ArrayList A;
    public ArrayList B;
    public b[] L;
    public int R;
    public String X;
    public ArrayList Y;
    public ArrayList Z;
    public ArrayList c0;

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
        parcel.writeTypedList(this.c0);
    }
}
