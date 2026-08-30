package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jg2  reason: default package */
/* loaded from: classes.dex */
public final class jg2 implements Parcelable {
    public static final Parcelable.Creator<jg2> CREATOR = new x8(11);
    public String A;
    public int B;

    public jg2(String str, int i) {
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
