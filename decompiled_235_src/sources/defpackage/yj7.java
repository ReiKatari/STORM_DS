package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yj7  reason: default package */
/* loaded from: classes.dex */
public final class yj7 implements d08 {
    public static yj7 a;

    @Override // defpackage.d08
    public long initialize(byte[] bArr, long j, long j2, long j3, long j4, long j5) {
        return 1L;
    }

    @Override // defpackage.d08
    public long initializeFrameBufferReleaseCallback(long j) {
        return 1L;
    }

    @Override // defpackage.d08
    public long initializeFrameManager() {
        return 1L;
    }

    @Override // defpackage.d08
    public long initializeIsolationCallback() {
        return 1L;
    }

    @Override // defpackage.d08
    public long initializeResultsCallback() {
        return 1L;
    }

    @Override // defpackage.d08
    public byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4) {
        return j18.a().zbl();
    }

    @Override // defpackage.d08
    public byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4) {
        return j18.a().zbl();
    }

    @Override // defpackage.d08
    public byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        return j18.a().zbl();
    }

    @Override // defpackage.d08
    public boolean stop(long j) {
        return true;
    }

    @Override // defpackage.d08
    public void zba() {
    }

    @Override // defpackage.d08
    public void start(long j) {
    }

    @Override // defpackage.d08
    public void waitUntilIdle(long j) {
    }

    @Override // defpackage.d08
    public void close(long j, long j2, long j3, long j4, long j5) {
    }
}
