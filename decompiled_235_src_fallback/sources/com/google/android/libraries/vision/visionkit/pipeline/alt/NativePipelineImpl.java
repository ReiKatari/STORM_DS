package com.google.android.libraries.vision.visionkit.pipeline.alt;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class NativePipelineImpl implements defpackage.d08 {
    public com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp a;
    public com.google.android.libraries.vision.visionkit.pipeline.alt.a b;
    public com.google.android.libraries.vision.visionkit.pipeline.alt.a c;
    public com.google.android.libraries.vision.visionkit.pipeline.alt.a d;

    public NativePipelineImpl(com.google.android.libraries.vision.visionkit.pipeline.alt.a r1, com.google.android.libraries.vision.visionkit.pipeline.alt.a r2, com.google.android.libraries.vision.visionkit.pipeline.alt.a r3, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r4) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.a = r4
            return
    }

    @Override // defpackage.d08
    public native void close(long r1, long r3, long r5, long r7, long r9);

    public void closeFileDescriptor(int r1) {
            r0 = this;
            com.google.android.libraries.vision.visionkit.pipeline.alt.a r0 = r0.d
            r0.zbc(r1)
            return
    }

    @Override // defpackage.d08
    public native long initialize(byte[] r1, long r2, long r4, long r6, long r8, long r10);

    @Override // defpackage.d08
    public native long initializeFrameBufferReleaseCallback(long r1);

    @Override // defpackage.d08
    public native long initializeFrameManager();

    @Override // defpackage.d08
    public native long initializeIsolationCallback();

    @Override // defpackage.d08
    public native long initializeResultsCallback();

    public void onReleaseAtTimestampUs(long r1) {
            r0 = this;
            com.google.android.libraries.vision.visionkit.pipeline.alt.a r0 = r0.b
            r0.zba(r1)
            return
    }

    public void onResult(byte[] r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = r2.a     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> Lc
            j18 r3 = defpackage.j18.b(r3, r0)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> Lc
            com.google.android.libraries.vision.visionkit.pipeline.alt.a r2 = r2.c     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> Lc
            r2.zbd(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> Lc
            return
        Lc:
            r2 = move-exception
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq.zba
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Error in result from JNI layer"
            r3.zba(r2, r1, r0)
            return
    }

    public int openFileDescriptor(java.lang.String r1) {
            r0 = this;
            com.google.android.libraries.vision.visionkit.pipeline.alt.a r0 = r0.d
            r0.zbb(r1)
            r0 = -1
            return r0
    }

    @Override // defpackage.d08
    public native byte[] process(long r1, long r3, long r5, byte[] r7, int r8, int r9, int r10, int r11);

    @Override // defpackage.d08
    public native byte[] processBitmap(long r1, long r3, android.graphics.Bitmap r5, int r6, int r7, int r8, int r9);

    @Override // defpackage.d08
    public native byte[] processYuvFrame(long r1, long r3, java.nio.ByteBuffer r5, java.nio.ByteBuffer r6, java.nio.ByteBuffer r7, int r8, int r9, int r10, int r11, int r12, int r13);

    @Override // defpackage.d08
    public native void start(long r1);

    @Override // defpackage.d08
    public native boolean stop(long r1);

    @Override // defpackage.d08
    public native void waitUntilIdle(long r1);

    @Override // defpackage.d08
    public final void zba() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            return
    }
}
