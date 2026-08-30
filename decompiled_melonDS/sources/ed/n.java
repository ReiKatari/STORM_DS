package ed;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final ad.e f4465a;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ad.a] */
    static {
        String str;
        int i2 = t.f4468a;
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
            Iterator it = uc.h.L(uc.h.I(Arrays.asList(new Object()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((ad.a) obj).getClass();
                    do {
                        ((ad.a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((ad.a) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    f4465a = new ad.e(ad.h.b(mainLooper));
                    return;
                } else {
                    a0.j.p("The main looper is not available");
                    return;
                }
            }
            a0.j.p("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
