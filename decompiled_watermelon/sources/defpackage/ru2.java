package defpackage;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ru2  reason: default package */
/* loaded from: classes.dex */
public final class ru2 implements su2 {
    public IBinder d;

    @Override // defpackage.su2
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(su2.a);
            obtain.writeStringArray(strArr);
            this.d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }
}
