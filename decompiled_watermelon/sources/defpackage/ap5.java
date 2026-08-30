package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ap5  reason: default package */
/* loaded from: classes.dex */
public final class ap5 implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [bp5, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Uri uri;
        Date date;
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
        Long l = null;
        if (readString5 != null) {
            uri = Uri.parse(readString5);
        } else {
            uri = null;
        }
        long readLong = parcel.readLong();
        if (readLong == -1) {
            date = null;
        } else {
            date = new Date(readLong);
        }
        bj5 bj5Var = (bj5) hi2.Q(parcel, bj5.class.getClassLoader(), bj5.class);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        String readString6 = parcel.readString();
        readString6.getClass();
        hm1 hm1Var = im1.B;
        long l0 = b53.l0(parcel.readLong(), om1.MILLISECONDS);
        long readLong2 = parcel.readLong();
        Long valueOf = Long.valueOf(readLong2);
        if (readLong2 != -1) {
            l = valueOf;
        }
        byte[] createByteArray = parcel.createByteArray();
        readString.getClass();
        readString3.getClass();
        bj5Var.getClass();
        obj.A = new rg5(readString, readString2, readString3, parse, uri, bj5Var.A, date, z, readString6, l0, false, l, createByteArray, 1024);
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new bp5[i];
    }
}
