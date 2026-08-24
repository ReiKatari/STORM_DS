package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mq1  reason: default package */
/* loaded from: classes.dex */
public final class mq1 implements defpackage.xv6, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    public final defpackage.iq1 a;
    public final android.os.HandlerThread b;
    public final defpackage.ov2 c;
    public final android.os.Handler d;
    public int e;
    public boolean f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public final java.util.LinkedHashMap h;
    public android.graphics.SurfaceTexture i;
    public android.graphics.SurfaceTexture j;

    public mq1(defpackage.yq1 r3, defpackage.u63 r4, defpackage.u63 r5) {
            r2 = this;
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r2.<init>()
            r0 = 0
            r2.e = r0
            r2.f = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r0)
            r2.g = r1
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.h = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "CameraX-GL Thread"
            r0.<init>(r1)
            r2.b = r0
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r2.d = r1
            ov2 r0 = new ov2
            r0.<init>(r1)
            r2.c = r0
            iq1 r0 = new iq1
            r0.<init>(r4, r5)
            r2.a = r0
            r2.e(r3)     // Catch: java.lang.RuntimeException -> L41
            return
        L41:
            r3 = move-exception
            r2.release()
            throw r3
    }

    @Override // defpackage.xv6
    public final void a(defpackage.bw6 r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.g
            boolean r0 = r0.get()
            if (r0 == 0) goto Lc
            r4.b()
            return
        Lc:
            mf r0 = new mf
            r1 = 19
            r0.<init>(r1, r3, r4)
            of1 r1 = new of1
            r2 = 0
            r1.<init>(r4, r2)
            r3.d(r0, r1)
            return
    }

    @Override // defpackage.xv6
    public final void b(defpackage.wv6 r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.g
            boolean r0 = r0.get()
            if (r0 == 0) goto Lc
            r4.close()
            return
        Lc:
            mf r0 = new mf
            r1 = 20
            r0.<init>(r1, r3, r4)
            java.util.Objects.requireNonNull(r4)
            n0 r1 = new n0
            r2 = 17
            r1.<init>(r4, r2)
            r3.d(r0, r1)
            return
    }

    public final void c() {
            r3 = this;
            boolean r0 = r3.f
            if (r0 == 0) goto L47
            int r0 = r3.e
            if (r0 != 0) goto L47
            java.util.LinkedHashMap r0 = r3.h
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            wv6 r2 = (defpackage.wv6) r2
            r2.close()
            goto L12
        L22:
            r0.clear()
            iq1 r0 = r3.a
            java.lang.Object r1 = r0.L
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r2 = 0
            boolean r1 = r1.getAndSet(r2)
            if (r1 != 0) goto L33
            goto L3d
        L33:
            java.lang.Object r1 = r0.X
            java.lang.Thread r1 = (java.lang.Thread) r1
            defpackage.bp2.c(r1)
            r0.n()
        L3d:
            r1 = -1
            r0.j0 = r1
            r0.k0 = r1
            android.os.HandlerThread r3 = r3.b
            r3.quit()
        L47:
            return
    }

    public final void d(java.lang.Runnable r4, java.lang.Runnable r5) {
            r3 = this;
            ov2 r0 = r3.c     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            v r1 = new v     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            r2 = 15
            r1.<init>(r3, r5, r4, r2)     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r4 = "DualSurfaceProcessor"
            java.lang.String r0 = "Unable to executor runnable"
            defpackage.kj2.g0(r4, r0, r3)
            r5.run()
            return
    }

    public final void e(defpackage.yq1 r6) {
            r5 = this;
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            java.lang.String r0 = "Init GlRenderer"
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
            v r3 = new v     // Catch: java.lang.Exception -> L2c
            r3.<init>(r5, r6, r1)     // Catch: java.lang.Exception -> L2c
            ge r6 = new ge     // Catch: java.lang.Exception -> L2c
            r4 = 4
            r6.<init>(r4)     // Catch: java.lang.Exception -> L2c
            r5.d(r3, r6)     // Catch: java.lang.Exception -> L2c
            r1.a = r0     // Catch: java.lang.Exception -> L2c
            goto L30
        L2c:
            r5 = move-exception
            r2.b(r5)
        L30:
            r2.get()     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r5 = move-exception
            boolean r6 = r5 instanceof java.util.concurrent.ExecutionException
            if (r6 == 0) goto L3d
            java.lang.Throwable r5 = r5.getCause()
        L3d:
            boolean r6 = r5 instanceof java.lang.RuntimeException
            if (r6 == 0) goto L44
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            throw r5
        L44:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to create DefaultSurfaceProcessor"
            r6.<init>(r0, r5)
            throw r6
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture r11) {
            r10 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.g
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L5b
        L9:
            android.graphics.SurfaceTexture r0 = r10.i
            if (r0 == 0) goto L5b
            android.graphics.SurfaceTexture r1 = r10.j
            if (r1 != 0) goto L12
            goto L5b
        L12:
            r0.updateTexImage()
            android.graphics.SurfaceTexture r0 = r10.j
            r0.updateTexImage()
            java.util.LinkedHashMap r0 = r10.h
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L24:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            r6 = r2
            android.view.Surface r6 = (android.view.Surface) r6
            java.lang.Object r0 = r0.getKey()
            r7 = r0
            wv6 r7 = (defpackage.wv6) r7
            int r0 = r7.L
            r2 = 34
            if (r0 != r2) goto L24
            iq1 r3 = r10.a     // Catch: java.lang.RuntimeException -> L52
            long r4 = r11.getTimestamp()     // Catch: java.lang.RuntimeException -> L52
            android.graphics.SurfaceTexture r8 = r10.i     // Catch: java.lang.RuntimeException -> L52
            android.graphics.SurfaceTexture r9 = r10.j     // Catch: java.lang.RuntimeException -> L52
            r3.v(r4, r6, r7, r8, r9)     // Catch: java.lang.RuntimeException -> L52
            goto L24
        L52:
            r0 = move-exception
            java.lang.String r2 = "DualSurfaceProcessor"
            java.lang.String r3 = "Failed to render with OpenGL."
            defpackage.kj2.w(r2, r3, r0)
            goto L24
        L5b:
            return
    }

    @Override // defpackage.xv6
    public final void release() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.g
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            return
        La:
            n0 r0 = new n0
            r1 = 20
            r0.<init>(r3, r1)
            ge r1 = new ge
            r2 = 4
            r1.<init>(r2)
            r3.d(r0, r1)
            return
    }
}
