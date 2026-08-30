package u5;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import c8.d0;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final long f13493a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f13494b;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f13493a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f13494b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e6) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e6);
            }
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d0.b();
        }
        try {
            return ((Boolean) f13494b.invoke(null, Long.valueOf(f13493a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
