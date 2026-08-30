package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bt3  reason: default package */
/* loaded from: classes.dex */
public abstract class bt3 {
    public static final ip2 a;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yf] */
    static {
        String str;
        int i = bm6.a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = d06.A0(d06.w0(Arrays.asList(new Object()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((yf) obj).getClass();
                    do {
                        ((yf) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((yf) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    a = new ip2(kp2.b(mainLooper));
                    return;
                } else {
                    i.n("The main looper is not available");
                    return;
                }
            }
            i.n("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
