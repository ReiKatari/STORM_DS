package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbabc extends zbuf implements zbvn {
    private static final zbabc zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private int zbi;
    private zbun zbj = zbuf.zby();
    private zbun zbk = zbuf.zby();

    static {
        zbabc zbabcVar = new zbabc();
        zbb = zbabcVar;
        zbuf.zbD(zbabc.class, zbabcVar);
    }

    private zbabc() {
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
                    return new zbaaz(null);
                }
                return new zbabc();
            }
            return zbuf.zbA(zbb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b\u0007\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", zbabb.class, "zbk", zbabb.class});
        }
        return (byte) 1;
    }
}
