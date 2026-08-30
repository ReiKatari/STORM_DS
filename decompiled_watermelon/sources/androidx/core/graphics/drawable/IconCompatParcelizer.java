package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.graphics.drawable.IconCompat, java.lang.Object] */
    public static IconCompat read(e87 e87Var) {
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
        if (!e87Var.e(1)) {
            readInt = -1;
        } else {
            readInt = ((f87) e87Var).e.readInt();
        }
        obj.a = readInt;
        byte[] bArr = obj.c;
        if (e87Var.e(2)) {
            Parcel parcel = ((f87) e87Var).e;
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
        obj.d = e87Var.f(obj.d, 3);
        int i = obj.e;
        if (e87Var.e(4)) {
            i = ((f87) e87Var).e.readInt();
        }
        obj.e = i;
        int i2 = obj.f;
        if (e87Var.e(5)) {
            i2 = ((f87) e87Var).e.readInt();
        }
        obj.f = i2;
        obj.g = (ColorStateList) e87Var.f(obj.g, 6);
        String str = obj.i;
        if (e87Var.e(7)) {
            str = ((f87) e87Var).e.readString();
        }
        obj.i = str;
        String str2 = obj.j;
        if (e87Var.e(8)) {
            str2 = ((f87) e87Var).e.readString();
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
                i.i("Invalid icon");
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
            case ig7.b /* 6 */:
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

    public static void write(IconCompat iconCompat, e87 e87Var) {
        e87Var.getClass();
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
            case ig7.b /* 6 */:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            e87Var.h(1);
            ((f87) e87Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            e87Var.h(2);
            Parcel parcel = ((f87) e87Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            e87Var.h(3);
            ((f87) e87Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            e87Var.h(4);
            ((f87) e87Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            e87Var.h(5);
            ((f87) e87Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            e87Var.h(6);
            ((f87) e87Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            e87Var.h(7);
            ((f87) e87Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            e87Var.h(8);
            ((f87) e87Var).e.writeString(str2);
        }
    }
}
