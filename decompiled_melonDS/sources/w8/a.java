package w8;

import a0.j;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import c8.d0;
import j0.o1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p7.l;
import p8.m;
import p8.v;
import q8.d;
import q8.p;
import t8.b;
import t8.c;
import t8.f;
import x8.i;
import zc.y0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements f, q8.a {

    /* renamed from: d0  reason: collision with root package name */
    public static final String f14168d0 = v.g("SystemFgDispatcher");
    public final p A;
    public final z8.a B;
    public final Object L = new Object();
    public i R;
    public final LinkedHashMap X;
    public final HashMap Y;
    public final HashMap Z;

    /* renamed from: b0  reason: collision with root package name */
    public final o1 f14169b0;

    /* renamed from: c0  reason: collision with root package name */
    public SystemForegroundService f14170c0;

    public a(Context context) {
        p a10 = p.a(context);
        this.A = a10;
        this.B = a10.f12374d;
        this.R = null;
        this.X = new LinkedHashMap();
        this.Z = new HashMap();
        this.Y = new HashMap();
        this.f14169b0 = new o1(a10.f12380j);
        a10.f12376f.a(this);
    }

    public static Intent a(Context context, i iVar, m mVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", iVar.f14391a);
        intent.putExtra("KEY_GENERATION", iVar.f14392b);
        intent.putExtra("KEY_NOTIFICATION_ID", mVar.f11497a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar.f11498b);
        intent.putExtra("KEY_NOTIFICATION", mVar.f11499c);
        return intent;
    }

    @Override // q8.a
    public final void b(i iVar, boolean z10) {
        y0 y0Var;
        Map.Entry entry;
        synchronized (this.L) {
            try {
                if (((x8.p) this.Y.remove(iVar)) != null) {
                    y0Var = (y0) this.Z.remove(iVar);
                } else {
                    y0Var = null;
                }
                if (y0Var != null) {
                    y0Var.i(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m mVar = (m) this.X.remove(iVar);
        if (iVar.equals(this.R)) {
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
                this.R = (i) entry.getKey();
                if (this.f14170c0 != null) {
                    m mVar2 = (m) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f14170c0;
                    int i2 = mVar2.f11497a;
                    int i10 = mVar2.f11498b;
                    Notification notification = mVar2.f11499c;
                    systemForegroundService.getClass();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 31) {
                        d0.k(systemForegroundService, i2, notification, i10);
                    } else if (i11 >= 29) {
                        d0.j(systemForegroundService, i2, notification, i10);
                    } else {
                        systemForegroundService.startForeground(i2, notification);
                    }
                    this.f14170c0.R.cancel(mVar2.f11497a);
                }
            } else {
                this.R = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f14170c0;
        if (mVar != null && systemForegroundService2 != null) {
            v.e().a(f14168d0, "Removing Notification (id: " + mVar.f11497a + ", workSpecId: " + iVar + ", notificationType: " + mVar.f11498b);
            systemForegroundService2.R.cancel(mVar.f11497a);
        }
    }

    public final void c(Intent intent) {
        if (this.f14170c0 != null) {
            int i2 = 0;
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            i iVar = new i(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            v e6 = v.e();
            e6.a(f14168d0, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
            if (notification != null) {
                m mVar = new m(intExtra, notification, intExtra2);
                LinkedHashMap linkedHashMap = this.X;
                linkedHashMap.put(iVar, mVar);
                m mVar2 = (m) linkedHashMap.get(this.R);
                if (mVar2 == null) {
                    this.R = iVar;
                } else {
                    this.f14170c0.R.notify(intExtra, notification);
                    if (Build.VERSION.SDK_INT >= 29) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            i2 |= ((m) entry.getValue()).f11498b;
                        }
                        mVar = new m(mVar2.f11497a, mVar2.f11499c, i2);
                    } else {
                        mVar = mVar2;
                    }
                }
                SystemForegroundService systemForegroundService = this.f14170c0;
                int i10 = mVar.f11497a;
                int i11 = mVar.f11498b;
                Notification notification2 = mVar.f11499c;
                systemForegroundService.getClass();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 31) {
                    d0.k(systemForegroundService, i10, notification2, i11);
                    return;
                } else if (i12 >= 29) {
                    d0.j(systemForegroundService, i10, notification2, i11);
                    return;
                } else {
                    systemForegroundService.startForeground(i10, notification2);
                    return;
                }
            }
            j.h("Notification passed in the intent was null.");
            return;
        }
        j.p("handleNotify was called on the destroyed dispatcher");
    }

    @Override // t8.f
    public final void d(x8.p pVar, c cVar) {
        if (cVar instanceof b) {
            String str = pVar.f14420a;
            v e6 = v.e();
            e6.a(f14168d0, "Constraints unmet for WorkSpec " + str);
            i k10 = l.k(pVar);
            int i2 = ((b) cVar).f13136a;
            p pVar2 = this.A;
            z8.a aVar = pVar2.f12374d;
            aVar.f14969a.execute(new y8.j(pVar2.f12376f, new q8.j(k10), true, i2));
        }
    }

    public final void e() {
        this.f14170c0 = null;
        synchronized (this.L) {
            try {
                for (y0 y0Var : this.Z.values()) {
                    y0Var.i(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d dVar = this.A.f12376f;
        synchronized (dVar.f12351k) {
            dVar.f12350j.remove(this);
        }
    }

    public final void f(int i2, int i10) {
        v e6 = v.e();
        e6.f(f14168d0, "Foreground service timed out, FGS type: " + i10);
        for (Map.Entry entry : this.X.entrySet()) {
            if (((m) entry.getValue()).f11498b == i10) {
                p pVar = this.A;
                z8.a aVar = pVar.f12374d;
                aVar.f14969a.execute(new y8.j(pVar.f12376f, new q8.j((i) entry.getKey()), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f14170c0;
        if (systemForegroundService != null) {
            systemForegroundService.B = true;
            v.e().a(SystemForegroundService.X, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i2);
        }
    }
}
