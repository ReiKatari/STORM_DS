package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o35  reason: default package */
/* loaded from: classes.dex */
public final class o35 {
    public static final String l = ga0.h("Processor");
    public final Context b;
    public final az0 c;
    public final ow7 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public o35(Context context, az0 az0Var, ow7 ow7Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = az0Var;
        this.d = ow7Var;
        this.e = workDatabase;
    }

    public static boolean d(String str, rx7 rx7Var, int i) {
        String str2 = l;
        if (rx7Var != null) {
            rx7Var.m.s(new ix7(i));
            ga0 f = ga0.f();
            f.b(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        ga0 f2 = ga0.f();
        f2.b(str2, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(b72 b72Var) {
        synchronized (this.k) {
            this.j.add(b72Var);
        }
    }

    public final rx7 b(String str) {
        boolean z;
        rx7 rx7Var = (rx7) this.f.remove(str);
        if (rx7Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            rx7Var = (rx7) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = mx6.f0;
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
        return rx7Var;
    }

    public final rx7 c(String str) {
        rx7 rx7Var = (rx7) this.f.get(str);
        if (rx7Var == null) {
            return (rx7) this.g.get(str);
        }
        return rx7Var;
    }
}
