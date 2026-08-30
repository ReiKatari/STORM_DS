package k7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends Binder implements f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f8016c;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f8016c = multiInstanceInvalidationService;
        attachInterface(this, f.f8007b);
    }

    @Override // k7.f
    public final void b(String[] strArr, int i2) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f8016c;
        synchronized (multiInstanceInvalidationService.L) {
            String str = (String) multiInstanceInvalidationService.B.get(Integer.valueOf(i2));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.L.beginBroadcast();
            int i10 = 0;
            while (true) {
                i iVar = multiInstanceInvalidationService.L;
                if (i10 < beginBroadcast) {
                    Object broadcastCookie = iVar.getBroadcastCookie(i10);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.B.get(num);
                    if (i2 != intValue && str.equals(str2)) {
                        try {
                            ((e) multiInstanceInvalidationService.L.getBroadcastItem(i10)).a(strArr);
                        } catch (RemoteException e6) {
                            Log.w("ROOM", "Error invoking a remote callback", e6);
                        }
                    }
                    i10++;
                } else {
                    iVar.finishBroadcast();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [k7.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [k7.d, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i10) {
        String str = f.f8007b;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        e eVar = null;
        e eVar2 = null;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return super.onTransact(i2, parcel, parcel2, i10);
                }
                b(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(e.f8006a);
                if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                    eVar2 = (e) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f8005c = readStrongBinder;
                    eVar2 = obj;
                }
            }
            int readInt = parcel.readInt();
            eVar2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f8016c;
            synchronized (multiInstanceInvalidationService.L) {
                multiInstanceInvalidationService.L.unregister(eVar2);
                String str2 = (String) multiInstanceInvalidationService.B.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(e.f8006a);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof e)) {
                eVar = (e) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.f8005c = readStrongBinder2;
                eVar = obj2;
            }
        }
        String readString = parcel.readString();
        eVar.getClass();
        int i11 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f8016c;
            synchronized (multiInstanceInvalidationService2.L) {
                try {
                    int i12 = multiInstanceInvalidationService2.A + 1;
                    multiInstanceInvalidationService2.A = i12;
                    if (multiInstanceInvalidationService2.L.register(eVar, Integer.valueOf(i12))) {
                        multiInstanceInvalidationService2.B.put(Integer.valueOf(i12), readString);
                        i11 = i12;
                    } else {
                        multiInstanceInvalidationService2.A--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i11);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
