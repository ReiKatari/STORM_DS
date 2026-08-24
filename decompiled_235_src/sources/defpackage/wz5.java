package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wz5  reason: default package */
/* loaded from: classes.dex */
public final class wz5 implements Parcelable {
    public static final vz5 CREATOR = new Object();
    public pq5 A;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        long j;
        parcel.getClass();
        pq5 pq5Var = this.A;
        parcel.writeString(pq5Var.a);
        parcel.writeString(pq5Var.b);
        parcel.writeString(pq5Var.c);
        parcel.writeString(pq5Var.d.toString());
        Uri uri = pq5Var.e;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        Date date = pq5Var.g;
        long j2 = -1;
        if (date != null) {
            j = date.getTime();
        } else {
            j = -1;
        }
        parcel.writeLong(j);
        parcel.writeParcelable(new qt5(pq5Var.f), 0);
        parcel.writeInt(pq5Var.h ? 1 : 0);
        parcel.writeString(pq5Var.i);
        parcel.writeLong(oq1.e(pq5Var.j));
        Long l = pq5Var.l;
        if (l != null) {
            j2 = l.longValue();
        }
        parcel.writeLong(j2);
        parcel.writeByteArray(pq5Var.m);
    }
}
