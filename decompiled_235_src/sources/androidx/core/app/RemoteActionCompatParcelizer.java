package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(dm7 dm7Var) {
        ?? obj = new Object();
        fm7 fm7Var = obj.a;
        boolean z = true;
        if (dm7Var.e(1)) {
            fm7Var = dm7Var.g();
        }
        obj.a = (IconCompat) fm7Var;
        CharSequence charSequence = obj.b;
        if (dm7Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((em7) dm7Var).e);
        }
        obj.b = charSequence;
        CharSequence charSequence2 = obj.c;
        if (dm7Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((em7) dm7Var).e);
        }
        obj.c = charSequence2;
        obj.d = (PendingIntent) dm7Var.f(obj.d, 4);
        boolean z2 = obj.e;
        if (dm7Var.e(5)) {
            if (((em7) dm7Var).e.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        obj.e = z2;
        boolean z3 = obj.f;
        if (!dm7Var.e(6)) {
            z = z3;
        } else if (((em7) dm7Var).e.readInt() == 0) {
            z = false;
        }
        obj.f = z;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, dm7 dm7Var) {
        dm7Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        dm7Var.h(1);
        dm7Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        dm7Var.h(2);
        Parcel parcel = ((em7) dm7Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        dm7Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        dm7Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        dm7Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        dm7Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
