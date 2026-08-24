package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm  reason: default package */
/* loaded from: classes.dex */
public abstract class pm {
    public static final int[] a = null;
    public static final java.util.concurrent.ThreadFactory b = null;

    static {
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA  , data: [19, 16, 13, 10, 0, -2, -4, -5, -6, -8} // fill-array
            defpackage.pm.a = r0
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r0.getClass()
            defpackage.pm.b = r0
            return
    }

    public static java.util.concurrent.ScheduledExecutorService a(defpackage.mm r1, int r2) {
            if (r2 <= 0) goto La
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newScheduledThreadPool(r2, r1)
            r1.getClass()
            return r1
        La:
            java.lang.String r1 = "Threads ("
            java.lang.String r0 = ") must be > 0"
            java.lang.String r1 = defpackage.lb1.k(r1, r2, r0)
            defpackage.i.f(r1)
            r1 = 0
            return r1
    }

    public static defpackage.nm b(java.util.concurrent.ThreadFactory r2, java.lang.String r3) {
            r2.getClass()
            r0 = 0
            uw r0 = defpackage.g04.t(r0)
            nm r1 = new nm
            r1.<init>(r2, r3, r0)
            return r1
    }
}
