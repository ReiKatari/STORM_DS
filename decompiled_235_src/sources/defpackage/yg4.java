package defpackage;

import android.app.Notification;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg4  reason: default package */
/* loaded from: classes.dex */
public final class yg4 {
    public final String a;
    public final Notification b;

    public yg4(String str, Notification notification) {
        this.a = str;
        this.b = notification;
    }

    public final void a(y03 y03Var) {
        String str = this.a;
        Notification notification = this.b;
        w03 w03Var = (w03) y03Var;
        w03Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(y03.c);
            obtain.writeString(str);
            obtain.writeInt(2002);
            obtain.writeString(null);
            obtain.writeTypedObject(notification, 0);
            w03Var.d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return i61.n(new StringBuilder("NotifyTask[packageName:"), this.a, ", id:2002, tag:null]");
    }
}
