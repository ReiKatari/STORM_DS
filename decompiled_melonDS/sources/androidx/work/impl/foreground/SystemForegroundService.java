package androidx.work.impl.foreground;

import a4.n;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import java.util.UUID;
import k7.a0;
import m0.h;
import p7.m;
import p8.v;
import q1.e;
import w8.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SystemForegroundService extends Service implements x {
    public static final String X = v.g("SystemFgService");
    public final n A = new n(this);
    public boolean B;
    public a L;
    public NotificationManager R;

    public final void b() {
        this.R = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.L = aVar;
        if (aVar.f14170c0 != null) {
            v.e().c(a.f14168d0, "A callback already exists.");
        } else {
            aVar.f14170c0 = this;
        }
    }

    public final void c() {
        n nVar = this.A;
        nVar.getClass();
        nVar.C(p.ON_CREATE);
        super.onCreate();
    }

    public final void d() {
        n nVar = this.A;
        nVar.getClass();
        nVar.C(p.ON_STOP);
        nVar.C(p.ON_DESTROY);
        super.onDestroy();
    }

    @Override // androidx.lifecycle.x
    public final r getLifecycle() {
        return (z) this.A.B;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        n nVar = this.A;
        nVar.getClass();
        nVar.C(p.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        c();
        b();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d();
        this.L.e();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i2) {
        n nVar = this.A;
        nVar.getClass();
        nVar.C(p.ON_START);
        super.onStart(intent, i2);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i10) {
        super.onStartCommand(intent, i2, i10);
        boolean z10 = this.B;
        String str = X;
        if (z10) {
            v.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.L.e();
            b();
            this.B = false;
        }
        if (intent != null) {
            a aVar = this.L;
            aVar.getClass();
            String str2 = a.f14168d0;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                v e6 = v.e();
                e6.f(str2, "Started foreground service " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                z8.a aVar2 = aVar.B;
                aVar2.f14969a.execute(new h(10, aVar, stringExtra, false));
                aVar.c(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                aVar.c(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                v e10 = v.e();
                e10.f(str2, "Stopping foreground work for " + intent);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                    q8.p pVar = aVar.A;
                    UUID fromString = UUID.fromString(stringExtra2);
                    pVar.getClass();
                    fromString.getClass();
                    p8.x xVar = pVar.f12372b.m;
                    a0 a0Var = pVar.f12374d.f14969a;
                    a0Var.getClass();
                    m.A(xVar, "CancelWorkById", a0Var, new e(14, pVar, fromString));
                    return 3;
                }
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                v.e().f(str2, "Stopping foreground service");
                SystemForegroundService systemForegroundService = aVar.f14170c0;
                if (systemForegroundService != null) {
                    systemForegroundService.B = true;
                    v.e().a(str, "Shutting down.");
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf(i10);
                    return 3;
                }
                return 3;
            } else {
                return 3;
            }
        }
        return 3;
    }

    public final void onTimeout(int i2) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.L.f(i2, 2048);
    }

    public final void onTimeout(int i2, int i10) {
        this.L.f(i2, i10);
    }
}
