package fg;

import a8.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import zb.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new l(21);
    public final Long A;
    public final String B;
    public final ArrayList L;

    public a(Long l10, String str, ArrayList arrayList) {
        str.getClass();
        this.A = l10;
        this.B = str;
        this.L = arrayList;
    }

    public final oe.c a() {
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = new ArrayList(m.G(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(((b) obj).a());
        }
        return new oe.c(this.A, this.B, arrayList2);
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
        ArrayList arrayList = this.L;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((b) obj).writeToParcel(parcel, i2);
        }
    }
}
