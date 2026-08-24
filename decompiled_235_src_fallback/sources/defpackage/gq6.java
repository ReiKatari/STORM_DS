package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq6  reason: default package */
/* loaded from: classes.dex */
public final class gq6 implements java.lang.Runnable {
    public static final java.lang.Object d0 = null;
    public final java.util.concurrent.Executor A;
    public final defpackage.bi4 B;
    public final java.util.concurrent.atomic.AtomicBoolean L;
    public final java.util.concurrent.atomic.AtomicReference R;
    public java.lang.Object X;
    public int Y;
    public boolean Z;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.gq6.d0 = r0
            return
    }

    public gq6(java.util.concurrent.atomic.AtomicReference r3, java.util.concurrent.Executor r4, defpackage.bi4 r5) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r2.L = r0
            java.lang.Object r0 = defpackage.gq6.d0
            r2.X = r0
            r0 = -1
            r2.Y = r0
            r0 = 0
            r2.Z = r0
            r2.R = r3
            r2.A = r4
            r2.B = r5
            return
    }

    public final void a(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.L     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            goto L2e
        Ld:
            int r0 = r1.Y     // Catch: java.lang.Throwable -> Lb
            if (r2 > r0) goto L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return
        L13:
            r1.Y = r2     // Catch: java.lang.Throwable -> Lb
            boolean r2 = r1.Z     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return
        L1b:
            r2 = 1
            r1.Z = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.Executor r2 = r1.A     // Catch: java.lang.Throwable -> L25
            r2.execute(r1)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            monitor-enter(r1)
            r2 = 0
            r1.Z = r2     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r2
        L2e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.L     // Catch: java.lang.Throwable -> Le
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            if (r0 != 0) goto L10
            r5.Z = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            goto L51
        L10:
            java.util.concurrent.atomic.AtomicReference r0 = r5.R     // Catch: java.lang.Throwable -> Le
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Le
            int r2 = r5.Y     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
        L19:
            java.lang.Object r3 = r5.X
            boolean r3 = java.util.Objects.equals(r3, r0)
            if (r3 != 0) goto L31
            r5.X = r0
            boolean r3 = r0 instanceof defpackage.xy
            bi4 r4 = r5.B
            if (r3 == 0) goto L2e
            r0 = 0
            r4.onError(r0)
            goto L31
        L2e:
            r4.u(r0)
        L31:
            monitor-enter(r5)
            int r0 = r5.Y     // Catch: java.lang.Throwable -> L49
            if (r2 == r0) goto L4b
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.L     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L3f
            goto L4b
        L3f:
            java.util.concurrent.atomic.AtomicReference r0 = r5.R     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L49
            int r2 = r5.Y     // Catch: java.lang.Throwable -> L49
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            goto L19
        L49:
            r0 = move-exception
            goto L4f
        L4b:
            r5.Z = r1     // Catch: java.lang.Throwable -> L49
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            return
        L4f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            throw r0
        L51:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            throw r0
    }
}
