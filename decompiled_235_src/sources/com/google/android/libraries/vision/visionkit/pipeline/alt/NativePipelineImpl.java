package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class NativePipelineImpl implements d08 {
    public zbtp a;
    public a b;
    public a c;
    public a d;

    public NativePipelineImpl(a aVar, a aVar2, a aVar3, zbtp zbtpVar) {
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.a = zbtpVar;
    }

    @Override // defpackage.d08
    public native void close(long j, long j2, long j3, long j4, long j5);

    public void closeFileDescriptor(int i) {
        this.d.zbc(i);
    }

    @Override // defpackage.d08
    public native long initialize(byte[] bArr, long j, long j2, long j3, long j4, long j5);

    @Override // defpackage.d08
    public native long initializeFrameBufferReleaseCallback(long j);

    @Override // defpackage.d08
    public native long initializeFrameManager();

    @Override // defpackage.d08
    public native long initializeIsolationCallback();

    @Override // defpackage.d08
    public native long initializeResultsCallback();

    public void onReleaseAtTimestampUs(long j) {
        this.b.zba(j);
    }

    public void onResult(byte[] bArr) {
        try {
            this.c.zbd(j18.b(bArr, this.a));
        } catch (zbuq e) {
            zbcq.zba.zba(e, "Error in result from JNI layer", new Object[0]);
        }
    }

    public int openFileDescriptor(String str) {
        this.d.zbb(str);
        return -1;
    }

    @Override // defpackage.d08
    public native byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4);

    @Override // defpackage.d08
    public native byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4);

    @Override // defpackage.d08
    public native byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    @Override // defpackage.d08
    public native void start(long j);

    @Override // defpackage.d08
    public native boolean stop(long j);

    @Override // defpackage.d08
    public native void waitUntilIdle(long j);

    @Override // defpackage.d08
    public final void zba() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
