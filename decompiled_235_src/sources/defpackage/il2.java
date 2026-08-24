package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il2  reason: default package */
/* loaded from: classes.dex */
public final class il2 implements Parcelable {
    public static final Parcelable.Creator<il2> CREATOR = new y8(11);
    public String A;
    public int B;

    public il2(String str, int i) {
        this.A = str;
        this.B = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
    }
}
