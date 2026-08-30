package eg;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final i CREATOR = new Object();
    public ze.a A;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str;
        long j2;
        parcel.getClass();
        ze.a aVar = this.A;
        parcel.writeString(aVar.f15053a);
        parcel.writeString(aVar.f15054b);
        parcel.writeString(aVar.f15055c);
        parcel.writeString(aVar.f15056d.toString());
        Uri uri = aVar.f15057e;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        Date date = aVar.f15059g;
        if (date != null) {
            j2 = date.getTime();
        } else {
            j2 = -1;
        }
        parcel.writeLong(j2);
        parcel.writeParcelable(new e(aVar.f15058f), 0);
        parcel.writeInt(aVar.f15060h ? 1 : 0);
        parcel.writeString(aVar.f15061i);
        parcel.writeLong(wc.b.d(aVar.f15062j));
    }
}
