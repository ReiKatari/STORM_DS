package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zback extends zbuf implements zbvn {
    private static final zback zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private int zbh = 15000;
    private int zbi;
    private float zbj;

    static {
        zback zbackVar = new zback();
        zbb = zbackVar;
        zbuf.zbD(zback.class, zbackVar);
    }

    private zback() {
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
                    return new zbach(null);
                }
                return new zback();
            }
            return zbuf.zbA(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ခ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", zbaci.zba, "zbi", zbacj.zba, "zbj"});
        }
        return (byte) 1;
    }
}
