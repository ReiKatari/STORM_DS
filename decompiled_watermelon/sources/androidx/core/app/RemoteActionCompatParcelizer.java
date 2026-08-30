package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(e87 e87Var) {
        ?? obj = new Object();
        g87 g87Var = obj.a;
        boolean z = true;
        if (e87Var.e(1)) {
            g87Var = e87Var.g();
        }
        obj.a = (IconCompat) g87Var;
        CharSequence charSequence = obj.b;
        if (e87Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((f87) e87Var).e);
        }
        obj.b = charSequence;
        CharSequence charSequence2 = obj.c;
        if (e87Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((f87) e87Var).e);
        }
        obj.c = charSequence2;
        obj.d = (PendingIntent) e87Var.f(obj.d, 4);
        boolean z2 = obj.e;
        if (e87Var.e(5)) {
            if (((f87) e87Var).e.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        obj.e = z2;
        boolean z3 = obj.f;
        if (!e87Var.e(6)) {
            z = z3;
        } else if (((f87) e87Var).e.readInt() == 0) {
            z = false;
        }
        obj.f = z;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, e87 e87Var) {
        e87Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        e87Var.h(1);
        e87Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        e87Var.h(2);
        Parcel parcel = ((f87) e87Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        e87Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        e87Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        e87Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        e87Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
