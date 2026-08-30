package eg;

import a8.l;
import android.os.Parcel;
import android.os.Parcelable;
import nd.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public final String A;
    public final String B;
    public final String L;
    public static final b Companion = new Object();
    public static final Parcelable.Creator<c> CREATOR = new l(18);

    public /* synthetic */ c(int i2, String str, String str2, String str3) {
        if (7 == (i2 & 7)) {
            this.A = str;
            this.B = str2;
            this.L = str3;
            return;
        }
        a1.j(i2, 7, a.f4482a.e());
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.L);
    }

    public c(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.A = str;
        this.B = str2;
        this.L = str3;
    }
}
