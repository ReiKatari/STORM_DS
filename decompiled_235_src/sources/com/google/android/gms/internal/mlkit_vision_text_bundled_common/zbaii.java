package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.mlkit.common.MlKitException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaii extends zbuf implements zbvn {
    private static final zbaii zbb;
    private int zbd;
    private boolean zbg;
    private boolean zbo;
    private float zbe = 0.05f;
    private float zbf = 0.5f;
    private int zbh = 10;
    private int zbi = MlKitException.CODE_SCANNER_UNAVAILABLE;
    private float zbj = 0.8f;
    private int zbk = 4;
    private int zbl = 10;
    private float zbm = 0.2f;
    private float zbn = 0.1f;

    static {
        zbaii zbaiiVar = new zbaii();
        zbb = zbaiiVar;
        zbuf.zbD(zbaii.class, zbaiiVar);
    }

    private zbaii() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zbb;
                    }
                    return new zbaih(null);
                }
                return new zbaii();
            }
            return zbuf.zbA(zbb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0006\u0006င\u0007\u0007ခ\b\bခ\t\tဇ\n\nခ\u0005\u000bဇ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbi", "zbk", "zbl", "zbm", "zbn", "zbo", "zbj", "zbg"});
        }
        return (byte) 1;
    }
}
