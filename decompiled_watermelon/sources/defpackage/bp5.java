package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bp5  reason: default package */
/* loaded from: classes.dex */
public final class bp5 implements Parcelable {
    public static final ap5 CREATOR = new Object();
    public rg5 A;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        long j;
        parcel.getClass();
        rg5 rg5Var = this.A;
        parcel.writeString(rg5Var.a);
        parcel.writeString(rg5Var.b);
        parcel.writeString(rg5Var.c);
        parcel.writeString(rg5Var.d.toString());
        Uri uri = rg5Var.e;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        Date date = rg5Var.g;
        long j2 = -1;
        if (date != null) {
            j = date.getTime();
        } else {
            j = -1;
        }
        parcel.writeLong(j);
        parcel.writeParcelable(new bj5(rg5Var.f), 0);
        parcel.writeInt(rg5Var.h ? 1 : 0);
        parcel.writeString(rg5Var.i);
        parcel.writeLong(im1.e(rg5Var.j));
        Long l = rg5Var.l;
        if (l != null) {
            j2 = l.longValue();
        }
        parcel.writeLong(j2);
        parcel.writeByteArray(rg5Var.m);
    }
}
