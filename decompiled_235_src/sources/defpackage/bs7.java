package defpackage;

import android.content.Context;
import android.os.PowerManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs7  reason: default package */
/* loaded from: classes.dex */
public abstract class bs7 {
    static {
        ga0.h("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String concat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (cs7.a) {
            String str = (String) cs7.b.put(newWakeLock, concat);
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
