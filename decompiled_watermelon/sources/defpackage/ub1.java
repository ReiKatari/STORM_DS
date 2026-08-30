package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ub1  reason: default package */
/* loaded from: classes.dex */
public final class ub1 extends ep2 {
    public final Object h;
    public final ExecutorService i;
    public volatile Handler j;

    public ub1() {
        super(24);
        this.h = new Object();
        this.i = Executors.newFixedThreadPool(4, new wc0(1));
    }

    public static Handler L(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return dp.a(looper);
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
