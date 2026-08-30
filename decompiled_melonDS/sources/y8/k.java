package y8;

import android.content.Context;
import android.os.PowerManager;
import p8.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k {
    static {
        v.g("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String concat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (l.f14800a) {
            String str = (String) l.f14801b.put(newWakeLock, concat);
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
