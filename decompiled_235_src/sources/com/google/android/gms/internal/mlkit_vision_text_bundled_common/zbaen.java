package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaen extends zbuf implements zbvn {
    private static final zbaen zbb;
    private int zbd;
    private zbaeh zbe;
    private zbun zbf = zbuf.zby();
    private float zbg;

    static {
        zbaen zbaenVar = new zbaen();
        zbb = zbaenVar;
        zbuf.zbD(zbaen.class, zbaenVar);
    }

    private zbaen() {
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
                    return new zbaei(null);
                }
                return new zbaen();
            }
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001", new Object[]{"zbd", "zbe", "zbf", zbaem.class, "zbg"});
        }
        return (byte) 1;
    }
}
