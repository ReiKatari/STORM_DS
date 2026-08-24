package com.google.mlkit.vision.text.pipeline;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbj {
    public static r08 zba(ByteBuffer byteBuffer, zbnx zbnxVar) {
        byte[] array = byteBuffer.array();
        int zbb = zbb(zbnxVar.zbc());
        return new r08(array, 1000 * zbnxVar.zbe(), new zbcr(zbnxVar.zbd(), zbnxVar.zba()), zbb);
    }

    public static int zbb(int i) {
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            if (i != 3) {
                return 1;
            }
            return 2;
        }
        return 4;
    }
}
