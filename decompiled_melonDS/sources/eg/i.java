package eg;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [eg.j, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Uri uri;
        parcel.getClass();
        ?? obj = new Object();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        readString2.getClass();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        readString4.getClass();
        Uri parse = Uri.parse(readString4);
        String readString5 = parcel.readString();
        Date date = null;
        if (readString5 != null) {
            uri = Uri.parse(readString5);
        } else {
            uri = null;
        }
        long readLong = parcel.readLong();
        if (readLong != -1) {
            date = new Date(readLong);
        }
        Date date2 = date;
        e eVar = (e) p7.a.v(parcel, e.class.getClassLoader(), e.class);
        boolean z10 = true;
        if (parcel.readInt() != 1) {
            z10 = false;
        }
        String readString6 = parcel.readString();
        readString6.getClass();
        l7.a aVar = wc.b.B;
        long m = wc.j.m(parcel.readLong(), wc.e.MILLISECONDS);
        readString.getClass();
        readString3.getClass();
        eVar.getClass();
        obj.A = new ze.a(readString, readString2, readString3, parse, uri, eVar.A, date2, z10, readString6, m);
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new j[i2];
    }
}
