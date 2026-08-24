package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o35  reason: default package */
/* loaded from: classes.dex */
public final class o35 {
    public static final java.lang.String l = null;
    public android.os.PowerManager.WakeLock a;
    public final android.content.Context b;
    public final defpackage.az0 c;
    public final defpackage.ow7 d;
    public final androidx.work.impl.WorkDatabase e;
    public final java.util.HashMap f;
    public final java.util.HashMap g;
    public final java.util.HashMap h;
    public final java.util.HashSet i;
    public final java.util.ArrayList j;
    public final java.lang.Object k;

    static {
            java.lang.String r0 = "Processor"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.o35.l = r0
            return
    }

    public o35(android.content.Context r1, defpackage.az0 r2, defpackage.ow7 r3, androidx.work.impl.WorkDatabase r4) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.g = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.i = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.j = r1
            r1 = 0
            r0.a = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.k = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.h = r1
            return
    }

    public static boolean d(java.lang.String r2, defpackage.rx7 r3, int r4) {
            java.lang.String r0 = defpackage.o35.l
            if (r3 == 0) goto L25
            tc3 r3 = r3.m
            ix7 r1 = new ix7
            r1.<init>(r4)
            r3.s(r1)
            ga0 r3 = defpackage.ga0.f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "WorkerWrapper interrupted for "
            r4.<init>(r1)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.b(r0, r2)
            r2 = 1
            return r2
        L25:
            ga0 r3 = defpackage.ga0.f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "WorkerWrapper could not be found for "
            r4.<init>(r1)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.b(r0, r2)
            r2 = 0
            return r2
    }

    public final void a(defpackage.b72 r2) {
            r1 = this;
            java.lang.Object r0 = r1.k
            monitor-enter(r0)
            java.util.ArrayList r1 = r1.j     // Catch: java.lang.Throwable -> La
            r1.add(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final defpackage.rx7 b(java.lang.String r6) {
            r5 = this;
            java.util.HashMap r0 = r5.f
            java.lang.Object r0 = r0.remove(r6)
            rx7 r0 = (defpackage.rx7) r0
            if (r0 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 != 0) goto L17
            java.util.HashMap r0 = r5.g
            java.lang.Object r0 = r0.remove(r6)
            rx7 r0 = (defpackage.rx7) r0
        L17:
            java.util.HashMap r2 = r5.h
            r2.remove(r6)
            if (r1 == 0) goto L5c
            java.lang.Object r6 = r5.k
            monitor-enter(r6)
            java.util.HashMap r1 = r5.f     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L58
            android.content.Context r1 = r5.b     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = defpackage.mx6.f0     // Catch: java.lang.Throwable -> L56
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L56
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r3 = androidx.work.impl.foreground.SystemForegroundService.class
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "ACTION_STOP_FOREGROUND"
            r2.setAction(r1)     // Catch: java.lang.Throwable -> L56
            android.content.Context r1 = r5.b     // Catch: java.lang.Throwable -> L3f
            r1.startService(r2)     // Catch: java.lang.Throwable -> L3f
            goto L4b
        L3f:
            r1 = move-exception
            ga0 r2 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = defpackage.o35.l     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "Unable to stop foreground service"
            r2.e(r3, r4, r1)     // Catch: java.lang.Throwable -> L56
        L4b:
            android.os.PowerManager$WakeLock r1 = r5.a     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L58
            r1.release()     // Catch: java.lang.Throwable -> L56
            r1 = 0
            r5.a = r1     // Catch: java.lang.Throwable -> L56
            goto L58
        L56:
            r5 = move-exception
            goto L5a
        L58:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            goto L5c
        L5a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            throw r5
        L5c:
            return r0
    }

    public final defpackage.rx7 c(java.lang.String r2) {
            r1 = this;
            java.util.HashMap r0 = r1.f
            java.lang.Object r0 = r0.get(r2)
            rx7 r0 = (defpackage.rx7) r0
            if (r0 != 0) goto L13
            java.util.HashMap r1 = r1.g
            java.lang.Object r1 = r1.get(r2)
            rx7 r1 = (defpackage.rx7) r1
            return r1
        L13:
            return r0
    }
}
