package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class SystemForegroundService extends Service implements fn3 {
    public static final String X = y70.h("SystemFgService");
    public final n85 A = new n85(this);
    public boolean B;
    public ql6 L;
    public NotificationManager R;

    public final void a() {
        this.R = (NotificationManager) getApplicationContext().getSystemService("notification");
        ql6 ql6Var = new ql6(getApplicationContext());
        this.L = ql6Var;
        if (ql6Var.d0 != null) {
            y70.f().d(ql6.e0, "A callback already exists.");
        } else {
            ql6Var.d0 = this;
        }
    }

    public final void c() {
        n85 n85Var = this.A;
        n85Var.getClass();
        n85Var.s(pm3.ON_CREATE);
        super.onCreate();
    }

    public final void d() {
        n85 n85Var = this.A;
        n85Var.getClass();
        n85Var.s(pm3.ON_STOP);
        n85Var.s(pm3.ON_DESTROY);
        super.onDestroy();
    }

    @Override // defpackage.fn3
    public final rm3 getLifecycle() {
        return (in3) this.A.B;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        n85 n85Var = this.A;
        n85Var.getClass();
        n85Var.s(pm3.ON_START);
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
        n85 n85Var = this.A;
        n85Var.getClass();
        n85Var.s(pm3.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.B;
        String str = X;
        if (z) {
            y70.f().g(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.L.e();
            a();
            this.B = false;
        }
        if (intent != null) {
            ql6 ql6Var = this.L;
            ql6Var.getClass();
            String str2 = ql6.e0;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                y70 f = y70.f();
                f.g(str2, "Started foreground service " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                nh7 nh7Var = ql6Var.B;
                nh7Var.a.execute(new qj2(14, ql6Var, stringExtra, false));
                ql6Var.c(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                ql6Var.c(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                y70 f2 = y70.f();
                f2.g(str2, "Stopping foreground work for " + intent);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                    kh7 kh7Var = ql6Var.A;
                    UUID fromString = UUID.fromString(stringExtra2);
                    kh7Var.getClass();
                    fromString.getClass();
                    y60 y60Var = kh7Var.b.m;
                    k06 k06Var = kh7Var.d.a;
                    k06Var.getClass();
                    yf2.G(y60Var, "CancelWorkById", k06Var, new p6(16, kh7Var, fromString));
                    return 3;
                }
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                y70.f().g(str2, "Stopping foreground service");
                SystemForegroundService systemForegroundService = ql6Var.d0;
                if (systemForegroundService != null) {
                    systemForegroundService.B = true;
                    y70.f().b(str, "Shutting down.");
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
