package defpackage;

import android.app.Notification;
import android.os.Parcel;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g84  reason: default package */
/* loaded from: classes.dex */
public final class g84 {
    public final String a;
    public final Notification b;

    public g84(String str, Notification notification) {
        this.a = str;
        this.b = notification;
    }

    public final void a(wu2 wu2Var) {
        String str = this.a;
        Notification notification = this.b;
        uu2 uu2Var = (uu2) wu2Var;
        uu2Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(wu2.c);
            obtain.writeString(str);
            obtain.writeInt(2002);
            obtain.writeString(null);
            obtain.writeTypedObject(notification, 0);
            uu2Var.d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return b31.q(new StringBuilder("NotifyTask[packageName:"), this.a, ", id:2002, tag:null]");
    }
}
