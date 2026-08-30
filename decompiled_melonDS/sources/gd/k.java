package gd;

import ed.t;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f5646a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f5647b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f5648c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f5649d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f5650e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f5651f;

    static {
        String str;
        int i2 = t.f4468a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f5646a = str;
        f5647b = ed.b.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = t.f4468a;
        if (i10 < 2) {
            i10 = 2;
        }
        f5648c = ed.b.l(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f5649d = ed.b.l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f5650e = TimeUnit.SECONDS.toNanos(ed.b.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5651f = h.f5645a;
    }
}
