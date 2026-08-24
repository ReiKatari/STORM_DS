package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm  reason: default package */
/* loaded from: classes.dex */
public abstract class pm {
    public static final int[] a = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    public static final ThreadFactory b;

    static {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        defaultThreadFactory.getClass();
        b = defaultThreadFactory;
    }

    public static ScheduledExecutorService a(mm mmVar, int i) {
        if (i > 0) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(i, mmVar);
            newScheduledThreadPool.getClass();
            return newScheduledThreadPool;
        }
        i.f(lb1.k("Threads (", i, ") must be > 0"));
        return null;
    }

    public static nm b(ThreadFactory threadFactory, String str) {
        threadFactory.getClass();
        return new nm(threadFactory, str, g04.t(0));
    }
}
