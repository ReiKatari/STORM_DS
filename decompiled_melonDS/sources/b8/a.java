package b8;

import android.os.Trace;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(int i2, String str) {
        Trace.beginAsyncSection(str, i2);
    }

    public static void b(int i2, String str) {
        Trace.endAsyncSection(str, i2);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(int i2, String str) {
        Trace.setCounter(str, i2);
    }
}
