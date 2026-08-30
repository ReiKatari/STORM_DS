package aj;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.x;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet f855a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f856b;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = x.class.getPackage();
        if (r22 != null) {
            str = r22.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(x.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(wi.i.class.getName(), "okhttp.Http2");
        linkedHashMap.put(si.c.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f856b = v.I(linkedHashMap);
    }

    public static void a(String str, int i2, String str2, Throwable th2) {
        int min;
        String str3 = (String) f856b.get(str);
        if (str3 == null) {
            str3 = vc.h.B0(23, str);
        }
        if (Log.isLoggable(str3, i2)) {
            if (th2 != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th2);
            }
            int length = str2.length();
            int i10 = 0;
            while (i10 < length) {
                int g02 = vc.h.g0('\n', i10, 4, str2);
                if (g02 == -1) {
                    g02 = length;
                }
                while (true) {
                    min = Math.min(g02, i10 + 4000);
                    Log.println(i2, str3, str2.substring(i10, min));
                    if (min >= g02) {
                        break;
                    }
                    i10 = min;
                }
                i10 = min + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f855a.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.f857a);
        }
    }
}
