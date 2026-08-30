package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kk2  reason: default package */
/* loaded from: classes.dex */
public final class kk2 implements Parcelable {
    public static final Parcelable.Creator<kk2> CREATOR = new x8(14);
    public final Long A;
    public final String B;
    public final String L;
    public final String R;
    public final ArrayList X;

    public kk2(Long l, String str, String str2, String str3, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.A = l;
        this.B = str;
        this.L = str2;
        this.R = str3;
        this.X = arrayList;
    }

    public final yj2 a() {
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((vk0) obj).a());
        }
        return new yj2(this.A, this.B, this.L, this.R, arrayList2);
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
        parcel.writeString(this.L);
        parcel.writeString(this.R);
        ArrayList arrayList = this.X;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((vk0) obj).writeToParcel(parcel, i);
        }
    }
}
