package k7;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: c  reason: collision with root package name */
    public IBinder f8005c;

    @Override // k7.e
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.f8006a);
            obtain.writeStringArray(strArr);
            this.f8005c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8005c;
    }
}
