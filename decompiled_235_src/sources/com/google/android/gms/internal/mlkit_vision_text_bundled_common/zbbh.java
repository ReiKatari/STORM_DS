package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbbh extends zbuf implements zbvn {
    private static final zbbh zbb;
    private int zbd;
    private zbaii zbg;
    private zbjs zbh;
    private boolean zbk;
    private boolean zbe = true;
    private boolean zbf = true;
    private float zbi = 0.7f;
    private float zbj = 0.8f;

    static {
        zbbh zbbhVar = new zbbh();
        zbb = zbbhVar;
        zbuf.zbD(zbbh.class, zbbhVar);
    }

    private zbbh() {
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
                    return new zbbg(null);
                }
                return new zbbh();
            }
            return zbuf.zbA(zbb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဇ\u0001\u0005ခ\u0004\u0006ခ\u0005\u0007ဇ\u0006", new Object[]{"zbd", "zbe", "zbg", "zbh", "zbf", "zbi", "zbj", "zbk"});
        }
        return (byte) 1;
    }
}
