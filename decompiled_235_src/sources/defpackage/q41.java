package defpackage;

import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q41  reason: default package */
/* loaded from: classes.dex */
public abstract class q41 {
    public static final Object a = new Object();
    public static final HashMap b = new HashMap();

    public static Context a(Context context) {
        int i;
        String str;
        Context applicationContext = context.getApplicationContext();
        int hashCode = context.getApplicationContext().hashCode();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            i = c2.f(context);
        } else {
            i = 0;
        }
        Context context2 = null;
        if (i2 >= 30) {
            str = q2.c(context);
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
                    applicationContext = c2.a(applicationContext, c2.f(context));
                }
                if (i2 >= 30) {
                    String c = q2.c(context);
                    if (!Objects.equals(c, q2.c(applicationContext))) {
                        applicationContext = q2.a(applicationContext, c);
                    }
                }
                hashMap.put(format, new WeakReference(applicationContext));
                return applicationContext;
            } finally {
            }
        }
    }
}
