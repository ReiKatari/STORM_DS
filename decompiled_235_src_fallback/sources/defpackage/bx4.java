package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bx4  reason: default package */
/* loaded from: classes.dex */
public final class bx4 {
    public final java.lang.Object a;
    public final java.util.concurrent.CopyOnWriteArrayList b;
    public java.util.List c;
    public java.lang.Throwable d;
    public boolean e;
    public final defpackage.le2 f;
    public final defpackage.o41 g;
    public final java.util.concurrent.atomic.AtomicBoolean h;
    public defpackage.ap6 i;
    public final android.hardware.camera2.CameraManager j;

    public bx4(defpackage.be5 r5, defpackage.o41 r6, java.util.List r7, android.content.Context r8) {
            r4 = this;
            r5.getClass()
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.a = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.b = r0
            r0 = 0
            r4.d = r0
            r1 = 0
            r4.e = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L23:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r7.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            yf0 r3 = defpackage.nc1.J(r3, r0, r0)
            r2.add(r3)
            goto L23
        L3a:
            r4.c = r2
            r4.f = r5
            r4.g = r6
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r5.<init>(r1)
            r4.h = r5
            java.lang.String r5 = "camera"
            java.lang.Object r5 = r8.getSystemService(r5)
            r5.getClass()
            android.hardware.camera2.CameraManager r5 = (android.hardware.camera2.CameraManager) r5
            r4.j = r5
            return
    }

    public final defpackage.gx3 a() {
            r7 = this;
            java.lang.String r0 = "FetchData for PipeCameraPresence0"
            qb0 r1 = new qb0
            r1.<init>()
            hl5 r2 = new hl5
            r2.<init>()
            r1.c = r2
            tb0 r2 = new tb0
            r2.<init>(r1)
            r1.b = r2
            java.lang.Class<i61> r3 = defpackage.i61.class
            r1.a = r3
            o41 r3 = r7.g     // Catch: java.lang.Exception -> L2a
            m5 r4 = new m5     // Catch: java.lang.Exception -> L2a
            r5 = 22
            r6 = 0
            r4.<init>(r7, r1, r6, r5)     // Catch: java.lang.Exception -> L2a
            r7 = 3
            defpackage.hv.L(r3, r6, r6, r4, r7)     // Catch: java.lang.Exception -> L2a
            r1.a = r0     // Catch: java.lang.Exception -> L2a
            return r2
        L2a:
            r7 = move-exception
            r2.b(r7)
            return r2
    }

    public final void b() {
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.h
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            java.lang.String r1 = "PipePresenceSrc"
            if (r0 != 0) goto L12
            java.lang.String r6 = "Monitoring is already active. Ignoring redundant start call."
            android.util.Log.i(r1, r6)
            return
        L12:
            java.lang.String r0 = "Starting to collect camera ID flow."
            android.util.Log.i(r1, r0)
            ap6 r0 = r6.i
            r1 = 0
            if (r0 == 0) goto L1f
            r0.h(r1)
        L1f:
            zg5 r0 = new zg5
            r0.<init>()
            r0.A = r2
            b7 r3 = new b7
            r4 = 11
            le2 r5 = r6.f
            r3.<init>(r5, r4)
            u12 r4 = new u12
            r5 = 21
            r4.<init>(r6, r0, r1, r5)
            cf2 r0 = new cf2
            r5 = 2
            r0.<init>(r3, r4, r5)
            m02 r3 = new m02
            r3.<init>(r6, r1)
            wp0 r4 = new wp0
            r4.<init>(r2, r0, r3)
            a6 r0 = new a6
            r2 = 20
            r0.<init>(r4, r1, r2)
            r2 = 3
            o41 r3 = r6.g
            ap6 r0 = defpackage.hv.L(r3, r1, r1, r0, r2)
            r6.i = r0
            return
    }

    public final void c(java.util.List r6, java.lang.Throwable r7) {
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L21
            java.lang.Throwable r6 = r5.d     // Catch: java.lang.Throwable -> L16
            if (r6 == 0) goto L19
            java.util.List r6 = r5.c     // Catch: java.lang.Throwable -> L16
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r6 != 0) goto L14
            goto L19
        L14:
            r6 = r2
            goto L1a
        L16:
            r5 = move-exception
            goto L88
        L19:
            r6 = r1
        L1a:
            r5.d = r7     // Catch: java.lang.Throwable -> L16
            java.util.List r7 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L16
            r5.c = r7     // Catch: java.lang.Throwable -> L16
            goto L3a
        L21:
            r6.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.Throwable r7 = r5.d     // Catch: java.lang.Throwable -> L16
            if (r7 != 0) goto L33
            java.util.List r7 = r5.c     // Catch: java.lang.Throwable -> L16
            boolean r7 = r7.equals(r6)     // Catch: java.lang.Throwable -> L16
            if (r7 != 0) goto L31
            goto L33
        L31:
            r7 = r2
            goto L34
        L33:
            r7 = r1
        L34:
            r3 = 0
            r5.d = r3     // Catch: java.lang.Throwable -> L16
            r5.c = r6     // Catch: java.lang.Throwable -> L16
            r6 = r7
        L3a:
            java.util.List r7 = r5.c     // Catch: java.lang.Throwable -> L16
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)     // Catch: java.lang.Throwable -> L16
            java.lang.Throwable r3 = r5.d     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            if (r6 == 0) goto L87
            java.lang.String r6 = "CameraPresenceSrc"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Data changed. Notifying "
            r0.<init>(r4)
            java.util.concurrent.CopyOnWriteArrayList r4 = r5.b
            int r4 = r4.size()
            r0.append(r4)
            java.lang.String r4 = " observers. Error: "
            r0.append(r4)
            if (r3 == 0) goto L5f
            goto L60
        L5f:
            r1 = r2
        L60:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r6, r0)
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.b
            java.util.Iterator r5 = r5.iterator()
        L70:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L87
            java.lang.Object r6 = r5.next()
            w r6 = (defpackage.w) r6
            vb6 r0 = r6.a
            v r1 = new v
            r1.<init>(r3, r6, r7, r2)
            r0.execute(r1)
            goto L70
        L87:
            return
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r5
    }
}
