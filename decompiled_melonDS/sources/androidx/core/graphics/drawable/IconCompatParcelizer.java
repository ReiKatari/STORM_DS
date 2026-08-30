package androidx.core.graphics.drawable;

import a0.j;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import e8.a;
import e8.b;
import java.nio.charset.Charset;
import l1.c;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.graphics.drawable.IconCompat, java.lang.Object] */
    public static IconCompat read(a aVar) {
        int readInt;
        ?? obj = new Object();
        obj.f1193a = -1;
        byte[] bArr = null;
        obj.f1195c = null;
        obj.f1196d = null;
        obj.f1197e = 0;
        obj.f1198f = 0;
        obj.f1199g = null;
        obj.f1200h = IconCompat.f1192k;
        obj.f1201i = null;
        if (!aVar.e(1)) {
            readInt = -1;
        } else {
            readInt = ((b) aVar).f4407e.readInt();
        }
        obj.f1193a = readInt;
        byte[] bArr2 = obj.f1195c;
        if (!aVar.e(2)) {
            bArr = bArr2;
        } else {
            Parcel parcel = ((b) aVar).f4407e;
            int readInt2 = parcel.readInt();
            if (readInt2 >= 0) {
                bArr = new byte[readInt2];
                parcel.readByteArray(bArr);
            }
        }
        obj.f1195c = bArr;
        obj.f1196d = aVar.f(obj.f1196d, 3);
        int i2 = obj.f1197e;
        if (aVar.e(4)) {
            i2 = ((b) aVar).f4407e.readInt();
        }
        obj.f1197e = i2;
        int i10 = obj.f1198f;
        if (aVar.e(5)) {
            i10 = ((b) aVar).f4407e.readInt();
        }
        obj.f1198f = i10;
        obj.f1199g = (ColorStateList) aVar.f(obj.f1199g, 6);
        String str = obj.f1201i;
        if (aVar.e(7)) {
            str = ((b) aVar).f4407e.readString();
        }
        obj.f1201i = str;
        String str2 = obj.f1202j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f4407e.readString();
        }
        obj.f1202j = str2;
        obj.f1200h = PorterDuff.Mode.valueOf(obj.f1201i);
        switch (obj.f1193a) {
            case -1:
                Parcelable parcelable = obj.f1196d;
                if (parcelable != null) {
                    obj.f1194b = parcelable;
                    return obj;
                }
                j.h("Invalid icon");
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
            case c.f8511g /* 5 */:
                Parcelable parcelable2 = obj.f1196d;
                if (parcelable2 != null) {
                    obj.f1194b = parcelable2;
                    return obj;
                }
                byte[] bArr3 = obj.f1195c;
                obj.f1194b = bArr3;
                obj.f1193a = 3;
                obj.f1197e = 0;
                obj.f1198f = bArr3.length;
                return obj;
            case 2:
            case 4:
            case c.f8509e /* 6 */:
                String str3 = new String(obj.f1195c, Charset.forName("UTF-16"));
                obj.f1194b = str3;
                if (obj.f1193a == 2 && obj.f1202j == null) {
                    obj.f1202j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                obj.f1194b = obj.f1195c;
                return obj;
        }
        return obj;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1201i = iconCompat.f1200h.name();
        switch (iconCompat.f1193a) {
            case -1:
                iconCompat.f1196d = (Parcelable) iconCompat.f1194b;
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
            case c.f8511g /* 5 */:
                iconCompat.f1196d = (Parcelable) iconCompat.f1194b;
                break;
            case 2:
                iconCompat.f1195c = ((String) iconCompat.f1194b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1195c = (byte[]) iconCompat.f1194b;
                break;
            case 4:
            case c.f8509e /* 6 */:
                iconCompat.f1195c = iconCompat.f1194b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1193a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f4407e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1195c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f4407e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1196d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f4407e.writeParcelable(parcelable, 0);
        }
        int i10 = iconCompat.f1197e;
        if (i10 != 0) {
            aVar.h(4);
            ((b) aVar).f4407e.writeInt(i10);
        }
        int i11 = iconCompat.f1198f;
        if (i11 != 0) {
            aVar.h(5);
            ((b) aVar).f4407e.writeInt(i11);
        }
        ColorStateList colorStateList = iconCompat.f1199g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f4407e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1201i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f4407e.writeString(str);
        }
        String str2 = iconCompat.f1202j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f4407e.writeString(str2);
        }
    }
}
