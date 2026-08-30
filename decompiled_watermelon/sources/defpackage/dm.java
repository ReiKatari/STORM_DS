package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dm  reason: default package */
/* loaded from: classes.dex */
public abstract class dm {
    public static final int[] a = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    public static final ThreadFactory b;

    static {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        defaultThreadFactory.getClass();
        b = defaultThreadFactory;
    }

    public static ScheduledExecutorService a(am amVar, int i) {
        if (i > 0) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(i, amVar);
            newScheduledThreadPool.getClass();
            return newScheduledThreadPool;
        }
        i.g(wh1.j("Threads (", i, ") must be > 0"));
        return null;
    }

    public static bm b(ThreadFactory threadFactory, String str) {
        threadFactory.getClass();
        return new bm(threadFactory, str, w81.f(0));
    }
}
