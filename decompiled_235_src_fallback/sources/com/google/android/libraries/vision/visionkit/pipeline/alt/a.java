package com.google.android.libraries.vision.visionkit.pipeline.alt;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class a {
    protected final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp zba;
    private final defpackage.s08 zbb;
    private final defpackage.d08 zbc;
    private long zbd;
    private final long zbe;
    private final long zbf;
    private final long zbg;
    private final long zbh;

    public a(defpackage.z08 r17) {
            r16 = this;
            r0 = r16
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.zbb()
            if (r1 != 0) goto Lc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.zba()
        Lc:
            r0.<init>()
            boolean r2 = r17.f()
            if (r2 == 0) goto L1d
            yj7 r2 = new yj7
            r2.<init>()
            r0.zbc = r2
            goto L37
        L1d:
            boolean r2 = r17.e()
            if (r2 == 0) goto L2b
            com.google.android.libraries.vision.visionkit.pipeline.alt.NativePipelineImpl r2 = new com.google.android.libraries.vision.visionkit.pipeline.alt.NativePipelineImpl
            r2.<init>(r0, r0, r0, r1)
            r0.zbc = r2
            goto L37
        L2b:
            com.google.android.libraries.vision.visionkit.pipeline.alt.NativePipelineImpl r2 = new com.google.android.libraries.vision.visionkit.pipeline.alt.NativePipelineImpl
            r2.<init>(r0, r0, r0, r1)
            java.lang.String r3 = "mlkit_google_ocr_pipeline"
            java.lang.System.loadLibrary(r3)
            r0.zbc = r2
        L37:
            boolean r2 = r17.zbi()
            if (r2 == 0) goto L49
            s08 r2 = new s08
            int r3 = r17.a()
            r2.<init>(r3)
            r0.zbb = r2
            goto L52
        L49:
            s08 r2 = new s08
            r3 = 10
            r2.<init>(r3)
            r0.zbb = r2
        L52:
            r0.zba = r1
            d08 r1 = r0.zbc
            long r1 = r1.initializeFrameManager()
            r0.zbe = r1
            d08 r3 = r0.zbc
            long r6 = r3.initializeFrameBufferReleaseCallback(r1)
            r0.zbf = r6
            d08 r1 = r0.zbc
            long r8 = r1.initializeResultsCallback()
            r0.zbg = r8
            d08 r1 = r0.zbc
            long r10 = r1.initializeIsolationCallback()
            r0.zbh = r10
            d08 r4 = r0.zbc
            byte[] r5 = r17.zbl()
            r12 = 0
            r14 = 0
            long r1 = r4.initialize(r5, r6, r8, r10, r12, r14)
            r0.zbd = r1
            return
    }

    public final void zba(long r2) {
            r1 = this;
            s08 r1 = r1.zbb
            monitor-enter(r1)
            java.util.HashMap r0 = r1.b     // Catch: java.lang.Throwable -> Le
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Le
            r0.remove(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public final int zbb(java.lang.String r1) {
            r0 = this;
            java.lang.String r0 = "VKP"
            java.lang.String r1 = "openFileDescriptor called but is not available for this pipeline. Ignoring call."
            android.util.Log.w(r0, r1)
            r0 = -1
            return r0
    }

    public final void zbc(int r1) {
            r0 = this;
            java.lang.String r0 = "VKP"
            java.lang.String r1 = "closeFileDescriptor called but is not available for this pipeline. Ignoring call."
            android.util.Log.w(r0, r1)
            return
    }

    public final void zbd(defpackage.j18 r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq.zba
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Pipeline received results: "
            java.lang.String r3 = r1.concat(r3)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.zbb(r2, r3, r1)
            return
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki zbe(defpackage.r08 r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            long r2 = r0.zbd
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L7c
            s08 r2 = r0.zbb
            long r3 = r1.b
            java.lang.String r5 = "Buffer is full. Drop frame "
            monitor-enter(r2)
            java.util.HashMap r6 = r2.b     // Catch: java.lang.Throwable -> L33
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L33
            int r7 = r2.a     // Catch: java.lang.Throwable -> L33
            if (r6 != r7) goto L35
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq.zba     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L33
            r1.append(r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L33
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L33
            r0.zbc(r2, r1, r3)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r2)
            goto L61
        L33:
            r0 = move-exception
            goto L7a
        L35:
            java.util.HashMap r5 = r2.b     // Catch: java.lang.Throwable -> L33
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L33
            r5.put(r3, r1)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r2)
            d08 r6 = r0.zbc
            long r7 = r0.zbd
            long r9 = r0.zbe
            long r11 = r1.b
            byte[] r13 = r1.a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr r2 = r1.c
            int r14 = r2.zbb()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr r2 = r1.c
            int r15 = r2.zba()
            int r1 = r1.d
            int r17 = r1 + (-1)
            r16 = 1
            byte[] r1 = r6.process(r7, r9, r11, r13, r14, r15, r16, r17)
            if (r1 != 0) goto L66
        L61:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbd()
            return r0
        L66:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = r0.zba     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L71
            j18 r0 = defpackage.j18.b(r1, r0)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L71
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbe(r0)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L71
            return r0
        L71:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Could not parse results"
            r1.<init>(r2, r0)
            throw r1
        L7a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            throw r0
        L7c:
            java.lang.String r0 = "Pipeline has been closed or was not initialized"
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }

    public final synchronized void zbf() {
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.zbd     // Catch: java.lang.Throwable -> L29
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            d08 r0 = r1.zbc     // Catch: java.lang.Throwable -> L29
            r0.stop(r2)     // Catch: java.lang.Throwable -> L29
            d08 r6 = r1.zbc     // Catch: java.lang.Throwable -> L29
            long r7 = r1.zbd     // Catch: java.lang.Throwable -> L29
            long r9 = r1.zbe     // Catch: java.lang.Throwable -> L29
            long r11 = r1.zbf     // Catch: java.lang.Throwable -> L29
            long r13 = r1.zbg     // Catch: java.lang.Throwable -> L29
            long r2 = r1.zbh     // Catch: java.lang.Throwable -> L29
            r15 = r2
            r6.close(r7, r9, r11, r13, r15)     // Catch: java.lang.Throwable -> L29
            r1.zbd = r4     // Catch: java.lang.Throwable -> L29
            d08 r0 = r1.zbc     // Catch: java.lang.Throwable -> L29
            r0.zba()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r17)
            return
        L29:
            r0 = move-exception
            goto L2d
        L2b:
            monitor-exit(r17)
            return
        L2d:
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L29
            throw r0
    }

    public final void zbg() {
            r4 = this;
            long r0 = r4.zbd
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1e
            d08 r2 = r4.zbc     // Catch: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException -> L15
            r2.start(r0)     // Catch: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException -> L15
            d08 r0 = r4.zbc     // Catch: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException -> L15
            long r1 = r4.zbd     // Catch: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException -> L15
            r0.waitUntilIdle(r1)     // Catch: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException -> L15
            return
        L15:
            r0 = move-exception
            d08 r1 = r4.zbc
            long r2 = r4.zbd
            r1.stop(r2)
            throw r0
        L1e:
            com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException r4 = new com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException
            k18 r0 = defpackage.k18.zbj
            int r0 = r0.ordinal()
            java.lang.String r1 = "Pipeline has been closed or was not initialized"
            r4.<init>(r0, r1)
            throw r4
    }

    public final void zbh() {
            r4 = this;
            long r0 = r4.zbd
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L17
            d08 r4 = r4.zbc
            boolean r4 = r4.stop(r0)
            if (r4 == 0) goto L11
            return
        L11:
            java.lang.String r4 = "Pipeline did not stop successfully."
            defpackage.i.m(r4)
            return
        L17:
            java.lang.String r4 = "Pipeline has been closed or was not initialized"
            defpackage.i.m(r4)
            return
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki zbi(long r14, android.graphics.Bitmap r16, int r17) {
            r13 = this;
            long r0 = r13.zbd
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L55
            android.graphics.Bitmap$Config r0 = r16.getConfig()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 != r2) goto L43
            d08 r3 = r13.zbc
            long r4 = r13.zbd
            int r9 = r16.getWidth()
            int r10 = r16.getHeight()
            int r12 = r17 + (-1)
            r11 = 0
            r6 = r14
            r8 = r16
            byte[] r0 = r3.processBitmap(r4, r6, r8, r9, r10, r11, r12)
            if (r0 != 0) goto L2e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbd()
            return r13
        L2e:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r13 = r13.zba     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L39
            j18 r13 = defpackage.j18.b(r0, r13)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L39
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbe(r13)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L39
            return r13
        L39:
            r0 = move-exception
            r13 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not parse results"
            r0.<init>(r1, r13)
            throw r0
        L43:
            android.graphics.Bitmap$Config r13 = r16.getConfig()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "Unsupported bitmap config "
            java.lang.String r13 = r0.concat(r13)
            defpackage.i.h(r13)
            return r1
        L55:
            java.lang.String r13 = "Pipeline has been closed or was not initialized"
            defpackage.i.m(r13)
            return r1
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki zbj(long r18, java.nio.ByteBuffer r20, java.nio.ByteBuffer r21, java.nio.ByteBuffer r22, int r23, int r24, int r25, int r26, int r27, int r28) {
            r17 = this;
            r0 = r17
            long r1 = r0.zbd
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L5a
            boolean r1 = r20.isDirect()
            if (r1 == 0) goto L54
            boolean r1 = r21.isDirect()
            if (r1 == 0) goto L54
            boolean r1 = r22.isDirect()
            if (r1 == 0) goto L54
            d08 r3 = r0.zbc
            long r4 = r0.zbd
            int r16 = r28 + (-1)
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r14 = r26
            r15 = r27
            byte[] r1 = r3.processYuvFrame(r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r1 != 0) goto L40
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbd()
            return r0
        L40:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = r0.zba     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L4b
            j18 r0 = defpackage.j18.b(r1, r0)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L4b
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbe(r0)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L4b
            return r0
        L4b:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Could not parse results"
            r1.<init>(r2, r0)
            throw r1
        L54:
            java.lang.String r0 = "Byte buffers are not direct."
            defpackage.i.m(r0)
            return r2
        L5a:
            java.lang.String r0 = "Pipeline has been closed or was not initialized"
            defpackage.i.m(r0)
            return r2
    }
}
