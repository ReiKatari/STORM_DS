package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s84  reason: default package */
/* loaded from: classes.dex */
public final class s84 extends Binder implements v03 {
    public final /* synthetic */ MultiInstanceInvalidationService d;

    public s84(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.d = multiInstanceInvalidationService;
        attachInterface(this, v03.b);
    }

    @Override // defpackage.v03
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
                t84 t84Var = multiInstanceInvalidationService.L;
                if (i2 < beginBroadcast) {
                    Object broadcastCookie = t84Var.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.B.get(num);
                    if (i != intValue && str.equals(str2)) {
                        try {
                            ((u03) multiInstanceInvalidationService.L.getBroadcastItem(i2)).a(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                    i2++;
                } else {
                    t84Var.finishBroadcast();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [t03, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [t03, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = v03.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        u03 u03Var = null;
        u03 u03Var2 = null;
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
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(u03.a);
                if (queryLocalInterface != null && (queryLocalInterface instanceof u03)) {
                    u03Var2 = (u03) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.d = readStrongBinder;
                    u03Var2 = obj;
                }
            }
            int readInt = parcel.readInt();
            u03Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
            synchronized (multiInstanceInvalidationService.L) {
                multiInstanceInvalidationService.L.unregister(u03Var2);
                String str2 = (String) multiInstanceInvalidationService.B.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(u03.a);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof u03)) {
                u03Var = (u03) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.d = readStrongBinder2;
                u03Var = obj2;
            }
        }
        String readString = parcel.readString();
        u03Var.getClass();
        int i3 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.d;
            synchronized (multiInstanceInvalidationService2.L) {
                try {
                    int i4 = multiInstanceInvalidationService2.A + 1;
                    multiInstanceInvalidationService2.A = i4;
                    if (multiInstanceInvalidationService2.L.register(u03Var, Integer.valueOf(i4))) {
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
