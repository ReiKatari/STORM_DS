package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sf1  reason: default package */
/* loaded from: classes.dex */
public final class sf1 extends np2 {
    public final Object e;
    public final ExecutorService f;
    public volatile Handler g;

    public sf1() {
        super(24);
        this.e = new Object();
        this.f = Executors.newFixedThreadPool(4, new ff0(1));
    }

    public static Handler l0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return pp.a(looper);
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
