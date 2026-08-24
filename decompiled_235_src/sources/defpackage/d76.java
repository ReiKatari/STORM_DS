package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d76  reason: default package */
/* loaded from: classes.dex */
public final class d76 {
    public ByteBuffer a;

    public final Bitmap a() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(393216).order(ByteOrder.nativeOrder());
            this.a = byteBuffer;
            byteBuffer.getClass();
        }
        int[] iArr = new int[98304];
        for (int i = 0; i < 98304; i++) {
            int i2 = byteBuffer.getInt(i * 4);
            iArr[i] = (((i2 >> 16) & 255) << 16) | (-16777216) | (((i2 >> 8) & 255) << 8) | (i2 & 255);
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, 256, (int) RendererDebugBridge.CAPTURE_HEIGHT, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        return createBitmap;
    }
}
