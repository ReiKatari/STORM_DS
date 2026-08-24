package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bh4  reason: default package */
/* loaded from: classes.dex */
public final class bh4 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public bh4(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(ah4 ah4Var) {
        boolean z;
        ArrayDeque arrayDeque = ah4Var.d;
        ComponentName componentName = ah4Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (ah4Var.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.a;
                boolean bindService = context.bindService(component, this, 33);
                ah4Var.b = bindService;
                if (bindService) {
                    ah4Var.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z = ah4Var.b;
            }
            if (z && ah4Var.c != null) {
                while (true) {
                    yg4 yg4Var = (yg4) arrayDeque.peek();
                    if (yg4Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + yg4Var);
                        }
                        yg4Var.a(ah4Var.c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(ah4Var);
                    return;
                }
                return;
            }
            b(ah4Var);
        }
    }

    public final void b(ah4 ah4Var) {
        ComponentName componentName = ah4Var.a;
        ArrayDeque arrayDeque = ah4Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = ah4Var.e;
        int i2 = i + 1;
        ah4Var.e = i2;
        if (i2 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + ah4Var.e + " retries");
            arrayDeque.clear();
            return;
        }
        int i3 = (1 << i) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, w03] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        y03 y03Var = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    ah4 ah4Var = (ah4) this.c.get((ComponentName) message.obj);
                    if (ah4Var != null) {
                        a(ah4Var);
                        return true;
                    }
                } else {
                    ah4 ah4Var2 = (ah4) this.c.get((ComponentName) message.obj);
                    if (ah4Var2 != null) {
                        if (ah4Var2.b) {
                            this.a.unbindService(this);
                            ah4Var2.b = false;
                        }
                        ah4Var2.c = null;
                        return true;
                    }
                }
            } else {
                zg4 zg4Var = (zg4) message.obj;
                ComponentName componentName = zg4Var.a;
                IBinder iBinder = zg4Var.b;
                ah4 ah4Var3 = (ah4) this.c.get(componentName);
                if (ah4Var3 != null) {
                    int i2 = x03.d;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(y03.c);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof y03)) {
                            y03Var = (y03) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.d = iBinder;
                            y03Var = obj;
                        }
                    }
                    ah4Var3.c = y03Var;
                    ah4Var3.e = 0;
                    a(ah4Var3);
                    return true;
                }
            }
        } else {
            yg4 yg4Var = (yg4) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (ch4.c) {
                if (string != null) {
                    try {
                        if (!string.equals(ch4.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            ch4.e = hashSet2;
                            ch4.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = ch4.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.c.put(componentName3, new ah4(componentName3));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        ah4 ah4Var4 = (ah4) entry.getValue();
                        if (ah4Var4.b) {
                            this.a.unbindService(this);
                            ah4Var4.b = false;
                        }
                        ah4Var4.c = null;
                        it2.remove();
                    }
                }
            }
            for (ah4 ah4Var5 : this.c.values()) {
                ah4Var5.d.add(yg4Var);
                a(ah4Var5);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.b.obtainMessage(1, new zg4(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
