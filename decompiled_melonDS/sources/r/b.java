package r;

import a6.k;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d0.n;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends p7.a {

    /* renamed from: b  reason: collision with root package name */
    public final Object f12558b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f12559c = Executors.newFixedThreadPool(4, new n(2));

    /* renamed from: d  reason: collision with root package name */
    public volatile Handler f12560d;

    public static Handler D(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
