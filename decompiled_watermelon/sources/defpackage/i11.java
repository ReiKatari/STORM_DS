package defpackage;

import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i11  reason: default package */
/* loaded from: classes.dex */
public abstract class i11 {
    public static final Object a = new Object();
    public static final HashMap b = new HashMap();

    public static Context a(Context context) {
        int i;
        String str;
        Context applicationContext = context.getApplicationContext();
        int hashCode = context.getApplicationContext().hashCode();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            i = a2.f(context);
        } else {
            i = 0;
        }
        Context context2 = null;
        if (i2 >= 30) {
            str = o2.c(context);
        } else {
            str = null;
        }
        String format = String.format("%d-%d-%s", Integer.valueOf(hashCode), Integer.valueOf(i), str);
        synchronized (a) {
            try {
                HashMap hashMap = b;
                WeakReference weakReference = (WeakReference) hashMap.get(format);
                if (weakReference != null) {
                    Context context3 = (Context) weakReference.get();
                    if (context3 != null) {
                        context2 = context3;
                    } else {
                        hashMap.remove(format);
                    }
                }
                if (context2 != null) {
                    return context2;
                }
                if (i2 >= 34) {
                    applicationContext = a2.a(applicationContext, a2.f(context));
                }
                if (i2 >= 30) {
                    String c = o2.c(context);
                    if (!Objects.equals(c, o2.c(applicationContext))) {
                        applicationContext = o2.a(applicationContext, c);
                    }
                }
                hashMap.put(format, new WeakReference(applicationContext));
                return applicationContext;
            } finally {
            }
        }
    }
}
