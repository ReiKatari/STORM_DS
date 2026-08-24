package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: g10  reason: default package */
/* loaded from: classes.dex */
public final class g10 implements Parcelable {
    public final String A;
    public final String B;
    public final String L;
    public static final f10 Companion = new Object();
    public static final Parcelable.Creator<g10> CREATOR = new y8(4);

    public /* synthetic */ g10(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.A = str;
            this.B = str2;
            this.L = str3;
            return;
        }
        ii2.S(i, 7, e10.a.e());
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.L);
    }

    public g10(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.A = str;
        this.B = str2;
        this.L = str3;
    }
}
