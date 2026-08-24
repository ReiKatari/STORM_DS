package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zg0  reason: default package */
/* loaded from: classes.dex */
public final class zg0 {
    public final defpackage.rc3 a;
    public final java.lang.Object b;
    public final java.util.ArrayList c;
    public final java.lang.Object d;
    public final java.util.ArrayList e;
    public final java.lang.Object f;
    public final java.util.ArrayList g;

    public zg0(defpackage.rc3 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.c = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.e = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.g = r1
            return
    }

    public final void a(defpackage.wg0 r3, java.lang.Runnable r4) {
            r2 = this;
            r3.getClass()
            int[] r0 = defpackage.xg0.a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L34
            r1 = 2
            if (r0 == r1) goto L26
            r1 = 3
            if (r0 != r1) goto L22
            java.lang.Object r0 = r2.f
            monitor-enter(r0)
            java.util.ArrayList r2 = r2.g     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r2.add(r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            goto L3e
        L1f:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L22:
            defpackage.i.d()
            return
        L26:
            java.lang.Object r0 = r2.d
            monitor-enter(r0)
            java.util.ArrayList r2 = r2.e     // Catch: java.lang.Throwable -> L31
            boolean r2 = r2.add(r4)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)
            goto L3e
        L31:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L34:
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            java.util.ArrayList r2 = r2.c     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r2.add(r4)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)
        L3e:
            if (r2 != 0) goto L5b
            java.lang.String r2 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraPipeLifetime already shut down. This is unexpected. Executing "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " shutdown action immediately..."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.util.Log.e(r2, r3)
            r4.run()
        L5b:
            return
        L5c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final void b() {
            r6 = this;
            java.lang.Object r0 = r6.b
            monitor-enter(r0)
            java.lang.String r1 = "CXCP"
            java.lang.String r2 = "Shutting down cameras..."
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L20
            java.util.ArrayList r1 = r6.c     // Catch: java.lang.Throwable -> L20
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L20
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r2) goto L22
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> L20
            int r4 = r4 + 1
            java.lang.Runnable r5 = (java.lang.Runnable) r5     // Catch: java.lang.Throwable -> L20
            r5.run()     // Catch: java.lang.Throwable -> L20
            goto L12
        L20:
            r6 = move-exception
            goto L7a
        L22:
            monitor-exit(r0)
            java.lang.Object r0 = r6.d
            monitor-enter(r0)
            java.lang.String r1 = "CXCP"
            java.lang.String r2 = "Shutting down scopes..."
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L42
            java.util.ArrayList r1 = r6.e     // Catch: java.lang.Throwable -> L42
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L42
            r4 = r3
        L34:
            if (r4 >= r2) goto L44
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> L42
            int r4 = r4 + 1
            java.lang.Runnable r5 = (java.lang.Runnable) r5     // Catch: java.lang.Throwable -> L42
            r5.run()     // Catch: java.lang.Throwable -> L42
            goto L34
        L42:
            r6 = move-exception
            goto L78
        L44:
            yg0 r1 = new yg0     // Catch: java.lang.Throwable -> L42
            r2 = 1
            r4 = 0
            r1.<init>(r6, r4, r2)     // Catch: java.lang.Throwable -> L42
            vt1 r2 = defpackage.vt1.A     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = defpackage.hv.V(r2, r1)     // Catch: java.lang.Throwable -> L42
            jg7 r1 = (defpackage.jg7) r1     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            java.lang.Object r0 = r6.f
            monitor-enter(r0)
            java.lang.String r1 = "CXCP"
            java.lang.String r2 = "Shutting down threads..."
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList r6 = r6.g     // Catch: java.lang.Throwable -> L72
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L72
        L64:
            if (r3 >= r1) goto L74
            java.lang.Object r2 = r6.get(r3)     // Catch: java.lang.Throwable -> L72
            int r3 = r3 + 1
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L72
            r2.run()     // Catch: java.lang.Throwable -> L72
            goto L64
        L72:
            r6 = move-exception
            goto L76
        L74:
            monitor-exit(r0)
            return
        L76:
            monitor-exit(r0)
            throw r6
        L78:
            monitor-exit(r0)
            throw r6
        L7a:
            monitor-exit(r0)
            throw r6
    }
}
