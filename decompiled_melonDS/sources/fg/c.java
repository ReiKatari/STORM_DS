package fg;

import a8.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import oe.q;
import zb.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new l(23);
    public final Long A;
    public final String B;
    public final String L;
    public final String R;
    public final ArrayList X;

    public c(Long l10, String str, String str2, String str3, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.A = l10;
        this.B = str;
        this.L = str2;
        this.R = str3;
        this.X = arrayList;
    }

    public final q a() {
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList(m.G(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(((a) obj).a());
        }
        return new q(this.A, this.B, this.L, this.R, arrayList2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        int i10 = 0;
        Long l10 = this.A;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        parcel.writeString(this.B);
        parcel.writeString(this.L);
        parcel.writeString(this.R);
        ArrayList arrayList = this.X;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((a) obj).writeToParcel(parcel, i2);
        }
    }
}
