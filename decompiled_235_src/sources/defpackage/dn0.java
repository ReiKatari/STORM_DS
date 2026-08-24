package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dn0  reason: default package */
/* loaded from: classes.dex */
public final class dn0 implements Parcelable {
    public static final Parcelable.Creator<dn0> CREATOR = new y8(6);
    public final Long A;
    public final String B;
    public final ArrayList L;

    public dn0(Long l, String str, ArrayList arrayList) {
        str.getClass();
        this.A = l;
        this.B = str;
        this.L = arrayList;
    }

    public final an0 a() {
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((ho0) obj).a());
        }
        return new an0(this.A, this.B, arrayList2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = 0;
        Long l = this.A;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.B);
        ArrayList arrayList = this.L;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ho0) obj).writeToParcel(parcel, i);
        }
    }
}
