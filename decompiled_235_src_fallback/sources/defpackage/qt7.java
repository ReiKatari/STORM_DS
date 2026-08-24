package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qt7  reason: default package */
/* loaded from: classes.dex */
public final class qt7 {
    public static final /* synthetic */ defpackage.qt7 a = null;
    public static final defpackage.ex6 b = null;
    public static final defpackage.xd5 c = null;

    static {
            qt7 r0 = new qt7
            r0.<init>()
            defpackage.qt7.a = r0
            java.lang.Class<rt7> r0 = defpackage.rt7.class
            ar0 r0 = defpackage.gh5.a(r0)
            r0.c()
            kt5 r0 = new kt5
            r1 = 20
            r0.<init>(r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            defpackage.qt7.b = r1
            xd5 r0 = defpackage.xd5.e0
            defpackage.qt7.c = r0
            return
    }

    public static defpackage.j97 a(android.content.Context r4) {
            r4.getClass()
            ex6 r0 = defpackage.qt7.b
            java.lang.Object r0 = r0.getValue()
            gt7 r0 = (defpackage.gt7) r0
            if (r0 != 0) goto L69
            zh6 r0 = defpackage.zh6.c
            zh6 r0 = defpackage.zh6.c
            if (r0 != 0) goto L64
            java.util.concurrent.locks.ReentrantLock r0 = defpackage.zh6.d
            r0.lock()
            zh6 r1 = defpackage.zh6.c     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L5c
            r1 = 0
            cm7 r2 = defpackage.vh6.b()     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L24
            goto L52
        L24:
            cm7 r3 = defpackage.cm7.Y     // Catch: java.lang.Throwable -> L52
            r3.getClass()     // Catch: java.lang.Throwable -> L52
            ex6 r2 = r2.X     // Catch: java.lang.Throwable -> L52
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L52
            r2.getClass()     // Catch: java.lang.Throwable -> L52
            java.math.BigInteger r2 = (java.math.BigInteger) r2     // Catch: java.lang.Throwable -> L52
            ex6 r3 = r3.X     // Catch: java.lang.Throwable -> L52
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L52
            r3.getClass()     // Catch: java.lang.Throwable -> L52
            java.math.BigInteger r3 = (java.math.BigInteger) r3     // Catch: java.lang.Throwable -> L52
            int r2 = r2.compareTo(r3)     // Catch: java.lang.Throwable -> L52
            if (r2 < 0) goto L52
            xh6 r2 = new xh6     // Catch: java.lang.Throwable -> L52
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L52
            boolean r4 = r2.e()     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L51
            goto L52
        L51:
            r1 = r2
        L52:
            zh6 r4 = new zh6     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L5a
            defpackage.zh6.c = r4     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r4 = move-exception
            goto L60
        L5c:
            r0.unlock()
            goto L64
        L60:
            r0.unlock()
            throw r4
        L64:
            zh6 r0 = defpackage.zh6.c
            r0.getClass()
        L69:
            j97 r4 = new j97
            ov7 r1 = new ov7
            r1.<init>()
            yj7 r2 = new yj7
            r2.<init>()
            defpackage.s82.a()
            r4.<init>(r1, r0, r2)
            xd5 r0 = defpackage.qt7.c
            r0.getClass()
            return r4
    }
}
