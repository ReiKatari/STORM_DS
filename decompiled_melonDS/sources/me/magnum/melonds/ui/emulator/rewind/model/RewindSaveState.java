package me.magnum.melonds.ui.emulator.rewind.model;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RewindSaveState {
    public static final int $stable = 8;
    private final ByteBuffer buffer;
    private final long bufferContentSize;
    private final int frame;
    private final ByteBuffer screenshotBuffer;

    public RewindSaveState(ByteBuffer byteBuffer, long j2, ByteBuffer byteBuffer2, int i2) {
        byteBuffer.getClass();
        byteBuffer2.getClass();
        this.buffer = byteBuffer;
        this.bufferContentSize = j2;
        this.screenshotBuffer = byteBuffer2;
        this.frame = i2;
    }

    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    public final long getBufferContentSize() {
        return this.bufferContentSize;
    }

    public final int getFrame() {
        return this.frame;
    }

    public final Bitmap getScreenshot() {
        ByteBuffer byteBuffer = this.screenshotBuffer;
        byteBuffer.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(256, 384, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        for (int i2 = 0; i2 < 256; i2++) {
            for (int i10 = 0; i10 < 384; i10++) {
                int i11 = ((i10 * 256) + i2) * 4;
                createBitmap.setPixel(i2, i10, ((byteBuffer.get(i11 + 2) & 255) << 16) | (-16777216) | ((byteBuffer.get(i11 + 1) & 255) << 8) | (byteBuffer.get(i11) & 255));
            }
        }
        return createBitmap;
    }

    public final ByteBuffer getScreenshotBuffer() {
        return this.screenshotBuffer;
    }
}
