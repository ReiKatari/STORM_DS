package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pz6  reason: default package */
/* loaded from: classes.dex */
public final class pz6 {
    public final defpackage.qz6 a;
    public final java.lang.String b;
    public boolean c;
    public defpackage.lz6 d;
    public final java.util.ArrayList e;
    public boolean f;

    public pz6(defpackage.qz6 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.e = r1
            return
    }

    public static void b(defpackage.pz6 r1, java.lang.String r2, long r3, defpackage.on2 r5, int r6) {
            r0 = r6 & 2
            if (r0 == 0) goto L6
            r3 = 0
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lc
            r6 = 1
            goto Ld
        Lc:
            r6 = 0
        Ld:
            r1.getClass()
            r2.getClass()
            r5.getClass()
            oz6 r0 = new oz6
            r0.<init>(r2, r6, r5)
            r1.c(r0, r3)
            return
    }

    public static /* synthetic */ void d(defpackage.pz6 r2, defpackage.lz6 r3) {
            r0 = 0
            r2.c(r3, r0)
            return
    }

    public final boolean a() {
            r6 = this;
            lz6 r0 = r6.d
            r1 = 1
            if (r0 == 0) goto Lb
            boolean r0 = r0.b
            if (r0 == 0) goto Lb
            r6.f = r1
        Lb:
            java.util.ArrayList r0 = r6.e
            int r2 = r0.size()
            int r2 = r2 - r1
            r3 = 0
        L13:
            r4 = -1
            if (r4 >= r2) goto L3e
            java.lang.Object r4 = r0.get(r2)
            lz6 r4 = (defpackage.lz6) r4
            boolean r4 = r4.b
            if (r4 == 0) goto L3b
            qz6 r3 = r6.a
            java.util.logging.Logger r3 = r3.b
            java.lang.Object r4 = r0.get(r2)
            lz6 r4 = (defpackage.lz6) r4
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            boolean r5 = r3.isLoggable(r5)
            if (r5 == 0) goto L37
            java.lang.String r5 = "canceled"
            defpackage.jx2.j(r3, r4, r6, r5)
        L37:
            r0.remove(r2)
            r3 = r1
        L3b:
            int r2 = r2 + (-1)
            goto L13
        L3e:
            return r3
    }

    public final void c(defpackage.lz6 r3, long r4) {
            r2 = this;
            r3.getClass()
            qz6 r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.c     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L37
            boolean r4 = r3.b     // Catch: java.lang.Throwable -> L20
            qz6 r5 = r2.a
            java.util.logging.Logger r5 = r5.b
            if (r4 == 0) goto L24
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L20
            boolean r4 = r5.isLoggable(r4)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L22
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            defpackage.jx2.j(r5, r3, r2, r4)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r2 = move-exception
            goto L45
        L22:
            monitor-exit(r0)
            return
        L24:
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L20
            boolean r4 = r5.isLoggable(r4)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L31
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            defpackage.jx2.j(r5, r3, r2, r4)     // Catch: java.lang.Throwable -> L20
        L31:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L20
            r2.<init>()     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L37:
            r1 = 0
            boolean r3 = r2.e(r3, r4, r1)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            qz6 r3 = r2.a     // Catch: java.lang.Throwable -> L20
            r3.c(r2)     // Catch: java.lang.Throwable -> L20
        L43:
            monitor-exit(r0)
            return
        L45:
            monitor-exit(r0)
            throw r2
    }

    public final boolean e(defpackage.lz6 r12, long r13, boolean r15) {
            r11 = this;
            qz6 r0 = r11.a
            java.util.logging.Logger r0 = r0.b
            r12.getClass()
            pz6 r1 = r12.c
            r2 = 0
            if (r1 != r11) goto Ld
            goto L11
        Ld:
            if (r1 != 0) goto L87
            r12.c = r11
        L11:
            long r3 = java.lang.System.nanoTime()
            long r5 = r3 + r13
            java.util.ArrayList r1 = r11.e
            int r7 = r1.indexOf(r12)
            r8 = -1
            if (r7 == r8) goto L37
            long r9 = r12.d
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 > 0) goto L34
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L86
            java.lang.String r13 = "already scheduled"
            defpackage.jx2.j(r0, r12, r11, r13)
            return r2
        L34:
            r1.remove(r7)
        L37:
            r12.d = r5
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r7 = r0.isLoggable(r7)
            if (r7 == 0) goto L5d
            if (r15 == 0) goto L4f
            long r5 = r5 - r3
            java.lang.String r15 = defpackage.jx2.s(r5)
            java.lang.String r5 = "run again after "
            java.lang.String r15 = r5.concat(r15)
            goto L5a
        L4f:
            long r5 = r5 - r3
            java.lang.String r15 = defpackage.jx2.s(r5)
            java.lang.String r5 = "scheduled after "
            java.lang.String r15 = r5.concat(r15)
        L5a:
            defpackage.jx2.j(r0, r12, r11, r15)
        L5d:
            int r11 = r1.size()
            r15 = r2
            r0 = r15
        L63:
            if (r0 >= r11) goto L78
            java.lang.Object r5 = r1.get(r0)
            int r0 = r0 + 1
            lz6 r5 = (defpackage.lz6) r5
            long r5 = r5.d
            long r5 = r5 - r3
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 <= 0) goto L75
            goto L79
        L75:
            int r15 = r15 + 1
            goto L63
        L78:
            r15 = r8
        L79:
            if (r15 != r8) goto L7f
            int r15 = r1.size()
        L7f:
            r1.add(r15, r12)
            if (r15 != 0) goto L86
            r11 = 1
            return r11
        L86:
            return r2
        L87:
            java.lang.String r11 = "task is in multiple queues"
            defpackage.i.m(r11)
            return r2
    }

    public final void f() {
            r2 = this;
            qz6 r0 = r2.a
            java.util.TimeZone r1 = defpackage.az7.a
            monitor-enter(r0)
            r1 = 1
            r2.c = r1     // Catch: java.lang.Throwable -> L14
            boolean r1 = r2.a()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            qz6 r1 = r2.a     // Catch: java.lang.Throwable -> L14
            r1.c(r2)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r0)
            return
        L18:
            monitor-exit(r0)
            throw r2
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }
}
