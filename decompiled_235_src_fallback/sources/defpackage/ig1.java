package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig1  reason: default package */
/* loaded from: classes.dex */
public abstract class ig1 {
    public static final boolean k = false;
    public static final java.util.concurrent.atomic.AtomicInteger l = null;
    public static final java.util.concurrent.atomic.AtomicInteger m = null;
    public final java.lang.Object a;
    public int b;
    public boolean c;
    public defpackage.qb0 d;
    public final defpackage.tb0 e;
    public defpackage.qb0 f;
    public final defpackage.tb0 g;
    public final android.util.Size h;
    public final int i;
    public java.lang.Class j;

    static {
            android.util.Size r0 = new android.util.Size
            r1 = 0
            r0.<init>(r1, r1)
            java.lang.String r0 = "DeferrableSurface"
            boolean r0 = defpackage.kj2.F(r0)
            defpackage.ig1.k = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            defpackage.ig1.l = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            defpackage.ig1.m = r0
            return
    }

    public ig1(int r3, android.util.Size r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.a = r0
            r0 = 0
            r2.b = r0
            r2.c = r0
            r2.h = r4
            r2.i = r3
            gg1 r3 = new gg1
            r3.<init>(r2, r0)
            tb0 r3 = defpackage.ak7.W(r3)
            r2.e = r3
            gg1 r4 = new gg1
            r0 = 1
            r4.<init>(r2, r0)
            tb0 r4 = defpackage.ak7.W(r4)
            r2.g = r4
            java.lang.String r4 = "DeferrableSurface"
            boolean r4 = defpackage.kj2.F(r4)
            if (r4 == 0) goto L5c
            java.util.concurrent.atomic.AtomicInteger r4 = defpackage.ig1.m
            int r4 = r4.incrementAndGet()
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.ig1.l
            int r0 = r0.get()
            java.lang.String r1 = "Surface created"
            r2.e(r4, r0, r1)
            java.lang.Exception r4 = new java.lang.Exception
            r4.<init>()
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            mf r0 = new mf
            r1 = 18
            r0.<init>(r1, r2, r4)
            uj1 r2 = defpackage.u24.j()
            sb0 r3 = r3.B
            r3.a(r2, r0)
        L5c:
            return
    }

    public void a() {
            r6 = this;
            java.lang.String r0 = "surface closed,  useCount="
            java.lang.Object r1 = r6.a
            monitor-enter(r1)
            boolean r2 = r6.c     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            if (r2 != 0) goto L42
            r2 = 1
            r6.c = r2     // Catch: java.lang.Throwable -> L1b
            qb0 r2 = r6.f     // Catch: java.lang.Throwable -> L1b
            r2.a(r3)     // Catch: java.lang.Throwable -> L1b
            int r2 = r6.b     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L1d
            qb0 r2 = r6.d     // Catch: java.lang.Throwable -> L1b
            r6.d = r3     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r6 = move-exception
            goto L4a
        L1d:
            r2 = r3
        L1e:
            java.lang.String r4 = "DeferrableSurface"
            boolean r4 = defpackage.kj2.F(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L43
            java.lang.String r4 = "DeferrableSurface"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            int r0 = r6.b     // Catch: java.lang.Throwable -> L1b
            r5.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = " closed=true "
            r5.append(r0)     // Catch: java.lang.Throwable -> L1b
            r5.append(r6)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L1b
            defpackage.kj2.t(r4, r6)     // Catch: java.lang.Throwable -> L1b
            goto L43
        L42:
            r2 = r3
        L43:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L49
            r2.a(r3)
        L49:
            return
        L4a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r6
    }

    public final void b() {
            r6 = this;
            java.lang.String r0 = "use count-1,  useCount="
            java.lang.Object r1 = r6.a
            monitor-enter(r1)
            int r2 = r6.b     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L65
            int r2 = r2 + (-1)
            r6.b = r2     // Catch: java.lang.Throwable -> L19
            r3 = 0
            if (r2 != 0) goto L1b
            boolean r2 = r6.c     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L1b
            qb0 r2 = r6.d     // Catch: java.lang.Throwable -> L19
            r6.d = r3     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r6 = move-exception
            goto L6d
        L1b:
            r2 = r3
        L1c:
            java.lang.String r4 = "DeferrableSurface"
            boolean r4 = defpackage.kj2.F(r4)     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L5e
            java.lang.String r4 = "DeferrableSurface"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L19
            int r0 = r6.b     // Catch: java.lang.Throwable -> L19
            r5.append(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = " closed="
            r5.append(r0)     // Catch: java.lang.Throwable -> L19
            boolean r0 = r6.c     // Catch: java.lang.Throwable -> L19
            r5.append(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = " "
            r5.append(r0)     // Catch: java.lang.Throwable -> L19
            r5.append(r6)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L19
            defpackage.kj2.t(r4, r0)     // Catch: java.lang.Throwable -> L19
            int r0 = r6.b     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L5e
            java.lang.String r0 = "Surface no longer in use"
            java.util.concurrent.atomic.AtomicInteger r4 = defpackage.ig1.m     // Catch: java.lang.Throwable -> L19
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.atomic.AtomicInteger r5 = defpackage.ig1.l     // Catch: java.lang.Throwable -> L19
            int r5 = r5.decrementAndGet()     // Catch: java.lang.Throwable -> L19
            r6.e(r4, r5, r0)     // Catch: java.lang.Throwable -> L19
        L5e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L64
            r2.a(r3)
        L64:
            return
        L65:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "Decrementing use count occurs more times than incrementing"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L19
            throw r6     // Catch: java.lang.Throwable -> L19
        L6d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r6
    }

    public final defpackage.gx3 c() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.c     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            hg1 r1 = new hg1     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "DeferrableSurface already closed."
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L16
            n33 r3 = new n33     // Catch: java.lang.Throwable -> L16
            r2 = 1
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r3
        L16:
            r3 = move-exception
            goto L1e
        L18:
            gx3 r3 = r3.f()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r3
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public final void d() {
            r5 = this;
            java.lang.String r0 = "use count+1, useCount="
            java.lang.Object r1 = r5.a
            monitor-enter(r1)
            int r2 = r5.b     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            boolean r3 = r5.c     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto Le
            goto L18
        Le:
            hg1 r0 = new hg1     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "Cannot begin use on a closed surface."
            r0.<init>(r2, r5)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L16:
            r5 = move-exception
            goto L56
        L18:
            r3 = 1
            int r2 = r2 + r3
            r5.b = r2     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "DeferrableSurface"
            boolean r2 = defpackage.kj2.F(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L54
            int r2 = r5.b     // Catch: java.lang.Throwable -> L16
            if (r2 != r3) goto L39
            java.lang.String r2 = "New surface in use"
            java.util.concurrent.atomic.AtomicInteger r3 = defpackage.ig1.m     // Catch: java.lang.Throwable -> L16
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.atomic.AtomicInteger r4 = defpackage.ig1.l     // Catch: java.lang.Throwable -> L16
            int r4 = r4.incrementAndGet()     // Catch: java.lang.Throwable -> L16
            r5.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L16
        L39:
            java.lang.String r2 = "DeferrableSurface"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L16
            int r0 = r5.b     // Catch: java.lang.Throwable -> L16
            r3.append(r0)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = " "
            r3.append(r0)     // Catch: java.lang.Throwable -> L16
            r3.append(r5)     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L16
            defpackage.kj2.t(r2, r5)     // Catch: java.lang.Throwable -> L16
        L54:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            return
        L56:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r5
    }

    public final void e(int r3, int r4, java.lang.String r5) {
            r2 = this;
            boolean r0 = defpackage.ig1.k
            java.lang.String r1 = "DeferrableSurface"
            if (r0 != 0) goto L11
            boolean r0 = defpackage.kj2.F(r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics."
            defpackage.kj2.t(r1, r0)
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "[total_surfaces="
            r0.append(r5)
            r0.append(r3)
            java.lang.String r3 = ", used_surfaces="
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "]("
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            defpackage.kj2.t(r1, r2)
            return
    }

    public abstract defpackage.gx3 f();
}
