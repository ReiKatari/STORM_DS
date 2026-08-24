package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz6  reason: default package */
/* loaded from: classes.dex */
public abstract class sz6 {
    public static final java.lang.String a = null;
    public static final long b = 0;
    public static final int c = 0;
    public static final int d = 0;
    public static final long e = 0;
    public static final defpackage.xd5 f = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.default.name"
            int r1 = defpackage.xx6.a
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Le
            java.lang.String r0 = "DefaultDispatcher"
        Le:
            defpackage.sz6.a = r0
            r3 = 1
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = 100000(0x186a0, double:4.94066E-319)
            java.lang.String r7 = "kotlinx.coroutines.scheduler.resolution.ns"
            long r0 = defpackage.bl2.U(r1, r3, r5, r7)
            defpackage.sz6.b = r0
            int r0 = defpackage.xx6.a
            r1 = 2
            if (r0 >= r1) goto L28
            r0 = r1
        L28:
            r1 = 8
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            int r0 = defpackage.bl2.V(r0, r1, r2)
            defpackage.sz6.c = r0
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            r1 = 4
            java.lang.String r2 = "kotlinx.coroutines.scheduler.max.pool.size"
            int r0 = defpackage.bl2.V(r0, r1, r2)
            defpackage.sz6.d = r0
            r3 = 1
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = 60
            java.lang.String r7 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            long r0 = defpackage.bl2.U(r1, r3, r5, r7)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.toNanos(r0)
            defpackage.sz6.e = r0
            xd5 r0 = defpackage.xd5.h0
            defpackage.sz6.f = r0
            return
    }
}
