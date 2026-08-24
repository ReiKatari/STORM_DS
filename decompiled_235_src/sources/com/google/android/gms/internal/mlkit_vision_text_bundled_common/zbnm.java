package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbnm extends zbuf implements zbvn {
    private static final zbnm zbb;
    private int zbd;
    private zbnt zbe;
    private float zbf;
    private int zbg;
    private boolean zbh;

    static {
        zbnm zbnmVar = new zbnm();
        zbb = zbnmVar;
        zbuf.zbD(zbnm.class, zbnmVar);
    }

    private zbnm() {
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
                    return new zbnk(null);
                }
                return new zbnm();
            }
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003᠌\u0002\u0004ဇ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", zbnl.zba, "zbh"});
        }
        return (byte) 1;
    }
}
