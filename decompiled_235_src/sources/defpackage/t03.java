package defpackage;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t03  reason: default package */
/* loaded from: classes.dex */
public final class t03 implements u03 {
    public IBinder d;

    @Override // defpackage.u03
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(u03.a);
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
