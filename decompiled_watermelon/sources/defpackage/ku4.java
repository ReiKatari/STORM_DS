package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ku4  reason: default package */
/* loaded from: classes.dex */
public final class ku4 {
    public static final String l = y70.h("Processor");
    public final Context b;
    public final ew0 c;
    public final nh7 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public ku4(Context context, ew0 ew0Var, nh7 nh7Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = ew0Var;
        this.d = nh7Var;
        this.e = workDatabase;
    }

    public static boolean d(String str, ui7 ui7Var, int i) {
        String str2 = l;
        if (ui7Var != null) {
            ui7Var.m.t(new li7(i));
            y70 f = y70.f();
            f.b(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        y70 f2 = y70.f();
        f2.b(str2, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(k22 k22Var) {
        synchronized (this.k) {
            this.j.add(k22Var);
        }
    }

    public final ui7 b(String str) {
        boolean z;
        ui7 ui7Var = (ui7) this.f.remove(str);
        if (ui7Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ui7Var = (ui7) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = ql6.e0;
                        Intent intent = new Intent(context, SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        this.b.startService(intent);
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return ui7Var;
    }

    public final ui7 c(String str) {
        ui7 ui7Var = (ui7) this.f.get(str);
        if (ui7Var == null) {
            return (ui7) this.g.get(str);
        }
        return ui7Var;
    }
}
