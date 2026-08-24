package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qf1  reason: default package */
/* loaded from: classes.dex */
public final class qf1 implements defpackage.xv6, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    public final defpackage.qm4 a;
    public final android.os.HandlerThread b;
    public final defpackage.ov2 c;
    public final android.os.Handler d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final java.util.LinkedHashMap h;
    public int i;
    public boolean j;
    public final java.util.ArrayList k;

    public qf1(defpackage.yq1 r6) {
            r5 = this;
            java.lang.String r0 = "Init GlRenderer"
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r5.<init>()
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r5.e = r1
            r1 = 16
            float[] r3 = new float[r1]
            r5.f = r3
            float[] r1 = new float[r1]
            r5.g = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r5.h = r1
            r5.i = r2
            r5.j = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.k = r1
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r2 = "CameraX-GL Thread"
            r1.<init>(r2)
            r5.b = r1
            r1.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r1 = r1.getLooper()
            r2.<init>(r1)
            r5.d = r2
            ov2 r1 = new ov2
            r1.<init>(r2)
            r5.c = r1
            qm4 r1 = new qm4
            r1.<init>()
            r5.a = r1
            java.util.Map r1 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.RuntimeException -> L9e
            qb0 r1 = new qb0     // Catch: java.lang.RuntimeException -> L9e
            r1.<init>()     // Catch: java.lang.RuntimeException -> L9e
            hl5 r2 = new hl5     // Catch: java.lang.RuntimeException -> L9e
            r2.<init>()     // Catch: java.lang.RuntimeException -> L9e
            r1.c = r2     // Catch: java.lang.RuntimeException -> L9e
            tb0 r2 = new tb0     // Catch: java.lang.RuntimeException -> L9e
            r2.<init>(r1)     // Catch: java.lang.RuntimeException -> L9e
            r1.b = r2     // Catch: java.lang.RuntimeException -> L9e
            java.lang.Class<i61> r3 = defpackage.i61.class
            r1.a = r3     // Catch: java.lang.RuntimeException -> L9e
            java.util.Map r3 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Exception -> L7c
            v r3 = new v     // Catch: java.lang.Exception -> L7c
            r3.<init>(r5, r6, r1)     // Catch: java.lang.Exception -> L7c
            ge r6 = new ge     // Catch: java.lang.Exception -> L7c
            r4 = 4
            r6.<init>(r4)     // Catch: java.lang.Exception -> L7c
            r5.d(r3, r6)     // Catch: java.lang.Exception -> L7c
            r1.a = r0     // Catch: java.lang.Exception -> L7c
            goto L80
        L7c:
            r6 = move-exception
            r2.b(r6)     // Catch: java.lang.RuntimeException -> L9e
        L80:
            r2.get()     // Catch: java.lang.InterruptedException -> L84 java.util.concurrent.ExecutionException -> L86 java.lang.RuntimeException -> L9e
            return
        L84:
            r6 = move-exception
            goto L87
        L86:
            r6 = move-exception
        L87:
            boolean r0 = r6 instanceof java.util.concurrent.ExecutionException     // Catch: java.lang.RuntimeException -> L9e
            if (r0 == 0) goto L8f
            java.lang.Throwable r6 = r6.getCause()     // Catch: java.lang.RuntimeException -> L9e
        L8f:
            boolean r0 = r6 instanceof java.lang.RuntimeException     // Catch: java.lang.RuntimeException -> L9e
            if (r0 == 0) goto L96
            java.lang.RuntimeException r6 = (java.lang.RuntimeException) r6     // Catch: java.lang.RuntimeException -> L9e
            throw r6     // Catch: java.lang.RuntimeException -> L9e
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.RuntimeException -> L9e
            java.lang.String r1 = "Failed to create DefaultSurfaceProcessor"
            r0.<init>(r1, r6)     // Catch: java.lang.RuntimeException -> L9e
            throw r0     // Catch: java.lang.RuntimeException -> L9e
        L9e:
            r6 = move-exception
            r5.release()
            throw r6
    }

    @Override // defpackage.xv6
    public final void a(defpackage.bw6 r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.e
            boolean r0 = r0.get()
            if (r0 == 0) goto Lc
            r4.b()
            return
        Lc:
            mf r0 = new mf
            r1 = 17
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
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.e
            boolean r0 = r0.get()
            if (r0 == 0) goto Lc
            r4.close()
            return
        Lc:
            mf r0 = new mf
            r1 = 16
            r0.<init>(r1, r3, r4)
            java.util.Objects.requireNonNull(r4)
            n0 r1 = new n0
            r2 = 17
            r1.<init>(r4, r2)
            r3.d(r0, r1)
            return
    }

    public final void c() {
            r4 = this;
            boolean r0 = r4.j
            if (r0 == 0) goto L5d
            int r0 = r4.i
            if (r0 != 0) goto L5d
            java.util.LinkedHashMap r0 = r4.h
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
            java.util.ArrayList r1 = r4.k
            int r2 = r1.size()
            r3 = 0
            if (r2 > 0) goto L4b
            r0.clear()
            qm4 r0 = r4.a
            java.lang.Object r1 = r0.L
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r1 = r1.getAndSet(r3)
            if (r1 != 0) goto L3b
            goto L45
        L3b:
            java.lang.Object r1 = r0.X
            java.lang.Thread r1 = (java.lang.Thread) r1
            defpackage.bp2.c(r1)
            r0.n()
        L45:
            android.os.HandlerThread r4 = r4.b
            r4.quit()
            return
        L4b:
            java.lang.Object r4 = r1.get(r3)
            zx r4 = (defpackage.zx) r4
            r4.getClass()
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r0 = "Failed to snapshot: DefaultSurfaceProcessor is released."
            r4.<init>(r0)
            r4 = 0
            throw r4
        L5d:
            return
    }

    public final void d(java.lang.Runnable r4, java.lang.Runnable r5) {
            r3 = this;
            ov2 r0 = r3.c     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            v r1 = new v     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            r2 = 12
            r1.<init>(r3, r5, r4, r2)     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r4 = "DefaultSurfaceProcessor"
            java.lang.String r0 = "Unable to executor runnable"
            defpackage.kj2.g0(r4, r0, r3)
            r5.run()
            return
    }

    public final void e(java.lang.Exception r1) {
            r0 = this;
            java.util.ArrayList r0 = r0.k
            int r1 = r0.size()
            if (r1 > 0) goto Lc
            r0.clear()
            return
        Lc:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            zx r0 = (defpackage.zx) r0
            r0.getClass()
            r0 = 0
            throw r0
    }

    public final android.graphics.Bitmap f(android.util.Size r26, float[] r27, int r28) {
            r25 = this;
            r0 = r28
            java.lang.Object r1 = r27.clone()
            float[] r1 = (float[]) r1
            float r2 = (float) r0
            defpackage.kj2.T(r2, r1)
            defpackage.kj2.U(r1)
            r2 = r26
            android.util.Size r0 = defpackage.k97.g(r0, r2)
            r2 = r25
            qm4 r2 = r2.a
            r2.getClass()
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            int r4 = r4 * r3
            r3 = 4
            int r4 = r4 * r3
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocateDirect(r4)
            int r4 = r11.capacity()
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            int r6 = r6 * r5
            int r6 = r6 * r3
            r12 = 1
            r13 = 0
            if (r4 != r6) goto L3f
            r4 = r12
            goto L40
        L3f:
            r4 = r13
        L40:
            java.lang.String r5 = "ByteBuffer capacity is not equal to width * height * 4."
            defpackage.np2.s(r5, r4)
            boolean r4 = r11.isDirect()
            java.lang.String r5 = "ByteBuffer is not direct."
            defpackage.np2.s(r5, r4)
            int[] r4 = defpackage.bp2.a
            int[] r4 = new int[r12]
            android.opengl.GLES20.glGenTextures(r12, r4, r13)
            java.lang.String r5 = "glGenTextures"
            defpackage.bp2.b(r5)
            r4 = r4[r13]
            r5 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r5)
            java.lang.String r14 = "glActiveTexture"
            defpackage.bp2.b(r14)
            r5 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r5, r4)
            java.lang.String r15 = "glBindTexture"
            defpackage.bp2.b(r15)
            int r19 = r0.getWidth()
            int r20 = r0.getHeight()
            r23 = 5121(0x1401, float:7.176E-42)
            r24 = 0
            r16 = 3553(0xde1, float:4.979E-42)
            r17 = 0
            r18 = 6407(0x1907, float:8.978E-42)
            r21 = 0
            r22 = 6407(0x1907, float:8.978E-42)
            android.opengl.GLES20.glTexImage2D(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r6 = "glTexImage2D"
            defpackage.bp2.b(r6)
            r6 = 10240(0x2800, float:1.4349E-41)
            r7 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r5, r6, r7)
            r6 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r5, r6, r7)
            int[] r6 = new int[r12]
            android.opengl.GLES20.glGenFramebuffers(r12, r6, r13)
            java.lang.String r7 = "glGenFramebuffers"
            defpackage.bp2.b(r7)
            r6 = r6[r13]
            r7 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r7, r6)
            java.lang.String r8 = "glBindFramebuffer"
            defpackage.bp2.b(r8)
            r8 = 36064(0x8ce0, float:5.0536E-41)
            android.opengl.GLES20.glFramebufferTexture2D(r7, r8, r5, r4, r13)
            java.lang.String r5 = "glFramebufferTexture2D"
            defpackage.bp2.b(r5)
            r16 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r16)
            defpackage.bp2.b(r14)
            int r5 = r2.A
            r8 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r8, r5)
            defpackage.bp2.b(r15)
            r5 = 0
            r2.f0 = r5
            int r5 = r0.getWidth()
            int r9 = r0.getHeight()
            android.opengl.GLES20.glViewport(r13, r13, r5, r9)
            int r5 = r0.getWidth()
            int r9 = r0.getHeight()
            android.opengl.GLES20.glScissor(r13, r13, r5, r9)
            java.lang.Object r5 = r2.h0
            zo2 r5 = (defpackage.zo2) r5
            r5.getClass()
            boolean r9 = r5 instanceof defpackage.ap2
            if (r9 == 0) goto L101
            ap2 r5 = (defpackage.ap2) r5
            int r5 = r5.f
            android.opengl.GLES20.glUniformMatrix4fv(r5, r12, r13, r1, r13)
            java.lang.String r1 = "glUniformMatrix4fv"
            defpackage.bp2.b(r1)
        L101:
            r1 = 5
            android.opengl.GLES20.glDrawArrays(r1, r13, r3)
            java.lang.String r1 = "glDrawArrays"
            defpackage.bp2.b(r1)
            r1 = r7
            int r7 = r0.getWidth()
            r5 = r8
            int r8 = r0.getHeight()
            r9 = 6408(0x1908, float:8.98E-42)
            r10 = 5121(0x1401, float:7.176E-42)
            r17 = r5
            r5 = 0
            r18 = r6
            r6 = 0
            r25 = r3
            r3 = r1
            r1 = r17
            android.opengl.GLES20.glReadPixels(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r5 = "glReadPixels"
            defpackage.bp2.b(r5)
            android.opengl.GLES20.glBindFramebuffer(r3, r13)
            int[] r3 = new int[]{r4}
            android.opengl.GLES20.glDeleteTextures(r12, r3, r13)
            java.lang.String r3 = "glDeleteTextures"
            defpackage.bp2.b(r3)
            int[] r3 = new int[]{r18}
            android.opengl.GLES20.glDeleteFramebuffers(r12, r3, r13)
            java.lang.String r3 = "glDeleteFramebuffers"
            defpackage.bp2.b(r3)
            int r2 = r2.A
            android.opengl.GLES20.glActiveTexture(r16)
            defpackage.bp2.b(r14)
            android.opengl.GLES20.glBindTexture(r1, r2)
            defpackage.bp2.b(r15)
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            r11.rewind()
            int r0 = r0.getWidth()
            int r0 = r0 * 4
            androidx.camera.core.ImageProcessingUtil.c(r1, r11, r0)
            return r1
    }

    public final void g(defpackage.oc7 r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.k
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9
            return
        L9:
            if (r5 != 0) goto L16
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r0 = "Failed to snapshot: no JPEG Surface."
            r5.<init>(r0)
            r4.e(r5)
            return
        L16:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L29
            r1.<init>()     // Catch: java.io.IOException -> L29
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L59
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L29
            return
        L29:
            r5 = move-exception
            goto L63
        L2b:
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L59
            zx r0 = (defpackage.zx) r0     // Catch: java.lang.Throwable -> L59
            r0.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r5.B     // Catch: java.lang.Throwable -> L59
            android.util.Size r0 = (android.util.Size) r0     // Catch: java.lang.Throwable -> L59
            java.lang.Object r2 = r5.L     // Catch: java.lang.Throwable -> L59
            float[] r2 = (float[]) r2     // Catch: java.lang.Throwable -> L59
            r3 = 0
            android.graphics.Bitmap r0 = r4.f(r0, r2, r3)     // Catch: java.lang.Throwable -> L59
            r1.reset()     // Catch: java.lang.Throwable -> L59
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L59
            r0.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L59
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.A     // Catch: java.lang.Throwable -> L59
            android.view.Surface r5 = (android.view.Surface) r5     // Catch: java.lang.Throwable -> L59
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L59
            androidx.camera.core.ImageProcessingUtil.h(r0, r5)     // Catch: java.lang.Throwable -> L59
            r5 = 0
            throw r5     // Catch: java.lang.Throwable -> L59
        L59:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.io.IOException -> L29
        L62:
            throw r5     // Catch: java.io.IOException -> L29
        L63:
            r4.e(r5)
            return
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture r13) {
            r12 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.e
            boolean r0 = r0.get()
            if (r0 == 0) goto La
            goto L94
        La:
            r13.updateTexImage()
            float[] r3 = r12.f
            r13.getTransformMatrix(r3)
            java.util.LinkedHashMap r0 = r12.h
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
            r0 = 0
            r8 = r0
        L1e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            r9 = r1
            android.view.Surface r9 = (android.view.Surface) r9
            java.lang.Object r0 = r0.getKey()
            wv6 r0 = (defpackage.wv6) r0
            float[] r5 = r0.X
            r6 = 0
            float[] r1 = r12.g
            r2 = 0
            r4 = 0
            android.opengl.Matrix.multiplyMM(r1, r2, r3, r4, r5, r6)
            int r2 = r0.L
            r4 = 34
            if (r2 != r4) goto L5a
            qm4 r0 = r12.a     // Catch: java.lang.RuntimeException -> L51
            long r4 = r13.getTimestamp()     // Catch: java.lang.RuntimeException -> L51
            r0.t(r4, r1, r9)     // Catch: java.lang.RuntimeException -> L51
            goto L1e
        L51:
            r0 = move-exception
            java.lang.String r1 = "DefaultSurfaceProcessor"
            java.lang.String r2 = "Failed to render with OpenGL."
            defpackage.kj2.w(r1, r2, r0)
            goto L1e
        L5a:
            r4 = 256(0x100, float:3.59E-43)
            r5 = 0
            r6 = 1
            if (r2 != r4) goto L62
            r4 = r6
            goto L63
        L62:
            r4 = r5
        L63:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Unsupported format: "
            r10.<init>(r11)
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            defpackage.np2.A(r2, r4)
            if (r8 != 0) goto L77
            r5 = r6
        L77:
            java.lang.String r2 = "Only one JPEG output is supported."
            defpackage.np2.A(r2, r5)
            oc7 r2 = new oc7
            android.util.Size r0 = r0.R
            java.lang.Object r1 = r1.clone()
            float[] r1 = (float[]) r1
            r2.<init>(r9, r0, r1)
            r8 = r2
            goto L1e
        L8b:
            r12.g(r8)     // Catch: java.lang.RuntimeException -> L8f
            goto L94
        L8f:
            r0 = move-exception
            r13 = r0
            r12.e(r13)
        L94:
            return
    }

    @Override // defpackage.xv6
    public final void release() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.e
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            return
        La:
            n0 r0 = new n0
            r1 = 18
            r0.<init>(r3, r1)
            ge r1 = new ge
            r2 = 4
            r1.<init>(r2)
            r3.d(r0, r1)
            return
    }
}
