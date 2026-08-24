package me.magnum.melonds.ui.emulator.rewind.model;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RewindSaveState {
    public static final int $stable = 8;
    private final ByteBuffer buffer;
    private final long bufferContentSize;
    private final int frame;
    private final ByteBuffer screenshotBuffer;

    public RewindSaveState(ByteBuffer byteBuffer, long j, ByteBuffer byteBuffer2, int i) {
        byteBuffer.getClass();
        byteBuffer2.getClass();
        this.buffer = byteBuffer;
        this.bufferContentSize = j;
        this.screenshotBuffer = byteBuffer2;
        this.frame = i;
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
        Bitmap createBitmap = Bitmap.createBitmap(256, RendererDebugBridge.CAPTURE_HEIGHT, Bitmap.Config.ARGB_8888);
        for (int i = 0; i < 256; i++) {
            for (int i2 = 0; i2 < 384; i2++) {
                int i3 = ((i2 * 256) + i) * 4;
                createBitmap.setPixel(i, i2, ((byteBuffer.get(i3 + 2) & 255) << 16) | (-16777216) | ((byteBuffer.get(i3 + 1) & 255) << 8) | (byteBuffer.get(i3) & 255));
            }
        }
        createBitmap.getClass();
        return createBitmap;
    }

    public final ByteBuffer getScreenshotBuffer() {
        return this.screenshotBuffer;
    }
}
