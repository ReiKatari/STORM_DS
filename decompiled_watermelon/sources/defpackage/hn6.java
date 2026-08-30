package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hn6  reason: default package */
/* loaded from: classes.dex */
public abstract class hn6 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final iq0 f;

    static {
        String str;
        int i = bm6.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = nl2.X(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = bm6.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = nl2.Y(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = nl2.Y(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(nl2.X(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = iq0.h0;
    }
}
