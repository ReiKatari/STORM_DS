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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mx6  reason: default package */
/* loaded from: classes.dex */
public final class mx6 implements ll4, b72 {
    public static final String f0 = ga0.h("SystemFgDispatcher");
    public final lw7 A;
    public final ow7 B;
    public final Object L = new Object();
    public gw7 R;
    public final LinkedHashMap X;
    public final HashMap Y;
    public final HashMap Z;
    public final ww2 d0;
    public SystemForegroundService e0;

    public mx6(Context context) {
        lw7 b = lw7.b(context);
        this.A = b;
        this.B = b.d;
        this.R = null;
        this.X = new LinkedHashMap();
        this.Z = new HashMap();
        this.Y = new HashMap();
        this.d0 = new ww2(b.j);
        b.f.a(this);
    }

    public static Intent c(Context context, gw7 gw7Var, wj2 wj2Var) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", gw7Var.a);
        intent.putExtra("KEY_GENERATION", gw7Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", wj2Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", wj2Var.b);
        intent.putExtra("KEY_NOTIFICATION", wj2Var.c);
        return intent;
    }

    @Override // defpackage.ll4
    public final void a(yw7 yw7Var, x21 x21Var) {
        if (x21Var instanceof w21) {
            String str = yw7Var.a;
            ga0 f = ga0.f();
            f.b(f0, "Constraints unmet for WorkSpec " + str);
            gw7 a = rr7.a(yw7Var);
            int i = ((w21) x21Var).a;
            lw7 lw7Var = this.A;
            ow7 ow7Var = lw7Var.d;
            ow7Var.a.execute(new ar6(lw7Var.f, new jp6(a), true, i));
        }
    }

    @Override // defpackage.b72
    public final void b(gw7 gw7Var, boolean z) {
        rc3 rc3Var;
        Map.Entry entry;
        synchronized (this.L) {
            try {
                if (((yw7) this.Y.remove(gw7Var)) != null) {
                    rc3Var = (rc3) this.Z.remove(gw7Var);
                } else {
                    rc3Var = null;
                }
                if (rc3Var != null) {
                    rc3Var.h(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wj2 wj2Var = (wj2) this.X.remove(gw7Var);
        if (gw7Var.equals(this.R)) {
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
                this.R = (gw7) entry.getKey();
                if (this.e0 != null) {
                    wj2 wj2Var2 = (wj2) entry.getValue();
                    SystemForegroundService systemForegroundService = this.e0;
                    int i = wj2Var2.a;
                    int i2 = wj2Var2.b;
                    Notification notification = wj2Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        rp.w(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        rp.u(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.e0.R.cancel(wj2Var2.a);
                }
            } else {
                this.R = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.e0;
        if (wj2Var != null && systemForegroundService2 != null) {
            ga0.f().b(f0, "Removing Notification (id: " + wj2Var.a + ", workSpecId: " + gw7Var + ", notificationType: " + wj2Var.b);
            systemForegroundService2.R.cancel(wj2Var.a);
        }
    }

    public final void d(Intent intent) {
        if (this.e0 != null) {
            int i = 0;
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            gw7 gw7Var = new gw7(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            ga0 f = ga0.f();
            f.b(f0, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
            if (notification != null) {
                wj2 wj2Var = new wj2(intExtra, notification, intExtra2);
                LinkedHashMap linkedHashMap = this.X;
                linkedHashMap.put(gw7Var, wj2Var);
                wj2 wj2Var2 = (wj2) linkedHashMap.get(this.R);
                if (wj2Var2 == null) {
                    this.R = gw7Var;
                } else {
                    this.e0.R.notify(intExtra, notification);
                    if (Build.VERSION.SDK_INT >= 29) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            i |= ((wj2) entry.getValue()).b;
                        }
                        wj2Var = new wj2(wj2Var2.a, wj2Var2.c, i);
                    } else {
                        wj2Var = wj2Var2;
                    }
                }
                SystemForegroundService systemForegroundService = this.e0;
                int i2 = wj2Var.a;
                int i3 = wj2Var.b;
                Notification notification2 = wj2Var.c;
                systemForegroundService.getClass();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 31) {
                    rp.w(systemForegroundService, i2, notification2, i3);
                    return;
                } else if (i4 >= 29) {
                    rp.u(systemForegroundService, i2, notification2, i3);
                    return;
                } else {
                    systemForegroundService.startForeground(i2, notification2);
                    return;
                }
            }
            i.h("Notification passed in the intent was null.");
            return;
        }
        i.m("handleNotify was called on the destroyed dispatcher");
    }

    public final void e() {
        this.e0 = null;
        synchronized (this.L) {
            try {
                for (rc3 rc3Var : this.Z.values()) {
                    rc3Var.h(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o35 o35Var = this.A.f;
        synchronized (o35Var.k) {
            o35Var.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        ga0 f = ga0.f();
        f.g(f0, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.X.entrySet()) {
            if (((wj2) entry.getValue()).b == i2) {
                lw7 lw7Var = this.A;
                ow7 ow7Var = lw7Var.d;
                ow7Var.a.execute(new ar6(lw7Var.f, new jp6((gw7) entry.getKey()), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.e0;
        if (systemForegroundService != null) {
            systemForegroundService.B = true;
            ga0.f().b(SystemForegroundService.X, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
