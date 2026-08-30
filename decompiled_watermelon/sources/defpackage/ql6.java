package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ql6  reason: default package */
/* loaded from: classes.dex */
public final class ql6 implements nc4, k22 {
    public static final String e0 = y70.h("SystemFgDispatcher");
    public final kh7 A;
    public final nh7 B;
    public final Object L = new Object();
    public gh7 R;
    public final LinkedHashMap X;
    public final HashMap Y;
    public final HashMap Z;
    public final vq2 c0;
    public SystemForegroundService d0;

    public ql6(Context context) {
        kh7 b = kh7.b(context);
        this.A = b;
        this.B = b.d;
        this.R = null;
        this.X = new LinkedHashMap();
        this.Z = new HashMap();
        this.Y = new HashMap();
        this.c0 = new vq2(b.j);
        b.f.a(this);
    }

    public static Intent a(Context context, gh7 gh7Var, xe2 xe2Var) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", gh7Var.a);
        intent.putExtra("KEY_GENERATION", gh7Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", xe2Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", xe2Var.b);
        intent.putExtra("KEY_NOTIFICATION", xe2Var.c);
        return intent;
    }

    @Override // defpackage.nc4
    public final void b(xh7 xh7Var, sz0 sz0Var) {
        if (sz0Var instanceof rz0) {
            String str = xh7Var.a;
            y70 f = y70.f();
            f.b(e0, "Constraints unmet for WorkSpec " + str);
            gh7 b = ei7.b(xh7Var);
            int i = ((rz0) sz0Var).a;
            kh7 kh7Var = this.A;
            nh7 nh7Var = kh7Var.d;
            nh7Var.a.execute(new lf6(kh7Var.f, new td6(b), true, i));
        }
    }

    public final void c(Intent intent) {
        if (this.d0 != null) {
            int i = 0;
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            gh7 gh7Var = new gh7(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            y70 f = y70.f();
            f.b(e0, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
            if (notification != null) {
                xe2 xe2Var = new xe2(intExtra, notification, intExtra2);
                LinkedHashMap linkedHashMap = this.X;
                linkedHashMap.put(gh7Var, xe2Var);
                xe2 xe2Var2 = (xe2) linkedHashMap.get(this.R);
                if (xe2Var2 == null) {
                    this.R = gh7Var;
                } else {
                    this.d0.R.notify(intExtra, notification);
                    if (Build.VERSION.SDK_INT >= 29) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            i |= ((xe2) entry.getValue()).b;
                        }
                        xe2Var = new xe2(xe2Var2.a, xe2Var2.c, i);
                    } else {
                        xe2Var = xe2Var2;
                    }
                }
                SystemForegroundService systemForegroundService = this.d0;
                int i2 = xe2Var.a;
                int i3 = xe2Var.b;
                Notification notification2 = xe2Var.c;
                systemForegroundService.getClass();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 31) {
                    fp.u(systemForegroundService, i2, notification2, i3);
                    return;
                } else if (i4 >= 29) {
                    fp.t(systemForegroundService, i2, notification2, i3);
                    return;
                } else {
                    systemForegroundService.startForeground(i2, notification2);
                    return;
                }
            }
            i.i("Notification passed in the intent was null.");
            return;
        }
        i.n("handleNotify was called on the destroyed dispatcher");
    }

    @Override // defpackage.k22
    public final void d(gh7 gh7Var, boolean z) {
        c63 c63Var;
        Map.Entry entry;
        synchronized (this.L) {
            try {
                if (((xh7) this.Y.remove(gh7Var)) != null) {
                    c63Var = (c63) this.Z.remove(gh7Var);
                } else {
                    c63Var = null;
                }
                if (c63Var != null) {
                    c63Var.i(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xe2 xe2Var = (xe2) this.X.remove(gh7Var);
        if (gh7Var.equals(this.R)) {
            if (this.X.size() > 0) {
                Iterator it = this.X.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                }
                this.R = (gh7) entry.getKey();
                if (this.d0 != null) {
                    xe2 xe2Var2 = (xe2) entry.getValue();
                    SystemForegroundService systemForegroundService = this.d0;
                    int i = xe2Var2.a;
                    int i2 = xe2Var2.b;
                    Notification notification = xe2Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        fp.u(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        fp.t(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.d0.R.cancel(xe2Var2.a);
                }
            } else {
                this.R = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.d0;
        if (xe2Var != null && systemForegroundService2 != null) {
            y70.f().b(e0, "Removing Notification (id: " + xe2Var.a + ", workSpecId: " + gh7Var + ", notificationType: " + xe2Var.b);
            systemForegroundService2.R.cancel(xe2Var.a);
        }
    }

    public final void e() {
        this.d0 = null;
        synchronized (this.L) {
            try {
                for (c63 c63Var : this.Z.values()) {
                    c63Var.i(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ku4 ku4Var = this.A.f;
        synchronized (ku4Var.k) {
            ku4Var.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        y70 f = y70.f();
        f.g(e0, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.X.entrySet()) {
            if (((xe2) entry.getValue()).b == i2) {
                kh7 kh7Var = this.A;
                nh7 nh7Var = kh7Var.d;
                nh7Var.a.execute(new lf6(kh7Var.f, new td6((gh7) entry.getKey()), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.d0;
        if (systemForegroundService != null) {
            systemForegroundService.B = true;
            y70.f().b(SystemForegroundService.X, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
