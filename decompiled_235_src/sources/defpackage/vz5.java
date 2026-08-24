package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vz5  reason: default package */
/* loaded from: classes.dex */
public final class vz5 implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [wz5, java.lang.Object] */
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
        qt5 qt5Var = (qt5) xk2.H(parcel, qt5.class.getClassLoader(), qt5.class);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        String readString6 = parcel.readString();
        readString6.getClass();
        jd1 jd1Var = oq1.B;
        long M = n16.M(parcel.readLong(), uq1.MILLISECONDS);
        long readLong2 = parcel.readLong();
        Long valueOf = Long.valueOf(readLong2);
        if (readLong2 != -1) {
            l = valueOf;
        }
        byte[] createByteArray = parcel.createByteArray();
        readString.getClass();
        readString3.getClass();
        qt5Var.getClass();
        obj.A = new pq5(readString, readString2, readString3, parse, uri, qt5Var.A, date, z, readString6, M, false, l, createByteArray, 1024);
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new wz5[i];
    }
}
