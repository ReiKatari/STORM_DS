package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e8.a;
import e8.b;
import e8.c;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(a aVar) {
        ?? obj = new Object();
        c cVar = obj.f1186a;
        boolean z10 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        obj.f1186a = (IconCompat) cVar;
        CharSequence charSequence = obj.f1187b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f4407e);
        }
        obj.f1187b = charSequence;
        CharSequence charSequence2 = obj.f1188c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f4407e);
        }
        obj.f1188c = charSequence2;
        obj.f1189d = (PendingIntent) aVar.f(obj.f1189d, 4);
        boolean z11 = obj.f1190e;
        if (aVar.e(5)) {
            if (((b) aVar).f4407e.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        obj.f1190e = z11;
        boolean z12 = obj.f1191f;
        if (!aVar.e(6)) {
            z10 = z12;
        } else if (((b) aVar).f4407e.readInt() == 0) {
            z10 = false;
        }
        obj.f1191f = z10;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1186a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1187b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f4407e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1188c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1189d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z10 = remoteActionCompat.f1190e;
        aVar.h(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f1191f;
        aVar.h(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
