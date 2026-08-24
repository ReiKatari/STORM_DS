package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbfx extends zbuf implements zbvn {
    private static final zbfx zbb;
    private int zbd;
    private float zbe = 0.7f;
    private int zbf = 2;
    private float zbg = 0.2f;

    static {
        zbfx zbfxVar = new zbfx();
        zbb = zbfxVar;
        zbuf.zbD(zbfx.class, zbfxVar);
    }

    private zbfx() {
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
                    return new zbfw(null);
                }
                return new zbfx();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
