package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb6  reason: default package */
/* loaded from: classes.dex */
public final class zb6 implements java.util.concurrent.Executor {
    public final /* synthetic */ int A;
    public final java.util.concurrent.Executor B;
    public final java.util.ArrayDeque L;
    public java.lang.Runnable R;
    public final java.lang.Object X;

    public zb6(java.util.concurrent.Executor r1, int r2) {
            r0 = this;
            r0.A = r2
            switch(r2) {
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r0.B = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.L = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.X = r1
            return
        L19:
            r1.getClass()
            r0.<init>()
            r0.B = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.L = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.X = r1
            return
    }

    public zb6(defpackage.uj1 r2) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.X = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.L = r0
            r1.B = r2
            return
    }

    public final void a() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.X
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r3.L     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L1c
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L1c
            r3.R = r1     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            java.util.concurrent.Executor r3 = r3.B     // Catch: java.lang.Throwable -> L1c
            uj1 r3 = (defpackage.uj1) r3     // Catch: java.lang.Throwable -> L1c
            r3.execute(r1)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
        L22:
            java.lang.Object r0 = r3.X
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r3.L     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L38
            r2 = r1
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L38
            r3.R = r2     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            java.util.concurrent.Executor r3 = r3.B     // Catch: java.lang.Throwable -> L38
            r3.execute(r2)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r3 = move-exception
            goto L3c
        L3a:
            monitor-exit(r0)
            return
        L3c:
            monitor-exit(r0)
            throw r3
        L3e:
            java.util.ArrayDeque r0 = r3.L
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r3.R = r0
            if (r0 == 0) goto L4f
            java.util.concurrent.Executor r3 = r3.B
            r3.execute(r0)
        L4f:
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r5) {
            r4 = this;
            int r0 = r4.A
            switch(r0) {
                case 0: goto L41;
                case 1: goto L21;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.X
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r4.L     // Catch: java.lang.Throwable -> L1b
            mf r2 = new mf     // Catch: java.lang.Throwable -> L1b
            r3 = 2
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L1b
            r1.add(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.Runnable r5 = r4.R     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L1d
            r4.a()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r4 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L21:
            r5.getClass()
            java.lang.Object r0 = r4.X
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r4.L     // Catch: java.lang.Throwable -> L3b
            q64 r2 = new q64     // Catch: java.lang.Throwable -> L3b
            r3 = 11
            r2.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> L3b
            r1.offer(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.Runnable r5 = r4.R     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L3d
            r4.a()     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r4 = move-exception
            goto L3f
        L3d:
            monitor-exit(r0)
            return
        L3f:
            monitor-exit(r0)
            throw r4
        L41:
            java.lang.Object r0 = r4.X
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r4.L     // Catch: java.lang.Throwable -> L58
            uo2 r2 = new uo2     // Catch: java.lang.Throwable -> L58
            r3 = 15
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L58
            r1.add(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.Runnable r5 = r4.R     // Catch: java.lang.Throwable -> L58
            if (r5 != 0) goto L5a
            r4.a()     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L5c
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            return
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            throw r4
    }
}
