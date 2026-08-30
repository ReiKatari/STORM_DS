package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n04  reason: default package */
/* loaded from: classes.dex */
public final class n04 extends Binder implements tu2 {
    public final /* synthetic */ MultiInstanceInvalidationService d;

    public n04(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.d = multiInstanceInvalidationService;
        attachInterface(this, tu2.b);
    }

    @Override // defpackage.tu2
    public final void b(String[] strArr, int i) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.L) {
            String str = (String) multiInstanceInvalidationService.B.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.L.beginBroadcast();
            int i2 = 0;
            while (true) {
                o04 o04Var = multiInstanceInvalidationService.L;
                if (i2 < beginBroadcast) {
                    Object broadcastCookie = o04Var.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.B.get(num);
                    if (i != intValue && str.equals(str2)) {
                        try {
                            ((su2) multiInstanceInvalidationService.L.getBroadcastItem(i2)).a(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                    i2++;
                } else {
                    o04Var.finishBroadcast();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ru2] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, ru2] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = tu2.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        su2 su2Var = null;
        su2 su2Var2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                b(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(su2.a);
                if (queryLocalInterface != null && (queryLocalInterface instanceof su2)) {
                    su2Var2 = (su2) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.d = readStrongBinder;
                    su2Var2 = obj;
                }
            }
            int readInt = parcel.readInt();
            su2Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
            synchronized (multiInstanceInvalidationService.L) {
                multiInstanceInvalidationService.L.unregister(su2Var2);
                String str2 = (String) multiInstanceInvalidationService.B.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(su2.a);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof su2)) {
                su2Var = (su2) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.d = readStrongBinder2;
                su2Var = obj2;
            }
        }
        String readString = parcel.readString();
        su2Var.getClass();
        int i3 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.d;
            synchronized (multiInstanceInvalidationService2.L) {
                try {
                    int i4 = multiInstanceInvalidationService2.A + 1;
                    multiInstanceInvalidationService2.A = i4;
                    if (multiInstanceInvalidationService2.L.register(su2Var, Integer.valueOf(i4))) {
                        multiInstanceInvalidationService2.B.put(Integer.valueOf(i4), readString);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService2.A--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i3);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
