package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbacr extends zbuf implements zbvn {
    private static final zbacr zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private float zbg;
    private float zbh;

    static {
        zbacr zbacrVar = new zbacr();
        zbb = zbacrVar;
        zbuf.zbD(zbacr.class, zbacrVar);
    }

    private zbacr() {
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
                    return new zbacq(null);
                }
                return new zbacr();
            }
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005᠌\u0000", new Object[]{"zbd", "zbf", "zbg", "zbh", "zbe", zbadc.zba});
        }
        return (byte) 1;
    }
}
