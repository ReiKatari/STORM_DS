package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k84  reason: default package */
/* loaded from: classes.dex */
public final class k84 {
    public static String d;
    public static j84 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public k84(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            g84 g84Var = new g84(this.a.getPackageName(), notification);
            synchronized (f) {
                try {
                    if (g == null) {
                        g = new j84(this.a.getApplicationContext());
                    }
                    g.b.obtainMessage(0, g84Var).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.b.cancel(null, 2002);
            return;
        }
        this.b.notify(null, 2002, notification);
    }
}
