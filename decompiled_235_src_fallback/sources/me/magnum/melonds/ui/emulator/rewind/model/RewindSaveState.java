package me.magnum.melonds.ui.emulator.rewind.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RewindSaveState {
    public static final int $stable = 8;
    private final java.nio.ByteBuffer buffer;
    private final long bufferContentSize;
    private final int frame;
    private final java.nio.ByteBuffer screenshotBuffer;

    public RewindSaveState(java.nio.ByteBuffer r1, long r2, java.nio.ByteBuffer r4, int r5) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.buffer = r1
            r0.bufferContentSize = r2
            r0.screenshotBuffer = r4
            r0.frame = r5
            return
    }

    public final java.nio.ByteBuffer getBuffer() {
            r0 = this;
            java.nio.ByteBuffer r0 = r0.buffer
            return r0
    }

    public final long getBufferContentSize() {
            r2 = this;
            long r0 = r2.bufferContentSize
            return r0
    }

    public final int getFrame() {
            r0 = this;
            int r0 = r0.frame
            return r0
    }

    public final android.graphics.Bitmap getScreenshot() {
            r10 = this;
            java.nio.ByteBuffer r10 = r10.screenshotBuffer
            r10.getClass()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1 = 256(0x100, float:3.59E-43)
            r2 = 384(0x180, float:5.38E-43)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r0)
            r3 = 0
            r4 = r3
        L11:
            if (r4 >= r1) goto L43
            r5 = r3
        L14:
            if (r5 >= r2) goto L40
            int r6 = r5 * 256
            int r6 = r6 + r4
            int r6 = r6 * 4
            byte r7 = r10.get(r6)
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r6 + 1
            byte r8 = r10.get(r8)
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r6 = r6 + 2
            byte r6 = r10.get(r6)
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6 = r6 | r9
            int r8 = r8 << 8
            r6 = r6 | r8
            r6 = r6 | r7
            r0.setPixel(r4, r5, r6)
            int r5 = r5 + 1
            goto L14
        L40:
            int r4 = r4 + 1
            goto L11
        L43:
            r0.getClass()
            return r0
    }

    public final java.nio.ByteBuffer getScreenshotBuffer() {
            r0 = this;
            java.nio.ByteBuffer r0 = r0.screenshotBuffer
            return r0
    }
}
