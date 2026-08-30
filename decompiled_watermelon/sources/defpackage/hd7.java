package defpackage;

import android.content.Context;
import android.os.PowerManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hd7  reason: default package */
/* loaded from: classes.dex */
public abstract class hd7 {
    static {
        y70.h("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String concat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (id7.a) {
            String str = (String) id7.b.put(newWakeLock, concat);
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
