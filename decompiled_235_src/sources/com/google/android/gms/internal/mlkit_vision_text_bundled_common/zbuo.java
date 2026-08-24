package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbuo {
    static final Charset zba;
    public static final byte[] zbb;

    static {
        Charset.forName("US-ASCII");
        zba = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zbb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zbte(bArr, 0, 0, false, null).zba(0);
        } catch (zbuq e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zba(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    public static int zbb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object zbc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        u34.x("messageType");
        return null;
    }

    public static boolean zbd(zbvm zbvmVar) {
        if (!(zbvmVar instanceof zbsk)) {
            return false;
        }
        throw null;
    }
}
