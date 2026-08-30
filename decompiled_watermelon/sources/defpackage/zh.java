package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zh  reason: default package */
/* loaded from: classes.dex */
public abstract class zh {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = zb4.class.getPackage();
        if (r2 != null) {
            str = r2.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(zb4.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(it2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(fn6.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = zt3.r0(linkedHashMap);
    }

    public static void a(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) b.get(str);
        if (str3 == null) {
            str3 = zg6.Y0(23, str);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int y0 = zg6.y0('\n', i2, 4, str2);
                if (y0 == -1) {
                    y0 = length;
                }
                while (true) {
                    min = Math.min(y0, i2 + 4000);
                    Log.println(i, str3, str2.substring(i2, min));
                    if (min >= y0) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (a.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(ai.a);
        }
    }
}
