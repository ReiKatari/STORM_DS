package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.graphics.drawable.IconCompat, java.lang.Object] */
    public static IconCompat read(dm7 dm7Var) {
        int readInt;
        ?? obj = new Object();
        obj.a = -1;
        obj.c = null;
        obj.d = null;
        obj.e = 0;
        obj.f = 0;
        obj.g = null;
        obj.h = IconCompat.k;
        obj.i = null;
        if (!dm7Var.e(1)) {
            readInt = -1;
        } else {
            readInt = ((em7) dm7Var).e.readInt();
        }
        obj.a = readInt;
        byte[] bArr = obj.c;
        if (dm7Var.e(2)) {
            Parcel parcel = ((em7) dm7Var).e;
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        obj.c = bArr;
        obj.d = dm7Var.f(obj.d, 3);
        int i = obj.e;
        if (dm7Var.e(4)) {
            i = ((em7) dm7Var).e.readInt();
        }
        obj.e = i;
        int i2 = obj.f;
        if (dm7Var.e(5)) {
            i2 = ((em7) dm7Var).e.readInt();
        }
        obj.f = i2;
        obj.g = (ColorStateList) dm7Var.f(obj.g, 6);
        String str = obj.i;
        if (dm7Var.e(7)) {
            str = ((em7) dm7Var).e.readString();
        }
        obj.i = str;
        String str2 = obj.j;
        if (dm7Var.e(8)) {
            str2 = ((em7) dm7Var).e.readString();
        }
        obj.j = str2;
        obj.h = PorterDuff.Mode.valueOf(obj.i);
        switch (obj.a) {
            case -1:
                Parcelable parcelable = obj.d;
                if (parcelable != null) {
                    obj.b = parcelable;
                    return obj;
                }
                i.h("Invalid icon");
                return null;
            case 1:
            case 5:
                Parcelable parcelable2 = obj.d;
                if (parcelable2 != null) {
                    obj.b = parcelable2;
                    return obj;
                }
                byte[] bArr3 = obj.c;
                obj.b = bArr3;
                obj.a = 3;
                obj.e = 0;
                obj.f = bArr3.length;
                return obj;
            case 2:
            case 4:
            case 6:
                String str3 = new String(obj.c, Charset.forName("UTF-16"));
                obj.b = str3;
                if (obj.a == 2 && obj.j == null) {
                    obj.j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                obj.b = obj.c;
                return obj;
        }
        return obj;
    }

    public static void write(IconCompat iconCompat, dm7 dm7Var) {
        dm7Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            dm7Var.h(1);
            ((em7) dm7Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            dm7Var.h(2);
            Parcel parcel = ((em7) dm7Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            dm7Var.h(3);
            ((em7) dm7Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            dm7Var.h(4);
            ((em7) dm7Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            dm7Var.h(5);
            ((em7) dm7Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            dm7Var.h(6);
            ((em7) dm7Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            dm7Var.h(7);
            ((em7) dm7Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            dm7Var.h(8);
            ((em7) dm7Var).e.writeString(str2);
        }
    }
}
