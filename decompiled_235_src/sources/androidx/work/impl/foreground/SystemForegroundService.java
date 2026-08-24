package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SystemForegroundService extends Service implements hu3 {
    public static final String X = ga0.h("SystemFgService");
    public final m44 A = new m44(this);
    public boolean B;
    public mx6 L;
    public NotificationManager R;

    public final void a() {
        this.R = (NotificationManager) getApplicationContext().getSystemService("notification");
        mx6 mx6Var = new mx6(getApplicationContext());
        this.L = mx6Var;
        if (mx6Var.e0 != null) {
            ga0.f().d(mx6.f0, "A callback already exists.");
        } else {
            mx6Var.e0 = this;
        }
    }

    public final void c() {
        m44 m44Var = this.A;
        m44Var.getClass();
        m44Var.C(st3.ON_CREATE);
        super.onCreate();
    }

    public final void d() {
        m44 m44Var = this.A;
        m44Var.getClass();
        m44Var.C(st3.ON_STOP);
        m44Var.C(st3.ON_DESTROY);
        super.onDestroy();
    }

    @Override // defpackage.hu3
    public final ut3 getLifecycle() {
        return (ku3) this.A.B;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        m44 m44Var = this.A;
        m44Var.getClass();
        m44Var.C(st3.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        c();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d();
        this.L.e();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        m44 m44Var = this.A;
        m44Var.getClass();
        m44Var.C(st3.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.B;
        String str = X;
        if (z) {
            ga0.f().g(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.L.e();
            a();
            this.B = false;
        }
        if (intent != null) {
            mx6 mx6Var = this.L;
            mx6Var.getClass();
            String str2 = mx6.f0;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                ga0 f = ga0.f();
                f.g(str2, "Started foreground service " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                ow7 ow7Var = mx6Var.B;
                ow7Var.a.execute(new uo2(17, mx6Var, stringExtra, false));
                mx6Var.d(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                mx6Var.d(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                ga0 f2 = ga0.f();
                f2.g(str2, "Stopping foreground work for " + intent);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                    lw7 lw7Var = mx6Var.A;
                    UUID fromString = UUID.fromString(stringExtra2);
                    lw7Var.getClass();
                    fromString.getClass();
                    xd5 xd5Var = lw7Var.b.m;
                    zb6 zb6Var = lw7Var.d.a;
                    zb6Var.getClass();
                    uj2.a0(xd5Var, "CancelWorkById", zb6Var, new q6(16, lw7Var, fromString));
                    return 3;
                }
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                ga0.f().g(str2, "Stopping foreground service");
                SystemForegroundService systemForegroundService = mx6Var.e0;
                if (systemForegroundService != null) {
                    systemForegroundService.B = true;
                    ga0.f().b(str, "Shutting down.");
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf(i2);
                    return 3;
                }
                return 3;
            } else {
                return 3;
            }
        }
        return 3;
    }

    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.L.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.L.f(i, i2);
    }
}
