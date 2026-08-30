package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vk0  reason: default package */
/* loaded from: classes.dex */
public final class vk0 implements Parcelable {
    public static final Parcelable.Creator<vk0> CREATOR = new x8(6);
    public final Long A;
    public final String B;
    public final ArrayList L;

    public vk0(Long l, String str, ArrayList arrayList) {
        str.getClass();
        this.A = l;
        this.B = str;
        this.L = arrayList;
    }

    public final sk0 a() {
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((zl0) obj).a());
        }
        return new sk0(this.A, this.B, arrayList2);
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
            ((zl0) obj).writeToParcel(parcel, i);
        }
    }
}
