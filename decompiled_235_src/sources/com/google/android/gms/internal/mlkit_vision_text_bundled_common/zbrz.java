package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbrz extends zbuf implements zbvn {
    private static final zbrz zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private zbun zbf = zbuf.zby();
    private int zbg;

    static {
        zbrz zbrzVar = new zbrz();
        zbb = zbrzVar;
        zbuf.zbD(zbrz.class, zbrzVar);
    }

    private zbrz() {
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
                    return new zbry(null);
                }
                return new zbrz();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003င\u0000", new Object[]{"zbd", "zbe", zbsb.class, "zbf", zbrv.class, "zbg"});
        }
        return (byte) 1;
    }
}
