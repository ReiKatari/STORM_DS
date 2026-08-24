package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e04  reason: default package */
/* loaded from: classes.dex */
public abstract class e04 {
    public static final jv2 a;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mg] */
    static {
        String str;
        int i = xx6.a;
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
            Iterator it = sb6.c0(sb6.Y(Arrays.asList(new Object()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((mg) obj).getClass();
                    do {
                        ((mg) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((mg) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    a = new jv2(lv2.b(mainLooper));
                    return;
                } else {
                    i.m("The main looper is not available");
                    return;
                }
            }
            i.m("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
