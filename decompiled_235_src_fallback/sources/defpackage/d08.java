package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d08  reason: default package */
/* loaded from: classes.dex */
public interface d08 {
    void close(long r1, long r3, long r5, long r7, long r9);

    long initialize(byte[] r1, long r2, long r4, long r6, long r8, long r10);

    long initializeFrameBufferReleaseCallback(long r1);

    long initializeFrameManager();

    long initializeIsolationCallback();

    long initializeResultsCallback();

    byte[] process(long r1, long r3, long r5, byte[] r7, int r8, int r9, int r10, int r11);

    byte[] processBitmap(long r1, long r3, android.graphics.Bitmap r5, int r6, int r7, int r8, int r9);

    byte[] processYuvFrame(long r1, long r3, java.nio.ByteBuffer r5, java.nio.ByteBuffer r6, java.nio.ByteBuffer r7, int r8, int r9, int r10, int r11, int r12, int r13);

    void start(long r1);

    boolean stop(long r1);

    void waitUntilIdle(long r1);

    void zba();
}
