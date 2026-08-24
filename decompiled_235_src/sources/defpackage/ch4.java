package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch4  reason: default package */
/* loaded from: classes.dex */
public final class ch4 {
    public static String d;
    public static bh4 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public ch4(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            yg4 yg4Var = new yg4(this.a.getPackageName(), notification);
            synchronized (f) {
                try {
                    if (g == null) {
                        g = new bh4(this.a.getApplicationContext());
                    }
                    g.b.obtainMessage(0, yg4Var).sendToTarget();
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
