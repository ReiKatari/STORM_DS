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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j84  reason: default package */
/* loaded from: classes.dex */
public final class j84 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public j84(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(i84 i84Var) {
        boolean z;
        ArrayDeque arrayDeque = i84Var.d;
        ComponentName componentName = i84Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (i84Var.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.a;
                boolean bindService = context.bindService(component, this, 33);
                i84Var.b = bindService;
                if (bindService) {
                    i84Var.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z = i84Var.b;
            }
            if (z && i84Var.c != null) {
                while (true) {
                    g84 g84Var = (g84) arrayDeque.peek();
                    if (g84Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + g84Var);
                        }
                        g84Var.a(i84Var.c);
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
                    b(i84Var);
                    return;
                }
                return;
            }
            b(i84Var);
        }
    }

    public final void b(i84 i84Var) {
        ComponentName componentName = i84Var.a;
        ArrayDeque arrayDeque = i84Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = i84Var.e;
        int i2 = i + 1;
        i84Var.e = i2;
        if (i2 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + i84Var.e + " retries");
            arrayDeque.clear();
            return;
        }
        int i3 = (1 << i) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [uu2, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        wu2 wu2Var = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    i84 i84Var = (i84) this.c.get((ComponentName) message.obj);
                    if (i84Var != null) {
                        a(i84Var);
                        return true;
                    }
                } else {
                    i84 i84Var2 = (i84) this.c.get((ComponentName) message.obj);
                    if (i84Var2 != null) {
                        if (i84Var2.b) {
                            this.a.unbindService(this);
                            i84Var2.b = false;
                        }
                        i84Var2.c = null;
                        return true;
                    }
                }
            } else {
                h84 h84Var = (h84) message.obj;
                ComponentName componentName = h84Var.a;
                IBinder iBinder = h84Var.b;
                i84 i84Var3 = (i84) this.c.get(componentName);
                if (i84Var3 != null) {
                    int i2 = vu2.d;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(wu2.c);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof wu2)) {
                            wu2Var = (wu2) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.d = iBinder;
                            wu2Var = obj;
                        }
                    }
                    i84Var3.c = wu2Var;
                    i84Var3.e = 0;
                    a(i84Var3);
                    return true;
                }
            }
        } else {
            g84 g84Var = (g84) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (k84.c) {
                if (string != null) {
                    try {
                        if (!string.equals(k84.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            k84.e = hashSet2;
                            k84.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = k84.e;
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
                        this.c.put(componentName3, new i84(componentName3));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        i84 i84Var4 = (i84) entry.getValue();
                        if (i84Var4.b) {
                            this.a.unbindService(this);
                            i84Var4.b = false;
                        }
                        i84Var4.c = null;
                        it2.remove();
                    }
                }
            }
            for (i84 i84Var5 : this.c.values()) {
                i84Var5.d.add(g84Var);
                a(i84Var5);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.b.obtainMessage(1, new h84(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
