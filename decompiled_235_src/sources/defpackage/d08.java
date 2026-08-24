package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d08  reason: default package */
/* loaded from: classes.dex */
public interface d08 {
    void close(long j, long j2, long j3, long j4, long j5);

    long initialize(byte[] bArr, long j, long j2, long j3, long j4, long j5);

    long initializeFrameBufferReleaseCallback(long j);

    long initializeFrameManager();

    long initializeIsolationCallback();

    long initializeResultsCallback();

    byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4);

    byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4);

    byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    void start(long j);

    boolean stop(long j);

    void waitUntilIdle(long j);

    void zba();
}
